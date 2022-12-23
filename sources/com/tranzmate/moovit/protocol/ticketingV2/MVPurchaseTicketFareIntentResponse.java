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

public class MVPurchaseTicketFareIntentResponse implements TBase<MVPurchaseTicketFareIntentResponse, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseTicketFareIntentResponse> {

    /* renamed from: b */
    public static final C25113c f29017b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29018c = new C25113c("analyticKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29019d = new C25113c("step", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f29020e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29021f;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareIntentResponse$a */
    public static class C10983a extends C25239c<MVPurchaseTicketFareIntentResponse> {
        public C10983a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareIntentResponse mVPurchaseTicketFareIntentResponse = (MVPurchaseTicketFareIntentResponse) tBase;
            mVPurchaseTicketFareIntentResponse.getClass();
            C25113c cVar = MVPurchaseTicketFareIntentResponse.f29017b;
            gVar.mo61687K();
            if (mVPurchaseTicketFareIntentResponse.contextId != null) {
                gVar.mo61711x(MVPurchaseTicketFareIntentResponse.f29017b);
                gVar.mo61686J(mVPurchaseTicketFareIntentResponse.contextId);
                gVar.mo61712y();
            }
            if (mVPurchaseTicketFareIntentResponse.analyticKey != null) {
                gVar.mo61711x(MVPurchaseTicketFareIntentResponse.f29018c);
                gVar.mo61686J(mVPurchaseTicketFareIntentResponse.analyticKey);
                gVar.mo61712y();
            }
            if (mVPurchaseTicketFareIntentResponse.step != null) {
                gVar.mo61711x(MVPurchaseTicketFareIntentResponse.f29019d);
                mVPurchaseTicketFareIntentResponse.step.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareIntentResponse mVPurchaseTicketFareIntentResponse = (MVPurchaseTicketFareIntentResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseTicketFareIntentResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVPurchaseTicketFareStep mVPurchaseTicketFareStep = new MVPurchaseTicketFareStep();
                            mVPurchaseTicketFareIntentResponse.step = mVPurchaseTicketFareStep;
                            mVPurchaseTicketFareStep.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPurchaseTicketFareIntentResponse.analyticKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPurchaseTicketFareIntentResponse.contextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareIntentResponse$b */
    public static class C10984b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10983a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareIntentResponse$c */
    public static class C10985c extends C25240d<MVPurchaseTicketFareIntentResponse> {
        public C10985c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareIntentResponse mVPurchaseTicketFareIntentResponse = (MVPurchaseTicketFareIntentResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseTicketFareIntentResponse.mo32842g()) {
                bitSet.set(0);
            }
            if (mVPurchaseTicketFareIntentResponse.mo32841f()) {
                bitSet.set(1);
            }
            if (mVPurchaseTicketFareIntentResponse.mo32843h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPurchaseTicketFareIntentResponse.mo32842g()) {
                jVar.mo61686J(mVPurchaseTicketFareIntentResponse.contextId);
            }
            if (mVPurchaseTicketFareIntentResponse.mo32841f()) {
                jVar.mo61686J(mVPurchaseTicketFareIntentResponse.analyticKey);
            }
            if (mVPurchaseTicketFareIntentResponse.mo32843h()) {
                mVPurchaseTicketFareIntentResponse.step.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareIntentResponse mVPurchaseTicketFareIntentResponse = (MVPurchaseTicketFareIntentResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPurchaseTicketFareIntentResponse.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPurchaseTicketFareIntentResponse.analyticKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVPurchaseTicketFareStep mVPurchaseTicketFareStep = new MVPurchaseTicketFareStep();
                mVPurchaseTicketFareIntentResponse.step = mVPurchaseTicketFareStep;
                mVPurchaseTicketFareStep.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareIntentResponse$d */
    public static class C10986d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10985c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseTicketFareIntentResponse");
        HashMap hashMap = new HashMap();
        f29020e = hashMap;
        hashMap.put(C25239c.class, new C10984b());
        hashMap.put(C25240d.class, new C10986d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANALYTIC_KEY, new FieldMetaData("analyticKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STEP, new FieldMetaData("step", (byte) 3, new StructMetaData(MVPurchaseTicketFareStep.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29021f = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseTicketFareIntentResponse.class, unmodifiableMap);
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
        ((C25238b) f29020e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29020e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseTicketFareIntentResponse mVPurchaseTicketFareIntentResponse = (MVPurchaseTicketFareIntentResponse) obj;
        if (!getClass().equals(mVPurchaseTicketFareIntentResponse.getClass())) {
            return getClass().getName().compareTo(mVPurchaseTicketFareIntentResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32842g()).compareTo(Boolean.valueOf(mVPurchaseTicketFareIntentResponse.mo32842g()));
        if (compareTo2 != 0 || ((mo32842g() && (compareTo2 = this.contextId.compareTo(mVPurchaseTicketFareIntentResponse.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo32841f()).compareTo(Boolean.valueOf(mVPurchaseTicketFareIntentResponse.mo32841f()))) != 0 || ((mo32841f() && (compareTo2 = this.analyticKey.compareTo(mVPurchaseTicketFareIntentResponse.analyticKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32843h()).compareTo(Boolean.valueOf(mVPurchaseTicketFareIntentResponse.mo32843h()))) != 0))) {
            return compareTo2;
        }
        if (!mo32843h() || (compareTo = this.step.compareTo(mVPurchaseTicketFareIntentResponse.step)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseTicketFareIntentResponse)) {
            return false;
        }
        MVPurchaseTicketFareIntentResponse mVPurchaseTicketFareIntentResponse = (MVPurchaseTicketFareIntentResponse) obj;
        boolean g = mo32842g();
        boolean g2 = mVPurchaseTicketFareIntentResponse.mo32842g();
        if ((g || g2) && (!g || !g2 || !this.contextId.equals(mVPurchaseTicketFareIntentResponse.contextId))) {
            return false;
        }
        boolean f = mo32841f();
        boolean f2 = mVPurchaseTicketFareIntentResponse.mo32841f();
        if ((f || f2) && (!f || !f2 || !this.analyticKey.equals(mVPurchaseTicketFareIntentResponse.analyticKey))) {
            return false;
        }
        boolean h = mo32843h();
        boolean h2 = mVPurchaseTicketFareIntentResponse.mo32843h();
        if ((h || h2) && (!h || !h2 || !this.step.mo32865k(mVPurchaseTicketFareIntentResponse.step))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32841f() {
        return this.analyticKey != null;
    }

    /* renamed from: g */
    public final boolean mo32842g() {
        return this.contextId != null;
    }

    /* renamed from: h */
    public final boolean mo32843h() {
        return this.step != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseTicketFareIntentResponse(", "contextId:");
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
