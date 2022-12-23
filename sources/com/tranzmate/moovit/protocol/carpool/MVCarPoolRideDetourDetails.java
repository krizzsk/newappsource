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

public class MVCarPoolRideDetourDetails implements TBase<MVCarPoolRideDetourDetails, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolRideDetourDetails> {

    /* renamed from: b */
    public static final C25113c f24646b = new C25113c("additionalDistanceMeters", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24647c = new C25113c("additionalTimeSeconds", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24648d = new C25113c("additionalPrice", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f24649e = new C25113c("additionalFullPrice", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f24650f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24651g;
    private byte __isset_bitfield = 0;
    public int additionalDistanceMeters;
    public MVCarPoolPrice additionalFullPrice;
    public MVCarPoolPrice additionalPrice;
    public int additionalTimeSeconds;

    public enum _Fields implements C25085c {
        ADDITIONAL_DISTANCE_METERS(1, "additionalDistanceMeters"),
        ADDITIONAL_TIME_SECONDS(2, "additionalTimeSeconds"),
        ADDITIONAL_PRICE(3, "additionalPrice"),
        ADDITIONAL_FULL_PRICE(4, "additionalFullPrice");
        
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
                return ADDITIONAL_DISTANCE_METERS;
            }
            if (i == 2) {
                return ADDITIONAL_TIME_SECONDS;
            }
            if (i == 3) {
                return ADDITIONAL_PRICE;
            }
            if (i != 4) {
                return null;
            }
            return ADDITIONAL_FULL_PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetourDetails$a */
    public static class C8177a extends C25239c<MVCarPoolRideDetourDetails> {
        public C8177a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = (MVCarPoolRideDetourDetails) tBase;
            mVCarPoolRideDetourDetails.mo25488l();
            C25113c cVar = MVCarPoolRideDetourDetails.f24646b;
            gVar.mo61687K();
            gVar.mo61711x(MVCarPoolRideDetourDetails.f24646b);
            gVar.mo61678B(mVCarPoolRideDetourDetails.additionalDistanceMeters);
            gVar.mo61712y();
            gVar.mo61711x(MVCarPoolRideDetourDetails.f24647c);
            gVar.mo61678B(mVCarPoolRideDetourDetails.additionalTimeSeconds);
            gVar.mo61712y();
            if (mVCarPoolRideDetourDetails.additionalPrice != null) {
                gVar.mo61711x(MVCarPoolRideDetourDetails.f24648d);
                mVCarPoolRideDetourDetails.additionalPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarPoolRideDetourDetails.additionalFullPrice != null) {
                gVar.mo61711x(MVCarPoolRideDetourDetails.f24649e);
                mVCarPoolRideDetourDetails.additionalFullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = (MVCarPoolRideDetourDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarPoolRideDetourDetails.mo25488l();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                                mVCarPoolRideDetourDetails.additionalFullPrice = mVCarPoolPrice;
                                mVCarPoolPrice.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                            mVCarPoolRideDetourDetails.additionalPrice = mVCarPoolPrice2;
                            mVCarPoolPrice2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVCarPoolRideDetourDetails.additionalTimeSeconds = gVar.mo61696i();
                        mVCarPoolRideDetourDetails.mo25487k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVCarPoolRideDetourDetails.additionalDistanceMeters = gVar.mo61696i();
                    mVCarPoolRideDetourDetails.mo25486j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetourDetails$b */
    public static class C8178b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8177a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetourDetails$c */
    public static class C8179c extends C25240d<MVCarPoolRideDetourDetails> {
        public C8179c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = (MVCarPoolRideDetourDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolRideDetourDetails.mo25481f()) {
                bitSet.set(0);
            }
            if (mVCarPoolRideDetourDetails.mo25485i()) {
                bitSet.set(1);
            }
            if (mVCarPoolRideDetourDetails.mo25483h()) {
                bitSet.set(2);
            }
            if (mVCarPoolRideDetourDetails.mo25482g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVCarPoolRideDetourDetails.mo25481f()) {
                jVar.mo61678B(mVCarPoolRideDetourDetails.additionalDistanceMeters);
            }
            if (mVCarPoolRideDetourDetails.mo25485i()) {
                jVar.mo61678B(mVCarPoolRideDetourDetails.additionalTimeSeconds);
            }
            if (mVCarPoolRideDetourDetails.mo25483h()) {
                mVCarPoolRideDetourDetails.additionalPrice.mo25202X0(jVar);
            }
            if (mVCarPoolRideDetourDetails.mo25482g()) {
                mVCarPoolRideDetourDetails.additionalFullPrice.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = (MVCarPoolRideDetourDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVCarPoolRideDetourDetails.additionalDistanceMeters = jVar.mo61696i();
                mVCarPoolRideDetourDetails.mo25486j();
            }
            if (T.get(1)) {
                mVCarPoolRideDetourDetails.additionalTimeSeconds = jVar.mo61696i();
                mVCarPoolRideDetourDetails.mo25487k();
            }
            if (T.get(2)) {
                MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                mVCarPoolRideDetourDetails.additionalPrice = mVCarPoolPrice;
                mVCarPoolPrice.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                mVCarPoolRideDetourDetails.additionalFullPrice = mVCarPoolPrice2;
                mVCarPoolPrice2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetourDetails$d */
    public static class C8180d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8179c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolRideDetourDetails");
        HashMap hashMap = new HashMap();
        f24650f = hashMap;
        hashMap.put(C25239c.class, new C8178b());
        hashMap.put(C25240d.class, new C8180d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ADDITIONAL_DISTANCE_METERS, new FieldMetaData("additionalDistanceMeters", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ADDITIONAL_TIME_SECONDS, new FieldMetaData("additionalTimeSeconds", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ADDITIONAL_PRICE, new FieldMetaData("additionalPrice", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.ADDITIONAL_FULL_PRICE, new FieldMetaData("additionalFullPrice", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24651g = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolRideDetourDetails.class, unmodifiableMap);
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
        ((C25238b) f24650f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24650f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25478a(MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails) {
        if (mVCarPoolRideDetourDetails == null || this.additionalDistanceMeters != mVCarPoolRideDetourDetails.additionalDistanceMeters || this.additionalTimeSeconds != mVCarPoolRideDetourDetails.additionalTimeSeconds) {
            return false;
        }
        boolean h = mo25483h();
        boolean h2 = mVCarPoolRideDetourDetails.mo25483h();
        if ((h || h2) && (!h || !h2 || !this.additionalPrice.mo25461a(mVCarPoolRideDetourDetails.additionalPrice))) {
            return false;
        }
        boolean g = mo25482g();
        boolean g2 = mVCarPoolRideDetourDetails.mo25482g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.additionalFullPrice.mo25461a(mVCarPoolRideDetourDetails.additionalFullPrice)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = (MVCarPoolRideDetourDetails) obj;
        if (!getClass().equals(mVCarPoolRideDetourDetails.getClass())) {
            return getClass().getName().compareTo(mVCarPoolRideDetourDetails.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25481f()).compareTo(Boolean.valueOf(mVCarPoolRideDetourDetails.mo25481f()));
        if (compareTo2 != 0 || ((mo25481f() && (compareTo2 = C25082a.m62839c(this.additionalDistanceMeters, mVCarPoolRideDetourDetails.additionalDistanceMeters)) != 0) || (compareTo2 = Boolean.valueOf(mo25485i()).compareTo(Boolean.valueOf(mVCarPoolRideDetourDetails.mo25485i()))) != 0 || ((mo25485i() && (compareTo2 = C25082a.m62839c(this.additionalTimeSeconds, mVCarPoolRideDetourDetails.additionalTimeSeconds)) != 0) || (compareTo2 = Boolean.valueOf(mo25483h()).compareTo(Boolean.valueOf(mVCarPoolRideDetourDetails.mo25483h()))) != 0 || ((mo25483h() && (compareTo2 = this.additionalPrice.compareTo(mVCarPoolRideDetourDetails.additionalPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo25482g()).compareTo(Boolean.valueOf(mVCarPoolRideDetourDetails.mo25482g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo25482g() || (compareTo = this.additionalFullPrice.compareTo(mVCarPoolRideDetourDetails.additionalFullPrice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCarPoolRideDetourDetails)) {
            return mo25478a((MVCarPoolRideDetourDetails) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25481f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25482g() {
        return this.additionalFullPrice != null;
    }

    /* renamed from: h */
    public final boolean mo25483h() {
        return this.additionalPrice != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25485i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final void mo25486j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo25487k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo25488l() throws TException {
        MVCarPoolPrice mVCarPoolPrice = this.additionalPrice;
        if (mVCarPoolPrice != null) {
            mVCarPoolPrice.getClass();
        }
        MVCarPoolPrice mVCarPoolPrice2 = this.additionalFullPrice;
        if (mVCarPoolPrice2 != null) {
            mVCarPoolPrice2.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarPoolRideDetourDetails(", "additionalDistanceMeters:");
        C0016g.m42z(n, this.additionalDistanceMeters, ", ", "additionalTimeSeconds:");
        C0016g.m42z(n, this.additionalTimeSeconds, ", ", "additionalPrice:");
        MVCarPoolPrice mVCarPoolPrice = this.additionalPrice;
        if (mVCarPoolPrice == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice);
        }
        n.append(", ");
        n.append("additionalFullPrice:");
        MVCarPoolPrice mVCarPoolPrice2 = this.additionalFullPrice;
        if (mVCarPoolPrice2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice2);
        }
        n.append(")");
        return n.toString();
    }
}
