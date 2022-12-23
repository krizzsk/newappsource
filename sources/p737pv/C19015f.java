package p737pv;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ridesharing.model.EventBookingOption;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p190o1.C5909d;
import p638lr.C18262i;

/* renamed from: pv.f */
public final class C19015f extends C13780t<C19014e, C19015f, MVRSEventBookingStepsResponse> {

    /* renamed from: m */
    public List<EventBookingOption> f48376m;

    public C19015f() {
        super(MVRSEventBookingStepsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19014e eVar = (C19014e) aVar;
        ArrayList<O> c = C13720d.m34273c(((MVRSEventBookingStepsResponse) tBase).transitions, (C13722f) null, new C18262i(6));
        Collections.sort(c, new C5909d(2));
        this.f48376m = Collections.unmodifiableList(c);
    }
}
