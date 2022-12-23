package wc0;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import p229r1.C6235e;

/* renamed from: wc0.a */
public final class C13234a extends QueryInfoGenerationCallback {

    /* renamed from: b */
    public C6235e f32851b;

    /* renamed from: c */
    public C13235b f32852c;

    public C13234a(C13235b bVar, C6235e eVar) {
        this.f32851b = eVar;
        this.f32852c = bVar;
    }

    public final void onFailure(String str) {
        this.f32852c.f32855c = str;
        this.f32851b.mo22239d();
    }

    public final void onSuccess(QueryInfo queryInfo) {
        this.f32852c.f32854b = queryInfo;
        this.f32851b.mo22239d();
    }
}
