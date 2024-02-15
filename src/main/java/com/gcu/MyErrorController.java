package com.gcu;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController
{
    @RequestMapping("/error")
    public String showErrorPage()
    {
        return "error.html";
    }

    @RequestMapping("/")
    public String showDefaultPage()
    {
        return "coverPage.html";
    }
}
