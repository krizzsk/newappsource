package com.tranzmate.moovit.protocol.ridesharing;

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

public class MVEmployeeRegistrationStepsResponse implements TBase<MVEmployeeRegistrationStepsResponse, _Fields>, Serializable, Cloneable, Comparable<MVEmployeeRegistrationStepsResponse> {

    /* renamed from: b */
    public static final C25113c f27992b = new C25113c("steps", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27993c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27994d;
    public MVEmployeeRegistrationSteps steps;

    public enum _Fields implements C25085c {
        STEPS(1, "steps");
        
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
            if (i != 1) {
                return null;
            }
            return STEPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationStepsResponse$a */
    public static class C10290a extends C25239c<MVEmployeeRegistrationStepsResponse> {
        public C10290a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmployeeRegistrationStepsResponse mVEmployeeRegistrationStepsResponse = (MVEmployeeRegistrationStepsResponse) tBase;
            MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = mVEmployeeRegistrationStepsResponse.steps;
            C25113c cVar = MVEmployeeRegistrationStepsResponse.f27992b;
            gVar.mo61687K();
            if (mVEmployeeRegistrationStepsResponse.steps != null) {
                gVar.mo61711x(MVEmployeeRegistrationStepsResponse.f27992b);
                mVEmployeeRegistrationStepsResponse.steps.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmployeeRegistrationStepsResponse mVEmployeeRegistrationStepsResponse = (MVEmployeeRegistrationStepsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = mVEmployeeRegistrationStepsResponse.steps;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps2 = new MVEmployeeRegistrationSteps();
                    mVEmployeeRegistrationStepsResponse.steps = mVEmployeeRegistrationSteps2;
                    mVEmployeeRegistrationSteps2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationStepsResponse$b */
    public static class C10291b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10290a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationStepsResponse$c */
    public static class C10292c extends C25240d<MVEmployeeRegistrationStepsResponse> {
        public C10292c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmployeeRegistrationStepsResponse mVEmployeeRegistrationStepsResponse = (MVEmployeeRegistrationStepsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEmployeeRegistrationStepsResponse.mo31135f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVEmployeeRegistrationStepsResponse.mo31135f()) {
                mVEmployeeRegistrationStepsResponse.steps.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmployeeRegistrationStepsResponse mVEmployeeRegistrationStepsResponse = (MVEmployeeRegistrationStepsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = new MVEmployeeRegistrationSteps();
                mVEmployeeRegistrationStepsResponse.steps = mVEmployeeRegistrationSteps;
                mVEmployeeRegistrationSteps.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationStepsResponse$d */
    public static class C10293d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10292c(0);
        }
    }

    static {
        new C17394d0("MVEmployeeRegistrationStepsResponse");
        HashMap hashMap = new HashMap();
        f27993c = hashMap;
        hashMap.put(C25239c.class, new C10291b());
        hashMap.put(C25240d.class, new C10293d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STEPS, new FieldMetaData("steps", (byte) 3, new StructMetaData(MVEmployeeRegistrationSteps.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27994d = unmodifiableMap;
        FieldMetaData.m61947a(MVEmployeeRegistrationStepsResponse.class, unmodifiableMap);
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
        ((C25238b) f27993c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27993c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVEmployeeRegistrationStepsResponse mVEmployeeRegistrationStepsResponse = (MVEmployeeRegistrationStepsResponse) obj;
        if (!getClass().equals(mVEmployeeRegistrationStepsResponse.getClass())) {
            return getClass().getName().compareTo(mVEmployeeRegistrationStepsResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31135f()).compareTo(Boolean.valueOf(mVEmployeeRegistrationStepsResponse.mo31135f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo31135f() || (compareTo = this.steps.compareTo(mVEmployeeRegistrationStepsResponse.steps)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationStepsResponse
            r2 = 1
            if (r1 == 0) goto L_0x003a
            com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationStepsResponse r6 = (com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationStepsResponse) r6
            boolean r1 = r5.mo31135f()
            boolean r3 = r6.mo31135f()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0039
        L_0x0017:
            if (r1 == 0) goto L_0x003a
            if (r3 != 0) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationSteps r1 = r5.steps
            com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationSteps r6 = r6.steps
            if (r6 != 0) goto L_0x0027
            r1.getClass()
        L_0x0025:
            r6 = 0
            goto L_0x0036
        L_0x0027:
            boolean r3 = r1.phoneVerification
            boolean r4 = r6.phoneVerification
            if (r3 == r4) goto L_0x002e
            goto L_0x0025
        L_0x002e:
            boolean r1 = r1.freeformInformation
            boolean r6 = r6.freeformInformation
            if (r1 == r6) goto L_0x0035
            goto L_0x0025
        L_0x0035:
            r6 = 1
        L_0x0036:
            if (r6 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationStepsResponse.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo31135f() {
        return this.steps != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVEmployeeRegistrationStepsResponse(", "steps:");
        MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = this.steps;
        if (mVEmployeeRegistrationSteps == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVEmployeeRegistrationSteps);
        }
        n.append(")");
        return n.toString();
    }
}
