package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVRouteType;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVTripPlanRequest implements TBase<MVTripPlanRequest, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanRequest> {

    /* renamed from: b */
    public static final C25113c f30134b = new C25113c("tripPlanPref", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30135c = new C25113c("time", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f30136d = new C25113c("timeType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30137e = new C25113c("currentTimeSelected", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f30138f = new C25113c("routeTypes", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f30139g = new C25113c("fromLocation", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f30140h = new C25113c("toLocation", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f30141i = new C25113c("isTest", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f30142j = new C25113c("isTrainTripPlan", (byte) 2, 9);

    /* renamed from: k */
    public static final C25113c f30143k = new C25113c("skipTaxiSearch", (byte) 2, 10);

    /* renamed from: l */
    public static final C25113c f30144l = new C25113c("fromLocationDesc", (byte) 11, 11);

    /* renamed from: m */
    public static final C25113c f30145m = new C25113c("toLocationDesc", (byte) 11, 12);

    /* renamed from: n */
    public static final C25113c f30146n = new C25113c("transportTypes", (byte) 15, 13);

    /* renamed from: o */
    public static final C25113c f30147o = new C25113c("multiModalTripData", (byte) 12, 14);

    /* renamed from: p */
    public static final C25113c f30148p = new C25113c("addFlexTimeSearch", (byte) 2, 15);

    /* renamed from: q */
    public static final C25113c f30149q = new C25113c("personalPreferences", (byte) 12, 16);

    /* renamed from: r */
    public static final C25113c f30150r = new C25113c("algorithmType", (byte) 8, 17);

    /* renamed from: s */
    public static final HashMap f30151s;

    /* renamed from: t */
    public static final Map<_Fields, FieldMetaData> f30152t;
    private byte __isset_bitfield;
    public boolean addFlexTimeSearch;
    public MVAlgorithmType algorithmType;
    public boolean currentTimeSelected;
    public MVLocationTarget fromLocation;
    public String fromLocationDesc;
    public boolean isTest;
    public boolean isTrainTripPlan;
    public MVMultiModalTripData multiModalTripData;
    private _Fields[] optionals;
    public MVPersonalPreferences personalPreferences;
    public List<MVRouteType> routeTypes;
    public boolean skipTaxiSearch;
    public long time;
    public MVTimeType timeType;
    public MVLocationTarget toLocation;
    public String toLocationDesc;
    public List<MVTripPlanTransportOptionPref> transportTypes;
    public MVTripPlanPref tripPlanPref;

    public enum _Fields implements C25085c {
        TRIP_PLAN_PREF(1, "tripPlanPref"),
        TIME(2, "time"),
        TIME_TYPE(3, "timeType"),
        CURRENT_TIME_SELECTED(4, "currentTimeSelected"),
        ROUTE_TYPES(5, "routeTypes"),
        FROM_LOCATION(6, "fromLocation"),
        TO_LOCATION(7, "toLocation"),
        IS_TEST(8, "isTest"),
        IS_TRAIN_TRIP_PLAN(9, "isTrainTripPlan"),
        SKIP_TAXI_SEARCH(10, "skipTaxiSearch"),
        FROM_LOCATION_DESC(11, "fromLocationDesc"),
        TO_LOCATION_DESC(12, "toLocationDesc"),
        TRANSPORT_TYPES(13, "transportTypes"),
        MULTI_MODAL_TRIP_DATA(14, "multiModalTripData"),
        ADD_FLEX_TIME_SEARCH(15, "addFlexTimeSearch"),
        PERSONAL_PREFERENCES(16, "personalPreferences"),
        ALGORITHM_TYPE(17, "algorithmType");
        
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
                    return TRIP_PLAN_PREF;
                case 2:
                    return TIME;
                case 3:
                    return TIME_TYPE;
                case 4:
                    return CURRENT_TIME_SELECTED;
                case 5:
                    return ROUTE_TYPES;
                case 6:
                    return FROM_LOCATION;
                case 7:
                    return TO_LOCATION;
                case 8:
                    return IS_TEST;
                case 9:
                    return IS_TRAIN_TRIP_PLAN;
                case 10:
                    return SKIP_TAXI_SEARCH;
                case 11:
                    return FROM_LOCATION_DESC;
                case 12:
                    return TO_LOCATION_DESC;
                case 13:
                    return TRANSPORT_TYPES;
                case 14:
                    return MULTI_MODAL_TRIP_DATA;
                case 15:
                    return ADD_FLEX_TIME_SEARCH;
                case 16:
                    return PERSONAL_PREFERENCES;
                case 17:
                    return ALGORITHM_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest$a */
    public static class C11660a extends C25239c<MVTripPlanRequest> {
        public C11660a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanRequest mVTripPlanRequest = (MVTripPlanRequest) tBase;
            mVTripPlanRequest.mo34675H();
            C25113c cVar = MVTripPlanRequest.f30134b;
            gVar.mo61687K();
            if (mVTripPlanRequest.tripPlanPref != null) {
                gVar.mo61711x(MVTripPlanRequest.f30134b);
                gVar.mo61678B(mVTripPlanRequest.tripPlanPref.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTripPlanRequest.f30135c);
            gVar.mo61679C(mVTripPlanRequest.time);
            gVar.mo61712y();
            if (mVTripPlanRequest.timeType != null) {
                gVar.mo61711x(MVTripPlanRequest.f30136d);
                gVar.mo61678B(mVTripPlanRequest.timeType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTripPlanRequest.f30137e);
            gVar.mo61708u(mVTripPlanRequest.currentTimeSelected);
            gVar.mo61712y();
            if (mVTripPlanRequest.routeTypes != null) {
                gVar.mo61711x(MVTripPlanRequest.f30138f);
                gVar.mo61680D(new C25119e((byte) 8, mVTripPlanRequest.routeTypes.size()));
                for (MVRouteType value : mVTripPlanRequest.routeTypes) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.fromLocation != null) {
                gVar.mo61711x(MVTripPlanRequest.f30139g);
                mVTripPlanRequest.fromLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.toLocation != null) {
                gVar.mo61711x(MVTripPlanRequest.f30140h);
                mVTripPlanRequest.toLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.mo34685k()) {
                gVar.mo61711x(MVTripPlanRequest.f30141i);
                gVar.mo61708u(mVTripPlanRequest.isTest);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.mo34686l()) {
                gVar.mo61711x(MVTripPlanRequest.f30142j);
                gVar.mo61708u(mVTripPlanRequest.isTrainTripPlan);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.mo34690q()) {
                gVar.mo61711x(MVTripPlanRequest.f30143k);
                gVar.mo61708u(mVTripPlanRequest.skipTaxiSearch);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.fromLocationDesc != null && mVTripPlanRequest.mo34684j()) {
                gVar.mo61711x(MVTripPlanRequest.f30144l);
                gVar.mo61686J(mVTripPlanRequest.fromLocationDesc);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.toLocationDesc != null && mVTripPlanRequest.mo34695u()) {
                gVar.mo61711x(MVTripPlanRequest.f30145m);
                gVar.mo61686J(mVTripPlanRequest.toLocationDesc);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.transportTypes != null && mVTripPlanRequest.mo34696v()) {
                gVar.mo61711x(MVTripPlanRequest.f30146n);
                gVar.mo61680D(new C25119e((byte) 8, mVTripPlanRequest.transportTypes.size()));
                for (MVTripPlanTransportOptionPref value2 : mVTripPlanRequest.transportTypes) {
                    gVar.mo61678B(value2.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.multiModalTripData != null && mVTripPlanRequest.mo34687m()) {
                gVar.mo61711x(MVTripPlanRequest.f30147o);
                mVTripPlanRequest.multiModalTripData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.mo34679f()) {
                gVar.mo61711x(MVTripPlanRequest.f30148p);
                gVar.mo61708u(mVTripPlanRequest.addFlexTimeSearch);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.personalPreferences != null && mVTripPlanRequest.mo34688o()) {
                gVar.mo61711x(MVTripPlanRequest.f30149q);
                mVTripPlanRequest.personalPreferences.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTripPlanRequest.algorithmType != null && mVTripPlanRequest.mo34680g()) {
                gVar.mo61711x(MVTripPlanRequest.f30150r);
                gVar.mo61678B(mVTripPlanRequest.algorithmType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanRequest mVTripPlanRequest = (MVTripPlanRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPlanRequest.mo34675H();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.tripPlanPref = MVTripPlanPref.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.time = gVar.mo61697j();
                            mVTripPlanRequest.mo34674G();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.timeType = MVTimeType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.currentTimeSelected = gVar.mo61690c();
                            mVTripPlanRequest.mo34670A();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTripPlanRequest.routeTypes = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                mVTripPlanRequest.routeTypes.add(MVRouteType.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationTarget mVLocationTarget = new MVLocationTarget();
                            mVTripPlanRequest.fromLocation = mVLocationTarget;
                            mVLocationTarget.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationTarget mVLocationTarget2 = new MVLocationTarget();
                            mVTripPlanRequest.toLocation = mVLocationTarget2;
                            mVLocationTarget2.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.isTest = gVar.mo61690c();
                            mVTripPlanRequest.mo34671D();
                            break;
                        }
                    case 9:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.isTrainTripPlan = gVar.mo61690c();
                            mVTripPlanRequest.mo34672E();
                            break;
                        }
                    case 10:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.skipTaxiSearch = gVar.mo61690c();
                            mVTripPlanRequest.mo34673F();
                            break;
                        }
                    case 11:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.fromLocationDesc = gVar.mo61704q();
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.toLocationDesc = gVar.mo61704q();
                            break;
                        }
                    case 13:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVTripPlanRequest.transportTypes = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                mVTripPlanRequest.transportTypes.add(MVTripPlanTransportOptionPref.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 14:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMultiModalTripData mVMultiModalTripData = new MVMultiModalTripData();
                            mVTripPlanRequest.multiModalTripData = mVMultiModalTripData;
                            mVMultiModalTripData.mo25201C1(gVar);
                            break;
                        }
                    case 15:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.addFlexTimeSearch = gVar.mo61690c();
                            mVTripPlanRequest.mo34698y();
                            break;
                        }
                    case 16:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPersonalPreferences mVPersonalPreferences = new MVPersonalPreferences();
                            mVTripPlanRequest.personalPreferences = mVPersonalPreferences;
                            mVPersonalPreferences.mo25201C1(gVar);
                            break;
                        }
                    case 17:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanRequest.algorithmType = MVAlgorithmType.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest$b */
    public static class C11661b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11660a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest$c */
    public static class C11662c extends C25240d<MVTripPlanRequest> {
        public C11662c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanRequest mVTripPlanRequest = (MVTripPlanRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanRequest.mo34697w()) {
                bitSet.set(0);
            }
            if (mVTripPlanRequest.mo34691r()) {
                bitSet.set(1);
            }
            if (mVTripPlanRequest.mo34692s()) {
                bitSet.set(2);
            }
            if (mVTripPlanRequest.mo34681h()) {
                bitSet.set(3);
            }
            if (mVTripPlanRequest.mo34689p()) {
                bitSet.set(4);
            }
            if (mVTripPlanRequest.mo34683i()) {
                bitSet.set(5);
            }
            if (mVTripPlanRequest.mo34693t()) {
                bitSet.set(6);
            }
            if (mVTripPlanRequest.mo34685k()) {
                bitSet.set(7);
            }
            if (mVTripPlanRequest.mo34686l()) {
                bitSet.set(8);
            }
            if (mVTripPlanRequest.mo34690q()) {
                bitSet.set(9);
            }
            if (mVTripPlanRequest.mo34684j()) {
                bitSet.set(10);
            }
            if (mVTripPlanRequest.mo34695u()) {
                bitSet.set(11);
            }
            if (mVTripPlanRequest.mo34696v()) {
                bitSet.set(12);
            }
            if (mVTripPlanRequest.mo34687m()) {
                bitSet.set(13);
            }
            if (mVTripPlanRequest.mo34679f()) {
                bitSet.set(14);
            }
            if (mVTripPlanRequest.mo34688o()) {
                bitSet.set(15);
            }
            if (mVTripPlanRequest.mo34680g()) {
                bitSet.set(16);
            }
            jVar.mo61738U(bitSet, 17);
            if (mVTripPlanRequest.mo34697w()) {
                jVar.mo61678B(mVTripPlanRequest.tripPlanPref.getValue());
            }
            if (mVTripPlanRequest.mo34691r()) {
                jVar.mo61679C(mVTripPlanRequest.time);
            }
            if (mVTripPlanRequest.mo34692s()) {
                jVar.mo61678B(mVTripPlanRequest.timeType.getValue());
            }
            if (mVTripPlanRequest.mo34681h()) {
                jVar.mo61708u(mVTripPlanRequest.currentTimeSelected);
            }
            if (mVTripPlanRequest.mo34689p()) {
                jVar.mo61678B(mVTripPlanRequest.routeTypes.size());
                for (MVRouteType value : mVTripPlanRequest.routeTypes) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVTripPlanRequest.mo34683i()) {
                mVTripPlanRequest.fromLocation.mo25202X0(jVar);
            }
            if (mVTripPlanRequest.mo34693t()) {
                mVTripPlanRequest.toLocation.mo25202X0(jVar);
            }
            if (mVTripPlanRequest.mo34685k()) {
                jVar.mo61708u(mVTripPlanRequest.isTest);
            }
            if (mVTripPlanRequest.mo34686l()) {
                jVar.mo61708u(mVTripPlanRequest.isTrainTripPlan);
            }
            if (mVTripPlanRequest.mo34690q()) {
                jVar.mo61708u(mVTripPlanRequest.skipTaxiSearch);
            }
            if (mVTripPlanRequest.mo34684j()) {
                jVar.mo61686J(mVTripPlanRequest.fromLocationDesc);
            }
            if (mVTripPlanRequest.mo34695u()) {
                jVar.mo61686J(mVTripPlanRequest.toLocationDesc);
            }
            if (mVTripPlanRequest.mo34696v()) {
                jVar.mo61678B(mVTripPlanRequest.transportTypes.size());
                for (MVTripPlanTransportOptionPref value2 : mVTripPlanRequest.transportTypes) {
                    jVar.mo61678B(value2.getValue());
                }
            }
            if (mVTripPlanRequest.mo34687m()) {
                mVTripPlanRequest.multiModalTripData.mo25202X0(jVar);
            }
            if (mVTripPlanRequest.mo34679f()) {
                jVar.mo61708u(mVTripPlanRequest.addFlexTimeSearch);
            }
            if (mVTripPlanRequest.mo34688o()) {
                mVTripPlanRequest.personalPreferences.mo25202X0(jVar);
            }
            if (mVTripPlanRequest.mo34680g()) {
                jVar.mo61678B(mVTripPlanRequest.algorithmType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanRequest mVTripPlanRequest = (MVTripPlanRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(17);
            if (T.get(0)) {
                mVTripPlanRequest.tripPlanPref = MVTripPlanPref.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVTripPlanRequest.time = jVar.mo61697j();
                mVTripPlanRequest.mo34674G();
            }
            if (T.get(2)) {
                mVTripPlanRequest.timeType = MVTimeType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVTripPlanRequest.currentTimeSelected = jVar.mo61690c();
                mVTripPlanRequest.mo34670A();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVTripPlanRequest.routeTypes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVTripPlanRequest.routeTypes.add(MVRouteType.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(5)) {
                MVLocationTarget mVLocationTarget = new MVLocationTarget();
                mVTripPlanRequest.fromLocation = mVLocationTarget;
                mVLocationTarget.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVLocationTarget mVLocationTarget2 = new MVLocationTarget();
                mVTripPlanRequest.toLocation = mVLocationTarget2;
                mVLocationTarget2.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVTripPlanRequest.isTest = jVar.mo61690c();
                mVTripPlanRequest.mo34671D();
            }
            if (T.get(8)) {
                mVTripPlanRequest.isTrainTripPlan = jVar.mo61690c();
                mVTripPlanRequest.mo34672E();
            }
            if (T.get(9)) {
                mVTripPlanRequest.skipTaxiSearch = jVar.mo61690c();
                mVTripPlanRequest.mo34673F();
            }
            if (T.get(10)) {
                mVTripPlanRequest.fromLocationDesc = jVar.mo61704q();
            }
            if (T.get(11)) {
                mVTripPlanRequest.toLocationDesc = jVar.mo61704q();
            }
            if (T.get(12)) {
                int i3 = jVar.mo61696i();
                mVTripPlanRequest.transportTypes = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVTripPlanRequest.transportTypes.add(MVTripPlanTransportOptionPref.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(13)) {
                MVMultiModalTripData mVMultiModalTripData = new MVMultiModalTripData();
                mVTripPlanRequest.multiModalTripData = mVMultiModalTripData;
                mVMultiModalTripData.mo25201C1(jVar);
            }
            if (T.get(14)) {
                mVTripPlanRequest.addFlexTimeSearch = jVar.mo61690c();
                mVTripPlanRequest.mo34698y();
            }
            if (T.get(15)) {
                MVPersonalPreferences mVPersonalPreferences = new MVPersonalPreferences();
                mVTripPlanRequest.personalPreferences = mVPersonalPreferences;
                mVPersonalPreferences.mo25201C1(jVar);
            }
            if (T.get(16)) {
                mVTripPlanRequest.algorithmType = MVAlgorithmType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest$d */
    public static class C11663d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11662c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanRequest");
        HashMap hashMap = new HashMap();
        f30151s = hashMap;
        hashMap.put(C25239c.class, new C11661b());
        hashMap.put(C25240d.class, new C11663d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIP_PLAN_PREF, new FieldMetaData("tripPlanPref", (byte) 3, new EnumMetaData(MVTripPlanPref.class)));
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TIME_TYPE, new FieldMetaData("timeType", (byte) 3, new EnumMetaData(MVTimeType.class)));
        enumMap.put(_Fields.CURRENT_TIME_SELECTED, new FieldMetaData("currentTimeSelected", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ROUTE_TYPES, new FieldMetaData("routeTypes", (byte) 3, new ListMetaData(new EnumMetaData(MVRouteType.class))));
        enumMap.put(_Fields.FROM_LOCATION, new FieldMetaData("fromLocation", (byte) 3, new StructMetaData(MVLocationTarget.class)));
        enumMap.put(_Fields.TO_LOCATION, new FieldMetaData("toLocation", (byte) 3, new StructMetaData(MVLocationTarget.class)));
        enumMap.put(_Fields.IS_TEST, new FieldMetaData("isTest", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_TRAIN_TRIP_PLAN, new FieldMetaData("isTrainTripPlan", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SKIP_TAXI_SEARCH, new FieldMetaData("skipTaxiSearch", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.FROM_LOCATION_DESC, new FieldMetaData("fromLocationDesc", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TO_LOCATION_DESC, new FieldMetaData("toLocationDesc", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TRANSPORT_TYPES, new FieldMetaData("transportTypes", (byte) 2, new ListMetaData(new EnumMetaData(MVTripPlanTransportOptionPref.class))));
        enumMap.put(_Fields.MULTI_MODAL_TRIP_DATA, new FieldMetaData("multiModalTripData", (byte) 2, new StructMetaData(MVMultiModalTripData.class)));
        enumMap.put(_Fields.ADD_FLEX_TIME_SEARCH, new FieldMetaData("addFlexTimeSearch", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PERSONAL_PREFERENCES, new FieldMetaData("personalPreferences", (byte) 2, new StructMetaData(MVPersonalPreferences.class)));
        enumMap.put(_Fields.ALGORITHM_TYPE, new FieldMetaData("algorithmType", (byte) 2, new EnumMetaData(MVAlgorithmType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30152t = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanRequest.class, unmodifiableMap);
    }

    public MVTripPlanRequest() {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.IS_TEST, _Fields.IS_TRAIN_TRIP_PLAN, _Fields.SKIP_TAXI_SEARCH, _Fields.FROM_LOCATION_DESC, _Fields.TO_LOCATION_DESC, _Fields.TRANSPORT_TYPES, _Fields.MULTI_MODAL_TRIP_DATA, _Fields.ADD_FLEX_TIME_SEARCH, _Fields.PERSONAL_PREFERENCES, _Fields.ALGORITHM_TYPE};
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
    public final void mo34670A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f30151s.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo34671D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: E */
    public final void mo34672E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: F */
    public final void mo34673F() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: G */
    public final void mo34674G() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: H */
    public final void mo34675H() throws TException {
        MVLocationTarget mVLocationTarget = this.fromLocation;
        if (mVLocationTarget != null) {
            mVLocationTarget.mo34391h();
        }
        MVLocationTarget mVLocationTarget2 = this.toLocation;
        if (mVLocationTarget2 != null) {
            mVLocationTarget2.mo34391h();
        }
        MVMultiModalTripData mVMultiModalTripData = this.multiModalTripData;
        if (mVMultiModalTripData != null) {
            mVMultiModalTripData.getClass();
        }
        MVPersonalPreferences mVPersonalPreferences = this.personalPreferences;
        if (mVPersonalPreferences != null) {
            mVPersonalPreferences.getClass();
        }
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30151s.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34676a(MVTripPlanRequest mVTripPlanRequest) {
        if (mVTripPlanRequest == null) {
            return false;
        }
        boolean w = mo34697w();
        boolean w2 = mVTripPlanRequest.mo34697w();
        if (((w || w2) && (!w || !w2 || !this.tripPlanPref.equals(mVTripPlanRequest.tripPlanPref))) || this.time != mVTripPlanRequest.time) {
            return false;
        }
        boolean s = mo34692s();
        boolean s2 = mVTripPlanRequest.mo34692s();
        if (((s || s2) && (!s || !s2 || !this.timeType.equals(mVTripPlanRequest.timeType))) || this.currentTimeSelected != mVTripPlanRequest.currentTimeSelected) {
            return false;
        }
        boolean p = mo34689p();
        boolean p2 = mVTripPlanRequest.mo34689p();
        if ((p || p2) && (!p || !p2 || !this.routeTypes.equals(mVTripPlanRequest.routeTypes))) {
            return false;
        }
        boolean i = mo34683i();
        boolean i2 = mVTripPlanRequest.mo34683i();
        if ((i || i2) && (!i || !i2 || !this.fromLocation.mo34386a(mVTripPlanRequest.fromLocation))) {
            return false;
        }
        boolean t = mo34693t();
        boolean t2 = mVTripPlanRequest.mo34693t();
        if ((t || t2) && (!t || !t2 || !this.toLocation.mo34386a(mVTripPlanRequest.toLocation))) {
            return false;
        }
        boolean k = mo34685k();
        boolean k2 = mVTripPlanRequest.mo34685k();
        if ((k || k2) && (!k || !k2 || this.isTest != mVTripPlanRequest.isTest)) {
            return false;
        }
        boolean l = mo34686l();
        boolean l2 = mVTripPlanRequest.mo34686l();
        if ((l || l2) && (!l || !l2 || this.isTrainTripPlan != mVTripPlanRequest.isTrainTripPlan)) {
            return false;
        }
        boolean q = mo34690q();
        boolean q2 = mVTripPlanRequest.mo34690q();
        if ((q || q2) && (!q || !q2 || this.skipTaxiSearch != mVTripPlanRequest.skipTaxiSearch)) {
            return false;
        }
        boolean j = mo34684j();
        boolean j2 = mVTripPlanRequest.mo34684j();
        if ((j || j2) && (!j || !j2 || !this.fromLocationDesc.equals(mVTripPlanRequest.fromLocationDesc))) {
            return false;
        }
        boolean u = mo34695u();
        boolean u2 = mVTripPlanRequest.mo34695u();
        if ((u || u2) && (!u || !u2 || !this.toLocationDesc.equals(mVTripPlanRequest.toLocationDesc))) {
            return false;
        }
        boolean v = mo34696v();
        boolean v2 = mVTripPlanRequest.mo34696v();
        if ((v || v2) && (!v || !v2 || !this.transportTypes.equals(mVTripPlanRequest.transportTypes))) {
            return false;
        }
        boolean m = mo34687m();
        boolean m2 = mVTripPlanRequest.mo34687m();
        if ((m || m2) && (!m || !m2 || !this.multiModalTripData.mo34413a(mVTripPlanRequest.multiModalTripData))) {
            return false;
        }
        boolean f = mo34679f();
        boolean f2 = mVTripPlanRequest.mo34679f();
        if ((f || f2) && (!f || !f2 || this.addFlexTimeSearch != mVTripPlanRequest.addFlexTimeSearch)) {
            return false;
        }
        boolean o = mo34688o();
        boolean o2 = mVTripPlanRequest.mo34688o();
        if ((o || o2) && (!o || !o2 || !this.personalPreferences.mo34490a(mVTripPlanRequest.personalPreferences))) {
            return false;
        }
        boolean g = mo34680g();
        boolean g2 = mVTripPlanRequest.mo34680g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.algorithmType.equals(mVTripPlanRequest.algorithmType)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanRequest mVTripPlanRequest = (MVTripPlanRequest) obj;
        if (!getClass().equals(mVTripPlanRequest.getClass())) {
            return getClass().getName().compareTo(mVTripPlanRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34697w()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34697w()));
        if (compareTo2 != 0 || ((mo34697w() && (compareTo2 = this.tripPlanPref.compareTo(mVTripPlanRequest.tripPlanPref)) != 0) || (compareTo2 = Boolean.valueOf(mo34691r()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34691r()))) != 0 || ((mo34691r() && (compareTo2 = C25082a.m62840d(this.time, mVTripPlanRequest.time)) != 0) || (compareTo2 = Boolean.valueOf(mo34692s()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34692s()))) != 0 || ((mo34692s() && (compareTo2 = this.timeType.compareTo(mVTripPlanRequest.timeType)) != 0) || (compareTo2 = Boolean.valueOf(mo34681h()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34681h()))) != 0 || ((mo34681h() && (compareTo2 = C25082a.m62848l(this.currentTimeSelected, mVTripPlanRequest.currentTimeSelected)) != 0) || (compareTo2 = Boolean.valueOf(mo34689p()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34689p()))) != 0 || ((mo34689p() && (compareTo2 = C25082a.m62844h(this.routeTypes, mVTripPlanRequest.routeTypes)) != 0) || (compareTo2 = Boolean.valueOf(mo34683i()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34683i()))) != 0 || ((mo34683i() && (compareTo2 = this.fromLocation.compareTo(mVTripPlanRequest.fromLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo34693t()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34693t()))) != 0 || ((mo34693t() && (compareTo2 = this.toLocation.compareTo(mVTripPlanRequest.toLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo34685k()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34685k()))) != 0 || ((mo34685k() && (compareTo2 = C25082a.m62848l(this.isTest, mVTripPlanRequest.isTest)) != 0) || (compareTo2 = Boolean.valueOf(mo34686l()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34686l()))) != 0 || ((mo34686l() && (compareTo2 = C25082a.m62848l(this.isTrainTripPlan, mVTripPlanRequest.isTrainTripPlan)) != 0) || (compareTo2 = Boolean.valueOf(mo34690q()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34690q()))) != 0 || ((mo34690q() && (compareTo2 = C25082a.m62848l(this.skipTaxiSearch, mVTripPlanRequest.skipTaxiSearch)) != 0) || (compareTo2 = Boolean.valueOf(mo34684j()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34684j()))) != 0 || ((mo34684j() && (compareTo2 = this.fromLocationDesc.compareTo(mVTripPlanRequest.fromLocationDesc)) != 0) || (compareTo2 = Boolean.valueOf(mo34695u()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34695u()))) != 0 || ((mo34695u() && (compareTo2 = this.toLocationDesc.compareTo(mVTripPlanRequest.toLocationDesc)) != 0) || (compareTo2 = Boolean.valueOf(mo34696v()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34696v()))) != 0 || ((mo34696v() && (compareTo2 = C25082a.m62844h(this.transportTypes, mVTripPlanRequest.transportTypes)) != 0) || (compareTo2 = Boolean.valueOf(mo34687m()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34687m()))) != 0 || ((mo34687m() && (compareTo2 = this.multiModalTripData.compareTo(mVTripPlanRequest.multiModalTripData)) != 0) || (compareTo2 = Boolean.valueOf(mo34679f()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34679f()))) != 0 || ((mo34679f() && (compareTo2 = C25082a.m62848l(this.addFlexTimeSearch, mVTripPlanRequest.addFlexTimeSearch)) != 0) || (compareTo2 = Boolean.valueOf(mo34688o()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34688o()))) != 0 || ((mo34688o() && (compareTo2 = this.personalPreferences.compareTo(mVTripPlanRequest.personalPreferences)) != 0) || (compareTo2 = Boolean.valueOf(mo34680g()).compareTo(Boolean.valueOf(mVTripPlanRequest.mo34680g()))) != 0))))))))))))))))) {
            return compareTo2;
        }
        if (!mo34680g() || (compareTo = this.algorithmType.compareTo(mVTripPlanRequest.algorithmType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTripPlanRequest)) {
            return mo34676a((MVTripPlanRequest) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34679f() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: g */
    public final boolean mo34680g() {
        return this.algorithmType != null;
    }

    /* renamed from: h */
    public final boolean mo34681h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34683i() {
        return this.fromLocation != null;
    }

    /* renamed from: j */
    public final boolean mo34684j() {
        return this.fromLocationDesc != null;
    }

    /* renamed from: k */
    public final boolean mo34685k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final boolean mo34686l() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: m */
    public final boolean mo34687m() {
        return this.multiModalTripData != null;
    }

    /* renamed from: o */
    public final boolean mo34688o() {
        return this.personalPreferences != null;
    }

    /* renamed from: p */
    public final boolean mo34689p() {
        return this.routeTypes != null;
    }

    /* renamed from: q */
    public final boolean mo34690q() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: r */
    public final boolean mo34691r() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: s */
    public final boolean mo34692s() {
        return this.timeType != null;
    }

    /* renamed from: t */
    public final boolean mo34693t() {
        return this.toLocation != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanRequest(", "tripPlanPref:");
        MVTripPlanPref mVTripPlanPref = this.tripPlanPref;
        if (mVTripPlanPref == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanPref);
        }
        n.append(", ");
        n.append("time:");
        C25541a.m63889t(n, this.time, ", ", "timeType:");
        MVTimeType mVTimeType = this.timeType;
        if (mVTimeType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTimeType);
        }
        n.append(", ");
        n.append("currentTimeSelected:");
        C13555b.m33977q(n, this.currentTimeSelected, ", ", "routeTypes:");
        List<MVRouteType> list = this.routeTypes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("fromLocation:");
        MVLocationTarget mVLocationTarget = this.fromLocation;
        if (mVLocationTarget == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationTarget);
        }
        n.append(", ");
        n.append("toLocation:");
        MVLocationTarget mVLocationTarget2 = this.toLocation;
        if (mVLocationTarget2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationTarget2);
        }
        if (mo34685k()) {
            n.append(", ");
            n.append("isTest:");
            n.append(this.isTest);
        }
        if (mo34686l()) {
            n.append(", ");
            n.append("isTrainTripPlan:");
            n.append(this.isTrainTripPlan);
        }
        if (mo34690q()) {
            n.append(", ");
            n.append("skipTaxiSearch:");
            n.append(this.skipTaxiSearch);
        }
        if (mo34684j()) {
            n.append(", ");
            n.append("fromLocationDesc:");
            String str = this.fromLocationDesc;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo34695u()) {
            n.append(", ");
            n.append("toLocationDesc:");
            String str2 = this.toLocationDesc;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo34696v()) {
            n.append(", ");
            n.append("transportTypes:");
            List<MVTripPlanTransportOptionPref> list2 = this.transportTypes;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo34687m()) {
            n.append(", ");
            n.append("multiModalTripData:");
            MVMultiModalTripData mVMultiModalTripData = this.multiModalTripData;
            if (mVMultiModalTripData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMultiModalTripData);
            }
        }
        if (mo34679f()) {
            n.append(", ");
            n.append("addFlexTimeSearch:");
            n.append(this.addFlexTimeSearch);
        }
        if (mo34688o()) {
            n.append(", ");
            n.append("personalPreferences:");
            MVPersonalPreferences mVPersonalPreferences = this.personalPreferences;
            if (mVPersonalPreferences == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPersonalPreferences);
            }
        }
        if (mo34680g()) {
            n.append(", ");
            n.append("algorithmType:");
            MVAlgorithmType mVAlgorithmType = this.algorithmType;
            if (mVAlgorithmType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVAlgorithmType);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo34695u() {
        return this.toLocationDesc != null;
    }

    /* renamed from: v */
    public final boolean mo34696v() {
        return this.transportTypes != null;
    }

    /* renamed from: w */
    public final boolean mo34697w() {
        return this.tripPlanPref != null;
    }

    /* renamed from: y */
    public final void mo34698y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    public MVTripPlanRequest(MVTripPlanPref mVTripPlanPref, long j, MVTimeType mVTimeType, boolean z, List<MVRouteType> list, MVLocationTarget mVLocationTarget, MVLocationTarget mVLocationTarget2) {
        this();
        this.tripPlanPref = mVTripPlanPref;
        this.time = j;
        mo34674G();
        this.timeType = mVTimeType;
        this.currentTimeSelected = z;
        mo34670A();
        this.routeTypes = list;
        this.fromLocation = mVLocationTarget;
        this.toLocation = mVLocationTarget2;
    }
}
