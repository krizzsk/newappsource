package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.fare.MVLegFare;
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

public class MVLineLeg implements TBase<MVLineLeg, _Fields>, Serializable, Cloneable, Comparable<MVLineLeg> {

    /* renamed from: b */
    public static final C25113c f29952b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29953c = new C25113c("lineId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f29954d = new C25113c("stopSequenceIds", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f29955e = new C25113c("shape", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29956f = new C25113c("legFare", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f29957g = new C25113c("tripId", (byte) 10, 6);

    /* renamed from: h */
    public static final C25113c f29958h = new C25113c("metroId", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f29959i = new C25113c("tripShortName", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f29960j = new C25113c("shortPlatformMetadata", (byte) 15, 9);

    /* renamed from: k */
    public static final C25113c f29961k = new C25113c("childStopSequenceIds", (byte) 15, 10);

    /* renamed from: l */
    public static final C25113c f29962l = new C25113c("smartCardTypeKey", (byte) 11, 11);

    /* renamed from: m */
    public static final C25113c f29963m = new C25113c("subRouteType", (byte) 11, 12);

    /* renamed from: n */
    public static final HashMap f29964n;

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f29965o;
    private byte __isset_bitfield = 0;
    public List<Integer> childStopSequenceIds;
    public MVLegFare legFare;
    public int lineId;
    public int metroId;
    private _Fields[] optionals = {_Fields.LEG_FARE, _Fields.TRIP_ID, _Fields.METRO_ID, _Fields.TRIP_SHORT_NAME, _Fields.SHORT_PLATFORM_METADATA, _Fields.CHILD_STOP_SEQUENCE_IDS, _Fields.SMART_CARD_TYPE_KEY, _Fields.SUB_ROUTE_TYPE};
    public MVTripPlanShape shape;
    public List<MVShortPlatformMetadata> shortPlatformMetadata;
    public String smartCardTypeKey;
    public List<Integer> stopSequenceIds;
    public String subRouteType;
    public MVTime time;
    public long tripId;
    public String tripShortName;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        LINE_ID(2, "lineId"),
        STOP_SEQUENCE_IDS(3, "stopSequenceIds"),
        SHAPE(4, "shape"),
        LEG_FARE(5, "legFare"),
        TRIP_ID(6, "tripId"),
        METRO_ID(7, "metroId"),
        TRIP_SHORT_NAME(8, "tripShortName"),
        SHORT_PLATFORM_METADATA(9, "shortPlatformMetadata"),
        CHILD_STOP_SEQUENCE_IDS(10, "childStopSequenceIds"),
        SMART_CARD_TYPE_KEY(11, "smartCardTypeKey"),
        SUB_ROUTE_TYPE(12, "subRouteType");
        
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
                    return LINE_ID;
                case 3:
                    return STOP_SEQUENCE_IDS;
                case 4:
                    return SHAPE;
                case 5:
                    return LEG_FARE;
                case 6:
                    return TRIP_ID;
                case 7:
                    return METRO_ID;
                case 8:
                    return TRIP_SHORT_NAME;
                case 9:
                    return SHORT_PLATFORM_METADATA;
                case 10:
                    return CHILD_STOP_SEQUENCE_IDS;
                case 11:
                    return SMART_CARD_TYPE_KEY;
                case 12:
                    return SUB_ROUTE_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLineLeg$a */
    public static class C11562a extends C25239c<MVLineLeg> {
        public C11562a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineLeg mVLineLeg = (MVLineLeg) tBase;
            mVLineLeg.getClass();
            C25113c cVar = MVLineLeg.f29952b;
            gVar.mo61687K();
            if (mVLineLeg.time != null) {
                gVar.mo61711x(MVLineLeg.f29952b);
                mVLineLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVLineLeg.f29953c);
            gVar.mo61678B(mVLineLeg.lineId);
            gVar.mo61712y();
            if (mVLineLeg.stopSequenceIds != null) {
                gVar.mo61711x(MVLineLeg.f29954d);
                gVar.mo61680D(new C25119e((byte) 8, mVLineLeg.stopSequenceIds.size()));
                for (Integer intValue : mVLineLeg.stopSequenceIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineLeg.shape != null) {
                gVar.mo61711x(MVLineLeg.f29955e);
                mVLineLeg.shape.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLineLeg.legFare != null && mVLineLeg.mo34360g()) {
                gVar.mo61711x(MVLineLeg.f29956f);
                mVLineLeg.legFare.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLineLeg.mo34370q()) {
                gVar.mo61711x(MVLineLeg.f29957g);
                gVar.mo61679C(mVLineLeg.tripId);
                gVar.mo61712y();
            }
            if (mVLineLeg.mo34363i()) {
                gVar.mo61711x(MVLineLeg.f29958h);
                gVar.mo61678B(mVLineLeg.metroId);
                gVar.mo61712y();
            }
            if (mVLineLeg.tripShortName != null && mVLineLeg.mo34371r()) {
                gVar.mo61711x(MVLineLeg.f29959i);
                gVar.mo61686J(mVLineLeg.tripShortName);
                gVar.mo61712y();
            }
            if (mVLineLeg.shortPlatformMetadata != null && mVLineLeg.mo34365k()) {
                gVar.mo61711x(MVLineLeg.f29960j);
                gVar.mo61680D(new C25119e((byte) 12, mVLineLeg.shortPlatformMetadata.size()));
                for (MVShortPlatformMetadata X0 : mVLineLeg.shortPlatformMetadata) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineLeg.childStopSequenceIds != null && mVLineLeg.mo34359f()) {
                gVar.mo61711x(MVLineLeg.f29961k);
                gVar.mo61680D(new C25119e((byte) 8, mVLineLeg.childStopSequenceIds.size()));
                for (Integer intValue2 : mVLineLeg.childStopSequenceIds) {
                    gVar.mo61678B(intValue2.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineLeg.smartCardTypeKey != null && mVLineLeg.mo34366l()) {
                gVar.mo61711x(MVLineLeg.f29962l);
                gVar.mo61686J(mVLineLeg.smartCardTypeKey);
                gVar.mo61712y();
            }
            if (mVLineLeg.subRouteType != null && mVLineLeg.mo34368o()) {
                gVar.mo61711x(MVLineLeg.f29963m);
                gVar.mo61686J(mVLineLeg.subRouteType);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineLeg mVLineLeg = (MVLineLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineLeg.getClass();
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
                            mVLineLeg.time = mVTime;
                            mVTime.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineLeg.lineId = gVar.mo61696i();
                            mVLineLeg.mo34372s();
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVLineLeg.stopSequenceIds = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVLineLeg.stopSequenceIds, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                            mVLineLeg.shape = mVTripPlanShape;
                            mVTripPlanShape.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLegFare mVLegFare = new MVLegFare();
                            mVLineLeg.legFare = mVLegFare;
                            mVLegFare.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineLeg.tripId = gVar.mo61697j();
                            mVLineLeg.mo34375u();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineLeg.metroId = gVar.mo61696i();
                            mVLineLeg.mo34373t();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineLeg.tripShortName = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVLineLeg.shortPlatformMetadata = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVShortPlatformMetadata mVShortPlatformMetadata = new MVShortPlatformMetadata();
                                mVShortPlatformMetadata.mo25201C1(gVar);
                                mVLineLeg.shortPlatformMetadata.add(mVShortPlatformMetadata);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 10:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVLineLeg.childStopSequenceIds = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVLineLeg.childStopSequenceIds, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 11:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineLeg.smartCardTypeKey = gVar.mo61704q();
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineLeg.subRouteType = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLineLeg$b */
    public static class C11563b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11562a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLineLeg$c */
    public static class C11564c extends C25240d<MVLineLeg> {
        public C11564c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineLeg mVLineLeg = (MVLineLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineLeg.mo34369p()) {
                bitSet.set(0);
            }
            if (mVLineLeg.mo34361h()) {
                bitSet.set(1);
            }
            if (mVLineLeg.mo34367m()) {
                bitSet.set(2);
            }
            if (mVLineLeg.mo34364j()) {
                bitSet.set(3);
            }
            if (mVLineLeg.mo34360g()) {
                bitSet.set(4);
            }
            if (mVLineLeg.mo34370q()) {
                bitSet.set(5);
            }
            if (mVLineLeg.mo34363i()) {
                bitSet.set(6);
            }
            if (mVLineLeg.mo34371r()) {
                bitSet.set(7);
            }
            if (mVLineLeg.mo34365k()) {
                bitSet.set(8);
            }
            if (mVLineLeg.mo34359f()) {
                bitSet.set(9);
            }
            if (mVLineLeg.mo34366l()) {
                bitSet.set(10);
            }
            if (mVLineLeg.mo34368o()) {
                bitSet.set(11);
            }
            jVar.mo61738U(bitSet, 12);
            if (mVLineLeg.mo34369p()) {
                mVLineLeg.time.mo25202X0(jVar);
            }
            if (mVLineLeg.mo34361h()) {
                jVar.mo61678B(mVLineLeg.lineId);
            }
            if (mVLineLeg.mo34367m()) {
                jVar.mo61678B(mVLineLeg.stopSequenceIds.size());
                for (Integer intValue : mVLineLeg.stopSequenceIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVLineLeg.mo34364j()) {
                mVLineLeg.shape.mo25202X0(jVar);
            }
            if (mVLineLeg.mo34360g()) {
                mVLineLeg.legFare.mo25202X0(jVar);
            }
            if (mVLineLeg.mo34370q()) {
                jVar.mo61679C(mVLineLeg.tripId);
            }
            if (mVLineLeg.mo34363i()) {
                jVar.mo61678B(mVLineLeg.metroId);
            }
            if (mVLineLeg.mo34371r()) {
                jVar.mo61686J(mVLineLeg.tripShortName);
            }
            if (mVLineLeg.mo34365k()) {
                jVar.mo61678B(mVLineLeg.shortPlatformMetadata.size());
                for (MVShortPlatformMetadata X0 : mVLineLeg.shortPlatformMetadata) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVLineLeg.mo34359f()) {
                jVar.mo61678B(mVLineLeg.childStopSequenceIds.size());
                for (Integer intValue2 : mVLineLeg.childStopSequenceIds) {
                    jVar.mo61678B(intValue2.intValue());
                }
            }
            if (mVLineLeg.mo34366l()) {
                jVar.mo61686J(mVLineLeg.smartCardTypeKey);
            }
            if (mVLineLeg.mo34368o()) {
                jVar.mo61686J(mVLineLeg.subRouteType);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineLeg mVLineLeg = (MVLineLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(12);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVLineLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVLineLeg.lineId = jVar.mo61696i();
                mVLineLeg.mo34372s();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVLineLeg.stopSequenceIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVLineLeg.stopSequenceIds, i2, 1)) {
                }
            }
            if (T.get(3)) {
                MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                mVLineLeg.shape = mVTripPlanShape;
                mVTripPlanShape.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVLegFare mVLegFare = new MVLegFare();
                mVLineLeg.legFare = mVLegFare;
                mVLegFare.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVLineLeg.tripId = jVar.mo61697j();
                mVLineLeg.mo34375u();
            }
            if (T.get(6)) {
                mVLineLeg.metroId = jVar.mo61696i();
                mVLineLeg.mo34373t();
            }
            if (T.get(7)) {
                mVLineLeg.tripShortName = jVar.mo61704q();
            }
            if (T.get(8)) {
                int i3 = jVar.mo61696i();
                mVLineLeg.shortPlatformMetadata = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVShortPlatformMetadata mVShortPlatformMetadata = new MVShortPlatformMetadata();
                    mVShortPlatformMetadata.mo25201C1(jVar);
                    mVLineLeg.shortPlatformMetadata.add(mVShortPlatformMetadata);
                }
            }
            if (T.get(9)) {
                int i5 = jVar.mo61696i();
                mVLineLeg.childStopSequenceIds = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6 = C13437d.m33701f(jVar.mo61696i(), mVLineLeg.childStopSequenceIds, i6, 1)) {
                }
            }
            if (T.get(10)) {
                mVLineLeg.smartCardTypeKey = jVar.mo61704q();
            }
            if (T.get(11)) {
                mVLineLeg.subRouteType = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLineLeg$d */
    public static class C11565d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11564c(0);
        }
    }

    static {
        new C17394d0("MVLineLeg");
        HashMap hashMap = new HashMap();
        f29964n = hashMap;
        hashMap.put(C25239c.class, new C11563b());
        hashMap.put(C25240d.class, new C11565d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_SEQUENCE_IDS, new FieldMetaData("stopSequenceIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.SHAPE, new FieldMetaData("shape", (byte) 3, new StructMetaData(MVTripPlanShape.class)));
        enumMap.put(_Fields.LEG_FARE, new FieldMetaData("legFare", (byte) 2, new StructMetaData(MVLegFare.class)));
        enumMap.put(_Fields.TRIP_ID, new FieldMetaData("tripId", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRIP_SHORT_NAME, new FieldMetaData("tripShortName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SHORT_PLATFORM_METADATA, new FieldMetaData("shortPlatformMetadata", (byte) 2, new ListMetaData(new StructMetaData(MVShortPlatformMetadata.class))));
        enumMap.put(_Fields.CHILD_STOP_SEQUENCE_IDS, new FieldMetaData("childStopSequenceIds", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.SMART_CARD_TYPE_KEY, new FieldMetaData("smartCardTypeKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUB_ROUTE_TYPE, new FieldMetaData("subRouteType", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29965o = unmodifiableMap;
        FieldMetaData.m61947a(MVLineLeg.class, unmodifiableMap);
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
        ((C25238b) f29964n.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29964n.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34356a(MVLineLeg mVLineLeg) {
        if (mVLineLeg == null) {
            return false;
        }
        boolean p = mo34369p();
        boolean p2 = mVLineLeg.mo34369p();
        if (((p || p2) && (!p || !p2 || !this.time.mo34573a(mVLineLeg.time))) || this.lineId != mVLineLeg.lineId) {
            return false;
        }
        boolean m = mo34367m();
        boolean m2 = mVLineLeg.mo34367m();
        if ((m || m2) && (!m || !m2 || !this.stopSequenceIds.equals(mVLineLeg.stopSequenceIds))) {
            return false;
        }
        boolean j = mo34364j();
        boolean j2 = mVLineLeg.mo34364j();
        if ((j || j2) && (!j || !j2 || !this.shape.mo34748a(mVLineLeg.shape))) {
            return false;
        }
        boolean g = mo34360g();
        boolean g2 = mVLineLeg.mo34360g();
        if ((g || g2) && (!g || !g2 || !this.legFare.mo27245a(mVLineLeg.legFare))) {
            return false;
        }
        boolean q = mo34370q();
        boolean q2 = mVLineLeg.mo34370q();
        if ((q || q2) && (!q || !q2 || this.tripId != mVLineLeg.tripId)) {
            return false;
        }
        boolean i = mo34363i();
        boolean i2 = mVLineLeg.mo34363i();
        if ((i || i2) && (!i || !i2 || this.metroId != mVLineLeg.metroId)) {
            return false;
        }
        boolean r = mo34371r();
        boolean r2 = mVLineLeg.mo34371r();
        if ((r || r2) && (!r || !r2 || !this.tripShortName.equals(mVLineLeg.tripShortName))) {
            return false;
        }
        boolean k = mo34365k();
        boolean k2 = mVLineLeg.mo34365k();
        if ((k || k2) && (!k || !k2 || !this.shortPlatformMetadata.equals(mVLineLeg.shortPlatformMetadata))) {
            return false;
        }
        boolean f = mo34359f();
        boolean f2 = mVLineLeg.mo34359f();
        if ((f || f2) && (!f || !f2 || !this.childStopSequenceIds.equals(mVLineLeg.childStopSequenceIds))) {
            return false;
        }
        boolean l = mo34366l();
        boolean l2 = mVLineLeg.mo34366l();
        if ((l || l2) && (!l || !l2 || !this.smartCardTypeKey.equals(mVLineLeg.smartCardTypeKey))) {
            return false;
        }
        boolean o = mo34368o();
        boolean o2 = mVLineLeg.mo34368o();
        if (!o && !o2) {
            return true;
        }
        if (!o || !o2 || !this.subRouteType.equals(mVLineLeg.subRouteType)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLineLeg mVLineLeg = (MVLineLeg) obj;
        if (!getClass().equals(mVLineLeg.getClass())) {
            return getClass().getName().compareTo(mVLineLeg.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34369p()).compareTo(Boolean.valueOf(mVLineLeg.mo34369p()));
        if (compareTo2 != 0 || ((mo34369p() && (compareTo2 = this.time.compareTo(mVLineLeg.time)) != 0) || (compareTo2 = Boolean.valueOf(mo34361h()).compareTo(Boolean.valueOf(mVLineLeg.mo34361h()))) != 0 || ((mo34361h() && (compareTo2 = C25082a.m62839c(this.lineId, mVLineLeg.lineId)) != 0) || (compareTo2 = Boolean.valueOf(mo34367m()).compareTo(Boolean.valueOf(mVLineLeg.mo34367m()))) != 0 || ((mo34367m() && (compareTo2 = C25082a.m62844h(this.stopSequenceIds, mVLineLeg.stopSequenceIds)) != 0) || (compareTo2 = Boolean.valueOf(mo34364j()).compareTo(Boolean.valueOf(mVLineLeg.mo34364j()))) != 0 || ((mo34364j() && (compareTo2 = this.shape.compareTo(mVLineLeg.shape)) != 0) || (compareTo2 = Boolean.valueOf(mo34360g()).compareTo(Boolean.valueOf(mVLineLeg.mo34360g()))) != 0 || ((mo34360g() && (compareTo2 = this.legFare.compareTo(mVLineLeg.legFare)) != 0) || (compareTo2 = Boolean.valueOf(mo34370q()).compareTo(Boolean.valueOf(mVLineLeg.mo34370q()))) != 0 || ((mo34370q() && (compareTo2 = C25082a.m62840d(this.tripId, mVLineLeg.tripId)) != 0) || (compareTo2 = Boolean.valueOf(mo34363i()).compareTo(Boolean.valueOf(mVLineLeg.mo34363i()))) != 0 || ((mo34363i() && (compareTo2 = C25082a.m62839c(this.metroId, mVLineLeg.metroId)) != 0) || (compareTo2 = Boolean.valueOf(mo34371r()).compareTo(Boolean.valueOf(mVLineLeg.mo34371r()))) != 0 || ((mo34371r() && (compareTo2 = this.tripShortName.compareTo(mVLineLeg.tripShortName)) != 0) || (compareTo2 = Boolean.valueOf(mo34365k()).compareTo(Boolean.valueOf(mVLineLeg.mo34365k()))) != 0 || ((mo34365k() && (compareTo2 = C25082a.m62844h(this.shortPlatformMetadata, mVLineLeg.shortPlatformMetadata)) != 0) || (compareTo2 = Boolean.valueOf(mo34359f()).compareTo(Boolean.valueOf(mVLineLeg.mo34359f()))) != 0 || ((mo34359f() && (compareTo2 = C25082a.m62844h(this.childStopSequenceIds, mVLineLeg.childStopSequenceIds)) != 0) || (compareTo2 = Boolean.valueOf(mo34366l()).compareTo(Boolean.valueOf(mVLineLeg.mo34366l()))) != 0 || ((mo34366l() && (compareTo2 = this.smartCardTypeKey.compareTo(mVLineLeg.smartCardTypeKey)) != 0) || (compareTo2 = Boolean.valueOf(mo34368o()).compareTo(Boolean.valueOf(mVLineLeg.mo34368o()))) != 0)))))))))))) {
            return compareTo2;
        }
        if (!mo34368o() || (compareTo = this.subRouteType.compareTo(mVLineLeg.subRouteType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLineLeg)) {
            return mo34356a((MVLineLeg) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34359f() {
        return this.childStopSequenceIds != null;
    }

    /* renamed from: g */
    public final boolean mo34360g() {
        return this.legFare != null;
    }

    /* renamed from: h */
    public final boolean mo34361h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34363i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo34364j() {
        return this.shape != null;
    }

    /* renamed from: k */
    public final boolean mo34365k() {
        return this.shortPlatformMetadata != null;
    }

    /* renamed from: l */
    public final boolean mo34366l() {
        return this.smartCardTypeKey != null;
    }

    /* renamed from: m */
    public final boolean mo34367m() {
        return this.stopSequenceIds != null;
    }

    /* renamed from: o */
    public final boolean mo34368o() {
        return this.subRouteType != null;
    }

    /* renamed from: p */
    public final boolean mo34369p() {
        return this.time != null;
    }

    /* renamed from: q */
    public final boolean mo34370q() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: r */
    public final boolean mo34371r() {
        return this.tripShortName != null;
    }

    /* renamed from: s */
    public final void mo34372s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: t */
    public final void mo34373t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineLeg(", "time:");
        MVTime mVTime = this.time;
        if (mVTime == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTime);
        }
        n.append(", ");
        n.append("lineId:");
        C0016g.m42z(n, this.lineId, ", ", "stopSequenceIds:");
        List<Integer> list = this.stopSequenceIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("shape:");
        MVTripPlanShape mVTripPlanShape = this.shape;
        if (mVTripPlanShape == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanShape);
        }
        if (mo34360g()) {
            n.append(", ");
            n.append("legFare:");
            MVLegFare mVLegFare = this.legFare;
            if (mVLegFare == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLegFare);
            }
        }
        if (mo34370q()) {
            n.append(", ");
            n.append("tripId:");
            n.append(this.tripId);
        }
        if (mo34363i()) {
            n.append(", ");
            n.append("metroId:");
            n.append(this.metroId);
        }
        if (mo34371r()) {
            n.append(", ");
            n.append("tripShortName:");
            String str = this.tripShortName;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo34365k()) {
            n.append(", ");
            n.append("shortPlatformMetadata:");
            List<MVShortPlatformMetadata> list2 = this.shortPlatformMetadata;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo34359f()) {
            n.append(", ");
            n.append("childStopSequenceIds:");
            List<Integer> list3 = this.childStopSequenceIds;
            if (list3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list3);
            }
        }
        if (mo34366l()) {
            n.append(", ");
            n.append("smartCardTypeKey:");
            String str2 = this.smartCardTypeKey;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo34368o()) {
            n.append(", ");
            n.append("subRouteType:");
            String str3 = this.subRouteType;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo34375u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }
}
