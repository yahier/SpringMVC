package com.cenyol.example.controller;

import com.cenyol.example.repository.BlogDao;
import com.cenyol.example.vo.BaseRes;
import com.cenyol.example.vo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Context;

@RestController
@RequestMapping("/blog")
public class BlogController extends BaseController {
//    @Autowired
//    BlogDao blogDao;


    @RequestMapping(value = "/test1", produces = {"application/json;charset=UTF-8"})
    public Blog test1(Blog blog) {
        return blog;
    }

    //测试失败
    @RequestMapping(value = "/test2", produces = {"application/json;charset=UTF-8"})
    public BaseRes test2() {
        //查无此xml文件
        ApplicationContext context = new ClassPathXmlApplicationContext("mvc-dispatcher-servlet.xml");
        BlogDao blogDao = context.getBean(BlogDao.class);
        Blog blog = new Blog();
        blog.setContent("yahier");
        blog.setDate("08-31");
        blog.setId(2);
        blogDao.save(blog);
        return new BaseRes();
    }

    @RequestMapping(value = "/test3", produces = {"application/json;charset=UTF-8"})
    public BaseRes test3() {
        return outSuccess();
    }

    @RequestMapping(value = "/test4", produces = {"application/json;charset=UTF-8"})
    public BaseRes test4() {
        return outFailed("失败了哦");
    }

    @RequestMapping(value = "/test5", produces = {"application/json;charset=UTF-8"})
    public void test5() {
    }
}
