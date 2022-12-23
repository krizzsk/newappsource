package gc0;

import ac0.C7557a;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.p052ui.PlayerView;
import com.umo.ads.p348o.zzc;
import hc0.C12757d;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p125ia.C5322i;
import p584jl.C17885a;
import vb0.C13197a;
import wb0.C13233c;

/* renamed from: gc0.e */
public final /* synthetic */ class C12729e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31452b;

    /* renamed from: c */
    public final /* synthetic */ zzc f31453c;

    public /* synthetic */ C12729e(zzc zzc, int i) {
        this.f31452b = i;
        this.f31453c = zzc;
    }

    public final void run() {
        boolean z;
        ViewParent viewParent;
        String str;
        C13197a aVar;
        switch (this.f31452b) {
            case 0:
                zzc zzc = this.f31453c;
                C24362h.m61211f(zzc, "this$0");
                ImageView imageView = zzc.f30864t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                RelativeLayout relativeLayout = zzc.f30862r;
                if (relativeLayout != null) {
                    relativeLayout.bringToFront();
                    return;
                }
                return;
            default:
                zzc zzc2 = this.f31453c;
                C24362h.m61211f(zzc2, "this$0");
                zzc2.mo35817v(false);
                ImageView imageView2 = zzc2.f30863s;
                boolean z2 = true;
                if (imageView2 != null && imageView2.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ImageView imageView3 = zzc2.f30863s;
                    C24362h.m61208c(imageView3);
                    C13233c.f32843b.post(new C5322i(1, imageView3, true));
                    zzc.C12093a aVar2 = zzc2.f30847c;
                    if (aVar2 != null) {
                        String str2 = zzc2.f30846b.f30885b;
                        C12757d dVar = (C12757d) aVar2;
                        C24362h.m61211f(str2, "spotId");
                        Logger logger = C7557a.f23040a;
                        if (C12954d.m32800c(str2)) {
                            str = C17885a.m44403H0(str2);
                        } else {
                            str = "";
                        }
                        logger.mo6666c(C24362h.m61216k(str, "VIDEO_PLAYER_CALLBACK: onVideoLoaded"));
                        if (dVar.mo39612c() && (aVar = dVar.f31522c) != null) {
                            aVar.mo39572p(str2);
                        }
                    }
                }
                if (zzc2.mo35796D()) {
                    if (zzc2.f30869y) {
                        ImageView imageView4 = zzc2.f30863s;
                        if (imageView4 == null || imageView4.getVisibility() != 8) {
                            z2 = false;
                        }
                        if (z2) {
                            PlayerView playerView = zzc2.f30857m;
                            if (playerView == null) {
                                viewParent = null;
                            } else {
                                viewParent = playerView.getParent();
                            }
                            if (viewParent == null) {
                                zzc2.mo35809f(zzc2.f30833A);
                            }
                            zzc2.mo35818x(false);
                        }
                    }
                    zzc2.mo35803N();
                    return;
                }
                return;
        }
    }
}
