package com.visitormaker.AIJava.controller;

import com.visitormaker.AIJava.model.SearchRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ChatGPTRestController {

    @PostMapping("/searchChatGPT")
    public String searchChatGPT(@RequestBody SearchRequest searchRequest) {

        System.out.println("searchChatGPT Starter query: " + searchRequest.getQuery());
        return "";
    }

}
