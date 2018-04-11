package step_one;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {
	
	public static String getProperty(String key,String filename){
		String value = null;
		//Util.class.getClassLoader()获取到Util.class文件的类加载器，用此加载器来加载同路径下的properties文件
		InputStream in = Util.class.getClassLoader().getResourceAsStream("users.properties");
		Properties ppt = new Properties();
		try {
			ppt.load(in);//效果等同于FileInputStream fis = new FileInputStream(in);只有做类似操作后才能读文件			
		} catch (IOException e) {
			e.printStackTrace();
		}
		value = ppt.getProperty(key);
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}
