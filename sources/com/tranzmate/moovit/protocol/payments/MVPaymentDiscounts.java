package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.discounts.MVDiscount;
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
import p358af.C13437d;
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

public class MVPaymentDiscounts implements TBase<MVPaymentDiscounts, _Fields>, Serializable, Cloneable, Comparable<MVPaymentDiscounts> {

    /* renamed from: b */
    public static final C25113c f27478b = new C25113c("discountContextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27479c = new C25113c("discounts", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f27480d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27481e;
    public String discountContextId;
    public List<MVDiscount> discounts;

    public enum _Fields implements C25085c {
        DISCOUNT_CONTEXT_ID(1, "discountContextId"),
        DISCOUNTS(2, "discounts");
        
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
                return DISCOUNT_CONTEXT_ID;
            }
            if (i != 2) {
                return null;
            }
            return DISCOUNTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentDiscounts$a */
    public static class C9901a extends C25239c<MVPaymentDiscounts> {
        public C9901a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentDiscounts mVPaymentDiscounts = (MVPaymentDiscounts) tBase;
            mVPaymentDiscounts.getClass();
            C25113c cVar = MVPaymentDiscounts.f27478b;
            gVar.mo61687K();
            if (mVPaymentDiscounts.discountContextId != null) {
                gVar.mo61711x(MVPaymentDiscounts.f27478b);
                gVar.mo61686J(mVPaymentDiscounts.discountContextId);
                gVar.mo61712y();
            }
            if (mVPaymentDiscounts.discounts != null) {
                gVar.mo61711x(MVPaymentDiscounts.f27479c);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentDiscounts.discounts.size()));
                for (MVDiscount X0 : mVPaymentDiscounts.discounts) {
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
            MVPaymentDiscounts mVPaymentDiscounts = (MVPaymentDiscounts) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentDiscounts.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVPaymentDiscounts.discounts = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVDiscount mVDiscount = new MVDiscount();
                            mVDiscount.mo25201C1(gVar);
                            mVPaymentDiscounts.discounts.add(mVDiscount);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentDiscounts.discountContextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentDiscounts$b */
    public static class C9902b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9901a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentDiscounts$c */
    public static class C9903c extends C25240d<MVPaymentDiscounts> {
        public C9903c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentDiscounts mVPaymentDiscounts = (MVPaymentDiscounts) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentDiscounts.mo30225f()) {
                bitSet.set(0);
            }
            if (mVPaymentDiscounts.mo30226g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPaymentDiscounts.mo30225f()) {
                jVar.mo61686J(mVPaymentDiscounts.discountContextId);
            }
            if (mVPaymentDiscounts.mo30226g()) {
                jVar.mo61678B(mVPaymentDiscounts.discounts.size());
                for (MVDiscount X0 : mVPaymentDiscounts.discounts) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentDiscounts mVPaymentDiscounts = (MVPaymentDiscounts) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPaymentDiscounts.discountContextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPaymentDiscounts.discounts = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVDiscount mVDiscount = new MVDiscount();
                    mVDiscount.mo25201C1(jVar);
                    mVPaymentDiscounts.discounts.add(mVDiscount);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentDiscounts$d */
    public static class C9904d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9903c(0);
        }
    }

    static {
        new C17394d0("MVPaymentDiscounts");
        HashMap hashMap = new HashMap();
        f27480d = hashMap;
        hashMap.put(C25239c.class, new C9902b());
        hashMap.put(C25240d.class, new C9904d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DISCOUNTS, new FieldMetaData("discounts", (byte) 3, new ListMetaData(new StructMetaData(MVDiscount.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27481e = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentDiscounts.class, unmodifiableMap);
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
        ((C25238b) f27480d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27480d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30222a(MVPaymentDiscounts mVPaymentDiscounts) {
        if (mVPaymentDiscounts == null) {
            return false;
        }
        boolean f = mo30225f();
        boolean f2 = mVPaymentDiscounts.mo30225f();
        if ((f || f2) && (!f || !f2 || !this.discountContextId.equals(mVPaymentDiscounts.discountContextId))) {
            return false;
        }
        boolean g = mo30226g();
        boolean g2 = mVPaymentDiscounts.mo30226g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.discounts.equals(mVPaymentDiscounts.discounts)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVPaymentDiscounts mVPaymentDiscounts = (MVPaymentDiscounts) obj;
        if (!getClass().equals(mVPaymentDiscounts.getClass())) {
            return getClass().getName().compareTo(mVPaymentDiscounts.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30225f()).compareTo(Boolean.valueOf(mVPaymentDiscounts.mo30225f()));
        if (compareTo != 0 || ((mo30225f() && (compareTo = this.discountContextId.compareTo(mVPaymentDiscounts.discountContextId)) != 0) || (compareTo = Boolean.valueOf(mo30226g()).compareTo(Boolean.valueOf(mVPaymentDiscounts.mo30226g()))) != 0)) {
            return compareTo;
        }
        if (!mo30226g() || (h = C25082a.m62844h(this.discounts, mVPaymentDiscounts.discounts)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentDiscounts)) {
            return mo30222a((MVPaymentDiscounts) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30225f() {
        return this.discountContextId != null;
    }

    /* renamed from: g */
    public final boolean mo30226g() {
        return this.discounts != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentDiscounts(", "discountContextId:");
        String str = this.discountContextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("discounts:");
        List<MVDiscount> list = this.discounts;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
