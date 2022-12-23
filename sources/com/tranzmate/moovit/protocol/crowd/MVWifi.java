package com.tranzmate.moovit.protocol.crowd;

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

public class MVWifi implements TBase<MVWifi, _Fields>, Serializable, Cloneable, Comparable<MVWifi> {

    /* renamed from: b */
    public static final C25113c f25460b = new C25113c("bssid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25461c = new C25113c("ssid", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25462d = new C25113c("level", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25463e = new C25113c("timestamp", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f25464f = new C25113c("capabilites", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f25465g = new C25113c("autoJoinStatus", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f25466h = new C25113c("numConnection", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f25467i = new C25113c("distanceCm", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f25468j = new C25113c("frequency", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f25469k = new C25113c("lastKnownLocation", (byte) 12, 10);

    /* renamed from: l */
    public static final HashMap f25470l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f25471m;
    private byte __isset_bitfield = 0;
    public int autoJoinStatus;
    public String bssid;
    public String capabilites;
    public int distanceCm;
    public int frequency;
    public MVDeviceLocation lastKnownLocation;
    public String level;
    public int numConnection;
    private _Fields[] optionals = {_Fields.TIMESTAMP, _Fields.CAPABILITES, _Fields.AUTO_JOIN_STATUS, _Fields.NUM_CONNECTION, _Fields.DISTANCE_CM, _Fields.FREQUENCY, _Fields.LAST_KNOWN_LOCATION};
    public String ssid;
    public long timestamp;

    public enum _Fields implements C25085c {
        BSSID(1, "bssid"),
        SSID(2, "ssid"),
        LEVEL(3, "level"),
        TIMESTAMP(4, "timestamp"),
        CAPABILITES(5, "capabilites"),
        AUTO_JOIN_STATUS(6, "autoJoinStatus"),
        NUM_CONNECTION(7, "numConnection"),
        DISTANCE_CM(8, "distanceCm"),
        FREQUENCY(9, "frequency"),
        LAST_KNOWN_LOCATION(10, "lastKnownLocation");
        
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
                    return TIMESTAMP;
                case 5:
                    return CAPABILITES;
                case 6:
                    return AUTO_JOIN_STATUS;
                case 7:
                    return NUM_CONNECTION;
                case 8:
                    return DISTANCE_CM;
                case 9:
                    return FREQUENCY;
                case 10:
                    return LAST_KNOWN_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifi$a */
    public static class C8615a extends C25239c<MVWifi> {
        public C8615a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWifi mVWifi = (MVWifi) tBase;
            MVDeviceLocation mVDeviceLocation = mVWifi.lastKnownLocation;
            if (mVDeviceLocation != null) {
                mVDeviceLocation.mo26817u();
            }
            C25113c cVar = MVWifi.f25460b;
            gVar.mo61687K();
            if (mVWifi.bssid != null) {
                gVar.mo61711x(MVWifi.f25460b);
                gVar.mo61686J(mVWifi.bssid);
                gVar.mo61712y();
            }
            if (mVWifi.ssid != null) {
                gVar.mo61711x(MVWifi.f25461c);
                gVar.mo61686J(mVWifi.ssid);
                gVar.mo61712y();
            }
            if (mVWifi.level != null) {
                gVar.mo61711x(MVWifi.f25462d);
                gVar.mo61686J(mVWifi.level);
                gVar.mo61712y();
            }
            if (mVWifi.mo26939p()) {
                gVar.mo61711x(MVWifi.f25463e);
                gVar.mo61679C(mVWifi.timestamp);
                gVar.mo61712y();
            }
            if (mVWifi.capabilites != null && mVWifi.mo26931h()) {
                gVar.mo61711x(MVWifi.f25464f);
                gVar.mo61686J(mVWifi.capabilites);
                gVar.mo61712y();
            }
            if (mVWifi.mo26929f()) {
                gVar.mo61711x(MVWifi.f25465g);
                gVar.mo61678B(mVWifi.autoJoinStatus);
                gVar.mo61712y();
            }
            if (mVWifi.mo26937m()) {
                gVar.mo61711x(MVWifi.f25466h);
                gVar.mo61678B(mVWifi.numConnection);
                gVar.mo61712y();
            }
            if (mVWifi.mo26933i()) {
                gVar.mo61711x(MVWifi.f25467i);
                gVar.mo61678B(mVWifi.distanceCm);
                gVar.mo61712y();
            }
            if (mVWifi.mo26934j()) {
                gVar.mo61711x(MVWifi.f25468j);
                gVar.mo61678B(mVWifi.frequency);
                gVar.mo61712y();
            }
            if (mVWifi.lastKnownLocation != null && mVWifi.mo26935k()) {
                gVar.mo61711x(MVWifi.f25469k);
                mVWifi.lastKnownLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWifi mVWifi = (MVWifi) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVDeviceLocation mVDeviceLocation = mVWifi.lastKnownLocation;
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
                            mVWifi.bssid = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifi.ssid = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifi.level = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifi.timestamp = gVar.mo61697j();
                            mVWifi.mo26945u();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifi.capabilites = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifi.autoJoinStatus = gVar.mo61696i();
                            mVWifi.mo26940q();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifi.numConnection = gVar.mo61696i();
                            mVWifi.mo26943t();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifi.distanceCm = gVar.mo61696i();
                            mVWifi.mo26941r();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWifi.frequency = gVar.mo61696i();
                            mVWifi.mo26942s();
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDeviceLocation mVDeviceLocation2 = new MVDeviceLocation();
                            mVWifi.lastKnownLocation = mVDeviceLocation2;
                            mVDeviceLocation2.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifi$b */
    public static class C8616b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8615a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifi$c */
    public static class C8617c extends C25240d<MVWifi> {
        public C8617c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWifi mVWifi = (MVWifi) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWifi.mo26930g()) {
                bitSet.set(0);
            }
            if (mVWifi.mo26938o()) {
                bitSet.set(1);
            }
            if (mVWifi.mo26936l()) {
                bitSet.set(2);
            }
            if (mVWifi.mo26939p()) {
                bitSet.set(3);
            }
            if (mVWifi.mo26931h()) {
                bitSet.set(4);
            }
            if (mVWifi.mo26929f()) {
                bitSet.set(5);
            }
            if (mVWifi.mo26937m()) {
                bitSet.set(6);
            }
            if (mVWifi.mo26933i()) {
                bitSet.set(7);
            }
            if (mVWifi.mo26934j()) {
                bitSet.set(8);
            }
            if (mVWifi.mo26935k()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVWifi.mo26930g()) {
                jVar.mo61686J(mVWifi.bssid);
            }
            if (mVWifi.mo26938o()) {
                jVar.mo61686J(mVWifi.ssid);
            }
            if (mVWifi.mo26936l()) {
                jVar.mo61686J(mVWifi.level);
            }
            if (mVWifi.mo26939p()) {
                jVar.mo61679C(mVWifi.timestamp);
            }
            if (mVWifi.mo26931h()) {
                jVar.mo61686J(mVWifi.capabilites);
            }
            if (mVWifi.mo26929f()) {
                jVar.mo61678B(mVWifi.autoJoinStatus);
            }
            if (mVWifi.mo26937m()) {
                jVar.mo61678B(mVWifi.numConnection);
            }
            if (mVWifi.mo26933i()) {
                jVar.mo61678B(mVWifi.distanceCm);
            }
            if (mVWifi.mo26934j()) {
                jVar.mo61678B(mVWifi.frequency);
            }
            if (mVWifi.mo26935k()) {
                mVWifi.lastKnownLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWifi mVWifi = (MVWifi) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                mVWifi.bssid = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWifi.ssid = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVWifi.level = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVWifi.timestamp = jVar.mo61697j();
                mVWifi.mo26945u();
            }
            if (T.get(4)) {
                mVWifi.capabilites = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVWifi.autoJoinStatus = jVar.mo61696i();
                mVWifi.mo26940q();
            }
            if (T.get(6)) {
                mVWifi.numConnection = jVar.mo61696i();
                mVWifi.mo26943t();
            }
            if (T.get(7)) {
                mVWifi.distanceCm = jVar.mo61696i();
                mVWifi.mo26941r();
            }
            if (T.get(8)) {
                mVWifi.frequency = jVar.mo61696i();
                mVWifi.mo26942s();
            }
            if (T.get(9)) {
                MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                mVWifi.lastKnownLocation = mVDeviceLocation;
                mVDeviceLocation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifi$d */
    public static class C8618d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8617c(0);
        }
    }

    static {
        new C17394d0("MVWifi");
        HashMap hashMap = new HashMap();
        f25470l = hashMap;
        hashMap.put(C25239c.class, new C8616b());
        hashMap.put(C25240d.class, new C8618d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BSSID, new FieldMetaData("bssid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SSID, new FieldMetaData("ssid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEVEL, new FieldMetaData("level", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.CAPABILITES, new FieldMetaData("capabilites", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AUTO_JOIN_STATUS, new FieldMetaData("autoJoinStatus", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NUM_CONNECTION, new FieldMetaData("numConnection", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DISTANCE_CM, new FieldMetaData("distanceCm", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FREQUENCY, new FieldMetaData("frequency", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LAST_KNOWN_LOCATION, new FieldMetaData("lastKnownLocation", (byte) 2, new StructMetaData(MVDeviceLocation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25471m = unmodifiableMap;
        FieldMetaData.m61947a(MVWifi.class, unmodifiableMap);
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
        ((C25238b) f25470l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25470l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWifi mVWifi = (MVWifi) obj;
        if (!getClass().equals(mVWifi.getClass())) {
            return getClass().getName().compareTo(mVWifi.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26930g()).compareTo(Boolean.valueOf(mVWifi.mo26930g()));
        if (compareTo2 != 0 || ((mo26930g() && (compareTo2 = this.bssid.compareTo(mVWifi.bssid)) != 0) || (compareTo2 = Boolean.valueOf(mo26938o()).compareTo(Boolean.valueOf(mVWifi.mo26938o()))) != 0 || ((mo26938o() && (compareTo2 = this.ssid.compareTo(mVWifi.ssid)) != 0) || (compareTo2 = Boolean.valueOf(mo26936l()).compareTo(Boolean.valueOf(mVWifi.mo26936l()))) != 0 || ((mo26936l() && (compareTo2 = this.level.compareTo(mVWifi.level)) != 0) || (compareTo2 = Boolean.valueOf(mo26939p()).compareTo(Boolean.valueOf(mVWifi.mo26939p()))) != 0 || ((mo26939p() && (compareTo2 = C25082a.m62840d(this.timestamp, mVWifi.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo26931h()).compareTo(Boolean.valueOf(mVWifi.mo26931h()))) != 0 || ((mo26931h() && (compareTo2 = this.capabilites.compareTo(mVWifi.capabilites)) != 0) || (compareTo2 = Boolean.valueOf(mo26929f()).compareTo(Boolean.valueOf(mVWifi.mo26929f()))) != 0 || ((mo26929f() && (compareTo2 = C25082a.m62839c(this.autoJoinStatus, mVWifi.autoJoinStatus)) != 0) || (compareTo2 = Boolean.valueOf(mo26937m()).compareTo(Boolean.valueOf(mVWifi.mo26937m()))) != 0 || ((mo26937m() && (compareTo2 = C25082a.m62839c(this.numConnection, mVWifi.numConnection)) != 0) || (compareTo2 = Boolean.valueOf(mo26933i()).compareTo(Boolean.valueOf(mVWifi.mo26933i()))) != 0 || ((mo26933i() && (compareTo2 = C25082a.m62839c(this.distanceCm, mVWifi.distanceCm)) != 0) || (compareTo2 = Boolean.valueOf(mo26934j()).compareTo(Boolean.valueOf(mVWifi.mo26934j()))) != 0 || ((mo26934j() && (compareTo2 = C25082a.m62839c(this.frequency, mVWifi.frequency)) != 0) || (compareTo2 = Boolean.valueOf(mo26935k()).compareTo(Boolean.valueOf(mVWifi.mo26935k()))) != 0)))))))))) {
            return compareTo2;
        }
        if (!mo26935k() || (compareTo = this.lastKnownLocation.compareTo(mVWifi.lastKnownLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWifi)) {
            return false;
        }
        MVWifi mVWifi = (MVWifi) obj;
        boolean g = mo26930g();
        boolean g2 = mVWifi.mo26930g();
        if ((g || g2) && (!g || !g2 || !this.bssid.equals(mVWifi.bssid))) {
            return false;
        }
        boolean o = mo26938o();
        boolean o2 = mVWifi.mo26938o();
        if ((o || o2) && (!o || !o2 || !this.ssid.equals(mVWifi.ssid))) {
            return false;
        }
        boolean l = mo26936l();
        boolean l2 = mVWifi.mo26936l();
        if ((l || l2) && (!l || !l2 || !this.level.equals(mVWifi.level))) {
            return false;
        }
        boolean p = mo26939p();
        boolean p2 = mVWifi.mo26939p();
        if ((p || p2) && (!p || !p2 || this.timestamp != mVWifi.timestamp)) {
            return false;
        }
        boolean h = mo26931h();
        boolean h2 = mVWifi.mo26931h();
        if ((h || h2) && (!h || !h2 || !this.capabilites.equals(mVWifi.capabilites))) {
            return false;
        }
        boolean f = mo26929f();
        boolean f2 = mVWifi.mo26929f();
        if ((f || f2) && (!f || !f2 || this.autoJoinStatus != mVWifi.autoJoinStatus)) {
            return false;
        }
        boolean m = mo26937m();
        boolean m2 = mVWifi.mo26937m();
        if ((m || m2) && (!m || !m2 || this.numConnection != mVWifi.numConnection)) {
            return false;
        }
        boolean i = mo26933i();
        boolean i2 = mVWifi.mo26933i();
        if ((i || i2) && (!i || !i2 || this.distanceCm != mVWifi.distanceCm)) {
            return false;
        }
        boolean j = mo26934j();
        boolean j2 = mVWifi.mo26934j();
        if ((j || j2) && (!j || !j2 || this.frequency != mVWifi.frequency)) {
            return false;
        }
        boolean k = mo26935k();
        boolean k2 = mVWifi.mo26935k();
        if ((k || k2) && (!k || !k2 || !this.lastKnownLocation.mo26798a(mVWifi.lastKnownLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26929f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo26930g() {
        return this.bssid != null;
    }

    /* renamed from: h */
    public final boolean mo26931h() {
        return this.capabilites != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26933i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo26934j() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: k */
    public final boolean mo26935k() {
        return this.lastKnownLocation != null;
    }

    /* renamed from: l */
    public final boolean mo26936l() {
        return this.level != null;
    }

    /* renamed from: m */
    public final boolean mo26937m() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: o */
    public final boolean mo26938o() {
        return this.ssid != null;
    }

    /* renamed from: p */
    public final boolean mo26939p() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: q */
    public final void mo26940q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: r */
    public final void mo26941r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: s */
    public final void mo26942s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: t */
    public final void mo26943t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWifi(", "bssid:");
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
        if (mo26939p()) {
            n.append(", ");
            n.append("timestamp:");
            n.append(this.timestamp);
        }
        if (mo26931h()) {
            n.append(", ");
            n.append("capabilites:");
            String str4 = this.capabilites;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo26929f()) {
            n.append(", ");
            n.append("autoJoinStatus:");
            n.append(this.autoJoinStatus);
        }
        if (mo26937m()) {
            n.append(", ");
            n.append("numConnection:");
            n.append(this.numConnection);
        }
        if (mo26933i()) {
            n.append(", ");
            n.append("distanceCm:");
            n.append(this.distanceCm);
        }
        if (mo26934j()) {
            n.append(", ");
            n.append("frequency:");
            n.append(this.frequency);
        }
        if (mo26935k()) {
            n.append(", ");
            n.append("lastKnownLocation:");
            MVDeviceLocation mVDeviceLocation = this.lastKnownLocation;
            if (mVDeviceLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVDeviceLocation);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo26945u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }
}
