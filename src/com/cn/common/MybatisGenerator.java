package com.cn.common;

import com.cn.framework.common.mybatisgenerator.CombaGeneratorTools;

/**
 * @Project
 * @Package com.cn.framework.common.mybatisgenerator
 * @ClassName CombaGenerator.java
 * @Description
 * @JDK version used 1.8
 * @Author zhoujb
 * @Create Date 2017年7月9日
 * @modify By
 * @modify Date
 * @Why&What is modify
 * @Version 1.0
 */
public class MybatisGenerator {

	/**
	 * @Description
	 * @param args
	 * @date 2017年7月9日
	 */
	public static void main(String[] args) {
		String congifFile = MybatisGenerator.class.getClassLoader().getResource("mybatis/generatorConfig.xml").getFile();
		try {
			CombaGeneratorTools.generator(congifFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
