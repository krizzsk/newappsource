package com.moovit.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textview.MaterialTextView;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p977zz.C20943i;

public class AnimationDrawableTextView extends MaterialTextView {
    public AnimationDrawableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15075b(this)) {
            mo24674f(true);
        }
    }

    /* renamed from: e */
    public final void mo24673e(Drawable drawable, boolean z) {
        if (!(drawable instanceof AnimationDrawable)) {
            Drawable current = drawable.getCurrent();
            if (current != null && drawable != current) {
                mo24673e(current, z);
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

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public final void mo24674f(boolean z) {
        Drawable background = getBackground();
        if (background != null) {
            mo24673e(background, z);
        }
        int i = 0;
        if (C20943i.m49051d(17)) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            int length = compoundDrawablesRelative.length;
            while (i < length) {
                Drawable drawable = compoundDrawablesRelative[i];
                if (drawable != null) {
                    mo24673e(drawable, z);
                }
                i++;
            }
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        int length2 = compoundDrawables.length;
        while (i < length2) {
            Drawable drawable2 = compoundDrawables[i];
            if (drawable2 != null) {
                mo24673e(drawable2, z);
            }
            i++;
        }
    }

    @SuppressLint({"NewApi"})
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo24674f(true);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo24674f(false);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15075b(this)) {
            mo24674f(true);
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15075b(this)) {
            mo24674f(true);
        }
    }

    public AnimationDrawableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
