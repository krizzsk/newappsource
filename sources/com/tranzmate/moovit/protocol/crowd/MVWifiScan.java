package com.tranzmate.moovit.protocol.crowd;

import com.appboy.models.outgoing.FacebookUser;
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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVWifiScan implements TBase<MVWifiScan, _Fields>, Serializable, Cloneable, Comparable<MVWifiScan> {

    /* renamed from: b */
    public static final C25113c f25485b = new C25113c("wifis", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f25486c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25487d = new C25113c("timestamp", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f25488e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25489f;
    private byte __isset_bitfield = 0;
    public MVDeviceLocation location;
    private _Fields[] optionals = {_Fields.LOCATION};
    public long timestamp;
    public List<MVWifi> wifis;

    public enum _Fields implements C25085c {
        WIFIS(1, "wifis"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        TIMESTAMP(3, "timestamp");
        
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
                return WIFIS;
            }
            if (i == 2) {
                return LOCATION;
            }
            if (i != 3) {
                return null;
            }
            return TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifiScan$a */
    public static class C8623a extends C25239c<MVWifiScan> {
        public C8623a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWifiScan mVWifiScan = (MVWifiScan) tBase;
            MVDeviceLocation mVDeviceLocation = mVWifiScan.location;
            if (mVDeviceLocation != null) {
                mVDeviceLocation.mo26817u();
            }
            C25113c cVar = MVWifiScan.f25485b;
            gVar.mo61687K();
            if (mVWifiScan.wifis != null) {
                gVar.mo61711x(MVWifiScan.f25485b);
                gVar.mo61680D(new C25119e((byte) 12, mVWifiScan.wifis.size()));
                for (MVWifi X0 : mVWifiScan.wifis) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVWifiScan.location != null && mVWifiScan.mo26971f()) {
                gVar.mo61711x(MVWifiScan.f25486c);
                mVWifiScan.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWifiScan.f25487d);
            C25541a.m63891v(gVar, mVWifiScan.timestamp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWifiScan mVWifiScan = (MVWifiScan) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVWifiScan.timestamp = gVar.mo61697j();
                            mVWifiScan.mo26975i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                        mVWifiScan.location = mVDeviceLocation;
                        mVDeviceLocation.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVWifiScan.wifis = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVWifi mVWifi = new MVWifi();
                        mVWifi.mo25201C1(gVar);
                        mVWifiScan.wifis.add(mVWifi);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVDeviceLocation mVDeviceLocation2 = mVWifiScan.location;
            if (mVDeviceLocation2 != null) {
                mVDeviceLocation2.mo26817u();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifiScan$b */
    public static class C8624b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8623a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifiScan$c */
    public static class C8625c extends C25240d<MVWifiScan> {
        public C8625c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWifiScan mVWifiScan = (MVWifiScan) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWifiScan.mo26973h()) {
                bitSet.set(0);
            }
            if (mVWifiScan.mo26971f()) {
                bitSet.set(1);
            }
            if (mVWifiScan.mo26972g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVWifiScan.mo26973h()) {
                jVar.mo61678B(mVWifiScan.wifis.size());
                for (MVWifi X0 : mVWifiScan.wifis) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVWifiScan.mo26971f()) {
                mVWifiScan.location.mo25202X0(jVar);
            }
            if (mVWifiScan.mo26972g()) {
                jVar.mo61679C(mVWifiScan.timestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWifiScan mVWifiScan = (MVWifiScan) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVWifiScan.wifis = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWifi mVWifi = new MVWifi();
                    mVWifi.mo25201C1(jVar);
                    mVWifiScan.wifis.add(mVWifi);
                }
            }
            if (T.get(1)) {
                MVDeviceLocation mVDeviceLocation = new MVDeviceLocation();
                mVWifiScan.location = mVDeviceLocation;
                mVDeviceLocation.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVWifiScan.timestamp = jVar.mo61697j();
                mVWifiScan.mo26975i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVWifiScan$d */
    public static class C8626d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8625c(0);
        }
    }

    static {
        new C17394d0("MVWifiScan");
        HashMap hashMap = new HashMap();
        f25488e = hashMap;
        hashMap.put(C25239c.class, new C8624b());
        hashMap.put(C25240d.class, new C8626d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.WIFIS, new FieldMetaData("wifis", (byte) 3, new ListMetaData(new StructMetaData(MVWifi.class))));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 2, new StructMetaData(MVDeviceLocation.class)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25489f = unmodifiableMap;
        FieldMetaData.m61947a(MVWifiScan.class, unmodifiableMap);
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
        ((C25238b) f25488e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25488e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVWifiScan mVWifiScan = (MVWifiScan) obj;
        if (!getClass().equals(mVWifiScan.getClass())) {
            return getClass().getName().compareTo(mVWifiScan.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26973h()).compareTo(Boolean.valueOf(mVWifiScan.mo26973h()));
        if (compareTo != 0 || ((mo26973h() && (compareTo = C25082a.m62844h(this.wifis, mVWifiScan.wifis)) != 0) || (compareTo = Boolean.valueOf(mo26971f()).compareTo(Boolean.valueOf(mVWifiScan.mo26971f()))) != 0 || ((mo26971f() && (compareTo = this.location.compareTo(mVWifiScan.location)) != 0) || (compareTo = Boolean.valueOf(mo26972g()).compareTo(Boolean.valueOf(mVWifiScan.mo26972g()))) != 0))) {
            return compareTo;
        }
        if (!mo26972g() || (d = C25082a.m62840d(this.timestamp, mVWifiScan.timestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWifiScan)) {
            return false;
        }
        MVWifiScan mVWifiScan = (MVWifiScan) obj;
        boolean h = mo26973h();
        boolean h2 = mVWifiScan.mo26973h();
        if ((h || h2) && (!h || !h2 || !this.wifis.equals(mVWifiScan.wifis))) {
            return false;
        }
        boolean f = mo26971f();
        boolean f2 = mVWifiScan.mo26971f();
        if (((f || f2) && (!f || !f2 || !this.location.mo26798a(mVWifiScan.location))) || this.timestamp != mVWifiScan.timestamp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26971f() {
        return this.location != null;
    }

    /* renamed from: g */
    public final boolean mo26972g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo26973h() {
        return this.wifis != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26975i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWifiScan(", "wifis:");
        List<MVWifi> list = this.wifis;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo26971f()) {
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
        n.append("timestamp:");
        return C25541a.m63884o(n, this.timestamp, ")");
    }
}
