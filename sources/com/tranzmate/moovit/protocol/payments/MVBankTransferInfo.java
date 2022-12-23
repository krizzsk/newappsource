package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
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

public class MVBankTransferInfo implements TBase<MVBankTransferInfo, _Fields>, Serializable, Cloneable, Comparable<MVBankTransferInfo> {

    /* renamed from: b */
    public static final C25113c f27136b = new C25113c("bankName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27137c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27138d = new C25113c("accountNumberLastDigits", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f27139e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27140f;
    public String accountNumberLastDigits;
    public String bankName;
    public MVImageReferenceWithParams image;
    private _Fields[] optionals = {_Fields.ACCOUNT_NUMBER_LAST_DIGITS};

    public enum _Fields implements C25085c {
        BANK_NAME(1, "bankName"),
        IMAGE(2, "image"),
        ACCOUNT_NUMBER_LAST_DIGITS(3, "accountNumberLastDigits");
        
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
                return BANK_NAME;
            }
            if (i == 2) {
                return IMAGE;
            }
            if (i != 3) {
                return null;
            }
            return ACCOUNT_NUMBER_LAST_DIGITS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVBankTransferInfo$a */
    public static class C9624a extends C25239c<MVBankTransferInfo> {
        public C9624a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBankTransferInfo mVBankTransferInfo = (MVBankTransferInfo) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVBankTransferInfo.image;
            C25113c cVar = MVBankTransferInfo.f27136b;
            gVar.mo61687K();
            if (mVBankTransferInfo.bankName != null) {
                gVar.mo61711x(MVBankTransferInfo.f27136b);
                gVar.mo61686J(mVBankTransferInfo.bankName);
                gVar.mo61712y();
            }
            if (mVBankTransferInfo.image != null) {
                gVar.mo61711x(MVBankTransferInfo.f27137c);
                mVBankTransferInfo.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBankTransferInfo.accountNumberLastDigits != null && mVBankTransferInfo.mo29633f()) {
                gVar.mo61711x(MVBankTransferInfo.f27138d);
                gVar.mo61686J(mVBankTransferInfo.accountNumberLastDigits);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBankTransferInfo mVBankTransferInfo = (MVBankTransferInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVBankTransferInfo.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVBankTransferInfo.accountNumberLastDigits = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVBankTransferInfo.image = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVBankTransferInfo.bankName = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVBankTransferInfo$b */
    public static class C9625b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9624a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVBankTransferInfo$c */
    public static class C9626c extends C25240d<MVBankTransferInfo> {
        public C9626c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBankTransferInfo mVBankTransferInfo = (MVBankTransferInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBankTransferInfo.mo29634g()) {
                bitSet.set(0);
            }
            if (mVBankTransferInfo.mo29635h()) {
                bitSet.set(1);
            }
            if (mVBankTransferInfo.mo29633f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVBankTransferInfo.mo29634g()) {
                jVar.mo61686J(mVBankTransferInfo.bankName);
            }
            if (mVBankTransferInfo.mo29635h()) {
                mVBankTransferInfo.image.mo25202X0(jVar);
            }
            if (mVBankTransferInfo.mo29633f()) {
                jVar.mo61686J(mVBankTransferInfo.accountNumberLastDigits);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBankTransferInfo mVBankTransferInfo = (MVBankTransferInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVBankTransferInfo.bankName = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVBankTransferInfo.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVBankTransferInfo.accountNumberLastDigits = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVBankTransferInfo$d */
    public static class C9627d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9626c(0);
        }
    }

    static {
        new C17394d0("MVBankTransferInfo");
        HashMap hashMap = new HashMap();
        f27139e = hashMap;
        hashMap.put(C25239c.class, new C9625b());
        hashMap.put(C25240d.class, new C9627d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BANK_NAME, new FieldMetaData("bankName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.ACCOUNT_NUMBER_LAST_DIGITS, new FieldMetaData("accountNumberLastDigits", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27140f = unmodifiableMap;
        FieldMetaData.m61947a(MVBankTransferInfo.class, unmodifiableMap);
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
        ((C25238b) f27139e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27139e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBankTransferInfo mVBankTransferInfo = (MVBankTransferInfo) obj;
        if (!getClass().equals(mVBankTransferInfo.getClass())) {
            return getClass().getName().compareTo(mVBankTransferInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29634g()).compareTo(Boolean.valueOf(mVBankTransferInfo.mo29634g()));
        if (compareTo2 != 0 || ((mo29634g() && (compareTo2 = this.bankName.compareTo(mVBankTransferInfo.bankName)) != 0) || (compareTo2 = Boolean.valueOf(mo29635h()).compareTo(Boolean.valueOf(mVBankTransferInfo.mo29635h()))) != 0 || ((mo29635h() && (compareTo2 = this.image.compareTo(mVBankTransferInfo.image)) != 0) || (compareTo2 = Boolean.valueOf(mo29633f()).compareTo(Boolean.valueOf(mVBankTransferInfo.mo29633f()))) != 0))) {
            return compareTo2;
        }
        if (!mo29633f() || (compareTo = this.accountNumberLastDigits.compareTo(mVBankTransferInfo.accountNumberLastDigits)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBankTransferInfo)) {
            return false;
        }
        MVBankTransferInfo mVBankTransferInfo = (MVBankTransferInfo) obj;
        boolean g = mo29634g();
        boolean g2 = mVBankTransferInfo.mo29634g();
        if ((g || g2) && (!g || !g2 || !this.bankName.equals(mVBankTransferInfo.bankName))) {
            return false;
        }
        boolean h = mo29635h();
        boolean h2 = mVBankTransferInfo.mo29635h();
        if ((h || h2) && (!h || !h2 || !this.image.mo26245a(mVBankTransferInfo.image))) {
            return false;
        }
        boolean f = mo29633f();
        boolean f2 = mVBankTransferInfo.mo29633f();
        if ((f || f2) && (!f || !f2 || !this.accountNumberLastDigits.equals(mVBankTransferInfo.accountNumberLastDigits))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29633f() {
        return this.accountNumberLastDigits != null;
    }

    /* renamed from: g */
    public final boolean mo29634g() {
        return this.bankName != null;
    }

    /* renamed from: h */
    public final boolean mo29635h() {
        return this.image != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBankTransferInfo(", "bankName:");
        String str = this.bankName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("image:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        if (mo29633f()) {
            n.append(", ");
            n.append("accountNumberLastDigits:");
            String str2 = this.accountNumberLastDigits;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
