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

public class MVTicketCacheInstructions implements TBase<MVTicketCacheInstructions, _Fields>, Serializable, Cloneable, Comparable<MVTicketCacheInstructions> {

    /* renamed from: b */
    public static final C25113c f29178b = new C25113c("expirationTime", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f29179c = new C25113c("cacheGroupKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29180d = new C25113c("flushCacheGroupKey", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f29181e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29182f;
    private byte __isset_bitfield = 0;
    public String cacheGroupKey;
    public long expirationTime;
    public String flushCacheGroupKey;
    private _Fields[] optionals = {_Fields.FLUSH_CACHE_GROUP_KEY};

    public enum _Fields implements C25085c {
        EXPIRATION_TIME(1, "expirationTime"),
        CACHE_GROUP_KEY(2, "cacheGroupKey"),
        FLUSH_CACHE_GROUP_KEY(3, "flushCacheGroupKey");
        
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
                return EXPIRATION_TIME;
            }
            if (i == 2) {
                return CACHE_GROUP_KEY;
            }
            if (i != 3) {
                return null;
            }
            return FLUSH_CACHE_GROUP_KEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketCacheInstructions$a */
    public static class C11071a extends C25239c<MVTicketCacheInstructions> {
        public C11071a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketCacheInstructions mVTicketCacheInstructions = (MVTicketCacheInstructions) tBase;
            mVTicketCacheInstructions.getClass();
            C25113c cVar = MVTicketCacheInstructions.f29178b;
            gVar.mo61687K();
            gVar.mo61711x(MVTicketCacheInstructions.f29178b);
            gVar.mo61679C(mVTicketCacheInstructions.expirationTime);
            gVar.mo61712y();
            if (mVTicketCacheInstructions.cacheGroupKey != null) {
                gVar.mo61711x(MVTicketCacheInstructions.f29179c);
                gVar.mo61686J(mVTicketCacheInstructions.cacheGroupKey);
                gVar.mo61712y();
            }
            if (mVTicketCacheInstructions.flushCacheGroupKey != null && mVTicketCacheInstructions.mo33075h()) {
                gVar.mo61711x(MVTicketCacheInstructions.f29180d);
                gVar.mo61686J(mVTicketCacheInstructions.flushCacheGroupKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketCacheInstructions mVTicketCacheInstructions = (MVTicketCacheInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTicketCacheInstructions.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVTicketCacheInstructions.flushCacheGroupKey = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTicketCacheInstructions.cacheGroupKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVTicketCacheInstructions.expirationTime = gVar.mo61697j();
                    mVTicketCacheInstructions.mo33077i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketCacheInstructions$b */
    public static class C11072b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11071a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketCacheInstructions$c */
    public static class C11073c extends C25240d<MVTicketCacheInstructions> {
        public C11073c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketCacheInstructions mVTicketCacheInstructions = (MVTicketCacheInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketCacheInstructions.mo33074g()) {
                bitSet.set(0);
            }
            if (mVTicketCacheInstructions.mo33073f()) {
                bitSet.set(1);
            }
            if (mVTicketCacheInstructions.mo33075h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTicketCacheInstructions.mo33074g()) {
                jVar.mo61679C(mVTicketCacheInstructions.expirationTime);
            }
            if (mVTicketCacheInstructions.mo33073f()) {
                jVar.mo61686J(mVTicketCacheInstructions.cacheGroupKey);
            }
            if (mVTicketCacheInstructions.mo33075h()) {
                jVar.mo61686J(mVTicketCacheInstructions.flushCacheGroupKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketCacheInstructions mVTicketCacheInstructions = (MVTicketCacheInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTicketCacheInstructions.expirationTime = jVar.mo61697j();
                mVTicketCacheInstructions.mo33077i();
            }
            if (T.get(1)) {
                mVTicketCacheInstructions.cacheGroupKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTicketCacheInstructions.flushCacheGroupKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketCacheInstructions$d */
    public static class C11074d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11073c(0);
        }
    }

    static {
        new C17394d0("MVTicketCacheInstructions");
        HashMap hashMap = new HashMap();
        f29181e = hashMap;
        hashMap.put(C25239c.class, new C11072b());
        hashMap.put(C25240d.class, new C11074d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EXPIRATION_TIME, new FieldMetaData("expirationTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.CACHE_GROUP_KEY, new FieldMetaData("cacheGroupKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FLUSH_CACHE_GROUP_KEY, new FieldMetaData("flushCacheGroupKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29182f = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketCacheInstructions.class, unmodifiableMap);
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
        ((C25238b) f29181e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29181e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33070a(MVTicketCacheInstructions mVTicketCacheInstructions) {
        if (mVTicketCacheInstructions == null || this.expirationTime != mVTicketCacheInstructions.expirationTime) {
            return false;
        }
        boolean f = mo33073f();
        boolean f2 = mVTicketCacheInstructions.mo33073f();
        if ((f || f2) && (!f || !f2 || !this.cacheGroupKey.equals(mVTicketCacheInstructions.cacheGroupKey))) {
            return false;
        }
        boolean h = mo33075h();
        boolean h2 = mVTicketCacheInstructions.mo33075h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.flushCacheGroupKey.equals(mVTicketCacheInstructions.flushCacheGroupKey)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTicketCacheInstructions mVTicketCacheInstructions = (MVTicketCacheInstructions) obj;
        if (!getClass().equals(mVTicketCacheInstructions.getClass())) {
            return getClass().getName().compareTo(mVTicketCacheInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33074g()).compareTo(Boolean.valueOf(mVTicketCacheInstructions.mo33074g()));
        if (compareTo2 != 0 || ((mo33074g() && (compareTo2 = C25082a.m62840d(this.expirationTime, mVTicketCacheInstructions.expirationTime)) != 0) || (compareTo2 = Boolean.valueOf(mo33073f()).compareTo(Boolean.valueOf(mVTicketCacheInstructions.mo33073f()))) != 0 || ((mo33073f() && (compareTo2 = this.cacheGroupKey.compareTo(mVTicketCacheInstructions.cacheGroupKey)) != 0) || (compareTo2 = Boolean.valueOf(mo33075h()).compareTo(Boolean.valueOf(mVTicketCacheInstructions.mo33075h()))) != 0))) {
            return compareTo2;
        }
        if (!mo33075h() || (compareTo = this.flushCacheGroupKey.compareTo(mVTicketCacheInstructions.flushCacheGroupKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTicketCacheInstructions)) {
            return mo33070a((MVTicketCacheInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33073f() {
        return this.cacheGroupKey != null;
    }

    /* renamed from: g */
    public final boolean mo33074g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo33075h() {
        return this.flushCacheGroupKey != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33077i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicketCacheInstructions(", "expirationTime:");
        C25541a.m63889t(n, this.expirationTime, ", ", "cacheGroupKey:");
        String str = this.cacheGroupKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33075h()) {
            n.append(", ");
            n.append("flushCacheGroupKey:");
            String str2 = this.flushCacheGroupKey;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
