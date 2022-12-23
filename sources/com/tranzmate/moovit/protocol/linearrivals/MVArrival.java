package com.tranzmate.moovit.protocol.linearrivals;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVArrival implements TBase<MVArrival, _Fields>, Serializable, Cloneable, Comparable<MVArrival> {

    /* renamed from: b */
    public static final C25113c f26107b = new C25113c("patternId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26108c = new C25113c("tripId", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f26109d = new C25113c("relativeStaticTimeSpanSeconds", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26110e = new C25113c("relativeRealTimeSpanSeconds", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26111f = new C25113c(ServerParameters.STATUS, (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f26112g = new C25113c("platformName", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f26113h = new C25113c("isLastArrival", (byte) 2, 7);

    /* renamed from: i */
    public static final C25113c f26114i = new C25113c("attributes", (byte) 15, 8);

    /* renamed from: j */
    public static final C25113c f26115j = new C25113c("frequencyId", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f26116k = new C25113c("durationInSeconds", (byte) 8, 10);

    /* renamed from: l */
    public static final C25113c f26117l = new C25113c("vehicleLocation", (byte) 12, 11);

    /* renamed from: m */
    public static final C25113c f26118m = new C25113c("stopIndex", (byte) 8, 12);

    /* renamed from: n */
    public static final C25113c f26119n = new C25113c("patternStopsSize", (byte) 8, 13);

    /* renamed from: o */
    public static final C25113c f26120o = new C25113c("vehicleAttributes", (byte) 12, 14);

    /* renamed from: p */
    public static final C25113c f26121p = new C25113c("tripShapeId", (byte) 8, 15);

    /* renamed from: q */
    public static final HashMap f26122q;

    /* renamed from: r */
    public static final Map<_Fields, FieldMetaData> f26123r;
    private short __isset_bitfield = 0;
    public List<MVTripArrivalAttribute> attributes;
    public int durationInSeconds;
    public int frequencyId;
    public boolean isLastArrival;
    private _Fields[] optionals = {_Fields.RELATIVE_REAL_TIME_SPAN_SECONDS, _Fields.STATUS, _Fields.PLATFORM_NAME, _Fields.ATTRIBUTES, _Fields.FREQUENCY_ID, _Fields.DURATION_IN_SECONDS, _Fields.VEHICLE_LOCATION, _Fields.VEHICLE_ATTRIBUTES, _Fields.TRIP_SHAPE_ID};
    public int patternId;
    public int patternStopsSize;
    public String platformName;
    public int relativeRealTimeSpanSeconds;
    public int relativeStaticTimeSpanSeconds;
    public MVArrivalStatus2 status;
    public int stopIndex;
    public long tripId;
    public int tripShapeId;
    public MVArrivalAttributes vehicleAttributes;
    public MVVehicleLocation vehicleLocation;

    public enum _Fields implements C25085c {
        PATTERN_ID(1, "patternId"),
        TRIP_ID(2, "tripId"),
        RELATIVE_STATIC_TIME_SPAN_SECONDS(3, "relativeStaticTimeSpanSeconds"),
        RELATIVE_REAL_TIME_SPAN_SECONDS(4, "relativeRealTimeSpanSeconds"),
        STATUS(5, ServerParameters.STATUS),
        PLATFORM_NAME(6, "platformName"),
        IS_LAST_ARRIVAL(7, "isLastArrival"),
        ATTRIBUTES(8, "attributes"),
        FREQUENCY_ID(9, "frequencyId"),
        DURATION_IN_SECONDS(10, "durationInSeconds"),
        VEHICLE_LOCATION(11, "vehicleLocation"),
        STOP_INDEX(12, "stopIndex"),
        PATTERN_STOPS_SIZE(13, "patternStopsSize"),
        VEHICLE_ATTRIBUTES(14, "vehicleAttributes"),
        TRIP_SHAPE_ID(15, "tripShapeId");
        
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
                    return PATTERN_ID;
                case 2:
                    return TRIP_ID;
                case 3:
                    return RELATIVE_STATIC_TIME_SPAN_SECONDS;
                case 4:
                    return RELATIVE_REAL_TIME_SPAN_SECONDS;
                case 5:
                    return STATUS;
                case 6:
                    return PLATFORM_NAME;
                case 7:
                    return IS_LAST_ARRIVAL;
                case 8:
                    return ATTRIBUTES;
                case 9:
                    return FREQUENCY_ID;
                case 10:
                    return DURATION_IN_SECONDS;
                case 11:
                    return VEHICLE_LOCATION;
                case 12:
                    return STOP_INDEX;
                case 13:
                    return PATTERN_STOPS_SIZE;
                case 14:
                    return VEHICLE_ATTRIBUTES;
                case 15:
                    return TRIP_SHAPE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrival$a */
    public static class C8964a extends C25239c<MVArrival> {
        public C8964a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVArrival mVArrival = (MVArrival) tBase;
            mVArrival.getClass();
            C25113c cVar = MVArrival.f26107b;
            gVar.mo61687K();
            gVar.mo61711x(MVArrival.f26107b);
            gVar.mo61678B(mVArrival.patternId);
            gVar.mo61712y();
            gVar.mo61711x(MVArrival.f26108c);
            gVar.mo61679C(mVArrival.tripId);
            gVar.mo61712y();
            gVar.mo61711x(MVArrival.f26109d);
            gVar.mo61678B(mVArrival.relativeStaticTimeSpanSeconds);
            gVar.mo61712y();
            if (mVArrival.mo27980m()) {
                gVar.mo61711x(MVArrival.f26110e);
                gVar.mo61678B(mVArrival.relativeRealTimeSpanSeconds);
                gVar.mo61712y();
            }
            if (mVArrival.status != null && mVArrival.mo27982p()) {
                gVar.mo61711x(MVArrival.f26111f);
                gVar.mo61678B(mVArrival.status.getValue());
                gVar.mo61712y();
            }
            if (mVArrival.platformName != null && mVArrival.mo27979l()) {
                gVar.mo61711x(MVArrival.f26112g);
                gVar.mo61686J(mVArrival.platformName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVArrival.f26113h);
            gVar.mo61708u(mVArrival.isLastArrival);
            gVar.mo61712y();
            if (mVArrival.attributes != null && mVArrival.mo27972f()) {
                gVar.mo61711x(MVArrival.f26114i);
                gVar.mo61680D(new C25119e((byte) 12, mVArrival.attributes.size()));
                for (MVTripArrivalAttribute X0 : mVArrival.attributes) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVArrival.mo27974h()) {
                gVar.mo61711x(MVArrival.f26115j);
                gVar.mo61678B(mVArrival.frequencyId);
                gVar.mo61712y();
            }
            if (mVArrival.mo27973g()) {
                gVar.mo61711x(MVArrival.f26116k);
                gVar.mo61678B(mVArrival.durationInSeconds);
                gVar.mo61712y();
            }
            if (mVArrival.vehicleLocation != null && mVArrival.mo27988u()) {
                gVar.mo61711x(MVArrival.f26117l);
                mVArrival.vehicleLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVArrival.f26118m);
            gVar.mo61678B(mVArrival.stopIndex);
            gVar.mo61712y();
            gVar.mo61711x(MVArrival.f26119n);
            gVar.mo61678B(mVArrival.patternStopsSize);
            gVar.mo61712y();
            if (mVArrival.vehicleAttributes != null && mVArrival.mo27986t()) {
                gVar.mo61711x(MVArrival.f26120o);
                mVArrival.vehicleAttributes.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVArrival.mo27985s()) {
                gVar.mo61711x(MVArrival.f26121p);
                gVar.mo61678B(mVArrival.tripShapeId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVArrival mVArrival = (MVArrival) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVArrival.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.patternId = gVar.mo61696i();
                            mVArrival.mo27963A();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.tripId = gVar.mo61697j();
                            mVArrival.mo27968H();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.relativeStaticTimeSpanSeconds = gVar.mo61696i();
                            mVArrival.mo27966F();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.relativeRealTimeSpanSeconds = gVar.mo61696i();
                            mVArrival.mo27965E();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.status = MVArrivalStatus2.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.platformName = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.isLastArrival = gVar.mo61690c();
                            mVArrival.mo27991y();
                            break;
                        }
                    case 8:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVArrival.attributes = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVTripArrivalAttribute mVTripArrivalAttribute = new MVTripArrivalAttribute();
                                mVTripArrivalAttribute.mo25201C1(gVar);
                                mVArrival.attributes.add(mVTripArrivalAttribute);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.frequencyId = gVar.mo61696i();
                            mVArrival.mo27990w();
                            break;
                        }
                    case 10:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.durationInSeconds = gVar.mo61696i();
                            mVArrival.mo27989v();
                            break;
                        }
                    case 11:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVVehicleLocation mVVehicleLocation = new MVVehicleLocation();
                            mVArrival.vehicleLocation = mVVehicleLocation;
                            mVVehicleLocation.mo25201C1(gVar);
                            break;
                        }
                    case 12:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.stopIndex = gVar.mo61696i();
                            mVArrival.mo27967G();
                            break;
                        }
                    case 13:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.patternStopsSize = gVar.mo61696i();
                            mVArrival.mo27964D();
                            break;
                        }
                    case 14:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVArrivalAttributes mVArrivalAttributes = new MVArrivalAttributes();
                            mVArrival.vehicleAttributes = mVArrivalAttributes;
                            mVArrivalAttributes.mo25201C1(gVar);
                            break;
                        }
                    case 15:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVArrival.tripShapeId = gVar.mo61696i();
                            mVArrival.mo27969I();
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrival$b */
    public static class C8965b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8964a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrival$c */
    public static class C8966c extends C25240d<MVArrival> {
        public C8966c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVArrival mVArrival = (MVArrival) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVArrival.mo27977j()) {
                bitSet.set(0);
            }
            if (mVArrival.mo27984r()) {
                bitSet.set(1);
            }
            if (mVArrival.mo27981o()) {
                bitSet.set(2);
            }
            if (mVArrival.mo27980m()) {
                bitSet.set(3);
            }
            if (mVArrival.mo27982p()) {
                bitSet.set(4);
            }
            if (mVArrival.mo27979l()) {
                bitSet.set(5);
            }
            if (mVArrival.mo27976i()) {
                bitSet.set(6);
            }
            if (mVArrival.mo27972f()) {
                bitSet.set(7);
            }
            if (mVArrival.mo27974h()) {
                bitSet.set(8);
            }
            if (mVArrival.mo27973g()) {
                bitSet.set(9);
            }
            if (mVArrival.mo27988u()) {
                bitSet.set(10);
            }
            if (mVArrival.mo27983q()) {
                bitSet.set(11);
            }
            if (mVArrival.mo27978k()) {
                bitSet.set(12);
            }
            if (mVArrival.mo27986t()) {
                bitSet.set(13);
            }
            if (mVArrival.mo27985s()) {
                bitSet.set(14);
            }
            jVar.mo61738U(bitSet, 15);
            if (mVArrival.mo27977j()) {
                jVar.mo61678B(mVArrival.patternId);
            }
            if (mVArrival.mo27984r()) {
                jVar.mo61679C(mVArrival.tripId);
            }
            if (mVArrival.mo27981o()) {
                jVar.mo61678B(mVArrival.relativeStaticTimeSpanSeconds);
            }
            if (mVArrival.mo27980m()) {
                jVar.mo61678B(mVArrival.relativeRealTimeSpanSeconds);
            }
            if (mVArrival.mo27982p()) {
                jVar.mo61678B(mVArrival.status.getValue());
            }
            if (mVArrival.mo27979l()) {
                jVar.mo61686J(mVArrival.platformName);
            }
            if (mVArrival.mo27976i()) {
                jVar.mo61708u(mVArrival.isLastArrival);
            }
            if (mVArrival.mo27972f()) {
                jVar.mo61678B(mVArrival.attributes.size());
                for (MVTripArrivalAttribute X0 : mVArrival.attributes) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVArrival.mo27974h()) {
                jVar.mo61678B(mVArrival.frequencyId);
            }
            if (mVArrival.mo27973g()) {
                jVar.mo61678B(mVArrival.durationInSeconds);
            }
            if (mVArrival.mo27988u()) {
                mVArrival.vehicleLocation.mo25202X0(jVar);
            }
            if (mVArrival.mo27983q()) {
                jVar.mo61678B(mVArrival.stopIndex);
            }
            if (mVArrival.mo27978k()) {
                jVar.mo61678B(mVArrival.patternStopsSize);
            }
            if (mVArrival.mo27986t()) {
                mVArrival.vehicleAttributes.mo25202X0(jVar);
            }
            if (mVArrival.mo27985s()) {
                jVar.mo61678B(mVArrival.tripShapeId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVArrival mVArrival = (MVArrival) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(15);
            if (T.get(0)) {
                mVArrival.patternId = jVar.mo61696i();
                mVArrival.mo27963A();
            }
            if (T.get(1)) {
                mVArrival.tripId = jVar.mo61697j();
                mVArrival.mo27968H();
            }
            if (T.get(2)) {
                mVArrival.relativeStaticTimeSpanSeconds = jVar.mo61696i();
                mVArrival.mo27966F();
            }
            if (T.get(3)) {
                mVArrival.relativeRealTimeSpanSeconds = jVar.mo61696i();
                mVArrival.mo27965E();
            }
            if (T.get(4)) {
                mVArrival.status = MVArrivalStatus2.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                mVArrival.platformName = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVArrival.isLastArrival = jVar.mo61690c();
                mVArrival.mo27991y();
            }
            if (T.get(7)) {
                int i = jVar.mo61696i();
                mVArrival.attributes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTripArrivalAttribute mVTripArrivalAttribute = new MVTripArrivalAttribute();
                    mVTripArrivalAttribute.mo25201C1(jVar);
                    mVArrival.attributes.add(mVTripArrivalAttribute);
                }
            }
            if (T.get(8)) {
                mVArrival.frequencyId = jVar.mo61696i();
                mVArrival.mo27990w();
            }
            if (T.get(9)) {
                mVArrival.durationInSeconds = jVar.mo61696i();
                mVArrival.mo27989v();
            }
            if (T.get(10)) {
                MVVehicleLocation mVVehicleLocation = new MVVehicleLocation();
                mVArrival.vehicleLocation = mVVehicleLocation;
                mVVehicleLocation.mo25201C1(jVar);
            }
            if (T.get(11)) {
                mVArrival.stopIndex = jVar.mo61696i();
                mVArrival.mo27967G();
            }
            if (T.get(12)) {
                mVArrival.patternStopsSize = jVar.mo61696i();
                mVArrival.mo27964D();
            }
            if (T.get(13)) {
                MVArrivalAttributes mVArrivalAttributes = new MVArrivalAttributes();
                mVArrival.vehicleAttributes = mVArrivalAttributes;
                mVArrivalAttributes.mo25201C1(jVar);
            }
            if (T.get(14)) {
                mVArrival.tripShapeId = jVar.mo61696i();
                mVArrival.mo27969I();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrival$d */
    public static class C8967d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8966c(0);
        }
    }

    static {
        new C17394d0("MVArrival");
        HashMap hashMap = new HashMap();
        f26122q = hashMap;
        hashMap.put(C25239c.class, new C8965b());
        hashMap.put(C25240d.class, new C8967d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PATTERN_ID, new FieldMetaData("patternId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRIP_ID, new FieldMetaData("tripId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.RELATIVE_STATIC_TIME_SPAN_SECONDS, new FieldMetaData("relativeStaticTimeSpanSeconds", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RELATIVE_REAL_TIME_SPAN_SECONDS, new FieldMetaData("relativeRealTimeSpanSeconds", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 2, new EnumMetaData(MVArrivalStatus2.class)));
        enumMap.put(_Fields.PLATFORM_NAME, new FieldMetaData("platformName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_LAST_ARRIVAL, new FieldMetaData("isLastArrival", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ATTRIBUTES, new FieldMetaData("attributes", (byte) 2, new ListMetaData(new StructMetaData(MVTripArrivalAttribute.class))));
        enumMap.put(_Fields.FREQUENCY_ID, new FieldMetaData("frequencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DURATION_IN_SECONDS, new FieldMetaData("durationInSeconds", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.VEHICLE_LOCATION, new FieldMetaData("vehicleLocation", (byte) 2, new StructMetaData(MVVehicleLocation.class)));
        enumMap.put(_Fields.STOP_INDEX, new FieldMetaData("stopIndex", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PATTERN_STOPS_SIZE, new FieldMetaData("patternStopsSize", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.VEHICLE_ATTRIBUTES, new FieldMetaData("vehicleAttributes", (byte) 2, new StructMetaData(MVArrivalAttributes.class)));
        enumMap.put(_Fields.TRIP_SHAPE_ID, new FieldMetaData("tripShapeId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26123r = unmodifiableMap;
        FieldMetaData.m61947a(MVArrival.class, unmodifiableMap);
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
    public final void mo27963A() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f26122q.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo27964D() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 8, true);
    }

    /* renamed from: E */
    public final void mo27965E() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: F */
    public final void mo27966F() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: G */
    public final void mo27967G() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    /* renamed from: H */
    public final void mo27968H() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: I */
    public final void mo27969I() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 9, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26122q.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVArrival mVArrival = (MVArrival) obj;
        if (!getClass().equals(mVArrival.getClass())) {
            return getClass().getName().compareTo(mVArrival.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27977j()).compareTo(Boolean.valueOf(mVArrival.mo27977j()));
        if (compareTo != 0 || ((mo27977j() && (compareTo = C25082a.m62839c(this.patternId, mVArrival.patternId)) != 0) || (compareTo = Boolean.valueOf(mo27984r()).compareTo(Boolean.valueOf(mVArrival.mo27984r()))) != 0 || ((mo27984r() && (compareTo = C25082a.m62840d(this.tripId, mVArrival.tripId)) != 0) || (compareTo = Boolean.valueOf(mo27981o()).compareTo(Boolean.valueOf(mVArrival.mo27981o()))) != 0 || ((mo27981o() && (compareTo = C25082a.m62839c(this.relativeStaticTimeSpanSeconds, mVArrival.relativeStaticTimeSpanSeconds)) != 0) || (compareTo = Boolean.valueOf(mo27980m()).compareTo(Boolean.valueOf(mVArrival.mo27980m()))) != 0 || ((mo27980m() && (compareTo = C25082a.m62839c(this.relativeRealTimeSpanSeconds, mVArrival.relativeRealTimeSpanSeconds)) != 0) || (compareTo = Boolean.valueOf(mo27982p()).compareTo(Boolean.valueOf(mVArrival.mo27982p()))) != 0 || ((mo27982p() && (compareTo = this.status.compareTo(mVArrival.status)) != 0) || (compareTo = Boolean.valueOf(mo27979l()).compareTo(Boolean.valueOf(mVArrival.mo27979l()))) != 0 || ((mo27979l() && (compareTo = this.platformName.compareTo(mVArrival.platformName)) != 0) || (compareTo = Boolean.valueOf(mo27976i()).compareTo(Boolean.valueOf(mVArrival.mo27976i()))) != 0 || ((mo27976i() && (compareTo = C25082a.m62848l(this.isLastArrival, mVArrival.isLastArrival)) != 0) || (compareTo = Boolean.valueOf(mo27972f()).compareTo(Boolean.valueOf(mVArrival.mo27972f()))) != 0 || ((mo27972f() && (compareTo = C25082a.m62844h(this.attributes, mVArrival.attributes)) != 0) || (compareTo = Boolean.valueOf(mo27974h()).compareTo(Boolean.valueOf(mVArrival.mo27974h()))) != 0 || ((mo27974h() && (compareTo = C25082a.m62839c(this.frequencyId, mVArrival.frequencyId)) != 0) || (compareTo = Boolean.valueOf(mo27973g()).compareTo(Boolean.valueOf(mVArrival.mo27973g()))) != 0 || ((mo27973g() && (compareTo = C25082a.m62839c(this.durationInSeconds, mVArrival.durationInSeconds)) != 0) || (compareTo = Boolean.valueOf(mo27988u()).compareTo(Boolean.valueOf(mVArrival.mo27988u()))) != 0 || ((mo27988u() && (compareTo = this.vehicleLocation.compareTo(mVArrival.vehicleLocation)) != 0) || (compareTo = Boolean.valueOf(mo27983q()).compareTo(Boolean.valueOf(mVArrival.mo27983q()))) != 0 || ((mo27983q() && (compareTo = C25082a.m62839c(this.stopIndex, mVArrival.stopIndex)) != 0) || (compareTo = Boolean.valueOf(mo27978k()).compareTo(Boolean.valueOf(mVArrival.mo27978k()))) != 0 || ((mo27978k() && (compareTo = C25082a.m62839c(this.patternStopsSize, mVArrival.patternStopsSize)) != 0) || (compareTo = Boolean.valueOf(mo27986t()).compareTo(Boolean.valueOf(mVArrival.mo27986t()))) != 0 || ((mo27986t() && (compareTo = this.vehicleAttributes.compareTo(mVArrival.vehicleAttributes)) != 0) || (compareTo = Boolean.valueOf(mo27985s()).compareTo(Boolean.valueOf(mVArrival.mo27985s()))) != 0))))))))))))))) {
            return compareTo;
        }
        if (!mo27985s() || (c = C25082a.m62839c(this.tripShapeId, mVArrival.tripShapeId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVArrival)) {
            return false;
        }
        MVArrival mVArrival = (MVArrival) obj;
        if (this.patternId != mVArrival.patternId || this.tripId != mVArrival.tripId || this.relativeStaticTimeSpanSeconds != mVArrival.relativeStaticTimeSpanSeconds) {
            return false;
        }
        boolean m = mo27980m();
        boolean m2 = mVArrival.mo27980m();
        if ((m || m2) && (!m || !m2 || this.relativeRealTimeSpanSeconds != mVArrival.relativeRealTimeSpanSeconds)) {
            return false;
        }
        boolean p = mo27982p();
        boolean p2 = mVArrival.mo27982p();
        if ((p || p2) && (!p || !p2 || !this.status.equals(mVArrival.status))) {
            return false;
        }
        boolean l = mo27979l();
        boolean l2 = mVArrival.mo27979l();
        if (((l || l2) && (!l || !l2 || !this.platformName.equals(mVArrival.platformName))) || this.isLastArrival != mVArrival.isLastArrival) {
            return false;
        }
        boolean f = mo27972f();
        boolean f2 = mVArrival.mo27972f();
        if ((f || f2) && (!f || !f2 || !this.attributes.equals(mVArrival.attributes))) {
            return false;
        }
        boolean h = mo27974h();
        boolean h2 = mVArrival.mo27974h();
        if ((h || h2) && (!h || !h2 || this.frequencyId != mVArrival.frequencyId)) {
            return false;
        }
        boolean g = mo27973g();
        boolean g2 = mVArrival.mo27973g();
        if ((g || g2) && (!g || !g2 || this.durationInSeconds != mVArrival.durationInSeconds)) {
            return false;
        }
        boolean u = mo27988u();
        boolean u2 = mVArrival.mo27988u();
        if (((u || u2) && (!u || !u2 || !this.vehicleLocation.mo28116a(mVArrival.vehicleLocation))) || this.stopIndex != mVArrival.stopIndex || this.patternStopsSize != mVArrival.patternStopsSize) {
            return false;
        }
        boolean t = mo27986t();
        boolean t2 = mVArrival.mo27986t();
        if ((t || t2) && (!t || !t2 || !this.vehicleAttributes.mo27993a(mVArrival.vehicleAttributes))) {
            return false;
        }
        boolean s = mo27985s();
        boolean s2 = mVArrival.mo27985s();
        if ((s || s2) && (!s || !s2 || this.tripShapeId != mVArrival.tripShapeId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27972f() {
        return this.attributes != null;
    }

    /* renamed from: g */
    public final boolean mo27973g() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: h */
    public final boolean mo27974h() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27976i() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: j */
    public final boolean mo27977j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo27978k() {
        return C13637c.m34053H(this.__isset_bitfield, 8);
    }

    /* renamed from: l */
    public final boolean mo27979l() {
        return this.platformName != null;
    }

    /* renamed from: m */
    public final boolean mo27980m() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: o */
    public final boolean mo27981o() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: p */
    public final boolean mo27982p() {
        return this.status != null;
    }

    /* renamed from: q */
    public final boolean mo27983q() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: r */
    public final boolean mo27984r() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: s */
    public final boolean mo27985s() {
        return C13637c.m34053H(this.__isset_bitfield, 9);
    }

    /* renamed from: t */
    public final boolean mo27986t() {
        return this.vehicleAttributes != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVArrival(", "patternId:");
        C0016g.m42z(n, this.patternId, ", ", "tripId:");
        C25541a.m63889t(n, this.tripId, ", ", "relativeStaticTimeSpanSeconds:");
        n.append(this.relativeStaticTimeSpanSeconds);
        if (mo27980m()) {
            n.append(", ");
            n.append("relativeRealTimeSpanSeconds:");
            n.append(this.relativeRealTimeSpanSeconds);
        }
        if (mo27982p()) {
            n.append(", ");
            n.append("status:");
            MVArrivalStatus2 mVArrivalStatus2 = this.status;
            if (mVArrivalStatus2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVArrivalStatus2);
            }
        }
        if (mo27979l()) {
            n.append(", ");
            n.append("platformName:");
            String str = this.platformName;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("isLastArrival:");
        n.append(this.isLastArrival);
        if (mo27972f()) {
            n.append(", ");
            n.append("attributes:");
            List<MVTripArrivalAttribute> list = this.attributes;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo27974h()) {
            n.append(", ");
            n.append("frequencyId:");
            n.append(this.frequencyId);
        }
        if (mo27973g()) {
            n.append(", ");
            n.append("durationInSeconds:");
            n.append(this.durationInSeconds);
        }
        if (mo27988u()) {
            n.append(", ");
            n.append("vehicleLocation:");
            MVVehicleLocation mVVehicleLocation = this.vehicleLocation;
            if (mVVehicleLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVVehicleLocation);
            }
        }
        n.append(", ");
        n.append("stopIndex:");
        C0016g.m42z(n, this.stopIndex, ", ", "patternStopsSize:");
        n.append(this.patternStopsSize);
        if (mo27986t()) {
            n.append(", ");
            n.append("vehicleAttributes:");
            MVArrivalAttributes mVArrivalAttributes = this.vehicleAttributes;
            if (mVArrivalAttributes == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVArrivalAttributes);
            }
        }
        if (mo27985s()) {
            n.append(", ");
            n.append("tripShapeId:");
            n.append(this.tripShapeId);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo27988u() {
        return this.vehicleLocation != null;
    }

    /* renamed from: v */
    public final void mo27989v() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: w */
    public final void mo27990w() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: y */
    public final void mo27991y() {
        this.__isset_bitfield = (short) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }
}
