package com.tranzmate.moovit.protocol.ptb.activations;

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

public class MVPTBAccountInfo implements TBase<MVPTBAccountInfo, _Fields>, Serializable, Cloneable, Comparable<MVPTBAccountInfo> {

    /* renamed from: b */
    public static final C25113c f27810b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27811c = new C25113c("fourDigits", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27812d = new C25113c("upcomingStatement", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f27813e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27814f;
    public String fourDigits;
    private _Fields[] optionals = {_Fields.FOUR_DIGITS, _Fields.UPCOMING_STATEMENT};
    public MVPTBPaymentMethodType type;
    public MVPTBBillingUpcomingStatement upcomingStatement;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        FOUR_DIGITS(2, "fourDigits"),
        UPCOMING_STATEMENT(3, "upcomingStatement");
        
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
                return TYPE;
            }
            if (i == 2) {
                return FOUR_DIGITS;
            }
            if (i != 3) {
                return null;
            }
            return UPCOMING_STATEMENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountInfo$a */
    public static class C10153a extends C25239c<MVPTBAccountInfo> {
        public C10153a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBAccountInfo mVPTBAccountInfo = (MVPTBAccountInfo) tBase;
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = mVPTBAccountInfo.upcomingStatement;
            if (mVPTBBillingUpcomingStatement != null) {
                mVPTBBillingUpcomingStatement.mo30883k();
            }
            C25113c cVar = MVPTBAccountInfo.f27810b;
            gVar.mo61687K();
            if (mVPTBAccountInfo.type != null) {
                gVar.mo61711x(MVPTBAccountInfo.f27810b);
                gVar.mo61678B(mVPTBAccountInfo.type.getValue());
                gVar.mo61712y();
            }
            if (mVPTBAccountInfo.fourDigits != null && mVPTBAccountInfo.mo30795f()) {
                gVar.mo61711x(MVPTBAccountInfo.f27811c);
                gVar.mo61686J(mVPTBAccountInfo.fourDigits);
                gVar.mo61712y();
            }
            if (mVPTBAccountInfo.upcomingStatement != null && mVPTBAccountInfo.mo30797h()) {
                gVar.mo61711x(MVPTBAccountInfo.f27812d);
                mVPTBAccountInfo.upcomingStatement.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBAccountInfo mVPTBAccountInfo = (MVPTBAccountInfo) tBase;
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
                            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = new MVPTBBillingUpcomingStatement();
                            mVPTBAccountInfo.upcomingStatement = mVPTBBillingUpcomingStatement;
                            mVPTBBillingUpcomingStatement.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPTBAccountInfo.fourDigits = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPTBAccountInfo.type = MVPTBPaymentMethodType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement2 = mVPTBAccountInfo.upcomingStatement;
            if (mVPTBBillingUpcomingStatement2 != null) {
                mVPTBBillingUpcomingStatement2.mo30883k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountInfo$b */
    public static class C10154b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10153a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountInfo$c */
    public static class C10155c extends C25240d<MVPTBAccountInfo> {
        public C10155c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBAccountInfo mVPTBAccountInfo = (MVPTBAccountInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBAccountInfo.mo30796g()) {
                bitSet.set(0);
            }
            if (mVPTBAccountInfo.mo30795f()) {
                bitSet.set(1);
            }
            if (mVPTBAccountInfo.mo30797h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPTBAccountInfo.mo30796g()) {
                jVar.mo61678B(mVPTBAccountInfo.type.getValue());
            }
            if (mVPTBAccountInfo.mo30795f()) {
                jVar.mo61686J(mVPTBAccountInfo.fourDigits);
            }
            if (mVPTBAccountInfo.mo30797h()) {
                mVPTBAccountInfo.upcomingStatement.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBAccountInfo mVPTBAccountInfo = (MVPTBAccountInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPTBAccountInfo.type = MVPTBPaymentMethodType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVPTBAccountInfo.fourDigits = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = new MVPTBBillingUpcomingStatement();
                mVPTBAccountInfo.upcomingStatement = mVPTBBillingUpcomingStatement;
                mVPTBBillingUpcomingStatement.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountInfo$d */
    public static class C10156d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10155c(0);
        }
    }

    static {
        new C17394d0("MVPTBAccountInfo");
        HashMap hashMap = new HashMap();
        f27813e = hashMap;
        hashMap.put(C25239c.class, new C10154b());
        hashMap.put(C25240d.class, new C10156d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVPTBPaymentMethodType.class)));
        enumMap.put(_Fields.FOUR_DIGITS, new FieldMetaData("fourDigits", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.UPCOMING_STATEMENT, new FieldMetaData("upcomingStatement", (byte) 2, new StructMetaData(MVPTBBillingUpcomingStatement.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27814f = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBAccountInfo.class, unmodifiableMap);
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
        ((C25238b) f27813e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27813e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30792a(MVPTBAccountInfo mVPTBAccountInfo) {
        if (mVPTBAccountInfo == null) {
            return false;
        }
        boolean g = mo30796g();
        boolean g2 = mVPTBAccountInfo.mo30796g();
        if ((g || g2) && (!g || !g2 || !this.type.equals(mVPTBAccountInfo.type))) {
            return false;
        }
        boolean f = mo30795f();
        boolean f2 = mVPTBAccountInfo.mo30795f();
        if ((f || f2) && (!f || !f2 || !this.fourDigits.equals(mVPTBAccountInfo.fourDigits))) {
            return false;
        }
        boolean h = mo30797h();
        boolean h2 = mVPTBAccountInfo.mo30797h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.upcomingStatement.mo30874a(mVPTBAccountInfo.upcomingStatement)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBAccountInfo mVPTBAccountInfo = (MVPTBAccountInfo) obj;
        if (!getClass().equals(mVPTBAccountInfo.getClass())) {
            return getClass().getName().compareTo(mVPTBAccountInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30796g()).compareTo(Boolean.valueOf(mVPTBAccountInfo.mo30796g()));
        if (compareTo2 != 0 || ((mo30796g() && (compareTo2 = this.type.compareTo(mVPTBAccountInfo.type)) != 0) || (compareTo2 = Boolean.valueOf(mo30795f()).compareTo(Boolean.valueOf(mVPTBAccountInfo.mo30795f()))) != 0 || ((mo30795f() && (compareTo2 = this.fourDigits.compareTo(mVPTBAccountInfo.fourDigits)) != 0) || (compareTo2 = Boolean.valueOf(mo30797h()).compareTo(Boolean.valueOf(mVPTBAccountInfo.mo30797h()))) != 0))) {
            return compareTo2;
        }
        if (!mo30797h() || (compareTo = this.upcomingStatement.compareTo(mVPTBAccountInfo.upcomingStatement)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPTBAccountInfo)) {
            return mo30792a((MVPTBAccountInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30795f() {
        return this.fourDigits != null;
    }

    /* renamed from: g */
    public final boolean mo30796g() {
        return this.type != null;
    }

    /* renamed from: h */
    public final boolean mo30797h() {
        return this.upcomingStatement != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBAccountInfo(", "type:");
        MVPTBPaymentMethodType mVPTBPaymentMethodType = this.type;
        if (mVPTBPaymentMethodType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBPaymentMethodType);
        }
        if (mo30795f()) {
            n.append(", ");
            n.append("fourDigits:");
            String str = this.fourDigits;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo30797h()) {
            n.append(", ");
            n.append("upcomingStatement:");
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = this.upcomingStatement;
            if (mVPTBBillingUpcomingStatement == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPTBBillingUpcomingStatement);
            }
        }
        n.append(")");
        return n.toString();
    }
}
