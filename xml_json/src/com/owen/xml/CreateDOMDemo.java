package com.owen.xml;

import java.io.FileOutputStream;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
/**
 * 使用jdom生成xml文件
 * @author Owen
 */
public class CreateDOMDemo {
	
	public static void main(String[] args) throws Exception {
		//创建根标签articles
		Element root = new Element("articles");
		//创建文档对象
		Document document = new Document(root);
		//创建article标签
		Element atl1 = new Element("article");
		//创建title标签
		Element title = new Element("titile");
		//给title标签赋值
		title.addContent("罪恶之城");
		//将title标签加入到article标签中
		atl1.addContent(title);
		
		Element author = new Element("author");
		author.addContent("烟雨江南");
		atl1.addContent(author);
		
		Element email = new Element("email");
		email.addContent("sin_rain@sina.com");
		atl1.addContent(email);
		
		Element date = new Element("date");
		date.addContent("20180405");
		atl1.addContent(date);
		//将article标签加入到根标签articles中去
		root.addContent(atl1);
		//使用XMLOutputter 对象生成xml文件
		XMLOutputter outputter = new XMLOutputter(formateXML());
		outputter.output(document, new FileOutputStream("F://out.xml"));
	}
	
	public static Format formateXML(){
		//格式化生成的xml文件，如果不进行格式化的话，生成的xml文件将会是很长的一行...  
		Format format = Format.getCompactFormat();
		format.setEncoding("GBK");
		//
		format.setIndent("\t");
		return format;
	}
}