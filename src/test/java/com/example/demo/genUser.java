package com.example.demo;

import org.jasypt.util.text.BasicTextEncryptor;

public class genUser {
public static void main(String[] args) {
	BasicTextEncryptor  bte = new BasicTextEncryptor();
	bte.setPassword("g659sadfdf");
	String username = bte.encrypt("democlouduser");
	String password = bte.encrypt("kefsA1msa");
	System.out.println(username+"\n"+password);
}
}
