package p973zv;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.share.MVGetSharedItineraryRequest;
import p824tp.C19728f;
import q00.C19047a;

/* renamed from: zv.c */
public final class C20913c extends C13778r<C20913c, C20914d, MVGetSharedItineraryRequest> {

    /* renamed from: w */
    public final C19728f f52659w;

    /* renamed from: x */
    public final C19047a f52660x;

    public C20913c(C13752e eVar, C19728f fVar, C19047a aVar, String str) {
        super(eVar, R.string.api_path_get_shared_itinerary, C20914d.class);
        this.f52659w = fVar;
        this.f52660x = aVar;
        RO mVGetSharedItineraryRequest = new MVGetSharedItineraryRequest();
        mVGetSharedItineraryRequest.f28308id = str;
        this.f33922v = mVGetSharedItineraryRequest;
    }
}
