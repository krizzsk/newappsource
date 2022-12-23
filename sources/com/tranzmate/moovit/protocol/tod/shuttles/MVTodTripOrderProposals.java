package com.tranzmate.moovit.protocol.tod.shuttles;

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

public class MVTodTripOrderProposals implements TBase<MVTodTripOrderProposals, _Fields>, Serializable, Cloneable, Comparable<MVTodTripOrderProposals> {

    /* renamed from: b */
    public static final C25113c f29772b = new C25113c("subscriptionProposal", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f29773c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29774d;
    private _Fields[] optionals = {_Fields.SUBSCRIPTION_PROPOSAL};
    public MVTodSubscriptionProposal subscriptionProposal;

    public enum _Fields implements C25085c {
        SUBSCRIPTION_PROPOSAL(1, "subscriptionProposal");
        
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
            return SUBSCRIPTION_PROPOSAL;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrderProposals$a */
    public static class C11453a extends C25239c<MVTodTripOrderProposals> {
        public C11453a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodTripOrderProposals mVTodTripOrderProposals = (MVTodTripOrderProposals) tBase;
            mVTodTripOrderProposals.getClass();
            C25113c cVar = MVTodTripOrderProposals.f29772b;
            gVar.mo61687K();
            if (mVTodTripOrderProposals.subscriptionProposal != null && mVTodTripOrderProposals.mo34058f()) {
                gVar.mo61711x(MVTodTripOrderProposals.f29772b);
                mVTodTripOrderProposals.subscriptionProposal.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodTripOrderProposals mVTodTripOrderProposals = (MVTodTripOrderProposals) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodTripOrderProposals.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVTodSubscriptionProposal mVTodSubscriptionProposal = new MVTodSubscriptionProposal();
                    mVTodTripOrderProposals.subscriptionProposal = mVTodSubscriptionProposal;
                    mVTodSubscriptionProposal.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrderProposals$b */
    public static class C11454b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11453a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrderProposals$c */
    public static class C11455c extends C25240d<MVTodTripOrderProposals> {
        public C11455c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodTripOrderProposals mVTodTripOrderProposals = (MVTodTripOrderProposals) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodTripOrderProposals.mo34058f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVTodTripOrderProposals.mo34058f()) {
                mVTodTripOrderProposals.subscriptionProposal.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodTripOrderProposals mVTodTripOrderProposals = (MVTodTripOrderProposals) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVTodSubscriptionProposal mVTodSubscriptionProposal = new MVTodSubscriptionProposal();
                mVTodTripOrderProposals.subscriptionProposal = mVTodSubscriptionProposal;
                mVTodSubscriptionProposal.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrderProposals$d */
    public static class C11456d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11455c(0);
        }
    }

    static {
        new C17394d0("MVTodTripOrderProposals");
        HashMap hashMap = new HashMap();
        f29773c = hashMap;
        hashMap.put(C25239c.class, new C11454b());
        hashMap.put(C25240d.class, new C11456d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUBSCRIPTION_PROPOSAL, new FieldMetaData("subscriptionProposal", (byte) 2, new StructMetaData(MVTodSubscriptionProposal.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29774d = unmodifiableMap;
        FieldMetaData.m61947a(MVTodTripOrderProposals.class, unmodifiableMap);
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
        ((C25238b) f29773c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29773c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34055a(com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrderProposals r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5.mo34058f()
            boolean r2 = r6.mo34058f()
            r3 = 1
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0035
        L_0x0011:
            if (r1 == 0) goto L_0x0036
            if (r2 != 0) goto L_0x0016
            goto L_0x0036
        L_0x0016:
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodSubscriptionProposal r1 = r5.subscriptionProposal
            com.tranzmate.moovit.protocol.tod.shuttles.MVTodSubscriptionProposal r6 = r6.subscriptionProposal
            if (r6 == 0) goto L_0x002e
            F r2 = r1.setField_
            F r4 = r6.setField_
            if (r2 != r4) goto L_0x0031
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0031
            r6 = 1
            goto L_0x0032
        L_0x002e:
            r1.getClass()
        L_0x0031:
            r6 = 0
        L_0x0032:
            if (r6 != 0) goto L_0x0035
            return r0
        L_0x0035:
            return r3
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrderProposals.mo34055a(com.tranzmate.moovit.protocol.tod.shuttles.MVTodTripOrderProposals):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodTripOrderProposals mVTodTripOrderProposals = (MVTodTripOrderProposals) obj;
        if (!getClass().equals(mVTodTripOrderProposals.getClass())) {
            return getClass().getName().compareTo(mVTodTripOrderProposals.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34058f()).compareTo(Boolean.valueOf(mVTodTripOrderProposals.mo34058f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo34058f() || (compareTo = this.subscriptionProposal.compareTo(mVTodTripOrderProposals.subscriptionProposal)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodTripOrderProposals)) {
            return mo34055a((MVTodTripOrderProposals) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34058f() {
        return this.subscriptionProposal != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVTodTripOrderProposals(");
        if (mo34058f()) {
            sb.append("subscriptionProposal:");
            MVTodSubscriptionProposal mVTodSubscriptionProposal = this.subscriptionProposal;
            if (mVTodSubscriptionProposal == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVTodSubscriptionProposal);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
