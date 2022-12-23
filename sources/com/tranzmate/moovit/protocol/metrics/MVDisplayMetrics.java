package com.tranzmate.moovit.protocol.metrics;

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

public class MVDisplayMetrics implements TBase<MVDisplayMetrics, _Fields>, Serializable, Cloneable, Comparable<MVDisplayMetrics> {

    /* renamed from: b */
    public static final C25113c f26382b = new C25113c("widthPixels", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26383c = new C25113c("heightPixels", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26384d = new C25113c("density", (byte) 4, 3);

    /* renamed from: e */
    public static final C25113c f26385e = new C25113c("densityDpi", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26386f = new C25113c("xdpi", (byte) 4, 5);

    /* renamed from: g */
    public static final C25113c f26387g = new C25113c("ydpi", (byte) 4, 6);

    /* renamed from: h */
    public static final HashMap f26388h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26389i;
    private byte __isset_bitfield = 0;
    public double density;
    public int densityDpi;
    public int heightPixels;
    public int widthPixels;
    public double xdpi;
    public double ydpi;

    public enum _Fields implements C25085c {
        WIDTH_PIXELS(1, "widthPixels"),
        HEIGHT_PIXELS(2, "heightPixels"),
        DENSITY(3, "density"),
        DENSITY_DPI(4, "densityDpi"),
        XDPI(5, "xdpi"),
        YDPI(6, "ydpi");
        
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
            switch (i) {
                case 1:
                    return WIDTH_PIXELS;
                case 2:
                    return HEIGHT_PIXELS;
                case 3:
                    return DENSITY;
                case 4:
                    return DENSITY_DPI;
                case 5:
                    return XDPI;
                case 6:
                    return YDPI;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDisplayMetrics$a */
    public static class C9134a extends C25239c<MVDisplayMetrics> {
        public C9134a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDisplayMetrics mVDisplayMetrics = (MVDisplayMetrics) tBase;
            mVDisplayMetrics.getClass();
            C25113c cVar = MVDisplayMetrics.f26382b;
            gVar.mo61687K();
            gVar.mo61711x(MVDisplayMetrics.f26382b);
            gVar.mo61678B(mVDisplayMetrics.widthPixels);
            gVar.mo61712y();
            gVar.mo61711x(MVDisplayMetrics.f26383c);
            gVar.mo61678B(mVDisplayMetrics.heightPixels);
            gVar.mo61712y();
            gVar.mo61711x(MVDisplayMetrics.f26384d);
            gVar.mo61710w(mVDisplayMetrics.density);
            gVar.mo61712y();
            gVar.mo61711x(MVDisplayMetrics.f26385e);
            gVar.mo61678B(mVDisplayMetrics.densityDpi);
            gVar.mo61712y();
            gVar.mo61711x(MVDisplayMetrics.f26386f);
            gVar.mo61710w(mVDisplayMetrics.xdpi);
            gVar.mo61712y();
            gVar.mo61711x(MVDisplayMetrics.f26387g);
            gVar.mo61710w(mVDisplayMetrics.ydpi);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDisplayMetrics mVDisplayMetrics = (MVDisplayMetrics) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDisplayMetrics.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDisplayMetrics.widthPixels = gVar.mo61696i();
                            mVDisplayMetrics.mo28455p();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDisplayMetrics.heightPixels = gVar.mo61696i();
                            mVDisplayMetrics.mo28454o();
                            break;
                        }
                    case 3:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDisplayMetrics.density = gVar.mo61692e();
                            mVDisplayMetrics.mo28453m();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDisplayMetrics.densityDpi = gVar.mo61696i();
                            mVDisplayMetrics.mo28452l();
                            break;
                        }
                    case 5:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDisplayMetrics.xdpi = gVar.mo61692e();
                            mVDisplayMetrics.mo28456q();
                            break;
                        }
                    case 6:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDisplayMetrics.ydpi = gVar.mo61692e();
                            mVDisplayMetrics.mo28457r();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDisplayMetrics$b */
    public static class C9135b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9134a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDisplayMetrics$c */
    public static class C9136c extends C25240d<MVDisplayMetrics> {
        public C9136c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDisplayMetrics mVDisplayMetrics = (MVDisplayMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDisplayMetrics.mo28449i()) {
                bitSet.set(0);
            }
            if (mVDisplayMetrics.mo28447h()) {
                bitSet.set(1);
            }
            if (mVDisplayMetrics.mo28445f()) {
                bitSet.set(2);
            }
            if (mVDisplayMetrics.mo28446g()) {
                bitSet.set(3);
            }
            if (mVDisplayMetrics.mo28450j()) {
                bitSet.set(4);
            }
            if (mVDisplayMetrics.mo28451k()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVDisplayMetrics.mo28449i()) {
                jVar.mo61678B(mVDisplayMetrics.widthPixels);
            }
            if (mVDisplayMetrics.mo28447h()) {
                jVar.mo61678B(mVDisplayMetrics.heightPixels);
            }
            if (mVDisplayMetrics.mo28445f()) {
                jVar.mo61710w(mVDisplayMetrics.density);
            }
            if (mVDisplayMetrics.mo28446g()) {
                jVar.mo61678B(mVDisplayMetrics.densityDpi);
            }
            if (mVDisplayMetrics.mo28450j()) {
                jVar.mo61710w(mVDisplayMetrics.xdpi);
            }
            if (mVDisplayMetrics.mo28451k()) {
                jVar.mo61710w(mVDisplayMetrics.ydpi);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDisplayMetrics mVDisplayMetrics = (MVDisplayMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVDisplayMetrics.widthPixels = jVar.mo61696i();
                mVDisplayMetrics.mo28455p();
            }
            if (T.get(1)) {
                mVDisplayMetrics.heightPixels = jVar.mo61696i();
                mVDisplayMetrics.mo28454o();
            }
            if (T.get(2)) {
                mVDisplayMetrics.density = jVar.mo61692e();
                mVDisplayMetrics.mo28453m();
            }
            if (T.get(3)) {
                mVDisplayMetrics.densityDpi = jVar.mo61696i();
                mVDisplayMetrics.mo28452l();
            }
            if (T.get(4)) {
                mVDisplayMetrics.xdpi = jVar.mo61692e();
                mVDisplayMetrics.mo28456q();
            }
            if (T.get(5)) {
                mVDisplayMetrics.ydpi = jVar.mo61692e();
                mVDisplayMetrics.mo28457r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDisplayMetrics$d */
    public static class C9137d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9136c(0);
        }
    }

    static {
        new C17394d0("MVDisplayMetrics");
        HashMap hashMap = new HashMap();
        f26388h = hashMap;
        hashMap.put(C25239c.class, new C9135b());
        hashMap.put(C25240d.class, new C9137d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.WIDTH_PIXELS, new FieldMetaData("widthPixels", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.HEIGHT_PIXELS, new FieldMetaData("heightPixels", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DENSITY, new FieldMetaData("density", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.DENSITY_DPI, new FieldMetaData("densityDpi", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.XDPI, new FieldMetaData("xdpi", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.YDPI, new FieldMetaData("ydpi", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26389i = unmodifiableMap;
        FieldMetaData.m61947a(MVDisplayMetrics.class, unmodifiableMap);
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
        ((C25238b) f26388h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26388h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28442a(MVDisplayMetrics mVDisplayMetrics) {
        if (mVDisplayMetrics != null && this.widthPixels == mVDisplayMetrics.widthPixels && this.heightPixels == mVDisplayMetrics.heightPixels && this.density == mVDisplayMetrics.density && this.densityDpi == mVDisplayMetrics.densityDpi && this.xdpi == mVDisplayMetrics.xdpi && this.ydpi == mVDisplayMetrics.ydpi) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int b;
        MVDisplayMetrics mVDisplayMetrics = (MVDisplayMetrics) obj;
        if (!getClass().equals(mVDisplayMetrics.getClass())) {
            return getClass().getName().compareTo(mVDisplayMetrics.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28449i()).compareTo(Boolean.valueOf(mVDisplayMetrics.mo28449i()));
        if (compareTo != 0 || ((mo28449i() && (compareTo = C25082a.m62839c(this.widthPixels, mVDisplayMetrics.widthPixels)) != 0) || (compareTo = Boolean.valueOf(mo28447h()).compareTo(Boolean.valueOf(mVDisplayMetrics.mo28447h()))) != 0 || ((mo28447h() && (compareTo = C25082a.m62839c(this.heightPixels, mVDisplayMetrics.heightPixels)) != 0) || (compareTo = Boolean.valueOf(mo28445f()).compareTo(Boolean.valueOf(mVDisplayMetrics.mo28445f()))) != 0 || ((mo28445f() && (compareTo = C25082a.m62838b(this.density, mVDisplayMetrics.density)) != 0) || (compareTo = Boolean.valueOf(mo28446g()).compareTo(Boolean.valueOf(mVDisplayMetrics.mo28446g()))) != 0 || ((mo28446g() && (compareTo = C25082a.m62839c(this.densityDpi, mVDisplayMetrics.densityDpi)) != 0) || (compareTo = Boolean.valueOf(mo28450j()).compareTo(Boolean.valueOf(mVDisplayMetrics.mo28450j()))) != 0 || ((mo28450j() && (compareTo = C25082a.m62838b(this.xdpi, mVDisplayMetrics.xdpi)) != 0) || (compareTo = Boolean.valueOf(mo28451k()).compareTo(Boolean.valueOf(mVDisplayMetrics.mo28451k()))) != 0)))))) {
            return compareTo;
        }
        if (!mo28451k() || (b = C25082a.m62838b(this.ydpi, mVDisplayMetrics.ydpi)) == 0) {
            return 0;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVDisplayMetrics)) {
            return mo28442a((MVDisplayMetrics) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28445f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo28446g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo28447h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28449i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo28450j() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: k */
    public final boolean mo28451k() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: l */
    public final void mo28452l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: m */
    public final void mo28453m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo28454o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo28455p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo28456q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: r */
    public final void mo28457r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDisplayMetrics(", "widthPixels:");
        C0016g.m42z(n, this.widthPixels, ", ", "heightPixels:");
        C0016g.m42z(n, this.heightPixels, ", ", "density:");
        C16759e.m42355k(n, this.density, ", ", "densityDpi:");
        C0016g.m42z(n, this.densityDpi, ", ", "xdpi:");
        C16759e.m42355k(n, this.xdpi, ", ", "ydpi:");
        n.append(this.ydpi);
        n.append(")");
        return n.toString();
    }
}
