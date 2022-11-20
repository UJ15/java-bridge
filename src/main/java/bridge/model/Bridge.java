package bridge.model;

import static bridge.model.UpOrDown.DOWN_SIGN;
import static bridge.model.UpOrDown.UP_SIGN;

import bridge.error.Error;
import java.util.List;
import java.util.Objects;

public class Bridge {

    private final List<String> bridge;

    public Bridge(List<String> bridge) {
        if (Objects.isNull(bridge)) {
            throw new IllegalArgumentException(Error.SYSTEM_ERROR.getMessage());
        }
        validate(bridge);

        this.bridge = bridge;
    }

    private void validate(List<String> bridge) {
        if (!bridge.stream().allMatch(v -> v.equals(UP_SIGN) || v.equals(DOWN_SIGN))) {
            throw new IllegalArgumentException();
        }
    }
}
