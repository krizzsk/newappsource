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

public class MVUserRefreshTicketsStatusRequest implements TBase<MVUserRefreshTicketsStatusRequest, _Fields>, Serializable, Cloneable, Comparable<MVUserRefreshTicketsStatusRequest> {

    /* renamed from: b */
    public static final C25113c f29309b = new C25113c("ticketIds", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29310c = new C25113c("providerId", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f29311d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29312e;
    private byte __isset_bitfield = 0;
    public int providerId;
    public List<String> ticketIds;

    public enum _Fields implements C25085c {
        TICKET_IDS(1, "ticketIds"),
        PROVIDER_ID(2, "providerId");
        
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
                return TICKET_IDS;
            }
            if (i != 2) {
                return null;
            }
            return PROVIDER_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusRequest$a */
    public static class C11152a extends C25239c<MVUserRefreshTicketsStatusRequest> {
        public C11152a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserRefreshTicketsStatusRequest mVUserRefreshTicketsStatusRequest = (MVUserRefreshTicketsStatusRequest) tBase;
            mVUserRefreshTicketsStatusRequest.getClass();
            C25113c cVar = MVUserRefreshTicketsStatusRequest.f29309b;
            gVar.mo61687K();
            if (mVUserRefreshTicketsStatusRequest.ticketIds != null) {
                gVar.mo61711x(MVUserRefreshTicketsStatusRequest.f29309b);
                gVar.mo61680D(new C25119e((byte) 11, mVUserRefreshTicketsStatusRequest.ticketIds.size()));
                for (String J : mVUserRefreshTicketsStatusRequest.ticketIds) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVUserRefreshTicketsStatusRequest.f29310c);
            C16530d.m42020n(gVar, mVUserRefreshTicketsStatusRequest.providerId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserRefreshTicketsStatusRequest mVUserRefreshTicketsStatusRequest = (MVUserRefreshTicketsStatusRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserRefreshTicketsStatusRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVUserRefreshTicketsStatusRequest.providerId = gVar.mo61696i();
                        mVUserRefreshTicketsStatusRequest.mo33275h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVUserRefreshTicketsStatusRequest.ticketIds = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        mVUserRefreshTicketsStatusRequest.ticketIds.add(gVar.mo61704q());
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusRequest$b */
    public static class C11153b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11152a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusRequest$c */
    public static class C11154c extends C25240d<MVUserRefreshTicketsStatusRequest> {
        public C11154c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserRefreshTicketsStatusRequest mVUserRefreshTicketsStatusRequest = (MVUserRefreshTicketsStatusRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserRefreshTicketsStatusRequest.mo33274g()) {
                bitSet.set(0);
            }
            if (mVUserRefreshTicketsStatusRequest.mo33273f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVUserRefreshTicketsStatusRequest.mo33274g()) {
                jVar.mo61678B(mVUserRefreshTicketsStatusRequest.ticketIds.size());
                for (String J : mVUserRefreshTicketsStatusRequest.ticketIds) {
                    jVar.mo61686J(J);
                }
            }
            if (mVUserRefreshTicketsStatusRequest.mo33273f()) {
                jVar.mo61678B(mVUserRefreshTicketsStatusRequest.providerId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserRefreshTicketsStatusRequest mVUserRefreshTicketsStatusRequest = (MVUserRefreshTicketsStatusRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVUserRefreshTicketsStatusRequest.ticketIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVUserRefreshTicketsStatusRequest.ticketIds.add(jVar.mo61704q());
                }
            }
            if (T.get(1)) {
                mVUserRefreshTicketsStatusRequest.providerId = jVar.mo61696i();
                mVUserRefreshTicketsStatusRequest.mo33275h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusRequest$d */
    public static class C11155d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11154c(0);
        }
    }

    static {
        new C17394d0("MVUserRefreshTicketsStatusRequest");
        HashMap hashMap = new HashMap();
        f29311d = hashMap;
        hashMap.put(C25239c.class, new C11153b());
        hashMap.put(C25240d.class, new C11155d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TICKET_IDS, new FieldMetaData("ticketIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29312e = unmodifiableMap;
        FieldMetaData.m61947a(MVUserRefreshTicketsStatusRequest.class, unmodifiableMap);
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
        ((C25238b) f29311d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29311d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVUserRefreshTicketsStatusRequest mVUserRefreshTicketsStatusRequest = (MVUserRefreshTicketsStatusRequest) obj;
        if (!getClass().equals(mVUserRefreshTicketsStatusRequest.getClass())) {
            return getClass().getName().compareTo(mVUserRefreshTicketsStatusRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33274g()).compareTo(Boolean.valueOf(mVUserRefreshTicketsStatusRequest.mo33274g()));
        if (compareTo != 0 || ((mo33274g() && (compareTo = C25082a.m62844h(this.ticketIds, mVUserRefreshTicketsStatusRequest.ticketIds)) != 0) || (compareTo = Boolean.valueOf(mo33273f()).compareTo(Boolean.valueOf(mVUserRefreshTicketsStatusRequest.mo33273f()))) != 0)) {
            return compareTo;
        }
        if (!mo33273f() || (c = C25082a.m62839c(this.providerId, mVUserRefreshTicketsStatusRequest.providerId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUserRefreshTicketsStatusRequest)) {
            return false;
        }
        MVUserRefreshTicketsStatusRequest mVUserRefreshTicketsStatusRequest = (MVUserRefreshTicketsStatusRequest) obj;
        boolean g = mo33274g();
        boolean g2 = mVUserRefreshTicketsStatusRequest.mo33274g();
        if (((g || g2) && (!g || !g2 || !this.ticketIds.equals(mVUserRefreshTicketsStatusRequest.ticketIds))) || this.providerId != mVUserRefreshTicketsStatusRequest.providerId) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33273f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33274g() {
        return this.ticketIds != null;
    }

    /* renamed from: h */
    public final void mo33275h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserRefreshTicketsStatusRequest(", "ticketIds:");
        List<String> list = this.ticketIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("providerId:");
        return C13437d.m33707l(n, this.providerId, ")");
    }
}
