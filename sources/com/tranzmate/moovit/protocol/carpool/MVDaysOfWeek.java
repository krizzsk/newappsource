package com.tranzmate.moovit.protocol.carpool;

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
import p001a0.C0017h;
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

public class MVDaysOfWeek implements TBase<MVDaysOfWeek, _Fields>, Serializable, Cloneable, Comparable<MVDaysOfWeek> {

    /* renamed from: b */
    public static final C25113c f24694b = new C25113c("sunday", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f24695c = new C25113c("monday", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f24696d = new C25113c("tuesday", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f24697e = new C25113c("wednsday", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f24698f = new C25113c("thursday", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f24699g = new C25113c("friday", (byte) 2, 6);

    /* renamed from: h */
    public static final C25113c f24700h = new C25113c("saturday", (byte) 2, 7);

    /* renamed from: i */
    public static final HashMap f24701i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f24702j;
    private byte __isset_bitfield = 0;
    public boolean friday;
    public boolean monday;
    public boolean saturday;
    public boolean sunday;
    public boolean thursday;
    public boolean tuesday;
    public boolean wednsday;

    public enum _Fields implements C25085c {
        SUNDAY(1, "sunday"),
        MONDAY(2, "monday"),
        TUESDAY(3, "tuesday"),
        WEDNSDAY(4, "wednsday"),
        THURSDAY(5, "thursday"),
        FRIDAY(6, "friday"),
        SATURDAY(7, "saturday");
        
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
                    return SUNDAY;
                case 2:
                    return MONDAY;
                case 3:
                    return TUESDAY;
                case 4:
                    return WEDNSDAY;
                case 5:
                    return THURSDAY;
                case 6:
                    return FRIDAY;
                case 7:
                    return SATURDAY;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDaysOfWeek$a */
    public static class C8198a extends C25239c<MVDaysOfWeek> {
        public C8198a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDaysOfWeek mVDaysOfWeek = (MVDaysOfWeek) tBase;
            mVDaysOfWeek.getClass();
            C25113c cVar = MVDaysOfWeek.f24694b;
            gVar.mo61687K();
            gVar.mo61711x(MVDaysOfWeek.f24694b);
            gVar.mo61708u(mVDaysOfWeek.sunday);
            gVar.mo61712y();
            gVar.mo61711x(MVDaysOfWeek.f24695c);
            gVar.mo61708u(mVDaysOfWeek.monday);
            gVar.mo61712y();
            gVar.mo61711x(MVDaysOfWeek.f24696d);
            gVar.mo61708u(mVDaysOfWeek.tuesday);
            gVar.mo61712y();
            gVar.mo61711x(MVDaysOfWeek.f24697e);
            gVar.mo61708u(mVDaysOfWeek.wednsday);
            gVar.mo61712y();
            gVar.mo61711x(MVDaysOfWeek.f24698f);
            gVar.mo61708u(mVDaysOfWeek.thursday);
            gVar.mo61712y();
            gVar.mo61711x(MVDaysOfWeek.f24699g);
            gVar.mo61708u(mVDaysOfWeek.friday);
            gVar.mo61712y();
            gVar.mo61711x(MVDaysOfWeek.f24700h);
            C0017h.m62S(gVar, mVDaysOfWeek.saturday);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDaysOfWeek mVDaysOfWeek = (MVDaysOfWeek) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDaysOfWeek.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDaysOfWeek.sunday = gVar.mo61690c();
                            mVDaysOfWeek.mo25587q();
                            break;
                        }
                    case 2:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDaysOfWeek.monday = gVar.mo61690c();
                            mVDaysOfWeek.mo25585o();
                            break;
                        }
                    case 3:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDaysOfWeek.tuesday = gVar.mo61690c();
                            mVDaysOfWeek.mo25589s();
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDaysOfWeek.wednsday = gVar.mo61690c();
                            mVDaysOfWeek.mo25590t();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDaysOfWeek.thursday = gVar.mo61690c();
                            mVDaysOfWeek.mo25588r();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDaysOfWeek.friday = gVar.mo61690c();
                            mVDaysOfWeek.mo25584m();
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDaysOfWeek.saturday = gVar.mo61690c();
                            mVDaysOfWeek.mo25586p();
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDaysOfWeek$b */
    public static class C8199b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8198a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDaysOfWeek$c */
    public static class C8200c extends C25240d<MVDaysOfWeek> {
        public C8200c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDaysOfWeek mVDaysOfWeek = (MVDaysOfWeek) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDaysOfWeek.mo25580i()) {
                bitSet.set(0);
            }
            if (mVDaysOfWeek.mo25577g()) {
                bitSet.set(1);
            }
            if (mVDaysOfWeek.mo25582k()) {
                bitSet.set(2);
            }
            if (mVDaysOfWeek.mo25583l()) {
                bitSet.set(3);
            }
            if (mVDaysOfWeek.mo25581j()) {
                bitSet.set(4);
            }
            if (mVDaysOfWeek.mo25576f()) {
                bitSet.set(5);
            }
            if (mVDaysOfWeek.mo25578h()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVDaysOfWeek.mo25580i()) {
                jVar.mo61708u(mVDaysOfWeek.sunday);
            }
            if (mVDaysOfWeek.mo25577g()) {
                jVar.mo61708u(mVDaysOfWeek.monday);
            }
            if (mVDaysOfWeek.mo25582k()) {
                jVar.mo61708u(mVDaysOfWeek.tuesday);
            }
            if (mVDaysOfWeek.mo25583l()) {
                jVar.mo61708u(mVDaysOfWeek.wednsday);
            }
            if (mVDaysOfWeek.mo25581j()) {
                jVar.mo61708u(mVDaysOfWeek.thursday);
            }
            if (mVDaysOfWeek.mo25576f()) {
                jVar.mo61708u(mVDaysOfWeek.friday);
            }
            if (mVDaysOfWeek.mo25578h()) {
                jVar.mo61708u(mVDaysOfWeek.saturday);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDaysOfWeek mVDaysOfWeek = (MVDaysOfWeek) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVDaysOfWeek.sunday = jVar.mo61690c();
                mVDaysOfWeek.mo25587q();
            }
            if (T.get(1)) {
                mVDaysOfWeek.monday = jVar.mo61690c();
                mVDaysOfWeek.mo25585o();
            }
            if (T.get(2)) {
                mVDaysOfWeek.tuesday = jVar.mo61690c();
                mVDaysOfWeek.mo25589s();
            }
            if (T.get(3)) {
                mVDaysOfWeek.wednsday = jVar.mo61690c();
                mVDaysOfWeek.mo25590t();
            }
            if (T.get(4)) {
                mVDaysOfWeek.thursday = jVar.mo61690c();
                mVDaysOfWeek.mo25588r();
            }
            if (T.get(5)) {
                mVDaysOfWeek.friday = jVar.mo61690c();
                mVDaysOfWeek.mo25584m();
            }
            if (T.get(6)) {
                mVDaysOfWeek.saturday = jVar.mo61690c();
                mVDaysOfWeek.mo25586p();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVDaysOfWeek$d */
    public static class C8201d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8200c(0);
        }
    }

    static {
        new C17394d0("MVDaysOfWeek");
        HashMap hashMap = new HashMap();
        f24701i = hashMap;
        hashMap.put(C25239c.class, new C8199b());
        hashMap.put(C25240d.class, new C8201d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUNDAY, new FieldMetaData("sunday", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MONDAY, new FieldMetaData("monday", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.TUESDAY, new FieldMetaData("tuesday", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.WEDNSDAY, new FieldMetaData("wednsday", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.THURSDAY, new FieldMetaData("thursday", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.FRIDAY, new FieldMetaData("friday", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SATURDAY, new FieldMetaData("saturday", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24702j = unmodifiableMap;
        FieldMetaData.m61947a(MVDaysOfWeek.class, unmodifiableMap);
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
        ((C25238b) f24701i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24701i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25573a(MVDaysOfWeek mVDaysOfWeek) {
        if (mVDaysOfWeek != null && this.sunday == mVDaysOfWeek.sunday && this.monday == mVDaysOfWeek.monday && this.tuesday == mVDaysOfWeek.tuesday && this.wednsday == mVDaysOfWeek.wednsday && this.thursday == mVDaysOfWeek.thursday && this.friday == mVDaysOfWeek.friday && this.saturday == mVDaysOfWeek.saturday) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int l;
        MVDaysOfWeek mVDaysOfWeek = (MVDaysOfWeek) obj;
        if (!getClass().equals(mVDaysOfWeek.getClass())) {
            return getClass().getName().compareTo(mVDaysOfWeek.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25580i()).compareTo(Boolean.valueOf(mVDaysOfWeek.mo25580i()));
        if (compareTo != 0 || ((mo25580i() && (compareTo = C25082a.m62848l(this.sunday, mVDaysOfWeek.sunday)) != 0) || (compareTo = Boolean.valueOf(mo25577g()).compareTo(Boolean.valueOf(mVDaysOfWeek.mo25577g()))) != 0 || ((mo25577g() && (compareTo = C25082a.m62848l(this.monday, mVDaysOfWeek.monday)) != 0) || (compareTo = Boolean.valueOf(mo25582k()).compareTo(Boolean.valueOf(mVDaysOfWeek.mo25582k()))) != 0 || ((mo25582k() && (compareTo = C25082a.m62848l(this.tuesday, mVDaysOfWeek.tuesday)) != 0) || (compareTo = Boolean.valueOf(mo25583l()).compareTo(Boolean.valueOf(mVDaysOfWeek.mo25583l()))) != 0 || ((mo25583l() && (compareTo = C25082a.m62848l(this.wednsday, mVDaysOfWeek.wednsday)) != 0) || (compareTo = Boolean.valueOf(mo25581j()).compareTo(Boolean.valueOf(mVDaysOfWeek.mo25581j()))) != 0 || ((mo25581j() && (compareTo = C25082a.m62848l(this.thursday, mVDaysOfWeek.thursday)) != 0) || (compareTo = Boolean.valueOf(mo25576f()).compareTo(Boolean.valueOf(mVDaysOfWeek.mo25576f()))) != 0 || ((mo25576f() && (compareTo = C25082a.m62848l(this.friday, mVDaysOfWeek.friday)) != 0) || (compareTo = Boolean.valueOf(mo25578h()).compareTo(Boolean.valueOf(mVDaysOfWeek.mo25578h()))) != 0))))))) {
            return compareTo;
        }
        if (!mo25578h() || (l = C25082a.m62848l(this.saturday, mVDaysOfWeek.saturday)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVDaysOfWeek)) {
            return mo25573a((MVDaysOfWeek) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25576f() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: g */
    public final boolean mo25577g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo25578h() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25580i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo25581j() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: k */
    public final boolean mo25582k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final boolean mo25583l() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: m */
    public final void mo25584m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: o */
    public final void mo25585o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo25586p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: q */
    public final void mo25587q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: r */
    public final void mo25588r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: s */
    public final void mo25589s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: t */
    public final void mo25590t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDaysOfWeek(", "sunday:");
        C13555b.m33977q(n, this.sunday, ", ", "monday:");
        C13555b.m33977q(n, this.monday, ", ", "tuesday:");
        C13555b.m33977q(n, this.tuesday, ", ", "wednsday:");
        C13555b.m33977q(n, this.wednsday, ", ", "thursday:");
        C13555b.m33977q(n, this.thursday, ", ", "friday:");
        C13555b.m33977q(n, this.friday, ", ", "saturday:");
        return C25541a.m63885p(n, this.saturday, ")");
    }
}
