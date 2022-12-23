package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVApplePayPaymentMethod implements TBase<MVApplePayPaymentMethod, _Fields>, Serializable, Cloneable, Comparable<MVApplePayPaymentMethod> {

    /* renamed from: b */
    public static final C25113c f27095b = new C25113c("paymentMethodType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27096c = new C25113c("displayName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27097d = new C25113c(ServerParameters.NETWORK, (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f27098e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27099f;
    public String displayName;
    public String network;
    public MVApplePayPaymentMethodType paymentMethodType;

    public enum _Fields implements C25085c {
        PAYMENT_METHOD_TYPE(1, "paymentMethodType"),
        DISPLAY_NAME(2, "displayName"),
        NETWORK(3, ServerParameters.NETWORK);
        
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
                return PAYMENT_METHOD_TYPE;
            }
            if (i == 2) {
                return DISPLAY_NAME;
            }
            if (i != 3) {
                return null;
            }
            return NETWORK;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentMethod$a */
    public static class C9600a extends C25239c<MVApplePayPaymentMethod> {
        public C9600a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentMethod mVApplePayPaymentMethod = (MVApplePayPaymentMethod) tBase;
            mVApplePayPaymentMethod.getClass();
            C25113c cVar = MVApplePayPaymentMethod.f27095b;
            gVar.mo61687K();
            if (mVApplePayPaymentMethod.paymentMethodType != null) {
                gVar.mo61711x(MVApplePayPaymentMethod.f27095b);
                gVar.mo61678B(mVApplePayPaymentMethod.paymentMethodType.getValue());
                gVar.mo61712y();
            }
            if (mVApplePayPaymentMethod.displayName != null) {
                gVar.mo61711x(MVApplePayPaymentMethod.f27096c);
                gVar.mo61686J(mVApplePayPaymentMethod.displayName);
                gVar.mo61712y();
            }
            if (mVApplePayPaymentMethod.network != null) {
                gVar.mo61711x(MVApplePayPaymentMethod.f27097d);
                gVar.mo61686J(mVApplePayPaymentMethod.network);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentMethod mVApplePayPaymentMethod = (MVApplePayPaymentMethod) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVApplePayPaymentMethod.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVApplePayPaymentMethod.network = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVApplePayPaymentMethod.displayName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVApplePayPaymentMethod.paymentMethodType = MVApplePayPaymentMethodType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentMethod$b */
    public static class C9601b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9600a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentMethod$c */
    public static class C9602c extends C25240d<MVApplePayPaymentMethod> {
        public C9602c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentMethod mVApplePayPaymentMethod = (MVApplePayPaymentMethod) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplePayPaymentMethod.mo29570h()) {
                bitSet.set(0);
            }
            if (mVApplePayPaymentMethod.mo29568f()) {
                bitSet.set(1);
            }
            if (mVApplePayPaymentMethod.mo29569g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVApplePayPaymentMethod.mo29570h()) {
                jVar.mo61678B(mVApplePayPaymentMethod.paymentMethodType.getValue());
            }
            if (mVApplePayPaymentMethod.mo29568f()) {
                jVar.mo61686J(mVApplePayPaymentMethod.displayName);
            }
            if (mVApplePayPaymentMethod.mo29569g()) {
                jVar.mo61686J(mVApplePayPaymentMethod.network);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentMethod mVApplePayPaymentMethod = (MVApplePayPaymentMethod) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVApplePayPaymentMethod.paymentMethodType = MVApplePayPaymentMethodType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVApplePayPaymentMethod.displayName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVApplePayPaymentMethod.network = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentMethod$d */
    public static class C9603d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9602c(0);
        }
    }

    static {
        new C17394d0("MVApplePayPaymentMethod");
        HashMap hashMap = new HashMap();
        f27098e = hashMap;
        hashMap.put(C25239c.class, new C9601b());
        hashMap.put(C25240d.class, new C9603d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_METHOD_TYPE, new FieldMetaData("paymentMethodType", (byte) 3, new EnumMetaData(MVApplePayPaymentMethodType.class)));
        enumMap.put(_Fields.DISPLAY_NAME, new FieldMetaData("displayName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NETWORK, new FieldMetaData(ServerParameters.NETWORK, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27099f = unmodifiableMap;
        FieldMetaData.m61947a(MVApplePayPaymentMethod.class, unmodifiableMap);
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
        ((C25238b) f27098e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27098e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29565a(MVApplePayPaymentMethod mVApplePayPaymentMethod) {
        if (mVApplePayPaymentMethod == null) {
            return false;
        }
        boolean h = mo29570h();
        boolean h2 = mVApplePayPaymentMethod.mo29570h();
        if ((h || h2) && (!h || !h2 || !this.paymentMethodType.equals(mVApplePayPaymentMethod.paymentMethodType))) {
            return false;
        }
        boolean f = mo29568f();
        boolean f2 = mVApplePayPaymentMethod.mo29568f();
        if ((f || f2) && (!f || !f2 || !this.displayName.equals(mVApplePayPaymentMethod.displayName))) {
            return false;
        }
        boolean g = mo29569g();
        boolean g2 = mVApplePayPaymentMethod.mo29569g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.network.equals(mVApplePayPaymentMethod.network)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVApplePayPaymentMethod mVApplePayPaymentMethod = (MVApplePayPaymentMethod) obj;
        if (!getClass().equals(mVApplePayPaymentMethod.getClass())) {
            return getClass().getName().compareTo(mVApplePayPaymentMethod.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29570h()).compareTo(Boolean.valueOf(mVApplePayPaymentMethod.mo29570h()));
        if (compareTo2 != 0 || ((mo29570h() && (compareTo2 = this.paymentMethodType.compareTo(mVApplePayPaymentMethod.paymentMethodType)) != 0) || (compareTo2 = Boolean.valueOf(mo29568f()).compareTo(Boolean.valueOf(mVApplePayPaymentMethod.mo29568f()))) != 0 || ((mo29568f() && (compareTo2 = this.displayName.compareTo(mVApplePayPaymentMethod.displayName)) != 0) || (compareTo2 = Boolean.valueOf(mo29569g()).compareTo(Boolean.valueOf(mVApplePayPaymentMethod.mo29569g()))) != 0))) {
            return compareTo2;
        }
        if (!mo29569g() || (compareTo = this.network.compareTo(mVApplePayPaymentMethod.network)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVApplePayPaymentMethod)) {
            return mo29565a((MVApplePayPaymentMethod) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29568f() {
        return this.displayName != null;
    }

    /* renamed from: g */
    public final boolean mo29569g() {
        return this.network != null;
    }

    /* renamed from: h */
    public final boolean mo29570h() {
        return this.paymentMethodType != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVApplePayPaymentMethod(", "paymentMethodType:");
        MVApplePayPaymentMethodType mVApplePayPaymentMethodType = this.paymentMethodType;
        if (mVApplePayPaymentMethodType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVApplePayPaymentMethodType);
        }
        n.append(", ");
        n.append("displayName:");
        String str = this.displayName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("network:");
        String str2 = this.network;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
