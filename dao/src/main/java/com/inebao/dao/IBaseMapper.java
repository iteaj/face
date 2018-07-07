package com.inebao.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.iteaj.util.core.orm.Entity;
import com.iteaj.util.core.orm.IBaseDao;

/**
 * create time: 2018/7/5
 *  使用Mybatis-plus接口
 * @author iteaj
 * @since 1.0
 */
public interface IBaseMapper<T extends Entity> extends IBaseDao<T>, BaseMapper<T> {

}
