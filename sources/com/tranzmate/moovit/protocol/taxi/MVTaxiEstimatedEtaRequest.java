package com.tranzmate.moovit.protocol.taxi;

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

public class MVTaxiEstimatedEtaRequest implements TBase<MVTaxiEstimatedEtaRequest, _Fields>, Serializable, Cloneable, Comparable<MVTaxiEstimatedEtaRequest> {

    /* renamed from: b */
    public static final C25113c f28545b = new C25113c("latitude", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28546c = new C25113c("longitude", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28547d = new C25113c("taxiId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f28548e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28549f;
    private byte __isset_bitfield = 0;
    public int latitude;
    public int longitude;
    private _Fields[] optionals = {_Fields.TAXI_ID};
    public int taxiId;

    public enum _Fields implements C25085c {
        LATITUDE(1, "latitude"),
        LONGITUDE(2, "longitude"),
        TAXI_ID(3, "taxiId");
        
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
                return LATITUDE;
            }
            if (i == 2) {
                return LONGITUDE;
            }
            if (i != 3) {
                return null;
            }
            return TAXI_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiEstimatedEtaRequest$a */
    public static class C10696a extends C25239c<MVTaxiEstimatedEtaRequest> {
        public C10696a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiEstimatedEtaRequest mVTaxiEstimatedEtaRequest = (MVTaxiEstimatedEtaRequest) tBase;
            mVTaxiEstimatedEtaRequest.getClass();
            C25113c cVar = MVTaxiEstimatedEtaRequest.f28545b;
            gVar.mo61687K();
            gVar.mo61711x(MVTaxiEstimatedEtaRequest.f28545b);
            gVar.mo61678B(mVTaxiEstimatedEtaRequest.latitude);
            gVar.mo61712y();
            gVar.mo61711x(MVTaxiEstimatedEtaRequest.f28546c);
            gVar.mo61678B(mVTaxiEstimatedEtaRequest.longitude);
            gVar.mo61712y();
            if (mVTaxiEstimatedEtaRequest.mo32106h()) {
                gVar.mo61711x(MVTaxiEstimatedEtaRequest.f28547d);
                gVar.mo61678B(mVTaxiEstimatedEtaRequest.taxiId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiEstimatedEtaRequest mVTaxiEstimatedEtaRequest = (MVTaxiEstimatedEtaRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTaxiEstimatedEtaRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVTaxiEstimatedEtaRequest.taxiId = gVar.mo61696i();
                            mVTaxiEstimatedEtaRequest.mo32110k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVTaxiEstimatedEtaRequest.longitude = gVar.mo61696i();
                        mVTaxiEstimatedEtaRequest.mo32109j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTaxiEstimatedEtaRequest.latitude = gVar.mo61696i();
                    mVTaxiEstimatedEtaRequest.mo32108i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiEstimatedEtaRequest$b */
    public static class C10697b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10696a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiEstimatedEtaRequest$c */
    public static class C10698c extends C25240d<MVTaxiEstimatedEtaRequest> {
        public C10698c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiEstimatedEtaRequest mVTaxiEstimatedEtaRequest = (MVTaxiEstimatedEtaRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiEstimatedEtaRequest.mo32104f()) {
                bitSet.set(0);
            }
            if (mVTaxiEstimatedEtaRequest.mo32105g()) {
                bitSet.set(1);
            }
            if (mVTaxiEstimatedEtaRequest.mo32106h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTaxiEstimatedEtaRequest.mo32104f()) {
                jVar.mo61678B(mVTaxiEstimatedEtaRequest.latitude);
            }
            if (mVTaxiEstimatedEtaRequest.mo32105g()) {
                jVar.mo61678B(mVTaxiEstimatedEtaRequest.longitude);
            }
            if (mVTaxiEstimatedEtaRequest.mo32106h()) {
                jVar.mo61678B(mVTaxiEstimatedEtaRequest.taxiId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiEstimatedEtaRequest mVTaxiEstimatedEtaRequest = (MVTaxiEstimatedEtaRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTaxiEstimatedEtaRequest.latitude = jVar.mo61696i();
                mVTaxiEstimatedEtaRequest.mo32108i();
            }
            if (T.get(1)) {
                mVTaxiEstimatedEtaRequest.longitude = jVar.mo61696i();
                mVTaxiEstimatedEtaRequest.mo32109j();
            }
            if (T.get(2)) {
                mVTaxiEstimatedEtaRequest.taxiId = jVar.mo61696i();
                mVTaxiEstimatedEtaRequest.mo32110k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiEstimatedEtaRequest$d */
    public static class C10699d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10698c(0);
        }
    }

    static {
        new C17394d0("MVTaxiEstimatedEtaRequest");
        HashMap hashMap = new HashMap();
        f28548e = hashMap;
        hashMap.put(C25239c.class, new C10697b());
        hashMap.put(C25240d.class, new C10699d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LATITUDE, new FieldMetaData("latitude", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LONGITUDE, new FieldMetaData("longitude", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TAXI_ID, new FieldMetaData("taxiId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28549f = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiEstimatedEtaRequest.class, unmodifiableMap);
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
        ((C25238b) f28548e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28548e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVTaxiEstimatedEtaRequest mVTaxiEstimatedEtaRequest = (MVTaxiEstimatedEtaRequest) obj;
        if (!getClass().equals(mVTaxiEstimatedEtaRequest.getClass())) {
            return getClass().getName().compareTo(mVTaxiEstimatedEtaRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32104f()).compareTo(Boolean.valueOf(mVTaxiEstimatedEtaRequest.mo32104f()));
        if (compareTo != 0 || ((mo32104f() && (compareTo = C25082a.m62839c(this.latitude, mVTaxiEstimatedEtaRequest.latitude)) != 0) || (compareTo = Boolean.valueOf(mo32105g()).compareTo(Boolean.valueOf(mVTaxiEstimatedEtaRequest.mo32105g()))) != 0 || ((mo32105g() && (compareTo = C25082a.m62839c(this.longitude, mVTaxiEstimatedEtaRequest.longitude)) != 0) || (compareTo = Boolean.valueOf(mo32106h()).compareTo(Boolean.valueOf(mVTaxiEstimatedEtaRequest.mo32106h()))) != 0))) {
            return compareTo;
        }
        if (!mo32106h() || (c = C25082a.m62839c(this.taxiId, mVTaxiEstimatedEtaRequest.taxiId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTaxiEstimatedEtaRequest)) {
            return false;
        }
        MVTaxiEstimatedEtaRequest mVTaxiEstimatedEtaRequest = (MVTaxiEstimatedEtaRequest) obj;
        if (this.latitude != mVTaxiEstimatedEtaRequest.latitude || this.longitude != mVTaxiEstimatedEtaRequest.longitude) {
            return false;
        }
        boolean h = mo32106h();
        boolean h2 = mVTaxiEstimatedEtaRequest.mo32106h();
        if ((h || h2) && (!h || !h2 || this.taxiId != mVTaxiEstimatedEtaRequest.taxiId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32104f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo32105g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo32106h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo32108i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo32109j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo32110k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiEstimatedEtaRequest(", "latitude:");
        C0016g.m42z(n, this.latitude, ", ", "longitude:");
        n.append(this.longitude);
        if (mo32106h()) {
            n.append(", ");
            n.append("taxiId:");
            n.append(this.taxiId);
        }
        n.append(")");
        return n.toString();
    }
}
