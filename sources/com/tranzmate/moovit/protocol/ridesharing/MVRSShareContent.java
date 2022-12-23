package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVVehicleType;
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

public class MVRSShareContent implements TBase<MVRSShareContent, _Fields>, Serializable, Cloneable, Comparable<MVRSShareContent> {

    /* renamed from: b */
    public static final C25113c f28104b = new C25113c("superEventId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28105c = new C25113c("referralUserKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28106d = new C25113c("referralUserName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28107e = new C25113c("referralLocation", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28108f = new C25113c("referralArrivalVehicleType", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f28109g = new C25113c("referralBucketId", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f28110h = new C25113c("referralArrivalEventId", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f28111i = new C25113c("referralReturnVehicleType", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f28112j = new C25113c("referralReturnEventId", (byte) 8, 9);

    /* renamed from: k */
    public static final HashMap f28113k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f28114l;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.REFERRAL_USER_KEY, _Fields.REFERRAL_USER_NAME, _Fields.REFERRAL_LOCATION, _Fields.REFERRAL_ARRIVAL_VEHICLE_TYPE, _Fields.REFERRAL_BUCKET_ID, _Fields.REFERRAL_ARRIVAL_EVENT_ID, _Fields.REFERRAL_RETURN_VEHICLE_TYPE, _Fields.REFERRAL_RETURN_EVENT_ID};
    public int referralArrivalEventId;
    public MVVehicleType referralArrivalVehicleType;
    public int referralBucketId;
    public MVLocationDescriptor referralLocation;
    public int referralReturnEventId;
    public MVVehicleType referralReturnVehicleType;
    public String referralUserKey;
    public String referralUserName;
    public int superEventId;

    public enum _Fields implements C25085c {
        SUPER_EVENT_ID(1, "superEventId"),
        REFERRAL_USER_KEY(2, "referralUserKey"),
        REFERRAL_USER_NAME(3, "referralUserName"),
        REFERRAL_LOCATION(4, "referralLocation"),
        REFERRAL_ARRIVAL_VEHICLE_TYPE(5, "referralArrivalVehicleType"),
        REFERRAL_BUCKET_ID(6, "referralBucketId"),
        REFERRAL_ARRIVAL_EVENT_ID(7, "referralArrivalEventId"),
        REFERRAL_RETURN_VEHICLE_TYPE(8, "referralReturnVehicleType"),
        REFERRAL_RETURN_EVENT_ID(9, "referralReturnEventId");
        
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
                    return SUPER_EVENT_ID;
                case 2:
                    return REFERRAL_USER_KEY;
                case 3:
                    return REFERRAL_USER_NAME;
                case 4:
                    return REFERRAL_LOCATION;
                case 5:
                    return REFERRAL_ARRIVAL_VEHICLE_TYPE;
                case 6:
                    return REFERRAL_BUCKET_ID;
                case 7:
                    return REFERRAL_ARRIVAL_EVENT_ID;
                case 8:
                    return REFERRAL_RETURN_VEHICLE_TYPE;
                case 9:
                    return REFERRAL_RETURN_EVENT_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSShareContent$a */
    public static class C10382a extends C25239c<MVRSShareContent> {
        public C10382a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSShareContent mVRSShareContent = (MVRSShareContent) tBase;
            MVLocationDescriptor mVLocationDescriptor = mVRSShareContent.referralLocation;
            if (mVLocationDescriptor != null) {
                mVLocationDescriptor.mo26333s();
            }
            C25113c cVar = MVRSShareContent.f28104b;
            gVar.mo61687K();
            gVar.mo61711x(MVRSShareContent.f28104b);
            gVar.mo61678B(mVRSShareContent.superEventId);
            gVar.mo61712y();
            if (mVRSShareContent.referralUserKey != null && mVRSShareContent.mo31360l()) {
                gVar.mo61711x(MVRSShareContent.f28105c);
                gVar.mo61686J(mVRSShareContent.referralUserKey);
                gVar.mo61712y();
            }
            if (mVRSShareContent.referralUserName != null && mVRSShareContent.mo31361m()) {
                gVar.mo61711x(MVRSShareContent.f28106d);
                gVar.mo61686J(mVRSShareContent.referralUserName);
                gVar.mo61712y();
            }
            if (mVRSShareContent.referralLocation != null && mVRSShareContent.mo31357i()) {
                gVar.mo61711x(MVRSShareContent.f28107e);
                mVRSShareContent.referralLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSShareContent.referralArrivalVehicleType != null && mVRSShareContent.mo31354g()) {
                gVar.mo61711x(MVRSShareContent.f28108f);
                gVar.mo61678B(mVRSShareContent.referralArrivalVehicleType.getValue());
                gVar.mo61712y();
            }
            if (mVRSShareContent.mo31355h()) {
                gVar.mo61711x(MVRSShareContent.f28109g);
                gVar.mo61678B(mVRSShareContent.referralBucketId);
                gVar.mo61712y();
            }
            if (mVRSShareContent.mo31353f()) {
                gVar.mo61711x(MVRSShareContent.f28110h);
                gVar.mo61678B(mVRSShareContent.referralArrivalEventId);
                gVar.mo61712y();
            }
            if (mVRSShareContent.referralReturnVehicleType != null && mVRSShareContent.mo31359k()) {
                gVar.mo61711x(MVRSShareContent.f28111i);
                gVar.mo61678B(mVRSShareContent.referralReturnVehicleType.getValue());
                gVar.mo61712y();
            }
            if (mVRSShareContent.mo31358j()) {
                gVar.mo61711x(MVRSShareContent.f28112j);
                gVar.mo61678B(mVRSShareContent.referralReturnEventId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSShareContent mVRSShareContent = (MVRSShareContent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLocationDescriptor mVLocationDescriptor = mVRSShareContent.referralLocation;
                    if (mVLocationDescriptor != null) {
                        mVLocationDescriptor.mo26333s();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSShareContent.superEventId = gVar.mo61696i();
                            mVRSShareContent.mo31366s();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSShareContent.referralUserKey = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSShareContent.referralUserName = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                            mVRSShareContent.referralLocation = mVLocationDescriptor2;
                            mVLocationDescriptor2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSShareContent.referralArrivalVehicleType = MVVehicleType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSShareContent.referralBucketId = gVar.mo61696i();
                            mVRSShareContent.mo31364q();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSShareContent.referralArrivalEventId = gVar.mo61696i();
                            mVRSShareContent.mo31363p();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSShareContent.referralReturnVehicleType = MVVehicleType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSShareContent.referralReturnEventId = gVar.mo61696i();
                            mVRSShareContent.mo31365r();
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSShareContent$b */
    public static class C10383b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10382a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSShareContent$c */
    public static class C10384c extends C25240d<MVRSShareContent> {
        public C10384c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSShareContent mVRSShareContent = (MVRSShareContent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSShareContent.mo31362o()) {
                bitSet.set(0);
            }
            if (mVRSShareContent.mo31360l()) {
                bitSet.set(1);
            }
            if (mVRSShareContent.mo31361m()) {
                bitSet.set(2);
            }
            if (mVRSShareContent.mo31357i()) {
                bitSet.set(3);
            }
            if (mVRSShareContent.mo31354g()) {
                bitSet.set(4);
            }
            if (mVRSShareContent.mo31355h()) {
                bitSet.set(5);
            }
            if (mVRSShareContent.mo31353f()) {
                bitSet.set(6);
            }
            if (mVRSShareContent.mo31359k()) {
                bitSet.set(7);
            }
            if (mVRSShareContent.mo31358j()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVRSShareContent.mo31362o()) {
                jVar.mo61678B(mVRSShareContent.superEventId);
            }
            if (mVRSShareContent.mo31360l()) {
                jVar.mo61686J(mVRSShareContent.referralUserKey);
            }
            if (mVRSShareContent.mo31361m()) {
                jVar.mo61686J(mVRSShareContent.referralUserName);
            }
            if (mVRSShareContent.mo31357i()) {
                mVRSShareContent.referralLocation.mo25202X0(jVar);
            }
            if (mVRSShareContent.mo31354g()) {
                jVar.mo61678B(mVRSShareContent.referralArrivalVehicleType.getValue());
            }
            if (mVRSShareContent.mo31355h()) {
                jVar.mo61678B(mVRSShareContent.referralBucketId);
            }
            if (mVRSShareContent.mo31353f()) {
                jVar.mo61678B(mVRSShareContent.referralArrivalEventId);
            }
            if (mVRSShareContent.mo31359k()) {
                jVar.mo61678B(mVRSShareContent.referralReturnVehicleType.getValue());
            }
            if (mVRSShareContent.mo31358j()) {
                jVar.mo61678B(mVRSShareContent.referralReturnEventId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSShareContent mVRSShareContent = (MVRSShareContent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                mVRSShareContent.superEventId = jVar.mo61696i();
                mVRSShareContent.mo31366s();
            }
            if (T.get(1)) {
                mVRSShareContent.referralUserKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVRSShareContent.referralUserName = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVRSShareContent.referralLocation = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVRSShareContent.referralArrivalVehicleType = MVVehicleType.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                mVRSShareContent.referralBucketId = jVar.mo61696i();
                mVRSShareContent.mo31364q();
            }
            if (T.get(6)) {
                mVRSShareContent.referralArrivalEventId = jVar.mo61696i();
                mVRSShareContent.mo31363p();
            }
            if (T.get(7)) {
                mVRSShareContent.referralReturnVehicleType = MVVehicleType.findByValue(jVar.mo61696i());
            }
            if (T.get(8)) {
                mVRSShareContent.referralReturnEventId = jVar.mo61696i();
                mVRSShareContent.mo31365r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSShareContent$d */
    public static class C10385d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10384c(0);
        }
    }

    static {
        Class<MVVehicleType> cls = MVVehicleType.class;
        new C17394d0("MVRSShareContent");
        HashMap hashMap = new HashMap();
        f28113k = hashMap;
        hashMap.put(C25239c.class, new C10383b());
        hashMap.put(C25240d.class, new C10385d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPER_EVENT_ID, new FieldMetaData("superEventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.REFERRAL_USER_KEY, new FieldMetaData("referralUserKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REFERRAL_USER_NAME, new FieldMetaData("referralUserName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REFERRAL_LOCATION, new FieldMetaData("referralLocation", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.REFERRAL_ARRIVAL_VEHICLE_TYPE, new FieldMetaData("referralArrivalVehicleType", (byte) 2, new EnumMetaData(cls)));
        enumMap.put(_Fields.REFERRAL_BUCKET_ID, new FieldMetaData("referralBucketId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.REFERRAL_ARRIVAL_EVENT_ID, new FieldMetaData("referralArrivalEventId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.REFERRAL_RETURN_VEHICLE_TYPE, new FieldMetaData("referralReturnVehicleType", (byte) 2, new EnumMetaData(cls)));
        enumMap.put(_Fields.REFERRAL_RETURN_EVENT_ID, new FieldMetaData("referralReturnEventId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28114l = unmodifiableMap;
        FieldMetaData.m61947a(MVRSShareContent.class, unmodifiableMap);
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
        ((C25238b) f28113k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28113k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVRSShareContent mVRSShareContent = (MVRSShareContent) obj;
        if (!getClass().equals(mVRSShareContent.getClass())) {
            return getClass().getName().compareTo(mVRSShareContent.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31362o()).compareTo(Boolean.valueOf(mVRSShareContent.mo31362o()));
        if (compareTo != 0 || ((mo31362o() && (compareTo = C25082a.m62839c(this.superEventId, mVRSShareContent.superEventId)) != 0) || (compareTo = Boolean.valueOf(mo31360l()).compareTo(Boolean.valueOf(mVRSShareContent.mo31360l()))) != 0 || ((mo31360l() && (compareTo = this.referralUserKey.compareTo(mVRSShareContent.referralUserKey)) != 0) || (compareTo = Boolean.valueOf(mo31361m()).compareTo(Boolean.valueOf(mVRSShareContent.mo31361m()))) != 0 || ((mo31361m() && (compareTo = this.referralUserName.compareTo(mVRSShareContent.referralUserName)) != 0) || (compareTo = Boolean.valueOf(mo31357i()).compareTo(Boolean.valueOf(mVRSShareContent.mo31357i()))) != 0 || ((mo31357i() && (compareTo = this.referralLocation.compareTo(mVRSShareContent.referralLocation)) != 0) || (compareTo = Boolean.valueOf(mo31354g()).compareTo(Boolean.valueOf(mVRSShareContent.mo31354g()))) != 0 || ((mo31354g() && (compareTo = this.referralArrivalVehicleType.compareTo(mVRSShareContent.referralArrivalVehicleType)) != 0) || (compareTo = Boolean.valueOf(mo31355h()).compareTo(Boolean.valueOf(mVRSShareContent.mo31355h()))) != 0 || ((mo31355h() && (compareTo = C25082a.m62839c(this.referralBucketId, mVRSShareContent.referralBucketId)) != 0) || (compareTo = Boolean.valueOf(mo31353f()).compareTo(Boolean.valueOf(mVRSShareContent.mo31353f()))) != 0 || ((mo31353f() && (compareTo = C25082a.m62839c(this.referralArrivalEventId, mVRSShareContent.referralArrivalEventId)) != 0) || (compareTo = Boolean.valueOf(mo31359k()).compareTo(Boolean.valueOf(mVRSShareContent.mo31359k()))) != 0 || ((mo31359k() && (compareTo = this.referralReturnVehicleType.compareTo(mVRSShareContent.referralReturnVehicleType)) != 0) || (compareTo = Boolean.valueOf(mo31358j()).compareTo(Boolean.valueOf(mVRSShareContent.mo31358j()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo31358j() || (c = C25082a.m62839c(this.referralReturnEventId, mVRSShareContent.referralReturnEventId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSShareContent)) {
            return false;
        }
        MVRSShareContent mVRSShareContent = (MVRSShareContent) obj;
        if (this.superEventId != mVRSShareContent.superEventId) {
            return false;
        }
        boolean l = mo31360l();
        boolean l2 = mVRSShareContent.mo31360l();
        if ((l || l2) && (!l || !l2 || !this.referralUserKey.equals(mVRSShareContent.referralUserKey))) {
            return false;
        }
        boolean m = mo31361m();
        boolean m2 = mVRSShareContent.mo31361m();
        if ((m || m2) && (!m || !m2 || !this.referralUserName.equals(mVRSShareContent.referralUserName))) {
            return false;
        }
        boolean i = mo31357i();
        boolean i2 = mVRSShareContent.mo31357i();
        if ((i || i2) && (!i || !i2 || !this.referralLocation.mo26317a(mVRSShareContent.referralLocation))) {
            return false;
        }
        boolean g = mo31354g();
        boolean g2 = mVRSShareContent.mo31354g();
        if ((g || g2) && (!g || !g2 || !this.referralArrivalVehicleType.equals(mVRSShareContent.referralArrivalVehicleType))) {
            return false;
        }
        boolean h = mo31355h();
        boolean h2 = mVRSShareContent.mo31355h();
        if ((h || h2) && (!h || !h2 || this.referralBucketId != mVRSShareContent.referralBucketId)) {
            return false;
        }
        boolean f = mo31353f();
        boolean f2 = mVRSShareContent.mo31353f();
        if ((f || f2) && (!f || !f2 || this.referralArrivalEventId != mVRSShareContent.referralArrivalEventId)) {
            return false;
        }
        boolean k = mo31359k();
        boolean k2 = mVRSShareContent.mo31359k();
        if ((k || k2) && (!k || !k2 || !this.referralReturnVehicleType.equals(mVRSShareContent.referralReturnVehicleType))) {
            return false;
        }
        boolean j = mo31358j();
        boolean j2 = mVRSShareContent.mo31358j();
        if ((j || j2) && (!j || !j2 || this.referralReturnEventId != mVRSShareContent.referralReturnEventId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31353f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo31354g() {
        return this.referralArrivalVehicleType != null;
    }

    /* renamed from: h */
    public final boolean mo31355h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31357i() {
        return this.referralLocation != null;
    }

    /* renamed from: j */
    public final boolean mo31358j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo31359k() {
        return this.referralReturnVehicleType != null;
    }

    /* renamed from: l */
    public final boolean mo31360l() {
        return this.referralUserKey != null;
    }

    /* renamed from: m */
    public final boolean mo31361m() {
        return this.referralUserName != null;
    }

    /* renamed from: o */
    public final boolean mo31362o() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: p */
    public final void mo31363p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: q */
    public final void mo31364q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: r */
    public final void mo31365r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: s */
    public final void mo31366s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSShareContent(", "superEventId:");
        n.append(this.superEventId);
        if (mo31360l()) {
            n.append(", ");
            n.append("referralUserKey:");
            String str = this.referralUserKey;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo31361m()) {
            n.append(", ");
            n.append("referralUserName:");
            String str2 = this.referralUserName;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo31357i()) {
            n.append(", ");
            n.append("referralLocation:");
            MVLocationDescriptor mVLocationDescriptor = this.referralLocation;
            if (mVLocationDescriptor == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationDescriptor);
            }
        }
        if (mo31354g()) {
            n.append(", ");
            n.append("referralArrivalVehicleType:");
            MVVehicleType mVVehicleType = this.referralArrivalVehicleType;
            if (mVVehicleType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVVehicleType);
            }
        }
        if (mo31355h()) {
            n.append(", ");
            n.append("referralBucketId:");
            n.append(this.referralBucketId);
        }
        if (mo31353f()) {
            n.append(", ");
            n.append("referralArrivalEventId:");
            n.append(this.referralArrivalEventId);
        }
        if (mo31359k()) {
            n.append(", ");
            n.append("referralReturnVehicleType:");
            MVVehicleType mVVehicleType2 = this.referralReturnVehicleType;
            if (mVVehicleType2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVVehicleType2);
            }
        }
        if (mo31358j()) {
            n.append(", ");
            n.append("referralReturnEventId:");
            n.append(this.referralReturnEventId);
        }
        n.append(")");
        return n.toString();
    }
}
