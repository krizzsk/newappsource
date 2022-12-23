package com.moovit.util.time;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import com.moovit.util.time.MinutesSpanFormatter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p001a0.C0016g;
import p824tp.C19744v;
import p824tp.C19746x;
import p977zz.C20964s0;

/* renamed from: com.moovit.util.time.b */
public final class C7925b {

    /* renamed from: a */
    public static final SimpleDateFormat f23934a = new SimpleDateFormat("dd/MM/yy HH:mm:ss.SSS", Locale.ENGLISH);

    /* renamed from: b */
    public static final MinutesSpanFormatter f23935b = new MinutesSpanFormatter(MinutesSpanFormatter.SpanSystem.REGULAR);

    /* renamed from: c */
    public static final MinutesSpanFormatter f23936c = new MinutesSpanFormatter(MinutesSpanFormatter.SpanSystem.ACTIVE);

    /* renamed from: d */
    public static final MinutesSpanFormatter f23937d = new MinutesSpanFormatter(MinutesSpanFormatter.SpanSystem.PASSIVE);

    /* renamed from: a */
    public static String m18013a(long j) {
        return f23934a.format(new Date(j));
    }

    /* renamed from: b */
    public static long m18014b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: c */
    public static String m18015c(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 98330);
    }

    /* renamed from: d */
    public static String m18016d(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 100891);
    }

    /* renamed from: e */
    public static String m18017e(Context context, long j) {
        if (DateUtils.isToday(j)) {
            return context.getString(C19746x.today);
        }
        if (m18029q(j)) {
            return context.getString(C19746x.tomorrow);
        }
        if (DateUtils.isToday(86400000 + j)) {
            return context.getString(C19746x.yesterday);
        }
        return m18015c(context, j);
    }

    /* renamed from: f */
    public static String m18018f(Context context, long j, boolean z) {
        boolean isToday = DateUtils.isToday(j);
        if (isToday && !z) {
            return m18024l(context, j);
        }
        String str = null;
        if (isToday) {
            str = context.getString(C19746x.today);
        }
        if (m18029q(j)) {
            str = context.getString(C19746x.tomorrow);
        }
        if (DateUtils.isToday(86400000 + j)) {
            str = context.getString(C19746x.yesterday);
        }
        if (str == null) {
            return m18016d(context, j);
        }
        StringBuilder t = C0016g.m36t(str, ", ");
        t.append(m18024l(context, j));
        return t.toString();
    }

    /* renamed from: g */
    public static String m18019g(Context context, long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(j);
        long millis = j - TimeUnit.DAYS.toMillis(days);
        long hours = timeUnit.toHours(millis);
        long minutes = timeUnit.toMinutes(millis - TimeUnit.HOURS.toMillis(hours));
        if (days > 0) {
            return context.getString(C19746x.units_days_hours, new Object[]{Long.valueOf(days), Long.valueOf(hours)});
        } else if (hours <= 0) {
            return context.getString(C19746x.units_min, new Object[]{Long.valueOf(minutes)});
        } else if (minutes > 0) {
            return context.getString(C19746x.units_hours_min, new Object[]{Long.valueOf(hours), Long.valueOf(minutes)});
        } else {
            return context.getString(C19746x.units_hour, new Object[]{Long.valueOf(hours)});
        }
    }

    /* renamed from: h */
    public static CharSequence m18020h(Context context, long j) {
        Resources resources = context.getResources();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int days = (int) timeUnit.toDays(j);
        long millis = j - TimeUnit.DAYS.toMillis((long) days);
        int hours = (int) timeUnit.toHours(millis);
        int minutes = (int) timeUnit.toMinutes(millis - TimeUnit.HOURS.toMillis((long) hours));
        if (days > 0) {
            if (hours > 0) {
                return C20964s0.m49097o(" ", resources.getQuantityString(C19744v.voice_over_unit_days, days, new Object[]{Integer.valueOf(days)}), resources.getQuantityString(C19744v.voice_over_unit_hours, hours, new Object[]{Integer.valueOf(hours)}));
            }
            return resources.getQuantityString(C19744v.voice_over_unit_days, days, new Object[]{Integer.valueOf(days)});
        } else if (hours <= 0) {
            return resources.getQuantityString(C19744v.voice_over_unit_minutes, minutes, new Object[]{Integer.valueOf(minutes)});
        } else if (minutes > 0) {
            return C20964s0.m49097o(" ", resources.getQuantityString(C19744v.voice_over_unit_hours, hours, new Object[]{Integer.valueOf(hours)}), resources.getQuantityString(C19744v.voice_over_unit_minutes, minutes, new Object[]{Integer.valueOf(minutes)}));
        } else {
            return resources.getQuantityString(C19744v.voice_over_unit_hours, hours, new Object[]{Integer.valueOf(hours)});
        }
    }

    /* renamed from: i */
    public static String m18021i(Context context, long j) {
        if (j >= 604800000) {
            int i = (int) (j / 604800000);
            return context.getString(C19746x.unit_weeks_very_short, new Object[]{Integer.valueOf(i)});
        } else if (j >= 86400000) {
            int i2 = (int) (j / 86400000);
            return context.getString(C19746x.unit_days_very_short, new Object[]{Integer.valueOf(i2)});
        } else if (j >= 3600000) {
            int i3 = (int) (j / 3600000);
            return context.getString(C19746x.unit_hours_very_short, new Object[]{Integer.valueOf(i3)});
        } else if (j >= 60000) {
            int i4 = (int) (j / 60000);
            return context.getString(C19746x.unit_minutes_very_short, new Object[]{Integer.valueOf(i4)});
        } else {
            return context.getString(C19746x.unit_minutes_very_short, new Object[]{1});
        }
    }

    /* renamed from: j */
    public static String m18022j(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 131092);
    }

    /* renamed from: k */
    public static String m18023k(Context context, long j) {
        return m18022j(context, j) + ", " + m18024l(context, j);
    }

    /* renamed from: l */
    public static String m18024l(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 2561);
    }

    /* renamed from: m */
    public static String m18025m(Context context, long j, long j2) {
        return m18024l(context, j) + Character.toString(8211) + m18024l(context, j2);
    }

    /* renamed from: n */
    public static long m18026n(long j, long j2) {
        return TimeUnit.MINUTES.convert(j2 - j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: o */
    public static boolean m18027o(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        return m18028p(instance, instance2);
    }

    /* renamed from: p */
    public static boolean m18028p(Calendar calendar, Calendar calendar2) {
        if (calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m18029q(long j) {
        long j2 = j - 86400000;
        return j2 >= 0 && DateUtils.isToday(j2);
    }
}
