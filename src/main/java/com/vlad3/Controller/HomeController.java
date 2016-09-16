package com.vlad3.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Влад on 7/27/2016.
 */

@Controller
public class HomeController {
    @RequestMapping (value = "/")
    public String home()
    {
        return "test";
    }
}
