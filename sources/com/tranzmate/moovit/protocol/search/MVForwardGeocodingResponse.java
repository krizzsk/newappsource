package com.tranzmate.moovit.protocol.search;

import com.appboy.models.outgoing.FacebookUser;
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

public class MVForwardGeocodingResponse implements TBase<MVForwardGeocodingResponse, _Fields>, Serializable, Cloneable, Comparable<MVForwardGeocodingResponse> {

    /* renamed from: b */
    public static final C25113c f28161b = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f28162c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28163d;
    public MVLatLon location;

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        
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
            if (i != 1) {
                return null;
            }
            return LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVForwardGeocodingResponse$a */
    public static class C10415a extends C25239c<MVForwardGeocodingResponse> {
        public C10415a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVForwardGeocodingResponse mVForwardGeocodingResponse = (MVForwardGeocodingResponse) tBase;
            MVLatLon mVLatLon = mVForwardGeocodingResponse.location;
            C25113c cVar = MVForwardGeocodingResponse.f28161b;
            gVar.mo61687K();
            if (mVForwardGeocodingResponse.location != null) {
                gVar.mo61711x(MVForwardGeocodingResponse.f28161b);
                mVForwardGeocodingResponse.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVForwardGeocodingResponse mVForwardGeocodingResponse = (MVForwardGeocodingResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVForwardGeocodingResponse.location;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVLatLon mVLatLon2 = new MVLatLon();
                    mVForwardGeocodingResponse.location = mVLatLon2;
                    mVLatLon2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVForwardGeocodingResponse$b */
    public static class C10416b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10415a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVForwardGeocodingResponse$c */
    public static class C10417c extends C25240d<MVForwardGeocodingResponse> {
        public C10417c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVForwardGeocodingResponse mVForwardGeocodingResponse = (MVForwardGeocodingResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVForwardGeocodingResponse.mo31445f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVForwardGeocodingResponse.mo31445f()) {
                mVForwardGeocodingResponse.location.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVForwardGeocodingResponse mVForwardGeocodingResponse = (MVForwardGeocodingResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVForwardGeocodingResponse.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVForwardGeocodingResponse$d */
    public static class C10418d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10417c(0);
        }
    }

    static {
        new C17394d0("MVForwardGeocodingResponse");
        HashMap hashMap = new HashMap();
        f28162c = hashMap;
        hashMap.put(C25239c.class, new C10416b());
        hashMap.put(C25240d.class, new C10418d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28163d = unmodifiableMap;
        FieldMetaData.m61947a(MVForwardGeocodingResponse.class, unmodifiableMap);
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
        ((C25238b) f28162c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28162c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVForwardGeocodingResponse mVForwardGeocodingResponse = (MVForwardGeocodingResponse) obj;
        if (!getClass().equals(mVForwardGeocodingResponse.getClass())) {
            return getClass().getName().compareTo(mVForwardGeocodingResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31445f()).compareTo(Boolean.valueOf(mVForwardGeocodingResponse.mo31445f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo31445f() || (compareTo = this.location.compareTo(mVForwardGeocodingResponse.location)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVForwardGeocodingResponse)) {
            return false;
        }
        MVForwardGeocodingResponse mVForwardGeocodingResponse = (MVForwardGeocodingResponse) obj;
        boolean f = mo31445f();
        boolean f2 = mVForwardGeocodingResponse.mo31445f();
        if ((f || f2) && (!f || !f2 || !this.location.mo26290a(mVForwardGeocodingResponse.location))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31445f() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVForwardGeocodingResponse(", "location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(")");
        return n.toString();
    }
}
