package com.tranzmate.moovit.protocol.ptb.activations;

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

public class MVPTBRegionPrice implements TBase<MVPTBRegionPrice, _Fields>, Serializable, Cloneable, Comparable<MVPTBRegionPrice> {

    /* renamed from: b */
    public static final C25113c f27944b = new C25113c("regionId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27945c = new C25113c("activationPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27946d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27947e;
    private byte __isset_bitfield = 0;
    public MVPTBActivationPrice activationPrice;
    public int regionId;

    public enum _Fields implements C25085c {
        REGION_ID(1, "regionId"),
        ACTIVATION_PRICE(2, "activationPrice");
        
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
                return REGION_ID;
            }
            if (i != 2) {
                return null;
            }
            return ACTIVATION_PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegionPrice$a */
    public static class C10246a extends C25239c<MVPTBRegionPrice> {
        public C10246a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBRegionPrice mVPTBRegionPrice = (MVPTBRegionPrice) tBase;
            MVPTBActivationPrice mVPTBActivationPrice = mVPTBRegionPrice.activationPrice;
            if (mVPTBActivationPrice != null) {
                mVPTBActivationPrice.mo30836i();
            }
            C25113c cVar = MVPTBRegionPrice.f27944b;
            gVar.mo61687K();
            gVar.mo61711x(MVPTBRegionPrice.f27944b);
            gVar.mo61678B(mVPTBRegionPrice.regionId);
            gVar.mo61712y();
            if (mVPTBRegionPrice.activationPrice != null) {
                gVar.mo61711x(MVPTBRegionPrice.f27945c);
                mVPTBRegionPrice.activationPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBRegionPrice mVPTBRegionPrice = (MVPTBRegionPrice) tBase;
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVPTBActivationPrice mVPTBActivationPrice = new MVPTBActivationPrice();
                        mVPTBRegionPrice.activationPrice = mVPTBActivationPrice;
                        mVPTBActivationPrice.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPTBRegionPrice.regionId = gVar.mo61696i();
                    mVPTBRegionPrice.mo31043h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPTBActivationPrice mVPTBActivationPrice2 = mVPTBRegionPrice.activationPrice;
            if (mVPTBActivationPrice2 != null) {
                mVPTBActivationPrice2.mo30836i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegionPrice$b */
    public static class C10247b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10246a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegionPrice$c */
    public static class C10248c extends C25240d<MVPTBRegionPrice> {
        public C10248c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBRegionPrice mVPTBRegionPrice = (MVPTBRegionPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBRegionPrice.mo31042g()) {
                bitSet.set(0);
            }
            if (mVPTBRegionPrice.mo31041f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPTBRegionPrice.mo31042g()) {
                jVar.mo61678B(mVPTBRegionPrice.regionId);
            }
            if (mVPTBRegionPrice.mo31041f()) {
                mVPTBRegionPrice.activationPrice.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBRegionPrice mVPTBRegionPrice = (MVPTBRegionPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPTBRegionPrice.regionId = jVar.mo61696i();
                mVPTBRegionPrice.mo31043h();
            }
            if (T.get(1)) {
                MVPTBActivationPrice mVPTBActivationPrice = new MVPTBActivationPrice();
                mVPTBRegionPrice.activationPrice = mVPTBActivationPrice;
                mVPTBActivationPrice.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBRegionPrice$d */
    public static class C10249d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10248c(0);
        }
    }

    static {
        new C17394d0("MVPTBRegionPrice");
        HashMap hashMap = new HashMap();
        f27946d = hashMap;
        hashMap.put(C25239c.class, new C10247b());
        hashMap.put(C25240d.class, new C10249d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REGION_ID, new FieldMetaData("regionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ACTIVATION_PRICE, new FieldMetaData("activationPrice", (byte) 3, new StructMetaData(MVPTBActivationPrice.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27947e = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBRegionPrice.class, unmodifiableMap);
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
        ((C25238b) f27946d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27946d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31038a(MVPTBRegionPrice mVPTBRegionPrice) {
        if (mVPTBRegionPrice == null || this.regionId != mVPTBRegionPrice.regionId) {
            return false;
        }
        boolean f = mo31041f();
        boolean f2 = mVPTBRegionPrice.mo31041f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.activationPrice.mo30829a(mVPTBRegionPrice.activationPrice)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBRegionPrice mVPTBRegionPrice = (MVPTBRegionPrice) obj;
        if (!getClass().equals(mVPTBRegionPrice.getClass())) {
            return getClass().getName().compareTo(mVPTBRegionPrice.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31042g()).compareTo(Boolean.valueOf(mVPTBRegionPrice.mo31042g()));
        if (compareTo2 != 0 || ((mo31042g() && (compareTo2 = C25082a.m62839c(this.regionId, mVPTBRegionPrice.regionId)) != 0) || (compareTo2 = Boolean.valueOf(mo31041f()).compareTo(Boolean.valueOf(mVPTBRegionPrice.mo31041f()))) != 0)) {
            return compareTo2;
        }
        if (!mo31041f() || (compareTo = this.activationPrice.compareTo(mVPTBRegionPrice.activationPrice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPTBRegionPrice)) {
            return mo31038a((MVPTBRegionPrice) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31041f() {
        return this.activationPrice != null;
    }

    /* renamed from: g */
    public final boolean mo31042g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo31043h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBRegionPrice(", "regionId:");
        C0016g.m42z(n, this.regionId, ", ", "activationPrice:");
        MVPTBActivationPrice mVPTBActivationPrice = this.activationPrice;
        if (mVPTBActivationPrice == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBActivationPrice);
        }
        n.append(")");
        return n.toString();
    }
}
