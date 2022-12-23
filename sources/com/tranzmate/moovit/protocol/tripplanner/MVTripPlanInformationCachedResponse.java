package com.tranzmate.moovit.protocol.tripplanner;

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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVTripPlanInformationCachedResponse implements TBase<MVTripPlanInformationCachedResponse, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanInformationCachedResponse> {

    /* renamed from: b */
    public static final C25113c f30090b = new C25113c("itineraries", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f30091c = new C25113c("originalRequest", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f30092d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30093e;
    public List<MVTripPlanSectionedResponse> itineraries;
    public MVTripPlanRequest originalRequest;

    public enum _Fields implements C25085c {
        ITINERARIES(1, "itineraries"),
        ORIGINAL_REQUEST(2, "originalRequest");
        
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
                return ITINERARIES;
            }
            if (i != 2) {
                return null;
            }
            return ORIGINAL_REQUEST;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanInformationCachedResponse$a */
    public static class C11647a extends C25239c<MVTripPlanInformationCachedResponse> {
        public C11647a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanInformationCachedResponse mVTripPlanInformationCachedResponse = (MVTripPlanInformationCachedResponse) tBase;
            MVTripPlanRequest mVTripPlanRequest = mVTripPlanInformationCachedResponse.originalRequest;
            if (mVTripPlanRequest != null) {
                mVTripPlanRequest.mo34675H();
            }
            C25113c cVar = MVTripPlanInformationCachedResponse.f30090b;
            gVar.mo61687K();
            if (mVTripPlanInformationCachedResponse.itineraries != null) {
                gVar.mo61711x(MVTripPlanInformationCachedResponse.f30090b);
                gVar.mo61680D(new C25119e((byte) 12, mVTripPlanInformationCachedResponse.itineraries.size()));
                for (MVTripPlanSectionedResponse X0 : mVTripPlanInformationCachedResponse.itineraries) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTripPlanInformationCachedResponse.originalRequest != null) {
                gVar.mo61711x(MVTripPlanInformationCachedResponse.f30091c);
                mVTripPlanInformationCachedResponse.originalRequest.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanInformationCachedResponse mVTripPlanInformationCachedResponse = (MVTripPlanInformationCachedResponse) tBase;
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTripPlanRequest mVTripPlanRequest = new MVTripPlanRequest();
                        mVTripPlanInformationCachedResponse.originalRequest = mVTripPlanRequest;
                        mVTripPlanRequest.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVTripPlanInformationCachedResponse.itineraries = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVTripPlanSectionedResponse mVTripPlanSectionedResponse = new MVTripPlanSectionedResponse();
                        mVTripPlanSectionedResponse.mo25201C1(gVar);
                        mVTripPlanInformationCachedResponse.itineraries.add(mVTripPlanSectionedResponse);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTripPlanRequest mVTripPlanRequest2 = mVTripPlanInformationCachedResponse.originalRequest;
            if (mVTripPlanRequest2 != null) {
                mVTripPlanRequest2.mo34675H();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanInformationCachedResponse$b */
    public static class C11648b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11647a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanInformationCachedResponse$c */
    public static class C11649c extends C25240d<MVTripPlanInformationCachedResponse> {
        public C11649c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanInformationCachedResponse mVTripPlanInformationCachedResponse = (MVTripPlanInformationCachedResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanInformationCachedResponse.mo34614f()) {
                bitSet.set(0);
            }
            if (mVTripPlanInformationCachedResponse.mo34615g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTripPlanInformationCachedResponse.mo34614f()) {
                jVar.mo61678B(mVTripPlanInformationCachedResponse.itineraries.size());
                for (MVTripPlanSectionedResponse X0 : mVTripPlanInformationCachedResponse.itineraries) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTripPlanInformationCachedResponse.mo34615g()) {
                mVTripPlanInformationCachedResponse.originalRequest.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanInformationCachedResponse mVTripPlanInformationCachedResponse = (MVTripPlanInformationCachedResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVTripPlanInformationCachedResponse.itineraries = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTripPlanSectionedResponse mVTripPlanSectionedResponse = new MVTripPlanSectionedResponse();
                    mVTripPlanSectionedResponse.mo25201C1(jVar);
                    mVTripPlanInformationCachedResponse.itineraries.add(mVTripPlanSectionedResponse);
                }
            }
            if (T.get(1)) {
                MVTripPlanRequest mVTripPlanRequest = new MVTripPlanRequest();
                mVTripPlanInformationCachedResponse.originalRequest = mVTripPlanRequest;
                mVTripPlanRequest.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanInformationCachedResponse$d */
    public static class C11650d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11649c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanInformationCachedResponse");
        HashMap hashMap = new HashMap();
        f30092d = hashMap;
        hashMap.put(C25239c.class, new C11648b());
        hashMap.put(C25240d.class, new C11650d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ITINERARIES, new FieldMetaData("itineraries", (byte) 3, new ListMetaData(new StructMetaData(MVTripPlanSectionedResponse.class))));
        enumMap.put(_Fields.ORIGINAL_REQUEST, new FieldMetaData("originalRequest", (byte) 3, new StructMetaData(MVTripPlanRequest.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30093e = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanInformationCachedResponse.class, unmodifiableMap);
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
        ((C25238b) f30092d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30092d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanInformationCachedResponse mVTripPlanInformationCachedResponse = (MVTripPlanInformationCachedResponse) obj;
        if (!getClass().equals(mVTripPlanInformationCachedResponse.getClass())) {
            return getClass().getName().compareTo(mVTripPlanInformationCachedResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34614f()).compareTo(Boolean.valueOf(mVTripPlanInformationCachedResponse.mo34614f()));
        if (compareTo2 != 0 || ((mo34614f() && (compareTo2 = C25082a.m62844h(this.itineraries, mVTripPlanInformationCachedResponse.itineraries)) != 0) || (compareTo2 = Boolean.valueOf(mo34615g()).compareTo(Boolean.valueOf(mVTripPlanInformationCachedResponse.mo34615g()))) != 0)) {
            return compareTo2;
        }
        if (!mo34615g() || (compareTo = this.originalRequest.compareTo(mVTripPlanInformationCachedResponse.originalRequest)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripPlanInformationCachedResponse)) {
            return false;
        }
        MVTripPlanInformationCachedResponse mVTripPlanInformationCachedResponse = (MVTripPlanInformationCachedResponse) obj;
        boolean f = mo34614f();
        boolean f2 = mVTripPlanInformationCachedResponse.mo34614f();
        if ((f || f2) && (!f || !f2 || !this.itineraries.equals(mVTripPlanInformationCachedResponse.itineraries))) {
            return false;
        }
        boolean g = mo34615g();
        boolean g2 = mVTripPlanInformationCachedResponse.mo34615g();
        if ((g || g2) && (!g || !g2 || !this.originalRequest.mo34676a(mVTripPlanInformationCachedResponse.originalRequest))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34614f() {
        return this.itineraries != null;
    }

    /* renamed from: g */
    public final boolean mo34615g() {
        return this.originalRequest != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanInformationCachedResponse(", "itineraries:");
        List<MVTripPlanSectionedResponse> list = this.itineraries;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("originalRequest:");
        MVTripPlanRequest mVTripPlanRequest = this.originalRequest;
        if (mVTripPlanRequest == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripPlanRequest);
        }
        n.append(")");
        return n.toString();
    }
}
