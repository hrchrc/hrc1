package cn.clothes.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;

import cn.clothes.conversion.DateConversion;
/**格式转换器配置*/
@Configuration
public class ConfigConversion {
	@Autowired
	private DateConversion dataConversion;//私有化DateConversion类,命名为dataConversion对象
	public FormattingConversionServiceFactoryBean format() {//FormattingConversionServiceFactoryBean的意思是(格式化转换服务工厂对象),并命名为format方法
		FormattingConversionServiceFactoryBean formattingConversionServiceFactoryBean=new FormattingConversionServiceFactoryBean();
		//新建格式化转换服务工厂对象formattingConversionServiceFactoryBean
		Set converters=new HashSet();//集合对象converters是一个新散列(哈希)集合,只能存储不重复的对象
		converters.add(dataConversion);//converters集合添加dataConversion对象
		formattingConversionServiceFactoryBean.setConverters(converters);//格式化服务工厂对象的设置转换器,转换集合对象converters
		return formattingConversionServiceFactoryBean;
	}
	 

}
