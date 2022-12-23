package p217q2;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.room.C1257b;
import c70.C13752e;
import com.appboy.Appboy;
import com.appboy.models.outgoing.AppboyProperties;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.ext.types.UMOAdKitRollAdEvent;
import com.google.android.gms.common.util.BiConsumer;
import f00.C16919g;
import java.util.regex.Pattern;
import mc0.C12912d;
import mf0.C24362h;
import p269u2.C6684e;
import p886wf.C20299d;
import p886wf.C20302g;
import p910xf.C20482k;
import p910xf.C20488n;
import q00.C19051c;
import wb0.C13233c;
import yb0.C13295d;
import yb0.C13302g;

/* renamed from: q2.i */
public final /* synthetic */ class C6160i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f19529b;

    /* renamed from: c */
    public final /* synthetic */ Object f19530c;

    /* renamed from: d */
    public final /* synthetic */ Object f19531d;

    /* renamed from: e */
    public final /* synthetic */ Object f19532e;

    public /* synthetic */ C6160i(int i, Object obj, Object obj2, Object obj3) {
        this.f19529b = i;
        this.f19530c = obj;
        this.f19531d = obj2;
        this.f19532e = obj3;
    }

    public final void run() {
        switch (this.f19529b) {
            case 0:
                ((C1257b) this.f19530c).getClass();
                ((C6684e) this.f19531d).mo22147e();
                Object obj = ((C6161j) this.f19532e).f19534c;
                throw null;
            case 1:
                ((Appboy) this.f19530c).m5403b((String) this.f19531d, (String) this.f19532e);
                return;
            case 2:
                ((Appboy) this.f19530c).m5390a((String) this.f19531d, (AppboyProperties) this.f19532e);
                return;
            case 3:
                Pattern pattern = C20302g.f51480e;
                ((BiConsumer) this.f19530c).accept((String) this.f19531d, (C20299d) this.f19532e);
                return;
            case 4:
                ((C20488n) this.f19530c).f51880e.mo19991e(this.f19531d, (C20482k.C20483a) this.f19532e);
                return;
            case 5:
                C13752e eVar = (C13752e) this.f19531d;
                C16919g.C16925f fVar = C19051c.f48448c;
                ((C19051c) this.f19530c).getClass();
                try {
                    C19051c.m46170k(eVar);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 6:
                C12912d dVar = (C12912d) this.f19531d;
                ViewGroup viewGroup = (ViewGroup) this.f19532e;
                C24362h.m61211f((C13295d) this.f19530c, "this$0");
                C24362h.m61211f(dVar, "$bannerInfo");
                C24362h.m61211f(viewGroup, "$adView");
                C13295d.m33443m0(dVar);
                if (dVar.f31973i == null) {
                    ViewParent parent = viewGroup.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewGroup);
                    }
                    Context context = C13233c.f32842a;
                    UMOAdKitBannerView s = C13233c.m33350s(dVar.f31965a);
                    viewGroup.setTag("UMOAdView");
                    if (s != null) {
                        s.addView(viewGroup);
                    }
                    dVar.f31973i = viewGroup;
                    return;
                }
                return;
            default:
                C13302g gVar = C13302g.f33013b;
                C24362h.m61211f((String) this.f19530c, "$spotId");
                C24362h.m61211f((UMOAdKitRollAdEvent) this.f19531d, "$adEvent");
                C24362h.m61211f((UMOAdKitError) this.f19532e, "$adError");
                C13302g gVar2 = C13302g.f33013b;
                return;
        }
    }
}
