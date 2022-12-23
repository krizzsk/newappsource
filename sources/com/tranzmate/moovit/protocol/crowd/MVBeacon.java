package com.tranzmate.moovit.protocol.crowd;

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

public class MVBeacon implements TBase<MVBeacon, _Fields>, Serializable, Cloneable, Comparable<MVBeacon> {

    /* renamed from: b */
    public static final C25113c f25325b = new C25113c("bssid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25326c = new C25113c("beaconType", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25327d = new C25113c("distance", (byte) 4, 3);

    /* renamed from: e */
    public static final C25113c f25328e = new C25113c("rssi", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25329f = new C25113c("txPower", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f25330g = new C25113c("identifiers", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f25331h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25332i;
    private byte __isset_bitfield = 0;
    public int beaconType;
    public String bssid;
    public double distance;
    public List<String> identifiers;
    public int rssi;
    public int txPower;

    public enum _Fields implements C25085c {
        BSSID(1, "bssid"),
        BEACON_TYPE(2, "beaconType"),
        DISTANCE(3, "distance"),
        RSSI(4, "rssi"),
        TX_POWER(5, "txPower"),
        IDENTIFIERS(6, "identifiers");
        
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
                    return BSSID;
                case 2:
                    return BEACON_TYPE;
                case 3:
                    return DISTANCE;
                case 4:
                    return RSSI;
                case 5:
                    return TX_POWER;
                case 6:
                    return IDENTIFIERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeacon$a */
    public static class C8541a extends C25239c<MVBeacon> {
        public C8541a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBeacon mVBeacon = (MVBeacon) tBase;
            mVBeacon.getClass();
            C25113c cVar = MVBeacon.f25325b;
            gVar.mo61687K();
            if (mVBeacon.bssid != null) {
                gVar.mo61711x(MVBeacon.f25325b);
                gVar.mo61686J(mVBeacon.bssid);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVBeacon.f25326c);
            gVar.mo61678B(mVBeacon.beaconType);
            gVar.mo61712y();
            gVar.mo61711x(MVBeacon.f25327d);
            gVar.mo61710w(mVBeacon.distance);
            gVar.mo61712y();
            gVar.mo61711x(MVBeacon.f25328e);
            gVar.mo61678B(mVBeacon.rssi);
            gVar.mo61712y();
            gVar.mo61711x(MVBeacon.f25329f);
            gVar.mo61678B(mVBeacon.txPower);
            gVar.mo61712y();
            if (mVBeacon.identifiers != null) {
                gVar.mo61711x(MVBeacon.f25330g);
                gVar.mo61680D(new C25119e((byte) 11, mVBeacon.identifiers.size()));
                for (String J : mVBeacon.identifiers) {
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
            MVBeacon mVBeacon = (MVBeacon) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBeacon.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBeacon.bssid = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBeacon.beaconType = gVar.mo61696i();
                            mVBeacon.mo26730l();
                            break;
                        }
                    case 3:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBeacon.distance = gVar.mo61692e();
                            mVBeacon.mo26731m();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBeacon.rssi = gVar.mo61696i();
                            mVBeacon.mo26732o();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBeacon.txPower = gVar.mo61696i();
                            mVBeacon.mo26733p();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVBeacon.identifiers = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVBeacon.identifiers.add(gVar.mo61704q());
                            }
                            gVar.mo61699l();
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeacon$b */
    public static class C8542b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8541a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeacon$c */
    public static class C8543c extends C25240d<MVBeacon> {
        public C8543c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBeacon mVBeacon = (MVBeacon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBeacon.mo26724g()) {
                bitSet.set(0);
            }
            if (mVBeacon.mo26723f()) {
                bitSet.set(1);
            }
            if (mVBeacon.mo26725h()) {
                bitSet.set(2);
            }
            if (mVBeacon.mo26728j()) {
                bitSet.set(3);
            }
            if (mVBeacon.mo26729k()) {
                bitSet.set(4);
            }
            if (mVBeacon.mo26727i()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVBeacon.mo26724g()) {
                jVar.mo61686J(mVBeacon.bssid);
            }
            if (mVBeacon.mo26723f()) {
                jVar.mo61678B(mVBeacon.beaconType);
            }
            if (mVBeacon.mo26725h()) {
                jVar.mo61710w(mVBeacon.distance);
            }
            if (mVBeacon.mo26728j()) {
                jVar.mo61678B(mVBeacon.rssi);
            }
            if (mVBeacon.mo26729k()) {
                jVar.mo61678B(mVBeacon.txPower);
            }
            if (mVBeacon.mo26727i()) {
                jVar.mo61678B(mVBeacon.identifiers.size());
                for (String J : mVBeacon.identifiers) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBeacon mVBeacon = (MVBeacon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVBeacon.bssid = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVBeacon.beaconType = jVar.mo61696i();
                mVBeacon.mo26730l();
            }
            if (T.get(2)) {
                mVBeacon.distance = jVar.mo61692e();
                mVBeacon.mo26731m();
            }
            if (T.get(3)) {
                mVBeacon.rssi = jVar.mo61696i();
                mVBeacon.mo26732o();
            }
            if (T.get(4)) {
                mVBeacon.txPower = jVar.mo61696i();
                mVBeacon.mo26733p();
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVBeacon.identifiers = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVBeacon.identifiers.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBeacon$d */
    public static class C8544d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8543c(0);
        }
    }

    static {
        new C17394d0("MVBeacon");
        HashMap hashMap = new HashMap();
        f25331h = hashMap;
        hashMap.put(C25239c.class, new C8542b());
        hashMap.put(C25240d.class, new C8544d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BSSID, new FieldMetaData("bssid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BEACON_TYPE, new FieldMetaData("beaconType", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DISTANCE, new FieldMetaData("distance", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.RSSI, new FieldMetaData("rssi", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TX_POWER, new FieldMetaData("txPower", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IDENTIFIERS, new FieldMetaData("identifiers", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25332i = unmodifiableMap;
        FieldMetaData.m61947a(MVBeacon.class, unmodifiableMap);
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
        ((C25238b) f25331h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25331h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26720a(MVBeacon mVBeacon) {
        if (mVBeacon == null) {
            return false;
        }
        boolean g = mo26724g();
        boolean g2 = mVBeacon.mo26724g();
        if (((g || g2) && (!g || !g2 || !this.bssid.equals(mVBeacon.bssid))) || this.beaconType != mVBeacon.beaconType || this.distance != mVBeacon.distance || this.rssi != mVBeacon.rssi || this.txPower != mVBeacon.txPower) {
            return false;
        }
        boolean i = mo26727i();
        boolean i2 = mVBeacon.mo26727i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.identifiers.equals(mVBeacon.identifiers)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVBeacon mVBeacon = (MVBeacon) obj;
        if (!getClass().equals(mVBeacon.getClass())) {
            return getClass().getName().compareTo(mVBeacon.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26724g()).compareTo(Boolean.valueOf(mVBeacon.mo26724g()));
        if (compareTo != 0 || ((mo26724g() && (compareTo = this.bssid.compareTo(mVBeacon.bssid)) != 0) || (compareTo = Boolean.valueOf(mo26723f()).compareTo(Boolean.valueOf(mVBeacon.mo26723f()))) != 0 || ((mo26723f() && (compareTo = C25082a.m62839c(this.beaconType, mVBeacon.beaconType)) != 0) || (compareTo = Boolean.valueOf(mo26725h()).compareTo(Boolean.valueOf(mVBeacon.mo26725h()))) != 0 || ((mo26725h() && (compareTo = C25082a.m62838b(this.distance, mVBeacon.distance)) != 0) || (compareTo = Boolean.valueOf(mo26728j()).compareTo(Boolean.valueOf(mVBeacon.mo26728j()))) != 0 || ((mo26728j() && (compareTo = C25082a.m62839c(this.rssi, mVBeacon.rssi)) != 0) || (compareTo = Boolean.valueOf(mo26729k()).compareTo(Boolean.valueOf(mVBeacon.mo26729k()))) != 0 || ((mo26729k() && (compareTo = C25082a.m62839c(this.txPower, mVBeacon.txPower)) != 0) || (compareTo = Boolean.valueOf(mo26727i()).compareTo(Boolean.valueOf(mVBeacon.mo26727i()))) != 0)))))) {
            return compareTo;
        }
        if (!mo26727i() || (h = C25082a.m62844h(this.identifiers, mVBeacon.identifiers)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVBeacon)) {
            return mo26720a((MVBeacon) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26723f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26724g() {
        return this.bssid != null;
    }

    /* renamed from: h */
    public final boolean mo26725h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26727i() {
        return this.identifiers != null;
    }

    /* renamed from: j */
    public final boolean mo26728j() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: k */
    public final boolean mo26729k() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: l */
    public final void mo26730l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo26731m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo26732o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: p */
    public final void mo26733p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBeacon(", "bssid:");
        String str = this.bssid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("beaconType:");
        C0016g.m42z(n, this.beaconType, ", ", "distance:");
        C16759e.m42355k(n, this.distance, ", ", "rssi:");
        C0016g.m42z(n, this.rssi, ", ", "txPower:");
        C0016g.m42z(n, this.txPower, ", ", "identifiers:");
        List<String> list = this.identifiers;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
