package com.owen.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.owen.json.JsonUtil;
import com.owen.model.Article;
@WebServlet("/JSONServlet")
public class JSONServlet extends HttpServlet{
	private static final long serialVersionUID = -1945271474301902100L;
	List<Article> articles;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json;charset=utf-8");
		String data = JsonUtil.obj2json(articles);
		System.out.println(data);
		resp.getWriter().write(data);
		resp.getWriter().close();
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		articles = new ArrayList<Article>();
		articles.add(new Article("xml", null, null, null, null));
		articles.add(new Article("С˵", "���֮��", "���꽭��", "sin_rain@sina.com.cn", changeTime(2015, 6, 20)));
		articles.add(new Article("����", "�������ɴ�", "�������", "potato@163.com", changeTime(2008, 10, 15)));
		
	}
	private String changeTime(int year,int month,int date){
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return new SimpleDateFormat("yyyy��mm��dd��").format(new Date(c.getTimeInMillis()));
	}
}