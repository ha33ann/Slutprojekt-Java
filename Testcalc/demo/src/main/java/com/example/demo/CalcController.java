package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalcController implements ErrorController{
    private CalcService cs = new CalcService();

    @RequestMapping(value = "/calcadd", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String calcadd(@RequestParam int nummer1, @RequestParam int nummer2){
        return "{" + "\"Result\":" + "\"" + cs.calcadd(nummer1, nummer2) + "\"" + "}";
    }
    @RequestMapping(value = "/calcsub", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String calcsub(@RequestParam int nummer1, @RequestParam int nummer2){
        return "{" + "\"Result\":" + "\"" + cs.calcsub(nummer1, nummer2) + "\"" + "}";
    }
    @RequestMapping(value = "/calcmult", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String calcmult(@RequestParam int nummer1, @RequestParam int nummer2){
        return "{" + "\"Result\":" + "\"" + cs.calcmult(nummer1, nummer2) + "\"" + "}"; 
    }
    @RequestMapping(value = "/calcdiv", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String calcdiv(@RequestParam int nummer1, @RequestParam int nummer2){
        return "{" + "\"Result\":" + "\"" + cs.calcdiv(nummer1, nummer2) + "\"" + "}";
    }
}