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

public class MVPaymentRemoveDiscountRequest implements TBase<MVPaymentRemoveDiscountRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRemoveDiscountRequest> {

    /* renamed from: b */
    public static final C25113c f27592b = new C25113c("requestProperties", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27593c = new C25113c("discountIds", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f27594d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27595e;
    public List<String> discountIds;
    public MVPaymentRequestProperties requestProperties;

    public enum _Fields implements C25085c {
        REQUEST_PROPERTIES(1, "requestProperties"),
        DISCOUNT_IDS(2, "discountIds");
        
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
            return DISCOUNT_IDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRemoveDiscountRequest$a */
    public static class C9991a extends C25239c<MVPaymentRemoveDiscountRequest> {
        public C9991a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRemoveDiscountRequest mVPaymentRemoveDiscountRequest = (MVPaymentRemoveDiscountRequest) tBase;
            MVPaymentRequestProperties mVPaymentRequestProperties = mVPaymentRemoveDiscountRequest.requestProperties;
            if (mVPaymentRequestProperties != null) {
                mVPaymentRequestProperties.mo30428k();
            }
            C25113c cVar = MVPaymentRemoveDiscountRequest.f27592b;
            gVar.mo61687K();
            if (mVPaymentRemoveDiscountRequest.requestProperties != null) {
                gVar.mo61711x(MVPaymentRemoveDiscountRequest.f27592b);
                mVPaymentRemoveDiscountRequest.requestProperties.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentRemoveDiscountRequest.discountIds != null) {
                gVar.mo61711x(MVPaymentRemoveDiscountRequest.f27593c);
                gVar.mo61680D(new C25119e((byte) 11, mVPaymentRemoveDiscountRequest.discountIds.size()));
                for (String J : mVPaymentRemoveDiscountRequest.discountIds) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRemoveDiscountRequest mVPaymentRemoveDiscountRequest = (MVPaymentRemoveDiscountRequest) tBase;
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
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVPaymentRemoveDiscountRequest.discountIds = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVPaymentRemoveDiscountRequest.discountIds.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPaymentRequestProperties mVPaymentRequestProperties = new MVPaymentRequestProperties();
                    mVPaymentRemoveDiscountRequest.requestProperties = mVPaymentRequestProperties;
                    mVPaymentRequestProperties.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPaymentRequestProperties mVPaymentRequestProperties2 = mVPaymentRemoveDiscountRequest.requestProperties;
            if (mVPaymentRequestProperties2 != null) {
                mVPaymentRequestProperties2.mo30428k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRemoveDiscountRequest$b */
    public static class C9992b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9991a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRemoveDiscountRequest$c */
    public static class C9993c extends C25240d<MVPaymentRemoveDiscountRequest> {
        public C9993c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRemoveDiscountRequest mVPaymentRemoveDiscountRequest = (MVPaymentRemoveDiscountRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRemoveDiscountRequest.mo30409g()) {
                bitSet.set(0);
            }
            if (mVPaymentRemoveDiscountRequest.mo30408f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPaymentRemoveDiscountRequest.mo30409g()) {
                mVPaymentRemoveDiscountRequest.requestProperties.mo25202X0(jVar);
            }
            if (mVPaymentRemoveDiscountRequest.mo30408f()) {
                jVar.mo61678B(mVPaymentRemoveDiscountRequest.discountIds.size());
                for (String J : mVPaymentRemoveDiscountRequest.discountIds) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRemoveDiscountRequest mVPaymentRemoveDiscountRequest = (MVPaymentRemoveDiscountRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVPaymentRequestProperties mVPaymentRequestProperties = new MVPaymentRequestProperties();
                mVPaymentRemoveDiscountRequest.requestProperties = mVPaymentRequestProperties;
                mVPaymentRequestProperties.mo25201C1(jVar);
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPaymentRemoveDiscountRequest.discountIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPaymentRemoveDiscountRequest.discountIds.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRemoveDiscountRequest$d */
    public static class C9994d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9993c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRemoveDiscountRequest");
        HashMap hashMap = new HashMap();
        f27594d = hashMap;
        hashMap.put(C25239c.class, new C9992b());
        hashMap.put(C25240d.class, new C9994d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REQUEST_PROPERTIES, new FieldMetaData("requestProperties", (byte) 3, new StructMetaData(MVPaymentRequestProperties.class)));
        enumMap.put(_Fields.DISCOUNT_IDS, new FieldMetaData("discountIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27595e = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRemoveDiscountRequest.class, unmodifiableMap);
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
        ((C25238b) f27594d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27594d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPaymentRemoveDiscountRequest mVPaymentRemoveDiscountRequest = (MVPaymentRemoveDiscountRequest) obj;
        if (!getClass().equals(mVPaymentRemoveDiscountRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRemoveDiscountRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30409g()).compareTo(Boolean.valueOf(mVPaymentRemoveDiscountRequest.mo30409g()));
        if (compareTo != 0 || ((mo30409g() && (compareTo = this.requestProperties.compareTo(mVPaymentRemoveDiscountRequest.requestProperties)) != 0) || (compareTo = Boolean.valueOf(mo30408f()).compareTo(Boolean.valueOf(mVPaymentRemoveDiscountRequest.mo30408f()))) != 0)) {
            return compareTo;
        }
        if (!mo30408f() || (h = C25082a.m62844h(this.discountIds, mVPaymentRemoveDiscountRequest.discountIds)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRemoveDiscountRequest)) {
            return false;
        }
        MVPaymentRemoveDiscountRequest mVPaymentRemoveDiscountRequest = (MVPaymentRemoveDiscountRequest) obj;
        boolean g = mo30409g();
        boolean g2 = mVPaymentRemoveDiscountRequest.mo30409g();
        if ((g || g2) && (!g || !g2 || !this.requestProperties.mo30419a(mVPaymentRemoveDiscountRequest.requestProperties))) {
            return false;
        }
        boolean f = mo30408f();
        boolean f2 = mVPaymentRemoveDiscountRequest.mo30408f();
        if ((f || f2) && (!f || !f2 || !this.discountIds.equals(mVPaymentRemoveDiscountRequest.discountIds))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30408f() {
        return this.discountIds != null;
    }

    /* renamed from: g */
    public final boolean mo30409g() {
        return this.requestProperties != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRemoveDiscountRequest(", "requestProperties:");
        MVPaymentRequestProperties mVPaymentRequestProperties = this.requestProperties;
        if (mVPaymentRequestProperties == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentRequestProperties);
        }
        n.append(", ");
        n.append("discountIds:");
        List<String> list = this.discountIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
