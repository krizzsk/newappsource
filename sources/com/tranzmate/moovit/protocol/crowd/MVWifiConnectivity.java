package com.tranzmate.moovit.protocol.crowd;

import com.appboy.models.outgoing.FacebookUser;
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

public class MVWifiConnectivity implements TBase<MVWifiConnectivity, _Fields>, Serializable, Cloneable, Comparable<MVWifiConnectivity> {

    /* renamed from: b */
    public static final C25113c f25472b = new C25113c("bssid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25473c = new C25113c("ssid", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25474d = new C25113c("level", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25475e = new C25113c("connected", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f25476f = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f25477g = new C25113c("capabilites", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f25478h = new C25113c("autoJoinStatus", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f25479i = new C25113c("numConnection", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f25480j = new C25113c("distanceCm", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f25481k = new C25113c("firstSeenTimestamp", (byte) 10, 10);

    /* renamed from: l */
    public static final C25113c f25482l = new C25113c("frequency", (byte) 8, 11);

    /* renamed from: m */
    public static final HashMap f25483m;

    /* renamed from: n */
    public static final Map<_Fields, FieldMetaData> f25484n;
    private byte __isset_bitfield = 0;
    public int autoJoinStatus;
    public String bssid;
    public String capabilites;
    public boolean connected;
    public int distanceCm;
    public long firstSeenTimestamp;
    public int frequency;
    public String level;
    public MVDeviceLocation location;
    public int numConnection;
    private _Fields[] optionals = {_Fields.LOCATION, _Fields.AUTO_JOIN_STATUS, _Fields.NUM_CONNECTION, _Fields.DISTANCE_CM, _Fields.FREQUENCY};
    public String ssid;

    public enum _Fields implements C25085c {
        BSSID(1, "bssid"),
        SSID(2, "ssid"),
        LEVEL(3, "level"),
        CONNECTED(4, "connected"),
        LOCATION(5, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        CAPABILITES(6, "capabilites"),
        AUTO_JOIN_STATUS(7, "autoJoinStatus"),
        NUM_CONNECTION(8, "numConnection"),
        DISTANCE_CM(9, "distanceCm"),
        FIRST_SEEN_TIMESTAMP(10, "firstSeenTimestamp"),
        FREQUENCY(11, "frequency");
        
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
                    return SSID;
                case 3:
                    return LEVEL;
                case 4:
                    return CONNECTED;
                case 5:
                    return LOCATION;
                case 6:
                    return CAPABILITES;
                case 7:
                    return AUTO_JOIN_STATUS;
                case 8:
                    return NUM_CONNECTION;
                case 9:
                    return DISTANCE_CM;
                case 10:
                    return FIRST_SEEN_TIMESTAMP;
                case 11:
                    return FREQUENCY;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifiConnectivity$a */
    public static class C8619a extends C25239c<MVWifiConnectivity> {
        public C8619a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWifiConnectivity mVWifiConnectivity = (MVWifiConnectivity) tBase;
            MVDeviceLocation mVDeviceLocation = mVWifiConnectivity.location;
            if (mVDeviceLocation != null) {
                mVDeviceLocation.mo26817u();
            }
            C25113c cVar = MVWifiConnectivity.f25472b;
            gVar.mo61687K();
            if (mVWifiConnectivity.bssid != null) {
                gVar.mo61711x(MVWifiConnectivity.f25472b);
                gVar.mo61686J(mVWifiConnectivity.bssid);
                gVar.mo61712y();
            }
            if (mVWifiConnectivity.ssid != null) {
                gVar.mo61711x(MVWifiConnectivity.f25473c);
                gVar.mo61686J(mVWifiConnectivity.ssid);
                gVar.mo61712y();
            }
            if (mVWifiConnectivity.level != null) {
                gVar.mo61711x(MVWifiConnectivity.f25474d);
                gVar.mo61686J(mVWifiConnectivity.level);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWifiConnectivity.f25475e);
            gVar.mo61708u(mVWifiConnectivity.connected);
            gVar.mo61712y();
            if (mVWifiConnectivity.location != null && mVWifiConnectivity.mo26958o()) {
                gVar.mo61711x(MVWifiConnectivity.f25476f);
                mVWifiConnectivity.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWifiConnectivity.capabilites != null) {
                gVar.mo61711x(MVWifiConnectivity.f25477g);
                gVar.mo61686J(mVWifiConnectivity.capabilites);
                gVar.mo61712y();
            }
            if (mVWifiConnectivity.mo26949f()) {
                gVar.mo61711x(MVWifiConnectivity.f25478h);
                gVar.mo61678B(mVWifiConnectivity.autoJoinStatus);
                gVar.mo61712y();
            }
            if (mVWifiConnectivity.mo26959p()) {
                gVar.mo61711x(MVWifiConnectivity.f25479i);
                gVar.mo61678B(mVWifiConnectivity.numConnection);
                gVar.mo61712y();
            }
            if (mVWifiConnectivity.mo26954j()) {
                gVar.mo61711x(MVWifiConnectivity.f25480j);
                gVar.mo61678B(mVWifiConnectivity.distanceCm);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWifiConnectivity.f25481k);
            gVar.mo61679C(mVWifiConnectivity.firstSeenTimestamp);
            gVar.mo61712y();
            if (mVWifiConnectivity.mo26956l()) {
                gVar.mo61711x(MVWifiConnectivity.f25482l);
                gVar.mo61678B(mVWifiConnectivity.frequency);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWifiConnectivity mVWifiConnectivity = (MVWifiConnectivity) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVDeviceLocation mVDeviceLocation = mVWifiConnectivity.location;
                    if (mVDeviceLocation != null) {
                        mVDeviceLocation.mo26817u();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.bssid = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.ssid = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.level = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.connected = gVar.mo61690c();
                            mVWifiConnectivity.mo26962s();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDeviceLocation mVDeviceLocation2 = new MVDeviceLocation();
                            mVWifiConnectivity.location = mVDeviceLocation2;
                            mVDeviceLocation2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.capabilites = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.autoJoinStatus = gVar.mo61696i();
                            mVWifiConnectivity.mo26961r();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.numConnection = gVar.mo61696i();
                            mVWifiConnectivity.mo26967w();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.distanceCm = gVar.mo61696i();
                            mVWifiConnectivity.mo26963t();
                            break;
                        }
                    case 10:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.firstSeenTimestamp = gVar.mo61697j();
                            mVWifiConnectivity.mo26965u();
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifiConnectivity.frequency = gVar.mo61696i();
                            mVWifiConnectivity.mo26966v();
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifiConnectivity$b */
    public static class C8620b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8619a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifiConnectivity$c */
    public static class C8621c extends C25240d<MVWifiConnectivity> {
        public C8621c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWifiConnectivity mVWifiConnectivity = (MVWifiConnectivity) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWifiConnectivity.mo26950g()) {
                bitSet.set(0);
            }
            if (mVWifiConnectivity.mo26960q()) {
                bitSet.set(1);
            }
            if (mVWifiConnectivity.mo26957m()) {
                bitSet.set(2);
            }
            if (mVWifiConnectivity.mo26953i()) {
                bitSet.set(3);
            }
            if (mVWifiConnectivity.mo26958o()) {
                bitSet.set(4);
            }
            if (mVWifiConnectivity.mo26951h()) {
                bitSet.set(5);
            }
            if (mVWifiConnectivity.mo26949f()) {
                bitSet.set(6);
            }
            if (mVWifiConnectivity.mo26959p()) {
                bitSet.set(7);
            }
            if (mVWifiConnectivity.mo26954j()) {
                bitSet.set(8);
            }
            if (mVWifiConnectivity.mo26955k()) {
                bitSet.set(9);
            }
            if (mVWifiConnectivity.mo26956l()) {
                bitSet.set(10);
            }
            jVar.mo61738U(bitSet, 11);
            if (mVWifiConnectivity.mo26950g()) {
                jVar.mo61686J(mVWifiConnectivity.bssid);
            }
            if (mVWifiConnectivity.mo26960q()) {
                jVar.mo61686J(mVWifiConnectivity.ssid);
            }
            if (mVWifiConnectivity.mo26957m()) {
                jVar.mo61686J(mVWifiConnectivity.level);
            }
            if (mVWifiConnectivity.mo26953i()) {
                jVar.mo61708u(mVWifiConnectivity.connected);
            }
            if (mVWifiConnectivity.mo26958o()) {
                mVWifiConnectivity.location.mo25202X0(jVar);
            }
            if (mVWifiConnectivity.mo26951h()) {
                jVar.mo61686J(mVWifiConnectivity.capabilites);
            }
            if (mVWifiConnectivity.mo26949f()) {
                jVar.mo61678B(mVWifiConnectivity.autoJoinStatus);
            }
            if (mVWifiConnectivity.mo26959p()) {
                jVar.mo61678B(mVWifiConnectivity.numConnection);
            }
            if (mVWifiConnectivity.mo26954j()) {
                jVar.mo61678B(mVWifiConnectivity.distanceCm);
            }
            if (mVWifiConnectivity.mo26955k()) {
                jVar.mo61679C(mVWifiConnectivity.firstSeenTimestamp);
            }
            if (mVWifiConnectivity.mo26956l()) {
                jVar.mo61678B(mVWifiConnectivity.frequency);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWifiConnectivity mVWifiConnectivity = (MVWifiConnectivity) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(11);
            if (T.get(0)) {
                mVWifiConnectivity.bssid = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWifiConnectivity.ssid = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVWifiConnectivity.level = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVWifiConnectivity.connected = jVar.mo61690c();
                mVWifiConnectivity.mo26962s();
            }
            if (T.get(4)) {
                MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                mVWifiConnectivity.location = mVDeviceLocation;
                mVDeviceLocation.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVWifiConnectivity.capabilites = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVWifiConnectivity.autoJoinStatus = jVar.mo61696i();
                mVWifiConnectivity.mo26961r();
            }
            if (T.get(7)) {
                mVWifiConnectivity.numConnection = jVar.mo61696i();
                mVWifiConnectivity.mo26967w();
            }
            if (T.get(8)) {
                mVWifiConnectivity.distanceCm = jVar.mo61696i();
                mVWifiConnectivity.mo26963t();
            }
            if (T.get(9)) {
                mVWifiConnectivity.firstSeenTimestamp = jVar.mo61697j();
                mVWifiConnectivity.mo26965u();
            }
            if (T.get(10)) {
                mVWifiConnectivity.frequency = jVar.mo61696i();
                mVWifiConnectivity.mo26966v();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifiConnectivity$d */
    public static class C8622d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8621c(0);
        }
    }

    static {
        new C17394d0("MVWifiConnectivity");
        HashMap hashMap = new HashMap();
        f25483m = hashMap;
        hashMap.put(C25239c.class, new C8620b());
        hashMap.put(C25240d.class, new C8622d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BSSID, new FieldMetaData("bssid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SSID, new FieldMetaData("ssid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEVEL, new FieldMetaData("level", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CONNECTED, new FieldMetaData("connected", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 2, new StructMetaData(MVDeviceLocation.class)));
        enumMap.put(_Fields.CAPABILITES, new FieldMetaData("capabilites", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AUTO_JOIN_STATUS, new FieldMetaData("autoJoinStatus", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NUM_CONNECTION, new FieldMetaData("numConnection", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DISTANCE_CM, new FieldMetaData("distanceCm", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FIRST_SEEN_TIMESTAMP, new FieldMetaData("firstSeenTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.FREQUENCY, new FieldMetaData("frequency", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25484n = unmodifiableMap;
        FieldMetaData.m61947a(MVWifiConnectivity.class, unmodifiableMap);
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
        ((C25238b) f25483m.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25483m.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVWifiConnectivity mVWifiConnectivity = (MVWifiConnectivity) obj;
        if (!getClass().equals(mVWifiConnectivity.getClass())) {
            return getClass().getName().compareTo(mVWifiConnectivity.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26950g()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26950g()));
        if (compareTo != 0 || ((mo26950g() && (compareTo = this.bssid.compareTo(mVWifiConnectivity.bssid)) != 0) || (compareTo = Boolean.valueOf(mo26960q()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26960q()))) != 0 || ((mo26960q() && (compareTo = this.ssid.compareTo(mVWifiConnectivity.ssid)) != 0) || (compareTo = Boolean.valueOf(mo26957m()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26957m()))) != 0 || ((mo26957m() && (compareTo = this.level.compareTo(mVWifiConnectivity.level)) != 0) || (compareTo = Boolean.valueOf(mo26953i()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26953i()))) != 0 || ((mo26953i() && (compareTo = C25082a.m62848l(this.connected, mVWifiConnectivity.connected)) != 0) || (compareTo = Boolean.valueOf(mo26958o()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26958o()))) != 0 || ((mo26958o() && (compareTo = this.location.compareTo(mVWifiConnectivity.location)) != 0) || (compareTo = Boolean.valueOf(mo26951h()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26951h()))) != 0 || ((mo26951h() && (compareTo = this.capabilites.compareTo(mVWifiConnectivity.capabilites)) != 0) || (compareTo = Boolean.valueOf(mo26949f()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26949f()))) != 0 || ((mo26949f() && (compareTo = C25082a.m62839c(this.autoJoinStatus, mVWifiConnectivity.autoJoinStatus)) != 0) || (compareTo = Boolean.valueOf(mo26959p()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26959p()))) != 0 || ((mo26959p() && (compareTo = C25082a.m62839c(this.numConnection, mVWifiConnectivity.numConnection)) != 0) || (compareTo = Boolean.valueOf(mo26954j()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26954j()))) != 0 || ((mo26954j() && (compareTo = C25082a.m62839c(this.distanceCm, mVWifiConnectivity.distanceCm)) != 0) || (compareTo = Boolean.valueOf(mo26955k()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26955k()))) != 0 || ((mo26955k() && (compareTo = C25082a.m62840d(this.firstSeenTimestamp, mVWifiConnectivity.firstSeenTimestamp)) != 0) || (compareTo = Boolean.valueOf(mo26956l()).compareTo(Boolean.valueOf(mVWifiConnectivity.mo26956l()))) != 0))))))))))) {
            return compareTo;
        }
        if (!mo26956l() || (c = C25082a.m62839c(this.frequency, mVWifiConnectivity.frequency)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWifiConnectivity)) {
            return false;
        }
        MVWifiConnectivity mVWifiConnectivity = (MVWifiConnectivity) obj;
        boolean g = mo26950g();
        boolean g2 = mVWifiConnectivity.mo26950g();
        if ((g || g2) && (!g || !g2 || !this.bssid.equals(mVWifiConnectivity.bssid))) {
            return false;
        }
        boolean q = mo26960q();
        boolean q2 = mVWifiConnectivity.mo26960q();
        if ((q || q2) && (!q || !q2 || !this.ssid.equals(mVWifiConnectivity.ssid))) {
            return false;
        }
        boolean m = mo26957m();
        boolean m2 = mVWifiConnectivity.mo26957m();
        if (((m || m2) && (!m || !m2 || !this.level.equals(mVWifiConnectivity.level))) || this.connected != mVWifiConnectivity.connected) {
            return false;
        }
        boolean o = mo26958o();
        boolean o2 = mVWifiConnectivity.mo26958o();
        if ((o || o2) && (!o || !o2 || !this.location.mo26798a(mVWifiConnectivity.location))) {
            return false;
        }
        boolean h = mo26951h();
        boolean h2 = mVWifiConnectivity.mo26951h();
        if ((h || h2) && (!h || !h2 || !this.capabilites.equals(mVWifiConnectivity.capabilites))) {
            return false;
        }
        boolean f = mo26949f();
        boolean f2 = mVWifiConnectivity.mo26949f();
        if ((f || f2) && (!f || !f2 || this.autoJoinStatus != mVWifiConnectivity.autoJoinStatus)) {
            return false;
        }
        boolean p = mo26959p();
        boolean p2 = mVWifiConnectivity.mo26959p();
        if ((p || p2) && (!p || !p2 || this.numConnection != mVWifiConnectivity.numConnection)) {
            return false;
        }
        boolean j = mo26954j();
        boolean j2 = mVWifiConnectivity.mo26954j();
        if (((j || j2) && (!j || !j2 || this.distanceCm != mVWifiConnectivity.distanceCm)) || this.firstSeenTimestamp != mVWifiConnectivity.firstSeenTimestamp) {
            return false;
        }
        boolean l = mo26956l();
        boolean l2 = mVWifiConnectivity.mo26956l();
        if ((l || l2) && (!l || !l2 || this.frequency != mVWifiConnectivity.frequency)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26949f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo26950g() {
        return this.bssid != null;
    }

    /* renamed from: h */
    public final boolean mo26951h() {
        return this.capabilites != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26953i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo26954j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo26955k() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: l */
    public final boolean mo26956l() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: m */
    public final boolean mo26957m() {
        return this.level != null;
    }

    /* renamed from: o */
    public final boolean mo26958o() {
        return this.location != null;
    }

    /* renamed from: p */
    public final boolean mo26959p() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: q */
    public final boolean mo26960q() {
        return this.ssid != null;
    }

    /* renamed from: r */
    public final void mo26961r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: s */
    public final void mo26962s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: t */
    public final void mo26963t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWifiConnectivity(", "bssid:");
        String str = this.bssid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("ssid:");
        String str2 = this.ssid;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("level:");
        String str3 = this.level;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("connected:");
        n.append(this.connected);
        if (mo26958o()) {
            n.append(", ");
            n.append("location:");
            MVDeviceLocation mVDeviceLocation = this.location;
            if (mVDeviceLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVDeviceLocation);
            }
        }
        n.append(", ");
        n.append("capabilites:");
        String str4 = this.capabilites;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        if (mo26949f()) {
            n.append(", ");
            n.append("autoJoinStatus:");
            n.append(this.autoJoinStatus);
        }
        if (mo26959p()) {
            n.append(", ");
            n.append("numConnection:");
            n.append(this.numConnection);
        }
        if (mo26954j()) {
            n.append(", ");
            n.append("distanceCm:");
            n.append(this.distanceCm);
        }
        n.append(", ");
        n.append("firstSeenTimestamp:");
        n.append(this.firstSeenTimestamp);
        if (mo26956l()) {
            n.append(", ");
            n.append("frequency:");
            n.append(this.frequency);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo26965u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: v */
    public final void mo26966v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: w */
    public final void mo26967w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }
}
