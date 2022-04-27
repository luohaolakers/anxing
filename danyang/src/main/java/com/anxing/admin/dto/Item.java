package com.anxing.admin.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Item {

    @JsonProperty("getFlag")
    private Integer getFlag;

    @JsonProperty("regionCode")
    private String regionCode;
}
