package com.squareup.moshi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import nb0.C12947k;

/* renamed from: com.squareup.moshi.i */
public final class C8009i extends C8007h<Collection<Object>, Object> {
    public C8009i(C8011k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) throws IOException {
        Collection<Object> f = mo25047f();
        jsonReader.mo24994e();
        while (jsonReader.mo24999v()) {
            ((ArrayList) f).add(this.f24263a.mo11093a(jsonReader));
        }
        jsonReader.mo24996q();
        return f;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) throws IOException {
        kVar.mo25072e();
        for (Object e : (Collection) obj) {
            this.f24263a.mo11094e(kVar, e);
        }
        kVar.mo25075r();
    }

    /* renamed from: f */
    public final Collection<Object> mo25047f() {
        return new ArrayList();
    }
}
