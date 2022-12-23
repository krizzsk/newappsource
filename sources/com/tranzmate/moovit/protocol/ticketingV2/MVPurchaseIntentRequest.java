package com.tranzmate.moovit.protocol.ticketingV2;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVPurchaseIntentRequest implements TBase<MVPurchaseIntentRequest, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseIntentRequest> {

    /* renamed from: b */
    public static final C25113c f28866b = new C25113c("supportedEngines", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28867c = new C25113c("intent", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f28868d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28869e;
    public MVPurchaseIntent intent;
    public List<MVTicketClinetEngine> supportedEngines;

    public enum _Fields implements C25085c {
        SUPPORTED_ENGINES(1, "supportedEngines"),
        INTENT(2, "intent");
        
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
                return SUPPORTED_ENGINES;
            }
            if (i != 2) {
                return null;
            }
            return INTENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntentRequest$a */
    public static class C10899a extends C25239c<MVPurchaseIntentRequest> {
        public C10899a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseIntentRequest mVPurchaseIntentRequest = (MVPurchaseIntentRequest) tBase;
            mVPurchaseIntentRequest.getClass();
            C25113c cVar = MVPurchaseIntentRequest.f28866b;
            gVar.mo61687K();
            if (mVPurchaseIntentRequest.supportedEngines != null) {
                gVar.mo61711x(MVPurchaseIntentRequest.f28866b);
                gVar.mo61680D(new C25119e((byte) 8, mVPurchaseIntentRequest.supportedEngines.size()));
                for (MVTicketClinetEngine value : mVPurchaseIntentRequest.supportedEngines) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseIntentRequest.intent != null) {
                gVar.mo61711x(MVPurchaseIntentRequest.f28867c);
                mVPurchaseIntentRequest.intent.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseIntentRequest mVPurchaseIntentRequest = (MVPurchaseIntentRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseIntentRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVPurchaseIntent mVPurchaseIntent = new MVPurchaseIntent();
                        mVPurchaseIntentRequest.intent = mVPurchaseIntent;
                        mVPurchaseIntent.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVPurchaseIntentRequest.supportedEngines = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        mVPurchaseIntentRequest.supportedEngines.add(MVTicketClinetEngine.findByValue(gVar.mo61696i()));
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntentRequest$b */
    public static class C10900b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10899a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntentRequest$c */
    public static class C10901c extends C25240d<MVPurchaseIntentRequest> {
        public C10901c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseIntentRequest mVPurchaseIntentRequest = (MVPurchaseIntentRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseIntentRequest.mo32616g()) {
                bitSet.set(0);
            }
            if (mVPurchaseIntentRequest.mo32615f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPurchaseIntentRequest.mo32616g()) {
                jVar.mo61678B(mVPurchaseIntentRequest.supportedEngines.size());
                for (MVTicketClinetEngine value : mVPurchaseIntentRequest.supportedEngines) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVPurchaseIntentRequest.mo32615f()) {
                mVPurchaseIntentRequest.intent.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseIntentRequest mVPurchaseIntentRequest = (MVPurchaseIntentRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPurchaseIntentRequest.supportedEngines = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPurchaseIntentRequest.supportedEngines.add(MVTicketClinetEngine.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(1)) {
                MVPurchaseIntent mVPurchaseIntent = new MVPurchaseIntent();
                mVPurchaseIntentRequest.intent = mVPurchaseIntent;
                mVPurchaseIntent.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntentRequest$d */
    public static class C10902d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10901c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseIntentRequest");
        HashMap hashMap = new HashMap();
        f28868d = hashMap;
        hashMap.put(C25239c.class, new C10900b());
        hashMap.put(C25240d.class, new C10902d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPPORTED_ENGINES, new FieldMetaData("supportedEngines", (byte) 3, new ListMetaData(new EnumMetaData(MVTicketClinetEngine.class))));
        enumMap.put(_Fields.INTENT, new FieldMetaData("intent", (byte) 3, new StructMetaData(MVPurchaseIntent.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28869e = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseIntentRequest.class, unmodifiableMap);
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
        ((C25238b) f28868d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28868d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseIntentRequest mVPurchaseIntentRequest = (MVPurchaseIntentRequest) obj;
        if (!getClass().equals(mVPurchaseIntentRequest.getClass())) {
            return getClass().getName().compareTo(mVPurchaseIntentRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32616g()).compareTo(Boolean.valueOf(mVPurchaseIntentRequest.mo32616g()));
        if (compareTo2 != 0 || ((mo32616g() && (compareTo2 = C25082a.m62844h(this.supportedEngines, mVPurchaseIntentRequest.supportedEngines)) != 0) || (compareTo2 = Boolean.valueOf(mo32615f()).compareTo(Boolean.valueOf(mVPurchaseIntentRequest.mo32615f()))) != 0)) {
            return compareTo2;
        }
        if (!mo32615f() || (compareTo = this.intent.compareTo(mVPurchaseIntentRequest.intent)) == 0) {
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
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntentRequest
            r2 = 1
            if (r1 == 0) goto L_0x0058
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntentRequest r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntentRequest) r6
            boolean r1 = r5.mo32616g()
            boolean r3 = r6.mo32616g()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0027
        L_0x0017:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x001c
            goto L_0x0058
        L_0x001c:
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVTicketClinetEngine> r1 = r5.supportedEngines
            java.util.List<com.tranzmate.moovit.protocol.ticketingV2.MVTicketClinetEngine> r3 = r6.supportedEngines
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0027
            goto L_0x0058
        L_0x0027:
            boolean r1 = r5.mo32615f()
            boolean r3 = r6.mo32615f()
            if (r1 != 0) goto L_0x0033
            if (r3 == 0) goto L_0x0057
        L_0x0033:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x0038
            goto L_0x0058
        L_0x0038:
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent r1 = r5.intent
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent r6 = r6.intent
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
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntentRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo32615f() {
        return this.intent != null;
    }

    /* renamed from: g */
    public final boolean mo32616g() {
        return this.supportedEngines != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseIntentRequest(", "supportedEngines:");
        List<MVTicketClinetEngine> list = this.supportedEngines;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("intent:");
        MVPurchaseIntent mVPurchaseIntent = this.intent;
        if (mVPurchaseIntent == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseIntent);
        }
        n.append(")");
        return n.toString();
    }
}
