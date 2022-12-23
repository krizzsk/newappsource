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

public class MVDocklessCarMetaData implements TBase<MVDocklessCarMetaData, _Fields>, Serializable, Cloneable, Comparable<MVDocklessCarMetaData> {

    /* renamed from: b */
    public static final C25113c f26284b = new C25113c("providerName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26285c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26286d = new C25113c("androidDeepLink", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26287e = new C25113c("iosDeepLink", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26288f = new C25113c("iosAppInstallLink", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f26289g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26290h;
    public String androidDeepLink;
    public MVImageReferenceWithParams image;
    public String iosAppInstallLink;
    public String iosDeepLink;
    private _Fields[] optionals = {_Fields.ANDROID_DEEP_LINK, _Fields.IOS_DEEP_LINK, _Fields.IOS_APP_INSTALL_LINK};
    public String providerName;

    public enum _Fields implements C25085c {
        PROVIDER_NAME(1, "providerName"),
        IMAGE(2, "image"),
        ANDROID_DEEP_LINK(3, "androidDeepLink"),
        IOS_DEEP_LINK(4, "iosDeepLink"),
        IOS_APP_INSTALL_LINK(5, "iosAppInstallLink");
        
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
                return PROVIDER_NAME;
            }
            if (i == 2) {
                return IMAGE;
            }
            if (i == 3) {
                return ANDROID_DEEP_LINK;
            }
            if (i == 4) {
                return IOS_DEEP_LINK;
            }
            if (i != 5) {
                return null;
            }
            return IOS_APP_INSTALL_LINK;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessCarMetaData$a */
    public static class C9085a extends C25239c<MVDocklessCarMetaData> {
        public C9085a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCarMetaData mVDocklessCarMetaData = (MVDocklessCarMetaData) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVDocklessCarMetaData.image;
            C25113c cVar = MVDocklessCarMetaData.f26284b;
            gVar.mo61687K();
            if (mVDocklessCarMetaData.providerName != null) {
                gVar.mo61711x(MVDocklessCarMetaData.f26284b);
                gVar.mo61686J(mVDocklessCarMetaData.providerName);
                gVar.mo61712y();
            }
            if (mVDocklessCarMetaData.image != null) {
                gVar.mo61711x(MVDocklessCarMetaData.f26285c);
                mVDocklessCarMetaData.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDocklessCarMetaData.androidDeepLink != null && mVDocklessCarMetaData.mo28280f()) {
                gVar.mo61711x(MVDocklessCarMetaData.f26286d);
                gVar.mo61686J(mVDocklessCarMetaData.androidDeepLink);
                gVar.mo61712y();
            }
            if (mVDocklessCarMetaData.iosDeepLink != null && mVDocklessCarMetaData.mo28284i()) {
                gVar.mo61711x(MVDocklessCarMetaData.f26287e);
                gVar.mo61686J(mVDocklessCarMetaData.iosDeepLink);
                gVar.mo61712y();
            }
            if (mVDocklessCarMetaData.iosAppInstallLink != null && mVDocklessCarMetaData.mo28282h()) {
                gVar.mo61711x(MVDocklessCarMetaData.f26288f);
                gVar.mo61686J(mVDocklessCarMetaData.iosAppInstallLink);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCarMetaData mVDocklessCarMetaData = (MVDocklessCarMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVDocklessCarMetaData.image;
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
                                    mVDocklessCarMetaData.iosAppInstallLink = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVDocklessCarMetaData.iosDeepLink = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVDocklessCarMetaData.androidDeepLink = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVDocklessCarMetaData.image = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVDocklessCarMetaData.providerName = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessCarMetaData$b */
    public static class C9086b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9085a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessCarMetaData$c */
    public static class C9087c extends C25240d<MVDocklessCarMetaData> {
        public C9087c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCarMetaData mVDocklessCarMetaData = (MVDocklessCarMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDocklessCarMetaData.mo28285j()) {
                bitSet.set(0);
            }
            if (mVDocklessCarMetaData.mo28281g()) {
                bitSet.set(1);
            }
            if (mVDocklessCarMetaData.mo28280f()) {
                bitSet.set(2);
            }
            if (mVDocklessCarMetaData.mo28284i()) {
                bitSet.set(3);
            }
            if (mVDocklessCarMetaData.mo28282h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVDocklessCarMetaData.mo28285j()) {
                jVar.mo61686J(mVDocklessCarMetaData.providerName);
            }
            if (mVDocklessCarMetaData.mo28281g()) {
                mVDocklessCarMetaData.image.mo25202X0(jVar);
            }
            if (mVDocklessCarMetaData.mo28280f()) {
                jVar.mo61686J(mVDocklessCarMetaData.androidDeepLink);
            }
            if (mVDocklessCarMetaData.mo28284i()) {
                jVar.mo61686J(mVDocklessCarMetaData.iosDeepLink);
            }
            if (mVDocklessCarMetaData.mo28282h()) {
                jVar.mo61686J(mVDocklessCarMetaData.iosAppInstallLink);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDocklessCarMetaData mVDocklessCarMetaData = (MVDocklessCarMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVDocklessCarMetaData.providerName = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVDocklessCarMetaData.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVDocklessCarMetaData.androidDeepLink = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVDocklessCarMetaData.iosDeepLink = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVDocklessCarMetaData.iosAppInstallLink = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDocklessCarMetaData$d */
    public static class C9088d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9087c(0);
        }
    }

    static {
        new C17394d0("MVDocklessCarMetaData");
        HashMap hashMap = new HashMap();
        f26289g = hashMap;
        hashMap.put(C25239c.class, new C9086b());
        hashMap.put(C25240d.class, new C9088d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_NAME, new FieldMetaData("providerName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.ANDROID_DEEP_LINK, new FieldMetaData("androidDeepLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IOS_DEEP_LINK, new FieldMetaData("iosDeepLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IOS_APP_INSTALL_LINK, new FieldMetaData("iosAppInstallLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26290h = unmodifiableMap;
        FieldMetaData.m61947a(MVDocklessCarMetaData.class, unmodifiableMap);
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
        ((C25238b) f26289g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26289g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDocklessCarMetaData mVDocklessCarMetaData = (MVDocklessCarMetaData) obj;
        if (!getClass().equals(mVDocklessCarMetaData.getClass())) {
            return getClass().getName().compareTo(mVDocklessCarMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28285j()).compareTo(Boolean.valueOf(mVDocklessCarMetaData.mo28285j()));
        if (compareTo2 != 0 || ((mo28285j() && (compareTo2 = this.providerName.compareTo(mVDocklessCarMetaData.providerName)) != 0) || (compareTo2 = Boolean.valueOf(mo28281g()).compareTo(Boolean.valueOf(mVDocklessCarMetaData.mo28281g()))) != 0 || ((mo28281g() && (compareTo2 = this.image.compareTo(mVDocklessCarMetaData.image)) != 0) || (compareTo2 = Boolean.valueOf(mo28280f()).compareTo(Boolean.valueOf(mVDocklessCarMetaData.mo28280f()))) != 0 || ((mo28280f() && (compareTo2 = this.androidDeepLink.compareTo(mVDocklessCarMetaData.androidDeepLink)) != 0) || (compareTo2 = Boolean.valueOf(mo28284i()).compareTo(Boolean.valueOf(mVDocklessCarMetaData.mo28284i()))) != 0 || ((mo28284i() && (compareTo2 = this.iosDeepLink.compareTo(mVDocklessCarMetaData.iosDeepLink)) != 0) || (compareTo2 = Boolean.valueOf(mo28282h()).compareTo(Boolean.valueOf(mVDocklessCarMetaData.mo28282h()))) != 0))))) {
            return compareTo2;
        }
        if (!mo28282h() || (compareTo = this.iosAppInstallLink.compareTo(mVDocklessCarMetaData.iosAppInstallLink)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDocklessCarMetaData)) {
            return false;
        }
        MVDocklessCarMetaData mVDocklessCarMetaData = (MVDocklessCarMetaData) obj;
        boolean j = mo28285j();
        boolean j2 = mVDocklessCarMetaData.mo28285j();
        if ((j || j2) && (!j || !j2 || !this.providerName.equals(mVDocklessCarMetaData.providerName))) {
            return false;
        }
        boolean g = mo28281g();
        boolean g2 = mVDocklessCarMetaData.mo28281g();
        if ((g || g2) && (!g || !g2 || !this.image.mo26245a(mVDocklessCarMetaData.image))) {
            return false;
        }
        boolean f = mo28280f();
        boolean f2 = mVDocklessCarMetaData.mo28280f();
        if ((f || f2) && (!f || !f2 || !this.androidDeepLink.equals(mVDocklessCarMetaData.androidDeepLink))) {
            return false;
        }
        boolean i = mo28284i();
        boolean i2 = mVDocklessCarMetaData.mo28284i();
        if ((i || i2) && (!i || !i2 || !this.iosDeepLink.equals(mVDocklessCarMetaData.iosDeepLink))) {
            return false;
        }
        boolean h = mo28282h();
        boolean h2 = mVDocklessCarMetaData.mo28282h();
        if ((h || h2) && (!h || !h2 || !this.iosAppInstallLink.equals(mVDocklessCarMetaData.iosAppInstallLink))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28280f() {
        return this.androidDeepLink != null;
    }

    /* renamed from: g */
    public final boolean mo28281g() {
        return this.image != null;
    }

    /* renamed from: h */
    public final boolean mo28282h() {
        return this.iosAppInstallLink != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28284i() {
        return this.iosDeepLink != null;
    }

    /* renamed from: j */
    public final boolean mo28285j() {
        return this.providerName != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDocklessCarMetaData(", "providerName:");
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
        if (mo28280f()) {
            n.append(", ");
            n.append("androidDeepLink:");
            String str2 = this.androidDeepLink;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo28284i()) {
            n.append(", ");
            n.append("iosDeepLink:");
            String str3 = this.iosDeepLink;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo28282h()) {
            n.append(", ");
            n.append("iosAppInstallLink:");
            String str4 = this.iosAppInstallLink;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        n.append(")");
        return n.toString();
    }
}
