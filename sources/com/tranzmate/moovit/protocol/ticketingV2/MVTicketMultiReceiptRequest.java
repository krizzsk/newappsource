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

public class MVTicketMultiReceiptRequest implements TBase<MVTicketMultiReceiptRequest, _Fields>, Serializable, Cloneable, Comparable<MVTicketMultiReceiptRequest> {

    /* renamed from: b */
    public static final C25113c f29183b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29184c = new C25113c("ticketIds", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f29185d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29186e;
    private byte __isset_bitfield = 0;
    public int providerId;
    public List<String> ticketIds;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        TICKET_IDS(2, "ticketIds");
        
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
                return PROVIDER_ID;
            }
            if (i != 2) {
                return null;
            }
            return TICKET_IDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketMultiReceiptRequest$a */
    public static class C11075a extends C25239c<MVTicketMultiReceiptRequest> {
        public C11075a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketMultiReceiptRequest mVTicketMultiReceiptRequest = (MVTicketMultiReceiptRequest) tBase;
            mVTicketMultiReceiptRequest.getClass();
            C25113c cVar = MVTicketMultiReceiptRequest.f29183b;
            gVar.mo61687K();
            gVar.mo61711x(MVTicketMultiReceiptRequest.f29183b);
            gVar.mo61678B(mVTicketMultiReceiptRequest.providerId);
            gVar.mo61712y();
            if (mVTicketMultiReceiptRequest.ticketIds != null) {
                gVar.mo61711x(MVTicketMultiReceiptRequest.f29184c);
                gVar.mo61680D(new C25119e((byte) 11, mVTicketMultiReceiptRequest.ticketIds.size()));
                for (String J : mVTicketMultiReceiptRequest.ticketIds) {
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
            MVTicketMultiReceiptRequest mVTicketMultiReceiptRequest = (MVTicketMultiReceiptRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTicketMultiReceiptRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVTicketMultiReceiptRequest.ticketIds = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVTicketMultiReceiptRequest.ticketIds.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTicketMultiReceiptRequest.providerId = gVar.mo61696i();
                    mVTicketMultiReceiptRequest.mo33085h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketMultiReceiptRequest$b */
    public static class C11076b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11075a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketMultiReceiptRequest$c */
    public static class C11077c extends C25240d<MVTicketMultiReceiptRequest> {
        public C11077c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketMultiReceiptRequest mVTicketMultiReceiptRequest = (MVTicketMultiReceiptRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketMultiReceiptRequest.mo33083f()) {
                bitSet.set(0);
            }
            if (mVTicketMultiReceiptRequest.mo33084g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTicketMultiReceiptRequest.mo33083f()) {
                jVar.mo61678B(mVTicketMultiReceiptRequest.providerId);
            }
            if (mVTicketMultiReceiptRequest.mo33084g()) {
                jVar.mo61678B(mVTicketMultiReceiptRequest.ticketIds.size());
                for (String J : mVTicketMultiReceiptRequest.ticketIds) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketMultiReceiptRequest mVTicketMultiReceiptRequest = (MVTicketMultiReceiptRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTicketMultiReceiptRequest.providerId = jVar.mo61696i();
                mVTicketMultiReceiptRequest.mo33085h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVTicketMultiReceiptRequest.ticketIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVTicketMultiReceiptRequest.ticketIds.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketMultiReceiptRequest$d */
    public static class C11078d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11077c(0);
        }
    }

    static {
        new C17394d0("MVTicketMultiReceiptRequest");
        HashMap hashMap = new HashMap();
        f29185d = hashMap;
        hashMap.put(C25239c.class, new C11076b());
        hashMap.put(C25240d.class, new C11078d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TICKET_IDS, new FieldMetaData("ticketIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29186e = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketMultiReceiptRequest.class, unmodifiableMap);
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
        ((C25238b) f29185d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29185d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTicketMultiReceiptRequest mVTicketMultiReceiptRequest = (MVTicketMultiReceiptRequest) obj;
        if (!getClass().equals(mVTicketMultiReceiptRequest.getClass())) {
            return getClass().getName().compareTo(mVTicketMultiReceiptRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33083f()).compareTo(Boolean.valueOf(mVTicketMultiReceiptRequest.mo33083f()));
        if (compareTo != 0 || ((mo33083f() && (compareTo = C25082a.m62839c(this.providerId, mVTicketMultiReceiptRequest.providerId)) != 0) || (compareTo = Boolean.valueOf(mo33084g()).compareTo(Boolean.valueOf(mVTicketMultiReceiptRequest.mo33084g()))) != 0)) {
            return compareTo;
        }
        if (!mo33084g() || (h = C25082a.m62844h(this.ticketIds, mVTicketMultiReceiptRequest.ticketIds)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTicketMultiReceiptRequest)) {
            return false;
        }
        MVTicketMultiReceiptRequest mVTicketMultiReceiptRequest = (MVTicketMultiReceiptRequest) obj;
        if (this.providerId != mVTicketMultiReceiptRequest.providerId) {
            return false;
        }
        boolean g = mo33084g();
        boolean g2 = mVTicketMultiReceiptRequest.mo33084g();
        if ((g || g2) && (!g || !g2 || !this.ticketIds.equals(mVTicketMultiReceiptRequest.ticketIds))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33083f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33084g() {
        return this.ticketIds != null;
    }

    /* renamed from: h */
    public final void mo33085h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicketMultiReceiptRequest(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "ticketIds:");
        List<String> list = this.ticketIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
