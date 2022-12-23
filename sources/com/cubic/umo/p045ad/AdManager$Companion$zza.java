package com.cubic.umo.p045ad;

import bf0.C21050d;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKit;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.moovit.umo.UmoException;
import com.moovit.umo.ads.UmoAds;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import mf0.C24362h;
import p026b7.C1496a;
import p977zz.C20944i0;

/* renamed from: com.cubic.umo.ad.AdManager$Companion$zza */
public final class AdManager$Companion$zza extends Lambda implements C24240p<UMOAdKit, UMOAdKitError, C21050d> {
    public final /* synthetic */ C1496a zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdManager$Companion$zza(UmoAds.C7869d dVar) {
        super(2);
        this.zza = dVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        UMOAdKit uMOAdKit = (UMOAdKit) obj;
        UMOAdKitError uMOAdKitError = (UMOAdKitError) obj2;
        C24362h.m61211f(uMOAdKitError, "error");
        if (uMOAdKit != null) {
            C2218a aVar = new C2218a();
            C1496a aVar2 = this.zza;
            C2218a.f7237a = aVar;
            UmoAds.C7869d dVar = (UmoAds.C7869d) aVar2;
            dVar.f23821e.invoke(new C20944i0(new UmoAds.C7870e(dVar.f23819c, aVar), null));
        } else {
            ((UmoAds.C7869d) this.zza).f23821e.invoke(new C20944i0(null, new UmoException(uMOAdKitError.getDesc())));
        }
        return C21050d.f52856a;
    }
}
