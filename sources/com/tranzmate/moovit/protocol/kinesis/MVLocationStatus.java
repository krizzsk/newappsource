package com.tranzmate.moovit.protocol.kinesis;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVLocationStatus implements TBase<MVLocationStatus, _Fields>, Serializable, Cloneable, Comparable<MVLocationStatus> {

    /* renamed from: b */
    public static final C25113c f25932b = new C25113c("locationMode", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25933c = new C25113c("accessFineLocation", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f25934d = new C25113c("accessCoarseLocation", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f25935e = new C25113c("timestamp", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f25936f = new C25113c("updateReason", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f25937g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25938h;
    private byte __isset_bitfield = 0;
    public boolean accessCoarseLocation;
    public boolean accessFineLocation;
    public MVLocationMode locationMode;
    private _Fields[] optionals = {_Fields.UPDATE_REASON};
    public long timestamp;
    public MVUpdateReason updateReason;

    public enum _Fields implements C25085c {
        LOCATION_MODE(1, "locationMode"),
        ACCESS_FINE_LOCATION(2, "accessFineLocation"),
        ACCESS_COARSE_LOCATION(3, "accessCoarseLocation"),
        TIMESTAMP(4, "timestamp"),
        UPDATE_REASON(5, "updateReason");
        
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
                return LOCATION_MODE;
            }
            if (i == 2) {
                return ACCESS_FINE_LOCATION;
            }
            if (i == 3) {
                return ACCESS_COARSE_LOCATION;
            }
            if (i == 4) {
                return TIMESTAMP;
            }
            if (i != 5) {
                return null;
            }
            return UPDATE_REASON;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVLocationStatus$a */
    public static class C8915a extends C25239c<MVLocationStatus> {
        public C8915a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocationStatus mVLocationStatus = (MVLocationStatus) tBase;
            mVLocationStatus.getClass();
            C25113c cVar = MVLocationStatus.f25932b;
            gVar.mo61687K();
            if (mVLocationStatus.locationMode != null) {
                gVar.mo61711x(MVLocationStatus.f25932b);
                gVar.mo61678B(mVLocationStatus.locationMode.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVLocationStatus.f25933c);
            gVar.mo61708u(mVLocationStatus.accessFineLocation);
            gVar.mo61712y();
            gVar.mo61711x(MVLocationStatus.f25934d);
            gVar.mo61708u(mVLocationStatus.accessCoarseLocation);
            gVar.mo61712y();
            gVar.mo61711x(MVLocationStatus.f25935e);
            gVar.mo61679C(mVLocationStatus.timestamp);
            gVar.mo61712y();
            if (mVLocationStatus.updateReason != null && mVLocationStatus.mo27765j()) {
                gVar.mo61711x(MVLocationStatus.f25936f);
                gVar.mo61678B(mVLocationStatus.updateReason.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocationStatus mVLocationStatus = (MVLocationStatus) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLocationStatus.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVLocationStatus.updateReason = MVUpdateReason.findByValue(gVar.mo61696i());
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 10) {
                                mVLocationStatus.timestamp = gVar.mo61697j();
                                mVLocationStatus.mo27768m();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVLocationStatus.accessCoarseLocation = gVar.mo61690c();
                            mVLocationStatus.mo27766k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVLocationStatus.accessFineLocation = gVar.mo61690c();
                        mVLocationStatus.mo27767l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLocationStatus.locationMode = MVLocationMode.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVLocationStatus$b */
    public static class C8916b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8915a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVLocationStatus$c */
    public static class C8917c extends C25240d<MVLocationStatus> {
        public C8917c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocationStatus mVLocationStatus = (MVLocationStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLocationStatus.mo27762h()) {
                bitSet.set(0);
            }
            if (mVLocationStatus.mo27761g()) {
                bitSet.set(1);
            }
            if (mVLocationStatus.mo27760f()) {
                bitSet.set(2);
            }
            if (mVLocationStatus.mo27764i()) {
                bitSet.set(3);
            }
            if (mVLocationStatus.mo27765j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVLocationStatus.mo27762h()) {
                jVar.mo61678B(mVLocationStatus.locationMode.getValue());
            }
            if (mVLocationStatus.mo27761g()) {
                jVar.mo61708u(mVLocationStatus.accessFineLocation);
            }
            if (mVLocationStatus.mo27760f()) {
                jVar.mo61708u(mVLocationStatus.accessCoarseLocation);
            }
            if (mVLocationStatus.mo27764i()) {
                jVar.mo61679C(mVLocationStatus.timestamp);
            }
            if (mVLocationStatus.mo27765j()) {
                jVar.mo61678B(mVLocationStatus.updateReason.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocationStatus mVLocationStatus = (MVLocationStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVLocationStatus.locationMode = MVLocationMode.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVLocationStatus.accessFineLocation = jVar.mo61690c();
                mVLocationStatus.mo27767l();
            }
            if (T.get(2)) {
                mVLocationStatus.accessCoarseLocation = jVar.mo61690c();
                mVLocationStatus.mo27766k();
            }
            if (T.get(3)) {
                mVLocationStatus.timestamp = jVar.mo61697j();
                mVLocationStatus.mo27768m();
            }
            if (T.get(4)) {
                mVLocationStatus.updateReason = MVUpdateReason.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVLocationStatus$d */
    public static class C8918d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8917c(0);
        }
    }

    static {
        new C17394d0("MVLocationStatus");
        HashMap hashMap = new HashMap();
        f25937g = hashMap;
        hashMap.put(C25239c.class, new C8916b());
        hashMap.put(C25240d.class, new C8918d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION_MODE, new FieldMetaData("locationMode", (byte) 3, new EnumMetaData(MVLocationMode.class)));
        enumMap.put(_Fields.ACCESS_FINE_LOCATION, new FieldMetaData("accessFineLocation", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ACCESS_COARSE_LOCATION, new FieldMetaData("accessCoarseLocation", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.UPDATE_REASON, new FieldMetaData("updateReason", (byte) 2, new EnumMetaData(MVUpdateReason.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25938h = unmodifiableMap;
        FieldMetaData.m61947a(MVLocationStatus.class, unmodifiableMap);
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
        ((C25238b) f25937g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25937g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLocationStatus mVLocationStatus = (MVLocationStatus) obj;
        if (!getClass().equals(mVLocationStatus.getClass())) {
            return getClass().getName().compareTo(mVLocationStatus.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27762h()).compareTo(Boolean.valueOf(mVLocationStatus.mo27762h()));
        if (compareTo2 != 0 || ((mo27762h() && (compareTo2 = this.locationMode.compareTo(mVLocationStatus.locationMode)) != 0) || (compareTo2 = Boolean.valueOf(mo27761g()).compareTo(Boolean.valueOf(mVLocationStatus.mo27761g()))) != 0 || ((mo27761g() && (compareTo2 = C25082a.m62848l(this.accessFineLocation, mVLocationStatus.accessFineLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo27760f()).compareTo(Boolean.valueOf(mVLocationStatus.mo27760f()))) != 0 || ((mo27760f() && (compareTo2 = C25082a.m62848l(this.accessCoarseLocation, mVLocationStatus.accessCoarseLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo27764i()).compareTo(Boolean.valueOf(mVLocationStatus.mo27764i()))) != 0 || ((mo27764i() && (compareTo2 = C25082a.m62840d(this.timestamp, mVLocationStatus.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo27765j()).compareTo(Boolean.valueOf(mVLocationStatus.mo27765j()))) != 0))))) {
            return compareTo2;
        }
        if (!mo27765j() || (compareTo = this.updateReason.compareTo(mVLocationStatus.updateReason)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLocationStatus)) {
            return false;
        }
        MVLocationStatus mVLocationStatus = (MVLocationStatus) obj;
        boolean h = mo27762h();
        boolean h2 = mVLocationStatus.mo27762h();
        if (((h || h2) && (!h || !h2 || !this.locationMode.equals(mVLocationStatus.locationMode))) || this.accessFineLocation != mVLocationStatus.accessFineLocation || this.accessCoarseLocation != mVLocationStatus.accessCoarseLocation || this.timestamp != mVLocationStatus.timestamp) {
            return false;
        }
        boolean j = mo27765j();
        boolean j2 = mVLocationStatus.mo27765j();
        if ((j || j2) && (!j || !j2 || !this.updateReason.equals(mVLocationStatus.updateReason))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27760f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27761g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27762h() {
        return this.locationMode != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27764i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo27765j() {
        return this.updateReason != null;
    }

    /* renamed from: k */
    public final void mo27766k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo27767l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo27768m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLocationStatus(", "locationMode:");
        MVLocationMode mVLocationMode = this.locationMode;
        if (mVLocationMode == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationMode);
        }
        n.append(", ");
        n.append("accessFineLocation:");
        C13555b.m33977q(n, this.accessFineLocation, ", ", "accessCoarseLocation:");
        C13555b.m33977q(n, this.accessCoarseLocation, ", ", "timestamp:");
        n.append(this.timestamp);
        if (mo27765j()) {
            n.append(", ");
            n.append("updateReason:");
            MVUpdateReason mVUpdateReason = this.updateReason;
            if (mVUpdateReason == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUpdateReason);
            }
        }
        n.append(")");
        return n.toString();
    }
}
