package com.cubic.umo.p045ad.playback.p046ui.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdOrientation;
import com.umo.ads.p342c.zzd;
import com.umo.ads.p348o.zzc;
import com.umo.ads.p350u.zzt;
import hc0.C12757d;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import mf0.C24362h;
import nc0.C12951b;
import nc0.C12952c;
import p026b7.C1500e;
import p026b7.C1501f;
import wb0.C13233c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/cubic/umo/ad/playback/ui/activities/AKVideoAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lhc0/d$a;", "<init>", "()V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.playback.ui.activities.AKVideoAdActivity */
public final class AKVideoAdActivity extends AppCompatActivity implements C12757d.C12758a {

    /* renamed from: A */
    public static WeakReference<AKVideoAdActivity> f7333A;

    /* renamed from: x */
    public RelativeLayout f7334x;

    /* renamed from: y */
    public zzt f7335y;

    /* renamed from: z */
    public C12757d f7336z;

    /* renamed from: b1 */
    public final void mo11143b1(String str) {
        C24362h.m61211f(str, "spotId");
        C13233c.m33352u(str);
        this.f7336z = null;
        finish();
    }

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f7333A = new WeakReference<>(this);
        setContentView(C1501f.umoak_layout_vast_player_container);
        this.f7335y = (zzt) getIntent().getParcelableExtra("VIDEO_AD_INFO");
        String stringExtra = getIntent().getStringExtra("BROADCAST_IDENTIFIER");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f7334x = (RelativeLayout) findViewById(C1500e.layout_player_container);
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
        this.f7336z = new C12757d(stringExtra, this);
        Context context = C13233c.f32842a;
        RelativeLayout relativeLayout = this.f7334x;
        C24362h.m61208c(relativeLayout);
        C13233c.m33337f(relativeLayout, stringExtra);
        C12757d dVar = this.f7336z;
        if (dVar != null) {
            zzt zzt = this.f7335y;
            if (C13233c.m33334c(dVar.f31520a) != null) {
                C24362h.m61208c(zzt);
                zzc zzc = new zzc(zzt, dVar);
                dVar.f31524e = zzc;
                if (!zzc.mo35801I()) {
                    dVar.mo39613d(zzt.f30885b, zzd.AD_CREATIVE_DISPLAY_ERROR);
                }
            }
        }
    }

    public final void onDestroy() {
        zzc zzc;
        super.onDestroy();
        C12757d dVar = this.f7336z;
        if (dVar != null && (zzc = dVar.f31524e) != null) {
            zzc.mo35819z(true);
        }
    }

    public final void onPause() {
        zzc zzc;
        super.onPause();
        C12757d dVar = this.f7336z;
        if (dVar != null && (zzc = dVar.f31524e) != null) {
            zzc.mo35813n(true);
        }
    }

    public final void onResume() {
        zzc zzc;
        super.onResume();
        C12757d dVar = this.f7336z;
        if (dVar != null && (zzc = dVar.f31524e) != null) {
            zzc.mo35814o(false, true);
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
