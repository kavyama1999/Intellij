package com.xworkz.summer.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SummerBean {

    public SummerBean()
    {
        System.out.println("SummerBean............");
    }

    @PostMapping("/click")
    public String rain()
    {
        System.out.println("Its Rainy");
        return "index";
    }
}
