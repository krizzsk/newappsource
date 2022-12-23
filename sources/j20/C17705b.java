package j20;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.moovit.protocol.search.MVForwardGeocodingResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: j20.b */
public final class C17705b extends C13780t<C17704a, C17705b, MVForwardGeocodingResponse> {

    /* renamed from: m */
    public LocationDescriptor f45449m;

    public C17705b() {
        super(MVForwardGeocodingResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17704a aVar2 = (C17704a) aVar;
        this.f45449m = LocationDescriptor.m17770k(C13749c.m34322h(((MVForwardGeocodingResponse) tBase).location));
    }
}
