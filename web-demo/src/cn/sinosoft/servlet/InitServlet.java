package cn.sinosoft.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.sinosoft.utils.SpringContainer;

/**
 * Servlet implementation class InitServlet
 */
@WebServlet(value = "/initServlet", loadOnStartup=1)
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException {
		ServletContext servletContext = config.getServletContext();
		ApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		SpringContainer.setContext(webApplicationContext);
	}
}
