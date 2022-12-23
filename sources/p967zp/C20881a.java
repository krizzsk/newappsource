package p967zp;

import android.content.Context;
import android.net.Uri;
import com.moovit.ads.AdListener;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p896wp.C20381a;

/* renamed from: zp.a */
public final class C20881a extends C20381a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20881a(Context context, String str) {
        super(context, str);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* renamed from: c */
    public final void mo52988c() {
        if (!this.f51682c.contains("close")) {
            this.f51682c.add("close");
            Uri uri = AdListener.f37356b;
            Context context = this.f51680a;
            String str = this.f51681b;
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(str, "placementId");
            AdListener.C14696a.m37010a(context, str, "close");
        }
    }
}
