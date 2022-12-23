package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVUserAddress;
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
import p389bl.C13637c;
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

public class MVPaymentAccountPersonalInfo implements TBase<MVPaymentAccountPersonalInfo, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountPersonalInfo> {

    /* renamed from: b */
    public static final C25113c f27423b = new C25113c("firstName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27424c = new C25113c("lastName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27425d = new C25113c("email", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27426e = new C25113c("birthDate", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f27427f = new C25113c("ids", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f27428g = new C25113c("phoneNumber", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f27429h = new C25113c("address", (byte) 12, 7);

    /* renamed from: i */
    public static final HashMap f27430i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f27431j;
    private byte __isset_bitfield = 0;
    public MVUserAddress address;
    public long birthDate;
    public String email;
    public String firstName;
    public List<MVPaymentAccountId> ids;
    public String lastName;
    private _Fields[] optionals = {_Fields.FIRST_NAME, _Fields.LAST_NAME, _Fields.EMAIL, _Fields.BIRTH_DATE, _Fields.IDS, _Fields.PHONE_NUMBER, _Fields.ADDRESS};
    public String phoneNumber;

    public enum _Fields implements C25085c {
        FIRST_NAME(1, "firstName"),
        LAST_NAME(2, "lastName"),
        EMAIL(3, "email"),
        BIRTH_DATE(4, "birthDate"),
        IDS(5, "ids"),
        PHONE_NUMBER(6, "phoneNumber"),
        ADDRESS(7, "address");
        
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
                    return FIRST_NAME;
                case 2:
                    return LAST_NAME;
                case 3:
                    return EMAIL;
                case 4:
                    return BIRTH_DATE;
                case 5:
                    return IDS;
                case 6:
                    return PHONE_NUMBER;
                case 7:
                    return ADDRESS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountPersonalInfo$a */
    public static class C9861a extends C25239c<MVPaymentAccountPersonalInfo> {
        public C9861a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo = (MVPaymentAccountPersonalInfo) tBase;
            MVUserAddress mVUserAddress = mVPaymentAccountPersonalInfo.address;
            C25113c cVar = MVPaymentAccountPersonalInfo.f27423b;
            gVar.mo61687K();
            if (mVPaymentAccountPersonalInfo.firstName != null && mVPaymentAccountPersonalInfo.mo30135i()) {
                gVar.mo61711x(MVPaymentAccountPersonalInfo.f27423b);
                gVar.mo61686J(mVPaymentAccountPersonalInfo.firstName);
                gVar.mo61712y();
            }
            if (mVPaymentAccountPersonalInfo.lastName != null && mVPaymentAccountPersonalInfo.mo30137k()) {
                gVar.mo61711x(MVPaymentAccountPersonalInfo.f27424c);
                gVar.mo61686J(mVPaymentAccountPersonalInfo.lastName);
                gVar.mo61712y();
            }
            if (mVPaymentAccountPersonalInfo.email != null && mVPaymentAccountPersonalInfo.mo30133h()) {
                gVar.mo61711x(MVPaymentAccountPersonalInfo.f27425d);
                gVar.mo61686J(mVPaymentAccountPersonalInfo.email);
                gVar.mo61712y();
            }
            if (mVPaymentAccountPersonalInfo.mo30132g()) {
                gVar.mo61711x(MVPaymentAccountPersonalInfo.f27426e);
                gVar.mo61679C(mVPaymentAccountPersonalInfo.birthDate);
                gVar.mo61712y();
            }
            if (mVPaymentAccountPersonalInfo.ids != null && mVPaymentAccountPersonalInfo.mo30136j()) {
                gVar.mo61711x(MVPaymentAccountPersonalInfo.f27427f);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentAccountPersonalInfo.ids.size()));
                for (MVPaymentAccountId X0 : mVPaymentAccountPersonalInfo.ids) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPaymentAccountPersonalInfo.phoneNumber != null && mVPaymentAccountPersonalInfo.mo30138l()) {
                gVar.mo61711x(MVPaymentAccountPersonalInfo.f27428g);
                gVar.mo61686J(mVPaymentAccountPersonalInfo.phoneNumber);
                gVar.mo61712y();
            }
            if (mVPaymentAccountPersonalInfo.address != null && mVPaymentAccountPersonalInfo.mo30131f()) {
                gVar.mo61711x(MVPaymentAccountPersonalInfo.f27429h);
                mVPaymentAccountPersonalInfo.address.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo = (MVPaymentAccountPersonalInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVUserAddress mVUserAddress = mVPaymentAccountPersonalInfo.address;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountPersonalInfo.firstName = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountPersonalInfo.lastName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountPersonalInfo.email = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountPersonalInfo.birthDate = gVar.mo61697j();
                            mVPaymentAccountPersonalInfo.mo30139m();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPaymentAccountPersonalInfo.ids = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVPaymentAccountId mVPaymentAccountId = new MVPaymentAccountId();
                                mVPaymentAccountId.mo25201C1(gVar);
                                mVPaymentAccountPersonalInfo.ids.add(mVPaymentAccountId);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountPersonalInfo.phoneNumber = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVUserAddress mVUserAddress2 = new MVUserAddress();
                            mVPaymentAccountPersonalInfo.address = mVUserAddress2;
                            mVUserAddress2.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountPersonalInfo$b */
    public static class C9862b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9861a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountPersonalInfo$c */
    public static class C9863c extends C25240d<MVPaymentAccountPersonalInfo> {
        public C9863c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo = (MVPaymentAccountPersonalInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountPersonalInfo.mo30135i()) {
                bitSet.set(0);
            }
            if (mVPaymentAccountPersonalInfo.mo30137k()) {
                bitSet.set(1);
            }
            if (mVPaymentAccountPersonalInfo.mo30133h()) {
                bitSet.set(2);
            }
            if (mVPaymentAccountPersonalInfo.mo30132g()) {
                bitSet.set(3);
            }
            if (mVPaymentAccountPersonalInfo.mo30136j()) {
                bitSet.set(4);
            }
            if (mVPaymentAccountPersonalInfo.mo30138l()) {
                bitSet.set(5);
            }
            if (mVPaymentAccountPersonalInfo.mo30131f()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVPaymentAccountPersonalInfo.mo30135i()) {
                jVar.mo61686J(mVPaymentAccountPersonalInfo.firstName);
            }
            if (mVPaymentAccountPersonalInfo.mo30137k()) {
                jVar.mo61686J(mVPaymentAccountPersonalInfo.lastName);
            }
            if (mVPaymentAccountPersonalInfo.mo30133h()) {
                jVar.mo61686J(mVPaymentAccountPersonalInfo.email);
            }
            if (mVPaymentAccountPersonalInfo.mo30132g()) {
                jVar.mo61679C(mVPaymentAccountPersonalInfo.birthDate);
            }
            if (mVPaymentAccountPersonalInfo.mo30136j()) {
                jVar.mo61678B(mVPaymentAccountPersonalInfo.ids.size());
                for (MVPaymentAccountId X0 : mVPaymentAccountPersonalInfo.ids) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPaymentAccountPersonalInfo.mo30138l()) {
                jVar.mo61686J(mVPaymentAccountPersonalInfo.phoneNumber);
            }
            if (mVPaymentAccountPersonalInfo.mo30131f()) {
                mVPaymentAccountPersonalInfo.address.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo = (MVPaymentAccountPersonalInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVPaymentAccountPersonalInfo.firstName = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentAccountPersonalInfo.lastName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPaymentAccountPersonalInfo.email = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPaymentAccountPersonalInfo.birthDate = jVar.mo61697j();
                mVPaymentAccountPersonalInfo.mo30139m();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVPaymentAccountPersonalInfo.ids = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPaymentAccountId mVPaymentAccountId = new MVPaymentAccountId();
                    mVPaymentAccountId.mo25201C1(jVar);
                    mVPaymentAccountPersonalInfo.ids.add(mVPaymentAccountId);
                }
            }
            if (T.get(5)) {
                mVPaymentAccountPersonalInfo.phoneNumber = jVar.mo61704q();
            }
            if (T.get(6)) {
                MVUserAddress mVUserAddress = new MVUserAddress();
                mVPaymentAccountPersonalInfo.address = mVUserAddress;
                mVUserAddress.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountPersonalInfo$d */
    public static class C9864d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9863c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountPersonalInfo");
        HashMap hashMap = new HashMap();
        f27430i = hashMap;
        hashMap.put(C25239c.class, new C9862b());
        hashMap.put(C25240d.class, new C9864d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FIRST_NAME, new FieldMetaData("firstName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LAST_NAME, new FieldMetaData("lastName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EMAIL, new FieldMetaData("email", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BIRTH_DATE, new FieldMetaData("birthDate", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.IDS, new FieldMetaData("ids", (byte) 2, new ListMetaData(new StructMetaData(MVPaymentAccountId.class))));
        enumMap.put(_Fields.PHONE_NUMBER, new FieldMetaData("phoneNumber", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ADDRESS, new FieldMetaData("address", (byte) 2, new StructMetaData(MVUserAddress.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27431j = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountPersonalInfo.class, unmodifiableMap);
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
        ((C25238b) f27430i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27430i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30128a(MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo) {
        if (mVPaymentAccountPersonalInfo == null) {
            return false;
        }
        boolean i = mo30135i();
        boolean i2 = mVPaymentAccountPersonalInfo.mo30135i();
        if ((i || i2) && (!i || !i2 || !this.firstName.equals(mVPaymentAccountPersonalInfo.firstName))) {
            return false;
        }
        boolean k = mo30137k();
        boolean k2 = mVPaymentAccountPersonalInfo.mo30137k();
        if ((k || k2) && (!k || !k2 || !this.lastName.equals(mVPaymentAccountPersonalInfo.lastName))) {
            return false;
        }
        boolean h = mo30133h();
        boolean h2 = mVPaymentAccountPersonalInfo.mo30133h();
        if ((h || h2) && (!h || !h2 || !this.email.equals(mVPaymentAccountPersonalInfo.email))) {
            return false;
        }
        boolean g = mo30132g();
        boolean g2 = mVPaymentAccountPersonalInfo.mo30132g();
        if ((g || g2) && (!g || !g2 || this.birthDate != mVPaymentAccountPersonalInfo.birthDate)) {
            return false;
        }
        boolean j = mo30136j();
        boolean j2 = mVPaymentAccountPersonalInfo.mo30136j();
        if ((j || j2) && (!j || !j2 || !this.ids.equals(mVPaymentAccountPersonalInfo.ids))) {
            return false;
        }
        boolean l = mo30138l();
        boolean l2 = mVPaymentAccountPersonalInfo.mo30138l();
        if ((l || l2) && (!l || !l2 || !this.phoneNumber.equals(mVPaymentAccountPersonalInfo.phoneNumber))) {
            return false;
        }
        boolean f = mo30131f();
        boolean f2 = mVPaymentAccountPersonalInfo.mo30131f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.address.mo26420a(mVPaymentAccountPersonalInfo.address)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo = (MVPaymentAccountPersonalInfo) obj;
        if (!getClass().equals(mVPaymentAccountPersonalInfo.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountPersonalInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30135i()).compareTo(Boolean.valueOf(mVPaymentAccountPersonalInfo.mo30135i()));
        if (compareTo2 != 0 || ((mo30135i() && (compareTo2 = this.firstName.compareTo(mVPaymentAccountPersonalInfo.firstName)) != 0) || (compareTo2 = Boolean.valueOf(mo30137k()).compareTo(Boolean.valueOf(mVPaymentAccountPersonalInfo.mo30137k()))) != 0 || ((mo30137k() && (compareTo2 = this.lastName.compareTo(mVPaymentAccountPersonalInfo.lastName)) != 0) || (compareTo2 = Boolean.valueOf(mo30133h()).compareTo(Boolean.valueOf(mVPaymentAccountPersonalInfo.mo30133h()))) != 0 || ((mo30133h() && (compareTo2 = this.email.compareTo(mVPaymentAccountPersonalInfo.email)) != 0) || (compareTo2 = Boolean.valueOf(mo30132g()).compareTo(Boolean.valueOf(mVPaymentAccountPersonalInfo.mo30132g()))) != 0 || ((mo30132g() && (compareTo2 = C25082a.m62840d(this.birthDate, mVPaymentAccountPersonalInfo.birthDate)) != 0) || (compareTo2 = Boolean.valueOf(mo30136j()).compareTo(Boolean.valueOf(mVPaymentAccountPersonalInfo.mo30136j()))) != 0 || ((mo30136j() && (compareTo2 = C25082a.m62844h(this.ids, mVPaymentAccountPersonalInfo.ids)) != 0) || (compareTo2 = Boolean.valueOf(mo30138l()).compareTo(Boolean.valueOf(mVPaymentAccountPersonalInfo.mo30138l()))) != 0 || ((mo30138l() && (compareTo2 = this.phoneNumber.compareTo(mVPaymentAccountPersonalInfo.phoneNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo30131f()).compareTo(Boolean.valueOf(mVPaymentAccountPersonalInfo.mo30131f()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo30131f() || (compareTo = this.address.compareTo(mVPaymentAccountPersonalInfo.address)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentAccountPersonalInfo)) {
            return mo30128a((MVPaymentAccountPersonalInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30131f() {
        return this.address != null;
    }

    /* renamed from: g */
    public final boolean mo30132g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo30133h() {
        return this.email != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30135i() {
        return this.firstName != null;
    }

    /* renamed from: j */
    public final boolean mo30136j() {
        return this.ids != null;
    }

    /* renamed from: k */
    public final boolean mo30137k() {
        return this.lastName != null;
    }

    /* renamed from: l */
    public final boolean mo30138l() {
        return this.phoneNumber != null;
    }

    /* renamed from: m */
    public final void mo30139m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPaymentAccountPersonalInfo(");
        boolean z2 = false;
        if (mo30135i()) {
            sb.append("firstName:");
            String str = this.firstName;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo30137k()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("lastName:");
            String str2 = this.lastName;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo30133h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("email:");
            String str3 = this.email;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (mo30132g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("birthDate:");
            sb.append(this.birthDate);
            z = false;
        }
        if (mo30136j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("ids:");
            List<MVPaymentAccountId> list = this.ids;
            if (list == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(list);
            }
            z = false;
        }
        if (mo30138l()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("phoneNumber:");
            String str4 = this.phoneNumber;
            if (str4 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str4);
            }
        } else {
            z2 = z;
        }
        if (mo30131f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("address:");
            MVUserAddress mVUserAddress = this.address;
            if (mVUserAddress == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVUserAddress);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
