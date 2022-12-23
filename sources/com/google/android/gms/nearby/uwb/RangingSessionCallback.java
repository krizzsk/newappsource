package com.google.android.gms.nearby.uwb;

public interface RangingSessionCallback {

    public @interface RangingSuspendedReason {
        public static final int FAILED_TO_START = 2;
        public static final int MAX_RANGING_ROUND_RETRY_REACHED = 5;
        public static final int STOPPED_BY_PEER = 3;
        public static final int STOP_RANGING_CALLED = 4;
        public static final int UNKNOWN = 0;
        public static final int WRONG_PARAMETERS = 1;
    }

    void onRangingInitialized(UwbDevice uwbDevice);

    void onRangingResult(UwbDevice uwbDevice, RangingPosition rangingPosition);

    void onRangingSuspended(UwbDevice uwbDevice, @RangingSuspendedReason int i);
}
