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

public class MVUpdateUserInfo implements TBase<MVUpdateUserInfo, _Fields>, Serializable, Cloneable, Comparable<MVUpdateUserInfo> {

    /* renamed from: b */
    public static final C25113c f30574b = new C25113c("email", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30575c = new C25113c("nickname", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30576d = new C25113c("avatarId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f30577e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30578f;
    private byte __isset_bitfield = 0;
    public int avatarId;
    public String email;
    public String nickname;

    public enum _Fields implements C25085c {
        EMAIL(1, "email"),
        NICKNAME(2, "nickname"),
        AVATAR_ID(3, "avatarId");
        
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
                return EMAIL;
            }
            if (i == 2) {
                return NICKNAME;
            }
            if (i != 3) {
                return null;
            }
            return AVATAR_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdateUserInfo$a */
    public static class C11929a extends C25239c<MVUpdateUserInfo> {
        public C11929a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdateUserInfo mVUpdateUserInfo = (MVUpdateUserInfo) tBase;
            mVUpdateUserInfo.getClass();
            C25113c cVar = MVUpdateUserInfo.f30574b;
            gVar.mo61687K();
            if (mVUpdateUserInfo.email != null) {
                gVar.mo61711x(MVUpdateUserInfo.f30574b);
                gVar.mo61686J(mVUpdateUserInfo.email);
                gVar.mo61712y();
            }
            if (mVUpdateUserInfo.nickname != null) {
                gVar.mo61711x(MVUpdateUserInfo.f30575c);
                gVar.mo61686J(mVUpdateUserInfo.nickname);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVUpdateUserInfo.f30576d);
            C16530d.m42020n(gVar, mVUpdateUserInfo.avatarId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdateUserInfo mVUpdateUserInfo = (MVUpdateUserInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUpdateUserInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVUpdateUserInfo.avatarId = gVar.mo61696i();
                            mVUpdateUserInfo.mo35418i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVUpdateUserInfo.nickname = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVUpdateUserInfo.email = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdateUserInfo$b */
    public static class C11930b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11929a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdateUserInfo$c */
    public static class C11931c extends C25240d<MVUpdateUserInfo> {
        public C11931c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdateUserInfo mVUpdateUserInfo = (MVUpdateUserInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUpdateUserInfo.mo35415g()) {
                bitSet.set(0);
            }
            if (mVUpdateUserInfo.mo35416h()) {
                bitSet.set(1);
            }
            if (mVUpdateUserInfo.mo35414f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVUpdateUserInfo.mo35415g()) {
                jVar.mo61686J(mVUpdateUserInfo.email);
            }
            if (mVUpdateUserInfo.mo35416h()) {
                jVar.mo61686J(mVUpdateUserInfo.nickname);
            }
            if (mVUpdateUserInfo.mo35414f()) {
                jVar.mo61678B(mVUpdateUserInfo.avatarId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdateUserInfo mVUpdateUserInfo = (MVUpdateUserInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVUpdateUserInfo.email = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVUpdateUserInfo.nickname = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVUpdateUserInfo.avatarId = jVar.mo61696i();
                mVUpdateUserInfo.mo35418i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdateUserInfo$d */
    public static class C11932d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11931c(0);
        }
    }

    static {
        new C17394d0("MVUpdateUserInfo");
        HashMap hashMap = new HashMap();
        f30577e = hashMap;
        hashMap.put(C25239c.class, new C11930b());
        hashMap.put(C25240d.class, new C11932d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EMAIL, new FieldMetaData("email", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NICKNAME, new FieldMetaData("nickname", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AVATAR_ID, new FieldMetaData("avatarId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30578f = unmodifiableMap;
        FieldMetaData.m61947a(MVUpdateUserInfo.class, unmodifiableMap);
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
        ((C25238b) f30577e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30577e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVUpdateUserInfo mVUpdateUserInfo = (MVUpdateUserInfo) obj;
        if (!getClass().equals(mVUpdateUserInfo.getClass())) {
            return getClass().getName().compareTo(mVUpdateUserInfo.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35415g()).compareTo(Boolean.valueOf(mVUpdateUserInfo.mo35415g()));
        if (compareTo != 0 || ((mo35415g() && (compareTo = this.email.compareTo(mVUpdateUserInfo.email)) != 0) || (compareTo = Boolean.valueOf(mo35416h()).compareTo(Boolean.valueOf(mVUpdateUserInfo.mo35416h()))) != 0 || ((mo35416h() && (compareTo = this.nickname.compareTo(mVUpdateUserInfo.nickname)) != 0) || (compareTo = Boolean.valueOf(mo35414f()).compareTo(Boolean.valueOf(mVUpdateUserInfo.mo35414f()))) != 0))) {
            return compareTo;
        }
        if (!mo35414f() || (c = C25082a.m62839c(this.avatarId, mVUpdateUserInfo.avatarId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUpdateUserInfo)) {
            return false;
        }
        MVUpdateUserInfo mVUpdateUserInfo = (MVUpdateUserInfo) obj;
        boolean g = mo35415g();
        boolean g2 = mVUpdateUserInfo.mo35415g();
        if ((g || g2) && (!g || !g2 || !this.email.equals(mVUpdateUserInfo.email))) {
            return false;
        }
        boolean h = mo35416h();
        boolean h2 = mVUpdateUserInfo.mo35416h();
        if (((h || h2) && (!h || !h2 || !this.nickname.equals(mVUpdateUserInfo.nickname))) || this.avatarId != mVUpdateUserInfo.avatarId) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35414f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo35415g() {
        return this.email != null;
    }

    /* renamed from: h */
    public final boolean mo35416h() {
        return this.nickname != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo35418i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUpdateUserInfo(", "email:");
        String str = this.email;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("nickname:");
        String str2 = this.nickname;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("avatarId:");
        return C13437d.m33707l(n, this.avatarId, ")");
    }
}
