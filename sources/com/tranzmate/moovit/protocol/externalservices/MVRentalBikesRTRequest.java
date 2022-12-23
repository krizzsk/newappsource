package com.tranzmate.moovit.protocol.externalservices;

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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
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

public class MVRentalBikesRTRequest implements TBase<MVRentalBikesRTRequest, _Fields>, Serializable, Cloneable, Comparable<MVRentalBikesRTRequest> {

    /* renamed from: b */
    public static final C25113c f25609b = new C25113c("rentalBikeStopIds", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f25610c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f25611d;
    public List<Integer> rentalBikeStopIds;

    public enum _Fields implements C25085c {
        RENTAL_BIKE_STOP_IDS(1, "rentalBikeStopIds");
        
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
            return RENTAL_BIKE_STOP_IDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTRequest$a */
    public static class C8715a extends C25239c<MVRentalBikesRTRequest> {
        public C8715a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRentalBikesRTRequest mVRentalBikesRTRequest = (MVRentalBikesRTRequest) tBase;
            mVRentalBikesRTRequest.getClass();
            C25113c cVar = MVRentalBikesRTRequest.f25609b;
            gVar.mo61687K();
            if (mVRentalBikesRTRequest.rentalBikeStopIds != null) {
                gVar.mo61711x(MVRentalBikesRTRequest.f25609b);
                gVar.mo61680D(new C25119e((byte) 8, mVRentalBikesRTRequest.rentalBikeStopIds.size()));
                for (Integer intValue : mVRentalBikesRTRequest.rentalBikeStopIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRentalBikesRTRequest mVRentalBikesRTRequest = (MVRentalBikesRTRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRentalBikesRTRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVRentalBikesRTRequest.rentalBikeStopIds = new ArrayList(k.f63395b);
                    int i = 0;
                    while (i < k.f63395b) {
                        i = C13437d.m33701f(gVar.mo61696i(), mVRentalBikesRTRequest.rentalBikeStopIds, i, 1);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTRequest$b */
    public static class C8716b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8715a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTRequest$c */
    public static class C8717c extends C25240d<MVRentalBikesRTRequest> {
        public C8717c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRentalBikesRTRequest mVRentalBikesRTRequest = (MVRentalBikesRTRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRentalBikesRTRequest.mo27174f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVRentalBikesRTRequest.mo27174f()) {
                jVar.mo61678B(mVRentalBikesRTRequest.rentalBikeStopIds.size());
                for (Integer intValue : mVRentalBikesRTRequest.rentalBikeStopIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRentalBikesRTRequest mVRentalBikesRTRequest = (MVRentalBikesRTRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVRentalBikesRTRequest.rentalBikeStopIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVRentalBikesRTRequest.rentalBikeStopIds, i2, 1)) {
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTRequest$d */
    public static class C8718d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8717c(0);
        }
    }

    static {
        new C17394d0("MVRentalBikesRTRequest");
        HashMap hashMap = new HashMap();
        f25610c = hashMap;
        hashMap.put(C25239c.class, new C8716b());
        hashMap.put(C25240d.class, new C8718d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RENTAL_BIKE_STOP_IDS, new FieldMetaData("rentalBikeStopIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25611d = unmodifiableMap;
        FieldMetaData.m61947a(MVRentalBikesRTRequest.class, unmodifiableMap);
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
        ((C25238b) f25610c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25610c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVRentalBikesRTRequest mVRentalBikesRTRequest = (MVRentalBikesRTRequest) obj;
        if (!getClass().equals(mVRentalBikesRTRequest.getClass())) {
            return getClass().getName().compareTo(mVRentalBikesRTRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27174f()).compareTo(Boolean.valueOf(mVRentalBikesRTRequest.mo27174f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo27174f() || (h = C25082a.m62844h(this.rentalBikeStopIds, mVRentalBikesRTRequest.rentalBikeStopIds)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRentalBikesRTRequest)) {
            return false;
        }
        MVRentalBikesRTRequest mVRentalBikesRTRequest = (MVRentalBikesRTRequest) obj;
        boolean f = mo27174f();
        boolean f2 = mVRentalBikesRTRequest.mo27174f();
        if ((f || f2) && (!f || !f2 || !this.rentalBikeStopIds.equals(mVRentalBikesRTRequest.rentalBikeStopIds))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27174f() {
        return this.rentalBikeStopIds != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRentalBikesRTRequest(", "rentalBikeStopIds:");
        List<Integer> list = this.rentalBikeStopIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
