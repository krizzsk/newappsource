package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVInfoBoxData;
import com.tranzmate.moovit.protocol.common.MVPriceInfo;
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

public class MVPaymentAccountSubscription implements TBase<MVPaymentAccountSubscription, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountSubscription> {

    /* renamed from: b */
    public static final C25113c f27453b = new C25113c("identifier", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27454c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27455d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27456e = new C25113c("priceInfo", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27457f = new C25113c("progress", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f27458g = new C25113c("disclaimer", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f27459h = new C25113c("detailsHtml", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f27460i = new C25113c("startTime", (byte) 10, 8);

    /* renamed from: j */
    public static final HashMap f27461j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f27462k;
    private byte __isset_bitfield = 0;
    public String detailsHtml;
    public MVInfoBoxData disclaimer;
    public String identifier;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.SUBTITLE, _Fields.PRICE_INFO, _Fields.PROGRESS, _Fields.DISCLAIMER, _Fields.DETAILS_HTML, _Fields.START_TIME};
    public MVPriceInfo priceInfo;
    public MVPaymentAccountSubscriptionProgress progress;
    public long startTime;
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        IDENTIFIER(1, "identifier"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        PRICE_INFO(4, "priceInfo"),
        PROGRESS(5, "progress"),
        DISCLAIMER(6, "disclaimer"),
        DETAILS_HTML(7, "detailsHtml"),
        START_TIME(8, "startTime");
        
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
                    return IDENTIFIER;
                case 2:
                    return TITLE;
                case 3:
                    return SUBTITLE;
                case 4:
                    return PRICE_INFO;
                case 5:
                    return PROGRESS;
                case 6:
                    return DISCLAIMER;
                case 7:
                    return DETAILS_HTML;
                case 8:
                    return START_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscription$a */
    public static class C9881a extends C25239c<MVPaymentAccountSubscription> {
        public C9881a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscription mVPaymentAccountSubscription = (MVPaymentAccountSubscription) tBase;
            MVPriceInfo mVPriceInfo = mVPaymentAccountSubscription.priceInfo;
            if (mVPriceInfo != null) {
                mVPriceInfo.mo26354i();
            }
            C25113c cVar = MVPaymentAccountSubscription.f27453b;
            gVar.mo61687K();
            if (mVPaymentAccountSubscription.identifier != null) {
                gVar.mo61711x(MVPaymentAccountSubscription.f27453b);
                gVar.mo61686J(mVPaymentAccountSubscription.identifier);
                gVar.mo61712y();
            }
            if (mVPaymentAccountSubscription.title != null && mVPaymentAccountSubscription.mo30189m()) {
                gVar.mo61711x(MVPaymentAccountSubscription.f27454c);
                gVar.mo61686J(mVPaymentAccountSubscription.title);
                gVar.mo61712y();
            }
            if (mVPaymentAccountSubscription.subtitle != null && mVPaymentAccountSubscription.mo30188l()) {
                gVar.mo61711x(MVPaymentAccountSubscription.f27455d);
                gVar.mo61686J(mVPaymentAccountSubscription.subtitle);
                gVar.mo61712y();
            }
            if (mVPaymentAccountSubscription.priceInfo != null && mVPaymentAccountSubscription.mo30185i()) {
                gVar.mo61711x(MVPaymentAccountSubscription.f27456e);
                mVPaymentAccountSubscription.priceInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAccountSubscription.progress != null && mVPaymentAccountSubscription.mo30186j()) {
                gVar.mo61711x(MVPaymentAccountSubscription.f27457f);
                mVPaymentAccountSubscription.progress.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAccountSubscription.disclaimer != null && mVPaymentAccountSubscription.mo30182g()) {
                gVar.mo61711x(MVPaymentAccountSubscription.f27458g);
                mVPaymentAccountSubscription.disclaimer.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAccountSubscription.detailsHtml != null && mVPaymentAccountSubscription.mo30181f()) {
                gVar.mo61711x(MVPaymentAccountSubscription.f27459h);
                gVar.mo61686J(mVPaymentAccountSubscription.detailsHtml);
                gVar.mo61712y();
            }
            if (mVPaymentAccountSubscription.mo30187k()) {
                gVar.mo61711x(MVPaymentAccountSubscription.f27460i);
                gVar.mo61679C(mVPaymentAccountSubscription.startTime);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscription mVPaymentAccountSubscription = (MVPaymentAccountSubscription) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPriceInfo mVPriceInfo = mVPaymentAccountSubscription.priceInfo;
                    if (mVPriceInfo != null) {
                        mVPriceInfo.mo26354i();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountSubscription.identifier = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountSubscription.title = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountSubscription.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPriceInfo mVPriceInfo2 = new MVPriceInfo();
                            mVPaymentAccountSubscription.priceInfo = mVPriceInfo2;
                            mVPriceInfo2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentAccountSubscriptionProgress mVPaymentAccountSubscriptionProgress = new MVPaymentAccountSubscriptionProgress();
                            mVPaymentAccountSubscription.progress = mVPaymentAccountSubscriptionProgress;
                            mVPaymentAccountSubscriptionProgress.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVInfoBoxData mVInfoBoxData = new MVInfoBoxData();
                            mVPaymentAccountSubscription.disclaimer = mVInfoBoxData;
                            mVInfoBoxData.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountSubscription.detailsHtml = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountSubscription.startTime = gVar.mo61697j();
                            mVPaymentAccountSubscription.mo30190o();
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscription$b */
    public static class C9882b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9881a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscription$c */
    public static class C9883c extends C25240d<MVPaymentAccountSubscription> {
        public C9883c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscription mVPaymentAccountSubscription = (MVPaymentAccountSubscription) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountSubscription.mo30183h()) {
                bitSet.set(0);
            }
            if (mVPaymentAccountSubscription.mo30189m()) {
                bitSet.set(1);
            }
            if (mVPaymentAccountSubscription.mo30188l()) {
                bitSet.set(2);
            }
            if (mVPaymentAccountSubscription.mo30185i()) {
                bitSet.set(3);
            }
            if (mVPaymentAccountSubscription.mo30186j()) {
                bitSet.set(4);
            }
            if (mVPaymentAccountSubscription.mo30182g()) {
                bitSet.set(5);
            }
            if (mVPaymentAccountSubscription.mo30181f()) {
                bitSet.set(6);
            }
            if (mVPaymentAccountSubscription.mo30187k()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVPaymentAccountSubscription.mo30183h()) {
                jVar.mo61686J(mVPaymentAccountSubscription.identifier);
            }
            if (mVPaymentAccountSubscription.mo30189m()) {
                jVar.mo61686J(mVPaymentAccountSubscription.title);
            }
            if (mVPaymentAccountSubscription.mo30188l()) {
                jVar.mo61686J(mVPaymentAccountSubscription.subtitle);
            }
            if (mVPaymentAccountSubscription.mo30185i()) {
                mVPaymentAccountSubscription.priceInfo.mo25202X0(jVar);
            }
            if (mVPaymentAccountSubscription.mo30186j()) {
                mVPaymentAccountSubscription.progress.mo25202X0(jVar);
            }
            if (mVPaymentAccountSubscription.mo30182g()) {
                mVPaymentAccountSubscription.disclaimer.mo25202X0(jVar);
            }
            if (mVPaymentAccountSubscription.mo30181f()) {
                jVar.mo61686J(mVPaymentAccountSubscription.detailsHtml);
            }
            if (mVPaymentAccountSubscription.mo30187k()) {
                jVar.mo61679C(mVPaymentAccountSubscription.startTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscription mVPaymentAccountSubscription = (MVPaymentAccountSubscription) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVPaymentAccountSubscription.identifier = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentAccountSubscription.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPaymentAccountSubscription.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVPriceInfo mVPriceInfo = new MVPriceInfo();
                mVPaymentAccountSubscription.priceInfo = mVPriceInfo;
                mVPriceInfo.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVPaymentAccountSubscriptionProgress mVPaymentAccountSubscriptionProgress = new MVPaymentAccountSubscriptionProgress();
                mVPaymentAccountSubscription.progress = mVPaymentAccountSubscriptionProgress;
                mVPaymentAccountSubscriptionProgress.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVInfoBoxData mVInfoBoxData = new MVInfoBoxData();
                mVPaymentAccountSubscription.disclaimer = mVInfoBoxData;
                mVInfoBoxData.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVPaymentAccountSubscription.detailsHtml = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVPaymentAccountSubscription.startTime = jVar.mo61697j();
                mVPaymentAccountSubscription.mo30190o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscription$d */
    public static class C9884d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9883c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountSubscription");
        HashMap hashMap = new HashMap();
        f27461j = hashMap;
        hashMap.put(C25239c.class, new C9882b());
        hashMap.put(C25240d.class, new C9884d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IDENTIFIER, new FieldMetaData("identifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE_INFO, new FieldMetaData("priceInfo", (byte) 2, new StructMetaData(MVPriceInfo.class)));
        enumMap.put(_Fields.PROGRESS, new FieldMetaData("progress", (byte) 2, new StructMetaData(MVPaymentAccountSubscriptionProgress.class)));
        enumMap.put(_Fields.DISCLAIMER, new FieldMetaData("disclaimer", (byte) 2, new StructMetaData(MVInfoBoxData.class)));
        enumMap.put(_Fields.DETAILS_HTML, new FieldMetaData("detailsHtml", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.START_TIME, new FieldMetaData("startTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27462k = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountSubscription.class, unmodifiableMap);
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
        ((C25238b) f27461j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27461j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVPaymentAccountSubscription mVPaymentAccountSubscription = (MVPaymentAccountSubscription) obj;
        if (!getClass().equals(mVPaymentAccountSubscription.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountSubscription.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30183h()).compareTo(Boolean.valueOf(mVPaymentAccountSubscription.mo30183h()));
        if (compareTo != 0 || ((mo30183h() && (compareTo = this.identifier.compareTo(mVPaymentAccountSubscription.identifier)) != 0) || (compareTo = Boolean.valueOf(mo30189m()).compareTo(Boolean.valueOf(mVPaymentAccountSubscription.mo30189m()))) != 0 || ((mo30189m() && (compareTo = this.title.compareTo(mVPaymentAccountSubscription.title)) != 0) || (compareTo = Boolean.valueOf(mo30188l()).compareTo(Boolean.valueOf(mVPaymentAccountSubscription.mo30188l()))) != 0 || ((mo30188l() && (compareTo = this.subtitle.compareTo(mVPaymentAccountSubscription.subtitle)) != 0) || (compareTo = Boolean.valueOf(mo30185i()).compareTo(Boolean.valueOf(mVPaymentAccountSubscription.mo30185i()))) != 0 || ((mo30185i() && (compareTo = this.priceInfo.compareTo(mVPaymentAccountSubscription.priceInfo)) != 0) || (compareTo = Boolean.valueOf(mo30186j()).compareTo(Boolean.valueOf(mVPaymentAccountSubscription.mo30186j()))) != 0 || ((mo30186j() && (compareTo = this.progress.compareTo(mVPaymentAccountSubscription.progress)) != 0) || (compareTo = Boolean.valueOf(mo30182g()).compareTo(Boolean.valueOf(mVPaymentAccountSubscription.mo30182g()))) != 0 || ((mo30182g() && (compareTo = this.disclaimer.compareTo(mVPaymentAccountSubscription.disclaimer)) != 0) || (compareTo = Boolean.valueOf(mo30181f()).compareTo(Boolean.valueOf(mVPaymentAccountSubscription.mo30181f()))) != 0 || ((mo30181f() && (compareTo = this.detailsHtml.compareTo(mVPaymentAccountSubscription.detailsHtml)) != 0) || (compareTo = Boolean.valueOf(mo30187k()).compareTo(Boolean.valueOf(mVPaymentAccountSubscription.mo30187k()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo30187k() || (d = C25082a.m62840d(this.startTime, mVPaymentAccountSubscription.startTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentAccountSubscription)) {
            return false;
        }
        MVPaymentAccountSubscription mVPaymentAccountSubscription = (MVPaymentAccountSubscription) obj;
        boolean h = mo30183h();
        boolean h2 = mVPaymentAccountSubscription.mo30183h();
        if ((h || h2) && (!h || !h2 || !this.identifier.equals(mVPaymentAccountSubscription.identifier))) {
            return false;
        }
        boolean m = mo30189m();
        boolean m2 = mVPaymentAccountSubscription.mo30189m();
        if ((m || m2) && (!m || !m2 || !this.title.equals(mVPaymentAccountSubscription.title))) {
            return false;
        }
        boolean l = mo30188l();
        boolean l2 = mVPaymentAccountSubscription.mo30188l();
        if ((l || l2) && (!l || !l2 || !this.subtitle.equals(mVPaymentAccountSubscription.subtitle))) {
            return false;
        }
        boolean i = mo30185i();
        boolean i2 = mVPaymentAccountSubscription.mo30185i();
        if ((i || i2) && (!i || !i2 || !this.priceInfo.mo26347a(mVPaymentAccountSubscription.priceInfo))) {
            return false;
        }
        boolean j = mo30186j();
        boolean j2 = mVPaymentAccountSubscription.mo30186j();
        if ((j || j2) && (!j || !j2 || !this.progress.mo30193a(mVPaymentAccountSubscription.progress))) {
            return false;
        }
        boolean g = mo30182g();
        boolean g2 = mVPaymentAccountSubscription.mo30182g();
        if ((g || g2) && (!g || !g2 || !this.disclaimer.mo26280a(mVPaymentAccountSubscription.disclaimer))) {
            return false;
        }
        boolean f = mo30181f();
        boolean f2 = mVPaymentAccountSubscription.mo30181f();
        if ((f || f2) && (!f || !f2 || !this.detailsHtml.equals(mVPaymentAccountSubscription.detailsHtml))) {
            return false;
        }
        boolean k = mo30187k();
        boolean k2 = mVPaymentAccountSubscription.mo30187k();
        if ((k || k2) && (!k || !k2 || this.startTime != mVPaymentAccountSubscription.startTime)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30181f() {
        return this.detailsHtml != null;
    }

    /* renamed from: g */
    public final boolean mo30182g() {
        return this.disclaimer != null;
    }

    /* renamed from: h */
    public final boolean mo30183h() {
        return this.identifier != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30185i() {
        return this.priceInfo != null;
    }

    /* renamed from: j */
    public final boolean mo30186j() {
        return this.progress != null;
    }

    /* renamed from: k */
    public final boolean mo30187k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final boolean mo30188l() {
        return this.subtitle != null;
    }

    /* renamed from: m */
    public final boolean mo30189m() {
        return this.title != null;
    }

    /* renamed from: o */
    public final void mo30190o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAccountSubscription(", "identifier:");
        String str = this.identifier;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30189m()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo30188l()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo30185i()) {
            n.append(", ");
            n.append("priceInfo:");
            MVPriceInfo mVPriceInfo = this.priceInfo;
            if (mVPriceInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPriceInfo);
            }
        }
        if (mo30186j()) {
            n.append(", ");
            n.append("progress:");
            MVPaymentAccountSubscriptionProgress mVPaymentAccountSubscriptionProgress = this.progress;
            if (mVPaymentAccountSubscriptionProgress == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentAccountSubscriptionProgress);
            }
        }
        if (mo30182g()) {
            n.append(", ");
            n.append("disclaimer:");
            MVInfoBoxData mVInfoBoxData = this.disclaimer;
            if (mVInfoBoxData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVInfoBoxData);
            }
        }
        if (mo30181f()) {
            n.append(", ");
            n.append("detailsHtml:");
            String str4 = this.detailsHtml;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo30187k()) {
            n.append(", ");
            n.append("startTime:");
            n.append(this.startTime);
        }
        n.append(")");
        return n.toString();
    }
}
