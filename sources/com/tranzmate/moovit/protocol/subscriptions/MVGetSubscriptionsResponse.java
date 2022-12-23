package com.tranzmate.moovit.protocol.subscriptions;

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

public class MVGetSubscriptionsResponse implements TBase<MVGetSubscriptionsResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetSubscriptionsResponse> {

    /* renamed from: b */
    public static final C25113c f28354b = new C25113c("offeredSubscriptions", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f28355c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28356d;
    public List<MVSubscription> offeredSubscriptions;

    public enum _Fields implements C25085c {
        OFFERED_SUBSCRIPTIONS(1, "offeredSubscriptions");
        
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
            return OFFERED_SUBSCRIPTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.subscriptions.MVGetSubscriptionsResponse$a */
    public static class C10559a extends C25239c<MVGetSubscriptionsResponse> {
        public C10559a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetSubscriptionsResponse mVGetSubscriptionsResponse = (MVGetSubscriptionsResponse) tBase;
            mVGetSubscriptionsResponse.getClass();
            C25113c cVar = MVGetSubscriptionsResponse.f28354b;
            gVar.mo61687K();
            if (mVGetSubscriptionsResponse.offeredSubscriptions != null) {
                gVar.mo61711x(MVGetSubscriptionsResponse.f28354b);
                gVar.mo61680D(new C25119e((byte) 12, mVGetSubscriptionsResponse.offeredSubscriptions.size()));
                for (MVSubscription X0 : mVGetSubscriptionsResponse.offeredSubscriptions) {
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
            MVGetSubscriptionsResponse mVGetSubscriptionsResponse = (MVGetSubscriptionsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGetSubscriptionsResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVGetSubscriptionsResponse.offeredSubscriptions = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVSubscription mVSubscription = new MVSubscription();
                        mVSubscription.mo25201C1(gVar);
                        mVGetSubscriptionsResponse.offeredSubscriptions.add(mVSubscription);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.subscriptions.MVGetSubscriptionsResponse$b */
    public static class C10560b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10559a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.subscriptions.MVGetSubscriptionsResponse$c */
    public static class C10561c extends C25240d<MVGetSubscriptionsResponse> {
        public C10561c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetSubscriptionsResponse mVGetSubscriptionsResponse = (MVGetSubscriptionsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetSubscriptionsResponse.mo31792f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVGetSubscriptionsResponse.mo31792f()) {
                jVar.mo61678B(mVGetSubscriptionsResponse.offeredSubscriptions.size());
                for (MVSubscription X0 : mVGetSubscriptionsResponse.offeredSubscriptions) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetSubscriptionsResponse mVGetSubscriptionsResponse = (MVGetSubscriptionsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVGetSubscriptionsResponse.offeredSubscriptions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSubscription mVSubscription = new MVSubscription();
                    mVSubscription.mo25201C1(jVar);
                    mVGetSubscriptionsResponse.offeredSubscriptions.add(mVSubscription);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.subscriptions.MVGetSubscriptionsResponse$d */
    public static class C10562d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10561c(0);
        }
    }

    static {
        new C17394d0("MVGetSubscriptionsResponse");
        HashMap hashMap = new HashMap();
        f28355c = hashMap;
        hashMap.put(C25239c.class, new C10560b());
        hashMap.put(C25240d.class, new C10562d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OFFERED_SUBSCRIPTIONS, new FieldMetaData("offeredSubscriptions", (byte) 3, new ListMetaData(new StructMetaData(MVSubscription.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28356d = unmodifiableMap;
        FieldMetaData.m61947a(MVGetSubscriptionsResponse.class, unmodifiableMap);
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
        ((C25238b) f28355c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28355c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVGetSubscriptionsResponse mVGetSubscriptionsResponse = (MVGetSubscriptionsResponse) obj;
        if (!getClass().equals(mVGetSubscriptionsResponse.getClass())) {
            return getClass().getName().compareTo(mVGetSubscriptionsResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31792f()).compareTo(Boolean.valueOf(mVGetSubscriptionsResponse.mo31792f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo31792f() || (h = C25082a.m62844h(this.offeredSubscriptions, mVGetSubscriptionsResponse.offeredSubscriptions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetSubscriptionsResponse)) {
            return false;
        }
        MVGetSubscriptionsResponse mVGetSubscriptionsResponse = (MVGetSubscriptionsResponse) obj;
        boolean f = mo31792f();
        boolean f2 = mVGetSubscriptionsResponse.mo31792f();
        if ((f || f2) && (!f || !f2 || !this.offeredSubscriptions.equals(mVGetSubscriptionsResponse.offeredSubscriptions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31792f() {
        return this.offeredSubscriptions != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetSubscriptionsResponse(", "offeredSubscriptions:");
        List<MVSubscription> list = this.offeredSubscriptions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
