package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTicketReceiptRequest implements TBase<MVTicketReceiptRequest, _Fields>, Serializable, Cloneable, Comparable<MVTicketReceiptRequest> {

    /* renamed from: b */
    public static final C25113c f29205b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29206c = new C25113c("ticketId", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f29207d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29208e;
    private byte __isset_bitfield = 0;
    public int providerId;
    public String ticketId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        TICKET_ID(2, "ticketId");
        
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
            return TICKET_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptRequest$a */
    public static class C11089a extends C25239c<MVTicketReceiptRequest> {
        public C11089a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketReceiptRequest mVTicketReceiptRequest = (MVTicketReceiptRequest) tBase;
            mVTicketReceiptRequest.getClass();
            C25113c cVar = MVTicketReceiptRequest.f29205b;
            gVar.mo61687K();
            gVar.mo61711x(MVTicketReceiptRequest.f29205b);
            gVar.mo61678B(mVTicketReceiptRequest.providerId);
            gVar.mo61712y();
            if (mVTicketReceiptRequest.ticketId != null) {
                gVar.mo61711x(MVTicketReceiptRequest.f29206c);
                gVar.mo61686J(mVTicketReceiptRequest.ticketId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketReceiptRequest mVTicketReceiptRequest = (MVTicketReceiptRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTicketReceiptRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTicketReceiptRequest.ticketId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTicketReceiptRequest.providerId = gVar.mo61696i();
                    mVTicketReceiptRequest.mo33116h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptRequest$b */
    public static class C11090b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11089a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptRequest$c */
    public static class C11091c extends C25240d<MVTicketReceiptRequest> {
        public C11091c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketReceiptRequest mVTicketReceiptRequest = (MVTicketReceiptRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketReceiptRequest.mo33114f()) {
                bitSet.set(0);
            }
            if (mVTicketReceiptRequest.mo33115g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTicketReceiptRequest.mo33114f()) {
                jVar.mo61678B(mVTicketReceiptRequest.providerId);
            }
            if (mVTicketReceiptRequest.mo33115g()) {
                jVar.mo61686J(mVTicketReceiptRequest.ticketId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketReceiptRequest mVTicketReceiptRequest = (MVTicketReceiptRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTicketReceiptRequest.providerId = jVar.mo61696i();
                mVTicketReceiptRequest.mo33116h();
            }
            if (T.get(1)) {
                mVTicketReceiptRequest.ticketId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptRequest$d */
    public static class C11092d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11091c(0);
        }
    }

    static {
        new C17394d0("MVTicketReceiptRequest");
        HashMap hashMap = new HashMap();
        f29207d = hashMap;
        hashMap.put(C25239c.class, new C11090b());
        hashMap.put(C25240d.class, new C11092d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TICKET_ID, new FieldMetaData("ticketId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29208e = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketReceiptRequest.class, unmodifiableMap);
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
        ((C25238b) f29207d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29207d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTicketReceiptRequest mVTicketReceiptRequest = (MVTicketReceiptRequest) obj;
        if (!getClass().equals(mVTicketReceiptRequest.getClass())) {
            return getClass().getName().compareTo(mVTicketReceiptRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33114f()).compareTo(Boolean.valueOf(mVTicketReceiptRequest.mo33114f()));
        if (compareTo2 != 0 || ((mo33114f() && (compareTo2 = C25082a.m62839c(this.providerId, mVTicketReceiptRequest.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo33115g()).compareTo(Boolean.valueOf(mVTicketReceiptRequest.mo33115g()))) != 0)) {
            return compareTo2;
        }
        if (!mo33115g() || (compareTo = this.ticketId.compareTo(mVTicketReceiptRequest.ticketId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTicketReceiptRequest)) {
            return false;
        }
        MVTicketReceiptRequest mVTicketReceiptRequest = (MVTicketReceiptRequest) obj;
        if (this.providerId != mVTicketReceiptRequest.providerId) {
            return false;
        }
        boolean g = mo33115g();
        boolean g2 = mVTicketReceiptRequest.mo33115g();
        if ((g || g2) && (!g || !g2 || !this.ticketId.equals(mVTicketReceiptRequest.ticketId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33114f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33115g() {
        return this.ticketId != null;
    }

    /* renamed from: h */
    public final void mo33116h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicketReceiptRequest(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "ticketId:");
        String str = this.ticketId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
