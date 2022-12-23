package com.tranzmate.moovit.protocol.common;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVEntityIdentifier implements TBase<MVEntityIdentifier, _Fields>, Serializable, Cloneable, Comparable<MVEntityIdentifier> {

    /* renamed from: b */
    public static final C25113c f24999b = new C25113c("entityType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25000c = new C25113c("id", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f25001d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25002e;
    private byte __isset_bitfield;
    public MVEntityType entityType;

    /* renamed from: id */
    public int f25003id;

    public enum _Fields implements C25085c {
        ENTITY_TYPE(1, "entityType"),
        ID(2, "id");
        
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
            if (i != 2) {
                return null;
            }
            return ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVEntityIdentifier$a */
    public static class C8392a extends C25239c<MVEntityIdentifier> {
        public C8392a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEntityIdentifier mVEntityIdentifier = (MVEntityIdentifier) tBase;
            mVEntityIdentifier.getClass();
            C25113c cVar = MVEntityIdentifier.f24999b;
            gVar.mo61687K();
            if (mVEntityIdentifier.entityType != null) {
                gVar.mo61711x(MVEntityIdentifier.f24999b);
                gVar.mo61678B(mVEntityIdentifier.entityType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVEntityIdentifier.f25000c);
            C16530d.m42020n(gVar, mVEntityIdentifier.f25003id);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEntityIdentifier mVEntityIdentifier = (MVEntityIdentifier) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVEntityIdentifier.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVEntityIdentifier.f25003id = gVar.mo61696i();
                        mVEntityIdentifier.mo26141h(true);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVEntityIdentifier.entityType = MVEntityType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVEntityIdentifier$b */
    public static class C8393b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8392a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVEntityIdentifier$c */
    public static class C8394c extends C25240d<MVEntityIdentifier> {
        public C8394c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEntityIdentifier mVEntityIdentifier = (MVEntityIdentifier) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEntityIdentifier.mo26139f()) {
                bitSet.set(0);
            }
            if (mVEntityIdentifier.mo26140g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVEntityIdentifier.mo26139f()) {
                jVar.mo61678B(mVEntityIdentifier.entityType.getValue());
            }
            if (mVEntityIdentifier.mo26140g()) {
                jVar.mo61678B(mVEntityIdentifier.f25003id);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEntityIdentifier mVEntityIdentifier = (MVEntityIdentifier) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVEntityIdentifier.entityType = MVEntityType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVEntityIdentifier.f25003id = jVar.mo61696i();
                mVEntityIdentifier.mo26141h(true);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVEntityIdentifier$d */
    public static class C8395d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8394c(0);
        }
    }

    static {
        new C17394d0("MVEntityIdentifier");
        HashMap hashMap = new HashMap();
        f25001d = hashMap;
        hashMap.put(C25239c.class, new C8393b());
        hashMap.put(C25240d.class, new C8395d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENTITY_TYPE, new FieldMetaData("entityType", (byte) 3, new EnumMetaData(MVEntityType.class)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25002e = unmodifiableMap;
        FieldMetaData.m61947a(MVEntityIdentifier.class, unmodifiableMap);
    }

    public MVEntityIdentifier() {
        this.__isset_bitfield = 0;
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
        ((C25238b) f25001d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25001d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26136a(MVEntityIdentifier mVEntityIdentifier) {
        if (mVEntityIdentifier == null) {
            return false;
        }
        boolean f = mo26139f();
        boolean f2 = mVEntityIdentifier.mo26139f();
        if (((f || f2) && (!f || !f2 || !this.entityType.equals(mVEntityIdentifier.entityType))) || this.f25003id != mVEntityIdentifier.f25003id) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVEntityIdentifier mVEntityIdentifier = (MVEntityIdentifier) obj;
        if (!getClass().equals(mVEntityIdentifier.getClass())) {
            return getClass().getName().compareTo(mVEntityIdentifier.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26139f()).compareTo(Boolean.valueOf(mVEntityIdentifier.mo26139f()));
        if (compareTo != 0 || ((mo26139f() && (compareTo = this.entityType.compareTo(mVEntityIdentifier.entityType)) != 0) || (compareTo = Boolean.valueOf(mo26140g()).compareTo(Boolean.valueOf(mVEntityIdentifier.mo26140g()))) != 0)) {
            return compareTo;
        }
        if (!mo26140g() || (c = C25082a.m62839c(this.f25003id, mVEntityIdentifier.f25003id)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVEntityIdentifier)) {
            return mo26136a((MVEntityIdentifier) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26139f() {
        return this.entityType != null;
    }

    /* renamed from: g */
    public final boolean mo26140g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo26141h(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVEntityIdentifier(", "entityType:");
        MVEntityType mVEntityType = this.entityType;
        if (mVEntityType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVEntityType);
        }
        n.append(", ");
        n.append("id:");
        return C13437d.m33707l(n, this.f25003id, ")");
    }

    public MVEntityIdentifier(MVEntityType mVEntityType, int i) {
        this();
        this.entityType = mVEntityType;
        this.f25003id = i;
        mo26141h(true);
    }
}
