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

public class MVPaymentRegistrationInputRequest implements TBase<MVPaymentRegistrationInputRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationInputRequest> {

    /* renamed from: b */
    public static final C25113c f27545b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27546c = new C25113c("id", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27547d = new C25113c("inputFieldsValues", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f27548e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27549f;

    /* renamed from: id */
    public String f27550id;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationInputRequest$a */
    public static class C9947a extends C25239c<MVPaymentRegistrationInputRequest> {
        public C9947a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationInputRequest mVPaymentRegistrationInputRequest = (MVPaymentRegistrationInputRequest) tBase;
            mVPaymentRegistrationInputRequest.getClass();
            C25113c cVar = MVPaymentRegistrationInputRequest.f27545b;
            gVar.mo61687K();
            if (mVPaymentRegistrationInputRequest.paymentContext != null) {
                gVar.mo61711x(MVPaymentRegistrationInputRequest.f27545b);
                gVar.mo61686J(mVPaymentRegistrationInputRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationInputRequest.f27550id != null) {
                gVar.mo61711x(MVPaymentRegistrationInputRequest.f27546c);
                gVar.mo61686J(mVPaymentRegistrationInputRequest.f27550id);
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationInputRequest.inputFieldsValues != null) {
                gVar.mo61711x(MVPaymentRegistrationInputRequest.f27547d);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentRegistrationInputRequest.inputFieldsValues.size()));
                for (MVInputFieldValue X0 : mVPaymentRegistrationInputRequest.inputFieldsValues) {
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
            MVPaymentRegistrationInputRequest mVPaymentRegistrationInputRequest = (MVPaymentRegistrationInputRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentRegistrationInputRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVPaymentRegistrationInputRequest.inputFieldsValues = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVInputFieldValue mVInputFieldValue = new MVInputFieldValue();
                                mVInputFieldValue.mo25201C1(gVar);
                                mVPaymentRegistrationInputRequest.inputFieldsValues.add(mVInputFieldValue);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPaymentRegistrationInputRequest.f27550id = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentRegistrationInputRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationInputRequest$b */
    public static class C9948b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9947a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationInputRequest$c */
    public static class C9949c extends C25240d<MVPaymentRegistrationInputRequest> {
        public C9949c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationInputRequest mVPaymentRegistrationInputRequest = (MVPaymentRegistrationInputRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationInputRequest.mo30327h()) {
                bitSet.set(0);
            }
            if (mVPaymentRegistrationInputRequest.mo30325f()) {
                bitSet.set(1);
            }
            if (mVPaymentRegistrationInputRequest.mo30326g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPaymentRegistrationInputRequest.mo30327h()) {
                jVar.mo61686J(mVPaymentRegistrationInputRequest.paymentContext);
            }
            if (mVPaymentRegistrationInputRequest.mo30325f()) {
                jVar.mo61686J(mVPaymentRegistrationInputRequest.f27550id);
            }
            if (mVPaymentRegistrationInputRequest.mo30326g()) {
                jVar.mo61678B(mVPaymentRegistrationInputRequest.inputFieldsValues.size());
                for (MVInputFieldValue X0 : mVPaymentRegistrationInputRequest.inputFieldsValues) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationInputRequest mVPaymentRegistrationInputRequest = (MVPaymentRegistrationInputRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPaymentRegistrationInputRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentRegistrationInputRequest.f27550id = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVPaymentRegistrationInputRequest.inputFieldsValues = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVInputFieldValue mVInputFieldValue = new MVInputFieldValue();
                    mVInputFieldValue.mo25201C1(jVar);
                    mVPaymentRegistrationInputRequest.inputFieldsValues.add(mVInputFieldValue);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationInputRequest$d */
    public static class C9950d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9949c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationInputRequest");
        HashMap hashMap = new HashMap();
        f27548e = hashMap;
        hashMap.put(C25239c.class, new C9948b());
        hashMap.put(C25240d.class, new C9950d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INPUT_FIELDS_VALUES, new FieldMetaData("inputFieldsValues", (byte) 3, new ListMetaData(new StructMetaData(MVInputFieldValue.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27549f = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationInputRequest.class, unmodifiableMap);
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
        ((C25238b) f27548e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27548e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPaymentRegistrationInputRequest mVPaymentRegistrationInputRequest = (MVPaymentRegistrationInputRequest) obj;
        if (!getClass().equals(mVPaymentRegistrationInputRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationInputRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30327h()).compareTo(Boolean.valueOf(mVPaymentRegistrationInputRequest.mo30327h()));
        if (compareTo != 0 || ((mo30327h() && (compareTo = this.paymentContext.compareTo(mVPaymentRegistrationInputRequest.paymentContext)) != 0) || (compareTo = Boolean.valueOf(mo30325f()).compareTo(Boolean.valueOf(mVPaymentRegistrationInputRequest.mo30325f()))) != 0 || ((mo30325f() && (compareTo = this.f27550id.compareTo(mVPaymentRegistrationInputRequest.f27550id)) != 0) || (compareTo = Boolean.valueOf(mo30326g()).compareTo(Boolean.valueOf(mVPaymentRegistrationInputRequest.mo30326g()))) != 0))) {
            return compareTo;
        }
        if (!mo30326g() || (h = C25082a.m62844h(this.inputFieldsValues, mVPaymentRegistrationInputRequest.inputFieldsValues)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRegistrationInputRequest)) {
            return false;
        }
        MVPaymentRegistrationInputRequest mVPaymentRegistrationInputRequest = (MVPaymentRegistrationInputRequest) obj;
        boolean h = mo30327h();
        boolean h2 = mVPaymentRegistrationInputRequest.mo30327h();
        if ((h || h2) && (!h || !h2 || !this.paymentContext.equals(mVPaymentRegistrationInputRequest.paymentContext))) {
            return false;
        }
        boolean f = mo30325f();
        boolean f2 = mVPaymentRegistrationInputRequest.mo30325f();
        if ((f || f2) && (!f || !f2 || !this.f27550id.equals(mVPaymentRegistrationInputRequest.f27550id))) {
            return false;
        }
        boolean g = mo30326g();
        boolean g2 = mVPaymentRegistrationInputRequest.mo30326g();
        if ((g || g2) && (!g || !g2 || !this.inputFieldsValues.equals(mVPaymentRegistrationInputRequest.inputFieldsValues))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30325f() {
        return this.f27550id != null;
    }

    /* renamed from: g */
    public final boolean mo30326g() {
        return this.inputFieldsValues != null;
    }

    /* renamed from: h */
    public final boolean mo30327h() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRegistrationInputRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("id:");
        String str2 = this.f27550id;
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
