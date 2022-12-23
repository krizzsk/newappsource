package com.squareup.moshi;

import com.squareup.moshi.C8011k;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import nb0.C12947k;
import nb0.C12949m;

/* renamed from: com.squareup.moshi.f */
public final class C8002f extends C8011k<Object> {

    /* renamed from: c */
    public static final C8003a f24252c = new C8003a();

    /* renamed from: a */
    public final Class<?> f24253a;

    /* renamed from: b */
    public final C8011k<Object> f24254b;

    /* renamed from: com.squareup.moshi.f$a */
    public class C8003a implements C8011k.C8012a {
        /* renamed from: a */
        public final C8011k<?> mo25038a(Type type, Set<? extends Annotation> set, C8017o oVar) {
            Type type2;
            if (type instanceof GenericArrayType) {
                type2 = ((GenericArrayType) type).getGenericComponentType();
            } else if (type instanceof Class) {
                type2 = ((Class) type).getComponentType();
            } else {
                type2 = null;
            }
            if (type2 != null && set.isEmpty()) {
                return new C8002f(C12949m.m32789c(type2), oVar.mo25081b(type2)).mo25050c();
            }
            return null;
        }
    }

    public C8002f(Class<?> cls, C8011k<Object> kVar) {
        this.f24253a = cls;
        this.f24254b = kVar;
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo24994e();
        while (jsonReader.mo24999v()) {
            arrayList.add(this.f24254b.mo11093a(jsonReader));
        }
        jsonReader.mo24996q();
        Object newInstance = Array.newInstance(this.f24253a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) throws IOException {
        kVar.mo25072e();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f24254b.mo11094e(kVar, Array.get(obj, i));
        }
        kVar.mo25075r();
    }

    public final String toString() {
        return this.f24254b + ".array()";
    }
}
