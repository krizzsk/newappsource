package p596jx;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerRides;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p394br.C13672m;
import p829tu.C19776g;

/* renamed from: jx.a0 */
public final class C17952a0 extends C13780t<C17978z, C17952a0, MVTodPassengerRides> {

    /* renamed from: m */
    public ArrayList f46020m;

    /* renamed from: n */
    public ArrayList f46021n;

    public C17952a0() {
        super(MVTodPassengerRides.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17978z zVar = (C17978z) aVar;
        MVTodPassengerRides mVTodPassengerRides = (MVTodPassengerRides) tBase;
        Context context = this.f51773b.f51759b;
        this.f46020m = C13720d.m34273c(mVTodPassengerRides.rides, (C13722f) null, new C13672m(1, this, context));
        this.f46021n = C13720d.m34273c(mVTodPassengerRides.subscriptions, (C13722f) null, new C19776g(context, 1));
    }
}
