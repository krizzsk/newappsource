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

public class MVUserActiveTicketsResponse implements TBase<MVUserActiveTicketsResponse, _Fields>, Serializable, Cloneable, Comparable<MVUserActiveTicketsResponse> {

    /* renamed from: b */
    public static final C25113c f29300b = new C25113c("tickets", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29301c = new C25113c("validations", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f29302d = new C25113c("storedValues", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f29303e = new C25113c("agencyMessages", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f29304f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29305g;
    public List<MVAgencyMessages> agencyMessages;
    private _Fields[] optionals = {_Fields.VALIDATIONS, _Fields.STORED_VALUES, _Fields.AGENCY_MESSAGES};
    public List<MVStoredValue> storedValues;
    public List<MVTicket> tickets;
    public List<MVTicketProviderValidation> validations;

    public enum _Fields implements C25085c {
        TICKETS(1, "tickets"),
        VALIDATIONS(2, "validations"),
        STORED_VALUES(3, "storedValues"),
        AGENCY_MESSAGES(4, "agencyMessages");
        
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
                return TICKETS;
            }
            if (i == 2) {
                return VALIDATIONS;
            }
            if (i == 3) {
                return STORED_VALUES;
            }
            if (i != 4) {
                return null;
            }
            return AGENCY_MESSAGES;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserActiveTicketsResponse$a */
    public static class C11144a extends C25239c<MVUserActiveTicketsResponse> {
        public C11144a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserActiveTicketsResponse mVUserActiveTicketsResponse = (MVUserActiveTicketsResponse) tBase;
            mVUserActiveTicketsResponse.getClass();
            C25113c cVar = MVUserActiveTicketsResponse.f29300b;
            gVar.mo61687K();
            if (mVUserActiveTicketsResponse.tickets != null) {
                gVar.mo61711x(MVUserActiveTicketsResponse.f29300b);
                gVar.mo61680D(new C25119e((byte) 12, mVUserActiveTicketsResponse.tickets.size()));
                for (MVTicket X0 : mVUserActiveTicketsResponse.tickets) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVUserActiveTicketsResponse.validations != null && mVUserActiveTicketsResponse.mo33262i()) {
                gVar.mo61711x(MVUserActiveTicketsResponse.f29301c);
                gVar.mo61680D(new C25119e((byte) 12, mVUserActiveTicketsResponse.validations.size()));
                for (MVTicketProviderValidation X02 : mVUserActiveTicketsResponse.validations) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVUserActiveTicketsResponse.storedValues != null && mVUserActiveTicketsResponse.mo33259g()) {
                gVar.mo61711x(MVUserActiveTicketsResponse.f29302d);
                gVar.mo61680D(new C25119e((byte) 12, mVUserActiveTicketsResponse.storedValues.size()));
                for (MVStoredValue X03 : mVUserActiveTicketsResponse.storedValues) {
                    X03.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVUserActiveTicketsResponse.agencyMessages != null && mVUserActiveTicketsResponse.mo33258f()) {
                gVar.mo61711x(MVUserActiveTicketsResponse.f29303e);
                gVar.mo61680D(new C25119e((byte) 12, mVUserActiveTicketsResponse.agencyMessages.size()));
                for (MVAgencyMessages X04 : mVUserActiveTicketsResponse.agencyMessages) {
                    X04.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserActiveTicketsResponse mVUserActiveTicketsResponse = (MVUserActiveTicketsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserActiveTicketsResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVUserActiveTicketsResponse.agencyMessages = new ArrayList(k.f63395b);
                                while (i < k.f63395b) {
                                    MVAgencyMessages mVAgencyMessages = new MVAgencyMessages();
                                    mVAgencyMessages.mo25201C1(gVar);
                                    mVUserActiveTicketsResponse.agencyMessages.add(mVAgencyMessages);
                                    i++;
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k2 = gVar.mo61698k();
                            mVUserActiveTicketsResponse.storedValues = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVStoredValue mVStoredValue = new MVStoredValue();
                                mVStoredValue.mo25201C1(gVar);
                                mVUserActiveTicketsResponse.storedValues.add(mVStoredValue);
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k3 = gVar.mo61698k();
                        mVUserActiveTicketsResponse.validations = new ArrayList(k3.f63395b);
                        while (i < k3.f63395b) {
                            MVTicketProviderValidation mVTicketProviderValidation = new MVTicketProviderValidation();
                            mVTicketProviderValidation.mo25201C1(gVar);
                            mVUserActiveTicketsResponse.validations.add(mVTicketProviderValidation);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k4 = gVar.mo61698k();
                    mVUserActiveTicketsResponse.tickets = new ArrayList(k4.f63395b);
                    while (i < k4.f63395b) {
                        MVTicket mVTicket = new MVTicket();
                        mVTicket.mo25201C1(gVar);
                        mVUserActiveTicketsResponse.tickets.add(mVTicket);
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserActiveTicketsResponse$b */
    public static class C11145b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11144a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserActiveTicketsResponse$c */
    public static class C11146c extends C25240d<MVUserActiveTicketsResponse> {
        public C11146c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserActiveTicketsResponse mVUserActiveTicketsResponse = (MVUserActiveTicketsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserActiveTicketsResponse.mo33260h()) {
                bitSet.set(0);
            }
            if (mVUserActiveTicketsResponse.mo33262i()) {
                bitSet.set(1);
            }
            if (mVUserActiveTicketsResponse.mo33259g()) {
                bitSet.set(2);
            }
            if (mVUserActiveTicketsResponse.mo33258f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVUserActiveTicketsResponse.mo33260h()) {
                jVar.mo61678B(mVUserActiveTicketsResponse.tickets.size());
                for (MVTicket X0 : mVUserActiveTicketsResponse.tickets) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVUserActiveTicketsResponse.mo33262i()) {
                jVar.mo61678B(mVUserActiveTicketsResponse.validations.size());
                for (MVTicketProviderValidation X02 : mVUserActiveTicketsResponse.validations) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVUserActiveTicketsResponse.mo33259g()) {
                jVar.mo61678B(mVUserActiveTicketsResponse.storedValues.size());
                for (MVStoredValue X03 : mVUserActiveTicketsResponse.storedValues) {
                    X03.mo25202X0(jVar);
                }
            }
            if (mVUserActiveTicketsResponse.mo33258f()) {
                jVar.mo61678B(mVUserActiveTicketsResponse.agencyMessages.size());
                for (MVAgencyMessages X04 : mVUserActiveTicketsResponse.agencyMessages) {
                    X04.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserActiveTicketsResponse mVUserActiveTicketsResponse = (MVUserActiveTicketsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVUserActiveTicketsResponse.tickets = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTicket mVTicket = new MVTicket();
                    mVTicket.mo25201C1(jVar);
                    mVUserActiveTicketsResponse.tickets.add(mVTicket);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVUserActiveTicketsResponse.validations = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVTicketProviderValidation mVTicketProviderValidation = new MVTicketProviderValidation();
                    mVTicketProviderValidation.mo25201C1(jVar);
                    mVUserActiveTicketsResponse.validations.add(mVTicketProviderValidation);
                }
            }
            if (T.get(2)) {
                int i5 = jVar.mo61696i();
                mVUserActiveTicketsResponse.storedValues = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    MVStoredValue mVStoredValue = new MVStoredValue();
                    mVStoredValue.mo25201C1(jVar);
                    mVUserActiveTicketsResponse.storedValues.add(mVStoredValue);
                }
            }
            if (T.get(3)) {
                int i7 = jVar.mo61696i();
                mVUserActiveTicketsResponse.agencyMessages = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    MVAgencyMessages mVAgencyMessages = new MVAgencyMessages();
                    mVAgencyMessages.mo25201C1(jVar);
                    mVUserActiveTicketsResponse.agencyMessages.add(mVAgencyMessages);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserActiveTicketsResponse$d */
    public static class C11147d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11146c(0);
        }
    }

    static {
        new C17394d0("MVUserActiveTicketsResponse");
        HashMap hashMap = new HashMap();
        f29304f = hashMap;
        hashMap.put(C25239c.class, new C11145b());
        hashMap.put(C25240d.class, new C11147d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TICKETS, new FieldMetaData("tickets", (byte) 3, new ListMetaData(new StructMetaData(MVTicket.class))));
        enumMap.put(_Fields.VALIDATIONS, new FieldMetaData("validations", (byte) 2, new ListMetaData(new StructMetaData(MVTicketProviderValidation.class))));
        enumMap.put(_Fields.STORED_VALUES, new FieldMetaData("storedValues", (byte) 2, new ListMetaData(new StructMetaData(MVStoredValue.class))));
        enumMap.put(_Fields.AGENCY_MESSAGES, new FieldMetaData("agencyMessages", (byte) 2, new ListMetaData(new StructMetaData(MVAgencyMessages.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29305g = unmodifiableMap;
        FieldMetaData.m61947a(MVUserActiveTicketsResponse.class, unmodifiableMap);
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
        ((C25238b) f29304f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29304f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVUserActiveTicketsResponse mVUserActiveTicketsResponse = (MVUserActiveTicketsResponse) obj;
        if (!getClass().equals(mVUserActiveTicketsResponse.getClass())) {
            return getClass().getName().compareTo(mVUserActiveTicketsResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33260h()).compareTo(Boolean.valueOf(mVUserActiveTicketsResponse.mo33260h()));
        if (compareTo != 0 || ((mo33260h() && (compareTo = C25082a.m62844h(this.tickets, mVUserActiveTicketsResponse.tickets)) != 0) || (compareTo = Boolean.valueOf(mo33262i()).compareTo(Boolean.valueOf(mVUserActiveTicketsResponse.mo33262i()))) != 0 || ((mo33262i() && (compareTo = C25082a.m62844h(this.validations, mVUserActiveTicketsResponse.validations)) != 0) || (compareTo = Boolean.valueOf(mo33259g()).compareTo(Boolean.valueOf(mVUserActiveTicketsResponse.mo33259g()))) != 0 || ((mo33259g() && (compareTo = C25082a.m62844h(this.storedValues, mVUserActiveTicketsResponse.storedValues)) != 0) || (compareTo = Boolean.valueOf(mo33258f()).compareTo(Boolean.valueOf(mVUserActiveTicketsResponse.mo33258f()))) != 0)))) {
            return compareTo;
        }
        if (!mo33258f() || (h = C25082a.m62844h(this.agencyMessages, mVUserActiveTicketsResponse.agencyMessages)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUserActiveTicketsResponse)) {
            return false;
        }
        MVUserActiveTicketsResponse mVUserActiveTicketsResponse = (MVUserActiveTicketsResponse) obj;
        boolean h = mo33260h();
        boolean h2 = mVUserActiveTicketsResponse.mo33260h();
        if ((h || h2) && (!h || !h2 || !this.tickets.equals(mVUserActiveTicketsResponse.tickets))) {
            return false;
        }
        boolean i = mo33262i();
        boolean i2 = mVUserActiveTicketsResponse.mo33262i();
        if ((i || i2) && (!i || !i2 || !this.validations.equals(mVUserActiveTicketsResponse.validations))) {
            return false;
        }
        boolean g = mo33259g();
        boolean g2 = mVUserActiveTicketsResponse.mo33259g();
        if ((g || g2) && (!g || !g2 || !this.storedValues.equals(mVUserActiveTicketsResponse.storedValues))) {
            return false;
        }
        boolean f = mo33258f();
        boolean f2 = mVUserActiveTicketsResponse.mo33258f();
        if ((f || f2) && (!f || !f2 || !this.agencyMessages.equals(mVUserActiveTicketsResponse.agencyMessages))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33258f() {
        return this.agencyMessages != null;
    }

    /* renamed from: g */
    public final boolean mo33259g() {
        return this.storedValues != null;
    }

    /* renamed from: h */
    public final boolean mo33260h() {
        return this.tickets != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33262i() {
        return this.validations != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserActiveTicketsResponse(", "tickets:");
        List<MVTicket> list = this.tickets;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo33262i()) {
            n.append(", ");
            n.append("validations:");
            List<MVTicketProviderValidation> list2 = this.validations;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo33259g()) {
            n.append(", ");
            n.append("storedValues:");
            List<MVStoredValue> list3 = this.storedValues;
            if (list3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list3);
            }
        }
        if (mo33258f()) {
            n.append(", ");
            n.append("agencyMessages:");
            List<MVAgencyMessages> list4 = this.agencyMessages;
            if (list4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list4);
            }
        }
        n.append(")");
        return n.toString();
    }
}
