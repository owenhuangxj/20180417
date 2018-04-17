package com.owen.xml;

import java.io.FileOutputStream;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
/**
 * ʹ��jdom����xml�ļ�
 * @author Owen
 */
public class CreateDOMDemo {
	
	public static void main(String[] args) throws Exception {
		//��������ǩarticles
		Element root = new Element("articles");
		//�����ĵ�����
		Document document = new Document(root);
		//����article��ǩ
		Element atl1 = new Element("article");
		//����title��ǩ
		Element title = new Element("titile");
		//��title��ǩ��ֵ
		title.addContent("���֮��");
		//��title��ǩ���뵽article��ǩ��
		atl1.addContent(title);
		
		Element author = new Element("author");
		author.addContent("���꽭��");
		atl1.addContent(author);
		
		Element email = new Element("email");
		email.addContent("sin_rain@sina.com");
		atl1.addContent(email);
		
		Element date = new Element("date");
		date.addContent("20180405");
		atl1.addContent(date);
		//��article��ǩ���뵽����ǩarticles��ȥ
		root.addContent(atl1);
		//ʹ��XMLOutputter ��������xml�ļ�
		XMLOutputter outputter = new XMLOutputter(formateXML());
		outputter.output(document, new FileOutputStream("F://out.xml"));
	}
	
	public static Format formateXML(){
		//��ʽ�����ɵ�xml�ļ�����������и�ʽ���Ļ������ɵ�xml�ļ������Ǻܳ���һ��...  
		Format format = Format.getCompactFormat();
		format.setEncoding("GBK");
		//
		format.setIndent("\t");
		return format;
	}
}