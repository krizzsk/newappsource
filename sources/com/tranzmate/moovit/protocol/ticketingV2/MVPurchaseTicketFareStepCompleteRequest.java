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

public class MVPurchaseTicketFareStepCompleteRequest implements TBase<MVPurchaseTicketFareStepCompleteRequest, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseTicketFareStepCompleteRequest> {

    /* renamed from: b */
    public static final C25113c f29045b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29046c = new C25113c("stepsResult", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29047d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29048e;
    public String contextId;
    public MVPurchaseTicketFareStepResult stepsResult;

    public enum _Fields implements C25085c {
        CONTEXT_ID(1, "contextId"),
        STEPS_RESULT(2, "stepsResult");
        
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
            if (i != 2) {
                return null;
            }
            return STEPS_RESULT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteRequest$a */
    public static class C10996a extends C25239c<MVPurchaseTicketFareStepCompleteRequest> {
        public C10996a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareStepCompleteRequest mVPurchaseTicketFareStepCompleteRequest = (MVPurchaseTicketFareStepCompleteRequest) tBase;
            mVPurchaseTicketFareStepCompleteRequest.getClass();
            C25113c cVar = MVPurchaseTicketFareStepCompleteRequest.f29045b;
            gVar.mo61687K();
            if (mVPurchaseTicketFareStepCompleteRequest.contextId != null) {
                gVar.mo61711x(MVPurchaseTicketFareStepCompleteRequest.f29045b);
                gVar.mo61686J(mVPurchaseTicketFareStepCompleteRequest.contextId);
                gVar.mo61712y();
            }
            if (mVPurchaseTicketFareStepCompleteRequest.stepsResult != null) {
                gVar.mo61711x(MVPurchaseTicketFareStepCompleteRequest.f29046c);
                mVPurchaseTicketFareStepCompleteRequest.stepsResult.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareStepCompleteRequest mVPurchaseTicketFareStepCompleteRequest = (MVPurchaseTicketFareStepCompleteRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseTicketFareStepCompleteRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = new MVPurchaseTicketFareStepResult();
                        mVPurchaseTicketFareStepCompleteRequest.stepsResult = mVPurchaseTicketFareStepResult;
                        mVPurchaseTicketFareStepResult.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPurchaseTicketFareStepCompleteRequest.contextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteRequest$b */
    public static class C10997b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10996a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteRequest$c */
    public static class C10998c extends C25240d<MVPurchaseTicketFareStepCompleteRequest> {
        public C10998c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareStepCompleteRequest mVPurchaseTicketFareStepCompleteRequest = (MVPurchaseTicketFareStepCompleteRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseTicketFareStepCompleteRequest.mo32869f()) {
                bitSet.set(0);
            }
            if (mVPurchaseTicketFareStepCompleteRequest.mo32870g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPurchaseTicketFareStepCompleteRequest.mo32869f()) {
                jVar.mo61686J(mVPurchaseTicketFareStepCompleteRequest.contextId);
            }
            if (mVPurchaseTicketFareStepCompleteRequest.mo32870g()) {
                mVPurchaseTicketFareStepCompleteRequest.stepsResult.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareStepCompleteRequest mVPurchaseTicketFareStepCompleteRequest = (MVPurchaseTicketFareStepCompleteRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPurchaseTicketFareStepCompleteRequest.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = new MVPurchaseTicketFareStepResult();
                mVPurchaseTicketFareStepCompleteRequest.stepsResult = mVPurchaseTicketFareStepResult;
                mVPurchaseTicketFareStepResult.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteRequest$d */
    public static class C10999d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10998c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseTicketFareStepCompleteRequest");
        HashMap hashMap = new HashMap();
        f29047d = hashMap;
        hashMap.put(C25239c.class, new C10997b());
        hashMap.put(C25240d.class, new C10999d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STEPS_RESULT, new FieldMetaData("stepsResult", (byte) 3, new StructMetaData(MVPurchaseTicketFareStepResult.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29048e = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseTicketFareStepCompleteRequest.class, unmodifiableMap);
    }

    public MVPurchaseTicketFareStepCompleteRequest() {
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
        ((C25238b) f29047d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29047d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseTicketFareStepCompleteRequest mVPurchaseTicketFareStepCompleteRequest = (MVPurchaseTicketFareStepCompleteRequest) obj;
        if (!getClass().equals(mVPurchaseTicketFareStepCompleteRequest.getClass())) {
            return getClass().getName().compareTo(mVPurchaseTicketFareStepCompleteRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32869f()).compareTo(Boolean.valueOf(mVPurchaseTicketFareStepCompleteRequest.mo32869f()));
        if (compareTo2 != 0 || ((mo32869f() && (compareTo2 = this.contextId.compareTo(mVPurchaseTicketFareStepCompleteRequest.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo32870g()).compareTo(Boolean.valueOf(mVPurchaseTicketFareStepCompleteRequest.mo32870g()))) != 0)) {
            return compareTo2;
        }
        if (!mo32870g() || (compareTo = this.stepsResult.compareTo(mVPurchaseTicketFareStepCompleteRequest.stepsResult)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteRequest
            r2 = 1
            if (r1 == 0) goto L_0x0058
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteRequest r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteRequest) r6
            boolean r1 = r5.mo32869f()
            boolean r3 = r6.mo32869f()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0027
        L_0x0017:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x001c
            goto L_0x0058
        L_0x001c:
            java.lang.String r1 = r5.contextId
            java.lang.String r3 = r6.contextId
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0027
            goto L_0x0058
        L_0x0027:
            boolean r1 = r5.mo32870g()
            boolean r3 = r6.mo32870g()
            if (r1 != 0) goto L_0x0033
            if (r3 == 0) goto L_0x0057
        L_0x0033:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x0038
            goto L_0x0058
        L_0x0038:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult r1 = r5.stepsResult
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult r6 = r6.stepsResult
            if (r6 == 0) goto L_0x0050
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x0053
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0053
            r6 = 1
            goto L_0x0054
        L_0x0050:
            r1.getClass()
        L_0x0053:
            r6 = 0
        L_0x0054:
            if (r6 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo32869f() {
        return this.contextId != null;
    }

    /* renamed from: g */
    public final boolean mo32870g() {
        return this.stepsResult != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseTicketFareStepCompleteRequest(", "contextId:");
        String str = this.contextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("stepsResult:");
        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = this.stepsResult;
        if (mVPurchaseTicketFareStepResult == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseTicketFareStepResult);
        }
        n.append(")");
        return n.toString();
    }

    public MVPurchaseTicketFareStepCompleteRequest(String str, MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult) {
        this();
        this.contextId = str;
        this.stepsResult = mVPurchaseTicketFareStepResult;
    }
}
