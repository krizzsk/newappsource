package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVPassengerBookEvent implements TBase<MVPassengerBookEvent, _Fields>, Serializable, Cloneable, Comparable<MVPassengerBookEvent> {

    /* renamed from: b */
    public static final C25113c f28005b = new C25113c("userLocation", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28006c = new C25113c("option", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28007d = new C25113c("numberOfSeats", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f28008e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28009f;
    private byte __isset_bitfield = 0;
    public int numberOfSeats;
    public MVRSEventTransitOption option;
    public MVLocationDescriptor userLocation;

    public enum _Fields implements C25085c {
        USER_LOCATION(1, "userLocation"),
        OPTION(2, "option"),
        NUMBER_OF_SEATS(3, "numberOfSeats");
        
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
                return USER_LOCATION;
            }
            if (i == 2) {
                return OPTION;
            }
            if (i != 3) {
                return null;
            }
            return NUMBER_OF_SEATS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEvent$a */
    public static class C10302a extends C25239c<MVPassengerBookEvent> {
        public C10302a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerBookEvent mVPassengerBookEvent = (MVPassengerBookEvent) tBase;
            mVPassengerBookEvent.mo31169j();
            C25113c cVar = MVPassengerBookEvent.f28005b;
            gVar.mo61687K();
            if (mVPassengerBookEvent.userLocation != null) {
                gVar.mo61711x(MVPassengerBookEvent.f28005b);
                mVPassengerBookEvent.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerBookEvent.option != null) {
                gVar.mo61711x(MVPassengerBookEvent.f28006c);
                mVPassengerBookEvent.option.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPassengerBookEvent.f28007d);
            C16530d.m42020n(gVar, mVPassengerBookEvent.numberOfSeats);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerBookEvent mVPassengerBookEvent = (MVPassengerBookEvent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPassengerBookEvent.mo31169j();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVPassengerBookEvent.numberOfSeats = gVar.mo61696i();
                            mVPassengerBookEvent.mo31168i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVRSEventTransitOption mVRSEventTransitOption = new MVRSEventTransitOption();
                        mVPassengerBookEvent.option = mVRSEventTransitOption;
                        mVRSEventTransitOption.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                    mVPassengerBookEvent.userLocation = mVLocationDescriptor;
                    mVLocationDescriptor.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEvent$b */
    public static class C10303b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10302a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEvent$c */
    public static class C10304c extends C25240d<MVPassengerBookEvent> {
        public C10304c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerBookEvent mVPassengerBookEvent = (MVPassengerBookEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerBookEvent.mo31166h()) {
                bitSet.set(0);
            }
            if (mVPassengerBookEvent.mo31165g()) {
                bitSet.set(1);
            }
            if (mVPassengerBookEvent.mo31164f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPassengerBookEvent.mo31166h()) {
                mVPassengerBookEvent.userLocation.mo25202X0(jVar);
            }
            if (mVPassengerBookEvent.mo31165g()) {
                mVPassengerBookEvent.option.mo25202X0(jVar);
            }
            if (mVPassengerBookEvent.mo31164f()) {
                jVar.mo61678B(mVPassengerBookEvent.numberOfSeats);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerBookEvent mVPassengerBookEvent = (MVPassengerBookEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVPassengerBookEvent.userLocation = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVRSEventTransitOption mVRSEventTransitOption = new MVRSEventTransitOption();
                mVPassengerBookEvent.option = mVRSEventTransitOption;
                mVRSEventTransitOption.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPassengerBookEvent.numberOfSeats = jVar.mo61696i();
                mVPassengerBookEvent.mo31168i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEvent$d */
    public static class C10305d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10304c(0);
        }
    }

    static {
        new C17394d0("MVPassengerBookEvent");
        HashMap hashMap = new HashMap();
        f28008e = hashMap;
        hashMap.put(C25239c.class, new C10303b());
        hashMap.put(C25240d.class, new C10305d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.OPTION, new FieldMetaData("option", (byte) 3, new StructMetaData(MVRSEventTransitOption.class)));
        enumMap.put(_Fields.NUMBER_OF_SEATS, new FieldMetaData("numberOfSeats", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28009f = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerBookEvent.class, unmodifiableMap);
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
        ((C25238b) f28008e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28008e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31161a(MVPassengerBookEvent mVPassengerBookEvent) {
        if (mVPassengerBookEvent == null) {
            return false;
        }
        boolean h = mo31166h();
        boolean h2 = mVPassengerBookEvent.mo31166h();
        if ((h || h2) && (!h || !h2 || !this.userLocation.mo26317a(mVPassengerBookEvent.userLocation))) {
            return false;
        }
        boolean g = mo31165g();
        boolean g2 = mVPassengerBookEvent.mo31165g();
        if (((g || g2) && (!g || !g2 || !this.option.mo31318a(mVPassengerBookEvent.option))) || this.numberOfSeats != mVPassengerBookEvent.numberOfSeats) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVPassengerBookEvent mVPassengerBookEvent = (MVPassengerBookEvent) obj;
        if (!getClass().equals(mVPassengerBookEvent.getClass())) {
            return getClass().getName().compareTo(mVPassengerBookEvent.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31166h()).compareTo(Boolean.valueOf(mVPassengerBookEvent.mo31166h()));
        if (compareTo != 0 || ((mo31166h() && (compareTo = this.userLocation.compareTo(mVPassengerBookEvent.userLocation)) != 0) || (compareTo = Boolean.valueOf(mo31165g()).compareTo(Boolean.valueOf(mVPassengerBookEvent.mo31165g()))) != 0 || ((mo31165g() && (compareTo = this.option.compareTo(mVPassengerBookEvent.option)) != 0) || (compareTo = Boolean.valueOf(mo31164f()).compareTo(Boolean.valueOf(mVPassengerBookEvent.mo31164f()))) != 0))) {
            return compareTo;
        }
        if (!mo31164f() || (c = C25082a.m62839c(this.numberOfSeats, mVPassengerBookEvent.numberOfSeats)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPassengerBookEvent)) {
            return mo31161a((MVPassengerBookEvent) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31164f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31165g() {
        return this.option != null;
    }

    /* renamed from: h */
    public final boolean mo31166h() {
        return this.userLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31168i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo31169j() throws TException {
        MVLocationDescriptor mVLocationDescriptor = this.userLocation;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVRSEventTransitOption mVRSEventTransitOption = this.option;
        if (mVRSEventTransitOption != null) {
            mVRSEventTransitOption.mo31335t();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerBookEvent(", "userLocation:");
        MVLocationDescriptor mVLocationDescriptor = this.userLocation;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        n.append(", ");
        n.append("option:");
        MVRSEventTransitOption mVRSEventTransitOption = this.option;
        if (mVRSEventTransitOption == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRSEventTransitOption);
        }
        n.append(", ");
        n.append("numberOfSeats:");
        return C13437d.m33707l(n, this.numberOfSeats, ")");
    }
}
