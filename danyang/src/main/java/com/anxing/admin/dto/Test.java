package com.anxing.admin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Test {


    @JsonProperty("apiCode")
    private Integer apiCode;

    @JsonProperty("apiData")
    private Item apiData;
}

