package com.tranzmate.moovit.protocol.paymentaccount;

import com.appboy.models.InAppMessageImmersiveBase;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVAccountFlowPaymentStep implements TBase<MVAccountFlowPaymentStep, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowPaymentStep> {

    /* renamed from: b */
    public static final C25113c f26963b = new C25113c("identifier", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26964c = new C25113c(InAppMessageImmersiveBase.HEADER, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26965d = new C25113c("products", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f26966e = new C25113c("disclaimerHtml", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26967f = new C25113c("confirmButtonCaption", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f26968g = new C25113c("paymentInfo", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f26969h = new C25113c("totalPrice", (byte) 12, 7);

    /* renamed from: i */
    public static final HashMap f26970i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f26971j;
    public String confirmButtonCaption;
    public String disclaimerHtml;
    public String header;
    public String identifier;
    private _Fields[] optionals = {_Fields.HEADER, _Fields.DISCLAIMER_HTML, _Fields.TOTAL_PRICE};
    public MVAccountFlowPaymentInfo paymentInfo;
    public List<MVPaymentAccountPaymentProduct> products;
    public MVCurrencyAmount totalPrice;

    public enum _Fields implements C25085c {
        IDENTIFIER(1, "identifier"),
        HEADER(2, InAppMessageImmersiveBase.HEADER),
        PRODUCTS(3, "products"),
        DISCLAIMER_HTML(4, "disclaimerHtml"),
        CONFIRM_BUTTON_CAPTION(5, "confirmButtonCaption"),
        PAYMENT_INFO(6, "paymentInfo"),
        TOTAL_PRICE(7, "totalPrice");
        
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
                    return HEADER;
                case 3:
                    return PRODUCTS;
                case 4:
                    return DISCLAIMER_HTML;
                case 5:
                    return CONFIRM_BUTTON_CAPTION;
                case 6:
                    return PAYMENT_INFO;
                case 7:
                    return TOTAL_PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStep$a */
    public static class C9510a extends C25239c<MVAccountFlowPaymentStep> {
        public C9510a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowPaymentStep mVAccountFlowPaymentStep = (MVAccountFlowPaymentStep) tBase;
            MVAccountFlowPaymentInfo mVAccountFlowPaymentInfo = mVAccountFlowPaymentStep.paymentInfo;
            C25113c cVar = MVAccountFlowPaymentStep.f26963b;
            gVar.mo61687K();
            if (mVAccountFlowPaymentStep.identifier != null) {
                gVar.mo61711x(MVAccountFlowPaymentStep.f26963b);
                gVar.mo61686J(mVAccountFlowPaymentStep.identifier);
                gVar.mo61712y();
            }
            if (mVAccountFlowPaymentStep.header != null && mVAccountFlowPaymentStep.mo29375h()) {
                gVar.mo61711x(MVAccountFlowPaymentStep.f26964c);
                gVar.mo61686J(mVAccountFlowPaymentStep.header);
                gVar.mo61712y();
            }
            if (mVAccountFlowPaymentStep.products != null) {
                gVar.mo61711x(MVAccountFlowPaymentStep.f26965d);
                gVar.mo61680D(new C25119e((byte) 12, mVAccountFlowPaymentStep.products.size()));
                for (MVPaymentAccountPaymentProduct X0 : mVAccountFlowPaymentStep.products) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVAccountFlowPaymentStep.disclaimerHtml != null && mVAccountFlowPaymentStep.mo29374g()) {
                gVar.mo61711x(MVAccountFlowPaymentStep.f26966e);
                gVar.mo61686J(mVAccountFlowPaymentStep.disclaimerHtml);
                gVar.mo61712y();
            }
            if (mVAccountFlowPaymentStep.confirmButtonCaption != null) {
                gVar.mo61711x(MVAccountFlowPaymentStep.f26967f);
                gVar.mo61686J(mVAccountFlowPaymentStep.confirmButtonCaption);
                gVar.mo61712y();
            }
            if (mVAccountFlowPaymentStep.paymentInfo != null) {
                gVar.mo61711x(MVAccountFlowPaymentStep.f26968g);
                mVAccountFlowPaymentStep.paymentInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccountFlowPaymentStep.totalPrice != null && mVAccountFlowPaymentStep.mo29380l()) {
                gVar.mo61711x(MVAccountFlowPaymentStep.f26969h);
                mVAccountFlowPaymentStep.totalPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowPaymentStep mVAccountFlowPaymentStep = (MVAccountFlowPaymentStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVAccountFlowPaymentInfo mVAccountFlowPaymentInfo = mVAccountFlowPaymentStep.paymentInfo;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowPaymentStep.identifier = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowPaymentStep.header = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVAccountFlowPaymentStep.products = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVPaymentAccountPaymentProduct mVPaymentAccountPaymentProduct = new MVPaymentAccountPaymentProduct();
                                mVPaymentAccountPaymentProduct.mo25201C1(gVar);
                                mVAccountFlowPaymentStep.products.add(mVPaymentAccountPaymentProduct);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowPaymentStep.disclaimerHtml = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowPaymentStep.confirmButtonCaption = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVAccountFlowPaymentInfo mVAccountFlowPaymentInfo2 = new MVAccountFlowPaymentInfo();
                            mVAccountFlowPaymentStep.paymentInfo = mVAccountFlowPaymentInfo2;
                            mVAccountFlowPaymentInfo2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVAccountFlowPaymentStep.totalPrice = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStep$b */
    public static class C9511b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9510a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStep$c */
    public static class C9512c extends C25240d<MVAccountFlowPaymentStep> {
        public C9512c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowPaymentStep mVAccountFlowPaymentStep = (MVAccountFlowPaymentStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowPaymentStep.mo29377i()) {
                bitSet.set(0);
            }
            if (mVAccountFlowPaymentStep.mo29375h()) {
                bitSet.set(1);
            }
            if (mVAccountFlowPaymentStep.mo29379k()) {
                bitSet.set(2);
            }
            if (mVAccountFlowPaymentStep.mo29374g()) {
                bitSet.set(3);
            }
            if (mVAccountFlowPaymentStep.mo29373f()) {
                bitSet.set(4);
            }
            if (mVAccountFlowPaymentStep.mo29378j()) {
                bitSet.set(5);
            }
            if (mVAccountFlowPaymentStep.mo29380l()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVAccountFlowPaymentStep.mo29377i()) {
                jVar.mo61686J(mVAccountFlowPaymentStep.identifier);
            }
            if (mVAccountFlowPaymentStep.mo29375h()) {
                jVar.mo61686J(mVAccountFlowPaymentStep.header);
            }
            if (mVAccountFlowPaymentStep.mo29379k()) {
                jVar.mo61678B(mVAccountFlowPaymentStep.products.size());
                for (MVPaymentAccountPaymentProduct X0 : mVAccountFlowPaymentStep.products) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVAccountFlowPaymentStep.mo29374g()) {
                jVar.mo61686J(mVAccountFlowPaymentStep.disclaimerHtml);
            }
            if (mVAccountFlowPaymentStep.mo29373f()) {
                jVar.mo61686J(mVAccountFlowPaymentStep.confirmButtonCaption);
            }
            if (mVAccountFlowPaymentStep.mo29378j()) {
                mVAccountFlowPaymentStep.paymentInfo.mo25202X0(jVar);
            }
            if (mVAccountFlowPaymentStep.mo29380l()) {
                mVAccountFlowPaymentStep.totalPrice.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowPaymentStep mVAccountFlowPaymentStep = (MVAccountFlowPaymentStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVAccountFlowPaymentStep.identifier = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVAccountFlowPaymentStep.header = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVAccountFlowPaymentStep.products = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPaymentAccountPaymentProduct mVPaymentAccountPaymentProduct = new MVPaymentAccountPaymentProduct();
                    mVPaymentAccountPaymentProduct.mo25201C1(jVar);
                    mVAccountFlowPaymentStep.products.add(mVPaymentAccountPaymentProduct);
                }
            }
            if (T.get(3)) {
                mVAccountFlowPaymentStep.disclaimerHtml = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVAccountFlowPaymentStep.confirmButtonCaption = jVar.mo61704q();
            }
            if (T.get(5)) {
                MVAccountFlowPaymentInfo mVAccountFlowPaymentInfo = new MVAccountFlowPaymentInfo();
                mVAccountFlowPaymentStep.paymentInfo = mVAccountFlowPaymentInfo;
                mVAccountFlowPaymentInfo.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVAccountFlowPaymentStep.totalPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStep$d */
    public static class C9513d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9512c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowPaymentStep");
        HashMap hashMap = new HashMap();
        f26970i = hashMap;
        hashMap.put(C25239c.class, new C9511b());
        hashMap.put(C25240d.class, new C9513d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IDENTIFIER, new FieldMetaData("identifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.HEADER, new FieldMetaData(InAppMessageImmersiveBase.HEADER, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRODUCTS, new FieldMetaData("products", (byte) 3, new ListMetaData(new StructMetaData(MVPaymentAccountPaymentProduct.class))));
        enumMap.put(_Fields.DISCLAIMER_HTML, new FieldMetaData("disclaimerHtml", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CONFIRM_BUTTON_CAPTION, new FieldMetaData("confirmButtonCaption", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_INFO, new FieldMetaData("paymentInfo", (byte) 3, new StructMetaData(MVAccountFlowPaymentInfo.class)));
        enumMap.put(_Fields.TOTAL_PRICE, new FieldMetaData("totalPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26971j = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowPaymentStep.class, unmodifiableMap);
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
        ((C25238b) f26970i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26970i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowPaymentStep mVAccountFlowPaymentStep = (MVAccountFlowPaymentStep) obj;
        if (!getClass().equals(mVAccountFlowPaymentStep.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowPaymentStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29377i()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStep.mo29377i()));
        if (compareTo2 != 0 || ((mo29377i() && (compareTo2 = this.identifier.compareTo(mVAccountFlowPaymentStep.identifier)) != 0) || (compareTo2 = Boolean.valueOf(mo29375h()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStep.mo29375h()))) != 0 || ((mo29375h() && (compareTo2 = this.header.compareTo(mVAccountFlowPaymentStep.header)) != 0) || (compareTo2 = Boolean.valueOf(mo29379k()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStep.mo29379k()))) != 0 || ((mo29379k() && (compareTo2 = C25082a.m62844h(this.products, mVAccountFlowPaymentStep.products)) != 0) || (compareTo2 = Boolean.valueOf(mo29374g()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStep.mo29374g()))) != 0 || ((mo29374g() && (compareTo2 = this.disclaimerHtml.compareTo(mVAccountFlowPaymentStep.disclaimerHtml)) != 0) || (compareTo2 = Boolean.valueOf(mo29373f()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStep.mo29373f()))) != 0 || ((mo29373f() && (compareTo2 = this.confirmButtonCaption.compareTo(mVAccountFlowPaymentStep.confirmButtonCaption)) != 0) || (compareTo2 = Boolean.valueOf(mo29378j()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStep.mo29378j()))) != 0 || ((mo29378j() && (compareTo2 = this.paymentInfo.compareTo(mVAccountFlowPaymentStep.paymentInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo29380l()).compareTo(Boolean.valueOf(mVAccountFlowPaymentStep.mo29380l()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo29380l() || (compareTo = this.totalPrice.compareTo(mVAccountFlowPaymentStep.totalPrice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowPaymentStep)) {
            return false;
        }
        MVAccountFlowPaymentStep mVAccountFlowPaymentStep = (MVAccountFlowPaymentStep) obj;
        boolean i = mo29377i();
        boolean i2 = mVAccountFlowPaymentStep.mo29377i();
        if ((i || i2) && (!i || !i2 || !this.identifier.equals(mVAccountFlowPaymentStep.identifier))) {
            return false;
        }
        boolean h = mo29375h();
        boolean h2 = mVAccountFlowPaymentStep.mo29375h();
        if ((h || h2) && (!h || !h2 || !this.header.equals(mVAccountFlowPaymentStep.header))) {
            return false;
        }
        boolean k = mo29379k();
        boolean k2 = mVAccountFlowPaymentStep.mo29379k();
        if ((k || k2) && (!k || !k2 || !this.products.equals(mVAccountFlowPaymentStep.products))) {
            return false;
        }
        boolean g = mo29374g();
        boolean g2 = mVAccountFlowPaymentStep.mo29374g();
        if ((g || g2) && (!g || !g2 || !this.disclaimerHtml.equals(mVAccountFlowPaymentStep.disclaimerHtml))) {
            return false;
        }
        boolean f = mo29373f();
        boolean f2 = mVAccountFlowPaymentStep.mo29373f();
        if ((f || f2) && (!f || !f2 || !this.confirmButtonCaption.equals(mVAccountFlowPaymentStep.confirmButtonCaption))) {
            return false;
        }
        boolean j = mo29378j();
        boolean j2 = mVAccountFlowPaymentStep.mo29378j();
        if ((j || j2) && (!j || !j2 || !this.paymentInfo.mo29362a(mVAccountFlowPaymentStep.paymentInfo))) {
            return false;
        }
        boolean l = mo29380l();
        boolean l2 = mVAccountFlowPaymentStep.mo29380l();
        if ((l || l2) && (!l || !l2 || !this.totalPrice.mo26102a(mVAccountFlowPaymentStep.totalPrice))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29373f() {
        return this.confirmButtonCaption != null;
    }

    /* renamed from: g */
    public final boolean mo29374g() {
        return this.disclaimerHtml != null;
    }

    /* renamed from: h */
    public final boolean mo29375h() {
        return this.header != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29377i() {
        return this.identifier != null;
    }

    /* renamed from: j */
    public final boolean mo29378j() {
        return this.paymentInfo != null;
    }

    /* renamed from: k */
    public final boolean mo29379k() {
        return this.products != null;
    }

    /* renamed from: l */
    public final boolean mo29380l() {
        return this.totalPrice != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowPaymentStep(", "identifier:");
        String str = this.identifier;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29375h()) {
            n.append(", ");
            n.append("header:");
            String str2 = this.header;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("products:");
        List<MVPaymentAccountPaymentProduct> list = this.products;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo29374g()) {
            n.append(", ");
            n.append("disclaimerHtml:");
            String str3 = this.disclaimerHtml;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("confirmButtonCaption:");
        String str4 = this.confirmButtonCaption;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("paymentInfo:");
        MVAccountFlowPaymentInfo mVAccountFlowPaymentInfo = this.paymentInfo;
        if (mVAccountFlowPaymentInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAccountFlowPaymentInfo);
        }
        if (mo29380l()) {
            n.append(", ");
            n.append("totalPrice:");
            MVCurrencyAmount mVCurrencyAmount = this.totalPrice;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        n.append(")");
        return n.toString();
    }
}
