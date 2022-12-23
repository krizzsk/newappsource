package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p355ac.C13401b;
import p355ac.C13411l;
import p742qc.C19098b;
import p742qc.C19099c;

/* renamed from: com.google.android.material.datepicker.b */
public final class C13973b {

    /* renamed from: a */
    public final C13971a f34676a;

    /* renamed from: b */
    public final C13971a f34677b;

    /* renamed from: c */
    public final C13971a f34678c;

    /* renamed from: d */
    public final C13971a f34679d;

    /* renamed from: e */
    public final C13971a f34680e;

    /* renamed from: f */
    public final C13971a f34681f;

    /* renamed from: g */
    public final C13971a f34682g;

    /* renamed from: h */
    public final Paint f34683h;

    public C13973b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C19098b.m46246b(context, C13401b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C13411l.MaterialCalendar);
        this.f34676a = C13971a.m34886a(obtainStyledAttributes.getResourceId(C13411l.MaterialCalendar_dayStyle, 0), context);
        this.f34682g = C13971a.m34886a(obtainStyledAttributes.getResourceId(C13411l.MaterialCalendar_dayInvalidStyle, 0), context);
        this.f34677b = C13971a.m34886a(obtainStyledAttributes.getResourceId(C13411l.MaterialCalendar_daySelectedStyle, 0), context);
        this.f34678c = C13971a.m34886a(obtainStyledAttributes.getResourceId(C13411l.MaterialCalendar_dayTodayStyle, 0), context);
        ColorStateList a = C19099c.m46247a(context, obtainStyledAttributes, C13411l.MaterialCalendar_rangeFillColor);
        this.f34679d = C13971a.m34886a(obtainStyledAttributes.getResourceId(C13411l.MaterialCalendar_yearStyle, 0), context);
        this.f34680e = C13971a.m34886a(obtainStyledAttributes.getResourceId(C13411l.MaterialCalendar_yearSelectedStyle, 0), context);
        this.f34681f = C13971a.m34886a(obtainStyledAttributes.getResourceId(C13411l.MaterialCalendar_yearTodayStyle, 0), context);
        Paint paint = new Paint();
        this.f34683h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
