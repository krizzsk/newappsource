package ni0;

import ii0.C23608b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* renamed from: ni0.g */
public final class C24521g extends C23608b {

    /* renamed from: c */
    public final /* synthetic */ int f62090c;

    /* renamed from: d */
    public final /* synthetic */ List f62091d;

    /* renamed from: e */
    public final /* synthetic */ C24510d f62092e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24521g(C24510d dVar, Object[] objArr, int i, ArrayList arrayList, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f62092e = dVar;
        this.f62090c = i;
        this.f62091d = arrayList;
    }

    /* renamed from: a */
    public final void mo58724a() {
        this.f62092e.f62052k.getClass();
        try {
            this.f62092e.f62063v.mo60795h(this.f62090c, ErrorCode.CANCEL);
            synchronized (this.f62092e) {
                this.f62092e.f62065x.remove(Integer.valueOf(this.f62090c));
            }
        } catch (IOException unused) {
        }
    }
}
