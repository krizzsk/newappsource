package com.tranzmate.moovit.protocol.tripplanner;

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

public class MVTime implements TBase<MVTime, _Fields>, Serializable, Cloneable, Comparable<MVTime> {

    /* renamed from: b */
    public static final C25113c f30072b = new C25113c("startTime", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f30073c = new C25113c("endTime", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f30074d = new C25113c("isRealTime", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f30075e = new C25113c("staticStartTime", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f30076f = new C25113c("staticEndTime", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f30077g = new C25113c("isGmtTime", (byte) 2, 6);

    /* renamed from: h */
    public static final HashMap f30078h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f30079i;
    private byte __isset_bitfield = 0;
    public long endTime;
    public boolean isGmtTime;
    public boolean isRealTime;
    private _Fields[] optionals = {_Fields.STATIC_START_TIME, _Fields.STATIC_END_TIME, _Fields.IS_GMT_TIME};
    public long startTime;
    public long staticEndTime;
    public long staticStartTime;

    public enum _Fields implements C25085c {
        START_TIME(1, "startTime"),
        END_TIME(2, "endTime"),
        IS_REAL_TIME(3, "isRealTime"),
        STATIC_START_TIME(4, "staticStartTime"),
        STATIC_END_TIME(5, "staticEndTime"),
        IS_GMT_TIME(6, "isGmtTime");
        
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
                    return END_TIME;
                case 3:
                    return IS_REAL_TIME;
                case 4:
                    return STATIC_START_TIME;
                case 5:
                    return STATIC_END_TIME;
                case 6:
                    return IS_GMT_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTime$a */
    public static class C11635a extends C25239c<MVTime> {
        public C11635a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTime mVTime = (MVTime) tBase;
            mVTime.getClass();
            C25113c cVar = MVTime.f30072b;
            gVar.mo61687K();
            gVar.mo61711x(MVTime.f30072b);
            gVar.mo61679C(mVTime.startTime);
            gVar.mo61712y();
            gVar.mo61711x(MVTime.f30073c);
            gVar.mo61679C(mVTime.endTime);
            gVar.mo61712y();
            gVar.mo61711x(MVTime.f30074d);
            gVar.mo61708u(mVTime.isRealTime);
            gVar.mo61712y();
            if (mVTime.mo34582k()) {
                gVar.mo61711x(MVTime.f30075e);
                gVar.mo61679C(mVTime.staticStartTime);
                gVar.mo61712y();
            }
            if (mVTime.mo34581j()) {
                gVar.mo61711x(MVTime.f30076f);
                gVar.mo61679C(mVTime.staticEndTime);
                gVar.mo61712y();
            }
            if (mVTime.mo34577g()) {
                gVar.mo61711x(MVTime.f30077g);
                gVar.mo61708u(mVTime.isGmtTime);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTime mVTime = (MVTime) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTime.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTime.startTime = gVar.mo61697j();
                            mVTime.mo34586p();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTime.endTime = gVar.mo61697j();
                            mVTime.mo34583l();
                            break;
                        }
                    case 3:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTime.isRealTime = gVar.mo61690c();
                            mVTime.mo34585o();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTime.staticStartTime = gVar.mo61697j();
                            mVTime.mo34588r();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTime.staticEndTime = gVar.mo61697j();
                            mVTime.mo34587q();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTime.isGmtTime = gVar.mo61690c();
                            mVTime.mo34584m();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTime$b */
    public static class C11636b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11635a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTime$c */
    public static class C11637c extends C25240d<MVTime> {
        public C11637c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTime mVTime = (MVTime) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTime.mo34580i()) {
                bitSet.set(0);
            }
            if (mVTime.mo34576f()) {
                bitSet.set(1);
            }
            if (mVTime.mo34578h()) {
                bitSet.set(2);
            }
            if (mVTime.mo34582k()) {
                bitSet.set(3);
            }
            if (mVTime.mo34581j()) {
                bitSet.set(4);
            }
            if (mVTime.mo34577g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVTime.mo34580i()) {
                jVar.mo61679C(mVTime.startTime);
            }
            if (mVTime.mo34576f()) {
                jVar.mo61679C(mVTime.endTime);
            }
            if (mVTime.mo34578h()) {
                jVar.mo61708u(mVTime.isRealTime);
            }
            if (mVTime.mo34582k()) {
                jVar.mo61679C(mVTime.staticStartTime);
            }
            if (mVTime.mo34581j()) {
                jVar.mo61679C(mVTime.staticEndTime);
            }
            if (mVTime.mo34577g()) {
                jVar.mo61708u(mVTime.isGmtTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTime mVTime = (MVTime) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVTime.startTime = jVar.mo61697j();
                mVTime.mo34586p();
            }
            if (T.get(1)) {
                mVTime.endTime = jVar.mo61697j();
                mVTime.mo34583l();
            }
            if (T.get(2)) {
                mVTime.isRealTime = jVar.mo61690c();
                mVTime.mo34585o();
            }
            if (T.get(3)) {
                mVTime.staticStartTime = jVar.mo61697j();
                mVTime.mo34588r();
            }
            if (T.get(4)) {
                mVTime.staticEndTime = jVar.mo61697j();
                mVTime.mo34587q();
            }
            if (T.get(5)) {
                mVTime.isGmtTime = jVar.mo61690c();
                mVTime.mo34584m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTime$d */
    public static class C11638d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11637c(0);
        }
    }

    static {
        new C17394d0("MVTime");
        HashMap hashMap = new HashMap();
        f30078h = hashMap;
        hashMap.put(C25239c.class, new C11636b());
        hashMap.put(C25240d.class, new C11638d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.START_TIME, new FieldMetaData("startTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.END_TIME, new FieldMetaData("endTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.IS_REAL_TIME, new FieldMetaData("isRealTime", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.STATIC_START_TIME, new FieldMetaData("staticStartTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.STATIC_END_TIME, new FieldMetaData("staticEndTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.IS_GMT_TIME, new FieldMetaData("isGmtTime", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30079i = unmodifiableMap;
        FieldMetaData.m61947a(MVTime.class, unmodifiableMap);
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
        ((C25238b) f30078h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30078h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34573a(MVTime mVTime) {
        if (mVTime == null || this.startTime != mVTime.startTime || this.endTime != mVTime.endTime || this.isRealTime != mVTime.isRealTime) {
            return false;
        }
        boolean k = mo34582k();
        boolean k2 = mVTime.mo34582k();
        if ((k || k2) && (!k || !k2 || this.staticStartTime != mVTime.staticStartTime)) {
            return false;
        }
        boolean j = mo34581j();
        boolean j2 = mVTime.mo34581j();
        if ((j || j2) && (!j || !j2 || this.staticEndTime != mVTime.staticEndTime)) {
            return false;
        }
        boolean g = mo34577g();
        boolean g2 = mVTime.mo34577g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || this.isGmtTime != mVTime.isGmtTime) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVTime mVTime = (MVTime) obj;
        if (!getClass().equals(mVTime.getClass())) {
            return getClass().getName().compareTo(mVTime.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34580i()).compareTo(Boolean.valueOf(mVTime.mo34580i()));
        if (compareTo != 0 || ((mo34580i() && (compareTo = C25082a.m62840d(this.startTime, mVTime.startTime)) != 0) || (compareTo = Boolean.valueOf(mo34576f()).compareTo(Boolean.valueOf(mVTime.mo34576f()))) != 0 || ((mo34576f() && (compareTo = C25082a.m62840d(this.endTime, mVTime.endTime)) != 0) || (compareTo = Boolean.valueOf(mo34578h()).compareTo(Boolean.valueOf(mVTime.mo34578h()))) != 0 || ((mo34578h() && (compareTo = C25082a.m62848l(this.isRealTime, mVTime.isRealTime)) != 0) || (compareTo = Boolean.valueOf(mo34582k()).compareTo(Boolean.valueOf(mVTime.mo34582k()))) != 0 || ((mo34582k() && (compareTo = C25082a.m62840d(this.staticStartTime, mVTime.staticStartTime)) != 0) || (compareTo = Boolean.valueOf(mo34581j()).compareTo(Boolean.valueOf(mVTime.mo34581j()))) != 0 || ((mo34581j() && (compareTo = C25082a.m62840d(this.staticEndTime, mVTime.staticEndTime)) != 0) || (compareTo = Boolean.valueOf(mo34577g()).compareTo(Boolean.valueOf(mVTime.mo34577g()))) != 0)))))) {
            return compareTo;
        }
        if (!mo34577g() || (l = C25082a.m62848l(this.isGmtTime, mVTime.isGmtTime)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTime)) {
            return mo34573a((MVTime) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34576f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo34577g() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: h */
    public final boolean mo34578h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34580i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo34581j() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: k */
    public final boolean mo34582k() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: l */
    public final void mo34583l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo34584m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: o */
    public final void mo34585o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: p */
    public final void mo34586p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo34587q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: r */
    public final void mo34588r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTime(", "startTime:");
        C25541a.m63889t(n, this.startTime, ", ", "endTime:");
        C25541a.m63889t(n, this.endTime, ", ", "isRealTime:");
        n.append(this.isRealTime);
        if (mo34582k()) {
            n.append(", ");
            n.append("staticStartTime:");
            n.append(this.staticStartTime);
        }
        if (mo34581j()) {
            n.append(", ");
            n.append("staticEndTime:");
            n.append(this.staticEndTime);
        }
        if (mo34577g()) {
            n.append(", ");
            n.append("isGmtTime:");
            n.append(this.isGmtTime);
        }
        n.append(")");
        return n.toString();
    }
}
