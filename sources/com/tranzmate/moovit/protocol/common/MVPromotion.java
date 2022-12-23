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

public class MVPromotion implements TBase<MVPromotion, _Fields>, Serializable, Cloneable, Comparable<MVPromotion> {

    /* renamed from: b */
    public static final C25113c f25116b = new C25113c("iconUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25117c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25118d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25119e = new C25113c("actionText", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f25120f = new C25113c("actionDeepLink", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f25121g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25122h;
    public MVExternalAppData actionDeepLink;
    public String actionText;
    public String iconUrl;
    private _Fields[] optionals = {_Fields.ACTION_DEEP_LINK};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        ICON_URL(1, "iconUrl"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        ACTION_TEXT(4, "actionText"),
        ACTION_DEEP_LINK(5, "actionDeepLink");
        
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
                return ICON_URL;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i == 3) {
                return SUBTITLE;
            }
            if (i == 4) {
                return ACTION_TEXT;
            }
            if (i != 5) {
                return null;
            }
            return ACTION_DEEP_LINK;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPromotion$a */
    public static class C8480a extends C25239c<MVPromotion> {
        public C8480a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPromotion mVPromotion = (MVPromotion) tBase;
            MVExternalAppData mVExternalAppData = mVPromotion.actionDeepLink;
            C25113c cVar = MVPromotion.f25116b;
            gVar.mo61687K();
            if (mVPromotion.iconUrl != null) {
                gVar.mo61711x(MVPromotion.f25116b);
                gVar.mo61686J(mVPromotion.iconUrl);
                gVar.mo61712y();
            }
            if (mVPromotion.title != null) {
                gVar.mo61711x(MVPromotion.f25117c);
                gVar.mo61686J(mVPromotion.title);
                gVar.mo61712y();
            }
            if (mVPromotion.subtitle != null) {
                gVar.mo61711x(MVPromotion.f25118d);
                gVar.mo61686J(mVPromotion.subtitle);
                gVar.mo61712y();
            }
            if (mVPromotion.actionText != null) {
                gVar.mo61711x(MVPromotion.f25119e);
                gVar.mo61686J(mVPromotion.actionText);
                gVar.mo61712y();
            }
            if (mVPromotion.actionDeepLink != null && mVPromotion.mo26359f()) {
                gVar.mo61711x(MVPromotion.f25120f);
                mVPromotion.actionDeepLink.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPromotion mVPromotion = (MVPromotion) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVExternalAppData mVExternalAppData = mVPromotion.actionDeepLink;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVExternalAppData mVExternalAppData2 = new MVExternalAppData();
                                    mVPromotion.actionDeepLink = mVExternalAppData2;
                                    mVExternalAppData2.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVPromotion.actionText = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVPromotion.subtitle = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPromotion.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPromotion.iconUrl = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPromotion$b */
    public static class C8481b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8480a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPromotion$c */
    public static class C8482c extends C25240d<MVPromotion> {
        public C8482c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPromotion mVPromotion = (MVPromotion) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPromotion.mo26361h()) {
                bitSet.set(0);
            }
            if (mVPromotion.mo26364j()) {
                bitSet.set(1);
            }
            if (mVPromotion.mo26363i()) {
                bitSet.set(2);
            }
            if (mVPromotion.mo26360g()) {
                bitSet.set(3);
            }
            if (mVPromotion.mo26359f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPromotion.mo26361h()) {
                jVar.mo61686J(mVPromotion.iconUrl);
            }
            if (mVPromotion.mo26364j()) {
                jVar.mo61686J(mVPromotion.title);
            }
            if (mVPromotion.mo26363i()) {
                jVar.mo61686J(mVPromotion.subtitle);
            }
            if (mVPromotion.mo26360g()) {
                jVar.mo61686J(mVPromotion.actionText);
            }
            if (mVPromotion.mo26359f()) {
                mVPromotion.actionDeepLink.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPromotion mVPromotion = (MVPromotion) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPromotion.iconUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPromotion.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPromotion.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPromotion.actionText = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVExternalAppData mVExternalAppData = new MVExternalAppData();
                mVPromotion.actionDeepLink = mVExternalAppData;
                mVExternalAppData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPromotion$d */
    public static class C8483d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8482c(0);
        }
    }

    static {
        new C17394d0("MVPromotion");
        HashMap hashMap = new HashMap();
        f25121g = hashMap;
        hashMap.put(C25239c.class, new C8481b());
        hashMap.put(C25240d.class, new C8483d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ICON_URL, new FieldMetaData("iconUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_TEXT, new FieldMetaData("actionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_DEEP_LINK, new FieldMetaData("actionDeepLink", (byte) 2, new StructMetaData(MVExternalAppData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25122h = unmodifiableMap;
        FieldMetaData.m61947a(MVPromotion.class, unmodifiableMap);
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
        ((C25238b) f25121g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25121g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPromotion mVPromotion = (MVPromotion) obj;
        if (!getClass().equals(mVPromotion.getClass())) {
            return getClass().getName().compareTo(mVPromotion.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26361h()).compareTo(Boolean.valueOf(mVPromotion.mo26361h()));
        if (compareTo2 != 0 || ((mo26361h() && (compareTo2 = this.iconUrl.compareTo(mVPromotion.iconUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo26364j()).compareTo(Boolean.valueOf(mVPromotion.mo26364j()))) != 0 || ((mo26364j() && (compareTo2 = this.title.compareTo(mVPromotion.title)) != 0) || (compareTo2 = Boolean.valueOf(mo26363i()).compareTo(Boolean.valueOf(mVPromotion.mo26363i()))) != 0 || ((mo26363i() && (compareTo2 = this.subtitle.compareTo(mVPromotion.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo26360g()).compareTo(Boolean.valueOf(mVPromotion.mo26360g()))) != 0 || ((mo26360g() && (compareTo2 = this.actionText.compareTo(mVPromotion.actionText)) != 0) || (compareTo2 = Boolean.valueOf(mo26359f()).compareTo(Boolean.valueOf(mVPromotion.mo26359f()))) != 0))))) {
            return compareTo2;
        }
        if (!mo26359f() || (compareTo = this.actionDeepLink.compareTo(mVPromotion.actionDeepLink)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPromotion)) {
            return false;
        }
        MVPromotion mVPromotion = (MVPromotion) obj;
        boolean h = mo26361h();
        boolean h2 = mVPromotion.mo26361h();
        if ((h || h2) && (!h || !h2 || !this.iconUrl.equals(mVPromotion.iconUrl))) {
            return false;
        }
        boolean j = mo26364j();
        boolean j2 = mVPromotion.mo26364j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVPromotion.title))) {
            return false;
        }
        boolean i = mo26363i();
        boolean i2 = mVPromotion.mo26363i();
        if ((i || i2) && (!i || !i2 || !this.subtitle.equals(mVPromotion.subtitle))) {
            return false;
        }
        boolean g = mo26360g();
        boolean g2 = mVPromotion.mo26360g();
        if ((g || g2) && (!g || !g2 || !this.actionText.equals(mVPromotion.actionText))) {
            return false;
        }
        boolean f = mo26359f();
        boolean f2 = mVPromotion.mo26359f();
        if ((f || f2) && (!f || !f2 || !this.actionDeepLink.mo26157a(mVPromotion.actionDeepLink))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26359f() {
        return this.actionDeepLink != null;
    }

    /* renamed from: g */
    public final boolean mo26360g() {
        return this.actionText != null;
    }

    /* renamed from: h */
    public final boolean mo26361h() {
        return this.iconUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26363i() {
        return this.subtitle != null;
    }

    /* renamed from: j */
    public final boolean mo26364j() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPromotion(", "iconUrl:");
        String str = this.iconUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("subtitle:");
        String str3 = this.subtitle;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("actionText:");
        String str4 = this.actionText;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        if (mo26359f()) {
            n.append(", ");
            n.append("actionDeepLink:");
            MVExternalAppData mVExternalAppData = this.actionDeepLink;
            if (mVExternalAppData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVExternalAppData);
            }
        }
        n.append(")");
        return n.toString();
    }
}
