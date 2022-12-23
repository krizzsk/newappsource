package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.discounts.MVTypedDiscount;
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

public class MVPaymentAddDiscountRequest implements TBase<MVPaymentAddDiscountRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAddDiscountRequest> {

    /* renamed from: b */
    public static final C25113c f27471b = new C25113c("requestProperties", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27472c = new C25113c("discount", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27473d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27474e;
    public MVTypedDiscount discount;
    public MVPaymentRequestProperties requestProperties;

    public enum _Fields implements C25085c {
        REQUEST_PROPERTIES(1, "requestProperties"),
        DISCOUNT(2, "discount");
        
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
                return REQUEST_PROPERTIES;
            }
            if (i != 2) {
                return null;
            }
            return DISCOUNT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountRequest$a */
    public static class C9893a extends C25239c<MVPaymentAddDiscountRequest> {
        public C9893a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAddDiscountRequest mVPaymentAddDiscountRequest = (MVPaymentAddDiscountRequest) tBase;
            MVPaymentRequestProperties mVPaymentRequestProperties = mVPaymentAddDiscountRequest.requestProperties;
            if (mVPaymentRequestProperties != null) {
                mVPaymentRequestProperties.mo30428k();
            }
            C25113c cVar = MVPaymentAddDiscountRequest.f27471b;
            gVar.mo61687K();
            if (mVPaymentAddDiscountRequest.requestProperties != null) {
                gVar.mo61711x(MVPaymentAddDiscountRequest.f27471b);
                mVPaymentAddDiscountRequest.requestProperties.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAddDiscountRequest.discount != null) {
                gVar.mo61711x(MVPaymentAddDiscountRequest.f27472c);
                mVPaymentAddDiscountRequest.discount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAddDiscountRequest mVPaymentAddDiscountRequest = (MVPaymentAddDiscountRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTypedDiscount mVTypedDiscount = new MVTypedDiscount();
                        mVPaymentAddDiscountRequest.discount = mVTypedDiscount;
                        mVTypedDiscount.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPaymentRequestProperties mVPaymentRequestProperties = new MVPaymentRequestProperties();
                    mVPaymentAddDiscountRequest.requestProperties = mVPaymentRequestProperties;
                    mVPaymentRequestProperties.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPaymentRequestProperties mVPaymentRequestProperties2 = mVPaymentAddDiscountRequest.requestProperties;
            if (mVPaymentRequestProperties2 != null) {
                mVPaymentRequestProperties2.mo30428k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountRequest$b */
    public static class C9894b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9893a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountRequest$c */
    public static class C9895c extends C25240d<MVPaymentAddDiscountRequest> {
        public C9895c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAddDiscountRequest mVPaymentAddDiscountRequest = (MVPaymentAddDiscountRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAddDiscountRequest.mo30212g()) {
                bitSet.set(0);
            }
            if (mVPaymentAddDiscountRequest.mo30211f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPaymentAddDiscountRequest.mo30212g()) {
                mVPaymentAddDiscountRequest.requestProperties.mo25202X0(jVar);
            }
            if (mVPaymentAddDiscountRequest.mo30211f()) {
                mVPaymentAddDiscountRequest.discount.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAddDiscountRequest mVPaymentAddDiscountRequest = (MVPaymentAddDiscountRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVPaymentRequestProperties mVPaymentRequestProperties = new MVPaymentRequestProperties();
                mVPaymentAddDiscountRequest.requestProperties = mVPaymentRequestProperties;
                mVPaymentRequestProperties.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVTypedDiscount mVTypedDiscount = new MVTypedDiscount();
                mVPaymentAddDiscountRequest.discount = mVTypedDiscount;
                mVTypedDiscount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountRequest$d */
    public static class C9896d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9895c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAddDiscountRequest");
        HashMap hashMap = new HashMap();
        f27473d = hashMap;
        hashMap.put(C25239c.class, new C9894b());
        hashMap.put(C25240d.class, new C9896d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REQUEST_PROPERTIES, new FieldMetaData("requestProperties", (byte) 3, new StructMetaData(MVPaymentRequestProperties.class)));
        enumMap.put(_Fields.DISCOUNT, new FieldMetaData("discount", (byte) 3, new StructMetaData(MVTypedDiscount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27474e = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAddDiscountRequest.class, unmodifiableMap);
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
        ((C25238b) f27473d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27473d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentAddDiscountRequest mVPaymentAddDiscountRequest = (MVPaymentAddDiscountRequest) obj;
        if (!getClass().equals(mVPaymentAddDiscountRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentAddDiscountRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30212g()).compareTo(Boolean.valueOf(mVPaymentAddDiscountRequest.mo30212g()));
        if (compareTo2 != 0 || ((mo30212g() && (compareTo2 = this.requestProperties.compareTo(mVPaymentAddDiscountRequest.requestProperties)) != 0) || (compareTo2 = Boolean.valueOf(mo30211f()).compareTo(Boolean.valueOf(mVPaymentAddDiscountRequest.mo30211f()))) != 0)) {
            return compareTo2;
        }
        if (!mo30211f() || (compareTo = this.discount.compareTo(mVPaymentAddDiscountRequest.discount)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountRequest
            r2 = 1
            if (r1 == 0) goto L_0x0058
            com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountRequest r6 = (com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountRequest) r6
            boolean r1 = r5.mo30212g()
            boolean r3 = r6.mo30212g()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0027
        L_0x0017:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x001c
            goto L_0x0058
        L_0x001c:
            com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties r1 = r5.requestProperties
            com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties r3 = r6.requestProperties
            boolean r1 = r1.mo30419a(r3)
            if (r1 != 0) goto L_0x0027
            goto L_0x0058
        L_0x0027:
            boolean r1 = r5.mo30211f()
            boolean r3 = r6.mo30211f()
            if (r1 != 0) goto L_0x0033
            if (r3 == 0) goto L_0x0057
        L_0x0033:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x0038
            goto L_0x0058
        L_0x0038:
            com.tranzmate.moovit.protocol.discounts.MVTypedDiscount r1 = r5.discount
            com.tranzmate.moovit.protocol.discounts.MVTypedDiscount r6 = r6.discount
            if (r6 == 0) goto L_0x0050
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x0053
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0053
            r6 = 1
            goto L_0x0054
        L_0x0050:
            r1.getClass()
        L_0x0053:
            r6 = 0
        L_0x0054:
            if (r6 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo30211f() {
        return this.discount != null;
    }

    /* renamed from: g */
    public final boolean mo30212g() {
        return this.requestProperties != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAddDiscountRequest(", "requestProperties:");
        MVPaymentRequestProperties mVPaymentRequestProperties = this.requestProperties;
        if (mVPaymentRequestProperties == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentRequestProperties);
        }
        n.append(", ");
        n.append("discount:");
        MVTypedDiscount mVTypedDiscount = this.discount;
        if (mVTypedDiscount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTypedDiscount);
        }
        n.append(")");
        return n.toString();
    }
}
