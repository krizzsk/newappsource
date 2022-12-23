package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVUserAddress;
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

public class MVSetUserInfoRequest implements TBase<MVSetUserInfoRequest, _Fields>, Serializable, Cloneable, Comparable<MVSetUserInfoRequest> {

    /* renamed from: b */
    public static final C25113c f28130b = new C25113c("email", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28131c = new C25113c("firstName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28132d = new C25113c("lastName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28133e = new C25113c("paymentContext", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28134f = new C25113c("address", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f28135g = new C25113c("secondaryFirstName", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f28136h = new C25113c("secondaryLastName", (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f28137i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f28138j;
    public MVUserAddress address;
    public String email;
    public String firstName;
    public String lastName;
    private _Fields[] optionals = {_Fields.EMAIL, _Fields.FIRST_NAME, _Fields.LAST_NAME, _Fields.PAYMENT_CONTEXT, _Fields.ADDRESS, _Fields.SECONDARY_FIRST_NAME, _Fields.SECONDARY_LAST_NAME};
    public String paymentContext;
    public String secondaryFirstName;
    public String secondaryLastName;

    public enum _Fields implements C25085c {
        EMAIL(1, "email"),
        FIRST_NAME(2, "firstName"),
        LAST_NAME(3, "lastName"),
        PAYMENT_CONTEXT(4, "paymentContext"),
        ADDRESS(5, "address"),
        SECONDARY_FIRST_NAME(6, "secondaryFirstName"),
        SECONDARY_LAST_NAME(7, "secondaryLastName");
        
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
            switch (i) {
                case 1:
                    return EMAIL;
                case 2:
                    return FIRST_NAME;
                case 3:
                    return LAST_NAME;
                case 4:
                    return PAYMENT_CONTEXT;
                case 5:
                    return ADDRESS;
                case 6:
                    return SECONDARY_FIRST_NAME;
                case 7:
                    return SECONDARY_LAST_NAME;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVSetUserInfoRequest$a */
    public static class C10391a extends C25239c<MVSetUserInfoRequest> {
        public C10391a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetUserInfoRequest mVSetUserInfoRequest = (MVSetUserInfoRequest) tBase;
            MVUserAddress mVUserAddress = mVSetUserInfoRequest.address;
            C25113c cVar = MVSetUserInfoRequest.f28130b;
            gVar.mo61687K();
            if (mVSetUserInfoRequest.email != null && mVSetUserInfoRequest.mo31395g()) {
                gVar.mo61711x(MVSetUserInfoRequest.f28130b);
                gVar.mo61686J(mVSetUserInfoRequest.email);
                gVar.mo61712y();
            }
            if (mVSetUserInfoRequest.firstName != null && mVSetUserInfoRequest.mo31396h()) {
                gVar.mo61711x(MVSetUserInfoRequest.f28131c);
                gVar.mo61686J(mVSetUserInfoRequest.firstName);
                gVar.mo61712y();
            }
            if (mVSetUserInfoRequest.lastName != null && mVSetUserInfoRequest.mo31398i()) {
                gVar.mo61711x(MVSetUserInfoRequest.f28132d);
                gVar.mo61686J(mVSetUserInfoRequest.lastName);
                gVar.mo61712y();
            }
            if (mVSetUserInfoRequest.paymentContext != null && mVSetUserInfoRequest.mo31399j()) {
                gVar.mo61711x(MVSetUserInfoRequest.f28133e);
                gVar.mo61686J(mVSetUserInfoRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVSetUserInfoRequest.address != null && mVSetUserInfoRequest.mo31394f()) {
                gVar.mo61711x(MVSetUserInfoRequest.f28134f);
                mVSetUserInfoRequest.address.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSetUserInfoRequest.secondaryFirstName != null && mVSetUserInfoRequest.mo31400k()) {
                gVar.mo61711x(MVSetUserInfoRequest.f28135g);
                gVar.mo61686J(mVSetUserInfoRequest.secondaryFirstName);
                gVar.mo61712y();
            }
            if (mVSetUserInfoRequest.secondaryLastName != null && mVSetUserInfoRequest.mo31401l()) {
                gVar.mo61711x(MVSetUserInfoRequest.f28136h);
                gVar.mo61686J(mVSetUserInfoRequest.secondaryLastName);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetUserInfoRequest mVSetUserInfoRequest = (MVSetUserInfoRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVUserAddress mVUserAddress = mVSetUserInfoRequest.address;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetUserInfoRequest.email = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetUserInfoRequest.firstName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetUserInfoRequest.lastName = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetUserInfoRequest.paymentContext = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVUserAddress mVUserAddress2 = new MVUserAddress();
                            mVSetUserInfoRequest.address = mVUserAddress2;
                            mVUserAddress2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetUserInfoRequest.secondaryFirstName = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSetUserInfoRequest.secondaryLastName = gVar.mo61704q();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVSetUserInfoRequest$b */
    public static class C10392b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10391a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVSetUserInfoRequest$c */
    public static class C10393c extends C25240d<MVSetUserInfoRequest> {
        public C10393c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetUserInfoRequest mVSetUserInfoRequest = (MVSetUserInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetUserInfoRequest.mo31395g()) {
                bitSet.set(0);
            }
            if (mVSetUserInfoRequest.mo31396h()) {
                bitSet.set(1);
            }
            if (mVSetUserInfoRequest.mo31398i()) {
                bitSet.set(2);
            }
            if (mVSetUserInfoRequest.mo31399j()) {
                bitSet.set(3);
            }
            if (mVSetUserInfoRequest.mo31394f()) {
                bitSet.set(4);
            }
            if (mVSetUserInfoRequest.mo31400k()) {
                bitSet.set(5);
            }
            if (mVSetUserInfoRequest.mo31401l()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVSetUserInfoRequest.mo31395g()) {
                jVar.mo61686J(mVSetUserInfoRequest.email);
            }
            if (mVSetUserInfoRequest.mo31396h()) {
                jVar.mo61686J(mVSetUserInfoRequest.firstName);
            }
            if (mVSetUserInfoRequest.mo31398i()) {
                jVar.mo61686J(mVSetUserInfoRequest.lastName);
            }
            if (mVSetUserInfoRequest.mo31399j()) {
                jVar.mo61686J(mVSetUserInfoRequest.paymentContext);
            }
            if (mVSetUserInfoRequest.mo31394f()) {
                mVSetUserInfoRequest.address.mo25202X0(jVar);
            }
            if (mVSetUserInfoRequest.mo31400k()) {
                jVar.mo61686J(mVSetUserInfoRequest.secondaryFirstName);
            }
            if (mVSetUserInfoRequest.mo31401l()) {
                jVar.mo61686J(mVSetUserInfoRequest.secondaryLastName);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetUserInfoRequest mVSetUserInfoRequest = (MVSetUserInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVSetUserInfoRequest.email = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVSetUserInfoRequest.firstName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVSetUserInfoRequest.lastName = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVSetUserInfoRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVUserAddress mVUserAddress = new MVUserAddress();
                mVSetUserInfoRequest.address = mVUserAddress;
                mVUserAddress.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVSetUserInfoRequest.secondaryFirstName = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVSetUserInfoRequest.secondaryLastName = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVSetUserInfoRequest$d */
    public static class C10394d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10393c(0);
        }
    }

    static {
        new C17394d0("MVSetUserInfoRequest");
        HashMap hashMap = new HashMap();
        f28137i = hashMap;
        hashMap.put(C25239c.class, new C10392b());
        hashMap.put(C25240d.class, new C10394d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EMAIL, new FieldMetaData("email", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FIRST_NAME, new FieldMetaData("firstName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LAST_NAME, new FieldMetaData("lastName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ADDRESS, new FieldMetaData("address", (byte) 2, new StructMetaData(MVUserAddress.class)));
        enumMap.put(_Fields.SECONDARY_FIRST_NAME, new FieldMetaData("secondaryFirstName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SECONDARY_LAST_NAME, new FieldMetaData("secondaryLastName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28138j = unmodifiableMap;
        FieldMetaData.m61947a(MVSetUserInfoRequest.class, unmodifiableMap);
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
        ((C25238b) f28137i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28137i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSetUserInfoRequest mVSetUserInfoRequest = (MVSetUserInfoRequest) obj;
        if (!getClass().equals(mVSetUserInfoRequest.getClass())) {
            return getClass().getName().compareTo(mVSetUserInfoRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31395g()).compareTo(Boolean.valueOf(mVSetUserInfoRequest.mo31395g()));
        if (compareTo2 != 0 || ((mo31395g() && (compareTo2 = this.email.compareTo(mVSetUserInfoRequest.email)) != 0) || (compareTo2 = Boolean.valueOf(mo31396h()).compareTo(Boolean.valueOf(mVSetUserInfoRequest.mo31396h()))) != 0 || ((mo31396h() && (compareTo2 = this.firstName.compareTo(mVSetUserInfoRequest.firstName)) != 0) || (compareTo2 = Boolean.valueOf(mo31398i()).compareTo(Boolean.valueOf(mVSetUserInfoRequest.mo31398i()))) != 0 || ((mo31398i() && (compareTo2 = this.lastName.compareTo(mVSetUserInfoRequest.lastName)) != 0) || (compareTo2 = Boolean.valueOf(mo31399j()).compareTo(Boolean.valueOf(mVSetUserInfoRequest.mo31399j()))) != 0 || ((mo31399j() && (compareTo2 = this.paymentContext.compareTo(mVSetUserInfoRequest.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo31394f()).compareTo(Boolean.valueOf(mVSetUserInfoRequest.mo31394f()))) != 0 || ((mo31394f() && (compareTo2 = this.address.compareTo(mVSetUserInfoRequest.address)) != 0) || (compareTo2 = Boolean.valueOf(mo31400k()).compareTo(Boolean.valueOf(mVSetUserInfoRequest.mo31400k()))) != 0 || ((mo31400k() && (compareTo2 = this.secondaryFirstName.compareTo(mVSetUserInfoRequest.secondaryFirstName)) != 0) || (compareTo2 = Boolean.valueOf(mo31401l()).compareTo(Boolean.valueOf(mVSetUserInfoRequest.mo31401l()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo31401l() || (compareTo = this.secondaryLastName.compareTo(mVSetUserInfoRequest.secondaryLastName)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetUserInfoRequest)) {
            return false;
        }
        MVSetUserInfoRequest mVSetUserInfoRequest = (MVSetUserInfoRequest) obj;
        boolean g = mo31395g();
        boolean g2 = mVSetUserInfoRequest.mo31395g();
        if ((g || g2) && (!g || !g2 || !this.email.equals(mVSetUserInfoRequest.email))) {
            return false;
        }
        boolean h = mo31396h();
        boolean h2 = mVSetUserInfoRequest.mo31396h();
        if ((h || h2) && (!h || !h2 || !this.firstName.equals(mVSetUserInfoRequest.firstName))) {
            return false;
        }
        boolean i = mo31398i();
        boolean i2 = mVSetUserInfoRequest.mo31398i();
        if ((i || i2) && (!i || !i2 || !this.lastName.equals(mVSetUserInfoRequest.lastName))) {
            return false;
        }
        boolean j = mo31399j();
        boolean j2 = mVSetUserInfoRequest.mo31399j();
        if ((j || j2) && (!j || !j2 || !this.paymentContext.equals(mVSetUserInfoRequest.paymentContext))) {
            return false;
        }
        boolean f = mo31394f();
        boolean f2 = mVSetUserInfoRequest.mo31394f();
        if ((f || f2) && (!f || !f2 || !this.address.mo26420a(mVSetUserInfoRequest.address))) {
            return false;
        }
        boolean k = mo31400k();
        boolean k2 = mVSetUserInfoRequest.mo31400k();
        if ((k || k2) && (!k || !k2 || !this.secondaryFirstName.equals(mVSetUserInfoRequest.secondaryFirstName))) {
            return false;
        }
        boolean l = mo31401l();
        boolean l2 = mVSetUserInfoRequest.mo31401l();
        if ((l || l2) && (!l || !l2 || !this.secondaryLastName.equals(mVSetUserInfoRequest.secondaryLastName))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31394f() {
        return this.address != null;
    }

    /* renamed from: g */
    public final boolean mo31395g() {
        return this.email != null;
    }

    /* renamed from: h */
    public final boolean mo31396h() {
        return this.firstName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31398i() {
        return this.lastName != null;
    }

    /* renamed from: j */
    public final boolean mo31399j() {
        return this.paymentContext != null;
    }

    /* renamed from: k */
    public final boolean mo31400k() {
        return this.secondaryFirstName != null;
    }

    /* renamed from: l */
    public final boolean mo31401l() {
        return this.secondaryLastName != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVSetUserInfoRequest(");
        boolean z2 = false;
        if (mo31395g()) {
            sb.append("email:");
            String str = this.email;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo31396h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("firstName:");
            String str2 = this.firstName;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo31398i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("lastName:");
            String str3 = this.lastName;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (mo31399j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("paymentContext:");
            String str4 = this.paymentContext;
            if (str4 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (mo31394f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("address:");
            MVUserAddress mVUserAddress = this.address;
            if (mVUserAddress == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVUserAddress);
            }
            z = false;
        }
        if (mo31400k()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("secondaryFirstName:");
            String str5 = this.secondaryFirstName;
            if (str5 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str5);
            }
        } else {
            z2 = z;
        }
        if (mo31401l()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("secondaryLastName:");
            String str6 = this.secondaryLastName;
            if (str6 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str6);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
