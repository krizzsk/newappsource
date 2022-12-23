package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVUmoAdsSdkConnectionInfo implements TBase<MVUmoAdsSdkConnectionInfo, _Fields>, Serializable, Cloneable, Comparable<MVUmoAdsSdkConnectionInfo> {

    /* renamed from: b */
    public static final C25113c f29285b = new C25113c("clientId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29286c = new C25113c("clientSecret", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29287d = new C25113c("sdkEnv", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29288e = new C25113c("slotId", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f29289f = new C25113c("publisherId", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f29290g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f29291h;
    public String clientId;
    public String clientSecret;
    public String publisherId;
    public String sdkEnv;
    public String slotId;

    public enum _Fields implements C25085c {
        CLIENT_ID(1, "clientId"),
        CLIENT_SECRET(2, "clientSecret"),
        SDK_ENV(3, "sdkEnv"),
        SLOT_ID(4, "slotId"),
        PUBLISHER_ID(5, "publisherId");
        
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
                return CLIENT_ID;
            }
            if (i == 2) {
                return CLIENT_SECRET;
            }
            if (i == 3) {
                return SDK_ENV;
            }
            if (i == 4) {
                return SLOT_ID;
            }
            if (i != 5) {
                return null;
            }
            return PUBLISHER_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUmoAdsSdkConnectionInfo$a */
    public static class C11135a extends C25239c<MVUmoAdsSdkConnectionInfo> {
        public C11135a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUmoAdsSdkConnectionInfo mVUmoAdsSdkConnectionInfo = (MVUmoAdsSdkConnectionInfo) tBase;
            mVUmoAdsSdkConnectionInfo.getClass();
            C25113c cVar = MVUmoAdsSdkConnectionInfo.f29285b;
            gVar.mo61687K();
            if (mVUmoAdsSdkConnectionInfo.clientId != null) {
                gVar.mo61711x(MVUmoAdsSdkConnectionInfo.f29285b);
                gVar.mo61686J(mVUmoAdsSdkConnectionInfo.clientId);
                gVar.mo61712y();
            }
            if (mVUmoAdsSdkConnectionInfo.clientSecret != null) {
                gVar.mo61711x(MVUmoAdsSdkConnectionInfo.f29286c);
                gVar.mo61686J(mVUmoAdsSdkConnectionInfo.clientSecret);
                gVar.mo61712y();
            }
            if (mVUmoAdsSdkConnectionInfo.sdkEnv != null) {
                gVar.mo61711x(MVUmoAdsSdkConnectionInfo.f29287d);
                gVar.mo61686J(mVUmoAdsSdkConnectionInfo.sdkEnv);
                gVar.mo61712y();
            }
            if (mVUmoAdsSdkConnectionInfo.slotId != null) {
                gVar.mo61711x(MVUmoAdsSdkConnectionInfo.f29288e);
                gVar.mo61686J(mVUmoAdsSdkConnectionInfo.slotId);
                gVar.mo61712y();
            }
            if (mVUmoAdsSdkConnectionInfo.publisherId != null) {
                gVar.mo61711x(MVUmoAdsSdkConnectionInfo.f29289f);
                gVar.mo61686J(mVUmoAdsSdkConnectionInfo.publisherId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUmoAdsSdkConnectionInfo mVUmoAdsSdkConnectionInfo = (MVUmoAdsSdkConnectionInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUmoAdsSdkConnectionInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVUmoAdsSdkConnectionInfo.publisherId = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVUmoAdsSdkConnectionInfo.slotId = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVUmoAdsSdkConnectionInfo.sdkEnv = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVUmoAdsSdkConnectionInfo.clientSecret = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVUmoAdsSdkConnectionInfo.clientId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUmoAdsSdkConnectionInfo$b */
    public static class C11136b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11135a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUmoAdsSdkConnectionInfo$c */
    public static class C11137c extends C25240d<MVUmoAdsSdkConnectionInfo> {
        public C11137c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUmoAdsSdkConnectionInfo mVUmoAdsSdkConnectionInfo = (MVUmoAdsSdkConnectionInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUmoAdsSdkConnectionInfo.mo33236f()) {
                bitSet.set(0);
            }
            if (mVUmoAdsSdkConnectionInfo.mo33237g()) {
                bitSet.set(1);
            }
            if (mVUmoAdsSdkConnectionInfo.mo33240i()) {
                bitSet.set(2);
            }
            if (mVUmoAdsSdkConnectionInfo.mo33241j()) {
                bitSet.set(3);
            }
            if (mVUmoAdsSdkConnectionInfo.mo33238h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVUmoAdsSdkConnectionInfo.mo33236f()) {
                jVar.mo61686J(mVUmoAdsSdkConnectionInfo.clientId);
            }
            if (mVUmoAdsSdkConnectionInfo.mo33237g()) {
                jVar.mo61686J(mVUmoAdsSdkConnectionInfo.clientSecret);
            }
            if (mVUmoAdsSdkConnectionInfo.mo33240i()) {
                jVar.mo61686J(mVUmoAdsSdkConnectionInfo.sdkEnv);
            }
            if (mVUmoAdsSdkConnectionInfo.mo33241j()) {
                jVar.mo61686J(mVUmoAdsSdkConnectionInfo.slotId);
            }
            if (mVUmoAdsSdkConnectionInfo.mo33238h()) {
                jVar.mo61686J(mVUmoAdsSdkConnectionInfo.publisherId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUmoAdsSdkConnectionInfo mVUmoAdsSdkConnectionInfo = (MVUmoAdsSdkConnectionInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVUmoAdsSdkConnectionInfo.clientId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVUmoAdsSdkConnectionInfo.clientSecret = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVUmoAdsSdkConnectionInfo.sdkEnv = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVUmoAdsSdkConnectionInfo.slotId = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVUmoAdsSdkConnectionInfo.publisherId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUmoAdsSdkConnectionInfo$d */
    public static class C11138d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11137c(0);
        }
    }

    static {
        new C17394d0("MVUmoAdsSdkConnectionInfo");
        HashMap hashMap = new HashMap();
        f29290g = hashMap;
        hashMap.put(C25239c.class, new C11136b());
        hashMap.put(C25240d.class, new C11138d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CLIENT_ID, new FieldMetaData("clientId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CLIENT_SECRET, new FieldMetaData("clientSecret", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SDK_ENV, new FieldMetaData("sdkEnv", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SLOT_ID, new FieldMetaData("slotId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PUBLISHER_ID, new FieldMetaData("publisherId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29291h = unmodifiableMap;
        FieldMetaData.m61947a(MVUmoAdsSdkConnectionInfo.class, unmodifiableMap);
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
        ((C25238b) f29290g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29290g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUmoAdsSdkConnectionInfo mVUmoAdsSdkConnectionInfo = (MVUmoAdsSdkConnectionInfo) obj;
        if (!getClass().equals(mVUmoAdsSdkConnectionInfo.getClass())) {
            return getClass().getName().compareTo(mVUmoAdsSdkConnectionInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33236f()).compareTo(Boolean.valueOf(mVUmoAdsSdkConnectionInfo.mo33236f()));
        if (compareTo2 != 0 || ((mo33236f() && (compareTo2 = this.clientId.compareTo(mVUmoAdsSdkConnectionInfo.clientId)) != 0) || (compareTo2 = Boolean.valueOf(mo33237g()).compareTo(Boolean.valueOf(mVUmoAdsSdkConnectionInfo.mo33237g()))) != 0 || ((mo33237g() && (compareTo2 = this.clientSecret.compareTo(mVUmoAdsSdkConnectionInfo.clientSecret)) != 0) || (compareTo2 = Boolean.valueOf(mo33240i()).compareTo(Boolean.valueOf(mVUmoAdsSdkConnectionInfo.mo33240i()))) != 0 || ((mo33240i() && (compareTo2 = this.sdkEnv.compareTo(mVUmoAdsSdkConnectionInfo.sdkEnv)) != 0) || (compareTo2 = Boolean.valueOf(mo33241j()).compareTo(Boolean.valueOf(mVUmoAdsSdkConnectionInfo.mo33241j()))) != 0 || ((mo33241j() && (compareTo2 = this.slotId.compareTo(mVUmoAdsSdkConnectionInfo.slotId)) != 0) || (compareTo2 = Boolean.valueOf(mo33238h()).compareTo(Boolean.valueOf(mVUmoAdsSdkConnectionInfo.mo33238h()))) != 0))))) {
            return compareTo2;
        }
        if (!mo33238h() || (compareTo = this.publisherId.compareTo(mVUmoAdsSdkConnectionInfo.publisherId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUmoAdsSdkConnectionInfo)) {
            return false;
        }
        MVUmoAdsSdkConnectionInfo mVUmoAdsSdkConnectionInfo = (MVUmoAdsSdkConnectionInfo) obj;
        boolean f = mo33236f();
        boolean f2 = mVUmoAdsSdkConnectionInfo.mo33236f();
        if ((f || f2) && (!f || !f2 || !this.clientId.equals(mVUmoAdsSdkConnectionInfo.clientId))) {
            return false;
        }
        boolean g = mo33237g();
        boolean g2 = mVUmoAdsSdkConnectionInfo.mo33237g();
        if ((g || g2) && (!g || !g2 || !this.clientSecret.equals(mVUmoAdsSdkConnectionInfo.clientSecret))) {
            return false;
        }
        boolean i = mo33240i();
        boolean i2 = mVUmoAdsSdkConnectionInfo.mo33240i();
        if ((i || i2) && (!i || !i2 || !this.sdkEnv.equals(mVUmoAdsSdkConnectionInfo.sdkEnv))) {
            return false;
        }
        boolean j = mo33241j();
        boolean j2 = mVUmoAdsSdkConnectionInfo.mo33241j();
        if ((j || j2) && (!j || !j2 || !this.slotId.equals(mVUmoAdsSdkConnectionInfo.slotId))) {
            return false;
        }
        boolean h = mo33238h();
        boolean h2 = mVUmoAdsSdkConnectionInfo.mo33238h();
        if ((h || h2) && (!h || !h2 || !this.publisherId.equals(mVUmoAdsSdkConnectionInfo.publisherId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33236f() {
        return this.clientId != null;
    }

    /* renamed from: g */
    public final boolean mo33237g() {
        return this.clientSecret != null;
    }

    /* renamed from: h */
    public final boolean mo33238h() {
        return this.publisherId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33240i() {
        return this.sdkEnv != null;
    }

    /* renamed from: j */
    public final boolean mo33241j() {
        return this.slotId != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUmoAdsSdkConnectionInfo(", "clientId:");
        String str = this.clientId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("clientSecret:");
        String str2 = this.clientSecret;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("sdkEnv:");
        String str3 = this.sdkEnv;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("slotId:");
        String str4 = this.slotId;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("publisherId:");
        String str5 = this.publisherId;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(")");
        return n.toString();
    }
}
