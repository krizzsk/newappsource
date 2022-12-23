package com.tranzmate.moovit.protocol.taxi;

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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0017h;
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

public class MVTaxiFabConfig implements TBase<MVTaxiFabConfig, _Fields>, Serializable, Cloneable, Comparable<MVTaxiFabConfig> {

    /* renamed from: b */
    public static final C25113c f28553b = new C25113c("primary", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28554c = new C25113c("secondary", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28555d = new C25113c("promo", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28556e = new C25113c("shouldRequestEta", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f28557f = new C25113c("alwaysShowFab", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f28558g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28559h;
    private byte __isset_bitfield = 0;
    public boolean alwaysShowFab;
    public MVTaxiFabPresentation primary;
    public MVTaxiFabPresentation promo;
    public MVTaxiFabPresentation secondary;
    public boolean shouldRequestEta;

    public enum _Fields implements C25085c {
        PRIMARY(1, "primary"),
        SECONDARY(2, "secondary"),
        PROMO(3, "promo"),
        SHOULD_REQUEST_ETA(4, "shouldRequestEta"),
        ALWAYS_SHOW_FAB(5, "alwaysShowFab");
        
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
                return PRIMARY;
            }
            if (i == 2) {
                return SECONDARY;
            }
            if (i == 3) {
                return PROMO;
            }
            if (i == 4) {
                return SHOULD_REQUEST_ETA;
            }
            if (i != 5) {
                return null;
            }
            return ALWAYS_SHOW_FAB;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiFabConfig$a */
    public static class C10704a extends C25239c<MVTaxiFabConfig> {
        public C10704a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiFabConfig mVTaxiFabConfig = (MVTaxiFabConfig) tBase;
            mVTaxiFabConfig.getClass();
            C25113c cVar = MVTaxiFabConfig.f28553b;
            gVar.mo61687K();
            if (mVTaxiFabConfig.primary != null) {
                gVar.mo61711x(MVTaxiFabConfig.f28553b);
                mVTaxiFabConfig.primary.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiFabConfig.secondary != null) {
                gVar.mo61711x(MVTaxiFabConfig.f28554c);
                mVTaxiFabConfig.secondary.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiFabConfig.promo != null) {
                gVar.mo61711x(MVTaxiFabConfig.f28555d);
                mVTaxiFabConfig.promo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTaxiFabConfig.f28556e);
            gVar.mo61708u(mVTaxiFabConfig.shouldRequestEta);
            gVar.mo61712y();
            gVar.mo61711x(MVTaxiFabConfig.f28557f);
            C0017h.m62S(gVar, mVTaxiFabConfig.alwaysShowFab);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiFabConfig mVTaxiFabConfig = (MVTaxiFabConfig) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTaxiFabConfig.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 2) {
                                    mVTaxiFabConfig.alwaysShowFab = gVar.mo61690c();
                                    mVTaxiFabConfig.mo32129k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 2) {
                                mVTaxiFabConfig.shouldRequestEta = gVar.mo61690c();
                                mVTaxiFabConfig.mo32130l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTaxiFabPresentation mVTaxiFabPresentation = new MVTaxiFabPresentation();
                            mVTaxiFabConfig.promo = mVTaxiFabPresentation;
                            mVTaxiFabPresentation.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTaxiFabPresentation mVTaxiFabPresentation2 = new MVTaxiFabPresentation();
                        mVTaxiFabConfig.secondary = mVTaxiFabPresentation2;
                        mVTaxiFabPresentation2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTaxiFabPresentation mVTaxiFabPresentation3 = new MVTaxiFabPresentation();
                    mVTaxiFabConfig.primary = mVTaxiFabPresentation3;
                    mVTaxiFabPresentation3.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiFabConfig$b */
    public static class C10705b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10704a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiFabConfig$c */
    public static class C10706c extends C25240d<MVTaxiFabConfig> {
        public C10706c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiFabConfig mVTaxiFabConfig = (MVTaxiFabConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiFabConfig.mo32124g()) {
                bitSet.set(0);
            }
            if (mVTaxiFabConfig.mo32127i()) {
                bitSet.set(1);
            }
            if (mVTaxiFabConfig.mo32125h()) {
                bitSet.set(2);
            }
            if (mVTaxiFabConfig.mo32128j()) {
                bitSet.set(3);
            }
            if (mVTaxiFabConfig.mo32123f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVTaxiFabConfig.mo32124g()) {
                mVTaxiFabConfig.primary.mo25202X0(jVar);
            }
            if (mVTaxiFabConfig.mo32127i()) {
                mVTaxiFabConfig.secondary.mo25202X0(jVar);
            }
            if (mVTaxiFabConfig.mo32125h()) {
                mVTaxiFabConfig.promo.mo25202X0(jVar);
            }
            if (mVTaxiFabConfig.mo32128j()) {
                jVar.mo61708u(mVTaxiFabConfig.shouldRequestEta);
            }
            if (mVTaxiFabConfig.mo32123f()) {
                jVar.mo61708u(mVTaxiFabConfig.alwaysShowFab);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiFabConfig mVTaxiFabConfig = (MVTaxiFabConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVTaxiFabPresentation mVTaxiFabPresentation = new MVTaxiFabPresentation();
                mVTaxiFabConfig.primary = mVTaxiFabPresentation;
                mVTaxiFabPresentation.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVTaxiFabPresentation mVTaxiFabPresentation2 = new MVTaxiFabPresentation();
                mVTaxiFabConfig.secondary = mVTaxiFabPresentation2;
                mVTaxiFabPresentation2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTaxiFabPresentation mVTaxiFabPresentation3 = new MVTaxiFabPresentation();
                mVTaxiFabConfig.promo = mVTaxiFabPresentation3;
                mVTaxiFabPresentation3.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVTaxiFabConfig.shouldRequestEta = jVar.mo61690c();
                mVTaxiFabConfig.mo32130l();
            }
            if (T.get(4)) {
                mVTaxiFabConfig.alwaysShowFab = jVar.mo61690c();
                mVTaxiFabConfig.mo32129k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiFabConfig$d */
    public static class C10707d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10706c(0);
        }
    }

    static {
        new C17394d0("MVTaxiFabConfig");
        HashMap hashMap = new HashMap();
        f28558g = hashMap;
        hashMap.put(C25239c.class, new C10705b());
        hashMap.put(C25240d.class, new C10707d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRIMARY, new FieldMetaData("primary", (byte) 3, new StructMetaData(MVTaxiFabPresentation.class)));
        enumMap.put(_Fields.SECONDARY, new FieldMetaData("secondary", (byte) 3, new StructMetaData(MVTaxiFabPresentation.class)));
        enumMap.put(_Fields.PROMO, new FieldMetaData("promo", (byte) 3, new StructMetaData(MVTaxiFabPresentation.class)));
        enumMap.put(_Fields.SHOULD_REQUEST_ETA, new FieldMetaData("shouldRequestEta", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ALWAYS_SHOW_FAB, new FieldMetaData("alwaysShowFab", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28559h = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiFabConfig.class, unmodifiableMap);
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
        ((C25238b) f28558g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28558g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32120a(MVTaxiFabConfig mVTaxiFabConfig) {
        if (mVTaxiFabConfig == null) {
            return false;
        }
        boolean g = mo32124g();
        boolean g2 = mVTaxiFabConfig.mo32124g();
        if ((g || g2) && (!g || !g2 || !this.primary.mo32133a(mVTaxiFabConfig.primary))) {
            return false;
        }
        boolean i = mo32127i();
        boolean i2 = mVTaxiFabConfig.mo32127i();
        if ((i || i2) && (!i || !i2 || !this.secondary.mo32133a(mVTaxiFabConfig.secondary))) {
            return false;
        }
        boolean h = mo32125h();
        boolean h2 = mVTaxiFabConfig.mo32125h();
        if (((!h && !h2) || (h && h2 && this.promo.mo32133a(mVTaxiFabConfig.promo))) && this.shouldRequestEta == mVTaxiFabConfig.shouldRequestEta && this.alwaysShowFab == mVTaxiFabConfig.alwaysShowFab) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int l;
        MVTaxiFabConfig mVTaxiFabConfig = (MVTaxiFabConfig) obj;
        if (!getClass().equals(mVTaxiFabConfig.getClass())) {
            return getClass().getName().compareTo(mVTaxiFabConfig.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32124g()).compareTo(Boolean.valueOf(mVTaxiFabConfig.mo32124g()));
        if (compareTo != 0 || ((mo32124g() && (compareTo = this.primary.compareTo(mVTaxiFabConfig.primary)) != 0) || (compareTo = Boolean.valueOf(mo32127i()).compareTo(Boolean.valueOf(mVTaxiFabConfig.mo32127i()))) != 0 || ((mo32127i() && (compareTo = this.secondary.compareTo(mVTaxiFabConfig.secondary)) != 0) || (compareTo = Boolean.valueOf(mo32125h()).compareTo(Boolean.valueOf(mVTaxiFabConfig.mo32125h()))) != 0 || ((mo32125h() && (compareTo = this.promo.compareTo(mVTaxiFabConfig.promo)) != 0) || (compareTo = Boolean.valueOf(mo32128j()).compareTo(Boolean.valueOf(mVTaxiFabConfig.mo32128j()))) != 0 || ((mo32128j() && (compareTo = C25082a.m62848l(this.shouldRequestEta, mVTaxiFabConfig.shouldRequestEta)) != 0) || (compareTo = Boolean.valueOf(mo32123f()).compareTo(Boolean.valueOf(mVTaxiFabConfig.mo32123f()))) != 0))))) {
            return compareTo;
        }
        if (!mo32123f() || (l = C25082a.m62848l(this.alwaysShowFab, mVTaxiFabConfig.alwaysShowFab)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiFabConfig)) {
            return mo32120a((MVTaxiFabConfig) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32123f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo32124g() {
        return this.primary != null;
    }

    /* renamed from: h */
    public final boolean mo32125h() {
        return this.promo != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32127i() {
        return this.secondary != null;
    }

    /* renamed from: j */
    public final boolean mo32128j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo32129k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo32130l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiFabConfig(", "primary:");
        MVTaxiFabPresentation mVTaxiFabPresentation = this.primary;
        if (mVTaxiFabPresentation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTaxiFabPresentation);
        }
        n.append(", ");
        n.append("secondary:");
        MVTaxiFabPresentation mVTaxiFabPresentation2 = this.secondary;
        if (mVTaxiFabPresentation2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTaxiFabPresentation2);
        }
        n.append(", ");
        n.append("promo:");
        MVTaxiFabPresentation mVTaxiFabPresentation3 = this.promo;
        if (mVTaxiFabPresentation3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTaxiFabPresentation3);
        }
        n.append(", ");
        n.append("shouldRequestEta:");
        C13555b.m33977q(n, this.shouldRequestEta, ", ", "alwaysShowFab:");
        return C25541a.m63885p(n, this.alwaysShowFab, ")");
    }
}
