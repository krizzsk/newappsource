package p437dg;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import p359ag.C13458o;
import p437dg.C16615j;
import p509gg.C17189a;

/* renamed from: dg.i */
public final class C16614i extends C16615j.C16617b {

    /* renamed from: d */
    public final /* synthetic */ Field f43279d;

    /* renamed from: e */
    public final /* synthetic */ boolean f43280e;

    /* renamed from: f */
    public final /* synthetic */ C13458o f43281f;

    /* renamed from: g */
    public final /* synthetic */ Gson f43282g;

    /* renamed from: h */
    public final /* synthetic */ C17189a f43283h;

    /* renamed from: i */
    public final /* synthetic */ boolean f43284i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16614i(String str, boolean z, boolean z2, Field field, boolean z3, C13458o oVar, Gson gson, C17189a aVar, boolean z4) {
        super(str, z, z2);
        this.f43279d = field;
        this.f43280e = z3;
        this.f43281f = oVar;
        this.f43282g = gson;
        this.f43283h = aVar;
        this.f43284i = z4;
    }

    /* renamed from: a */
    public final void mo49378a(Object obj, JsonReader jsonReader) throws IOException, IllegalAccessException {
        Object a = this.f43281f.mo40320a(jsonReader);
        if (a != null || !this.f43284i) {
            this.f43279d.set(obj, a);
        }
    }

    /* renamed from: b */
    public final void mo49379b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
        C13458o oVar;
        Object obj2 = this.f43279d.get(obj);
        if (this.f43280e) {
            oVar = this.f43281f;
        } else {
            oVar = new C16625n(this.f43282g, this.f43281f, this.f43283h.f44432b);
        }
        oVar.mo40321b(jsonWriter, obj2);
    }

    /* renamed from: c */
    public final boolean mo49380c(Object obj) throws IOException, IllegalAccessException {
        if (this.f43293b && this.f43279d.get(obj) != obj) {
            return true;
        }
        return false;
    }
}
