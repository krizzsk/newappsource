package ni0;

import ii0.C23608b;
import java.io.IOException;
import ni0.C24538r;
import okhttp3.internal.http2.ErrorCode;
import si0.C24898f;

/* renamed from: ni0.h */
public final class C24522h extends C23608b {

    /* renamed from: c */
    public final /* synthetic */ int f62093c;

    /* renamed from: d */
    public final /* synthetic */ C24898f f62094d;

    /* renamed from: e */
    public final /* synthetic */ int f62095e;

    /* renamed from: f */
    public final /* synthetic */ C24510d f62096f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24522h(C24510d dVar, Object[] objArr, int i, C24898f fVar, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f62096f = dVar;
        this.f62093c = i;
        this.f62094d = fVar;
        this.f62095e = i2;
    }

    /* renamed from: a */
    public final void mo58724a() {
        try {
            C24538r.C24539a aVar = this.f62096f.f62052k;
            C24898f fVar = this.f62094d;
            int i = this.f62095e;
            aVar.getClass();
            fVar.skip((long) i);
            this.f62096f.f62063v.mo60795h(this.f62093c, ErrorCode.CANCEL);
            synchronized (this.f62096f) {
                this.f62096f.f62065x.remove(Integer.valueOf(this.f62093c));
            }
        } catch (IOException unused) {
        }
    }
}
