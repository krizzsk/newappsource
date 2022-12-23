package p921xq;

import com.google.android.gms.ads.ResponseInfo;
import com.moovit.MoovitApplication;
import com.moovit.app.ads.C14766z;
import p921xq.C20554a;

/* renamed from: xq.d */
public final class C20558d extends C20554a<C14766z> {
    public C20558d(boolean z, String str, String str2, String str3, String str4, C14766z zVar) {
        super(z, str, str2, str3, str4, zVar);
    }

    /* renamed from: a */
    public final <I, O> O mo52755a(MoovitApplication<?, ?, ?> moovitApplication, C20554a.C20555a<I, O> aVar, I i) {
        return aVar.mo44727b(this, i);
    }

    /* renamed from: b */
    public final String mo52756b() {
        ResponseInfo responseInfo = ((C14766z) this.f51994f).f37583a.getResponseInfo();
        if (responseInfo != null) {
            return responseInfo.getMediationAdapterClassName();
        }
        return null;
    }

    /* renamed from: c */
    public final String mo52757c() {
        return null;
    }

    /* renamed from: d */
    public final String mo52758d() {
        return "interval_between_update_native_ads_in_seconds";
    }
}
