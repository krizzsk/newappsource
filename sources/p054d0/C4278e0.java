package p054d0;

import androidx.room.C1258c;
import com.appboy.Appboy;
import com.appboy.p044ui.AppboyContentCardsFragment;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.p052ui.C4060z;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.tod.order.TodOrderActivity;
import com.tranzmate.R;
import com.veriff.sdk.internal.C22789zn;
import java.util.Arrays;
import java.util.EnumSet;
import p087fb.C4716a;
import p217q2.C6155h;
import p637lq.C18251b;
import p695od.C18728c;
import p877vu.C20232b;

/* renamed from: d0.e0 */
public final /* synthetic */ class C4278e0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15200b;

    /* renamed from: c */
    public final /* synthetic */ Object f15201c;

    public /* synthetic */ C4278e0(Object obj, int i) {
        this.f15200b = i;
        this.f15201c = obj;
    }

    public final void run() {
        switch (this.f15200b) {
            case 0:
                ((C18728c) this.f15201c).cancel(true);
                return;
            case 1:
                C6155h hVar = (C6155h) this.f15201c;
                synchronized (hVar) {
                    hVar.f19518f = false;
                    C6155h.C6157b bVar = hVar.f19520h;
                    synchronized (bVar) {
                        Arrays.fill(bVar.f19525b, false);
                        bVar.f19527d = true;
                    }
                }
                return;
            case 2:
                ((C1258c) this.f15201c).getClass();
                throw null;
            case 3:
                ((Appboy) this.f15201c).m5417g();
                return;
            case 4:
                ((AppboyContentCardsFragment) this.f15201c).lambda$onRefresh$0();
                return;
            case 5:
                DefaultDrmSessionManager.C3906c cVar = (DefaultDrmSessionManager.C3906c) this.f15201c;
                if (!cVar.f13710d) {
                    DrmSession drmSession = cVar.f13709c;
                    if (drmSession != null) {
                        drmSession.mo15954c(cVar.f13708b);
                    }
                    DefaultDrmSessionManager.this.f13695n.remove(cVar);
                    cVar.f13710d = true;
                    return;
                }
                return;
            case 6:
                ((C4716a) this.f15201c).getClass();
                throw null;
            case 7:
                ((C4060z) this.f15201c).mo16680k();
                return;
            case 8:
                int i = C18251b.f46567u;
                Snackbar.m35159l(((MoovitActivity) this.f15201c).findViewById(16908290), R.string.favorite_line_tab_gmb, 4000).mo42259p();
                return;
            case 9:
                EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
                ((MobileAdsManager) this.f15201c).mo44711m();
                return;
            case 10:
                ((C20232b) this.f15201c).dismissAllowingStateLoss();
                return;
            case 11:
                ((TodOrderActivity) this.f15201c).f40339m0.setVisibility(0);
                return;
            default:
                ((C22789zn) this.f15201c).m55966a();
                return;
        }
    }
}
