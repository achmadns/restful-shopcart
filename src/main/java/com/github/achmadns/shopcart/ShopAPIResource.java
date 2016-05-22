package com.github.achmadns.shopcart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 5/22/16.
 */
@RestController
public class ShopAPIResource {
    @RequestMapping("/api/v1/shop")
    public String home(){
        return "Welcome to shopcart!";
    }
}
