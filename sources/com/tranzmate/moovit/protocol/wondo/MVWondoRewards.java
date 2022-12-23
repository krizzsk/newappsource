package com.tranzmate.moovit.protocol.wondo;

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
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVWondoRewards implements TBase<MVWondoRewards, _Fields>, Serializable, Cloneable, Comparable<MVWondoRewards> {

    /* renamed from: b */
    public static final C25113c f30787b = new C25113c("rewards", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f30788c = new C25113c("rewardLink", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30789d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30790e;
    private _Fields[] optionals = {_Fields.REWARD_LINK};
    public String rewardLink;
    public List<MVWondoReward> rewards;

    public enum _Fields implements C25085c {
        REWARDS(1, "rewards"),
        REWARD_LINK(2, "rewardLink");
        
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
                return REWARDS;
            }
            if (i != 2) {
                return null;
            }
            return REWARD_LINK;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRewards$a */
    public static class C12075a extends C25239c<MVWondoRewards> {
        public C12075a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoRewards mVWondoRewards = (MVWondoRewards) tBase;
            mVWondoRewards.getClass();
            C25113c cVar = MVWondoRewards.f30787b;
            gVar.mo61687K();
            if (mVWondoRewards.rewards != null) {
                gVar.mo61711x(MVWondoRewards.f30787b);
                gVar.mo61680D(new C25119e((byte) 12, mVWondoRewards.rewards.size()));
                for (MVWondoReward X0 : mVWondoRewards.rewards) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVWondoRewards.rewardLink != null && mVWondoRewards.mo35772f()) {
                gVar.mo61711x(MVWondoRewards.f30788c);
                gVar.mo61686J(mVWondoRewards.rewardLink);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoRewards mVWondoRewards = (MVWondoRewards) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoRewards.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVWondoRewards.rewardLink = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVWondoRewards.rewards = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVWondoReward mVWondoReward = new MVWondoReward();
                        mVWondoReward.mo25201C1(gVar);
                        mVWondoRewards.rewards.add(mVWondoReward);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRewards$b */
    public static class C12076b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12075a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRewards$c */
    public static class C12077c extends C25240d<MVWondoRewards> {
        public C12077c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoRewards mVWondoRewards = (MVWondoRewards) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoRewards.mo35773g()) {
                bitSet.set(0);
            }
            if (mVWondoRewards.mo35772f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVWondoRewards.mo35773g()) {
                jVar.mo61678B(mVWondoRewards.rewards.size());
                for (MVWondoReward X0 : mVWondoRewards.rewards) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVWondoRewards.mo35772f()) {
                jVar.mo61686J(mVWondoRewards.rewardLink);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoRewards mVWondoRewards = (MVWondoRewards) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVWondoRewards.rewards = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWondoReward mVWondoReward = new MVWondoReward();
                    mVWondoReward.mo25201C1(jVar);
                    mVWondoRewards.rewards.add(mVWondoReward);
                }
            }
            if (T.get(1)) {
                mVWondoRewards.rewardLink = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRewards$d */
    public static class C12078d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12077c(0);
        }
    }

    static {
        new C17394d0("MVWondoRewards");
        HashMap hashMap = new HashMap();
        f30789d = hashMap;
        hashMap.put(C25239c.class, new C12076b());
        hashMap.put(C25240d.class, new C12078d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REWARDS, new FieldMetaData("rewards", (byte) 3, new ListMetaData(new StructMetaData(MVWondoReward.class))));
        enumMap.put(_Fields.REWARD_LINK, new FieldMetaData("rewardLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30790e = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoRewards.class, unmodifiableMap);
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
        ((C25238b) f30789d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30789d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35769a(MVWondoRewards mVWondoRewards) {
        if (mVWondoRewards == null) {
            return false;
        }
        boolean g = mo35773g();
        boolean g2 = mVWondoRewards.mo35773g();
        if ((g || g2) && (!g || !g2 || !this.rewards.equals(mVWondoRewards.rewards))) {
            return false;
        }
        boolean f = mo35772f();
        boolean f2 = mVWondoRewards.mo35772f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.rewardLink.equals(mVWondoRewards.rewardLink)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoRewards mVWondoRewards = (MVWondoRewards) obj;
        if (!getClass().equals(mVWondoRewards.getClass())) {
            return getClass().getName().compareTo(mVWondoRewards.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35773g()).compareTo(Boolean.valueOf(mVWondoRewards.mo35773g()));
        if (compareTo2 != 0 || ((mo35773g() && (compareTo2 = C25082a.m62844h(this.rewards, mVWondoRewards.rewards)) != 0) || (compareTo2 = Boolean.valueOf(mo35772f()).compareTo(Boolean.valueOf(mVWondoRewards.mo35772f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35772f() || (compareTo = this.rewardLink.compareTo(mVWondoRewards.rewardLink)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVWondoRewards)) {
            return mo35769a((MVWondoRewards) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35772f() {
        return this.rewardLink != null;
    }

    /* renamed from: g */
    public final boolean mo35773g() {
        return this.rewards != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoRewards(", "rewards:");
        List<MVWondoReward> list = this.rewards;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo35772f()) {
            n.append(", ");
            n.append("rewardLink:");
            String str = this.rewardLink;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(")");
        return n.toString();
    }
}
