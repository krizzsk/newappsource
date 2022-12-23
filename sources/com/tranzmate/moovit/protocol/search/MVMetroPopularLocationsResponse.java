package com.tranzmate.moovit.protocol.search;

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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVMetroPopularLocationsResponse implements TBase<MVMetroPopularLocationsResponse, _Fields>, Serializable, Cloneable, Comparable<MVMetroPopularLocationsResponse> {

    /* renamed from: b */
    public static final C25113c f28164b = new C25113c("popularLocations", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28165c = new C25113c("searchCaptions", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f28166d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28167e;
    private _Fields[] optionals = {_Fields.POPULAR_LOCATIONS, _Fields.SEARCH_CAPTIONS};
    public List<MVSearchResponseItem> popularLocations;
    public List<String> searchCaptions;

    public enum _Fields implements C25085c {
        POPULAR_LOCATIONS(1, "popularLocations"),
        SEARCH_CAPTIONS(2, "searchCaptions");
        
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
                return POPULAR_LOCATIONS;
            }
            if (i != 2) {
                return null;
            }
            return SEARCH_CAPTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVMetroPopularLocationsResponse$a */
    public static class C10419a extends C25239c<MVMetroPopularLocationsResponse> {
        public C10419a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroPopularLocationsResponse mVMetroPopularLocationsResponse = (MVMetroPopularLocationsResponse) tBase;
            mVMetroPopularLocationsResponse.getClass();
            C25113c cVar = MVMetroPopularLocationsResponse.f28164b;
            gVar.mo61687K();
            if (mVMetroPopularLocationsResponse.popularLocations != null && mVMetroPopularLocationsResponse.mo31451f()) {
                gVar.mo61711x(MVMetroPopularLocationsResponse.f28164b);
                gVar.mo61680D(new C25119e((byte) 12, mVMetroPopularLocationsResponse.popularLocations.size()));
                for (MVSearchResponseItem X0 : mVMetroPopularLocationsResponse.popularLocations) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMetroPopularLocationsResponse.searchCaptions != null && mVMetroPopularLocationsResponse.mo31452g()) {
                gVar.mo61711x(MVMetroPopularLocationsResponse.f28165c);
                gVar.mo61680D(new C25119e((byte) 11, mVMetroPopularLocationsResponse.searchCaptions.size()));
                for (String J : mVMetroPopularLocationsResponse.searchCaptions) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroPopularLocationsResponse mVMetroPopularLocationsResponse = (MVMetroPopularLocationsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMetroPopularLocationsResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVMetroPopularLocationsResponse.searchCaptions = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            mVMetroPopularLocationsResponse.searchCaptions.add(gVar.mo61704q());
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVMetroPopularLocationsResponse.popularLocations = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVSearchResponseItem mVSearchResponseItem = new MVSearchResponseItem();
                        mVSearchResponseItem.mo25201C1(gVar);
                        mVMetroPopularLocationsResponse.popularLocations.add(mVSearchResponseItem);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVMetroPopularLocationsResponse$b */
    public static class C10420b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10419a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVMetroPopularLocationsResponse$c */
    public static class C10421c extends C25240d<MVMetroPopularLocationsResponse> {
        public C10421c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroPopularLocationsResponse mVMetroPopularLocationsResponse = (MVMetroPopularLocationsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMetroPopularLocationsResponse.mo31451f()) {
                bitSet.set(0);
            }
            if (mVMetroPopularLocationsResponse.mo31452g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMetroPopularLocationsResponse.mo31451f()) {
                jVar.mo61678B(mVMetroPopularLocationsResponse.popularLocations.size());
                for (MVSearchResponseItem X0 : mVMetroPopularLocationsResponse.popularLocations) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVMetroPopularLocationsResponse.mo31452g()) {
                jVar.mo61678B(mVMetroPopularLocationsResponse.searchCaptions.size());
                for (String J : mVMetroPopularLocationsResponse.searchCaptions) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroPopularLocationsResponse mVMetroPopularLocationsResponse = (MVMetroPopularLocationsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVMetroPopularLocationsResponse.popularLocations = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSearchResponseItem mVSearchResponseItem = new MVSearchResponseItem();
                    mVSearchResponseItem.mo25201C1(jVar);
                    mVMetroPopularLocationsResponse.popularLocations.add(mVSearchResponseItem);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVMetroPopularLocationsResponse.searchCaptions = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVMetroPopularLocationsResponse.searchCaptions.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVMetroPopularLocationsResponse$d */
    public static class C10422d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10421c(0);
        }
    }

    static {
        new C17394d0("MVMetroPopularLocationsResponse");
        HashMap hashMap = new HashMap();
        f28166d = hashMap;
        hashMap.put(C25239c.class, new C10420b());
        hashMap.put(C25240d.class, new C10422d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.POPULAR_LOCATIONS, new FieldMetaData("popularLocations", (byte) 2, new ListMetaData(new StructMetaData(MVSearchResponseItem.class))));
        enumMap.put(_Fields.SEARCH_CAPTIONS, new FieldMetaData("searchCaptions", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28167e = unmodifiableMap;
        FieldMetaData.m61947a(MVMetroPopularLocationsResponse.class, unmodifiableMap);
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
        ((C25238b) f28166d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28166d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVMetroPopularLocationsResponse mVMetroPopularLocationsResponse = (MVMetroPopularLocationsResponse) obj;
        if (!getClass().equals(mVMetroPopularLocationsResponse.getClass())) {
            return getClass().getName().compareTo(mVMetroPopularLocationsResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31451f()).compareTo(Boolean.valueOf(mVMetroPopularLocationsResponse.mo31451f()));
        if (compareTo != 0 || ((mo31451f() && (compareTo = C25082a.m62844h(this.popularLocations, mVMetroPopularLocationsResponse.popularLocations)) != 0) || (compareTo = Boolean.valueOf(mo31452g()).compareTo(Boolean.valueOf(mVMetroPopularLocationsResponse.mo31452g()))) != 0)) {
            return compareTo;
        }
        if (!mo31452g() || (h = C25082a.m62844h(this.searchCaptions, mVMetroPopularLocationsResponse.searchCaptions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMetroPopularLocationsResponse)) {
            return false;
        }
        MVMetroPopularLocationsResponse mVMetroPopularLocationsResponse = (MVMetroPopularLocationsResponse) obj;
        boolean f = mo31451f();
        boolean f2 = mVMetroPopularLocationsResponse.mo31451f();
        if ((f || f2) && (!f || !f2 || !this.popularLocations.equals(mVMetroPopularLocationsResponse.popularLocations))) {
            return false;
        }
        boolean g = mo31452g();
        boolean g2 = mVMetroPopularLocationsResponse.mo31452g();
        if ((g || g2) && (!g || !g2 || !this.searchCaptions.equals(mVMetroPopularLocationsResponse.searchCaptions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31451f() {
        return this.popularLocations != null;
    }

    /* renamed from: g */
    public final boolean mo31452g() {
        return this.searchCaptions != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVMetroPopularLocationsResponse(");
        if (mo31451f()) {
            sb.append("popularLocations:");
            List<MVSearchResponseItem> list = this.popularLocations;
            if (list == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(list);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo31452g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("searchCaptions:");
            List<String> list2 = this.searchCaptions;
            if (list2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(list2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
