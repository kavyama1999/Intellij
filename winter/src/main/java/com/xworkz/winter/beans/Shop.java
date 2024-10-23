package com.xworkz.winter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shop {//shop depends on customer

    @Autowired
    private  Customer customer;//association

@Autowired
    private int shopId;

@Autowired
@Qualifier("shopOwnerName")
    private String shopOwnerName;

    public Shop()
    {
        System.out.println("no parameter in  shop ............");
    }
}
