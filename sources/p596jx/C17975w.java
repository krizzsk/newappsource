package p596jx;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p502fx.C17122g;

/* renamed from: jx.w */
public final class C17975w extends C13780t<C17974v, C17975w, MVTodPassengerActionResponse> {

    /* renamed from: m */
    public C17122g f46059m;

    public C17975w() {
        super(MVTodPassengerActionResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17974v vVar = (C17974v) aVar;
        this.f46059m = C17964m.m44597d(this.f51773b.f51759b, ((MVTodPassengerActionResponse) tBase).info);
    }
}
