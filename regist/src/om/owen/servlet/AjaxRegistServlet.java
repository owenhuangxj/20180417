package om.owen.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxRegistServlet extends HttpServlet {
	private static final long serialVersionUID = 695001784252499194L;
	private List<String> users = new ArrayList<String>();
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		System.out.println(username);
		if(users.size()!=0&&users.contains(username)){
			resp.getWriter().println("exist");
		}else{
			resp.getWriter().println("ok");
		}
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		String temp = config.getInitParameter("users");
		String[] t = temp != null?temp.split(","):null;
		if(null != t){
			for(String str: t){
				users.add(str);
			}
		}
	}
	
}
