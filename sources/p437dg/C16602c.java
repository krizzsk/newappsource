package p437dg;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p359ag.C13458o;
import p359ag.C13459p;
import p406cg.C13819h;
import p461eg.C16819a;
import p509gg.C17189a;
import p626lf.C18201b;

/* renamed from: dg.c */
public final class C16602c extends C13458o<Date> {

    /* renamed from: b */
    public static final C16603a f43256b = new C16603a();

    /* renamed from: a */
    public final ArrayList f43257a;

    /* renamed from: dg.c$a */
    public class C16603a implements C13459p {
        /* renamed from: a */
        public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
            if (aVar.f44431a == Date.class) {
                return new C16602c();
            }
            return null;
        }
    }

    public C16602c() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.f43257a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C13819h.f34016a >= 9) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(C18201b.m44921r(2, 2));
        }
    }

    /* renamed from: a */
    public final Object mo40320a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this) {
            Iterator it = this.f43257a.iterator();
            while (it.hasNext()) {
                try {
                    Date parse = ((DateFormat) it.next()).parse(nextString);
                    return parse;
                } catch (ParseException unused) {
                }
            }
            try {
                Date b = C16819a.m42598b(nextString, new ParsePosition(0));
                return b;
            } catch (ParseException e) {
                throw new JsonSyntaxException(nextString, e);
            }
        }
    }

    /* renamed from: b */
    public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(((DateFormat) this.f43257a.get(0)).format(date));
            }
        }
    }
}
