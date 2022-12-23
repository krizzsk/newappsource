package com.tranzmate.moovit.protocol.users;

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
import org.apache.thrift.meta_data.FieldValueMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVSetAdvertisingInfoRequest implements TBase<MVSetAdvertisingInfoRequest, _Fields>, Serializable, Cloneable, Comparable<MVSetAdvertisingInfoRequest> {

    /* renamed from: b */
    public static final C25113c f30515b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30516c = new C25113c("appsFlyerId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30517d = new C25113c("limitAdTrackingEnabled", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f30518e = new C25113c("appSetId", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f30519f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f30520g;
    private byte __isset_bitfield;
    public String appSetId;
    public String appsFlyerId;

    /* renamed from: id */
    public String f30521id;
    public boolean limitAdTrackingEnabled;
    private _Fields[] optionals;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        APPS_FLYER_ID(2, "appsFlyerId"),
        LIMIT_AD_TRACKING_ENABLED(3, "limitAdTrackingEnabled"),
        APP_SET_ID(4, "appSetId");
        
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
                return ID;
            }
            if (i == 2) {
                return APPS_FLYER_ID;
            }
            if (i == 3) {
                return LIMIT_AD_TRACKING_ENABLED;
            }
            if (i != 4) {
                return null;
            }
            return APP_SET_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoRequest$a */
    public static class C11881a extends C25239c<MVSetAdvertisingInfoRequest> {
        public C11881a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = (MVSetAdvertisingInfoRequest) tBase;
            mVSetAdvertisingInfoRequest.getClass();
            C25113c cVar = MVSetAdvertisingInfoRequest.f30515b;
            gVar.mo61687K();
            if (mVSetAdvertisingInfoRequest.f30521id != null) {
                gVar.mo61711x(MVSetAdvertisingInfoRequest.f30515b);
                gVar.mo61686J(mVSetAdvertisingInfoRequest.f30521id);
                gVar.mo61712y();
            }
            if (mVSetAdvertisingInfoRequest.appsFlyerId != null) {
                gVar.mo61711x(MVSetAdvertisingInfoRequest.f30516c);
                gVar.mo61686J(mVSetAdvertisingInfoRequest.appsFlyerId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSetAdvertisingInfoRequest.f30517d);
            gVar.mo61708u(mVSetAdvertisingInfoRequest.limitAdTrackingEnabled);
            gVar.mo61712y();
            if (mVSetAdvertisingInfoRequest.appSetId != null && mVSetAdvertisingInfoRequest.mo35303f()) {
                gVar.mo61711x(MVSetAdvertisingInfoRequest.f30518e);
                gVar.mo61686J(mVSetAdvertisingInfoRequest.appSetId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = (MVSetAdvertisingInfoRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSetAdvertisingInfoRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVSetAdvertisingInfoRequest.appSetId = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVSetAdvertisingInfoRequest.limitAdTrackingEnabled = gVar.mo61690c();
                            mVSetAdvertisingInfoRequest.mo35308j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVSetAdvertisingInfoRequest.appsFlyerId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVSetAdvertisingInfoRequest.f30521id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoRequest$b */
    public static class C11882b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11881a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoRequest$c */
    public static class C11883c extends C25240d<MVSetAdvertisingInfoRequest> {
        public C11883c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = (MVSetAdvertisingInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetAdvertisingInfoRequest.mo35305h()) {
                bitSet.set(0);
            }
            if (mVSetAdvertisingInfoRequest.mo35304g()) {
                bitSet.set(1);
            }
            if (mVSetAdvertisingInfoRequest.mo35307i()) {
                bitSet.set(2);
            }
            if (mVSetAdvertisingInfoRequest.mo35303f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVSetAdvertisingInfoRequest.mo35305h()) {
                jVar.mo61686J(mVSetAdvertisingInfoRequest.f30521id);
            }
            if (mVSetAdvertisingInfoRequest.mo35304g()) {
                jVar.mo61686J(mVSetAdvertisingInfoRequest.appsFlyerId);
            }
            if (mVSetAdvertisingInfoRequest.mo35307i()) {
                jVar.mo61708u(mVSetAdvertisingInfoRequest.limitAdTrackingEnabled);
            }
            if (mVSetAdvertisingInfoRequest.mo35303f()) {
                jVar.mo61686J(mVSetAdvertisingInfoRequest.appSetId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = (MVSetAdvertisingInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVSetAdvertisingInfoRequest.f30521id = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVSetAdvertisingInfoRequest.appsFlyerId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVSetAdvertisingInfoRequest.limitAdTrackingEnabled = jVar.mo61690c();
                mVSetAdvertisingInfoRequest.mo35308j();
            }
            if (T.get(3)) {
                mVSetAdvertisingInfoRequest.appSetId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoRequest$d */
    public static class C11884d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11883c(0);
        }
    }

    static {
        new C17394d0("MVSetAdvertisingInfoRequest");
        HashMap hashMap = new HashMap();
        f30519f = hashMap;
        hashMap.put(C25239c.class, new C11882b());
        hashMap.put(C25240d.class, new C11884d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.APPS_FLYER_ID, new FieldMetaData("appsFlyerId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LIMIT_AD_TRACKING_ENABLED, new FieldMetaData("limitAdTrackingEnabled", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.APP_SET_ID, new FieldMetaData("appSetId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30520g = unmodifiableMap;
        FieldMetaData.m61947a(MVSetAdvertisingInfoRequest.class, unmodifiableMap);
    }

    public MVSetAdvertisingInfoRequest() {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.APP_SET_ID};
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
        ((C25238b) f30519f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30519f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35300a(MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest) {
        if (mVSetAdvertisingInfoRequest == null) {
            return false;
        }
        boolean h = mo35305h();
        boolean h2 = mVSetAdvertisingInfoRequest.mo35305h();
        if ((h || h2) && (!h || !h2 || !this.f30521id.equals(mVSetAdvertisingInfoRequest.f30521id))) {
            return false;
        }
        boolean g = mo35304g();
        boolean g2 = mVSetAdvertisingInfoRequest.mo35304g();
        if (((g || g2) && (!g || !g2 || !this.appsFlyerId.equals(mVSetAdvertisingInfoRequest.appsFlyerId))) || this.limitAdTrackingEnabled != mVSetAdvertisingInfoRequest.limitAdTrackingEnabled) {
            return false;
        }
        boolean f = mo35303f();
        boolean f2 = mVSetAdvertisingInfoRequest.mo35303f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.appSetId.equals(mVSetAdvertisingInfoRequest.appSetId)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = (MVSetAdvertisingInfoRequest) obj;
        if (!getClass().equals(mVSetAdvertisingInfoRequest.getClass())) {
            return getClass().getName().compareTo(mVSetAdvertisingInfoRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35305h()).compareTo(Boolean.valueOf(mVSetAdvertisingInfoRequest.mo35305h()));
        if (compareTo2 != 0 || ((mo35305h() && (compareTo2 = this.f30521id.compareTo(mVSetAdvertisingInfoRequest.f30521id)) != 0) || (compareTo2 = Boolean.valueOf(mo35304g()).compareTo(Boolean.valueOf(mVSetAdvertisingInfoRequest.mo35304g()))) != 0 || ((mo35304g() && (compareTo2 = this.appsFlyerId.compareTo(mVSetAdvertisingInfoRequest.appsFlyerId)) != 0) || (compareTo2 = Boolean.valueOf(mo35307i()).compareTo(Boolean.valueOf(mVSetAdvertisingInfoRequest.mo35307i()))) != 0 || ((mo35307i() && (compareTo2 = C25082a.m62848l(this.limitAdTrackingEnabled, mVSetAdvertisingInfoRequest.limitAdTrackingEnabled)) != 0) || (compareTo2 = Boolean.valueOf(mo35303f()).compareTo(Boolean.valueOf(mVSetAdvertisingInfoRequest.mo35303f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo35303f() || (compareTo = this.appSetId.compareTo(mVSetAdvertisingInfoRequest.appSetId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVSetAdvertisingInfoRequest)) {
            return mo35300a((MVSetAdvertisingInfoRequest) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35303f() {
        return this.appSetId != null;
    }

    /* renamed from: g */
    public final boolean mo35304g() {
        return this.appsFlyerId != null;
    }

    /* renamed from: h */
    public final boolean mo35305h() {
        return this.f30521id != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35307i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo35308j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSetAdvertisingInfoRequest(", "id:");
        String str = this.f30521id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("appsFlyerId:");
        String str2 = this.appsFlyerId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("limitAdTrackingEnabled:");
        n.append(this.limitAdTrackingEnabled);
        if (mo35303f()) {
            n.append(", ");
            n.append("appSetId:");
            String str3 = this.appSetId;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }

    public MVSetAdvertisingInfoRequest(String str, String str2, boolean z) {
        this();
        this.f30521id = str;
        this.appsFlyerId = str2;
        this.limitAdTrackingEnabled = z;
        mo35308j();
    }
}
