package com.akash.github.springdatajpah2.enums;

import lombok.Getter;

@Getter
public enum Status {

    SUCCESS("200", "success"),
    FAILURE("500", "failure");

    private String code;

    private String value;

    Status(String code, String value) {
        this.code = code;
        this.value = value;
    }
}
