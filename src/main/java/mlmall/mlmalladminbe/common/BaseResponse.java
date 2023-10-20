package mlmall.mlmalladminbe.common;

import lombok.Getter;

@Getter
public class BaseResponse<T> {

    private final int responseCode;
    private final T result;

    public BaseResponse() {
        this(ResponseCode.SUCCESS, null);
    }

    public BaseResponse(T result) {
        this(ResponseCode.SUCCESS, result);
    }

    public BaseResponse(ResponseCode code, T result) {
        this.responseCode = code.getCode();
        this.result = result;
    }
}
