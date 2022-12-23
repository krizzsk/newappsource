package com.usebutton.sdk.purchasepath;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.UUID;

public abstract class Card {
    public static final float DEFAULT_TEXT_SIZE_BODY = 13.0f;
    public static final float DEFAULT_TEXT_SIZE_TITLE = 16.0f;
    private WeakReference<BrowserInterface> browserWeakReference = new WeakReference<>((Object) null);
    private CallToAction callToAction;
    private Object key;
    private String uniqueId;
    private WeakReference<View> viewWeakReference = new WeakReference<>((Object) null);

    public Card(CallToAction callToAction2) {
        this.callToAction = callToAction2;
        this.uniqueId = UUID.randomUUID().toString();
    }

    public final void bindView(View view) {
        this.viewWeakReference = new WeakReference<>(view);
        onBindView(view);
    }

    public final View createView(ViewGroup viewGroup) {
        return onCreateView(viewGroup);
    }

    public boolean equals(Object obj) {
        Object obj2 = this.key;
        if (obj2 == null || obj == null || !(obj instanceof Card)) {
            return false;
        }
        return obj2.equals(((Card) obj).key);
    }

    public final BrowserInterface getBrowser() {
        return this.browserWeakReference.get();
    }

    public CallToAction getCallToAction() {
        return this.callToAction;
    }

    public Object getKey() {
        return this.key;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public final View getView() {
        return this.viewWeakReference.get();
    }

    public int hashCode() {
        Object obj = this.key;
        if (obj == null) {
            return -1;
        }
        return obj.hashCode();
    }

    public abstract void onBindView(View view);

    public abstract View onCreateView(ViewGroup viewGroup);

    public final void setBrowser(BrowserInterface browserInterface) {
        this.browserWeakReference = new WeakReference<>(browserInterface);
    }

    public void setKey(Object obj) {
        this.key = obj;
    }
}
