package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVPassengerStops implements TBase<MVPassengerStops, _Fields>, Serializable, Cloneable, Comparable<MVPassengerStops> {

    /* renamed from: b */
    public static final C25113c f24822b = new C25113c("pickUp", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24823c = new C25113c("dropOff", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24824d = new C25113c(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f24825e = new C25113c("destination", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f24826f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24827g;
    public MVLocationDescriptor destination;
    public MVPassengerStop dropOff;
    private _Fields[] optionals = {_Fields.ORIGIN, _Fields.DESTINATION};
    public MVLocationDescriptor origin;
    public MVPassengerStop pickUp;

    public enum _Fields implements C25085c {
        PICK_UP(1, "pickUp"),
        DROP_OFF(2, "dropOff"),
        ORIGIN(3, AppMeasurementSdk.ConditionalUserProperty.ORIGIN),
        DESTINATION(4, "destination");
        
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
                return PICK_UP;
            }
            if (i == 2) {
                return DROP_OFF;
            }
            if (i == 3) {
                return ORIGIN;
            }
            if (i != 4) {
                return null;
            }
            return DESTINATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerStops$a */
    public static class C8279a extends C25239c<MVPassengerStops> {
        public C8279a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerStops mVPassengerStops = (MVPassengerStops) tBase;
            mVPassengerStops.mo25808j();
            C25113c cVar = MVPassengerStops.f24822b;
            gVar.mo61687K();
            if (mVPassengerStops.pickUp != null) {
                gVar.mo61711x(MVPassengerStops.f24822b);
                mVPassengerStops.pickUp.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerStops.dropOff != null) {
                gVar.mo61711x(MVPassengerStops.f24823c);
                mVPassengerStops.dropOff.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerStops.origin != null && mVPassengerStops.mo25805h()) {
                gVar.mo61711x(MVPassengerStops.f24824d);
                mVPassengerStops.origin.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerStops.destination != null && mVPassengerStops.mo25803f()) {
                gVar.mo61711x(MVPassengerStops.f24825e);
                mVPassengerStops.destination.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerStops mVPassengerStops = (MVPassengerStops) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPassengerStops.mo25808j();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                                mVPassengerStops.destination = mVLocationDescriptor;
                                mVLocationDescriptor.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                            mVPassengerStops.origin = mVLocationDescriptor2;
                            mVLocationDescriptor2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVPassengerStop mVPassengerStop = new MVPassengerStop();
                        mVPassengerStops.dropOff = mVPassengerStop;
                        mVPassengerStop.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPassengerStop mVPassengerStop2 = new MVPassengerStop();
                    mVPassengerStops.pickUp = mVPassengerStop2;
                    mVPassengerStop2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerStops$b */
    public static class C8280b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8279a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerStops$c */
    public static class C8281c extends C25240d<MVPassengerStops> {
        public C8281c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerStops mVPassengerStops = (MVPassengerStops) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerStops.mo25807i()) {
                bitSet.set(0);
            }
            if (mVPassengerStops.mo25804g()) {
                bitSet.set(1);
            }
            if (mVPassengerStops.mo25805h()) {
                bitSet.set(2);
            }
            if (mVPassengerStops.mo25803f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPassengerStops.mo25807i()) {
                mVPassengerStops.pickUp.mo25202X0(jVar);
            }
            if (mVPassengerStops.mo25804g()) {
                mVPassengerStops.dropOff.mo25202X0(jVar);
            }
            if (mVPassengerStops.mo25805h()) {
                mVPassengerStops.origin.mo25202X0(jVar);
            }
            if (mVPassengerStops.mo25803f()) {
                mVPassengerStops.destination.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerStops mVPassengerStops = (MVPassengerStops) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVPassengerStop mVPassengerStop = new MVPassengerStop();
                mVPassengerStops.pickUp = mVPassengerStop;
                mVPassengerStop.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVPassengerStop mVPassengerStop2 = new MVPassengerStop();
                mVPassengerStops.dropOff = mVPassengerStop2;
                mVPassengerStop2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVPassengerStops.origin = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                mVPassengerStops.destination = mVLocationDescriptor2;
                mVLocationDescriptor2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerStops$d */
    public static class C8282d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8281c(0);
        }
    }

    static {
        new C17394d0("MVPassengerStops");
        HashMap hashMap = new HashMap();
        f24826f = hashMap;
        hashMap.put(C25239c.class, new C8280b());
        hashMap.put(C25240d.class, new C8282d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PICK_UP, new FieldMetaData("pickUp", (byte) 3, new StructMetaData(MVPassengerStop.class)));
        enumMap.put(_Fields.DROP_OFF, new FieldMetaData("dropOff", (byte) 3, new StructMetaData(MVPassengerStop.class)));
        enumMap.put(_Fields.ORIGIN, new FieldMetaData(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.DESTINATION, new FieldMetaData("destination", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24827g = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerStops.class, unmodifiableMap);
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
        ((C25238b) f24826f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24826f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25800a(MVPassengerStops mVPassengerStops) {
        if (mVPassengerStops == null) {
            return false;
        }
        boolean i = mo25807i();
        boolean i2 = mVPassengerStops.mo25807i();
        if ((i || i2) && (!i || !i2 || !this.pickUp.mo25790a(mVPassengerStops.pickUp))) {
            return false;
        }
        boolean g = mo25804g();
        boolean g2 = mVPassengerStops.mo25804g();
        if ((g || g2) && (!g || !g2 || !this.dropOff.mo25790a(mVPassengerStops.dropOff))) {
            return false;
        }
        boolean h = mo25805h();
        boolean h2 = mVPassengerStops.mo25805h();
        if ((h || h2) && (!h || !h2 || !this.origin.mo26317a(mVPassengerStops.origin))) {
            return false;
        }
        boolean f = mo25803f();
        boolean f2 = mVPassengerStops.mo25803f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.destination.mo26317a(mVPassengerStops.destination)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerStops mVPassengerStops = (MVPassengerStops) obj;
        if (!getClass().equals(mVPassengerStops.getClass())) {
            return getClass().getName().compareTo(mVPassengerStops.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25807i()).compareTo(Boolean.valueOf(mVPassengerStops.mo25807i()));
        if (compareTo2 != 0 || ((mo25807i() && (compareTo2 = this.pickUp.compareTo(mVPassengerStops.pickUp)) != 0) || (compareTo2 = Boolean.valueOf(mo25804g()).compareTo(Boolean.valueOf(mVPassengerStops.mo25804g()))) != 0 || ((mo25804g() && (compareTo2 = this.dropOff.compareTo(mVPassengerStops.dropOff)) != 0) || (compareTo2 = Boolean.valueOf(mo25805h()).compareTo(Boolean.valueOf(mVPassengerStops.mo25805h()))) != 0 || ((mo25805h() && (compareTo2 = this.origin.compareTo(mVPassengerStops.origin)) != 0) || (compareTo2 = Boolean.valueOf(mo25803f()).compareTo(Boolean.valueOf(mVPassengerStops.mo25803f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo25803f() || (compareTo = this.destination.compareTo(mVPassengerStops.destination)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPassengerStops)) {
            return mo25800a((MVPassengerStops) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25803f() {
        return this.destination != null;
    }

    /* renamed from: g */
    public final boolean mo25804g() {
        return this.dropOff != null;
    }

    /* renamed from: h */
    public final boolean mo25805h() {
        return this.origin != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25807i() {
        return this.pickUp != null;
    }

    /* renamed from: j */
    public final void mo25808j() throws TException {
        MVPassengerStop mVPassengerStop = this.pickUp;
        if (mVPassengerStop != null) {
            mVPassengerStop.getClass();
        }
        MVPassengerStop mVPassengerStop2 = this.dropOff;
        if (mVPassengerStop2 != null) {
            mVPassengerStop2.getClass();
        }
        MVLocationDescriptor mVLocationDescriptor = this.origin;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor2 = this.destination;
        if (mVLocationDescriptor2 != null) {
            mVLocationDescriptor2.mo26333s();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerStops(", "pickUp:");
        MVPassengerStop mVPassengerStop = this.pickUp;
        if (mVPassengerStop == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerStop);
        }
        n.append(", ");
        n.append("dropOff:");
        MVPassengerStop mVPassengerStop2 = this.dropOff;
        if (mVPassengerStop2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerStop2);
        }
        if (mo25805h()) {
            n.append(", ");
            n.append("origin:");
            MVLocationDescriptor mVLocationDescriptor = this.origin;
            if (mVLocationDescriptor == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationDescriptor);
            }
        }
        if (mo25803f()) {
            n.append(", ");
            n.append("destination:");
            MVLocationDescriptor mVLocationDescriptor2 = this.destination;
            if (mVLocationDescriptor2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationDescriptor2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
