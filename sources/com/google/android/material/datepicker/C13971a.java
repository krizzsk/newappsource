package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import mf0.C24361g;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13411l;
import p742qc.C19099c;
import p811tc.C19648g;
import p811tc.C19654k;

/* renamed from: com.google.android.material.datepicker.a */
public final class C13971a {

    /* renamed from: a */
    public final Rect f34668a;

    /* renamed from: b */
    public final ColorStateList f34669b;

    /* renamed from: c */
    public final ColorStateList f34670c;

    /* renamed from: d */
    public final ColorStateList f34671d;

    /* renamed from: e */
    public final int f34672e;

    /* renamed from: f */
    public final C19654k f34673f;

    public C13971a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C19654k kVar, Rect rect) {
        C24361g.m61181q(rect.left);
        C24361g.m61181q(rect.top);
        C24361g.m61181q(rect.right);
        C24361g.m61181q(rect.bottom);
        this.f34668a = rect;
        this.f34669b = colorStateList2;
        this.f34670c = colorStateList;
        this.f34671d = colorStateList3;
        this.f34672e = i;
        this.f34673f = kVar;
    }

    /* renamed from: a */
    public static C13971a m34886a(int i, Context context) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61177o(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C13411l.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C13411l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C13411l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C13411l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C13411l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = C19099c.m46247a(context, obtainStyledAttributes, C13411l.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = C19099c.m46247a(context, obtainStyledAttributes, C13411l.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = C19099c.m46247a(context, obtainStyledAttributes, C13411l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C13411l.MaterialCalendarItem_itemStrokeWidth, 0);
        C19654k kVar = new C19654k(C19654k.m47122a(context, obtainStyledAttributes.getResourceId(C13411l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C13411l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)));
        obtainStyledAttributes.recycle();
        return new C13971a(a, a2, a3, dimensionPixelSize, kVar, rect);
    }

    /* renamed from: b */
    public final void mo41551b(TextView textView) {
        C19648g gVar = new C19648g();
        C19648g gVar2 = new C19648g();
        gVar.setShapeAppearanceModel(this.f34673f);
        gVar2.setShapeAppearanceModel(this.f34673f);
        gVar.mo52005n(this.f34670c);
        ColorStateList colorStateList = this.f34671d;
        gVar.f49837b.f49871k = (float) this.f34672e;
        gVar.invalidateSelf();
        gVar.mo52011s(colorStateList);
        textView.setTextColor(this.f34669b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f34669b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f34668a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15057q(textView, insetDrawable);
    }
}
