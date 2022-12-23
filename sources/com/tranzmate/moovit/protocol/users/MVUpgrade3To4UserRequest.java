package com.tranzmate.moovit.protocol.users;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p001a0.C0016g;
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

public class MVUpgrade3To4UserRequest implements TBase<MVUpgrade3To4UserRequest, _Fields>, Serializable, Cloneable, Comparable<MVUpgrade3To4UserRequest> {

    /* renamed from: b */
    public static final C25113c f30596b = new C25113c("userId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30597c = new C25113c("clientResolution", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30598d = new C25113c("phoneOsType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30599e = new C25113c("userType", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30600f = new C25113c("authType", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f30601g = new C25113c("uniqueId", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f30602h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f30603i;
    private byte __isset_bitfield = 0;
    public MVAuthTokenType authType;
    public MVClientResolution clientResolution;
    private _Fields[] optionals = {_Fields.USER_TYPE, _Fields.AUTH_TYPE, _Fields.UNIQUE_ID};
    public MVPhoneOsTypes phoneOsType;
    public String uniqueId;
    public int userId;
    public MVUserType userType;

    public enum _Fields implements C25085c {
        USER_ID(1, "userId"),
        CLIENT_RESOLUTION(2, "clientResolution"),
        PHONE_OS_TYPE(3, "phoneOsType"),
        USER_TYPE(4, "userType"),
        AUTH_TYPE(5, "authType"),
        UNIQUE_ID(6, "uniqueId");
        
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
                    return USER_ID;
                case 2:
                    return CLIENT_RESOLUTION;
                case 3:
                    return PHONE_OS_TYPE;
                case 4:
                    return USER_TYPE;
                case 5:
                    return AUTH_TYPE;
                case 6:
                    return UNIQUE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserRequest$a */
    public static class C11949a extends C25239c<MVUpgrade3To4UserRequest> {
        public C11949a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpgrade3To4UserRequest mVUpgrade3To4UserRequest = (MVUpgrade3To4UserRequest) tBase;
            mVUpgrade3To4UserRequest.getClass();
            C25113c cVar = MVUpgrade3To4UserRequest.f30596b;
            gVar.mo61687K();
            gVar.mo61711x(MVUpgrade3To4UserRequest.f30596b);
            gVar.mo61678B(mVUpgrade3To4UserRequest.userId);
            gVar.mo61712y();
            if (mVUpgrade3To4UserRequest.clientResolution != null) {
                gVar.mo61711x(MVUpgrade3To4UserRequest.f30597c);
                gVar.mo61678B(mVUpgrade3To4UserRequest.clientResolution.getValue());
                gVar.mo61712y();
            }
            if (mVUpgrade3To4UserRequest.phoneOsType != null) {
                gVar.mo61711x(MVUpgrade3To4UserRequest.f30598d);
                gVar.mo61678B(mVUpgrade3To4UserRequest.phoneOsType.getValue());
                gVar.mo61712y();
            }
            if (mVUpgrade3To4UserRequest.userType != null && mVUpgrade3To4UserRequest.mo35460k()) {
                gVar.mo61711x(MVUpgrade3To4UserRequest.f30599e);
                gVar.mo61678B(mVUpgrade3To4UserRequest.userType.getValue());
                gVar.mo61712y();
            }
            if (mVUpgrade3To4UserRequest.authType != null && mVUpgrade3To4UserRequest.mo35454f()) {
                gVar.mo61711x(MVUpgrade3To4UserRequest.f30600f);
                gVar.mo61678B(mVUpgrade3To4UserRequest.authType.getValue());
                gVar.mo61712y();
            }
            if (mVUpgrade3To4UserRequest.uniqueId != null && mVUpgrade3To4UserRequest.mo35458i()) {
                gVar.mo61711x(MVUpgrade3To4UserRequest.f30601g);
                gVar.mo61686J(mVUpgrade3To4UserRequest.uniqueId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpgrade3To4UserRequest mVUpgrade3To4UserRequest = (MVUpgrade3To4UserRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUpgrade3To4UserRequest.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpgrade3To4UserRequest.userId = gVar.mo61696i();
                            mVUpgrade3To4UserRequest.mo35461l();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpgrade3To4UserRequest.clientResolution = MVClientResolution.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpgrade3To4UserRequest.phoneOsType = MVPhoneOsTypes.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpgrade3To4UserRequest.userType = MVUserType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpgrade3To4UserRequest.authType = MVAuthTokenType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUpgrade3To4UserRequest.uniqueId = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserRequest$b */
    public static class C11950b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11949a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserRequest$c */
    public static class C11951c extends C25240d<MVUpgrade3To4UserRequest> {
        public C11951c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpgrade3To4UserRequest mVUpgrade3To4UserRequest = (MVUpgrade3To4UserRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUpgrade3To4UserRequest.mo35459j()) {
                bitSet.set(0);
            }
            if (mVUpgrade3To4UserRequest.mo35455g()) {
                bitSet.set(1);
            }
            if (mVUpgrade3To4UserRequest.mo35456h()) {
                bitSet.set(2);
            }
            if (mVUpgrade3To4UserRequest.mo35460k()) {
                bitSet.set(3);
            }
            if (mVUpgrade3To4UserRequest.mo35454f()) {
                bitSet.set(4);
            }
            if (mVUpgrade3To4UserRequest.mo35458i()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVUpgrade3To4UserRequest.mo35459j()) {
                jVar.mo61678B(mVUpgrade3To4UserRequest.userId);
            }
            if (mVUpgrade3To4UserRequest.mo35455g()) {
                jVar.mo61678B(mVUpgrade3To4UserRequest.clientResolution.getValue());
            }
            if (mVUpgrade3To4UserRequest.mo35456h()) {
                jVar.mo61678B(mVUpgrade3To4UserRequest.phoneOsType.getValue());
            }
            if (mVUpgrade3To4UserRequest.mo35460k()) {
                jVar.mo61678B(mVUpgrade3To4UserRequest.userType.getValue());
            }
            if (mVUpgrade3To4UserRequest.mo35454f()) {
                jVar.mo61678B(mVUpgrade3To4UserRequest.authType.getValue());
            }
            if (mVUpgrade3To4UserRequest.mo35458i()) {
                jVar.mo61686J(mVUpgrade3To4UserRequest.uniqueId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpgrade3To4UserRequest mVUpgrade3To4UserRequest = (MVUpgrade3To4UserRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVUpgrade3To4UserRequest.userId = jVar.mo61696i();
                mVUpgrade3To4UserRequest.mo35461l();
            }
            if (T.get(1)) {
                mVUpgrade3To4UserRequest.clientResolution = MVClientResolution.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVUpgrade3To4UserRequest.phoneOsType = MVPhoneOsTypes.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVUpgrade3To4UserRequest.userType = MVUserType.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVUpgrade3To4UserRequest.authType = MVAuthTokenType.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                mVUpgrade3To4UserRequest.uniqueId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserRequest$d */
    public static class C11952d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11951c(0);
        }
    }

    static {
        new C17394d0("MVUpgrade3To4UserRequest");
        HashMap hashMap = new HashMap();
        f30602h = hashMap;
        hashMap.put(C25239c.class, new C11950b());
        hashMap.put(C25240d.class, new C11952d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_ID, new FieldMetaData("userId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CLIENT_RESOLUTION, new FieldMetaData("clientResolution", (byte) 3, new EnumMetaData(MVClientResolution.class)));
        enumMap.put(_Fields.PHONE_OS_TYPE, new FieldMetaData("phoneOsType", (byte) 3, new EnumMetaData(MVPhoneOsTypes.class)));
        enumMap.put(_Fields.USER_TYPE, new FieldMetaData("userType", (byte) 2, new EnumMetaData(MVUserType.class)));
        enumMap.put(_Fields.AUTH_TYPE, new FieldMetaData("authType", (byte) 2, new EnumMetaData(MVAuthTokenType.class)));
        enumMap.put(_Fields.UNIQUE_ID, new FieldMetaData("uniqueId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30603i = unmodifiableMap;
        FieldMetaData.m61947a(MVUpgrade3To4UserRequest.class, unmodifiableMap);
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
        ((C25238b) f30602h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30602h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUpgrade3To4UserRequest mVUpgrade3To4UserRequest = (MVUpgrade3To4UserRequest) obj;
        if (!getClass().equals(mVUpgrade3To4UserRequest.getClass())) {
            return getClass().getName().compareTo(mVUpgrade3To4UserRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35459j()).compareTo(Boolean.valueOf(mVUpgrade3To4UserRequest.mo35459j()));
        if (compareTo2 != 0 || ((mo35459j() && (compareTo2 = C25082a.m62839c(this.userId, mVUpgrade3To4UserRequest.userId)) != 0) || (compareTo2 = Boolean.valueOf(mo35455g()).compareTo(Boolean.valueOf(mVUpgrade3To4UserRequest.mo35455g()))) != 0 || ((mo35455g() && (compareTo2 = this.clientResolution.compareTo(mVUpgrade3To4UserRequest.clientResolution)) != 0) || (compareTo2 = Boolean.valueOf(mo35456h()).compareTo(Boolean.valueOf(mVUpgrade3To4UserRequest.mo35456h()))) != 0 || ((mo35456h() && (compareTo2 = this.phoneOsType.compareTo(mVUpgrade3To4UserRequest.phoneOsType)) != 0) || (compareTo2 = Boolean.valueOf(mo35460k()).compareTo(Boolean.valueOf(mVUpgrade3To4UserRequest.mo35460k()))) != 0 || ((mo35460k() && (compareTo2 = this.userType.compareTo(mVUpgrade3To4UserRequest.userType)) != 0) || (compareTo2 = Boolean.valueOf(mo35454f()).compareTo(Boolean.valueOf(mVUpgrade3To4UserRequest.mo35454f()))) != 0 || ((mo35454f() && (compareTo2 = this.authType.compareTo(mVUpgrade3To4UserRequest.authType)) != 0) || (compareTo2 = Boolean.valueOf(mo35458i()).compareTo(Boolean.valueOf(mVUpgrade3To4UserRequest.mo35458i()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo35458i() || (compareTo = this.uniqueId.compareTo(mVUpgrade3To4UserRequest.uniqueId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUpgrade3To4UserRequest)) {
            return false;
        }
        MVUpgrade3To4UserRequest mVUpgrade3To4UserRequest = (MVUpgrade3To4UserRequest) obj;
        if (this.userId != mVUpgrade3To4UserRequest.userId) {
            return false;
        }
        boolean g = mo35455g();
        boolean g2 = mVUpgrade3To4UserRequest.mo35455g();
        if ((g || g2) && (!g || !g2 || !this.clientResolution.equals(mVUpgrade3To4UserRequest.clientResolution))) {
            return false;
        }
        boolean h = mo35456h();
        boolean h2 = mVUpgrade3To4UserRequest.mo35456h();
        if ((h || h2) && (!h || !h2 || !this.phoneOsType.equals(mVUpgrade3To4UserRequest.phoneOsType))) {
            return false;
        }
        boolean k = mo35460k();
        boolean k2 = mVUpgrade3To4UserRequest.mo35460k();
        if ((k || k2) && (!k || !k2 || !this.userType.equals(mVUpgrade3To4UserRequest.userType))) {
            return false;
        }
        boolean f = mo35454f();
        boolean f2 = mVUpgrade3To4UserRequest.mo35454f();
        if ((f || f2) && (!f || !f2 || !this.authType.equals(mVUpgrade3To4UserRequest.authType))) {
            return false;
        }
        boolean i = mo35458i();
        boolean i2 = mVUpgrade3To4UserRequest.mo35458i();
        if ((i || i2) && (!i || !i2 || !this.uniqueId.equals(mVUpgrade3To4UserRequest.uniqueId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35454f() {
        return this.authType != null;
    }

    /* renamed from: g */
    public final boolean mo35455g() {
        return this.clientResolution != null;
    }

    /* renamed from: h */
    public final boolean mo35456h() {
        return this.phoneOsType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35458i() {
        return this.uniqueId != null;
    }

    /* renamed from: j */
    public final boolean mo35459j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo35460k() {
        return this.userType != null;
    }

    /* renamed from: l */
    public final void mo35461l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUpgrade3To4UserRequest(", "userId:");
        C0016g.m42z(n, this.userId, ", ", "clientResolution:");
        MVClientResolution mVClientResolution = this.clientResolution;
        if (mVClientResolution == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClientResolution);
        }
        n.append(", ");
        n.append("phoneOsType:");
        MVPhoneOsTypes mVPhoneOsTypes = this.phoneOsType;
        if (mVPhoneOsTypes == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPhoneOsTypes);
        }
        if (mo35460k()) {
            n.append(", ");
            n.append("userType:");
            MVUserType mVUserType = this.userType;
            if (mVUserType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUserType);
            }
        }
        if (mo35454f()) {
            n.append(", ");
            n.append("authType:");
            MVAuthTokenType mVAuthTokenType = this.authType;
            if (mVAuthTokenType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVAuthTokenType);
            }
        }
        if (mo35458i()) {
            n.append(", ");
            n.append("uniqueId:");
            String str = this.uniqueId;
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
