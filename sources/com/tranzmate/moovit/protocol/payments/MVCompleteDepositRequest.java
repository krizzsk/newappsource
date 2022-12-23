package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
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

public class MVCompleteDepositRequest implements TBase<MVCompleteDepositRequest, _Fields>, Serializable, Cloneable, Comparable<MVCompleteDepositRequest> {

    /* renamed from: b */
    public static final C25113c f27184b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27185c = new C25113c("paymentMethodId", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27186d = new C25113c(FirebaseMessagingService.EXTRA_TOKEN, (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f27187e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27188f;
    public String paymentContext;
    public MVPaymentMethodId paymentMethodId;
    public String token;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        PAYMENT_METHOD_ID(2, "paymentMethodId"),
        TOKEN(3, FirebaseMessagingService.EXTRA_TOKEN);
        
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
            if (i == 2) {
                return PAYMENT_METHOD_ID;
            }
            if (i != 3) {
                return null;
            }
            return TOKEN;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCompleteDepositRequest$a */
    public static class C9668a extends C25239c<MVCompleteDepositRequest> {
        public C9668a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCompleteDepositRequest mVCompleteDepositRequest = (MVCompleteDepositRequest) tBase;
            MVPaymentMethodId mVPaymentMethodId = mVCompleteDepositRequest.paymentMethodId;
            C25113c cVar = MVCompleteDepositRequest.f27184b;
            gVar.mo61687K();
            if (mVCompleteDepositRequest.paymentContext != null) {
                gVar.mo61711x(MVCompleteDepositRequest.f27184b);
                gVar.mo61686J(mVCompleteDepositRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVCompleteDepositRequest.paymentMethodId != null) {
                gVar.mo61711x(MVCompleteDepositRequest.f27185c);
                mVCompleteDepositRequest.paymentMethodId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCompleteDepositRequest.token != null) {
                gVar.mo61711x(MVCompleteDepositRequest.f27186d);
                gVar.mo61686J(mVCompleteDepositRequest.token);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCompleteDepositRequest mVCompleteDepositRequest = (MVCompleteDepositRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPaymentMethodId mVPaymentMethodId = mVCompleteDepositRequest.paymentMethodId;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVCompleteDepositRequest.token = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVPaymentMethodId mVPaymentMethodId2 = new MVPaymentMethodId();
                        mVCompleteDepositRequest.paymentMethodId = mVPaymentMethodId2;
                        mVPaymentMethodId2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCompleteDepositRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCompleteDepositRequest$b */
    public static class C9669b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9668a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCompleteDepositRequest$c */
    public static class C9670c extends C25240d<MVCompleteDepositRequest> {
        public C9670c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCompleteDepositRequest mVCompleteDepositRequest = (MVCompleteDepositRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCompleteDepositRequest.mo29721f()) {
                bitSet.set(0);
            }
            if (mVCompleteDepositRequest.mo29722g()) {
                bitSet.set(1);
            }
            if (mVCompleteDepositRequest.mo29723h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCompleteDepositRequest.mo29721f()) {
                jVar.mo61686J(mVCompleteDepositRequest.paymentContext);
            }
            if (mVCompleteDepositRequest.mo29722g()) {
                mVCompleteDepositRequest.paymentMethodId.mo25202X0(jVar);
            }
            if (mVCompleteDepositRequest.mo29723h()) {
                jVar.mo61686J(mVCompleteDepositRequest.token);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCompleteDepositRequest mVCompleteDepositRequest = (MVCompleteDepositRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVCompleteDepositRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                mVCompleteDepositRequest.paymentMethodId = mVPaymentMethodId;
                mVPaymentMethodId.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVCompleteDepositRequest.token = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCompleteDepositRequest$d */
    public static class C9671d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9670c(0);
        }
    }

    static {
        new C17394d0("MVCompleteDepositRequest");
        HashMap hashMap = new HashMap();
        f27187e = hashMap;
        hashMap.put(C25239c.class, new C9669b());
        hashMap.put(C25240d.class, new C9671d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_METHOD_ID, new FieldMetaData("paymentMethodId", (byte) 3, new StructMetaData(MVPaymentMethodId.class)));
        enumMap.put(_Fields.TOKEN, new FieldMetaData(FirebaseMessagingService.EXTRA_TOKEN, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27188f = unmodifiableMap;
        FieldMetaData.m61947a(MVCompleteDepositRequest.class, unmodifiableMap);
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
        ((C25238b) f27187e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27187e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCompleteDepositRequest mVCompleteDepositRequest = (MVCompleteDepositRequest) obj;
        if (!getClass().equals(mVCompleteDepositRequest.getClass())) {
            return getClass().getName().compareTo(mVCompleteDepositRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29721f()).compareTo(Boolean.valueOf(mVCompleteDepositRequest.mo29721f()));
        if (compareTo2 != 0 || ((mo29721f() && (compareTo2 = this.paymentContext.compareTo(mVCompleteDepositRequest.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo29722g()).compareTo(Boolean.valueOf(mVCompleteDepositRequest.mo29722g()))) != 0 || ((mo29722g() && (compareTo2 = this.paymentMethodId.compareTo(mVCompleteDepositRequest.paymentMethodId)) != 0) || (compareTo2 = Boolean.valueOf(mo29723h()).compareTo(Boolean.valueOf(mVCompleteDepositRequest.mo29723h()))) != 0))) {
            return compareTo2;
        }
        if (!mo29723h() || (compareTo = this.token.compareTo(mVCompleteDepositRequest.token)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCompleteDepositRequest)) {
            return false;
        }
        MVCompleteDepositRequest mVCompleteDepositRequest = (MVCompleteDepositRequest) obj;
        boolean f = mo29721f();
        boolean f2 = mVCompleteDepositRequest.mo29721f();
        if ((f || f2) && (!f || !f2 || !this.paymentContext.equals(mVCompleteDepositRequest.paymentContext))) {
            return false;
        }
        boolean g = mo29722g();
        boolean g2 = mVCompleteDepositRequest.mo29722g();
        if ((g || g2) && (!g || !g2 || !this.paymentMethodId.mo30243a(mVCompleteDepositRequest.paymentMethodId))) {
            return false;
        }
        boolean h = mo29723h();
        boolean h2 = mVCompleteDepositRequest.mo29723h();
        if ((h || h2) && (!h || !h2 || !this.token.equals(mVCompleteDepositRequest.token))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29721f() {
        return this.paymentContext != null;
    }

    /* renamed from: g */
    public final boolean mo29722g() {
        return this.paymentMethodId != null;
    }

    /* renamed from: h */
    public final boolean mo29723h() {
        return this.token != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCompleteDepositRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("paymentMethodId:");
        MVPaymentMethodId mVPaymentMethodId = this.paymentMethodId;
        if (mVPaymentMethodId == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentMethodId);
        }
        n.append(", ");
        n.append("token:");
        String str2 = this.token;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
