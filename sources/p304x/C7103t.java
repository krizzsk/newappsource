package p304x;

import android.hardware.camera2.CameraCaptureSession;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.SurfaceRequest;
import com.appboy.Appboy;
import com.facebook.AccessToken;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.C2335g;
import com.facebook.appevents.C2336h;
import com.facebook.appevents.C2353q;
import com.facebook.internal.C2397f0;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.exoplayer2.audio.C3876a;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.useraccount.manager.profile.UserAdsTargetingData;
import com.moovit.view.dialogs.BottomSheetMenuDialogFragment;
import com.umo.ads.p350u.zzu;
import fc0.C12669a;
import fc0.C12675e;
import hc0.C12753b;
import java.util.Date;
import java.util.List;
import kc0.C12844i;
import mf0.C24362h;
import p009a8.C0115o;
import p030bo.app.C1602i2;
import p074e8.C4608f;
import p137ja.C5413d;
import p176n0.C5788g;
import p262t8.C6606a;
import p277ub.C6774a0;
import p316y.C7204d;
import p316y.C7208f;
import p389bl.C13641g;
import p543hq.C17474b;
import p684nq.C18584e;
import uh0.C25072a;

/* renamed from: x.t */
public final /* synthetic */ class C7103t implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22087b;

    /* renamed from: c */
    public final /* synthetic */ Object f22088c;

    /* renamed from: d */
    public final /* synthetic */ Object f22089d;

    public /* synthetic */ C7103t(int i, Object obj, Object obj2) {
        this.f22087b = i;
        this.f22088c = obj;
        this.f22089d = obj2;
    }

    public /* synthetic */ C7103t(C4608f fVar, String str) {
        this.f22087b = 5;
        this.f22089d = str;
        this.f22088c = fVar;
    }

    public final void run() {
        ViewParent viewParent;
        ViewParent viewParent2;
        switch (this.f22087b) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) this.f22088c;
                String str = (String) this.f22089d;
                camera2CameraImpl.getClass();
                camera2CameraImpl.mo2251j("Use case " + str + " INACTIVE");
                camera2CameraImpl.f1685b.mo2506c(str);
                camera2CameraImpl.mo2234A();
                return;
            case 1:
                C7204d.m16813b(((C7208f.C7211c) this.f22088c).f22336a, (CameraCaptureSession) this.f22089d);
                return;
            case 2:
                ((C5788g) ((SurfaceRequest.C0537g) this.f22088c)).mo21662a((SurfaceRequest.C0536f) this.f22089d);
                return;
            case 3:
                ((Appboy) this.f22088c).m5385a((C1602i2) this.f22089d);
                return;
            case 4:
                AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) this.f22088c;
                C2353q qVar = (C2353q) this.f22089d;
                String str2 = C2335g.f8528a;
                Class<C2335g> cls = C2335g.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        C24362h.m61211f(accessTokenAppIdPair, "$accessTokenAppId");
                        C24362h.m61211f(qVar, "$appEvents");
                        C2336h.m6203b(accessTokenAppIdPair, qVar);
                        return;
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                String str3 = (String) this.f22089d;
                C4608f fVar = (C4608f) this.f22088c;
                String str4 = C4608f.f15828e;
                Class<C4608f> cls2 = C4608f.class;
                if (!C6606a.m15601b(cls2)) {
                    try {
                        C24362h.m61211f(str3, "$tree");
                        C24362h.m61211f(fVar, "this$0");
                        C2397f0.f8630a.getClass();
                        byte[] bytes = str3.getBytes(C25072a.f63272a);
                        C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                        String u = C2397f0.m6327u("MD5", bytes);
                        Date date = AccessToken.f8348m;
                        AccessToken b = AccessToken.C2266c.m6110b();
                        if (u == null || !C24362h.m61206a(u, fVar.f15832d)) {
                            fVar.mo20133b(C4608f.C4609a.m11928a(str3, b, C0115o.m211b()), u);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        C6606a.m15600a(cls2, th2);
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                ((FetchedAppSettingsManager.C2371a) this.f22088c).onSuccess();
                return;
            case 7:
                C3876a aVar = ((C3876a.C3877a) this.f22088c).f13480b;
                int i = C6774a0.f20959a;
                aVar.mo15871O((C5413d) this.f22089d);
                return;
            case 8:
                C18584e eVar = (C18584e) this.f22088c;
                int i2 = C18584e.f47313w;
                eVar.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mot_quick_action_dialog");
                eVar.mo46797j2(aVar2.mo49933a());
                BottomSheetMenuDialogFragment.m18151S1((List) this.f22089d).show(eVar.getChildFragmentManager(), "validate_action_dialog");
                return;
            case 9:
                UserAdsTargetingData userAdsTargetingData = (UserAdsTargetingData) this.f22089d;
                MoovitApplication<?, ?, ?> moovitApplication = ((MobileAdsManager) this.f22088c).f37461c;
                if (userAdsTargetingData == null) {
                    moovitApplication.deleteFile("mobile_ads_manager_user_targeting_data.dat");
                    return;
                } else {
                    C13641g.m34136y(moovitApplication, "mobile_ads_manager_user_targeting_data.dat", userAdsTargetingData, UserAdsTargetingData.f40605c);
                    return;
                }
            default:
                C12844i iVar = (C12844i) this.f22088c;
                C12669a aVar3 = (C12669a) this.f22089d;
                int i3 = C12844i.f31735I;
                C24362h.m61211f(iVar, "this$0");
                C12675e eVar2 = iVar.f31736A;
                if (eVar2 == null) {
                    viewParent = null;
                } else {
                    viewParent = eVar2.getParent();
                }
                if (viewParent != null) {
                    ((ViewGroup) viewParent).removeView(iVar.f31736A);
                    FrameLayout frameLayout = iVar.f31760r;
                    if (frameLayout == null) {
                        viewParent2 = null;
                    } else {
                        viewParent2 = frameLayout.getParent();
                    }
                    if (viewParent2 != null) {
                        ((ViewGroup) viewParent2).removeView(iVar.f31760r);
                        iVar.f31760r = null;
                        iVar.f31761s = null;
                        iVar.addView(iVar.f31736A, iVar.f31741F);
                        zzu zzu = zzu.DEFAULT;
                        iVar.mo39680d(aVar3, zzu);
                        aVar3.mo39455b(zzu);
                        iVar.mo39696q();
                        C12844i.C12846b bVar = iVar.f31745c;
                        if (bVar != null) {
                            ((C12753b) bVar).zze(iVar.f31744b);
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }
}
