package com.owen.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadArticleDifficult {
	
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(ReadArticleDifficult.class.getClassLoader().getResourceAsStream("article.xml"));
		Element root = document.getDocumentElement();
		System.out.println("���ڵ� �� "+root.getNodeName());
		NodeList children = root.getChildNodes();
		for(int i = 0 ; i < children.getLength() ; i++){
			if("article".equals(children.item(i).getNodeName())){
				System.out.println("С˵���� �� "+children.item(i).getAttributes().getNamedItem("category"));
				NodeList nodes = children.item(i).getChildNodes();
				for(int j = 0 ; j < nodes.getLength() ; j++){
					Node node = nodes.item(j);
					if("title".equals(node.getNodeName())){
						System.out.println("����:"+node.getTextContent());
					}else if("author".equals(node.getNodeName())){
						System.out.println("����:"+node.getTextContent());
					}else if("email".equals(node.getNodeName())){
						System.out.println("����:"+node.getTextContent());
					}else if("date".equals(node.getNodeName())){
						System.out.println("��������:"+node.getTextContent());
					}
				}
			}
		}
	}

}
