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

public class MVDownloadProviderKey implements TBase<MVDownloadProviderKey, _Fields>, Serializable, Cloneable, Comparable<MVDownloadProviderKey> {

    /* renamed from: b */
    public static final C25113c f30393b = new C25113c("sourceKey", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30394c = new C25113c("campaignKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30395d = new C25113c("placementKey", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f30396e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30397f;
    public String campaignKey;
    public String placementKey;
    public String sourceKey;

    public enum _Fields implements C25085c {
        SOURCE_KEY(1, "sourceKey"),
        CAMPAIGN_KEY(2, "campaignKey"),
        PLACEMENT_KEY(3, "placementKey");
        
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
                return SOURCE_KEY;
            }
            if (i == 2) {
                return CAMPAIGN_KEY;
            }
            if (i != 3) {
                return null;
            }
            return PLACEMENT_KEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVDownloadProviderKey$a */
    public static class C11796a extends C25239c<MVDownloadProviderKey> {
        public C11796a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDownloadProviderKey mVDownloadProviderKey = (MVDownloadProviderKey) tBase;
            mVDownloadProviderKey.getClass();
            C25113c cVar = MVDownloadProviderKey.f30393b;
            gVar.mo61687K();
            if (mVDownloadProviderKey.sourceKey != null) {
                gVar.mo61711x(MVDownloadProviderKey.f30393b);
                gVar.mo61686J(mVDownloadProviderKey.sourceKey);
                gVar.mo61712y();
            }
            if (mVDownloadProviderKey.campaignKey != null) {
                gVar.mo61711x(MVDownloadProviderKey.f30394c);
                gVar.mo61686J(mVDownloadProviderKey.campaignKey);
                gVar.mo61712y();
            }
            if (mVDownloadProviderKey.placementKey != null) {
                gVar.mo61711x(MVDownloadProviderKey.f30395d);
                gVar.mo61686J(mVDownloadProviderKey.placementKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDownloadProviderKey mVDownloadProviderKey = (MVDownloadProviderKey) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDownloadProviderKey.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVDownloadProviderKey.placementKey = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVDownloadProviderKey.campaignKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVDownloadProviderKey.sourceKey = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVDownloadProviderKey$b */
    public static class C11797b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11796a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVDownloadProviderKey$c */
    public static class C11798c extends C25240d<MVDownloadProviderKey> {
        public C11798c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDownloadProviderKey mVDownloadProviderKey = (MVDownloadProviderKey) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDownloadProviderKey.mo35103h()) {
                bitSet.set(0);
            }
            if (mVDownloadProviderKey.mo35101f()) {
                bitSet.set(1);
            }
            if (mVDownloadProviderKey.mo35102g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVDownloadProviderKey.mo35103h()) {
                jVar.mo61686J(mVDownloadProviderKey.sourceKey);
            }
            if (mVDownloadProviderKey.mo35101f()) {
                jVar.mo61686J(mVDownloadProviderKey.campaignKey);
            }
            if (mVDownloadProviderKey.mo35102g()) {
                jVar.mo61686J(mVDownloadProviderKey.placementKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDownloadProviderKey mVDownloadProviderKey = (MVDownloadProviderKey) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVDownloadProviderKey.sourceKey = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDownloadProviderKey.campaignKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVDownloadProviderKey.placementKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVDownloadProviderKey$d */
    public static class C11799d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11798c(0);
        }
    }

    static {
        new C17394d0("MVDownloadProviderKey");
        HashMap hashMap = new HashMap();
        f30396e = hashMap;
        hashMap.put(C25239c.class, new C11797b());
        hashMap.put(C25240d.class, new C11799d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SOURCE_KEY, new FieldMetaData("sourceKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CAMPAIGN_KEY, new FieldMetaData("campaignKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PLACEMENT_KEY, new FieldMetaData("placementKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30397f = unmodifiableMap;
        FieldMetaData.m61947a(MVDownloadProviderKey.class, unmodifiableMap);
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
        ((C25238b) f30396e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30396e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35098a(MVDownloadProviderKey mVDownloadProviderKey) {
        if (mVDownloadProviderKey == null) {
            return false;
        }
        boolean h = mo35103h();
        boolean h2 = mVDownloadProviderKey.mo35103h();
        if ((h || h2) && (!h || !h2 || !this.sourceKey.equals(mVDownloadProviderKey.sourceKey))) {
            return false;
        }
        boolean f = mo35101f();
        boolean f2 = mVDownloadProviderKey.mo35101f();
        if ((f || f2) && (!f || !f2 || !this.campaignKey.equals(mVDownloadProviderKey.campaignKey))) {
            return false;
        }
        boolean g = mo35102g();
        boolean g2 = mVDownloadProviderKey.mo35102g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.placementKey.equals(mVDownloadProviderKey.placementKey)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDownloadProviderKey mVDownloadProviderKey = (MVDownloadProviderKey) obj;
        if (!getClass().equals(mVDownloadProviderKey.getClass())) {
            return getClass().getName().compareTo(mVDownloadProviderKey.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35103h()).compareTo(Boolean.valueOf(mVDownloadProviderKey.mo35103h()));
        if (compareTo2 != 0 || ((mo35103h() && (compareTo2 = this.sourceKey.compareTo(mVDownloadProviderKey.sourceKey)) != 0) || (compareTo2 = Boolean.valueOf(mo35101f()).compareTo(Boolean.valueOf(mVDownloadProviderKey.mo35101f()))) != 0 || ((mo35101f() && (compareTo2 = this.campaignKey.compareTo(mVDownloadProviderKey.campaignKey)) != 0) || (compareTo2 = Boolean.valueOf(mo35102g()).compareTo(Boolean.valueOf(mVDownloadProviderKey.mo35102g()))) != 0))) {
            return compareTo2;
        }
        if (!mo35102g() || (compareTo = this.placementKey.compareTo(mVDownloadProviderKey.placementKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVDownloadProviderKey)) {
            return mo35098a((MVDownloadProviderKey) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35101f() {
        return this.campaignKey != null;
    }

    /* renamed from: g */
    public final boolean mo35102g() {
        return this.placementKey != null;
    }

    /* renamed from: h */
    public final boolean mo35103h() {
        return this.sourceKey != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDownloadProviderKey(", "sourceKey:");
        String str = this.sourceKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("campaignKey:");
        String str2 = this.campaignKey;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("placementKey:");
        String str3 = this.placementKey;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(")");
        return n.toString();
    }
}
