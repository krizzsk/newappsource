package com.amazonaws.util.json;

import com.amazonaws.util.DateUtils;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import p359ag.C13448e;
import p359ag.C13449f;
import p359ag.C13450g;
import p359ag.C13454k;
import p359ag.C13455l;
import p359ag.C13456m;

public class DateDeserializer implements C13449f<Date>, C13456m<Date> {
    private final List<String> dateFormats;
    private final SimpleDateFormat mIso8601DateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN);
    private SimpleDateFormat mSimpleDateFormat;

    public DateDeserializer(String[] strArr) {
        this.dateFormats = Arrays.asList(strArr);
    }

    public Date deserialize(C13450g gVar, Type type, C13448e eVar) {
        String B = gVar.mo40326B();
        for (String next : this.dateFormats) {
            try {
                Date date = new Date();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(next);
                this.mSimpleDateFormat = simpleDateFormat;
                date.setTime(simpleDateFormat.parse(B).getTime());
                return date;
            } catch (ParseException unused) {
            }
        }
        try {
            return DateFormat.getDateInstance(2).parse(B);
        } catch (ParseException e) {
            throw new JsonParseException(e.getMessage(), e);
        }
    }

    public C13450g serialize(Date date, Type type, C13455l lVar) {
        C13454k kVar;
        synchronized (this.mIso8601DateFormat) {
            kVar = new C13454k(this.mIso8601DateFormat.format(date));
        }
        return kVar;
    }
}
