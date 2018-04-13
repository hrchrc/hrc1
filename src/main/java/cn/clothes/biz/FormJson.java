package cn.clothes.biz;

import java.io.Serializable;
import java.util.List;


@SuppressWarnings("serial")
public class FormJson<T> implements Serializable{
	private Integer code;//编码
	private String msg;//信息
	private Integer count;//计算
	private List<T> data;//数据
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
}
