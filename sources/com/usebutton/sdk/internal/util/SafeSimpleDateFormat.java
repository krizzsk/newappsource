package com.usebutton.sdk.internal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

class SafeSimpleDateFormat {
    public static final String ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSZZZ";
    private SimpleDateFormat formatter;

    public SafeSimpleDateFormat() {
        try {
            init();
        } catch (UnsupportedOperationException unused) {
            ButtonLog.visible("Unable to create date formatter; reverting to UTC offset.");
        }
    }

    public String format(Date date) {
        SimpleDateFormat simpleDateFormat = this.formatter;
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(date);
        }
        return String.valueOf(date.getTime());
    }

    public void init() throws UnsupportedOperationException {
        this.formatter = new SimpleDateFormat(ISO_8601, Locale.US);
    }

    public Date parse(String str) throws ParseException {
        SimpleDateFormat simpleDateFormat = this.formatter;
        if (simpleDateFormat != null) {
            return simpleDateFormat.parse(str);
        }
        throw new ParseException(str, 0);
    }

    public void setTimeZone(TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = this.formatter;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
    }
}
