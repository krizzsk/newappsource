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

public class MVTransactionsResponse implements TBase<MVTransactionsResponse, _Fields>, Serializable, Cloneable, Comparable<MVTransactionsResponse> {

    /* renamed from: b */
    public static final C25113c f29282b = new C25113c("transactions", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f29283c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29284d;
    public List<MVTransaction> transactions;

    public enum _Fields implements C25085c {
        TRANSACTIONS(1, "transactions");
        
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
            return TRANSACTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTransactionsResponse$a */
    public static class C11131a extends C25239c<MVTransactionsResponse> {
        public C11131a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTransactionsResponse mVTransactionsResponse = (MVTransactionsResponse) tBase;
            mVTransactionsResponse.getClass();
            C25113c cVar = MVTransactionsResponse.f29282b;
            gVar.mo61687K();
            if (mVTransactionsResponse.transactions != null) {
                gVar.mo61711x(MVTransactionsResponse.f29282b);
                gVar.mo61680D(new C25119e((byte) 12, mVTransactionsResponse.transactions.size()));
                for (MVTransaction X0 : mVTransactionsResponse.transactions) {
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
            MVTransactionsResponse mVTransactionsResponse = (MVTransactionsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTransactionsResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVTransactionsResponse.transactions = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVTransaction mVTransaction = new MVTransaction();
                        mVTransaction.mo25201C1(gVar);
                        mVTransactionsResponse.transactions.add(mVTransaction);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTransactionsResponse$b */
    public static class C11132b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11131a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTransactionsResponse$c */
    public static class C11133c extends C25240d<MVTransactionsResponse> {
        public C11133c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTransactionsResponse mVTransactionsResponse = (MVTransactionsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTransactionsResponse.mo33230f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVTransactionsResponse.mo33230f()) {
                jVar.mo61678B(mVTransactionsResponse.transactions.size());
                for (MVTransaction X0 : mVTransactionsResponse.transactions) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTransactionsResponse mVTransactionsResponse = (MVTransactionsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVTransactionsResponse.transactions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTransaction mVTransaction = new MVTransaction();
                    mVTransaction.mo25201C1(jVar);
                    mVTransactionsResponse.transactions.add(mVTransaction);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTransactionsResponse$d */
    public static class C11134d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11133c(0);
        }
    }

    static {
        new C17394d0("MVTransactionsResponse");
        HashMap hashMap = new HashMap();
        f29283c = hashMap;
        hashMap.put(C25239c.class, new C11132b());
        hashMap.put(C25240d.class, new C11134d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRANSACTIONS, new FieldMetaData("transactions", (byte) 3, new ListMetaData(new StructMetaData(MVTransaction.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29284d = unmodifiableMap;
        FieldMetaData.m61947a(MVTransactionsResponse.class, unmodifiableMap);
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
        ((C25238b) f29283c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29283c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTransactionsResponse mVTransactionsResponse = (MVTransactionsResponse) obj;
        if (!getClass().equals(mVTransactionsResponse.getClass())) {
            return getClass().getName().compareTo(mVTransactionsResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33230f()).compareTo(Boolean.valueOf(mVTransactionsResponse.mo33230f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo33230f() || (h = C25082a.m62844h(this.transactions, mVTransactionsResponse.transactions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTransactionsResponse)) {
            return false;
        }
        MVTransactionsResponse mVTransactionsResponse = (MVTransactionsResponse) obj;
        boolean f = mo33230f();
        boolean f2 = mVTransactionsResponse.mo33230f();
        if ((f || f2) && (!f || !f2 || !this.transactions.equals(mVTransactionsResponse.transactions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33230f() {
        return this.transactions != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTransactionsResponse(", "transactions:");
        List<MVTransaction> list = this.transactions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
