package com.tranzmate.moovit.protocol.search;

import com.appboy.support.StringUtils;
import com.google.android.gms.actions.SearchIntents;
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

public class MVForwardGeocodingRequest implements TBase<MVForwardGeocodingRequest, _Fields>, Serializable, Cloneable, Comparable<MVForwardGeocodingRequest> {

    /* renamed from: b */
    public static final C25113c f28156b = new C25113c(SearchIntents.EXTRA_QUERY, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28157c = new C25113c("metroAreaId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28158d = new C25113c("baseLocation", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28159e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28160f;
    private byte __isset_bitfield = 0;
    public MVLatLon baseLocation;
    public int metroAreaId;
    private _Fields[] optionals = {_Fields.BASE_LOCATION};
    public String query;

    public enum _Fields implements C25085c {
        QUERY(1, SearchIntents.EXTRA_QUERY),
        METRO_AREA_ID(2, "metroAreaId"),
        BASE_LOCATION(3, "baseLocation");
        
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
                return QUERY;
            }
            if (i == 2) {
                return METRO_AREA_ID;
            }
            if (i != 3) {
                return null;
            }
            return BASE_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVForwardGeocodingRequest$a */
    public static class C10411a extends C25239c<MVForwardGeocodingRequest> {
        public C10411a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVForwardGeocodingRequest mVForwardGeocodingRequest = (MVForwardGeocodingRequest) tBase;
            MVLatLon mVLatLon = mVForwardGeocodingRequest.baseLocation;
            C25113c cVar = MVForwardGeocodingRequest.f28156b;
            gVar.mo61687K();
            if (mVForwardGeocodingRequest.query != null) {
                gVar.mo61711x(MVForwardGeocodingRequest.f28156b);
                gVar.mo61686J(mVForwardGeocodingRequest.query);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVForwardGeocodingRequest.f28157c);
            gVar.mo61678B(mVForwardGeocodingRequest.metroAreaId);
            gVar.mo61712y();
            if (mVForwardGeocodingRequest.baseLocation != null && mVForwardGeocodingRequest.mo31436f()) {
                gVar.mo61711x(MVForwardGeocodingRequest.f28158d);
                mVForwardGeocodingRequest.baseLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVForwardGeocodingRequest mVForwardGeocodingRequest = (MVForwardGeocodingRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVForwardGeocodingRequest.baseLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVForwardGeocodingRequest.baseLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVForwardGeocodingRequest.metroAreaId = gVar.mo61696i();
                        mVForwardGeocodingRequest.mo31440i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVForwardGeocodingRequest.query = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVForwardGeocodingRequest$b */
    public static class C10412b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10411a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVForwardGeocodingRequest$c */
    public static class C10413c extends C25240d<MVForwardGeocodingRequest> {
        public C10413c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVForwardGeocodingRequest mVForwardGeocodingRequest = (MVForwardGeocodingRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVForwardGeocodingRequest.mo31438h()) {
                bitSet.set(0);
            }
            if (mVForwardGeocodingRequest.mo31437g()) {
                bitSet.set(1);
            }
            if (mVForwardGeocodingRequest.mo31436f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVForwardGeocodingRequest.mo31438h()) {
                jVar.mo61686J(mVForwardGeocodingRequest.query);
            }
            if (mVForwardGeocodingRequest.mo31437g()) {
                jVar.mo61678B(mVForwardGeocodingRequest.metroAreaId);
            }
            if (mVForwardGeocodingRequest.mo31436f()) {
                mVForwardGeocodingRequest.baseLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVForwardGeocodingRequest mVForwardGeocodingRequest = (MVForwardGeocodingRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVForwardGeocodingRequest.query = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVForwardGeocodingRequest.metroAreaId = jVar.mo61696i();
                mVForwardGeocodingRequest.mo31440i();
            }
            if (T.get(2)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVForwardGeocodingRequest.baseLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVForwardGeocodingRequest$d */
    public static class C10414d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10413c(0);
        }
    }

    static {
        new C17394d0("MVForwardGeocodingRequest");
        HashMap hashMap = new HashMap();
        f28159e = hashMap;
        hashMap.put(C25239c.class, new C10412b());
        hashMap.put(C25240d.class, new C10414d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.QUERY, new FieldMetaData(SearchIntents.EXTRA_QUERY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.METRO_AREA_ID, new FieldMetaData("metroAreaId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.BASE_LOCATION, new FieldMetaData("baseLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28160f = unmodifiableMap;
        FieldMetaData.m61947a(MVForwardGeocodingRequest.class, unmodifiableMap);
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
        ((C25238b) f28159e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28159e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVForwardGeocodingRequest mVForwardGeocodingRequest = (MVForwardGeocodingRequest) obj;
        if (!getClass().equals(mVForwardGeocodingRequest.getClass())) {
            return getClass().getName().compareTo(mVForwardGeocodingRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31438h()).compareTo(Boolean.valueOf(mVForwardGeocodingRequest.mo31438h()));
        if (compareTo2 != 0 || ((mo31438h() && (compareTo2 = this.query.compareTo(mVForwardGeocodingRequest.query)) != 0) || (compareTo2 = Boolean.valueOf(mo31437g()).compareTo(Boolean.valueOf(mVForwardGeocodingRequest.mo31437g()))) != 0 || ((mo31437g() && (compareTo2 = C25082a.m62839c(this.metroAreaId, mVForwardGeocodingRequest.metroAreaId)) != 0) || (compareTo2 = Boolean.valueOf(mo31436f()).compareTo(Boolean.valueOf(mVForwardGeocodingRequest.mo31436f()))) != 0))) {
            return compareTo2;
        }
        if (!mo31436f() || (compareTo = this.baseLocation.compareTo(mVForwardGeocodingRequest.baseLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVForwardGeocodingRequest)) {
            return false;
        }
        MVForwardGeocodingRequest mVForwardGeocodingRequest = (MVForwardGeocodingRequest) obj;
        boolean h = mo31438h();
        boolean h2 = mVForwardGeocodingRequest.mo31438h();
        if (((h || h2) && (!h || !h2 || !this.query.equals(mVForwardGeocodingRequest.query))) || this.metroAreaId != mVForwardGeocodingRequest.metroAreaId) {
            return false;
        }
        boolean f = mo31436f();
        boolean f2 = mVForwardGeocodingRequest.mo31436f();
        if ((f || f2) && (!f || !f2 || !this.baseLocation.mo26290a(mVForwardGeocodingRequest.baseLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31436f() {
        return this.baseLocation != null;
    }

    /* renamed from: g */
    public final boolean mo31437g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo31438h() {
        return this.query != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31440i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVForwardGeocodingRequest(", "query:");
        String str = this.query;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("metroAreaId:");
        n.append(this.metroAreaId);
        if (mo31436f()) {
            n.append(", ");
            n.append("baseLocation:");
            MVLatLon mVLatLon = this.baseLocation;
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
