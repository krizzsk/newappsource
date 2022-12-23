package com.masabi.justride.sdk.jobs.authentication;

public enum DeviceAccountFilenames {
    APP_ID("AppID.txt"),
    APP_PASSWORD("AppIDPassword.txt");
    
    public final String fileName;

    private DeviceAccountFilenames(String str) {
        this.fileName = str;
    }
}
