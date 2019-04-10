package com.ccbs.pub;

import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.JavaTypeResolver;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.config.Context;

public class JavaTypeChg implements JavaTypeResolver{

	@Override
	public void addConfigurationProperties(Properties properties) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContext(Context context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setWarnings(List<String> warnings) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FullyQualifiedJavaType calculateJavaType(IntrospectedColumn introspectedColumn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String calculateJdbcTypeName(IntrospectedColumn introspectedColumn) {
		// TODO Auto-generated method stub
		return null;
	}

}
