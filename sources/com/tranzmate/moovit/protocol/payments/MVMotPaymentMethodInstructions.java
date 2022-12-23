package com.tranzmate.moovit.protocol.payments;

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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVMotPaymentMethodInstructions implements TBase<MVMotPaymentMethodInstructions, _Fields>, Serializable, Cloneable, Comparable<MVMotPaymentMethodInstructions> {

    /* renamed from: b */
    public static final C25113c f27381b = new C25113c("creditCardInstructions", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27382c = new C25113c("pangoInstructions", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27383d = new C25113c("bitInstructions", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f27384e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27385f;
    public MVBitInstructions bitInstructions;
    public MVCreditCardInstructions creditCardInstructions;
    private _Fields[] optionals = {_Fields.CREDIT_CARD_INSTRUCTIONS, _Fields.PANGO_INSTRUCTIONS, _Fields.BIT_INSTRUCTIONS};
    public MVPangoInstructions pangoInstructions;

    public enum _Fields implements C25085c {
        CREDIT_CARD_INSTRUCTIONS(1, "creditCardInstructions"),
        PANGO_INSTRUCTIONS(2, "pangoInstructions"),
        BIT_INSTRUCTIONS(3, "bitInstructions");
        
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
                return CREDIT_CARD_INSTRUCTIONS;
            }
            if (i == 2) {
                return PANGO_INSTRUCTIONS;
            }
            if (i != 3) {
                return null;
            }
            return BIT_INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMotPaymentMethodInstructions$a */
    public static class C9833a extends C25239c<MVMotPaymentMethodInstructions> {
        public C9833a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = (MVMotPaymentMethodInstructions) tBase;
            mVMotPaymentMethodInstructions.mo30067i();
            C25113c cVar = MVMotPaymentMethodInstructions.f27381b;
            gVar.mo61687K();
            if (mVMotPaymentMethodInstructions.creditCardInstructions != null && mVMotPaymentMethodInstructions.mo30064g()) {
                gVar.mo61711x(MVMotPaymentMethodInstructions.f27381b);
                mVMotPaymentMethodInstructions.creditCardInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMotPaymentMethodInstructions.pangoInstructions != null && mVMotPaymentMethodInstructions.mo30065h()) {
                gVar.mo61711x(MVMotPaymentMethodInstructions.f27382c);
                mVMotPaymentMethodInstructions.pangoInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMotPaymentMethodInstructions.bitInstructions != null && mVMotPaymentMethodInstructions.mo30063f()) {
                gVar.mo61711x(MVMotPaymentMethodInstructions.f27383d);
                mVMotPaymentMethodInstructions.bitInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = (MVMotPaymentMethodInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMotPaymentMethodInstructions.mo30067i();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVBitInstructions mVBitInstructions = new MVBitInstructions();
                            mVMotPaymentMethodInstructions.bitInstructions = mVBitInstructions;
                            mVBitInstructions.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVPangoInstructions mVPangoInstructions = new MVPangoInstructions();
                        mVMotPaymentMethodInstructions.pangoInstructions = mVPangoInstructions;
                        mVPangoInstructions.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                    mVMotPaymentMethodInstructions.creditCardInstructions = mVCreditCardInstructions;
                    mVCreditCardInstructions.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMotPaymentMethodInstructions$b */
    public static class C9834b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9833a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMotPaymentMethodInstructions$c */
    public static class C9835c extends C25240d<MVMotPaymentMethodInstructions> {
        public C9835c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = (MVMotPaymentMethodInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMotPaymentMethodInstructions.mo30064g()) {
                bitSet.set(0);
            }
            if (mVMotPaymentMethodInstructions.mo30065h()) {
                bitSet.set(1);
            }
            if (mVMotPaymentMethodInstructions.mo30063f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMotPaymentMethodInstructions.mo30064g()) {
                mVMotPaymentMethodInstructions.creditCardInstructions.mo25202X0(jVar);
            }
            if (mVMotPaymentMethodInstructions.mo30065h()) {
                mVMotPaymentMethodInstructions.pangoInstructions.mo25202X0(jVar);
            }
            if (mVMotPaymentMethodInstructions.mo30063f()) {
                mVMotPaymentMethodInstructions.bitInstructions.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = (MVMotPaymentMethodInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                mVMotPaymentMethodInstructions.creditCardInstructions = mVCreditCardInstructions;
                mVCreditCardInstructions.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVPangoInstructions mVPangoInstructions = new MVPangoInstructions();
                mVMotPaymentMethodInstructions.pangoInstructions = mVPangoInstructions;
                mVPangoInstructions.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVBitInstructions mVBitInstructions = new MVBitInstructions();
                mVMotPaymentMethodInstructions.bitInstructions = mVBitInstructions;
                mVBitInstructions.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMotPaymentMethodInstructions$d */
    public static class C9836d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9835c(0);
        }
    }

    static {
        new C17394d0("MVMotPaymentMethodInstructions");
        HashMap hashMap = new HashMap();
        f27384e = hashMap;
        hashMap.put(C25239c.class, new C9834b());
        hashMap.put(C25240d.class, new C9836d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CREDIT_CARD_INSTRUCTIONS, new FieldMetaData("creditCardInstructions", (byte) 2, new StructMetaData(MVCreditCardInstructions.class)));
        enumMap.put(_Fields.PANGO_INSTRUCTIONS, new FieldMetaData("pangoInstructions", (byte) 2, new StructMetaData(MVPangoInstructions.class)));
        enumMap.put(_Fields.BIT_INSTRUCTIONS, new FieldMetaData("bitInstructions", (byte) 2, new StructMetaData(MVBitInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27385f = unmodifiableMap;
        FieldMetaData.m61947a(MVMotPaymentMethodInstructions.class, unmodifiableMap);
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
        ((C25238b) f27384e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27384e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30060a(MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions) {
        if (mVMotPaymentMethodInstructions == null) {
            return false;
        }
        boolean g = mo30064g();
        boolean g2 = mVMotPaymentMethodInstructions.mo30064g();
        if ((g || g2) && (!g || !g2 || !this.creditCardInstructions.mo29766a(mVMotPaymentMethodInstructions.creditCardInstructions))) {
            return false;
        }
        boolean h = mo30065h();
        boolean h2 = mVMotPaymentMethodInstructions.mo30065h();
        if ((h || h2) && (!h || !h2 || !this.pangoInstructions.mo30078a(mVMotPaymentMethodInstructions.pangoInstructions))) {
            return false;
        }
        boolean f = mo30063f();
        boolean f2 = mVMotPaymentMethodInstructions.mo30063f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.bitInstructions.mo29639a(mVMotPaymentMethodInstructions.bitInstructions)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = (MVMotPaymentMethodInstructions) obj;
        if (!getClass().equals(mVMotPaymentMethodInstructions.getClass())) {
            return getClass().getName().compareTo(mVMotPaymentMethodInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30064g()).compareTo(Boolean.valueOf(mVMotPaymentMethodInstructions.mo30064g()));
        if (compareTo2 != 0 || ((mo30064g() && (compareTo2 = this.creditCardInstructions.compareTo(mVMotPaymentMethodInstructions.creditCardInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30065h()).compareTo(Boolean.valueOf(mVMotPaymentMethodInstructions.mo30065h()))) != 0 || ((mo30065h() && (compareTo2 = this.pangoInstructions.compareTo(mVMotPaymentMethodInstructions.pangoInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30063f()).compareTo(Boolean.valueOf(mVMotPaymentMethodInstructions.mo30063f()))) != 0))) {
            return compareTo2;
        }
        if (!mo30063f() || (compareTo = this.bitInstructions.compareTo(mVMotPaymentMethodInstructions.bitInstructions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMotPaymentMethodInstructions)) {
            return mo30060a((MVMotPaymentMethodInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30063f() {
        return this.bitInstructions != null;
    }

    /* renamed from: g */
    public final boolean mo30064g() {
        return this.creditCardInstructions != null;
    }

    /* renamed from: h */
    public final boolean mo30065h() {
        return this.pangoInstructions != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo30067i() throws TException {
        MVCreditCardInstructions mVCreditCardInstructions = this.creditCardInstructions;
        if (mVCreditCardInstructions != null) {
            mVCreditCardInstructions.mo29771h();
        }
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVMotPaymentMethodInstructions(");
        boolean z2 = false;
        if (mo30064g()) {
            sb.append("creditCardInstructions:");
            MVCreditCardInstructions mVCreditCardInstructions = this.creditCardInstructions;
            if (mVCreditCardInstructions == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVCreditCardInstructions);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo30065h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("pangoInstructions:");
            MVPangoInstructions mVPangoInstructions = this.pangoInstructions;
            if (mVPangoInstructions == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVPangoInstructions);
            }
        } else {
            z2 = z;
        }
        if (mo30063f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("bitInstructions:");
            MVBitInstructions mVBitInstructions = this.bitInstructions;
            if (mVBitInstructions == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVBitInstructions);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
