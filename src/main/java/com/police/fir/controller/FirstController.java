package com.police.fir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class FirstController {


    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
