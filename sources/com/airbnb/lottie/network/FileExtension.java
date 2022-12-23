package com.airbnb.lottie.network;

import com.braze.support.WebContentUtils;

public enum FileExtension {
    JSON(".json"),
    ZIP(WebContentUtils.ZIP_EXTENSION);
    
    public final String extension;

    private FileExtension(String str) {
        this.extension = str;
    }

    public String tempExtension() {
        StringBuilder k = C13555b.m33972k(".temp");
        k.append(this.extension);
        return k.toString();
    }

    public String toString() {
        return this.extension;
    }
}
