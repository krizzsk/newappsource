package com.moovit.design.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import com.moovit.commons.utils.UiUtils;
import p090g1.C4732a;
import p883wc.C20289a;
import p977zz.C20941h;
import w00.C20261b;
import w00.C20263d;
import w00.C20264e;
import w00.C20266g;
import w00.C20267h;

public class ProgressView extends LinearLayout {

    /* renamed from: c */
    public static final int f41376c = C20266g.Widget_Moovit_ProgressView;

    /* renamed from: b */
    public final TextView f41377b;

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C20261b.progressViewStyle);
    }

    public void setResourceTextColor(int i) {
        ColorStateList colorStateList = C4732a.getColorStateList(getContext(), i);
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setText(int i) {
        UiUtils.m40233A(this.f41377b, i);
    }

    public void setTextAppearance(int i) {
        C0801k.m2424f(this.f41377b, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f41377b.setTextColor(colorStateList);
    }

    public void setThemeTextAppearance(int i) {
        setTextAppearance(C20941h.m49047j(i, getContext()));
    }

    public void setThemeTextColor(int i) {
        ColorStateList g = C20941h.m49044g(i, getContext());
        if (g != null) {
            setTextColor(g);
        }
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, f41376c), attributeSet, i);
        Context context2 = getContext();
        setOrientation(1);
        setGravity(17);
        LayoutInflater.from(context2).inflate(C20264e.progress_view, this, true);
        ProgressBar progressBar = (ProgressBar) findViewById(C20263d.progress_bar);
        this.f41377b = (TextView) findViewById(C20263d.text);
        TypedArray o = UiUtils.m40256o(context2, attributeSet, C20267h.ProgressView, i);
        try {
            int resourceId = o.getResourceId(C20267h.ProgressView_textAppearance, -1);
            if (resourceId != -1) {
                setTextAppearance(resourceId);
            }
            ColorStateList b = C20941h.m49039b(context2, o, C20267h.ProgressView_textColor);
            if (b != null) {
                setTextColor(b);
            }
            setText(o.getText(C20267h.ProgressView_android_text));
        } finally {
            o.recycle();
        }
    }

    public void setText(CharSequence charSequence) {
        UiUtils.m40234B(this.f41377b, charSequence);
    }

    public void setTextColor(int i) {
        setTextColor(ColorStateList.valueOf(i));
    }
}
