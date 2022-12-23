package com.tranzmate.moovit.protocol.tripplanner;

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

public class MVShortPlatformMetadata implements TBase<MVShortPlatformMetadata, _Fields>, Serializable, Cloneable, Comparable<MVShortPlatformMetadata> {

    /* renamed from: b */
    public static final C25113c f30042b = new C25113c("tripId", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f30043c = new C25113c("stopId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30044d = new C25113c("carLabels", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f30045e = new C25113c("nubmerOfCars", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f30046f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f30047g;
    private byte __isset_bitfield = 0;
    public List<String> carLabels;
    public int nubmerOfCars;
    public int stopId;
    public long tripId;

    public enum _Fields implements C25085c {
        TRIP_ID(1, "tripId"),
        STOP_ID(2, "stopId"),
        CAR_LABELS(3, "carLabels"),
        NUBMER_OF_CARS(4, "nubmerOfCars");
        
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
                return TRIP_ID;
            }
            if (i == 2) {
                return STOP_ID;
            }
            if (i == 3) {
                return CAR_LABELS;
            }
            if (i != 4) {
                return null;
            }
            return NUBMER_OF_CARS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVShortPlatformMetadata$a */
    public static class C11618a extends C25239c<MVShortPlatformMetadata> {
        public C11618a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVShortPlatformMetadata mVShortPlatformMetadata = (MVShortPlatformMetadata) tBase;
            mVShortPlatformMetadata.getClass();
            C25113c cVar = MVShortPlatformMetadata.f30042b;
            gVar.mo61687K();
            gVar.mo61711x(MVShortPlatformMetadata.f30042b);
            gVar.mo61679C(mVShortPlatformMetadata.tripId);
            gVar.mo61712y();
            gVar.mo61711x(MVShortPlatformMetadata.f30043c);
            gVar.mo61678B(mVShortPlatformMetadata.stopId);
            gVar.mo61712y();
            if (mVShortPlatformMetadata.carLabels != null) {
                gVar.mo61711x(MVShortPlatformMetadata.f30044d);
                gVar.mo61680D(new C25119e((byte) 11, mVShortPlatformMetadata.carLabels.size()));
                for (String J : mVShortPlatformMetadata.carLabels) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVShortPlatformMetadata.f30045e);
            C16530d.m42020n(gVar, mVShortPlatformMetadata.nubmerOfCars);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVShortPlatformMetadata mVShortPlatformMetadata = (MVShortPlatformMetadata) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVShortPlatformMetadata.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVShortPlatformMetadata.nubmerOfCars = gVar.mo61696i();
                                mVShortPlatformMetadata.mo34532j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVShortPlatformMetadata.carLabels = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVShortPlatformMetadata.carLabels.add(gVar.mo61704q());
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVShortPlatformMetadata.stopId = gVar.mo61696i();
                        mVShortPlatformMetadata.mo34533k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVShortPlatformMetadata.tripId = gVar.mo61697j();
                    mVShortPlatformMetadata.mo34534l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVShortPlatformMetadata$b */
    public static class C11619b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11618a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVShortPlatformMetadata$c */
    public static class C11620c extends C25240d<MVShortPlatformMetadata> {
        public C11620c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVShortPlatformMetadata mVShortPlatformMetadata = (MVShortPlatformMetadata) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVShortPlatformMetadata.mo34531i()) {
                bitSet.set(0);
            }
            if (mVShortPlatformMetadata.mo34529h()) {
                bitSet.set(1);
            }
            if (mVShortPlatformMetadata.mo34527f()) {
                bitSet.set(2);
            }
            if (mVShortPlatformMetadata.mo34528g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVShortPlatformMetadata.mo34531i()) {
                jVar.mo61679C(mVShortPlatformMetadata.tripId);
            }
            if (mVShortPlatformMetadata.mo34529h()) {
                jVar.mo61678B(mVShortPlatformMetadata.stopId);
            }
            if (mVShortPlatformMetadata.mo34527f()) {
                jVar.mo61678B(mVShortPlatformMetadata.carLabels.size());
                for (String J : mVShortPlatformMetadata.carLabels) {
                    jVar.mo61686J(J);
                }
            }
            if (mVShortPlatformMetadata.mo34528g()) {
                jVar.mo61678B(mVShortPlatformMetadata.nubmerOfCars);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVShortPlatformMetadata mVShortPlatformMetadata = (MVShortPlatformMetadata) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVShortPlatformMetadata.tripId = jVar.mo61697j();
                mVShortPlatformMetadata.mo34534l();
            }
            if (T.get(1)) {
                mVShortPlatformMetadata.stopId = jVar.mo61696i();
                mVShortPlatformMetadata.mo34533k();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVShortPlatformMetadata.carLabels = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVShortPlatformMetadata.carLabels.add(jVar.mo61704q());
                }
            }
            if (T.get(3)) {
                mVShortPlatformMetadata.nubmerOfCars = jVar.mo61696i();
                mVShortPlatformMetadata.mo34532j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVShortPlatformMetadata$d */
    public static class C11621d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11620c(0);
        }
    }

    static {
        new C17394d0("MVShortPlatformMetadata");
        HashMap hashMap = new HashMap();
        f30046f = hashMap;
        hashMap.put(C25239c.class, new C11619b());
        hashMap.put(C25240d.class, new C11621d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_ID, new FieldMetaData("tripId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CAR_LABELS, new FieldMetaData("carLabels", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.NUBMER_OF_CARS, new FieldMetaData("nubmerOfCars", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30047g = unmodifiableMap;
        FieldMetaData.m61947a(MVShortPlatformMetadata.class, unmodifiableMap);
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
        ((C25238b) f30046f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30046f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVShortPlatformMetadata mVShortPlatformMetadata = (MVShortPlatformMetadata) obj;
        if (!getClass().equals(mVShortPlatformMetadata.getClass())) {
            return getClass().getName().compareTo(mVShortPlatformMetadata.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34531i()).compareTo(Boolean.valueOf(mVShortPlatformMetadata.mo34531i()));
        if (compareTo != 0 || ((mo34531i() && (compareTo = C25082a.m62840d(this.tripId, mVShortPlatformMetadata.tripId)) != 0) || (compareTo = Boolean.valueOf(mo34529h()).compareTo(Boolean.valueOf(mVShortPlatformMetadata.mo34529h()))) != 0 || ((mo34529h() && (compareTo = C25082a.m62839c(this.stopId, mVShortPlatformMetadata.stopId)) != 0) || (compareTo = Boolean.valueOf(mo34527f()).compareTo(Boolean.valueOf(mVShortPlatformMetadata.mo34527f()))) != 0 || ((mo34527f() && (compareTo = C25082a.m62844h(this.carLabels, mVShortPlatformMetadata.carLabels)) != 0) || (compareTo = Boolean.valueOf(mo34528g()).compareTo(Boolean.valueOf(mVShortPlatformMetadata.mo34528g()))) != 0)))) {
            return compareTo;
        }
        if (!mo34528g() || (c = C25082a.m62839c(this.nubmerOfCars, mVShortPlatformMetadata.nubmerOfCars)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVShortPlatformMetadata)) {
            return false;
        }
        MVShortPlatformMetadata mVShortPlatformMetadata = (MVShortPlatformMetadata) obj;
        if (this.tripId != mVShortPlatformMetadata.tripId || this.stopId != mVShortPlatformMetadata.stopId) {
            return false;
        }
        boolean f = mo34527f();
        boolean f2 = mVShortPlatformMetadata.mo34527f();
        if (((f || f2) && (!f || !f2 || !this.carLabels.equals(mVShortPlatformMetadata.carLabels))) || this.nubmerOfCars != mVShortPlatformMetadata.nubmerOfCars) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34527f() {
        return this.carLabels != null;
    }

    /* renamed from: g */
    public final boolean mo34528g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo34529h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34531i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo34532j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo34533k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo34534l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVShortPlatformMetadata(", "tripId:");
        C25541a.m63889t(n, this.tripId, ", ", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "carLabels:");
        List<String> list = this.carLabels;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("nubmerOfCars:");
        return C13437d.m33707l(n, this.nubmerOfCars, ")");
    }
}
