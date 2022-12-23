package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVMultiRouteItineraryUpdateRequest implements TBase<MVMultiRouteItineraryUpdateRequest, _Fields>, Serializable, Cloneable, Comparable<MVMultiRouteItineraryUpdateRequest> {

    /* renamed from: b */
    public static final C25113c f29991b = new C25113c("originalRequest", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29992c = new C25113c("itinerary", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29993d = new C25113c("isOriginState", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f29994e = new C25113c("mode", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f29995f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29996g;
    private byte __isset_bitfield = 0;
    public boolean isOriginState;
    public MVTripPlanItinerary itinerary;
    public MVSimilarItineraryMode mode;
    private _Fields[] optionals = {_Fields.ORIGINAL_REQUEST, _Fields.IS_ORIGIN_STATE};
    public MVTripPlanRequest originalRequest;

    public enum _Fields implements C25085c {
        ORIGINAL_REQUEST(1, "originalRequest"),
        ITINERARY(2, "itinerary"),
        IS_ORIGIN_STATE(3, "isOriginState"),
        MODE(4, "mode");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            if (i == 1) {
                return ORIGINAL_REQUEST;
            }
            if (i == 2) {
                return ITINERARY;
            }
            if (i == 3) {
                return IS_ORIGIN_STATE;
            }
            if (i != 4) {
                return null;
            }
            return MODE;
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMultiRouteItineraryUpdateRequest$a */
    public static class C11586a extends C25239c<MVMultiRouteItineraryUpdateRequest> {
        public C11586a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMultiRouteItineraryUpdateRequest mVMultiRouteItineraryUpdateRequest = (MVMultiRouteItineraryUpdateRequest) tBase;
            MVTripPlanRequest mVTripPlanRequest = mVMultiRouteItineraryUpdateRequest.originalRequest;
            if (mVTripPlanRequest != null) {
                mVTripPlanRequest.mo34675H();
            }
            C25113c cVar = MVMultiRouteItineraryUpdateRequest.f29991b;
            gVar.mo61687K();
            if (mVMultiRouteItineraryUpdateRequest.originalRequest != null && mVMultiRouteItineraryUpdateRequest.mo34434i()) {
                gVar.mo61711x(MVMultiRouteItineraryUpdateRequest.f29991b);
                mVMultiRouteItineraryUpdateRequest.originalRequest.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMultiRouteItineraryUpdateRequest.itinerary != null) {
                gVar.mo61711x(MVMultiRouteItineraryUpdateRequest.f29992c);
                mVMultiRouteItineraryUpdateRequest.itinerary.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMultiRouteItineraryUpdateRequest.mo34430f()) {
                gVar.mo61711x(MVMultiRouteItineraryUpdateRequest.f29993d);
                gVar.mo61708u(mVMultiRouteItineraryUpdateRequest.isOriginState);
                gVar.mo61712y();
            }
            if (mVMultiRouteItineraryUpdateRequest.mode != null) {
                gVar.mo61711x(MVMultiRouteItineraryUpdateRequest.f29994e);
                gVar.mo61678B(mVMultiRouteItineraryUpdateRequest.mode.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMultiRouteItineraryUpdateRequest mVMultiRouteItineraryUpdateRequest = (MVMultiRouteItineraryUpdateRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVMultiRouteItineraryUpdateRequest.mode = MVSimilarItineraryMode.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVMultiRouteItineraryUpdateRequest.isOriginState = gVar.mo61690c();
                            mVMultiRouteItineraryUpdateRequest.mo34435j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                        mVMultiRouteItineraryUpdateRequest.itinerary = mVTripPlanItinerary;
                        mVTripPlanItinerary.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTripPlanRequest mVTripPlanRequest = new MVTripPlanRequest();
                    mVMultiRouteItineraryUpdateRequest.originalRequest = mVTripPlanRequest;
                    mVTripPlanRequest.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTripPlanRequest mVTripPlanRequest2 = mVMultiRouteItineraryUpdateRequest.originalRequest;
            if (mVTripPlanRequest2 != null) {
                mVTripPlanRequest2.mo34675H();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMultiRouteItineraryUpdateRequest$b */
    public static class C11587b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11586a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMultiRouteItineraryUpdateRequest$c */
    public static class C11588c extends C25240d<MVMultiRouteItineraryUpdateRequest> {
        public C11588c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMultiRouteItineraryUpdateRequest mVMultiRouteItineraryUpdateRequest = (MVMultiRouteItineraryUpdateRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMultiRouteItineraryUpdateRequest.mo34434i()) {
                bitSet.set(0);
            }
            if (mVMultiRouteItineraryUpdateRequest.mo34431g()) {
                bitSet.set(1);
            }
            if (mVMultiRouteItineraryUpdateRequest.mo34430f()) {
                bitSet.set(2);
            }
            if (mVMultiRouteItineraryUpdateRequest.mo34432h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVMultiRouteItineraryUpdateRequest.mo34434i()) {
                mVMultiRouteItineraryUpdateRequest.originalRequest.mo25202X0(jVar);
            }
            if (mVMultiRouteItineraryUpdateRequest.mo34431g()) {
                mVMultiRouteItineraryUpdateRequest.itinerary.mo25202X0(jVar);
            }
            if (mVMultiRouteItineraryUpdateRequest.mo34430f()) {
                jVar.mo61708u(mVMultiRouteItineraryUpdateRequest.isOriginState);
            }
            if (mVMultiRouteItineraryUpdateRequest.mo34432h()) {
                jVar.mo61678B(mVMultiRouteItineraryUpdateRequest.mode.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMultiRouteItineraryUpdateRequest mVMultiRouteItineraryUpdateRequest = (MVMultiRouteItineraryUpdateRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVTripPlanRequest mVTripPlanRequest = new MVTripPlanRequest();
                mVMultiRouteItineraryUpdateRequest.originalRequest = mVTripPlanRequest;
                mVTripPlanRequest.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                mVMultiRouteItineraryUpdateRequest.itinerary = mVTripPlanItinerary;
                mVTripPlanItinerary.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVMultiRouteItineraryUpdateRequest.isOriginState = jVar.mo61690c();
                mVMultiRouteItineraryUpdateRequest.mo34435j();
            }
            if (T.get(3)) {
                mVMultiRouteItineraryUpdateRequest.mode = MVSimilarItineraryMode.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMultiRouteItineraryUpdateRequest$d */
    public static class C11589d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11588c(0);
        }
    }

    static {
        new C17394d0("MVMultiRouteItineraryUpdateRequest");
        HashMap hashMap = new HashMap();
        f29995f = hashMap;
        hashMap.put(C25239c.class, new C11587b());
        hashMap.put(C25240d.class, new C11589d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ORIGINAL_REQUEST, new FieldMetaData("originalRequest", (byte) 2, new StructMetaData(MVTripPlanRequest.class)));
        enumMap.put(_Fields.ITINERARY, new FieldMetaData("itinerary", (byte) 3, new StructMetaData(MVTripPlanItinerary.class)));
        enumMap.put(_Fields.IS_ORIGIN_STATE, new FieldMetaData("isOriginState", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MODE, new FieldMetaData("mode", (byte) 3, new EnumMetaData(MVSimilarItineraryMode.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29996g = unmodifiableMap;
        FieldMetaData.m61947a(MVMultiRouteItineraryUpdateRequest.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f29995f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29995f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMultiRouteItineraryUpdateRequest mVMultiRouteItineraryUpdateRequest = (MVMultiRouteItineraryUpdateRequest) obj;
        if (!getClass().equals(mVMultiRouteItineraryUpdateRequest.getClass())) {
            return getClass().getName().compareTo(mVMultiRouteItineraryUpdateRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34434i()).compareTo(Boolean.valueOf(mVMultiRouteItineraryUpdateRequest.mo34434i()));
        if (compareTo2 != 0 || ((mo34434i() && (compareTo2 = this.originalRequest.compareTo(mVMultiRouteItineraryUpdateRequest.originalRequest)) != 0) || (compareTo2 = Boolean.valueOf(mo34431g()).compareTo(Boolean.valueOf(mVMultiRouteItineraryUpdateRequest.mo34431g()))) != 0 || ((mo34431g() && (compareTo2 = this.itinerary.compareTo(mVMultiRouteItineraryUpdateRequest.itinerary)) != 0) || (compareTo2 = Boolean.valueOf(mo34430f()).compareTo(Boolean.valueOf(mVMultiRouteItineraryUpdateRequest.mo34430f()))) != 0 || ((mo34430f() && (compareTo2 = C25082a.m62848l(this.isOriginState, mVMultiRouteItineraryUpdateRequest.isOriginState)) != 0) || (compareTo2 = Boolean.valueOf(mo34432h()).compareTo(Boolean.valueOf(mVMultiRouteItineraryUpdateRequest.mo34432h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo34432h() || (compareTo = this.mode.compareTo(mVMultiRouteItineraryUpdateRequest.mode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMultiRouteItineraryUpdateRequest)) {
            return false;
        }
        MVMultiRouteItineraryUpdateRequest mVMultiRouteItineraryUpdateRequest = (MVMultiRouteItineraryUpdateRequest) obj;
        boolean i = mo34434i();
        boolean i2 = mVMultiRouteItineraryUpdateRequest.mo34434i();
        if ((i || i2) && (!i || !i2 || !this.originalRequest.mo34676a(mVMultiRouteItineraryUpdateRequest.originalRequest))) {
            return false;
        }
        boolean g = mo34431g();
        boolean g2 = mVMultiRouteItineraryUpdateRequest.mo34431g();
        if ((g || g2) && (!g || !g2 || !this.itinerary.mo34623a(mVMultiRouteItineraryUpdateRequest.itinerary))) {
            return false;
        }
        boolean f = mo34430f();
        boolean f2 = mVMultiRouteItineraryUpdateRequest.mo34430f();
        if ((f || f2) && (!f || !f2 || this.isOriginState != mVMultiRouteItineraryUpdateRequest.isOriginState)) {
            return false;
        }
        boolean h = mo34432h();
        boolean h2 = mVMultiRouteItineraryUpdateRequest.mo34432h();
        if ((h || h2) && (!h || !h2 || !this.mode.equals(mVMultiRouteItineraryUpdateRequest.mode))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34430f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34431g() {
        return this.itinerary != null;
    }

    /* renamed from: h */
    public final boolean mo34432h() {
        return this.mode != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34434i() {
        return this.originalRequest != null;
    }

    /* renamed from: j */
    public final void mo34435j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVMultiRouteItineraryUpdateRequest(");
        if (mo34434i()) {
            sb.append("originalRequest:");
            MVTripPlanRequest mVTripPlanRequest = this.originalRequest;
            if (mVTripPlanRequest == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVTripPlanRequest);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("itinerary:");
        MVTripPlanItinerary mVTripPlanItinerary = this.itinerary;
        if (mVTripPlanItinerary == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVTripPlanItinerary);
        }
        if (mo34430f()) {
            sb.append(", ");
            sb.append("isOriginState:");
            sb.append(this.isOriginState);
        }
        sb.append(", ");
        sb.append("mode:");
        MVSimilarItineraryMode mVSimilarItineraryMode = this.mode;
        if (mVSimilarItineraryMode == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVSimilarItineraryMode);
        }
        sb.append(")");
        return sb.toString();
    }
}
