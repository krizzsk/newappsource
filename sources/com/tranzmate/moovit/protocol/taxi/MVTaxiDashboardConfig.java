package com.tranzmate.moovit.protocol.taxi;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.conf.MVDashboardSection;
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

public class MVTaxiDashboardConfig implements TBase<MVTaxiDashboardConfig, _Fields>, Serializable, Cloneable, Comparable<MVTaxiDashboardConfig> {

    /* renamed from: b */
    public static final C25113c f28536b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28537c = new C25113c("subtitle", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28538d = new C25113c("cta", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28539e = new C25113c("alwaysShow", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f28540f = new C25113c("visibility", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f28541g = new C25113c("host", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f28542h = new C25113c("dashboardDeeplink", (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f28543i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f28544j;
    private byte __isset_bitfield = 0;
    public boolean alwaysShow;
    public String cta;
    public String dashboardDeeplink;
    public MVDashboardSection host;
    private _Fields[] optionals = {_Fields.DASHBOARD_DEEPLINK};
    public String subtitle;
    public String title;
    public MVTaxiVisibility visibility;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        SUBTITLE(2, "subtitle"),
        CTA(3, "cta"),
        ALWAYS_SHOW(4, "alwaysShow"),
        VISIBILITY(5, "visibility"),
        HOST(6, "host"),
        DASHBOARD_DEEPLINK(7, "dashboardDeeplink");
        
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
                    return TITLE;
                case 2:
                    return SUBTITLE;
                case 3:
                    return CTA;
                case 4:
                    return ALWAYS_SHOW;
                case 5:
                    return VISIBILITY;
                case 6:
                    return HOST;
                case 7:
                    return DASHBOARD_DEEPLINK;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiDashboardConfig$a */
    public static class C10692a extends C25239c<MVTaxiDashboardConfig> {
        public C10692a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiDashboardConfig mVTaxiDashboardConfig = (MVTaxiDashboardConfig) tBase;
            mVTaxiDashboardConfig.getClass();
            C25113c cVar = MVTaxiDashboardConfig.f28536b;
            gVar.mo61687K();
            if (mVTaxiDashboardConfig.title != null) {
                gVar.mo61711x(MVTaxiDashboardConfig.f28536b);
                gVar.mo61686J(mVTaxiDashboardConfig.title);
                gVar.mo61712y();
            }
            if (mVTaxiDashboardConfig.subtitle != null) {
                gVar.mo61711x(MVTaxiDashboardConfig.f28537c);
                gVar.mo61686J(mVTaxiDashboardConfig.subtitle);
                gVar.mo61712y();
            }
            if (mVTaxiDashboardConfig.cta != null) {
                gVar.mo61711x(MVTaxiDashboardConfig.f28538d);
                gVar.mo61686J(mVTaxiDashboardConfig.cta);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTaxiDashboardConfig.f28539e);
            gVar.mo61708u(mVTaxiDashboardConfig.alwaysShow);
            gVar.mo61712y();
            if (mVTaxiDashboardConfig.visibility != null) {
                gVar.mo61711x(MVTaxiDashboardConfig.f28540f);
                gVar.mo61678B(mVTaxiDashboardConfig.visibility.getValue());
                gVar.mo61712y();
            }
            if (mVTaxiDashboardConfig.host != null) {
                gVar.mo61711x(MVTaxiDashboardConfig.f28541g);
                gVar.mo61678B(mVTaxiDashboardConfig.host.getValue());
                gVar.mo61712y();
            }
            if (mVTaxiDashboardConfig.dashboardDeeplink != null && mVTaxiDashboardConfig.mo32093h()) {
                gVar.mo61711x(MVTaxiDashboardConfig.f28542h);
                gVar.mo61686J(mVTaxiDashboardConfig.dashboardDeeplink);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiDashboardConfig mVTaxiDashboardConfig = (MVTaxiDashboardConfig) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTaxiDashboardConfig.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiDashboardConfig.title = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiDashboardConfig.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiDashboardConfig.cta = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiDashboardConfig.alwaysShow = gVar.mo61690c();
                            mVTaxiDashboardConfig.mo32099m();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiDashboardConfig.visibility = MVTaxiVisibility.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiDashboardConfig.host = MVDashboardSection.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiDashboardConfig.dashboardDeeplink = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiDashboardConfig$b */
    public static class C10693b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10692a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiDashboardConfig$c */
    public static class C10694c extends C25240d<MVTaxiDashboardConfig> {
        public C10694c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiDashboardConfig mVTaxiDashboardConfig = (MVTaxiDashboardConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiDashboardConfig.mo32097k()) {
                bitSet.set(0);
            }
            if (mVTaxiDashboardConfig.mo32096j()) {
                bitSet.set(1);
            }
            if (mVTaxiDashboardConfig.mo32092g()) {
                bitSet.set(2);
            }
            if (mVTaxiDashboardConfig.mo32091f()) {
                bitSet.set(3);
            }
            if (mVTaxiDashboardConfig.mo32098l()) {
                bitSet.set(4);
            }
            if (mVTaxiDashboardConfig.mo32095i()) {
                bitSet.set(5);
            }
            if (mVTaxiDashboardConfig.mo32093h()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVTaxiDashboardConfig.mo32097k()) {
                jVar.mo61686J(mVTaxiDashboardConfig.title);
            }
            if (mVTaxiDashboardConfig.mo32096j()) {
                jVar.mo61686J(mVTaxiDashboardConfig.subtitle);
            }
            if (mVTaxiDashboardConfig.mo32092g()) {
                jVar.mo61686J(mVTaxiDashboardConfig.cta);
            }
            if (mVTaxiDashboardConfig.mo32091f()) {
                jVar.mo61708u(mVTaxiDashboardConfig.alwaysShow);
            }
            if (mVTaxiDashboardConfig.mo32098l()) {
                jVar.mo61678B(mVTaxiDashboardConfig.visibility.getValue());
            }
            if (mVTaxiDashboardConfig.mo32095i()) {
                jVar.mo61678B(mVTaxiDashboardConfig.host.getValue());
            }
            if (mVTaxiDashboardConfig.mo32093h()) {
                jVar.mo61686J(mVTaxiDashboardConfig.dashboardDeeplink);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiDashboardConfig mVTaxiDashboardConfig = (MVTaxiDashboardConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVTaxiDashboardConfig.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTaxiDashboardConfig.subtitle = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTaxiDashboardConfig.cta = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTaxiDashboardConfig.alwaysShow = jVar.mo61690c();
                mVTaxiDashboardConfig.mo32099m();
            }
            if (T.get(4)) {
                mVTaxiDashboardConfig.visibility = MVTaxiVisibility.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                mVTaxiDashboardConfig.host = MVDashboardSection.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                mVTaxiDashboardConfig.dashboardDeeplink = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiDashboardConfig$d */
    public static class C10695d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10694c(0);
        }
    }

    static {
        new C17394d0("MVTaxiDashboardConfig");
        HashMap hashMap = new HashMap();
        f28543i = hashMap;
        hashMap.put(C25239c.class, new C10693b());
        hashMap.put(C25240d.class, new C10695d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CTA, new FieldMetaData("cta", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ALWAYS_SHOW, new FieldMetaData("alwaysShow", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.VISIBILITY, new FieldMetaData("visibility", (byte) 3, new EnumMetaData(MVTaxiVisibility.class)));
        enumMap.put(_Fields.HOST, new FieldMetaData("host", (byte) 3, new EnumMetaData(MVDashboardSection.class)));
        enumMap.put(_Fields.DASHBOARD_DEEPLINK, new FieldMetaData("dashboardDeeplink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28544j = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiDashboardConfig.class, unmodifiableMap);
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
        ((C25238b) f28543i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28543i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32088a(MVTaxiDashboardConfig mVTaxiDashboardConfig) {
        if (mVTaxiDashboardConfig == null) {
            return false;
        }
        boolean k = mo32097k();
        boolean k2 = mVTaxiDashboardConfig.mo32097k();
        if ((k || k2) && (!k || !k2 || !this.title.equals(mVTaxiDashboardConfig.title))) {
            return false;
        }
        boolean j = mo32096j();
        boolean j2 = mVTaxiDashboardConfig.mo32096j();
        if ((j || j2) && (!j || !j2 || !this.subtitle.equals(mVTaxiDashboardConfig.subtitle))) {
            return false;
        }
        boolean g = mo32092g();
        boolean g2 = mVTaxiDashboardConfig.mo32092g();
        if (((g || g2) && (!g || !g2 || !this.cta.equals(mVTaxiDashboardConfig.cta))) || this.alwaysShow != mVTaxiDashboardConfig.alwaysShow) {
            return false;
        }
        boolean l = mo32098l();
        boolean l2 = mVTaxiDashboardConfig.mo32098l();
        if ((l || l2) && (!l || !l2 || !this.visibility.equals(mVTaxiDashboardConfig.visibility))) {
            return false;
        }
        boolean i = mo32095i();
        boolean i2 = mVTaxiDashboardConfig.mo32095i();
        if ((i || i2) && (!i || !i2 || !this.host.equals(mVTaxiDashboardConfig.host))) {
            return false;
        }
        boolean h = mo32093h();
        boolean h2 = mVTaxiDashboardConfig.mo32093h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.dashboardDeeplink.equals(mVTaxiDashboardConfig.dashboardDeeplink)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiDashboardConfig mVTaxiDashboardConfig = (MVTaxiDashboardConfig) obj;
        if (!getClass().equals(mVTaxiDashboardConfig.getClass())) {
            return getClass().getName().compareTo(mVTaxiDashboardConfig.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32097k()).compareTo(Boolean.valueOf(mVTaxiDashboardConfig.mo32097k()));
        if (compareTo2 != 0 || ((mo32097k() && (compareTo2 = this.title.compareTo(mVTaxiDashboardConfig.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32096j()).compareTo(Boolean.valueOf(mVTaxiDashboardConfig.mo32096j()))) != 0 || ((mo32096j() && (compareTo2 = this.subtitle.compareTo(mVTaxiDashboardConfig.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo32092g()).compareTo(Boolean.valueOf(mVTaxiDashboardConfig.mo32092g()))) != 0 || ((mo32092g() && (compareTo2 = this.cta.compareTo(mVTaxiDashboardConfig.cta)) != 0) || (compareTo2 = Boolean.valueOf(mo32091f()).compareTo(Boolean.valueOf(mVTaxiDashboardConfig.mo32091f()))) != 0 || ((mo32091f() && (compareTo2 = C25082a.m62848l(this.alwaysShow, mVTaxiDashboardConfig.alwaysShow)) != 0) || (compareTo2 = Boolean.valueOf(mo32098l()).compareTo(Boolean.valueOf(mVTaxiDashboardConfig.mo32098l()))) != 0 || ((mo32098l() && (compareTo2 = this.visibility.compareTo(mVTaxiDashboardConfig.visibility)) != 0) || (compareTo2 = Boolean.valueOf(mo32095i()).compareTo(Boolean.valueOf(mVTaxiDashboardConfig.mo32095i()))) != 0 || ((mo32095i() && (compareTo2 = this.host.compareTo(mVTaxiDashboardConfig.host)) != 0) || (compareTo2 = Boolean.valueOf(mo32093h()).compareTo(Boolean.valueOf(mVTaxiDashboardConfig.mo32093h()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo32093h() || (compareTo = this.dashboardDeeplink.compareTo(mVTaxiDashboardConfig.dashboardDeeplink)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiDashboardConfig)) {
            return mo32088a((MVTaxiDashboardConfig) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32091f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo32092g() {
        return this.cta != null;
    }

    /* renamed from: h */
    public final boolean mo32093h() {
        return this.dashboardDeeplink != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32095i() {
        return this.host != null;
    }

    /* renamed from: j */
    public final boolean mo32096j() {
        return this.subtitle != null;
    }

    /* renamed from: k */
    public final boolean mo32097k() {
        return this.title != null;
    }

    /* renamed from: l */
    public final boolean mo32098l() {
        return this.visibility != null;
    }

    /* renamed from: m */
    public final void mo32099m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiDashboardConfig(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("subtitle:");
        String str2 = this.subtitle;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("cta:");
        String str3 = this.cta;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("alwaysShow:");
        C13555b.m33977q(n, this.alwaysShow, ", ", "visibility:");
        MVTaxiVisibility mVTaxiVisibility = this.visibility;
        if (mVTaxiVisibility == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTaxiVisibility);
        }
        n.append(", ");
        n.append("host:");
        MVDashboardSection mVDashboardSection = this.host;
        if (mVDashboardSection == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDashboardSection);
        }
        if (mo32093h()) {
            n.append(", ");
            n.append("dashboardDeeplink:");
            String str4 = this.dashboardDeeplink;
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
