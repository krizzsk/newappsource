package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.fare.MVItineraryFare;
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

public class MVTripPlanItinerary implements TBase<MVTripPlanItinerary, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanItinerary> {

    /* renamed from: b */
    public static final C25113c f30094b = new C25113c("guid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30095c = new C25113c("sectionId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30096d = new C25113c("groupType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30097e = new C25113c("groupKey", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30098f = new C25113c("legs", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f30099g = new C25113c("hasPrev", (byte) 2, 6);

    /* renamed from: h */
    public static final C25113c f30100h = new C25113c("hasNext", (byte) 2, 7);

    /* renamed from: i */
    public static final C25113c f30101i = new C25113c("relevantForRealtime", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f30102j = new C25113c("isAccessible", (byte) 2, 9);

    /* renamed from: k */
    public static final C25113c f30103k = new C25113c("itineraryFare", (byte) 12, 10);

    /* renamed from: l */
    public static final C25113c f30104l = new C25113c("weight", (byte) 4, 11);

    /* renamed from: m */
    public static final C25113c f30105m = new C25113c("hasSecondaryArrivalItinerary", (byte) 2, 12);

    /* renamed from: n */
    public static final C25113c f30106n = new C25113c("emissionLevel", (byte) 12, 13);

    /* renamed from: o */
    public static final C25113c f30107o = new C25113c("sectionName", (byte) 11, 14);

    /* renamed from: p */
    public static final C25113c f30108p = new C25113c("serverContext", (byte) 11, 15);

    /* renamed from: q */
    public static final HashMap f30109q;

    /* renamed from: r */
    public static final Map<_Fields, FieldMetaData> f30110r;
    private byte __isset_bitfield = 0;
    public MVEmissionLevel emissionLevel;
    public String groupKey;
    public MVGroupType groupType;
    public String guid;
    public boolean hasNext;
    public boolean hasPrev;
    public boolean hasSecondaryArrivalItinerary;
    public boolean isAccessible;
    public MVItineraryFare itineraryFare;
    public List<MVTripPlanLeg> legs;
    private _Fields[] optionals = {_Fields.ITINERARY_FARE, _Fields.WEIGHT, _Fields.EMISSION_LEVEL, _Fields.SECTION_NAME, _Fields.SERVER_CONTEXT};
    public boolean relevantForRealtime;
    public int sectionId;
    public String sectionName;
    public String serverContext;
    public double weight;

    public enum _Fields implements C25085c {
        GUID(1, "guid"),
        SECTION_ID(2, "sectionId"),
        GROUP_TYPE(3, "groupType"),
        GROUP_KEY(4, "groupKey"),
        LEGS(5, "legs"),
        HAS_PREV(6, "hasPrev"),
        HAS_NEXT(7, "hasNext"),
        RELEVANT_FOR_REALTIME(8, "relevantForRealtime"),
        IS_ACCESSIBLE(9, "isAccessible"),
        ITINERARY_FARE(10, "itineraryFare"),
        WEIGHT(11, "weight"),
        HAS_SECONDARY_ARRIVAL_ITINERARY(12, "hasSecondaryArrivalItinerary"),
        EMISSION_LEVEL(13, "emissionLevel"),
        SECTION_NAME(14, "sectionName"),
        SERVER_CONTEXT(15, "serverContext");
        
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
                    return GUID;
                case 2:
                    return SECTION_ID;
                case 3:
                    return GROUP_TYPE;
                case 4:
                    return GROUP_KEY;
                case 5:
                    return LEGS;
                case 6:
                    return HAS_PREV;
                case 7:
                    return HAS_NEXT;
                case 8:
                    return RELEVANT_FOR_REALTIME;
                case 9:
                    return IS_ACCESSIBLE;
                case 10:
                    return ITINERARY_FARE;
                case 11:
                    return WEIGHT;
                case 12:
                    return HAS_SECONDARY_ARRIVAL_ITINERARY;
                case 13:
                    return EMISSION_LEVEL;
                case 14:
                    return SECTION_NAME;
                case 15:
                    return SERVER_CONTEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary$a */
    public static class C11651a extends C25239c<MVTripPlanItinerary> {
        public C11651a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanItinerary mVTripPlanItinerary = (MVTripPlanItinerary) tBase;
            mVTripPlanItinerary.getClass();
            C25113c cVar = MVTripPlanItinerary.f30094b;
            gVar.mo61687K();
            if (mVTripPlanItinerary.guid != null) {
                gVar.mo61711x(MVTripPlanItinerary.f30094b);
                gVar.mo61686J(mVTripPlanItinerary.guid);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTripPlanItinerary.f30095c);
            gVar.mo61678B(mVTripPlanItinerary.sectionId);
            gVar.mo61712y();
            if (mVTripPlanItinerary.groupType != null) {
                gVar.mo61711x(MVTripPlanItinerary.f30096d);
                gVar.mo61678B(mVTripPlanItinerary.groupType.getValue());
                gVar.mo61712y();
            }
            if (mVTripPlanItinerary.groupKey != null) {
                gVar.mo61711x(MVTripPlanItinerary.f30097e);
                gVar.mo61686J(mVTripPlanItinerary.groupKey);
                gVar.mo61712y();
            }
            if (mVTripPlanItinerary.legs != null) {
                gVar.mo61711x(MVTripPlanItinerary.f30098f);
                gVar.mo61680D(new C25119e((byte) 12, mVTripPlanItinerary.legs.size()));
                for (MVTripPlanLeg X0 : mVTripPlanItinerary.legs) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTripPlanItinerary.f30099g);
            gVar.mo61708u(mVTripPlanItinerary.hasPrev);
            gVar.mo61712y();
            gVar.mo61711x(MVTripPlanItinerary.f30100h);
            gVar.mo61708u(mVTripPlanItinerary.hasNext);
            gVar.mo61712y();
            gVar.mo61711x(MVTripPlanItinerary.f30101i);
            gVar.mo61708u(mVTripPlanItinerary.relevantForRealtime);
            gVar.mo61712y();
            gVar.mo61711x(MVTripPlanItinerary.f30102j);
            gVar.mo61708u(mVTripPlanItinerary.isAccessible);
            gVar.mo61712y();
            if (mVTripPlanItinerary.itineraryFare != null && mVTripPlanItinerary.mo34635o()) {
                gVar.mo61711x(MVTripPlanItinerary.f30103k);
                mVTripPlanItinerary.itineraryFare.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTripPlanItinerary.mo34642u()) {
                gVar.mo61711x(MVTripPlanItinerary.f30104l);
                gVar.mo61710w(mVTripPlanItinerary.weight);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTripPlanItinerary.f30105m);
            gVar.mo61708u(mVTripPlanItinerary.hasSecondaryArrivalItinerary);
            gVar.mo61712y();
            if (mVTripPlanItinerary.emissionLevel != null && mVTripPlanItinerary.mo34626f()) {
                gVar.mo61711x(MVTripPlanItinerary.f30106n);
                mVTripPlanItinerary.emissionLevel.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTripPlanItinerary.sectionName != null && mVTripPlanItinerary.mo34639s()) {
                gVar.mo61711x(MVTripPlanItinerary.f30107o);
                gVar.mo61686J(mVTripPlanItinerary.sectionName);
                gVar.mo61712y();
            }
            if (mVTripPlanItinerary.serverContext != null && mVTripPlanItinerary.mo34640t()) {
                gVar.mo61711x(MVTripPlanItinerary.f30108p);
                gVar.mo61686J(mVTripPlanItinerary.serverContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanItinerary mVTripPlanItinerary = (MVTripPlanItinerary) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPlanItinerary.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.guid = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.sectionId = gVar.mo61696i();
                            mVTripPlanItinerary.mo34621E();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.groupType = MVGroupType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.groupKey = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTripPlanItinerary.legs = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVTripPlanLeg mVTripPlanLeg = new MVTripPlanLeg();
                                mVTripPlanLeg.mo25201C1(gVar);
                                mVTripPlanItinerary.legs.add(mVTripPlanLeg);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.hasPrev = gVar.mo61690c();
                            mVTripPlanItinerary.mo34644w();
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.hasNext = gVar.mo61690c();
                            mVTripPlanItinerary.mo34643v();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.relevantForRealtime = gVar.mo61690c();
                            mVTripPlanItinerary.mo34620D();
                            break;
                        }
                    case 9:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.isAccessible = gVar.mo61690c();
                            mVTripPlanItinerary.mo34619A();
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVItineraryFare mVItineraryFare = new MVItineraryFare();
                            mVTripPlanItinerary.itineraryFare = mVItineraryFare;
                            mVItineraryFare.mo25201C1(gVar);
                            break;
                        }
                    case 11:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.weight = gVar.mo61692e();
                            mVTripPlanItinerary.mo34622F();
                            break;
                        }
                    case 12:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.hasSecondaryArrivalItinerary = gVar.mo61690c();
                            mVTripPlanItinerary.mo34645y();
                            break;
                        }
                    case 13:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVEmissionLevel mVEmissionLevel = new MVEmissionLevel();
                            mVTripPlanItinerary.emissionLevel = mVEmissionLevel;
                            mVEmissionLevel.mo25201C1(gVar);
                            break;
                        }
                    case 14:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.sectionName = gVar.mo61704q();
                            break;
                        }
                    case 15:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanItinerary.serverContext = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary$b */
    public static class C11652b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11651a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary$c */
    public static class C11653c extends C25240d<MVTripPlanItinerary> {
        public C11653c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanItinerary mVTripPlanItinerary = (MVTripPlanItinerary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanItinerary.mo34630i()) {
                bitSet.set(0);
            }
            if (mVTripPlanItinerary.mo34638r()) {
                bitSet.set(1);
            }
            if (mVTripPlanItinerary.mo34628h()) {
                bitSet.set(2);
            }
            if (mVTripPlanItinerary.mo34627g()) {
                bitSet.set(3);
            }
            if (mVTripPlanItinerary.mo34636p()) {
                bitSet.set(4);
            }
            if (mVTripPlanItinerary.mo34632k()) {
                bitSet.set(5);
            }
            if (mVTripPlanItinerary.mo34631j()) {
                bitSet.set(6);
            }
            if (mVTripPlanItinerary.mo34637q()) {
                bitSet.set(7);
            }
            if (mVTripPlanItinerary.mo34634m()) {
                bitSet.set(8);
            }
            if (mVTripPlanItinerary.mo34635o()) {
                bitSet.set(9);
            }
            if (mVTripPlanItinerary.mo34642u()) {
                bitSet.set(10);
            }
            if (mVTripPlanItinerary.mo34633l()) {
                bitSet.set(11);
            }
            if (mVTripPlanItinerary.mo34626f()) {
                bitSet.set(12);
            }
            if (mVTripPlanItinerary.mo34639s()) {
                bitSet.set(13);
            }
            if (mVTripPlanItinerary.mo34640t()) {
                bitSet.set(14);
            }
            jVar.mo61738U(bitSet, 15);
            if (mVTripPlanItinerary.mo34630i()) {
                jVar.mo61686J(mVTripPlanItinerary.guid);
            }
            if (mVTripPlanItinerary.mo34638r()) {
                jVar.mo61678B(mVTripPlanItinerary.sectionId);
            }
            if (mVTripPlanItinerary.mo34628h()) {
                jVar.mo61678B(mVTripPlanItinerary.groupType.getValue());
            }
            if (mVTripPlanItinerary.mo34627g()) {
                jVar.mo61686J(mVTripPlanItinerary.groupKey);
            }
            if (mVTripPlanItinerary.mo34636p()) {
                jVar.mo61678B(mVTripPlanItinerary.legs.size());
                for (MVTripPlanLeg X0 : mVTripPlanItinerary.legs) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTripPlanItinerary.mo34632k()) {
                jVar.mo61708u(mVTripPlanItinerary.hasPrev);
            }
            if (mVTripPlanItinerary.mo34631j()) {
                jVar.mo61708u(mVTripPlanItinerary.hasNext);
            }
            if (mVTripPlanItinerary.mo34637q()) {
                jVar.mo61708u(mVTripPlanItinerary.relevantForRealtime);
            }
            if (mVTripPlanItinerary.mo34634m()) {
                jVar.mo61708u(mVTripPlanItinerary.isAccessible);
            }
            if (mVTripPlanItinerary.mo34635o()) {
                mVTripPlanItinerary.itineraryFare.mo25202X0(jVar);
            }
            if (mVTripPlanItinerary.mo34642u()) {
                jVar.mo61710w(mVTripPlanItinerary.weight);
            }
            if (mVTripPlanItinerary.mo34633l()) {
                jVar.mo61708u(mVTripPlanItinerary.hasSecondaryArrivalItinerary);
            }
            if (mVTripPlanItinerary.mo34626f()) {
                mVTripPlanItinerary.emissionLevel.mo25202X0(jVar);
            }
            if (mVTripPlanItinerary.mo34639s()) {
                jVar.mo61686J(mVTripPlanItinerary.sectionName);
            }
            if (mVTripPlanItinerary.mo34640t()) {
                jVar.mo61686J(mVTripPlanItinerary.serverContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanItinerary mVTripPlanItinerary = (MVTripPlanItinerary) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(15);
            if (T.get(0)) {
                mVTripPlanItinerary.guid = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTripPlanItinerary.sectionId = jVar.mo61696i();
                mVTripPlanItinerary.mo34621E();
            }
            if (T.get(2)) {
                mVTripPlanItinerary.groupType = MVGroupType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVTripPlanItinerary.groupKey = jVar.mo61704q();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVTripPlanItinerary.legs = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTripPlanLeg mVTripPlanLeg = new MVTripPlanLeg();
                    mVTripPlanLeg.mo25201C1(jVar);
                    mVTripPlanItinerary.legs.add(mVTripPlanLeg);
                }
            }
            if (T.get(5)) {
                mVTripPlanItinerary.hasPrev = jVar.mo61690c();
                mVTripPlanItinerary.mo34644w();
            }
            if (T.get(6)) {
                mVTripPlanItinerary.hasNext = jVar.mo61690c();
                mVTripPlanItinerary.mo34643v();
            }
            if (T.get(7)) {
                mVTripPlanItinerary.relevantForRealtime = jVar.mo61690c();
                mVTripPlanItinerary.mo34620D();
            }
            if (T.get(8)) {
                mVTripPlanItinerary.isAccessible = jVar.mo61690c();
                mVTripPlanItinerary.mo34619A();
            }
            if (T.get(9)) {
                MVItineraryFare mVItineraryFare = new MVItineraryFare();
                mVTripPlanItinerary.itineraryFare = mVItineraryFare;
                mVItineraryFare.mo25201C1(jVar);
            }
            if (T.get(10)) {
                mVTripPlanItinerary.weight = jVar.mo61692e();
                mVTripPlanItinerary.mo34622F();
            }
            if (T.get(11)) {
                mVTripPlanItinerary.hasSecondaryArrivalItinerary = jVar.mo61690c();
                mVTripPlanItinerary.mo34645y();
            }
            if (T.get(12)) {
                MVEmissionLevel mVEmissionLevel = new MVEmissionLevel();
                mVTripPlanItinerary.emissionLevel = mVEmissionLevel;
                mVEmissionLevel.mo25201C1(jVar);
            }
            if (T.get(13)) {
                mVTripPlanItinerary.sectionName = jVar.mo61704q();
            }
            if (T.get(14)) {
                mVTripPlanItinerary.serverContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary$d */
    public static class C11654d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11653c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanItinerary");
        HashMap hashMap = new HashMap();
        f30109q = hashMap;
        hashMap.put(C25239c.class, new C11652b());
        hashMap.put(C25240d.class, new C11654d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GUID, new FieldMetaData("guid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SECTION_ID, new FieldMetaData("sectionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.GROUP_TYPE, new FieldMetaData("groupType", (byte) 3, new EnumMetaData(MVGroupType.class)));
        enumMap.put(_Fields.GROUP_KEY, new FieldMetaData("groupKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEGS, new FieldMetaData("legs", (byte) 3, new ListMetaData(new StructMetaData(MVTripPlanLeg.class))));
        enumMap.put(_Fields.HAS_PREV, new FieldMetaData("hasPrev", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.HAS_NEXT, new FieldMetaData("hasNext", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.RELEVANT_FOR_REALTIME, new FieldMetaData("relevantForRealtime", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_ACCESSIBLE, new FieldMetaData("isAccessible", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.ITINERARY_FARE, new FieldMetaData("itineraryFare", (byte) 2, new StructMetaData(MVItineraryFare.class)));
        enumMap.put(_Fields.WEIGHT, new FieldMetaData("weight", (byte) 2, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.HAS_SECONDARY_ARRIVAL_ITINERARY, new FieldMetaData("hasSecondaryArrivalItinerary", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.EMISSION_LEVEL, new FieldMetaData("emissionLevel", (byte) 2, new StructMetaData(MVEmissionLevel.class)));
        enumMap.put(_Fields.SECTION_NAME, new FieldMetaData("sectionName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SERVER_CONTEXT, new FieldMetaData("serverContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30110r = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanItinerary.class, unmodifiableMap);
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
    public final void mo34619A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f30109q.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo34620D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: E */
    public final void mo34621E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: F */
    public final void mo34622F() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30109q.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34623a(MVTripPlanItinerary mVTripPlanItinerary) {
        if (mVTripPlanItinerary == null) {
            return false;
        }
        boolean i = mo34630i();
        boolean i2 = mVTripPlanItinerary.mo34630i();
        if (((i || i2) && (!i || !i2 || !this.guid.equals(mVTripPlanItinerary.guid))) || this.sectionId != mVTripPlanItinerary.sectionId) {
            return false;
        }
        boolean h = mo34628h();
        boolean h2 = mVTripPlanItinerary.mo34628h();
        if ((h || h2) && (!h || !h2 || !this.groupType.equals(mVTripPlanItinerary.groupType))) {
            return false;
        }
        boolean g = mo34627g();
        boolean g2 = mVTripPlanItinerary.mo34627g();
        if ((g || g2) && (!g || !g2 || !this.groupKey.equals(mVTripPlanItinerary.groupKey))) {
            return false;
        }
        boolean p = mo34636p();
        boolean p2 = mVTripPlanItinerary.mo34636p();
        if (((p || p2) && (!p || !p2 || !this.legs.equals(mVTripPlanItinerary.legs))) || this.hasPrev != mVTripPlanItinerary.hasPrev || this.hasNext != mVTripPlanItinerary.hasNext || this.relevantForRealtime != mVTripPlanItinerary.relevantForRealtime || this.isAccessible != mVTripPlanItinerary.isAccessible) {
            return false;
        }
        boolean o = mo34635o();
        boolean o2 = mVTripPlanItinerary.mo34635o();
        if ((o || o2) && (!o || !o2 || !this.itineraryFare.mo27233a(mVTripPlanItinerary.itineraryFare))) {
            return false;
        }
        boolean u = mo34642u();
        boolean u2 = mVTripPlanItinerary.mo34642u();
        if (((u || u2) && (!u || !u2 || this.weight != mVTripPlanItinerary.weight)) || this.hasSecondaryArrivalItinerary != mVTripPlanItinerary.hasSecondaryArrivalItinerary) {
            return false;
        }
        boolean f = mo34626f();
        boolean f2 = mVTripPlanItinerary.mo34626f();
        if ((f || f2) && (!f || !f2 || !this.emissionLevel.mo34300a(mVTripPlanItinerary.emissionLevel))) {
            return false;
        }
        boolean s = mo34639s();
        boolean s2 = mVTripPlanItinerary.mo34639s();
        if ((s || s2) && (!s || !s2 || !this.sectionName.equals(mVTripPlanItinerary.sectionName))) {
            return false;
        }
        boolean t = mo34640t();
        boolean t2 = mVTripPlanItinerary.mo34640t();
        if (!t && !t2) {
            return true;
        }
        if (!t || !t2 || !this.serverContext.equals(mVTripPlanItinerary.serverContext)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanItinerary mVTripPlanItinerary = (MVTripPlanItinerary) obj;
        if (!getClass().equals(mVTripPlanItinerary.getClass())) {
            return getClass().getName().compareTo(mVTripPlanItinerary.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34630i()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34630i()));
        if (compareTo2 != 0 || ((mo34630i() && (compareTo2 = this.guid.compareTo(mVTripPlanItinerary.guid)) != 0) || (compareTo2 = Boolean.valueOf(mo34638r()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34638r()))) != 0 || ((mo34638r() && (compareTo2 = C25082a.m62839c(this.sectionId, mVTripPlanItinerary.sectionId)) != 0) || (compareTo2 = Boolean.valueOf(mo34628h()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34628h()))) != 0 || ((mo34628h() && (compareTo2 = this.groupType.compareTo(mVTripPlanItinerary.groupType)) != 0) || (compareTo2 = Boolean.valueOf(mo34627g()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34627g()))) != 0 || ((mo34627g() && (compareTo2 = this.groupKey.compareTo(mVTripPlanItinerary.groupKey)) != 0) || (compareTo2 = Boolean.valueOf(mo34636p()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34636p()))) != 0 || ((mo34636p() && (compareTo2 = C25082a.m62844h(this.legs, mVTripPlanItinerary.legs)) != 0) || (compareTo2 = Boolean.valueOf(mo34632k()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34632k()))) != 0 || ((mo34632k() && (compareTo2 = C25082a.m62848l(this.hasPrev, mVTripPlanItinerary.hasPrev)) != 0) || (compareTo2 = Boolean.valueOf(mo34631j()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34631j()))) != 0 || ((mo34631j() && (compareTo2 = C25082a.m62848l(this.hasNext, mVTripPlanItinerary.hasNext)) != 0) || (compareTo2 = Boolean.valueOf(mo34637q()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34637q()))) != 0 || ((mo34637q() && (compareTo2 = C25082a.m62848l(this.relevantForRealtime, mVTripPlanItinerary.relevantForRealtime)) != 0) || (compareTo2 = Boolean.valueOf(mo34634m()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34634m()))) != 0 || ((mo34634m() && (compareTo2 = C25082a.m62848l(this.isAccessible, mVTripPlanItinerary.isAccessible)) != 0) || (compareTo2 = Boolean.valueOf(mo34635o()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34635o()))) != 0 || ((mo34635o() && (compareTo2 = this.itineraryFare.compareTo(mVTripPlanItinerary.itineraryFare)) != 0) || (compareTo2 = Boolean.valueOf(mo34642u()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34642u()))) != 0 || ((mo34642u() && (compareTo2 = C25082a.m62838b(this.weight, mVTripPlanItinerary.weight)) != 0) || (compareTo2 = Boolean.valueOf(mo34633l()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34633l()))) != 0 || ((mo34633l() && (compareTo2 = C25082a.m62848l(this.hasSecondaryArrivalItinerary, mVTripPlanItinerary.hasSecondaryArrivalItinerary)) != 0) || (compareTo2 = Boolean.valueOf(mo34626f()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34626f()))) != 0 || ((mo34626f() && (compareTo2 = this.emissionLevel.compareTo(mVTripPlanItinerary.emissionLevel)) != 0) || (compareTo2 = Boolean.valueOf(mo34639s()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34639s()))) != 0 || ((mo34639s() && (compareTo2 = this.sectionName.compareTo(mVTripPlanItinerary.sectionName)) != 0) || (compareTo2 = Boolean.valueOf(mo34640t()).compareTo(Boolean.valueOf(mVTripPlanItinerary.mo34640t()))) != 0))))))))))))))) {
            return compareTo2;
        }
        if (!mo34640t() || (compareTo = this.serverContext.compareTo(mVTripPlanItinerary.serverContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTripPlanItinerary)) {
            return mo34623a((MVTripPlanItinerary) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34626f() {
        return this.emissionLevel != null;
    }

    /* renamed from: g */
    public final boolean mo34627g() {
        return this.groupKey != null;
    }

    /* renamed from: h */
    public final boolean mo34628h() {
        return this.groupType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34630i() {
        return this.guid != null;
    }

    /* renamed from: j */
    public final boolean mo34631j() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: k */
    public final boolean mo34632k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final boolean mo34633l() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: m */
    public final boolean mo34634m() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: o */
    public final boolean mo34635o() {
        return this.itineraryFare != null;
    }

    /* renamed from: p */
    public final boolean mo34636p() {
        return this.legs != null;
    }

    /* renamed from: q */
    public final boolean mo34637q() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: r */
    public final boolean mo34638r() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: s */
    public final boolean mo34639s() {
        return this.sectionName != null;
    }

    /* renamed from: t */
    public final boolean mo34640t() {
        return this.serverContext != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanItinerary(", "guid:");
        String str = this.guid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("sectionId:");
        C0016g.m42z(n, this.sectionId, ", ", "groupType:");
        MVGroupType mVGroupType = this.groupType;
        if (mVGroupType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGroupType);
        }
        n.append(", ");
        n.append("groupKey:");
        String str2 = this.groupKey;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("legs:");
        List<MVTripPlanLeg> list = this.legs;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("hasPrev:");
        C13555b.m33977q(n, this.hasPrev, ", ", "hasNext:");
        C13555b.m33977q(n, this.hasNext, ", ", "relevantForRealtime:");
        C13555b.m33977q(n, this.relevantForRealtime, ", ", "isAccessible:");
        n.append(this.isAccessible);
        if (mo34635o()) {
            n.append(", ");
            n.append("itineraryFare:");
            MVItineraryFare mVItineraryFare = this.itineraryFare;
            if (mVItineraryFare == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVItineraryFare);
            }
        }
        if (mo34642u()) {
            n.append(", ");
            n.append("weight:");
            n.append(this.weight);
        }
        n.append(", ");
        n.append("hasSecondaryArrivalItinerary:");
        n.append(this.hasSecondaryArrivalItinerary);
        if (mo34626f()) {
            n.append(", ");
            n.append("emissionLevel:");
            MVEmissionLevel mVEmissionLevel = this.emissionLevel;
            if (mVEmissionLevel == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVEmissionLevel);
            }
        }
        if (mo34639s()) {
            n.append(", ");
            n.append("sectionName:");
            String str3 = this.sectionName;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo34640t()) {
            n.append(", ");
            n.append("serverContext:");
            String str4 = this.serverContext;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo34642u() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: v */
    public final void mo34643v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: w */
    public final void mo34644w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: y */
    public final void mo34645y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }
}
