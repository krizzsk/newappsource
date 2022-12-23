package com.masabi.justride.sdk.platform.info;

public enum Platform {
    ANDROID("Android"),
    IOS("iOS");
    
    private final String name;

    private Platform(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
