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

public class MVMicroMobilityPurchaseIntentResponse implements TBase<MVMicroMobilityPurchaseIntentResponse, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseIntentResponse> {

    /* renamed from: b */
    public static final C25113c f26641b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26642c = new C25113c("analyticKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26643d = new C25113c("step", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f26644e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26645f;
    public String analyticKey;
    public String contextId;
    public MVMicroMobilityPurchaseStep step;

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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentResponse$a */
    public static class C9286a extends C25239c<MVMicroMobilityPurchaseIntentResponse> {
        public C9286a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseIntentResponse mVMicroMobilityPurchaseIntentResponse = (MVMicroMobilityPurchaseIntentResponse) tBase;
            mVMicroMobilityPurchaseIntentResponse.getClass();
            C25113c cVar = MVMicroMobilityPurchaseIntentResponse.f26641b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseIntentResponse.contextId != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseIntentResponse.f26641b);
                gVar.mo61686J(mVMicroMobilityPurchaseIntentResponse.contextId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseIntentResponse.analyticKey != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseIntentResponse.f26642c);
                gVar.mo61686J(mVMicroMobilityPurchaseIntentResponse.analyticKey);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseIntentResponse.step != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseIntentResponse.f26643d);
                mVMicroMobilityPurchaseIntentResponse.step.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseIntentResponse mVMicroMobilityPurchaseIntentResponse = (MVMicroMobilityPurchaseIntentResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchaseIntentResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVMicroMobilityPurchaseStep mVMicroMobilityPurchaseStep = new MVMicroMobilityPurchaseStep();
                            mVMicroMobilityPurchaseIntentResponse.step = mVMicroMobilityPurchaseStep;
                            mVMicroMobilityPurchaseStep.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityPurchaseIntentResponse.analyticKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityPurchaseIntentResponse.contextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentResponse$b */
    public static class C9287b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9286a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentResponse$c */
    public static class C9288c extends C25240d<MVMicroMobilityPurchaseIntentResponse> {
        public C9288c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseIntentResponse mVMicroMobilityPurchaseIntentResponse = (MVMicroMobilityPurchaseIntentResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseIntentResponse.mo28852g()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPurchaseIntentResponse.mo28851f()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityPurchaseIntentResponse.mo28853h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMicroMobilityPurchaseIntentResponse.mo28852g()) {
                jVar.mo61686J(mVMicroMobilityPurchaseIntentResponse.contextId);
            }
            if (mVMicroMobilityPurchaseIntentResponse.mo28851f()) {
                jVar.mo61686J(mVMicroMobilityPurchaseIntentResponse.analyticKey);
            }
            if (mVMicroMobilityPurchaseIntentResponse.mo28853h()) {
                mVMicroMobilityPurchaseIntentResponse.step.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseIntentResponse mVMicroMobilityPurchaseIntentResponse = (MVMicroMobilityPurchaseIntentResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVMicroMobilityPurchaseIntentResponse.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityPurchaseIntentResponse.analyticKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVMicroMobilityPurchaseStep mVMicroMobilityPurchaseStep = new MVMicroMobilityPurchaseStep();
                mVMicroMobilityPurchaseIntentResponse.step = mVMicroMobilityPurchaseStep;
                mVMicroMobilityPurchaseStep.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentResponse$d */
    public static class C9289d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9288c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseIntentResponse");
        HashMap hashMap = new HashMap();
        f26644e = hashMap;
        hashMap.put(C25239c.class, new C9287b());
        hashMap.put(C25240d.class, new C9289d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANALYTIC_KEY, new FieldMetaData("analyticKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STEP, new FieldMetaData("step", (byte) 3, new StructMetaData(MVMicroMobilityPurchaseStep.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26645f = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseIntentResponse.class, unmodifiableMap);
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
        ((C25238b) f26644e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26644e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchaseIntentResponse mVMicroMobilityPurchaseIntentResponse = (MVMicroMobilityPurchaseIntentResponse) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseIntentResponse.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseIntentResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28852g()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseIntentResponse.mo28852g()));
        if (compareTo2 != 0 || ((mo28852g() && (compareTo2 = this.contextId.compareTo(mVMicroMobilityPurchaseIntentResponse.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo28851f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseIntentResponse.mo28851f()))) != 0 || ((mo28851f() && (compareTo2 = this.analyticKey.compareTo(mVMicroMobilityPurchaseIntentResponse.analyticKey)) != 0) || (compareTo2 = Boolean.valueOf(mo28853h()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseIntentResponse.mo28853h()))) != 0))) {
            return compareTo2;
        }
        if (!mo28853h() || (compareTo = this.step.compareTo(mVMicroMobilityPurchaseIntentResponse.step)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchaseIntentResponse)) {
            return false;
        }
        MVMicroMobilityPurchaseIntentResponse mVMicroMobilityPurchaseIntentResponse = (MVMicroMobilityPurchaseIntentResponse) obj;
        boolean g = mo28852g();
        boolean g2 = mVMicroMobilityPurchaseIntentResponse.mo28852g();
        if ((g || g2) && (!g || !g2 || !this.contextId.equals(mVMicroMobilityPurchaseIntentResponse.contextId))) {
            return false;
        }
        boolean f = mo28851f();
        boolean f2 = mVMicroMobilityPurchaseIntentResponse.mo28851f();
        if ((f || f2) && (!f || !f2 || !this.analyticKey.equals(mVMicroMobilityPurchaseIntentResponse.analyticKey))) {
            return false;
        }
        boolean h = mo28853h();
        boolean h2 = mVMicroMobilityPurchaseIntentResponse.mo28853h();
        if ((h || h2) && (!h || !h2 || !this.step.mo28928k(mVMicroMobilityPurchaseIntentResponse.step))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28851f() {
        return this.analyticKey != null;
    }

    /* renamed from: g */
    public final boolean mo28852g() {
        return this.contextId != null;
    }

    /* renamed from: h */
    public final boolean mo28853h() {
        return this.step != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchaseIntentResponse(", "contextId:");
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
        MVMicroMobilityPurchaseStep mVMicroMobilityPurchaseStep = this.step;
        if (mVMicroMobilityPurchaseStep == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMicroMobilityPurchaseStep);
        }
        n.append(")");
        return n.toString();
    }
}
