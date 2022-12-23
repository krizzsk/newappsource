package p827ts;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.tranzmate.moovit.protocol.users.MVUserAvatarResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: ts.e */
public final class C19758e extends C13780t<C19757d, C19758e, MVUserAvatarResponse> {

    /* renamed from: m */
    public Image f50237m;

    public C19758e() {
        super(MVUserAvatarResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19757d dVar = (C19757d) aVar;
        this.f50237m = C16028g.m40823a(Integer.valueOf(((MVUserAvatarResponse) tBase).landingPageImage));
    }
}
