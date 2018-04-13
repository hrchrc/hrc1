package cn.clothes.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.clothes.domain.UserTable;
import cn.clothes.service.UserService;


@Controller
public class AdminController {//管理员控制
	@Autowired
	//@Autowired注解就是spring可以自动把bean里面引用的对象的setter/getter方法省略,它会自动帮你set/get。
	private UserService userService;
	
	@RequestMapping("/login.html")
	//@RequestMapping用来处理请求地址映射的注解,可用于类或方法上
	public String login(){
		
		return "/admin/login";
	}
	@RequestMapping(value="/loginInfo",method=RequestMethod.POST)
	/*@RequestMapping
	RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
	RequestMapping注解有六个属性，下面我们把她分成三类进行说明。
	value， method
	value：     指定请求的实际地址，指定的地址可以是URI Template 模式（后面将会说明）；
	method：  指定请求的method类型， GET、POST、PUT、DELETE等；
	consumes，produces
	consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
	produces:    指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；
	params，headers
	params： 指定request中必须包含某些参数值是，才让该方法处理。
	headers： 指定request中必须包含某些指定的header值，才能让该方法处理请求。*/
	public String loginInfo(UserTable userTable,HttpSession session,Model model) {
		//javax.servlet.http.HttpSession接口表示一个会话，可以把一个会话内需要共享的数据保存到HttSession对象中
		UserTable user = userService.findUserByName(userTable.getUsername());
		//从实体类UserTable里创建对象user,赋值为私有化接口对象userService，通过findUserByName获得该私有化对象的用户名字
		if(user==null) {
			return "redirect:/login.html";
		}else if(!user.getPassword().equals(userTable.getPassword())) {
			return "redirect:/login.html";
		}else {
			session.setAttribute("userTable", user);//设置session值的,sessionName是名称,object是你要保存的对象
			return "content/content";//返回content文件夹的content.jsp文件
		}
	}
	@RequestMapping("/register")
	public String register(){
		return "admin/register";
	}
	@RequestMapping(value="/registerInfo",method=RequestMethod.POST)
	public String registerInfo(UserTable userTable,Model model) {
		UserTable user = userService.findUserByName(userTable.getUsername());
		if(user!=null) {
			model.addAttribute("message", "用户名已存在！");
			return "redirect:/register";
		}else {
		userService.addUser(userTable);
		model.addAttribute("message", "注册成功！");
		return "admin/login";
	}
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("userTable");
		return "admin/login";
	}
}
