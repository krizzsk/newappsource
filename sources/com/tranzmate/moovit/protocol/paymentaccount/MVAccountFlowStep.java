package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowStep implements TBase<MVAccountFlowStep, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowStep> {

    /* renamed from: b */
    public static final C25113c f26980b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26981c = new C25113c("analyticKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26982d = new C25113c("stepContent", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f26983e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26984f;
    public String analyticKey;
    public String contextId;
    public MVAccountFlowStepContent stepContent;

    public enum _Fields implements C25085c {
        CONTEXT_ID(1, "contextId"),
        ANALYTIC_KEY(2, "analyticKey"),
        STEP_CONTENT(3, "stepContent");
        
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
            return STEP_CONTENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep$a */
    public static class C9522a extends C25239c<MVAccountFlowStep> {
        public C9522a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowStep mVAccountFlowStep = (MVAccountFlowStep) tBase;
            mVAccountFlowStep.getClass();
            C25113c cVar = MVAccountFlowStep.f26980b;
            gVar.mo61687K();
            if (mVAccountFlowStep.contextId != null) {
                gVar.mo61711x(MVAccountFlowStep.f26980b);
                gVar.mo61686J(mVAccountFlowStep.contextId);
                gVar.mo61712y();
            }
            if (mVAccountFlowStep.analyticKey != null) {
                gVar.mo61711x(MVAccountFlowStep.f26981c);
                gVar.mo61686J(mVAccountFlowStep.analyticKey);
                gVar.mo61712y();
            }
            if (mVAccountFlowStep.stepContent != null) {
                gVar.mo61711x(MVAccountFlowStep.f26982d);
                mVAccountFlowStep.stepContent.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowStep mVAccountFlowStep = (MVAccountFlowStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAccountFlowStep.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVAccountFlowStepContent mVAccountFlowStepContent = new MVAccountFlowStepContent();
                            mVAccountFlowStep.stepContent = mVAccountFlowStepContent;
                            mVAccountFlowStepContent.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAccountFlowStep.analyticKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAccountFlowStep.contextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep$b */
    public static class C9523b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9522a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep$c */
    public static class C9524c extends C25240d<MVAccountFlowStep> {
        public C9524c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowStep mVAccountFlowStep = (MVAccountFlowStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowStep.mo29401g()) {
                bitSet.set(0);
            }
            if (mVAccountFlowStep.mo29400f()) {
                bitSet.set(1);
            }
            if (mVAccountFlowStep.mo29402h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAccountFlowStep.mo29401g()) {
                jVar.mo61686J(mVAccountFlowStep.contextId);
            }
            if (mVAccountFlowStep.mo29400f()) {
                jVar.mo61686J(mVAccountFlowStep.analyticKey);
            }
            if (mVAccountFlowStep.mo29402h()) {
                mVAccountFlowStep.stepContent.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowStep mVAccountFlowStep = (MVAccountFlowStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVAccountFlowStep.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVAccountFlowStep.analyticKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVAccountFlowStepContent mVAccountFlowStepContent = new MVAccountFlowStepContent();
                mVAccountFlowStep.stepContent = mVAccountFlowStepContent;
                mVAccountFlowStepContent.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep$d */
    public static class C9525d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9524c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowStep");
        HashMap hashMap = new HashMap();
        f26983e = hashMap;
        hashMap.put(C25239c.class, new C9523b());
        hashMap.put(C25240d.class, new C9525d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANALYTIC_KEY, new FieldMetaData("analyticKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STEP_CONTENT, new FieldMetaData("stepContent", (byte) 3, new StructMetaData(MVAccountFlowStepContent.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26984f = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowStep.class, unmodifiableMap);
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
        ((C25238b) f26983e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26983e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29397a(com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5.mo29401g()
            boolean r2 = r6.mo29401g()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0020
        L_0x0010:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0015
            goto L_0x006e
        L_0x0015:
            java.lang.String r1 = r5.contextId
            java.lang.String r2 = r6.contextId
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            boolean r1 = r5.mo29400f()
            boolean r2 = r6.mo29400f()
            if (r1 != 0) goto L_0x002c
            if (r2 == 0) goto L_0x003c
        L_0x002c:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x0031
            goto L_0x006e
        L_0x0031:
            java.lang.String r1 = r5.analyticKey
            java.lang.String r2 = r6.analyticKey
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003c
            return r0
        L_0x003c:
            boolean r1 = r5.mo29402h()
            boolean r2 = r6.mo29402h()
            r3 = 1
            if (r1 != 0) goto L_0x0049
            if (r2 == 0) goto L_0x006d
        L_0x0049:
            if (r1 == 0) goto L_0x006e
            if (r2 != 0) goto L_0x004e
            goto L_0x006e
        L_0x004e:
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent r1 = r5.stepContent
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent r6 = r6.stepContent
            if (r6 == 0) goto L_0x0066
            F r2 = r1.setField_
            F r4 = r6.setField_
            if (r2 != r4) goto L_0x0069
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0066:
            r1.getClass()
        L_0x0069:
            r6 = 0
        L_0x006a:
            if (r6 != 0) goto L_0x006d
            return r0
        L_0x006d:
            return r3
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep.mo29397a(com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowStep mVAccountFlowStep = (MVAccountFlowStep) obj;
        if (!getClass().equals(mVAccountFlowStep.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29401g()).compareTo(Boolean.valueOf(mVAccountFlowStep.mo29401g()));
        if (compareTo2 != 0 || ((mo29401g() && (compareTo2 = this.contextId.compareTo(mVAccountFlowStep.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo29400f()).compareTo(Boolean.valueOf(mVAccountFlowStep.mo29400f()))) != 0 || ((mo29400f() && (compareTo2 = this.analyticKey.compareTo(mVAccountFlowStep.analyticKey)) != 0) || (compareTo2 = Boolean.valueOf(mo29402h()).compareTo(Boolean.valueOf(mVAccountFlowStep.mo29402h()))) != 0))) {
            return compareTo2;
        }
        if (!mo29402h() || (compareTo = this.stepContent.compareTo(mVAccountFlowStep.stepContent)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVAccountFlowStep)) {
            return mo29397a((MVAccountFlowStep) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29400f() {
        return this.analyticKey != null;
    }

    /* renamed from: g */
    public final boolean mo29401g() {
        return this.contextId != null;
    }

    /* renamed from: h */
    public final boolean mo29402h() {
        return this.stepContent != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowStep(", "contextId:");
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
        n.append("stepContent:");
        MVAccountFlowStepContent mVAccountFlowStepContent = this.stepContent;
        if (mVAccountFlowStepContent == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAccountFlowStepContent);
        }
        n.append(")");
        return n.toString();
    }
}
