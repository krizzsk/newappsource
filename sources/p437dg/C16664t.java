package p437dg;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p359ag.C13458o;
import p359ag.C13459p;
import p509gg.C17189a;

/* renamed from: dg.t */
public final class C16664t implements C13459p {

    /* renamed from: b */
    public final /* synthetic */ Class f43359b;

    /* renamed from: c */
    public final /* synthetic */ C13458o f43360c;

    /* renamed from: dg.t$a */
    public class C16665a extends C13458o<Object> {

        /* renamed from: a */
        public final /* synthetic */ Class f43361a;

        public C16665a(Class cls) {
            this.f43361a = cls;
        }

        /* renamed from: a */
        public final Object mo40320a(JsonReader jsonReader) throws IOException {
            Object a = C16664t.this.f43360c.mo40320a(jsonReader);
            if (a == null || this.f43361a.isInstance(a)) {
                return a;
            }
            StringBuilder k = C13555b.m33972k("Expected a ");
            k.append(this.f43361a.getName());
            k.append(" but was ");
            k.append(a.getClass().getName());
            throw new JsonSyntaxException(k.toString());
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, Object obj) throws IOException {
            C16664t.this.f43360c.mo40321b(jsonWriter, obj);
        }
    }

    public C16664t(Class cls, C13458o oVar) {
        this.f43359b = cls;
        this.f43360c = oVar;
    }

    /* renamed from: a */
    public final <T2> C13458o<T2> mo40360a(Gson gson, C17189a<T2> aVar) {
        Class<? super T> cls = aVar.f44431a;
        if (!this.f43359b.isAssignableFrom(cls)) {
            return null;
        }
        return new C16665a(cls);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Factory[typeHierarchy=");
        C13715c.m34249o(this.f43359b, k, ",adapter=");
        k.append(this.f43360c);
        k.append("]");
        return k.toString();
    }
}
