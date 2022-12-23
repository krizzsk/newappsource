package com.usebutton.sdk.internal;

public abstract class ButtonException extends Exception {
    public ButtonException(Throwable th) {
        super(th);
    }

    public ButtonException(String str, Throwable th) {
        super(str, th);
    }

    public ButtonException(String str) {
        super(str);
    }
}
