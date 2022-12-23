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

public class MVBluetoothConnectivity implements TBase<MVBluetoothConnectivity, _Fields>, Serializable, Cloneable, Comparable<MVBluetoothConnectivity> {

    /* renamed from: b */
    public static final C25113c f25348b = new C25113c("bssid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25349c = new C25113c("ssid", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25350d = new C25113c("connected", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f25351e = new C25113c("deviceType", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f25352f = new C25113c("deviceSubType", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f25353g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25354h;
    private byte __isset_bitfield = 0;
    public String bssid;
    public boolean connected;
    public String deviceSubType;
    public String deviceType;
    public String ssid;

    public enum _Fields implements C25085c {
        BSSID(1, "bssid"),
        SSID(2, "ssid"),
        CONNECTED(3, "connected"),
        DEVICE_TYPE(4, "deviceType"),
        DEVICE_SUB_TYPE(5, "deviceSubType");
        
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
                return BSSID;
            }
            if (i == 2) {
                return SSID;
            }
            if (i == 3) {
                return CONNECTED;
            }
            if (i == 4) {
                return DEVICE_TYPE;
            }
            if (i != 5) {
                return null;
            }
            return DEVICE_SUB_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBluetoothConnectivity$a */
    public static class C8557a extends C25239c<MVBluetoothConnectivity> {
        public C8557a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBluetoothConnectivity mVBluetoothConnectivity = (MVBluetoothConnectivity) tBase;
            mVBluetoothConnectivity.getClass();
            C25113c cVar = MVBluetoothConnectivity.f25348b;
            gVar.mo61687K();
            if (mVBluetoothConnectivity.bssid != null) {
                gVar.mo61711x(MVBluetoothConnectivity.f25348b);
                gVar.mo61686J(mVBluetoothConnectivity.bssid);
                gVar.mo61712y();
            }
            if (mVBluetoothConnectivity.ssid != null) {
                gVar.mo61711x(MVBluetoothConnectivity.f25349c);
                gVar.mo61686J(mVBluetoothConnectivity.ssid);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVBluetoothConnectivity.f25350d);
            gVar.mo61708u(mVBluetoothConnectivity.connected);
            gVar.mo61712y();
            if (mVBluetoothConnectivity.deviceType != null) {
                gVar.mo61711x(MVBluetoothConnectivity.f25351e);
                gVar.mo61686J(mVBluetoothConnectivity.deviceType);
                gVar.mo61712y();
            }
            if (mVBluetoothConnectivity.deviceSubType != null) {
                gVar.mo61711x(MVBluetoothConnectivity.f25352f);
                gVar.mo61686J(mVBluetoothConnectivity.deviceSubType);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBluetoothConnectivity mVBluetoothConnectivity = (MVBluetoothConnectivity) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBluetoothConnectivity.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVBluetoothConnectivity.deviceSubType = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVBluetoothConnectivity.deviceType = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVBluetoothConnectivity.connected = gVar.mo61690c();
                            mVBluetoothConnectivity.mo26771k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVBluetoothConnectivity.ssid = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVBluetoothConnectivity.bssid = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBluetoothConnectivity$b */
    public static class C8558b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8557a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBluetoothConnectivity$c */
    public static class C8559c extends C25240d<MVBluetoothConnectivity> {
        public C8559c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBluetoothConnectivity mVBluetoothConnectivity = (MVBluetoothConnectivity) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBluetoothConnectivity.mo26765f()) {
                bitSet.set(0);
            }
            if (mVBluetoothConnectivity.mo26770j()) {
                bitSet.set(1);
            }
            if (mVBluetoothConnectivity.mo26766g()) {
                bitSet.set(2);
            }
            if (mVBluetoothConnectivity.mo26769i()) {
                bitSet.set(3);
            }
            if (mVBluetoothConnectivity.mo26767h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVBluetoothConnectivity.mo26765f()) {
                jVar.mo61686J(mVBluetoothConnectivity.bssid);
            }
            if (mVBluetoothConnectivity.mo26770j()) {
                jVar.mo61686J(mVBluetoothConnectivity.ssid);
            }
            if (mVBluetoothConnectivity.mo26766g()) {
                jVar.mo61708u(mVBluetoothConnectivity.connected);
            }
            if (mVBluetoothConnectivity.mo26769i()) {
                jVar.mo61686J(mVBluetoothConnectivity.deviceType);
            }
            if (mVBluetoothConnectivity.mo26767h()) {
                jVar.mo61686J(mVBluetoothConnectivity.deviceSubType);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBluetoothConnectivity mVBluetoothConnectivity = (MVBluetoothConnectivity) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVBluetoothConnectivity.bssid = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVBluetoothConnectivity.ssid = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVBluetoothConnectivity.connected = jVar.mo61690c();
                mVBluetoothConnectivity.mo26771k();
            }
            if (T.get(3)) {
                mVBluetoothConnectivity.deviceType = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVBluetoothConnectivity.deviceSubType = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBluetoothConnectivity$d */
    public static class C8560d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8559c(0);
        }
    }

    static {
        new C17394d0("MVBluetoothConnectivity");
        HashMap hashMap = new HashMap();
        f25353g = hashMap;
        hashMap.put(C25239c.class, new C8558b());
        hashMap.put(C25240d.class, new C8560d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BSSID, new FieldMetaData("bssid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SSID, new FieldMetaData("ssid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CONNECTED, new FieldMetaData("connected", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DEVICE_TYPE, new FieldMetaData("deviceType", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DEVICE_SUB_TYPE, new FieldMetaData("deviceSubType", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25354h = unmodifiableMap;
        FieldMetaData.m61947a(MVBluetoothConnectivity.class, unmodifiableMap);
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
        ((C25238b) f25353g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25353g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBluetoothConnectivity mVBluetoothConnectivity = (MVBluetoothConnectivity) obj;
        if (!getClass().equals(mVBluetoothConnectivity.getClass())) {
            return getClass().getName().compareTo(mVBluetoothConnectivity.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26765f()).compareTo(Boolean.valueOf(mVBluetoothConnectivity.mo26765f()));
        if (compareTo2 != 0 || ((mo26765f() && (compareTo2 = this.bssid.compareTo(mVBluetoothConnectivity.bssid)) != 0) || (compareTo2 = Boolean.valueOf(mo26770j()).compareTo(Boolean.valueOf(mVBluetoothConnectivity.mo26770j()))) != 0 || ((mo26770j() && (compareTo2 = this.ssid.compareTo(mVBluetoothConnectivity.ssid)) != 0) || (compareTo2 = Boolean.valueOf(mo26766g()).compareTo(Boolean.valueOf(mVBluetoothConnectivity.mo26766g()))) != 0 || ((mo26766g() && (compareTo2 = C25082a.m62848l(this.connected, mVBluetoothConnectivity.connected)) != 0) || (compareTo2 = Boolean.valueOf(mo26769i()).compareTo(Boolean.valueOf(mVBluetoothConnectivity.mo26769i()))) != 0 || ((mo26769i() && (compareTo2 = this.deviceType.compareTo(mVBluetoothConnectivity.deviceType)) != 0) || (compareTo2 = Boolean.valueOf(mo26767h()).compareTo(Boolean.valueOf(mVBluetoothConnectivity.mo26767h()))) != 0))))) {
            return compareTo2;
        }
        if (!mo26767h() || (compareTo = this.deviceSubType.compareTo(mVBluetoothConnectivity.deviceSubType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBluetoothConnectivity)) {
            return false;
        }
        MVBluetoothConnectivity mVBluetoothConnectivity = (MVBluetoothConnectivity) obj;
        boolean f = mo26765f();
        boolean f2 = mVBluetoothConnectivity.mo26765f();
        if ((f || f2) && (!f || !f2 || !this.bssid.equals(mVBluetoothConnectivity.bssid))) {
            return false;
        }
        boolean j = mo26770j();
        boolean j2 = mVBluetoothConnectivity.mo26770j();
        if (((j || j2) && (!j || !j2 || !this.ssid.equals(mVBluetoothConnectivity.ssid))) || this.connected != mVBluetoothConnectivity.connected) {
            return false;
        }
        boolean i = mo26769i();
        boolean i2 = mVBluetoothConnectivity.mo26769i();
        if ((i || i2) && (!i || !i2 || !this.deviceType.equals(mVBluetoothConnectivity.deviceType))) {
            return false;
        }
        boolean h = mo26767h();
        boolean h2 = mVBluetoothConnectivity.mo26767h();
        if ((h || h2) && (!h || !h2 || !this.deviceSubType.equals(mVBluetoothConnectivity.deviceSubType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26765f() {
        return this.bssid != null;
    }

    /* renamed from: g */
    public final boolean mo26766g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo26767h() {
        return this.deviceSubType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26769i() {
        return this.deviceType != null;
    }

    /* renamed from: j */
    public final boolean mo26770j() {
        return this.ssid != null;
    }

    /* renamed from: k */
    public final void mo26771k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBluetoothConnectivity(", "bssid:");
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
        n.append("connected:");
        C13555b.m33977q(n, this.connected, ", ", "deviceType:");
        String str3 = this.deviceType;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("deviceSubType:");
        String str4 = this.deviceSubType;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }
}
