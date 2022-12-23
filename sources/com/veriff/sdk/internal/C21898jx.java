package com.veriff.sdk.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0001H\u0000\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo59060d2 = {"emptySessionData", "Lcom/veriff/sdk/internal/data/StartSessionData;", "getEmptySessionData", "()Lcom/veriff/sdk/internal/data/StartSessionData;", "isPOAEnabledFlow", "", "isPOAOnlyFlow", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.jx */
public final class C21898jx {

    /* renamed from: a */
    private static final C21895jw f55367a;

    static {
        C22621vh vhVar = C22621vh.started;
        C22619vg vgVar = new C22619vg("", vhVar, (C22556tm) null, (C22617vf) null, 12, (DefaultConstructorMarker) null);
        f55367a = new C21895jw(vgVar, new C22619vg("", vhVar, (C22556tm) null, (C22617vf) null, 12, (DefaultConstructorMarker) null), new C21789ix(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (C21886js) null, 0.0d, (C21903ka) null, (C21787iw) null, (List) null, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, false, false, 0, -1, 32767, (DefaultConstructorMarker) null), (String) null, (String) null, (String) null, (C22607uy) null, (String) null, (List) null, 504, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public static final C21895jw m53437a() {
        return f55367a;
    }

    /* renamed from: b */
    public static final boolean m53439b(C21895jw jwVar) {
        C24362h.m61211f(jwVar, "$this$isPOAOnlyFlow");
        return jwVar.mo55639b() != null && jwVar.mo55638a() == null;
    }

    /* renamed from: a */
    public static final boolean m53438a(C21895jw jwVar) {
        C24362h.m61211f(jwVar, "$this$isPOAEnabledFlow");
        return jwVar.mo55639b() != null;
    }
}
