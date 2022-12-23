package g30;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.metro.selection.MetroArea;
import com.tranzmate.moovit.protocol.metroinfo.MVFindMetroByLocationResponse;
import com.tranzmate.moovit.protocol.users.MVMetroArea;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: g30.b */
public final class C4769b extends C13780t<C4768a, C4769b, MVFindMetroByLocationResponse> {

    /* renamed from: m */
    public MetroArea f16114m;

    public C4769b() {
        super(MVFindMetroByLocationResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        MetroArea metroArea;
        C4768a aVar2 = (C4768a) aVar;
        MVFindMetroByLocationResponse mVFindMetroByLocationResponse = (MVFindMetroByLocationResponse) tBase;
        F f = mVFindMetroByLocationResponse.setField_;
        F f2 = MVFindMetroByLocationResponse._Fields.SUPPORTED_LOCATION;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            metroArea = null;
        } else if (f == f2) {
            metroArea = C13749c.m34325k((MVMetroArea) mVFindMetroByLocationResponse.value_);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot get field 'supportedLocation' because union is currently set to ");
            k.append(MVFindMetroByLocationResponse.m22543k((MVFindMetroByLocationResponse._Fields) mVFindMetroByLocationResponse.setField_).f63355a);
            throw new RuntimeException(k.toString());
        }
        this.f16114m = metroArea;
    }
}
