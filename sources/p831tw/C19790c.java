package p831tw;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.taxi.MVTaxiEta;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: tw.c */
public final class C19790c extends C13780t<C19789b, C19790c, MVTaxiEta> {

    /* renamed from: m */
    public int f50311m;

    public C19790c() {
        super(MVTaxiEta.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19789b bVar = (C19789b) aVar;
        this.f50311m = ((MVTaxiEta) tBase).etaInMinutes;
    }
}
