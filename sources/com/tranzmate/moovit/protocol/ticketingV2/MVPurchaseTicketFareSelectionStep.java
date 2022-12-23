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

public class MVPurchaseTicketFareSelectionStep implements TBase<MVPurchaseTicketFareSelectionStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseTicketFareSelectionStep> {

    /* renamed from: b */
    public static final C25113c f29022b = new C25113c("fares", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29023c = new C25113c("metroLevelHeaderMessage", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29024d = new C25113c("appliedFilters", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f29025e = new C25113c("title", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f29026f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29027g;
    public List<MVFilter> appliedFilters;
    public List<MVTicketingFare> fares;
    public String metroLevelHeaderMessage;
    private _Fields[] optionals = {_Fields.METRO_LEVEL_HEADER_MESSAGE, _Fields.APPLIED_FILTERS, _Fields.TITLE};
    public String title;

    public enum _Fields implements C25085c {
        FARES(1, "fares"),
        METRO_LEVEL_HEADER_MESSAGE(2, "metroLevelHeaderMessage"),
        APPLIED_FILTERS(3, "appliedFilters"),
        TITLE(4, "title");
        
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
                return FARES;
            }
            if (i == 2) {
                return METRO_LEVEL_HEADER_MESSAGE;
            }
            if (i == 3) {
                return APPLIED_FILTERS;
            }
            if (i != 4) {
                return null;
            }
            return TITLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareSelectionStep$a */
    public static class C10987a extends C25239c<MVPurchaseTicketFareSelectionStep> {
        public C10987a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareSelectionStep mVPurchaseTicketFareSelectionStep = (MVPurchaseTicketFareSelectionStep) tBase;
            mVPurchaseTicketFareSelectionStep.getClass();
            C25113c cVar = MVPurchaseTicketFareSelectionStep.f29022b;
            gVar.mo61687K();
            if (mVPurchaseTicketFareSelectionStep.fares != null) {
                gVar.mo61711x(MVPurchaseTicketFareSelectionStep.f29022b);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseTicketFareSelectionStep.fares.size()));
                for (MVTicketingFare X0 : mVPurchaseTicketFareSelectionStep.fares) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseTicketFareSelectionStep.metroLevelHeaderMessage != null && mVPurchaseTicketFareSelectionStep.mo32851h()) {
                gVar.mo61711x(MVPurchaseTicketFareSelectionStep.f29023c);
                gVar.mo61686J(mVPurchaseTicketFareSelectionStep.metroLevelHeaderMessage);
                gVar.mo61712y();
            }
            if (mVPurchaseTicketFareSelectionStep.appliedFilters != null && mVPurchaseTicketFareSelectionStep.mo32849f()) {
                gVar.mo61711x(MVPurchaseTicketFareSelectionStep.f29024d);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseTicketFareSelectionStep.appliedFilters.size()));
                for (MVFilter X02 : mVPurchaseTicketFareSelectionStep.appliedFilters) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseTicketFareSelectionStep.title != null && mVPurchaseTicketFareSelectionStep.mo32853i()) {
                gVar.mo61711x(MVPurchaseTicketFareSelectionStep.f29025e);
                gVar.mo61686J(mVPurchaseTicketFareSelectionStep.title);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareSelectionStep mVPurchaseTicketFareSelectionStep = (MVPurchaseTicketFareSelectionStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseTicketFareSelectionStep.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVPurchaseTicketFareSelectionStep.title = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVPurchaseTicketFareSelectionStep.appliedFilters = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVFilter mVFilter = new MVFilter();
                                mVFilter.mo25201C1(gVar);
                                mVPurchaseTicketFareSelectionStep.appliedFilters.add(mVFilter);
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPurchaseTicketFareSelectionStep.metroLevelHeaderMessage = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVPurchaseTicketFareSelectionStep.fares = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVTicketingFare mVTicketingFare = new MVTicketingFare();
                        mVTicketingFare.mo25201C1(gVar);
                        mVPurchaseTicketFareSelectionStep.fares.add(mVTicketingFare);
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareSelectionStep$b */
    public static class C10988b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10987a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareSelectionStep$c */
    public static class C10989c extends C25240d<MVPurchaseTicketFareSelectionStep> {
        public C10989c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareSelectionStep mVPurchaseTicketFareSelectionStep = (MVPurchaseTicketFareSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseTicketFareSelectionStep.mo32850g()) {
                bitSet.set(0);
            }
            if (mVPurchaseTicketFareSelectionStep.mo32851h()) {
                bitSet.set(1);
            }
            if (mVPurchaseTicketFareSelectionStep.mo32849f()) {
                bitSet.set(2);
            }
            if (mVPurchaseTicketFareSelectionStep.mo32853i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPurchaseTicketFareSelectionStep.mo32850g()) {
                jVar.mo61678B(mVPurchaseTicketFareSelectionStep.fares.size());
                for (MVTicketingFare X0 : mVPurchaseTicketFareSelectionStep.fares) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseTicketFareSelectionStep.mo32851h()) {
                jVar.mo61686J(mVPurchaseTicketFareSelectionStep.metroLevelHeaderMessage);
            }
            if (mVPurchaseTicketFareSelectionStep.mo32849f()) {
                jVar.mo61678B(mVPurchaseTicketFareSelectionStep.appliedFilters.size());
                for (MVFilter X02 : mVPurchaseTicketFareSelectionStep.appliedFilters) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVPurchaseTicketFareSelectionStep.mo32853i()) {
                jVar.mo61686J(mVPurchaseTicketFareSelectionStep.title);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketFareSelectionStep mVPurchaseTicketFareSelectionStep = (MVPurchaseTicketFareSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPurchaseTicketFareSelectionStep.fares = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTicketingFare mVTicketingFare = new MVTicketingFare();
                    mVTicketingFare.mo25201C1(jVar);
                    mVPurchaseTicketFareSelectionStep.fares.add(mVTicketingFare);
                }
            }
            if (T.get(1)) {
                mVPurchaseTicketFareSelectionStep.metroLevelHeaderMessage = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i3 = jVar.mo61696i();
                mVPurchaseTicketFareSelectionStep.appliedFilters = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVFilter mVFilter = new MVFilter();
                    mVFilter.mo25201C1(jVar);
                    mVPurchaseTicketFareSelectionStep.appliedFilters.add(mVFilter);
                }
            }
            if (T.get(3)) {
                mVPurchaseTicketFareSelectionStep.title = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareSelectionStep$d */
    public static class C10990d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10989c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseTicketFareSelectionStep");
        HashMap hashMap = new HashMap();
        f29026f = hashMap;
        hashMap.put(C25239c.class, new C10988b());
        hashMap.put(C25240d.class, new C10990d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FARES, new FieldMetaData("fares", (byte) 3, new ListMetaData(new StructMetaData(MVTicketingFare.class))));
        enumMap.put(_Fields.METRO_LEVEL_HEADER_MESSAGE, new FieldMetaData("metroLevelHeaderMessage", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.APPLIED_FILTERS, new FieldMetaData("appliedFilters", (byte) 2, new ListMetaData(new StructMetaData(MVFilter.class))));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29027g = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseTicketFareSelectionStep.class, unmodifiableMap);
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
        ((C25238b) f29026f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29026f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseTicketFareSelectionStep mVPurchaseTicketFareSelectionStep = (MVPurchaseTicketFareSelectionStep) obj;
        if (!getClass().equals(mVPurchaseTicketFareSelectionStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseTicketFareSelectionStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32850g()).compareTo(Boolean.valueOf(mVPurchaseTicketFareSelectionStep.mo32850g()));
        if (compareTo2 != 0 || ((mo32850g() && (compareTo2 = C25082a.m62844h(this.fares, mVPurchaseTicketFareSelectionStep.fares)) != 0) || (compareTo2 = Boolean.valueOf(mo32851h()).compareTo(Boolean.valueOf(mVPurchaseTicketFareSelectionStep.mo32851h()))) != 0 || ((mo32851h() && (compareTo2 = this.metroLevelHeaderMessage.compareTo(mVPurchaseTicketFareSelectionStep.metroLevelHeaderMessage)) != 0) || (compareTo2 = Boolean.valueOf(mo32849f()).compareTo(Boolean.valueOf(mVPurchaseTicketFareSelectionStep.mo32849f()))) != 0 || ((mo32849f() && (compareTo2 = C25082a.m62844h(this.appliedFilters, mVPurchaseTicketFareSelectionStep.appliedFilters)) != 0) || (compareTo2 = Boolean.valueOf(mo32853i()).compareTo(Boolean.valueOf(mVPurchaseTicketFareSelectionStep.mo32853i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo32853i() || (compareTo = this.title.compareTo(mVPurchaseTicketFareSelectionStep.title)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseTicketFareSelectionStep)) {
            return false;
        }
        MVPurchaseTicketFareSelectionStep mVPurchaseTicketFareSelectionStep = (MVPurchaseTicketFareSelectionStep) obj;
        boolean g = mo32850g();
        boolean g2 = mVPurchaseTicketFareSelectionStep.mo32850g();
        if ((g || g2) && (!g || !g2 || !this.fares.equals(mVPurchaseTicketFareSelectionStep.fares))) {
            return false;
        }
        boolean h = mo32851h();
        boolean h2 = mVPurchaseTicketFareSelectionStep.mo32851h();
        if ((h || h2) && (!h || !h2 || !this.metroLevelHeaderMessage.equals(mVPurchaseTicketFareSelectionStep.metroLevelHeaderMessage))) {
            return false;
        }
        boolean f = mo32849f();
        boolean f2 = mVPurchaseTicketFareSelectionStep.mo32849f();
        if ((f || f2) && (!f || !f2 || !this.appliedFilters.equals(mVPurchaseTicketFareSelectionStep.appliedFilters))) {
            return false;
        }
        boolean i = mo32853i();
        boolean i2 = mVPurchaseTicketFareSelectionStep.mo32853i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVPurchaseTicketFareSelectionStep.title))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32849f() {
        return this.appliedFilters != null;
    }

    /* renamed from: g */
    public final boolean mo32850g() {
        return this.fares != null;
    }

    /* renamed from: h */
    public final boolean mo32851h() {
        return this.metroLevelHeaderMessage != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32853i() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseTicketFareSelectionStep(", "fares:");
        List<MVTicketingFare> list = this.fares;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo32851h()) {
            n.append(", ");
            n.append("metroLevelHeaderMessage:");
            String str = this.metroLevelHeaderMessage;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo32849f()) {
            n.append(", ");
            n.append("appliedFilters:");
            List<MVFilter> list2 = this.appliedFilters;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo32853i()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
