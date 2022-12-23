package com.tranzmate.moovit.protocol.payments;

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

public class MVProfilesInstructions implements TBase<MVProfilesInstructions, _Fields>, Serializable, Cloneable, Comparable<MVProfilesInstructions> {

    /* renamed from: b */
    public static final C25113c f27657b = new C25113c("profiles", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f27658c = new C25113c("maxProfilesSelection", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f27659d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27660e;
    private byte __isset_bitfield = 0;
    public int maxProfilesSelection;
    public List<MVProfileSpec> profiles;

    public enum _Fields implements C25085c {
        PROFILES(1, "profiles"),
        MAX_PROFILES_SELECTION(2, "maxProfilesSelection");
        
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
                return PROFILES;
            }
            if (i != 2) {
                return null;
            }
            return MAX_PROFILES_SELECTION;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVProfilesInstructions$a */
    public static class C10033a extends C25239c<MVProfilesInstructions> {
        public C10033a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfilesInstructions mVProfilesInstructions = (MVProfilesInstructions) tBase;
            mVProfilesInstructions.getClass();
            C25113c cVar = MVProfilesInstructions.f27657b;
            gVar.mo61687K();
            if (mVProfilesInstructions.profiles != null) {
                gVar.mo61711x(MVProfilesInstructions.f27657b);
                gVar.mo61680D(new C25119e((byte) 12, mVProfilesInstructions.profiles.size()));
                for (MVProfileSpec X0 : mVProfilesInstructions.profiles) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVProfilesInstructions.f27658c);
            C16530d.m42020n(gVar, mVProfilesInstructions.maxProfilesSelection);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfilesInstructions mVProfilesInstructions = (MVProfilesInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVProfilesInstructions.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVProfilesInstructions.maxProfilesSelection = gVar.mo61696i();
                        mVProfilesInstructions.mo30522h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVProfilesInstructions.profiles = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVProfileSpec mVProfileSpec = new MVProfileSpec();
                        mVProfileSpec.mo25201C1(gVar);
                        mVProfilesInstructions.profiles.add(mVProfileSpec);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVProfilesInstructions$b */
    public static class C10034b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10033a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVProfilesInstructions$c */
    public static class C10035c extends C25240d<MVProfilesInstructions> {
        public C10035c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfilesInstructions mVProfilesInstructions = (MVProfilesInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVProfilesInstructions.mo30521g()) {
                bitSet.set(0);
            }
            if (mVProfilesInstructions.mo30520f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVProfilesInstructions.mo30521g()) {
                jVar.mo61678B(mVProfilesInstructions.profiles.size());
                for (MVProfileSpec X0 : mVProfilesInstructions.profiles) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVProfilesInstructions.mo30520f()) {
                jVar.mo61678B(mVProfilesInstructions.maxProfilesSelection);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfilesInstructions mVProfilesInstructions = (MVProfilesInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVProfilesInstructions.profiles = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVProfileSpec mVProfileSpec = new MVProfileSpec();
                    mVProfileSpec.mo25201C1(jVar);
                    mVProfilesInstructions.profiles.add(mVProfileSpec);
                }
            }
            if (T.get(1)) {
                mVProfilesInstructions.maxProfilesSelection = jVar.mo61696i();
                mVProfilesInstructions.mo30522h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVProfilesInstructions$d */
    public static class C10036d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10035c(0);
        }
    }

    static {
        new C17394d0("MVProfilesInstructions");
        HashMap hashMap = new HashMap();
        f27659d = hashMap;
        hashMap.put(C25239c.class, new C10034b());
        hashMap.put(C25240d.class, new C10036d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROFILES, new FieldMetaData("profiles", (byte) 3, new ListMetaData(new StructMetaData(MVProfileSpec.class))));
        enumMap.put(_Fields.MAX_PROFILES_SELECTION, new FieldMetaData("maxProfilesSelection", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27660e = unmodifiableMap;
        FieldMetaData.m61947a(MVProfilesInstructions.class, unmodifiableMap);
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
        ((C25238b) f27659d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27659d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30517a(MVProfilesInstructions mVProfilesInstructions) {
        if (mVProfilesInstructions == null) {
            return false;
        }
        boolean g = mo30521g();
        boolean g2 = mVProfilesInstructions.mo30521g();
        if (((g || g2) && (!g || !g2 || !this.profiles.equals(mVProfilesInstructions.profiles))) || this.maxProfilesSelection != mVProfilesInstructions.maxProfilesSelection) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVProfilesInstructions mVProfilesInstructions = (MVProfilesInstructions) obj;
        if (!getClass().equals(mVProfilesInstructions.getClass())) {
            return getClass().getName().compareTo(mVProfilesInstructions.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30521g()).compareTo(Boolean.valueOf(mVProfilesInstructions.mo30521g()));
        if (compareTo != 0 || ((mo30521g() && (compareTo = C25082a.m62844h(this.profiles, mVProfilesInstructions.profiles)) != 0) || (compareTo = Boolean.valueOf(mo30520f()).compareTo(Boolean.valueOf(mVProfilesInstructions.mo30520f()))) != 0)) {
            return compareTo;
        }
        if (!mo30520f() || (c = C25082a.m62839c(this.maxProfilesSelection, mVProfilesInstructions.maxProfilesSelection)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVProfilesInstructions)) {
            return mo30517a((MVProfilesInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30520f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30521g() {
        return this.profiles != null;
    }

    /* renamed from: h */
    public final void mo30522h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVProfilesInstructions(", "profiles:");
        List<MVProfileSpec> list = this.profiles;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("maxProfilesSelection:");
        return C13437d.m33707l(n, this.maxProfilesSelection, ")");
    }
}
