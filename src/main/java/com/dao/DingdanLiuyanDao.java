package com.dao;

import com.entity.DingdanLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanLiuyanView;

/**
 * 售后服务 Dao 接口
 *
 * @author 
 * @since 2021-04-22
 */
public interface DingdanLiuyanDao extends BaseMapper<DingdanLiuyanEntity> {

   List<DingdanLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
