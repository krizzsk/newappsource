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

public class MVPurchaseFareData implements TBase<MVPurchaseFareData, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseFareData> {

    /* renamed from: b */
    public static final C25113c f28806b = new C25113c("tickets", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28807c = new C25113c("paymentData", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28808d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28809e;
    private _Fields[] optionals = {_Fields.TICKETS, _Fields.PAYMENT_DATA};
    public String paymentData;
    public List<MVTicket> tickets;

    public enum _Fields implements C25085c {
        TICKETS(1, "tickets"),
        PAYMENT_DATA(2, "paymentData");
        
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
            if (i != 2) {
                return null;
            }
            return PAYMENT_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareData$a */
    public static class C10869a extends C25239c<MVPurchaseFareData> {
        public C10869a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareData mVPurchaseFareData = (MVPurchaseFareData) tBase;
            mVPurchaseFareData.getClass();
            C25113c cVar = MVPurchaseFareData.f28806b;
            gVar.mo61687K();
            if (mVPurchaseFareData.tickets != null && mVPurchaseFareData.mo32537g()) {
                gVar.mo61711x(MVPurchaseFareData.f28806b);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseFareData.tickets.size()));
                for (MVTicket X0 : mVPurchaseFareData.tickets) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseFareData.paymentData != null && mVPurchaseFareData.mo32536f()) {
                gVar.mo61711x(MVPurchaseFareData.f28807c);
                gVar.mo61686J(mVPurchaseFareData.paymentData);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareData mVPurchaseFareData = (MVPurchaseFareData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseFareData.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVPurchaseFareData.paymentData = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVPurchaseFareData.tickets = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVTicket mVTicket = new MVTicket();
                        mVTicket.mo25201C1(gVar);
                        mVPurchaseFareData.tickets.add(mVTicket);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareData$b */
    public static class C10870b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10869a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareData$c */
    public static class C10871c extends C25240d<MVPurchaseFareData> {
        public C10871c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareData mVPurchaseFareData = (MVPurchaseFareData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseFareData.mo32537g()) {
                bitSet.set(0);
            }
            if (mVPurchaseFareData.mo32536f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPurchaseFareData.mo32537g()) {
                jVar.mo61678B(mVPurchaseFareData.tickets.size());
                for (MVTicket X0 : mVPurchaseFareData.tickets) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseFareData.mo32536f()) {
                jVar.mo61686J(mVPurchaseFareData.paymentData);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFareData mVPurchaseFareData = (MVPurchaseFareData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPurchaseFareData.tickets = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTicket mVTicket = new MVTicket();
                    mVTicket.mo25201C1(jVar);
                    mVPurchaseFareData.tickets.add(mVTicket);
                }
            }
            if (T.get(1)) {
                mVPurchaseFareData.paymentData = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareData$d */
    public static class C10872d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10871c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseFareData");
        HashMap hashMap = new HashMap();
        f28808d = hashMap;
        hashMap.put(C25239c.class, new C10870b());
        hashMap.put(C25240d.class, new C10872d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TICKETS, new FieldMetaData("tickets", (byte) 2, new ListMetaData(new StructMetaData(MVTicket.class))));
        enumMap.put(_Fields.PAYMENT_DATA, new FieldMetaData("paymentData", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28809e = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseFareData.class, unmodifiableMap);
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
        ((C25238b) f28808d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28808d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseFareData mVPurchaseFareData = (MVPurchaseFareData) obj;
        if (!getClass().equals(mVPurchaseFareData.getClass())) {
            return getClass().getName().compareTo(mVPurchaseFareData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32537g()).compareTo(Boolean.valueOf(mVPurchaseFareData.mo32537g()));
        if (compareTo2 != 0 || ((mo32537g() && (compareTo2 = C25082a.m62844h(this.tickets, mVPurchaseFareData.tickets)) != 0) || (compareTo2 = Boolean.valueOf(mo32536f()).compareTo(Boolean.valueOf(mVPurchaseFareData.mo32536f()))) != 0)) {
            return compareTo2;
        }
        if (!mo32536f() || (compareTo = this.paymentData.compareTo(mVPurchaseFareData.paymentData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseFareData)) {
            return false;
        }
        MVPurchaseFareData mVPurchaseFareData = (MVPurchaseFareData) obj;
        boolean g = mo32537g();
        boolean g2 = mVPurchaseFareData.mo32537g();
        if ((g || g2) && (!g || !g2 || !this.tickets.equals(mVPurchaseFareData.tickets))) {
            return false;
        }
        boolean f = mo32536f();
        boolean f2 = mVPurchaseFareData.mo32536f();
        if ((f || f2) && (!f || !f2 || !this.paymentData.equals(mVPurchaseFareData.paymentData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32536f() {
        return this.paymentData != null;
    }

    /* renamed from: g */
    public final boolean mo32537g() {
        return this.tickets != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPurchaseFareData(");
        if (mo32537g()) {
            sb.append("tickets:");
            List<MVTicket> list = this.tickets;
            if (list == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(list);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo32536f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("paymentData:");
            String str = this.paymentData;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
