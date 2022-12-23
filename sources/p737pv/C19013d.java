package p737pv;

import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ridesharing.model.Event;
import com.moovit.ridesharing.model.EventBookingBucket;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsResponse;
import d70.C16536a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p684nq.C18583d;
import p826tr.C19752b;

/* renamed from: pv.d */
public final class C19013d extends C13780t<C19012c, C19013d, MVRSEventBookingBucketsResponse> {

    /* renamed from: m */
    public Event f48368m = null;

    /* renamed from: n */
    public List<EventBookingBucket> f48369n = null;

    public C19013d() {
        super(MVRSEventBookingBucketsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19012c cVar = (C19012c) aVar;
        MVRSEventBookingBucketsResponse mVRSEventBookingBucketsResponse = (MVRSEventBookingBucketsResponse) tBase;
        this.f48368m = C16536a.m42029a(mVRSEventBookingBucketsResponse.superEvent);
        if (mVRSEventBookingBucketsResponse.mo31244f()) {
            ArrayList<O> c = C13720d.m34273c(mVRSEventBookingBucketsResponse.buckets, (C13722f) null, new C19752b(5));
            C13723g.m34285f(c, (ArrayList) null, new C18583d(5));
            this.f48369n = Collections.unmodifiableList(c);
        }
    }
}
