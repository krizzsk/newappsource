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

public class MVTodChangeRideDestinationResponse implements TBase<MVTodChangeRideDestinationResponse, _Fields>, Serializable, Cloneable, Comparable<MVTodChangeRideDestinationResponse> {

    /* renamed from: b */
    public static final C25113c f29378b = new C25113c("offer", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f29379c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29380d;
    public MVTodRideUpdateOffer offer;

    public enum _Fields implements C25085c {
        OFFER(1, "offer");
        
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
            return OFFER;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationResponse$a */
    public static class C11209a extends C25239c<MVTodChangeRideDestinationResponse> {
        public C11209a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodChangeRideDestinationResponse mVTodChangeRideDestinationResponse = (MVTodChangeRideDestinationResponse) tBase;
            MVTodRideUpdateOffer mVTodRideUpdateOffer = mVTodChangeRideDestinationResponse.offer;
            if (mVTodRideUpdateOffer != null) {
                mVTodRideUpdateOffer.mo33769r();
            }
            C25113c cVar = MVTodChangeRideDestinationResponse.f29378b;
            gVar.mo61687K();
            if (mVTodChangeRideDestinationResponse.offer != null) {
                gVar.mo61711x(MVTodChangeRideDestinationResponse.f29378b);
                mVTodChangeRideDestinationResponse.offer.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodChangeRideDestinationResponse mVTodChangeRideDestinationResponse = (MVTodChangeRideDestinationResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVTodRideUpdateOffer mVTodRideUpdateOffer = new MVTodRideUpdateOffer();
                    mVTodChangeRideDestinationResponse.offer = mVTodRideUpdateOffer;
                    mVTodRideUpdateOffer.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTodRideUpdateOffer mVTodRideUpdateOffer2 = mVTodChangeRideDestinationResponse.offer;
            if (mVTodRideUpdateOffer2 != null) {
                mVTodRideUpdateOffer2.mo33769r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationResponse$b */
    public static class C11210b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11209a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationResponse$c */
    public static class C11211c extends C25240d<MVTodChangeRideDestinationResponse> {
        public C11211c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodChangeRideDestinationResponse mVTodChangeRideDestinationResponse = (MVTodChangeRideDestinationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodChangeRideDestinationResponse.mo33395f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVTodChangeRideDestinationResponse.mo33395f()) {
                mVTodChangeRideDestinationResponse.offer.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodChangeRideDestinationResponse mVTodChangeRideDestinationResponse = (MVTodChangeRideDestinationResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVTodRideUpdateOffer mVTodRideUpdateOffer = new MVTodRideUpdateOffer();
                mVTodChangeRideDestinationResponse.offer = mVTodRideUpdateOffer;
                mVTodRideUpdateOffer.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationResponse$d */
    public static class C11212d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11211c(0);
        }
    }

    static {
        new C17394d0("MVTodChangeRideDestinationResponse");
        HashMap hashMap = new HashMap();
        f29379c = hashMap;
        hashMap.put(C25239c.class, new C11210b());
        hashMap.put(C25240d.class, new C11212d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OFFER, new FieldMetaData("offer", (byte) 3, new StructMetaData(MVTodRideUpdateOffer.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29380d = unmodifiableMap;
        FieldMetaData.m61947a(MVTodChangeRideDestinationResponse.class, unmodifiableMap);
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
        ((C25238b) f29379c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29379c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodChangeRideDestinationResponse mVTodChangeRideDestinationResponse = (MVTodChangeRideDestinationResponse) obj;
        if (!getClass().equals(mVTodChangeRideDestinationResponse.getClass())) {
            return getClass().getName().compareTo(mVTodChangeRideDestinationResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33395f()).compareTo(Boolean.valueOf(mVTodChangeRideDestinationResponse.mo33395f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo33395f() || (compareTo = this.offer.compareTo(mVTodChangeRideDestinationResponse.offer)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodChangeRideDestinationResponse)) {
            return false;
        }
        MVTodChangeRideDestinationResponse mVTodChangeRideDestinationResponse = (MVTodChangeRideDestinationResponse) obj;
        boolean f = mo33395f();
        boolean f2 = mVTodChangeRideDestinationResponse.mo33395f();
        if ((f || f2) && (!f || !f2 || !this.offer.mo33754a(mVTodChangeRideDestinationResponse.offer))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33395f() {
        return this.offer != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodChangeRideDestinationResponse(", "offer:");
        MVTodRideUpdateOffer mVTodRideUpdateOffer = this.offer;
        if (mVTodRideUpdateOffer == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodRideUpdateOffer);
        }
        n.append(")");
        return n.toString();
    }
}
