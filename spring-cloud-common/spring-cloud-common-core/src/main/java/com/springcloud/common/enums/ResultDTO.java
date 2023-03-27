package com.springcloud.common.enums;

import com.springcloud.common.base.model.ResultCode;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class ResultDTO<T> {
    private final String code;
    private final String message;
    private final T data;

    public static <T> ResultDTO<T> ofSuccess(T data) {
        return of(ResultCode.SUCCESS, data);
    }

    public static <T> ResultDTO<T> ofSuccess() {
        return of(ResultCode.SUCCESS);
    }

    public static <T> ResultDTO<T> of(ResultCode resultCode, T detail) {
        return new ResultDTO<>(resultCode.getCode(), resultCode.getMessage(), detail);
    }

    public static <T> ResultDTO<T> of(ResultCode resultCode) {
        return new ResultDTO<>(resultCode.getCode(), resultCode.getMessage(), null);
    }

    public boolean isSuccess() {
        return ResultCode.SUCCESS.getCode().equals(code);
    }
}
