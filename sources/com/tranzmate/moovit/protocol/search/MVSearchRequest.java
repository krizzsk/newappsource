package com.tranzmate.moovit.protocol.search;

import com.appboy.support.StringUtils;
import com.google.android.gms.actions.SearchIntents;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.users.MVLocale;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p389bl.C13637c;
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

public class MVSearchRequest implements TBase<MVSearchRequest, _Fields>, Serializable, Cloneable, Comparable<MVSearchRequest> {

    /* renamed from: b */
    public static final C25113c f28180b = new C25113c(SearchIntents.EXTRA_QUERY, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28181c = new C25113c("metroAreaId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28182d = new C25113c("userLocation", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28183e = new C25113c("startIndex", (byte) 6, 4);

    /* renamed from: f */
    public static final C25113c f28184f = new C25113c("useGeoCoder", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f28185g = new C25113c("rank", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f28186h = new C25113c("returnSortingInfo", (byte) 2, 7);

    /* renamed from: i */
    public static final C25113c f28187i = new C25113c("requiredResults", (byte) 15, 8);

    /* renamed from: j */
    public static final C25113c f28188j = new C25113c("locale", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f28189k = new C25113c("dontRemovePOI", (byte) 2, 10);

    /* renamed from: l */
    public static final HashMap f28190l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f28191m;
    private byte __isset_bitfield;
    public boolean dontRemovePOI;
    public MVLocale locale;
    public int metroAreaId;
    private _Fields[] optionals;
    public String query;
    public MVSearchRequestRank rank;
    public List<MVSearchResultType> requiredResults;
    public boolean returnSortingInfo;
    public short startIndex;
    public boolean useGeoCoder;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        QUERY(1, SearchIntents.EXTRA_QUERY),
        METRO_AREA_ID(2, "metroAreaId"),
        USER_LOCATION(3, "userLocation"),
        START_INDEX(4, "startIndex"),
        USE_GEO_CODER(5, "useGeoCoder"),
        RANK(6, "rank"),
        RETURN_SORTING_INFO(7, "returnSortingInfo"),
        REQUIRED_RESULTS(8, "requiredResults"),
        LOCALE(9, "locale"),
        DONT_REMOVE_POI(10, "dontRemovePOI");
        
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
            switch (i) {
                case 1:
                    return QUERY;
                case 2:
                    return METRO_AREA_ID;
                case 3:
                    return USER_LOCATION;
                case 4:
                    return START_INDEX;
                case 5:
                    return USE_GEO_CODER;
                case 6:
                    return RANK;
                case 7:
                    return RETURN_SORTING_INFO;
                case 8:
                    return REQUIRED_RESULTS;
                case 9:
                    return LOCALE;
                case 10:
                    return DONT_REMOVE_POI;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchRequest$a */
    public static class C10431a extends C25239c<MVSearchRequest> {
        public C10431a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchRequest mVSearchRequest = (MVSearchRequest) tBase;
            MVLatLon mVLatLon = mVSearchRequest.userLocation;
            C25113c cVar = MVSearchRequest.f28180b;
            gVar.mo61687K();
            if (mVSearchRequest.query != null) {
                gVar.mo61711x(MVSearchRequest.f28180b);
                gVar.mo61686J(mVSearchRequest.query);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSearchRequest.f28181c);
            gVar.mo61678B(mVSearchRequest.metroAreaId);
            gVar.mo61712y();
            if (mVSearchRequest.userLocation != null && mVSearchRequest.mo31488p()) {
                gVar.mo61711x(MVSearchRequest.f28182d);
                mVSearchRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSearchRequest.f28183e);
            gVar.mo61677A(mVSearchRequest.startIndex);
            gVar.mo61712y();
            if (mVSearchRequest.mo31487o()) {
                gVar.mo61711x(MVSearchRequest.f28184f);
                gVar.mo61708u(mVSearchRequest.useGeoCoder);
                gVar.mo61712y();
            }
            if (mVSearchRequest.rank != null && mVSearchRequest.mo31483j()) {
                gVar.mo61711x(MVSearchRequest.f28185g);
                mVSearchRequest.rank.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSearchRequest.mo31485l()) {
                gVar.mo61711x(MVSearchRequest.f28186h);
                gVar.mo61708u(mVSearchRequest.returnSortingInfo);
                gVar.mo61712y();
            }
            if (mVSearchRequest.requiredResults != null && mVSearchRequest.mo31484k()) {
                gVar.mo61711x(MVSearchRequest.f28187i);
                gVar.mo61680D(new C25119e((byte) 8, mVSearchRequest.requiredResults.size()));
                for (MVSearchResultType value : mVSearchRequest.requiredResults) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSearchRequest.locale != null && mVSearchRequest.mo31479g()) {
                gVar.mo61711x(MVSearchRequest.f28188j);
                mVSearchRequest.locale.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSearchRequest.mo31478f()) {
                gVar.mo61711x(MVSearchRequest.f28189k);
                gVar.mo61708u(mVSearchRequest.dontRemovePOI);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchRequest mVSearchRequest = (MVSearchRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVSearchRequest.userLocation;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchRequest.query = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchRequest.metroAreaId = gVar.mo61696i();
                            mVSearchRequest.mo31490r();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVSearchRequest.userLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 6) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchRequest.startIndex = gVar.mo61695h();
                            mVSearchRequest.mo31492t();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchRequest.useGeoCoder = gVar.mo61690c();
                            mVSearchRequest.mo31494u();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVSearchRequestRank mVSearchRequestRank = new MVSearchRequestRank();
                            mVSearchRequest.rank = mVSearchRequestRank;
                            mVSearchRequestRank.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchRequest.returnSortingInfo = gVar.mo61690c();
                            mVSearchRequest.mo31491s();
                            break;
                        }
                    case 8:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVSearchRequest.requiredResults = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVSearchRequest.requiredResults.add(MVSearchResultType.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocale mVLocale = new MVLocale();
                            mVSearchRequest.locale = mVLocale;
                            mVLocale.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchRequest.dontRemovePOI = gVar.mo61690c();
                            mVSearchRequest.mo31489q();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchRequest$b */
    public static class C10432b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10431a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchRequest$c */
    public static class C10433c extends C25240d<MVSearchRequest> {
        public C10433c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchRequest mVSearchRequest = (MVSearchRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSearchRequest.mo31482i()) {
                bitSet.set(0);
            }
            if (mVSearchRequest.mo31480h()) {
                bitSet.set(1);
            }
            if (mVSearchRequest.mo31488p()) {
                bitSet.set(2);
            }
            if (mVSearchRequest.mo31486m()) {
                bitSet.set(3);
            }
            if (mVSearchRequest.mo31487o()) {
                bitSet.set(4);
            }
            if (mVSearchRequest.mo31483j()) {
                bitSet.set(5);
            }
            if (mVSearchRequest.mo31485l()) {
                bitSet.set(6);
            }
            if (mVSearchRequest.mo31484k()) {
                bitSet.set(7);
            }
            if (mVSearchRequest.mo31479g()) {
                bitSet.set(8);
            }
            if (mVSearchRequest.mo31478f()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVSearchRequest.mo31482i()) {
                jVar.mo61686J(mVSearchRequest.query);
            }
            if (mVSearchRequest.mo31480h()) {
                jVar.mo61678B(mVSearchRequest.metroAreaId);
            }
            if (mVSearchRequest.mo31488p()) {
                mVSearchRequest.userLocation.mo25202X0(jVar);
            }
            if (mVSearchRequest.mo31486m()) {
                jVar.mo61677A(mVSearchRequest.startIndex);
            }
            if (mVSearchRequest.mo31487o()) {
                jVar.mo61708u(mVSearchRequest.useGeoCoder);
            }
            if (mVSearchRequest.mo31483j()) {
                mVSearchRequest.rank.mo25202X0(jVar);
            }
            if (mVSearchRequest.mo31485l()) {
                jVar.mo61708u(mVSearchRequest.returnSortingInfo);
            }
            if (mVSearchRequest.mo31484k()) {
                jVar.mo61678B(mVSearchRequest.requiredResults.size());
                for (MVSearchResultType value : mVSearchRequest.requiredResults) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVSearchRequest.mo31479g()) {
                mVSearchRequest.locale.mo25202X0(jVar);
            }
            if (mVSearchRequest.mo31478f()) {
                jVar.mo61708u(mVSearchRequest.dontRemovePOI);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchRequest mVSearchRequest = (MVSearchRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                mVSearchRequest.query = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVSearchRequest.metroAreaId = jVar.mo61696i();
                mVSearchRequest.mo31490r();
            }
            if (T.get(2)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVSearchRequest.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVSearchRequest.startIndex = jVar.mo61695h();
                mVSearchRequest.mo31492t();
            }
            if (T.get(4)) {
                mVSearchRequest.useGeoCoder = jVar.mo61690c();
                mVSearchRequest.mo31494u();
            }
            if (T.get(5)) {
                MVSearchRequestRank mVSearchRequestRank = new MVSearchRequestRank();
                mVSearchRequest.rank = mVSearchRequestRank;
                mVSearchRequestRank.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVSearchRequest.returnSortingInfo = jVar.mo61690c();
                mVSearchRequest.mo31491s();
            }
            if (T.get(7)) {
                int i = jVar.mo61696i();
                mVSearchRequest.requiredResults = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVSearchRequest.requiredResults.add(MVSearchResultType.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(8)) {
                MVLocale mVLocale = new MVLocale();
                mVSearchRequest.locale = mVLocale;
                mVLocale.mo25201C1(jVar);
            }
            if (T.get(9)) {
                mVSearchRequest.dontRemovePOI = jVar.mo61690c();
                mVSearchRequest.mo31489q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchRequest$d */
    public static class C10434d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10433c(0);
        }
    }

    static {
        new C17394d0("MVSearchRequest");
        HashMap hashMap = new HashMap();
        f28190l = hashMap;
        hashMap.put(C25239c.class, new C10432b());
        hashMap.put(C25240d.class, new C10434d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.QUERY, new FieldMetaData(SearchIntents.EXTRA_QUERY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.METRO_AREA_ID, new FieldMetaData("metroAreaId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.START_INDEX, new FieldMetaData("startIndex", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.USE_GEO_CODER, new FieldMetaData("useGeoCoder", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.RANK, new FieldMetaData("rank", (byte) 2, new StructMetaData(MVSearchRequestRank.class)));
        enumMap.put(_Fields.RETURN_SORTING_INFO, new FieldMetaData("returnSortingInfo", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.REQUIRED_RESULTS, new FieldMetaData("requiredResults", (byte) 2, new ListMetaData(new EnumMetaData(MVSearchResultType.class))));
        enumMap.put(_Fields.LOCALE, new FieldMetaData("locale", (byte) 2, new StructMetaData(MVLocale.class)));
        enumMap.put(_Fields.DONT_REMOVE_POI, new FieldMetaData("dontRemovePOI", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28191m = unmodifiableMap;
        FieldMetaData.m61947a(MVSearchRequest.class, unmodifiableMap);
    }

    public MVSearchRequest() {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.USER_LOCATION, _Fields.USE_GEO_CODER, _Fields.RANK, _Fields.RETURN_SORTING_INFO, _Fields.REQUIRED_RESULTS, _Fields.LOCALE, _Fields.DONT_REMOVE_POI};
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
        ((C25238b) f28190l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28190l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVSearchRequest mVSearchRequest = (MVSearchRequest) obj;
        if (!getClass().equals(mVSearchRequest.getClass())) {
            return getClass().getName().compareTo(mVSearchRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31482i()).compareTo(Boolean.valueOf(mVSearchRequest.mo31482i()));
        if (compareTo != 0 || ((mo31482i() && (compareTo = this.query.compareTo(mVSearchRequest.query)) != 0) || (compareTo = Boolean.valueOf(mo31480h()).compareTo(Boolean.valueOf(mVSearchRequest.mo31480h()))) != 0 || ((mo31480h() && (compareTo = C25082a.m62839c(this.metroAreaId, mVSearchRequest.metroAreaId)) != 0) || (compareTo = Boolean.valueOf(mo31488p()).compareTo(Boolean.valueOf(mVSearchRequest.mo31488p()))) != 0 || ((mo31488p() && (compareTo = this.userLocation.compareTo(mVSearchRequest.userLocation)) != 0) || (compareTo = Boolean.valueOf(mo31486m()).compareTo(Boolean.valueOf(mVSearchRequest.mo31486m()))) != 0 || ((mo31486m() && (compareTo = C25082a.m62847k(this.startIndex, mVSearchRequest.startIndex)) != 0) || (compareTo = Boolean.valueOf(mo31487o()).compareTo(Boolean.valueOf(mVSearchRequest.mo31487o()))) != 0 || ((mo31487o() && (compareTo = C25082a.m62848l(this.useGeoCoder, mVSearchRequest.useGeoCoder)) != 0) || (compareTo = Boolean.valueOf(mo31483j()).compareTo(Boolean.valueOf(mVSearchRequest.mo31483j()))) != 0 || ((mo31483j() && (compareTo = this.rank.compareTo(mVSearchRequest.rank)) != 0) || (compareTo = Boolean.valueOf(mo31485l()).compareTo(Boolean.valueOf(mVSearchRequest.mo31485l()))) != 0 || ((mo31485l() && (compareTo = C25082a.m62848l(this.returnSortingInfo, mVSearchRequest.returnSortingInfo)) != 0) || (compareTo = Boolean.valueOf(mo31484k()).compareTo(Boolean.valueOf(mVSearchRequest.mo31484k()))) != 0 || ((mo31484k() && (compareTo = C25082a.m62844h(this.requiredResults, mVSearchRequest.requiredResults)) != 0) || (compareTo = Boolean.valueOf(mo31479g()).compareTo(Boolean.valueOf(mVSearchRequest.mo31479g()))) != 0 || ((mo31479g() && (compareTo = this.locale.compareTo(mVSearchRequest.locale)) != 0) || (compareTo = Boolean.valueOf(mo31478f()).compareTo(Boolean.valueOf(mVSearchRequest.mo31478f()))) != 0)))))))))) {
            return compareTo;
        }
        if (!mo31478f() || (l = C25082a.m62848l(this.dontRemovePOI, mVSearchRequest.dontRemovePOI)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSearchRequest)) {
            return false;
        }
        MVSearchRequest mVSearchRequest = (MVSearchRequest) obj;
        boolean i = mo31482i();
        boolean i2 = mVSearchRequest.mo31482i();
        if (((i || i2) && (!i || !i2 || !this.query.equals(mVSearchRequest.query))) || this.metroAreaId != mVSearchRequest.metroAreaId) {
            return false;
        }
        boolean p = mo31488p();
        boolean p2 = mVSearchRequest.mo31488p();
        if (((p || p2) && (!p || !p2 || !this.userLocation.mo26290a(mVSearchRequest.userLocation))) || this.startIndex != mVSearchRequest.startIndex) {
            return false;
        }
        boolean o = mo31487o();
        boolean o2 = mVSearchRequest.mo31487o();
        if ((o || o2) && (!o || !o2 || this.useGeoCoder != mVSearchRequest.useGeoCoder)) {
            return false;
        }
        boolean j = mo31483j();
        boolean j2 = mVSearchRequest.mo31483j();
        if ((j || j2) && (!j || !j2 || !this.rank.mo31496a(mVSearchRequest.rank))) {
            return false;
        }
        boolean l = mo31485l();
        boolean l2 = mVSearchRequest.mo31485l();
        if ((l || l2) && (!l || !l2 || this.returnSortingInfo != mVSearchRequest.returnSortingInfo)) {
            return false;
        }
        boolean k = mo31484k();
        boolean k2 = mVSearchRequest.mo31484k();
        if ((k || k2) && (!k || !k2 || !this.requiredResults.equals(mVSearchRequest.requiredResults))) {
            return false;
        }
        boolean g = mo31479g();
        boolean g2 = mVSearchRequest.mo31479g();
        if ((g || g2) && (!g || !g2 || !this.locale.mo35206a(mVSearchRequest.locale))) {
            return false;
        }
        boolean f = mo31478f();
        boolean f2 = mVSearchRequest.mo31478f();
        if ((f || f2) && (!f || !f2 || this.dontRemovePOI != mVSearchRequest.dontRemovePOI)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31478f() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: g */
    public final boolean mo31479g() {
        return this.locale != null;
    }

    /* renamed from: h */
    public final boolean mo31480h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31482i() {
        return this.query != null;
    }

    /* renamed from: j */
    public final boolean mo31483j() {
        return this.rank != null;
    }

    /* renamed from: k */
    public final boolean mo31484k() {
        return this.requiredResults != null;
    }

    /* renamed from: l */
    public final boolean mo31485l() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: m */
    public final boolean mo31486m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final boolean mo31487o() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: p */
    public final boolean mo31488p() {
        return this.userLocation != null;
    }

    /* renamed from: q */
    public final void mo31489q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: r */
    public final void mo31490r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: s */
    public final void mo31491s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: t */
    public final void mo31492t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSearchRequest(", "query:");
        String str = this.query;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("metroAreaId:");
        n.append(this.metroAreaId);
        if (mo31488p()) {
            n.append(", ");
            n.append("userLocation:");
            MVLatLon mVLatLon = this.userLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        n.append(", ");
        n.append("startIndex:");
        n.append(this.startIndex);
        if (mo31487o()) {
            n.append(", ");
            n.append("useGeoCoder:");
            n.append(this.useGeoCoder);
        }
        if (mo31483j()) {
            n.append(", ");
            n.append("rank:");
            MVSearchRequestRank mVSearchRequestRank = this.rank;
            if (mVSearchRequestRank == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSearchRequestRank);
            }
        }
        if (mo31485l()) {
            n.append(", ");
            n.append("returnSortingInfo:");
            n.append(this.returnSortingInfo);
        }
        if (mo31484k()) {
            n.append(", ");
            n.append("requiredResults:");
            List<MVSearchResultType> list = this.requiredResults;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo31479g()) {
            n.append(", ");
            n.append("locale:");
            MVLocale mVLocale = this.locale;
            if (mVLocale == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocale);
            }
        }
        if (mo31478f()) {
            n.append(", ");
            n.append("dontRemovePOI:");
            n.append(this.dontRemovePOI);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo31494u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public MVSearchRequest(String str, int i, short s) {
        this();
        this.query = str;
        this.metroAreaId = i;
        mo31490r();
        this.startIndex = s;
        mo31492t();
    }
}
