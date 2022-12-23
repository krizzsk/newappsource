package p406cg;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p359ag.C13445b;
import p359ag.C13458o;
import p359ag.C13459p;
import p384bg.C13623d;
import p384bg.C13624e;
import p509gg.C17189a;

/* renamed from: cg.g */
public final class C13817g implements C13459p, Cloneable {

    /* renamed from: h */
    public static final C13817g f34003h = new C13817g();

    /* renamed from: b */
    public double f34004b = -1.0d;

    /* renamed from: c */
    public int f34005c = 136;

    /* renamed from: d */
    public boolean f34006d = true;

    /* renamed from: e */
    public boolean f34007e;

    /* renamed from: f */
    public List<C13445b> f34008f = Collections.emptyList();

    /* renamed from: g */
    public List<C13445b> f34009g = Collections.emptyList();

    /* renamed from: cg.g$a */
    public class C13818a extends C13458o<T> {

        /* renamed from: a */
        public C13458o<T> f34010a;

        /* renamed from: b */
        public final /* synthetic */ boolean f34011b;

        /* renamed from: c */
        public final /* synthetic */ boolean f34012c;

        /* renamed from: d */
        public final /* synthetic */ Gson f34013d;

        /* renamed from: e */
        public final /* synthetic */ C17189a f34014e;

        public C13818a(boolean z, boolean z2, Gson gson, C17189a aVar) {
            this.f34011b = z;
            this.f34012c = z2;
            this.f34013d = gson;
            this.f34014e = aVar;
        }

        /* renamed from: a */
        public final T mo40320a(JsonReader jsonReader) throws IOException {
            if (this.f34011b) {
                jsonReader.skipValue();
                return null;
            }
            C13458o<T> oVar = this.f34010a;
            if (oVar == null) {
                oVar = this.f34013d.getDelegateAdapter(C13817g.this, this.f34014e);
                this.f34010a = oVar;
            }
            return oVar.mo40320a(jsonReader);
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, T t) throws IOException {
            if (this.f34012c) {
                jsonWriter.nullValue();
                return;
            }
            C13458o<T> oVar = this.f34010a;
            if (oVar == null) {
                oVar = this.f34013d.getDelegateAdapter(C13817g.this, this.f34014e);
                this.f34010a = oVar;
            }
            oVar.mo40321b(jsonWriter, t);
        }
    }

    /* renamed from: a */
    public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
        boolean z;
        boolean z2;
        Class<? super T> cls = aVar.f44431a;
        boolean g = mo40742g(cls);
        if (g || mo40743h(cls, true)) {
            z = true;
        } else {
            z = false;
        }
        if (g || mo40743h(cls, false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return new C13818a(z2, z, gson, aVar);
        }
        return null;
    }

    /* renamed from: f */
    public final C13817g clone() {
        try {
            return (C13817g) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40742g(java.lang.Class<?> r7) {
        /*
            r6 = this;
            double r0 = r6.f34004b
            r2 = 1
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0020
            java.lang.Class<bg.d> r0 = p384bg.C13623d.class
            java.lang.annotation.Annotation r0 = r7.getAnnotation(r0)
            bg.d r0 = (p384bg.C13623d) r0
            java.lang.Class<bg.e> r1 = p384bg.C13624e.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r1)
            bg.e r1 = (p384bg.C13624e) r1
            boolean r0 = r6.mo40744i(r0, r1)
            if (r0 != 0) goto L_0x0020
            return r2
        L_0x0020:
            boolean r0 = r6.f34006d
            r1 = 0
            if (r0 != 0) goto L_0x003e
            boolean r0 = r7.isMemberClass()
            if (r0 == 0) goto L_0x003a
            int r0 = r7.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 != 0) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            return r2
        L_0x003e:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r7)
            if (r0 != 0) goto L_0x0054
            boolean r0 = r7.isAnonymousClass()
            if (r0 != 0) goto L_0x0052
            boolean r7 = r7.isLocalClass()
            if (r7 == 0) goto L_0x0054
        L_0x0052:
            r7 = 1
            goto L_0x0055
        L_0x0054:
            r7 = 0
        L_0x0055:
            if (r7 == 0) goto L_0x0058
            return r2
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p406cg.C13817g.mo40742g(java.lang.Class):boolean");
    }

    /* renamed from: h */
    public final boolean mo40743h(Class<?> cls, boolean z) {
        List<C13445b> list;
        if (z) {
            list = this.f34008f;
        } else {
            list = this.f34009g;
        }
        for (C13445b a : list) {
            if (a.mo40323a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo40744i(C13623d dVar, C13624e eVar) {
        boolean z;
        boolean z2;
        if (dVar == null || dVar.value() <= this.f34004b) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (eVar == null || eVar.value() > this.f34004b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final C13817g mo40745j(C13445b bVar, boolean z, boolean z2) {
        C13817g f = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f34008f);
            f.f34008f = arrayList;
            arrayList.add(bVar);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.f34009g);
            f.f34009g = arrayList2;
            arrayList2.add(bVar);
        }
        return f;
    }
}
