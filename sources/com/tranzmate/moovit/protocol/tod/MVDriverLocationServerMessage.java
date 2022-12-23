package com.tranzmate.moovit.protocol.tod;

import com.appboy.models.outgoing.FacebookUser;
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

public class MVDriverLocationServerMessage implements TBase<MVDriverLocationServerMessage, _Fields>, Serializable, Cloneable, Comparable<MVDriverLocationServerMessage> {

    /* renamed from: b */
    public static final C25113c f29324b = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29325c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f29326d = new C25113c("sentSuccessfully", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f29327e = new C25113c("activeItineraryId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f29328f = new C25113c("provider", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f29329g = new C25113c("vehicleId", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f29330h = new C25113c("driverId", (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f29331i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f29332j;
    private byte __isset_bitfield = 0;
    public int activeItineraryId;
    public String driverId;
    public MVGpsLocation location;
    private _Fields[] optionals = {_Fields.ACTIVE_ITINERARY_ID, _Fields.PROVIDER, _Fields.VEHICLE_ID, _Fields.DRIVER_ID};
    public String provider;
    public boolean sentSuccessfully;
    public long timestamp;
    public String vehicleId;

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        TIMESTAMP(2, "timestamp"),
        SENT_SUCCESSFULLY(3, "sentSuccessfully"),
        ACTIVE_ITINERARY_ID(4, "activeItineraryId"),
        PROVIDER(5, "provider"),
        VEHICLE_ID(6, "vehicleId"),
        DRIVER_ID(7, "driverId");
        
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
                    return LOCATION;
                case 2:
                    return TIMESTAMP;
                case 3:
                    return SENT_SUCCESSFULLY;
                case 4:
                    return ACTIVE_ITINERARY_ID;
                case 5:
                    return PROVIDER;
                case 6:
                    return VEHICLE_ID;
                case 7:
                    return DRIVER_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverLocationServerMessage$a */
    public static class C11168a extends C25239c<MVDriverLocationServerMessage> {
        public C11168a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverLocationServerMessage mVDriverLocationServerMessage = (MVDriverLocationServerMessage) tBase;
            MVGpsLocation mVGpsLocation = mVDriverLocationServerMessage.location;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVDriverLocationServerMessage.f29324b;
            gVar.mo61687K();
            if (mVDriverLocationServerMessage.location != null) {
                gVar.mo61711x(MVDriverLocationServerMessage.f29324b);
                mVDriverLocationServerMessage.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDriverLocationServerMessage.f29325c);
            gVar.mo61679C(mVDriverLocationServerMessage.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVDriverLocationServerMessage.f29326d);
            gVar.mo61708u(mVDriverLocationServerMessage.sentSuccessfully);
            gVar.mo61712y();
            if (mVDriverLocationServerMessage.mo33303f()) {
                gVar.mo61711x(MVDriverLocationServerMessage.f29327e);
                gVar.mo61678B(mVDriverLocationServerMessage.activeItineraryId);
                gVar.mo61712y();
            }
            if (mVDriverLocationServerMessage.provider != null && mVDriverLocationServerMessage.mo33307i()) {
                gVar.mo61711x(MVDriverLocationServerMessage.f29328f);
                gVar.mo61686J(mVDriverLocationServerMessage.provider);
                gVar.mo61712y();
            }
            if (mVDriverLocationServerMessage.vehicleId != null && mVDriverLocationServerMessage.mo33310l()) {
                gVar.mo61711x(MVDriverLocationServerMessage.f29329g);
                gVar.mo61686J(mVDriverLocationServerMessage.vehicleId);
                gVar.mo61712y();
            }
            if (mVDriverLocationServerMessage.driverId != null && mVDriverLocationServerMessage.mo33304g()) {
                gVar.mo61711x(MVDriverLocationServerMessage.f29330h);
                gVar.mo61686J(mVDriverLocationServerMessage.driverId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverLocationServerMessage mVDriverLocationServerMessage = (MVDriverLocationServerMessage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVGpsLocation mVGpsLocation = mVDriverLocationServerMessage.location;
                    if (mVGpsLocation != null) {
                        mVGpsLocation.mo26193r();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVGpsLocation mVGpsLocation2 = new MVGpsLocation();
                            mVDriverLocationServerMessage.location = mVGpsLocation2;
                            mVGpsLocation2.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDriverLocationServerMessage.timestamp = gVar.mo61697j();
                            mVDriverLocationServerMessage.mo33313p();
                            break;
                        }
                    case 3:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDriverLocationServerMessage.sentSuccessfully = gVar.mo61690c();
                            mVDriverLocationServerMessage.mo33312o();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDriverLocationServerMessage.activeItineraryId = gVar.mo61696i();
                            mVDriverLocationServerMessage.mo33311m();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDriverLocationServerMessage.provider = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDriverLocationServerMessage.vehicleId = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDriverLocationServerMessage.driverId = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverLocationServerMessage$b */
    public static class C11169b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11168a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverLocationServerMessage$c */
    public static class C11170c extends C25240d<MVDriverLocationServerMessage> {
        public C11170c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverLocationServerMessage mVDriverLocationServerMessage = (MVDriverLocationServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDriverLocationServerMessage.mo33305h()) {
                bitSet.set(0);
            }
            if (mVDriverLocationServerMessage.mo33309k()) {
                bitSet.set(1);
            }
            if (mVDriverLocationServerMessage.mo33308j()) {
                bitSet.set(2);
            }
            if (mVDriverLocationServerMessage.mo33303f()) {
                bitSet.set(3);
            }
            if (mVDriverLocationServerMessage.mo33307i()) {
                bitSet.set(4);
            }
            if (mVDriverLocationServerMessage.mo33310l()) {
                bitSet.set(5);
            }
            if (mVDriverLocationServerMessage.mo33304g()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVDriverLocationServerMessage.mo33305h()) {
                mVDriverLocationServerMessage.location.mo25202X0(jVar);
            }
            if (mVDriverLocationServerMessage.mo33309k()) {
                jVar.mo61679C(mVDriverLocationServerMessage.timestamp);
            }
            if (mVDriverLocationServerMessage.mo33308j()) {
                jVar.mo61708u(mVDriverLocationServerMessage.sentSuccessfully);
            }
            if (mVDriverLocationServerMessage.mo33303f()) {
                jVar.mo61678B(mVDriverLocationServerMessage.activeItineraryId);
            }
            if (mVDriverLocationServerMessage.mo33307i()) {
                jVar.mo61686J(mVDriverLocationServerMessage.provider);
            }
            if (mVDriverLocationServerMessage.mo33310l()) {
                jVar.mo61686J(mVDriverLocationServerMessage.vehicleId);
            }
            if (mVDriverLocationServerMessage.mo33304g()) {
                jVar.mo61686J(mVDriverLocationServerMessage.driverId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverLocationServerMessage mVDriverLocationServerMessage = (MVDriverLocationServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVDriverLocationServerMessage.location = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVDriverLocationServerMessage.timestamp = jVar.mo61697j();
                mVDriverLocationServerMessage.mo33313p();
            }
            if (T.get(2)) {
                mVDriverLocationServerMessage.sentSuccessfully = jVar.mo61690c();
                mVDriverLocationServerMessage.mo33312o();
            }
            if (T.get(3)) {
                mVDriverLocationServerMessage.activeItineraryId = jVar.mo61696i();
                mVDriverLocationServerMessage.mo33311m();
            }
            if (T.get(4)) {
                mVDriverLocationServerMessage.provider = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVDriverLocationServerMessage.vehicleId = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVDriverLocationServerMessage.driverId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverLocationServerMessage$d */
    public static class C11171d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11170c(0);
        }
    }

    static {
        new C17394d0("MVDriverLocationServerMessage");
        HashMap hashMap = new HashMap();
        f29331i = hashMap;
        hashMap.put(C25239c.class, new C11169b());
        hashMap.put(C25240d.class, new C11171d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.SENT_SUCCESSFULLY, new FieldMetaData("sentSuccessfully", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ACTIVE_ITINERARY_ID, new FieldMetaData("activeItineraryId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PROVIDER, new FieldMetaData("provider", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VEHICLE_ID, new FieldMetaData("vehicleId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DRIVER_ID, new FieldMetaData("driverId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29332j = unmodifiableMap;
        FieldMetaData.m61947a(MVDriverLocationServerMessage.class, unmodifiableMap);
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
        ((C25238b) f29331i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29331i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDriverLocationServerMessage mVDriverLocationServerMessage = (MVDriverLocationServerMessage) obj;
        if (!getClass().equals(mVDriverLocationServerMessage.getClass())) {
            return getClass().getName().compareTo(mVDriverLocationServerMessage.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33305h()).compareTo(Boolean.valueOf(mVDriverLocationServerMessage.mo33305h()));
        if (compareTo2 != 0 || ((mo33305h() && (compareTo2 = this.location.compareTo(mVDriverLocationServerMessage.location)) != 0) || (compareTo2 = Boolean.valueOf(mo33309k()).compareTo(Boolean.valueOf(mVDriverLocationServerMessage.mo33309k()))) != 0 || ((mo33309k() && (compareTo2 = C25082a.m62840d(this.timestamp, mVDriverLocationServerMessage.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo33308j()).compareTo(Boolean.valueOf(mVDriverLocationServerMessage.mo33308j()))) != 0 || ((mo33308j() && (compareTo2 = C25082a.m62848l(this.sentSuccessfully, mVDriverLocationServerMessage.sentSuccessfully)) != 0) || (compareTo2 = Boolean.valueOf(mo33303f()).compareTo(Boolean.valueOf(mVDriverLocationServerMessage.mo33303f()))) != 0 || ((mo33303f() && (compareTo2 = C25082a.m62839c(this.activeItineraryId, mVDriverLocationServerMessage.activeItineraryId)) != 0) || (compareTo2 = Boolean.valueOf(mo33307i()).compareTo(Boolean.valueOf(mVDriverLocationServerMessage.mo33307i()))) != 0 || ((mo33307i() && (compareTo2 = this.provider.compareTo(mVDriverLocationServerMessage.provider)) != 0) || (compareTo2 = Boolean.valueOf(mo33310l()).compareTo(Boolean.valueOf(mVDriverLocationServerMessage.mo33310l()))) != 0 || ((mo33310l() && (compareTo2 = this.vehicleId.compareTo(mVDriverLocationServerMessage.vehicleId)) != 0) || (compareTo2 = Boolean.valueOf(mo33304g()).compareTo(Boolean.valueOf(mVDriverLocationServerMessage.mo33304g()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo33304g() || (compareTo = this.driverId.compareTo(mVDriverLocationServerMessage.driverId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDriverLocationServerMessage)) {
            return false;
        }
        MVDriverLocationServerMessage mVDriverLocationServerMessage = (MVDriverLocationServerMessage) obj;
        boolean h = mo33305h();
        boolean h2 = mVDriverLocationServerMessage.mo33305h();
        if (((h || h2) && (!h || !h2 || !this.location.mo26178a(mVDriverLocationServerMessage.location))) || this.timestamp != mVDriverLocationServerMessage.timestamp || this.sentSuccessfully != mVDriverLocationServerMessage.sentSuccessfully) {
            return false;
        }
        boolean f = mo33303f();
        boolean f2 = mVDriverLocationServerMessage.mo33303f();
        if ((f || f2) && (!f || !f2 || this.activeItineraryId != mVDriverLocationServerMessage.activeItineraryId)) {
            return false;
        }
        boolean i = mo33307i();
        boolean i2 = mVDriverLocationServerMessage.mo33307i();
        if ((i || i2) && (!i || !i2 || !this.provider.equals(mVDriverLocationServerMessage.provider))) {
            return false;
        }
        boolean l = mo33310l();
        boolean l2 = mVDriverLocationServerMessage.mo33310l();
        if ((l || l2) && (!l || !l2 || !this.vehicleId.equals(mVDriverLocationServerMessage.vehicleId))) {
            return false;
        }
        boolean g = mo33304g();
        boolean g2 = mVDriverLocationServerMessage.mo33304g();
        if ((g || g2) && (!g || !g2 || !this.driverId.equals(mVDriverLocationServerMessage.driverId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33303f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo33304g() {
        return this.driverId != null;
    }

    /* renamed from: h */
    public final boolean mo33305h() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33307i() {
        return this.provider != null;
    }

    /* renamed from: j */
    public final boolean mo33308j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo33309k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final boolean mo33310l() {
        return this.vehicleId != null;
    }

    /* renamed from: m */
    public final void mo33311m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo33312o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo33313p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDriverLocationServerMessage(", "location:");
        MVGpsLocation mVGpsLocation = this.location;
        if (mVGpsLocation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGpsLocation);
        }
        n.append(", ");
        n.append("timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "sentSuccessfully:");
        n.append(this.sentSuccessfully);
        if (mo33303f()) {
            n.append(", ");
            n.append("activeItineraryId:");
            n.append(this.activeItineraryId);
        }
        if (mo33307i()) {
            n.append(", ");
            n.append("provider:");
            String str = this.provider;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo33310l()) {
            n.append(", ");
            n.append("vehicleId:");
            String str2 = this.vehicleId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo33304g()) {
            n.append(", ");
            n.append("driverId:");
            String str3 = this.driverId;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
