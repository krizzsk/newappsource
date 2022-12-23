package dk0;

import ck0.C21230e;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import hi0.C23521b0;
import hi0.C23562t;
import hi0.C23573y;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import p359ag.C13458o;
import si0.C24898f;
import si0.C24900g;

/* renamed from: dk0.b */
public final class C23283b<T> implements C21230e<T, C23521b0> {

    /* renamed from: c */
    public static final C23562t f59050c = C23562t.m57743c("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f59051d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Gson f59052a;

    /* renamed from: b */
    public final C13458o<T> f59053b;

    public C23283b(Gson gson, C13458o<T> oVar) {
        this.f59052a = gson;
        this.f59053b = oVar;
    }

    public final Object convert(Object obj) throws IOException {
        C24898f fVar = new C24898f();
        JsonWriter newJsonWriter = this.f59052a.newJsonWriter(new OutputStreamWriter(new C24900g(fVar), f59051d));
        this.f59053b.mo40321b(newJsonWriter, obj);
        newJsonWriter.close();
        return new C23573y(f59050c, fVar.mo61439z());
    }
}
