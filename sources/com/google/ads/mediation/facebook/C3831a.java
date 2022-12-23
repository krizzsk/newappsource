package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.ads.mediation.facebook.a */
public final class C3831a implements AudienceNetworkAds.InitListener {

    /* renamed from: d */
    public static C3831a f13280d;

    /* renamed from: a */
    public boolean f13281a = false;

    /* renamed from: b */
    public boolean f13282b = false;

    /* renamed from: c */
    public final ArrayList<C3832a> f13283c = new ArrayList<>();

    /* renamed from: com.google.ads.mediation.facebook.a$a */
    public interface C3832a {
        /* renamed from: a */
        void mo15696a(AdError adError);

        /* renamed from: b */
        void mo15697b();
    }

    /* renamed from: a */
    public static C3831a m10133a() {
        if (f13280d == null) {
            f13280d = new C3831a();
        }
        return f13280d;
    }

    /* renamed from: b */
    public static void m10134b(Context context, String str, C3832a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        m10133a().mo15715c(context, arrayList, aVar);
    }

    /* renamed from: c */
    public final void mo15715c(Context context, ArrayList<String> arrayList, C3832a aVar) {
        if (this.f13281a) {
            this.f13283c.add(aVar);
        } else if (this.f13282b) {
            aVar.mo15697b();
        } else {
            this.f13281a = true;
            m10133a().f13283c.add(aVar);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.11.0.1").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f13281a = false;
        this.f13282b = initResult.isSuccess();
        Iterator<C3832a> it = this.f13283c.iterator();
        while (it.hasNext()) {
            C3832a next = it.next();
            if (initResult.isSuccess()) {
                next.mo15697b();
            } else {
                next.mo15696a(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f13283c.clear();
    }
}
