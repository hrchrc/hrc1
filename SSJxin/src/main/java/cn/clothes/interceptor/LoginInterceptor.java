package cn.clothes.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
/**登录拦截器内容*/
@Component
public class LoginInterceptor implements HandlerInterceptor{//HandlerInterceptor拦截器用于处理请求之前，做一些处理
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {//HttpServletRequest对象代表客户端的请求，当客户端通过HTTP协议访问服务器时，HTTP请求头中的所有信息都封装在这个对象中，开发人员通过这个对象的方法，可以获得客户这些信息。
							  //HttpServletResponse对象代表服务器的响应。这个对象中封装了向客户端发送数据、发送响应头，发送响应状态码的方法。
		 Object userTable = request.getSession().getAttribute("userTable");//创建‘useTable’新对象发送上面的request对象的会话，getAttribute对应了setAttribute方法，返回指定属性名的属性值。
		 System.out.println(userTable);
		    if (userTable == null) {
		      response.sendRedirect("/login.html");//服务器响应，由浏览器来做转向，转到指定的页面
		      return false;
		    }
		    return true;
	}
}
