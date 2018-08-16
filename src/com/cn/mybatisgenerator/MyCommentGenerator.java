package com.cn.mybatisgenerator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.util.Calendar;
import java.util.Properties;

public class MyCommentGenerator extends DefaultCommentGenerator {
    private Properties systemPro;

    public MyCommentGenerator() {
        super();
        systemPro = System.getProperties();
    }
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
                                IntrospectedColumn introspectedColumn) {
        // 添加字段注释
        StringBuffer sb = new StringBuffer();
        field.addJavaDocLine("/**");
        if (introspectedColumn.getRemarks() != null){
            sb.append(" * "+ introspectedColumn.getRemarks());
        }
        field.addJavaDocLine(sb.toString());
        field.addJavaDocLine(" * "+ introspectedTable.getFullyQualifiedTable() + "." + introspectedColumn.getActualColumnName());
        addJavadocTag(field, false);
        field.addJavaDocLine(" */");
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable table, boolean markAsDoNotDelete) {
        Calendar cal = Calendar.getInstance();
        innerClass.addJavaDocLine("/**");
        innerClass.addJavaDocLine("* @Package: " + innerClass.getType().getPackageName());
        innerClass.addJavaDocLine("* @ClassName: " + innerClass.getType().getFullyQualifiedName());
        innerClass.addJavaDocLine("* @TableName:" + table.getTableConfiguration().getTableName());
        innerClass.addJavaDocLine("* @Description:" + table.getRemarks());
        innerClass.addJavaDocLine("* @JDK version used: " + systemPro.getProperty("java.runtime.version"));
        innerClass.addJavaDocLine("* @Author:" + systemPro.getProperty("user.name"));
        innerClass.addJavaDocLine(
                "* @Create Date: " + cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日");
        innerClass.addJavaDocLine("* @modify By:");
        innerClass.addJavaDocLine("* @modify Date:");
        innerClass.addJavaDocLine("* @Why&What is modify:");
        innerClass.addJavaDocLine("* @Version: 1.0");
        innerClass.addJavaDocLine("*/");
    }
}
