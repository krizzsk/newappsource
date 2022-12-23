package com.appboy.p044ui.inappmessage;

/* renamed from: com.appboy.ui.inappmessage.InAppMessageCloser */
public class InAppMessageCloser {
    private final IInAppMessageViewWrapper mInAppMessageViewWrapper;

    public InAppMessageCloser(IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        this.mInAppMessageViewWrapper = iInAppMessageViewWrapper;
    }

    public void close(boolean z) {
        if (z) {
            this.mInAppMessageViewWrapper.getInAppMessage().setAnimateOut(true);
        } else {
            this.mInAppMessageViewWrapper.getInAppMessage().setAnimateOut(false);
        }
        this.mInAppMessageViewWrapper.close();
    }
}
