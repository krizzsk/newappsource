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

public class MVMicroMobilityActionResponse implements TBase<MVMicroMobilityActionResponse, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityActionResponse> {

    /* renamed from: b */
    public static final C25113c f26499b = new C25113c("result", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26500c = new C25113c("toast", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f26501d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26502e;
    private _Fields[] optionals = {_Fields.RESULT, _Fields.TOAST};
    public MVMicroMobilityActionResult result;
    public String toast;

    public enum _Fields implements C25085c {
        RESULT(1, "result"),
        TOAST(2, "toast");
        
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
                return RESULT;
            }
            if (i != 2) {
                return null;
            }
            return TOAST;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResponse$a */
    public static class C9194a extends C25239c<MVMicroMobilityActionResponse> {
        public C9194a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionResponse mVMicroMobilityActionResponse = (MVMicroMobilityActionResponse) tBase;
            mVMicroMobilityActionResponse.getClass();
            C25113c cVar = MVMicroMobilityActionResponse.f26499b;
            gVar.mo61687K();
            if (mVMicroMobilityActionResponse.result != null && mVMicroMobilityActionResponse.mo28637f()) {
                gVar.mo61711x(MVMicroMobilityActionResponse.f26499b);
                mVMicroMobilityActionResponse.result.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityActionResponse.toast != null && mVMicroMobilityActionResponse.mo28638g()) {
                gVar.mo61711x(MVMicroMobilityActionResponse.f26500c);
                gVar.mo61686J(mVMicroMobilityActionResponse.toast);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionResponse mVMicroMobilityActionResponse = (MVMicroMobilityActionResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityActionResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVMicroMobilityActionResponse.toast = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVMicroMobilityActionResult mVMicroMobilityActionResult = new MVMicroMobilityActionResult();
                    mVMicroMobilityActionResponse.result = mVMicroMobilityActionResult;
                    mVMicroMobilityActionResult.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResponse$b */
    public static class C9195b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9194a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResponse$c */
    public static class C9196c extends C25240d<MVMicroMobilityActionResponse> {
        public C9196c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionResponse mVMicroMobilityActionResponse = (MVMicroMobilityActionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityActionResponse.mo28637f()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityActionResponse.mo28638g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMicroMobilityActionResponse.mo28637f()) {
                mVMicroMobilityActionResponse.result.mo25202X0(jVar);
            }
            if (mVMicroMobilityActionResponse.mo28638g()) {
                jVar.mo61686J(mVMicroMobilityActionResponse.toast);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionResponse mVMicroMobilityActionResponse = (MVMicroMobilityActionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVMicroMobilityActionResult mVMicroMobilityActionResult = new MVMicroMobilityActionResult();
                mVMicroMobilityActionResponse.result = mVMicroMobilityActionResult;
                mVMicroMobilityActionResult.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVMicroMobilityActionResponse.toast = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResponse$d */
    public static class C9197d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9196c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityActionResponse");
        HashMap hashMap = new HashMap();
        f26501d = hashMap;
        hashMap.put(C25239c.class, new C9195b());
        hashMap.put(C25240d.class, new C9197d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RESULT, new FieldMetaData("result", (byte) 2, new StructMetaData(MVMicroMobilityActionResult.class)));
        enumMap.put(_Fields.TOAST, new FieldMetaData("toast", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26502e = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityActionResponse.class, unmodifiableMap);
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
        ((C25238b) f26501d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26501d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityActionResponse mVMicroMobilityActionResponse = (MVMicroMobilityActionResponse) obj;
        if (!getClass().equals(mVMicroMobilityActionResponse.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityActionResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28637f()).compareTo(Boolean.valueOf(mVMicroMobilityActionResponse.mo28637f()));
        if (compareTo2 != 0 || ((mo28637f() && (compareTo2 = this.result.compareTo(mVMicroMobilityActionResponse.result)) != 0) || (compareTo2 = Boolean.valueOf(mo28638g()).compareTo(Boolean.valueOf(mVMicroMobilityActionResponse.mo28638g()))) != 0)) {
            return compareTo2;
        }
        if (!mo28638g() || (compareTo = this.toast.compareTo(mVMicroMobilityActionResponse.toast)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResponse
            r2 = 1
            if (r1 == 0) goto L_0x0058
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResponse r7 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResponse) r7
            boolean r1 = r6.mo28637f()
            boolean r3 = r7.mo28637f()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x003b
        L_0x0017:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x001c
            goto L_0x0058
        L_0x001c:
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResult r1 = r6.result
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResult r3 = r7.result
            if (r3 == 0) goto L_0x0034
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x0037
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0037
            r1 = 1
            goto L_0x0038
        L_0x0034:
            r1.getClass()
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r1 != 0) goto L_0x003b
            goto L_0x0058
        L_0x003b:
            boolean r1 = r6.mo28638g()
            boolean r3 = r7.mo28638g()
            if (r1 != 0) goto L_0x0047
            if (r3 == 0) goto L_0x0057
        L_0x0047:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x004c
            goto L_0x0058
        L_0x004c:
            java.lang.String r1 = r6.toast
            java.lang.String r7 = r7.toast
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResponse.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo28637f() {
        return this.result != null;
    }

    /* renamed from: g */
    public final boolean mo28638g() {
        return this.toast != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVMicroMobilityActionResponse(");
        if (mo28637f()) {
            sb.append("result:");
            MVMicroMobilityActionResult mVMicroMobilityActionResult = this.result;
            if (mVMicroMobilityActionResult == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVMicroMobilityActionResult);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo28638g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("toast:");
            String str = this.toast;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
