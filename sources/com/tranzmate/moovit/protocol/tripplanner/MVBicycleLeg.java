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

public class MVBicycleLeg implements TBase<MVBicycleLeg, _Fields>, Serializable, Cloneable, Comparable<MVBicycleLeg> {

    /* renamed from: b */
    public static final C25113c f29823b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29824c = new C25113c("journey", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29825d = new C25113c("shape", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29826e = new C25113c("cyclingInstructions", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f29827f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29828g;
    public List<MVWalkingInstruction> cyclingInstructions;
    public MVJourney journey;
    public MVTripPlanShape shape;
    public MVTime time;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        JOURNEY(2, "journey"),
        SHAPE(3, "shape"),
        CYCLING_INSTRUCTIONS(4, "cyclingInstructions");
        
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
            return CYCLING_INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVBicycleLeg$a */
    public static class C11497a extends C25239c<MVBicycleLeg> {
        public C11497a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBicycleLeg mVBicycleLeg = (MVBicycleLeg) tBase;
            MVTime mVTime = mVBicycleLeg.time;
            MVJourney mVJourney = mVBicycleLeg.journey;
            if (mVJourney != null) {
                mVJourney.mo34352h();
            }
            C25113c cVar = MVBicycleLeg.f29823b;
            gVar.mo61687K();
            if (mVBicycleLeg.time != null) {
                gVar.mo61711x(MVBicycleLeg.f29823b);
                mVBicycleLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBicycleLeg.journey != null) {
                gVar.mo61711x(MVBicycleLeg.f29824c);
                mVBicycleLeg.journey.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBicycleLeg.shape != null) {
                gVar.mo61711x(MVBicycleLeg.f29825d);
                mVBicycleLeg.shape.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBicycleLeg.cyclingInstructions != null) {
                gVar.mo61711x(MVBicycleLeg.f29826e);
                gVar.mo61680D(new C25119e((byte) 12, mVBicycleLeg.cyclingInstructions.size()));
                for (MVWalkingInstruction X0 : mVBicycleLeg.cyclingInstructions) {
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
            MVBicycleLeg mVBicycleLeg = (MVBicycleLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVBicycleLeg.cyclingInstructions = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                                    mVWalkingInstruction.mo25201C1(gVar);
                                    mVBicycleLeg.cyclingInstructions.add(mVWalkingInstruction);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                            mVBicycleLeg.shape = mVTripPlanShape;
                            mVTripPlanShape.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVJourney mVJourney = new MVJourney();
                        mVBicycleLeg.journey = mVJourney;
                        mVJourney.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTime mVTime = new MVTime();
                    mVBicycleLeg.time = mVTime;
                    mVTime.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTime mVTime2 = mVBicycleLeg.time;
            MVJourney mVJourney2 = mVBicycleLeg.journey;
            if (mVJourney2 != null) {
                mVJourney2.mo34352h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVBicycleLeg$b */
    public static class C11498b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11497a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVBicycleLeg$c */
    public static class C11499c extends C25240d<MVBicycleLeg> {
        public C11499c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBicycleLeg mVBicycleLeg = (MVBicycleLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBicycleLeg.mo34156i()) {
                bitSet.set(0);
            }
            if (mVBicycleLeg.mo34153g()) {
                bitSet.set(1);
            }
            if (mVBicycleLeg.mo34154h()) {
                bitSet.set(2);
            }
            if (mVBicycleLeg.mo34152f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVBicycleLeg.mo34156i()) {
                mVBicycleLeg.time.mo25202X0(jVar);
            }
            if (mVBicycleLeg.mo34153g()) {
                mVBicycleLeg.journey.mo25202X0(jVar);
            }
            if (mVBicycleLeg.mo34154h()) {
                mVBicycleLeg.shape.mo25202X0(jVar);
            }
            if (mVBicycleLeg.mo34152f()) {
                jVar.mo61678B(mVBicycleLeg.cyclingInstructions.size());
                for (MVWalkingInstruction X0 : mVBicycleLeg.cyclingInstructions) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBicycleLeg mVBicycleLeg = (MVBicycleLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVBicycleLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVJourney mVJourney = new MVJourney();
                mVBicycleLeg.journey = mVJourney;
                mVJourney.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTripPlanShape mVTripPlanShape = new MVTripPlanShape();
                mVBicycleLeg.shape = mVTripPlanShape;
                mVTripPlanShape.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVBicycleLeg.cyclingInstructions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWalkingInstruction mVWalkingInstruction = new MVWalkingInstruction();
                    mVWalkingInstruction.mo25201C1(jVar);
                    mVBicycleLeg.cyclingInstructions.add(mVWalkingInstruction);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVBicycleLeg$d */
    public static class C11500d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11499c(0);
        }
    }

    static {
        new C17394d0("MVBicycleLeg");
        HashMap hashMap = new HashMap();
        f29827f = hashMap;
        hashMap.put(C25239c.class, new C11498b());
        hashMap.put(C25240d.class, new C11500d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.JOURNEY, new FieldMetaData("journey", (byte) 3, new StructMetaData(MVJourney.class)));
        enumMap.put(_Fields.SHAPE, new FieldMetaData("shape", (byte) 3, new StructMetaData(MVTripPlanShape.class)));
        enumMap.put(_Fields.CYCLING_INSTRUCTIONS, new FieldMetaData("cyclingInstructions", (byte) 3, new ListMetaData(new StructMetaData(MVWalkingInstruction.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29828g = unmodifiableMap;
        FieldMetaData.m61947a(MVBicycleLeg.class, unmodifiableMap);
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
        ((C25238b) f29827f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29827f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVBicycleLeg mVBicycleLeg = (MVBicycleLeg) obj;
        if (!getClass().equals(mVBicycleLeg.getClass())) {
            return getClass().getName().compareTo(mVBicycleLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34156i()).compareTo(Boolean.valueOf(mVBicycleLeg.mo34156i()));
        if (compareTo != 0 || ((mo34156i() && (compareTo = this.time.compareTo(mVBicycleLeg.time)) != 0) || (compareTo = Boolean.valueOf(mo34153g()).compareTo(Boolean.valueOf(mVBicycleLeg.mo34153g()))) != 0 || ((mo34153g() && (compareTo = this.journey.compareTo(mVBicycleLeg.journey)) != 0) || (compareTo = Boolean.valueOf(mo34154h()).compareTo(Boolean.valueOf(mVBicycleLeg.mo34154h()))) != 0 || ((mo34154h() && (compareTo = this.shape.compareTo(mVBicycleLeg.shape)) != 0) || (compareTo = Boolean.valueOf(mo34152f()).compareTo(Boolean.valueOf(mVBicycleLeg.mo34152f()))) != 0)))) {
            return compareTo;
        }
        if (!mo34152f() || (h = C25082a.m62844h(this.cyclingInstructions, mVBicycleLeg.cyclingInstructions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBicycleLeg)) {
            return false;
        }
        MVBicycleLeg mVBicycleLeg = (MVBicycleLeg) obj;
        boolean i = mo34156i();
        boolean i2 = mVBicycleLeg.mo34156i();
        if ((i || i2) && (!i || !i2 || !this.time.mo34573a(mVBicycleLeg.time))) {
            return false;
        }
        boolean g = mo34153g();
        boolean g2 = mVBicycleLeg.mo34153g();
        if ((g || g2) && (!g || !g2 || !this.journey.mo34347a(mVBicycleLeg.journey))) {
            return false;
        }
        boolean h = mo34154h();
        boolean h2 = mVBicycleLeg.mo34154h();
        if ((h || h2) && (!h || !h2 || !this.shape.mo34748a(mVBicycleLeg.shape))) {
            return false;
        }
        boolean f = mo34152f();
        boolean f2 = mVBicycleLeg.mo34152f();
        if ((f || f2) && (!f || !f2 || !this.cyclingInstructions.equals(mVBicycleLeg.cyclingInstructions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34152f() {
        return this.cyclingInstructions != null;
    }

    /* renamed from: g */
    public final boolean mo34153g() {
        return this.journey != null;
    }

    /* renamed from: h */
    public final boolean mo34154h() {
        return this.shape != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34156i() {
        return this.time != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBicycleLeg(", "time:");
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
        n.append(")");
        return n.toString();
    }
}
