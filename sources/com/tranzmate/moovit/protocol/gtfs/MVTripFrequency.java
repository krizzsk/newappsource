package com.tranzmate.moovit.protocol.gtfs;

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
import p001a0.C0016g;
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

public class MVTripFrequency implements TBase<MVTripFrequency, _Fields>, Serializable, Cloneable, Comparable<MVTripFrequency> {

    /* renamed from: b */
    public static final C25113c f25822b = new C25113c("frequencyId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25823c = new C25113c("details", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f25824d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25825e;
    private byte __isset_bitfield = 0;
    public List<MVTripFrequencyDetail> details;
    public int frequencyId;

    public enum _Fields implements C25085c {
        FREQUENCY_ID(1, "frequencyId"),
        DETAILS(2, "details");
        
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
                return FREQUENCY_ID;
            }
            if (i != 2) {
                return null;
            }
            return DETAILS;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripFrequency$a */
    public static class C8847a extends C25239c<MVTripFrequency> {
        public C8847a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripFrequency mVTripFrequency = (MVTripFrequency) tBase;
            mVTripFrequency.getClass();
            C25113c cVar = MVTripFrequency.f25822b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripFrequency.f25822b);
            gVar.mo61678B(mVTripFrequency.frequencyId);
            gVar.mo61712y();
            if (mVTripFrequency.details != null) {
                gVar.mo61711x(MVTripFrequency.f25823c);
                gVar.mo61680D(new C25119e((byte) 12, mVTripFrequency.details.size()));
                for (MVTripFrequencyDetail X0 : mVTripFrequency.details) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripFrequency mVTripFrequency = (MVTripFrequency) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripFrequency.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVTripFrequency.details = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVTripFrequencyDetail mVTripFrequencyDetail = new MVTripFrequencyDetail();
                            mVTripFrequencyDetail.mo25201C1(gVar);
                            mVTripFrequency.details.add(mVTripFrequencyDetail);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripFrequency.frequencyId = gVar.mo61696i();
                    mVTripFrequency.mo27554h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripFrequency$b */
    public static class C8848b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8847a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripFrequency$c */
    public static class C8849c extends C25240d<MVTripFrequency> {
        public C8849c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripFrequency mVTripFrequency = (MVTripFrequency) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripFrequency.mo27553g()) {
                bitSet.set(0);
            }
            if (mVTripFrequency.mo27552f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTripFrequency.mo27553g()) {
                jVar.mo61678B(mVTripFrequency.frequencyId);
            }
            if (mVTripFrequency.mo27552f()) {
                jVar.mo61678B(mVTripFrequency.details.size());
                for (MVTripFrequencyDetail X0 : mVTripFrequency.details) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripFrequency mVTripFrequency = (MVTripFrequency) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTripFrequency.frequencyId = jVar.mo61696i();
                mVTripFrequency.mo27554h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVTripFrequency.details = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTripFrequencyDetail mVTripFrequencyDetail = new MVTripFrequencyDetail();
                    mVTripFrequencyDetail.mo25201C1(jVar);
                    mVTripFrequency.details.add(mVTripFrequencyDetail);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripFrequency$d */
    public static class C8850d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8849c(0);
        }
    }

    static {
        new C17394d0("MVTripFrequency");
        HashMap hashMap = new HashMap();
        f25824d = hashMap;
        hashMap.put(C25239c.class, new C8848b());
        hashMap.put(C25240d.class, new C8850d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FREQUENCY_ID, new FieldMetaData("frequencyId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DETAILS, new FieldMetaData("details", (byte) 3, new ListMetaData(new StructMetaData(MVTripFrequencyDetail.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25825e = unmodifiableMap;
        FieldMetaData.m61947a(MVTripFrequency.class, unmodifiableMap);
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
        ((C25238b) f25824d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25824d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTripFrequency mVTripFrequency = (MVTripFrequency) obj;
        if (!getClass().equals(mVTripFrequency.getClass())) {
            return getClass().getName().compareTo(mVTripFrequency.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27553g()).compareTo(Boolean.valueOf(mVTripFrequency.mo27553g()));
        if (compareTo != 0 || ((mo27553g() && (compareTo = C25082a.m62839c(this.frequencyId, mVTripFrequency.frequencyId)) != 0) || (compareTo = Boolean.valueOf(mo27552f()).compareTo(Boolean.valueOf(mVTripFrequency.mo27552f()))) != 0)) {
            return compareTo;
        }
        if (!mo27552f() || (h = C25082a.m62844h(this.details, mVTripFrequency.details)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripFrequency)) {
            return false;
        }
        MVTripFrequency mVTripFrequency = (MVTripFrequency) obj;
        if (this.frequencyId != mVTripFrequency.frequencyId) {
            return false;
        }
        boolean f = mo27552f();
        boolean f2 = mVTripFrequency.mo27552f();
        if ((f || f2) && (!f || !f2 || !this.details.equals(mVTripFrequency.details))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27552f() {
        return this.details != null;
    }

    /* renamed from: g */
    public final boolean mo27553g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo27554h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripFrequency(", "frequencyId:");
        C0016g.m42z(n, this.frequencyId, ", ", "details:");
        List<MVTripFrequencyDetail> list = this.details;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
