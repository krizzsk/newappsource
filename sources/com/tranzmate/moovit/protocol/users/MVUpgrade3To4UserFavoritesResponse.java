package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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

public class MVUpgrade3To4UserFavoritesResponse implements TBase<MVUpgrade3To4UserFavoritesResponse, _Fields>, Serializable, Cloneable, Comparable<MVUpgrade3To4UserFavoritesResponse> {

    /* renamed from: b */
    public static final C25113c f30592b = new C25113c("lineStopPairList", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f30593c = new C25113c("favoriteLocations", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f30594d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30595e;
    public MVFavoriteLocations favoriteLocations;
    public List<MVFavoriteLineStopPair> lineStopPairList;

    public enum _Fields implements C25085c {
        LINE_STOP_PAIR_LIST(1, "lineStopPairList"),
        FAVORITE_LOCATIONS(2, "favoriteLocations");
        
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
                return LINE_STOP_PAIR_LIST;
            }
            if (i != 2) {
                return null;
            }
            return FAVORITE_LOCATIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserFavoritesResponse$a */
    public static class C11945a extends C25239c<MVUpgrade3To4UserFavoritesResponse> {
        public C11945a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocationDescriptor mVLocationDescriptor;
            MVLocationDescriptor mVLocationDescriptor2;
            MVUpgrade3To4UserFavoritesResponse mVUpgrade3To4UserFavoritesResponse = (MVUpgrade3To4UserFavoritesResponse) tBase;
            MVFavoriteLocations mVFavoriteLocations = mVUpgrade3To4UserFavoritesResponse.favoriteLocations;
            if (mVFavoriteLocations != null) {
                MVUserFavoriteLocation mVUserFavoriteLocation = mVFavoriteLocations.homeLocation;
                if (!(mVUserFavoriteLocation == null || (mVLocationDescriptor2 = mVUserFavoriteLocation.descriptor) == null)) {
                    mVLocationDescriptor2.mo26333s();
                }
                MVUserFavoriteLocation mVUserFavoriteLocation2 = mVFavoriteLocations.workLocaiton;
                if (!(mVUserFavoriteLocation2 == null || (mVLocationDescriptor = mVUserFavoriteLocation2.descriptor) == null)) {
                    mVLocationDescriptor.mo26333s();
                }
            }
            C25113c cVar = MVUpgrade3To4UserFavoritesResponse.f30592b;
            gVar.mo61687K();
            if (mVUpgrade3To4UserFavoritesResponse.lineStopPairList != null) {
                gVar.mo61711x(MVUpgrade3To4UserFavoritesResponse.f30592b);
                gVar.mo61680D(new C25119e((byte) 12, mVUpgrade3To4UserFavoritesResponse.lineStopPairList.size()));
                for (MVFavoriteLineStopPair X0 : mVUpgrade3To4UserFavoritesResponse.lineStopPairList) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVUpgrade3To4UserFavoritesResponse.favoriteLocations != null) {
                gVar.mo61711x(MVUpgrade3To4UserFavoritesResponse.f30593c);
                mVUpgrade3To4UserFavoritesResponse.favoriteLocations.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocationDescriptor mVLocationDescriptor;
            MVLocationDescriptor mVLocationDescriptor2;
            MVUpgrade3To4UserFavoritesResponse mVUpgrade3To4UserFavoritesResponse = (MVUpgrade3To4UserFavoritesResponse) tBase;
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
                        MVFavoriteLocations mVFavoriteLocations = new MVFavoriteLocations();
                        mVUpgrade3To4UserFavoritesResponse.favoriteLocations = mVFavoriteLocations;
                        mVFavoriteLocations.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVUpgrade3To4UserFavoritesResponse.lineStopPairList = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVFavoriteLineStopPair mVFavoriteLineStopPair = new MVFavoriteLineStopPair();
                        mVFavoriteLineStopPair.mo25201C1(gVar);
                        mVUpgrade3To4UserFavoritesResponse.lineStopPairList.add(mVFavoriteLineStopPair);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVFavoriteLocations mVFavoriteLocations2 = mVUpgrade3To4UserFavoritesResponse.favoriteLocations;
            if (mVFavoriteLocations2 != null) {
                MVUserFavoriteLocation mVUserFavoriteLocation = mVFavoriteLocations2.homeLocation;
                if (!(mVUserFavoriteLocation == null || (mVLocationDescriptor2 = mVUserFavoriteLocation.descriptor) == null)) {
                    mVLocationDescriptor2.mo26333s();
                }
                MVUserFavoriteLocation mVUserFavoriteLocation2 = mVFavoriteLocations2.workLocaiton;
                if (mVUserFavoriteLocation2 != null && (mVLocationDescriptor = mVUserFavoriteLocation2.descriptor) != null) {
                    mVLocationDescriptor.mo26333s();
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserFavoritesResponse$b */
    public static class C11946b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11945a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserFavoritesResponse$c */
    public static class C11947c extends C25240d<MVUpgrade3To4UserFavoritesResponse> {
        public C11947c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpgrade3To4UserFavoritesResponse mVUpgrade3To4UserFavoritesResponse = (MVUpgrade3To4UserFavoritesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUpgrade3To4UserFavoritesResponse.mo35448g()) {
                bitSet.set(0);
            }
            if (mVUpgrade3To4UserFavoritesResponse.mo35447f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVUpgrade3To4UserFavoritesResponse.mo35448g()) {
                jVar.mo61678B(mVUpgrade3To4UserFavoritesResponse.lineStopPairList.size());
                for (MVFavoriteLineStopPair X0 : mVUpgrade3To4UserFavoritesResponse.lineStopPairList) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVUpgrade3To4UserFavoritesResponse.mo35447f()) {
                mVUpgrade3To4UserFavoritesResponse.favoriteLocations.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpgrade3To4UserFavoritesResponse mVUpgrade3To4UserFavoritesResponse = (MVUpgrade3To4UserFavoritesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVUpgrade3To4UserFavoritesResponse.lineStopPairList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVFavoriteLineStopPair mVFavoriteLineStopPair = new MVFavoriteLineStopPair();
                    mVFavoriteLineStopPair.mo25201C1(jVar);
                    mVUpgrade3To4UserFavoritesResponse.lineStopPairList.add(mVFavoriteLineStopPair);
                }
            }
            if (T.get(1)) {
                MVFavoriteLocations mVFavoriteLocations = new MVFavoriteLocations();
                mVUpgrade3To4UserFavoritesResponse.favoriteLocations = mVFavoriteLocations;
                mVFavoriteLocations.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpgrade3To4UserFavoritesResponse$d */
    public static class C11948d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11947c(0);
        }
    }

    static {
        new C17394d0("MVUpgrade3To4UserFavoritesResponse");
        HashMap hashMap = new HashMap();
        f30594d = hashMap;
        hashMap.put(C25239c.class, new C11946b());
        hashMap.put(C25240d.class, new C11948d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_STOP_PAIR_LIST, new FieldMetaData("lineStopPairList", (byte) 3, new ListMetaData(new StructMetaData(MVFavoriteLineStopPair.class))));
        enumMap.put(_Fields.FAVORITE_LOCATIONS, new FieldMetaData("favoriteLocations", (byte) 3, new StructMetaData(MVFavoriteLocations.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30595e = unmodifiableMap;
        FieldMetaData.m61947a(MVUpgrade3To4UserFavoritesResponse.class, unmodifiableMap);
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
        ((C25238b) f30594d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30594d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUpgrade3To4UserFavoritesResponse mVUpgrade3To4UserFavoritesResponse = (MVUpgrade3To4UserFavoritesResponse) obj;
        if (!getClass().equals(mVUpgrade3To4UserFavoritesResponse.getClass())) {
            return getClass().getName().compareTo(mVUpgrade3To4UserFavoritesResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35448g()).compareTo(Boolean.valueOf(mVUpgrade3To4UserFavoritesResponse.mo35448g()));
        if (compareTo2 != 0 || ((mo35448g() && (compareTo2 = C25082a.m62844h(this.lineStopPairList, mVUpgrade3To4UserFavoritesResponse.lineStopPairList)) != 0) || (compareTo2 = Boolean.valueOf(mo35447f()).compareTo(Boolean.valueOf(mVUpgrade3To4UserFavoritesResponse.mo35447f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35447f() || (compareTo = this.favoriteLocations.compareTo(mVUpgrade3To4UserFavoritesResponse.favoriteLocations)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUpgrade3To4UserFavoritesResponse)) {
            return false;
        }
        MVUpgrade3To4UserFavoritesResponse mVUpgrade3To4UserFavoritesResponse = (MVUpgrade3To4UserFavoritesResponse) obj;
        boolean g = mo35448g();
        boolean g2 = mVUpgrade3To4UserFavoritesResponse.mo35448g();
        if ((g || g2) && (!g || !g2 || !this.lineStopPairList.equals(mVUpgrade3To4UserFavoritesResponse.lineStopPairList))) {
            return false;
        }
        boolean f = mo35447f();
        boolean f2 = mVUpgrade3To4UserFavoritesResponse.mo35447f();
        if ((f || f2) && (!f || !f2 || !this.favoriteLocations.mo35164a(mVUpgrade3To4UserFavoritesResponse.favoriteLocations))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35447f() {
        return this.favoriteLocations != null;
    }

    /* renamed from: g */
    public final boolean mo35448g() {
        return this.lineStopPairList != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUpgrade3To4UserFavoritesResponse(", "lineStopPairList:");
        List<MVFavoriteLineStopPair> list = this.lineStopPairList;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("favoriteLocations:");
        MVFavoriteLocations mVFavoriteLocations = this.favoriteLocations;
        if (mVFavoriteLocations == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVFavoriteLocations);
        }
        n.append(")");
        return n.toString();
    }
}
