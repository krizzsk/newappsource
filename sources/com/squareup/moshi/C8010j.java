package com.squareup.moshi;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import nb0.C12947k;

/* renamed from: com.squareup.moshi.j */
public final class C8010j extends C8007h<Set<Object>, Object> {
    public C8010j(C8011k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) throws IOException {
        Collection f = mo25048f();
        jsonReader.mo24994e();
        while (jsonReader.mo24999v()) {
            f.add(this.f24263a.mo11093a(jsonReader));
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
    public final Collection mo25048f() {
        return new LinkedHashSet();
    }
}
