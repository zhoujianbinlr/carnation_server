/**
 

 *  <P> Copyright 2014 . </p>

 *  <p> Created on 2017年11月30日下午2:57:49</p>
 *  <p> Created by zhoujb</p>
 
 
 */
package com.cn.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.cn.framework.common.spring.ext.SpringContextHolder;
import com.cn.framework.mvc.mongodb.MongoDBFactory;
import com.cn.framework.mvc.mongodb.DBConstant.QueryOperationalEnum;
import com.cn.framework.mvc.mongodb.vo.Condition;
import com.cn.framework.mvc.mongodb.vo.LogicalCondition;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * @param <T>
 * @Project: zhoujb
 * @Package: com.cn.common.utils
 * @ClassName: MongodbUtils
 * @Description: <p></p>
 * @JDK version used: 
 * @Author: zhoujb
 * @Create Date: 2017年11月30日下午2:57:49
 * @modify By:
 * @modify Date:
 * @Why&What is modify:
 * @Version: 1.0
 */
public class MongodbUtils<T> {

	protected MongoClient mongoClient = SpringContextHolder.getBean(MongoClient.class);

	protected String dataBase;

	public String getDataBase() {
		return dataBase;
	}

	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	/**
	 * 根据排序和指定条件查询数据
	 * @author CHANG.CHI.HUNG
	 * @Email zhenzx@sun309.com
	 * @data 2017年11月30日下午3:31:52
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByConditionAndSort(List<Condition> conditions, Map<String, Integer> sortMap, Class<?> clazz) {
		Bson sort = null;
		if (CollectionUtils.isEmpty(sortMap)) {
			sort = new Document();
		} else {
			sort = Document.parse(JSON.toJSONString(sortMap));
		}

		Bson filter = null;
		if (CollectionUtils.isEmpty(conditions)) {
			filter = new Document();
		} else {
			LogicalCondition logicalCondition = new LogicalCondition(conditions, QueryOperationalEnum.AND);
			filter = logicalCondition.buildConditionBson();
		}

		List<T> list = new ArrayList<>();
		MongoCollection<Document> collection = getConCollection(clazz);
		MongoCursor<Document> cursor = collection.find(filter).sort(sort).iterator();
		while (cursor.hasNext()) {
			list.add((T) com.alibaba.fastjson.JSON.parseObject(cursor.next().toJson(), clazz));
		}
		return list;
	}

	/**
	 * 获取当前数据库
	 * @author CHANG.CHI.HUNG
	 * @Email zhenzx@sun309.com
	 * @data 2017年11月30日下午3:31:38
	 */
	public MongoCollection<Document> getConCollection(Class<?> clazz) {
		MongoDatabase db = mongoClient.getDatabase(currentDataBase());
		String className = clazz.getName();
		MongoCollection<Document> collection = db.getCollection(className);
		return collection;
	}

	private String currentDataBase() {
		if (StringUtils.isBlank(dataBase)) {
			dataBase = MongoDBFactory.DEFAULT_DATA_BASE;
		}
		return dataBase;
	}
}
