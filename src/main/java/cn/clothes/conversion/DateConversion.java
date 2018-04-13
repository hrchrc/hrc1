package cn.clothes.conversion;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Component;
@Component
/**字符串日期格式转换类内容*/
public class DateConversion implements Converter<String, Date>{//字符串转日期转换器
	@Override
    public Date convert(String stringDate) {//系统时间变量convert带String字符串参数stringDate
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//日期格式
        try {
            return simpleDateFormat.parse(stringDate);//返回日期格式,并转换(parse)为字符串stringDate
        } catch (ParseException | java.text.ParseException e) {
        	//ParseException里SimpleDateFormat的字符串没有按“yyyy-MM-dd”这么串,才会报这个错
            e.printStackTrace();
        }
        return null;
    }
}
