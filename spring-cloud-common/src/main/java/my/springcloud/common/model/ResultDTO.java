package my.springcloud.common.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import my.springcloud.common.enums.ResultCode;

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
        return ResultCode.SUCCESS.name().equals(code);
    }
}
