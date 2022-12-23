package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVPurchaseSplitConfiguration implements TBase<MVPurchaseSplitConfiguration, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseSplitConfiguration> {

    /* renamed from: b */
    public static final C25113c f28934b = new C25113c("minFareAmount", (byte) 10, 1);

    /* renamed from: c */
    public static final HashMap f28935c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28936d;
    private byte __isset_bitfield = 0;
    public long minFareAmount;
    private _Fields[] optionals = {_Fields.MIN_FARE_AMOUNT};

    public enum _Fields implements C25085c {
        MIN_FARE_AMOUNT(1, "minFareAmount");
        
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
            if (i != 1) {
                return null;
            }
            return MIN_FARE_AMOUNT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitConfiguration$a */
    public static class C10937a extends C25239c<MVPurchaseSplitConfiguration> {
        public C10937a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration = (MVPurchaseSplitConfiguration) tBase;
            mVPurchaseSplitConfiguration.getClass();
            C25113c cVar = MVPurchaseSplitConfiguration.f28934b;
            gVar.mo61687K();
            if (mVPurchaseSplitConfiguration.mo32715f()) {
                gVar.mo61711x(MVPurchaseSplitConfiguration.f28934b);
                gVar.mo61679C(mVPurchaseSplitConfiguration.minFareAmount);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration = (MVPurchaseSplitConfiguration) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseSplitConfiguration.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 10) {
                    mVPurchaseSplitConfiguration.minFareAmount = gVar.mo61697j();
                    mVPurchaseSplitConfiguration.mo32716g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitConfiguration$b */
    public static class C10938b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10937a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitConfiguration$c */
    public static class C10939c extends C25240d<MVPurchaseSplitConfiguration> {
        public C10939c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration = (MVPurchaseSplitConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseSplitConfiguration.mo32715f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPurchaseSplitConfiguration.mo32715f()) {
                jVar.mo61679C(mVPurchaseSplitConfiguration.minFareAmount);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration = (MVPurchaseSplitConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVPurchaseSplitConfiguration.minFareAmount = jVar.mo61697j();
                mVPurchaseSplitConfiguration.mo32716g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitConfiguration$d */
    public static class C10940d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10939c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseSplitConfiguration");
        HashMap hashMap = new HashMap();
        f28935c = hashMap;
        hashMap.put(C25239c.class, new C10938b());
        hashMap.put(C25240d.class, new C10940d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MIN_FARE_AMOUNT, new FieldMetaData("minFareAmount", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28936d = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseSplitConfiguration.class, unmodifiableMap);
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
        ((C25238b) f28935c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28935c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32712a(MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration) {
        if (mVPurchaseSplitConfiguration == null) {
            return false;
        }
        boolean f = mo32715f();
        boolean f2 = mVPurchaseSplitConfiguration.mo32715f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || this.minFareAmount != mVPurchaseSplitConfiguration.minFareAmount) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int d;
        MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration = (MVPurchaseSplitConfiguration) obj;
        if (!getClass().equals(mVPurchaseSplitConfiguration.getClass())) {
            return getClass().getName().compareTo(mVPurchaseSplitConfiguration.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32715f()).compareTo(Boolean.valueOf(mVPurchaseSplitConfiguration.mo32715f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo32715f() || (d = C25082a.m62840d(this.minFareAmount, mVPurchaseSplitConfiguration.minFareAmount)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPurchaseSplitConfiguration)) {
            return mo32712a((MVPurchaseSplitConfiguration) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32715f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo32716g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVPurchaseSplitConfiguration(");
        if (mo32715f()) {
            sb.append("minFareAmount:");
            sb.append(this.minFareAmount);
        }
        sb.append(")");
        return sb.toString();
    }
}
