package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVPTBBillingStatementResponse implements TBase<MVPTBBillingStatementResponse, _Fields>, Serializable, Cloneable, Comparable<MVPTBBillingStatementResponse> {

    /* renamed from: b */
    public static final C25113c f27852b = new C25113c("upcomingStatement", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27853c = new C25113c("pastStatement", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f27854d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27855e;
    public List<MVPTBBillingFinalizedStatement> pastStatement;
    public MVPTBBillingUpcomingStatement upcomingStatement;

    public enum _Fields implements C25085c {
        UPCOMING_STATEMENT(1, "upcomingStatement"),
        PAST_STATEMENT(2, "pastStatement");
        
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
                return UPCOMING_STATEMENT;
            }
            if (i != 2) {
                return null;
            }
            return PAST_STATEMENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementResponse$a */
    public static class C10173a extends C25239c<MVPTBBillingStatementResponse> {
        public C10173a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingStatementResponse mVPTBBillingStatementResponse = (MVPTBBillingStatementResponse) tBase;
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = mVPTBBillingStatementResponse.upcomingStatement;
            if (mVPTBBillingUpcomingStatement != null) {
                mVPTBBillingUpcomingStatement.mo30883k();
            }
            C25113c cVar = MVPTBBillingStatementResponse.f27852b;
            gVar.mo61687K();
            if (mVPTBBillingStatementResponse.upcomingStatement != null) {
                gVar.mo61711x(MVPTBBillingStatementResponse.f27852b);
                mVPTBBillingStatementResponse.upcomingStatement.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBBillingStatementResponse.pastStatement != null) {
                gVar.mo61711x(MVPTBBillingStatementResponse.f27853c);
                gVar.mo61680D(new C25119e((byte) 12, mVPTBBillingStatementResponse.pastStatement.size()));
                for (MVPTBBillingFinalizedStatement X0 : mVPTBBillingStatementResponse.pastStatement) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingStatementResponse mVPTBBillingStatementResponse = (MVPTBBillingStatementResponse) tBase;
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVPTBBillingStatementResponse.pastStatement = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVPTBBillingFinalizedStatement mVPTBBillingFinalizedStatement = new MVPTBBillingFinalizedStatement();
                            mVPTBBillingFinalizedStatement.mo25201C1(gVar);
                            mVPTBBillingStatementResponse.pastStatement.add(mVPTBBillingFinalizedStatement);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = new MVPTBBillingUpcomingStatement();
                    mVPTBBillingStatementResponse.upcomingStatement = mVPTBBillingUpcomingStatement;
                    mVPTBBillingUpcomingStatement.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement2 = mVPTBBillingStatementResponse.upcomingStatement;
            if (mVPTBBillingUpcomingStatement2 != null) {
                mVPTBBillingUpcomingStatement2.mo30883k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementResponse$b */
    public static class C10174b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10173a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementResponse$c */
    public static class C10175c extends C25240d<MVPTBBillingStatementResponse> {
        public C10175c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingStatementResponse mVPTBBillingStatementResponse = (MVPTBBillingStatementResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBBillingStatementResponse.mo30870g()) {
                bitSet.set(0);
            }
            if (mVPTBBillingStatementResponse.mo30869f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPTBBillingStatementResponse.mo30870g()) {
                mVPTBBillingStatementResponse.upcomingStatement.mo25202X0(jVar);
            }
            if (mVPTBBillingStatementResponse.mo30869f()) {
                jVar.mo61678B(mVPTBBillingStatementResponse.pastStatement.size());
                for (MVPTBBillingFinalizedStatement X0 : mVPTBBillingStatementResponse.pastStatement) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingStatementResponse mVPTBBillingStatementResponse = (MVPTBBillingStatementResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = new MVPTBBillingUpcomingStatement();
                mVPTBBillingStatementResponse.upcomingStatement = mVPTBBillingUpcomingStatement;
                mVPTBBillingUpcomingStatement.mo25201C1(jVar);
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPTBBillingStatementResponse.pastStatement = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPTBBillingFinalizedStatement mVPTBBillingFinalizedStatement = new MVPTBBillingFinalizedStatement();
                    mVPTBBillingFinalizedStatement.mo25201C1(jVar);
                    mVPTBBillingStatementResponse.pastStatement.add(mVPTBBillingFinalizedStatement);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementResponse$d */
    public static class C10176d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10175c(0);
        }
    }

    static {
        new C17394d0("MVPTBBillingStatementResponse");
        HashMap hashMap = new HashMap();
        f27854d = hashMap;
        hashMap.put(C25239c.class, new C10174b());
        hashMap.put(C25240d.class, new C10176d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.UPCOMING_STATEMENT, new FieldMetaData("upcomingStatement", (byte) 3, new StructMetaData(MVPTBBillingUpcomingStatement.class)));
        enumMap.put(_Fields.PAST_STATEMENT, new FieldMetaData("pastStatement", (byte) 3, new ListMetaData(new StructMetaData(MVPTBBillingFinalizedStatement.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27855e = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBBillingStatementResponse.class, unmodifiableMap);
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
        ((C25238b) f27854d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27854d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPTBBillingStatementResponse mVPTBBillingStatementResponse = (MVPTBBillingStatementResponse) obj;
        if (!getClass().equals(mVPTBBillingStatementResponse.getClass())) {
            return getClass().getName().compareTo(mVPTBBillingStatementResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30870g()).compareTo(Boolean.valueOf(mVPTBBillingStatementResponse.mo30870g()));
        if (compareTo != 0 || ((mo30870g() && (compareTo = this.upcomingStatement.compareTo(mVPTBBillingStatementResponse.upcomingStatement)) != 0) || (compareTo = Boolean.valueOf(mo30869f()).compareTo(Boolean.valueOf(mVPTBBillingStatementResponse.mo30869f()))) != 0)) {
            return compareTo;
        }
        if (!mo30869f() || (h = C25082a.m62844h(this.pastStatement, mVPTBBillingStatementResponse.pastStatement)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBBillingStatementResponse)) {
            return false;
        }
        MVPTBBillingStatementResponse mVPTBBillingStatementResponse = (MVPTBBillingStatementResponse) obj;
        boolean g = mo30870g();
        boolean g2 = mVPTBBillingStatementResponse.mo30870g();
        if ((g || g2) && (!g || !g2 || !this.upcomingStatement.mo30874a(mVPTBBillingStatementResponse.upcomingStatement))) {
            return false;
        }
        boolean f = mo30869f();
        boolean f2 = mVPTBBillingStatementResponse.mo30869f();
        if ((f || f2) && (!f || !f2 || !this.pastStatement.equals(mVPTBBillingStatementResponse.pastStatement))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30869f() {
        return this.pastStatement != null;
    }

    /* renamed from: g */
    public final boolean mo30870g() {
        return this.upcomingStatement != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBBillingStatementResponse(", "upcomingStatement:");
        MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement = this.upcomingStatement;
        if (mVPTBBillingUpcomingStatement == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBBillingUpcomingStatement);
        }
        n.append(", ");
        n.append("pastStatement:");
        List<MVPTBBillingFinalizedStatement> list = this.pastStatement;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
