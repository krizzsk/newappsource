package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVPurchaseCartStep implements TBase<MVPurchaseCartStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseCartStep> {

    /* renamed from: b */
    public static final C25113c f28801b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28802c = new C25113c("cartInfo", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28803d = new C25113c("discountContextId", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f28804e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28805f;
    public MVPurchaseCartInfo cartInfo;
    public String discountContextId;
    private _Fields[] optionals = {_Fields.DISCOUNT_CONTEXT_ID};
    public String paymentContext;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        CART_INFO(2, "cartInfo"),
        DISCOUNT_CONTEXT_ID(3, "discountContextId");
        
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
                return CART_INFO;
            }
            if (i != 3) {
                return null;
            }
            return DISCOUNT_CONTEXT_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartStep$a */
    public static class C10865a extends C25239c<MVPurchaseCartStep> {
        public C10865a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartStep mVPurchaseCartStep = (MVPurchaseCartStep) tBase;
            mVPurchaseCartStep.getClass();
            C25113c cVar = MVPurchaseCartStep.f28801b;
            gVar.mo61687K();
            if (mVPurchaseCartStep.paymentContext != null) {
                gVar.mo61711x(MVPurchaseCartStep.f28801b);
                gVar.mo61686J(mVPurchaseCartStep.paymentContext);
                gVar.mo61712y();
            }
            if (mVPurchaseCartStep.cartInfo != null) {
                gVar.mo61711x(MVPurchaseCartStep.f28802c);
                mVPurchaseCartStep.cartInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseCartStep.discountContextId != null && mVPurchaseCartStep.mo32529g()) {
                gVar.mo61711x(MVPurchaseCartStep.f28803d);
                gVar.mo61686J(mVPurchaseCartStep.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartStep mVPurchaseCartStep = (MVPurchaseCartStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseCartStep.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPurchaseCartStep.discountContextId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVPurchaseCartInfo mVPurchaseCartInfo = new MVPurchaseCartInfo();
                        mVPurchaseCartStep.cartInfo = mVPurchaseCartInfo;
                        mVPurchaseCartInfo.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPurchaseCartStep.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartStep$b */
    public static class C10866b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10865a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartStep$c */
    public static class C10867c extends C25240d<MVPurchaseCartStep> {
        public C10867c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartStep mVPurchaseCartStep = (MVPurchaseCartStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseCartStep.mo32530h()) {
                bitSet.set(0);
            }
            if (mVPurchaseCartStep.mo32528f()) {
                bitSet.set(1);
            }
            if (mVPurchaseCartStep.mo32529g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPurchaseCartStep.mo32530h()) {
                jVar.mo61686J(mVPurchaseCartStep.paymentContext);
            }
            if (mVPurchaseCartStep.mo32528f()) {
                mVPurchaseCartStep.cartInfo.mo25202X0(jVar);
            }
            if (mVPurchaseCartStep.mo32529g()) {
                jVar.mo61686J(mVPurchaseCartStep.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartStep mVPurchaseCartStep = (MVPurchaseCartStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPurchaseCartStep.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVPurchaseCartInfo mVPurchaseCartInfo = new MVPurchaseCartInfo();
                mVPurchaseCartStep.cartInfo = mVPurchaseCartInfo;
                mVPurchaseCartInfo.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPurchaseCartStep.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartStep$d */
    public static class C10868d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10867c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseCartStep");
        HashMap hashMap = new HashMap();
        f28804e = hashMap;
        hashMap.put(C25239c.class, new C10866b());
        hashMap.put(C25240d.class, new C10868d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CART_INFO, new FieldMetaData("cartInfo", (byte) 3, new StructMetaData(MVPurchaseCartInfo.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28805f = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseCartStep.class, unmodifiableMap);
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
        ((C25238b) f28804e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28804e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseCartStep mVPurchaseCartStep = (MVPurchaseCartStep) obj;
        if (!getClass().equals(mVPurchaseCartStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseCartStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32530h()).compareTo(Boolean.valueOf(mVPurchaseCartStep.mo32530h()));
        if (compareTo2 != 0 || ((mo32530h() && (compareTo2 = this.paymentContext.compareTo(mVPurchaseCartStep.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo32528f()).compareTo(Boolean.valueOf(mVPurchaseCartStep.mo32528f()))) != 0 || ((mo32528f() && (compareTo2 = this.cartInfo.compareTo(mVPurchaseCartStep.cartInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo32529g()).compareTo(Boolean.valueOf(mVPurchaseCartStep.mo32529g()))) != 0))) {
            return compareTo2;
        }
        if (!mo32529g() || (compareTo = this.discountContextId.compareTo(mVPurchaseCartStep.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseCartStep)) {
            return false;
        }
        MVPurchaseCartStep mVPurchaseCartStep = (MVPurchaseCartStep) obj;
        boolean h = mo32530h();
        boolean h2 = mVPurchaseCartStep.mo32530h();
        if ((h || h2) && (!h || !h2 || !this.paymentContext.equals(mVPurchaseCartStep.paymentContext))) {
            return false;
        }
        boolean f = mo32528f();
        boolean f2 = mVPurchaseCartStep.mo32528f();
        if ((f || f2) && (!f || !f2 || !this.cartInfo.mo32481a(mVPurchaseCartStep.cartInfo))) {
            return false;
        }
        boolean g = mo32529g();
        boolean g2 = mVPurchaseCartStep.mo32529g();
        if ((g || g2) && (!g || !g2 || !this.discountContextId.equals(mVPurchaseCartStep.discountContextId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32528f() {
        return this.cartInfo != null;
    }

    /* renamed from: g */
    public final boolean mo32529g() {
        return this.discountContextId != null;
    }

    /* renamed from: h */
    public final boolean mo32530h() {
        return this.paymentContext != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseCartStep(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("cartInfo:");
        MVPurchaseCartInfo mVPurchaseCartInfo = this.cartInfo;
        if (mVPurchaseCartInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseCartInfo);
        }
        if (mo32529g()) {
            n.append(", ");
            n.append("discountContextId:");
            String str2 = this.discountContextId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
