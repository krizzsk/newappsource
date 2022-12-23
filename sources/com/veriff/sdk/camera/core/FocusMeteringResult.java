package com.veriff.sdk.camera.core;

public final class FocusMeteringResult {
    private FocusMeteringResult(boolean z) {
    }

    public static FocusMeteringResult create(boolean z) {
        return new FocusMeteringResult(z);
    }

    public static FocusMeteringResult emptyInstance() {
        return new FocusMeteringResult(false);
    }
}
