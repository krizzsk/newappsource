package p009a8;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import mf0.C24362h;

/* renamed from: a8.x */
public final class C0129x extends OutputStream implements C0131z {

    /* renamed from: b */
    public final Handler f374b;

    /* renamed from: c */
    public final HashMap f375c = new HashMap();

    /* renamed from: d */
    public GraphRequest f376d;

    /* renamed from: e */
    public C0094b0 f377e;

    /* renamed from: f */
    public int f378f;

    public C0129x(Handler handler) {
        this.f374b = handler;
    }

    /* renamed from: a */
    public final void mo283a(GraphRequest graphRequest) {
        C0094b0 b0Var;
        this.f376d = graphRequest;
        if (graphRequest != null) {
            b0Var = (C0094b0) this.f375c.get(graphRequest);
        } else {
            b0Var = null;
        }
        this.f377e = b0Var;
    }

    /* renamed from: c */
    public final void mo284c(long j) {
        GraphRequest graphRequest = this.f376d;
        if (graphRequest != null) {
            if (this.f377e == null) {
                C0094b0 b0Var = new C0094b0(this.f374b, graphRequest);
                this.f377e = b0Var;
                this.f375c.put(graphRequest, b0Var);
            }
            C0094b0 b0Var2 = this.f377e;
            if (b0Var2 != null) {
                b0Var2.f281f += j;
            }
            this.f378f += (int) j;
        }
    }

    public final void write(byte[] bArr) {
        C24362h.m61211f(bArr, "buffer");
        mo284c((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        C24362h.m61211f(bArr, "buffer");
        mo284c((long) i2);
    }

    public final void write(int i) {
        mo284c(1);
    }
}
