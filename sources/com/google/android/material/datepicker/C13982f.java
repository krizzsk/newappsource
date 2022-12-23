package com.google.android.material.datepicker;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.f */
public final class C13982f {
    /* renamed from: a */
    public static String m34902a(long j) {
        Calendar h = C13979d0.m34898h();
        Calendar i = C13979d0.m34899i((Calendar) null);
        i.setTimeInMillis(j);
        if (h.get(1) == i.get(1)) {
            return m34903b(j, Locale.getDefault());
        }
        return m34905d(j, Locale.getDefault());
    }

    /* renamed from: b */
    public static String m34903b(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C13979d0.m34893c("MMMd", locale).format(new Date(j));
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) C13979d0.m34895e(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int b = C13979d0.m34892b(1, 0, pattern, "yY");
        if (b < pattern.length()) {
            String str = "EMd";
            int b2 = C13979d0.m34892b(1, b, pattern, str);
            if (b2 < pattern.length()) {
                str = "EMd,";
            }
            pattern = pattern.replace(pattern.substring(C13979d0.m34892b(-1, b, pattern, str) + 1, b2), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j));
    }

    /* renamed from: c */
    public static String m34904c(long j) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            return C13979d0.m34893c("MMMEd", locale).format(new Date(j));
        }
        return C13979d0.m34895e(0, locale).format(new Date(j));
    }

    /* renamed from: d */
    public static String m34905d(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C13979d0.m34893c("yMMMd", locale).format(new Date(j));
        }
        return C13979d0.m34895e(2, locale).format(new Date(j));
    }

    /* renamed from: e */
    public static String m34906e(long j) {
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            return C13979d0.m34893c("yMMMEd", locale).format(new Date(j));
        }
        return C13979d0.m34895e(0, locale).format(new Date(j));
    }
}
