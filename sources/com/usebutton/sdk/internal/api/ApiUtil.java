package com.usebutton.sdk.internal.api;

import java.util.Locale;

public class ApiUtil {
    private final HostInformation mHostInformation;

    public ApiUtil(HostInformation hostInformation) {
        this.mHostInformation = hostInformation;
    }

    public String getUserAgent() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        String replace = this.mHostInformation.getSdkVersionName().replace("-SNAPSHOT", str);
        String sdkGitHash = this.mHostInformation.getSdkGitHash();
        if (sdkGitHash.isEmpty()) {
            if (this.mHostInformation.getSdkVersionCode() > 1) {
                sdkGitHash = String.valueOf(this.mHostInformation.getSdkVersionCode());
            } else {
                sdkGitHash = str;
            }
        }
        sb.append("com.usebutton.sdk/");
        sb.append(replace);
        if (!sdkGitHash.isEmpty()) {
            str = C25541a.m63881k("+", sdkGitHash);
        }
        C25541a.m63890u(sb, str, ' ', "(Android ");
        sb.append(this.mHostInformation.getAndroidVersionName());
        sb.append("; ");
        sb.append(this.mHostInformation.getDeviceManufacturer());
        sb.append(' ');
        sb.append(this.mHostInformation.getDeviceModel());
        sb.append("; ");
        sb.append(this.mHostInformation.getPackageName());
        sb.append('/');
        sb.append(this.mHostInformation.getVersionName());
        sb.append('+');
        sb.append(this.mHostInformation.getVersionCode());
        sb.append("; ");
        sb.append(String.format(Locale.US, "Scale/%.1f; ", new Object[]{Float.valueOf(this.mHostInformation.getScreenDensity())}));
        Locale locale = this.mHostInformation.getLocale();
        sb.append(locale.getLanguage());
        sb.append('-');
        sb.append(locale.getCountry());
        sb.append(')');
        return sb.toString();
    }
}
