package p304x;

import a00.C13382a;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.C0631r;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.SessionConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.fragment.app.FragmentActivity;
import com.appboy.Appboy;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.cubic.umo.p045ad.playback.p046ui.views.AKImageView;
import com.facebook.AccessToken;
import com.facebook.appevents.C2338j;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.p414v1.C14507b;
import com.google.firebase.perf.util.Timer;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import fc0.C12675e;
import java.util.Set;
import kotlin.jvm.internal.Ref$ObjectRef;
import mf0.C24362h;
import p009a8.C0100e;
import p032c0.C1753c;
import p277ub.C6774a0;
import p290vb.C6953n;
import p316y.C7208f;
import p472er.C16865g;
import p543hq.C17474b;
import p626lf.C18200a;
import p744qf.C19118e;
import v20.C20092c;

/* renamed from: x.v */
public final /* synthetic */ class C7109v implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22097b;

    /* renamed from: c */
    public final /* synthetic */ Object f22098c;

    /* renamed from: d */
    public final /* synthetic */ Object f22099d;

    public /* synthetic */ C7109v(int i, Object obj, Object obj2) {
        this.f22097b = i;
        this.f22098c = obj;
        this.f22099d = obj2;
    }

    public final void run() {
        switch (this.f22097b) {
            case 0:
                SessionConfig.SessionError sessionError = SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET;
                ((SessionConfig.C0567c) this.f22098c).onError();
                return;
            case 1:
                ((C7208f.C7211c) this.f22098c).f22336a.onReady((CameraCaptureSession) this.f22099d);
                return;
            case 2:
                ((C1753c) this.f22098c).mo6513b((CallbackToFutureAdapter.C0673a) this.f22099d);
                return;
            case 3:
                C0631r.C0634c cVar = C0631r.f2163r;
                ((C0631r.C0635d) this.f22098c).mo2576a((SurfaceRequest) this.f22099d);
                return;
            case 4:
                ((Appboy) this.f22098c).m5382a((Activity) this.f22099d);
                return;
            case 5:
                UMOAdKitBannerView uMOAdKitBannerView = (UMOAdKitBannerView) this.f22098c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f22099d;
                UMOAdKitBannerView.Companion companion = UMOAdKitBannerView.f7241i;
                C24362h.m61211f(uMOAdKitBannerView, "this$0");
                C24362h.m61211f(ref$ObjectRef, "$lParams");
                AKImageView aKImageView = uMOAdKitBannerView.f7246f;
                if (aKImageView != null) {
                    aKImageView.setLayoutParams((ViewGroup.LayoutParams) ref$ObjectRef.element);
                    return;
                }
                return;
            case 6:
                C0100e eVar = (C0100e) this.f22098c;
                C24362h.m61211f(eVar, "this$0");
                eVar.mo213a((AccessToken.C2264a) this.f22099d);
                return;
            case 7:
                Context context = (Context) this.f22098c;
                C2338j jVar = (C2338j) this.f22099d;
                C24362h.m61211f(context, "$context");
                C24362h.m61211f(jVar, "$logger");
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i = 0;
                int i2 = 0;
                while (true) {
                    int i3 = i + 1;
                    String str = strArr[i];
                    String str2 = strArr2[i];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i2 |= 1 << i;
                    } catch (ClassNotFoundException unused) {
                    }
                    if (i3 > 10) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        if (sharedPreferences.getInt("kitsBitmask", 0) != i2) {
                            sharedPreferences.edit().putInt("kitsBitmask", i2).apply();
                            jVar.mo12486f("fb_sdk_initialize", bundle);
                            return;
                        }
                        return;
                    }
                    i = i3;
                }
            case 8:
                C6953n nVar = ((C6953n.C6954a) this.f22098c).f21703b;
                int i4 = C6774a0.f20959a;
                nVar.mo20412a((String) this.f22099d);
                return;
            case 9:
                ((FirebaseMessaging) this.f22098c).lambda$deleteToken$6((TaskCompletionSource) this.f22099d);
                return;
            case 10:
                C19118e eVar2 = (C19118e) this.f22098c;
                C18200a aVar = C19118e.f48601f;
                C14507b b = eVar2.mo51552b((Timer) this.f22099d);
                if (b != null) {
                    eVar2.f48603b.add(b);
                    return;
                }
                return;
            case 11:
                MoovitActivity moovitActivity = (MoovitActivity) this.f22098c;
                Resources resources = (Resources) this.f22099d;
                Set<CarpoolLeg.CarpoolProvider> set = C16865g.f43870a;
                if (moovitActivity.f37311x) {
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_terms_of_use_clicked");
                    moovitActivity.mo44545v2(aVar2.mo49933a());
                    moovitActivity.startActivity(WebViewActivity.m18168y2(moovitActivity, resources.getString(R.string.carpool_passenger_registration_terms_of_use_link), resources.getString(R.string.carpool_passenger_registration_terms_of_use_web_view_title)));
                    return;
                }
                return;
            case 12:
                ((View) this.f22098c).announceForAccessibility(C13382a.m33667c((CharSequence[]) this.f22099d));
                return;
            case 13:
                FragmentActivity fragmentActivity = ((C20092c) this.f22098c).f50966c;
                fragmentActivity.startActivity(WebViewActivity.m18168y2(fragmentActivity, (String) this.f22099d, (CharSequence) null));
                return;
            default:
                String str3 = (String) this.f22098c;
                C12675e eVar3 = (C12675e) this.f22099d;
                int i5 = C12675e.f31327j;
                C24362h.m61211f(str3, "$script");
                C24362h.m61211f(eVar3, "this$0");
                eVar3.loadUrl(C24362h.m61216k(str3, "javascript:"));
                return;
        }
    }
}
