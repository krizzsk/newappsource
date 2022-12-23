package p437dg;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import p359ag.C13447d;
import p359ag.C13450g;
import p359ag.C13451h;
import p359ag.C13452i;
import p359ag.C13454k;

/* renamed from: dg.f */
public final class C16607f extends JsonWriter {

    /* renamed from: e */
    public static final C16608a f43265e = new C16608a();

    /* renamed from: f */
    public static final C13454k f43266f = new C13454k("closed");

    /* renamed from: b */
    public final ArrayList f43267b = new ArrayList();

    /* renamed from: c */
    public String f43268c;

    /* renamed from: d */
    public C13450g f43269d = C13451h.f33305b;

    /* renamed from: dg.f$a */
    public class C16608a extends Writer {
        public final void close() throws IOException {
            throw new AssertionError();
        }

        public final void flush() throws IOException {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C16607f() {
        super(f43265e);
    }

    public final JsonWriter beginArray() throws IOException {
        C13447d dVar = new C13447d();
        mo49374j(dVar);
        this.f43267b.add(dVar);
        return this;
    }

    public final JsonWriter beginObject() throws IOException {
        C13452i iVar = new C13452i();
        mo49374j(iVar);
        this.f43267b.add(iVar);
        return this;
    }

    public final void close() throws IOException {
        if (this.f43267b.isEmpty()) {
            this.f43267b.add(f43266f);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: e */
    public final C13450g mo49372e() {
        if (this.f43267b.isEmpty()) {
            return this.f43269d;
        }
        StringBuilder k = C13555b.m33972k("Expected one JSON element but was ");
        k.append(this.f43267b);
        throw new IllegalStateException(k.toString());
    }

    public final JsonWriter endArray() throws IOException {
        if (this.f43267b.isEmpty() || this.f43268c != null) {
            throw new IllegalStateException();
        } else if (mo49373i() instanceof C13447d) {
            ArrayList arrayList = this.f43267b;
            arrayList.remove(arrayList.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter endObject() throws IOException {
        if (this.f43267b.isEmpty() || this.f43268c != null) {
            throw new IllegalStateException();
        } else if (mo49373i() instanceof C13452i) {
            ArrayList arrayList = this.f43267b;
            arrayList.remove(arrayList.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void flush() throws IOException {
    }

    /* renamed from: i */
    public final C13450g mo49373i() {
        ArrayList arrayList = this.f43267b;
        return (C13450g) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: j */
    public final void mo49374j(C13450g gVar) {
        if (this.f43268c != null) {
            gVar.getClass();
            if (!(gVar instanceof C13451h) || getSerializeNulls()) {
                ((C13452i) mo49373i()).mo40346C(gVar, this.f43268c);
            }
            this.f43268c = null;
        } else if (this.f43267b.isEmpty()) {
            this.f43269d = gVar;
        } else {
            C13450g i = mo49373i();
            if (i instanceof C13447d) {
                ((C13447d) i).mo40327C(gVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final JsonWriter name(String str) throws IOException {
        if (this.f43267b.isEmpty() || this.f43268c != null) {
            throw new IllegalStateException();
        } else if (mo49373i() instanceof C13452i) {
            this.f43268c = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final JsonWriter nullValue() throws IOException {
        mo49374j(C13451h.f33305b);
        return this;
    }

    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            mo49374j(C13451h.f33305b);
            return this;
        }
        mo49374j(new C13454k(bool));
        return this;
    }

    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            mo49374j(C13451h.f33305b);
            return this;
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        mo49374j(new C13454k(number));
        return this;
    }

    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            mo49374j(C13451h.f33305b);
            return this;
        }
        mo49374j(new C13454k(str));
        return this;
    }

    public final JsonWriter value(boolean z) throws IOException {
        mo49374j(new C13454k(Boolean.valueOf(z)));
        return this;
    }

    public final JsonWriter value(double d) throws IOException {
        if (isLenient() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            mo49374j(new C13454k((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    public final JsonWriter value(long j) throws IOException {
        mo49374j(new C13454k((Number) Long.valueOf(j)));
        return this;
    }
}
