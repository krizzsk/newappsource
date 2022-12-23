package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVExternalAppData;
import com.tranzmate.moovit.protocol.taxi.MVTaxiPrice;
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
import p001a0.C0016g;
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

public class MVTaxiLeg implements TBase<MVTaxiLeg, _Fields>, Serializable, Cloneable, Comparable<MVTaxiLeg> {

    /* renamed from: b */
    public static final C25113c f30056b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30057c = new C25113c("journey", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30058d = new C25113c("shape", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30059e = new C25113c("taxiPrice", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f30060f = new C25113c("approxWaitingSecFromOrdering", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f30061g = new C25113c("taxiId", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f30062h = new C25113c("customParameters", (byte) 15, 7);

    /* renamed from: i */
    public static final C25113c f30063i = new C25113c("deepLinks", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f30064j = new C25113c("taxiProviderName", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f30065k = new C25113c("rideOptions", (byte) 15, 10);

    /* renamed from: l */
    public static final HashMap f30066l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f30067m;
    private byte __isset_bitfield = 0;
    public int approxWaitingSecFromOrdering;
    public List<MVTaxiLegCustomDeepLinkParameter> customParameters;
    public MVExternalAppData deepLinks;
    public MVJourney journey;
    private _Fields[] optionals = {_Fields.TAXI_PRICE, _Fields.CUSTOM_PARAMETERS, _Fields.DEEP_LINKS, _Fields.TAXI_PROVIDER_NAME, _Fields.RIDE_OPTIONS};
    public List<MVRideOption> rideOptions;
    public MVTripPlanShape shape;
    public int taxiId;
    public MVTaxiPrice taxiPrice;
    public String taxiProviderName;
    public MVTime time;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        JOURNEY(2, "journey"),
        SHAPE(3, "shape"),
        TAXI_PRICE(4, "taxiPrice"),
        APPROX_WAITING_SEC_FROM_ORDERING(5, "approxWaitingSecFromOrdering"),
        TAXI_ID(6, "taxiId"),
        CUSTOM_PARAMETERS(7, "customParameters"),
        DEEP_LINKS(8, "deepLinks"),
        TAXI_PROVIDER_NAME(9, "taxiProviderName"),
        RIDE_OPTIONS(10, "rideOptions");
        
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
                    return TIME;
                case 2:
                    return JOURNEY;
                case 3:
                    return SHAPE;
                case 4:
                    return TAXI_PRICE;
                case 5:
                    return APPROX_WAITING_SEC_FROM_ORDERING;
                case 6:
                    return TAXI_ID;
                case 7:
                    return CUSTOM_PARAMETERS;
                case 8:
                    return DEEP_LINKS;
                case 9:
                    return TAXI_PROVIDER_NAME;
                case 10:
                    return RIDE_OPTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTaxiLeg$a */
    public static class C11627a extends C25239c<MVTaxiLeg> {
        public C11627a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiLeg mVTaxiLeg = (MVTaxiLeg) tBase;
            mVTaxiLeg.mo34563s();
            C25113c cVar = MVTaxiLeg.f30056b;
            gVar.mo61687K();
            if (mVTaxiLeg.time != null) {
                gVar.mo61711x(MVTaxiLeg.f30056b);
                mVTaxiLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiLeg.journey != null) {
                gVar.mo61711x(MVTaxiLeg.f30057c);
                mVTaxiLeg.journey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiLeg.shape != null) {
                gVar.mo61711x(MVTaxiLeg.f30058d);
                mVTaxiLeg.shape.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiLeg.taxiPrice != null && mVTaxiLeg.mo34558m()) {
                gVar.mo61711x(MVTaxiLeg.f30059e);
                mVTaxiLeg.taxiPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTaxiLeg.f30060f);
            gVar.mo61678B(mVTaxiLeg.approxWaitingSecFromOrdering);
            gVar.mo61712y();
            gVar.mo61711x(MVTaxiLeg.f30061g);
            gVar.mo61678B(mVTaxiLeg.taxiId);
            gVar.mo61712y();
            if (mVTaxiLeg.customParameters != null && mVTaxiLeg.mo34551g()) {
                gVar.mo61711x(MVTaxiLeg.f30062h);
                gVar.mo61680D(new C25119e((byte) 12, mVTaxiLeg.customParameters.size()));
                for (MVTaxiLegCustomDeepLinkParameter X0 : mVTaxiLeg.customParameters) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTaxiLeg.deepLinks != null && mVTaxiLeg.mo34552h()) {
                gVar.mo61711x(MVTaxiLeg.f30063i);
                mVTaxiLeg.deepLinks.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiLeg.taxiProviderName != null && mVTaxiLeg.mo34559o()) {
                gVar.mo61711x(MVTaxiLeg.f30064j);
                gVar.mo61686J(mVTaxiLeg.taxiProviderName);
                gVar.mo61712y();
            }
            if (mVTaxiLeg.rideOptions != null && mVTaxiLeg.mo34555j()) {
                gVar.mo61711x(MVTaxiLeg.f30065k);
                gVar.mo61680D(new C25119e((byte) 12, mVTaxiLeg.rideOptions.size()));
                for (MVRideOption X02 : mVTaxiLeg.rideOptions) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiLeg mVTaxiLeg = (MVTaxiLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTaxiLeg.mo34563s();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTime mVTime = new MVTime();
                            mVTaxiLeg.time = mVTime;
                            mVTime.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVJourney mVJourney = new MVJourney();
                            mVTaxiLeg.journey = mVJourney;
                            mVJourney.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                            mVTaxiLeg.shape = mVTripPlanShape;
                            mVTripPlanShape.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTaxiPrice mVTaxiPrice = new MVTaxiPrice();
                            mVTaxiLeg.taxiPrice = mVTaxiPrice;
                            mVTaxiPrice.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiLeg.approxWaitingSecFromOrdering = gVar.mo61696i();
                            mVTaxiLeg.mo34561q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiLeg.taxiId = gVar.mo61696i();
                            mVTaxiLeg.mo34562r();
                            break;
                        }
                    case 7:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTaxiLeg.customParameters = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = new MVTaxiLegCustomDeepLinkParameter();
                                mVTaxiLegCustomDeepLinkParameter.mo25201C1(gVar);
                                mVTaxiLeg.customParameters.add(mVTaxiLegCustomDeepLinkParameter);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVExternalAppData mVExternalAppData = new MVExternalAppData();
                            mVTaxiLeg.deepLinks = mVExternalAppData;
                            mVExternalAppData.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiLeg.taxiProviderName = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVTaxiLeg.rideOptions = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVRideOption mVRideOption = new MVRideOption();
                                mVRideOption.mo25201C1(gVar);
                                mVTaxiLeg.rideOptions.add(mVRideOption);
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTaxiLeg$b */
    public static class C11628b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11627a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTaxiLeg$c */
    public static class C11629c extends C25240d<MVTaxiLeg> {
        public C11629c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiLeg mVTaxiLeg = (MVTaxiLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiLeg.mo34560p()) {
                bitSet.set(0);
            }
            if (mVTaxiLeg.mo34554i()) {
                bitSet.set(1);
            }
            if (mVTaxiLeg.mo34556k()) {
                bitSet.set(2);
            }
            if (mVTaxiLeg.mo34558m()) {
                bitSet.set(3);
            }
            if (mVTaxiLeg.mo34550f()) {
                bitSet.set(4);
            }
            if (mVTaxiLeg.mo34557l()) {
                bitSet.set(5);
            }
            if (mVTaxiLeg.mo34551g()) {
                bitSet.set(6);
            }
            if (mVTaxiLeg.mo34552h()) {
                bitSet.set(7);
            }
            if (mVTaxiLeg.mo34559o()) {
                bitSet.set(8);
            }
            if (mVTaxiLeg.mo34555j()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVTaxiLeg.mo34560p()) {
                mVTaxiLeg.time.mo25202X0(jVar);
            }
            if (mVTaxiLeg.mo34554i()) {
                mVTaxiLeg.journey.mo25202X0(jVar);
            }
            if (mVTaxiLeg.mo34556k()) {
                mVTaxiLeg.shape.mo25202X0(jVar);
            }
            if (mVTaxiLeg.mo34558m()) {
                mVTaxiLeg.taxiPrice.mo25202X0(jVar);
            }
            if (mVTaxiLeg.mo34550f()) {
                jVar.mo61678B(mVTaxiLeg.approxWaitingSecFromOrdering);
            }
            if (mVTaxiLeg.mo34557l()) {
                jVar.mo61678B(mVTaxiLeg.taxiId);
            }
            if (mVTaxiLeg.mo34551g()) {
                jVar.mo61678B(mVTaxiLeg.customParameters.size());
                for (MVTaxiLegCustomDeepLinkParameter X0 : mVTaxiLeg.customParameters) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTaxiLeg.mo34552h()) {
                mVTaxiLeg.deepLinks.mo25202X0(jVar);
            }
            if (mVTaxiLeg.mo34559o()) {
                jVar.mo61686J(mVTaxiLeg.taxiProviderName);
            }
            if (mVTaxiLeg.mo34555j()) {
                jVar.mo61678B(mVTaxiLeg.rideOptions.size());
                for (MVRideOption X02 : mVTaxiLeg.rideOptions) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiLeg mVTaxiLeg = (MVTaxiLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVTaxiLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVJourney mVJourney = new MVJourney();
                mVTaxiLeg.journey = mVJourney;
                mVJourney.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                mVTaxiLeg.shape = mVTripPlanShape;
                mVTripPlanShape.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVTaxiPrice mVTaxiPrice = new MVTaxiPrice();
                mVTaxiLeg.taxiPrice = mVTaxiPrice;
                mVTaxiPrice.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVTaxiLeg.approxWaitingSecFromOrdering = jVar.mo61696i();
                mVTaxiLeg.mo34561q();
            }
            if (T.get(5)) {
                mVTaxiLeg.taxiId = jVar.mo61696i();
                mVTaxiLeg.mo34562r();
            }
            if (T.get(6)) {
                int i = jVar.mo61696i();
                mVTaxiLeg.customParameters = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = new MVTaxiLegCustomDeepLinkParameter();
                    mVTaxiLegCustomDeepLinkParameter.mo25201C1(jVar);
                    mVTaxiLeg.customParameters.add(mVTaxiLegCustomDeepLinkParameter);
                }
            }
            if (T.get(7)) {
                MVExternalAppData mVExternalAppData = new MVExternalAppData();
                mVTaxiLeg.deepLinks = mVExternalAppData;
                mVExternalAppData.mo25201C1(jVar);
            }
            if (T.get(8)) {
                mVTaxiLeg.taxiProviderName = jVar.mo61704q();
            }
            if (T.get(9)) {
                int i3 = jVar.mo61696i();
                mVTaxiLeg.rideOptions = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVRideOption mVRideOption = new MVRideOption();
                    mVRideOption.mo25201C1(jVar);
                    mVTaxiLeg.rideOptions.add(mVRideOption);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTaxiLeg$d */
    public static class C11630d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11629c(0);
        }
    }

    static {
        new C17394d0("MVTaxiLeg");
        HashMap hashMap = new HashMap();
        f30066l = hashMap;
        hashMap.put(C25239c.class, new C11628b());
        hashMap.put(C25240d.class, new C11630d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.JOURNEY, new FieldMetaData("journey", (byte) 3, new StructMetaData(MVJourney.class)));
        enumMap.put(_Fields.SHAPE, new FieldMetaData("shape", (byte) 3, new StructMetaData(MVTripPlanShape.class)));
        enumMap.put(_Fields.TAXI_PRICE, new FieldMetaData("taxiPrice", (byte) 2, new StructMetaData(MVTaxiPrice.class)));
        enumMap.put(_Fields.APPROX_WAITING_SEC_FROM_ORDERING, new FieldMetaData("approxWaitingSecFromOrdering", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TAXI_ID, new FieldMetaData("taxiId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CUSTOM_PARAMETERS, new FieldMetaData("customParameters", (byte) 2, new ListMetaData(new StructMetaData(MVTaxiLegCustomDeepLinkParameter.class))));
        enumMap.put(_Fields.DEEP_LINKS, new FieldMetaData("deepLinks", (byte) 2, new StructMetaData(MVExternalAppData.class)));
        enumMap.put(_Fields.TAXI_PROVIDER_NAME, new FieldMetaData("taxiProviderName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RIDE_OPTIONS, new FieldMetaData("rideOptions", (byte) 2, new ListMetaData(new StructMetaData(MVRideOption.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30067m = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiLeg.class, unmodifiableMap);
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
        ((C25238b) f30066l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30066l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTaxiLeg mVTaxiLeg = (MVTaxiLeg) obj;
        if (!getClass().equals(mVTaxiLeg.getClass())) {
            return getClass().getName().compareTo(mVTaxiLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34560p()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34560p()));
        if (compareTo != 0 || ((mo34560p() && (compareTo = this.time.compareTo(mVTaxiLeg.time)) != 0) || (compareTo = Boolean.valueOf(mo34554i()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34554i()))) != 0 || ((mo34554i() && (compareTo = this.journey.compareTo(mVTaxiLeg.journey)) != 0) || (compareTo = Boolean.valueOf(mo34556k()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34556k()))) != 0 || ((mo34556k() && (compareTo = this.shape.compareTo(mVTaxiLeg.shape)) != 0) || (compareTo = Boolean.valueOf(mo34558m()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34558m()))) != 0 || ((mo34558m() && (compareTo = this.taxiPrice.compareTo(mVTaxiLeg.taxiPrice)) != 0) || (compareTo = Boolean.valueOf(mo34550f()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34550f()))) != 0 || ((mo34550f() && (compareTo = C25082a.m62839c(this.approxWaitingSecFromOrdering, mVTaxiLeg.approxWaitingSecFromOrdering)) != 0) || (compareTo = Boolean.valueOf(mo34557l()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34557l()))) != 0 || ((mo34557l() && (compareTo = C25082a.m62839c(this.taxiId, mVTaxiLeg.taxiId)) != 0) || (compareTo = Boolean.valueOf(mo34551g()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34551g()))) != 0 || ((mo34551g() && (compareTo = C25082a.m62844h(this.customParameters, mVTaxiLeg.customParameters)) != 0) || (compareTo = Boolean.valueOf(mo34552h()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34552h()))) != 0 || ((mo34552h() && (compareTo = this.deepLinks.compareTo(mVTaxiLeg.deepLinks)) != 0) || (compareTo = Boolean.valueOf(mo34559o()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34559o()))) != 0 || ((mo34559o() && (compareTo = this.taxiProviderName.compareTo(mVTaxiLeg.taxiProviderName)) != 0) || (compareTo = Boolean.valueOf(mo34555j()).compareTo(Boolean.valueOf(mVTaxiLeg.mo34555j()))) != 0)))))))))) {
            return compareTo;
        }
        if (!mo34555j() || (h = C25082a.m62844h(this.rideOptions, mVTaxiLeg.rideOptions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTaxiLeg)) {
            return false;
        }
        MVTaxiLeg mVTaxiLeg = (MVTaxiLeg) obj;
        boolean p = mo34560p();
        boolean p2 = mVTaxiLeg.mo34560p();
        if ((p || p2) && (!p || !p2 || !this.time.mo34573a(mVTaxiLeg.time))) {
            return false;
        }
        boolean i = mo34554i();
        boolean i2 = mVTaxiLeg.mo34554i();
        if ((i || i2) && (!i || !i2 || !this.journey.mo34347a(mVTaxiLeg.journey))) {
            return false;
        }
        boolean k = mo34556k();
        boolean k2 = mVTaxiLeg.mo34556k();
        if ((k || k2) && (!k || !k2 || !this.shape.mo34748a(mVTaxiLeg.shape))) {
            return false;
        }
        boolean m = mo34558m();
        boolean m2 = mVTaxiLeg.mo34558m();
        if (((m || m2) && (!m || !m2 || !this.taxiPrice.mo32244a(mVTaxiLeg.taxiPrice))) || this.approxWaitingSecFromOrdering != mVTaxiLeg.approxWaitingSecFromOrdering || this.taxiId != mVTaxiLeg.taxiId) {
            return false;
        }
        boolean g = mo34551g();
        boolean g2 = mVTaxiLeg.mo34551g();
        if ((g || g2) && (!g || !g2 || !this.customParameters.equals(mVTaxiLeg.customParameters))) {
            return false;
        }
        boolean h = mo34552h();
        boolean h2 = mVTaxiLeg.mo34552h();
        if ((h || h2) && (!h || !h2 || !this.deepLinks.mo26157a(mVTaxiLeg.deepLinks))) {
            return false;
        }
        boolean o = mo34559o();
        boolean o2 = mVTaxiLeg.mo34559o();
        if ((o || o2) && (!o || !o2 || !this.taxiProviderName.equals(mVTaxiLeg.taxiProviderName))) {
            return false;
        }
        boolean j = mo34555j();
        boolean j2 = mVTaxiLeg.mo34555j();
        if ((j || j2) && (!j || !j2 || !this.rideOptions.equals(mVTaxiLeg.rideOptions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34550f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34551g() {
        return this.customParameters != null;
    }

    /* renamed from: h */
    public final boolean mo34552h() {
        return this.deepLinks != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34554i() {
        return this.journey != null;
    }

    /* renamed from: j */
    public final boolean mo34555j() {
        return this.rideOptions != null;
    }

    /* renamed from: k */
    public final boolean mo34556k() {
        return this.shape != null;
    }

    /* renamed from: l */
    public final boolean mo34557l() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: m */
    public final boolean mo34558m() {
        return this.taxiPrice != null;
    }

    /* renamed from: o */
    public final boolean mo34559o() {
        return this.taxiProviderName != null;
    }

    /* renamed from: p */
    public final boolean mo34560p() {
        return this.time != null;
    }

    /* renamed from: q */
    public final void mo34561q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: r */
    public final void mo34562r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: s */
    public final void mo34563s() throws TException {
        MVJourney mVJourney = this.journey;
        if (mVJourney != null) {
            mVJourney.mo34352h();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiLeg(", "time:");
        MVTime mVTime = this.time;
        if (mVTime == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTime);
        }
        n.append(", ");
        n.append("journey:");
        MVJourney mVJourney = this.journey;
        if (mVJourney == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVJourney);
        }
        n.append(", ");
        n.append("shape:");
        MVTripPlanShape mVTripPlanShape = this.shape;
        if (mVTripPlanShape == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanShape);
        }
        if (mo34558m()) {
            n.append(", ");
            n.append("taxiPrice:");
            MVTaxiPrice mVTaxiPrice = this.taxiPrice;
            if (mVTaxiPrice == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiPrice);
            }
        }
        n.append(", ");
        n.append("approxWaitingSecFromOrdering:");
        C0016g.m42z(n, this.approxWaitingSecFromOrdering, ", ", "taxiId:");
        n.append(this.taxiId);
        if (mo34551g()) {
            n.append(", ");
            n.append("customParameters:");
            List<MVTaxiLegCustomDeepLinkParameter> list = this.customParameters;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo34552h()) {
            n.append(", ");
            n.append("deepLinks:");
            MVExternalAppData mVExternalAppData = this.deepLinks;
            if (mVExternalAppData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVExternalAppData);
            }
        }
        if (mo34559o()) {
            n.append(", ");
            n.append("taxiProviderName:");
            String str = this.taxiProviderName;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo34555j()) {
            n.append(", ");
            n.append("rideOptions:");
            List<MVRideOption> list2 = this.rideOptions;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
