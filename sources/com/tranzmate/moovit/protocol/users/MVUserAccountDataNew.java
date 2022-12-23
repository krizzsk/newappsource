package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.favorites.MVSetFavoriteLineGroupsAndStops;
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
import p001a0.C0016g;
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

public class MVUserAccountDataNew implements TBase<MVUserAccountDataNew, _Fields>, Serializable, Cloneable, Comparable<MVUserAccountDataNew> {

    /* renamed from: b */
    public static final C25113c f30607b = new C25113c("accountId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30608c = new C25113c("favoriteLineGroupsAndStops", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f30609d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30610e;
    private byte __isset_bitfield = 0;
    public int accountId;
    public List<MVSetFavoriteLineGroupsAndStops> favoriteLineGroupsAndStops;

    public enum _Fields implements C25085c {
        ACCOUNT_ID(1, "accountId"),
        FAVORITE_LINE_GROUPS_AND_STOPS(2, "favoriteLineGroupsAndStops");
        
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
                return ACCOUNT_ID;
            }
            if (i != 2) {
                return null;
            }
            return FAVORITE_LINE_GROUPS_AND_STOPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserAccountDataNew$a */
    public static class C11957a extends C25239c<MVUserAccountDataNew> {
        public C11957a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserAccountDataNew mVUserAccountDataNew = (MVUserAccountDataNew) tBase;
            mVUserAccountDataNew.getClass();
            C25113c cVar = MVUserAccountDataNew.f30607b;
            gVar.mo61687K();
            gVar.mo61711x(MVUserAccountDataNew.f30607b);
            gVar.mo61678B(mVUserAccountDataNew.accountId);
            gVar.mo61712y();
            if (mVUserAccountDataNew.favoriteLineGroupsAndStops != null) {
                gVar.mo61711x(MVUserAccountDataNew.f30608c);
                gVar.mo61680D(new C25119e((byte) 12, mVUserAccountDataNew.favoriteLineGroupsAndStops.size()));
                for (MVSetFavoriteLineGroupsAndStops X0 : mVUserAccountDataNew.favoriteLineGroupsAndStops) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserAccountDataNew mVUserAccountDataNew = (MVUserAccountDataNew) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserAccountDataNew.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVUserAccountDataNew.favoriteLineGroupsAndStops = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = new MVSetFavoriteLineGroupsAndStops();
                            mVSetFavoriteLineGroupsAndStops.mo25201C1(gVar);
                            mVUserAccountDataNew.favoriteLineGroupsAndStops.add(mVSetFavoriteLineGroupsAndStops);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVUserAccountDataNew.accountId = gVar.mo61696i();
                    mVUserAccountDataNew.mo35474h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserAccountDataNew$b */
    public static class C11958b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11957a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserAccountDataNew$c */
    public static class C11959c extends C25240d<MVUserAccountDataNew> {
        public C11959c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserAccountDataNew mVUserAccountDataNew = (MVUserAccountDataNew) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserAccountDataNew.mo35472f()) {
                bitSet.set(0);
            }
            if (mVUserAccountDataNew.mo35473g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVUserAccountDataNew.mo35472f()) {
                jVar.mo61678B(mVUserAccountDataNew.accountId);
            }
            if (mVUserAccountDataNew.mo35473g()) {
                jVar.mo61678B(mVUserAccountDataNew.favoriteLineGroupsAndStops.size());
                for (MVSetFavoriteLineGroupsAndStops X0 : mVUserAccountDataNew.favoriteLineGroupsAndStops) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserAccountDataNew mVUserAccountDataNew = (MVUserAccountDataNew) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVUserAccountDataNew.accountId = jVar.mo61696i();
                mVUserAccountDataNew.mo35474h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVUserAccountDataNew.favoriteLineGroupsAndStops = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSetFavoriteLineGroupsAndStops mVSetFavoriteLineGroupsAndStops = new MVSetFavoriteLineGroupsAndStops();
                    mVSetFavoriteLineGroupsAndStops.mo25201C1(jVar);
                    mVUserAccountDataNew.favoriteLineGroupsAndStops.add(mVSetFavoriteLineGroupsAndStops);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserAccountDataNew$d */
    public static class C11960d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11959c(0);
        }
    }

    static {
        new C17394d0("MVUserAccountDataNew");
        HashMap hashMap = new HashMap();
        f30609d = hashMap;
        hashMap.put(C25239c.class, new C11958b());
        hashMap.put(C25240d.class, new C11960d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACCOUNT_ID, new FieldMetaData("accountId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FAVORITE_LINE_GROUPS_AND_STOPS, new FieldMetaData("favoriteLineGroupsAndStops", (byte) 3, new ListMetaData(new StructMetaData(MVSetFavoriteLineGroupsAndStops.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30610e = unmodifiableMap;
        FieldMetaData.m61947a(MVUserAccountDataNew.class, unmodifiableMap);
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
        ((C25238b) f30609d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30609d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVUserAccountDataNew mVUserAccountDataNew = (MVUserAccountDataNew) obj;
        if (!getClass().equals(mVUserAccountDataNew.getClass())) {
            return getClass().getName().compareTo(mVUserAccountDataNew.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35472f()).compareTo(Boolean.valueOf(mVUserAccountDataNew.mo35472f()));
        if (compareTo != 0 || ((mo35472f() && (compareTo = C25082a.m62839c(this.accountId, mVUserAccountDataNew.accountId)) != 0) || (compareTo = Boolean.valueOf(mo35473g()).compareTo(Boolean.valueOf(mVUserAccountDataNew.mo35473g()))) != 0)) {
            return compareTo;
        }
        if (!mo35473g() || (h = C25082a.m62844h(this.favoriteLineGroupsAndStops, mVUserAccountDataNew.favoriteLineGroupsAndStops)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUserAccountDataNew)) {
            return false;
        }
        MVUserAccountDataNew mVUserAccountDataNew = (MVUserAccountDataNew) obj;
        if (this.accountId != mVUserAccountDataNew.accountId) {
            return false;
        }
        boolean g = mo35473g();
        boolean g2 = mVUserAccountDataNew.mo35473g();
        if ((g || g2) && (!g || !g2 || !this.favoriteLineGroupsAndStops.equals(mVUserAccountDataNew.favoriteLineGroupsAndStops))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35472f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo35473g() {
        return this.favoriteLineGroupsAndStops != null;
    }

    /* renamed from: h */
    public final void mo35474h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserAccountDataNew(", "accountId:");
        C0016g.m42z(n, this.accountId, ", ", "favoriteLineGroupsAndStops:");
        List<MVSetFavoriteLineGroupsAndStops> list = this.favoriteLineGroupsAndStops;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
