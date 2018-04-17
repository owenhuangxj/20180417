package com.owen.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.owen.model.Article;

public class JsonUtil {
	
	public static String obj2json(Object obj){
		String json = null;
		if(null != obj){
			ObjectMapper mapper = new ObjectMapper();
			try {
				json = mapper.writeValueAsString(obj);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		return json;
	}
	
	public static void main(String[] args) {
		List<Article> list = new ArrayList<Article>();
		list.add(new Article("xml", "maomao", "tianla", "123@sina.com", "2012年3月10日"));
		list.add(new Article("java", "momo", "ewqe", "rewqe@sina.com", "2012年6月10日"));
		list.add(new Article("html", "pingping", "fdsaf", "fds@sina.com", "2014年3月10日"));
		System.out.println(obj2json(list));
	}
}
