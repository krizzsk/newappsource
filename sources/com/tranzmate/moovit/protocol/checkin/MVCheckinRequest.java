package com.tranzmate.moovit.protocol.checkin;

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

public class MVCheckinRequest implements TBase<MVCheckinRequest, _Fields>, Serializable, Cloneable, Comparable<MVCheckinRequest> {

    /* renamed from: b */
    public static final C25113c f24934b = new C25113c("lineId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24935c = new C25113c("userLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24936d = new C25113c("toStopId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f24937e = new C25113c("prevGuid", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f24938f = new C25113c("enableRecording", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f24939g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f24940h;
    private byte __isset_bitfield = 0;
    public boolean enableRecording;
    public int lineId;
    private _Fields[] optionals = {_Fields.USER_LOCATION, _Fields.TO_STOP_ID, _Fields.PREV_GUID, _Fields.ENABLE_RECORDING};
    public String prevGuid;
    public int toStopId;
    public MVGpsLocation userLocation;

    public enum _Fields implements C25085c {
        LINE_ID(1, "lineId"),
        USER_LOCATION(2, "userLocation"),
        TO_STOP_ID(3, "toStopId"),
        PREV_GUID(4, "prevGuid"),
        ENABLE_RECORDING(5, "enableRecording");
        
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
                return LINE_ID;
            }
            if (i == 2) {
                return USER_LOCATION;
            }
            if (i == 3) {
                return TO_STOP_ID;
            }
            if (i == 4) {
                return PREV_GUID;
            }
            if (i != 5) {
                return null;
            }
            return ENABLE_RECORDING;
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

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckinRequest$a */
    public static class C8344a extends C25239c<MVCheckinRequest> {
        public C8344a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCheckinRequest mVCheckinRequest = (MVCheckinRequest) tBase;
            MVGpsLocation mVGpsLocation = mVCheckinRequest.userLocation;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVCheckinRequest.f24934b;
            gVar.mo61687K();
            gVar.mo61711x(MVCheckinRequest.f24934b);
            gVar.mo61678B(mVCheckinRequest.lineId);
            gVar.mo61712y();
            if (mVCheckinRequest.userLocation != null && mVCheckinRequest.mo26008j()) {
                gVar.mo61711x(MVCheckinRequest.f24935c);
                mVCheckinRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCheckinRequest.mo26007i()) {
                gVar.mo61711x(MVCheckinRequest.f24936d);
                gVar.mo61678B(mVCheckinRequest.toStopId);
                gVar.mo61712y();
            }
            if (mVCheckinRequest.prevGuid != null && mVCheckinRequest.mo26005h()) {
                gVar.mo61711x(MVCheckinRequest.f24937e);
                gVar.mo61686J(mVCheckinRequest.prevGuid);
                gVar.mo61712y();
            }
            if (mVCheckinRequest.mo26003f()) {
                gVar.mo61711x(MVCheckinRequest.f24938f);
                gVar.mo61708u(mVCheckinRequest.enableRecording);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCheckinRequest mVCheckinRequest = (MVCheckinRequest) tBase;
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
                                } else if (b == 2) {
                                    mVCheckinRequest.enableRecording = gVar.mo61690c();
                                    mVCheckinRequest.mo26009k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVCheckinRequest.prevGuid = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVCheckinRequest.toStopId = gVar.mo61696i();
                            mVCheckinRequest.mo26011m();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVGpsLocation mVGpsLocation = new MVGpsLocation();
                        mVCheckinRequest.userLocation = mVGpsLocation;
                        mVGpsLocation.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVCheckinRequest.lineId = gVar.mo61696i();
                    mVCheckinRequest.mo26010l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVGpsLocation mVGpsLocation2 = mVCheckinRequest.userLocation;
            if (mVGpsLocation2 != null) {
                mVGpsLocation2.mo26193r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckinRequest$b */
    public static class C8345b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8344a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckinRequest$c */
    public static class C8346c extends C25240d<MVCheckinRequest> {
        public C8346c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCheckinRequest mVCheckinRequest = (MVCheckinRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCheckinRequest.mo26004g()) {
                bitSet.set(0);
            }
            if (mVCheckinRequest.mo26008j()) {
                bitSet.set(1);
            }
            if (mVCheckinRequest.mo26007i()) {
                bitSet.set(2);
            }
            if (mVCheckinRequest.mo26005h()) {
                bitSet.set(3);
            }
            if (mVCheckinRequest.mo26003f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVCheckinRequest.mo26004g()) {
                jVar.mo61678B(mVCheckinRequest.lineId);
            }
            if (mVCheckinRequest.mo26008j()) {
                mVCheckinRequest.userLocation.mo25202X0(jVar);
            }
            if (mVCheckinRequest.mo26007i()) {
                jVar.mo61678B(mVCheckinRequest.toStopId);
            }
            if (mVCheckinRequest.mo26005h()) {
                jVar.mo61686J(mVCheckinRequest.prevGuid);
            }
            if (mVCheckinRequest.mo26003f()) {
                jVar.mo61708u(mVCheckinRequest.enableRecording);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCheckinRequest mVCheckinRequest = (MVCheckinRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVCheckinRequest.lineId = jVar.mo61696i();
                mVCheckinRequest.mo26010l();
            }
            if (T.get(1)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVCheckinRequest.userLocation = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVCheckinRequest.toStopId = jVar.mo61696i();
                mVCheckinRequest.mo26011m();
            }
            if (T.get(3)) {
                mVCheckinRequest.prevGuid = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVCheckinRequest.enableRecording = jVar.mo61690c();
                mVCheckinRequest.mo26009k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckinRequest$d */
    public static class C8347d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8346c(0);
        }
    }

    static {
        new C17394d0("MVCheckinRequest");
        HashMap hashMap = new HashMap();
        f24939g = hashMap;
        hashMap.put(C25239c.class, new C8345b());
        hashMap.put(C25240d.class, new C8347d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.TO_STOP_ID, new FieldMetaData("toStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PREV_GUID, new FieldMetaData("prevGuid", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ENABLE_RECORDING, new FieldMetaData("enableRecording", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24940h = unmodifiableMap;
        FieldMetaData.m61947a(MVCheckinRequest.class, unmodifiableMap);
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
        ((C25238b) f24939g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24939g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVCheckinRequest mVCheckinRequest = (MVCheckinRequest) obj;
        if (!getClass().equals(mVCheckinRequest.getClass())) {
            return getClass().getName().compareTo(mVCheckinRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26004g()).compareTo(Boolean.valueOf(mVCheckinRequest.mo26004g()));
        if (compareTo != 0 || ((mo26004g() && (compareTo = C25082a.m62839c(this.lineId, mVCheckinRequest.lineId)) != 0) || (compareTo = Boolean.valueOf(mo26008j()).compareTo(Boolean.valueOf(mVCheckinRequest.mo26008j()))) != 0 || ((mo26008j() && (compareTo = this.userLocation.compareTo(mVCheckinRequest.userLocation)) != 0) || (compareTo = Boolean.valueOf(mo26007i()).compareTo(Boolean.valueOf(mVCheckinRequest.mo26007i()))) != 0 || ((mo26007i() && (compareTo = C25082a.m62839c(this.toStopId, mVCheckinRequest.toStopId)) != 0) || (compareTo = Boolean.valueOf(mo26005h()).compareTo(Boolean.valueOf(mVCheckinRequest.mo26005h()))) != 0 || ((mo26005h() && (compareTo = this.prevGuid.compareTo(mVCheckinRequest.prevGuid)) != 0) || (compareTo = Boolean.valueOf(mo26003f()).compareTo(Boolean.valueOf(mVCheckinRequest.mo26003f()))) != 0))))) {
            return compareTo;
        }
        if (!mo26003f() || (l = C25082a.m62848l(this.enableRecording, mVCheckinRequest.enableRecording)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCheckinRequest)) {
            return false;
        }
        MVCheckinRequest mVCheckinRequest = (MVCheckinRequest) obj;
        if (this.lineId != mVCheckinRequest.lineId) {
            return false;
        }
        boolean j = mo26008j();
        boolean j2 = mVCheckinRequest.mo26008j();
        if ((j || j2) && (!j || !j2 || !this.userLocation.mo26178a(mVCheckinRequest.userLocation))) {
            return false;
        }
        boolean i = mo26007i();
        boolean i2 = mVCheckinRequest.mo26007i();
        if ((i || i2) && (!i || !i2 || this.toStopId != mVCheckinRequest.toStopId)) {
            return false;
        }
        boolean h = mo26005h();
        boolean h2 = mVCheckinRequest.mo26005h();
        if ((h || h2) && (!h || !h2 || !this.prevGuid.equals(mVCheckinRequest.prevGuid))) {
            return false;
        }
        boolean f = mo26003f();
        boolean f2 = mVCheckinRequest.mo26003f();
        if ((f || f2) && (!f || !f2 || this.enableRecording != mVCheckinRequest.enableRecording)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26003f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo26004g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo26005h() {
        return this.prevGuid != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26007i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo26008j() {
        return this.userLocation != null;
    }

    /* renamed from: k */
    public final void mo26009k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: l */
    public final void mo26010l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo26011m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCheckinRequest(", "lineId:");
        n.append(this.lineId);
        if (mo26008j()) {
            n.append(", ");
            n.append("userLocation:");
            MVGpsLocation mVGpsLocation = this.userLocation;
            if (mVGpsLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVGpsLocation);
            }
        }
        if (mo26007i()) {
            n.append(", ");
            n.append("toStopId:");
            n.append(this.toStopId);
        }
        if (mo26005h()) {
            n.append(", ");
            n.append("prevGuid:");
            String str = this.prevGuid;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo26003f()) {
            n.append(", ");
            n.append("enableRecording:");
            n.append(this.enableRecording);
        }
        n.append(")");
        return n.toString();
    }
}
