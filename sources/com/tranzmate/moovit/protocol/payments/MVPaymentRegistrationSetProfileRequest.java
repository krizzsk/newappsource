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

public class MVPaymentRegistrationSetProfileRequest implements TBase<MVPaymentRegistrationSetProfileRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationSetProfileRequest> {

    /* renamed from: b */
    public static final C25113c f27572b = new C25113c("profiles", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f27573c = new C25113c("paymentContext", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27574d = new C25113c("requiredInfosValues", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f27575e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27576f;
    private _Fields[] optionals = {_Fields.PAYMENT_CONTEXT};
    public String paymentContext;
    public List<Integer> profiles;
    public List<MVProfileRequiredInfoValue> requiredInfosValues;

    public enum _Fields implements C25085c {
        PROFILES(1, "profiles"),
        PAYMENT_CONTEXT(2, "paymentContext"),
        REQUIRED_INFOS_VALUES(3, "requiredInfosValues");
        
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
                return PROFILES;
            }
            if (i == 2) {
                return PAYMENT_CONTEXT;
            }
            if (i != 3) {
                return null;
            }
            return REQUIRED_INFOS_VALUES;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetProfileRequest$a */
    public static class C9975a extends C25239c<MVPaymentRegistrationSetProfileRequest> {
        public C9975a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetProfileRequest mVPaymentRegistrationSetProfileRequest = (MVPaymentRegistrationSetProfileRequest) tBase;
            mVPaymentRegistrationSetProfileRequest.getClass();
            C25113c cVar = MVPaymentRegistrationSetProfileRequest.f27572b;
            gVar.mo61687K();
            if (mVPaymentRegistrationSetProfileRequest.profiles != null) {
                gVar.mo61711x(MVPaymentRegistrationSetProfileRequest.f27572b);
                gVar.mo61680D(new C25119e((byte) 8, mVPaymentRegistrationSetProfileRequest.profiles.size()));
                for (Integer intValue : mVPaymentRegistrationSetProfileRequest.profiles) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationSetProfileRequest.paymentContext != null && mVPaymentRegistrationSetProfileRequest.mo30373f()) {
                gVar.mo61711x(MVPaymentRegistrationSetProfileRequest.f27573c);
                gVar.mo61686J(mVPaymentRegistrationSetProfileRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVPaymentRegistrationSetProfileRequest.requiredInfosValues != null) {
                gVar.mo61711x(MVPaymentRegistrationSetProfileRequest.f27574d);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentRegistrationSetProfileRequest.requiredInfosValues.size()));
                for (MVProfileRequiredInfoValue X0 : mVPaymentRegistrationSetProfileRequest.requiredInfosValues) {
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
            MVPaymentRegistrationSetProfileRequest mVPaymentRegistrationSetProfileRequest = (MVPaymentRegistrationSetProfileRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentRegistrationSetProfileRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVPaymentRegistrationSetProfileRequest.requiredInfosValues = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVProfileRequiredInfoValue mVProfileRequiredInfoValue = new MVProfileRequiredInfoValue();
                                mVProfileRequiredInfoValue.mo25201C1(gVar);
                                mVPaymentRegistrationSetProfileRequest.requiredInfosValues.add(mVProfileRequiredInfoValue);
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPaymentRegistrationSetProfileRequest.paymentContext = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVPaymentRegistrationSetProfileRequest.profiles = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        i = C13437d.m33701f(gVar.mo61696i(), mVPaymentRegistrationSetProfileRequest.profiles, i, 1);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetProfileRequest$b */
    public static class C9976b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9975a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetProfileRequest$c */
    public static class C9977c extends C25240d<MVPaymentRegistrationSetProfileRequest> {
        public C9977c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetProfileRequest mVPaymentRegistrationSetProfileRequest = (MVPaymentRegistrationSetProfileRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationSetProfileRequest.mo30374g()) {
                bitSet.set(0);
            }
            if (mVPaymentRegistrationSetProfileRequest.mo30373f()) {
                bitSet.set(1);
            }
            if (mVPaymentRegistrationSetProfileRequest.mo30375h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPaymentRegistrationSetProfileRequest.mo30374g()) {
                jVar.mo61678B(mVPaymentRegistrationSetProfileRequest.profiles.size());
                for (Integer intValue : mVPaymentRegistrationSetProfileRequest.profiles) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVPaymentRegistrationSetProfileRequest.mo30373f()) {
                jVar.mo61686J(mVPaymentRegistrationSetProfileRequest.paymentContext);
            }
            if (mVPaymentRegistrationSetProfileRequest.mo30375h()) {
                jVar.mo61678B(mVPaymentRegistrationSetProfileRequest.requiredInfosValues.size());
                for (MVProfileRequiredInfoValue X0 : mVPaymentRegistrationSetProfileRequest.requiredInfosValues) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationSetProfileRequest mVPaymentRegistrationSetProfileRequest = (MVPaymentRegistrationSetProfileRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPaymentRegistrationSetProfileRequest.profiles = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVPaymentRegistrationSetProfileRequest.profiles, i2, 1)) {
                }
            }
            if (T.get(1)) {
                mVPaymentRegistrationSetProfileRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i3 = jVar.mo61696i();
                mVPaymentRegistrationSetProfileRequest.requiredInfosValues = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVProfileRequiredInfoValue mVProfileRequiredInfoValue = new MVProfileRequiredInfoValue();
                    mVProfileRequiredInfoValue.mo25201C1(jVar);
                    mVPaymentRegistrationSetProfileRequest.requiredInfosValues.add(mVProfileRequiredInfoValue);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetProfileRequest$d */
    public static class C9978d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9977c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationSetProfileRequest");
        HashMap hashMap = new HashMap();
        f27575e = hashMap;
        hashMap.put(C25239c.class, new C9976b());
        hashMap.put(C25240d.class, new C9978d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROFILES, new FieldMetaData("profiles", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REQUIRED_INFOS_VALUES, new FieldMetaData("requiredInfosValues", (byte) 3, new ListMetaData(new StructMetaData(MVProfileRequiredInfoValue.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27576f = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationSetProfileRequest.class, unmodifiableMap);
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
        ((C25238b) f27575e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27575e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPaymentRegistrationSetProfileRequest mVPaymentRegistrationSetProfileRequest = (MVPaymentRegistrationSetProfileRequest) obj;
        if (!getClass().equals(mVPaymentRegistrationSetProfileRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationSetProfileRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30374g()).compareTo(Boolean.valueOf(mVPaymentRegistrationSetProfileRequest.mo30374g()));
        if (compareTo != 0 || ((mo30374g() && (compareTo = C25082a.m62844h(this.profiles, mVPaymentRegistrationSetProfileRequest.profiles)) != 0) || (compareTo = Boolean.valueOf(mo30373f()).compareTo(Boolean.valueOf(mVPaymentRegistrationSetProfileRequest.mo30373f()))) != 0 || ((mo30373f() && (compareTo = this.paymentContext.compareTo(mVPaymentRegistrationSetProfileRequest.paymentContext)) != 0) || (compareTo = Boolean.valueOf(mo30375h()).compareTo(Boolean.valueOf(mVPaymentRegistrationSetProfileRequest.mo30375h()))) != 0))) {
            return compareTo;
        }
        if (!mo30375h() || (h = C25082a.m62844h(this.requiredInfosValues, mVPaymentRegistrationSetProfileRequest.requiredInfosValues)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentRegistrationSetProfileRequest)) {
            return false;
        }
        MVPaymentRegistrationSetProfileRequest mVPaymentRegistrationSetProfileRequest = (MVPaymentRegistrationSetProfileRequest) obj;
        boolean g = mo30374g();
        boolean g2 = mVPaymentRegistrationSetProfileRequest.mo30374g();
        if ((g || g2) && (!g || !g2 || !this.profiles.equals(mVPaymentRegistrationSetProfileRequest.profiles))) {
            return false;
        }
        boolean f = mo30373f();
        boolean f2 = mVPaymentRegistrationSetProfileRequest.mo30373f();
        if ((f || f2) && (!f || !f2 || !this.paymentContext.equals(mVPaymentRegistrationSetProfileRequest.paymentContext))) {
            return false;
        }
        boolean h = mo30375h();
        boolean h2 = mVPaymentRegistrationSetProfileRequest.mo30375h();
        if ((h || h2) && (!h || !h2 || !this.requiredInfosValues.equals(mVPaymentRegistrationSetProfileRequest.requiredInfosValues))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30373f() {
        return this.paymentContext != null;
    }

    /* renamed from: g */
    public final boolean mo30374g() {
        return this.profiles != null;
    }

    /* renamed from: h */
    public final boolean mo30375h() {
        return this.requiredInfosValues != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentRegistrationSetProfileRequest(", "profiles:");
        List<Integer> list = this.profiles;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo30373f()) {
            n.append(", ");
            n.append("paymentContext:");
            String str = this.paymentContext;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("requiredInfosValues:");
        List<MVProfileRequiredInfoValue> list2 = this.requiredInfosValues;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
