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

public class MVFavoriteLocations implements TBase<MVFavoriteLocations, _Fields>, Serializable, Cloneable, Comparable<MVFavoriteLocations> {

    /* renamed from: b */
    public static final C25113c f30434b = new C25113c("regularLocationList", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f30435c = new C25113c("homeLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30436d = new C25113c("workLocaiton", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f30437e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30438f;
    public MVUserFavoriteLocation homeLocation;
    private _Fields[] optionals = {_Fields.HOME_LOCATION, _Fields.WORK_LOCAITON};
    public List<MVUserFavoriteLocation> regularLocationList;
    public MVUserFavoriteLocation workLocaiton;

    public enum _Fields implements C25085c {
        REGULAR_LOCATION_LIST(1, "regularLocationList"),
        HOME_LOCATION(2, "homeLocation"),
        WORK_LOCAITON(3, "workLocaiton");
        
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
                return REGULAR_LOCATION_LIST;
            }
            if (i == 2) {
                return HOME_LOCATION;
            }
            if (i != 3) {
                return null;
            }
            return WORK_LOCAITON;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVFavoriteLocations$a */
    public static class C11824a extends C25239c<MVFavoriteLocations> {
        public C11824a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocationDescriptor mVLocationDescriptor;
            MVLocationDescriptor mVLocationDescriptor2;
            MVFavoriteLocations mVFavoriteLocations = (MVFavoriteLocations) tBase;
            MVUserFavoriteLocation mVUserFavoriteLocation = mVFavoriteLocations.homeLocation;
            if (!(mVUserFavoriteLocation == null || (mVLocationDescriptor2 = mVUserFavoriteLocation.descriptor) == null)) {
                mVLocationDescriptor2.mo26333s();
            }
            MVUserFavoriteLocation mVUserFavoriteLocation2 = mVFavoriteLocations.workLocaiton;
            if (!(mVUserFavoriteLocation2 == null || (mVLocationDescriptor = mVUserFavoriteLocation2.descriptor) == null)) {
                mVLocationDescriptor.mo26333s();
            }
            C25113c cVar = MVFavoriteLocations.f30434b;
            gVar.mo61687K();
            if (mVFavoriteLocations.regularLocationList != null) {
                gVar.mo61711x(MVFavoriteLocations.f30434b);
                gVar.mo61680D(new C25119e((byte) 12, mVFavoriteLocations.regularLocationList.size()));
                for (MVUserFavoriteLocation X0 : mVFavoriteLocations.regularLocationList) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVFavoriteLocations.homeLocation != null && mVFavoriteLocations.mo35167f()) {
                gVar.mo61711x(MVFavoriteLocations.f30435c);
                mVFavoriteLocations.homeLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVFavoriteLocations.workLocaiton != null && mVFavoriteLocations.mo35169h()) {
                gVar.mo61711x(MVFavoriteLocations.f30436d);
                mVFavoriteLocations.workLocaiton.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocationDescriptor mVLocationDescriptor;
            MVLocationDescriptor mVLocationDescriptor2;
            MVFavoriteLocations mVFavoriteLocations = (MVFavoriteLocations) tBase;
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
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVUserFavoriteLocation mVUserFavoriteLocation = new MVUserFavoriteLocation();
                            mVFavoriteLocations.workLocaiton = mVUserFavoriteLocation;
                            mVUserFavoriteLocation.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVUserFavoriteLocation mVUserFavoriteLocation2 = new MVUserFavoriteLocation();
                        mVFavoriteLocations.homeLocation = mVUserFavoriteLocation2;
                        mVUserFavoriteLocation2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVFavoriteLocations.regularLocationList = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVUserFavoriteLocation mVUserFavoriteLocation3 = new MVUserFavoriteLocation();
                        mVUserFavoriteLocation3.mo25201C1(gVar);
                        mVFavoriteLocations.regularLocationList.add(mVUserFavoriteLocation3);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVUserFavoriteLocation mVUserFavoriteLocation4 = mVFavoriteLocations.homeLocation;
            if (!(mVUserFavoriteLocation4 == null || (mVLocationDescriptor2 = mVUserFavoriteLocation4.descriptor) == null)) {
                mVLocationDescriptor2.mo26333s();
            }
            MVUserFavoriteLocation mVUserFavoriteLocation5 = mVFavoriteLocations.workLocaiton;
            if (mVUserFavoriteLocation5 != null && (mVLocationDescriptor = mVUserFavoriteLocation5.descriptor) != null) {
                mVLocationDescriptor.mo26333s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVFavoriteLocations$b */
    public static class C11825b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11824a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVFavoriteLocations$c */
    public static class C11826c extends C25240d<MVFavoriteLocations> {
        public C11826c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLocations mVFavoriteLocations = (MVFavoriteLocations) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVFavoriteLocations.mo35168g()) {
                bitSet.set(0);
            }
            if (mVFavoriteLocations.mo35167f()) {
                bitSet.set(1);
            }
            if (mVFavoriteLocations.mo35169h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVFavoriteLocations.mo35168g()) {
                jVar.mo61678B(mVFavoriteLocations.regularLocationList.size());
                for (MVUserFavoriteLocation X0 : mVFavoriteLocations.regularLocationList) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVFavoriteLocations.mo35167f()) {
                mVFavoriteLocations.homeLocation.mo25202X0(jVar);
            }
            if (mVFavoriteLocations.mo35169h()) {
                mVFavoriteLocations.workLocaiton.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLocations mVFavoriteLocations = (MVFavoriteLocations) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVFavoriteLocations.regularLocationList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVUserFavoriteLocation mVUserFavoriteLocation = new MVUserFavoriteLocation();
                    mVUserFavoriteLocation.mo25201C1(jVar);
                    mVFavoriteLocations.regularLocationList.add(mVUserFavoriteLocation);
                }
            }
            if (T.get(1)) {
                MVUserFavoriteLocation mVUserFavoriteLocation2 = new MVUserFavoriteLocation();
                mVFavoriteLocations.homeLocation = mVUserFavoriteLocation2;
                mVUserFavoriteLocation2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVUserFavoriteLocation mVUserFavoriteLocation3 = new MVUserFavoriteLocation();
                mVFavoriteLocations.workLocaiton = mVUserFavoriteLocation3;
                mVUserFavoriteLocation3.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVFavoriteLocations$d */
    public static class C11827d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11826c(0);
        }
    }

    static {
        new C17394d0("MVFavoriteLocations");
        HashMap hashMap = new HashMap();
        f30437e = hashMap;
        hashMap.put(C25239c.class, new C11825b());
        hashMap.put(C25240d.class, new C11827d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REGULAR_LOCATION_LIST, new FieldMetaData("regularLocationList", (byte) 3, new ListMetaData(new StructMetaData(MVUserFavoriteLocation.class))));
        enumMap.put(_Fields.HOME_LOCATION, new FieldMetaData("homeLocation", (byte) 2, new StructMetaData(MVUserFavoriteLocation.class)));
        enumMap.put(_Fields.WORK_LOCAITON, new FieldMetaData("workLocaiton", (byte) 2, new StructMetaData(MVUserFavoriteLocation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30438f = unmodifiableMap;
        FieldMetaData.m61947a(MVFavoriteLocations.class, unmodifiableMap);
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
        ((C25238b) f30437e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30437e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35164a(MVFavoriteLocations mVFavoriteLocations) {
        if (mVFavoriteLocations == null) {
            return false;
        }
        boolean g = mo35168g();
        boolean g2 = mVFavoriteLocations.mo35168g();
        if ((g || g2) && (!g || !g2 || !this.regularLocationList.equals(mVFavoriteLocations.regularLocationList))) {
            return false;
        }
        boolean f = mo35167f();
        boolean f2 = mVFavoriteLocations.mo35167f();
        if ((f || f2) && (!f || !f2 || !this.homeLocation.mo35492a(mVFavoriteLocations.homeLocation))) {
            return false;
        }
        boolean h = mo35169h();
        boolean h2 = mVFavoriteLocations.mo35169h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.workLocaiton.mo35492a(mVFavoriteLocations.workLocaiton)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVFavoriteLocations mVFavoriteLocations = (MVFavoriteLocations) obj;
        if (!getClass().equals(mVFavoriteLocations.getClass())) {
            return getClass().getName().compareTo(mVFavoriteLocations.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35168g()).compareTo(Boolean.valueOf(mVFavoriteLocations.mo35168g()));
        if (compareTo2 != 0 || ((mo35168g() && (compareTo2 = C25082a.m62844h(this.regularLocationList, mVFavoriteLocations.regularLocationList)) != 0) || (compareTo2 = Boolean.valueOf(mo35167f()).compareTo(Boolean.valueOf(mVFavoriteLocations.mo35167f()))) != 0 || ((mo35167f() && (compareTo2 = this.homeLocation.compareTo(mVFavoriteLocations.homeLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo35169h()).compareTo(Boolean.valueOf(mVFavoriteLocations.mo35169h()))) != 0))) {
            return compareTo2;
        }
        if (!mo35169h() || (compareTo = this.workLocaiton.compareTo(mVFavoriteLocations.workLocaiton)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVFavoriteLocations)) {
            return mo35164a((MVFavoriteLocations) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35167f() {
        return this.homeLocation != null;
    }

    /* renamed from: g */
    public final boolean mo35168g() {
        return this.regularLocationList != null;
    }

    /* renamed from: h */
    public final boolean mo35169h() {
        return this.workLocaiton != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVFavoriteLocations(", "regularLocationList:");
        List<MVUserFavoriteLocation> list = this.regularLocationList;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo35167f()) {
            n.append(", ");
            n.append("homeLocation:");
            MVUserFavoriteLocation mVUserFavoriteLocation = this.homeLocation;
            if (mVUserFavoriteLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUserFavoriteLocation);
            }
        }
        if (mo35169h()) {
            n.append(", ");
            n.append("workLocaiton:");
            MVUserFavoriteLocation mVUserFavoriteLocation2 = this.workLocaiton;
            if (mVUserFavoriteLocation2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUserFavoriteLocation2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
