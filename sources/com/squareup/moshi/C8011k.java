package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import nb0.C12946j;
import nb0.C12947k;
import ob0.C12976a;
import si0.C24898f;

/* renamed from: com.squareup.moshi.k */
public abstract class C8011k<T> {

    /* renamed from: com.squareup.moshi.k$a */
    public interface C8012a {
        /* renamed from: a */
        C8011k<?> mo25038a(Type type, Set<? extends Annotation> set, C8017o oVar);
    }

    /* renamed from: a */
    public abstract T mo11093a(JsonReader jsonReader) throws IOException;

    /* renamed from: b */
    public final T mo25049b(String str) throws IOException {
        C24898f fVar = new C24898f();
        fVar.mo61404c0(str);
        C8013l lVar = new C8013l(fVar);
        T a = mo11093a(lVar);
        if (lVar.mo24986H() == JsonReader.Token.END_DOCUMENT) {
            return a;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    /* renamed from: c */
    public final C8011k<T> mo25050c() {
        if (this instanceof C12976a) {
            return this;
        }
        return new C12976a(this);
    }

    /* renamed from: d */
    public final String mo25051d(T t) {
        C24898f fVar = new C24898f();
        try {
            mo11094e(new C12946j(fVar), t);
            return fVar.mo61380H();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public abstract void mo11094e(C12947k kVar, T t) throws IOException;
}
