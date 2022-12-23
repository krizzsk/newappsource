package com.tranzmate.moovit.protocol.payments;

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

public class MVPaymentMethodId implements TBase<MVPaymentMethodId, _Fields>, Serializable, Cloneable, Comparable<MVPaymentMethodId> {

    /* renamed from: b */
    public static final C25113c f27495b = new C25113c("provider", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27496c = new C25113c("paymentMethodId", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27497d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27498e;
    public String paymentMethodId;
    public MVClearanceProviderType provider;

    public enum _Fields implements C25085c {
        PROVIDER(1, "provider"),
        PAYMENT_METHOD_ID(2, "paymentMethodId");
        
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
                return PROVIDER;
            }
            if (i != 2) {
                return null;
            }
            return PAYMENT_METHOD_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodId$a */
    public static class C9910a extends C25239c<MVPaymentMethodId> {
        public C9910a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodId mVPaymentMethodId = (MVPaymentMethodId) tBase;
            mVPaymentMethodId.getClass();
            C25113c cVar = MVPaymentMethodId.f27495b;
            gVar.mo61687K();
            if (mVPaymentMethodId.provider != null) {
                gVar.mo61711x(MVPaymentMethodId.f27495b);
                gVar.mo61678B(mVPaymentMethodId.provider.getValue());
                gVar.mo61712y();
            }
            if (mVPaymentMethodId.paymentMethodId != null) {
                gVar.mo61711x(MVPaymentMethodId.f27496c);
                gVar.mo61686J(mVPaymentMethodId.paymentMethodId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodId mVPaymentMethodId = (MVPaymentMethodId) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentMethodId.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVPaymentMethodId.paymentMethodId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPaymentMethodId.provider = MVClearanceProviderType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodId$b */
    public static class C9911b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9910a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodId$c */
    public static class C9912c extends C25240d<MVPaymentMethodId> {
        public C9912c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodId mVPaymentMethodId = (MVPaymentMethodId) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentMethodId.mo30247g()) {
                bitSet.set(0);
            }
            if (mVPaymentMethodId.mo30246f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPaymentMethodId.mo30247g()) {
                jVar.mo61678B(mVPaymentMethodId.provider.getValue());
            }
            if (mVPaymentMethodId.mo30246f()) {
                jVar.mo61686J(mVPaymentMethodId.paymentMethodId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentMethodId mVPaymentMethodId = (MVPaymentMethodId) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPaymentMethodId.provider = MVClearanceProviderType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVPaymentMethodId.paymentMethodId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethodId$d */
    public static class C9913d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9912c(0);
        }
    }

    static {
        new C17394d0("MVPaymentMethodId");
        HashMap hashMap = new HashMap();
        f27497d = hashMap;
        hashMap.put(C25239c.class, new C9911b());
        hashMap.put(C25240d.class, new C9913d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER, new FieldMetaData("provider", (byte) 3, new EnumMetaData(MVClearanceProviderType.class)));
        enumMap.put(_Fields.PAYMENT_METHOD_ID, new FieldMetaData("paymentMethodId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27498e = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentMethodId.class, unmodifiableMap);
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
        ((C25238b) f27497d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27497d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30243a(MVPaymentMethodId mVPaymentMethodId) {
        if (mVPaymentMethodId == null) {
            return false;
        }
        boolean g = mo30247g();
        boolean g2 = mVPaymentMethodId.mo30247g();
        if ((g || g2) && (!g || !g2 || !this.provider.equals(mVPaymentMethodId.provider))) {
            return false;
        }
        boolean f = mo30246f();
        boolean f2 = mVPaymentMethodId.mo30246f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.paymentMethodId.equals(mVPaymentMethodId.paymentMethodId)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentMethodId mVPaymentMethodId = (MVPaymentMethodId) obj;
        if (!getClass().equals(mVPaymentMethodId.getClass())) {
            return getClass().getName().compareTo(mVPaymentMethodId.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30247g()).compareTo(Boolean.valueOf(mVPaymentMethodId.mo30247g()));
        if (compareTo2 != 0 || ((mo30247g() && (compareTo2 = this.provider.compareTo(mVPaymentMethodId.provider)) != 0) || (compareTo2 = Boolean.valueOf(mo30246f()).compareTo(Boolean.valueOf(mVPaymentMethodId.mo30246f()))) != 0)) {
            return compareTo2;
        }
        if (!mo30246f() || (compareTo = this.paymentMethodId.compareTo(mVPaymentMethodId.paymentMethodId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentMethodId)) {
            return mo30243a((MVPaymentMethodId) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30246f() {
        return this.paymentMethodId != null;
    }

    /* renamed from: g */
    public final boolean mo30247g() {
        return this.provider != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentMethodId(", "provider:");
        MVClearanceProviderType mVClearanceProviderType = this.provider;
        if (mVClearanceProviderType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClearanceProviderType);
        }
        n.append(", ");
        n.append("paymentMethodId:");
        String str = this.paymentMethodId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
