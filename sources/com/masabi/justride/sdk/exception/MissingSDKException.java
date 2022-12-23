package com.masabi.justride.sdk.exception;

public class MissingSDKException extends JustRideSdkException {
    public MissingSDKException() {
        super("No AndroidJustRideSdk instance found which matches the provided identifier.");
    }
}
