package p437dg;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p359ag.C13458o;
import p437dg.C16615j;
import p509gg.C17189a;

/* renamed from: dg.n */
public final class C16625n<T> extends C13458o<T> {

    /* renamed from: a */
    public final Gson f43311a;

    /* renamed from: b */
    public final C13458o<T> f43312b;

    /* renamed from: c */
    public final Type f43313c;

    public C16625n(Gson gson, C13458o<T> oVar, Type type) {
        this.f43311a = gson;
        this.f43312b = oVar;
        this.f43313c = type;
    }

    /* renamed from: a */
    public final T mo40320a(JsonReader jsonReader) throws IOException {
        return this.f43312b.mo40320a(jsonReader);
    }

    /* renamed from: b */
    public final void mo40321b(JsonWriter jsonWriter, T t) throws IOException {
        C13458o<T> oVar = this.f43312b;
        Type type = this.f43313c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f43313c) {
            oVar = this.f43311a.getAdapter(new C17189a(type));
            if (oVar instanceof C16615j.C16616a) {
                C13458o<T> oVar2 = this.f43312b;
                if (!(oVar2 instanceof C16615j.C16616a)) {
                    oVar = oVar2;
                }
            }
        }
        oVar.mo40321b(jsonWriter, t);
    }
}
