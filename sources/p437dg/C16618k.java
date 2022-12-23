package p437dg;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p359ag.C13458o;
import p359ag.C13459p;
import p509gg.C17189a;

/* renamed from: dg.k */
public final class C16618k extends C13458o<Date> {

    /* renamed from: b */
    public static final C16619a f43295b = new C16619a();

    /* renamed from: a */
    public final SimpleDateFormat f43296a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: dg.k$a */
    public class C16619a implements C13459p {
        /* renamed from: a */
        public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
            if (aVar.f44431a == Date.class) {
                return new C16618k();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final Object mo40320a(JsonReader jsonReader) throws IOException {
        Date date;
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                date = null;
            } else {
                try {
                    date = new Date(this.f43296a.parse(jsonReader.nextString()).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException((Exception) e);
                }
            }
        }
        return date;
    }

    /* renamed from: b */
    public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        synchronized (this) {
            if (date == null) {
                str = null;
            } else {
                str = this.f43296a.format(date);
            }
            jsonWriter.value(str);
        }
    }
}
