package p598jz;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.mapitems.MVCommercialData;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;
import p551hy.C17517b;

/* renamed from: jz.e */
public final class C17986e extends C13780t<C17985d, C17986e, MVCommercialData> {

    /* renamed from: m */
    public C17517b f46071m;

    public C17986e() {
        super(MVCommercialData.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17985d dVar = (C17985d) aVar;
        MVCommercialData mVCommercialData = (MVCommercialData) tBase;
        this.f46071m = new C17517b(7, mVCommercialData.title, mVCommercialData.commercialText);
    }
}
