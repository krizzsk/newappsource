package com.masabi.justride.sdk.models.account;

public enum LoginResult {
    SUCCESS,
    FAILED,
    FAILED_ACCOUNT_ASSIGNED_TO_ANOTHER_DEVICE;

    public static LoginResult parse(String str) {
        try {
            return (LoginResult) Enum.valueOf(LoginResult.class, str);
        } catch (Exception unused) {
            return FAILED;
        }
    }
}
