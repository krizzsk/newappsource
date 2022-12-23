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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVSyncEntitiesRequest implements TBase<MVSyncEntitiesRequest, _Fields>, Serializable, Cloneable, Comparable<MVSyncEntitiesRequest> {

    /* renamed from: b */
    public static final C25113c f28496b = new C25113c("entitiesToSync", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28497c = new C25113c("resolveReference", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f28498d = new C25113c("source", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f28499e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28500f;
    private byte __isset_bitfield = 0;
    public List<MVSyncEntityRequest> entitiesToSync;
    private _Fields[] optionals = {_Fields.SOURCE};
    public boolean resolveReference = true;
    public String source;

    public enum _Fields implements C25085c {
        ENTITIES_TO_SYNC(1, "entitiesToSync"),
        RESOLVE_REFERENCE(2, "resolveReference"),
        SOURCE(3, "source");
        
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
                return ENTITIES_TO_SYNC;
            }
            if (i == 2) {
                return RESOLVE_REFERENCE;
            }
            if (i != 3) {
                return null;
            }
            return SOURCE;
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

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntitiesRequest$a */
    public static class C10667a extends C25239c<MVSyncEntitiesRequest> {
        public C10667a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntitiesRequest mVSyncEntitiesRequest = (MVSyncEntitiesRequest) tBase;
            mVSyncEntitiesRequest.getClass();
            C25113c cVar = MVSyncEntitiesRequest.f28496b;
            gVar.mo61687K();
            if (mVSyncEntitiesRequest.entitiesToSync != null) {
                gVar.mo61711x(MVSyncEntitiesRequest.f28496b);
                gVar.mo61680D(new C25119e((byte) 12, mVSyncEntitiesRequest.entitiesToSync.size()));
                for (MVSyncEntityRequest X0 : mVSyncEntitiesRequest.entitiesToSync) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSyncEntitiesRequest.f28497c);
            gVar.mo61708u(mVSyncEntitiesRequest.resolveReference);
            gVar.mo61712y();
            if (mVSyncEntitiesRequest.source != null && mVSyncEntitiesRequest.mo32042h()) {
                gVar.mo61711x(MVSyncEntitiesRequest.f28498d);
                gVar.mo61686J(mVSyncEntitiesRequest.source);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntitiesRequest mVSyncEntitiesRequest = (MVSyncEntitiesRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSyncEntitiesRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVSyncEntitiesRequest.source = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVSyncEntitiesRequest.resolveReference = gVar.mo61690c();
                        mVSyncEntitiesRequest.mo32044i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVSyncEntitiesRequest.entitiesToSync = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVSyncEntityRequest mVSyncEntityRequest = new MVSyncEntityRequest();
                        mVSyncEntityRequest.mo25201C1(gVar);
                        mVSyncEntitiesRequest.entitiesToSync.add(mVSyncEntityRequest);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntitiesRequest$b */
    public static class C10668b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10667a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntitiesRequest$c */
    public static class C10669c extends C25240d<MVSyncEntitiesRequest> {
        public C10669c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntitiesRequest mVSyncEntitiesRequest = (MVSyncEntitiesRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSyncEntitiesRequest.mo32040f()) {
                bitSet.set(0);
            }
            if (mVSyncEntitiesRequest.mo32041g()) {
                bitSet.set(1);
            }
            if (mVSyncEntitiesRequest.mo32042h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSyncEntitiesRequest.mo32040f()) {
                jVar.mo61678B(mVSyncEntitiesRequest.entitiesToSync.size());
                for (MVSyncEntityRequest X0 : mVSyncEntitiesRequest.entitiesToSync) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSyncEntitiesRequest.mo32041g()) {
                jVar.mo61708u(mVSyncEntitiesRequest.resolveReference);
            }
            if (mVSyncEntitiesRequest.mo32042h()) {
                jVar.mo61686J(mVSyncEntitiesRequest.source);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntitiesRequest mVSyncEntitiesRequest = (MVSyncEntitiesRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVSyncEntitiesRequest.entitiesToSync = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSyncEntityRequest mVSyncEntityRequest = new MVSyncEntityRequest();
                    mVSyncEntityRequest.mo25201C1(jVar);
                    mVSyncEntitiesRequest.entitiesToSync.add(mVSyncEntityRequest);
                }
            }
            if (T.get(1)) {
                mVSyncEntitiesRequest.resolveReference = jVar.mo61690c();
                mVSyncEntitiesRequest.mo32044i();
            }
            if (T.get(2)) {
                mVSyncEntitiesRequest.source = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntitiesRequest$d */
    public static class C10670d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10669c(0);
        }
    }

    static {
        new C17394d0("MVSyncEntitiesRequest");
        HashMap hashMap = new HashMap();
        f28499e = hashMap;
        hashMap.put(C25239c.class, new C10668b());
        hashMap.put(C25240d.class, new C10670d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENTITIES_TO_SYNC, new FieldMetaData("entitiesToSync", (byte) 3, new ListMetaData(new StructMetaData(MVSyncEntityRequest.class))));
        enumMap.put(_Fields.RESOLVE_REFERENCE, new FieldMetaData("resolveReference", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SOURCE, new FieldMetaData("source", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28500f = unmodifiableMap;
        FieldMetaData.m61947a(MVSyncEntitiesRequest.class, unmodifiableMap);
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
        ((C25238b) f28499e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28499e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSyncEntitiesRequest mVSyncEntitiesRequest = (MVSyncEntitiesRequest) obj;
        if (!getClass().equals(mVSyncEntitiesRequest.getClass())) {
            return getClass().getName().compareTo(mVSyncEntitiesRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32040f()).compareTo(Boolean.valueOf(mVSyncEntitiesRequest.mo32040f()));
        if (compareTo2 != 0 || ((mo32040f() && (compareTo2 = C25082a.m62844h(this.entitiesToSync, mVSyncEntitiesRequest.entitiesToSync)) != 0) || (compareTo2 = Boolean.valueOf(mo32041g()).compareTo(Boolean.valueOf(mVSyncEntitiesRequest.mo32041g()))) != 0 || ((mo32041g() && (compareTo2 = C25082a.m62848l(this.resolveReference, mVSyncEntitiesRequest.resolveReference)) != 0) || (compareTo2 = Boolean.valueOf(mo32042h()).compareTo(Boolean.valueOf(mVSyncEntitiesRequest.mo32042h()))) != 0))) {
            return compareTo2;
        }
        if (!mo32042h() || (compareTo = this.source.compareTo(mVSyncEntitiesRequest.source)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSyncEntitiesRequest)) {
            return false;
        }
        MVSyncEntitiesRequest mVSyncEntitiesRequest = (MVSyncEntitiesRequest) obj;
        boolean f = mo32040f();
        boolean f2 = mVSyncEntitiesRequest.mo32040f();
        if (((f || f2) && (!f || !f2 || !this.entitiesToSync.equals(mVSyncEntitiesRequest.entitiesToSync))) || this.resolveReference != mVSyncEntitiesRequest.resolveReference) {
            return false;
        }
        boolean h = mo32042h();
        boolean h2 = mVSyncEntitiesRequest.mo32042h();
        if ((h || h2) && (!h || !h2 || !this.source.equals(mVSyncEntitiesRequest.source))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32040f() {
        return this.entitiesToSync != null;
    }

    /* renamed from: g */
    public final boolean mo32041g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo32042h() {
        return this.source != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo32044i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSyncEntitiesRequest(", "entitiesToSync:");
        List<MVSyncEntityRequest> list = this.entitiesToSync;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("resolveReference:");
        n.append(this.resolveReference);
        if (mo32042h()) {
            n.append(", ");
            n.append("source:");
            String str = this.source;
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
