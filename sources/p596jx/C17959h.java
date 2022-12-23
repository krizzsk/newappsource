package p596jx;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelFeeScreenInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodGetCancelFeeResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p502fx.C17116a;

/* renamed from: jx.h */
public final class C17959h extends C13780t<C17958g, C17959h, MVTodGetCancelFeeResponse> {

    /* renamed from: m */
    public CurrencyAmount f46026m;

    /* renamed from: n */
    public C17116a f46027n;

    public C17959h() {
        super(MVTodGetCancelFeeResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        String str;
        C17958g gVar = (C17958g) aVar;
        MVTodGetCancelFeeResponse mVTodGetCancelFeeResponse = (MVTodGetCancelFeeResponse) tBase;
        this.f46026m = C13749c.m34318d(mVTodGetCancelFeeResponse.cancelFee);
        MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo = mVTodGetCancelFeeResponse.cancelFeeScreenInfo;
        String str2 = null;
        if (mVTodCancelFeeScreenInfo.mo33375g()) {
            str = mVTodCancelFeeScreenInfo.title;
        } else {
            str = null;
        }
        if (mVTodCancelFeeScreenInfo.mo33374f()) {
            str2 = mVTodCancelFeeScreenInfo.message;
        }
        this.f46027n = new C17116a(str, str2);
    }
}
