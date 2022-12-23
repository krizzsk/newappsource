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

public class MVGetWebInstructionsRequest implements TBase<MVGetWebInstructionsRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetWebInstructionsRequest> {

    /* renamed from: b */
    public static final C25113c f27303b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27304c = new C25113c("returnUrls", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27305d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27306e;
    public String paymentContext;
    public MVTokenizeReturnUrls returnUrls;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        RETURN_URLS(2, "returnUrls");
        
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
            return RETURN_URLS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsRequest$a */
    public static class C9781a extends C25239c<MVGetWebInstructionsRequest> {
        public C9781a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetWebInstructionsRequest mVGetWebInstructionsRequest = (MVGetWebInstructionsRequest) tBase;
            MVTokenizeReturnUrls mVTokenizeReturnUrls = mVGetWebInstructionsRequest.returnUrls;
            C25113c cVar = MVGetWebInstructionsRequest.f27303b;
            gVar.mo61687K();
            if (mVGetWebInstructionsRequest.paymentContext != null) {
                gVar.mo61711x(MVGetWebInstructionsRequest.f27303b);
                gVar.mo61686J(mVGetWebInstructionsRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVGetWebInstructionsRequest.returnUrls != null) {
                gVar.mo61711x(MVGetWebInstructionsRequest.f27304c);
                mVGetWebInstructionsRequest.returnUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetWebInstructionsRequest mVGetWebInstructionsRequest = (MVGetWebInstructionsRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTokenizeReturnUrls mVTokenizeReturnUrls = mVGetWebInstructionsRequest.returnUrls;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTokenizeReturnUrls mVTokenizeReturnUrls2 = new MVTokenizeReturnUrls();
                        mVGetWebInstructionsRequest.returnUrls = mVTokenizeReturnUrls2;
                        mVTokenizeReturnUrls2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGetWebInstructionsRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsRequest$b */
    public static class C9782b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9781a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsRequest$c */
    public static class C9783c extends C25240d<MVGetWebInstructionsRequest> {
        public C9783c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetWebInstructionsRequest mVGetWebInstructionsRequest = (MVGetWebInstructionsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetWebInstructionsRequest.mo29934f()) {
                bitSet.set(0);
            }
            if (mVGetWebInstructionsRequest.mo29935g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGetWebInstructionsRequest.mo29934f()) {
                jVar.mo61686J(mVGetWebInstructionsRequest.paymentContext);
            }
            if (mVGetWebInstructionsRequest.mo29935g()) {
                mVGetWebInstructionsRequest.returnUrls.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetWebInstructionsRequest mVGetWebInstructionsRequest = (MVGetWebInstructionsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVGetWebInstructionsRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                mVGetWebInstructionsRequest.returnUrls = mVTokenizeReturnUrls;
                mVTokenizeReturnUrls.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetWebInstructionsRequest$d */
    public static class C9784d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9783c(0);
        }
    }

    static {
        new C17394d0("MVGetWebInstructionsRequest");
        HashMap hashMap = new HashMap();
        f27305d = hashMap;
        hashMap.put(C25239c.class, new C9782b());
        hashMap.put(C25240d.class, new C9784d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RETURN_URLS, new FieldMetaData("returnUrls", (byte) 3, new StructMetaData(MVTokenizeReturnUrls.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27306e = unmodifiableMap;
        FieldMetaData.m61947a(MVGetWebInstructionsRequest.class, unmodifiableMap);
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
        ((C25238b) f27305d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27305d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetWebInstructionsRequest mVGetWebInstructionsRequest = (MVGetWebInstructionsRequest) obj;
        if (!getClass().equals(mVGetWebInstructionsRequest.getClass())) {
            return getClass().getName().compareTo(mVGetWebInstructionsRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29934f()).compareTo(Boolean.valueOf(mVGetWebInstructionsRequest.mo29934f()));
        if (compareTo2 != 0 || ((mo29934f() && (compareTo2 = this.paymentContext.compareTo(mVGetWebInstructionsRequest.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo29935g()).compareTo(Boolean.valueOf(mVGetWebInstructionsRequest.mo29935g()))) != 0)) {
            return compareTo2;
        }
        if (!mo29935g() || (compareTo = this.returnUrls.compareTo(mVGetWebInstructionsRequest.returnUrls)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetWebInstructionsRequest)) {
            return false;
        }
        MVGetWebInstructionsRequest mVGetWebInstructionsRequest = (MVGetWebInstructionsRequest) obj;
        boolean f = mo29934f();
        boolean f2 = mVGetWebInstructionsRequest.mo29934f();
        if ((f || f2) && (!f || !f2 || !this.paymentContext.equals(mVGetWebInstructionsRequest.paymentContext))) {
            return false;
        }
        boolean g = mo29935g();
        boolean g2 = mVGetWebInstructionsRequest.mo29935g();
        if ((g || g2) && (!g || !g2 || !this.returnUrls.mo30695a(mVGetWebInstructionsRequest.returnUrls))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29934f() {
        return this.paymentContext != null;
    }

    /* renamed from: g */
    public final boolean mo29935g() {
        return this.returnUrls != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetWebInstructionsRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("returnUrls:");
        MVTokenizeReturnUrls mVTokenizeReturnUrls = this.returnUrls;
        if (mVTokenizeReturnUrls == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTokenizeReturnUrls);
        }
        n.append(")");
        return n.toString();
    }
}
