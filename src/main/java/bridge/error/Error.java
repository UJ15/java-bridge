package bridge.error;

public enum Error {
    SYSTEM_ERROR("내부 오류 입니다. 시스템을 재시작 해주세요"),
    BRIDGE_SIZE_RANGE_ERROR("다리 길이는 3 ~ 20 사이로 입력해 주세요."),
    BRIDGE_SIZE_TYPE_ERROR("다리 길이는 숫자로 입력해 주세요.");

    private final String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
