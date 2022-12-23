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

public class MVClearanceProviderPaymentData implements TBase<MVClearanceProviderPaymentData, _Fields>, Serializable, Cloneable, Comparable<MVClearanceProviderPaymentData> {

    /* renamed from: b */
    public static final C25113c f27180b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27181c = new C25113c("paymentToken", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27182d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27183e;
    public String paymentToken;
    public MVClearanceProviderType type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        PAYMENT_TOKEN(2, "paymentToken");
        
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
                return TYPE;
            }
            if (i != 2) {
                return null;
            }
            return PAYMENT_TOKEN;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData$a */
    public static class C9664a extends C25239c<MVClearanceProviderPaymentData> {
        public C9664a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProviderPaymentData mVClearanceProviderPaymentData = (MVClearanceProviderPaymentData) tBase;
            mVClearanceProviderPaymentData.getClass();
            C25113c cVar = MVClearanceProviderPaymentData.f27180b;
            gVar.mo61687K();
            if (mVClearanceProviderPaymentData.type != null) {
                gVar.mo61711x(MVClearanceProviderPaymentData.f27180b);
                gVar.mo61678B(mVClearanceProviderPaymentData.type.getValue());
                gVar.mo61712y();
            }
            if (mVClearanceProviderPaymentData.paymentToken != null) {
                gVar.mo61711x(MVClearanceProviderPaymentData.f27181c);
                gVar.mo61686J(mVClearanceProviderPaymentData.paymentToken);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProviderPaymentData mVClearanceProviderPaymentData = (MVClearanceProviderPaymentData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVClearanceProviderPaymentData.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVClearanceProviderPaymentData.paymentToken = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVClearanceProviderPaymentData.type = MVClearanceProviderType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData$b */
    public static class C9665b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9664a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData$c */
    public static class C9666c extends C25240d<MVClearanceProviderPaymentData> {
        public C9666c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProviderPaymentData mVClearanceProviderPaymentData = (MVClearanceProviderPaymentData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVClearanceProviderPaymentData.mo29714g()) {
                bitSet.set(0);
            }
            if (mVClearanceProviderPaymentData.mo29713f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVClearanceProviderPaymentData.mo29714g()) {
                jVar.mo61678B(mVClearanceProviderPaymentData.type.getValue());
            }
            if (mVClearanceProviderPaymentData.mo29713f()) {
                jVar.mo61686J(mVClearanceProviderPaymentData.paymentToken);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProviderPaymentData mVClearanceProviderPaymentData = (MVClearanceProviderPaymentData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVClearanceProviderPaymentData.type = MVClearanceProviderType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVClearanceProviderPaymentData.paymentToken = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData$d */
    public static class C9667d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9666c(0);
        }
    }

    static {
        new C17394d0("MVClearanceProviderPaymentData");
        HashMap hashMap = new HashMap();
        f27182d = hashMap;
        hashMap.put(C25239c.class, new C9665b());
        hashMap.put(C25240d.class, new C9667d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVClearanceProviderType.class)));
        enumMap.put(_Fields.PAYMENT_TOKEN, new FieldMetaData("paymentToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27183e = unmodifiableMap;
        FieldMetaData.m61947a(MVClearanceProviderPaymentData.class, unmodifiableMap);
    }

    public MVClearanceProviderPaymentData() {
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
        ((C25238b) f27182d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27182d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVClearanceProviderPaymentData mVClearanceProviderPaymentData = (MVClearanceProviderPaymentData) obj;
        if (!getClass().equals(mVClearanceProviderPaymentData.getClass())) {
            return getClass().getName().compareTo(mVClearanceProviderPaymentData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29714g()).compareTo(Boolean.valueOf(mVClearanceProviderPaymentData.mo29714g()));
        if (compareTo2 != 0 || ((mo29714g() && (compareTo2 = this.type.compareTo(mVClearanceProviderPaymentData.type)) != 0) || (compareTo2 = Boolean.valueOf(mo29713f()).compareTo(Boolean.valueOf(mVClearanceProviderPaymentData.mo29713f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29713f() || (compareTo = this.paymentToken.compareTo(mVClearanceProviderPaymentData.paymentToken)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVClearanceProviderPaymentData)) {
            return false;
        }
        MVClearanceProviderPaymentData mVClearanceProviderPaymentData = (MVClearanceProviderPaymentData) obj;
        boolean g = mo29714g();
        boolean g2 = mVClearanceProviderPaymentData.mo29714g();
        if ((g || g2) && (!g || !g2 || !this.type.equals(mVClearanceProviderPaymentData.type))) {
            return false;
        }
        boolean f = mo29713f();
        boolean f2 = mVClearanceProviderPaymentData.mo29713f();
        if ((f || f2) && (!f || !f2 || !this.paymentToken.equals(mVClearanceProviderPaymentData.paymentToken))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29713f() {
        return this.paymentToken != null;
    }

    /* renamed from: g */
    public final boolean mo29714g() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVClearanceProviderPaymentData(", "type:");
        MVClearanceProviderType mVClearanceProviderType = this.type;
        if (mVClearanceProviderType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClearanceProviderType);
        }
        n.append(", ");
        n.append("paymentToken:");
        String str = this.paymentToken;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }

    public MVClearanceProviderPaymentData(MVClearanceProviderType mVClearanceProviderType, String str) {
        this();
        this.type = mVClearanceProviderType;
        this.paymentToken = str;
    }
}
