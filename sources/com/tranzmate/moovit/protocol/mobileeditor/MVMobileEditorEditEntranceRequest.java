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

public class MVMobileEditorEditEntranceRequest implements TBase<MVMobileEditorEditEntranceRequest, _Fields>, Serializable, Cloneable, Comparable<MVMobileEditorEditEntranceRequest> {

    /* renamed from: b */
    public static final C25113c f26801b = new C25113c("entranceId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26802c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26803d = new C25113c("entranceOrExit", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26804e = new C25113c("name", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26805f = new C25113c("moreInfo", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f26806g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26807h;
    private byte __isset_bitfield = 0;
    public int entranceId;
    public MVPathwayType entranceOrExit;
    public MVLatLon location;
    public String moreInfo;
    public String name;
    private _Fields[] optionals = {_Fields.LOCATION, _Fields.ENTRANCE_OR_EXIT, _Fields.NAME, _Fields.MORE_INFO};

    public enum _Fields implements C25085c {
        ENTRANCE_ID(1, "entranceId"),
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
                return ENTRANCE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorEditEntranceRequest$a */
    public static class C9396a extends C25239c<MVMobileEditorEditEntranceRequest> {
        public C9396a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorEditEntranceRequest mVMobileEditorEditEntranceRequest = (MVMobileEditorEditEntranceRequest) tBase;
            MVLatLon mVLatLon = mVMobileEditorEditEntranceRequest.location;
            C25113c cVar = MVMobileEditorEditEntranceRequest.f26801b;
            gVar.mo61687K();
            gVar.mo61711x(MVMobileEditorEditEntranceRequest.f26801b);
            gVar.mo61678B(mVMobileEditorEditEntranceRequest.entranceId);
            gVar.mo61712y();
            if (mVMobileEditorEditEntranceRequest.location != null && mVMobileEditorEditEntranceRequest.mo29109h()) {
                gVar.mo61711x(MVMobileEditorEditEntranceRequest.f26802c);
                mVMobileEditorEditEntranceRequest.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMobileEditorEditEntranceRequest.entranceOrExit != null && mVMobileEditorEditEntranceRequest.mo29108g()) {
                gVar.mo61711x(MVMobileEditorEditEntranceRequest.f26803d);
                gVar.mo61678B(mVMobileEditorEditEntranceRequest.entranceOrExit.getValue());
                gVar.mo61712y();
            }
            if (mVMobileEditorEditEntranceRequest.name != null && mVMobileEditorEditEntranceRequest.mo29112j()) {
                gVar.mo61711x(MVMobileEditorEditEntranceRequest.f26804e);
                gVar.mo61686J(mVMobileEditorEditEntranceRequest.name);
                gVar.mo61712y();
            }
            if (mVMobileEditorEditEntranceRequest.moreInfo != null && mVMobileEditorEditEntranceRequest.mo29111i()) {
                gVar.mo61711x(MVMobileEditorEditEntranceRequest.f26805f);
                gVar.mo61686J(mVMobileEditorEditEntranceRequest.moreInfo);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorEditEntranceRequest mVMobileEditorEditEntranceRequest = (MVMobileEditorEditEntranceRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVMobileEditorEditEntranceRequest.location;
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
                                    mVMobileEditorEditEntranceRequest.moreInfo = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVMobileEditorEditEntranceRequest.name = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVMobileEditorEditEntranceRequest.entranceOrExit = MVPathwayType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVMobileEditorEditEntranceRequest.location = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVMobileEditorEditEntranceRequest.entranceId = gVar.mo61696i();
                    mVMobileEditorEditEntranceRequest.mo29113k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorEditEntranceRequest$b */
    public static class C9397b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9396a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorEditEntranceRequest$c */
    public static class C9398c extends C25240d<MVMobileEditorEditEntranceRequest> {
        public C9398c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorEditEntranceRequest mVMobileEditorEditEntranceRequest = (MVMobileEditorEditEntranceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMobileEditorEditEntranceRequest.mo29107f()) {
                bitSet.set(0);
            }
            if (mVMobileEditorEditEntranceRequest.mo29109h()) {
                bitSet.set(1);
            }
            if (mVMobileEditorEditEntranceRequest.mo29108g()) {
                bitSet.set(2);
            }
            if (mVMobileEditorEditEntranceRequest.mo29112j()) {
                bitSet.set(3);
            }
            if (mVMobileEditorEditEntranceRequest.mo29111i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMobileEditorEditEntranceRequest.mo29107f()) {
                jVar.mo61678B(mVMobileEditorEditEntranceRequest.entranceId);
            }
            if (mVMobileEditorEditEntranceRequest.mo29109h()) {
                mVMobileEditorEditEntranceRequest.location.mo25202X0(jVar);
            }
            if (mVMobileEditorEditEntranceRequest.mo29108g()) {
                jVar.mo61678B(mVMobileEditorEditEntranceRequest.entranceOrExit.getValue());
            }
            if (mVMobileEditorEditEntranceRequest.mo29112j()) {
                jVar.mo61686J(mVMobileEditorEditEntranceRequest.name);
            }
            if (mVMobileEditorEditEntranceRequest.mo29111i()) {
                jVar.mo61686J(mVMobileEditorEditEntranceRequest.moreInfo);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorEditEntranceRequest mVMobileEditorEditEntranceRequest = (MVMobileEditorEditEntranceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVMobileEditorEditEntranceRequest.entranceId = jVar.mo61696i();
                mVMobileEditorEditEntranceRequest.mo29113k();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMobileEditorEditEntranceRequest.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVMobileEditorEditEntranceRequest.entranceOrExit = MVPathwayType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVMobileEditorEditEntranceRequest.name = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVMobileEditorEditEntranceRequest.moreInfo = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorEditEntranceRequest$d */
    public static class C9399d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9398c(0);
        }
    }

    static {
        new C17394d0("MVMobileEditorEditEntranceRequest");
        HashMap hashMap = new HashMap();
        f26806g = hashMap;
        hashMap.put(C25239c.class, new C9397b());
        hashMap.put(C25240d.class, new C9399d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENTRANCE_ID, new FieldMetaData("entranceId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 2, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.ENTRANCE_OR_EXIT, new FieldMetaData("entranceOrExit", (byte) 2, new EnumMetaData(MVPathwayType.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MORE_INFO, new FieldMetaData("moreInfo", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26807h = unmodifiableMap;
        FieldMetaData.m61947a(MVMobileEditorEditEntranceRequest.class, unmodifiableMap);
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
        ((C25238b) f26806g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26806g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMobileEditorEditEntranceRequest mVMobileEditorEditEntranceRequest = (MVMobileEditorEditEntranceRequest) obj;
        if (!getClass().equals(mVMobileEditorEditEntranceRequest.getClass())) {
            return getClass().getName().compareTo(mVMobileEditorEditEntranceRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29107f()).compareTo(Boolean.valueOf(mVMobileEditorEditEntranceRequest.mo29107f()));
        if (compareTo2 != 0 || ((mo29107f() && (compareTo2 = C25082a.m62839c(this.entranceId, mVMobileEditorEditEntranceRequest.entranceId)) != 0) || (compareTo2 = Boolean.valueOf(mo29109h()).compareTo(Boolean.valueOf(mVMobileEditorEditEntranceRequest.mo29109h()))) != 0 || ((mo29109h() && (compareTo2 = this.location.compareTo(mVMobileEditorEditEntranceRequest.location)) != 0) || (compareTo2 = Boolean.valueOf(mo29108g()).compareTo(Boolean.valueOf(mVMobileEditorEditEntranceRequest.mo29108g()))) != 0 || ((mo29108g() && (compareTo2 = this.entranceOrExit.compareTo(mVMobileEditorEditEntranceRequest.entranceOrExit)) != 0) || (compareTo2 = Boolean.valueOf(mo29112j()).compareTo(Boolean.valueOf(mVMobileEditorEditEntranceRequest.mo29112j()))) != 0 || ((mo29112j() && (compareTo2 = this.name.compareTo(mVMobileEditorEditEntranceRequest.name)) != 0) || (compareTo2 = Boolean.valueOf(mo29111i()).compareTo(Boolean.valueOf(mVMobileEditorEditEntranceRequest.mo29111i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29111i() || (compareTo = this.moreInfo.compareTo(mVMobileEditorEditEntranceRequest.moreInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMobileEditorEditEntranceRequest)) {
            return false;
        }
        MVMobileEditorEditEntranceRequest mVMobileEditorEditEntranceRequest = (MVMobileEditorEditEntranceRequest) obj;
        if (this.entranceId != mVMobileEditorEditEntranceRequest.entranceId) {
            return false;
        }
        boolean h = mo29109h();
        boolean h2 = mVMobileEditorEditEntranceRequest.mo29109h();
        if ((h || h2) && (!h || !h2 || !this.location.mo26290a(mVMobileEditorEditEntranceRequest.location))) {
            return false;
        }
        boolean g = mo29108g();
        boolean g2 = mVMobileEditorEditEntranceRequest.mo29108g();
        if ((g || g2) && (!g || !g2 || !this.entranceOrExit.equals(mVMobileEditorEditEntranceRequest.entranceOrExit))) {
            return false;
        }
        boolean j = mo29112j();
        boolean j2 = mVMobileEditorEditEntranceRequest.mo29112j();
        if ((j || j2) && (!j || !j2 || !this.name.equals(mVMobileEditorEditEntranceRequest.name))) {
            return false;
        }
        boolean i = mo29111i();
        boolean i2 = mVMobileEditorEditEntranceRequest.mo29111i();
        if ((i || i2) && (!i || !i2 || !this.moreInfo.equals(mVMobileEditorEditEntranceRequest.moreInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29107f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29108g() {
        return this.entranceOrExit != null;
    }

    /* renamed from: h */
    public final boolean mo29109h() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29111i() {
        return this.moreInfo != null;
    }

    /* renamed from: j */
    public final boolean mo29112j() {
        return this.name != null;
    }

    /* renamed from: k */
    public final void mo29113k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMobileEditorEditEntranceRequest(", "entranceId:");
        n.append(this.entranceId);
        if (mo29109h()) {
            n.append(", ");
            n.append("location:");
            MVLatLon mVLatLon = this.location;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        if (mo29108g()) {
            n.append(", ");
            n.append("entranceOrExit:");
            MVPathwayType mVPathwayType = this.entranceOrExit;
            if (mVPathwayType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPathwayType);
            }
        }
        if (mo29112j()) {
            n.append(", ");
            n.append("name:");
            String str = this.name;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo29111i()) {
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
