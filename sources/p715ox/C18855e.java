package p715ox;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetZonesRequest;

/* renamed from: ox.e */
public final class C18855e extends C13778r<C18855e, C18856f, MVTodGetZonesRequest> {

    /* renamed from: w */
    public final String f48006w;

    public C18855e(C13752e eVar, String str) {
        super(eVar, R.string.api_path_tod_shuttles_get_zones_request, C18856f.class);
        this.f48006w = str;
        RO mVTodGetZonesRequest = new MVTodGetZonesRequest();
        mVTodGetZonesRequest.providerId = str;
        this.f33922v = mVTodGetZonesRequest;
    }
}
