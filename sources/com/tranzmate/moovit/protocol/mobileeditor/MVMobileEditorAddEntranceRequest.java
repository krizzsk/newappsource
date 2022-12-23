package com.tranzmate.moovit.protocol.mobileeditor;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.gtfs.MVPathwayType;
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
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TProtocolException;
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

public class MVMobileEditorAddEntranceRequest implements TBase<MVMobileEditorAddEntranceRequest, _Fields>, Serializable, Cloneable, Comparable<MVMobileEditorAddEntranceRequest> {

    /* renamed from: b */
    public static final C25113c f26784b = new C25113c("parentStopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26785c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26786d = new C25113c("entranceOrExit", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26787e = new C25113c("name", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26788f = new C25113c("moreInfo", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f26789g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26790h;
    private byte __isset_bitfield = 0;
    public MVPathwayType entranceOrExit;
    public MVLatLon location;
    public String moreInfo;
    public String name;
    private _Fields[] optionals = {_Fields.MORE_INFO};
    public int parentStopId;

    public enum _Fields implements C25085c {
        PARENT_STOP_ID(1, "parentStopId"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        ENTRANCE_OR_EXIT(3, "entranceOrExit"),
        NAME(4, "name"),
        MORE_INFO(5, "moreInfo");
        
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
                return PARENT_STOP_ID;
            }
            if (i == 2) {
                return LOCATION;
            }
            if (i == 3) {
                return ENTRANCE_OR_EXIT;
            }
            if (i == 4) {
                return NAME;
            }
            if (i != 5) {
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorAddEntranceRequest$a */
    public static class C9380a extends C25239c<MVMobileEditorAddEntranceRequest> {
        public C9380a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorAddEntranceRequest mVMobileEditorAddEntranceRequest = (MVMobileEditorAddEntranceRequest) tBase;
            mVMobileEditorAddEntranceRequest.mo29079i();
            C25113c cVar = MVMobileEditorAddEntranceRequest.f26784b;
            gVar.mo61687K();
            gVar.mo61711x(MVMobileEditorAddEntranceRequest.f26784b);
            gVar.mo61678B(mVMobileEditorAddEntranceRequest.parentStopId);
            gVar.mo61712y();
            if (mVMobileEditorAddEntranceRequest.location != null) {
                gVar.mo61711x(MVMobileEditorAddEntranceRequest.f26785c);
                mVMobileEditorAddEntranceRequest.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMobileEditorAddEntranceRequest.entranceOrExit != null) {
                gVar.mo61711x(MVMobileEditorAddEntranceRequest.f26786d);
                gVar.mo61678B(mVMobileEditorAddEntranceRequest.entranceOrExit.getValue());
                gVar.mo61712y();
            }
            if (mVMobileEditorAddEntranceRequest.name != null) {
                gVar.mo61711x(MVMobileEditorAddEntranceRequest.f26787e);
                gVar.mo61686J(mVMobileEditorAddEntranceRequest.name);
                gVar.mo61712y();
            }
            if (mVMobileEditorAddEntranceRequest.moreInfo != null && mVMobileEditorAddEntranceRequest.mo29075f()) {
                gVar.mo61711x(MVMobileEditorAddEntranceRequest.f26788f);
                gVar.mo61686J(mVMobileEditorAddEntranceRequest.moreInfo);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorAddEntranceRequest mVMobileEditorAddEntranceRequest = (MVMobileEditorAddEntranceRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMobileEditorAddEntranceRequest.mo29079i();
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
                                    mVMobileEditorAddEntranceRequest.moreInfo = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVMobileEditorAddEntranceRequest.name = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVMobileEditorAddEntranceRequest.entranceOrExit = MVPathwayType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLatLon mVLatLon = new MVLatLon();
                        mVMobileEditorAddEntranceRequest.location = mVLatLon;
                        mVLatLon.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVMobileEditorAddEntranceRequest.parentStopId = gVar.mo61696i();
                    mVMobileEditorAddEntranceRequest.mo29077h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorAddEntranceRequest$b */
    public static class C9381b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9380a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorAddEntranceRequest$c */
    public static class C9382c extends C25240d<MVMobileEditorAddEntranceRequest> {
        public C9382c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorAddEntranceRequest mVMobileEditorAddEntranceRequest = (MVMobileEditorAddEntranceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            mVMobileEditorAddEntranceRequest.location.mo25202X0(jVar);
            jVar.mo61678B(mVMobileEditorAddEntranceRequest.entranceOrExit.getValue());
            jVar.mo61686J(mVMobileEditorAddEntranceRequest.name);
            BitSet bitSet = new BitSet();
            if (mVMobileEditorAddEntranceRequest.mo29076g()) {
                bitSet.set(0);
            }
            if (mVMobileEditorAddEntranceRequest.mo29075f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMobileEditorAddEntranceRequest.mo29076g()) {
                jVar.mo61678B(mVMobileEditorAddEntranceRequest.parentStopId);
            }
            if (mVMobileEditorAddEntranceRequest.mo29075f()) {
                jVar.mo61686J(mVMobileEditorAddEntranceRequest.moreInfo);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorAddEntranceRequest mVMobileEditorAddEntranceRequest = (MVMobileEditorAddEntranceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            MVLatLon mVLatLon = new MVLatLon();
            mVMobileEditorAddEntranceRequest.location = mVLatLon;
            mVLatLon.mo25201C1(jVar);
            mVMobileEditorAddEntranceRequest.entranceOrExit = MVPathwayType.findByValue(jVar.mo61696i());
            mVMobileEditorAddEntranceRequest.name = jVar.mo61704q();
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVMobileEditorAddEntranceRequest.parentStopId = jVar.mo61696i();
                mVMobileEditorAddEntranceRequest.mo29077h();
            }
            if (T.get(1)) {
                mVMobileEditorAddEntranceRequest.moreInfo = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorAddEntranceRequest$d */
    public static class C9383d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9382c(0);
        }
    }

    static {
        new C17394d0("MVMobileEditorAddEntranceRequest");
        HashMap hashMap = new HashMap();
        f26789g = hashMap;
        hashMap.put(C25239c.class, new C9381b());
        hashMap.put(C25240d.class, new C9383d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PARENT_STOP_ID, new FieldMetaData("parentStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 1, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.ENTRANCE_OR_EXIT, new FieldMetaData("entranceOrExit", (byte) 1, new EnumMetaData(MVPathwayType.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 1, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MORE_INFO, new FieldMetaData("moreInfo", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26790h = unmodifiableMap;
        FieldMetaData.m61947a(MVMobileEditorAddEntranceRequest.class, unmodifiableMap);
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
        ((C25238b) f26789g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26789g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int compareTo;
        MVMobileEditorAddEntranceRequest mVMobileEditorAddEntranceRequest = (MVMobileEditorAddEntranceRequest) obj;
        if (!getClass().equals(mVMobileEditorAddEntranceRequest.getClass())) {
            return getClass().getName().compareTo(mVMobileEditorAddEntranceRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29076g()).compareTo(Boolean.valueOf(mVMobileEditorAddEntranceRequest.mo29076g()));
        if (compareTo2 == 0 && (!mo29076g() || (compareTo2 = C25082a.m62839c(this.parentStopId, mVMobileEditorAddEntranceRequest.parentStopId)) == 0)) {
            boolean z9 = true;
            if (this.location != null) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (mVMobileEditorAddEntranceRequest.location != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            compareTo2 = valueOf.compareTo(Boolean.valueOf(z2));
            if (compareTo2 == 0) {
                MVLatLon mVLatLon = this.location;
                if (mVLatLon != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 || (compareTo2 = mVLatLon.compareTo(mVMobileEditorAddEntranceRequest.location)) == 0) {
                    if (this.entranceOrExit != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Boolean valueOf2 = Boolean.valueOf(z4);
                    if (mVMobileEditorAddEntranceRequest.entranceOrExit != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    compareTo2 = valueOf2.compareTo(Boolean.valueOf(z5));
                    if (compareTo2 == 0) {
                        MVPathwayType mVPathwayType = this.entranceOrExit;
                        if (mVPathwayType != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6 || (compareTo2 = mVPathwayType.compareTo(mVMobileEditorAddEntranceRequest.entranceOrExit)) == 0) {
                            if (this.name != null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            Boolean valueOf3 = Boolean.valueOf(z7);
                            if (mVMobileEditorAddEntranceRequest.name != null) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            compareTo2 = valueOf3.compareTo(Boolean.valueOf(z8));
                            if (compareTo2 == 0) {
                                String str = this.name;
                                if (str == null) {
                                    z9 = false;
                                }
                                if ((!z9 || (compareTo2 = str.compareTo(mVMobileEditorAddEntranceRequest.name)) == 0) && (compareTo2 = Boolean.valueOf(mo29075f()).compareTo(Boolean.valueOf(mVMobileEditorAddEntranceRequest.mo29075f()))) == 0) {
                                    if (!mo29075f() || (compareTo = this.moreInfo.compareTo(mVMobileEditorAddEntranceRequest.moreInfo)) == 0) {
                                        return 0;
                                    }
                                    return compareTo;
                                }
                            }
                        }
                    }
                }
            }
        }
        return compareTo2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (obj == null || !(obj instanceof MVMobileEditorAddEntranceRequest)) {
            return false;
        }
        MVMobileEditorAddEntranceRequest mVMobileEditorAddEntranceRequest = (MVMobileEditorAddEntranceRequest) obj;
        if (this.parentStopId != mVMobileEditorAddEntranceRequest.parentStopId) {
            return false;
        }
        MVLatLon mVLatLon = this.location;
        if (mVLatLon != null) {
            z = true;
        } else {
            z = false;
        }
        MVLatLon mVLatLon2 = mVMobileEditorAddEntranceRequest.location;
        if (mVLatLon2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z || z2) && (!z || !z2 || !mVLatLon.mo26290a(mVLatLon2))) {
            return false;
        }
        MVPathwayType mVPathwayType = this.entranceOrExit;
        if (mVPathwayType != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        MVPathwayType mVPathwayType2 = mVMobileEditorAddEntranceRequest.entranceOrExit;
        if (mVPathwayType2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((z3 || z4) && (!z3 || !z4 || !mVPathwayType.equals(mVPathwayType2))) {
            return false;
        }
        String str = this.name;
        if (str != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        String str2 = mVMobileEditorAddEntranceRequest.name;
        if (str2 != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((z5 || z6) && (!z5 || !z6 || !str.equals(str2))) {
            return false;
        }
        boolean f = mo29075f();
        boolean f2 = mVMobileEditorAddEntranceRequest.mo29075f();
        if ((f || f2) && (!f || !f2 || !this.moreInfo.equals(mVMobileEditorAddEntranceRequest.moreInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29075f() {
        return this.moreInfo != null;
    }

    /* renamed from: g */
    public final boolean mo29076g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo29077h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo29079i() throws TException {
        if (this.location == null) {
            StringBuilder k = C13555b.m33972k("Required field 'location' was not present! Struct: ");
            k.append(toString());
            throw new TProtocolException(k.toString());
        } else if (this.entranceOrExit == null) {
            StringBuilder k2 = C13555b.m33972k("Required field 'entranceOrExit' was not present! Struct: ");
            k2.append(toString());
            throw new TProtocolException(k2.toString());
        } else if (this.name == null) {
            StringBuilder k3 = C13555b.m33972k("Required field 'name' was not present! Struct: ");
            k3.append(toString());
            throw new TProtocolException(k3.toString());
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMobileEditorAddEntranceRequest(", "parentStopId:");
        C0016g.m42z(n, this.parentStopId, ", ", "location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("entranceOrExit:");
        MVPathwayType mVPathwayType = this.entranceOrExit;
        if (mVPathwayType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPathwayType);
        }
        n.append(", ");
        n.append("name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29075f()) {
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
