package chosun.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Iterator;

@Controller
public class IndexController {

    @GetMapping("/jungminbabo")
    public String jung() {

        return "index";
    }



}
