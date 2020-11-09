package com.nobibi.common.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(0, "success"),
    Exception(1, "exception");

    public int code;
    private final String message;
}
