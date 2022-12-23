package com.veriff.sdk.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.veriff.sdk.internal.bw */
class C21490bw implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final WeakReference<ImageView> f54056a;

    /* renamed from: c */
    private final C21528cm f54057c;

    public C21490bw(C21528cm cmVar, ImageView imageView, C21487bt btVar) {
        this.f54057c = cmVar;
        this.f54056a = new WeakReference<>(imageView);
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* renamed from: a */
    public void mo54440a() {
        this.f54057c.mo54529b();
        ImageView imageView = this.f54056a.get();
        if (imageView != null) {
            this.f54056a.clear();
            imageView.removeOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = this.f54056a.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f54056a.clear();
            this.f54057c.mo54524a().mo54526a(width, height).mo54528a(imageView, (C21487bt) null);
        }
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
