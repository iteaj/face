package com.inebao.web.controller;

import com.inebao.dao.mapper.ITestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create time: 2018/7/6
 *
 * @author iteaj
 * @since 1.0
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private ITestDao testDao;

    public TestController() {
        System.out.println(testDao);
    }

    @GetMapping("aa")
    public void Test() {
        System.out.println(testDao.selectById(1));
    }
}
