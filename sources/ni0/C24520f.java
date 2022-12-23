package ni0;

import ii0.C23608b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* renamed from: ni0.f */
public final class C24520f extends C23608b {

    /* renamed from: c */
    public final /* synthetic */ int f62087c;

    /* renamed from: d */
    public final /* synthetic */ List f62088d;

    /* renamed from: e */
    public final /* synthetic */ C24510d f62089e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24520f(C24510d dVar, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f62089e = dVar;
        this.f62087c = i;
        this.f62088d = arrayList;
    }

    /* renamed from: a */
    public final void mo58724a() {
        this.f62089e.f62052k.getClass();
        try {
            this.f62089e.f62063v.mo60795h(this.f62087c, ErrorCode.CANCEL);
            synchronized (this.f62089e) {
                this.f62089e.f62065x.remove(Integer.valueOf(this.f62087c));
            }
        } catch (IOException unused) {
        }
    }
}
