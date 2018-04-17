package com.owen.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
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
@WebServlet("/JSON")
public class JSON extends HttpServlet{
	private static final long serialVersionUID = -1774283513790694546L;
	private List<Article> articles;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json;charset=utf-8");
		PrintWriter writer = resp.getWriter();
		writer.write(JsonUtil.obj2json(articles));
		writer.flush();
		writer.close();
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		articles = new ArrayList<Article>();
		articles.add(new Article("xml", null, null, null, null));
		articles.add(new Article("小说", "罪恶之城", "乔栋", "qiaodong@163.com", changeTime(2015, 2, 13)));
		articles.add(new Article("玄幻", "祭炼山河", "owen", "owen@163.com", changeTime(1999, 2, 13)));
		
	}
	
	private String changeTime(int year,int month,int date){
		//调用静态方法getInstance()获取实例
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		DateFormat formatter = new SimpleDateFormat("yyyy年mm月dd日");
		long time = c.getTimeInMillis();
		return formatter.format(new Date(time));
	}
}