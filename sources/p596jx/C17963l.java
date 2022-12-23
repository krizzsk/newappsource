package p596jx;

import android.content.Context;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.app.tod.model.TodOrder;
import com.moovit.app.tod.order.TodPaymentInfo;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderAssignment;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodOrderResponse;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPaymentInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.TBase;
import p019b0.C1436m;
import p435de.C16596f;

/* renamed from: jx.l */
public final class C17963l extends C13780t<C17962k, C17963l, MVTodOrderResponse> {

    /* renamed from: m */
    public TodOrder f46040m;

    public C17963l() {
        super(MVTodOrderResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        MVTodOrderResponse mVTodOrderResponse = (MVTodOrderResponse) tBase;
        Context context = ((C17962k) aVar).f51759b;
        if (!C13717b.m34258e(mVTodOrderResponse.assignments)) {
            long j = mVTodOrderResponse.expirationTime;
            long currentTimeMillis = System.currentTimeMillis();
            if (j - currentTimeMillis <= 0) {
                C16596f.m42113a().mo49363b(mVTodOrderResponse.toString());
                C16596f.m42113a().mo49364c(new IllegalArgumentException(String.format(Locale.getDefault(), "Order expiration time in the past (curr:%1$d, exp:%2$d)", new Object[]{Long.valueOf(currentTimeMillis), Long.valueOf(j)})));
                j = TimeUnit.MINUTES.toMillis(1) + currentTimeMillis;
            }
            long j2 = j;
            ServerId serverId = new ServerId(mVTodOrderResponse.orderId);
            List<MVTodOrderAssignment> list = mVTodOrderResponse.assignments;
            C1436m mVar = new C1436m(context, 2);
            String str = null;
            ArrayList<O> c = C13720d.m34273c(list, (C13722f) null, mVar);
            MVTodPaymentInfo mVTodPaymentInfo = mVTodOrderResponse.paymentInfo;
            if (mVTodPaymentInfo.mo33636f()) {
                str = mVTodPaymentInfo.discountContextId;
            }
            this.f46040m = new TodOrder(serverId, j2, c, new TodPaymentInfo(mVTodPaymentInfo.paymentContext, mVTodPaymentInfo.paymentDescription, str));
            return;
        }
        throw new BadResponseException("Order assignments may not be null or empty!");
    }
}
