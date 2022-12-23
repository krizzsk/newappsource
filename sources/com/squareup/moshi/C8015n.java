package com.squareup.moshi;

import com.squareup.moshi.C8011k;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import nb0.C12947k;
import nb0.C12949m;
import ob0.C12977b;

/* renamed from: com.squareup.moshi.n */
public final class C8015n<K, V> extends C8011k<Map<K, V>> {

    /* renamed from: c */
    public static final C8016a f24275c = new C8016a();

    /* renamed from: a */
    public final C8011k<K> f24276a;

    /* renamed from: b */
    public final C8011k<V> f24277b;

    /* renamed from: com.squareup.moshi.n$a */
    public class C8016a implements C8011k.C8012a {
        /* renamed from: a */
        public final C8011k<?> mo25038a(Type type, Set<? extends Annotation> set, C8017o oVar) {
            Class<?> c;
            Type[] typeArr;
            if (!set.isEmpty() || (c = C12949m.m32789c(type)) != Map.class) {
                return null;
            }
            Class<Object> cls = Object.class;
            Class<String> cls2 = String.class;
            if (type == Properties.class) {
                typeArr = new Type[]{cls2, cls2};
            } else {
                Class<Map> cls3 = Map.class;
                if (cls3.isAssignableFrom(c)) {
                    Type i = C12977b.m32856i(type, c, C12977b.m32850c(type, c, cls3), new LinkedHashSet());
                    typeArr = i instanceof ParameterizedType ? ((ParameterizedType) i).getActualTypeArguments() : new Type[]{cls, cls};
                } else {
                    throw new IllegalArgumentException();
                }
            }
            return new C8015n(oVar, typeArr[0], typeArr[1]).mo25050c();
        }
    }

    public C8015n(C8017o oVar, Type type, Type type2) {
        this.f24276a = oVar.mo25081b(type);
        this.f24277b = oVar.mo25081b(type2);
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) throws IOException {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.mo24995i();
        while (jsonReader.mo24999v()) {
            jsonReader.mo24987K();
            K a = this.f24276a.mo11093a(jsonReader);
            V a2 = this.f24277b.mo11093a(jsonReader);
            Object put = linkedHashTreeMap.put(a, a2);
            if (put != null) {
                throw new JsonDataException("Map key '" + a + "' has multiple values at path " + jsonReader.mo24998t() + ": " + put + " and " + a2);
            }
        }
        jsonReader.mo24997r();
        return linkedHashTreeMap;
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) throws IOException {
        kVar.mo25074i();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                int z = kVar.mo39836z();
                if (z == 5 || z == 3) {
                    kVar.f32087f = true;
                    this.f24276a.mo11094e(kVar, entry.getKey());
                    this.f24277b.mo11094e(kVar, entry.getValue());
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            } else {
                StringBuilder k = C13555b.m33972k("Map key is null at ");
                k.append(kVar.mo39835v());
                throw new JsonDataException(k.toString());
            }
        }
        kVar.mo25076t();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("JsonAdapter(");
        k.append(this.f24276a);
        k.append("=");
        k.append(this.f24277b);
        k.append(")");
        return k.toString();
    }
}
