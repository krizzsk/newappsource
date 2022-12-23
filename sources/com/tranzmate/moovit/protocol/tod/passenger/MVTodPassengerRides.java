package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodPassengerRides implements TBase<MVTodPassengerRides, _Fields>, Serializable, Cloneable, Comparable<MVTodPassengerRides> {

    /* renamed from: b */
    public static final C25113c f29509b = new C25113c("rides", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29510c = new C25113c("subscriptions", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f29511d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29512e;
    public List<MVTodRide> rides;
    public List<MVTodSubscription> subscriptions;

    public enum _Fields implements C25085c {
        RIDES(1, "rides"),
        SUBSCRIPTIONS(2, "subscriptions");
        
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
                return RIDES;
            }
            if (i != 2) {
                return null;
            }
            return SUBSCRIPTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerRides$a */
    public static class C11291a extends C25239c<MVTodPassengerRides> {
        public C11291a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerRides mVTodPassengerRides = (MVTodPassengerRides) tBase;
            mVTodPassengerRides.getClass();
            C25113c cVar = MVTodPassengerRides.f29509b;
            gVar.mo61687K();
            if (mVTodPassengerRides.rides != null) {
                gVar.mo61711x(MVTodPassengerRides.f29509b);
                gVar.mo61680D(new C25119e((byte) 12, mVTodPassengerRides.rides.size()));
                for (MVTodRide X0 : mVTodPassengerRides.rides) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodPassengerRides.subscriptions != null) {
                gVar.mo61711x(MVTodPassengerRides.f29510c);
                gVar.mo61680D(new C25119e((byte) 12, mVTodPassengerRides.subscriptions.size()));
                for (MVTodSubscription X02 : mVTodPassengerRides.subscriptions) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerRides mVTodPassengerRides = (MVTodPassengerRides) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodPassengerRides.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVTodPassengerRides.subscriptions = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            MVTodSubscription mVTodSubscription = new MVTodSubscription();
                            mVTodSubscription.mo25201C1(gVar);
                            mVTodPassengerRides.subscriptions.add(mVTodSubscription);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVTodPassengerRides.rides = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVTodRide mVTodRide = new MVTodRide();
                        mVTodRide.mo25201C1(gVar);
                        mVTodPassengerRides.rides.add(mVTodRide);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerRides$b */
    public static class C11292b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11291a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerRides$c */
    public static class C11293c extends C25240d<MVTodPassengerRides> {
        public C11293c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerRides mVTodPassengerRides = (MVTodPassengerRides) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodPassengerRides.mo33614f()) {
                bitSet.set(0);
            }
            if (mVTodPassengerRides.mo33615g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodPassengerRides.mo33614f()) {
                jVar.mo61678B(mVTodPassengerRides.rides.size());
                for (MVTodRide X0 : mVTodPassengerRides.rides) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTodPassengerRides.mo33615g()) {
                jVar.mo61678B(mVTodPassengerRides.subscriptions.size());
                for (MVTodSubscription X02 : mVTodPassengerRides.subscriptions) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerRides mVTodPassengerRides = (MVTodPassengerRides) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVTodPassengerRides.rides = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodRide mVTodRide = new MVTodRide();
                    mVTodRide.mo25201C1(jVar);
                    mVTodPassengerRides.rides.add(mVTodRide);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVTodPassengerRides.subscriptions = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVTodSubscription mVTodSubscription = new MVTodSubscription();
                    mVTodSubscription.mo25201C1(jVar);
                    mVTodPassengerRides.subscriptions.add(mVTodSubscription);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerRides$d */
    public static class C11294d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11293c(0);
        }
    }

    static {
        new C17394d0("MVTodPassengerRides");
        HashMap hashMap = new HashMap();
        f29511d = hashMap;
        hashMap.put(C25239c.class, new C11292b());
        hashMap.put(C25240d.class, new C11294d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDES, new FieldMetaData("rides", (byte) 3, new ListMetaData(new StructMetaData(MVTodRide.class))));
        enumMap.put(_Fields.SUBSCRIPTIONS, new FieldMetaData("subscriptions", (byte) 3, new ListMetaData(new StructMetaData(MVTodSubscription.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29512e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodPassengerRides.class, unmodifiableMap);
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
        ((C25238b) f29511d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29511d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTodPassengerRides mVTodPassengerRides = (MVTodPassengerRides) obj;
        if (!getClass().equals(mVTodPassengerRides.getClass())) {
            return getClass().getName().compareTo(mVTodPassengerRides.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33614f()).compareTo(Boolean.valueOf(mVTodPassengerRides.mo33614f()));
        if (compareTo != 0 || ((mo33614f() && (compareTo = C25082a.m62844h(this.rides, mVTodPassengerRides.rides)) != 0) || (compareTo = Boolean.valueOf(mo33615g()).compareTo(Boolean.valueOf(mVTodPassengerRides.mo33615g()))) != 0)) {
            return compareTo;
        }
        if (!mo33615g() || (h = C25082a.m62844h(this.subscriptions, mVTodPassengerRides.subscriptions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodPassengerRides)) {
            return false;
        }
        MVTodPassengerRides mVTodPassengerRides = (MVTodPassengerRides) obj;
        boolean f = mo33614f();
        boolean f2 = mVTodPassengerRides.mo33614f();
        if ((f || f2) && (!f || !f2 || !this.rides.equals(mVTodPassengerRides.rides))) {
            return false;
        }
        boolean g = mo33615g();
        boolean g2 = mVTodPassengerRides.mo33615g();
        if ((g || g2) && (!g || !g2 || !this.subscriptions.equals(mVTodPassengerRides.subscriptions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33614f() {
        return this.rides != null;
    }

    /* renamed from: g */
    public final boolean mo33615g() {
        return this.subscriptions != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodPassengerRides(", "rides:");
        List<MVTodRide> list = this.rides;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("subscriptions:");
        List<MVTodSubscription> list2 = this.subscriptions;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
