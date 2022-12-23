package com.tranzmate.moovit.protocol.externalregistration;

import com.appboy.support.StringUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
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
import p001a0.C0017h;
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

public class MVSetFacebookTokenRequest implements TBase<MVSetFacebookTokenRequest, _Fields>, Serializable, Cloneable, Comparable<MVSetFacebookTokenRequest> {

    /* renamed from: b */
    public static final C25113c f25603b = new C25113c(FirebaseMessagingService.EXTRA_TOKEN, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25604c = new C25113c("facebookId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25605d = new C25113c("isEmailAllowed", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f25606e = new C25113c("isFriendsCountAllowed", (byte) 2, 4);

    /* renamed from: f */
    public static final HashMap f25607f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25608g;
    private byte __isset_bitfield = 0;
    public String facebookId;
    public boolean isEmailAllowed;
    public boolean isFriendsCountAllowed;
    public String token;

    public enum _Fields implements C25085c {
        TOKEN(1, FirebaseMessagingService.EXTRA_TOKEN),
        FACEBOOK_ID(2, "facebookId"),
        IS_EMAIL_ALLOWED(3, "isEmailAllowed"),
        IS_FRIENDS_COUNT_ALLOWED(4, "isFriendsCountAllowed");
        
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
                return TOKEN;
            }
            if (i == 2) {
                return FACEBOOK_ID;
            }
            if (i == 3) {
                return IS_EMAIL_ALLOWED;
            }
            if (i != 4) {
                return null;
            }
            return IS_FRIENDS_COUNT_ALLOWED;
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

    /* renamed from: com.tranzmate.moovit.protocol.externalregistration.MVSetFacebookTokenRequest$a */
    public static class C8711a extends C25239c<MVSetFacebookTokenRequest> {
        public C8711a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetFacebookTokenRequest mVSetFacebookTokenRequest = (MVSetFacebookTokenRequest) tBase;
            mVSetFacebookTokenRequest.getClass();
            C25113c cVar = MVSetFacebookTokenRequest.f25603b;
            gVar.mo61687K();
            if (mVSetFacebookTokenRequest.token != null) {
                gVar.mo61711x(MVSetFacebookTokenRequest.f25603b);
                gVar.mo61686J(mVSetFacebookTokenRequest.token);
                gVar.mo61712y();
            }
            if (mVSetFacebookTokenRequest.facebookId != null) {
                gVar.mo61711x(MVSetFacebookTokenRequest.f25604c);
                gVar.mo61686J(mVSetFacebookTokenRequest.facebookId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSetFacebookTokenRequest.f25605d);
            gVar.mo61708u(mVSetFacebookTokenRequest.isEmailAllowed);
            gVar.mo61712y();
            gVar.mo61711x(MVSetFacebookTokenRequest.f25606e);
            C0017h.m62S(gVar, mVSetFacebookTokenRequest.isFriendsCountAllowed);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetFacebookTokenRequest mVSetFacebookTokenRequest = (MVSetFacebookTokenRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSetFacebookTokenRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 2) {
                                mVSetFacebookTokenRequest.isFriendsCountAllowed = gVar.mo61690c();
                                mVSetFacebookTokenRequest.mo27169k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVSetFacebookTokenRequest.isEmailAllowed = gVar.mo61690c();
                            mVSetFacebookTokenRequest.mo27168j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVSetFacebookTokenRequest.facebookId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVSetFacebookTokenRequest.token = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.externalregistration.MVSetFacebookTokenRequest$b */
    public static class C8712b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8711a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.externalregistration.MVSetFacebookTokenRequest$c */
    public static class C8713c extends C25240d<MVSetFacebookTokenRequest> {
        public C8713c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetFacebookTokenRequest mVSetFacebookTokenRequest = (MVSetFacebookTokenRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetFacebookTokenRequest.mo27167i()) {
                bitSet.set(0);
            }
            if (mVSetFacebookTokenRequest.mo27163f()) {
                bitSet.set(1);
            }
            if (mVSetFacebookTokenRequest.mo27164g()) {
                bitSet.set(2);
            }
            if (mVSetFacebookTokenRequest.mo27165h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVSetFacebookTokenRequest.mo27167i()) {
                jVar.mo61686J(mVSetFacebookTokenRequest.token);
            }
            if (mVSetFacebookTokenRequest.mo27163f()) {
                jVar.mo61686J(mVSetFacebookTokenRequest.facebookId);
            }
            if (mVSetFacebookTokenRequest.mo27164g()) {
                jVar.mo61708u(mVSetFacebookTokenRequest.isEmailAllowed);
            }
            if (mVSetFacebookTokenRequest.mo27165h()) {
                jVar.mo61708u(mVSetFacebookTokenRequest.isFriendsCountAllowed);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetFacebookTokenRequest mVSetFacebookTokenRequest = (MVSetFacebookTokenRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVSetFacebookTokenRequest.token = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVSetFacebookTokenRequest.facebookId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVSetFacebookTokenRequest.isEmailAllowed = jVar.mo61690c();
                mVSetFacebookTokenRequest.mo27168j();
            }
            if (T.get(3)) {
                mVSetFacebookTokenRequest.isFriendsCountAllowed = jVar.mo61690c();
                mVSetFacebookTokenRequest.mo27169k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.externalregistration.MVSetFacebookTokenRequest$d */
    public static class C8714d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8713c(0);
        }
    }

    static {
        new C17394d0("MVSetFacebookTokenRequest");
        HashMap hashMap = new HashMap();
        f25607f = hashMap;
        hashMap.put(C25239c.class, new C8712b());
        hashMap.put(C25240d.class, new C8714d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TOKEN, new FieldMetaData(FirebaseMessagingService.EXTRA_TOKEN, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FACEBOOK_ID, new FieldMetaData("facebookId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_EMAIL_ALLOWED, new FieldMetaData("isEmailAllowed", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_FRIENDS_COUNT_ALLOWED, new FieldMetaData("isFriendsCountAllowed", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25608g = unmodifiableMap;
        FieldMetaData.m61947a(MVSetFacebookTokenRequest.class, unmodifiableMap);
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
        ((C25238b) f25607f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25607f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVSetFacebookTokenRequest mVSetFacebookTokenRequest = (MVSetFacebookTokenRequest) obj;
        if (!getClass().equals(mVSetFacebookTokenRequest.getClass())) {
            return getClass().getName().compareTo(mVSetFacebookTokenRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27167i()).compareTo(Boolean.valueOf(mVSetFacebookTokenRequest.mo27167i()));
        if (compareTo != 0 || ((mo27167i() && (compareTo = this.token.compareTo(mVSetFacebookTokenRequest.token)) != 0) || (compareTo = Boolean.valueOf(mo27163f()).compareTo(Boolean.valueOf(mVSetFacebookTokenRequest.mo27163f()))) != 0 || ((mo27163f() && (compareTo = this.facebookId.compareTo(mVSetFacebookTokenRequest.facebookId)) != 0) || (compareTo = Boolean.valueOf(mo27164g()).compareTo(Boolean.valueOf(mVSetFacebookTokenRequest.mo27164g()))) != 0 || ((mo27164g() && (compareTo = C25082a.m62848l(this.isEmailAllowed, mVSetFacebookTokenRequest.isEmailAllowed)) != 0) || (compareTo = Boolean.valueOf(mo27165h()).compareTo(Boolean.valueOf(mVSetFacebookTokenRequest.mo27165h()))) != 0)))) {
            return compareTo;
        }
        if (!mo27165h() || (l = C25082a.m62848l(this.isFriendsCountAllowed, mVSetFacebookTokenRequest.isFriendsCountAllowed)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetFacebookTokenRequest)) {
            return false;
        }
        MVSetFacebookTokenRequest mVSetFacebookTokenRequest = (MVSetFacebookTokenRequest) obj;
        boolean i = mo27167i();
        boolean i2 = mVSetFacebookTokenRequest.mo27167i();
        if ((i || i2) && (!i || !i2 || !this.token.equals(mVSetFacebookTokenRequest.token))) {
            return false;
        }
        boolean f = mo27163f();
        boolean f2 = mVSetFacebookTokenRequest.mo27163f();
        if (((!f && !f2) || (f && f2 && this.facebookId.equals(mVSetFacebookTokenRequest.facebookId))) && this.isEmailAllowed == mVSetFacebookTokenRequest.isEmailAllowed && this.isFriendsCountAllowed == mVSetFacebookTokenRequest.isFriendsCountAllowed) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27163f() {
        return this.facebookId != null;
    }

    /* renamed from: g */
    public final boolean mo27164g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27165h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27167i() {
        return this.token != null;
    }

    /* renamed from: j */
    public final void mo27168j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo27169k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSetFacebookTokenRequest(", "token:");
        String str = this.token;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("facebookId:");
        String str2 = this.facebookId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("isEmailAllowed:");
        C13555b.m33977q(n, this.isEmailAllowed, ", ", "isFriendsCountAllowed:");
        return C25541a.m63885p(n, this.isFriendsCountAllowed, ")");
    }
}
