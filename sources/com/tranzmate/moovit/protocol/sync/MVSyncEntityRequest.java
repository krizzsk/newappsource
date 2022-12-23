package com.tranzmate.moovit.protocol.sync;

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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.SetMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25123i;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVSyncEntityRequest implements TBase<MVSyncEntityRequest, _Fields>, Serializable, Cloneable, Comparable<MVSyncEntityRequest> {

    /* renamed from: b */
    public static final C25113c f28501b = new C25113c("syncEntityType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28502c = new C25113c("ids", (byte) 14, 2);

    /* renamed from: d */
    public static final HashMap f28503d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28504e;
    public Set<Integer> ids;
    private _Fields[] optionals = {_Fields.IDS};
    public MVSyncEntityType syncEntityType;

    public enum _Fields implements C25085c {
        SYNC_ENTITY_TYPE(1, "syncEntityType"),
        IDS(2, "ids");
        
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
                return SYNC_ENTITY_TYPE;
            }
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntityRequest$a */
    public static class C10671a extends C25239c<MVSyncEntityRequest> {
        public C10671a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntityRequest mVSyncEntityRequest = (MVSyncEntityRequest) tBase;
            mVSyncEntityRequest.getClass();
            C25113c cVar = MVSyncEntityRequest.f28501b;
            gVar.mo61687K();
            if (mVSyncEntityRequest.syncEntityType != null) {
                gVar.mo61711x(MVSyncEntityRequest.f28501b);
                gVar.mo61678B(mVSyncEntityRequest.syncEntityType.getValue());
                gVar.mo61712y();
            }
            if (mVSyncEntityRequest.ids != null && mVSyncEntityRequest.mo32049f()) {
                gVar.mo61711x(MVSyncEntityRequest.f28502c);
                gVar.mo61684H(new C25123i((byte) 8, mVSyncEntityRequest.ids.size()));
                for (Integer intValue : mVSyncEntityRequest.ids) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61685I();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntityRequest mVSyncEntityRequest = (MVSyncEntityRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSyncEntityRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 14) {
                        C25123i o = gVar.mo61702o();
                        mVSyncEntityRequest.ids = new HashSet(o.f63401b * 2);
                        for (int i = 0; i < o.f63401b; i++) {
                            mVSyncEntityRequest.ids.add(Integer.valueOf(gVar.mo61696i()));
                        }
                        gVar.mo61703p();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSyncEntityRequest.syncEntityType = MVSyncEntityType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntityRequest$b */
    public static class C10672b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10671a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntityRequest$c */
    public static class C10673c extends C25240d<MVSyncEntityRequest> {
        public C10673c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntityRequest mVSyncEntityRequest = (MVSyncEntityRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSyncEntityRequest.mo32050g()) {
                bitSet.set(0);
            }
            if (mVSyncEntityRequest.mo32049f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSyncEntityRequest.mo32050g()) {
                jVar.mo61678B(mVSyncEntityRequest.syncEntityType.getValue());
            }
            if (mVSyncEntityRequest.mo32049f()) {
                jVar.mo61678B(mVSyncEntityRequest.ids.size());
                for (Integer intValue : mVSyncEntityRequest.ids) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntityRequest mVSyncEntityRequest = (MVSyncEntityRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVSyncEntityRequest.syncEntityType = MVSyncEntityType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVSyncEntityRequest.ids = new HashSet(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVSyncEntityRequest.ids.add(Integer.valueOf(jVar.mo61696i()));
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntityRequest$d */
    public static class C10674d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10673c(0);
        }
    }

    static {
        new C17394d0("MVSyncEntityRequest");
        HashMap hashMap = new HashMap();
        f28503d = hashMap;
        hashMap.put(C25239c.class, new C10672b());
        hashMap.put(C25240d.class, new C10674d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SYNC_ENTITY_TYPE, new FieldMetaData("syncEntityType", (byte) 3, new EnumMetaData(MVSyncEntityType.class)));
        enumMap.put(_Fields.IDS, new FieldMetaData("ids", (byte) 2, new SetMetaData(new FieldValueMetaData((byte) 8, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28504e = unmodifiableMap;
        FieldMetaData.m61947a(MVSyncEntityRequest.class, unmodifiableMap);
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
        ((C25238b) f28503d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28503d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int j;
        MVSyncEntityRequest mVSyncEntityRequest = (MVSyncEntityRequest) obj;
        if (!getClass().equals(mVSyncEntityRequest.getClass())) {
            return getClass().getName().compareTo(mVSyncEntityRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32050g()).compareTo(Boolean.valueOf(mVSyncEntityRequest.mo32050g()));
        if (compareTo != 0 || ((mo32050g() && (compareTo = this.syncEntityType.compareTo(mVSyncEntityRequest.syncEntityType)) != 0) || (compareTo = Boolean.valueOf(mo32049f()).compareTo(Boolean.valueOf(mVSyncEntityRequest.mo32049f()))) != 0)) {
            return compareTo;
        }
        if (!mo32049f() || (j = C25082a.m62846j(this.ids, mVSyncEntityRequest.ids)) == 0) {
            return 0;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSyncEntityRequest)) {
            return false;
        }
        MVSyncEntityRequest mVSyncEntityRequest = (MVSyncEntityRequest) obj;
        boolean g = mo32050g();
        boolean g2 = mVSyncEntityRequest.mo32050g();
        if ((g || g2) && (!g || !g2 || !this.syncEntityType.equals(mVSyncEntityRequest.syncEntityType))) {
            return false;
        }
        boolean f = mo32049f();
        boolean f2 = mVSyncEntityRequest.mo32049f();
        if ((f || f2) && (!f || !f2 || !this.ids.equals(mVSyncEntityRequest.ids))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32049f() {
        return this.ids != null;
    }

    /* renamed from: g */
    public final boolean mo32050g() {
        return this.syncEntityType != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSyncEntityRequest(", "syncEntityType:");
        MVSyncEntityType mVSyncEntityType = this.syncEntityType;
        if (mVSyncEntityType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSyncEntityType);
        }
        if (mo32049f()) {
            n.append(", ");
            n.append("ids:");
            Set<Integer> set = this.ids;
            if (set == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(set);
            }
        }
        n.append(")");
        return n.toString();
    }
}
