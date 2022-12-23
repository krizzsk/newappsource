package com.tranzmate.moovit.protocol.payments;

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

public class MVBalanceInfo implements TBase<MVBalanceInfo, _Fields>, Serializable, Cloneable, Comparable<MVBalanceInfo> {

    /* renamed from: b */
    public static final C25113c f27131b = new C25113c("icon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27132c = new C25113c("caption", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27133d = new C25113c("balance", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f27134e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27135f;
    public MVCurrencyAmount balance;
    public String caption;
    public MVImageReferenceWithParams icon;

    public enum _Fields implements C25085c {
        ICON(1, "icon"),
        CAPTION(2, "caption"),
        BALANCE(3, "balance");
        
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
                return ICON;
            }
            if (i == 2) {
                return CAPTION;
            }
            if (i != 3) {
                return null;
            }
            return BALANCE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVBalanceInfo$a */
    public static class C9620a extends C25239c<MVBalanceInfo> {
        public C9620a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBalanceInfo mVBalanceInfo = (MVBalanceInfo) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVBalanceInfo.icon;
            C25113c cVar = MVBalanceInfo.f27131b;
            gVar.mo61687K();
            if (mVBalanceInfo.icon != null) {
                gVar.mo61711x(MVBalanceInfo.f27131b);
                mVBalanceInfo.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVBalanceInfo.caption != null) {
                gVar.mo61711x(MVBalanceInfo.f27132c);
                gVar.mo61686J(mVBalanceInfo.caption);
                gVar.mo61712y();
            }
            if (mVBalanceInfo.balance != null) {
                gVar.mo61711x(MVBalanceInfo.f27133d);
                mVBalanceInfo.balance.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBalanceInfo mVBalanceInfo = (MVBalanceInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVBalanceInfo.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVBalanceInfo.balance = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVBalanceInfo.caption = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                    mVBalanceInfo.icon = mVImageReferenceWithParams2;
                    mVImageReferenceWithParams2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVBalanceInfo$b */
    public static class C9621b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9620a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVBalanceInfo$c */
    public static class C9622c extends C25240d<MVBalanceInfo> {
        public C9622c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBalanceInfo mVBalanceInfo = (MVBalanceInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBalanceInfo.mo29627h()) {
                bitSet.set(0);
            }
            if (mVBalanceInfo.mo29626g()) {
                bitSet.set(1);
            }
            if (mVBalanceInfo.mo29625f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVBalanceInfo.mo29627h()) {
                mVBalanceInfo.icon.mo25202X0(jVar);
            }
            if (mVBalanceInfo.mo29626g()) {
                jVar.mo61686J(mVBalanceInfo.caption);
            }
            if (mVBalanceInfo.mo29625f()) {
                mVBalanceInfo.balance.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBalanceInfo mVBalanceInfo = (MVBalanceInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVBalanceInfo.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVBalanceInfo.caption = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVBalanceInfo.balance = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVBalanceInfo$d */
    public static class C9623d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9622c(0);
        }
    }

    static {
        new C17394d0("MVBalanceInfo");
        HashMap hashMap = new HashMap();
        f27134e = hashMap;
        hashMap.put(C25239c.class, new C9621b());
        hashMap.put(C25240d.class, new C9623d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.CAPTION, new FieldMetaData("caption", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BALANCE, new FieldMetaData("balance", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27135f = unmodifiableMap;
        FieldMetaData.m61947a(MVBalanceInfo.class, unmodifiableMap);
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
        ((C25238b) f27134e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27134e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBalanceInfo mVBalanceInfo = (MVBalanceInfo) obj;
        if (!getClass().equals(mVBalanceInfo.getClass())) {
            return getClass().getName().compareTo(mVBalanceInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29627h()).compareTo(Boolean.valueOf(mVBalanceInfo.mo29627h()));
        if (compareTo2 != 0 || ((mo29627h() && (compareTo2 = this.icon.compareTo(mVBalanceInfo.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo29626g()).compareTo(Boolean.valueOf(mVBalanceInfo.mo29626g()))) != 0 || ((mo29626g() && (compareTo2 = this.caption.compareTo(mVBalanceInfo.caption)) != 0) || (compareTo2 = Boolean.valueOf(mo29625f()).compareTo(Boolean.valueOf(mVBalanceInfo.mo29625f()))) != 0))) {
            return compareTo2;
        }
        if (!mo29625f() || (compareTo = this.balance.compareTo(mVBalanceInfo.balance)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBalanceInfo)) {
            return false;
        }
        MVBalanceInfo mVBalanceInfo = (MVBalanceInfo) obj;
        boolean h = mo29627h();
        boolean h2 = mVBalanceInfo.mo29627h();
        if ((h || h2) && (!h || !h2 || !this.icon.mo26245a(mVBalanceInfo.icon))) {
            return false;
        }
        boolean g = mo29626g();
        boolean g2 = mVBalanceInfo.mo29626g();
        if ((g || g2) && (!g || !g2 || !this.caption.equals(mVBalanceInfo.caption))) {
            return false;
        }
        boolean f = mo29625f();
        boolean f2 = mVBalanceInfo.mo29625f();
        if ((f || f2) && (!f || !f2 || !this.balance.mo26102a(mVBalanceInfo.balance))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29625f() {
        return this.balance != null;
    }

    /* renamed from: g */
    public final boolean mo29626g() {
        return this.caption != null;
    }

    /* renamed from: h */
    public final boolean mo29627h() {
        return this.icon != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBalanceInfo(", "icon:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("caption:");
        String str = this.caption;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("balance:");
        MVCurrencyAmount mVCurrencyAmount = this.balance;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(")");
        return n.toString();
    }
}
