package com.cubic.umo.p045ad.playback.p046ui.activities;

import ac0.C7557a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdOrientation;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.umo.ads.p350u.zzk;
import com.umo.ads.p350u.zzr;
import com.umo.ads.p350u.zzs;
import gc0.C12724b;
import hc0.C12755c;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import lc0.C12860c;
import mf0.C24362h;
import nc0.C12951b;
import nc0.C12952c;
import p026b7.C1500e;
import p026b7.C1501f;
import p054d0.C4280f0;
import wb0.C13233c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/cubic/umo/ad/playback/ui/activities/AKVPaidAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lhc0/c$a;", "<init>", "()V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.playback.ui.activities.AKVPaidAdActivity */
public final class AKVPaidAdActivity extends AppCompatActivity implements C12755c.C12756a {

    /* renamed from: A */
    public static String f7329A;

    /* renamed from: z */
    public static WeakReference<AKVPaidAdActivity> f7330z;

    /* renamed from: x */
    public RelativeLayout f7331x;

    /* renamed from: y */
    public C12755c f7332y;

    /* renamed from: b1 */
    public final void mo11141b1(String str) {
        C24362h.m61211f(str, "spotId");
        C13233c.m33352u(str);
        f7329A = null;
        this.f7332y = null;
        super.finish();
        f7329A = null;
        this.f7332y = null;
    }

    public final void finish() {
        super.finish();
        f7329A = null;
        this.f7332y = null;
    }

    public final void onBackPressed() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        C12724b bVar;
        ViewGroup.LayoutParams layoutParams;
        zzs zzs;
        C24362h.m61211f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C12755c cVar = this.f7332y;
        if (cVar != null && (bVar = cVar.f31518e) != null && bVar.f31441r != null && bVar.f31442s != null) {
            C7557a.f23040a.mo6672i(C24362h.m61216k(bVar.f31446w, "AKVPaidPlayer: updateLayoutOnOrientation()"));
            if (bVar.mo39529j()) {
                FrameLayout frameLayout = bVar.f31432i;
                if (frameLayout != null) {
                    frameLayout.post(new C4280f0(6, bVar, frameLayout));
                    return;
                }
                return;
            }
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
            C12860c cVar2 = bVar.f31441r;
            ViewGroup.LayoutParams layoutParams2 = null;
            if (cVar2 == null) {
                layoutParams = null;
            } else {
                layoutParams = cVar2.getLayoutParams();
            }
            if (layoutParams != null) {
                layoutParams.width = displayMetrics.widthPixels;
            }
            if (layoutParams != null) {
                layoutParams.height = displayMetrics.heightPixels;
            }
            C12860c cVar3 = bVar.f31441r;
            if (cVar3 != null) {
                cVar3.setLayoutParams(layoutParams);
            }
            C12860c cVar4 = bVar.f31441r;
            if (cVar4 != null) {
                layoutParams2 = cVar4.getLayoutParams();
            }
            C24362h.m61208c(layoutParams2);
            if (bVar.mo39529j()) {
                zzs = zzs.THUMBNAIL;
            } else {
                zzs = zzs.FULLSCREEN;
            }
            bVar.mo39521a(layoutParams2, zzs);
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        f7330z = new WeakReference<>(this);
        setContentView(C1501f.umoak_layout_vast_player_container);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("VPAID_AD_INFO");
        C24362h.m61208c(parcelableExtra);
        zzr zzr = (zzr) parcelableExtra;
        String stringExtra = getIntent().getStringExtra("BROADCAST_IDENTIFIER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f7331x = (RelativeLayout) findViewById(C1500e.layout_player_container);
        getWindow().setFlags(1024, 1024);
        getWindow().getDecorView().setSystemUiVisibility(2);
        String stringExtra2 = getIntent().getStringExtra("FULLSCREEN_AD_ORIENTATION");
        UMOAdKitAdOrientation.Companion.getClass();
        UMOAdKitAdOrientation uMOAdKitAdOrientation = (UMOAdKitAdOrientation) UMOAdKitAdOrientation.map.get(stringExtra2);
        if (uMOAdKitAdOrientation == null) {
            uMOAdKitAdOrientation = UMOAdKitAdOrientation.UNSPECIFIED;
        }
        int i = C12952c.C12953a.f32092a[uMOAdKitAdOrientation.ordinal()];
        if (i == 1) {
            setRequestedOrientation(1);
        } else if (i == 2) {
            setRequestedOrientation(0);
        }
        this.f7332y = new C12755c(stringExtra, this);
        zzr.f30881d = f7329A;
        Context context = C13233c.f32842a;
        RelativeLayout relativeLayout = this.f7331x;
        C24362h.m61208c(relativeLayout);
        C13233c.m33337f(relativeLayout, stringExtra);
        C12755c cVar = this.f7332y;
        if (cVar != null && C13233c.m33334c(cVar.f31514a) != null) {
            C12724b bVar = new C12724b(zzr, cVar);
            cVar.f31518e = bVar;
            UMOAdKitError k = bVar.mo39530k();
            if (k != UMOAdKitError.NONE) {
                zzk zzk = zzk.BROADCAST_ACTION_AD_ERROR;
                if (k == null) {
                    str = null;
                } else {
                    str = k.name();
                }
                cVar.mo39605a(zzk, str);
                C12755c.C12756a aVar = cVar.f31515b;
                if (aVar != null) {
                    ((AKVPaidAdActivity) aVar).mo11141b1(cVar.f31514a);
                }
            }
        }
    }

    public final void onDestroy() {
        C12724b bVar;
        super.onDestroy();
        C12755c cVar = this.f7332y;
        if (cVar != null && (bVar = cVar.f31518e) != null) {
            bVar.mo39526f(false);
        }
    }

    public final void onResume() {
        C12724b bVar;
        super.onResume();
        C12755c cVar = this.f7332y;
        boolean z = true;
        if (cVar == null || (bVar = cVar.f31518e) == null || !bVar.f31430g) {
            z = false;
        }
        if (z) {
            C7557a.f23040a.mo6672i("VPAID_PLAYER: Closing VPaid Ad as it got completed when ClickThru Url was in display.");
            super.finish();
            f7329A = null;
            this.f7332y = null;
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
