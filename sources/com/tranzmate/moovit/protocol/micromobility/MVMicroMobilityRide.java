package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVMicroMobilityRide implements TBase<MVMicroMobilityRide, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityRide> {

    /* renamed from: b */
    public static final C25113c f26719b = new C25113c("serviceId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26720c = new C25113c("itemId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26721d = new C25113c("rideId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26722e = new C25113c("creationTime", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f26723f = new C25113c("rideStatusInfo", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f26724g = new C25113c("rideDetails", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f26725h = new C25113c("microMobilityTypeid", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f26726i = new C25113c("microMobilityTypeName", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f26727j = new C25113c("vehicleIllustrationImage", (byte) 12, 9);

    /* renamed from: k */
    public static final HashMap f26728k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f26729l;
    private byte __isset_bitfield = 0;
    public long creationTime;
    public String itemId;
    public String microMobilityTypeName;
    public int microMobilityTypeid;
    private _Fields[] optionals = {_Fields.VEHICLE_ILLUSTRATION_IMAGE};
    public MVMicroMobilityRideDetails rideDetails;
    public int rideId;
    public MVMicroMobilityRideStatusInfo rideStatusInfo;
    public String serviceId;
    public MVImageReferenceWithParams vehicleIllustrationImage;

    public enum _Fields implements C25085c {
        SERVICE_ID(1, "serviceId"),
        ITEM_ID(2, "itemId"),
        RIDE_ID(3, "rideId"),
        CREATION_TIME(4, "creationTime"),
        RIDE_STATUS_INFO(5, "rideStatusInfo"),
        RIDE_DETAILS(6, "rideDetails"),
        MICRO_MOBILITY_TYPEID(7, "microMobilityTypeid"),
        MICRO_MOBILITY_TYPE_NAME(8, "microMobilityTypeName"),
        VEHICLE_ILLUSTRATION_IMAGE(9, "vehicleIllustrationImage");
        
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
                    return SERVICE_ID;
                case 2:
                    return ITEM_ID;
                case 3:
                    return RIDE_ID;
                case 4:
                    return CREATION_TIME;
                case 5:
                    return RIDE_STATUS_INFO;
                case 6:
                    return RIDE_DETAILS;
                case 7:
                    return MICRO_MOBILITY_TYPEID;
                case 8:
                    return MICRO_MOBILITY_TYPE_NAME;
                case 9:
                    return VEHICLE_ILLUSTRATION_IMAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRide$a */
    public static class C9340a extends C25239c<MVMicroMobilityRide> {
        public C9340a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRide mVMicroMobilityRide = (MVMicroMobilityRide) tBase;
            MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = mVMicroMobilityRide.rideStatusInfo;
            MVMicroMobilityRideDetails mVMicroMobilityRideDetails = mVMicroMobilityRide.rideDetails;
            if (mVMicroMobilityRideDetails != null) {
                mVMicroMobilityRideDetails.mo28981D();
            }
            C25113c cVar = MVMicroMobilityRide.f26719b;
            gVar.mo61687K();
            if (mVMicroMobilityRide.serviceId != null) {
                gVar.mo61711x(MVMicroMobilityRide.f26719b);
                gVar.mo61686J(mVMicroMobilityRide.serviceId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRide.itemId != null) {
                gVar.mo61711x(MVMicroMobilityRide.f26720c);
                gVar.mo61686J(mVMicroMobilityRide.itemId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMicroMobilityRide.f26721d);
            gVar.mo61678B(mVMicroMobilityRide.rideId);
            gVar.mo61712y();
            gVar.mo61711x(MVMicroMobilityRide.f26722e);
            gVar.mo61679C(mVMicroMobilityRide.creationTime);
            gVar.mo61712y();
            if (mVMicroMobilityRide.rideStatusInfo != null) {
                gVar.mo61711x(MVMicroMobilityRide.f26723f);
                mVMicroMobilityRide.rideStatusInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRide.rideDetails != null) {
                gVar.mo61711x(MVMicroMobilityRide.f26724g);
                mVMicroMobilityRide.rideDetails.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMicroMobilityRide.f26725h);
            gVar.mo61678B(mVMicroMobilityRide.microMobilityTypeid);
            gVar.mo61712y();
            if (mVMicroMobilityRide.microMobilityTypeName != null) {
                gVar.mo61711x(MVMicroMobilityRide.f26726i);
                gVar.mo61686J(mVMicroMobilityRide.microMobilityTypeName);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRide.vehicleIllustrationImage != null && mVMicroMobilityRide.mo28974o()) {
                gVar.mo61711x(MVMicroMobilityRide.f26727j);
                mVMicroMobilityRide.vehicleIllustrationImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRide mVMicroMobilityRide = (MVMicroMobilityRide) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = mVMicroMobilityRide.rideStatusInfo;
                    MVMicroMobilityRideDetails mVMicroMobilityRideDetails = mVMicroMobilityRide.rideDetails;
                    if (mVMicroMobilityRideDetails != null) {
                        mVMicroMobilityRideDetails.mo28981D();
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
                            mVMicroMobilityRide.serviceId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRide.itemId = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRide.rideId = gVar.mo61696i();
                            mVMicroMobilityRide.mo28977r();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRide.creationTime = gVar.mo61697j();
                            mVMicroMobilityRide.mo28975p();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo2 = new MVMicroMobilityRideStatusInfo();
                            mVMicroMobilityRide.rideStatusInfo = mVMicroMobilityRideStatusInfo2;
                            mVMicroMobilityRideStatusInfo2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMicroMobilityRideDetails mVMicroMobilityRideDetails2 = new MVMicroMobilityRideDetails();
                            mVMicroMobilityRide.rideDetails = mVMicroMobilityRideDetails2;
                            mVMicroMobilityRideDetails2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRide.microMobilityTypeid = gVar.mo61696i();
                            mVMicroMobilityRide.mo28976q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRide.microMobilityTypeName = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVMicroMobilityRide.vehicleIllustrationImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRide$b */
    public static class C9341b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9340a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRide$c */
    public static class C9342c extends C25240d<MVMicroMobilityRide> {
        public C9342c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRide mVMicroMobilityRide = (MVMicroMobilityRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityRide.mo28973m()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityRide.mo28966g()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityRide.mo28971k()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityRide.mo28965f()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityRide.mo28972l()) {
                bitSet.set(4);
            }
            if (mVMicroMobilityRide.mo28970j()) {
                bitSet.set(5);
            }
            if (mVMicroMobilityRide.mo28969i()) {
                bitSet.set(6);
            }
            if (mVMicroMobilityRide.mo28967h()) {
                bitSet.set(7);
            }
            if (mVMicroMobilityRide.mo28974o()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVMicroMobilityRide.mo28973m()) {
                jVar.mo61686J(mVMicroMobilityRide.serviceId);
            }
            if (mVMicroMobilityRide.mo28966g()) {
                jVar.mo61686J(mVMicroMobilityRide.itemId);
            }
            if (mVMicroMobilityRide.mo28971k()) {
                jVar.mo61678B(mVMicroMobilityRide.rideId);
            }
            if (mVMicroMobilityRide.mo28965f()) {
                jVar.mo61679C(mVMicroMobilityRide.creationTime);
            }
            if (mVMicroMobilityRide.mo28972l()) {
                mVMicroMobilityRide.rideStatusInfo.mo25202X0(jVar);
            }
            if (mVMicroMobilityRide.mo28970j()) {
                mVMicroMobilityRide.rideDetails.mo25202X0(jVar);
            }
            if (mVMicroMobilityRide.mo28969i()) {
                jVar.mo61678B(mVMicroMobilityRide.microMobilityTypeid);
            }
            if (mVMicroMobilityRide.mo28967h()) {
                jVar.mo61686J(mVMicroMobilityRide.microMobilityTypeName);
            }
            if (mVMicroMobilityRide.mo28974o()) {
                mVMicroMobilityRide.vehicleIllustrationImage.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRide mVMicroMobilityRide = (MVMicroMobilityRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                mVMicroMobilityRide.serviceId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityRide.itemId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityRide.rideId = jVar.mo61696i();
                mVMicroMobilityRide.mo28977r();
            }
            if (T.get(3)) {
                mVMicroMobilityRide.creationTime = jVar.mo61697j();
                mVMicroMobilityRide.mo28975p();
            }
            if (T.get(4)) {
                MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = new MVMicroMobilityRideStatusInfo();
                mVMicroMobilityRide.rideStatusInfo = mVMicroMobilityRideStatusInfo;
                mVMicroMobilityRideStatusInfo.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVMicroMobilityRideDetails mVMicroMobilityRideDetails = new MVMicroMobilityRideDetails();
                mVMicroMobilityRide.rideDetails = mVMicroMobilityRideDetails;
                mVMicroMobilityRideDetails.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVMicroMobilityRide.microMobilityTypeid = jVar.mo61696i();
                mVMicroMobilityRide.mo28976q();
            }
            if (T.get(7)) {
                mVMicroMobilityRide.microMobilityTypeName = jVar.mo61704q();
            }
            if (T.get(8)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVMicroMobilityRide.vehicleIllustrationImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRide$d */
    public static class C9343d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9342c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityRide");
        HashMap hashMap = new HashMap();
        f26728k = hashMap;
        hashMap.put(C25239c.class, new C9341b());
        hashMap.put(C25240d.class, new C9343d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITEM_ID, new FieldMetaData("itemId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CREATION_TIME, new FieldMetaData("creationTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.RIDE_STATUS_INFO, new FieldMetaData("rideStatusInfo", (byte) 3, new StructMetaData(MVMicroMobilityRideStatusInfo.class)));
        enumMap.put(_Fields.RIDE_DETAILS, new FieldMetaData("rideDetails", (byte) 3, new StructMetaData(MVMicroMobilityRideDetails.class)));
        enumMap.put(_Fields.MICRO_MOBILITY_TYPEID, new FieldMetaData("microMobilityTypeid", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MICRO_MOBILITY_TYPE_NAME, new FieldMetaData("microMobilityTypeName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VEHICLE_ILLUSTRATION_IMAGE, new FieldMetaData("vehicleIllustrationImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26729l = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityRide.class, unmodifiableMap);
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
        ((C25238b) f26728k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26728k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityRide mVMicroMobilityRide = (MVMicroMobilityRide) obj;
        if (!getClass().equals(mVMicroMobilityRide.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityRide.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28973m()).compareTo(Boolean.valueOf(mVMicroMobilityRide.mo28973m()));
        if (compareTo2 != 0 || ((mo28973m() && (compareTo2 = this.serviceId.compareTo(mVMicroMobilityRide.serviceId)) != 0) || (compareTo2 = Boolean.valueOf(mo28966g()).compareTo(Boolean.valueOf(mVMicroMobilityRide.mo28966g()))) != 0 || ((mo28966g() && (compareTo2 = this.itemId.compareTo(mVMicroMobilityRide.itemId)) != 0) || (compareTo2 = Boolean.valueOf(mo28971k()).compareTo(Boolean.valueOf(mVMicroMobilityRide.mo28971k()))) != 0 || ((mo28971k() && (compareTo2 = C25082a.m62839c(this.rideId, mVMicroMobilityRide.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo28965f()).compareTo(Boolean.valueOf(mVMicroMobilityRide.mo28965f()))) != 0 || ((mo28965f() && (compareTo2 = C25082a.m62840d(this.creationTime, mVMicroMobilityRide.creationTime)) != 0) || (compareTo2 = Boolean.valueOf(mo28972l()).compareTo(Boolean.valueOf(mVMicroMobilityRide.mo28972l()))) != 0 || ((mo28972l() && (compareTo2 = this.rideStatusInfo.compareTo(mVMicroMobilityRide.rideStatusInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo28970j()).compareTo(Boolean.valueOf(mVMicroMobilityRide.mo28970j()))) != 0 || ((mo28970j() && (compareTo2 = this.rideDetails.compareTo(mVMicroMobilityRide.rideDetails)) != 0) || (compareTo2 = Boolean.valueOf(mo28969i()).compareTo(Boolean.valueOf(mVMicroMobilityRide.mo28969i()))) != 0 || ((mo28969i() && (compareTo2 = C25082a.m62839c(this.microMobilityTypeid, mVMicroMobilityRide.microMobilityTypeid)) != 0) || (compareTo2 = Boolean.valueOf(mo28967h()).compareTo(Boolean.valueOf(mVMicroMobilityRide.mo28967h()))) != 0 || ((mo28967h() && (compareTo2 = this.microMobilityTypeName.compareTo(mVMicroMobilityRide.microMobilityTypeName)) != 0) || (compareTo2 = Boolean.valueOf(mo28974o()).compareTo(Boolean.valueOf(mVMicroMobilityRide.mo28974o()))) != 0))))))))) {
            return compareTo2;
        }
        if (!mo28974o() || (compareTo = this.vehicleIllustrationImage.compareTo(mVMicroMobilityRide.vehicleIllustrationImage)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityRide)) {
            return false;
        }
        MVMicroMobilityRide mVMicroMobilityRide = (MVMicroMobilityRide) obj;
        boolean m = mo28973m();
        boolean m2 = mVMicroMobilityRide.mo28973m();
        if ((m || m2) && (!m || !m2 || !this.serviceId.equals(mVMicroMobilityRide.serviceId))) {
            return false;
        }
        boolean g = mo28966g();
        boolean g2 = mVMicroMobilityRide.mo28966g();
        if (((g || g2) && (!g || !g2 || !this.itemId.equals(mVMicroMobilityRide.itemId))) || this.rideId != mVMicroMobilityRide.rideId || this.creationTime != mVMicroMobilityRide.creationTime) {
            return false;
        }
        boolean l = mo28972l();
        boolean l2 = mVMicroMobilityRide.mo28972l();
        if ((l || l2) && (!l || !l2 || !this.rideStatusInfo.mo29016a(mVMicroMobilityRide.rideStatusInfo))) {
            return false;
        }
        boolean j = mo28970j();
        boolean j2 = mVMicroMobilityRide.mo28970j();
        if (((j || j2) && (!j || !j2 || !this.rideDetails.mo28982a(mVMicroMobilityRide.rideDetails))) || this.microMobilityTypeid != mVMicroMobilityRide.microMobilityTypeid) {
            return false;
        }
        boolean h = mo28967h();
        boolean h2 = mVMicroMobilityRide.mo28967h();
        if ((h || h2) && (!h || !h2 || !this.microMobilityTypeName.equals(mVMicroMobilityRide.microMobilityTypeName))) {
            return false;
        }
        boolean o = mo28974o();
        boolean o2 = mVMicroMobilityRide.mo28974o();
        if ((o || o2) && (!o || !o2 || !this.vehicleIllustrationImage.mo26245a(mVMicroMobilityRide.vehicleIllustrationImage))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28965f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo28966g() {
        return this.itemId != null;
    }

    /* renamed from: h */
    public final boolean mo28967h() {
        return this.microMobilityTypeName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28969i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo28970j() {
        return this.rideDetails != null;
    }

    /* renamed from: k */
    public final boolean mo28971k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final boolean mo28972l() {
        return this.rideStatusInfo != null;
    }

    /* renamed from: m */
    public final boolean mo28973m() {
        return this.serviceId != null;
    }

    /* renamed from: o */
    public final boolean mo28974o() {
        return this.vehicleIllustrationImage != null;
    }

    /* renamed from: p */
    public final void mo28975p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: q */
    public final void mo28976q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: r */
    public final void mo28977r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityRide(", "serviceId:");
        String str = this.serviceId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("itemId:");
        String str2 = this.itemId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("rideId:");
        C0016g.m42z(n, this.rideId, ", ", "creationTime:");
        C25541a.m63889t(n, this.creationTime, ", ", "rideStatusInfo:");
        MVMicroMobilityRideStatusInfo mVMicroMobilityRideStatusInfo = this.rideStatusInfo;
        if (mVMicroMobilityRideStatusInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMicroMobilityRideStatusInfo);
        }
        n.append(", ");
        n.append("rideDetails:");
        MVMicroMobilityRideDetails mVMicroMobilityRideDetails = this.rideDetails;
        if (mVMicroMobilityRideDetails == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMicroMobilityRideDetails);
        }
        n.append(", ");
        n.append("microMobilityTypeid:");
        C0016g.m42z(n, this.microMobilityTypeid, ", ", "microMobilityTypeName:");
        String str3 = this.microMobilityTypeName;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo28974o()) {
            n.append(", ");
            n.append("vehicleIllustrationImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.vehicleIllustrationImage;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        n.append(")");
        return n.toString();
    }
}
