package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0017h;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTripPlanSections implements TBase<MVTripPlanSections, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanSections> {

    /* renamed from: b */
    public static final C25113c f30181b = new C25113c("tripPlanSections", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f30182c = new C25113c("isOtpRt", (byte) 2, 2);

    /* renamed from: d */
    public static final HashMap f30183d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30184e;
    private byte __isset_bitfield = 0;
    public boolean isOtpRt;
    public List<MVTripPlanSection> tripPlanSections;

    public enum _Fields implements C25085c {
        TRIP_PLAN_SECTIONS(1, "tripPlanSections"),
        IS_OTP_RT(2, "isOtpRt");
        
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
                return TRIP_PLAN_SECTIONS;
            }
            if (i != 2) {
                return null;
            }
            return IS_OTP_RT;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSections$a */
    public static class C11677a extends C25239c<MVTripPlanSections> {
        public C11677a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSections mVTripPlanSections = (MVTripPlanSections) tBase;
            mVTripPlanSections.getClass();
            C25113c cVar = MVTripPlanSections.f30181b;
            gVar.mo61687K();
            if (mVTripPlanSections.tripPlanSections != null) {
                gVar.mo61711x(MVTripPlanSections.f30181b);
                gVar.mo61680D(new C25119e((byte) 12, mVTripPlanSections.tripPlanSections.size()));
                for (MVTripPlanSection X0 : mVTripPlanSections.tripPlanSections) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTripPlanSections.f30182c);
            C0017h.m62S(gVar, mVTripPlanSections.isOtpRt);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSections mVTripPlanSections = (MVTripPlanSections) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPlanSections.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 2) {
                        mVTripPlanSections.isOtpRt = gVar.mo61690c();
                        mVTripPlanSections.mo34744h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVTripPlanSections.tripPlanSections = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVTripPlanSection mVTripPlanSection = new MVTripPlanSection();
                        mVTripPlanSection.mo25201C1(gVar);
                        mVTripPlanSections.tripPlanSections.add(mVTripPlanSection);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSections$b */
    public static class C11678b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11677a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSections$c */
    public static class C11679c extends C25240d<MVTripPlanSections> {
        public C11679c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSections mVTripPlanSections = (MVTripPlanSections) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanSections.mo34743g()) {
                bitSet.set(0);
            }
            if (mVTripPlanSections.mo34742f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTripPlanSections.mo34743g()) {
                jVar.mo61678B(mVTripPlanSections.tripPlanSections.size());
                for (MVTripPlanSection X0 : mVTripPlanSections.tripPlanSections) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTripPlanSections.mo34742f()) {
                jVar.mo61708u(mVTripPlanSections.isOtpRt);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSections mVTripPlanSections = (MVTripPlanSections) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVTripPlanSections.tripPlanSections = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTripPlanSection mVTripPlanSection = new MVTripPlanSection();
                    mVTripPlanSection.mo25201C1(jVar);
                    mVTripPlanSections.tripPlanSections.add(mVTripPlanSection);
                }
            }
            if (T.get(1)) {
                mVTripPlanSections.isOtpRt = jVar.mo61690c();
                mVTripPlanSections.mo34744h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSections$d */
    public static class C11680d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11679c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanSections");
        HashMap hashMap = new HashMap();
        f30183d = hashMap;
        hashMap.put(C25239c.class, new C11678b());
        hashMap.put(C25240d.class, new C11680d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_PLAN_SECTIONS, new FieldMetaData("tripPlanSections", (byte) 3, new ListMetaData(new StructMetaData(MVTripPlanSection.class))));
        enumMap.put(_Fields.IS_OTP_RT, new FieldMetaData("isOtpRt", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30184e = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanSections.class, unmodifiableMap);
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
        ((C25238b) f30183d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30183d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVTripPlanSections mVTripPlanSections = (MVTripPlanSections) obj;
        if (!getClass().equals(mVTripPlanSections.getClass())) {
            return getClass().getName().compareTo(mVTripPlanSections.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34743g()).compareTo(Boolean.valueOf(mVTripPlanSections.mo34743g()));
        if (compareTo != 0 || ((mo34743g() && (compareTo = C25082a.m62844h(this.tripPlanSections, mVTripPlanSections.tripPlanSections)) != 0) || (compareTo = Boolean.valueOf(mo34742f()).compareTo(Boolean.valueOf(mVTripPlanSections.mo34742f()))) != 0)) {
            return compareTo;
        }
        if (!mo34742f() || (l = C25082a.m62848l(this.isOtpRt, mVTripPlanSections.isOtpRt)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripPlanSections)) {
            return false;
        }
        MVTripPlanSections mVTripPlanSections = (MVTripPlanSections) obj;
        boolean g = mo34743g();
        boolean g2 = mVTripPlanSections.mo34743g();
        if (((g || g2) && (!g || !g2 || !this.tripPlanSections.equals(mVTripPlanSections.tripPlanSections))) || this.isOtpRt != mVTripPlanSections.isOtpRt) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34742f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34743g() {
        return this.tripPlanSections != null;
    }

    /* renamed from: h */
    public final void mo34744h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanSections(", "tripPlanSections:");
        List<MVTripPlanSection> list = this.tripPlanSections;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("isOtpRt:");
        return C25541a.m63885p(n, this.isOtpRt, ")");
    }
}
