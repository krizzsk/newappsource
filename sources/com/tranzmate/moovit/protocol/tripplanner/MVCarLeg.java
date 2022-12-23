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

public class MVCarLeg implements TBase<MVCarLeg, _Fields>, Serializable, Cloneable, Comparable<MVCarLeg> {

    /* renamed from: b */
    public static final C25113c f29840b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29841c = new C25113c("journey", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29842d = new C25113c("shape", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29843e = new C25113c("instructions", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f29844f = new C25113c("integrationItem", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f29845g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f29846h;
    public List<MVWalkingInstruction> instructions;
    public MVMicroMobilityIntegrationItem integrationItem;
    public MVJourney journey;
    private _Fields[] optionals = {_Fields.INSTRUCTIONS, _Fields.INTEGRATION_ITEM};
    public MVTripPlanShape shape;
    public MVTime time;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        JOURNEY(2, "journey"),
        SHAPE(3, "shape"),
        INSTRUCTIONS(4, "instructions"),
        INTEGRATION_ITEM(5, "integrationItem");
        
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
            return INTEGRATION_ITEM;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarLeg$a */
    public static class C11505a extends C25239c<MVCarLeg> {
        public C11505a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarLeg mVCarLeg = (MVCarLeg) tBase;
            mVCarLeg.mo34182k();
            C25113c cVar = MVCarLeg.f29840b;
            gVar.mo61687K();
            if (mVCarLeg.time != null) {
                gVar.mo61711x(MVCarLeg.f29840b);
                mVCarLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarLeg.journey != null) {
                gVar.mo61711x(MVCarLeg.f29841c);
                mVCarLeg.journey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarLeg.shape != null) {
                gVar.mo61711x(MVCarLeg.f29842d);
                mVCarLeg.shape.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCarLeg.instructions != null && mVCarLeg.mo34176f()) {
                gVar.mo61711x(MVCarLeg.f29843e);
                gVar.mo61680D(new C25119e((byte) 12, mVCarLeg.instructions.size()));
                for (MVWalkingInstruction X0 : mVCarLeg.instructions) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVCarLeg.integrationItem != null && mVCarLeg.mo34177g()) {
                gVar.mo61711x(MVCarLeg.f29844f);
                mVCarLeg.integrationItem.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarLeg mVCarLeg = (MVCarLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarLeg.mo34182k();
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
                                    MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = new MVMicroMobilityIntegrationItem();
                                    mVCarLeg.integrationItem = mVMicroMobilityIntegrationItem;
                                    mVMicroMobilityIntegrationItem.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVCarLeg.instructions = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                                    mVWalkingInstruction.mo25201C1(gVar);
                                    mVCarLeg.instructions.add(mVWalkingInstruction);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                            mVCarLeg.shape = mVTripPlanShape;
                            mVTripPlanShape.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVJourney mVJourney = new MVJourney();
                        mVCarLeg.journey = mVJourney;
                        mVJourney.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTime mVTime = new MVTime();
                    mVCarLeg.time = mVTime;
                    mVTime.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarLeg$b */
    public static class C11506b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11505a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarLeg$c */
    public static class C11507c extends C25240d<MVCarLeg> {
        public C11507c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarLeg mVCarLeg = (MVCarLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarLeg.mo34181j()) {
                bitSet.set(0);
            }
            if (mVCarLeg.mo34178h()) {
                bitSet.set(1);
            }
            if (mVCarLeg.mo34180i()) {
                bitSet.set(2);
            }
            if (mVCarLeg.mo34176f()) {
                bitSet.set(3);
            }
            if (mVCarLeg.mo34177g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVCarLeg.mo34181j()) {
                mVCarLeg.time.mo25202X0(jVar);
            }
            if (mVCarLeg.mo34178h()) {
                mVCarLeg.journey.mo25202X0(jVar);
            }
            if (mVCarLeg.mo34180i()) {
                mVCarLeg.shape.mo25202X0(jVar);
            }
            if (mVCarLeg.mo34176f()) {
                jVar.mo61678B(mVCarLeg.instructions.size());
                for (MVWalkingInstruction X0 : mVCarLeg.instructions) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVCarLeg.mo34177g()) {
                mVCarLeg.integrationItem.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarLeg mVCarLeg = (MVCarLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVCarLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVJourney mVJourney = new MVJourney();
                mVCarLeg.journey = mVJourney;
                mVJourney.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                mVCarLeg.shape = mVTripPlanShape;
                mVTripPlanShape.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVCarLeg.instructions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                    mVWalkingInstruction.mo25201C1(jVar);
                    mVCarLeg.instructions.add(mVWalkingInstruction);
                }
            }
            if (T.get(4)) {
                MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = new MVMicroMobilityIntegrationItem();
                mVCarLeg.integrationItem = mVMicroMobilityIntegrationItem;
                mVMicroMobilityIntegrationItem.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarLeg$d */
    public static class C11508d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11507c(0);
        }
    }

    static {
        new C17394d0("MVCarLeg");
        HashMap hashMap = new HashMap();
        f29845g = hashMap;
        hashMap.put(C25239c.class, new C11506b());
        hashMap.put(C25240d.class, new C11508d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.JOURNEY, new FieldMetaData("journey", (byte) 3, new StructMetaData(MVJourney.class)));
        enumMap.put(_Fields.SHAPE, new FieldMetaData("shape", (byte) 3, new StructMetaData(MVTripPlanShape.class)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 2, new ListMetaData(new StructMetaData(MVWalkingInstruction.class))));
        enumMap.put(_Fields.INTEGRATION_ITEM, new FieldMetaData("integrationItem", (byte) 2, new StructMetaData(MVMicroMobilityIntegrationItem.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29846h = unmodifiableMap;
        FieldMetaData.m61947a(MVCarLeg.class, unmodifiableMap);
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
        ((C25238b) f29845g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29845g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCarLeg mVCarLeg = (MVCarLeg) obj;
        if (!getClass().equals(mVCarLeg.getClass())) {
            return getClass().getName().compareTo(mVCarLeg.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34181j()).compareTo(Boolean.valueOf(mVCarLeg.mo34181j()));
        if (compareTo2 != 0 || ((mo34181j() && (compareTo2 = this.time.compareTo(mVCarLeg.time)) != 0) || (compareTo2 = Boolean.valueOf(mo34178h()).compareTo(Boolean.valueOf(mVCarLeg.mo34178h()))) != 0 || ((mo34178h() && (compareTo2 = this.journey.compareTo(mVCarLeg.journey)) != 0) || (compareTo2 = Boolean.valueOf(mo34180i()).compareTo(Boolean.valueOf(mVCarLeg.mo34180i()))) != 0 || ((mo34180i() && (compareTo2 = this.shape.compareTo(mVCarLeg.shape)) != 0) || (compareTo2 = Boolean.valueOf(mo34176f()).compareTo(Boolean.valueOf(mVCarLeg.mo34176f()))) != 0 || ((mo34176f() && (compareTo2 = C25082a.m62844h(this.instructions, mVCarLeg.instructions)) != 0) || (compareTo2 = Boolean.valueOf(mo34177g()).compareTo(Boolean.valueOf(mVCarLeg.mo34177g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo34177g() || (compareTo = this.integrationItem.compareTo(mVCarLeg.integrationItem)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCarLeg)) {
            return false;
        }
        MVCarLeg mVCarLeg = (MVCarLeg) obj;
        boolean j = mo34181j();
        boolean j2 = mVCarLeg.mo34181j();
        if ((j || j2) && (!j || !j2 || !this.time.mo34573a(mVCarLeg.time))) {
            return false;
        }
        boolean h = mo34178h();
        boolean h2 = mVCarLeg.mo34178h();
        if ((h || h2) && (!h || !h2 || !this.journey.mo34347a(mVCarLeg.journey))) {
            return false;
        }
        boolean i = mo34180i();
        boolean i2 = mVCarLeg.mo34180i();
        if ((i || i2) && (!i || !i2 || !this.shape.mo34748a(mVCarLeg.shape))) {
            return false;
        }
        boolean f = mo34176f();
        boolean f2 = mVCarLeg.mo34176f();
        if ((f || f2) && (!f || !f2 || !this.instructions.equals(mVCarLeg.instructions))) {
            return false;
        }
        boolean g = mo34177g();
        boolean g2 = mVCarLeg.mo34177g();
        if ((g || g2) && (!g || !g2 || !this.integrationItem.mo34395a(mVCarLeg.integrationItem))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34176f() {
        return this.instructions != null;
    }

    /* renamed from: g */
    public final boolean mo34177g() {
        return this.integrationItem != null;
    }

    /* renamed from: h */
    public final boolean mo34178h() {
        return this.journey != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34180i() {
        return this.shape != null;
    }

    /* renamed from: j */
    public final boolean mo34181j() {
        return this.time != null;
    }

    /* renamed from: k */
    public final void mo34182k() throws TException {
        MVJourney mVJourney = this.journey;
        if (mVJourney != null) {
            mVJourney.mo34352h();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarLeg(", "time:");
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
        if (mo34176f()) {
            n.append(", ");
            n.append("instructions:");
            List<MVWalkingInstruction> list = this.instructions;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo34177g()) {
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
