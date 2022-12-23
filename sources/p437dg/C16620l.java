package p437dg;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p359ag.C13458o;
import p359ag.C13459p;
import p509gg.C17189a;

/* renamed from: dg.l */
public final class C16620l extends C13458o<Time> {

    /* renamed from: b */
    public static final C16621a f43297b = new C16621a();

    /* renamed from: a */
    public final SimpleDateFormat f43298a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: dg.l$a */
    public class C16621a implements C13459p {
        /* renamed from: a */
        public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
            if (aVar.f44431a == Time.class) {
                return new C16620l();
            }
            return null;
        }
    }

    /* renamed from: a */
    public final Object mo40320a(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                Time time = new Time(this.f43298a.parse(jsonReader.nextString()).getTime());
                return time;
            } catch (ParseException e) {
                throw new JsonSyntaxException((Exception) e);
            }
        }
    }

    /* renamed from: b */
    public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        synchronized (this) {
            if (time == null) {
                str = null;
            } else {
                str = this.f43298a.format(time);
            }
            jsonWriter.value(str);
        }
    }
}
