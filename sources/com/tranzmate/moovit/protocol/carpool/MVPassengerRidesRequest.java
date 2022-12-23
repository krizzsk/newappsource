package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0017h;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVPassengerRidesRequest implements TBase<MVPassengerRidesRequest, _Fields>, Serializable, Cloneable, Comparable<MVPassengerRidesRequest> {

    /* renamed from: b */
    public static final C25113c f24800b = new C25113c("includeFutureRides", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f24801c = new C25113c("includeActiveRides", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f24802d = new C25113c("includeRecentlyCompletedRides", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f24803e = new C25113c("includeHistoricalRides", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f24804f = new C25113c("currentLocation", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f24805g = new C25113c("locationsOfInterest", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f24806h = new C25113c("includeRideRequests", (byte) 2, 7);

    /* renamed from: i */
    public static final C25113c f24807i = new C25113c("includeEventRequests", (byte) 2, 8);

    /* renamed from: j */
    public static final HashMap f24808j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f24809k;
    private byte __isset_bitfield = 0;
    public MVLatLon currentLocation;
    public boolean includeActiveRides;
    public boolean includeEventRequests;
    public boolean includeFutureRides;
    public boolean includeHistoricalRides;
    public boolean includeRecentlyCompletedRides;
    public boolean includeRideRequests;
    public List<MVLocationDescriptor> locationsOfInterest;
    private _Fields[] optionals = {_Fields.CURRENT_LOCATION, _Fields.LOCATIONS_OF_INTEREST};

    public enum _Fields implements C25085c {
        INCLUDE_FUTURE_RIDES(1, "includeFutureRides"),
        INCLUDE_ACTIVE_RIDES(2, "includeActiveRides"),
        INCLUDE_RECENTLY_COMPLETED_RIDES(3, "includeRecentlyCompletedRides"),
        INCLUDE_HISTORICAL_RIDES(4, "includeHistoricalRides"),
        CURRENT_LOCATION(5, "currentLocation"),
        LOCATIONS_OF_INTEREST(6, "locationsOfInterest"),
        INCLUDE_RIDE_REQUESTS(7, "includeRideRequests"),
        INCLUDE_EVENT_REQUESTS(8, "includeEventRequests");
        
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
                    return INCLUDE_FUTURE_RIDES;
                case 2:
                    return INCLUDE_ACTIVE_RIDES;
                case 3:
                    return INCLUDE_RECENTLY_COMPLETED_RIDES;
                case 4:
                    return INCLUDE_HISTORICAL_RIDES;
                case 5:
                    return CURRENT_LOCATION;
                case 6:
                    return LOCATIONS_OF_INTEREST;
                case 7:
                    return INCLUDE_RIDE_REQUESTS;
                case 8:
                    return INCLUDE_EVENT_REQUESTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerRidesRequest$a */
    public static class C8267a extends C25239c<MVPassengerRidesRequest> {
        public C8267a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerRidesRequest mVPassengerRidesRequest = (MVPassengerRidesRequest) tBase;
            MVLatLon mVLatLon = mVPassengerRidesRequest.currentLocation;
            C25113c cVar = MVPassengerRidesRequest.f24800b;
            gVar.mo61687K();
            gVar.mo61711x(MVPassengerRidesRequest.f24800b);
            gVar.mo61708u(mVPassengerRidesRequest.includeFutureRides);
            gVar.mo61712y();
            gVar.mo61711x(MVPassengerRidesRequest.f24801c);
            gVar.mo61708u(mVPassengerRidesRequest.includeActiveRides);
            gVar.mo61712y();
            gVar.mo61711x(MVPassengerRidesRequest.f24802d);
            gVar.mo61708u(mVPassengerRidesRequest.includeRecentlyCompletedRides);
            gVar.mo61712y();
            gVar.mo61711x(MVPassengerRidesRequest.f24803e);
            gVar.mo61708u(mVPassengerRidesRequest.includeHistoricalRides);
            gVar.mo61712y();
            if (mVPassengerRidesRequest.currentLocation != null && mVPassengerRidesRequest.mo25762f()) {
                gVar.mo61711x(MVPassengerRidesRequest.f24804f);
                mVPassengerRidesRequest.currentLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerRidesRequest.locationsOfInterest != null && mVPassengerRidesRequest.mo25770m()) {
                gVar.mo61711x(MVPassengerRidesRequest.f24805g);
                gVar.mo61680D(new C25119e((byte) 12, mVPassengerRidesRequest.locationsOfInterest.size()));
                for (MVLocationDescriptor X0 : mVPassengerRidesRequest.locationsOfInterest) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPassengerRidesRequest.f24806h);
            gVar.mo61708u(mVPassengerRidesRequest.includeRideRequests);
            gVar.mo61712y();
            gVar.mo61711x(MVPassengerRidesRequest.f24807i);
            C0017h.m62S(gVar, mVPassengerRidesRequest.includeEventRequests);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerRidesRequest mVPassengerRidesRequest = (MVPassengerRidesRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVPassengerRidesRequest.currentLocation;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerRidesRequest.includeFutureRides = gVar.mo61690c();
                            mVPassengerRidesRequest.mo25773q();
                            break;
                        }
                    case 2:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerRidesRequest.includeActiveRides = gVar.mo61690c();
                            mVPassengerRidesRequest.mo25771o();
                            break;
                        }
                    case 3:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerRidesRequest.includeRecentlyCompletedRides = gVar.mo61690c();
                            mVPassengerRidesRequest.mo25775s();
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerRidesRequest.includeHistoricalRides = gVar.mo61690c();
                            mVPassengerRidesRequest.mo25774r();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVPassengerRidesRequest.currentLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPassengerRidesRequest.locationsOfInterest = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                                mVLocationDescriptor.mo25201C1(gVar);
                                mVPassengerRidesRequest.locationsOfInterest.add(mVLocationDescriptor);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerRidesRequest.includeRideRequests = gVar.mo61690c();
                            mVPassengerRidesRequest.mo25776t();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPassengerRidesRequest.includeEventRequests = gVar.mo61690c();
                            mVPassengerRidesRequest.mo25772p();
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerRidesRequest$b */
    public static class C8268b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8267a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerRidesRequest$c */
    public static class C8269c extends C25240d<MVPassengerRidesRequest> {
        public C8269c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerRidesRequest mVPassengerRidesRequest = (MVPassengerRidesRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerRidesRequest.mo25766i()) {
                bitSet.set(0);
            }
            if (mVPassengerRidesRequest.mo25763g()) {
                bitSet.set(1);
            }
            if (mVPassengerRidesRequest.mo25768k()) {
                bitSet.set(2);
            }
            if (mVPassengerRidesRequest.mo25767j()) {
                bitSet.set(3);
            }
            if (mVPassengerRidesRequest.mo25762f()) {
                bitSet.set(4);
            }
            if (mVPassengerRidesRequest.mo25770m()) {
                bitSet.set(5);
            }
            if (mVPassengerRidesRequest.mo25769l()) {
                bitSet.set(6);
            }
            if (mVPassengerRidesRequest.mo25764h()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVPassengerRidesRequest.mo25766i()) {
                jVar.mo61708u(mVPassengerRidesRequest.includeFutureRides);
            }
            if (mVPassengerRidesRequest.mo25763g()) {
                jVar.mo61708u(mVPassengerRidesRequest.includeActiveRides);
            }
            if (mVPassengerRidesRequest.mo25768k()) {
                jVar.mo61708u(mVPassengerRidesRequest.includeRecentlyCompletedRides);
            }
            if (mVPassengerRidesRequest.mo25767j()) {
                jVar.mo61708u(mVPassengerRidesRequest.includeHistoricalRides);
            }
            if (mVPassengerRidesRequest.mo25762f()) {
                mVPassengerRidesRequest.currentLocation.mo25202X0(jVar);
            }
            if (mVPassengerRidesRequest.mo25770m()) {
                jVar.mo61678B(mVPassengerRidesRequest.locationsOfInterest.size());
                for (MVLocationDescriptor X0 : mVPassengerRidesRequest.locationsOfInterest) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPassengerRidesRequest.mo25769l()) {
                jVar.mo61708u(mVPassengerRidesRequest.includeRideRequests);
            }
            if (mVPassengerRidesRequest.mo25764h()) {
                jVar.mo61708u(mVPassengerRidesRequest.includeEventRequests);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerRidesRequest mVPassengerRidesRequest = (MVPassengerRidesRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVPassengerRidesRequest.includeFutureRides = jVar.mo61690c();
                mVPassengerRidesRequest.mo25773q();
            }
            if (T.get(1)) {
                mVPassengerRidesRequest.includeActiveRides = jVar.mo61690c();
                mVPassengerRidesRequest.mo25771o();
            }
            if (T.get(2)) {
                mVPassengerRidesRequest.includeRecentlyCompletedRides = jVar.mo61690c();
                mVPassengerRidesRequest.mo25775s();
            }
            if (T.get(3)) {
                mVPassengerRidesRequest.includeHistoricalRides = jVar.mo61690c();
                mVPassengerRidesRequest.mo25774r();
            }
            if (T.get(4)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPassengerRidesRequest.currentLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVPassengerRidesRequest.locationsOfInterest = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                    mVLocationDescriptor.mo25201C1(jVar);
                    mVPassengerRidesRequest.locationsOfInterest.add(mVLocationDescriptor);
                }
            }
            if (T.get(6)) {
                mVPassengerRidesRequest.includeRideRequests = jVar.mo61690c();
                mVPassengerRidesRequest.mo25776t();
            }
            if (T.get(7)) {
                mVPassengerRidesRequest.includeEventRequests = jVar.mo61690c();
                mVPassengerRidesRequest.mo25772p();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerRidesRequest$d */
    public static class C8270d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8269c(0);
        }
    }

    static {
        new C17394d0("MVPassengerRidesRequest");
        HashMap hashMap = new HashMap();
        f24808j = hashMap;
        hashMap.put(C25239c.class, new C8268b());
        hashMap.put(C25240d.class, new C8270d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.INCLUDE_FUTURE_RIDES, new FieldMetaData("includeFutureRides", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INCLUDE_ACTIVE_RIDES, new FieldMetaData("includeActiveRides", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INCLUDE_RECENTLY_COMPLETED_RIDES, new FieldMetaData("includeRecentlyCompletedRides", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INCLUDE_HISTORICAL_RIDES, new FieldMetaData("includeHistoricalRides", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CURRENT_LOCATION, new FieldMetaData("currentLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.LOCATIONS_OF_INTEREST, new FieldMetaData("locationsOfInterest", (byte) 2, new ListMetaData(new StructMetaData(MVLocationDescriptor.class))));
        enumMap.put(_Fields.INCLUDE_RIDE_REQUESTS, new FieldMetaData("includeRideRequests", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INCLUDE_EVENT_REQUESTS, new FieldMetaData("includeEventRequests", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24809k = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerRidesRequest.class, unmodifiableMap);
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
        ((C25238b) f24808j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24808j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVPassengerRidesRequest mVPassengerRidesRequest = (MVPassengerRidesRequest) obj;
        if (!getClass().equals(mVPassengerRidesRequest.getClass())) {
            return getClass().getName().compareTo(mVPassengerRidesRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25766i()).compareTo(Boolean.valueOf(mVPassengerRidesRequest.mo25766i()));
        if (compareTo != 0 || ((mo25766i() && (compareTo = C25082a.m62848l(this.includeFutureRides, mVPassengerRidesRequest.includeFutureRides)) != 0) || (compareTo = Boolean.valueOf(mo25763g()).compareTo(Boolean.valueOf(mVPassengerRidesRequest.mo25763g()))) != 0 || ((mo25763g() && (compareTo = C25082a.m62848l(this.includeActiveRides, mVPassengerRidesRequest.includeActiveRides)) != 0) || (compareTo = Boolean.valueOf(mo25768k()).compareTo(Boolean.valueOf(mVPassengerRidesRequest.mo25768k()))) != 0 || ((mo25768k() && (compareTo = C25082a.m62848l(this.includeRecentlyCompletedRides, mVPassengerRidesRequest.includeRecentlyCompletedRides)) != 0) || (compareTo = Boolean.valueOf(mo25767j()).compareTo(Boolean.valueOf(mVPassengerRidesRequest.mo25767j()))) != 0 || ((mo25767j() && (compareTo = C25082a.m62848l(this.includeHistoricalRides, mVPassengerRidesRequest.includeHistoricalRides)) != 0) || (compareTo = Boolean.valueOf(mo25762f()).compareTo(Boolean.valueOf(mVPassengerRidesRequest.mo25762f()))) != 0 || ((mo25762f() && (compareTo = this.currentLocation.compareTo(mVPassengerRidesRequest.currentLocation)) != 0) || (compareTo = Boolean.valueOf(mo25770m()).compareTo(Boolean.valueOf(mVPassengerRidesRequest.mo25770m()))) != 0 || ((mo25770m() && (compareTo = C25082a.m62844h(this.locationsOfInterest, mVPassengerRidesRequest.locationsOfInterest)) != 0) || (compareTo = Boolean.valueOf(mo25769l()).compareTo(Boolean.valueOf(mVPassengerRidesRequest.mo25769l()))) != 0 || ((mo25769l() && (compareTo = C25082a.m62848l(this.includeRideRequests, mVPassengerRidesRequest.includeRideRequests)) != 0) || (compareTo = Boolean.valueOf(mo25764h()).compareTo(Boolean.valueOf(mVPassengerRidesRequest.mo25764h()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo25764h() || (l = C25082a.m62848l(this.includeEventRequests, mVPassengerRidesRequest.includeEventRequests)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerRidesRequest)) {
            return false;
        }
        MVPassengerRidesRequest mVPassengerRidesRequest = (MVPassengerRidesRequest) obj;
        if (this.includeFutureRides != mVPassengerRidesRequest.includeFutureRides || this.includeActiveRides != mVPassengerRidesRequest.includeActiveRides || this.includeRecentlyCompletedRides != mVPassengerRidesRequest.includeRecentlyCompletedRides || this.includeHistoricalRides != mVPassengerRidesRequest.includeHistoricalRides) {
            return false;
        }
        boolean f = mo25762f();
        boolean f2 = mVPassengerRidesRequest.mo25762f();
        if ((f || f2) && (!f || !f2 || !this.currentLocation.mo26290a(mVPassengerRidesRequest.currentLocation))) {
            return false;
        }
        boolean m = mo25770m();
        boolean m2 = mVPassengerRidesRequest.mo25770m();
        if (((!m && !m2) || (m && m2 && this.locationsOfInterest.equals(mVPassengerRidesRequest.locationsOfInterest))) && this.includeRideRequests == mVPassengerRidesRequest.includeRideRequests && this.includeEventRequests == mVPassengerRidesRequest.includeEventRequests) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25762f() {
        return this.currentLocation != null;
    }

    /* renamed from: g */
    public final boolean mo25763g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo25764h() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25766i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo25767j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo25768k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final boolean mo25769l() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: m */
    public final boolean mo25770m() {
        return this.locationsOfInterest != null;
    }

    /* renamed from: o */
    public final void mo25771o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo25772p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: q */
    public final void mo25773q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: r */
    public final void mo25774r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: s */
    public final void mo25775s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: t */
    public final void mo25776t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerRidesRequest(", "includeFutureRides:");
        C13555b.m33977q(n, this.includeFutureRides, ", ", "includeActiveRides:");
        C13555b.m33977q(n, this.includeActiveRides, ", ", "includeRecentlyCompletedRides:");
        C13555b.m33977q(n, this.includeRecentlyCompletedRides, ", ", "includeHistoricalRides:");
        n.append(this.includeHistoricalRides);
        if (mo25762f()) {
            n.append(", ");
            n.append("currentLocation:");
            MVLatLon mVLatLon = this.currentLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        if (mo25770m()) {
            n.append(", ");
            n.append("locationsOfInterest:");
            List<MVLocationDescriptor> list = this.locationsOfInterest;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        n.append(", ");
        n.append("includeRideRequests:");
        C13555b.m33977q(n, this.includeRideRequests, ", ", "includeEventRequests:");
        return C25541a.m63885p(n, this.includeEventRequests, ")");
    }
}
