package p437dg;

import com.appboy.support.StringUtils;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p359ag.C13447d;
import p359ag.C13450g;
import p359ag.C13451h;
import p359ag.C13452i;
import p359ag.C13454k;

/* renamed from: dg.e */
public final class C16605e extends JsonReader {

    /* renamed from: f */
    public static final C16606a f43259f = new C16606a();

    /* renamed from: g */
    public static final Object f43260g = new Object();

    /* renamed from: b */
    public Object[] f43261b = new Object[32];

    /* renamed from: c */
    public int f43262c = 0;

    /* renamed from: d */
    public String[] f43263d = new String[32];

    /* renamed from: e */
    public int[] f43264e = new int[32];

    /* renamed from: dg.e$a */
    public class C16606a extends Reader {
        public final void close() throws IOException {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public C16605e(C13450g gVar) {
        super(f43259f);
        mo49369j(gVar);
    }

    private String locationString() {
        StringBuilder k = C13555b.m33972k(" at path ");
        k.append(getPath());
        return k.toString();
    }

    /* renamed from: a */
    public final void mo49366a(JsonToken jsonToken) throws IOException {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
        }
    }

    public final void beginArray() throws IOException {
        mo49366a(JsonToken.BEGIN_ARRAY);
        mo49369j(((C13447d) mo49367e()).iterator());
        this.f43264e[this.f43262c - 1] = 0;
    }

    public final void beginObject() throws IOException {
        mo49366a(JsonToken.BEGIN_OBJECT);
        mo49369j(new LinkedTreeMap.C14554b.C14555a((LinkedTreeMap.C14554b) ((C13452i) mo49367e()).f33306b.entrySet()));
    }

    public final void close() throws IOException {
        this.f43261b = new Object[]{f43260g};
        this.f43262c = 1;
    }

    /* renamed from: e */
    public final Object mo49367e() {
        return this.f43261b[this.f43262c - 1];
    }

    public final void endArray() throws IOException {
        mo49366a(JsonToken.END_ARRAY);
        mo49368i();
        mo49368i();
        int i = this.f43262c;
        if (i > 0) {
            int[] iArr = this.f43264e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void endObject() throws IOException {
        mo49366a(JsonToken.END_OBJECT);
        mo49368i();
        mo49368i();
        int i = this.f43262c;
        if (i > 0) {
            int[] iArr = this.f43264e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String getPath() {
        StringBuilder q = C25541a.m63886q('$');
        int i = 0;
        while (i < this.f43262c) {
            Object[] objArr = this.f43261b;
            Object obj = objArr[i];
            if (obj instanceof C13447d) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    q.append('[');
                    q.append(this.f43264e[i]);
                    q.append(']');
                }
            } else if (obj instanceof C13452i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    q.append('.');
                    String str = this.f43263d[i];
                    if (str != null) {
                        q.append(str);
                    }
                }
            }
            i++;
        }
        return q.toString();
    }

    public final boolean hasNext() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final Object mo49368i() {
        Object[] objArr = this.f43261b;
        int i = this.f43262c - 1;
        this.f43262c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: j */
    public final void mo49369j(Object obj) {
        int i = this.f43262c;
        Object[] objArr = this.f43261b;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f43261b = Arrays.copyOf(objArr, i2);
            this.f43264e = Arrays.copyOf(this.f43264e, i2);
            this.f43263d = (String[]) Arrays.copyOf(this.f43263d, i2);
        }
        Object[] objArr2 = this.f43261b;
        int i3 = this.f43262c;
        this.f43262c = i3 + 1;
        objArr2[i3] = obj;
    }

    public final boolean nextBoolean() throws IOException {
        mo49366a(JsonToken.BOOLEAN);
        boolean i = ((C13454k) mo49368i()).mo40333i();
        int i2 = this.f43262c;
        if (i2 > 0) {
            int[] iArr = this.f43264e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return i;
    }

    public final double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            double m = ((C13454k) mo49367e()).mo40335m();
            if (isLenient() || (!Double.isNaN(m) && !Double.isInfinite(m))) {
                mo49368i();
                int i = this.f43262c;
                if (i > 0) {
                    int[] iArr = this.f43264e;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return m;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + m);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public final int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            int p = ((C13454k) mo49367e()).mo40337p();
            mo49368i();
            int i = this.f43262c;
            if (i > 0) {
                int[] iArr = this.f43264e;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return p;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public final long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            long z = ((C13454k) mo49367e()).mo40339z();
            mo49368i();
            int i = this.f43262c;
            if (i > 0) {
                int[] iArr = this.f43264e;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return z;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public final String nextName() throws IOException {
        mo49366a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) mo49367e()).next();
        String str = (String) entry.getKey();
        this.f43263d[this.f43262c - 1] = str;
        mo49369j(entry.getValue());
        return str;
    }

    public final void nextNull() throws IOException {
        mo49366a(JsonToken.NULL);
        mo49368i();
        int i = this.f43262c;
        if (i > 0) {
            int[] iArr = this.f43264e;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek == jsonToken || peek == JsonToken.NUMBER) {
            String B = ((C13454k) mo49368i()).mo40326B();
            int i = this.f43262c;
            if (i > 0) {
                int[] iArr = this.f43264e;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return B;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public final JsonToken peek() throws IOException {
        if (this.f43262c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object e = mo49367e();
        if (e instanceof Iterator) {
            boolean z = this.f43261b[this.f43262c - 2] instanceof C13452i;
            Iterator it = (Iterator) e;
            if (it.hasNext()) {
                if (z) {
                    return JsonToken.NAME;
                }
                mo49369j(it.next());
                return peek();
            } else if (z) {
                return JsonToken.END_OBJECT;
            } else {
                return JsonToken.END_ARRAY;
            }
        } else if (e instanceof C13452i) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (e instanceof C13447d) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (e instanceof C13454k) {
                Serializable serializable = ((C13454k) e).f33307b;
                if (serializable instanceof String) {
                    return JsonToken.STRING;
                }
                if (serializable instanceof Boolean) {
                    return JsonToken.BOOLEAN;
                }
                if (serializable instanceof Number) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (e instanceof C13451h) {
                return JsonToken.NULL;
            } else {
                if (e == f43260g) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public final void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f43263d[this.f43262c - 2] = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            mo49368i();
            int i = this.f43262c;
            if (i > 0) {
                this.f43263d[i - 1] = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            }
        }
        int i2 = this.f43262c;
        if (i2 > 0) {
            int[] iArr = this.f43264e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final String toString() {
        return C16605e.class.getSimpleName();
    }
}
