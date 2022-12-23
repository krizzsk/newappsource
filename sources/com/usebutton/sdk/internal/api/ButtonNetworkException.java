package com.usebutton.sdk.internal.api;

import com.usebutton.sdk.internal.ButtonException;

public class ButtonNetworkException extends ButtonException {
    private String mRequestId;

    public ButtonNetworkException(Throwable th) {
        super(th);
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public ButtonNetworkException(String str) {
        super(str);
    }

    public ButtonNetworkException(String str, Throwable th) {
        super(str, th);
    }

    public ButtonNetworkException(String str, String str2, Throwable th) {
        super(str, th);
        this.mRequestId = str2;
    }
}
