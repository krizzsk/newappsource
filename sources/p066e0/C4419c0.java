package p066e0;

import aa0.C7543n;
import android.content.Context;
import c70.C13752e;
import com.appboy.Appboy;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineVideoPlayMode;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C3912b;
import com.umo.ads.p342c.zzd;
import com.umo.ads.p350u.zzc;
import com.umo.ads.p350u.zzt;
import hc0.C12757d;
import java.util.concurrent.atomic.AtomicReference;
import mc0.C12909a;
import mc0.C12912d;
import mf0.C24362h;
import p066e0.C4421d0;
import p137ja.C5414e;
import p277ub.C6774a0;
import p290vb.C6953n;
import p389bl.C13640f;
import p80.C12991b;
import p80.C12993c;
import vb0.C13197a;
import vb0.C13199c;
import wb0.C13231a;
import wb0.C13233c;

/* renamed from: e0.c0 */
public final /* synthetic */ class C4419c0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f15483b;

    /* renamed from: c */
    public final /* synthetic */ Object f15484c;

    /* renamed from: d */
    public final /* synthetic */ Object f15485d;

    /* renamed from: e */
    public final /* synthetic */ Object f15486e;

    public /* synthetic */ C4419c0(int i, Object obj, Object obj2, Object obj3) {
        this.f15483b = i;
        this.f15484c = obj;
        this.f15485d = obj2;
        this.f15486e = obj3;
    }

    public final void run() {
        switch (this.f15483b) {
            case 0:
                C4421d0 d0Var = (C4421d0) this.f15484c;
                C4421d0.C4422a aVar = (C4421d0.C4422a) this.f15485d;
                C4421d0.C4422a aVar2 = (C4421d0.C4422a) this.f15486e;
                if (aVar != null) {
                    d0Var.f15490a.removeObserver(aVar);
                }
                d0Var.f15490a.observeForever(aVar2);
                return;
            case 1:
                ((Appboy) this.f15484c).m5391a((String) this.f15485d, (String) this.f15486e);
                return;
            case 2:
                C3912b.C3913a aVar3 = (C3912b.C3913a) this.f15484c;
                ((C3912b) this.f15485d).mo15999n(aVar3.f13725a, aVar3.f13726b, (Exception) this.f15486e);
                return;
            case 3:
                C6953n.C6954a aVar4 = (C6953n.C6954a) this.f15484c;
                C6953n nVar = aVar4.f21703b;
                int i = C6774a0.f20959a;
                nVar.mo20415k();
                aVar4.f21703b.mo20408C((Format) this.f15485d, (C5414e) this.f15486e);
                return;
            case 4:
                C13752e eVar = (C13752e) this.f15485d;
                AtomicReference<C7543n<C12991b>> atomicReference = C12993c.f32164c;
                ((C12993c) this.f15484c).getClass();
                try {
                    C12993c.m32874l(eVar);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                C13640f fVar = (C13640f) this.f15484c;
                C12909a aVar5 = (C12909a) this.f15485d;
                C12912d dVar = (C12912d) this.f15486e;
                C24362h.m61211f(fVar, "this$0");
                C24362h.m61211f(aVar5, "$akAdInfo");
                C24362h.m61211f(dVar, "$bannerInfo");
                ((C13197a) fVar.f33656c).mo39560d((String) fVar.f33655b);
                UMOAdKitInlineVideoPlayMode uMOAdKitInlineVideoPlayMode = null;
                C12757d dVar2 = new C12757d((String) fVar.f33655b, (C12757d.C12758a) null);
                dVar2.f31522c = (C13197a) fVar.f33656c;
                dVar2.f31523d = (C13199c) fVar.f33658e;
                Context context = C13233c.f32842a;
                if (C13233c.m33334c(dVar.f31965a) != null) {
                    boolean z = false;
                    zzt zzt = new zzt(0);
                    String str = dVar.f31965a;
                    C24362h.m61211f(str, "<set-?>");
                    zzt.f30885b = str;
                    String str2 = aVar5.f31950e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzt.f30886c = str2;
                    zzt.f30887d = C13233c.m33332a(dVar);
                    UMOAdKitBannerParams uMOAdKitBannerParams = dVar.f31966b;
                    if (uMOAdKitBannerParams != null) {
                        uMOAdKitInlineVideoPlayMode = uMOAdKitBannerParams.mo11125t();
                    }
                    if (uMOAdKitInlineVideoPlayMode == null) {
                        uMOAdKitInlineVideoPlayMode = C13231a.f32838b;
                    }
                    C24362h.m61211f(uMOAdKitInlineVideoPlayMode, "<set-?>");
                    zzt.f30888e = uMOAdKitInlineVideoPlayMode;
                    zzc zzc = zzc.INLINE;
                    C24362h.m61211f(zzc, "<set-?>");
                    zzt.f30889f = zzc;
                    zzt.f30890g = aVar5.f31956k;
                    com.umo.ads.p348o.zzc zzc2 = new com.umo.ads.p348o.zzc(zzt, dVar2);
                    dVar2.f31524e = zzc2;
                    C13197a aVar6 = dVar2.f31522c;
                    if (aVar6 != null) {
                        aVar6.mo39564h(dVar.f31965a, zzc2);
                    }
                    com.umo.ads.p348o.zzc zzc3 = dVar2.f31524e;
                    if (zzc3 != null && !zzc3.mo35801I()) {
                        z = true;
                    }
                    if (z) {
                        dVar2.mo39613d(zzt.f30885b, zzd.AD_CREATIVE_DISPLAY_ERROR);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
