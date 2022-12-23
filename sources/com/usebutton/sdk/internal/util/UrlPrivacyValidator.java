package com.usebutton.sdk.internal.util;

import java.util.Arrays;
import java.util.List;

public class UrlPrivacyValidator {
    public static final String HTTPS_SCHEME = "https://";
    public static final String HTTP_SCHEME = "http://";

    public List<String> getValidUrlSchemes() {
        return Arrays.asList(new String[]{HTTP_SCHEME, HTTPS_SCHEME});
    }

    public boolean isValidUrl(String str) {
        for (String startsWith : getValidUrlSchemes()) {
            if (str.toLowerCase().startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }
}
