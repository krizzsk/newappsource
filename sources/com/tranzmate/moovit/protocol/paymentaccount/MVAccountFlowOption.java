package com.tranzmate.moovit.protocol.paymentaccount;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVAccountFlowOption implements TBase<MVAccountFlowOption, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowOption> {

    /* renamed from: b */
    public static final C25113c f26936b = new C25113c("optionId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26937c = new C25113c("icon", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26938d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26939e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26940f = new C25113c("confirmation", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f26941g = new C25113c("priceInfo", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f26942h = new C25113c("descriptionHtml", (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f26943i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f26944j;
    public MVAccountFlowConfirmation confirmation;
    public String descriptionHtml;
    public MVImageReferenceWithParams icon;
    public String optionId;
    private _Fields[] optionals = {_Fields.ICON, _Fields.TITLE, _Fields.SUBTITLE, _Fields.CONFIRMATION, _Fields.PRICE_INFO, _Fields.DESCRIPTION_HTML};
    public MVPriceInfo priceInfo;
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        OPTION_ID(1, "optionId"),
        ICON(2, "icon"),
        TITLE(3, "title"),
        SUBTITLE(4, "subtitle"),
        CONFIRMATION(5, "confirmation"),
        PRICE_INFO(6, "priceInfo"),
        DESCRIPTION_HTML(7, "descriptionHtml");
        
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
                    return OPTION_ID;
                case 2:
                    return ICON;
                case 3:
                    return TITLE;
                case 4:
                    return SUBTITLE;
                case 5:
                    return CONFIRMATION;
                case 6:
                    return PRICE_INFO;
                case 7:
                    return DESCRIPTION_HTML;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOption$a */
    public static class C9494a extends C25239c<MVAccountFlowOption> {
        public C9494a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOption mVAccountFlowOption = (MVAccountFlowOption) tBase;
            MVAccountFlowConfirmation mVAccountFlowConfirmation = mVAccountFlowOption.confirmation;
            MVPriceInfo mVPriceInfo = mVAccountFlowOption.priceInfo;
            if (mVPriceInfo != null) {
                mVPriceInfo.mo26354i();
            }
            C25113c cVar = MVAccountFlowOption.f26936b;
            gVar.mo61687K();
            if (mVAccountFlowOption.optionId != null) {
                gVar.mo61711x(MVAccountFlowOption.f26936b);
                gVar.mo61686J(mVAccountFlowOption.optionId);
                gVar.mo61712y();
            }
            if (mVAccountFlowOption.icon != null && mVAccountFlowOption.mo29334h()) {
                gVar.mo61711x(MVAccountFlowOption.f26937c);
                mVAccountFlowOption.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccountFlowOption.title != null && mVAccountFlowOption.mo29339l()) {
                gVar.mo61711x(MVAccountFlowOption.f26938d);
                gVar.mo61686J(mVAccountFlowOption.title);
                gVar.mo61712y();
            }
            if (mVAccountFlowOption.subtitle != null && mVAccountFlowOption.mo29338k()) {
                gVar.mo61711x(MVAccountFlowOption.f26939e);
                gVar.mo61686J(mVAccountFlowOption.subtitle);
                gVar.mo61712y();
            }
            if (mVAccountFlowOption.confirmation != null && mVAccountFlowOption.mo29332f()) {
                gVar.mo61711x(MVAccountFlowOption.f26940f);
                mVAccountFlowOption.confirmation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccountFlowOption.priceInfo != null && mVAccountFlowOption.mo29337j()) {
                gVar.mo61711x(MVAccountFlowOption.f26941g);
                mVAccountFlowOption.priceInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccountFlowOption.descriptionHtml != null && mVAccountFlowOption.mo29333g()) {
                gVar.mo61711x(MVAccountFlowOption.f26942h);
                gVar.mo61686J(mVAccountFlowOption.descriptionHtml);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOption mVAccountFlowOption = (MVAccountFlowOption) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVAccountFlowConfirmation mVAccountFlowConfirmation = mVAccountFlowOption.confirmation;
                    MVPriceInfo mVPriceInfo = mVAccountFlowOption.priceInfo;
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
                            mVAccountFlowOption.optionId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVAccountFlowOption.icon = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowOption.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowOption.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVAccountFlowConfirmation mVAccountFlowConfirmation2 = new MVAccountFlowConfirmation();
                            mVAccountFlowOption.confirmation = mVAccountFlowConfirmation2;
                            mVAccountFlowConfirmation2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPriceInfo mVPriceInfo2 = new MVPriceInfo();
                            mVAccountFlowOption.priceInfo = mVPriceInfo2;
                            mVPriceInfo2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowOption.descriptionHtml = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOption$b */
    public static class C9495b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9494a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOption$c */
    public static class C9496c extends C25240d<MVAccountFlowOption> {
        public C9496c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOption mVAccountFlowOption = (MVAccountFlowOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowOption.mo29336i()) {
                bitSet.set(0);
            }
            if (mVAccountFlowOption.mo29334h()) {
                bitSet.set(1);
            }
            if (mVAccountFlowOption.mo29339l()) {
                bitSet.set(2);
            }
            if (mVAccountFlowOption.mo29338k()) {
                bitSet.set(3);
            }
            if (mVAccountFlowOption.mo29332f()) {
                bitSet.set(4);
            }
            if (mVAccountFlowOption.mo29337j()) {
                bitSet.set(5);
            }
            if (mVAccountFlowOption.mo29333g()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVAccountFlowOption.mo29336i()) {
                jVar.mo61686J(mVAccountFlowOption.optionId);
            }
            if (mVAccountFlowOption.mo29334h()) {
                mVAccountFlowOption.icon.mo25202X0(jVar);
            }
            if (mVAccountFlowOption.mo29339l()) {
                jVar.mo61686J(mVAccountFlowOption.title);
            }
            if (mVAccountFlowOption.mo29338k()) {
                jVar.mo61686J(mVAccountFlowOption.subtitle);
            }
            if (mVAccountFlowOption.mo29332f()) {
                mVAccountFlowOption.confirmation.mo25202X0(jVar);
            }
            if (mVAccountFlowOption.mo29337j()) {
                mVAccountFlowOption.priceInfo.mo25202X0(jVar);
            }
            if (mVAccountFlowOption.mo29333g()) {
                jVar.mo61686J(mVAccountFlowOption.descriptionHtml);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOption mVAccountFlowOption = (MVAccountFlowOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVAccountFlowOption.optionId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVAccountFlowOption.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVAccountFlowOption.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVAccountFlowOption.subtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVAccountFlowConfirmation mVAccountFlowConfirmation = new MVAccountFlowConfirmation();
                mVAccountFlowOption.confirmation = mVAccountFlowConfirmation;
                mVAccountFlowConfirmation.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVPriceInfo mVPriceInfo = new MVPriceInfo();
                mVAccountFlowOption.priceInfo = mVPriceInfo;
                mVPriceInfo.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVAccountFlowOption.descriptionHtml = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOption$d */
    public static class C9497d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9496c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowOption");
        HashMap hashMap = new HashMap();
        f26943i = hashMap;
        hashMap.put(C25239c.class, new C9495b());
        hashMap.put(C25240d.class, new C9497d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OPTION_ID, new FieldMetaData("optionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CONFIRMATION, new FieldMetaData("confirmation", (byte) 2, new StructMetaData(MVAccountFlowConfirmation.class)));
        enumMap.put(_Fields.PRICE_INFO, new FieldMetaData("priceInfo", (byte) 2, new StructMetaData(MVPriceInfo.class)));
        enumMap.put(_Fields.DESCRIPTION_HTML, new FieldMetaData("descriptionHtml", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26944j = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowOption.class, unmodifiableMap);
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
        ((C25238b) f26943i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26943i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowOption mVAccountFlowOption = (MVAccountFlowOption) obj;
        if (!getClass().equals(mVAccountFlowOption.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowOption.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29336i()).compareTo(Boolean.valueOf(mVAccountFlowOption.mo29336i()));
        if (compareTo2 != 0 || ((mo29336i() && (compareTo2 = this.optionId.compareTo(mVAccountFlowOption.optionId)) != 0) || (compareTo2 = Boolean.valueOf(mo29334h()).compareTo(Boolean.valueOf(mVAccountFlowOption.mo29334h()))) != 0 || ((mo29334h() && (compareTo2 = this.icon.compareTo(mVAccountFlowOption.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo29339l()).compareTo(Boolean.valueOf(mVAccountFlowOption.mo29339l()))) != 0 || ((mo29339l() && (compareTo2 = this.title.compareTo(mVAccountFlowOption.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29338k()).compareTo(Boolean.valueOf(mVAccountFlowOption.mo29338k()))) != 0 || ((mo29338k() && (compareTo2 = this.subtitle.compareTo(mVAccountFlowOption.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo29332f()).compareTo(Boolean.valueOf(mVAccountFlowOption.mo29332f()))) != 0 || ((mo29332f() && (compareTo2 = this.confirmation.compareTo(mVAccountFlowOption.confirmation)) != 0) || (compareTo2 = Boolean.valueOf(mo29337j()).compareTo(Boolean.valueOf(mVAccountFlowOption.mo29337j()))) != 0 || ((mo29337j() && (compareTo2 = this.priceInfo.compareTo(mVAccountFlowOption.priceInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo29333g()).compareTo(Boolean.valueOf(mVAccountFlowOption.mo29333g()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo29333g() || (compareTo = this.descriptionHtml.compareTo(mVAccountFlowOption.descriptionHtml)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowOption)) {
            return false;
        }
        MVAccountFlowOption mVAccountFlowOption = (MVAccountFlowOption) obj;
        boolean i = mo29336i();
        boolean i2 = mVAccountFlowOption.mo29336i();
        if ((i || i2) && (!i || !i2 || !this.optionId.equals(mVAccountFlowOption.optionId))) {
            return false;
        }
        boolean h = mo29334h();
        boolean h2 = mVAccountFlowOption.mo29334h();
        if ((h || h2) && (!h || !h2 || !this.icon.mo26245a(mVAccountFlowOption.icon))) {
            return false;
        }
        boolean l = mo29339l();
        boolean l2 = mVAccountFlowOption.mo29339l();
        if ((l || l2) && (!l || !l2 || !this.title.equals(mVAccountFlowOption.title))) {
            return false;
        }
        boolean k = mo29338k();
        boolean k2 = mVAccountFlowOption.mo29338k();
        if ((k || k2) && (!k || !k2 || !this.subtitle.equals(mVAccountFlowOption.subtitle))) {
            return false;
        }
        boolean f = mo29332f();
        boolean f2 = mVAccountFlowOption.mo29332f();
        if ((f || f2) && (!f || !f2 || !this.confirmation.mo29257a(mVAccountFlowOption.confirmation))) {
            return false;
        }
        boolean j = mo29337j();
        boolean j2 = mVAccountFlowOption.mo29337j();
        if ((j || j2) && (!j || !j2 || !this.priceInfo.mo26347a(mVAccountFlowOption.priceInfo))) {
            return false;
        }
        boolean g = mo29333g();
        boolean g2 = mVAccountFlowOption.mo29333g();
        if ((g || g2) && (!g || !g2 || !this.descriptionHtml.equals(mVAccountFlowOption.descriptionHtml))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29332f() {
        return this.confirmation != null;
    }

    /* renamed from: g */
    public final boolean mo29333g() {
        return this.descriptionHtml != null;
    }

    /* renamed from: h */
    public final boolean mo29334h() {
        return this.icon != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29336i() {
        return this.optionId != null;
    }

    /* renamed from: j */
    public final boolean mo29337j() {
        return this.priceInfo != null;
    }

    /* renamed from: k */
    public final boolean mo29338k() {
        return this.subtitle != null;
    }

    /* renamed from: l */
    public final boolean mo29339l() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowOption(", "optionId:");
        String str = this.optionId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29334h()) {
            n.append(", ");
            n.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo29339l()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo29338k()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo29332f()) {
            n.append(", ");
            n.append("confirmation:");
            MVAccountFlowConfirmation mVAccountFlowConfirmation = this.confirmation;
            if (mVAccountFlowConfirmation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVAccountFlowConfirmation);
            }
        }
        if (mo29337j()) {
            n.append(", ");
            n.append("priceInfo:");
            MVPriceInfo mVPriceInfo = this.priceInfo;
            if (mVPriceInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPriceInfo);
            }
        }
        if (mo29333g()) {
            n.append(", ");
            n.append("descriptionHtml:");
            String str4 = this.descriptionHtml;
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
