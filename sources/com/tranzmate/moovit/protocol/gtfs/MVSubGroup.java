package com.tranzmate.moovit.protocol.gtfs;

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

public class MVSubGroup implements TBase<MVSubGroup, _Fields>, Serializable, Cloneable, Comparable<MVSubGroup> {

    /* renamed from: b */
    public static final C25113c f25810b = new C25113c("subGroupId", (byte) 3, 1);

    /* renamed from: c */
    public static final C25113c f25811c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f25812d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25813e;
    private byte __isset_bitfield = 0;
    public String name;
    public byte subGroupId;

    public enum _Fields implements C25085c {
        SUB_GROUP_ID(1, "subGroupId"),
        NAME(2, "name");
        
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
                return SUB_GROUP_ID;
            }
            if (i != 2) {
                return null;
            }
            return NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSubGroup$a */
    public static class C8835a extends C25239c<MVSubGroup> {
        public C8835a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSubGroup mVSubGroup = (MVSubGroup) tBase;
            mVSubGroup.getClass();
            C25113c cVar = MVSubGroup.f25810b;
            gVar.mo61687K();
            gVar.mo61711x(MVSubGroup.f25810b);
            gVar.mo61709v(mVSubGroup.subGroupId);
            gVar.mo61712y();
            if (mVSubGroup.name != null) {
                gVar.mo61711x(MVSubGroup.f25811c);
                gVar.mo61686J(mVSubGroup.name);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSubGroup mVSubGroup = (MVSubGroup) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSubGroup.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVSubGroup.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 3) {
                    mVSubGroup.subGroupId = gVar.mo61691d();
                    mVSubGroup.mo27531h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSubGroup$b */
    public static class C8836b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8835a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSubGroup$c */
    public static class C8837c extends C25240d<MVSubGroup> {
        public C8837c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSubGroup mVSubGroup = (MVSubGroup) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSubGroup.mo27530g()) {
                bitSet.set(0);
            }
            if (mVSubGroup.mo27529f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSubGroup.mo27530g()) {
                jVar.mo61716P(mVSubGroup.subGroupId);
            }
            if (mVSubGroup.mo27529f()) {
                jVar.mo61686J(mVSubGroup.name);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSubGroup mVSubGroup = (MVSubGroup) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVSubGroup.subGroupId = jVar.mo61691d();
                mVSubGroup.mo27531h();
            }
            if (T.get(1)) {
                mVSubGroup.name = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVSubGroup$d */
    public static class C8838d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8837c(0);
        }
    }

    static {
        new C17394d0("MVSubGroup");
        HashMap hashMap = new HashMap();
        f25812d = hashMap;
        hashMap.put(C25239c.class, new C8836b());
        hashMap.put(C25240d.class, new C8838d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUB_GROUP_ID, new FieldMetaData("subGroupId", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25813e = unmodifiableMap;
        FieldMetaData.m61947a(MVSubGroup.class, unmodifiableMap);
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
        ((C25238b) f25812d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25812d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo27526a(MVSubGroup mVSubGroup) {
        if (mVSubGroup == null || this.subGroupId != mVSubGroup.subGroupId) {
            return false;
        }
        boolean f = mo27529f();
        boolean f2 = mVSubGroup.mo27529f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.name.equals(mVSubGroup.name)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSubGroup mVSubGroup = (MVSubGroup) obj;
        if (!getClass().equals(mVSubGroup.getClass())) {
            return getClass().getName().compareTo(mVSubGroup.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27530g()).compareTo(Boolean.valueOf(mVSubGroup.mo27530g()));
        if (compareTo2 != 0 || ((mo27530g() && (compareTo2 = C25082a.m62837a(this.subGroupId, mVSubGroup.subGroupId)) != 0) || (compareTo2 = Boolean.valueOf(mo27529f()).compareTo(Boolean.valueOf(mVSubGroup.mo27529f()))) != 0)) {
            return compareTo2;
        }
        if (!mo27529f() || (compareTo = this.name.compareTo(mVSubGroup.name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVSubGroup)) {
            return mo27526a((MVSubGroup) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27529f() {
        return this.name != null;
    }

    /* renamed from: g */
    public final boolean mo27530g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo27531h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSubGroup(", "subGroupId:");
        C0016g.m42z(n, this.subGroupId, ", ", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
