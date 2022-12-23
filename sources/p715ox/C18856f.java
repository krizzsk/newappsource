package p715ox;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetZonesResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p543hq.C17478e;

/* renamed from: ox.f */
public final class C18856f extends C13780t<C18855e, C18856f, MVTodGetZonesResponse> {

    /* renamed from: m */
    public ArrayList f48007m;

    public C18856f() {
        super(MVTodGetZonesResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C18855e eVar = (C18855e) aVar;
        this.f48007m = C13720d.m34273c(((MVTodGetZonesResponse) tBase).zones, (C13722f) null, new C17478e(5));
    }
}
