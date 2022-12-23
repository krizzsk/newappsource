package p428cv;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.payment.ZoozVersion;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.payment.MVCustomerTokenResponse;
import com.tranzmate.moovit.protocol.payment.MVZoozVersion;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: cv.d */
public final class C16502d extends C13780t<C16501c, C16502d, MVCustomerTokenResponse> {

    /* renamed from: m */
    public String f43099m;

    /* renamed from: n */
    public ZoozVersion f43100n;

    /* renamed from: cv.d$a */
    public static /* synthetic */ class C16503a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43101a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.payment.MVZoozVersion[] r0 = com.tranzmate.moovit.protocol.payment.MVZoozVersion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43101a = r0
                com.tranzmate.moovit.protocol.payment.MVZoozVersion r1 = com.tranzmate.moovit.protocol.payment.MVZoozVersion.ZOOZ     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43101a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.payment.MVZoozVersion r1 = com.tranzmate.moovit.protocol.payment.MVZoozVersion.PAYMENTSOS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p428cv.C16502d.C16503a.<clinit>():void");
        }
    }

    public C16502d() {
        super(MVCustomerTokenResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        ZoozVersion zoozVersion;
        C16501c cVar = (C16501c) aVar;
        MVCustomerTokenResponse mVCustomerTokenResponse = (MVCustomerTokenResponse) tBase;
        this.f43099m = mVCustomerTokenResponse.customerToken;
        MVZoozVersion mVZoozVersion = mVCustomerTokenResponse.zoozVersion;
        int i = C16503a.f43101a[mVZoozVersion.ordinal()];
        if (i == 1) {
            zoozVersion = ZoozVersion.ZOOZ;
        } else if (i == 2) {
            zoozVersion = ZoozVersion.PAYMENTOS;
        } else {
            throw new IllegalArgumentException("Unknown type: " + mVZoozVersion);
        }
        this.f43100n = zoozVersion;
    }
}
