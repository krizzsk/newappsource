package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
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

public class MVGetRideRequestPrices implements TBase<MVGetRideRequestPrices, _Fields>, Serializable, Cloneable, Comparable<MVGetRideRequestPrices> {

    /* renamed from: b */
    public static final C25113c f24719b = new C25113c("recommended", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24720c = new C25113c(InneractiveMediationNameConsts.MAX, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24721d = new C25113c("nextRideCredit", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f24722e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24723f;
    public MVCarPoolPrice max;
    public MVCarPoolPrice nextRideCredit;
    public MVCarPoolPrice recommended;

    public enum _Fields implements C25085c {
        RECOMMENDED(1, "recommended"),
        MAX(2, InneractiveMediationNameConsts.MAX),
        NEXT_RIDE_CREDIT(3, "nextRideCredit");
        
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
                return RECOMMENDED;
            }
            if (i == 2) {
                return MAX;
            }
            if (i != 3) {
                return null;
            }
            return NEXT_RIDE_CREDIT;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVGetRideRequestPrices$a */
    public static class C8218a extends C25239c<MVGetRideRequestPrices> {
        public C8218a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetRideRequestPrices mVGetRideRequestPrices = (MVGetRideRequestPrices) tBase;
            MVCarPoolPrice mVCarPoolPrice = mVGetRideRequestPrices.recommended;
            C25113c cVar = MVGetRideRequestPrices.f24719b;
            gVar.mo61687K();
            if (mVGetRideRequestPrices.recommended != null) {
                gVar.mo61711x(MVGetRideRequestPrices.f24719b);
                mVGetRideRequestPrices.recommended.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVGetRideRequestPrices.max != null) {
                gVar.mo61711x(MVGetRideRequestPrices.f24720c);
                mVGetRideRequestPrices.max.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVGetRideRequestPrices.nextRideCredit != null) {
                gVar.mo61711x(MVGetRideRequestPrices.f24721d);
                mVGetRideRequestPrices.nextRideCredit.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetRideRequestPrices mVGetRideRequestPrices = (MVGetRideRequestPrices) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCarPoolPrice mVCarPoolPrice = mVGetRideRequestPrices.recommended;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                            mVGetRideRequestPrices.nextRideCredit = mVCarPoolPrice2;
                            mVCarPoolPrice2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCarPoolPrice mVCarPoolPrice3 = new MVCarPoolPrice();
                        mVGetRideRequestPrices.max = mVCarPoolPrice3;
                        mVCarPoolPrice3.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCarPoolPrice mVCarPoolPrice4 = new MVCarPoolPrice();
                    mVGetRideRequestPrices.recommended = mVCarPoolPrice4;
                    mVCarPoolPrice4.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVGetRideRequestPrices$b */
    public static class C8219b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8218a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVGetRideRequestPrices$c */
    public static class C8220c extends C25240d<MVGetRideRequestPrices> {
        public C8220c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetRideRequestPrices mVGetRideRequestPrices = (MVGetRideRequestPrices) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetRideRequestPrices.mo25629h()) {
                bitSet.set(0);
            }
            if (mVGetRideRequestPrices.mo25627f()) {
                bitSet.set(1);
            }
            if (mVGetRideRequestPrices.mo25628g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVGetRideRequestPrices.mo25629h()) {
                mVGetRideRequestPrices.recommended.mo25202X0(jVar);
            }
            if (mVGetRideRequestPrices.mo25627f()) {
                mVGetRideRequestPrices.max.mo25202X0(jVar);
            }
            if (mVGetRideRequestPrices.mo25628g()) {
                mVGetRideRequestPrices.nextRideCredit.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetRideRequestPrices mVGetRideRequestPrices = (MVGetRideRequestPrices) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                mVGetRideRequestPrices.recommended = mVCarPoolPrice;
                mVCarPoolPrice.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                mVGetRideRequestPrices.max = mVCarPoolPrice2;
                mVCarPoolPrice2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVCarPoolPrice mVCarPoolPrice3 = new MVCarPoolPrice();
                mVGetRideRequestPrices.nextRideCredit = mVCarPoolPrice3;
                mVCarPoolPrice3.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVGetRideRequestPrices$d */
    public static class C8221d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8220c(0);
        }
    }

    static {
        new C17394d0("MVGetRideRequestPrices");
        HashMap hashMap = new HashMap();
        f24722e = hashMap;
        hashMap.put(C25239c.class, new C8219b());
        hashMap.put(C25240d.class, new C8221d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RECOMMENDED, new FieldMetaData("recommended", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.MAX, new FieldMetaData(InneractiveMediationNameConsts.MAX, (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.NEXT_RIDE_CREDIT, new FieldMetaData("nextRideCredit", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24723f = unmodifiableMap;
        FieldMetaData.m61947a(MVGetRideRequestPrices.class, unmodifiableMap);
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
        ((C25238b) f24722e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24722e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetRideRequestPrices mVGetRideRequestPrices = (MVGetRideRequestPrices) obj;
        if (!getClass().equals(mVGetRideRequestPrices.getClass())) {
            return getClass().getName().compareTo(mVGetRideRequestPrices.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25629h()).compareTo(Boolean.valueOf(mVGetRideRequestPrices.mo25629h()));
        if (compareTo2 != 0 || ((mo25629h() && (compareTo2 = this.recommended.compareTo(mVGetRideRequestPrices.recommended)) != 0) || (compareTo2 = Boolean.valueOf(mo25627f()).compareTo(Boolean.valueOf(mVGetRideRequestPrices.mo25627f()))) != 0 || ((mo25627f() && (compareTo2 = this.max.compareTo(mVGetRideRequestPrices.max)) != 0) || (compareTo2 = Boolean.valueOf(mo25628g()).compareTo(Boolean.valueOf(mVGetRideRequestPrices.mo25628g()))) != 0))) {
            return compareTo2;
        }
        if (!mo25628g() || (compareTo = this.nextRideCredit.compareTo(mVGetRideRequestPrices.nextRideCredit)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetRideRequestPrices)) {
            return false;
        }
        MVGetRideRequestPrices mVGetRideRequestPrices = (MVGetRideRequestPrices) obj;
        boolean h = mo25629h();
        boolean h2 = mVGetRideRequestPrices.mo25629h();
        if ((h || h2) && (!h || !h2 || !this.recommended.mo25461a(mVGetRideRequestPrices.recommended))) {
            return false;
        }
        boolean f = mo25627f();
        boolean f2 = mVGetRideRequestPrices.mo25627f();
        if ((f || f2) && (!f || !f2 || !this.max.mo25461a(mVGetRideRequestPrices.max))) {
            return false;
        }
        boolean g = mo25628g();
        boolean g2 = mVGetRideRequestPrices.mo25628g();
        if ((g || g2) && (!g || !g2 || !this.nextRideCredit.mo25461a(mVGetRideRequestPrices.nextRideCredit))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25627f() {
        return this.max != null;
    }

    /* renamed from: g */
    public final boolean mo25628g() {
        return this.nextRideCredit != null;
    }

    /* renamed from: h */
    public final boolean mo25629h() {
        return this.recommended != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetRideRequestPrices(", "recommended:");
        MVCarPoolPrice mVCarPoolPrice = this.recommended;
        if (mVCarPoolPrice == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice);
        }
        n.append(", ");
        n.append("max:");
        MVCarPoolPrice mVCarPoolPrice2 = this.max;
        if (mVCarPoolPrice2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice2);
        }
        n.append(", ");
        n.append("nextRideCredit:");
        MVCarPoolPrice mVCarPoolPrice3 = this.nextRideCredit;
        if (mVCarPoolPrice3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice3);
        }
        n.append(")");
        return n.toString();
    }
}
