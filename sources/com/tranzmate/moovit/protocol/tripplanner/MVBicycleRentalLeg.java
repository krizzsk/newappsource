package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
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

public class MVBicycleRentalLeg implements TBase<MVBicycleRentalLeg, _Fields>, Serializable, Cloneable, Comparable<MVBicycleRentalLeg> {

    /* renamed from: b */
    public static final C25113c f29829b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29830c = new C25113c("journey", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29831d = new C25113c("shape", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29832e = new C25113c("cyclingInstructions", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f29833f = new C25113c("originNearbyBicycleStopIds", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f29834g = new C25113c("destNearbyBicycleStopIds", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f29835h = new C25113c("originStopLocation", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f29836i = new C25113c("destinationStopLocation", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f29837j = new C25113c("integrationItem", (byte) 12, 9);

    /* renamed from: k */
    public static final HashMap f29838k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f29839l;
    public List<MVWalkingInstruction> cyclingInstructions;
    public List<Integer> destNearbyBicycleStopIds;
    public MVLocationDescriptor destinationStopLocation;
    public MVMicroMobilityIntegrationItem integrationItem;
    public MVJourney journey;
    private _Fields[] optionals = {_Fields.ORIGIN_STOP_LOCATION, _Fields.DESTINATION_STOP_LOCATION, _Fields.INTEGRATION_ITEM};
    public List<Integer> originNearbyBicycleStopIds;
    public MVLocationDescriptor originStopLocation;
    public MVTripPlanShape shape;
    public MVTime time;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        JOURNEY(2, "journey"),
        SHAPE(3, "shape"),
        CYCLING_INSTRUCTIONS(4, "cyclingInstructions"),
        ORIGIN_NEARBY_BICYCLE_STOP_IDS(5, "originNearbyBicycleStopIds"),
        DEST_NEARBY_BICYCLE_STOP_IDS(6, "destNearbyBicycleStopIds"),
        ORIGIN_STOP_LOCATION(7, "originStopLocation"),
        DESTINATION_STOP_LOCATION(8, "destinationStopLocation"),
        INTEGRATION_ITEM(9, "integrationItem");
        
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
                    return CYCLING_INSTRUCTIONS;
                case 5:
                    return ORIGIN_NEARBY_BICYCLE_STOP_IDS;
                case 6:
                    return DEST_NEARBY_BICYCLE_STOP_IDS;
                case 7:
                    return ORIGIN_STOP_LOCATION;
                case 8:
                    return DESTINATION_STOP_LOCATION;
                case 9:
                    return INTEGRATION_ITEM;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVBicycleRentalLeg$a */
    public static class C11501a extends C25239c<MVBicycleRentalLeg> {
        public C11501a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBicycleRentalLeg mVBicycleRentalLeg = (MVBicycleRentalLeg) tBase;
            mVBicycleRentalLeg.mo34171p();
            C25113c cVar = MVBicycleRentalLeg.f29829b;
            gVar.mo61687K();
            if (mVBicycleRentalLeg.time != null) {
                gVar.mo61711x(MVBicycleRentalLeg.f29829b);
                mVBicycleRentalLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBicycleRentalLeg.journey != null) {
                gVar.mo61711x(MVBicycleRentalLeg.f29830c);
                mVBicycleRentalLeg.journey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBicycleRentalLeg.shape != null) {
                gVar.mo61711x(MVBicycleRentalLeg.f29831d);
                mVBicycleRentalLeg.shape.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBicycleRentalLeg.cyclingInstructions != null) {
                gVar.mo61711x(MVBicycleRentalLeg.f29832e);
                gVar.mo61680D(new C25119e((byte) 12, mVBicycleRentalLeg.cyclingInstructions.size()));
                for (MVWalkingInstruction X0 : mVBicycleRentalLeg.cyclingInstructions) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVBicycleRentalLeg.originNearbyBicycleStopIds != null) {
                gVar.mo61711x(MVBicycleRentalLeg.f29833f);
                gVar.mo61680D(new C25119e((byte) 8, mVBicycleRentalLeg.originNearbyBicycleStopIds.size()));
                for (Integer intValue : mVBicycleRentalLeg.originNearbyBicycleStopIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVBicycleRentalLeg.destNearbyBicycleStopIds != null) {
                gVar.mo61711x(MVBicycleRentalLeg.f29834g);
                gVar.mo61680D(new C25119e((byte) 8, mVBicycleRentalLeg.destNearbyBicycleStopIds.size()));
                for (Integer intValue2 : mVBicycleRentalLeg.destNearbyBicycleStopIds) {
                    gVar.mo61678B(intValue2.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVBicycleRentalLeg.originStopLocation != null && mVBicycleRentalLeg.mo34168l()) {
                gVar.mo61711x(MVBicycleRentalLeg.f29835h);
                mVBicycleRentalLeg.originStopLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBicycleRentalLeg.destinationStopLocation != null && mVBicycleRentalLeg.mo34163h()) {
                gVar.mo61711x(MVBicycleRentalLeg.f29836i);
                mVBicycleRentalLeg.destinationStopLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBicycleRentalLeg.integrationItem != null && mVBicycleRentalLeg.mo34165i()) {
                gVar.mo61711x(MVBicycleRentalLeg.f29837j);
                mVBicycleRentalLeg.integrationItem.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBicycleRentalLeg mVBicycleRentalLeg = (MVBicycleRentalLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBicycleRentalLeg.mo34171p();
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
                            mVBicycleRentalLeg.time = mVTime;
                            mVTime.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVJourney mVJourney = new MVJourney();
                            mVBicycleRentalLeg.journey = mVJourney;
                            mVJourney.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                            mVBicycleRentalLeg.shape = mVTripPlanShape;
                            mVTripPlanShape.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVBicycleRentalLeg.cyclingInstructions = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                                mVWalkingInstruction.mo25201C1(gVar);
                                mVBicycleRentalLeg.cyclingInstructions.add(mVWalkingInstruction);
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
                            C25119e k2 = gVar.mo61698k();
                            mVBicycleRentalLeg.originNearbyBicycleStopIds = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVBicycleRentalLeg.originNearbyBicycleStopIds, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVBicycleRentalLeg.destNearbyBicycleStopIds = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVBicycleRentalLeg.destNearbyBicycleStopIds, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                            mVBicycleRentalLeg.originStopLocation = mVLocationDescriptor;
                            mVLocationDescriptor.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                            mVBicycleRentalLeg.destinationStopLocation = mVLocationDescriptor2;
                            mVLocationDescriptor2.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = new MVMicroMobilityIntegrationItem();
                            mVBicycleRentalLeg.integrationItem = mVMicroMobilityIntegrationItem;
                            mVMicroMobilityIntegrationItem.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVBicycleRentalLeg$b */
    public static class C11502b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11501a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVBicycleRentalLeg$c */
    public static class C11503c extends C25240d<MVBicycleRentalLeg> {
        public C11503c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBicycleRentalLeg mVBicycleRentalLeg = (MVBicycleRentalLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBicycleRentalLeg.mo34170o()) {
                bitSet.set(0);
            }
            if (mVBicycleRentalLeg.mo34166j()) {
                bitSet.set(1);
            }
            if (mVBicycleRentalLeg.mo34169m()) {
                bitSet.set(2);
            }
            if (mVBicycleRentalLeg.mo34161f()) {
                bitSet.set(3);
            }
            if (mVBicycleRentalLeg.mo34167k()) {
                bitSet.set(4);
            }
            if (mVBicycleRentalLeg.mo34162g()) {
                bitSet.set(5);
            }
            if (mVBicycleRentalLeg.mo34168l()) {
                bitSet.set(6);
            }
            if (mVBicycleRentalLeg.mo34163h()) {
                bitSet.set(7);
            }
            if (mVBicycleRentalLeg.mo34165i()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVBicycleRentalLeg.mo34170o()) {
                mVBicycleRentalLeg.time.mo25202X0(jVar);
            }
            if (mVBicycleRentalLeg.mo34166j()) {
                mVBicycleRentalLeg.journey.mo25202X0(jVar);
            }
            if (mVBicycleRentalLeg.mo34169m()) {
                mVBicycleRentalLeg.shape.mo25202X0(jVar);
            }
            if (mVBicycleRentalLeg.mo34161f()) {
                jVar.mo61678B(mVBicycleRentalLeg.cyclingInstructions.size());
                for (MVWalkingInstruction X0 : mVBicycleRentalLeg.cyclingInstructions) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVBicycleRentalLeg.mo34167k()) {
                jVar.mo61678B(mVBicycleRentalLeg.originNearbyBicycleStopIds.size());
                for (Integer intValue : mVBicycleRentalLeg.originNearbyBicycleStopIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVBicycleRentalLeg.mo34162g()) {
                jVar.mo61678B(mVBicycleRentalLeg.destNearbyBicycleStopIds.size());
                for (Integer intValue2 : mVBicycleRentalLeg.destNearbyBicycleStopIds) {
                    jVar.mo61678B(intValue2.intValue());
                }
            }
            if (mVBicycleRentalLeg.mo34168l()) {
                mVBicycleRentalLeg.originStopLocation.mo25202X0(jVar);
            }
            if (mVBicycleRentalLeg.mo34163h()) {
                mVBicycleRentalLeg.destinationStopLocation.mo25202X0(jVar);
            }
            if (mVBicycleRentalLeg.mo34165i()) {
                mVBicycleRentalLeg.integrationItem.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBicycleRentalLeg mVBicycleRentalLeg = (MVBicycleRentalLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVBicycleRentalLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVJourney mVJourney = new MVJourney();
                mVBicycleRentalLeg.journey = mVJourney;
                mVJourney.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                mVBicycleRentalLeg.shape = mVTripPlanShape;
                mVTripPlanShape.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVBicycleRentalLeg.cyclingInstructions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                    mVWalkingInstruction.mo25201C1(jVar);
                    mVBicycleRentalLeg.cyclingInstructions.add(mVWalkingInstruction);
                }
            }
            if (T.get(4)) {
                int i3 = jVar.mo61696i();
                mVBicycleRentalLeg.originNearbyBicycleStopIds = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4 = C13437d.m33701f(jVar.mo61696i(), mVBicycleRentalLeg.originNearbyBicycleStopIds, i4, 1)) {
                }
            }
            if (T.get(5)) {
                int i5 = jVar.mo61696i();
                mVBicycleRentalLeg.destNearbyBicycleStopIds = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6 = C13437d.m33701f(jVar.mo61696i(), mVBicycleRentalLeg.destNearbyBicycleStopIds, i6, 1)) {
                }
            }
            if (T.get(6)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVBicycleRentalLeg.originStopLocation = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(7)) {
                MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                mVBicycleRentalLeg.destinationStopLocation = mVLocationDescriptor2;
                mVLocationDescriptor2.mo25201C1(jVar);
            }
            if (T.get(8)) {
                MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = new MVMicroMobilityIntegrationItem();
                mVBicycleRentalLeg.integrationItem = mVMicroMobilityIntegrationItem;
                mVMicroMobilityIntegrationItem.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVBicycleRentalLeg$d */
    public static class C11504d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11503c(0);
        }
    }

    static {
        new C17394d0("MVBicycleRentalLeg");
        HashMap hashMap = new HashMap();
        f29838k = hashMap;
        hashMap.put(C25239c.class, new C11502b());
        hashMap.put(C25240d.class, new C11504d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.JOURNEY, new FieldMetaData("journey", (byte) 3, new StructMetaData(MVJourney.class)));
        enumMap.put(_Fields.SHAPE, new FieldMetaData("shape", (byte) 3, new StructMetaData(MVTripPlanShape.class)));
        enumMap.put(_Fields.CYCLING_INSTRUCTIONS, new FieldMetaData("cyclingInstructions", (byte) 3, new ListMetaData(new StructMetaData(MVWalkingInstruction.class))));
        enumMap.put(_Fields.ORIGIN_NEARBY_BICYCLE_STOP_IDS, new FieldMetaData("originNearbyBicycleStopIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.DEST_NEARBY_BICYCLE_STOP_IDS, new FieldMetaData("destNearbyBicycleStopIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.ORIGIN_STOP_LOCATION, new FieldMetaData("originStopLocation", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.DESTINATION_STOP_LOCATION, new FieldMetaData("destinationStopLocation", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.INTEGRATION_ITEM, new FieldMetaData("integrationItem", (byte) 2, new StructMetaData(MVMicroMobilityIntegrationItem.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29839l = unmodifiableMap;
        FieldMetaData.m61947a(MVBicycleRentalLeg.class, unmodifiableMap);
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
        ((C25238b) f29838k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29838k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBicycleRentalLeg mVBicycleRentalLeg = (MVBicycleRentalLeg) obj;
        if (!getClass().equals(mVBicycleRentalLeg.getClass())) {
            return getClass().getName().compareTo(mVBicycleRentalLeg.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34170o()).compareTo(Boolean.valueOf(mVBicycleRentalLeg.mo34170o()));
        if (compareTo2 != 0 || ((mo34170o() && (compareTo2 = this.time.compareTo(mVBicycleRentalLeg.time)) != 0) || (compareTo2 = Boolean.valueOf(mo34166j()).compareTo(Boolean.valueOf(mVBicycleRentalLeg.mo34166j()))) != 0 || ((mo34166j() && (compareTo2 = this.journey.compareTo(mVBicycleRentalLeg.journey)) != 0) || (compareTo2 = Boolean.valueOf(mo34169m()).compareTo(Boolean.valueOf(mVBicycleRentalLeg.mo34169m()))) != 0 || ((mo34169m() && (compareTo2 = this.shape.compareTo(mVBicycleRentalLeg.shape)) != 0) || (compareTo2 = Boolean.valueOf(mo34161f()).compareTo(Boolean.valueOf(mVBicycleRentalLeg.mo34161f()))) != 0 || ((mo34161f() && (compareTo2 = C25082a.m62844h(this.cyclingInstructions, mVBicycleRentalLeg.cyclingInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo34167k()).compareTo(Boolean.valueOf(mVBicycleRentalLeg.mo34167k()))) != 0 || ((mo34167k() && (compareTo2 = C25082a.m62844h(this.originNearbyBicycleStopIds, mVBicycleRentalLeg.originNearbyBicycleStopIds)) != 0) || (compareTo2 = Boolean.valueOf(mo34162g()).compareTo(Boolean.valueOf(mVBicycleRentalLeg.mo34162g()))) != 0 || ((mo34162g() && (compareTo2 = C25082a.m62844h(this.destNearbyBicycleStopIds, mVBicycleRentalLeg.destNearbyBicycleStopIds)) != 0) || (compareTo2 = Boolean.valueOf(mo34168l()).compareTo(Boolean.valueOf(mVBicycleRentalLeg.mo34168l()))) != 0 || ((mo34168l() && (compareTo2 = this.originStopLocation.compareTo(mVBicycleRentalLeg.originStopLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo34163h()).compareTo(Boolean.valueOf(mVBicycleRentalLeg.mo34163h()))) != 0 || ((mo34163h() && (compareTo2 = this.destinationStopLocation.compareTo(mVBicycleRentalLeg.destinationStopLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo34165i()).compareTo(Boolean.valueOf(mVBicycleRentalLeg.mo34165i()))) != 0))))))))) {
            return compareTo2;
        }
        if (!mo34165i() || (compareTo = this.integrationItem.compareTo(mVBicycleRentalLeg.integrationItem)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBicycleRentalLeg)) {
            return false;
        }
        MVBicycleRentalLeg mVBicycleRentalLeg = (MVBicycleRentalLeg) obj;
        boolean o = mo34170o();
        boolean o2 = mVBicycleRentalLeg.mo34170o();
        if ((o || o2) && (!o || !o2 || !this.time.mo34573a(mVBicycleRentalLeg.time))) {
            return false;
        }
        boolean j = mo34166j();
        boolean j2 = mVBicycleRentalLeg.mo34166j();
        if ((j || j2) && (!j || !j2 || !this.journey.mo34347a(mVBicycleRentalLeg.journey))) {
            return false;
        }
        boolean m = mo34169m();
        boolean m2 = mVBicycleRentalLeg.mo34169m();
        if ((m || m2) && (!m || !m2 || !this.shape.mo34748a(mVBicycleRentalLeg.shape))) {
            return false;
        }
        boolean f = mo34161f();
        boolean f2 = mVBicycleRentalLeg.mo34161f();
        if ((f || f2) && (!f || !f2 || !this.cyclingInstructions.equals(mVBicycleRentalLeg.cyclingInstructions))) {
            return false;
        }
        boolean k = mo34167k();
        boolean k2 = mVBicycleRentalLeg.mo34167k();
        if ((k || k2) && (!k || !k2 || !this.originNearbyBicycleStopIds.equals(mVBicycleRentalLeg.originNearbyBicycleStopIds))) {
            return false;
        }
        boolean g = mo34162g();
        boolean g2 = mVBicycleRentalLeg.mo34162g();
        if ((g || g2) && (!g || !g2 || !this.destNearbyBicycleStopIds.equals(mVBicycleRentalLeg.destNearbyBicycleStopIds))) {
            return false;
        }
        boolean l = mo34168l();
        boolean l2 = mVBicycleRentalLeg.mo34168l();
        if ((l || l2) && (!l || !l2 || !this.originStopLocation.mo26317a(mVBicycleRentalLeg.originStopLocation))) {
            return false;
        }
        boolean h = mo34163h();
        boolean h2 = mVBicycleRentalLeg.mo34163h();
        if ((h || h2) && (!h || !h2 || !this.destinationStopLocation.mo26317a(mVBicycleRentalLeg.destinationStopLocation))) {
            return false;
        }
        boolean i = mo34165i();
        boolean i2 = mVBicycleRentalLeg.mo34165i();
        if ((i || i2) && (!i || !i2 || !this.integrationItem.mo34395a(mVBicycleRentalLeg.integrationItem))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34161f() {
        return this.cyclingInstructions != null;
    }

    /* renamed from: g */
    public final boolean mo34162g() {
        return this.destNearbyBicycleStopIds != null;
    }

    /* renamed from: h */
    public final boolean mo34163h() {
        return this.destinationStopLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34165i() {
        return this.integrationItem != null;
    }

    /* renamed from: j */
    public final boolean mo34166j() {
        return this.journey != null;
    }

    /* renamed from: k */
    public final boolean mo34167k() {
        return this.originNearbyBicycleStopIds != null;
    }

    /* renamed from: l */
    public final boolean mo34168l() {
        return this.originStopLocation != null;
    }

    /* renamed from: m */
    public final boolean mo34169m() {
        return this.shape != null;
    }

    /* renamed from: o */
    public final boolean mo34170o() {
        return this.time != null;
    }

    /* renamed from: p */
    public final void mo34171p() throws TException {
        MVJourney mVJourney = this.journey;
        if (mVJourney != null) {
            mVJourney.mo34352h();
        }
        MVLocationDescriptor mVLocationDescriptor = this.originStopLocation;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor2 = this.destinationStopLocation;
        if (mVLocationDescriptor2 != null) {
            mVLocationDescriptor2.mo26333s();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBicycleRentalLeg(", "time:");
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
        n.append(", ");
        n.append("cyclingInstructions:");
        List<MVWalkingInstruction> list = this.cyclingInstructions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("originNearbyBicycleStopIds:");
        List<Integer> list2 = this.originNearbyBicycleStopIds;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("destNearbyBicycleStopIds:");
        List<Integer> list3 = this.destNearbyBicycleStopIds;
        if (list3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list3);
        }
        if (mo34168l()) {
            n.append(", ");
            n.append("originStopLocation:");
            MVLocationDescriptor mVLocationDescriptor = this.originStopLocation;
            if (mVLocationDescriptor == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationDescriptor);
            }
        }
        if (mo34163h()) {
            n.append(", ");
            n.append("destinationStopLocation:");
            MVLocationDescriptor mVLocationDescriptor2 = this.destinationStopLocation;
            if (mVLocationDescriptor2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationDescriptor2);
            }
        }
        if (mo34165i()) {
            n.append(", ");
            n.append("integrationItem:");
            MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = this.integrationItem;
            if (mVMicroMobilityIntegrationItem == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMicroMobilityIntegrationItem);
            }
        }
        n.append(")");
        return n.toString();
    }
}
