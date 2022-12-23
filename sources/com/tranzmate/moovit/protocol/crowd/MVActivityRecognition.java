package com.tranzmate.moovit.protocol.crowd;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVActivityRecognition implements TBase<MVActivityRecognition, _Fields>, Serializable, Cloneable, Comparable<MVActivityRecognition> {

    /* renamed from: b */
    public static final C25113c f25302b = new C25113c("startTime", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25303c = new C25113c("stationary", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25304d = new C25113c("walking", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25305e = new C25113c("running", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25306f = new C25113c("automotive", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f25307g = new C25113c("cycling", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f25308h = new C25113c("foot", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f25309i = new C25113c("tilt", (byte) 8, 8);

    /* renamed from: j */
    public static final HashMap f25310j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f25311k;
    private byte __isset_bitfield = 0;
    public int automotive;
    public int cycling;
    public int foot;
    public int running;
    public long startTime;
    public int stationary;
    public int tilt;
    public int walking;

    public enum _Fields implements C25085c {
        START_TIME(1, "startTime"),
        STATIONARY(2, "stationary"),
        WALKING(3, "walking"),
        RUNNING(4, "running"),
        AUTOMOTIVE(5, "automotive"),
        CYCLING(6, "cycling"),
        FOOT(7, "foot"),
        TILT(8, "tilt");
        
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
                    return START_TIME;
                case 2:
                    return STATIONARY;
                case 3:
                    return WALKING;
                case 4:
                    return RUNNING;
                case 5:
                    return AUTOMOTIVE;
                case 6:
                    return CYCLING;
                case 7:
                    return FOOT;
                case 8:
                    return TILT;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVActivityRecognition$a */
    public static class C8525a extends C25239c<MVActivityRecognition> {
        public C8525a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVActivityRecognition mVActivityRecognition = (MVActivityRecognition) tBase;
            mVActivityRecognition.getClass();
            C25113c cVar = MVActivityRecognition.f25302b;
            gVar.mo61687K();
            gVar.mo61711x(MVActivityRecognition.f25302b);
            gVar.mo61679C(mVActivityRecognition.startTime);
            gVar.mo61712y();
            gVar.mo61711x(MVActivityRecognition.f25303c);
            gVar.mo61678B(mVActivityRecognition.stationary);
            gVar.mo61712y();
            gVar.mo61711x(MVActivityRecognition.f25304d);
            gVar.mo61678B(mVActivityRecognition.walking);
            gVar.mo61712y();
            gVar.mo61711x(MVActivityRecognition.f25305e);
            gVar.mo61678B(mVActivityRecognition.running);
            gVar.mo61712y();
            gVar.mo61711x(MVActivityRecognition.f25306f);
            gVar.mo61678B(mVActivityRecognition.automotive);
            gVar.mo61712y();
            gVar.mo61711x(MVActivityRecognition.f25307g);
            gVar.mo61678B(mVActivityRecognition.cycling);
            gVar.mo61712y();
            gVar.mo61711x(MVActivityRecognition.f25308h);
            gVar.mo61678B(mVActivityRecognition.foot);
            gVar.mo61712y();
            gVar.mo61711x(MVActivityRecognition.f25309i);
            C16530d.m42020n(gVar, mVActivityRecognition.tilt);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVActivityRecognition mVActivityRecognition = (MVActivityRecognition) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVActivityRecognition.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVActivityRecognition.startTime = gVar.mo61697j();
                            mVActivityRecognition.mo26688s();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVActivityRecognition.stationary = gVar.mo61696i();
                            mVActivityRecognition.mo26689t();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVActivityRecognition.walking = gVar.mo61696i();
                            mVActivityRecognition.mo26692v();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVActivityRecognition.running = gVar.mo61696i();
                            mVActivityRecognition.mo26687r();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVActivityRecognition.automotive = gVar.mo61696i();
                            mVActivityRecognition.mo26684o();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVActivityRecognition.cycling = gVar.mo61696i();
                            mVActivityRecognition.mo26685p();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVActivityRecognition.foot = gVar.mo61696i();
                            mVActivityRecognition.mo26686q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVActivityRecognition.tilt = gVar.mo61696i();
                            mVActivityRecognition.mo26691u();
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVActivityRecognition$b */
    public static class C8526b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8525a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVActivityRecognition$c */
    public static class C8527c extends C25240d<MVActivityRecognition> {
        public C8527c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVActivityRecognition mVActivityRecognition = (MVActivityRecognition) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVActivityRecognition.mo26680j()) {
                bitSet.set(0);
            }
            if (mVActivityRecognition.mo26681k()) {
                bitSet.set(1);
            }
            if (mVActivityRecognition.mo26683m()) {
                bitSet.set(2);
            }
            if (mVActivityRecognition.mo26679i()) {
                bitSet.set(3);
            }
            if (mVActivityRecognition.mo26675f()) {
                bitSet.set(4);
            }
            if (mVActivityRecognition.mo26676g()) {
                bitSet.set(5);
            }
            if (mVActivityRecognition.mo26677h()) {
                bitSet.set(6);
            }
            if (mVActivityRecognition.mo26682l()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVActivityRecognition.mo26680j()) {
                jVar.mo61679C(mVActivityRecognition.startTime);
            }
            if (mVActivityRecognition.mo26681k()) {
                jVar.mo61678B(mVActivityRecognition.stationary);
            }
            if (mVActivityRecognition.mo26683m()) {
                jVar.mo61678B(mVActivityRecognition.walking);
            }
            if (mVActivityRecognition.mo26679i()) {
                jVar.mo61678B(mVActivityRecognition.running);
            }
            if (mVActivityRecognition.mo26675f()) {
                jVar.mo61678B(mVActivityRecognition.automotive);
            }
            if (mVActivityRecognition.mo26676g()) {
                jVar.mo61678B(mVActivityRecognition.cycling);
            }
            if (mVActivityRecognition.mo26677h()) {
                jVar.mo61678B(mVActivityRecognition.foot);
            }
            if (mVActivityRecognition.mo26682l()) {
                jVar.mo61678B(mVActivityRecognition.tilt);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVActivityRecognition mVActivityRecognition = (MVActivityRecognition) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVActivityRecognition.startTime = jVar.mo61697j();
                mVActivityRecognition.mo26688s();
            }
            if (T.get(1)) {
                mVActivityRecognition.stationary = jVar.mo61696i();
                mVActivityRecognition.mo26689t();
            }
            if (T.get(2)) {
                mVActivityRecognition.walking = jVar.mo61696i();
                mVActivityRecognition.mo26692v();
            }
            if (T.get(3)) {
                mVActivityRecognition.running = jVar.mo61696i();
                mVActivityRecognition.mo26687r();
            }
            if (T.get(4)) {
                mVActivityRecognition.automotive = jVar.mo61696i();
                mVActivityRecognition.mo26684o();
            }
            if (T.get(5)) {
                mVActivityRecognition.cycling = jVar.mo61696i();
                mVActivityRecognition.mo26685p();
            }
            if (T.get(6)) {
                mVActivityRecognition.foot = jVar.mo61696i();
                mVActivityRecognition.mo26686q();
            }
            if (T.get(7)) {
                mVActivityRecognition.tilt = jVar.mo61696i();
                mVActivityRecognition.mo26691u();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVActivityRecognition$d */
    public static class C8528d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8527c(0);
        }
    }

    static {
        new C17394d0("MVActivityRecognition");
        HashMap hashMap = new HashMap();
        f25310j = hashMap;
        hashMap.put(C25239c.class, new C8526b());
        hashMap.put(C25240d.class, new C8528d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.START_TIME, new FieldMetaData("startTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.STATIONARY, new FieldMetaData("stationary", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WALKING, new FieldMetaData("walking", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RUNNING, new FieldMetaData("running", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AUTOMOTIVE, new FieldMetaData("automotive", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CYCLING, new FieldMetaData("cycling", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FOOT, new FieldMetaData("foot", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TILT, new FieldMetaData("tilt", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25311k = unmodifiableMap;
        FieldMetaData.m61947a(MVActivityRecognition.class, unmodifiableMap);
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
        ((C25238b) f25310j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25310j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVActivityRecognition mVActivityRecognition = (MVActivityRecognition) obj;
        if (!getClass().equals(mVActivityRecognition.getClass())) {
            return getClass().getName().compareTo(mVActivityRecognition.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26680j()).compareTo(Boolean.valueOf(mVActivityRecognition.mo26680j()));
        if (compareTo != 0 || ((mo26680j() && (compareTo = C25082a.m62840d(this.startTime, mVActivityRecognition.startTime)) != 0) || (compareTo = Boolean.valueOf(mo26681k()).compareTo(Boolean.valueOf(mVActivityRecognition.mo26681k()))) != 0 || ((mo26681k() && (compareTo = C25082a.m62839c(this.stationary, mVActivityRecognition.stationary)) != 0) || (compareTo = Boolean.valueOf(mo26683m()).compareTo(Boolean.valueOf(mVActivityRecognition.mo26683m()))) != 0 || ((mo26683m() && (compareTo = C25082a.m62839c(this.walking, mVActivityRecognition.walking)) != 0) || (compareTo = Boolean.valueOf(mo26679i()).compareTo(Boolean.valueOf(mVActivityRecognition.mo26679i()))) != 0 || ((mo26679i() && (compareTo = C25082a.m62839c(this.running, mVActivityRecognition.running)) != 0) || (compareTo = Boolean.valueOf(mo26675f()).compareTo(Boolean.valueOf(mVActivityRecognition.mo26675f()))) != 0 || ((mo26675f() && (compareTo = C25082a.m62839c(this.automotive, mVActivityRecognition.automotive)) != 0) || (compareTo = Boolean.valueOf(mo26676g()).compareTo(Boolean.valueOf(mVActivityRecognition.mo26676g()))) != 0 || ((mo26676g() && (compareTo = C25082a.m62839c(this.cycling, mVActivityRecognition.cycling)) != 0) || (compareTo = Boolean.valueOf(mo26677h()).compareTo(Boolean.valueOf(mVActivityRecognition.mo26677h()))) != 0 || ((mo26677h() && (compareTo = C25082a.m62839c(this.foot, mVActivityRecognition.foot)) != 0) || (compareTo = Boolean.valueOf(mo26682l()).compareTo(Boolean.valueOf(mVActivityRecognition.mo26682l()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo26682l() || (c = C25082a.m62839c(this.tilt, mVActivityRecognition.tilt)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVActivityRecognition)) {
            return false;
        }
        MVActivityRecognition mVActivityRecognition = (MVActivityRecognition) obj;
        if (this.startTime == mVActivityRecognition.startTime && this.stationary == mVActivityRecognition.stationary && this.walking == mVActivityRecognition.walking && this.running == mVActivityRecognition.running && this.automotive == mVActivityRecognition.automotive && this.cycling == mVActivityRecognition.cycling && this.foot == mVActivityRecognition.foot && this.tilt == mVActivityRecognition.tilt) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26675f() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: g */
    public final boolean mo26676g() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: h */
    public final boolean mo26677h() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26679i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo26680j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo26681k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final boolean mo26682l() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: m */
    public final boolean mo26683m() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: o */
    public final void mo26684o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: p */
    public final void mo26685p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: q */
    public final void mo26686q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: r */
    public final void mo26687r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: s */
    public final void mo26688s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: t */
    public final void mo26689t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVActivityRecognition(", "startTime:");
        C25541a.m63889t(n, this.startTime, ", ", "stationary:");
        C0016g.m42z(n, this.stationary, ", ", "walking:");
        C0016g.m42z(n, this.walking, ", ", "running:");
        C0016g.m42z(n, this.running, ", ", "automotive:");
        C0016g.m42z(n, this.automotive, ", ", "cycling:");
        C0016g.m42z(n, this.cycling, ", ", "foot:");
        C0016g.m42z(n, this.foot, ", ", "tilt:");
        return C13437d.m33707l(n, this.tilt, ")");
    }

    /* renamed from: u */
    public final void mo26691u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    /* renamed from: v */
    public final void mo26692v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }
}
