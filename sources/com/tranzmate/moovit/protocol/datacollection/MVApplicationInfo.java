package com.tranzmate.moovit.protocol.datacollection;

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
import p001a0.C0017h;
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

public class MVApplicationInfo implements TBase<MVApplicationInfo, _Fields>, Serializable, Cloneable, Comparable<MVApplicationInfo> {

    /* renamed from: b */
    public static final C25113c f25490b = new C25113c("packageName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25491c = new C25113c("versionName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25492d = new C25113c("isSystemApp", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f25493e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25494f;
    private byte __isset_bitfield = 0;
    public boolean isSystemApp;
    public String packageName;
    public String versionName;

    public enum _Fields implements C25085c {
        PACKAGE_NAME(1, "packageName"),
        VERSION_NAME(2, "versionName"),
        IS_SYSTEM_APP(3, "isSystemApp");
        
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
                return PACKAGE_NAME;
            }
            if (i == 2) {
                return VERSION_NAME;
            }
            if (i != 3) {
                return null;
            }
            return IS_SYSTEM_APP;
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

    /* renamed from: com.tranzmate.moovit.protocol.datacollection.MVApplicationInfo$a */
    public static class C8627a extends C25239c<MVApplicationInfo> {
        public C8627a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplicationInfo mVApplicationInfo = (MVApplicationInfo) tBase;
            mVApplicationInfo.getClass();
            C25113c cVar = MVApplicationInfo.f25490b;
            gVar.mo61687K();
            if (mVApplicationInfo.packageName != null) {
                gVar.mo61711x(MVApplicationInfo.f25490b);
                gVar.mo61686J(mVApplicationInfo.packageName);
                gVar.mo61712y();
            }
            if (mVApplicationInfo.versionName != null) {
                gVar.mo61711x(MVApplicationInfo.f25491c);
                gVar.mo61686J(mVApplicationInfo.versionName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVApplicationInfo.f25492d);
            C0017h.m62S(gVar, mVApplicationInfo.isSystemApp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplicationInfo mVApplicationInfo = (MVApplicationInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVApplicationInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVApplicationInfo.isSystemApp = gVar.mo61690c();
                            mVApplicationInfo.mo26984i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVApplicationInfo.versionName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVApplicationInfo.packageName = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.datacollection.MVApplicationInfo$b */
    public static class C8628b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8627a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.datacollection.MVApplicationInfo$c */
    public static class C8629c extends C25240d<MVApplicationInfo> {
        public C8629c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplicationInfo mVApplicationInfo = (MVApplicationInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplicationInfo.mo26981g()) {
                bitSet.set(0);
            }
            if (mVApplicationInfo.mo26982h()) {
                bitSet.set(1);
            }
            if (mVApplicationInfo.mo26980f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVApplicationInfo.mo26981g()) {
                jVar.mo61686J(mVApplicationInfo.packageName);
            }
            if (mVApplicationInfo.mo26982h()) {
                jVar.mo61686J(mVApplicationInfo.versionName);
            }
            if (mVApplicationInfo.mo26980f()) {
                jVar.mo61708u(mVApplicationInfo.isSystemApp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplicationInfo mVApplicationInfo = (MVApplicationInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVApplicationInfo.packageName = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVApplicationInfo.versionName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVApplicationInfo.isSystemApp = jVar.mo61690c();
                mVApplicationInfo.mo26984i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.datacollection.MVApplicationInfo$d */
    public static class C8630d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8629c(0);
        }
    }

    static {
        new C17394d0("MVApplicationInfo");
        HashMap hashMap = new HashMap();
        f25493e = hashMap;
        hashMap.put(C25239c.class, new C8628b());
        hashMap.put(C25240d.class, new C8630d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PACKAGE_NAME, new FieldMetaData("packageName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VERSION_NAME, new FieldMetaData("versionName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_SYSTEM_APP, new FieldMetaData("isSystemApp", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25494f = unmodifiableMap;
        FieldMetaData.m61947a(MVApplicationInfo.class, unmodifiableMap);
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
        ((C25238b) f25493e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25493e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVApplicationInfo mVApplicationInfo = (MVApplicationInfo) obj;
        if (!getClass().equals(mVApplicationInfo.getClass())) {
            return getClass().getName().compareTo(mVApplicationInfo.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26981g()).compareTo(Boolean.valueOf(mVApplicationInfo.mo26981g()));
        if (compareTo != 0 || ((mo26981g() && (compareTo = this.packageName.compareTo(mVApplicationInfo.packageName)) != 0) || (compareTo = Boolean.valueOf(mo26982h()).compareTo(Boolean.valueOf(mVApplicationInfo.mo26982h()))) != 0 || ((mo26982h() && (compareTo = this.versionName.compareTo(mVApplicationInfo.versionName)) != 0) || (compareTo = Boolean.valueOf(mo26980f()).compareTo(Boolean.valueOf(mVApplicationInfo.mo26980f()))) != 0))) {
            return compareTo;
        }
        if (!mo26980f() || (l = C25082a.m62848l(this.isSystemApp, mVApplicationInfo.isSystemApp)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVApplicationInfo)) {
            return false;
        }
        MVApplicationInfo mVApplicationInfo = (MVApplicationInfo) obj;
        boolean g = mo26981g();
        boolean g2 = mVApplicationInfo.mo26981g();
        if ((g || g2) && (!g || !g2 || !this.packageName.equals(mVApplicationInfo.packageName))) {
            return false;
        }
        boolean h = mo26982h();
        boolean h2 = mVApplicationInfo.mo26982h();
        if (((h || h2) && (!h || !h2 || !this.versionName.equals(mVApplicationInfo.versionName))) || this.isSystemApp != mVApplicationInfo.isSystemApp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26980f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26981g() {
        return this.packageName != null;
    }

    /* renamed from: h */
    public final boolean mo26982h() {
        return this.versionName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26984i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVApplicationInfo(", "packageName:");
        String str = this.packageName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("versionName:");
        String str2 = this.versionName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("isSystemApp:");
        return C25541a.m63885p(n, this.isSystemApp, ")");
    }
}
