package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
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

public class MVPaymentRegistrationExternalAccountLoginRequest implements TBase<MVPaymentRegistrationExternalAccountLoginRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationExternalAccountLoginRequest> {

    /* renamed from: b */
    public static final C25113c f27530b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27531c = new C25113c("id", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27532d = new C25113c("inputFieldsValues", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f27533e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27534f;

    /* renamed from: id */
    public String f27535id;
    public List<MVInputFieldValue> inputFieldsValues;
    public String paymentContext;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        ID(2, "id"),
        INPUT_FIELDS_VALUES(3, "inputFieldsValues");
        
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
                return ID;
            }
            if (i != 3) {
                return null;
            }
            return INPUT_FIELDS_VALUES;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginRequest$a */
    public static class C9935a extends C25239c<MVPaymentRegistrationExternalAccountLoginRequest> {
        public C9935a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationExternalAccountLoginRequest mVPaymentRegistrationExternalAccountLoginRequest = (MVPaymentRegistrationExternalAccountLoginRequest) tBase;
            mVPaymentRegistrationExternalAccountLoginRequest.getClass();
            C25113c cVar = MVPaymentRegistrationExternalAccountLoginRequest.f27530b;
            gVar.mo61687K();
            if (mVPaymentRegistrationExternalAccountLoginRequest.paymentContext != null) {
                gVar.mo61711x(MVPaymentRegistrationExternalAccountLoginRequest.f27530b);
                gVar.mo61686J(mVPaymentRegistrationExternalAccountLoginRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationExternalAccountLoginRequest.f27535id != null) {
                gVar.mo61711x(MVPaymentRegistrationExternalAccountLoginRequest.f27531c);
                gVar.mo61686J(mVPaymentRegistrationExternalAccountLoginRequest.f27535id);
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues != null) {
                gVar.mo61711x(MVPaymentRegistrationExternalAccountLoginRequest.f27532d);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues.size()));
                for (MVInputFieldValue X0 : mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues) {
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
            MVPaymentRegistrationExternalAccountLoginRequest mVPaymentRegistrationExternalAccountLoginRequest = (MVPaymentRegistrationExternalAccountLoginRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentRegistrationExternalAccountLoginRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVInputFieldValue mVInputFieldValue = new MVInputFieldValue();
                                mVInputFieldValue.mo25201C1(gVar);
                                mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues.add(mVInputFieldValue);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPaymentRegistrationExternalAccountLoginRequest.f27535id = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentRegistrationExternalAccountLoginRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginRequest$b */
    public static class C9936b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9935a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginRequest$c */
    public static class C9937c extends C25240d<MVPaymentRegistrationExternalAccountLoginRequest> {
        public C9937c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationExternalAccountLoginRequest mVPaymentRegistrationExternalAccountLoginRequest = (MVPaymentRegistrationExternalAccountLoginRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationExternalAccountLoginRequest.mo30305h()) {
                bitSet.set(0);
            }
            if (mVPaymentRegistrationExternalAccountLoginRequest.mo30303f()) {
                bitSet.set(1);
            }
            if (mVPaymentRegistrationExternalAccountLoginRequest.mo30304g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPaymentRegistrationExternalAccountLoginRequest.mo30305h()) {
                jVar.mo61686J(mVPaymentRegistrationExternalAccountLoginRequest.paymentContext);
            }
            if (mVPaymentRegistrationExternalAccountLoginRequest.mo30303f()) {
                jVar.mo61686J(mVPaymentRegistrationExternalAccountLoginRequest.f27535id);
            }
            if (mVPaymentRegistrationExternalAccountLoginRequest.mo30304g()) {
                jVar.mo61678B(mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues.size());
                for (MVInputFieldValue X0 : mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationExternalAccountLoginRequest mVPaymentRegistrationExternalAccountLoginRequest = (MVPaymentRegistrationExternalAccountLoginRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPaymentRegistrationExternalAccountLoginRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentRegistrationExternalAccountLoginRequest.f27535id = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVInputFieldValue mVInputFieldValue = new MVInputFieldValue();
                    mVInputFieldValue.mo25201C1(jVar);
                    mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues.add(mVInputFieldValue);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginRequest$d */
    public static class C9938d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9937c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationExternalAccountLoginRequest");
        HashMap hashMap = new HashMap();
        f27533e = hashMap;
        hashMap.put(C25239c.class, new C9936b());
        hashMap.put(C25240d.class, new C9938d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INPUT_FIELDS_VALUES, new FieldMetaData("inputFieldsValues", (byte) 3, new ListMetaData(new StructMetaData(MVInputFieldValue.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27534f = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationExternalAccountLoginRequest.class, unmodifiableMap);
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
        ((C25238b) f27533e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27533e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPaymentRegistrationExternalAccountLoginRequest mVPaymentRegistrationExternalAccountLoginRequest = (MVPaymentRegistrationExternalAccountLoginRequest) obj;
        if (!getClass().equals(mVPaymentRegistrationExternalAccountLoginRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationExternalAccountLoginRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30305h()).compareTo(Boolean.valueOf(mVPaymentRegistrationExternalAccountLoginRequest.mo30305h()));
        if (compareTo != 0 || ((mo30305h() && (compareTo = this.paymentContext.compareTo(mVPaymentRegistrationExternalAccountLoginRequest.paymentContext)) != 0) || (compareTo = Boolean.valueOf(mo30303f()).compareTo(Boolean.valueOf(mVPaymentRegistrationExternalAccountLoginRequest.mo30303f()))) != 0 || ((mo30303f() && (compareTo = this.f27535id.compareTo(mVPaymentRegistrationExternalAccountLoginRequest.f27535id)) != 0) || (compareTo = Boolean.valueOf(mo30304g()).compareTo(Boolean.valueOf(mVPaymentRegistrationExternalAccountLoginRequest.mo30304g()))) != 0))) {
            return compareTo;
        }
        if (!mo30304g() || (h = C25082a.m62844h(this.inputFieldsValues, mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRegistrationExternalAccountLoginRequest)) {
            return false;
        }
        MVPaymentRegistrationExternalAccountLoginRequest mVPaymentRegistrationExternalAccountLoginRequest = (MVPaymentRegistrationExternalAccountLoginRequest) obj;
        boolean h = mo30305h();
        boolean h2 = mVPaymentRegistrationExternalAccountLoginRequest.mo30305h();
        if ((h || h2) && (!h || !h2 || !this.paymentContext.equals(mVPaymentRegistrationExternalAccountLoginRequest.paymentContext))) {
            return false;
        }
        boolean f = mo30303f();
        boolean f2 = mVPaymentRegistrationExternalAccountLoginRequest.mo30303f();
        if ((f || f2) && (!f || !f2 || !this.f27535id.equals(mVPaymentRegistrationExternalAccountLoginRequest.f27535id))) {
            return false;
        }
        boolean g = mo30304g();
        boolean g2 = mVPaymentRegistrationExternalAccountLoginRequest.mo30304g();
        if ((g || g2) && (!g || !g2 || !this.inputFieldsValues.equals(mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30303f() {
        return this.f27535id != null;
    }

    /* renamed from: g */
    public final boolean mo30304g() {
        return this.inputFieldsValues != null;
    }

    /* renamed from: h */
    public final boolean mo30305h() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRegistrationExternalAccountLoginRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("id:");
        String str2 = this.f27535id;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("inputFieldsValues:");
        List<MVInputFieldValue> list = this.inputFieldsValues;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
