package p479ey;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.users.MVLoginResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;
import p377ay.C13547a;
import p527gy.C17259d;

/* renamed from: ey.n */
public final class C16904n extends C13780t<C16902m, C16904n, MVLoginResponse> {

    /* renamed from: m */
    public C17259d f43919m;

    /* renamed from: n */
    public C13547a f43920n;

    /* renamed from: o */
    public boolean f43921o;

    public C16904n() {
        super(MVLoginResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        MVLoginResponse mVLoginResponse = (MVLoginResponse) tBase;
        this.f43920n = new C13547a(new ServerId(mVLoginResponse.accountId), ((C16902m) aVar).f43917w);
        this.f43921o = mVLoginResponse.isNewAccount;
        this.f43919m = C16908r.m42703q(mVLoginResponse.userProfile);
    }
}
