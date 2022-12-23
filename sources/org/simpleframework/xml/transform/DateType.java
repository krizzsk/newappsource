package org.simpleframework.xml.transform;

import java.text.SimpleDateFormat;
import java.util.Date;

enum DateType {
    FULL("yyyy-MM-dd HH:mm:ss.S z"),
    LONG("yyyy-MM-dd HH:mm:ss z"),
    NORMAL("yyyy-MM-dd z"),
    SHORT("yyyy-MM-dd");
    
    private C24677a format;

    /* renamed from: org.simpleframework.xml.transform.DateType$a */
    public static class C24677a {

        /* renamed from: a */
        public SimpleDateFormat f62476a;

        public C24677a(String str) {
            this.f62476a = new SimpleDateFormat(str);
        }
    }

    private DateType(String str) {
        this.format = new C24677a(str);
    }

    public static Date getDate(String str) throws Exception {
        Date parse;
        C24677a format2 = getType(str).getFormat();
        synchronized (format2) {
            parse = format2.f62476a.parse(str);
        }
        return parse;
    }

    private C24677a getFormat() {
        return this.format;
    }

    public static String getText(Date date) throws Exception {
        String format2;
        C24677a format3 = FULL.getFormat();
        synchronized (format3) {
            format2 = format3.f62476a.format(date);
        }
        return format2;
    }

    public static DateType getType(String str) {
        int length = str.length();
        if (length > 23) {
            return FULL;
        }
        if (length > 20) {
            return LONG;
        }
        if (length > 11) {
            return NORMAL;
        }
        return SHORT;
    }
}
