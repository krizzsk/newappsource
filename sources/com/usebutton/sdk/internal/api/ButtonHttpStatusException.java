package com.usebutton.sdk.internal.api;

import java.net.URL;

public class ButtonHttpStatusException extends ButtonNetworkException {
    private String mLimitResetSeconds;
    private final int mStatusCode;

    public ButtonHttpStatusException(int i) {
        this(i, (URL) null);
    }

    public String getLimitResetSeconds() {
        return this.mLimitResetSeconds;
    }

    public void setLimitResetSeconds(String str) {
        this.mLimitResetSeconds = str;
    }

    public boolean wasBadRequest() {
        int i = this.mStatusCode;
        return i >= 400 && i < 500;
    }

    public boolean wasRateLimited() {
        return this.mStatusCode == 429;
    }

    public boolean wasServerError() {
        int i = this.mStatusCode;
        return i >= 500 && i < 600;
    }

    public boolean wasUnauthorized() {
        return this.mStatusCode == 401;
    }

    public ButtonHttpStatusException(int i, URL url) {
        this(i, url, (String) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ButtonHttpStatusException(int r3, java.net.URL r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HTTP error code: "
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0028
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            goto L_0x002a
        L_0x0028:
            java.lang.String r4 = ""
        L_0x002a:
            r0 = 0
            r2.<init>(r4, r5, r0)
            java.lang.String r4 = "0"
            r2.mLimitResetSeconds = r4
            r2.mStatusCode = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.api.ButtonHttpStatusException.<init>(int, java.net.URL, java.lang.String):void");
    }
}
