package com.moovit.app.ridesharing.booking;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c70.C13749c;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.ridesharing.model.EventVehicleType;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVVehicleType;
import com.tranzmate.moovit.protocol.ridesharing.MVRSShareContent;
import d70.C16536a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20942h0;
import p977zz.C20944i0;
import p977zz.C20964s0;
import vi0.C25111a;
import xi0.C25276a;

public final class EventBookingParams implements Parcelable {
    public static final Parcelable.Creator<EventBookingParams> CREATOR = new C15252a();

    /* renamed from: i */
    public static final C20942h0 f39348i;

    /* renamed from: j */
    public static final C15253b f39349j = new C15253b(EventBookingParams.class);

    /* renamed from: b */
    public final ServerId f39350b;

    /* renamed from: c */
    public final LocationDescriptor f39351c;

    /* renamed from: d */
    public final ServerId f39352d;

    /* renamed from: e */
    public final C20944i0<ServerId, EventVehicleType> f39353e;

    /* renamed from: f */
    public final C20944i0<ServerId, EventVehicleType> f39354f;

    /* renamed from: g */
    public final String f39355g;

    /* renamed from: h */
    public final String f39356h;

    /* renamed from: com.moovit.app.ridesharing.booking.EventBookingParams$a */
    public class C15252a implements Parcelable.Creator<EventBookingParams> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventBookingParams) C19612n.m46981v(parcel, EventBookingParams.f39349j);
        }

        public final Object[] newArray(int i) {
            return new EventBookingParams[i];
        }
    }

    /* renamed from: com.moovit.app.ridesharing.booking.EventBookingParams$b */
    public class C15253b extends C19619s<EventBookingParams> {
        public C15253b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            pVar.getClass();
            ServerId serverId2 = new ServerId(pVar.mo51924l());
            LocationDescriptor locationDescriptor = (LocationDescriptor) pVar.mo51962q(LocationDescriptor.f23646m);
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            C20942h0 h0Var = EventBookingParams.f39348i;
            return new EventBookingParams(serverId2, locationDescriptor, serverId, (C20944i0) pVar.mo51962q(h0Var), (C20944i0) pVar.mo51962q(h0Var), pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EventBookingParams eventBookingParams = (EventBookingParams) obj;
            ServerId serverId = eventBookingParams.f39350b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51967q(eventBookingParams.f39351c, LocationDescriptor.f23645l);
            ServerId serverId2 = eventBookingParams.f39352d;
            if (serverId2 == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId2.f15142b);
            }
            C20944i0<ServerId, EventVehicleType> i0Var = eventBookingParams.f39353e;
            C20942h0 h0Var = EventBookingParams.f39348i;
            qVar.mo51967q(i0Var, h0Var);
            qVar.mo51967q(eventBookingParams.f39354f, h0Var);
            qVar.mo51955t(eventBookingParams.f39355g);
            qVar.mo51955t(eventBookingParams.f39356h);
        }
    }

    static {
        ServerId.C4254b bVar = ServerId.f15140e;
        ServerId.C4255c cVar = ServerId.f15141f;
        C19577c<EventVehicleType> cVar2 = EventVehicleType.CODER;
        f39348i = new C20942h0(cVar, cVar2, bVar, cVar2);
    }

    public EventBookingParams(ServerId serverId, LocationDescriptor locationDescriptor) {
        this(serverId, locationDescriptor, (ServerId) null, (C20944i0<ServerId, EventVehicleType>) null, (C20944i0<ServerId, EventVehicleType>) null, (String) null, (String) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.moovit.network.model.ServerId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.moovit.network.model.ServerId} */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.app.ridesharing.booking.EventBookingParams m39003b(android.net.Uri r17) throws java.lang.Exception {
        /*
            r0 = r17
            java.util.List r1 = r17.getPathSegments()
            java.lang.String r2 = "ee"
            boolean r1 = r1.contains(r2)
            r2 = 0
            if (r1 == 0) goto L_0x00b2
            java.lang.String r0 = r17.getLastPathSegment()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r3 = 11
            byte[] r0 = android.util.Base64.decode(r0, r3)
            r1.<init>(r0)
            xi0.a r0 = new xi0.a
            r0.<init>((java.io.InputStream) r1)
            vi0.a r1 = new vi0.a
            r1.<init>(r0)
            com.tranzmate.moovit.protocol.ridesharing.MVRSShareContent r0 = new com.tranzmate.moovit.protocol.ridesharing.MVRSShareContent
            r0.<init>()
            r0.mo25201C1(r1)
            int r1 = r0.superEventId
            com.moovit.network.model.ServerId r4 = new com.moovit.network.model.ServerId
            r4.<init>(r1)
            boolean r1 = r0.mo31357i()
            if (r1 == 0) goto L_0x0045
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r1 = r0.referralLocation
            com.moovit.transit.LocationDescriptor r1 = c70.C13749c.m34324j(r1, r2)
            r5 = r1
            goto L_0x0046
        L_0x0045:
            r5 = r2
        L_0x0046:
            boolean r1 = r0.mo31355h()
            if (r1 == 0) goto L_0x0055
            int r1 = r0.referralBucketId
            com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
            r3.<init>(r1)
            r6 = r3
            goto L_0x0056
        L_0x0055:
            r6 = r2
        L_0x0056:
            boolean r1 = r0.mo31353f()
            if (r1 == 0) goto L_0x0075
            boolean r1 = r0.mo31354g()
            if (r1 == 0) goto L_0x0075
            int r1 = r0.referralArrivalEventId
            com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
            r3.<init>(r1)
            com.tranzmate.moovit.protocol.common.MVVehicleType r1 = r0.referralArrivalVehicleType
            com.moovit.ridesharing.model.EventVehicleType r1 = d70.C16536a.m42034f(r1)
            zz.i0 r7 = new zz.i0
            r7.<init>(r3, r1)
            goto L_0x0076
        L_0x0075:
            r7 = r2
        L_0x0076:
            boolean r1 = r0.mo31358j()
            if (r1 == 0) goto L_0x0095
            boolean r1 = r0.mo31359k()
            if (r1 == 0) goto L_0x0095
            int r1 = r0.referralReturnEventId
            com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
            r3.<init>(r1)
            com.tranzmate.moovit.protocol.common.MVVehicleType r1 = r0.referralReturnVehicleType
            com.moovit.ridesharing.model.EventVehicleType r1 = d70.C16536a.m42034f(r1)
            zz.i0 r8 = new zz.i0
            r8.<init>(r3, r1)
            goto L_0x0096
        L_0x0095:
            r8 = r2
        L_0x0096:
            boolean r1 = r0.mo31360l()
            if (r1 == 0) goto L_0x00a0
            java.lang.String r1 = r0.referralUserKey
            r9 = r1
            goto L_0x00a1
        L_0x00a0:
            r9 = r2
        L_0x00a1:
            boolean r1 = r0.mo31361m()
            if (r1 == 0) goto L_0x00a9
            java.lang.String r2 = r0.referralUserName
        L_0x00a9:
            r10 = r2
            com.moovit.app.ridesharing.booking.EventBookingParams r0 = new com.moovit.app.ridesharing.booking.EventBookingParams
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x013a
        L_0x00b2:
            java.lang.String r1 = r17.getLastPathSegment()
            com.moovit.network.model.ServerId r4 = com.moovit.network.model.ServerId.m11392b(r1)
            java.lang.String r1 = "lat"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.String r3 = "lon"
            java.lang.String r3 = r0.getQueryParameter(r3)
            java.lang.String r5 = "name"
            java.lang.String r11 = r0.getQueryParameter(r5)
            android.os.Parcelable$Creator<com.moovit.transit.LocationDescriptor> r5 = com.moovit.transit.LocationDescriptor.CREATOR
            double r5 = java.lang.Double.parseDouble(r1)     // Catch:{ Exception -> 0x00f0 }
            double r7 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x00f0 }
            com.moovit.transit.LocationDescriptor r1 = new com.moovit.transit.LocationDescriptor     // Catch:{ Exception -> 0x00f0 }
            com.moovit.transit.LocationDescriptor$LocationType r3 = com.moovit.transit.LocationDescriptor.LocationType.COORDINATE     // Catch:{ Exception -> 0x00f0 }
            com.moovit.transit.LocationDescriptor$SourceType r9 = com.moovit.transit.LocationDescriptor.SourceType.EXTERNAL     // Catch:{ Exception -> 0x00f0 }
            com.moovit.commons.geo.LatLonE6 r13 = com.moovit.commons.geo.LatLonE6.m40176g(r5, r7)     // Catch:{ Exception -> 0x00f0 }
            r5 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r6 = r1
            r7 = r3
            r8 = r9
            r9 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00f0 }
            r5 = r1
            goto L_0x00f1
        L_0x00f0:
            r5 = r2
        L_0x00f1:
            java.lang.String r1 = "bi"
            java.lang.String r1 = r0.getQueryParameter(r1)
            boolean r3 = p977zz.C20964s0.m49090h(r1)
            if (r3 != 0) goto L_0x0107
            boolean r3 = p977zz.C20964s0.m49089g(r1)
            if (r3 == 0) goto L_0x0107
            com.moovit.network.model.ServerId r2 = com.moovit.network.model.ServerId.m11392b(r1)
        L_0x0107:
            r6 = r2
            java.lang.String r1 = "ai"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.String r2 = "avt"
            java.lang.String r2 = r0.getQueryParameter(r2)
            zz.i0 r7 = m39004c(r1, r2)
            java.lang.String r1 = "ri"
            java.lang.String r1 = r0.getQueryParameter(r1)
            java.lang.String r2 = "rvt"
            java.lang.String r2 = r0.getQueryParameter(r2)
            zz.i0 r8 = m39004c(r1, r2)
            java.lang.String r1 = "ruk"
            java.lang.String r9 = r0.getQueryParameter(r1)
            java.lang.String r1 = "run"
            java.lang.String r10 = r0.getQueryParameter(r1)
            com.moovit.app.ridesharing.booking.EventBookingParams r0 = new com.moovit.app.ridesharing.booking.EventBookingParams
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x013a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ridesharing.booking.EventBookingParams.m39003b(android.net.Uri):com.moovit.app.ridesharing.booking.EventBookingParams");
    }

    /* renamed from: c */
    public static C20944i0<ServerId, EventVehicleType> m39004c(String str, String str2) {
        MVVehicleType findByValue;
        if (C20964s0.m49089g(str) && C20964s0.m49089g(str2) && (findByValue = MVVehicleType.findByValue(Integer.parseInt(str2))) != null) {
            return new C20944i0<>(ServerId.m11392b(str), C16536a.m42034f(findByValue));
        }
        return null;
    }

    /* renamed from: d */
    public static Uri m39005d(EventBookingParams eventBookingParams) throws Exception {
        int i = eventBookingParams.f39350b.f15142b;
        MVRSShareContent mVRSShareContent = new MVRSShareContent();
        mVRSShareContent.superEventId = i;
        mVRSShareContent.mo31366s();
        LocationDescriptor locationDescriptor = eventBookingParams.f39351c;
        if (locationDescriptor != null) {
            mVRSShareContent.referralLocation = C13749c.m34335u(locationDescriptor);
        }
        ServerId serverId = eventBookingParams.f39352d;
        if (serverId != null) {
            mVRSShareContent.referralBucketId = serverId.f15142b;
            mVRSShareContent.mo31364q();
        }
        C20944i0<ServerId, EventVehicleType> i0Var = eventBookingParams.f39353e;
        if (i0Var != null) {
            mVRSShareContent.referralArrivalEventId = ((ServerId) i0Var.f52692a).f15142b;
            mVRSShareContent.mo31363p();
            mVRSShareContent.referralArrivalVehicleType = C16536a.m42039k((EventVehicleType) eventBookingParams.f39353e.f52693b);
        }
        C20944i0<ServerId, EventVehicleType> i0Var2 = eventBookingParams.f39354f;
        if (i0Var2 != null) {
            mVRSShareContent.referralArrivalEventId = ((ServerId) i0Var2.f52692a).f15142b;
            mVRSShareContent.mo31363p();
            mVRSShareContent.referralArrivalVehicleType = C16536a.m42039k((EventVehicleType) eventBookingParams.f39354f.f52693b);
        }
        String str = eventBookingParams.f39355g;
        if (str != null) {
            mVRSShareContent.referralUserKey = str;
        }
        String str2 = eventBookingParams.f39356h;
        if (str2 != null) {
            mVRSShareContent.referralUserName = str2;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mVRSShareContent.mo25202X0(new C25111a(new C25276a((OutputStream) byteArrayOutputStream)));
        return new Uri.Builder().scheme("https").authority("moovitapp.com").appendEncodedPath("ee").appendEncodedPath(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 11)).build();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39349j);
    }

    public EventBookingParams(ServerId serverId, LocationDescriptor locationDescriptor, ServerId serverId2, C20944i0<ServerId, EventVehicleType> i0Var, C20944i0<ServerId, EventVehicleType> i0Var2, String str, String str2) {
        C21100e.m49373x(serverId, "eventId");
        this.f39350b = serverId;
        this.f39351c = locationDescriptor;
        this.f39352d = serverId2;
        this.f39353e = i0Var;
        this.f39354f = i0Var2;
        this.f39355g = str;
        this.f39356h = str2;
    }
}
