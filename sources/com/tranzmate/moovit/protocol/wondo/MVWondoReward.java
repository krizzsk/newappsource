package com.tranzmate.moovit.protocol.wondo;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
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

public class MVWondoReward implements TBase<MVWondoReward, _Fields>, Serializable, Cloneable, Comparable<MVWondoReward> {

    /* renamed from: b */
    public static final C25113c f30771b = new C25113c("id", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30772c = new C25113c(ServerParameters.STATUS, (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30773d = new C25113c("displayInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30774e = new C25113c("providers", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f30775f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f30776g;
    private byte __isset_bitfield = 0;
    public MVWondoRewardDisplayInfo displayInfo;

    /* renamed from: id */
    public int f30777id;
    public List<String> providers;
    public MVWondoRewardStatus status;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        STATUS(2, ServerParameters.STATUS),
        DISPLAY_INFO(3, "displayInfo"),
        PROVIDERS(4, "providers");
        
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
                return ID;
            }
            if (i == 2) {
                return STATUS;
            }
            if (i == 3) {
                return DISPLAY_INFO;
            }
            if (i != 4) {
                return null;
            }
            return PROVIDERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoReward$a */
    public static class C12067a extends C25239c<MVWondoReward> {
        public C12067a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoReward mVWondoReward = (MVWondoReward) tBase;
            MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo = mVWondoReward.displayInfo;
            C25113c cVar = MVWondoReward.f30771b;
            gVar.mo61687K();
            gVar.mo61711x(MVWondoReward.f30771b);
            gVar.mo61678B(mVWondoReward.f30777id);
            gVar.mo61712y();
            if (mVWondoReward.status != null) {
                gVar.mo61711x(MVWondoReward.f30772c);
                gVar.mo61678B(mVWondoReward.status.getValue());
                gVar.mo61712y();
            }
            if (mVWondoReward.displayInfo != null) {
                gVar.mo61711x(MVWondoReward.f30773d);
                mVWondoReward.displayInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWondoReward.providers != null) {
                gVar.mo61711x(MVWondoReward.f30774e);
                gVar.mo61680D(new C25119e((byte) 11, mVWondoReward.providers.size()));
                for (String J : mVWondoReward.providers) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoReward mVWondoReward = (MVWondoReward) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo = mVWondoReward.displayInfo;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVWondoReward.providers = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    mVWondoReward.providers.add(gVar.mo61704q());
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo2 = new MVWondoRewardDisplayInfo();
                            mVWondoReward.displayInfo = mVWondoRewardDisplayInfo2;
                            mVWondoRewardDisplayInfo2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVWondoReward.status = MVWondoRewardStatus.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVWondoReward.f30777id = gVar.mo61696i();
                    mVWondoReward.mo35753j(true);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoReward$b */
    public static class C12068b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12067a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoReward$c */
    public static class C12069c extends C25240d<MVWondoReward> {
        public C12069c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoReward mVWondoReward = (MVWondoReward) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoReward.mo35749g()) {
                bitSet.set(0);
            }
            if (mVWondoReward.mo35752i()) {
                bitSet.set(1);
            }
            if (mVWondoReward.mo35748f()) {
                bitSet.set(2);
            }
            if (mVWondoReward.mo35750h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVWondoReward.mo35749g()) {
                jVar.mo61678B(mVWondoReward.f30777id);
            }
            if (mVWondoReward.mo35752i()) {
                jVar.mo61678B(mVWondoReward.status.getValue());
            }
            if (mVWondoReward.mo35748f()) {
                mVWondoReward.displayInfo.mo25202X0(jVar);
            }
            if (mVWondoReward.mo35750h()) {
                jVar.mo61678B(mVWondoReward.providers.size());
                for (String J : mVWondoReward.providers) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoReward mVWondoReward = (MVWondoReward) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVWondoReward.f30777id = jVar.mo61696i();
                mVWondoReward.mo35753j(true);
            }
            if (T.get(1)) {
                mVWondoReward.status = MVWondoRewardStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo = new MVWondoRewardDisplayInfo();
                mVWondoReward.displayInfo = mVWondoRewardDisplayInfo;
                mVWondoRewardDisplayInfo.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVWondoReward.providers = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVWondoReward.providers.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoReward$d */
    public static class C12070d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12069c(0);
        }
    }

    static {
        new C17394d0("MVWondoReward");
        HashMap hashMap = new HashMap();
        f30775f = hashMap;
        hashMap.put(C25239c.class, new C12068b());
        hashMap.put(C25240d.class, new C12070d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVWondoRewardStatus.class)));
        enumMap.put(_Fields.DISPLAY_INFO, new FieldMetaData("displayInfo", (byte) 3, new StructMetaData(MVWondoRewardDisplayInfo.class)));
        enumMap.put(_Fields.PROVIDERS, new FieldMetaData("providers", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30776g = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoReward.class, unmodifiableMap);
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
        ((C25238b) f30775f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30775f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVWondoReward mVWondoReward = (MVWondoReward) obj;
        if (!getClass().equals(mVWondoReward.getClass())) {
            return getClass().getName().compareTo(mVWondoReward.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35749g()).compareTo(Boolean.valueOf(mVWondoReward.mo35749g()));
        if (compareTo != 0 || ((mo35749g() && (compareTo = C25082a.m62839c(this.f30777id, mVWondoReward.f30777id)) != 0) || (compareTo = Boolean.valueOf(mo35752i()).compareTo(Boolean.valueOf(mVWondoReward.mo35752i()))) != 0 || ((mo35752i() && (compareTo = this.status.compareTo(mVWondoReward.status)) != 0) || (compareTo = Boolean.valueOf(mo35748f()).compareTo(Boolean.valueOf(mVWondoReward.mo35748f()))) != 0 || ((mo35748f() && (compareTo = this.displayInfo.compareTo(mVWondoReward.displayInfo)) != 0) || (compareTo = Boolean.valueOf(mo35750h()).compareTo(Boolean.valueOf(mVWondoReward.mo35750h()))) != 0)))) {
            return compareTo;
        }
        if (!mo35750h() || (h = C25082a.m62844h(this.providers, mVWondoReward.providers)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWondoReward)) {
            return false;
        }
        MVWondoReward mVWondoReward = (MVWondoReward) obj;
        if (this.f30777id != mVWondoReward.f30777id) {
            return false;
        }
        boolean i = mo35752i();
        boolean i2 = mVWondoReward.mo35752i();
        if ((i || i2) && (!i || !i2 || !this.status.equals(mVWondoReward.status))) {
            return false;
        }
        boolean f = mo35748f();
        boolean f2 = mVWondoReward.mo35748f();
        if ((f || f2) && (!f || !f2 || !this.displayInfo.mo35756a(mVWondoReward.displayInfo))) {
            return false;
        }
        boolean h = mo35750h();
        boolean h2 = mVWondoReward.mo35750h();
        if ((h || h2) && (!h || !h2 || !this.providers.equals(mVWondoReward.providers))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35748f() {
        return this.displayInfo != null;
    }

    /* renamed from: g */
    public final boolean mo35749g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo35750h() {
        return this.providers != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35752i() {
        return this.status != null;
    }

    /* renamed from: j */
    public final void mo35753j(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoReward(", "id:");
        C0016g.m42z(n, this.f30777id, ", ", "status:");
        MVWondoRewardStatus mVWondoRewardStatus = this.status;
        if (mVWondoRewardStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWondoRewardStatus);
        }
        n.append(", ");
        n.append("displayInfo:");
        MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo = this.displayInfo;
        if (mVWondoRewardDisplayInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWondoRewardDisplayInfo);
        }
        n.append(", ");
        n.append("providers:");
        List<String> list = this.providers;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
