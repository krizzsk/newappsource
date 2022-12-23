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

public class MVMicroMobilityPurchaseIntentRequest implements TBase<MVMicroMobilityPurchaseIntentRequest, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseIntentRequest> {

    /* renamed from: b */
    public static final C25113c f26638b = new C25113c("purchaseIntent", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f26639c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26640d;
    public MVMicroMobilityPurchaseIntent purchaseIntent;

    public enum _Fields implements C25085c {
        PURCHASE_INTENT(1, "purchaseIntent");
        
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
            return PURCHASE_INTENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentRequest$a */
    public static class C9282a extends C25239c<MVMicroMobilityPurchaseIntentRequest> {
        public C9282a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseIntentRequest mVMicroMobilityPurchaseIntentRequest = (MVMicroMobilityPurchaseIntentRequest) tBase;
            mVMicroMobilityPurchaseIntentRequest.getClass();
            C25113c cVar = MVMicroMobilityPurchaseIntentRequest.f26638b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseIntentRequest.purchaseIntent != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseIntentRequest.f26638b);
                mVMicroMobilityPurchaseIntentRequest.purchaseIntent.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseIntentRequest mVMicroMobilityPurchaseIntentRequest = (MVMicroMobilityPurchaseIntentRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchaseIntentRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVMicroMobilityPurchaseIntent mVMicroMobilityPurchaseIntent = new MVMicroMobilityPurchaseIntent();
                    mVMicroMobilityPurchaseIntentRequest.purchaseIntent = mVMicroMobilityPurchaseIntent;
                    mVMicroMobilityPurchaseIntent.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentRequest$b */
    public static class C9283b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9282a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentRequest$c */
    public static class C9284c extends C25240d<MVMicroMobilityPurchaseIntentRequest> {
        public C9284c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseIntentRequest mVMicroMobilityPurchaseIntentRequest = (MVMicroMobilityPurchaseIntentRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseIntentRequest.mo28845f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityPurchaseIntentRequest.mo28845f()) {
                mVMicroMobilityPurchaseIntentRequest.purchaseIntent.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseIntentRequest mVMicroMobilityPurchaseIntentRequest = (MVMicroMobilityPurchaseIntentRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVMicroMobilityPurchaseIntent mVMicroMobilityPurchaseIntent = new MVMicroMobilityPurchaseIntent();
                mVMicroMobilityPurchaseIntentRequest.purchaseIntent = mVMicroMobilityPurchaseIntent;
                mVMicroMobilityPurchaseIntent.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentRequest$d */
    public static class C9285d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9284c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseIntentRequest");
        HashMap hashMap = new HashMap();
        f26639c = hashMap;
        hashMap.put(C25239c.class, new C9283b());
        hashMap.put(C25240d.class, new C9285d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PURCHASE_INTENT, new FieldMetaData("purchaseIntent", (byte) 3, new StructMetaData(MVMicroMobilityPurchaseIntent.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26640d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseIntentRequest.class, unmodifiableMap);
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
        ((C25238b) f26639c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26639c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchaseIntentRequest mVMicroMobilityPurchaseIntentRequest = (MVMicroMobilityPurchaseIntentRequest) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseIntentRequest.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseIntentRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28845f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseIntentRequest.mo28845f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo28845f() || (compareTo = this.purchaseIntent.compareTo(mVMicroMobilityPurchaseIntentRequest.purchaseIntent)) == 0) {
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
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentRequest
            r2 = 1
            if (r1 == 0) goto L_0x003c
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentRequest r6 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentRequest) r6
            boolean r1 = r5.mo28845f()
            boolean r3 = r6.mo28845f()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x003b
        L_0x0017:
            if (r1 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x001c
            goto L_0x003c
        L_0x001c:
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntent r1 = r5.purchaseIntent
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntent r6 = r6.purchaseIntent
            if (r6 == 0) goto L_0x0034
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x0037
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0037
            r6 = 1
            goto L_0x0038
        L_0x0034:
            r1.getClass()
        L_0x0037:
            r6 = 0
        L_0x0038:
            if (r6 != 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseIntentRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo28845f() {
        return this.purchaseIntent != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchaseIntentRequest(", "purchaseIntent:");
        MVMicroMobilityPurchaseIntent mVMicroMobilityPurchaseIntent = this.purchaseIntent;
        if (mVMicroMobilityPurchaseIntent == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMicroMobilityPurchaseIntent);
        }
        n.append(")");
        return n.toString();
    }
}
