package step_one;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
//只是过滤jsp文件夹下的所有页面，即控制jsp文件夹下页面的访问
@WebFilter(urlPatterns={"/jsp/*"})
public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)arg0;
		//request.getRequestURI() != null && (request.getRequestURI().contains("login")代表是登陆
		if((request.getRequestURI() != null && (request.getRequestURI().contains("login")) )
				//request.getSession() != null && request.getSession().getAttribute("user")!=null代表已经登陆
			|| request.getSession() != null && request.getSession().getAttribute("user")!=null){
			arg2.doFilter(request, arg1);
		}else{
			request.getRequestDispatcher("login.jsp").forward(request, arg1);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
