package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p127j.C5344a;
import p355ac.C13411l;

public class TabItem extends View {

    /* renamed from: b */
    public final CharSequence f35369b;

    /* renamed from: c */
    public final Drawable f35370c;

    /* renamed from: d */
    public final int f35371d;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13411l.TabItem);
        this.f35369b = obtainStyledAttributes.getText(C13411l.TabItem_android_text);
        int i = C13411l.TabItem_android_icon;
        if (!obtainStyledAttributes.hasValue(i) || (resourceId = obtainStyledAttributes.getResourceId(i, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i);
        } else {
            drawable = C5344a.m13397a(context, resourceId);
        }
        this.f35370c = drawable;
        this.f35371d = obtainStyledAttributes.getResourceId(C13411l.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
