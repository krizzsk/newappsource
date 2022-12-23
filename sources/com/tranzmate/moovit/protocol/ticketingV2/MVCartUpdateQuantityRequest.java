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
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVCartUpdateQuantityRequest implements TBase<MVCartUpdateQuantityRequest, _Fields>, Serializable, Cloneable, Comparable<MVCartUpdateQuantityRequest> {

    /* renamed from: b */
    public static final C25113c f28690b = new C25113c("cartContextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28691c = new C25113c("cartItemId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28692d = new C25113c("quantity", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f28693e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28694f;
    private byte __isset_bitfield = 0;
    public String cartContextId;
    public String cartItemId;
    public int quantity;

    public enum _Fields implements C25085c {
        CART_CONTEXT_ID(1, "cartContextId"),
        CART_ITEM_ID(2, "cartItemId"),
        QUANTITY(3, "quantity");
        
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
                return CART_CONTEXT_ID;
            }
            if (i == 2) {
                return CART_ITEM_ID;
            }
            if (i != 3) {
                return null;
            }
            return QUANTITY;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityRequest$a */
    public static class C10786a extends C25239c<MVCartUpdateQuantityRequest> {
        public C10786a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCartUpdateQuantityRequest mVCartUpdateQuantityRequest = (MVCartUpdateQuantityRequest) tBase;
            mVCartUpdateQuantityRequest.getClass();
            C25113c cVar = MVCartUpdateQuantityRequest.f28690b;
            gVar.mo61687K();
            if (mVCartUpdateQuantityRequest.cartContextId != null) {
                gVar.mo61711x(MVCartUpdateQuantityRequest.f28690b);
                gVar.mo61686J(mVCartUpdateQuantityRequest.cartContextId);
                gVar.mo61712y();
            }
            if (mVCartUpdateQuantityRequest.cartItemId != null) {
                gVar.mo61711x(MVCartUpdateQuantityRequest.f28691c);
                gVar.mo61686J(mVCartUpdateQuantityRequest.cartItemId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCartUpdateQuantityRequest.f28692d);
            C16530d.m42020n(gVar, mVCartUpdateQuantityRequest.quantity);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCartUpdateQuantityRequest mVCartUpdateQuantityRequest = (MVCartUpdateQuantityRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCartUpdateQuantityRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVCartUpdateQuantityRequest.quantity = gVar.mo61696i();
                            mVCartUpdateQuantityRequest.mo32356i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCartUpdateQuantityRequest.cartItemId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCartUpdateQuantityRequest.cartContextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityRequest$b */
    public static class C10787b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10786a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityRequest$c */
    public static class C10788c extends C25240d<MVCartUpdateQuantityRequest> {
        public C10788c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCartUpdateQuantityRequest mVCartUpdateQuantityRequest = (MVCartUpdateQuantityRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCartUpdateQuantityRequest.mo32352f()) {
                bitSet.set(0);
            }
            if (mVCartUpdateQuantityRequest.mo32353g()) {
                bitSet.set(1);
            }
            if (mVCartUpdateQuantityRequest.mo32354h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCartUpdateQuantityRequest.mo32352f()) {
                jVar.mo61686J(mVCartUpdateQuantityRequest.cartContextId);
            }
            if (mVCartUpdateQuantityRequest.mo32353g()) {
                jVar.mo61686J(mVCartUpdateQuantityRequest.cartItemId);
            }
            if (mVCartUpdateQuantityRequest.mo32354h()) {
                jVar.mo61678B(mVCartUpdateQuantityRequest.quantity);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCartUpdateQuantityRequest mVCartUpdateQuantityRequest = (MVCartUpdateQuantityRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVCartUpdateQuantityRequest.cartContextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCartUpdateQuantityRequest.cartItemId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCartUpdateQuantityRequest.quantity = jVar.mo61696i();
                mVCartUpdateQuantityRequest.mo32356i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVCartUpdateQuantityRequest$d */
    public static class C10789d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10788c(0);
        }
    }

    static {
        new C17394d0("MVCartUpdateQuantityRequest");
        HashMap hashMap = new HashMap();
        f28693e = hashMap;
        hashMap.put(C25239c.class, new C10787b());
        hashMap.put(C25240d.class, new C10789d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CART_CONTEXT_ID, new FieldMetaData("cartContextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CART_ITEM_ID, new FieldMetaData("cartItemId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.QUANTITY, new FieldMetaData("quantity", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28694f = unmodifiableMap;
        FieldMetaData.m61947a(MVCartUpdateQuantityRequest.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f28693e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28693e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVCartUpdateQuantityRequest mVCartUpdateQuantityRequest = (MVCartUpdateQuantityRequest) obj;
        if (!getClass().equals(mVCartUpdateQuantityRequest.getClass())) {
            return getClass().getName().compareTo(mVCartUpdateQuantityRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32352f()).compareTo(Boolean.valueOf(mVCartUpdateQuantityRequest.mo32352f()));
        if (compareTo != 0 || ((mo32352f() && (compareTo = this.cartContextId.compareTo(mVCartUpdateQuantityRequest.cartContextId)) != 0) || (compareTo = Boolean.valueOf(mo32353g()).compareTo(Boolean.valueOf(mVCartUpdateQuantityRequest.mo32353g()))) != 0 || ((mo32353g() && (compareTo = this.cartItemId.compareTo(mVCartUpdateQuantityRequest.cartItemId)) != 0) || (compareTo = Boolean.valueOf(mo32354h()).compareTo(Boolean.valueOf(mVCartUpdateQuantityRequest.mo32354h()))) != 0))) {
            return compareTo;
        }
        if (!mo32354h() || (c = C25082a.m62839c(this.quantity, mVCartUpdateQuantityRequest.quantity)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCartUpdateQuantityRequest)) {
            return false;
        }
        MVCartUpdateQuantityRequest mVCartUpdateQuantityRequest = (MVCartUpdateQuantityRequest) obj;
        boolean f = mo32352f();
        boolean f2 = mVCartUpdateQuantityRequest.mo32352f();
        if ((f || f2) && (!f || !f2 || !this.cartContextId.equals(mVCartUpdateQuantityRequest.cartContextId))) {
            return false;
        }
        boolean g = mo32353g();
        boolean g2 = mVCartUpdateQuantityRequest.mo32353g();
        if (((g || g2) && (!g || !g2 || !this.cartItemId.equals(mVCartUpdateQuantityRequest.cartItemId))) || this.quantity != mVCartUpdateQuantityRequest.quantity) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32352f() {
        return this.cartContextId != null;
    }

    /* renamed from: g */
    public final boolean mo32353g() {
        return this.cartItemId != null;
    }

    /* renamed from: h */
    public final boolean mo32354h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo32356i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCartUpdateQuantityRequest(", "cartContextId:");
        String str = this.cartContextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("cartItemId:");
        String str2 = this.cartItemId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("quantity:");
        return C13437d.m33707l(n, this.quantity, ")");
    }
}
