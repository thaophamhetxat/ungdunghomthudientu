package com.codegym.controller;

import moduls.HomThu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.HomThuService;

@Controller
public class HomThuController {
    HomThuService homThuService = new HomThuService();


    @RequestMapping("")
    public ModelAndView home() {
        HomThu homThu = new HomThu();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("list",homThu);
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute HomThu homThu){
        homThuService.save(homThu);
        return new ModelAndView("redirect:/");
    }

}
