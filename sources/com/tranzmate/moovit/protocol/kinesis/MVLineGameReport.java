package com.tranzmate.moovit.protocol.kinesis;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
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

public class MVLineGameReport implements TBase<MVLineGameReport, _Fields>, Serializable, Cloneable, Comparable<MVLineGameReport> {

    /* renamed from: b */
    public static final C25113c f25925b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25926c = new C25113c("lineId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25927d = new C25113c("arriving", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f25928e = new C25113c("timestamp", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f25929f = new C25113c("userLocation", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f25930g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25931h;
    private byte __isset_bitfield = 0;
    public boolean arriving;
    public int lineId;
    private _Fields[] optionals = {_Fields.USER_LOCATION};
    public int stopId;
    public long timestamp;
    public MVGpsLocation userLocation;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        LINE_ID(2, "lineId"),
        ARRIVING(3, "arriving"),
        TIMESTAMP(4, "timestamp"),
        USER_LOCATION(5, "userLocation");
        
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
                return STOP_ID;
            }
            if (i == 2) {
                return LINE_ID;
            }
            if (i == 3) {
                return ARRIVING;
            }
            if (i == 4) {
                return TIMESTAMP;
            }
            if (i != 5) {
                return null;
            }
            return USER_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVLineGameReport$a */
    public static class C8911a extends C25239c<MVLineGameReport> {
        public C8911a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineGameReport mVLineGameReport = (MVLineGameReport) tBase;
            MVGpsLocation mVGpsLocation = mVLineGameReport.userLocation;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVLineGameReport.f25925b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineGameReport.f25925b);
            gVar.mo61678B(mVLineGameReport.stopId);
            gVar.mo61712y();
            gVar.mo61711x(MVLineGameReport.f25926c);
            gVar.mo61678B(mVLineGameReport.lineId);
            gVar.mo61712y();
            gVar.mo61711x(MVLineGameReport.f25927d);
            gVar.mo61708u(mVLineGameReport.arriving);
            gVar.mo61712y();
            gVar.mo61711x(MVLineGameReport.f25928e);
            gVar.mo61679C(mVLineGameReport.timestamp);
            gVar.mo61712y();
            if (mVLineGameReport.userLocation != null && mVLineGameReport.mo27749j()) {
                gVar.mo61711x(MVLineGameReport.f25929f);
                mVLineGameReport.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineGameReport mVLineGameReport = (MVLineGameReport) tBase;
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
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVGpsLocation mVGpsLocation = new MVGpsLocation();
                                    mVLineGameReport.userLocation = mVGpsLocation;
                                    mVGpsLocation.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 10) {
                                mVLineGameReport.timestamp = gVar.mo61697j();
                                mVLineGameReport.mo27753o();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVLineGameReport.arriving = gVar.mo61690c();
                            mVLineGameReport.mo27750k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVLineGameReport.lineId = gVar.mo61696i();
                        mVLineGameReport.mo27751l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLineGameReport.stopId = gVar.mo61696i();
                    mVLineGameReport.mo27752m();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVGpsLocation mVGpsLocation2 = mVLineGameReport.userLocation;
            if (mVGpsLocation2 != null) {
                mVGpsLocation2.mo26193r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVLineGameReport$b */
    public static class C8912b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8911a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVLineGameReport$c */
    public static class C8913c extends C25240d<MVLineGameReport> {
        public C8913c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineGameReport mVLineGameReport = (MVLineGameReport) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineGameReport.mo27746h()) {
                bitSet.set(0);
            }
            if (mVLineGameReport.mo27745g()) {
                bitSet.set(1);
            }
            if (mVLineGameReport.mo27744f()) {
                bitSet.set(2);
            }
            if (mVLineGameReport.mo27748i()) {
                bitSet.set(3);
            }
            if (mVLineGameReport.mo27749j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVLineGameReport.mo27746h()) {
                jVar.mo61678B(mVLineGameReport.stopId);
            }
            if (mVLineGameReport.mo27745g()) {
                jVar.mo61678B(mVLineGameReport.lineId);
            }
            if (mVLineGameReport.mo27744f()) {
                jVar.mo61708u(mVLineGameReport.arriving);
            }
            if (mVLineGameReport.mo27748i()) {
                jVar.mo61679C(mVLineGameReport.timestamp);
            }
            if (mVLineGameReport.mo27749j()) {
                mVLineGameReport.userLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineGameReport mVLineGameReport = (MVLineGameReport) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVLineGameReport.stopId = jVar.mo61696i();
                mVLineGameReport.mo27752m();
            }
            if (T.get(1)) {
                mVLineGameReport.lineId = jVar.mo61696i();
                mVLineGameReport.mo27751l();
            }
            if (T.get(2)) {
                mVLineGameReport.arriving = jVar.mo61690c();
                mVLineGameReport.mo27750k();
            }
            if (T.get(3)) {
                mVLineGameReport.timestamp = jVar.mo61697j();
                mVLineGameReport.mo27753o();
            }
            if (T.get(4)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVLineGameReport.userLocation = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVLineGameReport$d */
    public static class C8914d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8913c(0);
        }
    }

    static {
        new C17394d0("MVLineGameReport");
        HashMap hashMap = new HashMap();
        f25930g = hashMap;
        hashMap.put(C25239c.class, new C8912b());
        hashMap.put(C25240d.class, new C8914d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ARRIVING, new FieldMetaData("arriving", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVGpsLocation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25931h = unmodifiableMap;
        FieldMetaData.m61947a(MVLineGameReport.class, unmodifiableMap);
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
        ((C25238b) f25930g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25930g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLineGameReport mVLineGameReport = (MVLineGameReport) obj;
        if (!getClass().equals(mVLineGameReport.getClass())) {
            return getClass().getName().compareTo(mVLineGameReport.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27746h()).compareTo(Boolean.valueOf(mVLineGameReport.mo27746h()));
        if (compareTo2 != 0 || ((mo27746h() && (compareTo2 = C25082a.m62839c(this.stopId, mVLineGameReport.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo27745g()).compareTo(Boolean.valueOf(mVLineGameReport.mo27745g()))) != 0 || ((mo27745g() && (compareTo2 = C25082a.m62839c(this.lineId, mVLineGameReport.lineId)) != 0) || (compareTo2 = Boolean.valueOf(mo27744f()).compareTo(Boolean.valueOf(mVLineGameReport.mo27744f()))) != 0 || ((mo27744f() && (compareTo2 = C25082a.m62848l(this.arriving, mVLineGameReport.arriving)) != 0) || (compareTo2 = Boolean.valueOf(mo27748i()).compareTo(Boolean.valueOf(mVLineGameReport.mo27748i()))) != 0 || ((mo27748i() && (compareTo2 = C25082a.m62840d(this.timestamp, mVLineGameReport.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo27749j()).compareTo(Boolean.valueOf(mVLineGameReport.mo27749j()))) != 0))))) {
            return compareTo2;
        }
        if (!mo27749j() || (compareTo = this.userLocation.compareTo(mVLineGameReport.userLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineGameReport)) {
            return false;
        }
        MVLineGameReport mVLineGameReport = (MVLineGameReport) obj;
        if (this.stopId != mVLineGameReport.stopId || this.lineId != mVLineGameReport.lineId || this.arriving != mVLineGameReport.arriving || this.timestamp != mVLineGameReport.timestamp) {
            return false;
        }
        boolean j = mo27749j();
        boolean j2 = mVLineGameReport.mo27749j();
        if ((j || j2) && (!j || !j2 || !this.userLocation.mo26178a(mVLineGameReport.userLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27744f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo27745g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo27746h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27748i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo27749j() {
        return this.userLocation != null;
    }

    /* renamed from: k */
    public final void mo27750k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: l */
    public final void mo27751l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo27752m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo27753o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineGameReport(", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "lineId:");
        C0016g.m42z(n, this.lineId, ", ", "arriving:");
        C13555b.m33977q(n, this.arriving, ", ", "timestamp:");
        n.append(this.timestamp);
        if (mo27749j()) {
            n.append(", ");
            n.append("userLocation:");
            MVGpsLocation mVGpsLocation = this.userLocation;
            if (mVGpsLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVGpsLocation);
            }
        }
        n.append(")");
        return n.toString();
    }
}
