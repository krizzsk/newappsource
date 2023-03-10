package com.appsflyer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p988j$.util.DesugarTimeZone;

public class AFDateFormat {
    public static String dateFormatUTC(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j));
    }

    public static SimpleDateFormat getDataFormatter(String str) {
        return new SimpleDateFormat(str, Locale.US);
    }
}
