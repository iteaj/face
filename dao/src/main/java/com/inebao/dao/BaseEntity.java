package com.inebao.dao;

import com.baomidou.mybatisplus.annotations.TableId;
import com.iteaj.util.core.orm.Entity;

/**
 * create time: 2018/7/7
 *
 * @author iteaj
 * @since 1.0
 */
public abstract class BaseEntity implements Entity {

    @TableId
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
