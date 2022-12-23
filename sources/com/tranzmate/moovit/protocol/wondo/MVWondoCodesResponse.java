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

public class MVWondoCodesResponse implements TBase<MVWondoCodesResponse, _Fields>, Serializable, Cloneable, Comparable<MVWondoCodesResponse> {

    /* renamed from: b */
    public static final C25113c f30693b = new C25113c("offers", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f30694c = new C25113c("codes", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f30695d = new C25113c("rewards", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30696e = new C25113c("campaigns", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f30697f = new C25113c("offersExplantion", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f30698g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30699h;
    public List<MVWondoCampaign> campaigns;
    public List<MVWondoCode> codes;
    public List<MVWondoOffer> offers;
    public MVWondoOffersExplanation offersExplantion;
    private _Fields[] optionals = {_Fields.OFFERS_EXPLANTION};
    public MVWondoRewards rewards;

    public enum _Fields implements C25085c {
        OFFERS(1, "offers"),
        CODES(2, "codes"),
        REWARDS(3, "rewards"),
        CAMPAIGNS(4, "campaigns"),
        OFFERS_EXPLANTION(5, "offersExplantion");
        
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
                return OFFERS;
            }
            if (i == 2) {
                return CODES;
            }
            if (i == 3) {
                return REWARDS;
            }
            if (i == 4) {
                return CAMPAIGNS;
            }
            if (i != 5) {
                return null;
            }
            return OFFERS_EXPLANTION;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCodesResponse$a */
    public static class C12021a extends C25239c<MVWondoCodesResponse> {
        public C12021a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoCodesResponse mVWondoCodesResponse = (MVWondoCodesResponse) tBase;
            MVWondoRewards mVWondoRewards = mVWondoCodesResponse.rewards;
            C25113c cVar = MVWondoCodesResponse.f30693b;
            gVar.mo61687K();
            if (mVWondoCodesResponse.offers != null) {
                gVar.mo61711x(MVWondoCodesResponse.f30693b);
                gVar.mo61680D(new C25119e((byte) 12, mVWondoCodesResponse.offers.size()));
                for (MVWondoOffer X0 : mVWondoCodesResponse.offers) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVWondoCodesResponse.codes != null) {
                gVar.mo61711x(MVWondoCodesResponse.f30694c);
                gVar.mo61680D(new C25119e((byte) 12, mVWondoCodesResponse.codes.size()));
                for (MVWondoCode X02 : mVWondoCodesResponse.codes) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVWondoCodesResponse.rewards != null) {
                gVar.mo61711x(MVWondoCodesResponse.f30695d);
                mVWondoCodesResponse.rewards.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWondoCodesResponse.campaigns != null) {
                gVar.mo61711x(MVWondoCodesResponse.f30696e);
                gVar.mo61680D(new C25119e((byte) 12, mVWondoCodesResponse.campaigns.size()));
                for (MVWondoCampaign X03 : mVWondoCodesResponse.campaigns) {
                    X03.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVWondoCodesResponse.offersExplantion != null && mVWondoCodesResponse.mo35635i()) {
                gVar.mo61711x(MVWondoCodesResponse.f30697f);
                mVWondoCodesResponse.offersExplantion.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoCodesResponse mVWondoCodesResponse = (MVWondoCodesResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVWondoRewards mVWondoRewards = mVWondoCodesResponse.rewards;
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVWondoOffersExplanation mVWondoOffersExplanation = new MVWondoOffersExplanation();
                                    mVWondoCodesResponse.offersExplantion = mVWondoOffersExplanation;
                                    mVWondoOffersExplanation.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVWondoCodesResponse.campaigns = new ArrayList(k.f63395b);
                                while (i < k.f63395b) {
                                    MVWondoCampaign mVWondoCampaign = new MVWondoCampaign();
                                    mVWondoCampaign.mo25201C1(gVar);
                                    mVWondoCodesResponse.campaigns.add(mVWondoCampaign);
                                    i++;
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVWondoRewards mVWondoRewards2 = new MVWondoRewards();
                            mVWondoCodesResponse.rewards = mVWondoRewards2;
                            mVWondoRewards2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k2 = gVar.mo61698k();
                        mVWondoCodesResponse.codes = new ArrayList(k2.f63395b);
                        while (i < k2.f63395b) {
                            MVWondoCode mVWondoCode = new MVWondoCode();
                            mVWondoCode.mo25201C1(gVar);
                            mVWondoCodesResponse.codes.add(mVWondoCode);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k3 = gVar.mo61698k();
                    mVWondoCodesResponse.offers = new ArrayList(k3.f63395b);
                    while (i < k3.f63395b) {
                        MVWondoOffer mVWondoOffer = new MVWondoOffer();
                        mVWondoOffer.mo25201C1(gVar);
                        mVWondoCodesResponse.offers.add(mVWondoOffer);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCodesResponse$b */
    public static class C12022b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12021a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCodesResponse$c */
    public static class C12023c extends C25240d<MVWondoCodesResponse> {
        public C12023c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoCodesResponse mVWondoCodesResponse = (MVWondoCodesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoCodesResponse.mo35633h()) {
                bitSet.set(0);
            }
            if (mVWondoCodesResponse.mo35632g()) {
                bitSet.set(1);
            }
            if (mVWondoCodesResponse.mo35636j()) {
                bitSet.set(2);
            }
            if (mVWondoCodesResponse.mo35631f()) {
                bitSet.set(3);
            }
            if (mVWondoCodesResponse.mo35635i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVWondoCodesResponse.mo35633h()) {
                jVar.mo61678B(mVWondoCodesResponse.offers.size());
                for (MVWondoOffer X0 : mVWondoCodesResponse.offers) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVWondoCodesResponse.mo35632g()) {
                jVar.mo61678B(mVWondoCodesResponse.codes.size());
                for (MVWondoCode X02 : mVWondoCodesResponse.codes) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVWondoCodesResponse.mo35636j()) {
                mVWondoCodesResponse.rewards.mo25202X0(jVar);
            }
            if (mVWondoCodesResponse.mo35631f()) {
                jVar.mo61678B(mVWondoCodesResponse.campaigns.size());
                for (MVWondoCampaign X03 : mVWondoCodesResponse.campaigns) {
                    X03.mo25202X0(jVar);
                }
            }
            if (mVWondoCodesResponse.mo35635i()) {
                mVWondoCodesResponse.offersExplantion.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoCodesResponse mVWondoCodesResponse = (MVWondoCodesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVWondoCodesResponse.offers = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWondoOffer mVWondoOffer = new MVWondoOffer();
                    mVWondoOffer.mo25201C1(jVar);
                    mVWondoCodesResponse.offers.add(mVWondoOffer);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVWondoCodesResponse.codes = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVWondoCode mVWondoCode = new MVWondoCode();
                    mVWondoCode.mo25201C1(jVar);
                    mVWondoCodesResponse.codes.add(mVWondoCode);
                }
            }
            if (T.get(2)) {
                MVWondoRewards mVWondoRewards = new MVWondoRewards();
                mVWondoCodesResponse.rewards = mVWondoRewards;
                mVWondoRewards.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i5 = jVar.mo61696i();
                mVWondoCodesResponse.campaigns = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    MVWondoCampaign mVWondoCampaign = new MVWondoCampaign();
                    mVWondoCampaign.mo25201C1(jVar);
                    mVWondoCodesResponse.campaigns.add(mVWondoCampaign);
                }
            }
            if (T.get(4)) {
                MVWondoOffersExplanation mVWondoOffersExplanation = new MVWondoOffersExplanation();
                mVWondoCodesResponse.offersExplantion = mVWondoOffersExplanation;
                mVWondoOffersExplanation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCodesResponse$d */
    public static class C12024d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12023c(0);
        }
    }

    static {
        new C17394d0("MVWondoCodesResponse");
        HashMap hashMap = new HashMap();
        f30698g = hashMap;
        hashMap.put(C25239c.class, new C12022b());
        hashMap.put(C25240d.class, new C12024d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OFFERS, new FieldMetaData("offers", (byte) 3, new ListMetaData(new StructMetaData(MVWondoOffer.class))));
        enumMap.put(_Fields.CODES, new FieldMetaData("codes", (byte) 3, new ListMetaData(new StructMetaData(MVWondoCode.class))));
        enumMap.put(_Fields.REWARDS, new FieldMetaData("rewards", (byte) 3, new StructMetaData(MVWondoRewards.class)));
        enumMap.put(_Fields.CAMPAIGNS, new FieldMetaData("campaigns", (byte) 3, new ListMetaData(new StructMetaData(MVWondoCampaign.class))));
        enumMap.put(_Fields.OFFERS_EXPLANTION, new FieldMetaData("offersExplantion", (byte) 2, new StructMetaData(MVWondoOffersExplanation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30699h = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoCodesResponse.class, unmodifiableMap);
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
        ((C25238b) f30698g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30698g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoCodesResponse mVWondoCodesResponse = (MVWondoCodesResponse) obj;
        if (!getClass().equals(mVWondoCodesResponse.getClass())) {
            return getClass().getName().compareTo(mVWondoCodesResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35633h()).compareTo(Boolean.valueOf(mVWondoCodesResponse.mo35633h()));
        if (compareTo2 != 0 || ((mo35633h() && (compareTo2 = C25082a.m62844h(this.offers, mVWondoCodesResponse.offers)) != 0) || (compareTo2 = Boolean.valueOf(mo35632g()).compareTo(Boolean.valueOf(mVWondoCodesResponse.mo35632g()))) != 0 || ((mo35632g() && (compareTo2 = C25082a.m62844h(this.codes, mVWondoCodesResponse.codes)) != 0) || (compareTo2 = Boolean.valueOf(mo35636j()).compareTo(Boolean.valueOf(mVWondoCodesResponse.mo35636j()))) != 0 || ((mo35636j() && (compareTo2 = this.rewards.compareTo(mVWondoCodesResponse.rewards)) != 0) || (compareTo2 = Boolean.valueOf(mo35631f()).compareTo(Boolean.valueOf(mVWondoCodesResponse.mo35631f()))) != 0 || ((mo35631f() && (compareTo2 = C25082a.m62844h(this.campaigns, mVWondoCodesResponse.campaigns)) != 0) || (compareTo2 = Boolean.valueOf(mo35635i()).compareTo(Boolean.valueOf(mVWondoCodesResponse.mo35635i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo35635i() || (compareTo = this.offersExplantion.compareTo(mVWondoCodesResponse.offersExplantion)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWondoCodesResponse)) {
            return false;
        }
        MVWondoCodesResponse mVWondoCodesResponse = (MVWondoCodesResponse) obj;
        boolean h = mo35633h();
        boolean h2 = mVWondoCodesResponse.mo35633h();
        if ((h || h2) && (!h || !h2 || !this.offers.equals(mVWondoCodesResponse.offers))) {
            return false;
        }
        boolean g = mo35632g();
        boolean g2 = mVWondoCodesResponse.mo35632g();
        if ((g || g2) && (!g || !g2 || !this.codes.equals(mVWondoCodesResponse.codes))) {
            return false;
        }
        boolean j = mo35636j();
        boolean j2 = mVWondoCodesResponse.mo35636j();
        if ((j || j2) && (!j || !j2 || !this.rewards.mo35769a(mVWondoCodesResponse.rewards))) {
            return false;
        }
        boolean f = mo35631f();
        boolean f2 = mVWondoCodesResponse.mo35631f();
        if ((f || f2) && (!f || !f2 || !this.campaigns.equals(mVWondoCodesResponse.campaigns))) {
            return false;
        }
        boolean i = mo35635i();
        boolean i2 = mVWondoCodesResponse.mo35635i();
        if ((i || i2) && (!i || !i2 || !this.offersExplantion.mo35714a(mVWondoCodesResponse.offersExplantion))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35631f() {
        return this.campaigns != null;
    }

    /* renamed from: g */
    public final boolean mo35632g() {
        return this.codes != null;
    }

    /* renamed from: h */
    public final boolean mo35633h() {
        return this.offers != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35635i() {
        return this.offersExplantion != null;
    }

    /* renamed from: j */
    public final boolean mo35636j() {
        return this.rewards != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoCodesResponse(", "offers:");
        List<MVWondoOffer> list = this.offers;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("codes:");
        List<MVWondoCode> list2 = this.codes;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("rewards:");
        MVWondoRewards mVWondoRewards = this.rewards;
        if (mVWondoRewards == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWondoRewards);
        }
        n.append(", ");
        n.append("campaigns:");
        List<MVWondoCampaign> list3 = this.campaigns;
        if (list3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list3);
        }
        if (mo35635i()) {
            n.append(", ");
            n.append("offersExplantion:");
            MVWondoOffersExplanation mVWondoOffersExplanation = this.offersExplantion;
            if (mVWondoOffersExplanation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVWondoOffersExplanation);
            }
        }
        n.append(")");
        return n.toString();
    }
}
