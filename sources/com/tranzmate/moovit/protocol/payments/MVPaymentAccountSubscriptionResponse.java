package com.tranzmate.moovit.protocol.payments;

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

public class MVPaymentAccountSubscriptionResponse implements TBase<MVPaymentAccountSubscriptionResponse, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountSubscriptionResponse> {

    /* renamed from: b */
    public static final C25113c f27468b = new C25113c("subscriptions", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f27469c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27470d;
    public List<MVPaymentAccountSubscription> subscriptions;

    public enum _Fields implements C25085c {
        SUBSCRIPTIONS(1, "subscriptions");
        
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
            return SUBSCRIPTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionResponse$a */
    public static class C9889a extends C25239c<MVPaymentAccountSubscriptionResponse> {
        public C9889a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscriptionResponse mVPaymentAccountSubscriptionResponse = (MVPaymentAccountSubscriptionResponse) tBase;
            mVPaymentAccountSubscriptionResponse.getClass();
            C25113c cVar = MVPaymentAccountSubscriptionResponse.f27468b;
            gVar.mo61687K();
            if (mVPaymentAccountSubscriptionResponse.subscriptions != null) {
                gVar.mo61711x(MVPaymentAccountSubscriptionResponse.f27468b);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentAccountSubscriptionResponse.subscriptions.size()));
                for (MVPaymentAccountSubscription X0 : mVPaymentAccountSubscriptionResponse.subscriptions) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscriptionResponse mVPaymentAccountSubscriptionResponse = (MVPaymentAccountSubscriptionResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentAccountSubscriptionResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVPaymentAccountSubscriptionResponse.subscriptions = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVPaymentAccountSubscription mVPaymentAccountSubscription = new MVPaymentAccountSubscription();
                        mVPaymentAccountSubscription.mo25201C1(gVar);
                        mVPaymentAccountSubscriptionResponse.subscriptions.add(mVPaymentAccountSubscription);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionResponse$b */
    public static class C9890b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9889a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionResponse$c */
    public static class C9891c extends C25240d<MVPaymentAccountSubscriptionResponse> {
        public C9891c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscriptionResponse mVPaymentAccountSubscriptionResponse = (MVPaymentAccountSubscriptionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountSubscriptionResponse.mo30205f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPaymentAccountSubscriptionResponse.mo30205f()) {
                jVar.mo61678B(mVPaymentAccountSubscriptionResponse.subscriptions.size());
                for (MVPaymentAccountSubscription X0 : mVPaymentAccountSubscriptionResponse.subscriptions) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscriptionResponse mVPaymentAccountSubscriptionResponse = (MVPaymentAccountSubscriptionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVPaymentAccountSubscriptionResponse.subscriptions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPaymentAccountSubscription mVPaymentAccountSubscription = new MVPaymentAccountSubscription();
                    mVPaymentAccountSubscription.mo25201C1(jVar);
                    mVPaymentAccountSubscriptionResponse.subscriptions.add(mVPaymentAccountSubscription);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionResponse$d */
    public static class C9892d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9891c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountSubscriptionResponse");
        HashMap hashMap = new HashMap();
        f27469c = hashMap;
        hashMap.put(C25239c.class, new C9890b());
        hashMap.put(C25240d.class, new C9892d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUBSCRIPTIONS, new FieldMetaData("subscriptions", (byte) 3, new ListMetaData(new StructMetaData(MVPaymentAccountSubscription.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27470d = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountSubscriptionResponse.class, unmodifiableMap);
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
        ((C25238b) f27469c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27469c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPaymentAccountSubscriptionResponse mVPaymentAccountSubscriptionResponse = (MVPaymentAccountSubscriptionResponse) obj;
        if (!getClass().equals(mVPaymentAccountSubscriptionResponse.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountSubscriptionResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30205f()).compareTo(Boolean.valueOf(mVPaymentAccountSubscriptionResponse.mo30205f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo30205f() || (h = C25082a.m62844h(this.subscriptions, mVPaymentAccountSubscriptionResponse.subscriptions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentAccountSubscriptionResponse)) {
            return false;
        }
        MVPaymentAccountSubscriptionResponse mVPaymentAccountSubscriptionResponse = (MVPaymentAccountSubscriptionResponse) obj;
        boolean f = mo30205f();
        boolean f2 = mVPaymentAccountSubscriptionResponse.mo30205f();
        if ((f || f2) && (!f || !f2 || !this.subscriptions.equals(mVPaymentAccountSubscriptionResponse.subscriptions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30205f() {
        return this.subscriptions != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAccountSubscriptionResponse(", "subscriptions:");
        List<MVPaymentAccountSubscription> list = this.subscriptions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
