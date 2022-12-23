package com.squareup.moshi;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import nb0.C12947k;
import nb0.C12949m;
import ob0.C12977b;

/* renamed from: com.squareup.moshi.a */
public final class C7995a implements C8011k.C8012a {

    /* renamed from: a */
    public final List<C7997b> f24228a;

    /* renamed from: b */
    public final List<C7997b> f24229b;

    /* renamed from: com.squareup.moshi.a$a */
    public class C7996a extends C8011k<Object> {

        /* renamed from: a */
        public final /* synthetic */ C7997b f24230a;

        /* renamed from: b */
        public final /* synthetic */ C8011k f24231b;

        /* renamed from: c */
        public final /* synthetic */ C7997b f24232c;

        /* renamed from: d */
        public final /* synthetic */ Set f24233d;

        /* renamed from: e */
        public final /* synthetic */ Type f24234e;

        public C7996a(C7997b bVar, C8011k kVar, C8017o oVar, C7997b bVar2, Set set, Type type) {
            this.f24230a = bVar;
            this.f24231b = kVar;
            this.f24232c = bVar2;
            this.f24233d = set;
            this.f24234e = type;
        }

        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            C7997b bVar = this.f24232c;
            if (bVar == null) {
                return this.f24231b.mo11093a(jsonReader);
            }
            if (bVar.f24241g || jsonReader.mo24986H() != JsonReader.Token.NULL) {
                try {
                    return this.f24232c.mo25041b(jsonReader);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + jsonReader.mo24998t(), cause);
                }
            } else {
                jsonReader.mo24984B();
                return null;
            }
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            C7997b bVar = this.f24230a;
            if (bVar == null) {
                this.f24231b.mo11094e(kVar, obj);
            } else if (bVar.f24241g || obj != null) {
                try {
                    bVar.mo25043d(kVar, obj);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    throw new JsonDataException(cause + " at " + kVar.mo39835v(), cause);
                }
            } else {
                kVar.mo25078x();
            }
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("JsonAdapter");
            k.append(this.f24233d);
            k.append("(");
            k.append(this.f24234e);
            k.append(")");
            return k.toString();
        }
    }

    /* renamed from: com.squareup.moshi.a$b */
    public static abstract class C7997b {

        /* renamed from: a */
        public final Type f24235a;

        /* renamed from: b */
        public final Set<? extends Annotation> f24236b;

        /* renamed from: c */
        public final Object f24237c;

        /* renamed from: d */
        public final Method f24238d;

        /* renamed from: e */
        public final int f24239e;

        /* renamed from: f */
        public final C8011k<?>[] f24240f;

        /* renamed from: g */
        public final boolean f24241g;

        public C7997b(Type type, Set<? extends Annotation> set, Object obj, Method method, int i, int i2, boolean z) {
            this.f24235a = C12977b.m32848a(type);
            this.f24236b = set;
            this.f24237c = obj;
            this.f24238d = method;
            this.f24239e = i2;
            this.f24240f = new C8011k[(i - i2)];
            this.f24241g = z;
        }

        /* renamed from: a */
        public void mo25040a(C8017o oVar, C8011k.C8012a aVar) {
            C8011k<?> kVar;
            if (this.f24240f.length > 0) {
                Type[] genericParameterTypes = this.f24238d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f24238d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i = this.f24239e; i < length; i++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i]).getActualTypeArguments()[0];
                    Set<? extends Annotation> f = C12977b.m32853f(parameterAnnotations[i]);
                    C8011k<?>[] kVarArr = this.f24240f;
                    int i2 = i - this.f24239e;
                    if (!C12949m.m32788b(this.f24235a, type) || !this.f24236b.equals(f)) {
                        kVar = oVar.mo25082c(type, f, (String) null);
                    } else {
                        kVar = oVar.mo25083d(aVar, type, f);
                    }
                    kVarArr[i2] = kVar;
                }
            }
        }

        /* renamed from: b */
        public Object mo25041b(JsonReader jsonReader) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        /* renamed from: c */
        public final Object mo25042c(Object obj) throws InvocationTargetException {
            C8011k<?>[] kVarArr = this.f24240f;
            Object[] objArr = new Object[(kVarArr.length + 1)];
            objArr[0] = obj;
            System.arraycopy(kVarArr, 0, objArr, 1, kVarArr.length);
            try {
                return this.f24238d.invoke(this.f24237c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: d */
        public void mo25043d(C12947k kVar, Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }
    }

    public C7995a(ArrayList arrayList, ArrayList arrayList2) {
        this.f24228a = arrayList;
        this.f24229b = arrayList2;
    }

    /* renamed from: b */
    public static C7997b m18226b(List<C7997b> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7997b bVar = list.get(i);
            if (C12949m.m32788b(bVar.f24235a, type) && bVar.f24236b.equals(set)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C8011k<?> mo25038a(Type type, Set<? extends Annotation> set, C8017o oVar) {
        String str;
        C7997b b = m18226b(this.f24228a, type, set);
        C7997b b2 = m18226b(this.f24229b, type, set);
        C8011k<T> kVar = null;
        if (b == null && b2 == null) {
            return null;
        }
        if (b == null || b2 == null) {
            try {
                kVar = oVar.mo25083d(this, type, set);
            } catch (IllegalArgumentException e) {
                if (b == null) {
                    str = "@ToJson";
                } else {
                    str = "@FromJson";
                }
                StringBuilder l = C13555b.m33973l("No ", str, " adapter for ");
                l.append(C12977b.m32858k(type, set));
                throw new IllegalArgumentException(l.toString(), e);
            }
        }
        C8011k<T> kVar2 = kVar;
        if (b != null) {
            b.mo25040a(oVar, this);
        }
        if (b2 != null) {
            b2.mo25040a(oVar, this);
        }
        return new C7996a(b, kVar2, oVar, b2, set, type);
    }
}
