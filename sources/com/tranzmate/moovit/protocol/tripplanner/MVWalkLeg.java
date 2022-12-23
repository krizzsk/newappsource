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

public class MVWalkLeg implements TBase<MVWalkLeg, _Fields>, Serializable, Cloneable, Comparable<MVWalkLeg> {

    /* renamed from: b */
    public static final C25113c f30269b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30270c = new C25113c("journey", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30271d = new C25113c("shape", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30272e = new C25113c("walkingInstructoins", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f30273f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f30274g;
    public MVJourney journey;
    public MVTripPlanShape shape;
    public MVTime time;
    public List<MVWalkingInstruction> walkingInstructoins;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        JOURNEY(2, "journey"),
        SHAPE(3, "shape"),
        WALKING_INSTRUCTOINS(4, "walkingInstructoins");
        
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
            if (i != 4) {
                return null;
            }
            return WALKING_INSTRUCTOINS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkLeg$a */
    public static class C11722a extends C25239c<MVWalkLeg> {
        public C11722a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWalkLeg mVWalkLeg = (MVWalkLeg) tBase;
            mVWalkLeg.mo34905j();
            C25113c cVar = MVWalkLeg.f30269b;
            gVar.mo61687K();
            if (mVWalkLeg.time != null) {
                gVar.mo61711x(MVWalkLeg.f30269b);
                mVWalkLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWalkLeg.journey != null) {
                gVar.mo61711x(MVWalkLeg.f30270c);
                mVWalkLeg.journey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWalkLeg.shape != null) {
                gVar.mo61711x(MVWalkLeg.f30271d);
                mVWalkLeg.shape.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWalkLeg.walkingInstructoins != null) {
                gVar.mo61711x(MVWalkLeg.f30272e);
                gVar.mo61680D(new C25119e((byte) 12, mVWalkLeg.walkingInstructoins.size()));
                for (MVWalkingInstruction X0 : mVWalkLeg.walkingInstructoins) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWalkLeg mVWalkLeg = (MVWalkLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWalkLeg.mo34905j();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVWalkLeg.walkingInstructoins = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                                    mVWalkingInstruction.mo25201C1(gVar);
                                    mVWalkLeg.walkingInstructoins.add(mVWalkingInstruction);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                            mVWalkLeg.shape = mVTripPlanShape;
                            mVTripPlanShape.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVJourney mVJourney = new MVJourney();
                        mVWalkLeg.journey = mVJourney;
                        mVJourney.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTime mVTime = new MVTime();
                    mVWalkLeg.time = mVTime;
                    mVTime.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkLeg$b */
    public static class C11723b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11722a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkLeg$c */
    public static class C11724c extends C25240d<MVWalkLeg> {
        public C11724c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWalkLeg mVWalkLeg = (MVWalkLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWalkLeg.mo34902h()) {
                bitSet.set(0);
            }
            if (mVWalkLeg.mo34900f()) {
                bitSet.set(1);
            }
            if (mVWalkLeg.mo34901g()) {
                bitSet.set(2);
            }
            if (mVWalkLeg.mo34904i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVWalkLeg.mo34902h()) {
                mVWalkLeg.time.mo25202X0(jVar);
            }
            if (mVWalkLeg.mo34900f()) {
                mVWalkLeg.journey.mo25202X0(jVar);
            }
            if (mVWalkLeg.mo34901g()) {
                mVWalkLeg.shape.mo25202X0(jVar);
            }
            if (mVWalkLeg.mo34904i()) {
                jVar.mo61678B(mVWalkLeg.walkingInstructoins.size());
                for (MVWalkingInstruction X0 : mVWalkLeg.walkingInstructoins) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWalkLeg mVWalkLeg = (MVWalkLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVWalkLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVJourney mVJourney = new MVJourney();
                mVWalkLeg.journey = mVJourney;
                mVJourney.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                mVWalkLeg.shape = mVTripPlanShape;
                mVTripPlanShape.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVWalkLeg.walkingInstructoins = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                    mVWalkingInstruction.mo25201C1(jVar);
                    mVWalkLeg.walkingInstructoins.add(mVWalkingInstruction);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkLeg$d */
    public static class C11725d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11724c(0);
        }
    }

    static {
        new C17394d0("MVWalkLeg");
        HashMap hashMap = new HashMap();
        f30273f = hashMap;
        hashMap.put(C25239c.class, new C11723b());
        hashMap.put(C25240d.class, new C11725d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.JOURNEY, new FieldMetaData("journey", (byte) 3, new StructMetaData(MVJourney.class)));
        enumMap.put(_Fields.SHAPE, new FieldMetaData("shape", (byte) 3, new StructMetaData(MVTripPlanShape.class)));
        enumMap.put(_Fields.WALKING_INSTRUCTOINS, new FieldMetaData("walkingInstructoins", (byte) 3, new ListMetaData(new StructMetaData(MVWalkingInstruction.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30274g = unmodifiableMap;
        FieldMetaData.m61947a(MVWalkLeg.class, unmodifiableMap);
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
        ((C25238b) f30273f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30273f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34897a(MVWalkLeg mVWalkLeg) {
        if (mVWalkLeg == null) {
            return false;
        }
        boolean h = mo34902h();
        boolean h2 = mVWalkLeg.mo34902h();
        if ((h || h2) && (!h || !h2 || !this.time.mo34573a(mVWalkLeg.time))) {
            return false;
        }
        boolean f = mo34900f();
        boolean f2 = mVWalkLeg.mo34900f();
        if ((f || f2) && (!f || !f2 || !this.journey.mo34347a(mVWalkLeg.journey))) {
            return false;
        }
        boolean g = mo34901g();
        boolean g2 = mVWalkLeg.mo34901g();
        if ((g || g2) && (!g || !g2 || !this.shape.mo34748a(mVWalkLeg.shape))) {
            return false;
        }
        boolean i = mo34904i();
        boolean i2 = mVWalkLeg.mo34904i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.walkingInstructoins.equals(mVWalkLeg.walkingInstructoins)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVWalkLeg mVWalkLeg = (MVWalkLeg) obj;
        if (!getClass().equals(mVWalkLeg.getClass())) {
            return getClass().getName().compareTo(mVWalkLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34902h()).compareTo(Boolean.valueOf(mVWalkLeg.mo34902h()));
        if (compareTo != 0 || ((mo34902h() && (compareTo = this.time.compareTo(mVWalkLeg.time)) != 0) || (compareTo = Boolean.valueOf(mo34900f()).compareTo(Boolean.valueOf(mVWalkLeg.mo34900f()))) != 0 || ((mo34900f() && (compareTo = this.journey.compareTo(mVWalkLeg.journey)) != 0) || (compareTo = Boolean.valueOf(mo34901g()).compareTo(Boolean.valueOf(mVWalkLeg.mo34901g()))) != 0 || ((mo34901g() && (compareTo = this.shape.compareTo(mVWalkLeg.shape)) != 0) || (compareTo = Boolean.valueOf(mo34904i()).compareTo(Boolean.valueOf(mVWalkLeg.mo34904i()))) != 0)))) {
            return compareTo;
        }
        if (!mo34904i() || (h = C25082a.m62844h(this.walkingInstructoins, mVWalkLeg.walkingInstructoins)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVWalkLeg)) {
            return mo34897a((MVWalkLeg) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34900f() {
        return this.journey != null;
    }

    /* renamed from: g */
    public final boolean mo34901g() {
        return this.shape != null;
    }

    /* renamed from: h */
    public final boolean mo34902h() {
        return this.time != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34904i() {
        return this.walkingInstructoins != null;
    }

    /* renamed from: j */
    public final void mo34905j() throws TException {
        MVTime mVTime = this.time;
        if (mVTime != null) {
            mVTime.getClass();
        }
        MVJourney mVJourney = this.journey;
        if (mVJourney != null) {
            mVJourney.mo34352h();
        }
        MVTripPlanShape mVTripPlanShape = this.shape;
        if (mVTripPlanShape != null) {
            mVTripPlanShape.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWalkLeg(", "time:");
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
        n.append("walkingInstructoins:");
        List<MVWalkingInstruction> list = this.walkingInstructoins;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
