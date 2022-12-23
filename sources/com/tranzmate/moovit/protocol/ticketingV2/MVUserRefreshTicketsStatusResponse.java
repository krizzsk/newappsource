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

public class MVUserRefreshTicketsStatusResponse implements TBase<MVUserRefreshTicketsStatusResponse, _Fields>, Serializable, Cloneable, Comparable<MVUserRefreshTicketsStatusResponse> {

    /* renamed from: b */
    public static final C25113c f29313b = new C25113c("ticketStatuses", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f29314c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29315d;
    public List<MVTicketStatusInfo> ticketStatuses;

    public enum _Fields implements C25085c {
        TICKET_STATUSES(1, "ticketStatuses");
        
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
            return TICKET_STATUSES;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusResponse$a */
    public static class C11156a extends C25239c<MVUserRefreshTicketsStatusResponse> {
        public C11156a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserRefreshTicketsStatusResponse mVUserRefreshTicketsStatusResponse = (MVUserRefreshTicketsStatusResponse) tBase;
            mVUserRefreshTicketsStatusResponse.getClass();
            C25113c cVar = MVUserRefreshTicketsStatusResponse.f29313b;
            gVar.mo61687K();
            if (mVUserRefreshTicketsStatusResponse.ticketStatuses != null) {
                gVar.mo61711x(MVUserRefreshTicketsStatusResponse.f29313b);
                gVar.mo61680D(new C25119e((byte) 12, mVUserRefreshTicketsStatusResponse.ticketStatuses.size()));
                for (MVTicketStatusInfo X0 : mVUserRefreshTicketsStatusResponse.ticketStatuses) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserRefreshTicketsStatusResponse mVUserRefreshTicketsStatusResponse = (MVUserRefreshTicketsStatusResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserRefreshTicketsStatusResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVUserRefreshTicketsStatusResponse.ticketStatuses = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVTicketStatusInfo mVTicketStatusInfo = new MVTicketStatusInfo();
                        mVTicketStatusInfo.mo25201C1(gVar);
                        mVUserRefreshTicketsStatusResponse.ticketStatuses.add(mVTicketStatusInfo);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusResponse$b */
    public static class C11157b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11156a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusResponse$c */
    public static class C11158c extends C25240d<MVUserRefreshTicketsStatusResponse> {
        public C11158c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserRefreshTicketsStatusResponse mVUserRefreshTicketsStatusResponse = (MVUserRefreshTicketsStatusResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserRefreshTicketsStatusResponse.mo33281f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVUserRefreshTicketsStatusResponse.mo33281f()) {
                jVar.mo61678B(mVUserRefreshTicketsStatusResponse.ticketStatuses.size());
                for (MVTicketStatusInfo X0 : mVUserRefreshTicketsStatusResponse.ticketStatuses) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserRefreshTicketsStatusResponse mVUserRefreshTicketsStatusResponse = (MVUserRefreshTicketsStatusResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVUserRefreshTicketsStatusResponse.ticketStatuses = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTicketStatusInfo mVTicketStatusInfo = new MVTicketStatusInfo();
                    mVTicketStatusInfo.mo25201C1(jVar);
                    mVUserRefreshTicketsStatusResponse.ticketStatuses.add(mVTicketStatusInfo);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusResponse$d */
    public static class C11159d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11158c(0);
        }
    }

    static {
        new C17394d0("MVUserRefreshTicketsStatusResponse");
        HashMap hashMap = new HashMap();
        f29314c = hashMap;
        hashMap.put(C25239c.class, new C11157b());
        hashMap.put(C25240d.class, new C11159d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TICKET_STATUSES, new FieldMetaData("ticketStatuses", (byte) 3, new ListMetaData(new StructMetaData(MVTicketStatusInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29315d = unmodifiableMap;
        FieldMetaData.m61947a(MVUserRefreshTicketsStatusResponse.class, unmodifiableMap);
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
        ((C25238b) f29314c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29314c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVUserRefreshTicketsStatusResponse mVUserRefreshTicketsStatusResponse = (MVUserRefreshTicketsStatusResponse) obj;
        if (!getClass().equals(mVUserRefreshTicketsStatusResponse.getClass())) {
            return getClass().getName().compareTo(mVUserRefreshTicketsStatusResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33281f()).compareTo(Boolean.valueOf(mVUserRefreshTicketsStatusResponse.mo33281f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo33281f() || (h = C25082a.m62844h(this.ticketStatuses, mVUserRefreshTicketsStatusResponse.ticketStatuses)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUserRefreshTicketsStatusResponse)) {
            return false;
        }
        MVUserRefreshTicketsStatusResponse mVUserRefreshTicketsStatusResponse = (MVUserRefreshTicketsStatusResponse) obj;
        boolean f = mo33281f();
        boolean f2 = mVUserRefreshTicketsStatusResponse.mo33281f();
        if ((f || f2) && (!f || !f2 || !this.ticketStatuses.equals(mVUserRefreshTicketsStatusResponse.ticketStatuses))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33281f() {
        return this.ticketStatuses != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserRefreshTicketsStatusResponse(", "ticketStatuses:");
        List<MVTicketStatusInfo> list = this.ticketStatuses;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
