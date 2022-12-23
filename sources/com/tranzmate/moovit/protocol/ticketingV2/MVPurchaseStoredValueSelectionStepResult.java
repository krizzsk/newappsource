package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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

public class MVPurchaseStoredValueSelectionStepResult implements TBase<MVPurchaseStoredValueSelectionStepResult, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseStoredValueSelectionStepResult> {

    /* renamed from: b */
    public static final C25113c f28989b = new C25113c("currencyAmount", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f28990c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28991d;
    public MVCurrencyAmount currencyAmount;

    public enum _Fields implements C25085c {
        CURRENCY_AMOUNT(1, "currencyAmount");
        
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
            if (i != 1) {
                return null;
            }
            return CURRENCY_AMOUNT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStepResult$a */
    public static class C10971a extends C25239c<MVPurchaseStoredValueSelectionStepResult> {
        public C10971a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueSelectionStepResult mVPurchaseStoredValueSelectionStepResult = (MVPurchaseStoredValueSelectionStepResult) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPurchaseStoredValueSelectionStepResult.currencyAmount;
            C25113c cVar = MVPurchaseStoredValueSelectionStepResult.f28989b;
            gVar.mo61687K();
            if (mVPurchaseStoredValueSelectionStepResult.currencyAmount != null) {
                gVar.mo61711x(MVPurchaseStoredValueSelectionStepResult.f28989b);
                mVPurchaseStoredValueSelectionStepResult.currencyAmount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueSelectionStepResult mVPurchaseStoredValueSelectionStepResult = (MVPurchaseStoredValueSelectionStepResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPurchaseStoredValueSelectionStepResult.currencyAmount;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVPurchaseStoredValueSelectionStepResult.currencyAmount = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStepResult$b */
    public static class C10972b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10971a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStepResult$c */
    public static class C10973c extends C25240d<MVPurchaseStoredValueSelectionStepResult> {
        public C10973c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueSelectionStepResult mVPurchaseStoredValueSelectionStepResult = (MVPurchaseStoredValueSelectionStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseStoredValueSelectionStepResult.mo32798f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPurchaseStoredValueSelectionStepResult.mo32798f()) {
                mVPurchaseStoredValueSelectionStepResult.currencyAmount.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueSelectionStepResult mVPurchaseStoredValueSelectionStepResult = (MVPurchaseStoredValueSelectionStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseStoredValueSelectionStepResult.currencyAmount = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStepResult$d */
    public static class C10974d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10973c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseStoredValueSelectionStepResult");
        HashMap hashMap = new HashMap();
        f28990c = hashMap;
        hashMap.put(C25239c.class, new C10972b());
        hashMap.put(C25240d.class, new C10974d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CURRENCY_AMOUNT, new FieldMetaData("currencyAmount", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28991d = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseStoredValueSelectionStepResult.class, unmodifiableMap);
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
        ((C25238b) f28990c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28990c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseStoredValueSelectionStepResult mVPurchaseStoredValueSelectionStepResult = (MVPurchaseStoredValueSelectionStepResult) obj;
        if (!getClass().equals(mVPurchaseStoredValueSelectionStepResult.getClass())) {
            return getClass().getName().compareTo(mVPurchaseStoredValueSelectionStepResult.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32798f()).compareTo(Boolean.valueOf(mVPurchaseStoredValueSelectionStepResult.mo32798f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo32798f() || (compareTo = this.currencyAmount.compareTo(mVPurchaseStoredValueSelectionStepResult.currencyAmount)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseStoredValueSelectionStepResult)) {
            return false;
        }
        MVPurchaseStoredValueSelectionStepResult mVPurchaseStoredValueSelectionStepResult = (MVPurchaseStoredValueSelectionStepResult) obj;
        boolean f = mo32798f();
        boolean f2 = mVPurchaseStoredValueSelectionStepResult.mo32798f();
        if ((f || f2) && (!f || !f2 || !this.currencyAmount.mo26102a(mVPurchaseStoredValueSelectionStepResult.currencyAmount))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32798f() {
        return this.currencyAmount != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseStoredValueSelectionStepResult(", "currencyAmount:");
        MVCurrencyAmount mVCurrencyAmount = this.currencyAmount;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(")");
        return n.toString();
    }
}
