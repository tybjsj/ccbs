package com.ccbs.pub;

import java.lang.reflect.Method;

public class Test {
public static void main(String[] args) throws ClassNotFoundException {
	Class cl = Class.forName("com.ccbs.am.dao.AmUserInfoMapper");
	Method[] s = cl.getDeclaredMethods();
	for(Method method:s) {
		System.out.println(method.toString());
				/*.replaceAll("abstract", "")
				.replaceAll("com.ccbs.am.dao.", "")
				.replaceAll("com.ccbs.am.domain.", ""));*/
	}
}
}
