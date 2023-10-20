package mlmall.mlmalladminbe.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseCode {

    SUCCESS(0, "Success"),
    UNKNOWN_ERROR(9999, "Unknown error")
    ;

    private final int code;
    private final String message;
}
