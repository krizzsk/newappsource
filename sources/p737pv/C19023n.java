package p737pv;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.util.time.C7925b;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeResponse;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.TBase;

/* renamed from: pv.n */
public final class C19023n extends C13780t<C19022m, C19023n, MVRSEventRideRealTimeResponse> {

    /* renamed from: m */
    public EventRequest f48384m;

    /* renamed from: n */
    public int f48385n = 0;

    /* renamed from: o */
    public int f48386o = -1;

    /* renamed from: p */
    public long f48387p = -1;

    /* renamed from: q */
    public LatLonE6 f48388q;

    /* renamed from: r */
    public boolean f48389r;

    /* renamed from: pv.n$a */
    public static /* synthetic */ class C19024a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48390a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus[] r0 = com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48390a = r0
                com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus r1 = com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f48390a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus r1 = com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus.WAITINGFOR_BUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f48390a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus r1 = com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus.ON_BUS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f48390a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus r1 = com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus.NOT_REPORTED_ON_BUS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f48390a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus r1 = com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeStatus.BOARDED_ON_BUS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p737pv.C19023n.C19024a.<clinit>():void");
        }
    }

    public C19023n() {
        super(MVRSEventRideRealTimeResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        int i;
        int i2;
        long j;
        LatLonE6 latLonE6;
        MVRSEventRideRealTimeResponse mVRSEventRideRealTimeResponse = (MVRSEventRideRealTimeResponse) tBase;
        this.f48384m = ((C19022m) aVar).f48383w;
        MVRSEventRideRealTimeStatus mVRSEventRideRealTimeStatus = mVRSEventRideRealTimeResponse.status;
        int i3 = C19024a.f48390a[mVRSEventRideRealTimeStatus.ordinal()];
        boolean z = false;
        if (i3 != 1) {
            i = 2;
            if (i3 == 2) {
                i = 1;
            } else if (i3 == 3) {
                i = 3;
            } else if (i3 == 4) {
                i = 4;
            } else if (i3 != 5) {
                throw new IllegalStateException("Unknown ride status: " + mVRSEventRideRealTimeStatus);
            }
        } else {
            i = 0;
        }
        this.f48385n = i;
        if (mVRSEventRideRealTimeResponse.mo31296f()) {
            i2 = mVRSEventRideRealTimeResponse.etaInSeconds;
        } else {
            i2 = -1;
        }
        this.f48386o = i2;
        if (i2 != -1) {
            j = TimeUnit.SECONDS.toMillis((long) this.f48386o) + System.currentTimeMillis();
        } else {
            j = -1;
        }
        this.f48387p = j;
        if (mVRSEventRideRealTimeResponse.mo31298h()) {
            latLonE6 = C13749c.m34322h(mVRSEventRideRealTimeResponse.vehicleLocation);
        } else {
            latLonE6 = null;
        }
        this.f48388q = latLonE6;
        int i4 = this.f48385n;
        if ((i4 == 4 || i4 == 3) && this.f48387p < -60) {
            z = true;
        }
        this.f48389r = z;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("EventRealTimeResponse[eventRequestId=");
        k.append(this.f48384m.f42953c.f42944c);
        k.append(", status=");
        k.append(this.f48385n);
        k.append(", etaInSeconds=");
        k.append(this.f48386o);
        k.append(", eta=");
        k.append(C7925b.m18013a(this.f48387p));
        k.append(", location=");
        k.append(this.f48388q);
        k.append(", isEnded=");
        return C13715c.m34247m(k, this.f48389r, ']');
    }
}
