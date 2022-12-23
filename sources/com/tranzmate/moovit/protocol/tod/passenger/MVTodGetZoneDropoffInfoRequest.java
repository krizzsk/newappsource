package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodGetZoneDropoffInfoRequest implements TBase<MVTodGetZoneDropoffInfoRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodGetZoneDropoffInfoRequest> {

    /* renamed from: b */
    public static final C25113c f29391b = new C25113c("providerId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29392c = new C25113c("pickup", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29393d = new C25113c("pickupTime", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f29394e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29395f;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.PICKUP_TIME};
    public MVLocationDescriptor pickup;
    public long pickupTime;
    public String providerId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        PICKUP(2, "pickup"),
        PICKUP_TIME(3, "pickupTime");
        
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
            if (i == 2) {
                return PICKUP;
            }
            if (i != 3) {
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoRequest$a */
    public static class C11225a extends C25239c<MVTodGetZoneDropoffInfoRequest> {
        public C11225a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZoneDropoffInfoRequest mVTodGetZoneDropoffInfoRequest = (MVTodGetZoneDropoffInfoRequest) tBase;
            MVLocationDescriptor mVLocationDescriptor = mVTodGetZoneDropoffInfoRequest.pickup;
            if (mVLocationDescriptor != null) {
                mVLocationDescriptor.mo26333s();
            }
            C25113c cVar = MVTodGetZoneDropoffInfoRequest.f29391b;
            gVar.mo61687K();
            if (mVTodGetZoneDropoffInfoRequest.providerId != null) {
                gVar.mo61711x(MVTodGetZoneDropoffInfoRequest.f29391b);
                gVar.mo61686J(mVTodGetZoneDropoffInfoRequest.providerId);
                gVar.mo61712y();
            }
            if (mVTodGetZoneDropoffInfoRequest.pickup != null) {
                gVar.mo61711x(MVTodGetZoneDropoffInfoRequest.f29392c);
                mVTodGetZoneDropoffInfoRequest.pickup.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodGetZoneDropoffInfoRequest.mo33422g()) {
                gVar.mo61711x(MVTodGetZoneDropoffInfoRequest.f29393d);
                gVar.mo61679C(mVTodGetZoneDropoffInfoRequest.pickupTime);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZoneDropoffInfoRequest mVTodGetZoneDropoffInfoRequest = (MVTodGetZoneDropoffInfoRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVTodGetZoneDropoffInfoRequest.pickupTime = gVar.mo61697j();
                            mVTodGetZoneDropoffInfoRequest.mo33425i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                        mVTodGetZoneDropoffInfoRequest.pickup = mVLocationDescriptor;
                        mVLocationDescriptor.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodGetZoneDropoffInfoRequest.providerId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVLocationDescriptor mVLocationDescriptor2 = mVTodGetZoneDropoffInfoRequest.pickup;
            if (mVLocationDescriptor2 != null) {
                mVLocationDescriptor2.mo26333s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoRequest$b */
    public static class C11226b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11225a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoRequest$c */
    public static class C11227c extends C25240d<MVTodGetZoneDropoffInfoRequest> {
        public C11227c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZoneDropoffInfoRequest mVTodGetZoneDropoffInfoRequest = (MVTodGetZoneDropoffInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodGetZoneDropoffInfoRequest.mo33423h()) {
                bitSet.set(0);
            }
            if (mVTodGetZoneDropoffInfoRequest.mo33421f()) {
                bitSet.set(1);
            }
            if (mVTodGetZoneDropoffInfoRequest.mo33422g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodGetZoneDropoffInfoRequest.mo33423h()) {
                jVar.mo61686J(mVTodGetZoneDropoffInfoRequest.providerId);
            }
            if (mVTodGetZoneDropoffInfoRequest.mo33421f()) {
                mVTodGetZoneDropoffInfoRequest.pickup.mo25202X0(jVar);
            }
            if (mVTodGetZoneDropoffInfoRequest.mo33422g()) {
                jVar.mo61679C(mVTodGetZoneDropoffInfoRequest.pickupTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZoneDropoffInfoRequest mVTodGetZoneDropoffInfoRequest = (MVTodGetZoneDropoffInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodGetZoneDropoffInfoRequest.providerId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVTodGetZoneDropoffInfoRequest.pickup = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTodGetZoneDropoffInfoRequest.pickupTime = jVar.mo61697j();
                mVTodGetZoneDropoffInfoRequest.mo33425i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoRequest$d */
    public static class C11228d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11227c(0);
        }
    }

    static {
        new C17394d0("MVTodGetZoneDropoffInfoRequest");
        HashMap hashMap = new HashMap();
        f29394e = hashMap;
        hashMap.put(C25239c.class, new C11226b());
        hashMap.put(C25240d.class, new C11228d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PICKUP, new FieldMetaData("pickup", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.PICKUP_TIME, new FieldMetaData("pickupTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29395f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodGetZoneDropoffInfoRequest.class, unmodifiableMap);
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
        ((C25238b) f29394e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29394e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVTodGetZoneDropoffInfoRequest mVTodGetZoneDropoffInfoRequest = (MVTodGetZoneDropoffInfoRequest) obj;
        if (!getClass().equals(mVTodGetZoneDropoffInfoRequest.getClass())) {
            return getClass().getName().compareTo(mVTodGetZoneDropoffInfoRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33423h()).compareTo(Boolean.valueOf(mVTodGetZoneDropoffInfoRequest.mo33423h()));
        if (compareTo != 0 || ((mo33423h() && (compareTo = this.providerId.compareTo(mVTodGetZoneDropoffInfoRequest.providerId)) != 0) || (compareTo = Boolean.valueOf(mo33421f()).compareTo(Boolean.valueOf(mVTodGetZoneDropoffInfoRequest.mo33421f()))) != 0 || ((mo33421f() && (compareTo = this.pickup.compareTo(mVTodGetZoneDropoffInfoRequest.pickup)) != 0) || (compareTo = Boolean.valueOf(mo33422g()).compareTo(Boolean.valueOf(mVTodGetZoneDropoffInfoRequest.mo33422g()))) != 0))) {
            return compareTo;
        }
        if (!mo33422g() || (d = C25082a.m62840d(this.pickupTime, mVTodGetZoneDropoffInfoRequest.pickupTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodGetZoneDropoffInfoRequest)) {
            return false;
        }
        MVTodGetZoneDropoffInfoRequest mVTodGetZoneDropoffInfoRequest = (MVTodGetZoneDropoffInfoRequest) obj;
        boolean h = mo33423h();
        boolean h2 = mVTodGetZoneDropoffInfoRequest.mo33423h();
        if ((h || h2) && (!h || !h2 || !this.providerId.equals(mVTodGetZoneDropoffInfoRequest.providerId))) {
            return false;
        }
        boolean f = mo33421f();
        boolean f2 = mVTodGetZoneDropoffInfoRequest.mo33421f();
        if ((f || f2) && (!f || !f2 || !this.pickup.mo26317a(mVTodGetZoneDropoffInfoRequest.pickup))) {
            return false;
        }
        boolean g = mo33422g();
        boolean g2 = mVTodGetZoneDropoffInfoRequest.mo33422g();
        if ((g || g2) && (!g || !g2 || this.pickupTime != mVTodGetZoneDropoffInfoRequest.pickupTime)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33421f() {
        return this.pickup != null;
    }

    /* renamed from: g */
    public final boolean mo33422g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo33423h() {
        return this.providerId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33425i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodGetZoneDropoffInfoRequest(", "providerId:");
        String str = this.providerId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("pickup:");
        MVLocationDescriptor mVLocationDescriptor = this.pickup;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        if (mo33422g()) {
            n.append(", ");
            n.append("pickupTime:");
            n.append(this.pickupTime);
        }
        n.append(")");
        return n.toString();
    }
}
