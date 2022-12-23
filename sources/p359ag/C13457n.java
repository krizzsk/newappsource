package p359ag;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: ag.n */
public final class C13457n extends C13458o<Object> {

    /* renamed from: a */
    public final /* synthetic */ C13458o f33308a;

    public C13457n(C13458o oVar) {
        this.f33308a = oVar;
    }

    /* renamed from: a */
    public final Object mo40320a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return this.f33308a.mo40320a(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }

    /* renamed from: b */
    public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.f33308a.mo40321b(jsonWriter, obj);
        }
    }
}
