package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVRecurrentRideDetails implements TBase<MVRecurrentRideDetails, _Fields>, Serializable, Cloneable, Comparable<MVRecurrentRideDetails> {

    /* renamed from: b */
    public static final C25113c f24841b = new C25113c("rideScheduleId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24842c = new C25113c("days", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f24843d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24844e;
    private byte __isset_bitfield = 0;
    public MVDaysOfWeek days;
    public int rideScheduleId;

    public enum _Fields implements C25085c {
        RIDE_SCHEDULE_ID(1, "rideScheduleId"),
        DAYS(2, "days");
        
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
                return RIDE_SCHEDULE_ID;
            }
            if (i != 2) {
                return null;
            }
            return DAYS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRecurrentRideDetails$a */
    public static class C8295a extends C25239c<MVRecurrentRideDetails> {
        public C8295a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRecurrentRideDetails mVRecurrentRideDetails = (MVRecurrentRideDetails) tBase;
            MVDaysOfWeek mVDaysOfWeek = mVRecurrentRideDetails.days;
            C25113c cVar = MVRecurrentRideDetails.f24841b;
            gVar.mo61687K();
            gVar.mo61711x(MVRecurrentRideDetails.f24841b);
            gVar.mo61678B(mVRecurrentRideDetails.rideScheduleId);
            gVar.mo61712y();
            if (mVRecurrentRideDetails.days != null) {
                gVar.mo61711x(MVRecurrentRideDetails.f24842c);
                mVRecurrentRideDetails.days.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRecurrentRideDetails mVRecurrentRideDetails = (MVRecurrentRideDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVDaysOfWeek mVDaysOfWeek = mVRecurrentRideDetails.days;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVDaysOfWeek mVDaysOfWeek2 = new MVDaysOfWeek();
                        mVRecurrentRideDetails.days = mVDaysOfWeek2;
                        mVDaysOfWeek2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVRecurrentRideDetails.rideScheduleId = gVar.mo61696i();
                    mVRecurrentRideDetails.mo25841h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRecurrentRideDetails$b */
    public static class C8296b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8295a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRecurrentRideDetails$c */
    public static class C8297c extends C25240d<MVRecurrentRideDetails> {
        public C8297c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRecurrentRideDetails mVRecurrentRideDetails = (MVRecurrentRideDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRecurrentRideDetails.mo25840g()) {
                bitSet.set(0);
            }
            if (mVRecurrentRideDetails.mo25839f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVRecurrentRideDetails.mo25840g()) {
                jVar.mo61678B(mVRecurrentRideDetails.rideScheduleId);
            }
            if (mVRecurrentRideDetails.mo25839f()) {
                mVRecurrentRideDetails.days.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRecurrentRideDetails mVRecurrentRideDetails = (MVRecurrentRideDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVRecurrentRideDetails.rideScheduleId = jVar.mo61696i();
                mVRecurrentRideDetails.mo25841h();
            }
            if (T.get(1)) {
                MVDaysOfWeek mVDaysOfWeek = new MVDaysOfWeek();
                mVRecurrentRideDetails.days = mVDaysOfWeek;
                mVDaysOfWeek.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRecurrentRideDetails$d */
    public static class C8298d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8297c(0);
        }
    }

    static {
        new C17394d0("MVRecurrentRideDetails");
        HashMap hashMap = new HashMap();
        f24843d = hashMap;
        hashMap.put(C25239c.class, new C8296b());
        hashMap.put(C25240d.class, new C8298d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_SCHEDULE_ID, new FieldMetaData("rideScheduleId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DAYS, new FieldMetaData("days", (byte) 3, new StructMetaData(MVDaysOfWeek.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24844e = unmodifiableMap;
        FieldMetaData.m61947a(MVRecurrentRideDetails.class, unmodifiableMap);
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
        ((C25238b) f24843d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24843d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25836a(MVRecurrentRideDetails mVRecurrentRideDetails) {
        if (mVRecurrentRideDetails == null || this.rideScheduleId != mVRecurrentRideDetails.rideScheduleId) {
            return false;
        }
        boolean f = mo25839f();
        boolean f2 = mVRecurrentRideDetails.mo25839f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.days.mo25573a(mVRecurrentRideDetails.days)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRecurrentRideDetails mVRecurrentRideDetails = (MVRecurrentRideDetails) obj;
        if (!getClass().equals(mVRecurrentRideDetails.getClass())) {
            return getClass().getName().compareTo(mVRecurrentRideDetails.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25840g()).compareTo(Boolean.valueOf(mVRecurrentRideDetails.mo25840g()));
        if (compareTo2 != 0 || ((mo25840g() && (compareTo2 = C25082a.m62839c(this.rideScheduleId, mVRecurrentRideDetails.rideScheduleId)) != 0) || (compareTo2 = Boolean.valueOf(mo25839f()).compareTo(Boolean.valueOf(mVRecurrentRideDetails.mo25839f()))) != 0)) {
            return compareTo2;
        }
        if (!mo25839f() || (compareTo = this.days.compareTo(mVRecurrentRideDetails.days)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVRecurrentRideDetails)) {
            return mo25836a((MVRecurrentRideDetails) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25839f() {
        return this.days != null;
    }

    /* renamed from: g */
    public final boolean mo25840g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo25841h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRecurrentRideDetails(", "rideScheduleId:");
        C0016g.m42z(n, this.rideScheduleId, ", ", "days:");
        MVDaysOfWeek mVDaysOfWeek = this.days;
        if (mVDaysOfWeek == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDaysOfWeek);
        }
        n.append(")");
        return n.toString();
    }
}
