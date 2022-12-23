package p575iz;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.mapitems.MVCarDetailsRequest;
import p824tp.C19746x;

/* renamed from: iz.a */
public final class C17680a extends C13778r<C17680a, C17681b, MVCarDetailsRequest> {
    public C17680a(C13752e eVar, String str) {
        super(eVar, C19746x.api_path_car_details_path, C17681b.class);
        RO mVCarDetailsRequest = new MVCarDetailsRequest();
        mVCarDetailsRequest.carId = str;
        this.f33922v = mVCarDetailsRequest;
    }
}
