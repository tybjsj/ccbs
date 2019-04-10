package com.ccbs.pub;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class GenarUtils4 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	File file = new File("src/main/java/com/ccbs/bs/dao");
	File[] files = null;
	HashSet<String> set = new HashSet<String>();
			if(file.exists()) {
		files=	file.listFiles();
	}  
    HashMap<String,ArrayList<String>> hm = new  HashMap<String,ArrayList<String>>();
	for(File fil : files) {
		System.out.println("com.ccbs.bs.dao"+fil.getName());
		String name = fil.getName().replaceAll("Mapper.*", "");
		String name1=name.substring(0, 1).toLowerCase().concat(name.substring(1));
		set.add(name);
		
		if(fil.getName().contains(".java")) {
//			Class aa=Class.forName("com.ccbs.am.dao."+fil.getName().replaceAll(".java", ""));
//			Method[] methods = aa.getDeclaredMethods();
//			for(Method me : methods) {
//				String s = me.getName();
//				System.out.println(s);
//				String s1 = s.replaceAll("abstract", "")
//						.replaceAll("com.*Mapper.", "")
//			}
			BufferedReader br   = new BufferedReader(new FileReader(fil));
			String s="";
			ArrayList<String> al= new ArrayList<String>();
			while(( s =br.readLine()) !=null) {
				if(s.matches("^.*\\);$")) {
					String[] sk = s.split("\\(");
					String sk1 = "";
					String sk2 = "";
				
						 sk1=sk[0].trim().split(" ")[1];
						 sk2 = sk[1].split(" ")[1].replaceAll("\\);", "");
					
					s="public "+s.replace(";", "{\n");
					s="@RequestMapping(\"/"+sk1+"\")\n"+s+"return "+name1+"Service."+sk1+"("+sk2+")"+";\n}\n";
					System.out.println(s);
					al.add(s);
					
				}
			}
			hm.put(name, al);
				
	}
		
	}
	Iterator<String> it = set.iterator();
	while(it.hasNext()) {
		String name = it.next();
		String name1=name.substring(0, 1).toLowerCase().concat(name.substring(1));
		File fo  = new File("src/main/java/com/ccbs/bs/controller/"+name+"Controller.java");
		if(!fo.exists()) 
			fo.createNewFile();
		FileWriter fos =new FileWriter(fo);
		BufferedWriter bw = new BufferedWriter(fos);
		bw.write("package com.ccbs.bs.controller;\n\n");	
		bw.write("import org.springframework.beans.factory.annotation.Autowired;\n");
		bw.write("import org.springframework.web.bind.annotation.RequestMapping;\n");
		bw.write("import org.springframework.web.bind.annotation.RestController;\n");

		bw.write("import com.ccbs.bs.service."+name+"Service;\n");
		bw.write("import com.ccbs.bs.domain."+name+";\n");
		
		bw.write("@RestController\n");
		bw.write("@RequestMapping(\"/ccbs/"+name+"\")\n");
		bw.write("public class "+name+"Controller {\n");
		bw.write("@Autowired\n");
		bw.write("private "+name+"Service "+name1+"Service;\n");
		for(String s2 : hm.get(name)) {
			bw.write(s2);
			
		}
		bw.write("\n}");
		bw.flush();
		bw.close();
			
		//bw.write("public "+name+" find"+name+"ByKey("+name+" "+name1+") {\n");
		//bw.write("return "+name1+"Mapper.selectByPrimaryKey(numUserid);
				
		/*	}
			public int insertAmUserInfo(AmUserInfo amUserInfo) {
				return amUserInfoMapper.insert(amUserInfo);
				
			}
			public int deleteAmUserInfoByUserId(String numUserid) {
				return amUserInfoMapper.deleteByPrimaryKey(numUserid);
				
			}
			public int updateAmUserInfoByUserId(AmUserInfo amUserInfo) {
				return amUserInfoMapper.updateByPrimaryKey(amUserInfo);
				
			}

		}*/

		
		
		
		//System.out.println(it.next());
	}
	System.out.println();
	
	
}
}

