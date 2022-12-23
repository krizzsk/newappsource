package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVTransaction implements TBase<MVTransaction, _Fields>, Serializable, Cloneable, Comparable<MVTransaction> {

    /* renamed from: b */
    public static final C25113c f29272b = new C25113c("image", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29273c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29274d = new C25113c("time", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f29275e = new C25113c("amount", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f29276f = new C25113c("receiptUrl", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f29277g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f29278h;
    private byte __isset_bitfield = 0;
    public MVCurrencyAmount amount;
    public MVImageReferenceWithParams image;
    public String name;
    private _Fields[] optionals = {_Fields.IMAGE, _Fields.RECEIPT_URL};
    public String receiptUrl;
    public long time;

    public enum _Fields implements C25085c {
        IMAGE(1, "image"),
        NAME(2, "name"),
        TIME(3, "time"),
        AMOUNT(4, "amount"),
        RECEIPT_URL(5, "receiptUrl");
        
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
                return IMAGE;
            }
            if (i == 2) {
                return NAME;
            }
            if (i == 3) {
                return TIME;
            }
            if (i == 4) {
                return AMOUNT;
            }
            if (i != 5) {
                return null;
            }
            return RECEIPT_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTransaction$a */
    public static class C11123a extends C25239c<MVTransaction> {
        public C11123a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTransaction mVTransaction = (MVTransaction) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTransaction.image;
            C25113c cVar = MVTransaction.f29272b;
            gVar.mo61687K();
            if (mVTransaction.image != null && mVTransaction.mo33214g()) {
                gVar.mo61711x(MVTransaction.f29272b);
                mVTransaction.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTransaction.name != null) {
                gVar.mo61711x(MVTransaction.f29273c);
                gVar.mo61686J(mVTransaction.name);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTransaction.f29274d);
            gVar.mo61679C(mVTransaction.time);
            gVar.mo61712y();
            if (mVTransaction.amount != null) {
                gVar.mo61711x(MVTransaction.f29275e);
                mVTransaction.amount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTransaction.receiptUrl != null && mVTransaction.mo33217i()) {
                gVar.mo61711x(MVTransaction.f29276f);
                gVar.mo61686J(mVTransaction.receiptUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTransaction mVTransaction = (MVTransaction) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTransaction.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVTransaction.receiptUrl = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                                mVTransaction.amount = mVCurrencyAmount;
                                mVCurrencyAmount.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 10) {
                            mVTransaction.time = gVar.mo61697j();
                            mVTransaction.mo33219k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTransaction.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                    mVTransaction.image = mVImageReferenceWithParams2;
                    mVImageReferenceWithParams2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTransaction$b */
    public static class C11124b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11123a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTransaction$c */
    public static class C11125c extends C25240d<MVTransaction> {
        public C11125c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTransaction mVTransaction = (MVTransaction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTransaction.mo33214g()) {
                bitSet.set(0);
            }
            if (mVTransaction.mo33215h()) {
                bitSet.set(1);
            }
            if (mVTransaction.mo33218j()) {
                bitSet.set(2);
            }
            if (mVTransaction.mo33213f()) {
                bitSet.set(3);
            }
            if (mVTransaction.mo33217i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVTransaction.mo33214g()) {
                mVTransaction.image.mo25202X0(jVar);
            }
            if (mVTransaction.mo33215h()) {
                jVar.mo61686J(mVTransaction.name);
            }
            if (mVTransaction.mo33218j()) {
                jVar.mo61679C(mVTransaction.time);
            }
            if (mVTransaction.mo33213f()) {
                mVTransaction.amount.mo25202X0(jVar);
            }
            if (mVTransaction.mo33217i()) {
                jVar.mo61686J(mVTransaction.receiptUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTransaction mVTransaction = (MVTransaction) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTransaction.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVTransaction.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTransaction.time = jVar.mo61697j();
                mVTransaction.mo33219k();
            }
            if (T.get(3)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTransaction.amount = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVTransaction.receiptUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTransaction$d */
    public static class C11126d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11125c(0);
        }
    }

    static {
        new C17394d0("MVTransaction");
        HashMap hashMap = new HashMap();
        f29277g = hashMap;
        hashMap.put(C25239c.class, new C11124b());
        hashMap.put(C25240d.class, new C11126d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.AMOUNT, new FieldMetaData("amount", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.RECEIPT_URL, new FieldMetaData("receiptUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29278h = unmodifiableMap;
        FieldMetaData.m61947a(MVTransaction.class, unmodifiableMap);
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
        ((C25238b) f29277g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29277g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTransaction mVTransaction = (MVTransaction) obj;
        if (!getClass().equals(mVTransaction.getClass())) {
            return getClass().getName().compareTo(mVTransaction.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33214g()).compareTo(Boolean.valueOf(mVTransaction.mo33214g()));
        if (compareTo2 != 0 || ((mo33214g() && (compareTo2 = this.image.compareTo(mVTransaction.image)) != 0) || (compareTo2 = Boolean.valueOf(mo33215h()).compareTo(Boolean.valueOf(mVTransaction.mo33215h()))) != 0 || ((mo33215h() && (compareTo2 = this.name.compareTo(mVTransaction.name)) != 0) || (compareTo2 = Boolean.valueOf(mo33218j()).compareTo(Boolean.valueOf(mVTransaction.mo33218j()))) != 0 || ((mo33218j() && (compareTo2 = C25082a.m62840d(this.time, mVTransaction.time)) != 0) || (compareTo2 = Boolean.valueOf(mo33213f()).compareTo(Boolean.valueOf(mVTransaction.mo33213f()))) != 0 || ((mo33213f() && (compareTo2 = this.amount.compareTo(mVTransaction.amount)) != 0) || (compareTo2 = Boolean.valueOf(mo33217i()).compareTo(Boolean.valueOf(mVTransaction.mo33217i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo33217i() || (compareTo = this.receiptUrl.compareTo(mVTransaction.receiptUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTransaction)) {
            return false;
        }
        MVTransaction mVTransaction = (MVTransaction) obj;
        boolean g = mo33214g();
        boolean g2 = mVTransaction.mo33214g();
        if ((g || g2) && (!g || !g2 || !this.image.mo26245a(mVTransaction.image))) {
            return false;
        }
        boolean h = mo33215h();
        boolean h2 = mVTransaction.mo33215h();
        if (((h || h2) && (!h || !h2 || !this.name.equals(mVTransaction.name))) || this.time != mVTransaction.time) {
            return false;
        }
        boolean f = mo33213f();
        boolean f2 = mVTransaction.mo33213f();
        if ((f || f2) && (!f || !f2 || !this.amount.mo26102a(mVTransaction.amount))) {
            return false;
        }
        boolean i = mo33217i();
        boolean i2 = mVTransaction.mo33217i();
        if ((i || i2) && (!i || !i2 || !this.receiptUrl.equals(mVTransaction.receiptUrl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33213f() {
        return this.amount != null;
    }

    /* renamed from: g */
    public final boolean mo33214g() {
        return this.image != null;
    }

    /* renamed from: h */
    public final boolean mo33215h() {
        return this.name != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33217i() {
        return this.receiptUrl != null;
    }

    /* renamed from: j */
    public final boolean mo33218j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo33219k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVTransaction(");
        if (mo33214g()) {
            sb.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("name:");
        String str = this.name;
        if (str == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("time:");
        C25541a.m63889t(sb, this.time, ", ", "amount:");
        MVCurrencyAmount mVCurrencyAmount = this.amount;
        if (mVCurrencyAmount == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVCurrencyAmount);
        }
        if (mo33217i()) {
            sb.append(", ");
            sb.append("receiptUrl:");
            String str2 = this.receiptUrl;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
