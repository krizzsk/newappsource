package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.usebutton.sdk.internal.WebViewActivity;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVExternalWebPage implements TBase<MVExternalWebPage, _Fields>, Serializable, Cloneable, Comparable<MVExternalWebPage> {

    /* renamed from: b */
    public static final C25113c f30417b = new C25113c("pageId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30418c = new C25113c("image", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30419d = new C25113c(WebViewActivity.EXTRA_LINK, (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30420e = new C25113c("caption", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30421f = new C25113c("lastUpdated", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f30422g = new C25113c("embedded", (byte) 2, 6);

    /* renamed from: h */
    public static final C25113c f30423h = new C25113c("type", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f30424i = new C25113c("backgroundColor", (byte) 8, 8);

    /* renamed from: j */
    public static final HashMap f30425j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f30426k;
    private byte __isset_bitfield = 0;
    public int backgroundColor;
    public String caption;
    public boolean embedded;
    public int image;
    public long lastUpdated;
    public String link;
    private _Fields[] optionals = {_Fields.IMAGE, _Fields.BACKGROUND_COLOR};
    public String pageId;
    public MVExternalWebPageType type;

    public enum _Fields implements C25085c {
        PAGE_ID(1, "pageId"),
        IMAGE(2, "image"),
        LINK(3, WebViewActivity.EXTRA_LINK),
        CAPTION(4, "caption"),
        LAST_UPDATED(5, "lastUpdated"),
        EMBEDDED(6, "embedded"),
        TYPE(7, "type"),
        BACKGROUND_COLOR(8, "backgroundColor");
        
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
                    return PAGE_ID;
                case 2:
                    return IMAGE;
                case 3:
                    return LINK;
                case 4:
                    return CAPTION;
                case 5:
                    return LAST_UPDATED;
                case 6:
                    return EMBEDDED;
                case 7:
                    return TYPE;
                case 8:
                    return BACKGROUND_COLOR;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalWebPage$a */
    public static class C11812a extends C25239c<MVExternalWebPage> {
        public C11812a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalWebPage mVExternalWebPage = (MVExternalWebPage) tBase;
            mVExternalWebPage.getClass();
            C25113c cVar = MVExternalWebPage.f30417b;
            gVar.mo61687K();
            if (mVExternalWebPage.pageId != null) {
                gVar.mo61711x(MVExternalWebPage.f30417b);
                gVar.mo61686J(mVExternalWebPage.pageId);
                gVar.mo61712y();
            }
            if (mVExternalWebPage.mo35137i()) {
                gVar.mo61711x(MVExternalWebPage.f30418c);
                gVar.mo61678B(mVExternalWebPage.image);
                gVar.mo61712y();
            }
            if (mVExternalWebPage.link != null) {
                gVar.mo61711x(MVExternalWebPage.f30419d);
                gVar.mo61686J(mVExternalWebPage.link);
                gVar.mo61712y();
            }
            if (mVExternalWebPage.caption != null) {
                gVar.mo61711x(MVExternalWebPage.f30420e);
                gVar.mo61686J(mVExternalWebPage.caption);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVExternalWebPage.f30421f);
            gVar.mo61679C(mVExternalWebPage.lastUpdated);
            gVar.mo61712y();
            gVar.mo61711x(MVExternalWebPage.f30422g);
            gVar.mo61708u(mVExternalWebPage.embedded);
            gVar.mo61712y();
            if (mVExternalWebPage.type != null) {
                gVar.mo61711x(MVExternalWebPage.f30423h);
                gVar.mo61678B(mVExternalWebPage.type.getValue());
                gVar.mo61712y();
            }
            if (mVExternalWebPage.mo35133f()) {
                gVar.mo61711x(MVExternalWebPage.f30424i);
                gVar.mo61678B(mVExternalWebPage.backgroundColor);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalWebPage mVExternalWebPage = (MVExternalWebPage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVExternalWebPage.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalWebPage.pageId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalWebPage.image = gVar.mo61696i();
                            mVExternalWebPage.mo35144q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalWebPage.link = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalWebPage.caption = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalWebPage.lastUpdated = gVar.mo61697j();
                            mVExternalWebPage.mo35145r();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalWebPage.embedded = gVar.mo61690c();
                            mVExternalWebPage.mo35143p();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalWebPage.type = MVExternalWebPageType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVExternalWebPage.backgroundColor = gVar.mo61696i();
                            mVExternalWebPage.mo35142o();
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalWebPage$b */
    public static class C11813b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11812a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalWebPage$c */
    public static class C11814c extends C25240d<MVExternalWebPage> {
        public C11814c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalWebPage mVExternalWebPage = (MVExternalWebPage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVExternalWebPage.mo35140l()) {
                bitSet.set(0);
            }
            if (mVExternalWebPage.mo35137i()) {
                bitSet.set(1);
            }
            if (mVExternalWebPage.mo35139k()) {
                bitSet.set(2);
            }
            if (mVExternalWebPage.mo35134g()) {
                bitSet.set(3);
            }
            if (mVExternalWebPage.mo35138j()) {
                bitSet.set(4);
            }
            if (mVExternalWebPage.mo35135h()) {
                bitSet.set(5);
            }
            if (mVExternalWebPage.mo35141m()) {
                bitSet.set(6);
            }
            if (mVExternalWebPage.mo35133f()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVExternalWebPage.mo35140l()) {
                jVar.mo61686J(mVExternalWebPage.pageId);
            }
            if (mVExternalWebPage.mo35137i()) {
                jVar.mo61678B(mVExternalWebPage.image);
            }
            if (mVExternalWebPage.mo35139k()) {
                jVar.mo61686J(mVExternalWebPage.link);
            }
            if (mVExternalWebPage.mo35134g()) {
                jVar.mo61686J(mVExternalWebPage.caption);
            }
            if (mVExternalWebPage.mo35138j()) {
                jVar.mo61679C(mVExternalWebPage.lastUpdated);
            }
            if (mVExternalWebPage.mo35135h()) {
                jVar.mo61708u(mVExternalWebPage.embedded);
            }
            if (mVExternalWebPage.mo35141m()) {
                jVar.mo61678B(mVExternalWebPage.type.getValue());
            }
            if (mVExternalWebPage.mo35133f()) {
                jVar.mo61678B(mVExternalWebPage.backgroundColor);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalWebPage mVExternalWebPage = (MVExternalWebPage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVExternalWebPage.pageId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVExternalWebPage.image = jVar.mo61696i();
                mVExternalWebPage.mo35144q();
            }
            if (T.get(2)) {
                mVExternalWebPage.link = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVExternalWebPage.caption = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVExternalWebPage.lastUpdated = jVar.mo61697j();
                mVExternalWebPage.mo35145r();
            }
            if (T.get(5)) {
                mVExternalWebPage.embedded = jVar.mo61690c();
                mVExternalWebPage.mo35143p();
            }
            if (T.get(6)) {
                mVExternalWebPage.type = MVExternalWebPageType.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                mVExternalWebPage.backgroundColor = jVar.mo61696i();
                mVExternalWebPage.mo35142o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExternalWebPage$d */
    public static class C11815d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11814c(0);
        }
    }

    static {
        new C17394d0("MVExternalWebPage");
        HashMap hashMap = new HashMap();
        f30425j = hashMap;
        hashMap.put(C25239c.class, new C11813b());
        hashMap.put(C25240d.class, new C11815d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAGE_ID, new FieldMetaData("pageId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.LINK, new FieldMetaData(WebViewActivity.EXTRA_LINK, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CAPTION, new FieldMetaData("caption", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LAST_UPDATED, new FieldMetaData("lastUpdated", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.EMBEDDED, new FieldMetaData("embedded", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVExternalWebPageType.class)));
        enumMap.put(_Fields.BACKGROUND_COLOR, new FieldMetaData("backgroundColor", (byte) 2, new FieldValueMetaData((byte) 8, "Color")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30426k = unmodifiableMap;
        FieldMetaData.m61947a(MVExternalWebPage.class, unmodifiableMap);
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
        ((C25238b) f30425j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30425j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVExternalWebPage mVExternalWebPage = (MVExternalWebPage) obj;
        if (!getClass().equals(mVExternalWebPage.getClass())) {
            return getClass().getName().compareTo(mVExternalWebPage.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35140l()).compareTo(Boolean.valueOf(mVExternalWebPage.mo35140l()));
        if (compareTo != 0 || ((mo35140l() && (compareTo = this.pageId.compareTo(mVExternalWebPage.pageId)) != 0) || (compareTo = Boolean.valueOf(mo35137i()).compareTo(Boolean.valueOf(mVExternalWebPage.mo35137i()))) != 0 || ((mo35137i() && (compareTo = C25082a.m62839c(this.image, mVExternalWebPage.image)) != 0) || (compareTo = Boolean.valueOf(mo35139k()).compareTo(Boolean.valueOf(mVExternalWebPage.mo35139k()))) != 0 || ((mo35139k() && (compareTo = this.link.compareTo(mVExternalWebPage.link)) != 0) || (compareTo = Boolean.valueOf(mo35134g()).compareTo(Boolean.valueOf(mVExternalWebPage.mo35134g()))) != 0 || ((mo35134g() && (compareTo = this.caption.compareTo(mVExternalWebPage.caption)) != 0) || (compareTo = Boolean.valueOf(mo35138j()).compareTo(Boolean.valueOf(mVExternalWebPage.mo35138j()))) != 0 || ((mo35138j() && (compareTo = C25082a.m62840d(this.lastUpdated, mVExternalWebPage.lastUpdated)) != 0) || (compareTo = Boolean.valueOf(mo35135h()).compareTo(Boolean.valueOf(mVExternalWebPage.mo35135h()))) != 0 || ((mo35135h() && (compareTo = C25082a.m62848l(this.embedded, mVExternalWebPage.embedded)) != 0) || (compareTo = Boolean.valueOf(mo35141m()).compareTo(Boolean.valueOf(mVExternalWebPage.mo35141m()))) != 0 || ((mo35141m() && (compareTo = this.type.compareTo(mVExternalWebPage.type)) != 0) || (compareTo = Boolean.valueOf(mo35133f()).compareTo(Boolean.valueOf(mVExternalWebPage.mo35133f()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo35133f() || (c = C25082a.m62839c(this.backgroundColor, mVExternalWebPage.backgroundColor)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVExternalWebPage)) {
            return false;
        }
        MVExternalWebPage mVExternalWebPage = (MVExternalWebPage) obj;
        boolean l = mo35140l();
        boolean l2 = mVExternalWebPage.mo35140l();
        if ((l || l2) && (!l || !l2 || !this.pageId.equals(mVExternalWebPage.pageId))) {
            return false;
        }
        boolean i = mo35137i();
        boolean i2 = mVExternalWebPage.mo35137i();
        if ((i || i2) && (!i || !i2 || this.image != mVExternalWebPage.image)) {
            return false;
        }
        boolean k = mo35139k();
        boolean k2 = mVExternalWebPage.mo35139k();
        if ((k || k2) && (!k || !k2 || !this.link.equals(mVExternalWebPage.link))) {
            return false;
        }
        boolean g = mo35134g();
        boolean g2 = mVExternalWebPage.mo35134g();
        if (((g || g2) && (!g || !g2 || !this.caption.equals(mVExternalWebPage.caption))) || this.lastUpdated != mVExternalWebPage.lastUpdated || this.embedded != mVExternalWebPage.embedded) {
            return false;
        }
        boolean m = mo35141m();
        boolean m2 = mVExternalWebPage.mo35141m();
        if ((m || m2) && (!m || !m2 || !this.type.equals(mVExternalWebPage.type))) {
            return false;
        }
        boolean f = mo35133f();
        boolean f2 = mVExternalWebPage.mo35133f();
        if ((f || f2) && (!f || !f2 || this.backgroundColor != mVExternalWebPage.backgroundColor)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35133f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo35134g() {
        return this.caption != null;
    }

    /* renamed from: h */
    public final boolean mo35135h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35137i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo35138j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo35139k() {
        return this.link != null;
    }

    /* renamed from: l */
    public final boolean mo35140l() {
        return this.pageId != null;
    }

    /* renamed from: m */
    public final boolean mo35141m() {
        return this.type != null;
    }

    /* renamed from: o */
    public final void mo35142o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: p */
    public final void mo35143p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: q */
    public final void mo35144q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: r */
    public final void mo35145r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVExternalWebPage(", "pageId:");
        String str = this.pageId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo35137i()) {
            n.append(", ");
            n.append("image:");
            n.append(this.image);
        }
        n.append(", ");
        n.append("link:");
        String str2 = this.link;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("caption:");
        String str3 = this.caption;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("lastUpdated:");
        C25541a.m63889t(n, this.lastUpdated, ", ", "embedded:");
        C13555b.m33977q(n, this.embedded, ", ", "type:");
        MVExternalWebPageType mVExternalWebPageType = this.type;
        if (mVExternalWebPageType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVExternalWebPageType);
        }
        if (mo35133f()) {
            n.append(", ");
            n.append("backgroundColor:");
            n.append(this.backgroundColor);
        }
        n.append(")");
        return n.toString();
    }
}
