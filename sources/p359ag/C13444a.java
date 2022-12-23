package p359ag;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p406cg.C13819h;
import p461eg.C16819a;
import p626lf.C18201b;

/* renamed from: ag.a */
public final class C13444a extends C13458o<Date> {

    /* renamed from: a */
    public final Class<? extends Date> f33302a;

    /* renamed from: b */
    public final ArrayList f33303b;

    public C13444a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f33303b = arrayList;
        m33724c(cls);
        this.f33302a = cls;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: c */
    public static void m33724c(Class cls) {
        if (cls != Date.class && cls != java.sql.Date.class && cls != Timestamp.class) {
            throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
        }
    }

    /* renamed from: a */
    public final Object mo40320a(JsonReader jsonReader) throws IOException {
        Date date;
        Object date2;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this.f33303b) {
            Iterator it = this.f33303b.iterator();
            while (it.hasNext()) {
                try {
                    date = ((DateFormat) it.next()).parse(nextString);
                    break;
                } catch (ParseException unused) {
                }
            }
            try {
                date = C16819a.m42598b(nextString, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(nextString, e);
            }
        }
        Class<? extends Date> cls = this.f33302a;
        if (cls == Date.class) {
            return date;
        }
        if (cls == Timestamp.class) {
            date2 = new Timestamp(date.getTime());
        } else if (cls == java.sql.Date.class) {
            date2 = new java.sql.Date(date.getTime());
        } else {
            throw new AssertionError();
        }
        return date2;
    }

    /* renamed from: b */
    public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f33303b) {
            jsonWriter.value(((DateFormat) this.f33303b.get(0)).format(date));
        }
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f33303b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder k = C13555b.m33972k("DefaultDateTypeAdapter(");
            k.append(((SimpleDateFormat) dateFormat).toPattern());
            k.append(')');
            return k.toString();
        }
        StringBuilder k2 = C13555b.m33972k("DefaultDateTypeAdapter(");
        k2.append(dateFormat.getClass().getSimpleName());
        k2.append(')');
        return k2.toString();
    }

    public C13444a(int i, int i2, Class cls) {
        ArrayList arrayList = new ArrayList();
        this.f33303b = arrayList;
        m33724c(cls);
        this.f33302a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C13819h.f34016a >= 9) {
            arrayList.add(C18201b.m44921r(i, i2));
        }
    }
}
