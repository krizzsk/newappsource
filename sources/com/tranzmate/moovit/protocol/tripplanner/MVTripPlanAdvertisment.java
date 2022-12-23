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

public class MVTripPlanAdvertisment implements TBase<MVTripPlanAdvertisment, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanAdvertisment> {

    /* renamed from: b */
    public static final C25113c f30080b = new C25113c("sectionId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30081c = new C25113c("provider", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f30082d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30083e;
    private byte __isset_bitfield = 0;
    public MVAdvertismentProvider provider;
    public int sectionId;

    public enum _Fields implements C25085c {
        SECTION_ID(1, "sectionId"),
        PROVIDER(2, "provider");
        
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
                return SECTION_ID;
            }
            if (i != 2) {
                return null;
            }
            return PROVIDER;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanAdvertisment$a */
    public static class C11639a extends C25239c<MVTripPlanAdvertisment> {
        public C11639a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanAdvertisment mVTripPlanAdvertisment = (MVTripPlanAdvertisment) tBase;
            mVTripPlanAdvertisment.getClass();
            C25113c cVar = MVTripPlanAdvertisment.f30080b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripPlanAdvertisment.f30080b);
            gVar.mo61678B(mVTripPlanAdvertisment.sectionId);
            gVar.mo61712y();
            if (mVTripPlanAdvertisment.provider != null) {
                gVar.mo61711x(MVTripPlanAdvertisment.f30081c);
                gVar.mo61678B(mVTripPlanAdvertisment.provider.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanAdvertisment mVTripPlanAdvertisment = (MVTripPlanAdvertisment) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPlanAdvertisment.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVTripPlanAdvertisment.provider = MVAdvertismentProvider.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripPlanAdvertisment.sectionId = gVar.mo61696i();
                    mVTripPlanAdvertisment.mo34596h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanAdvertisment$b */
    public static class C11640b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11639a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanAdvertisment$c */
    public static class C11641c extends C25240d<MVTripPlanAdvertisment> {
        public C11641c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanAdvertisment mVTripPlanAdvertisment = (MVTripPlanAdvertisment) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanAdvertisment.mo34595g()) {
                bitSet.set(0);
            }
            if (mVTripPlanAdvertisment.mo34594f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTripPlanAdvertisment.mo34595g()) {
                jVar.mo61678B(mVTripPlanAdvertisment.sectionId);
            }
            if (mVTripPlanAdvertisment.mo34594f()) {
                jVar.mo61678B(mVTripPlanAdvertisment.provider.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanAdvertisment mVTripPlanAdvertisment = (MVTripPlanAdvertisment) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTripPlanAdvertisment.sectionId = jVar.mo61696i();
                mVTripPlanAdvertisment.mo34596h();
            }
            if (T.get(1)) {
                mVTripPlanAdvertisment.provider = MVAdvertismentProvider.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanAdvertisment$d */
    public static class C11642d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11641c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanAdvertisment");
        HashMap hashMap = new HashMap();
        f30082d = hashMap;
        hashMap.put(C25239c.class, new C11640b());
        hashMap.put(C25240d.class, new C11642d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SECTION_ID, new FieldMetaData("sectionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PROVIDER, new FieldMetaData("provider", (byte) 3, new EnumMetaData(MVAdvertismentProvider.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30083e = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanAdvertisment.class, unmodifiableMap);
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
        ((C25238b) f30082d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30082d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanAdvertisment mVTripPlanAdvertisment = (MVTripPlanAdvertisment) obj;
        if (!getClass().equals(mVTripPlanAdvertisment.getClass())) {
            return getClass().getName().compareTo(mVTripPlanAdvertisment.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34595g()).compareTo(Boolean.valueOf(mVTripPlanAdvertisment.mo34595g()));
        if (compareTo2 != 0 || ((mo34595g() && (compareTo2 = C25082a.m62839c(this.sectionId, mVTripPlanAdvertisment.sectionId)) != 0) || (compareTo2 = Boolean.valueOf(mo34594f()).compareTo(Boolean.valueOf(mVTripPlanAdvertisment.mo34594f()))) != 0)) {
            return compareTo2;
        }
        if (!mo34594f() || (compareTo = this.provider.compareTo(mVTripPlanAdvertisment.provider)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripPlanAdvertisment)) {
            return false;
        }
        MVTripPlanAdvertisment mVTripPlanAdvertisment = (MVTripPlanAdvertisment) obj;
        if (this.sectionId != mVTripPlanAdvertisment.sectionId) {
            return false;
        }
        boolean f = mo34594f();
        boolean f2 = mVTripPlanAdvertisment.mo34594f();
        if ((f || f2) && (!f || !f2 || !this.provider.equals(mVTripPlanAdvertisment.provider))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34594f() {
        return this.provider != null;
    }

    /* renamed from: g */
    public final boolean mo34595g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo34596h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanAdvertisment(", "sectionId:");
        C0016g.m42z(n, this.sectionId, ", ", "provider:");
        MVAdvertismentProvider mVAdvertismentProvider = this.provider;
        if (mVAdvertismentProvider == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAdvertismentProvider);
        }
        n.append(")");
        return n.toString();
    }
}
