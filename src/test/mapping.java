package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;





public class mapping {
	
	public static void main(String[] args) throws IOException {
		String content = FileUtils.readFileToString(new File("newFile.file"),StandardCharsets.UTF_8);
				
		System.out.println(content);
	
	String [] str =  content.split(" ");
	
//System.out.println(string.toString());
	
	
	  Integer value;
	  
	  HashMap<String, Integer> m1 = new HashMap<>();
	  
	  
	  for(int i =0; i<str.length;i++) {
	  
	  value = m1.get(str[i]);
	  
	  if(value == null) {
		  m1.put(str[i], 1);
		  
	  }else {
		m1.put(str[i], value+1);
	}
	  
	  
	  
	  
	  }
	  
	  System.out.println(m1);
	  
	  
	  
	  
	  }
	 

	}

