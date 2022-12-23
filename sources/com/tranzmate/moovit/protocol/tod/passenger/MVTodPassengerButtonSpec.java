package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVTodPassengerButtonSpec implements TBase<MVTodPassengerButtonSpec, _Fields>, Serializable, Cloneable, Comparable<MVTodPassengerButtonSpec> {

    /* renamed from: b */
    public static final C25113c f29488b = new C25113c("cta", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29489c = new C25113c("icon", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29490d = new C25113c("disabled", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f29491e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29492f;
    private byte __isset_bitfield = 0;
    public String cta;
    public boolean disabled;
    public MVImageReferenceWithParams icon;
    private _Fields[] optionals = {_Fields.ICON, _Fields.DISABLED};

    public enum _Fields implements C25085c {
        CTA(1, "cta"),
        ICON(2, "icon"),
        DISABLED(3, "disabled");
        
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
                return CTA;
            }
            if (i == 2) {
                return ICON;
            }
            if (i != 3) {
                return null;
            }
            return DISABLED;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerButtonSpec$a */
    public static class C11275a extends C25239c<MVTodPassengerButtonSpec> {
        public C11275a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerButtonSpec mVTodPassengerButtonSpec = (MVTodPassengerButtonSpec) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTodPassengerButtonSpec.icon;
            C25113c cVar = MVTodPassengerButtonSpec.f29488b;
            gVar.mo61687K();
            if (mVTodPassengerButtonSpec.cta != null) {
                gVar.mo61711x(MVTodPassengerButtonSpec.f29488b);
                gVar.mo61686J(mVTodPassengerButtonSpec.cta);
                gVar.mo61712y();
            }
            if (mVTodPassengerButtonSpec.icon != null && mVTodPassengerButtonSpec.mo33581h()) {
                gVar.mo61711x(MVTodPassengerButtonSpec.f29489c);
                mVTodPassengerButtonSpec.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodPassengerButtonSpec.mo33580g()) {
                gVar.mo61711x(MVTodPassengerButtonSpec.f29490d);
                gVar.mo61708u(mVTodPassengerButtonSpec.disabled);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerButtonSpec mVTodPassengerButtonSpec = (MVTodPassengerButtonSpec) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTodPassengerButtonSpec.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVTodPassengerButtonSpec.disabled = gVar.mo61690c();
                            mVTodPassengerButtonSpec.mo33583i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVTodPassengerButtonSpec.icon = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodPassengerButtonSpec.cta = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerButtonSpec$b */
    public static class C11276b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11275a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerButtonSpec$c */
    public static class C11277c extends C25240d<MVTodPassengerButtonSpec> {
        public C11277c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerButtonSpec mVTodPassengerButtonSpec = (MVTodPassengerButtonSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodPassengerButtonSpec.mo33579f()) {
                bitSet.set(0);
            }
            if (mVTodPassengerButtonSpec.mo33581h()) {
                bitSet.set(1);
            }
            if (mVTodPassengerButtonSpec.mo33580g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodPassengerButtonSpec.mo33579f()) {
                jVar.mo61686J(mVTodPassengerButtonSpec.cta);
            }
            if (mVTodPassengerButtonSpec.mo33581h()) {
                mVTodPassengerButtonSpec.icon.mo25202X0(jVar);
            }
            if (mVTodPassengerButtonSpec.mo33580g()) {
                jVar.mo61708u(mVTodPassengerButtonSpec.disabled);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerButtonSpec mVTodPassengerButtonSpec = (MVTodPassengerButtonSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodPassengerButtonSpec.cta = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTodPassengerButtonSpec.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTodPassengerButtonSpec.disabled = jVar.mo61690c();
                mVTodPassengerButtonSpec.mo33583i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerButtonSpec$d */
    public static class C11278d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11277c(0);
        }
    }

    static {
        new C17394d0("MVTodPassengerButtonSpec");
        HashMap hashMap = new HashMap();
        f29491e = hashMap;
        hashMap.put(C25239c.class, new C11276b());
        hashMap.put(C25240d.class, new C11278d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CTA, new FieldMetaData("cta", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.DISABLED, new FieldMetaData("disabled", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29492f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodPassengerButtonSpec.class, unmodifiableMap);
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
        ((C25238b) f29491e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29491e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33576a(MVTodPassengerButtonSpec mVTodPassengerButtonSpec) {
        if (mVTodPassengerButtonSpec == null) {
            return false;
        }
        boolean f = mo33579f();
        boolean f2 = mVTodPassengerButtonSpec.mo33579f();
        if ((f || f2) && (!f || !f2 || !this.cta.equals(mVTodPassengerButtonSpec.cta))) {
            return false;
        }
        boolean h = mo33581h();
        boolean h2 = mVTodPassengerButtonSpec.mo33581h();
        if ((h || h2) && (!h || !h2 || !this.icon.mo26245a(mVTodPassengerButtonSpec.icon))) {
            return false;
        }
        boolean g = mo33580g();
        boolean g2 = mVTodPassengerButtonSpec.mo33580g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || this.disabled != mVTodPassengerButtonSpec.disabled) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVTodPassengerButtonSpec mVTodPassengerButtonSpec = (MVTodPassengerButtonSpec) obj;
        if (!getClass().equals(mVTodPassengerButtonSpec.getClass())) {
            return getClass().getName().compareTo(mVTodPassengerButtonSpec.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33579f()).compareTo(Boolean.valueOf(mVTodPassengerButtonSpec.mo33579f()));
        if (compareTo != 0 || ((mo33579f() && (compareTo = this.cta.compareTo(mVTodPassengerButtonSpec.cta)) != 0) || (compareTo = Boolean.valueOf(mo33581h()).compareTo(Boolean.valueOf(mVTodPassengerButtonSpec.mo33581h()))) != 0 || ((mo33581h() && (compareTo = this.icon.compareTo(mVTodPassengerButtonSpec.icon)) != 0) || (compareTo = Boolean.valueOf(mo33580g()).compareTo(Boolean.valueOf(mVTodPassengerButtonSpec.mo33580g()))) != 0))) {
            return compareTo;
        }
        if (!mo33580g() || (l = C25082a.m62848l(this.disabled, mVTodPassengerButtonSpec.disabled)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodPassengerButtonSpec)) {
            return mo33576a((MVTodPassengerButtonSpec) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33579f() {
        return this.cta != null;
    }

    /* renamed from: g */
    public final boolean mo33580g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo33581h() {
        return this.icon != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33583i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodPassengerButtonSpec(", "cta:");
        String str = this.cta;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33581h()) {
            n.append(", ");
            n.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo33580g()) {
            n.append(", ");
            n.append("disabled:");
            n.append(this.disabled);
        }
        n.append(")");
        return n.toString();
    }
}
