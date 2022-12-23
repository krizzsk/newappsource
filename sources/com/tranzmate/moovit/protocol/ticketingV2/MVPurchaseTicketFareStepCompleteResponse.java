package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVPurchaseTicketFareStepCompleteResponse implements TBase<MVPurchaseTicketFareStepCompleteResponse, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseTicketFareStepCompleteResponse> {

    /* renamed from: b */
    public static final C25113c f29049b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29050c = new C25113c("analyticKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29051d = new C25113c("step", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f29052e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29053f;
    public String analyticKey;
    public String contextId;
    public MVPurchaseTicketFareStep step;

    public enum _Fields implements C25085c {
        CONTEXT_ID(1, "contextId"),
        ANALYTIC_KEY(2, "analyticKey"),
        STEP(3, "step");
        
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
                return CONTEXT_ID;
            }
            if (i == 2) {
                return ANALYTIC_KEY;
            }
            if (i != 3) {
                return null;
            }
            return STEP;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteResponse$a */
    public static class C11000a extends C25239c<MVPurchaseTicketFareStepCompleteResponse> {
        public C11000a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareStepCompleteResponse mVPurchaseTicketFareStepCompleteResponse = (MVPurchaseTicketFareStepCompleteResponse) tBase;
            mVPurchaseTicketFareStepCompleteResponse.getClass();
            C25113c cVar = MVPurchaseTicketFareStepCompleteResponse.f29049b;
            gVar.mo61687K();
            if (mVPurchaseTicketFareStepCompleteResponse.contextId != null) {
                gVar.mo61711x(MVPurchaseTicketFareStepCompleteResponse.f29049b);
                gVar.mo61686J(mVPurchaseTicketFareStepCompleteResponse.contextId);
                gVar.mo61712y();
            }
            if (mVPurchaseTicketFareStepCompleteResponse.analyticKey != null) {
                gVar.mo61711x(MVPurchaseTicketFareStepCompleteResponse.f29050c);
                gVar.mo61686J(mVPurchaseTicketFareStepCompleteResponse.analyticKey);
                gVar.mo61712y();
            }
            if (mVPurchaseTicketFareStepCompleteResponse.step != null) {
                gVar.mo61711x(MVPurchaseTicketFareStepCompleteResponse.f29051d);
                mVPurchaseTicketFareStepCompleteResponse.step.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareStepCompleteResponse mVPurchaseTicketFareStepCompleteResponse = (MVPurchaseTicketFareStepCompleteResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseTicketFareStepCompleteResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVPurchaseTicketFareStep mVPurchaseTicketFareStep = new MVPurchaseTicketFareStep();
                            mVPurchaseTicketFareStepCompleteResponse.step = mVPurchaseTicketFareStep;
                            mVPurchaseTicketFareStep.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPurchaseTicketFareStepCompleteResponse.analyticKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPurchaseTicketFareStepCompleteResponse.contextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteResponse$b */
    public static class C11001b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11000a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteResponse$c */
    public static class C11002c extends C25240d<MVPurchaseTicketFareStepCompleteResponse> {
        public C11002c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareStepCompleteResponse mVPurchaseTicketFareStepCompleteResponse = (MVPurchaseTicketFareStepCompleteResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseTicketFareStepCompleteResponse.mo32877g()) {
                bitSet.set(0);
            }
            if (mVPurchaseTicketFareStepCompleteResponse.mo32876f()) {
                bitSet.set(1);
            }
            if (mVPurchaseTicketFareStepCompleteResponse.mo32878h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPurchaseTicketFareStepCompleteResponse.mo32877g()) {
                jVar.mo61686J(mVPurchaseTicketFareStepCompleteResponse.contextId);
            }
            if (mVPurchaseTicketFareStepCompleteResponse.mo32876f()) {
                jVar.mo61686J(mVPurchaseTicketFareStepCompleteResponse.analyticKey);
            }
            if (mVPurchaseTicketFareStepCompleteResponse.mo32878h()) {
                mVPurchaseTicketFareStepCompleteResponse.step.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareStepCompleteResponse mVPurchaseTicketFareStepCompleteResponse = (MVPurchaseTicketFareStepCompleteResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPurchaseTicketFareStepCompleteResponse.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPurchaseTicketFareStepCompleteResponse.analyticKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVPurchaseTicketFareStep mVPurchaseTicketFareStep = new MVPurchaseTicketFareStep();
                mVPurchaseTicketFareStepCompleteResponse.step = mVPurchaseTicketFareStep;
                mVPurchaseTicketFareStep.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteResponse$d */
    public static class C11003d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11002c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseTicketFareStepCompleteResponse");
        HashMap hashMap = new HashMap();
        f29052e = hashMap;
        hashMap.put(C25239c.class, new C11001b());
        hashMap.put(C25240d.class, new C11003d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANALYTIC_KEY, new FieldMetaData("analyticKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STEP, new FieldMetaData("step", (byte) 3, new StructMetaData(MVPurchaseTicketFareStep.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29053f = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseTicketFareStepCompleteResponse.class, unmodifiableMap);
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
        ((C25238b) f29052e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29052e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseTicketFareStepCompleteResponse mVPurchaseTicketFareStepCompleteResponse = (MVPurchaseTicketFareStepCompleteResponse) obj;
        if (!getClass().equals(mVPurchaseTicketFareStepCompleteResponse.getClass())) {
            return getClass().getName().compareTo(mVPurchaseTicketFareStepCompleteResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32877g()).compareTo(Boolean.valueOf(mVPurchaseTicketFareStepCompleteResponse.mo32877g()));
        if (compareTo2 != 0 || ((mo32877g() && (compareTo2 = this.contextId.compareTo(mVPurchaseTicketFareStepCompleteResponse.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo32876f()).compareTo(Boolean.valueOf(mVPurchaseTicketFareStepCompleteResponse.mo32876f()))) != 0 || ((mo32876f() && (compareTo2 = this.analyticKey.compareTo(mVPurchaseTicketFareStepCompleteResponse.analyticKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32878h()).compareTo(Boolean.valueOf(mVPurchaseTicketFareStepCompleteResponse.mo32878h()))) != 0))) {
            return compareTo2;
        }
        if (!mo32878h() || (compareTo = this.step.compareTo(mVPurchaseTicketFareStepCompleteResponse.step)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseTicketFareStepCompleteResponse)) {
            return false;
        }
        MVPurchaseTicketFareStepCompleteResponse mVPurchaseTicketFareStepCompleteResponse = (MVPurchaseTicketFareStepCompleteResponse) obj;
        boolean g = mo32877g();
        boolean g2 = mVPurchaseTicketFareStepCompleteResponse.mo32877g();
        if ((g || g2) && (!g || !g2 || !this.contextId.equals(mVPurchaseTicketFareStepCompleteResponse.contextId))) {
            return false;
        }
        boolean f = mo32876f();
        boolean f2 = mVPurchaseTicketFareStepCompleteResponse.mo32876f();
        if ((f || f2) && (!f || !f2 || !this.analyticKey.equals(mVPurchaseTicketFareStepCompleteResponse.analyticKey))) {
            return false;
        }
        boolean h = mo32878h();
        boolean h2 = mVPurchaseTicketFareStepCompleteResponse.mo32878h();
        if ((h || h2) && (!h || !h2 || !this.step.mo32865k(mVPurchaseTicketFareStepCompleteResponse.step))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32876f() {
        return this.analyticKey != null;
    }

    /* renamed from: g */
    public final boolean mo32877g() {
        return this.contextId != null;
    }

    /* renamed from: h */
    public final boolean mo32878h() {
        return this.step != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseTicketFareStepCompleteResponse(", "contextId:");
        String str = this.contextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("analyticKey:");
        String str2 = this.analyticKey;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("step:");
        MVPurchaseTicketFareStep mVPurchaseTicketFareStep = this.step;
        if (mVPurchaseTicketFareStep == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseTicketFareStep);
        }
        n.append(")");
        return n.toString();
    }
}
