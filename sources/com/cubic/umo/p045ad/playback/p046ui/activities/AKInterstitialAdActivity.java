package com.cubic.umo.p045ad.playback.p046ui.activities;

import ac0.C7557a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdOrientation;
import com.cubic.umo.p045ad.types.AKBannerResponse;
import com.umo.ads.p342c.zza;
import com.umo.ads.p343d.zzc;
import hc0.C12751a;
import hc0.C12753b;
import java.lang.ref.WeakReference;
import kc0.C12844i;
import kotlin.Metadata;
import mc0.C12912d;
import mf0.C24362h;
import nc0.C12951b;
import nc0.C12952c;
import nc0.C12954d;
import p026b7.C1500e;
import p026b7.C1501f;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;
import wb0.C13233c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/playback/ui/activities/AKInterstitialAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lhc0/a$a;", "Lhc0/b$a;", "<init>", "()V", "a", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity */
public final class AKInterstitialAdActivity extends AppCompatActivity implements C12751a.C12752a, C12753b.C12754a {

    /* renamed from: A */
    public static WeakReference<AKInterstitialAdActivity> f7325A;

    /* renamed from: x */
    public C12751a f7326x;

    /* renamed from: y */
    public C12753b f7327y;

    /* renamed from: z */
    public RelativeLayout f7328z;

    /* renamed from: com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity$a */
    public static final class C2227a {
        /* renamed from: a */
        public static boolean m5863a(String str, AKBannerResponse aKBannerResponse, zza zza, String str2, String str3, UMOAdKitAdOrientation uMOAdKitAdOrientation) {
            String str4;
            C24362h.m61211f(str, "spotId");
            C24362h.m61211f(zza, "bannerType");
            C24362h.m61211f(str2, "adContent");
            C24362h.m61211f(uMOAdKitAdOrientation, "adOrientation");
            Bundle bundle = new Bundle();
            bundle.putString("HTML_AD_TYPE", zza.name());
            bundle.putString("HTML_AD_CONTENT", str2);
            bundle.putString("HTML_AD_CLICKTHROUGH", str3);
            bundle.putString("BROADCAST_IDENTIFIER", str);
            bundle.putString("FULLSCREEN_AD_ORIENTATION", uMOAdKitAdOrientation.name());
            bundle.putParcelable("BANNER_RESPONSE", aKBannerResponse);
            Context b = C13233c.m33333b();
            Intent intent = new Intent(b, AKInterstitialAdActivity.class);
            if (!(b instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtras(bundle);
            try {
                Context b2 = C13233c.m33333b();
                if (!(b2 instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                b2.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                throw new zzc(e);
            } catch (zzc e2) {
                e2.printStackTrace();
                Logger logger = C7557a.f23040a;
                if (C12954d.m32800c(str)) {
                    str4 = C17885a.m44403H0(str);
                } else {
                    str4 = "";
                }
                logger.mo6667d(C24362h.m61216k(str4, "INTERSTITIAL_AD_PLAYER: Unable to start Activity for displaying Interstitial Ad"));
                return false;
            }
        }
    }

    /* renamed from: b1 */
    public final void mo11140b1(String str) {
        C24362h.m61211f(str, "spotId");
        C13233c.m33352u(str);
        this.f7326x = null;
        this.f7327y = null;
        finish();
    }

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        C12912d q;
        ViewGroup c;
        super.onCreate(bundle);
        f7325A = new WeakReference<>(this);
        setContentView(C1501f.umoak_layout_interstitial_ad_container);
        String stringExtra = getIntent().getStringExtra("HTML_AD_TYPE");
        String stringExtra2 = getIntent().getStringExtra("HTML_AD_CONTENT");
        String stringExtra3 = getIntent().getStringExtra("HTML_AD_CLICKTHROUGH");
        AKBannerResponse aKBannerResponse = (AKBannerResponse) getIntent().getParcelableExtra("BANNER_RESPONSE");
        String stringExtra4 = getIntent().getStringExtra("BROADCAST_IDENTIFIER");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f7328z = (RelativeLayout) findViewById(C1500e.layout_player_container);
        getWindow().setFlags(1024, 1024);
        getWindow().getDecorView().setSystemUiVisibility(2);
        String stringExtra5 = getIntent().getStringExtra("FULLSCREEN_AD_ORIENTATION");
        UMOAdKitAdOrientation.Companion.getClass();
        UMOAdKitAdOrientation uMOAdKitAdOrientation = (UMOAdKitAdOrientation) UMOAdKitAdOrientation.map.get(stringExtra5);
        if (uMOAdKitAdOrientation == null) {
            uMOAdKitAdOrientation = UMOAdKitAdOrientation.UNSPECIFIED;
        }
        int i = C12952c.C12953a.f32092a[uMOAdKitAdOrientation.ordinal()];
        if (i == 1) {
            setRequestedOrientation(1);
        } else if (i == 2) {
            setRequestedOrientation(0);
        }
        zza.zzb.getClass();
        zza a = zza.C12079a.m32035a(stringExtra);
        C24362h.m61208c(stringExtra2);
        int ordinal = a.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            this.f7326x = new C12751a(stringExtra4, aKBannerResponse, this);
            Context context = C13233c.f32842a;
            RelativeLayout relativeLayout = this.f7328z;
            C24362h.m61208c(relativeLayout);
            C13233c.m33337f(relativeLayout, stringExtra4);
            C12751a aVar = this.f7326x;
            if (aVar != null) {
                aVar.mo39544b(a, stringExtra2, stringExtra3, com.umo.ads.p350u.zzc.INTERSTITIAL);
            }
        } else if (ordinal == 3) {
            this.f7327y = new C12753b(stringExtra4, this);
            Context context2 = C13233c.f32842a;
            RelativeLayout relativeLayout2 = this.f7328z;
            C24362h.m61208c(relativeLayout2);
            C13233c.m33337f(relativeLayout2, stringExtra4);
            C12753b bVar = this.f7327y;
            if (bVar != null && (q = C13233c.m33348q(bVar.f31507b)) != null && (c = C13233c.m33334c(q.f31965a)) != null) {
                String str = bVar.f31507b;
                Context context3 = c.getContext();
                C24362h.m61210e(context3, "containerView.context");
                C12844i iVar = new C12844i(str, context3, bVar);
                bVar.f31513h = iVar;
                iVar.setAdPlacement(com.umo.ads.p350u.zzc.INTERSTITIAL);
                bVar.mo39558b(stringExtra2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            C24362h.m61210e(decorView, "window.decorView");
            decorView.setSystemUiVisibility(4870);
            decorView.setOnSystemUiVisibilityChangeListener(new C12951b(decorView));
        }
    }
}
