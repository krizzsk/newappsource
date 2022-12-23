package p896wp;

import android.content.Context;
import android.net.Uri;
import com.facebook.ads.AdSDKNotificationListener;
import com.moovit.ads.AdListener;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.HashSet;
import mf0.C24362h;

/* renamed from: wp.a */
public abstract class C20381a {

    /* renamed from: a */
    public final Context f51680a;

    /* renamed from: b */
    public final String f51681b;

    /* renamed from: c */
    public final HashSet<String> f51682c = new HashSet<>();

    public C20381a(Context context, String str) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(str, "placementId");
        this.f51680a = context;
        this.f51681b = str;
    }

    /* renamed from: a */
    public final void mo52605a() {
        this.f51682c.add("click");
        Uri uri = AdListener.f37356b;
        Context context = this.f51680a;
        String str = this.f51681b;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(str, "placementId");
        AdListener.C14696a.m37010a(context, str, "click");
    }

    /* renamed from: b */
    public final void mo52606b() {
        if (!this.f51682c.contains(AdSDKNotificationListener.IMPRESSION_EVENT)) {
            this.f51682c.add(AdSDKNotificationListener.IMPRESSION_EVENT);
            Uri uri = AdListener.f37356b;
            Context context = this.f51680a;
            String str = this.f51681b;
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(str, "placementId");
            AdListener.C14696a.m37010a(context, str, AdSDKNotificationListener.IMPRESSION_EVENT);
        }
    }
}
