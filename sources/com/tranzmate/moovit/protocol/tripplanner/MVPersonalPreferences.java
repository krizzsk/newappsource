package com.tranzmate.moovit.protocol.tripplanner;

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

public class MVPersonalPreferences implements TBase<MVPersonalPreferences, _Fields>, Serializable, Cloneable, Comparable<MVPersonalPreferences> {

    /* renamed from: b */
    public static final C25113c f30026b = new C25113c("isSlowWalking", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f30027c = new C25113c("maxWalkingMinutes", (byte) 6, 2);

    /* renamed from: d */
    public static final C25113c f30028d = new C25113c("isAccessibleRoutes", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f30029e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30030f;
    private byte __isset_bitfield = 0;
    public boolean isAccessibleRoutes;
    public boolean isSlowWalking;
    public short maxWalkingMinutes;
    private _Fields[] optionals = {_Fields.IS_SLOW_WALKING, _Fields.MAX_WALKING_MINUTES, _Fields.IS_ACCESSIBLE_ROUTES};

    public enum _Fields implements C25085c {
        IS_SLOW_WALKING(1, "isSlowWalking"),
        MAX_WALKING_MINUTES(2, "maxWalkingMinutes"),
        IS_ACCESSIBLE_ROUTES(3, "isAccessibleRoutes");
        
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
                return IS_SLOW_WALKING;
            }
            if (i == 2) {
                return MAX_WALKING_MINUTES;
            }
            if (i != 3) {
                return null;
            }
            return IS_ACCESSIBLE_ROUTES;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPersonalPreferences$a */
    public static class C11606a extends C25239c<MVPersonalPreferences> {
        public C11606a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPersonalPreferences mVPersonalPreferences = (MVPersonalPreferences) tBase;
            mVPersonalPreferences.getClass();
            C25113c cVar = MVPersonalPreferences.f30026b;
            gVar.mo61687K();
            if (mVPersonalPreferences.mo34494g()) {
                gVar.mo61711x(MVPersonalPreferences.f30026b);
                gVar.mo61708u(mVPersonalPreferences.isSlowWalking);
                gVar.mo61712y();
            }
            if (mVPersonalPreferences.mo34495h()) {
                gVar.mo61711x(MVPersonalPreferences.f30027c);
                gVar.mo61677A(mVPersonalPreferences.maxWalkingMinutes);
                gVar.mo61712y();
            }
            if (mVPersonalPreferences.mo34493f()) {
                gVar.mo61711x(MVPersonalPreferences.f30028d);
                gVar.mo61708u(mVPersonalPreferences.isAccessibleRoutes);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPersonalPreferences mVPersonalPreferences = (MVPersonalPreferences) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPersonalPreferences.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVPersonalPreferences.isAccessibleRoutes = gVar.mo61690c();
                            mVPersonalPreferences.mo34497i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 6) {
                        mVPersonalPreferences.maxWalkingMinutes = gVar.mo61695h();
                        mVPersonalPreferences.mo34499k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVPersonalPreferences.isSlowWalking = gVar.mo61690c();
                    mVPersonalPreferences.mo34498j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPersonalPreferences$b */
    public static class C11607b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11606a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPersonalPreferences$c */
    public static class C11608c extends C25240d<MVPersonalPreferences> {
        public C11608c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPersonalPreferences mVPersonalPreferences = (MVPersonalPreferences) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPersonalPreferences.mo34494g()) {
                bitSet.set(0);
            }
            if (mVPersonalPreferences.mo34495h()) {
                bitSet.set(1);
            }
            if (mVPersonalPreferences.mo34493f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPersonalPreferences.mo34494g()) {
                jVar.mo61708u(mVPersonalPreferences.isSlowWalking);
            }
            if (mVPersonalPreferences.mo34495h()) {
                jVar.mo61677A(mVPersonalPreferences.maxWalkingMinutes);
            }
            if (mVPersonalPreferences.mo34493f()) {
                jVar.mo61708u(mVPersonalPreferences.isAccessibleRoutes);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPersonalPreferences mVPersonalPreferences = (MVPersonalPreferences) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPersonalPreferences.isSlowWalking = jVar.mo61690c();
                mVPersonalPreferences.mo34498j();
            }
            if (T.get(1)) {
                mVPersonalPreferences.maxWalkingMinutes = jVar.mo61695h();
                mVPersonalPreferences.mo34499k();
            }
            if (T.get(2)) {
                mVPersonalPreferences.isAccessibleRoutes = jVar.mo61690c();
                mVPersonalPreferences.mo34497i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPersonalPreferences$d */
    public static class C11609d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11608c(0);
        }
    }

    static {
        new C17394d0("MVPersonalPreferences");
        HashMap hashMap = new HashMap();
        f30029e = hashMap;
        hashMap.put(C25239c.class, new C11607b());
        hashMap.put(C25240d.class, new C11609d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_SLOW_WALKING, new FieldMetaData("isSlowWalking", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MAX_WALKING_MINUTES, new FieldMetaData("maxWalkingMinutes", (byte) 2, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.IS_ACCESSIBLE_ROUTES, new FieldMetaData("isAccessibleRoutes", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30030f = unmodifiableMap;
        FieldMetaData.m61947a(MVPersonalPreferences.class, unmodifiableMap);
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
        ((C25238b) f30029e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30029e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34490a(MVPersonalPreferences mVPersonalPreferences) {
        if (mVPersonalPreferences == null) {
            return false;
        }
        boolean g = mo34494g();
        boolean g2 = mVPersonalPreferences.mo34494g();
        if ((g || g2) && (!g || !g2 || this.isSlowWalking != mVPersonalPreferences.isSlowWalking)) {
            return false;
        }
        boolean h = mo34495h();
        boolean h2 = mVPersonalPreferences.mo34495h();
        if ((h || h2) && (!h || !h2 || this.maxWalkingMinutes != mVPersonalPreferences.maxWalkingMinutes)) {
            return false;
        }
        boolean f = mo34493f();
        boolean f2 = mVPersonalPreferences.mo34493f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || this.isAccessibleRoutes != mVPersonalPreferences.isAccessibleRoutes) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVPersonalPreferences mVPersonalPreferences = (MVPersonalPreferences) obj;
        if (!getClass().equals(mVPersonalPreferences.getClass())) {
            return getClass().getName().compareTo(mVPersonalPreferences.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34494g()).compareTo(Boolean.valueOf(mVPersonalPreferences.mo34494g()));
        if (compareTo != 0 || ((mo34494g() && (compareTo = C25082a.m62848l(this.isSlowWalking, mVPersonalPreferences.isSlowWalking)) != 0) || (compareTo = Boolean.valueOf(mo34495h()).compareTo(Boolean.valueOf(mVPersonalPreferences.mo34495h()))) != 0 || ((mo34495h() && (compareTo = C25082a.m62847k(this.maxWalkingMinutes, mVPersonalPreferences.maxWalkingMinutes)) != 0) || (compareTo = Boolean.valueOf(mo34493f()).compareTo(Boolean.valueOf(mVPersonalPreferences.mo34493f()))) != 0))) {
            return compareTo;
        }
        if (!mo34493f() || (l = C25082a.m62848l(this.isAccessibleRoutes, mVPersonalPreferences.isAccessibleRoutes)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPersonalPreferences)) {
            return mo34490a((MVPersonalPreferences) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34493f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo34494g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo34495h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo34497i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: j */
    public final void mo34498j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo34499k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPersonalPreferences(");
        boolean z2 = false;
        if (mo34494g()) {
            sb.append("isSlowWalking:");
            sb.append(this.isSlowWalking);
            z = false;
        } else {
            z = true;
        }
        if (mo34495h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("maxWalkingMinutes:");
            sb.append(this.maxWalkingMinutes);
        } else {
            z2 = z;
        }
        if (mo34493f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("isAccessibleRoutes:");
            sb.append(this.isAccessibleRoutes);
        }
        sb.append(")");
        return sb.toString();
    }
}
