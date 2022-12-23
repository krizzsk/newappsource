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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVApplePayPaymentSummaryItem implements TBase<MVApplePayPaymentSummaryItem, _Fields>, Serializable, Cloneable, Comparable<MVApplePayPaymentSummaryItem> {

    /* renamed from: b */
    public static final C25113c f27108b = new C25113c("label", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27109c = new C25113c("amount", (byte) 4, 2);

    /* renamed from: d */
    public static final C25113c f27110d = new C25113c("type", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f27111e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27112f;
    private byte __isset_bitfield = 0;
    public double amount;
    public String label;
    private _Fields[] optionals = {_Fields.LABEL, _Fields.TYPE};
    public MVApplePayPaymentSummaryItemType type;

    public enum _Fields implements C25085c {
        LABEL(1, "label"),
        AMOUNT(2, "amount"),
        TYPE(3, "type");
        
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
                return LABEL;
            }
            if (i == 2) {
                return AMOUNT;
            }
            if (i != 3) {
                return null;
            }
            return TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentSummaryItem$a */
    public static class C9608a extends C25239c<MVApplePayPaymentSummaryItem> {
        public C9608a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentSummaryItem mVApplePayPaymentSummaryItem = (MVApplePayPaymentSummaryItem) tBase;
            mVApplePayPaymentSummaryItem.getClass();
            C25113c cVar = MVApplePayPaymentSummaryItem.f27108b;
            gVar.mo61687K();
            if (mVApplePayPaymentSummaryItem.label != null && mVApplePayPaymentSummaryItem.mo29590g()) {
                gVar.mo61711x(MVApplePayPaymentSummaryItem.f27108b);
                gVar.mo61686J(mVApplePayPaymentSummaryItem.label);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVApplePayPaymentSummaryItem.f27109c);
            gVar.mo61710w(mVApplePayPaymentSummaryItem.amount);
            gVar.mo61712y();
            if (mVApplePayPaymentSummaryItem.type != null && mVApplePayPaymentSummaryItem.mo29591h()) {
                gVar.mo61711x(MVApplePayPaymentSummaryItem.f27110d);
                gVar.mo61678B(mVApplePayPaymentSummaryItem.type.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentSummaryItem mVApplePayPaymentSummaryItem = (MVApplePayPaymentSummaryItem) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVApplePayPaymentSummaryItem.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVApplePayPaymentSummaryItem.type = MVApplePayPaymentSummaryItemType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 4) {
                        mVApplePayPaymentSummaryItem.amount = gVar.mo61692e();
                        mVApplePayPaymentSummaryItem.mo29593i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVApplePayPaymentSummaryItem.label = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentSummaryItem$b */
    public static class C9609b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9608a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentSummaryItem$c */
    public static class C9610c extends C25240d<MVApplePayPaymentSummaryItem> {
        public C9610c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentSummaryItem mVApplePayPaymentSummaryItem = (MVApplePayPaymentSummaryItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplePayPaymentSummaryItem.mo29590g()) {
                bitSet.set(0);
            }
            if (mVApplePayPaymentSummaryItem.mo29589f()) {
                bitSet.set(1);
            }
            if (mVApplePayPaymentSummaryItem.mo29591h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVApplePayPaymentSummaryItem.mo29590g()) {
                jVar.mo61686J(mVApplePayPaymentSummaryItem.label);
            }
            if (mVApplePayPaymentSummaryItem.mo29589f()) {
                jVar.mo61710w(mVApplePayPaymentSummaryItem.amount);
            }
            if (mVApplePayPaymentSummaryItem.mo29591h()) {
                jVar.mo61678B(mVApplePayPaymentSummaryItem.type.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPaymentSummaryItem mVApplePayPaymentSummaryItem = (MVApplePayPaymentSummaryItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVApplePayPaymentSummaryItem.label = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVApplePayPaymentSummaryItem.amount = jVar.mo61692e();
                mVApplePayPaymentSummaryItem.mo29593i();
            }
            if (T.get(2)) {
                mVApplePayPaymentSummaryItem.type = MVApplePayPaymentSummaryItemType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPaymentSummaryItem$d */
    public static class C9611d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9610c(0);
        }
    }

    static {
        new C17394d0("MVApplePayPaymentSummaryItem");
        HashMap hashMap = new HashMap();
        f27111e = hashMap;
        hashMap.put(C25239c.class, new C9609b());
        hashMap.put(C25240d.class, new C9611d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LABEL, new FieldMetaData("label", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AMOUNT, new FieldMetaData("amount", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 2, new EnumMetaData(MVApplePayPaymentSummaryItemType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27112f = unmodifiableMap;
        FieldMetaData.m61947a(MVApplePayPaymentSummaryItem.class, unmodifiableMap);
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
        ((C25238b) f27111e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27111e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVApplePayPaymentSummaryItem mVApplePayPaymentSummaryItem = (MVApplePayPaymentSummaryItem) obj;
        if (!getClass().equals(mVApplePayPaymentSummaryItem.getClass())) {
            return getClass().getName().compareTo(mVApplePayPaymentSummaryItem.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29590g()).compareTo(Boolean.valueOf(mVApplePayPaymentSummaryItem.mo29590g()));
        if (compareTo2 != 0 || ((mo29590g() && (compareTo2 = this.label.compareTo(mVApplePayPaymentSummaryItem.label)) != 0) || (compareTo2 = Boolean.valueOf(mo29589f()).compareTo(Boolean.valueOf(mVApplePayPaymentSummaryItem.mo29589f()))) != 0 || ((mo29589f() && (compareTo2 = C25082a.m62838b(this.amount, mVApplePayPaymentSummaryItem.amount)) != 0) || (compareTo2 = Boolean.valueOf(mo29591h()).compareTo(Boolean.valueOf(mVApplePayPaymentSummaryItem.mo29591h()))) != 0))) {
            return compareTo2;
        }
        if (!mo29591h() || (compareTo = this.type.compareTo(mVApplePayPaymentSummaryItem.type)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVApplePayPaymentSummaryItem)) {
            return false;
        }
        MVApplePayPaymentSummaryItem mVApplePayPaymentSummaryItem = (MVApplePayPaymentSummaryItem) obj;
        boolean g = mo29590g();
        boolean g2 = mVApplePayPaymentSummaryItem.mo29590g();
        if (((g || g2) && (!g || !g2 || !this.label.equals(mVApplePayPaymentSummaryItem.label))) || this.amount != mVApplePayPaymentSummaryItem.amount) {
            return false;
        }
        boolean h = mo29591h();
        boolean h2 = mVApplePayPaymentSummaryItem.mo29591h();
        if ((h || h2) && (!h || !h2 || !this.type.equals(mVApplePayPaymentSummaryItem.type))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29589f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29590g() {
        return this.label != null;
    }

    /* renamed from: h */
    public final boolean mo29591h() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo29593i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVApplePayPaymentSummaryItem(");
        if (mo29590g()) {
            sb.append("label:");
            String str = this.label;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("amount:");
        sb.append(this.amount);
        if (mo29591h()) {
            sb.append(", ");
            sb.append("type:");
            MVApplePayPaymentSummaryItemType mVApplePayPaymentSummaryItemType = this.type;
            if (mVApplePayPaymentSummaryItemType == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVApplePayPaymentSummaryItemType);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
