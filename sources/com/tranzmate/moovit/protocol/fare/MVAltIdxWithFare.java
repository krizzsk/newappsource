package com.tranzmate.moovit.protocol.fare;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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

public class MVAltIdxWithFare implements TBase<MVAltIdxWithFare, _Fields>, Serializable, Cloneable, Comparable<MVAltIdxWithFare> {

    /* renamed from: b */
    public static final C25113c f25617b = new C25113c("legIdx", (byte) 3, 1);

    /* renamed from: c */
    public static final C25113c f25618c = new C25113c("altIdx", (byte) 3, 2);

    /* renamed from: d */
    public static final C25113c f25619d = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25620e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25621f;
    private byte __isset_bitfield = 0;
    public byte altIdx;
    public byte legIdx;
    private _Fields[] optionals = {_Fields.PRICE};
    public int price;

    public enum _Fields implements C25085c {
        LEG_IDX(1, "legIdx"),
        ALT_IDX(2, "altIdx"),
        PRICE(3, InAppPurchaseMetaData.KEY_PRICE);
        
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
                return LEG_IDX;
            }
            if (i == 2) {
                return ALT_IDX;
            }
            if (i != 3) {
                return null;
            }
            return PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltIdxWithFare$a */
    public static class C8723a extends C25239c<MVAltIdxWithFare> {
        public C8723a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAltIdxWithFare mVAltIdxWithFare = (MVAltIdxWithFare) tBase;
            mVAltIdxWithFare.getClass();
            C25113c cVar = MVAltIdxWithFare.f25617b;
            gVar.mo61687K();
            gVar.mo61711x(MVAltIdxWithFare.f25617b);
            gVar.mo61709v(mVAltIdxWithFare.legIdx);
            gVar.mo61712y();
            gVar.mo61711x(MVAltIdxWithFare.f25618c);
            gVar.mo61709v(mVAltIdxWithFare.altIdx);
            gVar.mo61712y();
            if (mVAltIdxWithFare.mo27193h()) {
                gVar.mo61711x(MVAltIdxWithFare.f25619d);
                gVar.mo61678B(mVAltIdxWithFare.price);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAltIdxWithFare mVAltIdxWithFare = (MVAltIdxWithFare) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAltIdxWithFare.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVAltIdxWithFare.price = gVar.mo61696i();
                            mVAltIdxWithFare.mo27197k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 3) {
                        mVAltIdxWithFare.altIdx = gVar.mo61691d();
                        mVAltIdxWithFare.mo27195i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 3) {
                    mVAltIdxWithFare.legIdx = gVar.mo61691d();
                    mVAltIdxWithFare.mo27196j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltIdxWithFare$b */
    public static class C8724b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8723a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltIdxWithFare$c */
    public static class C8725c extends C25240d<MVAltIdxWithFare> {
        public C8725c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAltIdxWithFare mVAltIdxWithFare = (MVAltIdxWithFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAltIdxWithFare.mo27192g()) {
                bitSet.set(0);
            }
            if (mVAltIdxWithFare.mo27191f()) {
                bitSet.set(1);
            }
            if (mVAltIdxWithFare.mo27193h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAltIdxWithFare.mo27192g()) {
                jVar.mo61716P(mVAltIdxWithFare.legIdx);
            }
            if (mVAltIdxWithFare.mo27191f()) {
                jVar.mo61716P(mVAltIdxWithFare.altIdx);
            }
            if (mVAltIdxWithFare.mo27193h()) {
                jVar.mo61678B(mVAltIdxWithFare.price);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAltIdxWithFare mVAltIdxWithFare = (MVAltIdxWithFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVAltIdxWithFare.legIdx = jVar.mo61691d();
                mVAltIdxWithFare.mo27196j();
            }
            if (T.get(1)) {
                mVAltIdxWithFare.altIdx = jVar.mo61691d();
                mVAltIdxWithFare.mo27195i();
            }
            if (T.get(2)) {
                mVAltIdxWithFare.price = jVar.mo61696i();
                mVAltIdxWithFare.mo27197k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVAltIdxWithFare$d */
    public static class C8726d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8725c(0);
        }
    }

    static {
        new C17394d0("MVAltIdxWithFare");
        HashMap hashMap = new HashMap();
        f25620e = hashMap;
        hashMap.put(C25239c.class, new C8724b());
        hashMap.put(C25240d.class, new C8726d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LEG_IDX, new FieldMetaData("legIdx", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.ALT_IDX, new FieldMetaData("altIdx", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25621f = unmodifiableMap;
        FieldMetaData.m61947a(MVAltIdxWithFare.class, unmodifiableMap);
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
        ((C25238b) f25620e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25620e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVAltIdxWithFare mVAltIdxWithFare = (MVAltIdxWithFare) obj;
        if (!getClass().equals(mVAltIdxWithFare.getClass())) {
            return getClass().getName().compareTo(mVAltIdxWithFare.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27192g()).compareTo(Boolean.valueOf(mVAltIdxWithFare.mo27192g()));
        if (compareTo != 0 || ((mo27192g() && (compareTo = C25082a.m62837a(this.legIdx, mVAltIdxWithFare.legIdx)) != 0) || (compareTo = Boolean.valueOf(mo27191f()).compareTo(Boolean.valueOf(mVAltIdxWithFare.mo27191f()))) != 0 || ((mo27191f() && (compareTo = C25082a.m62837a(this.altIdx, mVAltIdxWithFare.altIdx)) != 0) || (compareTo = Boolean.valueOf(mo27193h()).compareTo(Boolean.valueOf(mVAltIdxWithFare.mo27193h()))) != 0))) {
            return compareTo;
        }
        if (!mo27193h() || (c = C25082a.m62839c(this.price, mVAltIdxWithFare.price)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAltIdxWithFare)) {
            return false;
        }
        MVAltIdxWithFare mVAltIdxWithFare = (MVAltIdxWithFare) obj;
        if (this.legIdx != mVAltIdxWithFare.legIdx || this.altIdx != mVAltIdxWithFare.altIdx) {
            return false;
        }
        boolean h = mo27193h();
        boolean h2 = mVAltIdxWithFare.mo27193h();
        if ((h || h2) && (!h || !h2 || this.price != mVAltIdxWithFare.price)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27191f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27192g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27193h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27195i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: j */
    public final void mo27196j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo27197k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAltIdxWithFare(", "legIdx:");
        C0016g.m42z(n, this.legIdx, ", ", "altIdx:");
        n.append(this.altIdx);
        if (mo27193h()) {
            n.append(", ");
            n.append("price:");
            n.append(this.price);
        }
        n.append(")");
        return n.toString();
    }
}
