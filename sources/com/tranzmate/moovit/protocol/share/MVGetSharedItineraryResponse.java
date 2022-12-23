package com.tranzmate.moovit.protocol.share;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.gtfs.MVSupplementalData;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVGetSharedItineraryResponse implements TBase<MVGetSharedItineraryResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetSharedItineraryResponse> {

    /* renamed from: b */
    public static final C25113c f28310b = new C25113c("itinerary", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28311c = new C25113c("originalRequest", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28312d = new C25113c("supplementalData", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28313e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28314f;
    public MVTripPlanItinerary itinerary;
    private _Fields[] optionals = {_Fields.SUPPLEMENTAL_DATA};
    public MVTripPlanRequest originalRequest;
    public MVSupplementalData supplementalData;

    public enum _Fields implements C25085c {
        ITINERARY(1, "itinerary"),
        ORIGINAL_REQUEST(2, "originalRequest"),
        SUPPLEMENTAL_DATA(3, "supplementalData");
        
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
                return ITINERARY;
            }
            if (i == 2) {
                return ORIGINAL_REQUEST;
            }
            if (i != 3) {
                return null;
            }
            return SUPPLEMENTAL_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.share.MVGetSharedItineraryResponse$a */
    public static class C10523a extends C25239c<MVGetSharedItineraryResponse> {
        public C10523a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetSharedItineraryResponse mVGetSharedItineraryResponse = (MVGetSharedItineraryResponse) tBase;
            MVTripPlanItinerary mVTripPlanItinerary = mVGetSharedItineraryResponse.itinerary;
            MVTripPlanRequest mVTripPlanRequest = mVGetSharedItineraryResponse.originalRequest;
            if (mVTripPlanRequest != null) {
                mVTripPlanRequest.mo34675H();
            }
            C25113c cVar = MVGetSharedItineraryResponse.f28310b;
            gVar.mo61687K();
            if (mVGetSharedItineraryResponse.itinerary != null) {
                gVar.mo61711x(MVGetSharedItineraryResponse.f28310b);
                mVGetSharedItineraryResponse.itinerary.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVGetSharedItineraryResponse.originalRequest != null) {
                gVar.mo61711x(MVGetSharedItineraryResponse.f28311c);
                mVGetSharedItineraryResponse.originalRequest.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVGetSharedItineraryResponse.supplementalData != null && mVGetSharedItineraryResponse.mo31711h()) {
                gVar.mo61711x(MVGetSharedItineraryResponse.f28312d);
                mVGetSharedItineraryResponse.supplementalData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetSharedItineraryResponse mVGetSharedItineraryResponse = (MVGetSharedItineraryResponse) tBase;
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
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVSupplementalData mVSupplementalData = new MVSupplementalData();
                            mVGetSharedItineraryResponse.supplementalData = mVSupplementalData;
                            mVSupplementalData.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTripPlanRequest mVTripPlanRequest = new MVTripPlanRequest();
                        mVGetSharedItineraryResponse.originalRequest = mVTripPlanRequest;
                        mVTripPlanRequest.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                    mVGetSharedItineraryResponse.itinerary = mVTripPlanItinerary;
                    mVTripPlanItinerary.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTripPlanItinerary mVTripPlanItinerary2 = mVGetSharedItineraryResponse.itinerary;
            MVTripPlanRequest mVTripPlanRequest2 = mVGetSharedItineraryResponse.originalRequest;
            if (mVTripPlanRequest2 != null) {
                mVTripPlanRequest2.mo34675H();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.share.MVGetSharedItineraryResponse$b */
    public static class C10524b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10523a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.share.MVGetSharedItineraryResponse$c */
    public static class C10525c extends C25240d<MVGetSharedItineraryResponse> {
        public C10525c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetSharedItineraryResponse mVGetSharedItineraryResponse = (MVGetSharedItineraryResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetSharedItineraryResponse.mo31709f()) {
                bitSet.set(0);
            }
            if (mVGetSharedItineraryResponse.mo31710g()) {
                bitSet.set(1);
            }
            if (mVGetSharedItineraryResponse.mo31711h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVGetSharedItineraryResponse.mo31709f()) {
                mVGetSharedItineraryResponse.itinerary.mo25202X0(jVar);
            }
            if (mVGetSharedItineraryResponse.mo31710g()) {
                mVGetSharedItineraryResponse.originalRequest.mo25202X0(jVar);
            }
            if (mVGetSharedItineraryResponse.mo31711h()) {
                mVGetSharedItineraryResponse.supplementalData.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetSharedItineraryResponse mVGetSharedItineraryResponse = (MVGetSharedItineraryResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                mVGetSharedItineraryResponse.itinerary = mVTripPlanItinerary;
                mVTripPlanItinerary.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVTripPlanRequest mVTripPlanRequest = new MVTripPlanRequest();
                mVGetSharedItineraryResponse.originalRequest = mVTripPlanRequest;
                mVTripPlanRequest.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVSupplementalData mVSupplementalData = new MVSupplementalData();
                mVGetSharedItineraryResponse.supplementalData = mVSupplementalData;
                mVSupplementalData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.share.MVGetSharedItineraryResponse$d */
    public static class C10526d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10525c(0);
        }
    }

    static {
        new C17394d0("MVGetSharedItineraryResponse");
        HashMap hashMap = new HashMap();
        f28313e = hashMap;
        hashMap.put(C25239c.class, new C10524b());
        hashMap.put(C25240d.class, new C10526d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ITINERARY, new FieldMetaData("itinerary", (byte) 3, new StructMetaData(MVTripPlanItinerary.class)));
        enumMap.put(_Fields.ORIGINAL_REQUEST, new FieldMetaData("originalRequest", (byte) 3, new StructMetaData(MVTripPlanRequest.class)));
        enumMap.put(_Fields.SUPPLEMENTAL_DATA, new FieldMetaData("supplementalData", (byte) 2, new StructMetaData(MVSupplementalData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28314f = unmodifiableMap;
        FieldMetaData.m61947a(MVGetSharedItineraryResponse.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f28313e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28313e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetSharedItineraryResponse mVGetSharedItineraryResponse = (MVGetSharedItineraryResponse) obj;
        if (!getClass().equals(mVGetSharedItineraryResponse.getClass())) {
            return getClass().getName().compareTo(mVGetSharedItineraryResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31709f()).compareTo(Boolean.valueOf(mVGetSharedItineraryResponse.mo31709f()));
        if (compareTo2 != 0 || ((mo31709f() && (compareTo2 = this.itinerary.compareTo(mVGetSharedItineraryResponse.itinerary)) != 0) || (compareTo2 = Boolean.valueOf(mo31710g()).compareTo(Boolean.valueOf(mVGetSharedItineraryResponse.mo31710g()))) != 0 || ((mo31710g() && (compareTo2 = this.originalRequest.compareTo(mVGetSharedItineraryResponse.originalRequest)) != 0) || (compareTo2 = Boolean.valueOf(mo31711h()).compareTo(Boolean.valueOf(mVGetSharedItineraryResponse.mo31711h()))) != 0))) {
            return compareTo2;
        }
        if (!mo31711h() || (compareTo = this.supplementalData.compareTo(mVGetSharedItineraryResponse.supplementalData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetSharedItineraryResponse)) {
            return false;
        }
        MVGetSharedItineraryResponse mVGetSharedItineraryResponse = (MVGetSharedItineraryResponse) obj;
        boolean f = mo31709f();
        boolean f2 = mVGetSharedItineraryResponse.mo31709f();
        if ((f || f2) && (!f || !f2 || !this.itinerary.mo34623a(mVGetSharedItineraryResponse.itinerary))) {
            return false;
        }
        boolean g = mo31710g();
        boolean g2 = mVGetSharedItineraryResponse.mo31710g();
        if ((g || g2) && (!g || !g2 || !this.originalRequest.mo34676a(mVGetSharedItineraryResponse.originalRequest))) {
            return false;
        }
        boolean h = mo31711h();
        boolean h2 = mVGetSharedItineraryResponse.mo31711h();
        if ((h || h2) && (!h || !h2 || !this.supplementalData.mo27542a(mVGetSharedItineraryResponse.supplementalData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31709f() {
        return this.itinerary != null;
    }

    /* renamed from: g */
    public final boolean mo31710g() {
        return this.originalRequest != null;
    }

    /* renamed from: h */
    public final boolean mo31711h() {
        return this.supplementalData != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetSharedItineraryResponse(", "itinerary:");
        MVTripPlanItinerary mVTripPlanItinerary = this.itinerary;
        if (mVTripPlanItinerary == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanItinerary);
        }
        n.append(", ");
        n.append("originalRequest:");
        MVTripPlanRequest mVTripPlanRequest = this.originalRequest;
        if (mVTripPlanRequest == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanRequest);
        }
        if (mo31711h()) {
            n.append(", ");
            n.append("supplementalData:");
            MVSupplementalData mVSupplementalData = this.supplementalData;
            if (mVSupplementalData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSupplementalData);
            }
        }
        n.append(")");
        return n.toString();
    }
}
