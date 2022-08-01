package com.hs.wa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {

    @PostMapping("/addArticle")
    private boolean addArticle(String article){
        System.out.println(article);
        return true;

    }

    @GetMapping("/getArticle/{userId}")
    @ResponseBody
    private boolean getArticle(String article, @PathVariable String userId){
        /*  SUCESSED
        * null 1
        *  */
        System.out.println(article+  " "+userId);
        return true;

    }
}
