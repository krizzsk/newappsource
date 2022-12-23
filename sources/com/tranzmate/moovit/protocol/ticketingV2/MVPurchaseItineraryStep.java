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

public class MVPurchaseItineraryStep implements TBase<MVPurchaseItineraryStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseItineraryStep> {

    /* renamed from: b */
    public static final C25113c f28917b = new C25113c("itineraryId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28918c = new C25113c("fares", (byte) 15, 4);

    /* renamed from: d */
    public static final C25113c f28919d = new C25113c("verificationType", (byte) 8, 5);

    /* renamed from: e */
    public static final C25113c f28920e = new C25113c("appliedFilters", (byte) 15, 6);

    /* renamed from: f */
    public static final C25113c f28921f = new C25113c("discountContextId", (byte) 11, 7);

    /* renamed from: g */
    public static final C25113c f28922g = new C25113c("paymentContext", (byte) 11, 8);

    /* renamed from: h */
    public static final C25113c f28923h = new C25113c("paymentDescription", (byte) 11, 9);

    /* renamed from: i */
    public static final HashMap f28924i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f28925j;
    public List<MVFilter> appliedFilters;
    public String discountContextId;
    public List<MVTicketingItineraryFare> fares;
    public String itineraryId;
    private _Fields[] optionals = {_Fields.APPLIED_FILTERS, _Fields.DISCOUNT_CONTEXT_ID};
    public String paymentContext;
    public String paymentDescription;
    public MVPurchaseVerifacationType verificationType;

    public enum _Fields implements C25085c {
        ITINERARY_ID(1, "itineraryId"),
        FARES(4, "fares"),
        VERIFICATION_TYPE(5, "verificationType"),
        APPLIED_FILTERS(6, "appliedFilters"),
        DISCOUNT_CONTEXT_ID(7, "discountContextId"),
        PAYMENT_CONTEXT(8, "paymentContext"),
        PAYMENT_DESCRIPTION(9, "paymentDescription");
        
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
                return ITINERARY_ID;
            }
            switch (i) {
                case 4:
                    return FARES;
                case 5:
                    return VERIFICATION_TYPE;
                case 6:
                    return APPLIED_FILTERS;
                case 7:
                    return DISCOUNT_CONTEXT_ID;
                case 8:
                    return PAYMENT_CONTEXT;
                case 9:
                    return PAYMENT_DESCRIPTION;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryStep$a */
    public static class C10929a extends C25239c<MVPurchaseItineraryStep> {
        public C10929a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryStep mVPurchaseItineraryStep = (MVPurchaseItineraryStep) tBase;
            mVPurchaseItineraryStep.getClass();
            C25113c cVar = MVPurchaseItineraryStep.f28917b;
            gVar.mo61687K();
            if (mVPurchaseItineraryStep.itineraryId != null) {
                gVar.mo61711x(MVPurchaseItineraryStep.f28917b);
                gVar.mo61686J(mVPurchaseItineraryStep.itineraryId);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryStep.fares != null) {
                gVar.mo61711x(MVPurchaseItineraryStep.f28918c);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseItineraryStep.fares.size()));
                for (MVTicketingItineraryFare X0 : mVPurchaseItineraryStep.fares) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryStep.verificationType != null) {
                gVar.mo61711x(MVPurchaseItineraryStep.f28919d);
                gVar.mo61678B(mVPurchaseItineraryStep.verificationType.getValue());
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryStep.appliedFilters != null && mVPurchaseItineraryStep.mo32690f()) {
                gVar.mo61711x(MVPurchaseItineraryStep.f28920e);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseItineraryStep.appliedFilters.size()));
                for (MVFilter X02 : mVPurchaseItineraryStep.appliedFilters) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryStep.discountContextId != null && mVPurchaseItineraryStep.mo32691g()) {
                gVar.mo61711x(MVPurchaseItineraryStep.f28921f);
                gVar.mo61686J(mVPurchaseItineraryStep.discountContextId);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryStep.paymentContext != null) {
                gVar.mo61711x(MVPurchaseItineraryStep.f28922g);
                gVar.mo61686J(mVPurchaseItineraryStep.paymentContext);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryStep.paymentDescription != null) {
                gVar.mo61711x(MVPurchaseItineraryStep.f28923h);
                gVar.mo61686J(mVPurchaseItineraryStep.paymentDescription);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryStep mVPurchaseItineraryStep = (MVPurchaseItineraryStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseItineraryStep.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    int i = 0;
                    switch (s) {
                        case 4:
                            if (b != 15) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                C25119e k = gVar.mo61698k();
                                mVPurchaseItineraryStep.fares = new ArrayList(k.f63395b);
                                while (i < k.f63395b) {
                                    MVTicketingItineraryFare mVTicketingItineraryFare = new MVTicketingItineraryFare();
                                    mVTicketingItineraryFare.mo25201C1(gVar);
                                    mVPurchaseItineraryStep.fares.add(mVTicketingItineraryFare);
                                    i++;
                                }
                                gVar.mo61699l();
                                break;
                            }
                        case 5:
                            if (b != 8) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                mVPurchaseItineraryStep.verificationType = MVPurchaseVerifacationType.findByValue(gVar.mo61696i());
                                break;
                            }
                        case 6:
                            if (b != 15) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                C25119e k2 = gVar.mo61698k();
                                mVPurchaseItineraryStep.appliedFilters = new ArrayList(k2.f63395b);
                                while (i < k2.f63395b) {
                                    MVFilter mVFilter = new MVFilter();
                                    mVFilter.mo25201C1(gVar);
                                    mVPurchaseItineraryStep.appliedFilters.add(mVFilter);
                                    i++;
                                }
                                gVar.mo61699l();
                                break;
                            }
                        case 7:
                            if (b != 11) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                mVPurchaseItineraryStep.discountContextId = gVar.mo61704q();
                                break;
                            }
                        case 8:
                            if (b != 11) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                mVPurchaseItineraryStep.paymentContext = gVar.mo61704q();
                                break;
                            }
                        case 9:
                            if (b != 11) {
                                C25122h.m63098a(gVar, b);
                                break;
                            } else {
                                mVPurchaseItineraryStep.paymentDescription = gVar.mo61704q();
                                break;
                            }
                        default:
                            C25122h.m63098a(gVar, b);
                            break;
                    }
                } else if (b == 11) {
                    mVPurchaseItineraryStep.itineraryId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryStep$b */
    public static class C10930b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10929a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryStep$c */
    public static class C10931c extends C25240d<MVPurchaseItineraryStep> {
        public C10931c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryStep mVPurchaseItineraryStep = (MVPurchaseItineraryStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseItineraryStep.mo32694i()) {
                bitSet.set(0);
            }
            if (mVPurchaseItineraryStep.mo32692h()) {
                bitSet.set(1);
            }
            if (mVPurchaseItineraryStep.mo32697l()) {
                bitSet.set(2);
            }
            if (mVPurchaseItineraryStep.mo32690f()) {
                bitSet.set(3);
            }
            if (mVPurchaseItineraryStep.mo32691g()) {
                bitSet.set(4);
            }
            if (mVPurchaseItineraryStep.mo32695j()) {
                bitSet.set(5);
            }
            if (mVPurchaseItineraryStep.mo32696k()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVPurchaseItineraryStep.mo32694i()) {
                jVar.mo61686J(mVPurchaseItineraryStep.itineraryId);
            }
            if (mVPurchaseItineraryStep.mo32692h()) {
                jVar.mo61678B(mVPurchaseItineraryStep.fares.size());
                for (MVTicketingItineraryFare X0 : mVPurchaseItineraryStep.fares) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseItineraryStep.mo32697l()) {
                jVar.mo61678B(mVPurchaseItineraryStep.verificationType.getValue());
            }
            if (mVPurchaseItineraryStep.mo32690f()) {
                jVar.mo61678B(mVPurchaseItineraryStep.appliedFilters.size());
                for (MVFilter X02 : mVPurchaseItineraryStep.appliedFilters) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVPurchaseItineraryStep.mo32691g()) {
                jVar.mo61686J(mVPurchaseItineraryStep.discountContextId);
            }
            if (mVPurchaseItineraryStep.mo32695j()) {
                jVar.mo61686J(mVPurchaseItineraryStep.paymentContext);
            }
            if (mVPurchaseItineraryStep.mo32696k()) {
                jVar.mo61686J(mVPurchaseItineraryStep.paymentDescription);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryStep mVPurchaseItineraryStep = (MVPurchaseItineraryStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVPurchaseItineraryStep.itineraryId = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPurchaseItineraryStep.fares = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTicketingItineraryFare mVTicketingItineraryFare = new MVTicketingItineraryFare();
                    mVTicketingItineraryFare.mo25201C1(jVar);
                    mVPurchaseItineraryStep.fares.add(mVTicketingItineraryFare);
                }
            }
            if (T.get(2)) {
                mVPurchaseItineraryStep.verificationType = MVPurchaseVerifacationType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                int i3 = jVar.mo61696i();
                mVPurchaseItineraryStep.appliedFilters = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVFilter mVFilter = new MVFilter();
                    mVFilter.mo25201C1(jVar);
                    mVPurchaseItineraryStep.appliedFilters.add(mVFilter);
                }
            }
            if (T.get(4)) {
                mVPurchaseItineraryStep.discountContextId = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVPurchaseItineraryStep.paymentContext = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVPurchaseItineraryStep.paymentDescription = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryStep$d */
    public static class C10932d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10931c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseItineraryStep");
        HashMap hashMap = new HashMap();
        f28924i = hashMap;
        hashMap.put(C25239c.class, new C10930b());
        hashMap.put(C25240d.class, new C10932d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ITINERARY_ID, new FieldMetaData("itineraryId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FARES, new FieldMetaData("fares", (byte) 3, new ListMetaData(new StructMetaData(MVTicketingItineraryFare.class))));
        enumMap.put(_Fields.VERIFICATION_TYPE, new FieldMetaData("verificationType", (byte) 3, new EnumMetaData(MVPurchaseVerifacationType.class)));
        enumMap.put(_Fields.APPLIED_FILTERS, new FieldMetaData("appliedFilters", (byte) 2, new ListMetaData(new StructMetaData(MVFilter.class))));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_DESCRIPTION, new FieldMetaData("paymentDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28925j = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseItineraryStep.class, unmodifiableMap);
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
        ((C25238b) f28924i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28924i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseItineraryStep mVPurchaseItineraryStep = (MVPurchaseItineraryStep) obj;
        if (!getClass().equals(mVPurchaseItineraryStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseItineraryStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32694i()).compareTo(Boolean.valueOf(mVPurchaseItineraryStep.mo32694i()));
        if (compareTo2 != 0 || ((mo32694i() && (compareTo2 = this.itineraryId.compareTo(mVPurchaseItineraryStep.itineraryId)) != 0) || (compareTo2 = Boolean.valueOf(mo32692h()).compareTo(Boolean.valueOf(mVPurchaseItineraryStep.mo32692h()))) != 0 || ((mo32692h() && (compareTo2 = C25082a.m62844h(this.fares, mVPurchaseItineraryStep.fares)) != 0) || (compareTo2 = Boolean.valueOf(mo32697l()).compareTo(Boolean.valueOf(mVPurchaseItineraryStep.mo32697l()))) != 0 || ((mo32697l() && (compareTo2 = this.verificationType.compareTo(mVPurchaseItineraryStep.verificationType)) != 0) || (compareTo2 = Boolean.valueOf(mo32690f()).compareTo(Boolean.valueOf(mVPurchaseItineraryStep.mo32690f()))) != 0 || ((mo32690f() && (compareTo2 = C25082a.m62844h(this.appliedFilters, mVPurchaseItineraryStep.appliedFilters)) != 0) || (compareTo2 = Boolean.valueOf(mo32691g()).compareTo(Boolean.valueOf(mVPurchaseItineraryStep.mo32691g()))) != 0 || ((mo32691g() && (compareTo2 = this.discountContextId.compareTo(mVPurchaseItineraryStep.discountContextId)) != 0) || (compareTo2 = Boolean.valueOf(mo32695j()).compareTo(Boolean.valueOf(mVPurchaseItineraryStep.mo32695j()))) != 0 || ((mo32695j() && (compareTo2 = this.paymentContext.compareTo(mVPurchaseItineraryStep.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo32696k()).compareTo(Boolean.valueOf(mVPurchaseItineraryStep.mo32696k()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo32696k() || (compareTo = this.paymentDescription.compareTo(mVPurchaseItineraryStep.paymentDescription)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseItineraryStep)) {
            return false;
        }
        MVPurchaseItineraryStep mVPurchaseItineraryStep = (MVPurchaseItineraryStep) obj;
        boolean i = mo32694i();
        boolean i2 = mVPurchaseItineraryStep.mo32694i();
        if ((i || i2) && (!i || !i2 || !this.itineraryId.equals(mVPurchaseItineraryStep.itineraryId))) {
            return false;
        }
        boolean h = mo32692h();
        boolean h2 = mVPurchaseItineraryStep.mo32692h();
        if ((h || h2) && (!h || !h2 || !this.fares.equals(mVPurchaseItineraryStep.fares))) {
            return false;
        }
        boolean l = mo32697l();
        boolean l2 = mVPurchaseItineraryStep.mo32697l();
        if ((l || l2) && (!l || !l2 || !this.verificationType.equals(mVPurchaseItineraryStep.verificationType))) {
            return false;
        }
        boolean f = mo32690f();
        boolean f2 = mVPurchaseItineraryStep.mo32690f();
        if ((f || f2) && (!f || !f2 || !this.appliedFilters.equals(mVPurchaseItineraryStep.appliedFilters))) {
            return false;
        }
        boolean g = mo32691g();
        boolean g2 = mVPurchaseItineraryStep.mo32691g();
        if ((g || g2) && (!g || !g2 || !this.discountContextId.equals(mVPurchaseItineraryStep.discountContextId))) {
            return false;
        }
        boolean j = mo32695j();
        boolean j2 = mVPurchaseItineraryStep.mo32695j();
        if ((j || j2) && (!j || !j2 || !this.paymentContext.equals(mVPurchaseItineraryStep.paymentContext))) {
            return false;
        }
        boolean k = mo32696k();
        boolean k2 = mVPurchaseItineraryStep.mo32696k();
        if ((k || k2) && (!k || !k2 || !this.paymentDescription.equals(mVPurchaseItineraryStep.paymentDescription))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32690f() {
        return this.appliedFilters != null;
    }

    /* renamed from: g */
    public final boolean mo32691g() {
        return this.discountContextId != null;
    }

    /* renamed from: h */
    public final boolean mo32692h() {
        return this.fares != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32694i() {
        return this.itineraryId != null;
    }

    /* renamed from: j */
    public final boolean mo32695j() {
        return this.paymentContext != null;
    }

    /* renamed from: k */
    public final boolean mo32696k() {
        return this.paymentDescription != null;
    }

    /* renamed from: l */
    public final boolean mo32697l() {
        return this.verificationType != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseItineraryStep(", "itineraryId:");
        String str = this.itineraryId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("fares:");
        List<MVTicketingItineraryFare> list = this.fares;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("verificationType:");
        MVPurchaseVerifacationType mVPurchaseVerifacationType = this.verificationType;
        if (mVPurchaseVerifacationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseVerifacationType);
        }
        if (mo32690f()) {
            n.append(", ");
            n.append("appliedFilters:");
            List<MVFilter> list2 = this.appliedFilters;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo32691g()) {
            n.append(", ");
            n.append("discountContextId:");
            String str2 = this.discountContextId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("paymentContext:");
        String str3 = this.paymentContext;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("paymentDescription:");
        String str4 = this.paymentDescription;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }
}
