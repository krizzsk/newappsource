package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVRSEventBookingBucketsRequest implements TBase<MVRSEventBookingBucketsRequest, _Fields>, Serializable, Cloneable, Comparable<MVRSEventBookingBucketsRequest> {

    /* renamed from: b */
    public static final C25113c f28043b = new C25113c("superEventId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28044c = new C25113c("userLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f28045d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28046e;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.USER_LOCATION};
    public int superEventId;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        SUPER_EVENT_ID(1, "superEventId"),
        USER_LOCATION(2, "userLocation");
        
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
                return SUPER_EVENT_ID;
            }
            if (i != 2) {
                return null;
            }
            return USER_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsRequest$a */
    public static class C10334a extends C25239c<MVRSEventBookingBucketsRequest> {
        public C10334a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingBucketsRequest mVRSEventBookingBucketsRequest = (MVRSEventBookingBucketsRequest) tBase;
            MVLatLon mVLatLon = mVRSEventBookingBucketsRequest.userLocation;
            C25113c cVar = MVRSEventBookingBucketsRequest.f28043b;
            gVar.mo61687K();
            gVar.mo61711x(MVRSEventBookingBucketsRequest.f28043b);
            gVar.mo61678B(mVRSEventBookingBucketsRequest.superEventId);
            gVar.mo61712y();
            if (mVRSEventBookingBucketsRequest.userLocation != null && mVRSEventBookingBucketsRequest.mo31237g()) {
                gVar.mo61711x(MVRSEventBookingBucketsRequest.f28044c);
                mVRSEventBookingBucketsRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingBucketsRequest mVRSEventBookingBucketsRequest = (MVRSEventBookingBucketsRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVRSEventBookingBucketsRequest.userLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVRSEventBookingBucketsRequest.userLocation = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVRSEventBookingBucketsRequest.superEventId = gVar.mo61696i();
                    mVRSEventBookingBucketsRequest.mo31238h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsRequest$b */
    public static class C10335b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10334a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsRequest$c */
    public static class C10336c extends C25240d<MVRSEventBookingBucketsRequest> {
        public C10336c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingBucketsRequest mVRSEventBookingBucketsRequest = (MVRSEventBookingBucketsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEventBookingBucketsRequest.mo31236f()) {
                bitSet.set(0);
            }
            if (mVRSEventBookingBucketsRequest.mo31237g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVRSEventBookingBucketsRequest.mo31236f()) {
                jVar.mo61678B(mVRSEventBookingBucketsRequest.superEventId);
            }
            if (mVRSEventBookingBucketsRequest.mo31237g()) {
                mVRSEventBookingBucketsRequest.userLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingBucketsRequest mVRSEventBookingBucketsRequest = (MVRSEventBookingBucketsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVRSEventBookingBucketsRequest.superEventId = jVar.mo61696i();
                mVRSEventBookingBucketsRequest.mo31238h();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVRSEventBookingBucketsRequest.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingBucketsRequest$d */
    public static class C10337d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10336c(0);
        }
    }

    static {
        new C17394d0("MVRSEventBookingBucketsRequest");
        HashMap hashMap = new HashMap();
        f28045d = hashMap;
        hashMap.put(C25239c.class, new C10335b());
        hashMap.put(C25240d.class, new C10337d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPER_EVENT_ID, new FieldMetaData("superEventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28046e = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEventBookingBucketsRequest.class, unmodifiableMap);
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
        ((C25238b) f28045d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28045d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRSEventBookingBucketsRequest mVRSEventBookingBucketsRequest = (MVRSEventBookingBucketsRequest) obj;
        if (!getClass().equals(mVRSEventBookingBucketsRequest.getClass())) {
            return getClass().getName().compareTo(mVRSEventBookingBucketsRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31236f()).compareTo(Boolean.valueOf(mVRSEventBookingBucketsRequest.mo31236f()));
        if (compareTo2 != 0 || ((mo31236f() && (compareTo2 = C25082a.m62839c(this.superEventId, mVRSEventBookingBucketsRequest.superEventId)) != 0) || (compareTo2 = Boolean.valueOf(mo31237g()).compareTo(Boolean.valueOf(mVRSEventBookingBucketsRequest.mo31237g()))) != 0)) {
            return compareTo2;
        }
        if (!mo31237g() || (compareTo = this.userLocation.compareTo(mVRSEventBookingBucketsRequest.userLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSEventBookingBucketsRequest)) {
            return false;
        }
        MVRSEventBookingBucketsRequest mVRSEventBookingBucketsRequest = (MVRSEventBookingBucketsRequest) obj;
        if (this.superEventId != mVRSEventBookingBucketsRequest.superEventId) {
            return false;
        }
        boolean g = mo31237g();
        boolean g2 = mVRSEventBookingBucketsRequest.mo31237g();
        if ((g || g2) && (!g || !g2 || !this.userLocation.mo26290a(mVRSEventBookingBucketsRequest.userLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31236f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31237g() {
        return this.userLocation != null;
    }

    /* renamed from: h */
    public final void mo31238h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEventBookingBucketsRequest(", "superEventId:");
        n.append(this.superEventId);
        if (mo31237g()) {
            n.append(", ");
            n.append("userLocation:");
            MVLatLon mVLatLon = this.userLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        n.append(")");
        return n.toString();
    }
}
