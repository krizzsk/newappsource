package p054d0;

import aa0.C7540l;
import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.C0575d;
import androidx.camera.view.C0658c;
import androidx.camera.view.C0660d;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.lifecycle.C1047z;
import androidx.room.C1257b;
import com.facebook.GraphRequest;
import com.facebook.appevents.cloudbridge.C2329a;
import com.facebook.internal.C2425p;
import com.google.android.exoplayer2.p052ui.C4060z;
import com.google.android.exoplayer2.p052ui.DefaultTimeBar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.datacollection.ForegroundWifiScanner;
import com.moovit.app.general.settings.privacy.PrivacyUpdateActivity;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.mappicker.MapLocationPickerActivity;
import com.moovit.map.MapFragment;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import java.util.Collections;
import p100gb.C4984m;
import p100gb.C5001x;
import p176n0.C5789h;
import p543hq.C17474b;
import p687nt.C18595e;
import v20.C20092c;

/* renamed from: d0.a1 */
public final /* synthetic */ class C4268a1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15174b;

    /* renamed from: c */
    public final /* synthetic */ Object f15175c;

    public /* synthetic */ C4268a1(Object obj, int i) {
        this.f15174b = i;
        this.f15175c = obj;
    }

    public final void run() {
        switch (this.f15174b) {
            case 0:
                ((Surface) this.f15175c).release();
                return;
            case 1:
                ((Camera2CameraImpl.C0495c) ((C0575d.C0577b) this.f15175c)).mo2268a();
                return;
            case 2:
                C0660d dVar = (C0660d) this.f15175c;
                C0658c.C0659a aVar = dVar.f2271g;
                if (aVar != null) {
                    ((C5789h) aVar).mo21664a();
                    dVar.f2271g = null;
                    return;
                }
                return;
            case 3:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this.f15175c;
                contentLoadingProgressBar.f3355c = false;
                contentLoadingProgressBar.f3354b = -1;
                contentLoadingProgressBar.setVisibility(8);
                return;
            case 4:
                ((C1257b) this.f15175c).getClass();
                Collections.emptyList();
                throw null;
            case 5:
                C2329a.m6191a((GraphRequest) this.f15175c);
                return;
            case 6:
                C2425p.m6377f((C2425p) this.f15175c);
                return;
            case 7:
                C5001x xVar = (C5001x) this.f15175c;
                if (!xVar.f16905M) {
                    C4984m.C4985a aVar2 = xVar.f16922r;
                    aVar2.getClass();
                    aVar2.mo20498a(xVar);
                    return;
                }
                return;
            case 8:
                int i = DefaultTimeBar.f14161Q;
                ((DefaultTimeBar) this.f15175c).mo16357f(false);
                return;
            case 9:
                ((C4060z) this.f15175c).f14532m.start();
                return;
            case 10:
                int i2 = ForegroundWifiScanner.f37916f;
                C1047z.f3987j.f3993g.mo4224a(new ForegroundWifiScanner((Context) this.f15175c));
                return;
            case 11:
                PrivacyUpdateActivity privacyUpdateActivity = (PrivacyUpdateActivity) this.f15175c;
                int i3 = PrivacyUpdateActivity.f38072X;
                if (privacyUpdateActivity.f37311x) {
                    FirebaseAnalytics.getInstance(privacyUpdateActivity).mo43247a((Bundle) null, "privacy_update_screen_learn_more_click");
                    C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "learn_more_clicked");
                    privacyUpdateActivity.mo44545v2(aVar3.mo49933a());
                    privacyUpdateActivity.startActivity(WebViewActivity.m18168y2(privacyUpdateActivity, privacyUpdateActivity.getString(R.string.privacy_url), privacyUpdateActivity.getString(R.string.privacy_text)));
                    return;
                }
                return;
            case 12:
                ((C18595e) this.f15175c).f47357h.setVisibility(0);
                return;
            case 13:
                ((ListItemView) this.f15175c).sendAccessibilityEvent(8);
                return;
            case 14:
                MultiLegNavActivity multiLegNavActivity = (MultiLegNavActivity) this.f15175c;
                multiLegNavActivity.f39115N0.postDelayed(multiLegNavActivity.f39107F0, 6000);
                return;
            case 15:
                ((MapLocationPickerActivity.C16208c) this.f15175c).f42287b.setVisibility(8);
                return;
            case 16:
                C20092c cVar = C20092c.this;
                cVar.f50989z = true;
                MapFragment mapFragment = cVar.f50967d;
                if (mapFragment != null) {
                    mapFragment.mo48630a3();
                    return;
                }
                return;
            case 17:
                ((C7540l) this.f15175c).mo19433a();
                return;
            default:
                ((HandlerThread) this.f15175c).quitSafely();
                return;
        }
    }
}
