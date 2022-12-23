package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.payments.MVCreditCardInstructions;
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

public class MVPTBExternalAccountInfoResponse implements TBase<MVPTBExternalAccountInfoResponse, _Fields>, Serializable, Cloneable, Comparable<MVPTBExternalAccountInfoResponse> {

    /* renamed from: b */
    public static final C25113c f27870b = new C25113c("info", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27871c = new C25113c("changeCreditCardInstructions", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27872d = new C25113c("accountStatus", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f27873e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27874f;
    public MVPTBAccountContextStatus accountStatus;
    public MVCreditCardInstructions changeCreditCardInstructions;
    public MVPTBAccountInfo info;
    private _Fields[] optionals = {_Fields.CHANGE_CREDIT_CARD_INSTRUCTIONS};

    public enum _Fields implements C25085c {
        INFO(1, "info"),
        CHANGE_CREDIT_CARD_INSTRUCTIONS(2, "changeCreditCardInstructions"),
        ACCOUNT_STATUS(3, "accountStatus");
        
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
                return INFO;
            }
            if (i == 2) {
                return CHANGE_CREDIT_CARD_INSTRUCTIONS;
            }
            if (i != 3) {
                return null;
            }
            return ACCOUNT_STATUS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBExternalAccountInfoResponse$a */
    public static class C10189a extends C25239c<MVPTBExternalAccountInfoResponse> {
        public C10189a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement;
            MVPTBExternalAccountInfoResponse mVPTBExternalAccountInfoResponse = (MVPTBExternalAccountInfoResponse) tBase;
            MVPTBAccountInfo mVPTBAccountInfo = mVPTBExternalAccountInfoResponse.info;
            if (!(mVPTBAccountInfo == null || (mVPTBBillingUpcomingStatement = mVPTBAccountInfo.upcomingStatement) == null)) {
                mVPTBBillingUpcomingStatement.mo30883k();
            }
            MVCreditCardInstructions mVCreditCardInstructions = mVPTBExternalAccountInfoResponse.changeCreditCardInstructions;
            if (mVCreditCardInstructions != null) {
                mVCreditCardInstructions.mo29771h();
            }
            C25113c cVar = MVPTBExternalAccountInfoResponse.f27870b;
            gVar.mo61687K();
            if (mVPTBExternalAccountInfoResponse.info != null) {
                gVar.mo61711x(MVPTBExternalAccountInfoResponse.f27870b);
                mVPTBExternalAccountInfoResponse.info.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBExternalAccountInfoResponse.changeCreditCardInstructions != null && mVPTBExternalAccountInfoResponse.mo30907g()) {
                gVar.mo61711x(MVPTBExternalAccountInfoResponse.f27871c);
                mVPTBExternalAccountInfoResponse.changeCreditCardInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBExternalAccountInfoResponse.accountStatus != null) {
                gVar.mo61711x(MVPTBExternalAccountInfoResponse.f27872d);
                mVPTBExternalAccountInfoResponse.accountStatus.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement;
            MVPTBExternalAccountInfoResponse mVPTBExternalAccountInfoResponse = (MVPTBExternalAccountInfoResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVPTBAccountContextStatus mVPTBAccountContextStatus = new MVPTBAccountContextStatus();
                            mVPTBExternalAccountInfoResponse.accountStatus = mVPTBAccountContextStatus;
                            mVPTBAccountContextStatus.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                        mVPTBExternalAccountInfoResponse.changeCreditCardInstructions = mVCreditCardInstructions;
                        mVCreditCardInstructions.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPTBAccountInfo mVPTBAccountInfo = new MVPTBAccountInfo();
                    mVPTBExternalAccountInfoResponse.info = mVPTBAccountInfo;
                    mVPTBAccountInfo.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPTBAccountInfo mVPTBAccountInfo2 = mVPTBExternalAccountInfoResponse.info;
            if (!(mVPTBAccountInfo2 == null || (mVPTBBillingUpcomingStatement = mVPTBAccountInfo2.upcomingStatement) == null)) {
                mVPTBBillingUpcomingStatement.mo30883k();
            }
            MVCreditCardInstructions mVCreditCardInstructions2 = mVPTBExternalAccountInfoResponse.changeCreditCardInstructions;
            if (mVCreditCardInstructions2 != null) {
                mVCreditCardInstructions2.mo29771h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBExternalAccountInfoResponse$b */
    public static class C10190b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10189a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBExternalAccountInfoResponse$c */
    public static class C10191c extends C25240d<MVPTBExternalAccountInfoResponse> {
        public C10191c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBExternalAccountInfoResponse mVPTBExternalAccountInfoResponse = (MVPTBExternalAccountInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBExternalAccountInfoResponse.mo30908h()) {
                bitSet.set(0);
            }
            if (mVPTBExternalAccountInfoResponse.mo30907g()) {
                bitSet.set(1);
            }
            if (mVPTBExternalAccountInfoResponse.mo30906f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPTBExternalAccountInfoResponse.mo30908h()) {
                mVPTBExternalAccountInfoResponse.info.mo25202X0(jVar);
            }
            if (mVPTBExternalAccountInfoResponse.mo30907g()) {
                mVPTBExternalAccountInfoResponse.changeCreditCardInstructions.mo25202X0(jVar);
            }
            if (mVPTBExternalAccountInfoResponse.mo30906f()) {
                mVPTBExternalAccountInfoResponse.accountStatus.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBExternalAccountInfoResponse mVPTBExternalAccountInfoResponse = (MVPTBExternalAccountInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVPTBAccountInfo mVPTBAccountInfo = new MVPTBAccountInfo();
                mVPTBExternalAccountInfoResponse.info = mVPTBAccountInfo;
                mVPTBAccountInfo.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                mVPTBExternalAccountInfoResponse.changeCreditCardInstructions = mVCreditCardInstructions;
                mVCreditCardInstructions.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVPTBAccountContextStatus mVPTBAccountContextStatus = new MVPTBAccountContextStatus();
                mVPTBExternalAccountInfoResponse.accountStatus = mVPTBAccountContextStatus;
                mVPTBAccountContextStatus.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBExternalAccountInfoResponse$d */
    public static class C10192d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10191c(0);
        }
    }

    static {
        new C17394d0("MVPTBExternalAccountInfoResponse");
        HashMap hashMap = new HashMap();
        f27873e = hashMap;
        hashMap.put(C25239c.class, new C10190b());
        hashMap.put(C25240d.class, new C10192d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.INFO, new FieldMetaData("info", (byte) 3, new StructMetaData(MVPTBAccountInfo.class)));
        enumMap.put(_Fields.CHANGE_CREDIT_CARD_INSTRUCTIONS, new FieldMetaData("changeCreditCardInstructions", (byte) 2, new StructMetaData(MVCreditCardInstructions.class)));
        enumMap.put(_Fields.ACCOUNT_STATUS, new FieldMetaData("accountStatus", (byte) 3, new StructMetaData(MVPTBAccountContextStatus.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27874f = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBExternalAccountInfoResponse.class, unmodifiableMap);
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
        ((C25238b) f27873e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27873e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBExternalAccountInfoResponse mVPTBExternalAccountInfoResponse = (MVPTBExternalAccountInfoResponse) obj;
        if (!getClass().equals(mVPTBExternalAccountInfoResponse.getClass())) {
            return getClass().getName().compareTo(mVPTBExternalAccountInfoResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30908h()).compareTo(Boolean.valueOf(mVPTBExternalAccountInfoResponse.mo30908h()));
        if (compareTo2 != 0 || ((mo30908h() && (compareTo2 = this.info.compareTo(mVPTBExternalAccountInfoResponse.info)) != 0) || (compareTo2 = Boolean.valueOf(mo30907g()).compareTo(Boolean.valueOf(mVPTBExternalAccountInfoResponse.mo30907g()))) != 0 || ((mo30907g() && (compareTo2 = this.changeCreditCardInstructions.compareTo(mVPTBExternalAccountInfoResponse.changeCreditCardInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30906f()).compareTo(Boolean.valueOf(mVPTBExternalAccountInfoResponse.mo30906f()))) != 0))) {
            return compareTo2;
        }
        if (!mo30906f() || (compareTo = this.accountStatus.compareTo(mVPTBExternalAccountInfoResponse.accountStatus)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBExternalAccountInfoResponse)) {
            return false;
        }
        MVPTBExternalAccountInfoResponse mVPTBExternalAccountInfoResponse = (MVPTBExternalAccountInfoResponse) obj;
        boolean h = mo30908h();
        boolean h2 = mVPTBExternalAccountInfoResponse.mo30908h();
        if ((h || h2) && (!h || !h2 || !this.info.mo30792a(mVPTBExternalAccountInfoResponse.info))) {
            return false;
        }
        boolean g = mo30907g();
        boolean g2 = mVPTBExternalAccountInfoResponse.mo30907g();
        if ((g || g2) && (!g || !g2 || !this.changeCreditCardInstructions.mo29766a(mVPTBExternalAccountInfoResponse.changeCreditCardInstructions))) {
            return false;
        }
        boolean f = mo30906f();
        boolean f2 = mVPTBExternalAccountInfoResponse.mo30906f();
        if ((f || f2) && (!f || !f2 || !this.accountStatus.mo30784a(mVPTBExternalAccountInfoResponse.accountStatus))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30906f() {
        return this.accountStatus != null;
    }

    /* renamed from: g */
    public final boolean mo30907g() {
        return this.changeCreditCardInstructions != null;
    }

    /* renamed from: h */
    public final boolean mo30908h() {
        return this.info != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBExternalAccountInfoResponse(", "info:");
        MVPTBAccountInfo mVPTBAccountInfo = this.info;
        if (mVPTBAccountInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBAccountInfo);
        }
        if (mo30907g()) {
            n.append(", ");
            n.append("changeCreditCardInstructions:");
            MVCreditCardInstructions mVCreditCardInstructions = this.changeCreditCardInstructions;
            if (mVCreditCardInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCreditCardInstructions);
            }
        }
        n.append(", ");
        n.append("accountStatus:");
        MVPTBAccountContextStatus mVPTBAccountContextStatus = this.accountStatus;
        if (mVPTBAccountContextStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBAccountContextStatus);
        }
        n.append(")");
        return n.toString();
    }
}
