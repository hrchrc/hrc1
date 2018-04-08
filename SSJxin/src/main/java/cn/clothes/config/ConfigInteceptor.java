package cn.clothes.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.clothes.interceptor.LoginInterceptor;
/**登录拦截器配置*/
@SuppressWarnings("deprecation")
@Configuration
public class ConfigInteceptor extends WebMvcConfigurerAdapter{//WebMvcConfigurerAdapter配置类其实是Spring内部的一种配置方式，采用JavaBean的形式来代替传统的xml配置文件形式进行针对框架个性化定制
	 @Autowired
	private LoginInterceptor loginInterceptor;//登录拦截器
	@Override
	public void addInterceptors(InterceptorRegistry registry) {//增加登录拦截器方法，registry是变量‘注册’
		
		registry.addInterceptor(loginInterceptor).excludePathPatterns("/login.html").addPathPatterns("/content/**");
		//registry变量增加拦截器到名为‘loginInterceptor’的拦截器中，excludePathPatterns 用户排除拦截"/login.html"，addPathPatterns用于添加拦截规则"/content/**"调回登录页面。
	}
}

