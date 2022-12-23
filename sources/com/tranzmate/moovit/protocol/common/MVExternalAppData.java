package com.tranzmate.moovit.protocol.common;

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

public class MVExternalAppData implements TBase<MVExternalAppData, _Fields>, Serializable, Cloneable, Comparable<MVExternalAppData> {

    /* renamed from: b */
    public static final C25113c f25012b = new C25113c("androidApplicationId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25013c = new C25113c("androidDeepLink", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25014d = new C25113c("iosAppInstalLink", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25015e = new C25113c("iosDeepLink", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f25016f = new C25113c("iosScheme", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f25017g = new C25113c("androidAppInstallLink", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f25018h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25019i;
    public String androidAppInstallLink;
    public String androidApplicationId;
    public String androidDeepLink;
    public String iosAppInstalLink;
    public String iosDeepLink;
    public String iosScheme;
    private _Fields[] optionals = {_Fields.ANDROID_APPLICATION_ID, _Fields.ANDROID_DEEP_LINK, _Fields.IOS_APP_INSTAL_LINK, _Fields.IOS_DEEP_LINK, _Fields.IOS_SCHEME, _Fields.ANDROID_APP_INSTALL_LINK};

    public enum _Fields implements C25085c {
        ANDROID_APPLICATION_ID(1, "androidApplicationId"),
        ANDROID_DEEP_LINK(2, "androidDeepLink"),
        IOS_APP_INSTAL_LINK(3, "iosAppInstalLink"),
        IOS_DEEP_LINK(4, "iosDeepLink"),
        IOS_SCHEME(5, "iosScheme"),
        ANDROID_APP_INSTALL_LINK(6, "androidAppInstallLink");
        
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
                    return ANDROID_APPLICATION_ID;
                case 2:
                    return ANDROID_DEEP_LINK;
                case 3:
                    return IOS_APP_INSTAL_LINK;
                case 4:
                    return IOS_DEEP_LINK;
                case 5:
                    return IOS_SCHEME;
                case 6:
                    return ANDROID_APP_INSTALL_LINK;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVExternalAppData$a */
    public static class C8400a extends C25239c<MVExternalAppData> {
        public C8400a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalAppData mVExternalAppData = (MVExternalAppData) tBase;
            mVExternalAppData.getClass();
            C25113c cVar = MVExternalAppData.f25012b;
            gVar.mo61687K();
            if (mVExternalAppData.androidApplicationId != null && mVExternalAppData.mo26161g()) {
                gVar.mo61711x(MVExternalAppData.f25012b);
                gVar.mo61686J(mVExternalAppData.androidApplicationId);
                gVar.mo61712y();
            }
            if (mVExternalAppData.androidDeepLink != null && mVExternalAppData.mo26162h()) {
                gVar.mo61711x(MVExternalAppData.f25013c);
                gVar.mo61686J(mVExternalAppData.androidDeepLink);
                gVar.mo61712y();
            }
            if (mVExternalAppData.iosAppInstalLink != null && mVExternalAppData.mo26164i()) {
                gVar.mo61711x(MVExternalAppData.f25014d);
                gVar.mo61686J(mVExternalAppData.iosAppInstalLink);
                gVar.mo61712y();
            }
            if (mVExternalAppData.iosDeepLink != null && mVExternalAppData.mo26165j()) {
                gVar.mo61711x(MVExternalAppData.f25015e);
                gVar.mo61686J(mVExternalAppData.iosDeepLink);
                gVar.mo61712y();
            }
            if (mVExternalAppData.iosScheme != null && mVExternalAppData.mo26166k()) {
                gVar.mo61711x(MVExternalAppData.f25016f);
                gVar.mo61686J(mVExternalAppData.iosScheme);
                gVar.mo61712y();
            }
            if (mVExternalAppData.androidAppInstallLink != null && mVExternalAppData.mo26160f()) {
                gVar.mo61711x(MVExternalAppData.f25017g);
                gVar.mo61686J(mVExternalAppData.androidAppInstallLink);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalAppData mVExternalAppData = (MVExternalAppData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVExternalAppData.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalAppData.androidApplicationId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalAppData.androidDeepLink = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalAppData.iosAppInstalLink = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalAppData.iosDeepLink = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalAppData.iosScheme = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalAppData.androidAppInstallLink = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVExternalAppData$b */
    public static class C8401b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8400a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVExternalAppData$c */
    public static class C8402c extends C25240d<MVExternalAppData> {
        public C8402c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalAppData mVExternalAppData = (MVExternalAppData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVExternalAppData.mo26161g()) {
                bitSet.set(0);
            }
            if (mVExternalAppData.mo26162h()) {
                bitSet.set(1);
            }
            if (mVExternalAppData.mo26164i()) {
                bitSet.set(2);
            }
            if (mVExternalAppData.mo26165j()) {
                bitSet.set(3);
            }
            if (mVExternalAppData.mo26166k()) {
                bitSet.set(4);
            }
            if (mVExternalAppData.mo26160f()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVExternalAppData.mo26161g()) {
                jVar.mo61686J(mVExternalAppData.androidApplicationId);
            }
            if (mVExternalAppData.mo26162h()) {
                jVar.mo61686J(mVExternalAppData.androidDeepLink);
            }
            if (mVExternalAppData.mo26164i()) {
                jVar.mo61686J(mVExternalAppData.iosAppInstalLink);
            }
            if (mVExternalAppData.mo26165j()) {
                jVar.mo61686J(mVExternalAppData.iosDeepLink);
            }
            if (mVExternalAppData.mo26166k()) {
                jVar.mo61686J(mVExternalAppData.iosScheme);
            }
            if (mVExternalAppData.mo26160f()) {
                jVar.mo61686J(mVExternalAppData.androidAppInstallLink);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalAppData mVExternalAppData = (MVExternalAppData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVExternalAppData.androidApplicationId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVExternalAppData.androidDeepLink = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVExternalAppData.iosAppInstalLink = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVExternalAppData.iosDeepLink = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVExternalAppData.iosScheme = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVExternalAppData.androidAppInstallLink = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVExternalAppData$d */
    public static class C8403d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8402c(0);
        }
    }

    static {
        new C17394d0("MVExternalAppData");
        HashMap hashMap = new HashMap();
        f25018h = hashMap;
        hashMap.put(C25239c.class, new C8401b());
        hashMap.put(C25240d.class, new C8403d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ANDROID_APPLICATION_ID, new FieldMetaData("androidApplicationId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANDROID_DEEP_LINK, new FieldMetaData("androidDeepLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IOS_APP_INSTAL_LINK, new FieldMetaData("iosAppInstalLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IOS_DEEP_LINK, new FieldMetaData("iosDeepLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IOS_SCHEME, new FieldMetaData("iosScheme", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANDROID_APP_INSTALL_LINK, new FieldMetaData("androidAppInstallLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25019i = unmodifiableMap;
        FieldMetaData.m61947a(MVExternalAppData.class, unmodifiableMap);
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
        ((C25238b) f25018h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25018h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26157a(MVExternalAppData mVExternalAppData) {
        if (mVExternalAppData == null) {
            return false;
        }
        boolean g = mo26161g();
        boolean g2 = mVExternalAppData.mo26161g();
        if ((g || g2) && (!g || !g2 || !this.androidApplicationId.equals(mVExternalAppData.androidApplicationId))) {
            return false;
        }
        boolean h = mo26162h();
        boolean h2 = mVExternalAppData.mo26162h();
        if ((h || h2) && (!h || !h2 || !this.androidDeepLink.equals(mVExternalAppData.androidDeepLink))) {
            return false;
        }
        boolean i = mo26164i();
        boolean i2 = mVExternalAppData.mo26164i();
        if ((i || i2) && (!i || !i2 || !this.iosAppInstalLink.equals(mVExternalAppData.iosAppInstalLink))) {
            return false;
        }
        boolean j = mo26165j();
        boolean j2 = mVExternalAppData.mo26165j();
        if ((j || j2) && (!j || !j2 || !this.iosDeepLink.equals(mVExternalAppData.iosDeepLink))) {
            return false;
        }
        boolean k = mo26166k();
        boolean k2 = mVExternalAppData.mo26166k();
        if ((k || k2) && (!k || !k2 || !this.iosScheme.equals(mVExternalAppData.iosScheme))) {
            return false;
        }
        boolean f = mo26160f();
        boolean f2 = mVExternalAppData.mo26160f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.androidAppInstallLink.equals(mVExternalAppData.androidAppInstallLink)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVExternalAppData mVExternalAppData = (MVExternalAppData) obj;
        if (!getClass().equals(mVExternalAppData.getClass())) {
            return getClass().getName().compareTo(mVExternalAppData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26161g()).compareTo(Boolean.valueOf(mVExternalAppData.mo26161g()));
        if (compareTo2 != 0 || ((mo26161g() && (compareTo2 = this.androidApplicationId.compareTo(mVExternalAppData.androidApplicationId)) != 0) || (compareTo2 = Boolean.valueOf(mo26162h()).compareTo(Boolean.valueOf(mVExternalAppData.mo26162h()))) != 0 || ((mo26162h() && (compareTo2 = this.androidDeepLink.compareTo(mVExternalAppData.androidDeepLink)) != 0) || (compareTo2 = Boolean.valueOf(mo26164i()).compareTo(Boolean.valueOf(mVExternalAppData.mo26164i()))) != 0 || ((mo26164i() && (compareTo2 = this.iosAppInstalLink.compareTo(mVExternalAppData.iosAppInstalLink)) != 0) || (compareTo2 = Boolean.valueOf(mo26165j()).compareTo(Boolean.valueOf(mVExternalAppData.mo26165j()))) != 0 || ((mo26165j() && (compareTo2 = this.iosDeepLink.compareTo(mVExternalAppData.iosDeepLink)) != 0) || (compareTo2 = Boolean.valueOf(mo26166k()).compareTo(Boolean.valueOf(mVExternalAppData.mo26166k()))) != 0 || ((mo26166k() && (compareTo2 = this.iosScheme.compareTo(mVExternalAppData.iosScheme)) != 0) || (compareTo2 = Boolean.valueOf(mo26160f()).compareTo(Boolean.valueOf(mVExternalAppData.mo26160f()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo26160f() || (compareTo = this.androidAppInstallLink.compareTo(mVExternalAppData.androidAppInstallLink)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVExternalAppData)) {
            return mo26157a((MVExternalAppData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26160f() {
        return this.androidAppInstallLink != null;
    }

    /* renamed from: g */
    public final boolean mo26161g() {
        return this.androidApplicationId != null;
    }

    /* renamed from: h */
    public final boolean mo26162h() {
        return this.androidDeepLink != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26164i() {
        return this.iosAppInstalLink != null;
    }

    /* renamed from: j */
    public final boolean mo26165j() {
        return this.iosDeepLink != null;
    }

    /* renamed from: k */
    public final boolean mo26166k() {
        return this.iosScheme != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVExternalAppData(");
        boolean z2 = false;
        if (mo26161g()) {
            sb.append("androidApplicationId:");
            String str = this.androidApplicationId;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo26162h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("androidDeepLink:");
            String str2 = this.androidDeepLink;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo26164i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("iosAppInstalLink:");
            String str3 = this.iosAppInstalLink;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (mo26165j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("iosDeepLink:");
            String str4 = this.iosDeepLink;
            if (str4 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (mo26166k()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("iosScheme:");
            String str5 = this.iosScheme;
            if (str5 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str5);
            }
        } else {
            z2 = z;
        }
        if (mo26160f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("androidAppInstallLink:");
            String str6 = this.androidAppInstallLink;
            if (str6 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str6);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
