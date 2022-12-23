package com.veriff.sdk.internal;

import android.graphics.Color;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import p129j1.C5348a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0006H\u0003\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo59060d2 = {"DEFAULT_SECONDARY_BACKGROUND_COLOR", "", "DEFAULT_SEPARATOR_COLOR", "MAX_ALPHA", "darken", "darkenBy", "", "lighten", "lightenBy", "withAlpha", "alphaFactor", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xp */
public final class C22699xp {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int f57378a = Color.parseColor("#e6ebf4");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final int f57379b = Color.parseColor("#fafafc");

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final int m55355d(int i, float f) {
        return Color.argb((int) (f * ((float) ValidationUtils.APPBOY_STRING_MAX_LENGTH)), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final int m55356e(int i, float f) {
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        ThreadLocal<double[]> threadLocal = C5348a.f17644a;
        C5348a.m13406b(Color.red(i), Color.green(i), Color.blue(i), fArr);
        fArr[2] = fArr[2] + f;
        return C5348a.m13405a(fArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final int m55357f(int i, float f) {
        return m55356e(i, -f);
    }
}
