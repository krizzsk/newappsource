package com.tranzmate.moovit.protocol.carpool;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
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

public class MVPassengerUpdateInterestRequest implements TBase<MVPassengerUpdateInterestRequest, _Fields>, Serializable, Cloneable, Comparable<MVPassengerUpdateInterestRequest> {

    /* renamed from: b */
    public static final C25113c f24828b = new C25113c("futureRideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24829c = new C25113c("isInterested", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f24830d = new C25113c("priceValidation", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f24831e = new C25113c("stops", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f24832f = new C25113c("detourDetails", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f24833g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f24834h;
    private byte __isset_bitfield = 0;
    public MVCarPoolRideDetour detourDetails;
    public int futureRideId;
    public boolean isInterested;
    private _Fields[] optionals = {_Fields.PRICE_VALIDATION, _Fields.DETOUR_DETAILS};
    public long priceValidation;
    public MVPassengerStops stops;

    public enum _Fields implements C25085c {
        FUTURE_RIDE_ID(1, "futureRideId"),
        IS_INTERESTED(2, "isInterested"),
        PRICE_VALIDATION(3, "priceValidation"),
        STOPS(4, "stops"),
        DETOUR_DETAILS(5, "detourDetails");
        
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
                return FUTURE_RIDE_ID;
            }
            if (i == 2) {
                return IS_INTERESTED;
            }
            if (i == 3) {
                return PRICE_VALIDATION;
            }
            if (i == 4) {
                return STOPS;
            }
            if (i != 5) {
                return null;
            }
            return DETOUR_DETAILS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestRequest$a */
    public static class C8283a extends C25239c<MVPassengerUpdateInterestRequest> {
        public C8283a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails;
            MVPassengerUpdateInterestRequest mVPassengerUpdateInterestRequest = (MVPassengerUpdateInterestRequest) tBase;
            MVPassengerStops mVPassengerStops = mVPassengerUpdateInterestRequest.stops;
            if (mVPassengerStops != null) {
                mVPassengerStops.mo25808j();
            }
            MVCarPoolRideDetour mVCarPoolRideDetour = mVPassengerUpdateInterestRequest.detourDetails;
            if (!(mVCarPoolRideDetour == null || (mVCarPoolRideDetourDetails = mVCarPoolRideDetour.detourDetails) == null)) {
                mVCarPoolRideDetourDetails.mo25488l();
            }
            C25113c cVar = MVPassengerUpdateInterestRequest.f24828b;
            gVar.mo61687K();
            gVar.mo61711x(MVPassengerUpdateInterestRequest.f24828b);
            gVar.mo61678B(mVPassengerUpdateInterestRequest.futureRideId);
            gVar.mo61712y();
            gVar.mo61711x(MVPassengerUpdateInterestRequest.f24829c);
            gVar.mo61708u(mVPassengerUpdateInterestRequest.isInterested);
            gVar.mo61712y();
            if (mVPassengerUpdateInterestRequest.mo25817i()) {
                gVar.mo61711x(MVPassengerUpdateInterestRequest.f24830d);
                gVar.mo61679C(mVPassengerUpdateInterestRequest.priceValidation);
                gVar.mo61712y();
            }
            if (mVPassengerUpdateInterestRequest.stops != null) {
                gVar.mo61711x(MVPassengerUpdateInterestRequest.f24831e);
                mVPassengerUpdateInterestRequest.stops.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerUpdateInterestRequest.detourDetails != null && mVPassengerUpdateInterestRequest.mo25813f()) {
                gVar.mo61711x(MVPassengerUpdateInterestRequest.f24832f);
                mVPassengerUpdateInterestRequest.detourDetails.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails;
            MVPassengerUpdateInterestRequest mVPassengerUpdateInterestRequest = (MVPassengerUpdateInterestRequest) tBase;
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
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVCarPoolRideDetour mVCarPoolRideDetour = new MVCarPoolRideDetour();
                                    mVPassengerUpdateInterestRequest.detourDetails = mVCarPoolRideDetour;
                                    mVCarPoolRideDetour.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                                mVPassengerUpdateInterestRequest.stops = mVPassengerStops;
                                mVPassengerStops.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 10) {
                            mVPassengerUpdateInterestRequest.priceValidation = gVar.mo61697j();
                            mVPassengerUpdateInterestRequest.mo25821m();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVPassengerUpdateInterestRequest.isInterested = gVar.mo61690c();
                        mVPassengerUpdateInterestRequest.mo25820l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPassengerUpdateInterestRequest.futureRideId = gVar.mo61696i();
                    mVPassengerUpdateInterestRequest.mo25819k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPassengerStops mVPassengerStops2 = mVPassengerUpdateInterestRequest.stops;
            if (mVPassengerStops2 != null) {
                mVPassengerStops2.mo25808j();
            }
            MVCarPoolRideDetour mVCarPoolRideDetour2 = mVPassengerUpdateInterestRequest.detourDetails;
            if (mVCarPoolRideDetour2 != null && (mVCarPoolRideDetourDetails = mVCarPoolRideDetour2.detourDetails) != null) {
                mVCarPoolRideDetourDetails.mo25488l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestRequest$b */
    public static class C8284b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8283a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestRequest$c */
    public static class C8285c extends C25240d<MVPassengerUpdateInterestRequest> {
        public C8285c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerUpdateInterestRequest mVPassengerUpdateInterestRequest = (MVPassengerUpdateInterestRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerUpdateInterestRequest.mo25814g()) {
                bitSet.set(0);
            }
            if (mVPassengerUpdateInterestRequest.mo25815h()) {
                bitSet.set(1);
            }
            if (mVPassengerUpdateInterestRequest.mo25817i()) {
                bitSet.set(2);
            }
            if (mVPassengerUpdateInterestRequest.mo25818j()) {
                bitSet.set(3);
            }
            if (mVPassengerUpdateInterestRequest.mo25813f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPassengerUpdateInterestRequest.mo25814g()) {
                jVar.mo61678B(mVPassengerUpdateInterestRequest.futureRideId);
            }
            if (mVPassengerUpdateInterestRequest.mo25815h()) {
                jVar.mo61708u(mVPassengerUpdateInterestRequest.isInterested);
            }
            if (mVPassengerUpdateInterestRequest.mo25817i()) {
                jVar.mo61679C(mVPassengerUpdateInterestRequest.priceValidation);
            }
            if (mVPassengerUpdateInterestRequest.mo25818j()) {
                mVPassengerUpdateInterestRequest.stops.mo25202X0(jVar);
            }
            if (mVPassengerUpdateInterestRequest.mo25813f()) {
                mVPassengerUpdateInterestRequest.detourDetails.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerUpdateInterestRequest mVPassengerUpdateInterestRequest = (MVPassengerUpdateInterestRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPassengerUpdateInterestRequest.futureRideId = jVar.mo61696i();
                mVPassengerUpdateInterestRequest.mo25819k();
            }
            if (T.get(1)) {
                mVPassengerUpdateInterestRequest.isInterested = jVar.mo61690c();
                mVPassengerUpdateInterestRequest.mo25820l();
            }
            if (T.get(2)) {
                mVPassengerUpdateInterestRequest.priceValidation = jVar.mo61697j();
                mVPassengerUpdateInterestRequest.mo25821m();
            }
            if (T.get(3)) {
                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                mVPassengerUpdateInterestRequest.stops = mVPassengerStops;
                mVPassengerStops.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVCarPoolRideDetour mVCarPoolRideDetour = new MVCarPoolRideDetour();
                mVPassengerUpdateInterestRequest.detourDetails = mVCarPoolRideDetour;
                mVCarPoolRideDetour.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestRequest$d */
    public static class C8286d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8285c(0);
        }
    }

    static {
        new C17394d0("MVPassengerUpdateInterestRequest");
        HashMap hashMap = new HashMap();
        f24833g = hashMap;
        hashMap.put(C25239c.class, new C8284b());
        hashMap.put(C25240d.class, new C8286d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FUTURE_RIDE_ID, new FieldMetaData("futureRideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS_INTERESTED, new FieldMetaData("isInterested", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PRICE_VALIDATION, new FieldMetaData("priceValidation", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new StructMetaData(MVPassengerStops.class)));
        enumMap.put(_Fields.DETOUR_DETAILS, new FieldMetaData("detourDetails", (byte) 2, new StructMetaData(MVCarPoolRideDetour.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24834h = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerUpdateInterestRequest.class, unmodifiableMap);
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
        ((C25238b) f24833g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24833g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerUpdateInterestRequest mVPassengerUpdateInterestRequest = (MVPassengerUpdateInterestRequest) obj;
        if (!getClass().equals(mVPassengerUpdateInterestRequest.getClass())) {
            return getClass().getName().compareTo(mVPassengerUpdateInterestRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25814g()).compareTo(Boolean.valueOf(mVPassengerUpdateInterestRequest.mo25814g()));
        if (compareTo2 != 0 || ((mo25814g() && (compareTo2 = C25082a.m62839c(this.futureRideId, mVPassengerUpdateInterestRequest.futureRideId)) != 0) || (compareTo2 = Boolean.valueOf(mo25815h()).compareTo(Boolean.valueOf(mVPassengerUpdateInterestRequest.mo25815h()))) != 0 || ((mo25815h() && (compareTo2 = C25082a.m62848l(this.isInterested, mVPassengerUpdateInterestRequest.isInterested)) != 0) || (compareTo2 = Boolean.valueOf(mo25817i()).compareTo(Boolean.valueOf(mVPassengerUpdateInterestRequest.mo25817i()))) != 0 || ((mo25817i() && (compareTo2 = C25082a.m62840d(this.priceValidation, mVPassengerUpdateInterestRequest.priceValidation)) != 0) || (compareTo2 = Boolean.valueOf(mo25818j()).compareTo(Boolean.valueOf(mVPassengerUpdateInterestRequest.mo25818j()))) != 0 || ((mo25818j() && (compareTo2 = this.stops.compareTo(mVPassengerUpdateInterestRequest.stops)) != 0) || (compareTo2 = Boolean.valueOf(mo25813f()).compareTo(Boolean.valueOf(mVPassengerUpdateInterestRequest.mo25813f()))) != 0))))) {
            return compareTo2;
        }
        if (!mo25813f() || (compareTo = this.detourDetails.compareTo(mVPassengerUpdateInterestRequest.detourDetails)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerUpdateInterestRequest)) {
            return false;
        }
        MVPassengerUpdateInterestRequest mVPassengerUpdateInterestRequest = (MVPassengerUpdateInterestRequest) obj;
        if (this.futureRideId != mVPassengerUpdateInterestRequest.futureRideId || this.isInterested != mVPassengerUpdateInterestRequest.isInterested) {
            return false;
        }
        boolean i = mo25817i();
        boolean i2 = mVPassengerUpdateInterestRequest.mo25817i();
        if ((i || i2) && (!i || !i2 || this.priceValidation != mVPassengerUpdateInterestRequest.priceValidation)) {
            return false;
        }
        boolean j = mo25818j();
        boolean j2 = mVPassengerUpdateInterestRequest.mo25818j();
        if ((j || j2) && (!j || !j2 || !this.stops.mo25800a(mVPassengerUpdateInterestRequest.stops))) {
            return false;
        }
        boolean f = mo25813f();
        boolean f2 = mVPassengerUpdateInterestRequest.mo25813f();
        if ((f || f2) && (!f || !f2 || !this.detourDetails.mo25470a(mVPassengerUpdateInterestRequest.detourDetails))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25813f() {
        return this.detourDetails != null;
    }

    /* renamed from: g */
    public final boolean mo25814g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo25815h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25817i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo25818j() {
        return this.stops != null;
    }

    /* renamed from: k */
    public final void mo25819k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo25820l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo25821m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerUpdateInterestRequest(", "futureRideId:");
        C0016g.m42z(n, this.futureRideId, ", ", "isInterested:");
        n.append(this.isInterested);
        if (mo25817i()) {
            n.append(", ");
            n.append("priceValidation:");
            n.append(this.priceValidation);
        }
        n.append(", ");
        n.append("stops:");
        MVPassengerStops mVPassengerStops = this.stops;
        if (mVPassengerStops == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerStops);
        }
        if (mo25813f()) {
            n.append(", ");
            n.append("detourDetails:");
            MVCarPoolRideDetour mVCarPoolRideDetour = this.detourDetails;
            if (mVCarPoolRideDetour == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCarPoolRideDetour);
            }
        }
        n.append(")");
        return n.toString();
    }
}
