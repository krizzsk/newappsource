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

public class MVStoredValueOtherAmount implements TBase<MVStoredValueOtherAmount, _Fields>, Serializable, Cloneable, Comparable<MVStoredValueOtherAmount> {

    /* renamed from: b */
    public static final C25113c f29105b = new C25113c("minimumPrice", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29106c = new C25113c("maximumPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29107d = new C25113c("explanation", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29108e = new C25113c("name", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f29109f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29110g;
    public String explanation;
    public MVCurrencyAmount maximumPrice;
    public MVCurrencyAmount minimumPrice;
    public String name;
    private _Fields[] optionals = {_Fields.EXPLANATION};

    public enum _Fields implements C25085c {
        MINIMUM_PRICE(1, "minimumPrice"),
        MAXIMUM_PRICE(2, "maximumPrice"),
        EXPLANATION(3, "explanation"),
        NAME(4, "name");
        
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
                return MINIMUM_PRICE;
            }
            if (i == 2) {
                return MAXIMUM_PRICE;
            }
            if (i == 3) {
                return EXPLANATION;
            }
            if (i != 4) {
                return null;
            }
            return NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueOtherAmount$a */
    public static class C11038a extends C25239c<MVStoredValueOtherAmount> {
        public C11038a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStoredValueOtherAmount mVStoredValueOtherAmount = (MVStoredValueOtherAmount) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVStoredValueOtherAmount.minimumPrice;
            C25113c cVar = MVStoredValueOtherAmount.f29105b;
            gVar.mo61687K();
            if (mVStoredValueOtherAmount.minimumPrice != null) {
                gVar.mo61711x(MVStoredValueOtherAmount.f29105b);
                mVStoredValueOtherAmount.minimumPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVStoredValueOtherAmount.maximumPrice != null) {
                gVar.mo61711x(MVStoredValueOtherAmount.f29106c);
                mVStoredValueOtherAmount.maximumPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVStoredValueOtherAmount.explanation != null && mVStoredValueOtherAmount.mo32962f()) {
                gVar.mo61711x(MVStoredValueOtherAmount.f29107d);
                gVar.mo61686J(mVStoredValueOtherAmount.explanation);
                gVar.mo61712y();
            }
            if (mVStoredValueOtherAmount.name != null) {
                gVar.mo61711x(MVStoredValueOtherAmount.f29108e);
                gVar.mo61686J(mVStoredValueOtherAmount.name);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStoredValueOtherAmount mVStoredValueOtherAmount = (MVStoredValueOtherAmount) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVStoredValueOtherAmount.minimumPrice;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVStoredValueOtherAmount.name = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVStoredValueOtherAmount.explanation = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVStoredValueOtherAmount.maximumPrice = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount3 = new MVCurrencyAmount();
                    mVStoredValueOtherAmount.minimumPrice = mVCurrencyAmount3;
                    mVCurrencyAmount3.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueOtherAmount$b */
    public static class C11039b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11038a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueOtherAmount$c */
    public static class C11040c extends C25240d<MVStoredValueOtherAmount> {
        public C11040c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStoredValueOtherAmount mVStoredValueOtherAmount = (MVStoredValueOtherAmount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStoredValueOtherAmount.mo32964h()) {
                bitSet.set(0);
            }
            if (mVStoredValueOtherAmount.mo32963g()) {
                bitSet.set(1);
            }
            if (mVStoredValueOtherAmount.mo32962f()) {
                bitSet.set(2);
            }
            if (mVStoredValueOtherAmount.mo32966i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVStoredValueOtherAmount.mo32964h()) {
                mVStoredValueOtherAmount.minimumPrice.mo25202X0(jVar);
            }
            if (mVStoredValueOtherAmount.mo32963g()) {
                mVStoredValueOtherAmount.maximumPrice.mo25202X0(jVar);
            }
            if (mVStoredValueOtherAmount.mo32962f()) {
                jVar.mo61686J(mVStoredValueOtherAmount.explanation);
            }
            if (mVStoredValueOtherAmount.mo32966i()) {
                jVar.mo61686J(mVStoredValueOtherAmount.name);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStoredValueOtherAmount mVStoredValueOtherAmount = (MVStoredValueOtherAmount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVStoredValueOtherAmount.minimumPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVStoredValueOtherAmount.maximumPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVStoredValueOtherAmount.explanation = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVStoredValueOtherAmount.name = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValueOtherAmount$d */
    public static class C11041d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11040c(0);
        }
    }

    static {
        new C17394d0("MVStoredValueOtherAmount");
        HashMap hashMap = new HashMap();
        f29109f = hashMap;
        hashMap.put(C25239c.class, new C11039b());
        hashMap.put(C25240d.class, new C11041d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MINIMUM_PRICE, new FieldMetaData("minimumPrice", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.MAXIMUM_PRICE, new FieldMetaData("maximumPrice", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.EXPLANATION, new FieldMetaData("explanation", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29110g = unmodifiableMap;
        FieldMetaData.m61947a(MVStoredValueOtherAmount.class, unmodifiableMap);
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
        ((C25238b) f29109f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29109f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32959a(MVStoredValueOtherAmount mVStoredValueOtherAmount) {
        if (mVStoredValueOtherAmount == null) {
            return false;
        }
        boolean h = mo32964h();
        boolean h2 = mVStoredValueOtherAmount.mo32964h();
        if ((h || h2) && (!h || !h2 || !this.minimumPrice.mo26102a(mVStoredValueOtherAmount.minimumPrice))) {
            return false;
        }
        boolean g = mo32963g();
        boolean g2 = mVStoredValueOtherAmount.mo32963g();
        if ((g || g2) && (!g || !g2 || !this.maximumPrice.mo26102a(mVStoredValueOtherAmount.maximumPrice))) {
            return false;
        }
        boolean f = mo32962f();
        boolean f2 = mVStoredValueOtherAmount.mo32962f();
        if ((f || f2) && (!f || !f2 || !this.explanation.equals(mVStoredValueOtherAmount.explanation))) {
            return false;
        }
        boolean i = mo32966i();
        boolean i2 = mVStoredValueOtherAmount.mo32966i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.name.equals(mVStoredValueOtherAmount.name)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVStoredValueOtherAmount mVStoredValueOtherAmount = (MVStoredValueOtherAmount) obj;
        if (!getClass().equals(mVStoredValueOtherAmount.getClass())) {
            return getClass().getName().compareTo(mVStoredValueOtherAmount.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32964h()).compareTo(Boolean.valueOf(mVStoredValueOtherAmount.mo32964h()));
        if (compareTo2 != 0 || ((mo32964h() && (compareTo2 = this.minimumPrice.compareTo(mVStoredValueOtherAmount.minimumPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo32963g()).compareTo(Boolean.valueOf(mVStoredValueOtherAmount.mo32963g()))) != 0 || ((mo32963g() && (compareTo2 = this.maximumPrice.compareTo(mVStoredValueOtherAmount.maximumPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo32962f()).compareTo(Boolean.valueOf(mVStoredValueOtherAmount.mo32962f()))) != 0 || ((mo32962f() && (compareTo2 = this.explanation.compareTo(mVStoredValueOtherAmount.explanation)) != 0) || (compareTo2 = Boolean.valueOf(mo32966i()).compareTo(Boolean.valueOf(mVStoredValueOtherAmount.mo32966i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo32966i() || (compareTo = this.name.compareTo(mVStoredValueOtherAmount.name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVStoredValueOtherAmount)) {
            return mo32959a((MVStoredValueOtherAmount) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32962f() {
        return this.explanation != null;
    }

    /* renamed from: g */
    public final boolean mo32963g() {
        return this.maximumPrice != null;
    }

    /* renamed from: h */
    public final boolean mo32964h() {
        return this.minimumPrice != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32966i() {
        return this.name != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStoredValueOtherAmount(", "minimumPrice:");
        MVCurrencyAmount mVCurrencyAmount = this.minimumPrice;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("maximumPrice:");
        MVCurrencyAmount mVCurrencyAmount2 = this.maximumPrice;
        if (mVCurrencyAmount2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount2);
        }
        if (mo32962f()) {
            n.append(", ");
            n.append("explanation:");
            String str = this.explanation;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("name:");
        String str2 = this.name;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
