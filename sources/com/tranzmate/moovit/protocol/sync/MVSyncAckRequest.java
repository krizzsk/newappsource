package com.tranzmate.moovit.protocol.sync;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
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

public class MVSyncAckRequest implements TBase<MVSyncAckRequest, _Fields>, Serializable, Cloneable, Comparable<MVSyncAckRequest> {

    /* renamed from: b */
    public static final C25113c f28491b = new C25113c("entityType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28492c = new C25113c("maxVersion", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f28493d = new C25113c("ids", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f28494e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28495f;
    private byte __isset_bitfield = 0;
    public MVSyncEntityType entityType;
    public List<Integer> ids;
    public long maxVersion;

    public enum _Fields implements C25085c {
        ENTITY_TYPE(1, "entityType"),
        MAX_VERSION(2, "maxVersion"),
        IDS(3, "ids");
        
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
                return ENTITY_TYPE;
            }
            if (i == 2) {
                return MAX_VERSION;
            }
            if (i != 3) {
                return null;
            }
            return IDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncAckRequest$a */
    public static class C10663a extends C25239c<MVSyncAckRequest> {
        public C10663a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSyncAckRequest mVSyncAckRequest = (MVSyncAckRequest) tBase;
            mVSyncAckRequest.getClass();
            C25113c cVar = MVSyncAckRequest.f28491b;
            gVar.mo61687K();
            if (mVSyncAckRequest.entityType != null) {
                gVar.mo61711x(MVSyncAckRequest.f28491b);
                gVar.mo61678B(mVSyncAckRequest.entityType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSyncAckRequest.f28492c);
            gVar.mo61679C(mVSyncAckRequest.maxVersion);
            gVar.mo61712y();
            if (mVSyncAckRequest.ids != null) {
                gVar.mo61711x(MVSyncAckRequest.f28493d);
                gVar.mo61680D(new C25119e((byte) 8, mVSyncAckRequest.ids.size()));
                for (Integer intValue : mVSyncAckRequest.ids) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSyncAckRequest mVSyncAckRequest = (MVSyncAckRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSyncAckRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVSyncAckRequest.ids = new ArrayList(k.f63395b);
                            int i = 0;
                            while (i < k.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVSyncAckRequest.ids, i, 1);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVSyncAckRequest.maxVersion = gVar.mo61697j();
                        mVSyncAckRequest.mo32035i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSyncAckRequest.entityType = MVSyncEntityType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncAckRequest$b */
    public static class C10664b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10663a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncAckRequest$c */
    public static class C10665c extends C25240d<MVSyncAckRequest> {
        public C10665c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSyncAckRequest mVSyncAckRequest = (MVSyncAckRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSyncAckRequest.mo32031f()) {
                bitSet.set(0);
            }
            if (mVSyncAckRequest.mo32033h()) {
                bitSet.set(1);
            }
            if (mVSyncAckRequest.mo32032g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSyncAckRequest.mo32031f()) {
                jVar.mo61678B(mVSyncAckRequest.entityType.getValue());
            }
            if (mVSyncAckRequest.mo32033h()) {
                jVar.mo61679C(mVSyncAckRequest.maxVersion);
            }
            if (mVSyncAckRequest.mo32032g()) {
                jVar.mo61678B(mVSyncAckRequest.ids.size());
                for (Integer intValue : mVSyncAckRequest.ids) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSyncAckRequest mVSyncAckRequest = (MVSyncAckRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVSyncAckRequest.entityType = MVSyncEntityType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVSyncAckRequest.maxVersion = jVar.mo61697j();
                mVSyncAckRequest.mo32035i();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVSyncAckRequest.ids = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVSyncAckRequest.ids, i2, 1)) {
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncAckRequest$d */
    public static class C10666d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10665c(0);
        }
    }

    static {
        new C17394d0("MVSyncAckRequest");
        HashMap hashMap = new HashMap();
        f28494e = hashMap;
        hashMap.put(C25239c.class, new C10664b());
        hashMap.put(C25240d.class, new C10666d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENTITY_TYPE, new FieldMetaData("entityType", (byte) 3, new EnumMetaData(MVSyncEntityType.class)));
        enumMap.put(_Fields.MAX_VERSION, new FieldMetaData("maxVersion", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.IDS, new FieldMetaData("ids", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28495f = unmodifiableMap;
        FieldMetaData.m61947a(MVSyncAckRequest.class, unmodifiableMap);
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
        ((C25238b) f28494e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28494e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVSyncAckRequest mVSyncAckRequest = (MVSyncAckRequest) obj;
        if (!getClass().equals(mVSyncAckRequest.getClass())) {
            return getClass().getName().compareTo(mVSyncAckRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32031f()).compareTo(Boolean.valueOf(mVSyncAckRequest.mo32031f()));
        if (compareTo != 0 || ((mo32031f() && (compareTo = this.entityType.compareTo(mVSyncAckRequest.entityType)) != 0) || (compareTo = Boolean.valueOf(mo32033h()).compareTo(Boolean.valueOf(mVSyncAckRequest.mo32033h()))) != 0 || ((mo32033h() && (compareTo = C25082a.m62840d(this.maxVersion, mVSyncAckRequest.maxVersion)) != 0) || (compareTo = Boolean.valueOf(mo32032g()).compareTo(Boolean.valueOf(mVSyncAckRequest.mo32032g()))) != 0))) {
            return compareTo;
        }
        if (!mo32032g() || (h = C25082a.m62844h(this.ids, mVSyncAckRequest.ids)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSyncAckRequest)) {
            return false;
        }
        MVSyncAckRequest mVSyncAckRequest = (MVSyncAckRequest) obj;
        boolean f = mo32031f();
        boolean f2 = mVSyncAckRequest.mo32031f();
        if (((f || f2) && (!f || !f2 || !this.entityType.equals(mVSyncAckRequest.entityType))) || this.maxVersion != mVSyncAckRequest.maxVersion) {
            return false;
        }
        boolean g = mo32032g();
        boolean g2 = mVSyncAckRequest.mo32032g();
        if ((g || g2) && (!g || !g2 || !this.ids.equals(mVSyncAckRequest.ids))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32031f() {
        return this.entityType != null;
    }

    /* renamed from: g */
    public final boolean mo32032g() {
        return this.ids != null;
    }

    /* renamed from: h */
    public final boolean mo32033h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo32035i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSyncAckRequest(", "entityType:");
        MVSyncEntityType mVSyncEntityType = this.entityType;
        if (mVSyncEntityType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSyncEntityType);
        }
        n.append(", ");
        n.append("maxVersion:");
        C25541a.m63889t(n, this.maxVersion, ", ", "ids:");
        List<Integer> list = this.ids;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
