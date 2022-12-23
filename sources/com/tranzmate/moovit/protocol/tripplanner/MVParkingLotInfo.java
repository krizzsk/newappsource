package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVExternalAppData;
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

public class MVParkingLotInfo implements TBase<MVParkingLotInfo, _Fields>, Serializable, Cloneable, Comparable<MVParkingLotInfo> {

    /* renamed from: b */
    public static final C25113c f30007b = new C25113c("parkingLotName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30008c = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30009d = new C25113c("parkingLotId", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30010e = new C25113c("capacity", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30011f = new C25113c("deeplinkUrls", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f30012g = new C25113c("operatorName", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f30013h = new C25113c("operatorId", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f30014i = new C25113c("isWheelchairAccessible", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f30015j = new C25113c("serviceId", (byte) 8, 9);

    /* renamed from: k */
    public static final HashMap f30016k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f30017l;
    private byte __isset_bitfield = 0;
    public int capacity;
    public MVExternalAppData deeplinkUrls;
    public boolean isWheelchairAccessible;
    public MVLatLon location;
    public int operatorId;
    public String operatorName;
    private _Fields[] optionals = {_Fields.PARKING_LOT_ID, _Fields.CAPACITY, _Fields.DEEPLINK_URLS, _Fields.OPERATOR_NAME, _Fields.OPERATOR_ID, _Fields.IS_WHEELCHAIR_ACCESSIBLE, _Fields.SERVICE_ID};
    public String parkingLotId;
    public String parkingLotName;
    public int serviceId;

    public enum _Fields implements C25085c {
        PARKING_LOT_NAME(1, "parkingLotName"),
        LOCATION(2, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        PARKING_LOT_ID(3, "parkingLotId"),
        CAPACITY(4, "capacity"),
        DEEPLINK_URLS(5, "deeplinkUrls"),
        OPERATOR_NAME(6, "operatorName"),
        OPERATOR_ID(7, "operatorId"),
        IS_WHEELCHAIR_ACCESSIBLE(8, "isWheelchairAccessible"),
        SERVICE_ID(9, "serviceId");
        
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
                    return PARKING_LOT_NAME;
                case 2:
                    return LOCATION;
                case 3:
                    return PARKING_LOT_ID;
                case 4:
                    return CAPACITY;
                case 5:
                    return DEEPLINK_URLS;
                case 6:
                    return OPERATOR_NAME;
                case 7:
                    return OPERATOR_ID;
                case 8:
                    return IS_WHEELCHAIR_ACCESSIBLE;
                case 9:
                    return SERVICE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVParkingLotInfo$a */
    public static class C11598a extends C25239c<MVParkingLotInfo> {
        public C11598a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParkingLotInfo mVParkingLotInfo = (MVParkingLotInfo) tBase;
            MVLatLon mVLatLon = mVParkingLotInfo.location;
            C25113c cVar = MVParkingLotInfo.f30007b;
            gVar.mo61687K();
            if (mVParkingLotInfo.parkingLotName != null) {
                gVar.mo61711x(MVParkingLotInfo.f30007b);
                gVar.mo61686J(mVParkingLotInfo.parkingLotName);
                gVar.mo61712y();
            }
            if (mVParkingLotInfo.location != null) {
                gVar.mo61711x(MVParkingLotInfo.f30008c);
                mVParkingLotInfo.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVParkingLotInfo.parkingLotId != null && mVParkingLotInfo.mo34465l()) {
                gVar.mo61711x(MVParkingLotInfo.f30009d);
                gVar.mo61686J(mVParkingLotInfo.parkingLotId);
                gVar.mo61712y();
            }
            if (mVParkingLotInfo.mo34458f()) {
                gVar.mo61711x(MVParkingLotInfo.f30010e);
                gVar.mo61678B(mVParkingLotInfo.capacity);
                gVar.mo61712y();
            }
            if (mVParkingLotInfo.deeplinkUrls != null && mVParkingLotInfo.mo34459g()) {
                gVar.mo61711x(MVParkingLotInfo.f30011f);
                mVParkingLotInfo.deeplinkUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVParkingLotInfo.operatorName != null && mVParkingLotInfo.mo34464k()) {
                gVar.mo61711x(MVParkingLotInfo.f30012g);
                gVar.mo61686J(mVParkingLotInfo.operatorName);
                gVar.mo61712y();
            }
            if (mVParkingLotInfo.mo34463j()) {
                gVar.mo61711x(MVParkingLotInfo.f30013h);
                gVar.mo61678B(mVParkingLotInfo.operatorId);
                gVar.mo61712y();
            }
            if (mVParkingLotInfo.mo34460h()) {
                gVar.mo61711x(MVParkingLotInfo.f30014i);
                gVar.mo61708u(mVParkingLotInfo.isWheelchairAccessible);
                gVar.mo61712y();
            }
            if (mVParkingLotInfo.mo34467o()) {
                gVar.mo61711x(MVParkingLotInfo.f30015j);
                gVar.mo61678B(mVParkingLotInfo.serviceId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParkingLotInfo mVParkingLotInfo = (MVParkingLotInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVParkingLotInfo.location;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingLotInfo.parkingLotName = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVParkingLotInfo.location = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingLotInfo.parkingLotId = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingLotInfo.capacity = gVar.mo61696i();
                            mVParkingLotInfo.mo34468p();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVExternalAppData mVExternalAppData = new MVExternalAppData();
                            mVParkingLotInfo.deeplinkUrls = mVExternalAppData;
                            mVExternalAppData.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingLotInfo.operatorName = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingLotInfo.operatorId = gVar.mo61696i();
                            mVParkingLotInfo.mo34470r();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingLotInfo.isWheelchairAccessible = gVar.mo61690c();
                            mVParkingLotInfo.mo34469q();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingLotInfo.serviceId = gVar.mo61696i();
                            mVParkingLotInfo.mo34471s();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVParkingLotInfo$b */
    public static class C11599b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11598a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVParkingLotInfo$c */
    public static class C11600c extends C25240d<MVParkingLotInfo> {
        public C11600c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParkingLotInfo mVParkingLotInfo = (MVParkingLotInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVParkingLotInfo.mo34466m()) {
                bitSet.set(0);
            }
            if (mVParkingLotInfo.mo34462i()) {
                bitSet.set(1);
            }
            if (mVParkingLotInfo.mo34465l()) {
                bitSet.set(2);
            }
            if (mVParkingLotInfo.mo34458f()) {
                bitSet.set(3);
            }
            if (mVParkingLotInfo.mo34459g()) {
                bitSet.set(4);
            }
            if (mVParkingLotInfo.mo34464k()) {
                bitSet.set(5);
            }
            if (mVParkingLotInfo.mo34463j()) {
                bitSet.set(6);
            }
            if (mVParkingLotInfo.mo34460h()) {
                bitSet.set(7);
            }
            if (mVParkingLotInfo.mo34467o()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVParkingLotInfo.mo34466m()) {
                jVar.mo61686J(mVParkingLotInfo.parkingLotName);
            }
            if (mVParkingLotInfo.mo34462i()) {
                mVParkingLotInfo.location.mo25202X0(jVar);
            }
            if (mVParkingLotInfo.mo34465l()) {
                jVar.mo61686J(mVParkingLotInfo.parkingLotId);
            }
            if (mVParkingLotInfo.mo34458f()) {
                jVar.mo61678B(mVParkingLotInfo.capacity);
            }
            if (mVParkingLotInfo.mo34459g()) {
                mVParkingLotInfo.deeplinkUrls.mo25202X0(jVar);
            }
            if (mVParkingLotInfo.mo34464k()) {
                jVar.mo61686J(mVParkingLotInfo.operatorName);
            }
            if (mVParkingLotInfo.mo34463j()) {
                jVar.mo61678B(mVParkingLotInfo.operatorId);
            }
            if (mVParkingLotInfo.mo34460h()) {
                jVar.mo61708u(mVParkingLotInfo.isWheelchairAccessible);
            }
            if (mVParkingLotInfo.mo34467o()) {
                jVar.mo61678B(mVParkingLotInfo.serviceId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParkingLotInfo mVParkingLotInfo = (MVParkingLotInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                mVParkingLotInfo.parkingLotName = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVParkingLotInfo.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVParkingLotInfo.parkingLotId = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVParkingLotInfo.capacity = jVar.mo61696i();
                mVParkingLotInfo.mo34468p();
            }
            if (T.get(4)) {
                MVExternalAppData mVExternalAppData = new MVExternalAppData();
                mVParkingLotInfo.deeplinkUrls = mVExternalAppData;
                mVExternalAppData.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVParkingLotInfo.operatorName = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVParkingLotInfo.operatorId = jVar.mo61696i();
                mVParkingLotInfo.mo34470r();
            }
            if (T.get(7)) {
                mVParkingLotInfo.isWheelchairAccessible = jVar.mo61690c();
                mVParkingLotInfo.mo34469q();
            }
            if (T.get(8)) {
                mVParkingLotInfo.serviceId = jVar.mo61696i();
                mVParkingLotInfo.mo34471s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVParkingLotInfo$d */
    public static class C11601d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11600c(0);
        }
    }

    static {
        new C17394d0("MVParkingLotInfo");
        HashMap hashMap = new HashMap();
        f30016k = hashMap;
        hashMap.put(C25239c.class, new C11599b());
        hashMap.put(C25240d.class, new C11601d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PARKING_LOT_NAME, new FieldMetaData("parkingLotName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.PARKING_LOT_ID, new FieldMetaData("parkingLotId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CAPACITY, new FieldMetaData("capacity", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEEPLINK_URLS, new FieldMetaData("deeplinkUrls", (byte) 2, new StructMetaData(MVExternalAppData.class)));
        enumMap.put(_Fields.OPERATOR_NAME, new FieldMetaData("operatorName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.OPERATOR_ID, new FieldMetaData("operatorId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS_WHEELCHAIR_ACCESSIBLE, new FieldMetaData("isWheelchairAccessible", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30017l = unmodifiableMap;
        FieldMetaData.m61947a(MVParkingLotInfo.class, unmodifiableMap);
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
        ((C25238b) f30016k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30016k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34455a(MVParkingLotInfo mVParkingLotInfo) {
        if (mVParkingLotInfo == null) {
            return false;
        }
        boolean m = mo34466m();
        boolean m2 = mVParkingLotInfo.mo34466m();
        if ((m || m2) && (!m || !m2 || !this.parkingLotName.equals(mVParkingLotInfo.parkingLotName))) {
            return false;
        }
        boolean i = mo34462i();
        boolean i2 = mVParkingLotInfo.mo34462i();
        if ((i || i2) && (!i || !i2 || !this.location.mo26290a(mVParkingLotInfo.location))) {
            return false;
        }
        boolean l = mo34465l();
        boolean l2 = mVParkingLotInfo.mo34465l();
        if ((l || l2) && (!l || !l2 || !this.parkingLotId.equals(mVParkingLotInfo.parkingLotId))) {
            return false;
        }
        boolean f = mo34458f();
        boolean f2 = mVParkingLotInfo.mo34458f();
        if ((f || f2) && (!f || !f2 || this.capacity != mVParkingLotInfo.capacity)) {
            return false;
        }
        boolean g = mo34459g();
        boolean g2 = mVParkingLotInfo.mo34459g();
        if ((g || g2) && (!g || !g2 || !this.deeplinkUrls.mo26157a(mVParkingLotInfo.deeplinkUrls))) {
            return false;
        }
        boolean k = mo34464k();
        boolean k2 = mVParkingLotInfo.mo34464k();
        if ((k || k2) && (!k || !k2 || !this.operatorName.equals(mVParkingLotInfo.operatorName))) {
            return false;
        }
        boolean j = mo34463j();
        boolean j2 = mVParkingLotInfo.mo34463j();
        if ((j || j2) && (!j || !j2 || this.operatorId != mVParkingLotInfo.operatorId)) {
            return false;
        }
        boolean h = mo34460h();
        boolean h2 = mVParkingLotInfo.mo34460h();
        if ((h || h2) && (!h || !h2 || this.isWheelchairAccessible != mVParkingLotInfo.isWheelchairAccessible)) {
            return false;
        }
        boolean o = mo34467o();
        boolean o2 = mVParkingLotInfo.mo34467o();
        if (!o && !o2) {
            return true;
        }
        if (!o || !o2 || this.serviceId != mVParkingLotInfo.serviceId) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVParkingLotInfo mVParkingLotInfo = (MVParkingLotInfo) obj;
        if (!getClass().equals(mVParkingLotInfo.getClass())) {
            return getClass().getName().compareTo(mVParkingLotInfo.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34466m()).compareTo(Boolean.valueOf(mVParkingLotInfo.mo34466m()));
        if (compareTo != 0 || ((mo34466m() && (compareTo = this.parkingLotName.compareTo(mVParkingLotInfo.parkingLotName)) != 0) || (compareTo = Boolean.valueOf(mo34462i()).compareTo(Boolean.valueOf(mVParkingLotInfo.mo34462i()))) != 0 || ((mo34462i() && (compareTo = this.location.compareTo(mVParkingLotInfo.location)) != 0) || (compareTo = Boolean.valueOf(mo34465l()).compareTo(Boolean.valueOf(mVParkingLotInfo.mo34465l()))) != 0 || ((mo34465l() && (compareTo = this.parkingLotId.compareTo(mVParkingLotInfo.parkingLotId)) != 0) || (compareTo = Boolean.valueOf(mo34458f()).compareTo(Boolean.valueOf(mVParkingLotInfo.mo34458f()))) != 0 || ((mo34458f() && (compareTo = C25082a.m62839c(this.capacity, mVParkingLotInfo.capacity)) != 0) || (compareTo = Boolean.valueOf(mo34459g()).compareTo(Boolean.valueOf(mVParkingLotInfo.mo34459g()))) != 0 || ((mo34459g() && (compareTo = this.deeplinkUrls.compareTo(mVParkingLotInfo.deeplinkUrls)) != 0) || (compareTo = Boolean.valueOf(mo34464k()).compareTo(Boolean.valueOf(mVParkingLotInfo.mo34464k()))) != 0 || ((mo34464k() && (compareTo = this.operatorName.compareTo(mVParkingLotInfo.operatorName)) != 0) || (compareTo = Boolean.valueOf(mo34463j()).compareTo(Boolean.valueOf(mVParkingLotInfo.mo34463j()))) != 0 || ((mo34463j() && (compareTo = C25082a.m62839c(this.operatorId, mVParkingLotInfo.operatorId)) != 0) || (compareTo = Boolean.valueOf(mo34460h()).compareTo(Boolean.valueOf(mVParkingLotInfo.mo34460h()))) != 0 || ((mo34460h() && (compareTo = C25082a.m62848l(this.isWheelchairAccessible, mVParkingLotInfo.isWheelchairAccessible)) != 0) || (compareTo = Boolean.valueOf(mo34467o()).compareTo(Boolean.valueOf(mVParkingLotInfo.mo34467o()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo34467o() || (c = C25082a.m62839c(this.serviceId, mVParkingLotInfo.serviceId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVParkingLotInfo)) {
            return mo34455a((MVParkingLotInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34458f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34459g() {
        return this.deeplinkUrls != null;
    }

    /* renamed from: h */
    public final boolean mo34460h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34462i() {
        return this.location != null;
    }

    /* renamed from: j */
    public final boolean mo34463j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo34464k() {
        return this.operatorName != null;
    }

    /* renamed from: l */
    public final boolean mo34465l() {
        return this.parkingLotId != null;
    }

    /* renamed from: m */
    public final boolean mo34466m() {
        return this.parkingLotName != null;
    }

    /* renamed from: o */
    public final boolean mo34467o() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: p */
    public final void mo34468p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo34469q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: r */
    public final void mo34470r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: s */
    public final void mo34471s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVParkingLotInfo(", "parkingLotName:");
        String str = this.parkingLotName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        if (mo34465l()) {
            n.append(", ");
            n.append("parkingLotId:");
            String str2 = this.parkingLotId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo34458f()) {
            n.append(", ");
            n.append("capacity:");
            n.append(this.capacity);
        }
        if (mo34459g()) {
            n.append(", ");
            n.append("deeplinkUrls:");
            MVExternalAppData mVExternalAppData = this.deeplinkUrls;
            if (mVExternalAppData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVExternalAppData);
            }
        }
        if (mo34464k()) {
            n.append(", ");
            n.append("operatorName:");
            String str3 = this.operatorName;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo34463j()) {
            n.append(", ");
            n.append("operatorId:");
            n.append(this.operatorId);
        }
        if (mo34460h()) {
            n.append(", ");
            n.append("isWheelchairAccessible:");
            n.append(this.isWheelchairAccessible);
        }
        if (mo34467o()) {
            n.append(", ");
            n.append("serviceId:");
            n.append(this.serviceId);
        }
        n.append(")");
        return n.toString();
    }
}
