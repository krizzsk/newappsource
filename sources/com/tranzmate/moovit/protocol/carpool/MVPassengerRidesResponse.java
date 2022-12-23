package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
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

public class MVPassengerRidesResponse implements TBase<MVPassengerRidesResponse, _Fields>, Serializable, Cloneable, Comparable<MVPassengerRidesResponse> {

    /* renamed from: b */
    public static final C25113c f24810b = new C25113c("drivers", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f24811c = new C25113c("futureRides", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f24812d = new C25113c("activeRides", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f24813e = new C25113c("recentlyCompletedRides", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f24814f = new C25113c("historicalRides", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f24815g = new C25113c("requests", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f24816h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f24817i;
    public List<MVPassengerActiveRide> activeRides;
    public List<MVCarpoolDriver> drivers;
    public List<MVPassengerFutureRide> futureRides;
    public List<MVPassengerHistoricalRide> historicalRides;
    private _Fields[] optionals = {_Fields.FUTURE_RIDES, _Fields.ACTIVE_RIDES, _Fields.RECENTLY_COMPLETED_RIDES, _Fields.HISTORICAL_RIDES, _Fields.REQUESTS};
    public List<MVPassengerHistoricalRide> recentlyCompletedRides;
    public List<MVRideRequest> requests;

    public enum _Fields implements C25085c {
        DRIVERS(1, "drivers"),
        FUTURE_RIDES(2, "futureRides"),
        ACTIVE_RIDES(3, "activeRides"),
        RECENTLY_COMPLETED_RIDES(4, "recentlyCompletedRides"),
        HISTORICAL_RIDES(5, "historicalRides"),
        REQUESTS(6, "requests");
        
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
                    return DRIVERS;
                case 2:
                    return FUTURE_RIDES;
                case 3:
                    return ACTIVE_RIDES;
                case 4:
                    return RECENTLY_COMPLETED_RIDES;
                case 5:
                    return HISTORICAL_RIDES;
                case 6:
                    return REQUESTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerRidesResponse$a */
    public static class C8271a extends C25239c<MVPassengerRidesResponse> {
        public C8271a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerRidesResponse mVPassengerRidesResponse = (MVPassengerRidesResponse) tBase;
            mVPassengerRidesResponse.getClass();
            C25113c cVar = MVPassengerRidesResponse.f24810b;
            gVar.mo61687K();
            if (mVPassengerRidesResponse.drivers != null) {
                gVar.mo61711x(MVPassengerRidesResponse.f24810b);
                gVar.mo61680D(new C25119e((byte) 12, mVPassengerRidesResponse.drivers.size()));
                for (MVCarpoolDriver X0 : mVPassengerRidesResponse.drivers) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPassengerRidesResponse.futureRides != null && mVPassengerRidesResponse.mo25783h()) {
                gVar.mo61711x(MVPassengerRidesResponse.f24811c);
                gVar.mo61680D(new C25119e((byte) 12, mVPassengerRidesResponse.futureRides.size()));
                for (MVPassengerFutureRide X02 : mVPassengerRidesResponse.futureRides) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPassengerRidesResponse.activeRides != null && mVPassengerRidesResponse.mo25781f()) {
                gVar.mo61711x(MVPassengerRidesResponse.f24812d);
                gVar.mo61680D(new C25119e((byte) 12, mVPassengerRidesResponse.activeRides.size()));
                for (MVPassengerActiveRide X03 : mVPassengerRidesResponse.activeRides) {
                    X03.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPassengerRidesResponse.recentlyCompletedRides != null && mVPassengerRidesResponse.mo25786j()) {
                gVar.mo61711x(MVPassengerRidesResponse.f24813e);
                gVar.mo61680D(new C25119e((byte) 12, mVPassengerRidesResponse.recentlyCompletedRides.size()));
                for (MVPassengerHistoricalRide X04 : mVPassengerRidesResponse.recentlyCompletedRides) {
                    X04.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPassengerRidesResponse.historicalRides != null && mVPassengerRidesResponse.mo25785i()) {
                gVar.mo61711x(MVPassengerRidesResponse.f24814f);
                gVar.mo61680D(new C25119e((byte) 12, mVPassengerRidesResponse.historicalRides.size()));
                for (MVPassengerHistoricalRide X05 : mVPassengerRidesResponse.historicalRides) {
                    X05.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPassengerRidesResponse.requests != null && mVPassengerRidesResponse.mo25787k()) {
                gVar.mo61711x(MVPassengerRidesResponse.f24815g);
                gVar.mo61680D(new C25119e((byte) 12, mVPassengerRidesResponse.requests.size()));
                for (MVRideRequest X06 : mVPassengerRidesResponse.requests) {
                    X06.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerRidesResponse mVPassengerRidesResponse = (MVPassengerRidesResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPassengerRidesResponse.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPassengerRidesResponse.drivers = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVCarpoolDriver mVCarpoolDriver = new MVCarpoolDriver();
                                mVCarpoolDriver.mo25201C1(gVar);
                                mVPassengerRidesResponse.drivers.add(mVCarpoolDriver);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 2:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVPassengerRidesResponse.futureRides = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVPassengerFutureRide mVPassengerFutureRide = new MVPassengerFutureRide();
                                mVPassengerFutureRide.mo25201C1(gVar);
                                mVPassengerRidesResponse.futureRides.add(mVPassengerFutureRide);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVPassengerRidesResponse.activeRides = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                MVPassengerActiveRide mVPassengerActiveRide = new MVPassengerActiveRide();
                                mVPassengerActiveRide.mo25201C1(gVar);
                                mVPassengerRidesResponse.activeRides.add(mVPassengerActiveRide);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k4 = gVar.mo61698k();
                            mVPassengerRidesResponse.recentlyCompletedRides = new ArrayList(k4.f63395b);
                            while (i < k4.f63395b) {
                                MVPassengerHistoricalRide mVPassengerHistoricalRide = new MVPassengerHistoricalRide();
                                mVPassengerHistoricalRide.mo25201C1(gVar);
                                mVPassengerRidesResponse.recentlyCompletedRides.add(mVPassengerHistoricalRide);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k5 = gVar.mo61698k();
                            mVPassengerRidesResponse.historicalRides = new ArrayList(k5.f63395b);
                            while (i < k5.f63395b) {
                                MVPassengerHistoricalRide mVPassengerHistoricalRide2 = new MVPassengerHistoricalRide();
                                mVPassengerHistoricalRide2.mo25201C1(gVar);
                                mVPassengerRidesResponse.historicalRides.add(mVPassengerHistoricalRide2);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k6 = gVar.mo61698k();
                            mVPassengerRidesResponse.requests = new ArrayList(k6.f63395b);
                            while (i < k6.f63395b) {
                                MVRideRequest mVRideRequest = new MVRideRequest();
                                mVRideRequest.mo25201C1(gVar);
                                mVPassengerRidesResponse.requests.add(mVRideRequest);
                                i++;
                            }
                            gVar.mo61699l();
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerRidesResponse$b */
    public static class C8272b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8271a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerRidesResponse$c */
    public static class C8273c extends C25240d<MVPassengerRidesResponse> {
        public C8273c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerRidesResponse mVPassengerRidesResponse = (MVPassengerRidesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerRidesResponse.mo25782g()) {
                bitSet.set(0);
            }
            if (mVPassengerRidesResponse.mo25783h()) {
                bitSet.set(1);
            }
            if (mVPassengerRidesResponse.mo25781f()) {
                bitSet.set(2);
            }
            if (mVPassengerRidesResponse.mo25786j()) {
                bitSet.set(3);
            }
            if (mVPassengerRidesResponse.mo25785i()) {
                bitSet.set(4);
            }
            if (mVPassengerRidesResponse.mo25787k()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVPassengerRidesResponse.mo25782g()) {
                jVar.mo61678B(mVPassengerRidesResponse.drivers.size());
                for (MVCarpoolDriver X0 : mVPassengerRidesResponse.drivers) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPassengerRidesResponse.mo25783h()) {
                jVar.mo61678B(mVPassengerRidesResponse.futureRides.size());
                for (MVPassengerFutureRide X02 : mVPassengerRidesResponse.futureRides) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVPassengerRidesResponse.mo25781f()) {
                jVar.mo61678B(mVPassengerRidesResponse.activeRides.size());
                for (MVPassengerActiveRide X03 : mVPassengerRidesResponse.activeRides) {
                    X03.mo25202X0(jVar);
                }
            }
            if (mVPassengerRidesResponse.mo25786j()) {
                jVar.mo61678B(mVPassengerRidesResponse.recentlyCompletedRides.size());
                for (MVPassengerHistoricalRide X04 : mVPassengerRidesResponse.recentlyCompletedRides) {
                    X04.mo25202X0(jVar);
                }
            }
            if (mVPassengerRidesResponse.mo25785i()) {
                jVar.mo61678B(mVPassengerRidesResponse.historicalRides.size());
                for (MVPassengerHistoricalRide X05 : mVPassengerRidesResponse.historicalRides) {
                    X05.mo25202X0(jVar);
                }
            }
            if (mVPassengerRidesResponse.mo25787k()) {
                jVar.mo61678B(mVPassengerRidesResponse.requests.size());
                for (MVRideRequest X06 : mVPassengerRidesResponse.requests) {
                    X06.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerRidesResponse mVPassengerRidesResponse = (MVPassengerRidesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPassengerRidesResponse.drivers = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVCarpoolDriver mVCarpoolDriver = new MVCarpoolDriver();
                    mVCarpoolDriver.mo25201C1(jVar);
                    mVPassengerRidesResponse.drivers.add(mVCarpoolDriver);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVPassengerRidesResponse.futureRides = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVPassengerFutureRide mVPassengerFutureRide = new MVPassengerFutureRide();
                    mVPassengerFutureRide.mo25201C1(jVar);
                    mVPassengerRidesResponse.futureRides.add(mVPassengerFutureRide);
                }
            }
            if (T.get(2)) {
                int i5 = jVar.mo61696i();
                mVPassengerRidesResponse.activeRides = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    MVPassengerActiveRide mVPassengerActiveRide = new MVPassengerActiveRide();
                    mVPassengerActiveRide.mo25201C1(jVar);
                    mVPassengerRidesResponse.activeRides.add(mVPassengerActiveRide);
                }
            }
            if (T.get(3)) {
                int i7 = jVar.mo61696i();
                mVPassengerRidesResponse.recentlyCompletedRides = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    MVPassengerHistoricalRide mVPassengerHistoricalRide = new MVPassengerHistoricalRide();
                    mVPassengerHistoricalRide.mo25201C1(jVar);
                    mVPassengerRidesResponse.recentlyCompletedRides.add(mVPassengerHistoricalRide);
                }
            }
            if (T.get(4)) {
                int i9 = jVar.mo61696i();
                mVPassengerRidesResponse.historicalRides = new ArrayList(i9);
                for (int i11 = 0; i11 < i9; i11++) {
                    MVPassengerHistoricalRide mVPassengerHistoricalRide2 = new MVPassengerHistoricalRide();
                    mVPassengerHistoricalRide2.mo25201C1(jVar);
                    mVPassengerRidesResponse.historicalRides.add(mVPassengerHistoricalRide2);
                }
            }
            if (T.get(5)) {
                int i12 = jVar.mo61696i();
                mVPassengerRidesResponse.requests = new ArrayList(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    MVRideRequest mVRideRequest = new MVRideRequest();
                    mVRideRequest.mo25201C1(jVar);
                    mVPassengerRidesResponse.requests.add(mVRideRequest);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerRidesResponse$d */
    public static class C8274d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8273c(0);
        }
    }

    static {
        new C17394d0("MVPassengerRidesResponse");
        HashMap hashMap = new HashMap();
        f24816h = hashMap;
        hashMap.put(C25239c.class, new C8272b());
        hashMap.put(C25240d.class, new C8274d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DRIVERS, new FieldMetaData("drivers", (byte) 3, new ListMetaData(new StructMetaData(MVCarpoolDriver.class))));
        enumMap.put(_Fields.FUTURE_RIDES, new FieldMetaData("futureRides", (byte) 2, new ListMetaData(new StructMetaData(MVPassengerFutureRide.class))));
        enumMap.put(_Fields.ACTIVE_RIDES, new FieldMetaData("activeRides", (byte) 2, new ListMetaData(new StructMetaData(MVPassengerActiveRide.class))));
        enumMap.put(_Fields.RECENTLY_COMPLETED_RIDES, new FieldMetaData("recentlyCompletedRides", (byte) 2, new ListMetaData(new StructMetaData(MVPassengerHistoricalRide.class))));
        enumMap.put(_Fields.HISTORICAL_RIDES, new FieldMetaData("historicalRides", (byte) 2, new ListMetaData(new StructMetaData(MVPassengerHistoricalRide.class))));
        enumMap.put(_Fields.REQUESTS, new FieldMetaData("requests", (byte) 2, new ListMetaData(new StructMetaData(MVRideRequest.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24817i = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerRidesResponse.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f24816h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24816h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPassengerRidesResponse mVPassengerRidesResponse = (MVPassengerRidesResponse) obj;
        if (!getClass().equals(mVPassengerRidesResponse.getClass())) {
            return getClass().getName().compareTo(mVPassengerRidesResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25782g()).compareTo(Boolean.valueOf(mVPassengerRidesResponse.mo25782g()));
        if (compareTo != 0 || ((mo25782g() && (compareTo = C25082a.m62844h(this.drivers, mVPassengerRidesResponse.drivers)) != 0) || (compareTo = Boolean.valueOf(mo25783h()).compareTo(Boolean.valueOf(mVPassengerRidesResponse.mo25783h()))) != 0 || ((mo25783h() && (compareTo = C25082a.m62844h(this.futureRides, mVPassengerRidesResponse.futureRides)) != 0) || (compareTo = Boolean.valueOf(mo25781f()).compareTo(Boolean.valueOf(mVPassengerRidesResponse.mo25781f()))) != 0 || ((mo25781f() && (compareTo = C25082a.m62844h(this.activeRides, mVPassengerRidesResponse.activeRides)) != 0) || (compareTo = Boolean.valueOf(mo25786j()).compareTo(Boolean.valueOf(mVPassengerRidesResponse.mo25786j()))) != 0 || ((mo25786j() && (compareTo = C25082a.m62844h(this.recentlyCompletedRides, mVPassengerRidesResponse.recentlyCompletedRides)) != 0) || (compareTo = Boolean.valueOf(mo25785i()).compareTo(Boolean.valueOf(mVPassengerRidesResponse.mo25785i()))) != 0 || ((mo25785i() && (compareTo = C25082a.m62844h(this.historicalRides, mVPassengerRidesResponse.historicalRides)) != 0) || (compareTo = Boolean.valueOf(mo25787k()).compareTo(Boolean.valueOf(mVPassengerRidesResponse.mo25787k()))) != 0)))))) {
            return compareTo;
        }
        if (!mo25787k() || (h = C25082a.m62844h(this.requests, mVPassengerRidesResponse.requests)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerRidesResponse)) {
            return false;
        }
        MVPassengerRidesResponse mVPassengerRidesResponse = (MVPassengerRidesResponse) obj;
        boolean g = mo25782g();
        boolean g2 = mVPassengerRidesResponse.mo25782g();
        if ((g || g2) && (!g || !g2 || !this.drivers.equals(mVPassengerRidesResponse.drivers))) {
            return false;
        }
        boolean h = mo25783h();
        boolean h2 = mVPassengerRidesResponse.mo25783h();
        if ((h || h2) && (!h || !h2 || !this.futureRides.equals(mVPassengerRidesResponse.futureRides))) {
            return false;
        }
        boolean f = mo25781f();
        boolean f2 = mVPassengerRidesResponse.mo25781f();
        if ((f || f2) && (!f || !f2 || !this.activeRides.equals(mVPassengerRidesResponse.activeRides))) {
            return false;
        }
        boolean j = mo25786j();
        boolean j2 = mVPassengerRidesResponse.mo25786j();
        if ((j || j2) && (!j || !j2 || !this.recentlyCompletedRides.equals(mVPassengerRidesResponse.recentlyCompletedRides))) {
            return false;
        }
        boolean i = mo25785i();
        boolean i2 = mVPassengerRidesResponse.mo25785i();
        if ((i || i2) && (!i || !i2 || !this.historicalRides.equals(mVPassengerRidesResponse.historicalRides))) {
            return false;
        }
        boolean k = mo25787k();
        boolean k2 = mVPassengerRidesResponse.mo25787k();
        if ((k || k2) && (!k || !k2 || !this.requests.equals(mVPassengerRidesResponse.requests))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25781f() {
        return this.activeRides != null;
    }

    /* renamed from: g */
    public final boolean mo25782g() {
        return this.drivers != null;
    }

    /* renamed from: h */
    public final boolean mo25783h() {
        return this.futureRides != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25785i() {
        return this.historicalRides != null;
    }

    /* renamed from: j */
    public final boolean mo25786j() {
        return this.recentlyCompletedRides != null;
    }

    /* renamed from: k */
    public final boolean mo25787k() {
        return this.requests != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerRidesResponse(", "drivers:");
        List<MVCarpoolDriver> list = this.drivers;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo25783h()) {
            n.append(", ");
            n.append("futureRides:");
            List<MVPassengerFutureRide> list2 = this.futureRides;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo25781f()) {
            n.append(", ");
            n.append("activeRides:");
            List<MVPassengerActiveRide> list3 = this.activeRides;
            if (list3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list3);
            }
        }
        if (mo25786j()) {
            n.append(", ");
            n.append("recentlyCompletedRides:");
            List<MVPassengerHistoricalRide> list4 = this.recentlyCompletedRides;
            if (list4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list4);
            }
        }
        if (mo25785i()) {
            n.append(", ");
            n.append("historicalRides:");
            List<MVPassengerHistoricalRide> list5 = this.historicalRides;
            if (list5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list5);
            }
        }
        if (mo25787k()) {
            n.append(", ");
            n.append("requests:");
            List<MVRideRequest> list6 = this.requests;
            if (list6 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list6);
            }
        }
        n.append(")");
        return n.toString();
    }
}
