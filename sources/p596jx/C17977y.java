package p596jx;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p502fx.C17122g;

/* renamed from: jx.y */
public final class C17977y extends C13780t<C17976x, C17977y, MVTodVehicleActionResponse> {

    /* renamed from: m */
    public C17122g f46062m;

    public C17977y() {
        super(MVTodVehicleActionResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17976x xVar = (C17976x) aVar;
        this.f46062m = C17964m.m44597d(this.f51773b.f51759b, ((MVTodVehicleActionResponse) tBase).info);
    }
}
