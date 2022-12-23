package com.tranzmate.moovit.protocol.wondo;

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
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVWondoRedeemRewardRequest implements TBase<MVWondoRedeemRewardRequest, _Fields>, Serializable, Cloneable, Comparable<MVWondoRedeemRewardRequest> {

    /* renamed from: b */
    public static final C25113c f30762b = new C25113c("rewardId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30763c = new C25113c("provider", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30764d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30765e;
    private byte __isset_bitfield = 0;
    public String provider;
    public int rewardId;

    public enum _Fields implements C25085c {
        REWARD_ID(1, "rewardId"),
        PROVIDER(2, "provider");
        
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
                return REWARD_ID;
            }
            if (i != 2) {
                return null;
            }
            return PROVIDER;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRedeemRewardRequest$a */
    public static class C12062a extends C25239c<MVWondoRedeemRewardRequest> {
        public C12062a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoRedeemRewardRequest mVWondoRedeemRewardRequest = (MVWondoRedeemRewardRequest) tBase;
            mVWondoRedeemRewardRequest.getClass();
            C25113c cVar = MVWondoRedeemRewardRequest.f30762b;
            gVar.mo61687K();
            gVar.mo61711x(MVWondoRedeemRewardRequest.f30762b);
            gVar.mo61678B(mVWondoRedeemRewardRequest.rewardId);
            gVar.mo61712y();
            if (mVWondoRedeemRewardRequest.provider != null) {
                gVar.mo61711x(MVWondoRedeemRewardRequest.f30763c);
                gVar.mo61686J(mVWondoRedeemRewardRequest.provider);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoRedeemRewardRequest mVWondoRedeemRewardRequest = (MVWondoRedeemRewardRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoRedeemRewardRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVWondoRedeemRewardRequest.provider = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVWondoRedeemRewardRequest.rewardId = gVar.mo61696i();
                    mVWondoRedeemRewardRequest.mo35738h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRedeemRewardRequest$b */
    public static class C12063b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12062a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRedeemRewardRequest$c */
    public static class C12064c extends C25240d<MVWondoRedeemRewardRequest> {
        public C12064c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoRedeemRewardRequest mVWondoRedeemRewardRequest = (MVWondoRedeemRewardRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoRedeemRewardRequest.mo35737g()) {
                bitSet.set(0);
            }
            if (mVWondoRedeemRewardRequest.mo35736f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVWondoRedeemRewardRequest.mo35737g()) {
                jVar.mo61678B(mVWondoRedeemRewardRequest.rewardId);
            }
            if (mVWondoRedeemRewardRequest.mo35736f()) {
                jVar.mo61686J(mVWondoRedeemRewardRequest.provider);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoRedeemRewardRequest mVWondoRedeemRewardRequest = (MVWondoRedeemRewardRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVWondoRedeemRewardRequest.rewardId = jVar.mo61696i();
                mVWondoRedeemRewardRequest.mo35738h();
            }
            if (T.get(1)) {
                mVWondoRedeemRewardRequest.provider = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRedeemRewardRequest$d */
    public static class C12065d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12064c(0);
        }
    }

    static {
        new C17394d0("MVWondoRedeemRewardRequest");
        HashMap hashMap = new HashMap();
        f30764d = hashMap;
        hashMap.put(C25239c.class, new C12063b());
        hashMap.put(C25240d.class, new C12065d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REWARD_ID, new FieldMetaData("rewardId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PROVIDER, new FieldMetaData("provider", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30765e = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoRedeemRewardRequest.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f30764d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30764d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoRedeemRewardRequest mVWondoRedeemRewardRequest = (MVWondoRedeemRewardRequest) obj;
        if (!getClass().equals(mVWondoRedeemRewardRequest.getClass())) {
            return getClass().getName().compareTo(mVWondoRedeemRewardRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35737g()).compareTo(Boolean.valueOf(mVWondoRedeemRewardRequest.mo35737g()));
        if (compareTo2 != 0 || ((mo35737g() && (compareTo2 = C25082a.m62839c(this.rewardId, mVWondoRedeemRewardRequest.rewardId)) != 0) || (compareTo2 = Boolean.valueOf(mo35736f()).compareTo(Boolean.valueOf(mVWondoRedeemRewardRequest.mo35736f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35736f() || (compareTo = this.provider.compareTo(mVWondoRedeemRewardRequest.provider)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWondoRedeemRewardRequest)) {
            return false;
        }
        MVWondoRedeemRewardRequest mVWondoRedeemRewardRequest = (MVWondoRedeemRewardRequest) obj;
        if (this.rewardId != mVWondoRedeemRewardRequest.rewardId) {
            return false;
        }
        boolean f = mo35736f();
        boolean f2 = mVWondoRedeemRewardRequest.mo35736f();
        if ((f || f2) && (!f || !f2 || !this.provider.equals(mVWondoRedeemRewardRequest.provider))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35736f() {
        return this.provider != null;
    }

    /* renamed from: g */
    public final boolean mo35737g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo35738h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoRedeemRewardRequest(", "rewardId:");
        C0016g.m42z(n, this.rewardId, ", ", "provider:");
        String str = this.provider;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
