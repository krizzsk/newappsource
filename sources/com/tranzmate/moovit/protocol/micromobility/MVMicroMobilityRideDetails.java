package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVMicroMobilityRideDetails implements TBase<MVMicroMobilityRideDetails, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityRideDetails> {

    /* renamed from: b */
    public static final C25113c f26730b = new C25113c("largeImage", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26731c = new C25113c("mapImage", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26732d = new C25113c("pickupLocation", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f26733e = new C25113c("dropOffLocation", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f26734f = new C25113c("rideStartTime", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f26735g = new C25113c("rideEndTime", (byte) 10, 6);

    /* renamed from: h */
    public static final C25113c f26736h = new C25113c("rideTitle", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f26737i = new C25113c("rideSubtitle", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f26738j = new C25113c("rating", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f26739k = new C25113c("vehicleCondition", (byte) 12, 10);

    /* renamed from: l */
    public static final C25113c f26740l = new C25113c("metrics", (byte) 15, 11);

    /* renamed from: m */
    public static final C25113c f26741m = new C25113c("actions", (byte) 15, 12);

    /* renamed from: n */
    public static final C25113c f26742n = new C25113c("reservationStartTime", (byte) 10, 13);

    /* renamed from: o */
    public static final C25113c f26743o = new C25113c("reservationExpirationTime", (byte) 10, 14);

    /* renamed from: p */
    public static final HashMap f26744p;

    /* renamed from: q */
    public static final Map<_Fields, FieldMetaData> f26745q;
    private byte __isset_bitfield = 0;
    public List<MVMicroMobilityAction> actions;
    public MVLocationDescriptor dropOffLocation;
    public MVImageReferenceWithParams largeImage;
    public MVImageReferenceWithParams mapImage;
    public List<MVMicroMobilityRideMetric> metrics;
    private _Fields[] optionals = {_Fields.DROP_OFF_LOCATION, _Fields.RIDE_START_TIME, _Fields.RIDE_END_TIME, _Fields.RIDE_TITLE, _Fields.RIDE_SUBTITLE, _Fields.RATING, _Fields.VEHICLE_CONDITION, _Fields.METRICS, _Fields.ACTIONS, _Fields.RESERVATION_START_TIME, _Fields.RESERVATION_EXPIRATION_TIME};
    public MVLocationDescriptor pickupLocation;
    public int rating;
    public long reservationExpirationTime;
    public long reservationStartTime;
    public long rideEndTime;
    public long rideStartTime;
    public String rideSubtitle;
    public String rideTitle;
    public MVMicroMobilityVehicleCondition vehicleCondition;

    public enum _Fields implements C25085c {
        LARGE_IMAGE(1, "largeImage"),
        MAP_IMAGE(2, "mapImage"),
        PICKUP_LOCATION(3, "pickupLocation"),
        DROP_OFF_LOCATION(4, "dropOffLocation"),
        RIDE_START_TIME(5, "rideStartTime"),
        RIDE_END_TIME(6, "rideEndTime"),
        RIDE_TITLE(7, "rideTitle"),
        RIDE_SUBTITLE(8, "rideSubtitle"),
        RATING(9, "rating"),
        VEHICLE_CONDITION(10, "vehicleCondition"),
        METRICS(11, "metrics"),
        ACTIONS(12, "actions"),
        RESERVATION_START_TIME(13, "reservationStartTime"),
        RESERVATION_EXPIRATION_TIME(14, "reservationExpirationTime");
        
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
                    return LARGE_IMAGE;
                case 2:
                    return MAP_IMAGE;
                case 3:
                    return PICKUP_LOCATION;
                case 4:
                    return DROP_OFF_LOCATION;
                case 5:
                    return RIDE_START_TIME;
                case 6:
                    return RIDE_END_TIME;
                case 7:
                    return RIDE_TITLE;
                case 8:
                    return RIDE_SUBTITLE;
                case 9:
                    return RATING;
                case 10:
                    return VEHICLE_CONDITION;
                case 11:
                    return METRICS;
                case 12:
                    return ACTIONS;
                case 13:
                    return RESERVATION_START_TIME;
                case 14:
                    return RESERVATION_EXPIRATION_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideDetails$a */
    public static class C9344a extends C25239c<MVMicroMobilityRideDetails> {
        public C9344a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideDetails mVMicroMobilityRideDetails = (MVMicroMobilityRideDetails) tBase;
            mVMicroMobilityRideDetails.mo28981D();
            C25113c cVar = MVMicroMobilityRideDetails.f26730b;
            gVar.mo61687K();
            if (mVMicroMobilityRideDetails.largeImage != null) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26730b);
                mVMicroMobilityRideDetails.largeImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.mapImage != null) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26731c);
                mVMicroMobilityRideDetails.mapImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.pickupLocation != null) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26732d);
                mVMicroMobilityRideDetails.pickupLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.dropOffLocation != null && mVMicroMobilityRideDetails.mo28986g()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26733e);
                mVMicroMobilityRideDetails.dropOffLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.mo28996q()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26734f);
                gVar.mo61679C(mVMicroMobilityRideDetails.rideStartTime);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.mo28995p()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26735g);
                gVar.mo61679C(mVMicroMobilityRideDetails.rideEndTime);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.rideTitle != null && mVMicroMobilityRideDetails.mo28998s()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26736h);
                gVar.mo61686J(mVMicroMobilityRideDetails.rideTitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.rideSubtitle != null && mVMicroMobilityRideDetails.mo28997r()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26737i);
                gVar.mo61686J(mVMicroMobilityRideDetails.rideSubtitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.mo28992l()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26738j);
                gVar.mo61678B(mVMicroMobilityRideDetails.rating);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.vehicleCondition != null && mVMicroMobilityRideDetails.mo28999t()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26739k);
                mVMicroMobilityRideDetails.vehicleCondition.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.metrics != null && mVMicroMobilityRideDetails.mo28990j()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26740l);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityRideDetails.metrics.size()));
                for (MVMicroMobilityRideMetric X0 : mVMicroMobilityRideDetails.metrics) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.actions != null && mVMicroMobilityRideDetails.mo28985f()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26741m);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityRideDetails.actions.size()));
                for (MVMicroMobilityAction X02 : mVMicroMobilityRideDetails.actions) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.mo28994o()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26742n);
                gVar.mo61679C(mVMicroMobilityRideDetails.reservationStartTime);
                gVar.mo61712y();
            }
            if (mVMicroMobilityRideDetails.mo28993m()) {
                gVar.mo61711x(MVMicroMobilityRideDetails.f26743o);
                gVar.mo61679C(mVMicroMobilityRideDetails.reservationExpirationTime);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideDetails mVMicroMobilityRideDetails = (MVMicroMobilityRideDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityRideDetails.mo28981D();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVMicroMobilityRideDetails.largeImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVMicroMobilityRideDetails.mapImage = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                            mVMicroMobilityRideDetails.pickupLocation = mVLocationDescriptor;
                            mVLocationDescriptor.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                            mVMicroMobilityRideDetails.dropOffLocation = mVLocationDescriptor2;
                            mVLocationDescriptor2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRideDetails.rideStartTime = gVar.mo61697j();
                            mVMicroMobilityRideDetails.mo28980A();
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRideDetails.rideEndTime = gVar.mo61697j();
                            mVMicroMobilityRideDetails.mo29004y();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRideDetails.rideTitle = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRideDetails.rideSubtitle = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRideDetails.rating = gVar.mo61696i();
                            mVMicroMobilityRideDetails.mo29001u();
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = new MVMicroMobilityVehicleCondition();
                            mVMicroMobilityRideDetails.vehicleCondition = mVMicroMobilityVehicleCondition;
                            mVMicroMobilityVehicleCondition.mo25201C1(gVar);
                            break;
                        }
                    case 11:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVMicroMobilityRideDetails.metrics = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVMicroMobilityRideMetric mVMicroMobilityRideMetric = new MVMicroMobilityRideMetric();
                                mVMicroMobilityRideMetric.mo25201C1(gVar);
                                mVMicroMobilityRideDetails.metrics.add(mVMicroMobilityRideMetric);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 12:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVMicroMobilityRideDetails.actions = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVMicroMobilityAction mVMicroMobilityAction = new MVMicroMobilityAction();
                                mVMicroMobilityAction.mo25201C1(gVar);
                                mVMicroMobilityRideDetails.actions.add(mVMicroMobilityAction);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 13:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRideDetails.reservationStartTime = gVar.mo61697j();
                            mVMicroMobilityRideDetails.mo29003w();
                            break;
                        }
                    case 14:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityRideDetails.reservationExpirationTime = gVar.mo61697j();
                            mVMicroMobilityRideDetails.mo29002v();
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideDetails$b */
    public static class C9345b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9344a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideDetails$c */
    public static class C9346c extends C25240d<MVMicroMobilityRideDetails> {
        public C9346c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideDetails mVMicroMobilityRideDetails = (MVMicroMobilityRideDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityRideDetails.mo28987h()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityRideDetails.mo28989i()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityRideDetails.mo28991k()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityRideDetails.mo28986g()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityRideDetails.mo28996q()) {
                bitSet.set(4);
            }
            if (mVMicroMobilityRideDetails.mo28995p()) {
                bitSet.set(5);
            }
            if (mVMicroMobilityRideDetails.mo28998s()) {
                bitSet.set(6);
            }
            if (mVMicroMobilityRideDetails.mo28997r()) {
                bitSet.set(7);
            }
            if (mVMicroMobilityRideDetails.mo28992l()) {
                bitSet.set(8);
            }
            if (mVMicroMobilityRideDetails.mo28999t()) {
                bitSet.set(9);
            }
            if (mVMicroMobilityRideDetails.mo28990j()) {
                bitSet.set(10);
            }
            if (mVMicroMobilityRideDetails.mo28985f()) {
                bitSet.set(11);
            }
            if (mVMicroMobilityRideDetails.mo28994o()) {
                bitSet.set(12);
            }
            if (mVMicroMobilityRideDetails.mo28993m()) {
                bitSet.set(13);
            }
            jVar.mo61738U(bitSet, 14);
            if (mVMicroMobilityRideDetails.mo28987h()) {
                mVMicroMobilityRideDetails.largeImage.mo25202X0(jVar);
            }
            if (mVMicroMobilityRideDetails.mo28989i()) {
                mVMicroMobilityRideDetails.mapImage.mo25202X0(jVar);
            }
            if (mVMicroMobilityRideDetails.mo28991k()) {
                mVMicroMobilityRideDetails.pickupLocation.mo25202X0(jVar);
            }
            if (mVMicroMobilityRideDetails.mo28986g()) {
                mVMicroMobilityRideDetails.dropOffLocation.mo25202X0(jVar);
            }
            if (mVMicroMobilityRideDetails.mo28996q()) {
                jVar.mo61679C(mVMicroMobilityRideDetails.rideStartTime);
            }
            if (mVMicroMobilityRideDetails.mo28995p()) {
                jVar.mo61679C(mVMicroMobilityRideDetails.rideEndTime);
            }
            if (mVMicroMobilityRideDetails.mo28998s()) {
                jVar.mo61686J(mVMicroMobilityRideDetails.rideTitle);
            }
            if (mVMicroMobilityRideDetails.mo28997r()) {
                jVar.mo61686J(mVMicroMobilityRideDetails.rideSubtitle);
            }
            if (mVMicroMobilityRideDetails.mo28992l()) {
                jVar.mo61678B(mVMicroMobilityRideDetails.rating);
            }
            if (mVMicroMobilityRideDetails.mo28999t()) {
                mVMicroMobilityRideDetails.vehicleCondition.mo25202X0(jVar);
            }
            if (mVMicroMobilityRideDetails.mo28990j()) {
                jVar.mo61678B(mVMicroMobilityRideDetails.metrics.size());
                for (MVMicroMobilityRideMetric X0 : mVMicroMobilityRideDetails.metrics) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVMicroMobilityRideDetails.mo28985f()) {
                jVar.mo61678B(mVMicroMobilityRideDetails.actions.size());
                for (MVMicroMobilityAction X02 : mVMicroMobilityRideDetails.actions) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVMicroMobilityRideDetails.mo28994o()) {
                jVar.mo61679C(mVMicroMobilityRideDetails.reservationStartTime);
            }
            if (mVMicroMobilityRideDetails.mo28993m()) {
                jVar.mo61679C(mVMicroMobilityRideDetails.reservationExpirationTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityRideDetails mVMicroMobilityRideDetails = (MVMicroMobilityRideDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(14);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVMicroMobilityRideDetails.largeImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                mVMicroMobilityRideDetails.mapImage = mVImageReferenceWithParams2;
                mVImageReferenceWithParams2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVMicroMobilityRideDetails.pickupLocation = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                mVMicroMobilityRideDetails.dropOffLocation = mVLocationDescriptor2;
                mVLocationDescriptor2.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVMicroMobilityRideDetails.rideStartTime = jVar.mo61697j();
                mVMicroMobilityRideDetails.mo28980A();
            }
            if (T.get(5)) {
                mVMicroMobilityRideDetails.rideEndTime = jVar.mo61697j();
                mVMicroMobilityRideDetails.mo29004y();
            }
            if (T.get(6)) {
                mVMicroMobilityRideDetails.rideTitle = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVMicroMobilityRideDetails.rideSubtitle = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVMicroMobilityRideDetails.rating = jVar.mo61696i();
                mVMicroMobilityRideDetails.mo29001u();
            }
            if (T.get(9)) {
                MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = new MVMicroMobilityVehicleCondition();
                mVMicroMobilityRideDetails.vehicleCondition = mVMicroMobilityVehicleCondition;
                mVMicroMobilityVehicleCondition.mo25201C1(jVar);
            }
            if (T.get(10)) {
                int i = jVar.mo61696i();
                mVMicroMobilityRideDetails.metrics = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVMicroMobilityRideMetric mVMicroMobilityRideMetric = new MVMicroMobilityRideMetric();
                    mVMicroMobilityRideMetric.mo25201C1(jVar);
                    mVMicroMobilityRideDetails.metrics.add(mVMicroMobilityRideMetric);
                }
            }
            if (T.get(11)) {
                int i3 = jVar.mo61696i();
                mVMicroMobilityRideDetails.actions = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVMicroMobilityAction mVMicroMobilityAction = new MVMicroMobilityAction();
                    mVMicroMobilityAction.mo25201C1(jVar);
                    mVMicroMobilityRideDetails.actions.add(mVMicroMobilityAction);
                }
            }
            if (T.get(12)) {
                mVMicroMobilityRideDetails.reservationStartTime = jVar.mo61697j();
                mVMicroMobilityRideDetails.mo29003w();
            }
            if (T.get(13)) {
                mVMicroMobilityRideDetails.reservationExpirationTime = jVar.mo61697j();
                mVMicroMobilityRideDetails.mo29002v();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRideDetails$d */
    public static class C9347d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9346c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityRideDetails");
        HashMap hashMap = new HashMap();
        f26744p = hashMap;
        hashMap.put(C25239c.class, new C9345b());
        hashMap.put(C25240d.class, new C9347d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LARGE_IMAGE, new FieldMetaData("largeImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.MAP_IMAGE, new FieldMetaData("mapImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.PICKUP_LOCATION, new FieldMetaData("pickupLocation", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.DROP_OFF_LOCATION, new FieldMetaData("dropOffLocation", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.RIDE_START_TIME, new FieldMetaData("rideStartTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.RIDE_END_TIME, new FieldMetaData("rideEndTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.RIDE_TITLE, new FieldMetaData("rideTitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RIDE_SUBTITLE, new FieldMetaData("rideSubtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RATING, new FieldMetaData("rating", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.VEHICLE_CONDITION, new FieldMetaData("vehicleCondition", (byte) 2, new StructMetaData(MVMicroMobilityVehicleCondition.class)));
        enumMap.put(_Fields.METRICS, new FieldMetaData("metrics", (byte) 2, new ListMetaData(new StructMetaData(MVMicroMobilityRideMetric.class))));
        enumMap.put(_Fields.ACTIONS, new FieldMetaData("actions", (byte) 2, new ListMetaData(new StructMetaData(MVMicroMobilityAction.class))));
        enumMap.put(_Fields.RESERVATION_START_TIME, new FieldMetaData("reservationStartTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.RESERVATION_EXPIRATION_TIME, new FieldMetaData("reservationExpirationTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26745q = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityRideDetails.class, unmodifiableMap);
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

    /* renamed from: A */
    public final void mo28980A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f26744p.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo28981D() throws TException {
        MVLocationDescriptor mVLocationDescriptor = this.pickupLocation;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor2 = this.dropOffLocation;
        if (mVLocationDescriptor2 != null) {
            mVLocationDescriptor2.mo26333s();
        }
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26744p.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28982a(MVMicroMobilityRideDetails mVMicroMobilityRideDetails) {
        if (mVMicroMobilityRideDetails == null) {
            return false;
        }
        boolean h = mo28987h();
        boolean h2 = mVMicroMobilityRideDetails.mo28987h();
        if ((h || h2) && (!h || !h2 || !this.largeImage.mo26245a(mVMicroMobilityRideDetails.largeImage))) {
            return false;
        }
        boolean i = mo28989i();
        boolean i2 = mVMicroMobilityRideDetails.mo28989i();
        if ((i || i2) && (!i || !i2 || !this.mapImage.mo26245a(mVMicroMobilityRideDetails.mapImage))) {
            return false;
        }
        boolean k = mo28991k();
        boolean k2 = mVMicroMobilityRideDetails.mo28991k();
        if ((k || k2) && (!k || !k2 || !this.pickupLocation.mo26317a(mVMicroMobilityRideDetails.pickupLocation))) {
            return false;
        }
        boolean g = mo28986g();
        boolean g2 = mVMicroMobilityRideDetails.mo28986g();
        if ((g || g2) && (!g || !g2 || !this.dropOffLocation.mo26317a(mVMicroMobilityRideDetails.dropOffLocation))) {
            return false;
        }
        boolean q = mo28996q();
        boolean q2 = mVMicroMobilityRideDetails.mo28996q();
        if ((q || q2) && (!q || !q2 || this.rideStartTime != mVMicroMobilityRideDetails.rideStartTime)) {
            return false;
        }
        boolean p = mo28995p();
        boolean p2 = mVMicroMobilityRideDetails.mo28995p();
        if ((p || p2) && (!p || !p2 || this.rideEndTime != mVMicroMobilityRideDetails.rideEndTime)) {
            return false;
        }
        boolean s = mo28998s();
        boolean s2 = mVMicroMobilityRideDetails.mo28998s();
        if ((s || s2) && (!s || !s2 || !this.rideTitle.equals(mVMicroMobilityRideDetails.rideTitle))) {
            return false;
        }
        boolean r = mo28997r();
        boolean r2 = mVMicroMobilityRideDetails.mo28997r();
        if ((r || r2) && (!r || !r2 || !this.rideSubtitle.equals(mVMicroMobilityRideDetails.rideSubtitle))) {
            return false;
        }
        boolean l = mo28992l();
        boolean l2 = mVMicroMobilityRideDetails.mo28992l();
        if ((l || l2) && (!l || !l2 || this.rating != mVMicroMobilityRideDetails.rating)) {
            return false;
        }
        boolean t = mo28999t();
        boolean t2 = mVMicroMobilityRideDetails.mo28999t();
        if ((t || t2) && (!t || !t2 || !this.vehicleCondition.mo29026a(mVMicroMobilityRideDetails.vehicleCondition))) {
            return false;
        }
        boolean j = mo28990j();
        boolean j2 = mVMicroMobilityRideDetails.mo28990j();
        if ((j || j2) && (!j || !j2 || !this.metrics.equals(mVMicroMobilityRideDetails.metrics))) {
            return false;
        }
        boolean f = mo28985f();
        boolean f2 = mVMicroMobilityRideDetails.mo28985f();
        if ((f || f2) && (!f || !f2 || !this.actions.equals(mVMicroMobilityRideDetails.actions))) {
            return false;
        }
        boolean o = mo28994o();
        boolean o2 = mVMicroMobilityRideDetails.mo28994o();
        if ((o || o2) && (!o || !o2 || this.reservationStartTime != mVMicroMobilityRideDetails.reservationStartTime)) {
            return false;
        }
        boolean m = mo28993m();
        boolean m2 = mVMicroMobilityRideDetails.mo28993m();
        if (!m && !m2) {
            return true;
        }
        if (!m || !m2 || this.reservationExpirationTime != mVMicroMobilityRideDetails.reservationExpirationTime) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int d;
        MVMicroMobilityRideDetails mVMicroMobilityRideDetails = (MVMicroMobilityRideDetails) obj;
        if (!getClass().equals(mVMicroMobilityRideDetails.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityRideDetails.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28987h()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28987h()));
        if (compareTo != 0 || ((mo28987h() && (compareTo = this.largeImage.compareTo(mVMicroMobilityRideDetails.largeImage)) != 0) || (compareTo = Boolean.valueOf(mo28989i()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28989i()))) != 0 || ((mo28989i() && (compareTo = this.mapImage.compareTo(mVMicroMobilityRideDetails.mapImage)) != 0) || (compareTo = Boolean.valueOf(mo28991k()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28991k()))) != 0 || ((mo28991k() && (compareTo = this.pickupLocation.compareTo(mVMicroMobilityRideDetails.pickupLocation)) != 0) || (compareTo = Boolean.valueOf(mo28986g()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28986g()))) != 0 || ((mo28986g() && (compareTo = this.dropOffLocation.compareTo(mVMicroMobilityRideDetails.dropOffLocation)) != 0) || (compareTo = Boolean.valueOf(mo28996q()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28996q()))) != 0 || ((mo28996q() && (compareTo = C25082a.m62840d(this.rideStartTime, mVMicroMobilityRideDetails.rideStartTime)) != 0) || (compareTo = Boolean.valueOf(mo28995p()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28995p()))) != 0 || ((mo28995p() && (compareTo = C25082a.m62840d(this.rideEndTime, mVMicroMobilityRideDetails.rideEndTime)) != 0) || (compareTo = Boolean.valueOf(mo28998s()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28998s()))) != 0 || ((mo28998s() && (compareTo = this.rideTitle.compareTo(mVMicroMobilityRideDetails.rideTitle)) != 0) || (compareTo = Boolean.valueOf(mo28997r()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28997r()))) != 0 || ((mo28997r() && (compareTo = this.rideSubtitle.compareTo(mVMicroMobilityRideDetails.rideSubtitle)) != 0) || (compareTo = Boolean.valueOf(mo28992l()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28992l()))) != 0 || ((mo28992l() && (compareTo = C25082a.m62839c(this.rating, mVMicroMobilityRideDetails.rating)) != 0) || (compareTo = Boolean.valueOf(mo28999t()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28999t()))) != 0 || ((mo28999t() && (compareTo = this.vehicleCondition.compareTo(mVMicroMobilityRideDetails.vehicleCondition)) != 0) || (compareTo = Boolean.valueOf(mo28990j()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28990j()))) != 0 || ((mo28990j() && (compareTo = C25082a.m62844h(this.metrics, mVMicroMobilityRideDetails.metrics)) != 0) || (compareTo = Boolean.valueOf(mo28985f()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28985f()))) != 0 || ((mo28985f() && (compareTo = C25082a.m62844h(this.actions, mVMicroMobilityRideDetails.actions)) != 0) || (compareTo = Boolean.valueOf(mo28994o()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28994o()))) != 0 || ((mo28994o() && (compareTo = C25082a.m62840d(this.reservationStartTime, mVMicroMobilityRideDetails.reservationStartTime)) != 0) || (compareTo = Boolean.valueOf(mo28993m()).compareTo(Boolean.valueOf(mVMicroMobilityRideDetails.mo28993m()))) != 0)))))))))))))) {
            return compareTo;
        }
        if (!mo28993m() || (d = C25082a.m62840d(this.reservationExpirationTime, mVMicroMobilityRideDetails.reservationExpirationTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMicroMobilityRideDetails)) {
            return mo28982a((MVMicroMobilityRideDetails) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28985f() {
        return this.actions != null;
    }

    /* renamed from: g */
    public final boolean mo28986g() {
        return this.dropOffLocation != null;
    }

    /* renamed from: h */
    public final boolean mo28987h() {
        return this.largeImage != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28989i() {
        return this.mapImage != null;
    }

    /* renamed from: j */
    public final boolean mo28990j() {
        return this.metrics != null;
    }

    /* renamed from: k */
    public final boolean mo28991k() {
        return this.pickupLocation != null;
    }

    /* renamed from: l */
    public final boolean mo28992l() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: m */
    public final boolean mo28993m() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: o */
    public final boolean mo28994o() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: p */
    public final boolean mo28995p() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: q */
    public final boolean mo28996q() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: r */
    public final boolean mo28997r() {
        return this.rideSubtitle != null;
    }

    /* renamed from: s */
    public final boolean mo28998s() {
        return this.rideTitle != null;
    }

    /* renamed from: t */
    public final boolean mo28999t() {
        return this.vehicleCondition != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityRideDetails(", "largeImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.largeImage;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("mapImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams2 = this.mapImage;
        if (mVImageReferenceWithParams2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams2);
        }
        n.append(", ");
        n.append("pickupLocation:");
        MVLocationDescriptor mVLocationDescriptor = this.pickupLocation;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        if (mo28986g()) {
            n.append(", ");
            n.append("dropOffLocation:");
            MVLocationDescriptor mVLocationDescriptor2 = this.dropOffLocation;
            if (mVLocationDescriptor2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationDescriptor2);
            }
        }
        if (mo28996q()) {
            n.append(", ");
            n.append("rideStartTime:");
            n.append(this.rideStartTime);
        }
        if (mo28995p()) {
            n.append(", ");
            n.append("rideEndTime:");
            n.append(this.rideEndTime);
        }
        if (mo28998s()) {
            n.append(", ");
            n.append("rideTitle:");
            String str = this.rideTitle;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo28997r()) {
            n.append(", ");
            n.append("rideSubtitle:");
            String str2 = this.rideSubtitle;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo28992l()) {
            n.append(", ");
            n.append("rating:");
            n.append(this.rating);
        }
        if (mo28999t()) {
            n.append(", ");
            n.append("vehicleCondition:");
            MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = this.vehicleCondition;
            if (mVMicroMobilityVehicleCondition == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMicroMobilityVehicleCondition);
            }
        }
        if (mo28990j()) {
            n.append(", ");
            n.append("metrics:");
            List<MVMicroMobilityRideMetric> list = this.metrics;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo28985f()) {
            n.append(", ");
            n.append("actions:");
            List<MVMicroMobilityAction> list2 = this.actions;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo28994o()) {
            n.append(", ");
            n.append("reservationStartTime:");
            n.append(this.reservationStartTime);
        }
        if (mo28993m()) {
            n.append(", ");
            n.append("reservationExpirationTime:");
            n.append(this.reservationExpirationTime);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo29001u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: v */
    public final void mo29002v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: w */
    public final void mo29003w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: y */
    public final void mo29004y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }
}
