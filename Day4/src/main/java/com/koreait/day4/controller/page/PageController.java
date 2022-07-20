package com.koreait.day4.controller.page;

import com.koreait.day4.service.AdminMenuService;
import com.koreait.day4.service.UserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pages")   // http://localhost:9090/pages
public class PageController {

    @Autowired
    private AdminMenuService adminMenuService;

    @Autowired
    private UserApiLogicService userApiLogicService;

    @RequestMapping(path={""})
    public ModelAndView index(){
        return new ModelAndView("/pages/index")
                .addObject("menuList", adminMenuService.getAdminMenu())
                .addObject("code", "main");
    }

    @RequestMapping("/user")    // http://localhost:9090/pages/user
    public ModelAndView user(){
        return new ModelAndView("/pages/user")
                .addObject("menuList", adminMenuService.getAdminMenu())
                .addObject("code", "main");
    }

    @RequestMapping("/user/user_form")    // http://localhost:9090/pages/user/user_form
    public ModelAndView user_form(){
        System.out.println("들어옴1");
        return new ModelAndView("/pages/user_form")
                .addObject("menuList", adminMenuService.getAdminMenu())
                .addObject("code", "main");
    }

    @RequestMapping("/user-regist")    // http://localhost:9090/pages/user-regist
    public ModelAndView userRegist(){
        return new ModelAndView("/pages/user_regist")
                .addObject("menuList", adminMenuService.getAdminMenu())
                .addObject("code", "main");
    }




}
