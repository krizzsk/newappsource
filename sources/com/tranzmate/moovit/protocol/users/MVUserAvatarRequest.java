package com.tranzmate.moovit.protocol.users;

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

public class MVUserAvatarRequest implements TBase<MVUserAvatarRequest, _Fields>, Serializable, Cloneable, Comparable<MVUserAvatarRequest> {

    /* renamed from: b */
    public static final C25113c f30611b = new C25113c("avatarId", (byte) 8, 1);

    /* renamed from: c */
    public static final HashMap f30612c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f30613d;
    private byte __isset_bitfield = 0;
    public int avatarId;

    public enum _Fields implements C25085c {
        AVATAR_ID(1, "avatarId");
        
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
            if (i != 1) {
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserAvatarRequest$a */
    public static class C11961a extends C25239c<MVUserAvatarRequest> {
        public C11961a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserAvatarRequest mVUserAvatarRequest = (MVUserAvatarRequest) tBase;
            mVUserAvatarRequest.getClass();
            C25113c cVar = MVUserAvatarRequest.f30611b;
            gVar.mo61687K();
            gVar.mo61711x(MVUserAvatarRequest.f30611b);
            C16530d.m42020n(gVar, mVUserAvatarRequest.avatarId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserAvatarRequest mVUserAvatarRequest = (MVUserAvatarRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserAvatarRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 8) {
                    mVUserAvatarRequest.avatarId = gVar.mo61696i();
                    mVUserAvatarRequest.mo35481g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserAvatarRequest$b */
    public static class C11962b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11961a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserAvatarRequest$c */
    public static class C11963c extends C25240d<MVUserAvatarRequest> {
        public C11963c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserAvatarRequest mVUserAvatarRequest = (MVUserAvatarRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserAvatarRequest.mo35480f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVUserAvatarRequest.mo35480f()) {
                jVar.mo61678B(mVUserAvatarRequest.avatarId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserAvatarRequest mVUserAvatarRequest = (MVUserAvatarRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVUserAvatarRequest.avatarId = jVar.mo61696i();
                mVUserAvatarRequest.mo35481g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserAvatarRequest$d */
    public static class C11964d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11963c(0);
        }
    }

    static {
        new C17394d0("MVUserAvatarRequest");
        HashMap hashMap = new HashMap();
        f30612c = hashMap;
        hashMap.put(C25239c.class, new C11962b());
        hashMap.put(C25240d.class, new C11964d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AVATAR_ID, new FieldMetaData("avatarId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30613d = unmodifiableMap;
        FieldMetaData.m61947a(MVUserAvatarRequest.class, unmodifiableMap);
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
        ((C25238b) f30612c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30612c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVUserAvatarRequest mVUserAvatarRequest = (MVUserAvatarRequest) obj;
        if (!getClass().equals(mVUserAvatarRequest.getClass())) {
            return getClass().getName().compareTo(mVUserAvatarRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35480f()).compareTo(Boolean.valueOf(mVUserAvatarRequest.mo35480f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo35480f() || (c = C25082a.m62839c(this.avatarId, mVUserAvatarRequest.avatarId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVUserAvatarRequest) && this.avatarId == ((MVUserAvatarRequest) obj).avatarId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35480f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo35481g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C13437d.m33707l(C13437d.m33708n("MVUserAvatarRequest(", "avatarId:"), this.avatarId, ")");
    }
}
