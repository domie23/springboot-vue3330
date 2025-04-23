package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuerenshoudaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuerenshoudaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuerenshoudaoView;


/**
 * 确认收到
 *
 * @author 
 * @email 
 * @date 2022-04-11 20:34:35
 */
public interface QuerenshoudaoService extends IService<QuerenshoudaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuerenshoudaoVO> selectListVO(Wrapper<QuerenshoudaoEntity> wrapper);
   	
   	QuerenshoudaoVO selectVO(@Param("ew") Wrapper<QuerenshoudaoEntity> wrapper);
   	
   	List<QuerenshoudaoView> selectListView(Wrapper<QuerenshoudaoEntity> wrapper);
   	
   	QuerenshoudaoView selectView(@Param("ew") Wrapper<QuerenshoudaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuerenshoudaoEntity> wrapper);
   	

}

