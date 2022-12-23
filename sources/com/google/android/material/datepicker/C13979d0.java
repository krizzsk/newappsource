package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p355ac.C13409j;
import p988j$.util.DesugarTimeZone;

/* renamed from: com.google.android.material.datepicker.d0 */
public final class C13979d0 {

    /* renamed from: a */
    public static AtomicReference<C13977c0> f34691a = new AtomicReference<>();

    /* renamed from: a */
    public static long m34891a(long j) {
        Calendar i = m34899i((Calendar) null);
        i.setTimeInMillis(j);
        return m34894d(i).getTimeInMillis();
    }

    /* renamed from: b */
    public static int m34892b(int i, int i2, String str, String str2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0) {
                        break;
                    } else if (i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) == '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    /* renamed from: c */
    public static DateFormat m34893c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    /* renamed from: d */
    public static Calendar m34894d(Calendar calendar) {
        Calendar i = m34899i(calendar);
        Calendar i2 = m34899i((Calendar) null);
        i2.set(i.get(1), i.get(2), i.get(5));
        return i2;
    }

    /* renamed from: e */
    public static java.text.DateFormat m34895e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return dateInstance;
    }

    /* renamed from: f */
    public static SimpleDateFormat m34896f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: g */
    public static String m34897g(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C13409j.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(C13409j.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(C13409j.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: h */
    public static Calendar m34898h() {
        Calendar calendar;
        C13977c0 c0Var = f34691a.get();
        if (c0Var == null) {
            c0Var = C13977c0.f34686c;
        }
        java.util.TimeZone timeZone = c0Var.f34688b;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l = c0Var.f34687a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: i */
    public static Calendar m34899i(Calendar calendar) {
        Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
