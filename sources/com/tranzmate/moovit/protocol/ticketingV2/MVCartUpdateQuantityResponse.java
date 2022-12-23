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

public class MVCartUpdateQuantityResponse implements TBase<MVCartUpdateQuantityResponse, _Fields>, Serializable, Cloneable, Comparable<MVCartUpdateQuantityResponse> {

    /* renamed from: b */
    public static final C25113c f28695b = new C25113c("cartInfo", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28696c = new C25113c("discountContextId", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28697d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28698e;
    public MVPurchaseCartInfo cartInfo;
    public String discountContextId;
    private _Fields[] optionals = {_Fields.DISCOUNT_CONTEXT_ID};

    public enum _Fields implements C25085c {
        CART_INFO(1, "cartInfo"),
        DISCOUNT_CONTEXT_ID(2, "discountContextId");
        
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
                return CART_INFO;
            }
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityResponse$a */
    public static class C10790a extends C25239c<MVCartUpdateQuantityResponse> {
        public C10790a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCartUpdateQuantityResponse mVCartUpdateQuantityResponse = (MVCartUpdateQuantityResponse) tBase;
            mVCartUpdateQuantityResponse.getClass();
            C25113c cVar = MVCartUpdateQuantityResponse.f28695b;
            gVar.mo61687K();
            if (mVCartUpdateQuantityResponse.cartInfo != null) {
                gVar.mo61711x(MVCartUpdateQuantityResponse.f28695b);
                mVCartUpdateQuantityResponse.cartInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCartUpdateQuantityResponse.discountContextId != null && mVCartUpdateQuantityResponse.mo32362g()) {
                gVar.mo61711x(MVCartUpdateQuantityResponse.f28696c);
                gVar.mo61686J(mVCartUpdateQuantityResponse.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCartUpdateQuantityResponse mVCartUpdateQuantityResponse = (MVCartUpdateQuantityResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCartUpdateQuantityResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVCartUpdateQuantityResponse.discountContextId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPurchaseCartInfo mVPurchaseCartInfo = new MVPurchaseCartInfo();
                    mVCartUpdateQuantityResponse.cartInfo = mVPurchaseCartInfo;
                    mVPurchaseCartInfo.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityResponse$b */
    public static class C10791b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10790a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityResponse$c */
    public static class C10792c extends C25240d<MVCartUpdateQuantityResponse> {
        public C10792c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCartUpdateQuantityResponse mVCartUpdateQuantityResponse = (MVCartUpdateQuantityResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCartUpdateQuantityResponse.mo32361f()) {
                bitSet.set(0);
            }
            if (mVCartUpdateQuantityResponse.mo32362g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCartUpdateQuantityResponse.mo32361f()) {
                mVCartUpdateQuantityResponse.cartInfo.mo25202X0(jVar);
            }
            if (mVCartUpdateQuantityResponse.mo32362g()) {
                jVar.mo61686J(mVCartUpdateQuantityResponse.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCartUpdateQuantityResponse mVCartUpdateQuantityResponse = (MVCartUpdateQuantityResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVPurchaseCartInfo mVPurchaseCartInfo = new MVPurchaseCartInfo();
                mVCartUpdateQuantityResponse.cartInfo = mVPurchaseCartInfo;
                mVPurchaseCartInfo.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVCartUpdateQuantityResponse.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityResponse$d */
    public static class C10793d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10792c(0);
        }
    }

    static {
        new C17394d0("MVCartUpdateQuantityResponse");
        HashMap hashMap = new HashMap();
        f28697d = hashMap;
        hashMap.put(C25239c.class, new C10791b());
        hashMap.put(C25240d.class, new C10793d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CART_INFO, new FieldMetaData("cartInfo", (byte) 3, new StructMetaData(MVPurchaseCartInfo.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28698e = unmodifiableMap;
        FieldMetaData.m61947a(MVCartUpdateQuantityResponse.class, unmodifiableMap);
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
        ((C25238b) f28697d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28697d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCartUpdateQuantityResponse mVCartUpdateQuantityResponse = (MVCartUpdateQuantityResponse) obj;
        if (!getClass().equals(mVCartUpdateQuantityResponse.getClass())) {
            return getClass().getName().compareTo(mVCartUpdateQuantityResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32361f()).compareTo(Boolean.valueOf(mVCartUpdateQuantityResponse.mo32361f()));
        if (compareTo2 != 0 || ((mo32361f() && (compareTo2 = this.cartInfo.compareTo(mVCartUpdateQuantityResponse.cartInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo32362g()).compareTo(Boolean.valueOf(mVCartUpdateQuantityResponse.mo32362g()))) != 0)) {
            return compareTo2;
        }
        if (!mo32362g() || (compareTo = this.discountContextId.compareTo(mVCartUpdateQuantityResponse.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCartUpdateQuantityResponse)) {
            return false;
        }
        MVCartUpdateQuantityResponse mVCartUpdateQuantityResponse = (MVCartUpdateQuantityResponse) obj;
        boolean f = mo32361f();
        boolean f2 = mVCartUpdateQuantityResponse.mo32361f();
        if ((f || f2) && (!f || !f2 || !this.cartInfo.mo32481a(mVCartUpdateQuantityResponse.cartInfo))) {
            return false;
        }
        boolean g = mo32362g();
        boolean g2 = mVCartUpdateQuantityResponse.mo32362g();
        if ((g || g2) && (!g || !g2 || !this.discountContextId.equals(mVCartUpdateQuantityResponse.discountContextId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32361f() {
        return this.cartInfo != null;
    }

    /* renamed from: g */
    public final boolean mo32362g() {
        return this.discountContextId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCartUpdateQuantityResponse(", "cartInfo:");
        MVPurchaseCartInfo mVPurchaseCartInfo = this.cartInfo;
        if (mVPurchaseCartInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseCartInfo);
        }
        if (mo32362g()) {
            n.append(", ");
            n.append("discountContextId:");
            String str = this.discountContextId;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(")");
        return n.toString();
    }
}
