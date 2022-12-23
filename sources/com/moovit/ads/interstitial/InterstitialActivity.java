package com.moovit.ads.interstitial;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.moovit.ads.AdListener;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p967zp.C20881a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/ads/interstitial/InterstitialActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Ads_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class InterstitialActivity extends AppCompatActivity {

    /* renamed from: x */
    public C20881a f37387x;

    public final void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("placementId");
        if (stringExtra != null) {
            this.f37387x = new C20881a(this, stringExtra);
            return;
        }
        throw new IllegalStateException("placementId must exist in intent");
    }

    public final void onStart() {
        super.onStart();
        C20881a aVar = this.f37387x;
        if (aVar != null && !aVar.f51682c.contains("open")) {
            aVar.f51682c.add("open");
            Uri uri = AdListener.f37356b;
            Context context = aVar.f51680a;
            String str = aVar.f51681b;
            C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
            C24362h.m61211f(str, "placementId");
            AdListener.C14696a.m37010a(context, str, "open");
        }
        C20881a aVar2 = this.f37387x;
        if (aVar2 != null) {
            aVar2.mo52606b();
        }
    }
}
