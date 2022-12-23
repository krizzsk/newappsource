package com.tranzmate.moovit.protocol.users;

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

public class MVSetUserExperimentInfo implements TBase<MVSetUserExperimentInfo, _Fields>, Serializable, Cloneable, Comparable<MVSetUserExperimentInfo> {

    /* renamed from: b */
    public static final C25113c f30536b = new C25113c("globalGroup", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30537c = new C25113c("localGroups", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f30538d = new C25113c("timestamp", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f30539e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30540f;
    private byte __isset_bitfield = 0;
    public String globalGroup;
    public List<MVExperimentGroup> localGroups;
    public long timestamp;

    public enum _Fields implements C25085c {
        GLOBAL_GROUP(1, "globalGroup"),
        LOCAL_GROUPS(2, "localGroups"),
        TIMESTAMP(3, "timestamp");
        
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
                return GLOBAL_GROUP;
            }
            if (i == 2) {
                return LOCAL_GROUPS;
            }
            if (i != 3) {
                return null;
            }
            return TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetUserExperimentInfo$a */
    public static class C11897a extends C25239c<MVSetUserExperimentInfo> {
        public C11897a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetUserExperimentInfo mVSetUserExperimentInfo = (MVSetUserExperimentInfo) tBase;
            mVSetUserExperimentInfo.getClass();
            C25113c cVar = MVSetUserExperimentInfo.f30536b;
            gVar.mo61687K();
            if (mVSetUserExperimentInfo.globalGroup != null) {
                gVar.mo61711x(MVSetUserExperimentInfo.f30536b);
                gVar.mo61686J(mVSetUserExperimentInfo.globalGroup);
                gVar.mo61712y();
            }
            if (mVSetUserExperimentInfo.localGroups != null) {
                gVar.mo61711x(MVSetUserExperimentInfo.f30537c);
                gVar.mo61680D(new C25119e((byte) 12, mVSetUserExperimentInfo.localGroups.size()));
                for (MVExperimentGroup X0 : mVSetUserExperimentInfo.localGroups) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSetUserExperimentInfo.f30538d);
            C25541a.m63891v(gVar, mVSetUserExperimentInfo.timestamp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetUserExperimentInfo mVSetUserExperimentInfo = (MVSetUserExperimentInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSetUserExperimentInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVSetUserExperimentInfo.timestamp = gVar.mo61697j();
                            mVSetUserExperimentInfo.mo35347i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVSetUserExperimentInfo.localGroups = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVExperimentGroup mVExperimentGroup = new MVExperimentGroup();
                            mVExperimentGroup.mo25201C1(gVar);
                            mVSetUserExperimentInfo.localGroups.add(mVExperimentGroup);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVSetUserExperimentInfo.globalGroup = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetUserExperimentInfo$b */
    public static class C11898b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11897a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetUserExperimentInfo$c */
    public static class C11899c extends C25240d<MVSetUserExperimentInfo> {
        public C11899c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetUserExperimentInfo mVSetUserExperimentInfo = (MVSetUserExperimentInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetUserExperimentInfo.mo35343f()) {
                bitSet.set(0);
            }
            if (mVSetUserExperimentInfo.mo35344g()) {
                bitSet.set(1);
            }
            if (mVSetUserExperimentInfo.mo35345h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSetUserExperimentInfo.mo35343f()) {
                jVar.mo61686J(mVSetUserExperimentInfo.globalGroup);
            }
            if (mVSetUserExperimentInfo.mo35344g()) {
                jVar.mo61678B(mVSetUserExperimentInfo.localGroups.size());
                for (MVExperimentGroup X0 : mVSetUserExperimentInfo.localGroups) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSetUserExperimentInfo.mo35345h()) {
                jVar.mo61679C(mVSetUserExperimentInfo.timestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetUserExperimentInfo mVSetUserExperimentInfo = (MVSetUserExperimentInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVSetUserExperimentInfo.globalGroup = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVSetUserExperimentInfo.localGroups = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVExperimentGroup mVExperimentGroup = new MVExperimentGroup();
                    mVExperimentGroup.mo25201C1(jVar);
                    mVSetUserExperimentInfo.localGroups.add(mVExperimentGroup);
                }
            }
            if (T.get(2)) {
                mVSetUserExperimentInfo.timestamp = jVar.mo61697j();
                mVSetUserExperimentInfo.mo35347i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetUserExperimentInfo$d */
    public static class C11900d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11899c(0);
        }
    }

    static {
        new C17394d0("MVSetUserExperimentInfo");
        HashMap hashMap = new HashMap();
        f30539e = hashMap;
        hashMap.put(C25239c.class, new C11898b());
        hashMap.put(C25240d.class, new C11900d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GLOBAL_GROUP, new FieldMetaData("globalGroup", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCAL_GROUPS, new FieldMetaData("localGroups", (byte) 3, new ListMetaData(new StructMetaData(MVExperimentGroup.class))));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30540f = unmodifiableMap;
        FieldMetaData.m61947a(MVSetUserExperimentInfo.class, unmodifiableMap);
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
        ((C25238b) f30539e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30539e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVSetUserExperimentInfo mVSetUserExperimentInfo = (MVSetUserExperimentInfo) obj;
        if (!getClass().equals(mVSetUserExperimentInfo.getClass())) {
            return getClass().getName().compareTo(mVSetUserExperimentInfo.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35343f()).compareTo(Boolean.valueOf(mVSetUserExperimentInfo.mo35343f()));
        if (compareTo != 0 || ((mo35343f() && (compareTo = this.globalGroup.compareTo(mVSetUserExperimentInfo.globalGroup)) != 0) || (compareTo = Boolean.valueOf(mo35344g()).compareTo(Boolean.valueOf(mVSetUserExperimentInfo.mo35344g()))) != 0 || ((mo35344g() && (compareTo = C25082a.m62844h(this.localGroups, mVSetUserExperimentInfo.localGroups)) != 0) || (compareTo = Boolean.valueOf(mo35345h()).compareTo(Boolean.valueOf(mVSetUserExperimentInfo.mo35345h()))) != 0))) {
            return compareTo;
        }
        if (!mo35345h() || (d = C25082a.m62840d(this.timestamp, mVSetUserExperimentInfo.timestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetUserExperimentInfo)) {
            return false;
        }
        MVSetUserExperimentInfo mVSetUserExperimentInfo = (MVSetUserExperimentInfo) obj;
        boolean f = mo35343f();
        boolean f2 = mVSetUserExperimentInfo.mo35343f();
        if ((f || f2) && (!f || !f2 || !this.globalGroup.equals(mVSetUserExperimentInfo.globalGroup))) {
            return false;
        }
        boolean g = mo35344g();
        boolean g2 = mVSetUserExperimentInfo.mo35344g();
        if (((g || g2) && (!g || !g2 || !this.localGroups.equals(mVSetUserExperimentInfo.localGroups))) || this.timestamp != mVSetUserExperimentInfo.timestamp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35343f() {
        return this.globalGroup != null;
    }

    /* renamed from: g */
    public final boolean mo35344g() {
        return this.localGroups != null;
    }

    /* renamed from: h */
    public final boolean mo35345h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo35347i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSetUserExperimentInfo(", "globalGroup:");
        String str = this.globalGroup;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("localGroups:");
        List<MVExperimentGroup> list = this.localGroups;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("timestamp:");
        return C25541a.m63884o(n, this.timestamp, ")");
    }
}
