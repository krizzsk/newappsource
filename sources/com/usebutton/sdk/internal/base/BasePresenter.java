package com.usebutton.sdk.internal.base;

import com.usebutton.sdk.internal.base.BaseViewController;
import com.usebutton.sdk.internal.util.ButtonLog;

public abstract class BasePresenter<C extends BaseViewController> {
    private C controller;
    private final String tag = getClass().getSimpleName();

    public final void attachView(C c) {
        this.controller = c;
        onViewAttached();
    }

    public final void detachView() {
        onViewDetached();
        this.controller = null;
    }

    public final C getViewController() {
        if (isViewAttached()) {
            return this.controller;
        }
        ButtonLog.warn(this.tag, "ViewController no found");
        return null;
    }

    public final boolean isViewAttached() {
        return this.controller != null;
    }

    public void onViewAttached() {
    }

    public void onViewDetached() {
    }
}
