package p837ue;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;
import p789se.C19451e;
import p789se.C19452f;

/* renamed from: ue.f */
public final class C19898f implements C19450d, C19452f {

    /* renamed from: a */
    public boolean f50528a = true;

    /* renamed from: b */
    public final JsonWriter f50529b;

    /* renamed from: c */
    public final Map<Class<?>, C19449c<?>> f50530c;

    /* renamed from: d */
    public final Map<Class<?>, C19451e<?>> f50531d;

    /* renamed from: e */
    public final C19449c<Object> f50532e;

    /* renamed from: f */
    public final boolean f50533f;

    public C19898f(Writer writer, HashMap hashMap, HashMap hashMap2, C19892a aVar, boolean z) {
        this.f50529b = new JsonWriter(writer);
        this.f50530c = hashMap;
        this.f50531d = hashMap2;
        this.f50532e = aVar;
        this.f50533f = z;
    }

    /* renamed from: a */
    public final C19898f mo52176a(Object obj) throws IOException {
        if (obj == null) {
            this.f50529b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f50529b.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    mo52178c();
                    this.f50529b.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                this.f50529b.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.f50529b.value((long) iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        long j = jArr[i];
                        mo52178c();
                        this.f50529b.value(j);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.f50529b.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.f50529b.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        mo52176a(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        mo52176a(objArr[i]);
                        i++;
                    }
                }
                this.f50529b.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f50529b.beginArray();
                for (Object a : (Collection) obj) {
                    mo52176a(a);
                }
                this.f50529b.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f50529b.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo52177b(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                    }
                }
                this.f50529b.endObject();
                return this;
            } else {
                C19449c cVar = this.f50530c.get(obj.getClass());
                if (cVar != null) {
                    this.f50529b.beginObject();
                    cVar.encode(obj, this);
                    this.f50529b.endObject();
                    return this;
                }
                C19451e eVar = this.f50531d.get(obj.getClass());
                if (eVar != null) {
                    eVar.encode(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    mo52178c();
                    this.f50529b.value(name);
                    return this;
                } else {
                    C19449c<Object> cVar2 = this.f50532e;
                    this.f50529b.beginObject();
                    cVar2.encode(obj, this);
                    this.f50529b.endObject();
                    return this;
                }
            }
        }
    }

    public final C19450d add(C19448b bVar, double d) throws IOException {
        String str = bVar.f49468a;
        mo52178c();
        this.f50529b.name(str);
        mo52178c();
        this.f50529b.value(d);
        return this;
    }

    /* renamed from: b */
    public final C19898f mo52177b(Object obj, String str) throws IOException {
        if (!this.f50533f) {
            mo52178c();
            this.f50529b.name(str);
            if (obj != null) {
                return mo52176a(obj);
            }
            this.f50529b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            mo52178c();
            this.f50529b.name(str);
            return mo52176a(obj);
        }
    }

    /* renamed from: c */
    public final void mo52178c() throws IOException {
        if (!this.f50528a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    public final C19450d add(C19448b bVar, float f) throws IOException {
        String str = bVar.f49468a;
        mo52178c();
        this.f50529b.name(str);
        mo52178c();
        this.f50529b.value((double) f);
        return this;
    }

    public final C19450d add(C19448b bVar, int i) throws IOException {
        String str = bVar.f49468a;
        mo52178c();
        this.f50529b.name(str);
        mo52178c();
        this.f50529b.value((long) i);
        return this;
    }

    public final C19450d add(C19448b bVar, long j) throws IOException {
        String str = bVar.f49468a;
        mo52178c();
        this.f50529b.name(str);
        mo52178c();
        this.f50529b.value(j);
        return this;
    }

    public final C19450d add(C19448b bVar, Object obj) throws IOException {
        return mo52177b(obj, bVar.f49468a);
    }

    public final C19450d add(C19448b bVar, boolean z) throws IOException {
        String str = bVar.f49468a;
        mo52178c();
        this.f50529b.name(str);
        mo52178c();
        this.f50529b.value(z);
        return this;
    }

    public final C19452f add(String str) throws IOException {
        mo52178c();
        this.f50529b.value(str);
        return this;
    }

    public final C19452f add(boolean z) throws IOException {
        mo52178c();
        this.f50529b.value(z);
        return this;
    }
}
