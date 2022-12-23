package com.tranzmate.moovit.protocol.tripplanner;

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

public class MVParkingLeg implements TBase<MVParkingLeg, _Fields>, Serializable, Cloneable, Comparable<MVParkingLeg> {

    /* renamed from: b */
    public static final C25113c f30000b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30001c = new C25113c("journey", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30002d = new C25113c("shape", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30003e = new C25113c("instructions", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f30004f = new C25113c("parkingLotInfo", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f30005g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30006h;
    public List<MVWalkingInstruction> instructions;
    public MVJourney journey;
    public MVParkingLotInfo parkingLotInfo;
    public MVTripPlanShape shape;
    public MVTime time;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        JOURNEY(2, "journey"),
        SHAPE(3, "shape"),
        INSTRUCTIONS(4, "instructions"),
        PARKING_LOT_INFO(5, "parkingLotInfo");
        
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
            if (i == 1) {
                return TIME;
            }
            if (i == 2) {
                return JOURNEY;
            }
            if (i == 3) {
                return SHAPE;
            }
            if (i == 4) {
                return INSTRUCTIONS;
            }
            if (i != 5) {
                return null;
            }
            return PARKING_LOT_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVParkingLeg$a */
    public static class C11594a extends C25239c<MVParkingLeg> {
        public C11594a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParkingLeg mVParkingLeg = (MVParkingLeg) tBase;
            mVParkingLeg.mo34452k();
            C25113c cVar = MVParkingLeg.f30000b;
            gVar.mo61687K();
            if (mVParkingLeg.time != null) {
                gVar.mo61711x(MVParkingLeg.f30000b);
                mVParkingLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVParkingLeg.journey != null) {
                gVar.mo61711x(MVParkingLeg.f30001c);
                mVParkingLeg.journey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVParkingLeg.shape != null) {
                gVar.mo61711x(MVParkingLeg.f30002d);
                mVParkingLeg.shape.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVParkingLeg.instructions != null) {
                gVar.mo61711x(MVParkingLeg.f30003e);
                gVar.mo61680D(new C25119e((byte) 12, mVParkingLeg.instructions.size()));
                for (MVWalkingInstruction X0 : mVParkingLeg.instructions) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVParkingLeg.parkingLotInfo != null) {
                gVar.mo61711x(MVParkingLeg.f30004f);
                mVParkingLeg.parkingLotInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParkingLeg mVParkingLeg = (MVParkingLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVParkingLeg.mo34452k();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVParkingLotInfo mVParkingLotInfo = new MVParkingLotInfo();
                                    mVParkingLeg.parkingLotInfo = mVParkingLotInfo;
                                    mVParkingLotInfo.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVParkingLeg.instructions = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                                    mVWalkingInstruction.mo25201C1(gVar);
                                    mVParkingLeg.instructions.add(mVWalkingInstruction);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                            mVParkingLeg.shape = mVTripPlanShape;
                            mVTripPlanShape.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVJourney mVJourney = new MVJourney();
                        mVParkingLeg.journey = mVJourney;
                        mVJourney.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTime mVTime = new MVTime();
                    mVParkingLeg.time = mVTime;
                    mVTime.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVParkingLeg$b */
    public static class C11595b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11594a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVParkingLeg$c */
    public static class C11596c extends C25240d<MVParkingLeg> {
        public C11596c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParkingLeg mVParkingLeg = (MVParkingLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVParkingLeg.mo34451j()) {
                bitSet.set(0);
            }
            if (mVParkingLeg.mo34447g()) {
                bitSet.set(1);
            }
            if (mVParkingLeg.mo34450i()) {
                bitSet.set(2);
            }
            if (mVParkingLeg.mo34446f()) {
                bitSet.set(3);
            }
            if (mVParkingLeg.mo34448h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVParkingLeg.mo34451j()) {
                mVParkingLeg.time.mo25202X0(jVar);
            }
            if (mVParkingLeg.mo34447g()) {
                mVParkingLeg.journey.mo25202X0(jVar);
            }
            if (mVParkingLeg.mo34450i()) {
                mVParkingLeg.shape.mo25202X0(jVar);
            }
            if (mVParkingLeg.mo34446f()) {
                jVar.mo61678B(mVParkingLeg.instructions.size());
                for (MVWalkingInstruction X0 : mVParkingLeg.instructions) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVParkingLeg.mo34448h()) {
                mVParkingLeg.parkingLotInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParkingLeg mVParkingLeg = (MVParkingLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVParkingLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVJourney mVJourney = new MVJourney();
                mVParkingLeg.journey = mVJourney;
                mVJourney.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                mVParkingLeg.shape = mVTripPlanShape;
                mVTripPlanShape.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVParkingLeg.instructions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                    mVWalkingInstruction.mo25201C1(jVar);
                    mVParkingLeg.instructions.add(mVWalkingInstruction);
                }
            }
            if (T.get(4)) {
                MVParkingLotInfo mVParkingLotInfo = new MVParkingLotInfo();
                mVParkingLeg.parkingLotInfo = mVParkingLotInfo;
                mVParkingLotInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVParkingLeg$d */
    public static class C11597d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11596c(0);
        }
    }

    static {
        new C17394d0("MVParkingLeg");
        HashMap hashMap = new HashMap();
        f30005g = hashMap;
        hashMap.put(C25239c.class, new C11595b());
        hashMap.put(C25240d.class, new C11597d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.JOURNEY, new FieldMetaData("journey", (byte) 3, new StructMetaData(MVJourney.class)));
        enumMap.put(_Fields.SHAPE, new FieldMetaData("shape", (byte) 3, new StructMetaData(MVTripPlanShape.class)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 3, new ListMetaData(new StructMetaData(MVWalkingInstruction.class))));
        enumMap.put(_Fields.PARKING_LOT_INFO, new FieldMetaData("parkingLotInfo", (byte) 3, new StructMetaData(MVParkingLotInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30006h = unmodifiableMap;
        FieldMetaData.m61947a(MVParkingLeg.class, unmodifiableMap);
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
        ((C25238b) f30005g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30005g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVParkingLeg mVParkingLeg = (MVParkingLeg) obj;
        if (!getClass().equals(mVParkingLeg.getClass())) {
            return getClass().getName().compareTo(mVParkingLeg.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34451j()).compareTo(Boolean.valueOf(mVParkingLeg.mo34451j()));
        if (compareTo2 != 0 || ((mo34451j() && (compareTo2 = this.time.compareTo(mVParkingLeg.time)) != 0) || (compareTo2 = Boolean.valueOf(mo34447g()).compareTo(Boolean.valueOf(mVParkingLeg.mo34447g()))) != 0 || ((mo34447g() && (compareTo2 = this.journey.compareTo(mVParkingLeg.journey)) != 0) || (compareTo2 = Boolean.valueOf(mo34450i()).compareTo(Boolean.valueOf(mVParkingLeg.mo34450i()))) != 0 || ((mo34450i() && (compareTo2 = this.shape.compareTo(mVParkingLeg.shape)) != 0) || (compareTo2 = Boolean.valueOf(mo34446f()).compareTo(Boolean.valueOf(mVParkingLeg.mo34446f()))) != 0 || ((mo34446f() && (compareTo2 = C25082a.m62844h(this.instructions, mVParkingLeg.instructions)) != 0) || (compareTo2 = Boolean.valueOf(mo34448h()).compareTo(Boolean.valueOf(mVParkingLeg.mo34448h()))) != 0))))) {
            return compareTo2;
        }
        if (!mo34448h() || (compareTo = this.parkingLotInfo.compareTo(mVParkingLeg.parkingLotInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVParkingLeg)) {
            return false;
        }
        MVParkingLeg mVParkingLeg = (MVParkingLeg) obj;
        boolean j = mo34451j();
        boolean j2 = mVParkingLeg.mo34451j();
        if ((j || j2) && (!j || !j2 || !this.time.mo34573a(mVParkingLeg.time))) {
            return false;
        }
        boolean g = mo34447g();
        boolean g2 = mVParkingLeg.mo34447g();
        if ((g || g2) && (!g || !g2 || !this.journey.mo34347a(mVParkingLeg.journey))) {
            return false;
        }
        boolean i = mo34450i();
        boolean i2 = mVParkingLeg.mo34450i();
        if ((i || i2) && (!i || !i2 || !this.shape.mo34748a(mVParkingLeg.shape))) {
            return false;
        }
        boolean f = mo34446f();
        boolean f2 = mVParkingLeg.mo34446f();
        if ((f || f2) && (!f || !f2 || !this.instructions.equals(mVParkingLeg.instructions))) {
            return false;
        }
        boolean h = mo34448h();
        boolean h2 = mVParkingLeg.mo34448h();
        if ((h || h2) && (!h || !h2 || !this.parkingLotInfo.mo34455a(mVParkingLeg.parkingLotInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34446f() {
        return this.instructions != null;
    }

    /* renamed from: g */
    public final boolean mo34447g() {
        return this.journey != null;
    }

    /* renamed from: h */
    public final boolean mo34448h() {
        return this.parkingLotInfo != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34450i() {
        return this.shape != null;
    }

    /* renamed from: j */
    public final boolean mo34451j() {
        return this.time != null;
    }

    /* renamed from: k */
    public final void mo34452k() throws TException {
        MVJourney mVJourney = this.journey;
        if (mVJourney != null) {
            mVJourney.mo34352h();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVParkingLeg(", "time:");
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
        n.append("parkingLotInfo:");
        MVParkingLotInfo mVParkingLotInfo = this.parkingLotInfo;
        if (mVParkingLotInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVParkingLotInfo);
        }
        n.append(")");
        return n.toString();
    }
}
