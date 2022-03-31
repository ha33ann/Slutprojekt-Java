package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class sspController {

    @RequestMapping(value = "/choice", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String play(String choice) {
        
        String gameResult = RockPaperScissors.play(choice);
        return gameResult;
    }

    @RequestMapping(value = "/play", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String play() {
        String gameState = GameBean.getGameState();
        return gameState;
    }
}