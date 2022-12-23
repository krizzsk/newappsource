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

public class MVPaymentAccountContext implements TBase<MVPaymentAccountContext, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountContext> {

    /* renamed from: b */
    public static final C25113c f27413b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27414c = new C25113c(ServerParameters.STATUS, (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f27415d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27416e;
    public String paymentContext;
    public MVPaymentAccountContextStatus status;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        STATUS(2, ServerParameters.STATUS);
        
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
                return PAYMENT_CONTEXT;
            }
            if (i != 2) {
                return null;
            }
            return STATUS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountContext$a */
    public static class C9853a extends C25239c<MVPaymentAccountContext> {
        public C9853a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountContext mVPaymentAccountContext = (MVPaymentAccountContext) tBase;
            mVPaymentAccountContext.getClass();
            C25113c cVar = MVPaymentAccountContext.f27413b;
            gVar.mo61687K();
            if (mVPaymentAccountContext.paymentContext != null) {
                gVar.mo61711x(MVPaymentAccountContext.f27413b);
                gVar.mo61686J(mVPaymentAccountContext.paymentContext);
                gVar.mo61712y();
            }
            if (mVPaymentAccountContext.status != null) {
                gVar.mo61711x(MVPaymentAccountContext.f27414c);
                gVar.mo61678B(mVPaymentAccountContext.status.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountContext mVPaymentAccountContext = (MVPaymentAccountContext) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentAccountContext.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVPaymentAccountContext.status = MVPaymentAccountContextStatus.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentAccountContext.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountContext$b */
    public static class C9854b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9853a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountContext$c */
    public static class C9855c extends C25240d<MVPaymentAccountContext> {
        public C9855c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountContext mVPaymentAccountContext = (MVPaymentAccountContext) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountContext.mo30115f()) {
                bitSet.set(0);
            }
            if (mVPaymentAccountContext.mo30116g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPaymentAccountContext.mo30115f()) {
                jVar.mo61686J(mVPaymentAccountContext.paymentContext);
            }
            if (mVPaymentAccountContext.mo30116g()) {
                jVar.mo61678B(mVPaymentAccountContext.status.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountContext mVPaymentAccountContext = (MVPaymentAccountContext) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPaymentAccountContext.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentAccountContext.status = MVPaymentAccountContextStatus.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountContext$d */
    public static class C9856d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9855c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountContext");
        HashMap hashMap = new HashMap();
        f27415d = hashMap;
        hashMap.put(C25239c.class, new C9854b());
        hashMap.put(C25240d.class, new C9856d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVPaymentAccountContextStatus.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27416e = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountContext.class, unmodifiableMap);
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
        ((C25238b) f27415d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27415d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentAccountContext mVPaymentAccountContext = (MVPaymentAccountContext) obj;
        if (!getClass().equals(mVPaymentAccountContext.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountContext.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30115f()).compareTo(Boolean.valueOf(mVPaymentAccountContext.mo30115f()));
        if (compareTo2 != 0 || ((mo30115f() && (compareTo2 = this.paymentContext.compareTo(mVPaymentAccountContext.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo30116g()).compareTo(Boolean.valueOf(mVPaymentAccountContext.mo30116g()))) != 0)) {
            return compareTo2;
        }
        if (!mo30116g() || (compareTo = this.status.compareTo(mVPaymentAccountContext.status)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentAccountContext)) {
            return false;
        }
        MVPaymentAccountContext mVPaymentAccountContext = (MVPaymentAccountContext) obj;
        boolean f = mo30115f();
        boolean f2 = mVPaymentAccountContext.mo30115f();
        if ((f || f2) && (!f || !f2 || !this.paymentContext.equals(mVPaymentAccountContext.paymentContext))) {
            return false;
        }
        boolean g = mo30116g();
        boolean g2 = mVPaymentAccountContext.mo30116g();
        if ((g || g2) && (!g || !g2 || !this.status.equals(mVPaymentAccountContext.status))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30115f() {
        return this.paymentContext != null;
    }

    /* renamed from: g */
    public final boolean mo30116g() {
        return this.status != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAccountContext(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("status:");
        MVPaymentAccountContextStatus mVPaymentAccountContextStatus = this.status;
        if (mVPaymentAccountContextStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentAccountContextStatus);
        }
        n.append(")");
        return n.toString();
    }
}
