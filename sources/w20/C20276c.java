package w20;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.tripplanner.MVWalkPolyline;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;
import p977zz.C20964s0;

/* renamed from: w20.c */
public final class C20276c extends C13780t<C20275b, C20276c, MVWalkPolyline> {

    /* renamed from: m */
    public Polylon f51410m = null;

    /* renamed from: n */
    public ServerId f51411n = null;

    public C20276c() {
        super(MVWalkPolyline.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C20275b bVar = (C20275b) aVar;
        MVWalkPolyline mVWalkPolyline = (MVWalkPolyline) tBase;
        String str = mVWalkPolyline.polyline;
        if (!C20964s0.m49090h(str)) {
            this.f51410m = Polylon.m40195m(str);
        }
        if (mVWalkPolyline.mo34910f()) {
            this.f51411n = new ServerId(mVWalkPolyline.pathwayId);
        }
    }
}
