package step_one;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginServlet")//与在web.xml中一样的注册，在开发中，必须重起容器
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = -6202847712652584835L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		System.out.println(username +" : "+pwd);
		String value = Util.getProperty(username, "users.properties");
		if(null != value && value.equals(pwd)){
			//设置key/value对到session对象中去
			req.getSession().setAttribute("user", new User(username, pwd));
			//设置session的过期时间为5分钟，session失效了-〉session被销毁了，他的优先级高于web.xml的配置
			req.getSession().setMaxInactiveInterval(60*5);
			//url地址发生改变
			resp.sendRedirect("index.jsp");
		}else{
			//url地址不发生改变
			req.getRequestDispatcher("error.jsp").forward(req, resp);
		}
	}
}
