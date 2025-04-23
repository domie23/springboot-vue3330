package com.entity.vo;

import com.entity.XueshengqiantuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学生签退
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public class XueshengqiantuiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 签退时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qiantuishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 经度
	 */
	
	private Float longitude;
		
	/**
	 * 纬度
	 */
	
	private Float latitude;
		
	/**
	 * 地址
	 */
	
	private String fulladdress;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：签退时间
	 */
	 
	public void setQiantuishijian(Date qiantuishijian) {
		this.qiantuishijian = qiantuishijian;
	}
	
	/**
	 * 获取：签退时间
	 */
	public Date getQiantuishijian() {
		return qiantuishijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：经度
	 */
	 
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * 获取：经度
	 */
	public Float getLongitude() {
		return longitude;
	}
				
	
	/**
	 * 设置：纬度
	 */
	 
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * 获取：纬度
	 */
	public Float getLatitude() {
		return latitude;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}
			
}
