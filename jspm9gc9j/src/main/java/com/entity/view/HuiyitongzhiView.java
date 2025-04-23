package com.entity.view;

import com.entity.HuiyitongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会议通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
@TableName("huiyitongzhi")
public class HuiyitongzhiView  extends HuiyitongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyitongzhiView(){
	}
 
 	public HuiyitongzhiView(HuiyitongzhiEntity huiyitongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, huiyitongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
