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

public class MVGooglePayInstructions implements TBase<MVGooglePayInstructions, _Fields>, Serializable, Cloneable, Comparable<MVGooglePayInstructions> {

    /* renamed from: b */
    public static final C25113c f27311b = new C25113c("isReadyToPayRequest", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27312c = new C25113c("paymentDataRequest", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27313d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27314e;
    public String isReadyToPayRequest;
    public String paymentDataRequest;

    public enum _Fields implements C25085c {
        IS_READY_TO_PAY_REQUEST(1, "isReadyToPayRequest"),
        PAYMENT_DATA_REQUEST(2, "paymentDataRequest");
        
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
                return IS_READY_TO_PAY_REQUEST;
            }
            if (i != 2) {
                return null;
            }
            return PAYMENT_DATA_REQUEST;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGooglePayInstructions$a */
    public static class C9789a extends C25239c<MVGooglePayInstructions> {
        public C9789a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGooglePayInstructions mVGooglePayInstructions = (MVGooglePayInstructions) tBase;
            mVGooglePayInstructions.getClass();
            C25113c cVar = MVGooglePayInstructions.f27311b;
            gVar.mo61687K();
            if (mVGooglePayInstructions.isReadyToPayRequest != null) {
                gVar.mo61711x(MVGooglePayInstructions.f27311b);
                gVar.mo61686J(mVGooglePayInstructions.isReadyToPayRequest);
                gVar.mo61712y();
            }
            if (mVGooglePayInstructions.paymentDataRequest != null) {
                gVar.mo61711x(MVGooglePayInstructions.f27312c);
                gVar.mo61686J(mVGooglePayInstructions.paymentDataRequest);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGooglePayInstructions mVGooglePayInstructions = (MVGooglePayInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGooglePayInstructions.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVGooglePayInstructions.paymentDataRequest = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGooglePayInstructions.isReadyToPayRequest = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGooglePayInstructions$b */
    public static class C9790b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9789a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGooglePayInstructions$c */
    public static class C9791c extends C25240d<MVGooglePayInstructions> {
        public C9791c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGooglePayInstructions mVGooglePayInstructions = (MVGooglePayInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGooglePayInstructions.mo29949f()) {
                bitSet.set(0);
            }
            if (mVGooglePayInstructions.mo29950g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGooglePayInstructions.mo29949f()) {
                jVar.mo61686J(mVGooglePayInstructions.isReadyToPayRequest);
            }
            if (mVGooglePayInstructions.mo29950g()) {
                jVar.mo61686J(mVGooglePayInstructions.paymentDataRequest);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGooglePayInstructions mVGooglePayInstructions = (MVGooglePayInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVGooglePayInstructions.isReadyToPayRequest = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVGooglePayInstructions.paymentDataRequest = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGooglePayInstructions$d */
    public static class C9792d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9791c(0);
        }
    }

    static {
        new C17394d0("MVGooglePayInstructions");
        HashMap hashMap = new HashMap();
        f27313d = hashMap;
        hashMap.put(C25239c.class, new C9790b());
        hashMap.put(C25240d.class, new C9792d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_READY_TO_PAY_REQUEST, new FieldMetaData("isReadyToPayRequest", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_DATA_REQUEST, new FieldMetaData("paymentDataRequest", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27314e = unmodifiableMap;
        FieldMetaData.m61947a(MVGooglePayInstructions.class, unmodifiableMap);
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
        ((C25238b) f27313d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27313d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29946a(MVGooglePayInstructions mVGooglePayInstructions) {
        if (mVGooglePayInstructions == null) {
            return false;
        }
        boolean f = mo29949f();
        boolean f2 = mVGooglePayInstructions.mo29949f();
        if ((f || f2) && (!f || !f2 || !this.isReadyToPayRequest.equals(mVGooglePayInstructions.isReadyToPayRequest))) {
            return false;
        }
        boolean g = mo29950g();
        boolean g2 = mVGooglePayInstructions.mo29950g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.paymentDataRequest.equals(mVGooglePayInstructions.paymentDataRequest)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGooglePayInstructions mVGooglePayInstructions = (MVGooglePayInstructions) obj;
        if (!getClass().equals(mVGooglePayInstructions.getClass())) {
            return getClass().getName().compareTo(mVGooglePayInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29949f()).compareTo(Boolean.valueOf(mVGooglePayInstructions.mo29949f()));
        if (compareTo2 != 0 || ((mo29949f() && (compareTo2 = this.isReadyToPayRequest.compareTo(mVGooglePayInstructions.isReadyToPayRequest)) != 0) || (compareTo2 = Boolean.valueOf(mo29950g()).compareTo(Boolean.valueOf(mVGooglePayInstructions.mo29950g()))) != 0)) {
            return compareTo2;
        }
        if (!mo29950g() || (compareTo = this.paymentDataRequest.compareTo(mVGooglePayInstructions.paymentDataRequest)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVGooglePayInstructions)) {
            return mo29946a((MVGooglePayInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29949f() {
        return this.isReadyToPayRequest != null;
    }

    /* renamed from: g */
    public final boolean mo29950g() {
        return this.paymentDataRequest != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGooglePayInstructions(", "isReadyToPayRequest:");
        String str = this.isReadyToPayRequest;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("paymentDataRequest:");
        String str2 = this.paymentDataRequest;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
