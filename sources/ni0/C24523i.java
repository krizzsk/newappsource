package ni0;

import ii0.C23608b;
import okhttp3.internal.http2.ErrorCode;

/* renamed from: ni0.i */
public final class C24523i extends C23608b {

    /* renamed from: c */
    public final /* synthetic */ int f62097c;

    /* renamed from: d */
    public final /* synthetic */ C24510d f62098d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24523i(C24510d dVar, Object[] objArr, int i, ErrorCode errorCode) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f62098d = dVar;
        this.f62097c = i;
    }

    /* renamed from: a */
    public final void mo58724a() {
        this.f62098d.f62052k.getClass();
        synchronized (this.f62098d) {
            this.f62098d.f62065x.remove(Integer.valueOf(this.f62097c));
        }
    }
}
