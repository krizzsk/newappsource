package p826tr;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.facebook.appevents.C2342l;
import com.moovit.commons.geo.LatLonE6;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tripplanner.MVGetPolylinesRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tr.c */
public final class C19753c extends C13778r<C19753c, C19750a, MVGetPolylinesRequest> {

    /* renamed from: y */
    public static final /* synthetic */ int f50230y = 0;

    /* renamed from: w */
    public final List<LatLonE6> f50231w;

    /* renamed from: x */
    public final List<Integer> f50232x;

    public C19753c(C13752e eVar, ArrayList arrayList, ArrayList arrayList2, long j) {
        super(eVar, R.string.api_path_polylines_request_path, C19750a.class);
        this.f50231w = arrayList;
        this.f50232x = arrayList2;
        Long valueOf = Long.valueOf(j);
        C21100e.m49373x(valueOf, "requestTime");
        valueOf.longValue();
        ArrayList c = C13720d.m34273c(arrayList, (C13722f) null, new C19752b(0));
        ArrayList c2 = C13720d.m34273c(arrayList2, (C13722f) null, new C2342l(1));
        RO mVGetPolylinesRequest = new MVGetPolylinesRequest();
        mVGetPolylinesRequest.locations = c;
        mVGetPolylinesRequest.modes = c2;
        mVGetPolylinesRequest.requestedTime = j;
        mVGetPolylinesRequest.mo34321i();
        this.f33922v = mVGetPolylinesRequest;
    }
}
