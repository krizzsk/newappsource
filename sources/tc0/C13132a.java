package tc0;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import p229r1.C6235e;

/* renamed from: tc0.a */
public final class C13132a extends QueryInfoGenerationCallback {

    /* renamed from: b */
    public C6235e f32625b;

    /* renamed from: c */
    public C13133b f32626c;

    public C13132a(C13133b bVar, C6235e eVar) {
        this.f32625b = eVar;
        this.f32626c = bVar;
    }

    public final void onFailure(String str) {
        this.f32626c.f32629c = str;
        this.f32625b.mo22239d();
    }

    public final void onSuccess(QueryInfo queryInfo) {
        this.f32626c.f32628b = queryInfo;
        this.f32625b.mo22239d();
    }
}
