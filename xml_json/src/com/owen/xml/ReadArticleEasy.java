package com.owen.xml;

import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ReadArticleEasy {
	public static void main(String[] args) throws Exception {
		SAXBuilder builder = new SAXBuilder();
		Document document = builder.build(ReadArticleEasy.class.getClassLoader().getResourceAsStream("article2.xml"));
		Element root = document.getRootElement();
		for(Element e : root.getChildren()){
			System.out.println("С˵����:"+e.getAttributeValue("category"));
			
			if(e.getChildren().size() > 0){
				/*System.out.println("С˵����"+e.getChild("title").getText());
				System.out.println("���ߣ�"+e.getChild("author").getText());
				System.out.println("���䣺"+e.getChild("email").getText());
				System.out.println("�������ڣ�"+e.getChild("date").getText());
				System.out.println("====================================");*/
				for(Element e1 : e.getChildren()){
					System.out.println(e1.getAttributeValue("name") + " : "+e1.getText());
				}
				System.out.println("=================================");
			}
			
		}
	}

}
