package p826tr;

import c00.C13720d;
import c00.C13722f;
import c00.C13733n;
import c70.C13746a;
import c70.C13780t;
import com.moovit.app.carpool.ridedetails.route.network.PolylineDescriptor;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.tripplanner.MVGetPolylinesResponse;
import com.tranzmate.moovit.protocol.tripplanner.MVPolyLineMode;
import com.tranzmate.moovit.protocol.tripplanner.MVPolylineDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p977zz.C20964s0;

/* renamed from: tr.a */
public final class C19750a extends C13780t<C19753c, C19750a, MVGetPolylinesResponse> {

    /* renamed from: n */
    public static final C19751a f50227n = new C19751a();

    /* renamed from: m */
    public ArrayList f50228m;

    /* renamed from: tr.a$a */
    public class C19751a implements C13733n<MVPolylineDescriptor, PolylineDescriptor> {
        public final Object convert(Object obj) throws Exception {
            Polylon polylon;
            int i;
            MVPolylineDescriptor mVPolylineDescriptor = (MVPolylineDescriptor) obj;
            if (!C20964s0.m49090h(mVPolylineDescriptor.polyline)) {
                polylon = Polylon.m40195m(mVPolylineDescriptor.polyline);
            } else {
                polylon = null;
            }
            MVPolyLineMode mVPolyLineMode = mVPolylineDescriptor.mode;
            if (mVPolyLineMode.equals(MVPolyLineMode.WALK)) {
                i = 0;
            } else if (mVPolyLineMode.equals(MVPolyLineMode.CAR)) {
                i = 1;
            } else {
                throw new IllegalArgumentException("No matching found for: " + mVPolyLineMode);
            }
            return new PolylineDescriptor(polylon, i);
        }
    }

    public C19750a() {
        super(MVGetPolylinesResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19753c cVar = (C19753c) aVar;
        ArrayList<O> c = C13720d.m34273c(((MVGetPolylinesResponse) tBase).polylineDescriptors, (C13722f) null, f50227n);
        this.f50228m = c;
        for (O o : c) {
            Polyline polyline = o.f37912c;
            if (polyline != null) {
                polyline.mo24339Z0();
            }
        }
    }
}
