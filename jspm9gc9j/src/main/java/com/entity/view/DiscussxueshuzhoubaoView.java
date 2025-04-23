package com.entity.view;

import com.entity.DiscussxueshuzhoubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学术周报评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-11 20:34:36
 */
@TableName("discussxueshuzhoubao")
public class DiscussxueshuzhoubaoView  extends DiscussxueshuzhoubaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxueshuzhoubaoView(){
	}
 
 	public DiscussxueshuzhoubaoView(DiscussxueshuzhoubaoEntity discussxueshuzhoubaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussxueshuzhoubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
