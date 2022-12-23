package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityPolygon implements TBase<MVMicroMobilityPolygon, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPolygon> {

    /* renamed from: b */
    public static final C25113c f26567b = new C25113c("polygon", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26568c = new C25113c("strokeColorRGB", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26569d = new C25113c("minZoom", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26570e = new C25113c("maxZoom", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26571f = new C25113c("holes", (byte) 15, 5);

    /* renamed from: g */
    public static final HashMap f26572g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26573h;
    private byte __isset_bitfield = 0;
    public List<String> holes;
    public int maxZoom;
    public int minZoom;
    private _Fields[] optionals = {_Fields.MIN_ZOOM, _Fields.MAX_ZOOM, _Fields.HOLES};
    public String polygon;
    public int strokeColorRGB;

    public enum _Fields implements C25085c {
        POLYGON(1, "polygon"),
        STROKE_COLOR_RGB(2, "strokeColorRGB"),
        MIN_ZOOM(3, "minZoom"),
        MAX_ZOOM(4, "maxZoom"),
        HOLES(5, "holes");
        
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
                return POLYGON;
            }
            if (i == 2) {
                return STROKE_COLOR_RGB;
            }
            if (i == 3) {
                return MIN_ZOOM;
            }
            if (i == 4) {
                return MAX_ZOOM;
            }
            if (i != 5) {
                return null;
            }
            return HOLES;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPolygon$a */
    public static class C9243a extends C25239c<MVMicroMobilityPolygon> {
        public C9243a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPolygon mVMicroMobilityPolygon = (MVMicroMobilityPolygon) tBase;
            mVMicroMobilityPolygon.getClass();
            C25113c cVar = MVMicroMobilityPolygon.f26567b;
            gVar.mo61687K();
            if (mVMicroMobilityPolygon.polygon != null) {
                gVar.mo61711x(MVMicroMobilityPolygon.f26567b);
                gVar.mo61686J(mVMicroMobilityPolygon.polygon);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMicroMobilityPolygon.f26568c);
            gVar.mo61678B(mVMicroMobilityPolygon.strokeColorRGB);
            gVar.mo61712y();
            if (mVMicroMobilityPolygon.mo28752h()) {
                gVar.mo61711x(MVMicroMobilityPolygon.f26569d);
                gVar.mo61678B(mVMicroMobilityPolygon.minZoom);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPolygon.mo28751g()) {
                gVar.mo61711x(MVMicroMobilityPolygon.f26570e);
                gVar.mo61678B(mVMicroMobilityPolygon.maxZoom);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPolygon.holes != null && mVMicroMobilityPolygon.mo28750f()) {
                gVar.mo61711x(MVMicroMobilityPolygon.f26571f);
                gVar.mo61680D(new C25119e((byte) 11, mVMicroMobilityPolygon.holes.size()));
                for (String J : mVMicroMobilityPolygon.holes) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPolygon mVMicroMobilityPolygon = (MVMicroMobilityPolygon) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPolygon.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 15) {
                                    C25119e k = gVar.mo61698k();
                                    mVMicroMobilityPolygon.holes = new ArrayList(k.f63395b);
                                    for (int i = 0; i < k.f63395b; i++) {
                                        mVMicroMobilityPolygon.holes.add(gVar.mo61704q());
                                    }
                                    gVar.mo61699l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVMicroMobilityPolygon.maxZoom = gVar.mo61696i();
                                mVMicroMobilityPolygon.mo28756k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVMicroMobilityPolygon.minZoom = gVar.mo61696i();
                            mVMicroMobilityPolygon.mo28757l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVMicroMobilityPolygon.strokeColorRGB = gVar.mo61696i();
                        mVMicroMobilityPolygon.mo28758m();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityPolygon.polygon = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPolygon$b */
    public static class C9244b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9243a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPolygon$c */
    public static class C9245c extends C25240d<MVMicroMobilityPolygon> {
        public C9245c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPolygon mVMicroMobilityPolygon = (MVMicroMobilityPolygon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPolygon.mo28754i()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPolygon.mo28755j()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityPolygon.mo28752h()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityPolygon.mo28751g()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityPolygon.mo28750f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMicroMobilityPolygon.mo28754i()) {
                jVar.mo61686J(mVMicroMobilityPolygon.polygon);
            }
            if (mVMicroMobilityPolygon.mo28755j()) {
                jVar.mo61678B(mVMicroMobilityPolygon.strokeColorRGB);
            }
            if (mVMicroMobilityPolygon.mo28752h()) {
                jVar.mo61678B(mVMicroMobilityPolygon.minZoom);
            }
            if (mVMicroMobilityPolygon.mo28751g()) {
                jVar.mo61678B(mVMicroMobilityPolygon.maxZoom);
            }
            if (mVMicroMobilityPolygon.mo28750f()) {
                jVar.mo61678B(mVMicroMobilityPolygon.holes.size());
                for (String J : mVMicroMobilityPolygon.holes) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPolygon mVMicroMobilityPolygon = (MVMicroMobilityPolygon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVMicroMobilityPolygon.polygon = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityPolygon.strokeColorRGB = jVar.mo61696i();
                mVMicroMobilityPolygon.mo28758m();
            }
            if (T.get(2)) {
                mVMicroMobilityPolygon.minZoom = jVar.mo61696i();
                mVMicroMobilityPolygon.mo28757l();
            }
            if (T.get(3)) {
                mVMicroMobilityPolygon.maxZoom = jVar.mo61696i();
                mVMicroMobilityPolygon.mo28756k();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVMicroMobilityPolygon.holes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVMicroMobilityPolygon.holes.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPolygon$d */
    public static class C9246d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9245c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPolygon");
        HashMap hashMap = new HashMap();
        f26572g = hashMap;
        hashMap.put(C25239c.class, new C9244b());
        hashMap.put(C25240d.class, new C9246d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.POLYGON, new FieldMetaData("polygon", (byte) 3, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        enumMap.put(_Fields.STROKE_COLOR_RGB, new FieldMetaData("strokeColorRGB", (byte) 3, new FieldValueMetaData((byte) 8, "Color")));
        enumMap.put(_Fields.MIN_ZOOM, new FieldMetaData("minZoom", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MAX_ZOOM, new FieldMetaData("maxZoom", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.HOLES, new FieldMetaData("holes", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon"))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26573h = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPolygon.class, unmodifiableMap);
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
        ((C25238b) f26572g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26572g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28747a(MVMicroMobilityPolygon mVMicroMobilityPolygon) {
        if (mVMicroMobilityPolygon == null) {
            return false;
        }
        boolean i = mo28754i();
        boolean i2 = mVMicroMobilityPolygon.mo28754i();
        if (((i || i2) && (!i || !i2 || !this.polygon.equals(mVMicroMobilityPolygon.polygon))) || this.strokeColorRGB != mVMicroMobilityPolygon.strokeColorRGB) {
            return false;
        }
        boolean h = mo28752h();
        boolean h2 = mVMicroMobilityPolygon.mo28752h();
        if ((h || h2) && (!h || !h2 || this.minZoom != mVMicroMobilityPolygon.minZoom)) {
            return false;
        }
        boolean g = mo28751g();
        boolean g2 = mVMicroMobilityPolygon.mo28751g();
        if ((g || g2) && (!g || !g2 || this.maxZoom != mVMicroMobilityPolygon.maxZoom)) {
            return false;
        }
        boolean f = mo28750f();
        boolean f2 = mVMicroMobilityPolygon.mo28750f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.holes.equals(mVMicroMobilityPolygon.holes)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVMicroMobilityPolygon mVMicroMobilityPolygon = (MVMicroMobilityPolygon) obj;
        if (!getClass().equals(mVMicroMobilityPolygon.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPolygon.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28754i()).compareTo(Boolean.valueOf(mVMicroMobilityPolygon.mo28754i()));
        if (compareTo != 0 || ((mo28754i() && (compareTo = this.polygon.compareTo(mVMicroMobilityPolygon.polygon)) != 0) || (compareTo = Boolean.valueOf(mo28755j()).compareTo(Boolean.valueOf(mVMicroMobilityPolygon.mo28755j()))) != 0 || ((mo28755j() && (compareTo = C25082a.m62839c(this.strokeColorRGB, mVMicroMobilityPolygon.strokeColorRGB)) != 0) || (compareTo = Boolean.valueOf(mo28752h()).compareTo(Boolean.valueOf(mVMicroMobilityPolygon.mo28752h()))) != 0 || ((mo28752h() && (compareTo = C25082a.m62839c(this.minZoom, mVMicroMobilityPolygon.minZoom)) != 0) || (compareTo = Boolean.valueOf(mo28751g()).compareTo(Boolean.valueOf(mVMicroMobilityPolygon.mo28751g()))) != 0 || ((mo28751g() && (compareTo = C25082a.m62839c(this.maxZoom, mVMicroMobilityPolygon.maxZoom)) != 0) || (compareTo = Boolean.valueOf(mo28750f()).compareTo(Boolean.valueOf(mVMicroMobilityPolygon.mo28750f()))) != 0))))) {
            return compareTo;
        }
        if (!mo28750f() || (h = C25082a.m62844h(this.holes, mVMicroMobilityPolygon.holes)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMicroMobilityPolygon)) {
            return mo28747a((MVMicroMobilityPolygon) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28750f() {
        return this.holes != null;
    }

    /* renamed from: g */
    public final boolean mo28751g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo28752h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28754i() {
        return this.polygon != null;
    }

    /* renamed from: j */
    public final boolean mo28755j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo28756k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: l */
    public final void mo28757l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo28758m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPolygon(", "polygon:");
        String str = this.polygon;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("strokeColorRGB:");
        n.append(this.strokeColorRGB);
        if (mo28752h()) {
            n.append(", ");
            n.append("minZoom:");
            n.append(this.minZoom);
        }
        if (mo28751g()) {
            n.append(", ");
            n.append("maxZoom:");
            n.append(this.maxZoom);
        }
        if (mo28750f()) {
            n.append(", ");
            n.append("holes:");
            List<String> list = this.holes;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        n.append(")");
        return n.toString();
    }
}
