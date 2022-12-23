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

public class MVPassengerGetRideResponse implements TBase<MVPassengerGetRideResponse, _Fields>, Serializable, Cloneable, Comparable<MVPassengerGetRideResponse> {

    /* renamed from: b */
    public static final C25113c f24780b = new C25113c("driver", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24781c = new C25113c("ride", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f24782d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24783e;
    public MVCarpoolDriver driver;
    public MVPassengerRide ride;

    public enum _Fields implements C25085c {
        DRIVER(1, "driver"),
        RIDE(2, "ride");
        
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
                return DRIVER;
            }
            if (i != 2) {
                return null;
            }
            return RIDE;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideResponse$a */
    public static class C8258a extends C25239c<MVPassengerGetRideResponse> {
        public C8258a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerGetRideResponse mVPassengerGetRideResponse = (MVPassengerGetRideResponse) tBase;
            MVCarpoolDriver mVCarpoolDriver = mVPassengerGetRideResponse.driver;
            C25113c cVar = MVPassengerGetRideResponse.f24780b;
            gVar.mo61687K();
            if (mVPassengerGetRideResponse.driver != null) {
                gVar.mo61711x(MVPassengerGetRideResponse.f24780b);
                mVPassengerGetRideResponse.driver.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerGetRideResponse.ride != null) {
                gVar.mo61711x(MVPassengerGetRideResponse.f24781c);
                mVPassengerGetRideResponse.ride.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerGetRideResponse mVPassengerGetRideResponse = (MVPassengerGetRideResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCarpoolDriver mVCarpoolDriver = mVPassengerGetRideResponse.driver;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVPassengerRide mVPassengerRide = new MVPassengerRide();
                        mVPassengerGetRideResponse.ride = mVPassengerRide;
                        mVPassengerRide.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCarpoolDriver mVCarpoolDriver2 = new MVCarpoolDriver();
                    mVPassengerGetRideResponse.driver = mVCarpoolDriver2;
                    mVCarpoolDriver2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideResponse$b */
    public static class C8259b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8258a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideResponse$c */
    public static class C8260c extends C25240d<MVPassengerGetRideResponse> {
        public C8260c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerGetRideResponse mVPassengerGetRideResponse = (MVPassengerGetRideResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerGetRideResponse.mo25734f()) {
                bitSet.set(0);
            }
            if (mVPassengerGetRideResponse.mo25735g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPassengerGetRideResponse.mo25734f()) {
                mVPassengerGetRideResponse.driver.mo25202X0(jVar);
            }
            if (mVPassengerGetRideResponse.mo25735g()) {
                mVPassengerGetRideResponse.ride.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerGetRideResponse mVPassengerGetRideResponse = (MVPassengerGetRideResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVCarpoolDriver mVCarpoolDriver = new MVCarpoolDriver();
                mVPassengerGetRideResponse.driver = mVCarpoolDriver;
                mVCarpoolDriver.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVPassengerRide mVPassengerRide = new MVPassengerRide();
                mVPassengerGetRideResponse.ride = mVPassengerRide;
                mVPassengerRide.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideResponse$d */
    public static class C8261d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8260c(0);
        }
    }

    static {
        new C17394d0("MVPassengerGetRideResponse");
        HashMap hashMap = new HashMap();
        f24782d = hashMap;
        hashMap.put(C25239c.class, new C8259b());
        hashMap.put(C25240d.class, new C8261d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DRIVER, new FieldMetaData("driver", (byte) 3, new StructMetaData(MVCarpoolDriver.class)));
        enumMap.put(_Fields.RIDE, new FieldMetaData("ride", (byte) 3, new StructMetaData(MVPassengerRide.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24783e = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerGetRideResponse.class, unmodifiableMap);
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
        ((C25238b) f24782d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24782d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerGetRideResponse mVPassengerGetRideResponse = (MVPassengerGetRideResponse) obj;
        if (!getClass().equals(mVPassengerGetRideResponse.getClass())) {
            return getClass().getName().compareTo(mVPassengerGetRideResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25734f()).compareTo(Boolean.valueOf(mVPassengerGetRideResponse.mo25734f()));
        if (compareTo2 != 0 || ((mo25734f() && (compareTo2 = this.driver.compareTo(mVPassengerGetRideResponse.driver)) != 0) || (compareTo2 = Boolean.valueOf(mo25735g()).compareTo(Boolean.valueOf(mVPassengerGetRideResponse.mo25735g()))) != 0)) {
            return compareTo2;
        }
        if (!mo25735g() || (compareTo = this.ride.compareTo(mVPassengerGetRideResponse.ride)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideResponse
            r2 = 1
            if (r1 == 0) goto L_0x0058
            com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideResponse r6 = (com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideResponse) r6
            boolean r1 = r5.mo25734f()
            boolean r3 = r6.mo25734f()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0027
        L_0x0017:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x001c
            goto L_0x0058
        L_0x001c:
            com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver r1 = r5.driver
            com.tranzmate.moovit.protocol.carpool.MVCarpoolDriver r3 = r6.driver
            boolean r1 = r1.mo25523a(r3)
            if (r1 != 0) goto L_0x0027
            goto L_0x0058
        L_0x0027:
            boolean r1 = r5.mo25735g()
            boolean r3 = r6.mo25735g()
            if (r1 != 0) goto L_0x0033
            if (r3 == 0) goto L_0x0057
        L_0x0033:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x0038
            goto L_0x0058
        L_0x0038:
            com.tranzmate.moovit.protocol.carpool.MVPassengerRide r1 = r5.ride
            com.tranzmate.moovit.protocol.carpool.MVPassengerRide r6 = r6.ride
            if (r6 == 0) goto L_0x0050
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x0053
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0053
            r6 = 1
            goto L_0x0054
        L_0x0050:
            r1.getClass()
        L_0x0053:
            r6 = 0
        L_0x0054:
            if (r6 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideResponse.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo25734f() {
        return this.driver != null;
    }

    /* renamed from: g */
    public final boolean mo25735g() {
        return this.ride != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerGetRideResponse(", "driver:");
        MVCarpoolDriver mVCarpoolDriver = this.driver;
        if (mVCarpoolDriver == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarpoolDriver);
        }
        n.append(", ");
        n.append("ride:");
        MVPassengerRide mVPassengerRide = this.ride;
        if (mVPassengerRide == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerRide);
        }
        n.append(")");
        return n.toString();
    }
}
