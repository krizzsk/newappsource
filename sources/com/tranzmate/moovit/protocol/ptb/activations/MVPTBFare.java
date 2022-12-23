package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.braze.models.BrazeGeofence;
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
import p001a0.C0016g;
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

public class MVPTBFare implements TBase<MVPTBFare, _Fields>, Serializable, Cloneable, Comparable<MVPTBFare> {

    /* renamed from: b */
    public static final C25113c f27875b = new C25113c("fareCode", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27876c = new C25113c(BrazeGeofence.RADIUS_METERS, (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f27877d = new C25113c("color", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f27878e = new C25113c("regionPrices", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f27879f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27880g;
    private byte __isset_bitfield = 0;
    public int color;
    public int fareCode;
    public int radius;
    public List<MVPTBRegionPrice> regionPrices;

    public enum _Fields implements C25085c {
        FARE_CODE(1, "fareCode"),
        RADIUS(2, BrazeGeofence.RADIUS_METERS),
        COLOR(3, "color"),
        REGION_PRICES(4, "regionPrices");
        
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
                return FARE_CODE;
            }
            if (i == 2) {
                return RADIUS;
            }
            if (i == 3) {
                return COLOR;
            }
            if (i != 4) {
                return null;
            }
            return REGION_PRICES;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFare$a */
    public static class C10193a extends C25239c<MVPTBFare> {
        public C10193a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFare mVPTBFare = (MVPTBFare) tBase;
            mVPTBFare.getClass();
            C25113c cVar = MVPTBFare.f27875b;
            gVar.mo61687K();
            gVar.mo61711x(MVPTBFare.f27875b);
            gVar.mo61678B(mVPTBFare.fareCode);
            gVar.mo61712y();
            gVar.mo61711x(MVPTBFare.f27876c);
            gVar.mo61678B(mVPTBFare.radius);
            gVar.mo61712y();
            gVar.mo61711x(MVPTBFare.f27877d);
            gVar.mo61678B(mVPTBFare.color);
            gVar.mo61712y();
            if (mVPTBFare.regionPrices != null) {
                gVar.mo61711x(MVPTBFare.f27878e);
                gVar.mo61680D(new C25119e((byte) 12, mVPTBFare.regionPrices.size()));
                for (MVPTBRegionPrice X0 : mVPTBFare.regionPrices) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFare mVPTBFare = (MVPTBFare) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPTBFare.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVPTBFare.regionPrices = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVPTBRegionPrice mVPTBRegionPrice = new MVPTBRegionPrice();
                                    mVPTBRegionPrice.mo25201C1(gVar);
                                    mVPTBFare.regionPrices.add(mVPTBRegionPrice);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVPTBFare.color = gVar.mo61696i();
                            mVPTBFare.mo30919j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVPTBFare.radius = gVar.mo61696i();
                        mVPTBFare.mo30921l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPTBFare.fareCode = gVar.mo61696i();
                    mVPTBFare.mo30920k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFare$b */
    public static class C10194b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10193a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFare$c */
    public static class C10195c extends C25240d<MVPTBFare> {
        public C10195c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFare mVPTBFare = (MVPTBFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBFare.mo30915g()) {
                bitSet.set(0);
            }
            if (mVPTBFare.mo30916h()) {
                bitSet.set(1);
            }
            if (mVPTBFare.mo30914f()) {
                bitSet.set(2);
            }
            if (mVPTBFare.mo30918i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPTBFare.mo30915g()) {
                jVar.mo61678B(mVPTBFare.fareCode);
            }
            if (mVPTBFare.mo30916h()) {
                jVar.mo61678B(mVPTBFare.radius);
            }
            if (mVPTBFare.mo30914f()) {
                jVar.mo61678B(mVPTBFare.color);
            }
            if (mVPTBFare.mo30918i()) {
                jVar.mo61678B(mVPTBFare.regionPrices.size());
                for (MVPTBRegionPrice X0 : mVPTBFare.regionPrices) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFare mVPTBFare = (MVPTBFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVPTBFare.fareCode = jVar.mo61696i();
                mVPTBFare.mo30920k();
            }
            if (T.get(1)) {
                mVPTBFare.radius = jVar.mo61696i();
                mVPTBFare.mo30921l();
            }
            if (T.get(2)) {
                mVPTBFare.color = jVar.mo61696i();
                mVPTBFare.mo30919j();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVPTBFare.regionPrices = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPTBRegionPrice mVPTBRegionPrice = new MVPTBRegionPrice();
                    mVPTBRegionPrice.mo25201C1(jVar);
                    mVPTBFare.regionPrices.add(mVPTBRegionPrice);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFare$d */
    public static class C10196d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10195c(0);
        }
    }

    static {
        new C17394d0("MVPTBFare");
        HashMap hashMap = new HashMap();
        f27879f = hashMap;
        hashMap.put(C25239c.class, new C10194b());
        hashMap.put(C25240d.class, new C10196d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FARE_CODE, new FieldMetaData("fareCode", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RADIUS, new FieldMetaData(BrazeGeofence.RADIUS_METERS, (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.COLOR, new FieldMetaData("color", (byte) 3, new FieldValueMetaData((byte) 8, "Color")));
        enumMap.put(_Fields.REGION_PRICES, new FieldMetaData("regionPrices", (byte) 3, new ListMetaData(new StructMetaData(MVPTBRegionPrice.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27880g = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBFare.class, unmodifiableMap);
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
        ((C25238b) f27879f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27879f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPTBFare mVPTBFare = (MVPTBFare) obj;
        if (!getClass().equals(mVPTBFare.getClass())) {
            return getClass().getName().compareTo(mVPTBFare.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30915g()).compareTo(Boolean.valueOf(mVPTBFare.mo30915g()));
        if (compareTo != 0 || ((mo30915g() && (compareTo = C25082a.m62839c(this.fareCode, mVPTBFare.fareCode)) != 0) || (compareTo = Boolean.valueOf(mo30916h()).compareTo(Boolean.valueOf(mVPTBFare.mo30916h()))) != 0 || ((mo30916h() && (compareTo = C25082a.m62839c(this.radius, mVPTBFare.radius)) != 0) || (compareTo = Boolean.valueOf(mo30914f()).compareTo(Boolean.valueOf(mVPTBFare.mo30914f()))) != 0 || ((mo30914f() && (compareTo = C25082a.m62839c(this.color, mVPTBFare.color)) != 0) || (compareTo = Boolean.valueOf(mo30918i()).compareTo(Boolean.valueOf(mVPTBFare.mo30918i()))) != 0)))) {
            return compareTo;
        }
        if (!mo30918i() || (h = C25082a.m62844h(this.regionPrices, mVPTBFare.regionPrices)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBFare)) {
            return false;
        }
        MVPTBFare mVPTBFare = (MVPTBFare) obj;
        if (this.fareCode != mVPTBFare.fareCode || this.radius != mVPTBFare.radius || this.color != mVPTBFare.color) {
            return false;
        }
        boolean i = mo30918i();
        boolean i2 = mVPTBFare.mo30918i();
        if ((i || i2) && (!i || !i2 || !this.regionPrices.equals(mVPTBFare.regionPrices))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30914f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo30915g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo30916h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30918i() {
        return this.regionPrices != null;
    }

    /* renamed from: j */
    public final void mo30919j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo30920k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo30921l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBFare(", "fareCode:");
        C0016g.m42z(n, this.fareCode, ", ", "radius:");
        C0016g.m42z(n, this.radius, ", ", "color:");
        C0016g.m42z(n, this.color, ", ", "regionPrices:");
        List<MVPTBRegionPrice> list = this.regionPrices;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
