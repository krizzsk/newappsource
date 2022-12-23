package zc0;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import p229r1.C6235e;

/* renamed from: zc0.a */
public final class C13378a extends QueryInfoGenerationCallback {

    /* renamed from: b */
    public C6235e f33211b;

    /* renamed from: c */
    public C13379b f33212c;

    public C13378a(C13379b bVar, C6235e eVar) {
        this.f33211b = eVar;
        this.f33212c = bVar;
    }

    public final void onFailure(String str) {
        this.f33212c.f33215c = str;
        this.f33211b.mo22239d();
    }

    public final void onSuccess(QueryInfo queryInfo) {
        this.f33212c.f33214b = queryInfo;
        this.f33211b.mo22239d();
    }
}
