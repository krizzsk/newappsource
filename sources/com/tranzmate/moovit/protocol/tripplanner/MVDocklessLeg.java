package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVExternalAppData;
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

public class MVDocklessLeg implements TBase<MVDocklessLeg, _Fields>, Serializable, Cloneable, Comparable<MVDocklessLeg> {

    /* renamed from: b */
    public static final C25113c f29913b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29914c = new C25113c("journey", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29915d = new C25113c("shape", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29916e = new C25113c("instructions", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f29917f = new C25113c("info", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f29918g = new C25113c("deepLink", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f29919h = new C25113c("serviceId", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f29920i = new C25113c("integrationItem", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f29921j = new C25113c("shouldSkipItinerary", (byte) 2, 9);

    /* renamed from: k */
    public static final HashMap f29922k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f29923l;
    private byte __isset_bitfield = 0;
    public MVExternalAppData deepLink;
    public MVDocklessInfo info;
    public List<MVWalkingInstruction> instructions;
    public MVMicroMobilityIntegrationItem integrationItem;
    public MVJourney journey;
    private _Fields[] optionals = {_Fields.INTEGRATION_ITEM, _Fields.SHOULD_SKIP_ITINERARY};
    public int serviceId;
    public MVTripPlanShape shape;
    public boolean shouldSkipItinerary;
    public MVTime time;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        JOURNEY(2, "journey"),
        SHAPE(3, "shape"),
        INSTRUCTIONS(4, "instructions"),
        INFO(5, "info"),
        DEEP_LINK(6, "deepLink"),
        SERVICE_ID(7, "serviceId"),
        INTEGRATION_ITEM(8, "integrationItem"),
        SHOULD_SKIP_ITINERARY(9, "shouldSkipItinerary");
        
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
                    return INSTRUCTIONS;
                case 5:
                    return INFO;
                case 6:
                    return DEEP_LINK;
                case 7:
                    return SERVICE_ID;
                case 8:
                    return INTEGRATION_ITEM;
                case 9:
                    return SHOULD_SKIP_ITINERARY;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg$a */
    public static class C11530a extends C25239c<MVDocklessLeg> {
        public C11530a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessLeg mVDocklessLeg = (MVDocklessLeg) tBase;
            mVDocklessLeg.mo34297r();
            C25113c cVar = MVDocklessLeg.f29913b;
            gVar.mo61687K();
            if (mVDocklessLeg.time != null) {
                gVar.mo61711x(MVDocklessLeg.f29913b);
                mVDocklessLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessLeg.journey != null) {
                gVar.mo61711x(MVDocklessLeg.f29914c);
                mVDocklessLeg.journey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessLeg.shape != null) {
                gVar.mo61711x(MVDocklessLeg.f29915d);
                mVDocklessLeg.shape.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessLeg.instructions != null) {
                gVar.mo61711x(MVDocklessLeg.f29916e);
                gVar.mo61680D(new C25119e((byte) 12, mVDocklessLeg.instructions.size()));
                for (MVWalkingInstruction X0 : mVDocklessLeg.instructions) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVDocklessLeg.info != null) {
                gVar.mo61711x(MVDocklessLeg.f29917f);
                mVDocklessLeg.info.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessLeg.deepLink != null) {
                gVar.mo61711x(MVDocklessLeg.f29918g);
                mVDocklessLeg.deepLink.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDocklessLeg.f29919h);
            gVar.mo61678B(mVDocklessLeg.serviceId);
            gVar.mo61712y();
            if (mVDocklessLeg.integrationItem != null && mVDocklessLeg.mo34289i()) {
                gVar.mo61711x(MVDocklessLeg.f29920i);
                mVDocklessLeg.integrationItem.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessLeg.mo34293m()) {
                gVar.mo61711x(MVDocklessLeg.f29921j);
                gVar.mo61708u(mVDocklessLeg.shouldSkipItinerary);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessLeg mVDocklessLeg = (MVDocklessLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDocklessLeg.mo34297r();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTime mVTime = new MVTime();
                            mVDocklessLeg.time = mVTime;
                            mVTime.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVJourney mVJourney = new MVJourney();
                            mVDocklessLeg.journey = mVJourney;
                            mVJourney.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                            mVDocklessLeg.shape = mVTripPlanShape;
                            mVTripPlanShape.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVDocklessLeg.instructions = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                                mVWalkingInstruction.mo25201C1(gVar);
                                mVDocklessLeg.instructions.add(mVWalkingInstruction);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDocklessInfo mVDocklessInfo = new MVDocklessInfo();
                            mVDocklessLeg.info = mVDocklessInfo;
                            mVDocklessInfo.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVExternalAppData mVExternalAppData = new MVExternalAppData();
                            mVDocklessLeg.deepLink = mVExternalAppData;
                            mVExternalAppData.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessLeg.serviceId = gVar.mo61696i();
                            mVDocklessLeg.mo34295p();
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = new MVMicroMobilityIntegrationItem();
                            mVDocklessLeg.integrationItem = mVMicroMobilityIntegrationItem;
                            mVMicroMobilityIntegrationItem.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessLeg.shouldSkipItinerary = gVar.mo61690c();
                            mVDocklessLeg.mo34296q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg$b */
    public static class C11531b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11530a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg$c */
    public static class C11532c extends C25240d<MVDocklessLeg> {
        public C11532c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessLeg mVDocklessLeg = (MVDocklessLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDocklessLeg.mo34294o()) {
                bitSet.set(0);
            }
            if (mVDocklessLeg.mo34290j()) {
                bitSet.set(1);
            }
            if (mVDocklessLeg.mo34292l()) {
                bitSet.set(2);
            }
            if (mVDocklessLeg.mo34287h()) {
                bitSet.set(3);
            }
            if (mVDocklessLeg.mo34286g()) {
                bitSet.set(4);
            }
            if (mVDocklessLeg.mo34285f()) {
                bitSet.set(5);
            }
            if (mVDocklessLeg.mo34291k()) {
                bitSet.set(6);
            }
            if (mVDocklessLeg.mo34289i()) {
                bitSet.set(7);
            }
            if (mVDocklessLeg.mo34293m()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVDocklessLeg.mo34294o()) {
                mVDocklessLeg.time.mo25202X0(jVar);
            }
            if (mVDocklessLeg.mo34290j()) {
                mVDocklessLeg.journey.mo25202X0(jVar);
            }
            if (mVDocklessLeg.mo34292l()) {
                mVDocklessLeg.shape.mo25202X0(jVar);
            }
            if (mVDocklessLeg.mo34287h()) {
                jVar.mo61678B(mVDocklessLeg.instructions.size());
                for (MVWalkingInstruction X0 : mVDocklessLeg.instructions) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVDocklessLeg.mo34286g()) {
                mVDocklessLeg.info.mo25202X0(jVar);
            }
            if (mVDocklessLeg.mo34285f()) {
                mVDocklessLeg.deepLink.mo25202X0(jVar);
            }
            if (mVDocklessLeg.mo34291k()) {
                jVar.mo61678B(mVDocklessLeg.serviceId);
            }
            if (mVDocklessLeg.mo34289i()) {
                mVDocklessLeg.integrationItem.mo25202X0(jVar);
            }
            if (mVDocklessLeg.mo34293m()) {
                jVar.mo61708u(mVDocklessLeg.shouldSkipItinerary);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessLeg mVDocklessLeg = (MVDocklessLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVDocklessLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVJourney mVJourney = new MVJourney();
                mVDocklessLeg.journey = mVJourney;
                mVJourney.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                mVDocklessLeg.shape = mVTripPlanShape;
                mVTripPlanShape.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVDocklessLeg.instructions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                    mVWalkingInstruction.mo25201C1(jVar);
                    mVDocklessLeg.instructions.add(mVWalkingInstruction);
                }
            }
            if (T.get(4)) {
                MVDocklessInfo mVDocklessInfo = new MVDocklessInfo();
                mVDocklessLeg.info = mVDocklessInfo;
                mVDocklessInfo.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVExternalAppData mVExternalAppData = new MVExternalAppData();
                mVDocklessLeg.deepLink = mVExternalAppData;
                mVExternalAppData.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVDocklessLeg.serviceId = jVar.mo61696i();
                mVDocklessLeg.mo34295p();
            }
            if (T.get(7)) {
                MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = new MVMicroMobilityIntegrationItem();
                mVDocklessLeg.integrationItem = mVMicroMobilityIntegrationItem;
                mVMicroMobilityIntegrationItem.mo25201C1(jVar);
            }
            if (T.get(8)) {
                mVDocklessLeg.shouldSkipItinerary = jVar.mo61690c();
                mVDocklessLeg.mo34296q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg$d */
    public static class C11533d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11532c(0);
        }
    }

    static {
        new C17394d0("MVDocklessLeg");
        HashMap hashMap = new HashMap();
        f29922k = hashMap;
        hashMap.put(C25239c.class, new C11531b());
        hashMap.put(C25240d.class, new C11533d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.JOURNEY, new FieldMetaData("journey", (byte) 3, new StructMetaData(MVJourney.class)));
        enumMap.put(_Fields.SHAPE, new FieldMetaData("shape", (byte) 3, new StructMetaData(MVTripPlanShape.class)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 3, new ListMetaData(new StructMetaData(MVWalkingInstruction.class))));
        enumMap.put(_Fields.INFO, new FieldMetaData("info", (byte) 3, new StructMetaData(MVDocklessInfo.class)));
        enumMap.put(_Fields.DEEP_LINK, new FieldMetaData("deepLink", (byte) 3, new StructMetaData(MVExternalAppData.class)));
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.INTEGRATION_ITEM, new FieldMetaData("integrationItem", (byte) 2, new StructMetaData(MVMicroMobilityIntegrationItem.class)));
        enumMap.put(_Fields.SHOULD_SKIP_ITINERARY, new FieldMetaData("shouldSkipItinerary", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29923l = unmodifiableMap;
        FieldMetaData.m61947a(MVDocklessLeg.class, unmodifiableMap);
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
        ((C25238b) f29922k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29922k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVDocklessLeg mVDocklessLeg = (MVDocklessLeg) obj;
        if (!getClass().equals(mVDocklessLeg.getClass())) {
            return getClass().getName().compareTo(mVDocklessLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34294o()).compareTo(Boolean.valueOf(mVDocklessLeg.mo34294o()));
        if (compareTo != 0 || ((mo34294o() && (compareTo = this.time.compareTo(mVDocklessLeg.time)) != 0) || (compareTo = Boolean.valueOf(mo34290j()).compareTo(Boolean.valueOf(mVDocklessLeg.mo34290j()))) != 0 || ((mo34290j() && (compareTo = this.journey.compareTo(mVDocklessLeg.journey)) != 0) || (compareTo = Boolean.valueOf(mo34292l()).compareTo(Boolean.valueOf(mVDocklessLeg.mo34292l()))) != 0 || ((mo34292l() && (compareTo = this.shape.compareTo(mVDocklessLeg.shape)) != 0) || (compareTo = Boolean.valueOf(mo34287h()).compareTo(Boolean.valueOf(mVDocklessLeg.mo34287h()))) != 0 || ((mo34287h() && (compareTo = C25082a.m62844h(this.instructions, mVDocklessLeg.instructions)) != 0) || (compareTo = Boolean.valueOf(mo34286g()).compareTo(Boolean.valueOf(mVDocklessLeg.mo34286g()))) != 0 || ((mo34286g() && (compareTo = this.info.compareTo(mVDocklessLeg.info)) != 0) || (compareTo = Boolean.valueOf(mo34285f()).compareTo(Boolean.valueOf(mVDocklessLeg.mo34285f()))) != 0 || ((mo34285f() && (compareTo = this.deepLink.compareTo(mVDocklessLeg.deepLink)) != 0) || (compareTo = Boolean.valueOf(mo34291k()).compareTo(Boolean.valueOf(mVDocklessLeg.mo34291k()))) != 0 || ((mo34291k() && (compareTo = C25082a.m62839c(this.serviceId, mVDocklessLeg.serviceId)) != 0) || (compareTo = Boolean.valueOf(mo34289i()).compareTo(Boolean.valueOf(mVDocklessLeg.mo34289i()))) != 0 || ((mo34289i() && (compareTo = this.integrationItem.compareTo(mVDocklessLeg.integrationItem)) != 0) || (compareTo = Boolean.valueOf(mo34293m()).compareTo(Boolean.valueOf(mVDocklessLeg.mo34293m()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo34293m() || (l = C25082a.m62848l(this.shouldSkipItinerary, mVDocklessLeg.shouldSkipItinerary)) == 0) {
            return 0;
        }
        return l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg
            r2 = 1
            if (r1 == 0) goto L_0x010c
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg r7 = (com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg) r7
            boolean r1 = r6.mo34294o()
            boolean r3 = r7.mo34294o()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0029
        L_0x0017:
            if (r1 == 0) goto L_0x010c
            if (r3 != 0) goto L_0x001d
            goto L_0x010c
        L_0x001d:
            com.tranzmate.moovit.protocol.tripplanner.MVTime r1 = r6.time
            com.tranzmate.moovit.protocol.tripplanner.MVTime r3 = r7.time
            boolean r1 = r1.mo34573a(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x010c
        L_0x0029:
            boolean r1 = r6.mo34290j()
            boolean r3 = r7.mo34290j()
            if (r1 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0047
        L_0x0035:
            if (r1 == 0) goto L_0x010c
            if (r3 != 0) goto L_0x003b
            goto L_0x010c
        L_0x003b:
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r1 = r6.journey
            com.tranzmate.moovit.protocol.tripplanner.MVJourney r3 = r7.journey
            boolean r1 = r1.mo34347a(r3)
            if (r1 != 0) goto L_0x0047
            goto L_0x010c
        L_0x0047:
            boolean r1 = r6.mo34292l()
            boolean r3 = r7.mo34292l()
            if (r1 != 0) goto L_0x0053
            if (r3 == 0) goto L_0x0065
        L_0x0053:
            if (r1 == 0) goto L_0x010c
            if (r3 != 0) goto L_0x0059
            goto L_0x010c
        L_0x0059:
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r1 = r6.shape
            com.tranzmate.moovit.protocol.tripplanner.MVTripPlanShape r3 = r7.shape
            boolean r1 = r1.mo34748a(r3)
            if (r1 != 0) goto L_0x0065
            goto L_0x010c
        L_0x0065:
            boolean r1 = r6.mo34287h()
            boolean r3 = r7.mo34287h()
            if (r1 != 0) goto L_0x0071
            if (r3 == 0) goto L_0x0083
        L_0x0071:
            if (r1 == 0) goto L_0x010c
            if (r3 != 0) goto L_0x0077
            goto L_0x010c
        L_0x0077:
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction> r1 = r6.instructions
            java.util.List<com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction> r3 = r7.instructions
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0083
            goto L_0x010c
        L_0x0083:
            boolean r1 = r6.mo34286g()
            boolean r3 = r7.mo34286g()
            if (r1 != 0) goto L_0x008f
            if (r3 == 0) goto L_0x00b4
        L_0x008f:
            if (r1 == 0) goto L_0x010c
            if (r3 != 0) goto L_0x0095
            goto L_0x010c
        L_0x0095:
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r1 = r6.info
            com.tranzmate.moovit.protocol.tripplanner.MVDocklessInfo r3 = r7.info
            if (r3 == 0) goto L_0x00ad
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x00b0
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b0
            r1 = 1
            goto L_0x00b1
        L_0x00ad:
            r1.getClass()
        L_0x00b0:
            r1 = 0
        L_0x00b1:
            if (r1 != 0) goto L_0x00b4
            goto L_0x010c
        L_0x00b4:
            boolean r1 = r6.mo34285f()
            boolean r3 = r7.mo34285f()
            if (r1 != 0) goto L_0x00c0
            if (r3 == 0) goto L_0x00d0
        L_0x00c0:
            if (r1 == 0) goto L_0x010c
            if (r3 != 0) goto L_0x00c5
            goto L_0x010c
        L_0x00c5:
            com.tranzmate.moovit.protocol.common.MVExternalAppData r1 = r6.deepLink
            com.tranzmate.moovit.protocol.common.MVExternalAppData r3 = r7.deepLink
            boolean r1 = r1.mo26157a(r3)
            if (r1 != 0) goto L_0x00d0
            goto L_0x010c
        L_0x00d0:
            int r1 = r6.serviceId
            int r3 = r7.serviceId
            if (r1 == r3) goto L_0x00d7
            goto L_0x010c
        L_0x00d7:
            boolean r1 = r6.mo34289i()
            boolean r3 = r7.mo34289i()
            if (r1 != 0) goto L_0x00e3
            if (r3 == 0) goto L_0x00f3
        L_0x00e3:
            if (r1 == 0) goto L_0x010c
            if (r3 != 0) goto L_0x00e8
            goto L_0x010c
        L_0x00e8:
            com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem r1 = r6.integrationItem
            com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem r3 = r7.integrationItem
            boolean r1 = r1.mo34395a(r3)
            if (r1 != 0) goto L_0x00f3
            goto L_0x010c
        L_0x00f3:
            boolean r1 = r6.mo34293m()
            boolean r3 = r7.mo34293m()
            if (r1 != 0) goto L_0x00ff
            if (r3 == 0) goto L_0x010b
        L_0x00ff:
            if (r1 == 0) goto L_0x010c
            if (r3 != 0) goto L_0x0104
            goto L_0x010c
        L_0x0104:
            boolean r1 = r6.shouldSkipItinerary
            boolean r7 = r7.shouldSkipItinerary
            if (r1 == r7) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r0 = 1
        L_0x010c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tripplanner.MVDocklessLeg.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo34285f() {
        return this.deepLink != null;
    }

    /* renamed from: g */
    public final boolean mo34286g() {
        return this.info != null;
    }

    /* renamed from: h */
    public final boolean mo34287h() {
        return this.instructions != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34289i() {
        return this.integrationItem != null;
    }

    /* renamed from: j */
    public final boolean mo34290j() {
        return this.journey != null;
    }

    /* renamed from: k */
    public final boolean mo34291k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final boolean mo34292l() {
        return this.shape != null;
    }

    /* renamed from: m */
    public final boolean mo34293m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final boolean mo34294o() {
        return this.time != null;
    }

    /* renamed from: p */
    public final void mo34295p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo34296q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: r */
    public final void mo34297r() throws TException {
        MVJourney mVJourney = this.journey;
        if (mVJourney != null) {
            mVJourney.mo34352h();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDocklessLeg(", "time:");
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
        n.append("instructions:");
        List<MVWalkingInstruction> list = this.instructions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("info:");
        MVDocklessInfo mVDocklessInfo = this.info;
        if (mVDocklessInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDocklessInfo);
        }
        n.append(", ");
        n.append("deepLink:");
        MVExternalAppData mVExternalAppData = this.deepLink;
        if (mVExternalAppData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVExternalAppData);
        }
        n.append(", ");
        n.append("serviceId:");
        n.append(this.serviceId);
        if (mo34289i()) {
            n.append(", ");
            n.append("integrationItem:");
            MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = this.integrationItem;
            if (mVMicroMobilityIntegrationItem == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMicroMobilityIntegrationItem);
            }
        }
        if (mo34293m()) {
            n.append(", ");
            n.append("shouldSkipItinerary:");
            n.append(this.shouldSkipItinerary);
        }
        n.append(")");
        return n.toString();
    }
}
