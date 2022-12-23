package com.tranzmate.moovit.protocol.mobileeditor;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVMobileEditorUpdateStopRequest implements TBase<MVMobileEditorUpdateStopRequest, _Fields>, Serializable, Cloneable, Comparable<MVMobileEditorUpdateStopRequest> {

    /* renamed from: b */
    public static final C25113c f26828b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26829c = new C25113c("stopName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26830d = new C25113c("stopLocation", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f26831e = new C25113c("moreInfo", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f26832f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26833g;
    private byte __isset_bitfield = 0;
    public String moreInfo;
    private _Fields[] optionals = {_Fields.STOP_NAME, _Fields.STOP_LOCATION, _Fields.MORE_INFO};
    public int stopId;
    public MVLatLon stopLocation;
    public String stopName;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        STOP_NAME(2, "stopName"),
        STOP_LOCATION(3, "stopLocation"),
        MORE_INFO(4, "moreInfo");
        
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
                return STOP_NAME;
            }
            if (i == 3) {
                return STOP_LOCATION;
            }
            if (i != 4) {
                return null;
            }
            return MORE_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorUpdateStopRequest$a */
    public static class C9416a extends C25239c<MVMobileEditorUpdateStopRequest> {
        public C9416a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorUpdateStopRequest mVMobileEditorUpdateStopRequest = (MVMobileEditorUpdateStopRequest) tBase;
            MVLatLon mVLatLon = mVMobileEditorUpdateStopRequest.stopLocation;
            C25113c cVar = MVMobileEditorUpdateStopRequest.f26828b;
            gVar.mo61687K();
            gVar.mo61711x(MVMobileEditorUpdateStopRequest.f26828b);
            gVar.mo61678B(mVMobileEditorUpdateStopRequest.stopId);
            gVar.mo61712y();
            if (mVMobileEditorUpdateStopRequest.stopName != null && mVMobileEditorUpdateStopRequest.mo29158i()) {
                gVar.mo61711x(MVMobileEditorUpdateStopRequest.f26829c);
                gVar.mo61686J(mVMobileEditorUpdateStopRequest.stopName);
                gVar.mo61712y();
            }
            if (mVMobileEditorUpdateStopRequest.stopLocation != null && mVMobileEditorUpdateStopRequest.mo29156h()) {
                gVar.mo61711x(MVMobileEditorUpdateStopRequest.f26830d);
                mVMobileEditorUpdateStopRequest.stopLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMobileEditorUpdateStopRequest.moreInfo != null && mVMobileEditorUpdateStopRequest.mo29154f()) {
                gVar.mo61711x(MVMobileEditorUpdateStopRequest.f26831e);
                gVar.mo61686J(mVMobileEditorUpdateStopRequest.moreInfo);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorUpdateStopRequest mVMobileEditorUpdateStopRequest = (MVMobileEditorUpdateStopRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVMobileEditorUpdateStopRequest.stopLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVMobileEditorUpdateStopRequest.moreInfo = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVMobileEditorUpdateStopRequest.stopLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMobileEditorUpdateStopRequest.stopName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVMobileEditorUpdateStopRequest.stopId = gVar.mo61696i();
                    mVMobileEditorUpdateStopRequest.mo29159j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorUpdateStopRequest$b */
    public static class C9417b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9416a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorUpdateStopRequest$c */
    public static class C9418c extends C25240d<MVMobileEditorUpdateStopRequest> {
        public C9418c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorUpdateStopRequest mVMobileEditorUpdateStopRequest = (MVMobileEditorUpdateStopRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMobileEditorUpdateStopRequest.mo29155g()) {
                bitSet.set(0);
            }
            if (mVMobileEditorUpdateStopRequest.mo29158i()) {
                bitSet.set(1);
            }
            if (mVMobileEditorUpdateStopRequest.mo29156h()) {
                bitSet.set(2);
            }
            if (mVMobileEditorUpdateStopRequest.mo29154f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVMobileEditorUpdateStopRequest.mo29155g()) {
                jVar.mo61678B(mVMobileEditorUpdateStopRequest.stopId);
            }
            if (mVMobileEditorUpdateStopRequest.mo29158i()) {
                jVar.mo61686J(mVMobileEditorUpdateStopRequest.stopName);
            }
            if (mVMobileEditorUpdateStopRequest.mo29156h()) {
                mVMobileEditorUpdateStopRequest.stopLocation.mo25202X0(jVar);
            }
            if (mVMobileEditorUpdateStopRequest.mo29154f()) {
                jVar.mo61686J(mVMobileEditorUpdateStopRequest.moreInfo);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorUpdateStopRequest mVMobileEditorUpdateStopRequest = (MVMobileEditorUpdateStopRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVMobileEditorUpdateStopRequest.stopId = jVar.mo61696i();
                mVMobileEditorUpdateStopRequest.mo29159j();
            }
            if (T.get(1)) {
                mVMobileEditorUpdateStopRequest.stopName = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMobileEditorUpdateStopRequest.stopLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVMobileEditorUpdateStopRequest.moreInfo = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorUpdateStopRequest$d */
    public static class C9419d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9418c(0);
        }
    }

    static {
        new C17394d0("MVMobileEditorUpdateStopRequest");
        HashMap hashMap = new HashMap();
        f26832f = hashMap;
        hashMap.put(C25239c.class, new C9417b());
        hashMap.put(C25240d.class, new C9419d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_NAME, new FieldMetaData("stopName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STOP_LOCATION, new FieldMetaData("stopLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.MORE_INFO, new FieldMetaData("moreInfo", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26833g = unmodifiableMap;
        FieldMetaData.m61947a(MVMobileEditorUpdateStopRequest.class, unmodifiableMap);
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
        ((C25238b) f26832f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26832f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMobileEditorUpdateStopRequest mVMobileEditorUpdateStopRequest = (MVMobileEditorUpdateStopRequest) obj;
        if (!getClass().equals(mVMobileEditorUpdateStopRequest.getClass())) {
            return getClass().getName().compareTo(mVMobileEditorUpdateStopRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29155g()).compareTo(Boolean.valueOf(mVMobileEditorUpdateStopRequest.mo29155g()));
        if (compareTo2 != 0 || ((mo29155g() && (compareTo2 = C25082a.m62839c(this.stopId, mVMobileEditorUpdateStopRequest.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo29158i()).compareTo(Boolean.valueOf(mVMobileEditorUpdateStopRequest.mo29158i()))) != 0 || ((mo29158i() && (compareTo2 = this.stopName.compareTo(mVMobileEditorUpdateStopRequest.stopName)) != 0) || (compareTo2 = Boolean.valueOf(mo29156h()).compareTo(Boolean.valueOf(mVMobileEditorUpdateStopRequest.mo29156h()))) != 0 || ((mo29156h() && (compareTo2 = this.stopLocation.compareTo(mVMobileEditorUpdateStopRequest.stopLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo29154f()).compareTo(Boolean.valueOf(mVMobileEditorUpdateStopRequest.mo29154f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29154f() || (compareTo = this.moreInfo.compareTo(mVMobileEditorUpdateStopRequest.moreInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMobileEditorUpdateStopRequest)) {
            return false;
        }
        MVMobileEditorUpdateStopRequest mVMobileEditorUpdateStopRequest = (MVMobileEditorUpdateStopRequest) obj;
        if (this.stopId != mVMobileEditorUpdateStopRequest.stopId) {
            return false;
        }
        boolean i = mo29158i();
        boolean i2 = mVMobileEditorUpdateStopRequest.mo29158i();
        if ((i || i2) && (!i || !i2 || !this.stopName.equals(mVMobileEditorUpdateStopRequest.stopName))) {
            return false;
        }
        boolean h = mo29156h();
        boolean h2 = mVMobileEditorUpdateStopRequest.mo29156h();
        if ((h || h2) && (!h || !h2 || !this.stopLocation.mo26290a(mVMobileEditorUpdateStopRequest.stopLocation))) {
            return false;
        }
        boolean f = mo29154f();
        boolean f2 = mVMobileEditorUpdateStopRequest.mo29154f();
        if ((f || f2) && (!f || !f2 || !this.moreInfo.equals(mVMobileEditorUpdateStopRequest.moreInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29154f() {
        return this.moreInfo != null;
    }

    /* renamed from: g */
    public final boolean mo29155g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo29156h() {
        return this.stopLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29158i() {
        return this.stopName != null;
    }

    /* renamed from: j */
    public final void mo29159j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMobileEditorUpdateStopRequest(", "stopId:");
        n.append(this.stopId);
        if (mo29158i()) {
            n.append(", ");
            n.append("stopName:");
            String str = this.stopName;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo29156h()) {
            n.append(", ");
            n.append("stopLocation:");
            MVLatLon mVLatLon = this.stopLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        if (mo29154f()) {
            n.append(", ");
            n.append("moreInfo:");
            String str2 = this.moreInfo;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
