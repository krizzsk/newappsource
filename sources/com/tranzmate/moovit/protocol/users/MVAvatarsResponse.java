package com.tranzmate.moovit.protocol.users;

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
import p001a0.C0017h;
import p358af.C13437d;
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

public class MVAvatarsResponse implements TBase<MVAvatarsResponse, _Fields>, Serializable, Cloneable, Comparable<MVAvatarsResponse> {

    /* renamed from: b */
    public static final C25113c f30326b = new C25113c("avatars", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f30327c = new C25113c("specialUsersAvatars", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f30328d = new C25113c("enableSpecialUsersAvatars", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f30329e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30330f;
    private byte __isset_bitfield = 0;
    public List<MVAvatar> avatars;
    public boolean enableSpecialUsersAvatars;
    public List<MVAvatar> specialUsersAvatars;

    public enum _Fields implements C25085c {
        AVATARS(1, "avatars"),
        SPECIAL_USERS_AVATARS(2, "specialUsersAvatars"),
        ENABLE_SPECIAL_USERS_AVATARS(3, "enableSpecialUsersAvatars");
        
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
                return AVATARS;
            }
            if (i == 2) {
                return SPECIAL_USERS_AVATARS;
            }
            if (i != 3) {
                return null;
            }
            return ENABLE_SPECIAL_USERS_AVATARS;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAvatarsResponse$a */
    public static class C11759a extends C25239c<MVAvatarsResponse> {
        public C11759a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAvatarsResponse mVAvatarsResponse = (MVAvatarsResponse) tBase;
            mVAvatarsResponse.getClass();
            C25113c cVar = MVAvatarsResponse.f30326b;
            gVar.mo61687K();
            if (mVAvatarsResponse.avatars != null) {
                gVar.mo61711x(MVAvatarsResponse.f30326b);
                gVar.mo61680D(new C25119e((byte) 12, mVAvatarsResponse.avatars.size()));
                for (MVAvatar X0 : mVAvatarsResponse.avatars) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVAvatarsResponse.specialUsersAvatars != null) {
                gVar.mo61711x(MVAvatarsResponse.f30327c);
                gVar.mo61680D(new C25119e((byte) 12, mVAvatarsResponse.specialUsersAvatars.size()));
                for (MVAvatar X02 : mVAvatarsResponse.specialUsersAvatars) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAvatarsResponse.f30328d);
            C0017h.m62S(gVar, mVAvatarsResponse.enableSpecialUsersAvatars);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAvatarsResponse mVAvatarsResponse = (MVAvatarsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAvatarsResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVAvatarsResponse.enableSpecialUsersAvatars = gVar.mo61690c();
                            mVAvatarsResponse.mo35001i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVAvatarsResponse.specialUsersAvatars = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            MVAvatar mVAvatar = new MVAvatar();
                            mVAvatar.mo25201C1(gVar);
                            mVAvatarsResponse.specialUsersAvatars.add(mVAvatar);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVAvatarsResponse.avatars = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVAvatar mVAvatar2 = new MVAvatar();
                        mVAvatar2.mo25201C1(gVar);
                        mVAvatarsResponse.avatars.add(mVAvatar2);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAvatarsResponse$b */
    public static class C11760b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11759a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAvatarsResponse$c */
    public static class C11761c extends C25240d<MVAvatarsResponse> {
        public C11761c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAvatarsResponse mVAvatarsResponse = (MVAvatarsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAvatarsResponse.mo34997f()) {
                bitSet.set(0);
            }
            if (mVAvatarsResponse.mo34999h()) {
                bitSet.set(1);
            }
            if (mVAvatarsResponse.mo34998g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAvatarsResponse.mo34997f()) {
                jVar.mo61678B(mVAvatarsResponse.avatars.size());
                for (MVAvatar X0 : mVAvatarsResponse.avatars) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVAvatarsResponse.mo34999h()) {
                jVar.mo61678B(mVAvatarsResponse.specialUsersAvatars.size());
                for (MVAvatar X02 : mVAvatarsResponse.specialUsersAvatars) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVAvatarsResponse.mo34998g()) {
                jVar.mo61708u(mVAvatarsResponse.enableSpecialUsersAvatars);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAvatarsResponse mVAvatarsResponse = (MVAvatarsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVAvatarsResponse.avatars = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAvatar mVAvatar = new MVAvatar();
                    mVAvatar.mo25201C1(jVar);
                    mVAvatarsResponse.avatars.add(mVAvatar);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVAvatarsResponse.specialUsersAvatars = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVAvatar mVAvatar2 = new MVAvatar();
                    mVAvatar2.mo25201C1(jVar);
                    mVAvatarsResponse.specialUsersAvatars.add(mVAvatar2);
                }
            }
            if (T.get(2)) {
                mVAvatarsResponse.enableSpecialUsersAvatars = jVar.mo61690c();
                mVAvatarsResponse.mo35001i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAvatarsResponse$d */
    public static class C11762d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11761c(0);
        }
    }

    static {
        new C17394d0("MVAvatarsResponse");
        HashMap hashMap = new HashMap();
        f30329e = hashMap;
        hashMap.put(C25239c.class, new C11760b());
        hashMap.put(C25240d.class, new C11762d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AVATARS, new FieldMetaData("avatars", (byte) 3, new ListMetaData(new StructMetaData(MVAvatar.class))));
        enumMap.put(_Fields.SPECIAL_USERS_AVATARS, new FieldMetaData("specialUsersAvatars", (byte) 3, new ListMetaData(new StructMetaData(MVAvatar.class))));
        enumMap.put(_Fields.ENABLE_SPECIAL_USERS_AVATARS, new FieldMetaData("enableSpecialUsersAvatars", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30330f = unmodifiableMap;
        FieldMetaData.m61947a(MVAvatarsResponse.class, unmodifiableMap);
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
        ((C25238b) f30329e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30329e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVAvatarsResponse mVAvatarsResponse = (MVAvatarsResponse) obj;
        if (!getClass().equals(mVAvatarsResponse.getClass())) {
            return getClass().getName().compareTo(mVAvatarsResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34997f()).compareTo(Boolean.valueOf(mVAvatarsResponse.mo34997f()));
        if (compareTo != 0 || ((mo34997f() && (compareTo = C25082a.m62844h(this.avatars, mVAvatarsResponse.avatars)) != 0) || (compareTo = Boolean.valueOf(mo34999h()).compareTo(Boolean.valueOf(mVAvatarsResponse.mo34999h()))) != 0 || ((mo34999h() && (compareTo = C25082a.m62844h(this.specialUsersAvatars, mVAvatarsResponse.specialUsersAvatars)) != 0) || (compareTo = Boolean.valueOf(mo34998g()).compareTo(Boolean.valueOf(mVAvatarsResponse.mo34998g()))) != 0))) {
            return compareTo;
        }
        if (!mo34998g() || (l = C25082a.m62848l(this.enableSpecialUsersAvatars, mVAvatarsResponse.enableSpecialUsersAvatars)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAvatarsResponse)) {
            return false;
        }
        MVAvatarsResponse mVAvatarsResponse = (MVAvatarsResponse) obj;
        boolean f = mo34997f();
        boolean f2 = mVAvatarsResponse.mo34997f();
        if ((f || f2) && (!f || !f2 || !this.avatars.equals(mVAvatarsResponse.avatars))) {
            return false;
        }
        boolean h = mo34999h();
        boolean h2 = mVAvatarsResponse.mo34999h();
        if (((h || h2) && (!h || !h2 || !this.specialUsersAvatars.equals(mVAvatarsResponse.specialUsersAvatars))) || this.enableSpecialUsersAvatars != mVAvatarsResponse.enableSpecialUsersAvatars) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34997f() {
        return this.avatars != null;
    }

    /* renamed from: g */
    public final boolean mo34998g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo34999h() {
        return this.specialUsersAvatars != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo35001i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAvatarsResponse(", "avatars:");
        List<MVAvatar> list = this.avatars;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("specialUsersAvatars:");
        List<MVAvatar> list2 = this.specialUsersAvatars;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("enableSpecialUsersAvatars:");
        return C25541a.m63885p(n, this.enableSpecialUsersAvatars, ")");
    }
}
