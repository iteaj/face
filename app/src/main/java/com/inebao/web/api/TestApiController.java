package com.inebao.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create time: 2018/7/7
 *
 * @author iteaj
 * @since 1.0
 */
@RestController
@RequestMapping("/api/test")
public class TestApiController {

    public void test() {
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
