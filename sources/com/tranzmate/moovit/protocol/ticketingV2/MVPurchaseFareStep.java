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

public class MVPurchaseFareStep implements TBase<MVPurchaseFareStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseFareStep> {

    /* renamed from: b */
    public static final C25113c f28826b = new C25113c("fare", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28827c = new C25113c("appliedFilters", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f28828d = new C25113c("discountContextId", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f28829e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28830f;
    public List<MVFilter> appliedFilters;
    public String discountContextId;
    public MVTicketingFare fare;
    private _Fields[] optionals = {_Fields.APPLIED_FILTERS, _Fields.DISCOUNT_CONTEXT_ID};

    public enum _Fields implements C25085c {
        FARE(1, "fare"),
        APPLIED_FILTERS(2, "appliedFilters"),
        DISCOUNT_CONTEXT_ID(3, "discountContextId");
        
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
                return FARE;
            }
            if (i == 2) {
                return APPLIED_FILTERS;
            }
            if (i != 3) {
                return null;
            }
            return DISCOUNT_CONTEXT_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareStep$a */
    public static class C10878a extends C25239c<MVPurchaseFareStep> {
        public C10878a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareStep mVPurchaseFareStep = (MVPurchaseFareStep) tBase;
            MVTicketingFare mVTicketingFare = mVPurchaseFareStep.fare;
            if (mVTicketingFare != null) {
                mVTicketingFare.mo33182w();
            }
            C25113c cVar = MVPurchaseFareStep.f28826b;
            gVar.mo61687K();
            if (mVPurchaseFareStep.fare != null) {
                gVar.mo61711x(MVPurchaseFareStep.f28826b);
                mVPurchaseFareStep.fare.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseFareStep.appliedFilters != null && mVPurchaseFareStep.mo32563f()) {
                gVar.mo61711x(MVPurchaseFareStep.f28827c);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseFareStep.appliedFilters.size()));
                for (MVFilter X0 : mVPurchaseFareStep.appliedFilters) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseFareStep.discountContextId != null && mVPurchaseFareStep.mo32564g()) {
                gVar.mo61711x(MVPurchaseFareStep.f28828d);
                gVar.mo61686J(mVPurchaseFareStep.discountContextId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareStep mVPurchaseFareStep = (MVPurchaseFareStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPurchaseFareStep.discountContextId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVPurchaseFareStep.appliedFilters = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVFilter mVFilter = new MVFilter();
                            mVFilter.mo25201C1(gVar);
                            mVPurchaseFareStep.appliedFilters.add(mVFilter);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTicketingFare mVTicketingFare = new MVTicketingFare();
                    mVPurchaseFareStep.fare = mVTicketingFare;
                    mVTicketingFare.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTicketingFare mVTicketingFare2 = mVPurchaseFareStep.fare;
            if (mVTicketingFare2 != null) {
                mVTicketingFare2.mo33182w();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareStep$b */
    public static class C10879b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10878a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareStep$c */
    public static class C10880c extends C25240d<MVPurchaseFareStep> {
        public C10880c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareStep mVPurchaseFareStep = (MVPurchaseFareStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseFareStep.mo32565h()) {
                bitSet.set(0);
            }
            if (mVPurchaseFareStep.mo32563f()) {
                bitSet.set(1);
            }
            if (mVPurchaseFareStep.mo32564g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPurchaseFareStep.mo32565h()) {
                mVPurchaseFareStep.fare.mo25202X0(jVar);
            }
            if (mVPurchaseFareStep.mo32563f()) {
                jVar.mo61678B(mVPurchaseFareStep.appliedFilters.size());
                for (MVFilter X0 : mVPurchaseFareStep.appliedFilters) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseFareStep.mo32564g()) {
                jVar.mo61686J(mVPurchaseFareStep.discountContextId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareStep mVPurchaseFareStep = (MVPurchaseFareStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVTicketingFare mVTicketingFare = new MVTicketingFare();
                mVPurchaseFareStep.fare = mVTicketingFare;
                mVTicketingFare.mo25201C1(jVar);
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPurchaseFareStep.appliedFilters = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVFilter mVFilter = new MVFilter();
                    mVFilter.mo25201C1(jVar);
                    mVPurchaseFareStep.appliedFilters.add(mVFilter);
                }
            }
            if (T.get(2)) {
                mVPurchaseFareStep.discountContextId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareStep$d */
    public static class C10881d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10880c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseFareStep");
        HashMap hashMap = new HashMap();
        f28829e = hashMap;
        hashMap.put(C25239c.class, new C10879b());
        hashMap.put(C25240d.class, new C10881d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FARE, new FieldMetaData("fare", (byte) 3, new StructMetaData(MVTicketingFare.class)));
        enumMap.put(_Fields.APPLIED_FILTERS, new FieldMetaData("appliedFilters", (byte) 2, new ListMetaData(new StructMetaData(MVFilter.class))));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28830f = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseFareStep.class, unmodifiableMap);
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
        ((C25238b) f28829e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28829e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseFareStep mVPurchaseFareStep = (MVPurchaseFareStep) obj;
        if (!getClass().equals(mVPurchaseFareStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseFareStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32565h()).compareTo(Boolean.valueOf(mVPurchaseFareStep.mo32565h()));
        if (compareTo2 != 0 || ((mo32565h() && (compareTo2 = this.fare.compareTo(mVPurchaseFareStep.fare)) != 0) || (compareTo2 = Boolean.valueOf(mo32563f()).compareTo(Boolean.valueOf(mVPurchaseFareStep.mo32563f()))) != 0 || ((mo32563f() && (compareTo2 = C25082a.m62844h(this.appliedFilters, mVPurchaseFareStep.appliedFilters)) != 0) || (compareTo2 = Boolean.valueOf(mo32564g()).compareTo(Boolean.valueOf(mVPurchaseFareStep.mo32564g()))) != 0))) {
            return compareTo2;
        }
        if (!mo32564g() || (compareTo = this.discountContextId.compareTo(mVPurchaseFareStep.discountContextId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseFareStep)) {
            return false;
        }
        MVPurchaseFareStep mVPurchaseFareStep = (MVPurchaseFareStep) obj;
        boolean h = mo32565h();
        boolean h2 = mVPurchaseFareStep.mo32565h();
        if ((h || h2) && (!h || !h2 || !this.fare.mo33161a(mVPurchaseFareStep.fare))) {
            return false;
        }
        boolean f = mo32563f();
        boolean f2 = mVPurchaseFareStep.mo32563f();
        if ((f || f2) && (!f || !f2 || !this.appliedFilters.equals(mVPurchaseFareStep.appliedFilters))) {
            return false;
        }
        boolean g = mo32564g();
        boolean g2 = mVPurchaseFareStep.mo32564g();
        if ((g || g2) && (!g || !g2 || !this.discountContextId.equals(mVPurchaseFareStep.discountContextId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32563f() {
        return this.appliedFilters != null;
    }

    /* renamed from: g */
    public final boolean mo32564g() {
        return this.discountContextId != null;
    }

    /* renamed from: h */
    public final boolean mo32565h() {
        return this.fare != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseFareStep(", "fare:");
        MVTicketingFare mVTicketingFare = this.fare;
        if (mVTicketingFare == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTicketingFare);
        }
        if (mo32563f()) {
            n.append(", ");
            n.append("appliedFilters:");
            List<MVFilter> list = this.appliedFilters;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo32564g()) {
            n.append(", ");
            n.append("discountContextId:");
            String str = this.discountContextId;
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
