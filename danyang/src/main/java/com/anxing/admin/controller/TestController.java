package com.anxing.admin.controller;

import com.anxing.admin.dto.Item;
import com.anxing.admin.dto.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class TestController {

    @Autowired
    private ObjectMapper objectMapper;


    /**
     * http://localhost:12088/anxing/test
     *
     * @return
     * @throws JsonProcessingException
     */
    @ApiOperation(value = "test")
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test() throws JsonProcessingException {

        Test test = new Test();
        test.setApiCode(9001);
        Item item = new Item();
        item.setGetFlag(2);
        item.setRegionCode("310000");
        test.setApiData(item);
        return objectMapper.writeValueAsString(test);

    }
}
