package com.appboy.support;

import androidx.annotation.Keep;
import com.braze.enums.BrazeDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import p988j$.util.DesugarTimeZone;

@Keep
public final class DateTimeUtils {
    public static final String TAG = AppboyLogger.getBrazeLogTag(DateTimeUtils.class);
    public static final TimeZone UTC_TIME_ZONE = DesugarTimeZone.getTimeZone("UTC");

    public static Date createDate(int i, int i2, int i3) {
        return createDate(i, i2, i3, 0, 0, 0);
    }

    public static String formatDate(Date date, BrazeDateFormat brazeDateFormat) {
        return formatDate(date, brazeDateFormat, UTC_TIME_ZONE);
    }

    public static String formatDateNow(BrazeDateFormat brazeDateFormat) {
        return formatDate(createDate(nowInSeconds()), brazeDateFormat, TimeZone.getDefault());
    }

    public static long getTimeFromEpochInSeconds(Date date) {
        return date.getTime() / 1000;
    }

    public static boolean isValidTimeZone(String str) {
        if (!StringUtils.isNullOrBlank(str)) {
            for (String equals : TimeZone.getAvailableIDs()) {
                if (equals.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long nowInMilliseconds() {
        return System.currentTimeMillis();
    }

    public static long nowInSeconds() {
        return System.currentTimeMillis() / 1000;
    }

    public static double nowInSecondsPrecise() {
        return ((double) System.currentTimeMillis()) / 1000.0d;
    }

    public static Date parseDate(String str, BrazeDateFormat brazeDateFormat) {
        if (StringUtils.isNullOrBlank(str)) {
            String str2 = TAG;
            AppboyLogger.m5459w(str2, "Null or blank date string received: " + str);
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(UTC_TIME_ZONE);
        try {
            return simpleDateFormat.parse(str);
        } catch (Exception e) {
            String str3 = TAG;
            AppboyLogger.m5452e(str3, "Exception parsing date " + str + ". Returning null", e);
            return null;
        }
    }

    public static Date createDate(int i, int i2, int i3, int i4, int i5, int i6) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(i, i2, i3, i4, i5, i6);
        gregorianCalendar.setTimeZone(UTC_TIME_ZONE);
        return gregorianCalendar.getTime();
    }

    public static String formatDate(Date date, BrazeDateFormat brazeDateFormat, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(brazeDateFormat.getFormat(), Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(date);
    }

    public static Date createDate(long j) {
        return new Date(j * 1000);
    }
}
