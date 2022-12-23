package com.google.android.exoplayer2.p052ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import p126ib.C5332a;

/* renamed from: com.google.android.exoplayer2.ui.b0 */
public final class C4030b0 {
    /* renamed from: a */
    public static void m10908a(C5332a.C5333a aVar) {
        boolean z;
        aVar.f17616k = -3.4028235E38f;
        aVar.f17615j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f17606a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f17606a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f17606a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* renamed from: b */
    public static float m10909b(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = (float) i3;
        } else if (i == 1) {
            f2 = (float) i2;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f;
        }
        return f * f2;
    }
}
