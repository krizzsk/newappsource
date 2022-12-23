package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityPurchaseCompleteStepRequest implements TBase<MVMicroMobilityPurchaseCompleteStepRequest, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseCompleteStepRequest> {

    /* renamed from: b */
    public static final C25113c f26578b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26579c = new C25113c("currentStepResult", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f26580d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26581e;
    public String contextId;
    public MVMicroMobilityPurchaseStepResult currentStepResult;

    public enum _Fields implements C25085c {
        CONTEXT_ID(1, "contextId"),
        CURRENT_STEP_RESULT(2, "currentStepResult");
        
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
            return CURRENT_STEP_RESULT;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest$a */
    public static class C9248a extends C25239c<MVMicroMobilityPurchaseCompleteStepRequest> {
        public C9248a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseCompleteStepRequest mVMicroMobilityPurchaseCompleteStepRequest = (MVMicroMobilityPurchaseCompleteStepRequest) tBase;
            mVMicroMobilityPurchaseCompleteStepRequest.getClass();
            C25113c cVar = MVMicroMobilityPurchaseCompleteStepRequest.f26578b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseCompleteStepRequest.contextId != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseCompleteStepRequest.f26578b);
                gVar.mo61686J(mVMicroMobilityPurchaseCompleteStepRequest.contextId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseCompleteStepRequest.currentStepResult != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseCompleteStepRequest.f26579c);
                mVMicroMobilityPurchaseCompleteStepRequest.currentStepResult.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseCompleteStepRequest mVMicroMobilityPurchaseCompleteStepRequest = (MVMicroMobilityPurchaseCompleteStepRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchaseCompleteStepRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVMicroMobilityPurchaseStepResult mVMicroMobilityPurchaseStepResult = new MVMicroMobilityPurchaseStepResult();
                        mVMicroMobilityPurchaseCompleteStepRequest.currentStepResult = mVMicroMobilityPurchaseStepResult;
                        mVMicroMobilityPurchaseStepResult.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityPurchaseCompleteStepRequest.contextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest$b */
    public static class C9249b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9248a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest$c */
    public static class C9250c extends C25240d<MVMicroMobilityPurchaseCompleteStepRequest> {
        public C9250c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseCompleteStepRequest mVMicroMobilityPurchaseCompleteStepRequest = (MVMicroMobilityPurchaseCompleteStepRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseCompleteStepRequest.mo28767f()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPurchaseCompleteStepRequest.mo28768g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMicroMobilityPurchaseCompleteStepRequest.mo28767f()) {
                jVar.mo61686J(mVMicroMobilityPurchaseCompleteStepRequest.contextId);
            }
            if (mVMicroMobilityPurchaseCompleteStepRequest.mo28768g()) {
                mVMicroMobilityPurchaseCompleteStepRequest.currentStepResult.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseCompleteStepRequest mVMicroMobilityPurchaseCompleteStepRequest = (MVMicroMobilityPurchaseCompleteStepRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVMicroMobilityPurchaseCompleteStepRequest.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVMicroMobilityPurchaseStepResult mVMicroMobilityPurchaseStepResult = new MVMicroMobilityPurchaseStepResult();
                mVMicroMobilityPurchaseCompleteStepRequest.currentStepResult = mVMicroMobilityPurchaseStepResult;
                mVMicroMobilityPurchaseStepResult.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest$d */
    public static class C9251d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9250c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseCompleteStepRequest");
        HashMap hashMap = new HashMap();
        f26580d = hashMap;
        hashMap.put(C25239c.class, new C9249b());
        hashMap.put(C25240d.class, new C9251d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CURRENT_STEP_RESULT, new FieldMetaData("currentStepResult", (byte) 3, new StructMetaData(MVMicroMobilityPurchaseStepResult.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26581e = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseCompleteStepRequest.class, unmodifiableMap);
    }

    public MVMicroMobilityPurchaseCompleteStepRequest() {
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
        ((C25238b) f26580d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26580d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchaseCompleteStepRequest mVMicroMobilityPurchaseCompleteStepRequest = (MVMicroMobilityPurchaseCompleteStepRequest) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseCompleteStepRequest.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseCompleteStepRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28767f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseCompleteStepRequest.mo28767f()));
        if (compareTo2 != 0 || ((mo28767f() && (compareTo2 = this.contextId.compareTo(mVMicroMobilityPurchaseCompleteStepRequest.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo28768g()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseCompleteStepRequest.mo28768g()))) != 0)) {
            return compareTo2;
        }
        if (!mo28768g() || (compareTo = this.currentStepResult.compareTo(mVMicroMobilityPurchaseCompleteStepRequest.currentStepResult)) == 0) {
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
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest
            r2 = 1
            if (r1 == 0) goto L_0x0058
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest r6 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest) r6
            boolean r1 = r5.mo28767f()
            boolean r3 = r6.mo28767f()
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
            boolean r1 = r5.mo28768g()
            boolean r3 = r6.mo28768g()
            if (r1 != 0) goto L_0x0033
            if (r3 == 0) goto L_0x0057
        L_0x0033:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x0038
            goto L_0x0058
        L_0x0038:
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStepResult r1 = r5.currentStepResult
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStepResult r6 = r6.currentStepResult
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
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseCompleteStepRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo28767f() {
        return this.contextId != null;
    }

    /* renamed from: g */
    public final boolean mo28768g() {
        return this.currentStepResult != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchaseCompleteStepRequest(", "contextId:");
        String str = this.contextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("currentStepResult:");
        MVMicroMobilityPurchaseStepResult mVMicroMobilityPurchaseStepResult = this.currentStepResult;
        if (mVMicroMobilityPurchaseStepResult == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMicroMobilityPurchaseStepResult);
        }
        n.append(")");
        return n.toString();
    }

    public MVMicroMobilityPurchaseCompleteStepRequest(String str, MVMicroMobilityPurchaseStepResult mVMicroMobilityPurchaseStepResult) {
        this();
        this.contextId = str;
        this.currentStepResult = mVMicroMobilityPurchaseStepResult;
    }
}
