package com.tranzmate.moovit.protocol.externalservices;

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

public class MVRentalBikesRTResponse implements TBase<MVRentalBikesRTResponse, _Fields>, Serializable, Cloneable, Comparable<MVRentalBikesRTResponse> {

    /* renamed from: b */
    public static final C25113c f25612b = new C25113c("rentalBikeStopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25613c = new C25113c("availableBikes", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25614d = new C25113c("freeDocks", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25615e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25616f;
    private byte __isset_bitfield = 0;
    public int availableBikes;
    public int freeDocks;
    public int rentalBikeStopId;

    public enum _Fields implements C25085c {
        RENTAL_BIKE_STOP_ID(1, "rentalBikeStopId"),
        AVAILABLE_BIKES(2, "availableBikes"),
        FREE_DOCKS(3, "freeDocks");
        
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
                return RENTAL_BIKE_STOP_ID;
            }
            if (i == 2) {
                return AVAILABLE_BIKES;
            }
            if (i != 3) {
                return null;
            }
            return FREE_DOCKS;
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

    /* renamed from: com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTResponse$a */
    public static class C8719a extends C25239c<MVRentalBikesRTResponse> {
        public C8719a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRentalBikesRTResponse mVRentalBikesRTResponse = (MVRentalBikesRTResponse) tBase;
            mVRentalBikesRTResponse.getClass();
            C25113c cVar = MVRentalBikesRTResponse.f25612b;
            gVar.mo61687K();
            gVar.mo61711x(MVRentalBikesRTResponse.f25612b);
            gVar.mo61678B(mVRentalBikesRTResponse.rentalBikeStopId);
            gVar.mo61712y();
            gVar.mo61711x(MVRentalBikesRTResponse.f25613c);
            gVar.mo61678B(mVRentalBikesRTResponse.availableBikes);
            gVar.mo61712y();
            gVar.mo61711x(MVRentalBikesRTResponse.f25614d);
            C16530d.m42020n(gVar, mVRentalBikesRTResponse.freeDocks);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRentalBikesRTResponse mVRentalBikesRTResponse = (MVRentalBikesRTResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRentalBikesRTResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVRentalBikesRTResponse.freeDocks = gVar.mo61696i();
                            mVRentalBikesRTResponse.mo27185j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVRentalBikesRTResponse.availableBikes = gVar.mo61696i();
                        mVRentalBikesRTResponse.mo27184i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVRentalBikesRTResponse.rentalBikeStopId = gVar.mo61696i();
                    mVRentalBikesRTResponse.mo27186k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTResponse$b */
    public static class C8720b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8719a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTResponse$c */
    public static class C8721c extends C25240d<MVRentalBikesRTResponse> {
        public C8721c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRentalBikesRTResponse mVRentalBikesRTResponse = (MVRentalBikesRTResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRentalBikesRTResponse.mo27182h()) {
                bitSet.set(0);
            }
            if (mVRentalBikesRTResponse.mo27180f()) {
                bitSet.set(1);
            }
            if (mVRentalBikesRTResponse.mo27181g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVRentalBikesRTResponse.mo27182h()) {
                jVar.mo61678B(mVRentalBikesRTResponse.rentalBikeStopId);
            }
            if (mVRentalBikesRTResponse.mo27180f()) {
                jVar.mo61678B(mVRentalBikesRTResponse.availableBikes);
            }
            if (mVRentalBikesRTResponse.mo27181g()) {
                jVar.mo61678B(mVRentalBikesRTResponse.freeDocks);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRentalBikesRTResponse mVRentalBikesRTResponse = (MVRentalBikesRTResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVRentalBikesRTResponse.rentalBikeStopId = jVar.mo61696i();
                mVRentalBikesRTResponse.mo27186k();
            }
            if (T.get(1)) {
                mVRentalBikesRTResponse.availableBikes = jVar.mo61696i();
                mVRentalBikesRTResponse.mo27184i();
            }
            if (T.get(2)) {
                mVRentalBikesRTResponse.freeDocks = jVar.mo61696i();
                mVRentalBikesRTResponse.mo27185j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTResponse$d */
    public static class C8722d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8721c(0);
        }
    }

    static {
        new C17394d0("MVRentalBikesRTResponse");
        HashMap hashMap = new HashMap();
        f25615e = hashMap;
        hashMap.put(C25239c.class, new C8720b());
        hashMap.put(C25240d.class, new C8722d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RENTAL_BIKE_STOP_ID, new FieldMetaData("rentalBikeStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AVAILABLE_BIKES, new FieldMetaData("availableBikes", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FREE_DOCKS, new FieldMetaData("freeDocks", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25616f = unmodifiableMap;
        FieldMetaData.m61947a(MVRentalBikesRTResponse.class, unmodifiableMap);
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
        ((C25238b) f25615e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25615e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVRentalBikesRTResponse mVRentalBikesRTResponse = (MVRentalBikesRTResponse) obj;
        if (!getClass().equals(mVRentalBikesRTResponse.getClass())) {
            return getClass().getName().compareTo(mVRentalBikesRTResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27182h()).compareTo(Boolean.valueOf(mVRentalBikesRTResponse.mo27182h()));
        if (compareTo != 0 || ((mo27182h() && (compareTo = C25082a.m62839c(this.rentalBikeStopId, mVRentalBikesRTResponse.rentalBikeStopId)) != 0) || (compareTo = Boolean.valueOf(mo27180f()).compareTo(Boolean.valueOf(mVRentalBikesRTResponse.mo27180f()))) != 0 || ((mo27180f() && (compareTo = C25082a.m62839c(this.availableBikes, mVRentalBikesRTResponse.availableBikes)) != 0) || (compareTo = Boolean.valueOf(mo27181g()).compareTo(Boolean.valueOf(mVRentalBikesRTResponse.mo27181g()))) != 0))) {
            return compareTo;
        }
        if (!mo27181g() || (c = C25082a.m62839c(this.freeDocks, mVRentalBikesRTResponse.freeDocks)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRentalBikesRTResponse)) {
            return false;
        }
        MVRentalBikesRTResponse mVRentalBikesRTResponse = (MVRentalBikesRTResponse) obj;
        if (this.rentalBikeStopId == mVRentalBikesRTResponse.rentalBikeStopId && this.availableBikes == mVRentalBikesRTResponse.availableBikes && this.freeDocks == mVRentalBikesRTResponse.freeDocks) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27180f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27181g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo27182h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27184i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: j */
    public final void mo27185j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo27186k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRentalBikesRTResponse(", "rentalBikeStopId:");
        C0016g.m42z(n, this.rentalBikeStopId, ", ", "availableBikes:");
        C0016g.m42z(n, this.availableBikes, ", ", "freeDocks:");
        return C13437d.m33707l(n, this.freeDocks, ")");
    }
}
