package p520gr;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.app.carpool.coupon.CouponType;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.carpool.MVAssignCouponToPassengerResponse;
import com.tranzmate.moovit.protocol.carpool.MVCouponType;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Date;
import org.apache.thrift.TBase;

/* renamed from: gr.d */
public final class C17223d extends C13780t<C17222c, C17223d, MVAssignCouponToPassengerResponse> {

    /* renamed from: m */
    public CurrencyAmount f44521m;

    /* renamed from: n */
    public CurrencyAmount f44522n;

    /* renamed from: o */
    public Date f44523o;

    /* renamed from: p */
    public CouponType f44524p;

    /* renamed from: gr.d$a */
    public static /* synthetic */ class C17224a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44525a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.carpool.MVCouponType[] r0 = com.tranzmate.moovit.protocol.carpool.MVCouponType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44525a = r0
                com.tranzmate.moovit.protocol.carpool.MVCouponType r1 = com.tranzmate.moovit.protocol.carpool.MVCouponType.REFERRAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44525a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.carpool.MVCouponType r1 = com.tranzmate.moovit.protocol.carpool.MVCouponType.SOCIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p520gr.C17223d.C17224a.<clinit>():void");
        }
    }

    public C17223d() {
        super(MVAssignCouponToPassengerResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        CouponType couponType;
        C17222c cVar = (C17222c) aVar;
        MVAssignCouponToPassengerResponse mVAssignCouponToPassengerResponse = (MVAssignCouponToPassengerResponse) tBase;
        this.f44521m = C13749c.m34317c(mVAssignCouponToPassengerResponse.totalAmount);
        this.f44522n = C13749c.m34317c(mVAssignCouponToPassengerResponse.rideLimit);
        this.f44523o = new Date(mVAssignCouponToPassengerResponse.validUntil);
        MVCouponType mVCouponType = mVAssignCouponToPassengerResponse.couponType;
        int i = C17224a.f44525a[mVCouponType.ordinal()];
        if (i == 1) {
            couponType = CouponType.REFERRAL;
        } else if (i == 2) {
            couponType = CouponType.SOCIAL;
        } else {
            throw new IllegalArgumentException("Unknown coupon type: " + mVCouponType);
        }
        this.f44524p = couponType;
    }
}
