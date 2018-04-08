package cn.clothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.show.api.ShowApiRequest;

import cn.clothes.biz.WeatherJson;
import cn.clothes.utils.FastJsonUtil;

@Controller
public class IndexController {
	/**
	 * 首页
	 * @param model
	 */
	@RequestMapping("/content")//路径是在content文件夹里
	//RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
	public String content(Model model){//
		return "content/content";//返回到content文件夹的content.jsp文件
	}
	/**
	 * 首页默认页
	 */
	@RequestMapping(value="/loadindex")
	public String index() {
		return "content/index";
	}
	@RequestMapping("/weather")
	@ResponseBody
	public String weather() {//定义weather方法
		String res=new ShowApiRequest("http://route.showapi.com/9-5","59462","d30e5f4f96a74e048b3fe4b4ecfa92ec")
				.addTextPara("from","5")
				.addTextPara("lng","113.127937")
				.addTextPara("lat","23.012858")
				.addTextPara("needMoreDay","0")
				.addTextPara("needIndex","0")
				.addTextPara("needHourData","0")
				.addTextPara("need3HourForcast","0")
				.addTextPara("needAlarm","0")
				.post();//由接口中心http://route.showapi.com/9-5提供天气数据,并以post的方式传递
		WeatherJson json = FastJsonUtil.parseObject(res, WeatherJson.class);
		//WeatherJson类以json对象的方式,调用FastJsonUtil类的parseObject方法,用上面res对象传递数据到WeatherJson实体类里
		String jsona = json.getShowapi_res_body();//json对象负责重新get得实体类里getShowapi_res_body()对象的值,并赋值给jsona
		JSONObject jsonb = JSON.parseObject(jsona);//总fastjson类的JSON方法将字符串转化为相应的对象,这里转化的对象是jsona;并赋值给jsonb
		String jsonc = jsonb.getString("now");//jsonb对象获得字符串"now"并赋值给jsonc
		return jsonc;//返回jsonc对象
	}
}
