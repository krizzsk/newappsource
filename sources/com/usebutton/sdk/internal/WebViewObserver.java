package com.usebutton.sdk.internal;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WebViewObserver {
    private static final WebViewObserver OUR_INSTANCE = new WebViewObserver();
    private List<OnProgressChangedListener> listeners = new CopyOnWriteArrayList();

    public interface OnProgressChangedListener {
        void onProgressChanged(int i);
    }

    private WebViewObserver() {
    }

    public static WebViewObserver getInstance() {
        return OUR_INSTANCE;
    }

    public void addListener(OnProgressChangedListener onProgressChangedListener) {
        this.listeners.add(onProgressChangedListener);
    }

    public void removeListener(OnProgressChangedListener onProgressChangedListener) {
        this.listeners.remove(onProgressChangedListener);
    }

    public void updateProgress(int i) {
        for (OnProgressChangedListener next : this.listeners) {
            if (next != null) {
                next.onProgressChanged(i);
            }
        }
    }
}
