package com.tranzmate.moovit.protocol.tripplanner;

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

public class MVSingleTripPlanResponse implements TBase<MVSingleTripPlanResponse, _Fields>, Serializable, Cloneable, Comparable<MVSingleTripPlanResponse> {

    /* renamed from: b */
    public static final C25113c f30048b = new C25113c("itinerary", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f30049c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f30050d;
    public MVTripPlanItinerary itinerary;
    private _Fields[] optionals = {_Fields.ITINERARY};

    public enum _Fields implements C25085c {
        ITINERARY(1, "itinerary");
        
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
            return ITINERARY;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVSingleTripPlanResponse$a */
    public static class C11622a extends C25239c<MVSingleTripPlanResponse> {
        public C11622a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSingleTripPlanResponse mVSingleTripPlanResponse = (MVSingleTripPlanResponse) tBase;
            MVTripPlanItinerary mVTripPlanItinerary = mVSingleTripPlanResponse.itinerary;
            C25113c cVar = MVSingleTripPlanResponse.f30048b;
            gVar.mo61687K();
            if (mVSingleTripPlanResponse.itinerary != null && mVSingleTripPlanResponse.mo34540f()) {
                gVar.mo61711x(MVSingleTripPlanResponse.f30048b);
                mVSingleTripPlanResponse.itinerary.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSingleTripPlanResponse mVSingleTripPlanResponse = (MVSingleTripPlanResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTripPlanItinerary mVTripPlanItinerary = mVSingleTripPlanResponse.itinerary;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVTripPlanItinerary mVTripPlanItinerary2 = new MVTripPlanItinerary();
                    mVSingleTripPlanResponse.itinerary = mVTripPlanItinerary2;
                    mVTripPlanItinerary2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVSingleTripPlanResponse$b */
    public static class C11623b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11622a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVSingleTripPlanResponse$c */
    public static class C11624c extends C25240d<MVSingleTripPlanResponse> {
        public C11624c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSingleTripPlanResponse mVSingleTripPlanResponse = (MVSingleTripPlanResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSingleTripPlanResponse.mo34540f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVSingleTripPlanResponse.mo34540f()) {
                mVSingleTripPlanResponse.itinerary.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSingleTripPlanResponse mVSingleTripPlanResponse = (MVSingleTripPlanResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVTripPlanItinerary mVTripPlanItinerary = new MVTripPlanItinerary();
                mVSingleTripPlanResponse.itinerary = mVTripPlanItinerary;
                mVTripPlanItinerary.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVSingleTripPlanResponse$d */
    public static class C11625d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11624c(0);
        }
    }

    static {
        new C17394d0("MVSingleTripPlanResponse");
        HashMap hashMap = new HashMap();
        f30049c = hashMap;
        hashMap.put(C25239c.class, new C11623b());
        hashMap.put(C25240d.class, new C11625d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ITINERARY, new FieldMetaData("itinerary", (byte) 2, new StructMetaData(MVTripPlanItinerary.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30050d = unmodifiableMap;
        FieldMetaData.m61947a(MVSingleTripPlanResponse.class, unmodifiableMap);
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
        ((C25238b) f30049c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30049c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSingleTripPlanResponse mVSingleTripPlanResponse = (MVSingleTripPlanResponse) obj;
        if (!getClass().equals(mVSingleTripPlanResponse.getClass())) {
            return getClass().getName().compareTo(mVSingleTripPlanResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34540f()).compareTo(Boolean.valueOf(mVSingleTripPlanResponse.mo34540f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo34540f() || (compareTo = this.itinerary.compareTo(mVSingleTripPlanResponse.itinerary)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSingleTripPlanResponse)) {
            return false;
        }
        MVSingleTripPlanResponse mVSingleTripPlanResponse = (MVSingleTripPlanResponse) obj;
        boolean f = mo34540f();
        boolean f2 = mVSingleTripPlanResponse.mo34540f();
        if ((f || f2) && (!f || !f2 || !this.itinerary.mo34623a(mVSingleTripPlanResponse.itinerary))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34540f() {
        return this.itinerary != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVSingleTripPlanResponse(");
        if (mo34540f()) {
            sb.append("itinerary:");
            MVTripPlanItinerary mVTripPlanItinerary = this.itinerary;
            if (mVTripPlanItinerary == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVTripPlanItinerary);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
