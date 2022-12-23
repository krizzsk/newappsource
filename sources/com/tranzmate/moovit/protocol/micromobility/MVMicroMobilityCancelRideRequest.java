package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityCancelRideRequest implements TBase<MVMicroMobilityCancelRideRequest, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityCancelRideRequest> {

    /* renamed from: b */
    public static final C25113c f26510b = new C25113c("serviceId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26511c = new C25113c("itemId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26512d = new C25113c("rideId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f26513e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26514f;
    private byte __isset_bitfield = 0;
    public String itemId;
    public int rideId;
    public String serviceId;

    public enum _Fields implements C25085c {
        SERVICE_ID(1, "serviceId"),
        ITEM_ID(2, "itemId"),
        RIDE_ID(3, "rideId");
        
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
                return SERVICE_ID;
            }
            if (i == 2) {
                return ITEM_ID;
            }
            if (i != 3) {
                return null;
            }
            return RIDE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityCancelRideRequest$a */
    public static class C9203a extends C25239c<MVMicroMobilityCancelRideRequest> {
        public C9203a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityCancelRideRequest mVMicroMobilityCancelRideRequest = (MVMicroMobilityCancelRideRequest) tBase;
            mVMicroMobilityCancelRideRequest.getClass();
            C25113c cVar = MVMicroMobilityCancelRideRequest.f26510b;
            gVar.mo61687K();
            if (mVMicroMobilityCancelRideRequest.serviceId != null) {
                gVar.mo61711x(MVMicroMobilityCancelRideRequest.f26510b);
                gVar.mo61686J(mVMicroMobilityCancelRideRequest.serviceId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityCancelRideRequest.itemId != null) {
                gVar.mo61711x(MVMicroMobilityCancelRideRequest.f26511c);
                gVar.mo61686J(mVMicroMobilityCancelRideRequest.itemId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMicroMobilityCancelRideRequest.f26512d);
            C16530d.m42020n(gVar, mVMicroMobilityCancelRideRequest.rideId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityCancelRideRequest mVMicroMobilityCancelRideRequest = (MVMicroMobilityCancelRideRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityCancelRideRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVMicroMobilityCancelRideRequest.rideId = gVar.mo61696i();
                            mVMicroMobilityCancelRideRequest.mo28658i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityCancelRideRequest.itemId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityCancelRideRequest.serviceId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityCancelRideRequest$b */
    public static class C9204b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9203a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityCancelRideRequest$c */
    public static class C9205c extends C25240d<MVMicroMobilityCancelRideRequest> {
        public C9205c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityCancelRideRequest mVMicroMobilityCancelRideRequest = (MVMicroMobilityCancelRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityCancelRideRequest.mo28656h()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityCancelRideRequest.mo28654f()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityCancelRideRequest.mo28655g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMicroMobilityCancelRideRequest.mo28656h()) {
                jVar.mo61686J(mVMicroMobilityCancelRideRequest.serviceId);
            }
            if (mVMicroMobilityCancelRideRequest.mo28654f()) {
                jVar.mo61686J(mVMicroMobilityCancelRideRequest.itemId);
            }
            if (mVMicroMobilityCancelRideRequest.mo28655g()) {
                jVar.mo61678B(mVMicroMobilityCancelRideRequest.rideId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityCancelRideRequest mVMicroMobilityCancelRideRequest = (MVMicroMobilityCancelRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVMicroMobilityCancelRideRequest.serviceId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityCancelRideRequest.itemId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityCancelRideRequest.rideId = jVar.mo61696i();
                mVMicroMobilityCancelRideRequest.mo28658i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityCancelRideRequest$d */
    public static class C9206d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9205c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityCancelRideRequest");
        HashMap hashMap = new HashMap();
        f26513e = hashMap;
        hashMap.put(C25239c.class, new C9204b());
        hashMap.put(C25240d.class, new C9206d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITEM_ID, new FieldMetaData("itemId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26514f = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityCancelRideRequest.class, unmodifiableMap);
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
        ((C25238b) f26513e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26513e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVMicroMobilityCancelRideRequest mVMicroMobilityCancelRideRequest = (MVMicroMobilityCancelRideRequest) obj;
        if (!getClass().equals(mVMicroMobilityCancelRideRequest.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityCancelRideRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28656h()).compareTo(Boolean.valueOf(mVMicroMobilityCancelRideRequest.mo28656h()));
        if (compareTo != 0 || ((mo28656h() && (compareTo = this.serviceId.compareTo(mVMicroMobilityCancelRideRequest.serviceId)) != 0) || (compareTo = Boolean.valueOf(mo28654f()).compareTo(Boolean.valueOf(mVMicroMobilityCancelRideRequest.mo28654f()))) != 0 || ((mo28654f() && (compareTo = this.itemId.compareTo(mVMicroMobilityCancelRideRequest.itemId)) != 0) || (compareTo = Boolean.valueOf(mo28655g()).compareTo(Boolean.valueOf(mVMicroMobilityCancelRideRequest.mo28655g()))) != 0))) {
            return compareTo;
        }
        if (!mo28655g() || (c = C25082a.m62839c(this.rideId, mVMicroMobilityCancelRideRequest.rideId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityCancelRideRequest)) {
            return false;
        }
        MVMicroMobilityCancelRideRequest mVMicroMobilityCancelRideRequest = (MVMicroMobilityCancelRideRequest) obj;
        boolean h = mo28656h();
        boolean h2 = mVMicroMobilityCancelRideRequest.mo28656h();
        if ((h || h2) && (!h || !h2 || !this.serviceId.equals(mVMicroMobilityCancelRideRequest.serviceId))) {
            return false;
        }
        boolean f = mo28654f();
        boolean f2 = mVMicroMobilityCancelRideRequest.mo28654f();
        if (((f || f2) && (!f || !f2 || !this.itemId.equals(mVMicroMobilityCancelRideRequest.itemId))) || this.rideId != mVMicroMobilityCancelRideRequest.rideId) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28654f() {
        return this.itemId != null;
    }

    /* renamed from: g */
    public final boolean mo28655g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo28656h() {
        return this.serviceId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo28658i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityCancelRideRequest(", "serviceId:");
        String str = this.serviceId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("itemId:");
        String str2 = this.itemId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("rideId:");
        return C13437d.m33707l(n, this.rideId, ")");
    }
}
