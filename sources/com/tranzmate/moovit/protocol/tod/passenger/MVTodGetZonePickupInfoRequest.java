package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodGetZonePickupInfoRequest implements TBase<MVTodGetZonePickupInfoRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodGetZonePickupInfoRequest> {

    /* renamed from: b */
    public static final C25113c f29402b = new C25113c("providerId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29403c = new C25113c("pickupTime", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f29404d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29405e;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.PICKUP_TIME};
    public long pickupTime;
    public String providerId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        PICKUP_TIME(2, "pickupTime");
        
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
                return PROVIDER_ID;
            }
            if (i != 2) {
                return null;
            }
            return PICKUP_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoRequest$a */
    public static class C11233a extends C25239c<MVTodGetZonePickupInfoRequest> {
        public C11233a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZonePickupInfoRequest mVTodGetZonePickupInfoRequest = (MVTodGetZonePickupInfoRequest) tBase;
            mVTodGetZonePickupInfoRequest.getClass();
            C25113c cVar = MVTodGetZonePickupInfoRequest.f29402b;
            gVar.mo61687K();
            if (mVTodGetZonePickupInfoRequest.providerId != null) {
                gVar.mo61711x(MVTodGetZonePickupInfoRequest.f29402b);
                gVar.mo61686J(mVTodGetZonePickupInfoRequest.providerId);
                gVar.mo61712y();
            }
            if (mVTodGetZonePickupInfoRequest.mo33439f()) {
                gVar.mo61711x(MVTodGetZonePickupInfoRequest.f29403c);
                gVar.mo61679C(mVTodGetZonePickupInfoRequest.pickupTime);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZonePickupInfoRequest mVTodGetZonePickupInfoRequest = (MVTodGetZonePickupInfoRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodGetZonePickupInfoRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVTodGetZonePickupInfoRequest.pickupTime = gVar.mo61697j();
                        mVTodGetZonePickupInfoRequest.mo33441h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodGetZonePickupInfoRequest.providerId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoRequest$b */
    public static class C11234b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11233a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoRequest$c */
    public static class C11235c extends C25240d<MVTodGetZonePickupInfoRequest> {
        public C11235c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZonePickupInfoRequest mVTodGetZonePickupInfoRequest = (MVTodGetZonePickupInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodGetZonePickupInfoRequest.mo33440g()) {
                bitSet.set(0);
            }
            if (mVTodGetZonePickupInfoRequest.mo33439f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodGetZonePickupInfoRequest.mo33440g()) {
                jVar.mo61686J(mVTodGetZonePickupInfoRequest.providerId);
            }
            if (mVTodGetZonePickupInfoRequest.mo33439f()) {
                jVar.mo61679C(mVTodGetZonePickupInfoRequest.pickupTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZonePickupInfoRequest mVTodGetZonePickupInfoRequest = (MVTodGetZonePickupInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodGetZonePickupInfoRequest.providerId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodGetZonePickupInfoRequest.pickupTime = jVar.mo61697j();
                mVTodGetZonePickupInfoRequest.mo33441h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZonePickupInfoRequest$d */
    public static class C11236d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11235c(0);
        }
    }

    static {
        new C17394d0("MVTodGetZonePickupInfoRequest");
        HashMap hashMap = new HashMap();
        f29404d = hashMap;
        hashMap.put(C25239c.class, new C11234b());
        hashMap.put(C25240d.class, new C11236d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PICKUP_TIME, new FieldMetaData("pickupTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29405e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodGetZonePickupInfoRequest.class, unmodifiableMap);
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
        ((C25238b) f29404d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29404d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVTodGetZonePickupInfoRequest mVTodGetZonePickupInfoRequest = (MVTodGetZonePickupInfoRequest) obj;
        if (!getClass().equals(mVTodGetZonePickupInfoRequest.getClass())) {
            return getClass().getName().compareTo(mVTodGetZonePickupInfoRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33440g()).compareTo(Boolean.valueOf(mVTodGetZonePickupInfoRequest.mo33440g()));
        if (compareTo != 0 || ((mo33440g() && (compareTo = this.providerId.compareTo(mVTodGetZonePickupInfoRequest.providerId)) != 0) || (compareTo = Boolean.valueOf(mo33439f()).compareTo(Boolean.valueOf(mVTodGetZonePickupInfoRequest.mo33439f()))) != 0)) {
            return compareTo;
        }
        if (!mo33439f() || (d = C25082a.m62840d(this.pickupTime, mVTodGetZonePickupInfoRequest.pickupTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodGetZonePickupInfoRequest)) {
            return false;
        }
        MVTodGetZonePickupInfoRequest mVTodGetZonePickupInfoRequest = (MVTodGetZonePickupInfoRequest) obj;
        boolean g = mo33440g();
        boolean g2 = mVTodGetZonePickupInfoRequest.mo33440g();
        if ((g || g2) && (!g || !g2 || !this.providerId.equals(mVTodGetZonePickupInfoRequest.providerId))) {
            return false;
        }
        boolean f = mo33439f();
        boolean f2 = mVTodGetZonePickupInfoRequest.mo33439f();
        if ((f || f2) && (!f || !f2 || this.pickupTime != mVTodGetZonePickupInfoRequest.pickupTime)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33439f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33440g() {
        return this.providerId != null;
    }

    /* renamed from: h */
    public final void mo33441h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodGetZonePickupInfoRequest(", "providerId:");
        String str = this.providerId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33439f()) {
            n.append(", ");
            n.append("pickupTime:");
            n.append(this.pickupTime);
        }
        n.append(")");
        return n.toString();
    }
}
