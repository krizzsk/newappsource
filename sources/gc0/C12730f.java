package gc0;

import ac0.C7557a;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.google.android.exoplayer2.p052ui.PlayerView;
import com.umo.ads.p348o.zzc;
import com.usebutton.sdk.internal.api.AppActionRequest;
import hc0.C12757d;
import jc0.C12804b;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p099ga.C4865c1;
import p099ga.C4936u0;
import p584jl.C17885a;
import vb0.C13199c;

/* renamed from: gc0.f */
public final /* synthetic */ class C12730f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31454b;

    /* renamed from: c */
    public final /* synthetic */ zzc f31455c;

    public /* synthetic */ C12730f(zzc zzc, int i) {
        this.f31454b = i;
        this.f31455c = zzc;
    }

    public final void run() {
        String str;
        C4865c1 c1Var;
        switch (this.f31454b) {
            case 0:
                zzc zzc = this.f31455c;
                C24362h.m61211f(zzc, "this$0");
                C4865c1 c1Var2 = zzc.f30858n;
                if (c1Var2 != null) {
                    c1Var2.mo20373T();
                }
                C4865c1 c1Var3 = zzc.f30858n;
                if (c1Var3 != null) {
                    c1Var3.mo20371Q();
                }
                C4865c1 c1Var4 = zzc.f30858n;
                if (c1Var4 != null) {
                    c1Var4.mo20404w(zzc);
                }
                PlayerView playerView = zzc.f30857m;
                if (playerView != null) {
                    playerView.setPlayer((C4936u0) null);
                }
                zzc.f30858n = null;
                return;
            default:
                zzc zzc2 = this.f31455c;
                C24362h.m61211f(zzc2, "this$0");
                ImageView imageView = zzc2.f30864t;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                ImageView imageView2 = zzc2.f30865u;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
                zzc2.mo35802J();
                Context context = zzc2.f30848d;
                if (context != null) {
                    C12804b bVar = new C12804b(context, displayMetrics.widthPixels, displayMetrics.heightPixels, true, zzc2);
                    zzc2.f30867w = bVar;
                    PlayerView playerView2 = zzc2.f30857m;
                    if (playerView2 != null) {
                        C12804b.m32607c(bVar, playerView2);
                    }
                    C12804b bVar2 = zzc2.f30867w;
                    if (bVar2 != null) {
                        bVar2.show();
                    }
                    if (zzc2.mo35795C() && (c1Var = zzc2.f30858n) != null) {
                        c1Var.mo20378Y(zzc2.f30866v);
                    }
                    zzc.C12093a aVar = zzc2.f30847c;
                    if (aVar != null) {
                        String str2 = zzc2.f30846b.f30885b;
                        C12757d dVar = (C12757d) aVar;
                        C24362h.m61211f(str2, "spotId");
                        Logger logger = C7557a.f23040a;
                        if (C12954d.m32800c(str2)) {
                            str = C17885a.m44403H0(str2);
                        } else {
                            str = "";
                        }
                        logger.mo6666c(C24362h.m61216k(str, "VIDEO_PLAYER_CALLBACK: onVideoMaximized"));
                        C13199c cVar = dVar.f31523d;
                        if (cVar != null) {
                            cVar.mo39574r(str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C24362h.m61217l(AppActionRequest.KEY_CONTEXT);
                throw null;
        }
    }
}
