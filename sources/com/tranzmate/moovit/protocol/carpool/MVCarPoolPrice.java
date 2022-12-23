package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.appsflyer.AppsFlyerProperties;
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

public class MVCarPoolPrice implements TBase<MVCarPoolPrice, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolPrice> {

    /* renamed from: b */
    public static final C25113c f24638b = new C25113c(AppsFlyerProperties.CURRENCY_CODE, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24639c = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f24640d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24641e;
    private byte __isset_bitfield = 0;
    public String currencyCode;
    public long price;

    public enum _Fields implements C25085c {
        CURRENCY_CODE(1, AppsFlyerProperties.CURRENCY_CODE),
        PRICE(2, InAppPurchaseMetaData.KEY_PRICE);
        
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
                return CURRENCY_CODE;
            }
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice$a */
    public static class C8169a extends C25239c<MVCarPoolPrice> {
        public C8169a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolPrice mVCarPoolPrice = (MVCarPoolPrice) tBase;
            mVCarPoolPrice.getClass();
            C25113c cVar = MVCarPoolPrice.f24638b;
            gVar.mo61687K();
            if (mVCarPoolPrice.currencyCode != null) {
                gVar.mo61711x(MVCarPoolPrice.f24638b);
                gVar.mo61686J(mVCarPoolPrice.currencyCode);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarPoolPrice.f24639c);
            C25541a.m63891v(gVar, mVCarPoolPrice.price);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolPrice mVCarPoolPrice = (MVCarPoolPrice) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarPoolPrice.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVCarPoolPrice.price = gVar.mo61697j();
                        mVCarPoolPrice.mo25466h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCarPoolPrice.currencyCode = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice$b */
    public static class C8170b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8169a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice$c */
    public static class C8171c extends C25240d<MVCarPoolPrice> {
        public C8171c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolPrice mVCarPoolPrice = (MVCarPoolPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolPrice.mo25464f()) {
                bitSet.set(0);
            }
            if (mVCarPoolPrice.mo25465g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCarPoolPrice.mo25464f()) {
                jVar.mo61686J(mVCarPoolPrice.currencyCode);
            }
            if (mVCarPoolPrice.mo25465g()) {
                jVar.mo61679C(mVCarPoolPrice.price);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolPrice mVCarPoolPrice = (MVCarPoolPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVCarPoolPrice.currencyCode = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCarPoolPrice.price = jVar.mo61697j();
                mVCarPoolPrice.mo25466h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolPrice$d */
    public static class C8172d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8171c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolPrice");
        HashMap hashMap = new HashMap();
        f24640d = hashMap;
        hashMap.put(C25239c.class, new C8170b());
        hashMap.put(C25240d.class, new C8172d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CURRENCY_CODE, new FieldMetaData(AppsFlyerProperties.CURRENCY_CODE, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new FieldValueMetaData((byte) 10, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24641e = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolPrice.class, unmodifiableMap);
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
        ((C25238b) f24640d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24640d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25461a(MVCarPoolPrice mVCarPoolPrice) {
        if (mVCarPoolPrice == null) {
            return false;
        }
        boolean f = mo25464f();
        boolean f2 = mVCarPoolPrice.mo25464f();
        if (((f || f2) && (!f || !f2 || !this.currencyCode.equals(mVCarPoolPrice.currencyCode))) || this.price != mVCarPoolPrice.price) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int d;
        MVCarPoolPrice mVCarPoolPrice = (MVCarPoolPrice) obj;
        if (!getClass().equals(mVCarPoolPrice.getClass())) {
            return getClass().getName().compareTo(mVCarPoolPrice.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25464f()).compareTo(Boolean.valueOf(mVCarPoolPrice.mo25464f()));
        if (compareTo != 0 || ((mo25464f() && (compareTo = this.currencyCode.compareTo(mVCarPoolPrice.currencyCode)) != 0) || (compareTo = Boolean.valueOf(mo25465g()).compareTo(Boolean.valueOf(mVCarPoolPrice.mo25465g()))) != 0)) {
            return compareTo;
        }
        if (!mo25465g() || (d = C25082a.m62840d(this.price, mVCarPoolPrice.price)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCarPoolPrice)) {
            return mo25461a((MVCarPoolPrice) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25464f() {
        return this.currencyCode != null;
    }

    /* renamed from: g */
    public final boolean mo25465g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo25466h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarPoolPrice(", "currencyCode:");
        String str = this.currencyCode;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("price:");
        return C25541a.m63884o(n, this.price, ")");
    }
}
