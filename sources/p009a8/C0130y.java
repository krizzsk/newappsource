package p009a8;

import android.os.Handler;
import com.facebook.GraphRequest;
import com.facebook.internal.C2400g0;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mf0.C24362h;
import p009a8.C0121t;
import p316y.C7218m;

/* renamed from: a8.y */
public final class C0130y extends FilterOutputStream implements C0131z {

    /* renamed from: i */
    public static final /* synthetic */ int f379i = 0;

    /* renamed from: b */
    public final C0121t f380b;

    /* renamed from: c */
    public final Map<GraphRequest, C0094b0> f381c;

    /* renamed from: d */
    public final long f382d;

    /* renamed from: e */
    public final long f383e = C0115o.f338h.get();

    /* renamed from: f */
    public long f384f;

    /* renamed from: g */
    public long f385g;

    /* renamed from: h */
    public C0094b0 f386h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0130y(FilterOutputStream filterOutputStream, C0121t tVar, HashMap hashMap, long j) {
        super(filterOutputStream);
        C24362h.m61211f(hashMap, "progressMap");
        this.f380b = tVar;
        this.f381c = hashMap;
        this.f382d = j;
        C0115o oVar = C0115o.f331a;
        C2400g0.m6342g();
    }

    /* renamed from: a */
    public final void mo283a(GraphRequest graphRequest) {
        this.f386h = graphRequest != null ? this.f381c.get(graphRequest) : null;
    }

    /* renamed from: c */
    public final void mo288c(long j) {
        C0094b0 b0Var = this.f386h;
        if (b0Var != null) {
            long j2 = b0Var.f279d + j;
            b0Var.f279d = j2;
            if (j2 >= b0Var.f280e + b0Var.f278c || j2 >= b0Var.f281f) {
                b0Var.mo201a();
            }
        }
        long j3 = this.f384f + j;
        this.f384f = j3;
        if (j3 >= this.f385g + this.f383e || j3 >= this.f382d) {
            mo290e();
        }
    }

    public final void close() throws IOException {
        super.close();
        for (C0094b0 a : this.f381c.values()) {
            a.mo201a();
        }
        mo290e();
    }

    /* renamed from: e */
    public final void mo290e() {
        Boolean bool;
        if (this.f384f > this.f385g) {
            Iterator it = this.f380b.f362e.iterator();
            while (it.hasNext()) {
                C0121t.C0122a aVar = (C0121t.C0122a) it.next();
                if (aVar instanceof C0121t.C0123b) {
                    Handler handler = this.f380b.f359b;
                    if (handler == null) {
                        bool = null;
                    } else {
                        bool = Boolean.valueOf(handler.post(new C7218m(4, aVar, this)));
                    }
                    if (bool == null) {
                        ((C0121t.C0123b) aVar).mo279b();
                    }
                }
            }
            this.f385g = this.f384f;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        C24362h.m61211f(bArr, "buffer");
        this.out.write(bArr);
        mo288c((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C24362h.m61211f(bArr, "buffer");
        this.out.write(bArr, i, i2);
        mo288c((long) i2);
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        mo288c(1);
    }
}
