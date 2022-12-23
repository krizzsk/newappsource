package com.tranzmate.moovit.protocol.mapitems;

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

public class MVBikeStationMetaData implements TBase<MVBikeStationMetaData, _Fields>, Serializable, Cloneable, Comparable<MVBikeStationMetaData> {

    /* renamed from: b */
    public static final C25113c f26198b = new C25113c("name", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26199c = new C25113c("availableBikes", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26200d = new C25113c("freeDocks", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26201e = new C25113c("lastUpdate", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f26202f = new C25113c("showStationDetails", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f26203g = new C25113c("drivingRate", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f26204h = new C25113c("stationId", (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f26205i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f26206j;
    private byte __isset_bitfield = 0;
    public int availableBikes;
    public String drivingRate;
    public int freeDocks;
    public long lastUpdate;
    public String name;
    private _Fields[] optionals = {_Fields.NAME, _Fields.AVAILABLE_BIKES, _Fields.FREE_DOCKS, _Fields.DRIVING_RATE, _Fields.STATION_ID};
    public boolean showStationDetails;
    public String stationId;

    public enum _Fields implements C25085c {
        NAME(1, "name"),
        AVAILABLE_BIKES(2, "availableBikes"),
        FREE_DOCKS(3, "freeDocks"),
        LAST_UPDATE(4, "lastUpdate"),
        SHOW_STATION_DETAILS(5, "showStationDetails"),
        DRIVING_RATE(6, "drivingRate"),
        STATION_ID(7, "stationId");
        
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
                    return NAME;
                case 2:
                    return AVAILABLE_BIKES;
                case 3:
                    return FREE_DOCKS;
                case 4:
                    return LAST_UPDATE;
                case 5:
                    return SHOW_STATION_DETAILS;
                case 6:
                    return DRIVING_RATE;
                case 7:
                    return STATION_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVBikeStationMetaData$a */
    public static class C9028a extends C25239c<MVBikeStationMetaData> {
        public C9028a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBikeStationMetaData mVBikeStationMetaData = (MVBikeStationMetaData) tBase;
            mVBikeStationMetaData.getClass();
            C25113c cVar = MVBikeStationMetaData.f26198b;
            gVar.mo61687K();
            if (mVBikeStationMetaData.name != null && mVBikeStationMetaData.mo28150j()) {
                gVar.mo61711x(MVBikeStationMetaData.f26198b);
                gVar.mo61686J(mVBikeStationMetaData.name);
                gVar.mo61712y();
            }
            if (mVBikeStationMetaData.mo28145f()) {
                gVar.mo61711x(MVBikeStationMetaData.f26199c);
                gVar.mo61678B(mVBikeStationMetaData.availableBikes);
                gVar.mo61712y();
            }
            if (mVBikeStationMetaData.mo28147h()) {
                gVar.mo61711x(MVBikeStationMetaData.f26200d);
                gVar.mo61678B(mVBikeStationMetaData.freeDocks);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVBikeStationMetaData.f26201e);
            gVar.mo61679C(mVBikeStationMetaData.lastUpdate);
            gVar.mo61712y();
            gVar.mo61711x(MVBikeStationMetaData.f26202f);
            gVar.mo61708u(mVBikeStationMetaData.showStationDetails);
            gVar.mo61712y();
            if (mVBikeStationMetaData.drivingRate != null && mVBikeStationMetaData.mo28146g()) {
                gVar.mo61711x(MVBikeStationMetaData.f26203g);
                gVar.mo61686J(mVBikeStationMetaData.drivingRate);
                gVar.mo61712y();
            }
            if (mVBikeStationMetaData.stationId != null && mVBikeStationMetaData.mo28152l()) {
                gVar.mo61711x(MVBikeStationMetaData.f26204h);
                gVar.mo61686J(mVBikeStationMetaData.stationId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBikeStationMetaData mVBikeStationMetaData = (MVBikeStationMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBikeStationMetaData.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBikeStationMetaData.name = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBikeStationMetaData.availableBikes = gVar.mo61696i();
                            mVBikeStationMetaData.mo28153m();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBikeStationMetaData.freeDocks = gVar.mo61696i();
                            mVBikeStationMetaData.mo28154o();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBikeStationMetaData.lastUpdate = gVar.mo61697j();
                            mVBikeStationMetaData.mo28155p();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBikeStationMetaData.showStationDetails = gVar.mo61690c();
                            mVBikeStationMetaData.mo28156q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBikeStationMetaData.drivingRate = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBikeStationMetaData.stationId = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVBikeStationMetaData$b */
    public static class C9029b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9028a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVBikeStationMetaData$c */
    public static class C9030c extends C25240d<MVBikeStationMetaData> {
        public C9030c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBikeStationMetaData mVBikeStationMetaData = (MVBikeStationMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBikeStationMetaData.mo28150j()) {
                bitSet.set(0);
            }
            if (mVBikeStationMetaData.mo28145f()) {
                bitSet.set(1);
            }
            if (mVBikeStationMetaData.mo28147h()) {
                bitSet.set(2);
            }
            if (mVBikeStationMetaData.mo28149i()) {
                bitSet.set(3);
            }
            if (mVBikeStationMetaData.mo28151k()) {
                bitSet.set(4);
            }
            if (mVBikeStationMetaData.mo28146g()) {
                bitSet.set(5);
            }
            if (mVBikeStationMetaData.mo28152l()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVBikeStationMetaData.mo28150j()) {
                jVar.mo61686J(mVBikeStationMetaData.name);
            }
            if (mVBikeStationMetaData.mo28145f()) {
                jVar.mo61678B(mVBikeStationMetaData.availableBikes);
            }
            if (mVBikeStationMetaData.mo28147h()) {
                jVar.mo61678B(mVBikeStationMetaData.freeDocks);
            }
            if (mVBikeStationMetaData.mo28149i()) {
                jVar.mo61679C(mVBikeStationMetaData.lastUpdate);
            }
            if (mVBikeStationMetaData.mo28151k()) {
                jVar.mo61708u(mVBikeStationMetaData.showStationDetails);
            }
            if (mVBikeStationMetaData.mo28146g()) {
                jVar.mo61686J(mVBikeStationMetaData.drivingRate);
            }
            if (mVBikeStationMetaData.mo28152l()) {
                jVar.mo61686J(mVBikeStationMetaData.stationId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBikeStationMetaData mVBikeStationMetaData = (MVBikeStationMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVBikeStationMetaData.name = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVBikeStationMetaData.availableBikes = jVar.mo61696i();
                mVBikeStationMetaData.mo28153m();
            }
            if (T.get(2)) {
                mVBikeStationMetaData.freeDocks = jVar.mo61696i();
                mVBikeStationMetaData.mo28154o();
            }
            if (T.get(3)) {
                mVBikeStationMetaData.lastUpdate = jVar.mo61697j();
                mVBikeStationMetaData.mo28155p();
            }
            if (T.get(4)) {
                mVBikeStationMetaData.showStationDetails = jVar.mo61690c();
                mVBikeStationMetaData.mo28156q();
            }
            if (T.get(5)) {
                mVBikeStationMetaData.drivingRate = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVBikeStationMetaData.stationId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVBikeStationMetaData$d */
    public static class C9031d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9030c(0);
        }
    }

    static {
        new C17394d0("MVBikeStationMetaData");
        HashMap hashMap = new HashMap();
        f26205i = hashMap;
        hashMap.put(C25239c.class, new C9029b());
        hashMap.put(C25240d.class, new C9031d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AVAILABLE_BIKES, new FieldMetaData("availableBikes", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FREE_DOCKS, new FieldMetaData("freeDocks", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LAST_UPDATE, new FieldMetaData("lastUpdate", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.SHOW_STATION_DETAILS, new FieldMetaData("showStationDetails", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DRIVING_RATE, new FieldMetaData("drivingRate", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STATION_ID, new FieldMetaData("stationId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26206j = unmodifiableMap;
        FieldMetaData.m61947a(MVBikeStationMetaData.class, unmodifiableMap);
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
        ((C25238b) f26205i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26205i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBikeStationMetaData mVBikeStationMetaData = (MVBikeStationMetaData) obj;
        if (!getClass().equals(mVBikeStationMetaData.getClass())) {
            return getClass().getName().compareTo(mVBikeStationMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28150j()).compareTo(Boolean.valueOf(mVBikeStationMetaData.mo28150j()));
        if (compareTo2 != 0 || ((mo28150j() && (compareTo2 = this.name.compareTo(mVBikeStationMetaData.name)) != 0) || (compareTo2 = Boolean.valueOf(mo28145f()).compareTo(Boolean.valueOf(mVBikeStationMetaData.mo28145f()))) != 0 || ((mo28145f() && (compareTo2 = C25082a.m62839c(this.availableBikes, mVBikeStationMetaData.availableBikes)) != 0) || (compareTo2 = Boolean.valueOf(mo28147h()).compareTo(Boolean.valueOf(mVBikeStationMetaData.mo28147h()))) != 0 || ((mo28147h() && (compareTo2 = C25082a.m62839c(this.freeDocks, mVBikeStationMetaData.freeDocks)) != 0) || (compareTo2 = Boolean.valueOf(mo28149i()).compareTo(Boolean.valueOf(mVBikeStationMetaData.mo28149i()))) != 0 || ((mo28149i() && (compareTo2 = C25082a.m62840d(this.lastUpdate, mVBikeStationMetaData.lastUpdate)) != 0) || (compareTo2 = Boolean.valueOf(mo28151k()).compareTo(Boolean.valueOf(mVBikeStationMetaData.mo28151k()))) != 0 || ((mo28151k() && (compareTo2 = C25082a.m62848l(this.showStationDetails, mVBikeStationMetaData.showStationDetails)) != 0) || (compareTo2 = Boolean.valueOf(mo28146g()).compareTo(Boolean.valueOf(mVBikeStationMetaData.mo28146g()))) != 0 || ((mo28146g() && (compareTo2 = this.drivingRate.compareTo(mVBikeStationMetaData.drivingRate)) != 0) || (compareTo2 = Boolean.valueOf(mo28152l()).compareTo(Boolean.valueOf(mVBikeStationMetaData.mo28152l()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo28152l() || (compareTo = this.stationId.compareTo(mVBikeStationMetaData.stationId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBikeStationMetaData)) {
            return false;
        }
        MVBikeStationMetaData mVBikeStationMetaData = (MVBikeStationMetaData) obj;
        boolean j = mo28150j();
        boolean j2 = mVBikeStationMetaData.mo28150j();
        if ((j || j2) && (!j || !j2 || !this.name.equals(mVBikeStationMetaData.name))) {
            return false;
        }
        boolean f = mo28145f();
        boolean f2 = mVBikeStationMetaData.mo28145f();
        if ((f || f2) && (!f || !f2 || this.availableBikes != mVBikeStationMetaData.availableBikes)) {
            return false;
        }
        boolean h = mo28147h();
        boolean h2 = mVBikeStationMetaData.mo28147h();
        if (((h || h2) && (!h || !h2 || this.freeDocks != mVBikeStationMetaData.freeDocks)) || this.lastUpdate != mVBikeStationMetaData.lastUpdate || this.showStationDetails != mVBikeStationMetaData.showStationDetails) {
            return false;
        }
        boolean g = mo28146g();
        boolean g2 = mVBikeStationMetaData.mo28146g();
        if ((g || g2) && (!g || !g2 || !this.drivingRate.equals(mVBikeStationMetaData.drivingRate))) {
            return false;
        }
        boolean l = mo28152l();
        boolean l2 = mVBikeStationMetaData.mo28152l();
        if ((l || l2) && (!l || !l2 || !this.stationId.equals(mVBikeStationMetaData.stationId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28145f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo28146g() {
        return this.drivingRate != null;
    }

    /* renamed from: h */
    public final boolean mo28147h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28149i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo28150j() {
        return this.name != null;
    }

    /* renamed from: k */
    public final boolean mo28151k() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: l */
    public final boolean mo28152l() {
        return this.stationId != null;
    }

    /* renamed from: m */
    public final void mo28153m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo28154o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo28155p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: q */
    public final void mo28156q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVBikeStationMetaData(");
        boolean z2 = false;
        if (mo28150j()) {
            sb.append("name:");
            String str = this.name;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo28145f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("availableBikes:");
            sb.append(this.availableBikes);
            z = false;
        }
        if (mo28147h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("freeDocks:");
            sb.append(this.freeDocks);
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("lastUpdate:");
        C25541a.m63889t(sb, this.lastUpdate, ", ", "showStationDetails:");
        sb.append(this.showStationDetails);
        if (mo28146g()) {
            sb.append(", ");
            sb.append("drivingRate:");
            String str2 = this.drivingRate;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        if (mo28152l()) {
            sb.append(", ");
            sb.append("stationId:");
            String str3 = this.stationId;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
