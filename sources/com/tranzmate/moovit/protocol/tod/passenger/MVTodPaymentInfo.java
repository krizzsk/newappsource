package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodPaymentInfo implements TBase<MVTodPaymentInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodPaymentInfo> {

    /* renamed from: b */
    public static final C25113c f29523b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29524c = new C25113c("paymentDescription", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29525d = new C25113c("discountContextId", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f29526e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29527f;
    public String discountContextId;
    private _Fields[] optionals = {_Fields.DISCOUNT_CONTEXT_ID};
    public String paymentContext;
    public String paymentDescription;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        PAYMENT_DESCRIPTION(2, "paymentDescription"),
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
                return PAYMENT_DESCRIPTION;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPaymentInfo$a */
    public static class C11299a extends C25239c<MVTodPaymentInfo> {
        public C11299a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPaymentInfo mVTodPaymentInfo = (MVTodPaymentInfo) tBase;
            mVTodPaymentInfo.getClass();
            C25113c cVar = MVTodPaymentInfo.f29523b;
            gVar.mo61687K();
            if (mVTodPaymentInfo.paymentContext != null) {
                gVar.mo61711x(MVTodPaymentInfo.f29523b);
                gVar.mo61686J(mVTodPaymentInfo.paymentContext);
                gVar.mo61712y();
            }
            if (mVTodPaymentInfo.paymentDescription != null) {
                gVar.mo61711x(MVTodPaymentInfo.f29524c);
                gVar.mo61686J(mVTodPaymentInfo.paymentDescription);
                gVar.mo61712y();
            }
            if (mVTodPaymentInfo.discountContextId != null && mVTodPaymentInfo.mo33636f()) {
                gVar.mo61711x(MVTodPaymentInfo.f29525d);
                gVar.mo61686J(mVTodPaymentInfo.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPaymentInfo mVTodPaymentInfo = (MVTodPaymentInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodPaymentInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVTodPaymentInfo.discountContextId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTodPaymentInfo.paymentDescription = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodPaymentInfo.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPaymentInfo$b */
    public static class C11300b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11299a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPaymentInfo$c */
    public static class C11301c extends C25240d<MVTodPaymentInfo> {
        public C11301c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPaymentInfo mVTodPaymentInfo = (MVTodPaymentInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodPaymentInfo.mo33637g()) {
                bitSet.set(0);
            }
            if (mVTodPaymentInfo.mo33638h()) {
                bitSet.set(1);
            }
            if (mVTodPaymentInfo.mo33636f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodPaymentInfo.mo33637g()) {
                jVar.mo61686J(mVTodPaymentInfo.paymentContext);
            }
            if (mVTodPaymentInfo.mo33638h()) {
                jVar.mo61686J(mVTodPaymentInfo.paymentDescription);
            }
            if (mVTodPaymentInfo.mo33636f()) {
                jVar.mo61686J(mVTodPaymentInfo.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPaymentInfo mVTodPaymentInfo = (MVTodPaymentInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodPaymentInfo.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodPaymentInfo.paymentDescription = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTodPaymentInfo.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPaymentInfo$d */
    public static class C11302d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11301c(0);
        }
    }

    static {
        new C17394d0("MVTodPaymentInfo");
        HashMap hashMap = new HashMap();
        f29526e = hashMap;
        hashMap.put(C25239c.class, new C11300b());
        hashMap.put(C25240d.class, new C11302d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_DESCRIPTION, new FieldMetaData("paymentDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29527f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodPaymentInfo.class, unmodifiableMap);
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
        ((C25238b) f29526e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29526e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33633a(MVTodPaymentInfo mVTodPaymentInfo) {
        if (mVTodPaymentInfo == null) {
            return false;
        }
        boolean g = mo33637g();
        boolean g2 = mVTodPaymentInfo.mo33637g();
        if ((g || g2) && (!g || !g2 || !this.paymentContext.equals(mVTodPaymentInfo.paymentContext))) {
            return false;
        }
        boolean h = mo33638h();
        boolean h2 = mVTodPaymentInfo.mo33638h();
        if ((h || h2) && (!h || !h2 || !this.paymentDescription.equals(mVTodPaymentInfo.paymentDescription))) {
            return false;
        }
        boolean f = mo33636f();
        boolean f2 = mVTodPaymentInfo.mo33636f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.discountContextId.equals(mVTodPaymentInfo.discountContextId)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodPaymentInfo mVTodPaymentInfo = (MVTodPaymentInfo) obj;
        if (!getClass().equals(mVTodPaymentInfo.getClass())) {
            return getClass().getName().compareTo(mVTodPaymentInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33637g()).compareTo(Boolean.valueOf(mVTodPaymentInfo.mo33637g()));
        if (compareTo2 != 0 || ((mo33637g() && (compareTo2 = this.paymentContext.compareTo(mVTodPaymentInfo.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo33638h()).compareTo(Boolean.valueOf(mVTodPaymentInfo.mo33638h()))) != 0 || ((mo33638h() && (compareTo2 = this.paymentDescription.compareTo(mVTodPaymentInfo.paymentDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo33636f()).compareTo(Boolean.valueOf(mVTodPaymentInfo.mo33636f()))) != 0))) {
            return compareTo2;
        }
        if (!mo33636f() || (compareTo = this.discountContextId.compareTo(mVTodPaymentInfo.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodPaymentInfo)) {
            return mo33633a((MVTodPaymentInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33636f() {
        return this.discountContextId != null;
    }

    /* renamed from: g */
    public final boolean mo33637g() {
        return this.paymentContext != null;
    }

    /* renamed from: h */
    public final boolean mo33638h() {
        return this.paymentDescription != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodPaymentInfo(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("paymentDescription:");
        String str2 = this.paymentDescription;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo33636f()) {
            n.append(", ");
            n.append("discountContextId:");
            String str3 = this.discountContextId;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
