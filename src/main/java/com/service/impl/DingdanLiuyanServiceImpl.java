package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.DingdanLiuyanDao;
import com.entity.DingdanLiuyanEntity;
import com.service.DingdanLiuyanService;
import com.entity.view.DingdanLiuyanView;

/**
 * 售后服务 服务实现类
 * @author 
 * @since 2021-04-22
 */
@Service("dingdanLiuyanService")
@Transactional
public class DingdanLiuyanServiceImpl extends ServiceImpl<DingdanLiuyanDao, DingdanLiuyanEntity> implements DingdanLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<DingdanLiuyanView> page =new Query<DingdanLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
