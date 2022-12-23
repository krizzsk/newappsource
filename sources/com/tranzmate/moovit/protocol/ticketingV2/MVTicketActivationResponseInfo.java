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

public class MVTicketActivationResponseInfo implements TBase<MVTicketActivationResponseInfo, _Fields>, Serializable, Cloneable, Comparable<MVTicketActivationResponseInfo> {

    /* renamed from: b */
    public static final C25113c f29174b = new C25113c("ticketId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29175c = new C25113c("flushCacheGroupKey", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f29176d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29177e;
    public String flushCacheGroupKey;
    private _Fields[] optionals = {_Fields.FLUSH_CACHE_GROUP_KEY};
    public String ticketId;

    public enum _Fields implements C25085c {
        TICKET_ID(1, "ticketId"),
        FLUSH_CACHE_GROUP_KEY(2, "flushCacheGroupKey");
        
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
                return TICKET_ID;
            }
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationResponseInfo$a */
    public static class C11067a extends C25239c<MVTicketActivationResponseInfo> {
        public C11067a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketActivationResponseInfo mVTicketActivationResponseInfo = (MVTicketActivationResponseInfo) tBase;
            mVTicketActivationResponseInfo.getClass();
            C25113c cVar = MVTicketActivationResponseInfo.f29174b;
            gVar.mo61687K();
            if (mVTicketActivationResponseInfo.ticketId != null) {
                gVar.mo61711x(MVTicketActivationResponseInfo.f29174b);
                gVar.mo61686J(mVTicketActivationResponseInfo.ticketId);
                gVar.mo61712y();
            }
            if (mVTicketActivationResponseInfo.flushCacheGroupKey != null && mVTicketActivationResponseInfo.mo33064f()) {
                gVar.mo61711x(MVTicketActivationResponseInfo.f29175c);
                gVar.mo61686J(mVTicketActivationResponseInfo.flushCacheGroupKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketActivationResponseInfo mVTicketActivationResponseInfo = (MVTicketActivationResponseInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTicketActivationResponseInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTicketActivationResponseInfo.flushCacheGroupKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTicketActivationResponseInfo.ticketId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationResponseInfo$b */
    public static class C11068b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11067a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationResponseInfo$c */
    public static class C11069c extends C25240d<MVTicketActivationResponseInfo> {
        public C11069c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketActivationResponseInfo mVTicketActivationResponseInfo = (MVTicketActivationResponseInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketActivationResponseInfo.mo33065g()) {
                bitSet.set(0);
            }
            if (mVTicketActivationResponseInfo.mo33064f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTicketActivationResponseInfo.mo33065g()) {
                jVar.mo61686J(mVTicketActivationResponseInfo.ticketId);
            }
            if (mVTicketActivationResponseInfo.mo33064f()) {
                jVar.mo61686J(mVTicketActivationResponseInfo.flushCacheGroupKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketActivationResponseInfo mVTicketActivationResponseInfo = (MVTicketActivationResponseInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTicketActivationResponseInfo.ticketId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTicketActivationResponseInfo.flushCacheGroupKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationResponseInfo$d */
    public static class C11070d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11069c(0);
        }
    }

    static {
        new C17394d0("MVTicketActivationResponseInfo");
        HashMap hashMap = new HashMap();
        f29176d = hashMap;
        hashMap.put(C25239c.class, new C11068b());
        hashMap.put(C25240d.class, new C11070d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TICKET_ID, new FieldMetaData("ticketId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FLUSH_CACHE_GROUP_KEY, new FieldMetaData("flushCacheGroupKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29177e = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketActivationResponseInfo.class, unmodifiableMap);
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
        ((C25238b) f29176d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29176d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTicketActivationResponseInfo mVTicketActivationResponseInfo = (MVTicketActivationResponseInfo) obj;
        if (!getClass().equals(mVTicketActivationResponseInfo.getClass())) {
            return getClass().getName().compareTo(mVTicketActivationResponseInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33065g()).compareTo(Boolean.valueOf(mVTicketActivationResponseInfo.mo33065g()));
        if (compareTo2 != 0 || ((mo33065g() && (compareTo2 = this.ticketId.compareTo(mVTicketActivationResponseInfo.ticketId)) != 0) || (compareTo2 = Boolean.valueOf(mo33064f()).compareTo(Boolean.valueOf(mVTicketActivationResponseInfo.mo33064f()))) != 0)) {
            return compareTo2;
        }
        if (!mo33064f() || (compareTo = this.flushCacheGroupKey.compareTo(mVTicketActivationResponseInfo.flushCacheGroupKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTicketActivationResponseInfo)) {
            return false;
        }
        MVTicketActivationResponseInfo mVTicketActivationResponseInfo = (MVTicketActivationResponseInfo) obj;
        boolean g = mo33065g();
        boolean g2 = mVTicketActivationResponseInfo.mo33065g();
        if ((g || g2) && (!g || !g2 || !this.ticketId.equals(mVTicketActivationResponseInfo.ticketId))) {
            return false;
        }
        boolean f = mo33064f();
        boolean f2 = mVTicketActivationResponseInfo.mo33064f();
        if ((f || f2) && (!f || !f2 || !this.flushCacheGroupKey.equals(mVTicketActivationResponseInfo.flushCacheGroupKey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33064f() {
        return this.flushCacheGroupKey != null;
    }

    /* renamed from: g */
    public final boolean mo33065g() {
        return this.ticketId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicketActivationResponseInfo(", "ticketId:");
        String str = this.ticketId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33064f()) {
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
