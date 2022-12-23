package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVDocklessVehicleProviderMetaData implements TBase<MVDocklessVehicleProviderMetaData, _Fields>, Serializable, Cloneable, Comparable<MVDocklessVehicleProviderMetaData> {

    /* renamed from: b */
    public static final C25113c f26298b = new C25113c("providerName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26299c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26300d = new C25113c("androidDeepLink", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26301e = new C25113c("iosDeepLink", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26302f = new C25113c("iosAppInstallLink", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f26303g = new C25113c("androidDefaultDeepLink", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f26304h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26305i;
    public String androidDeepLink;
    public String androidDefaultDeepLink;
    public MVImageReferenceWithParams image;
    public String iosAppInstallLink;
    public String iosDeepLink;
    private _Fields[] optionals = {_Fields.ANDROID_DEEP_LINK, _Fields.IOS_DEEP_LINK, _Fields.IOS_APP_INSTALL_LINK, _Fields.ANDROID_DEFAULT_DEEP_LINK};
    public String providerName;

    public enum _Fields implements C25085c {
        PROVIDER_NAME(1, "providerName"),
        IMAGE(2, "image"),
        ANDROID_DEEP_LINK(3, "androidDeepLink"),
        IOS_DEEP_LINK(4, "iosDeepLink"),
        IOS_APP_INSTALL_LINK(5, "iosAppInstallLink"),
        ANDROID_DEFAULT_DEEP_LINK(6, "androidDefaultDeepLink");
        
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
                    return PROVIDER_NAME;
                case 2:
                    return IMAGE;
                case 3:
                    return ANDROID_DEEP_LINK;
                case 4:
                    return IOS_DEEP_LINK;
                case 5:
                    return IOS_APP_INSTALL_LINK;
                case 6:
                    return ANDROID_DEFAULT_DEEP_LINK;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleProviderMetaData$a */
    public static class C9093a extends C25239c<MVDocklessVehicleProviderMetaData> {
        public C9093a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessVehicleProviderMetaData mVDocklessVehicleProviderMetaData = (MVDocklessVehicleProviderMetaData) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVDocklessVehicleProviderMetaData.image;
            C25113c cVar = MVDocklessVehicleProviderMetaData.f26298b;
            gVar.mo61687K();
            if (mVDocklessVehicleProviderMetaData.providerName != null) {
                gVar.mo61711x(MVDocklessVehicleProviderMetaData.f26298b);
                gVar.mo61686J(mVDocklessVehicleProviderMetaData.providerName);
                gVar.mo61712y();
            }
            if (mVDocklessVehicleProviderMetaData.image != null) {
                gVar.mo61711x(MVDocklessVehicleProviderMetaData.f26299c);
                mVDocklessVehicleProviderMetaData.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessVehicleProviderMetaData.androidDeepLink != null && mVDocklessVehicleProviderMetaData.mo28302f()) {
                gVar.mo61711x(MVDocklessVehicleProviderMetaData.f26300d);
                gVar.mo61686J(mVDocklessVehicleProviderMetaData.androidDeepLink);
                gVar.mo61712y();
            }
            if (mVDocklessVehicleProviderMetaData.iosDeepLink != null && mVDocklessVehicleProviderMetaData.mo28307j()) {
                gVar.mo61711x(MVDocklessVehicleProviderMetaData.f26301e);
                gVar.mo61686J(mVDocklessVehicleProviderMetaData.iosDeepLink);
                gVar.mo61712y();
            }
            if (mVDocklessVehicleProviderMetaData.iosAppInstallLink != null && mVDocklessVehicleProviderMetaData.mo28306i()) {
                gVar.mo61711x(MVDocklessVehicleProviderMetaData.f26302f);
                gVar.mo61686J(mVDocklessVehicleProviderMetaData.iosAppInstallLink);
                gVar.mo61712y();
            }
            if (mVDocklessVehicleProviderMetaData.androidDefaultDeepLink != null && mVDocklessVehicleProviderMetaData.mo28303g()) {
                gVar.mo61711x(MVDocklessVehicleProviderMetaData.f26303g);
                gVar.mo61686J(mVDocklessVehicleProviderMetaData.androidDefaultDeepLink);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessVehicleProviderMetaData mVDocklessVehicleProviderMetaData = (MVDocklessVehicleProviderMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVDocklessVehicleProviderMetaData.image;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessVehicleProviderMetaData.providerName = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVDocklessVehicleProviderMetaData.image = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessVehicleProviderMetaData.androidDeepLink = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessVehicleProviderMetaData.iosDeepLink = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessVehicleProviderMetaData.iosAppInstallLink = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDocklessVehicleProviderMetaData.androidDefaultDeepLink = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleProviderMetaData$b */
    public static class C9094b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9093a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleProviderMetaData$c */
    public static class C9095c extends C25240d<MVDocklessVehicleProviderMetaData> {
        public C9095c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessVehicleProviderMetaData mVDocklessVehicleProviderMetaData = (MVDocklessVehicleProviderMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDocklessVehicleProviderMetaData.mo28308k()) {
                bitSet.set(0);
            }
            if (mVDocklessVehicleProviderMetaData.mo28304h()) {
                bitSet.set(1);
            }
            if (mVDocklessVehicleProviderMetaData.mo28302f()) {
                bitSet.set(2);
            }
            if (mVDocklessVehicleProviderMetaData.mo28307j()) {
                bitSet.set(3);
            }
            if (mVDocklessVehicleProviderMetaData.mo28306i()) {
                bitSet.set(4);
            }
            if (mVDocklessVehicleProviderMetaData.mo28303g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVDocklessVehicleProviderMetaData.mo28308k()) {
                jVar.mo61686J(mVDocklessVehicleProviderMetaData.providerName);
            }
            if (mVDocklessVehicleProviderMetaData.mo28304h()) {
                mVDocklessVehicleProviderMetaData.image.mo25202X0(jVar);
            }
            if (mVDocklessVehicleProviderMetaData.mo28302f()) {
                jVar.mo61686J(mVDocklessVehicleProviderMetaData.androidDeepLink);
            }
            if (mVDocklessVehicleProviderMetaData.mo28307j()) {
                jVar.mo61686J(mVDocklessVehicleProviderMetaData.iosDeepLink);
            }
            if (mVDocklessVehicleProviderMetaData.mo28306i()) {
                jVar.mo61686J(mVDocklessVehicleProviderMetaData.iosAppInstallLink);
            }
            if (mVDocklessVehicleProviderMetaData.mo28303g()) {
                jVar.mo61686J(mVDocklessVehicleProviderMetaData.androidDefaultDeepLink);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessVehicleProviderMetaData mVDocklessVehicleProviderMetaData = (MVDocklessVehicleProviderMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVDocklessVehicleProviderMetaData.providerName = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVDocklessVehicleProviderMetaData.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVDocklessVehicleProviderMetaData.androidDeepLink = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVDocklessVehicleProviderMetaData.iosDeepLink = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVDocklessVehicleProviderMetaData.iosAppInstallLink = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVDocklessVehicleProviderMetaData.androidDefaultDeepLink = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessVehicleProviderMetaData$d */
    public static class C9096d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9095c(0);
        }
    }

    static {
        new C17394d0("MVDocklessVehicleProviderMetaData");
        HashMap hashMap = new HashMap();
        f26304h = hashMap;
        hashMap.put(C25239c.class, new C9094b());
        hashMap.put(C25240d.class, new C9096d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_NAME, new FieldMetaData("providerName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.ANDROID_DEEP_LINK, new FieldMetaData("androidDeepLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IOS_DEEP_LINK, new FieldMetaData("iosDeepLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IOS_APP_INSTALL_LINK, new FieldMetaData("iosAppInstallLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANDROID_DEFAULT_DEEP_LINK, new FieldMetaData("androidDefaultDeepLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26305i = unmodifiableMap;
        FieldMetaData.m61947a(MVDocklessVehicleProviderMetaData.class, unmodifiableMap);
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
        ((C25238b) f26304h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26304h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDocklessVehicleProviderMetaData mVDocklessVehicleProviderMetaData = (MVDocklessVehicleProviderMetaData) obj;
        if (!getClass().equals(mVDocklessVehicleProviderMetaData.getClass())) {
            return getClass().getName().compareTo(mVDocklessVehicleProviderMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28308k()).compareTo(Boolean.valueOf(mVDocklessVehicleProviderMetaData.mo28308k()));
        if (compareTo2 != 0 || ((mo28308k() && (compareTo2 = this.providerName.compareTo(mVDocklessVehicleProviderMetaData.providerName)) != 0) || (compareTo2 = Boolean.valueOf(mo28304h()).compareTo(Boolean.valueOf(mVDocklessVehicleProviderMetaData.mo28304h()))) != 0 || ((mo28304h() && (compareTo2 = this.image.compareTo(mVDocklessVehicleProviderMetaData.image)) != 0) || (compareTo2 = Boolean.valueOf(mo28302f()).compareTo(Boolean.valueOf(mVDocklessVehicleProviderMetaData.mo28302f()))) != 0 || ((mo28302f() && (compareTo2 = this.androidDeepLink.compareTo(mVDocklessVehicleProviderMetaData.androidDeepLink)) != 0) || (compareTo2 = Boolean.valueOf(mo28307j()).compareTo(Boolean.valueOf(mVDocklessVehicleProviderMetaData.mo28307j()))) != 0 || ((mo28307j() && (compareTo2 = this.iosDeepLink.compareTo(mVDocklessVehicleProviderMetaData.iosDeepLink)) != 0) || (compareTo2 = Boolean.valueOf(mo28306i()).compareTo(Boolean.valueOf(mVDocklessVehicleProviderMetaData.mo28306i()))) != 0 || ((mo28306i() && (compareTo2 = this.iosAppInstallLink.compareTo(mVDocklessVehicleProviderMetaData.iosAppInstallLink)) != 0) || (compareTo2 = Boolean.valueOf(mo28303g()).compareTo(Boolean.valueOf(mVDocklessVehicleProviderMetaData.mo28303g()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo28303g() || (compareTo = this.androidDefaultDeepLink.compareTo(mVDocklessVehicleProviderMetaData.androidDefaultDeepLink)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDocklessVehicleProviderMetaData)) {
            return false;
        }
        MVDocklessVehicleProviderMetaData mVDocklessVehicleProviderMetaData = (MVDocklessVehicleProviderMetaData) obj;
        boolean k = mo28308k();
        boolean k2 = mVDocklessVehicleProviderMetaData.mo28308k();
        if ((k || k2) && (!k || !k2 || !this.providerName.equals(mVDocklessVehicleProviderMetaData.providerName))) {
            return false;
        }
        boolean h = mo28304h();
        boolean h2 = mVDocklessVehicleProviderMetaData.mo28304h();
        if ((h || h2) && (!h || !h2 || !this.image.mo26245a(mVDocklessVehicleProviderMetaData.image))) {
            return false;
        }
        boolean f = mo28302f();
        boolean f2 = mVDocklessVehicleProviderMetaData.mo28302f();
        if ((f || f2) && (!f || !f2 || !this.androidDeepLink.equals(mVDocklessVehicleProviderMetaData.androidDeepLink))) {
            return false;
        }
        boolean j = mo28307j();
        boolean j2 = mVDocklessVehicleProviderMetaData.mo28307j();
        if ((j || j2) && (!j || !j2 || !this.iosDeepLink.equals(mVDocklessVehicleProviderMetaData.iosDeepLink))) {
            return false;
        }
        boolean i = mo28306i();
        boolean i2 = mVDocklessVehicleProviderMetaData.mo28306i();
        if ((i || i2) && (!i || !i2 || !this.iosAppInstallLink.equals(mVDocklessVehicleProviderMetaData.iosAppInstallLink))) {
            return false;
        }
        boolean g = mo28303g();
        boolean g2 = mVDocklessVehicleProviderMetaData.mo28303g();
        if ((g || g2) && (!g || !g2 || !this.androidDefaultDeepLink.equals(mVDocklessVehicleProviderMetaData.androidDefaultDeepLink))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28302f() {
        return this.androidDeepLink != null;
    }

    /* renamed from: g */
    public final boolean mo28303g() {
        return this.androidDefaultDeepLink != null;
    }

    /* renamed from: h */
    public final boolean mo28304h() {
        return this.image != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28306i() {
        return this.iosAppInstallLink != null;
    }

    /* renamed from: j */
    public final boolean mo28307j() {
        return this.iosDeepLink != null;
    }

    /* renamed from: k */
    public final boolean mo28308k() {
        return this.providerName != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDocklessVehicleProviderMetaData(", "providerName:");
        String str = this.providerName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("image:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        if (mo28302f()) {
            n.append(", ");
            n.append("androidDeepLink:");
            String str2 = this.androidDeepLink;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo28307j()) {
            n.append(", ");
            n.append("iosDeepLink:");
            String str3 = this.iosDeepLink;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo28306i()) {
            n.append(", ");
            n.append("iosAppInstallLink:");
            String str4 = this.iosAppInstallLink;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo28303g()) {
            n.append(", ");
            n.append("androidDefaultDeepLink:");
            String str5 = this.androidDefaultDeepLink;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        n.append(")");
        return n.toString();
    }
}
