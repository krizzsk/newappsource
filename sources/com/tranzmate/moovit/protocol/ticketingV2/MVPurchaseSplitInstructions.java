package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.payments.MVSpecialCreditCardFields;
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

public class MVPurchaseSplitInstructions implements TBase<MVPurchaseSplitInstructions, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseSplitInstructions> {

    /* renamed from: b */
    public static final C25113c f28937b = new C25113c("mainPaymentMethodVerificationType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28938c = new C25113c("secondaryPaymentMethodExtraRequiredFields", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f28939d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28940e;
    public MVPurchaseVerifacationType mainPaymentMethodVerificationType;
    private _Fields[] optionals = {_Fields.SECONDARY_PAYMENT_METHOD_EXTRA_REQUIRED_FIELDS};
    public MVSpecialCreditCardFields secondaryPaymentMethodExtraRequiredFields;

    public enum _Fields implements C25085c {
        MAIN_PAYMENT_METHOD_VERIFICATION_TYPE(1, "mainPaymentMethodVerificationType"),
        SECONDARY_PAYMENT_METHOD_EXTRA_REQUIRED_FIELDS(2, "secondaryPaymentMethodExtraRequiredFields");
        
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
                return MAIN_PAYMENT_METHOD_VERIFICATION_TYPE;
            }
            if (i != 2) {
                return null;
            }
            return SECONDARY_PAYMENT_METHOD_EXTRA_REQUIRED_FIELDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitInstructions$a */
    public static class C10941a extends C25239c<MVPurchaseSplitInstructions> {
        public C10941a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitInstructions mVPurchaseSplitInstructions = (MVPurchaseSplitInstructions) tBase;
            MVSpecialCreditCardFields mVSpecialCreditCardFields = mVPurchaseSplitInstructions.secondaryPaymentMethodExtraRequiredFields;
            C25113c cVar = MVPurchaseSplitInstructions.f28937b;
            gVar.mo61687K();
            if (mVPurchaseSplitInstructions.mainPaymentMethodVerificationType != null) {
                gVar.mo61711x(MVPurchaseSplitInstructions.f28937b);
                gVar.mo61678B(mVPurchaseSplitInstructions.mainPaymentMethodVerificationType.getValue());
                gVar.mo61712y();
            }
            if (mVPurchaseSplitInstructions.secondaryPaymentMethodExtraRequiredFields != null && mVPurchaseSplitInstructions.mo32723g()) {
                gVar.mo61711x(MVPurchaseSplitInstructions.f28938c);
                mVPurchaseSplitInstructions.secondaryPaymentMethodExtraRequiredFields.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitInstructions mVPurchaseSplitInstructions = (MVPurchaseSplitInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVSpecialCreditCardFields mVSpecialCreditCardFields = mVPurchaseSplitInstructions.secondaryPaymentMethodExtraRequiredFields;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVSpecialCreditCardFields mVSpecialCreditCardFields2 = new MVSpecialCreditCardFields();
                        mVPurchaseSplitInstructions.secondaryPaymentMethodExtraRequiredFields = mVSpecialCreditCardFields2;
                        mVSpecialCreditCardFields2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPurchaseSplitInstructions.mainPaymentMethodVerificationType = MVPurchaseVerifacationType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitInstructions$b */
    public static class C10942b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10941a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitInstructions$c */
    public static class C10943c extends C25240d<MVPurchaseSplitInstructions> {
        public C10943c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitInstructions mVPurchaseSplitInstructions = (MVPurchaseSplitInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseSplitInstructions.mo32722f()) {
                bitSet.set(0);
            }
            if (mVPurchaseSplitInstructions.mo32723g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPurchaseSplitInstructions.mo32722f()) {
                jVar.mo61678B(mVPurchaseSplitInstructions.mainPaymentMethodVerificationType.getValue());
            }
            if (mVPurchaseSplitInstructions.mo32723g()) {
                mVPurchaseSplitInstructions.secondaryPaymentMethodExtraRequiredFields.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitInstructions mVPurchaseSplitInstructions = (MVPurchaseSplitInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPurchaseSplitInstructions.mainPaymentMethodVerificationType = MVPurchaseVerifacationType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVSpecialCreditCardFields mVSpecialCreditCardFields = new MVSpecialCreditCardFields();
                mVPurchaseSplitInstructions.secondaryPaymentMethodExtraRequiredFields = mVSpecialCreditCardFields;
                mVSpecialCreditCardFields.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitInstructions$d */
    public static class C10944d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10943c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseSplitInstructions");
        HashMap hashMap = new HashMap();
        f28939d = hashMap;
        hashMap.put(C25239c.class, new C10942b());
        hashMap.put(C25240d.class, new C10944d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MAIN_PAYMENT_METHOD_VERIFICATION_TYPE, new FieldMetaData("mainPaymentMethodVerificationType", (byte) 3, new EnumMetaData(MVPurchaseVerifacationType.class)));
        enumMap.put(_Fields.SECONDARY_PAYMENT_METHOD_EXTRA_REQUIRED_FIELDS, new FieldMetaData("secondaryPaymentMethodExtraRequiredFields", (byte) 2, new StructMetaData(MVSpecialCreditCardFields.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28940e = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseSplitInstructions.class, unmodifiableMap);
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
        ((C25238b) f28939d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28939d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseSplitInstructions mVPurchaseSplitInstructions = (MVPurchaseSplitInstructions) obj;
        if (!getClass().equals(mVPurchaseSplitInstructions.getClass())) {
            return getClass().getName().compareTo(mVPurchaseSplitInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32722f()).compareTo(Boolean.valueOf(mVPurchaseSplitInstructions.mo32722f()));
        if (compareTo2 != 0 || ((mo32722f() && (compareTo2 = this.mainPaymentMethodVerificationType.compareTo(mVPurchaseSplitInstructions.mainPaymentMethodVerificationType)) != 0) || (compareTo2 = Boolean.valueOf(mo32723g()).compareTo(Boolean.valueOf(mVPurchaseSplitInstructions.mo32723g()))) != 0)) {
            return compareTo2;
        }
        if (!mo32723g() || (compareTo = this.secondaryPaymentMethodExtraRequiredFields.compareTo(mVPurchaseSplitInstructions.secondaryPaymentMethodExtraRequiredFields)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseSplitInstructions)) {
            return false;
        }
        MVPurchaseSplitInstructions mVPurchaseSplitInstructions = (MVPurchaseSplitInstructions) obj;
        boolean f = mo32722f();
        boolean f2 = mVPurchaseSplitInstructions.mo32722f();
        if ((f || f2) && (!f || !f2 || !this.mainPaymentMethodVerificationType.equals(mVPurchaseSplitInstructions.mainPaymentMethodVerificationType))) {
            return false;
        }
        boolean g = mo32723g();
        boolean g2 = mVPurchaseSplitInstructions.mo32723g();
        if ((g || g2) && (!g || !g2 || !this.secondaryPaymentMethodExtraRequiredFields.mo30588a(mVPurchaseSplitInstructions.secondaryPaymentMethodExtraRequiredFields))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32722f() {
        return this.mainPaymentMethodVerificationType != null;
    }

    /* renamed from: g */
    public final boolean mo32723g() {
        return this.secondaryPaymentMethodExtraRequiredFields != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseSplitInstructions(", "mainPaymentMethodVerificationType:");
        MVPurchaseVerifacationType mVPurchaseVerifacationType = this.mainPaymentMethodVerificationType;
        if (mVPurchaseVerifacationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseVerifacationType);
        }
        if (mo32723g()) {
            n.append(", ");
            n.append("secondaryPaymentMethodExtraRequiredFields:");
            MVSpecialCreditCardFields mVSpecialCreditCardFields = this.secondaryPaymentMethodExtraRequiredFields;
            if (mVSpecialCreditCardFields == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSpecialCreditCardFields);
            }
        }
        n.append(")");
        return n.toString();
    }
}
