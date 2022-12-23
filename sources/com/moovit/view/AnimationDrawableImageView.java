package com.moovit.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class AnimationDrawableImageView extends AppCompatImageView {
    public AnimationDrawableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public final void mo24668c(Drawable drawable, boolean z) {
        if (!(drawable instanceof AnimationDrawable)) {
            Drawable current = drawable.getCurrent();
            if (current != null && drawable != current) {
                mo24668c(current, z);
                return;
            }
            return;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        if (z) {
            animationDrawable.start();
        } else {
            animationDrawable.stop();
        }
    }

    /* renamed from: d */
    public final void mo24669d(boolean z) {
        Drawable background = getBackground();
        if (background != null) {
            mo24668c(background, z);
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            mo24668c(drawable, z);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15075b(this)) {
            mo24669d(true);
        }
    }

    public final void invalidate() {
        super.invalidate();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        mo24669d(C6333d0.C6340g.m15075b(this));
    }

    @SuppressLint({"NewApi"})
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo24669d(true);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo24669d(false);
    }

    public AnimationDrawableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
