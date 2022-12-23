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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVTicketStatusInfo implements TBase<MVTicketStatusInfo, _Fields>, Serializable, Cloneable, Comparable<MVTicketStatusInfo> {

    /* renamed from: b */
    public static final C25113c f29214b = new C25113c("ticketId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29215c = new C25113c("ticketStatus", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f29216d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29217e;
    private _Fields[] optionals = {_Fields.TICKET_STATUS};
    public String ticketId;
    public MVTicketStatus ticketStatus;

    public enum _Fields implements C25085c {
        TICKET_ID(1, "ticketId"),
        TICKET_STATUS(2, "ticketStatus");
        
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
                return TICKET_ID;
            }
            if (i != 2) {
                return null;
            }
            return TICKET_STATUS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatusInfo$a */
    public static class C11097a extends C25239c<MVTicketStatusInfo> {
        public C11097a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketStatusInfo mVTicketStatusInfo = (MVTicketStatusInfo) tBase;
            mVTicketStatusInfo.getClass();
            C25113c cVar = MVTicketStatusInfo.f29214b;
            gVar.mo61687K();
            if (mVTicketStatusInfo.ticketId != null) {
                gVar.mo61711x(MVTicketStatusInfo.f29214b);
                gVar.mo61686J(mVTicketStatusInfo.ticketId);
                gVar.mo61712y();
            }
            if (mVTicketStatusInfo.ticketStatus != null && mVTicketStatusInfo.mo33132g()) {
                gVar.mo61711x(MVTicketStatusInfo.f29215c);
                gVar.mo61678B(mVTicketStatusInfo.ticketStatus.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketStatusInfo mVTicketStatusInfo = (MVTicketStatusInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTicketStatusInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVTicketStatusInfo.ticketStatus = MVTicketStatus.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTicketStatusInfo.ticketId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatusInfo$b */
    public static class C11098b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11097a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatusInfo$c */
    public static class C11099c extends C25240d<MVTicketStatusInfo> {
        public C11099c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketStatusInfo mVTicketStatusInfo = (MVTicketStatusInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketStatusInfo.mo33131f()) {
                bitSet.set(0);
            }
            if (mVTicketStatusInfo.mo33132g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTicketStatusInfo.mo33131f()) {
                jVar.mo61686J(mVTicketStatusInfo.ticketId);
            }
            if (mVTicketStatusInfo.mo33132g()) {
                jVar.mo61678B(mVTicketStatusInfo.ticketStatus.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketStatusInfo mVTicketStatusInfo = (MVTicketStatusInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTicketStatusInfo.ticketId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTicketStatusInfo.ticketStatus = MVTicketStatus.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketStatusInfo$d */
    public static class C11100d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11099c(0);
        }
    }

    static {
        new C17394d0("MVTicketStatusInfo");
        HashMap hashMap = new HashMap();
        f29216d = hashMap;
        hashMap.put(C25239c.class, new C11098b());
        hashMap.put(C25240d.class, new C11100d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TICKET_ID, new FieldMetaData("ticketId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TICKET_STATUS, new FieldMetaData("ticketStatus", (byte) 2, new EnumMetaData(MVTicketStatus.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29217e = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketStatusInfo.class, unmodifiableMap);
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
        ((C25238b) f29216d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29216d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTicketStatusInfo mVTicketStatusInfo = (MVTicketStatusInfo) obj;
        if (!getClass().equals(mVTicketStatusInfo.getClass())) {
            return getClass().getName().compareTo(mVTicketStatusInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33131f()).compareTo(Boolean.valueOf(mVTicketStatusInfo.mo33131f()));
        if (compareTo2 != 0 || ((mo33131f() && (compareTo2 = this.ticketId.compareTo(mVTicketStatusInfo.ticketId)) != 0) || (compareTo2 = Boolean.valueOf(mo33132g()).compareTo(Boolean.valueOf(mVTicketStatusInfo.mo33132g()))) != 0)) {
            return compareTo2;
        }
        if (!mo33132g() || (compareTo = this.ticketStatus.compareTo(mVTicketStatusInfo.ticketStatus)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTicketStatusInfo)) {
            return false;
        }
        MVTicketStatusInfo mVTicketStatusInfo = (MVTicketStatusInfo) obj;
        boolean f = mo33131f();
        boolean f2 = mVTicketStatusInfo.mo33131f();
        if ((f || f2) && (!f || !f2 || !this.ticketId.equals(mVTicketStatusInfo.ticketId))) {
            return false;
        }
        boolean g = mo33132g();
        boolean g2 = mVTicketStatusInfo.mo33132g();
        if ((g || g2) && (!g || !g2 || !this.ticketStatus.equals(mVTicketStatusInfo.ticketStatus))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33131f() {
        return this.ticketId != null;
    }

    /* renamed from: g */
    public final boolean mo33132g() {
        return this.ticketStatus != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicketStatusInfo(", "ticketId:");
        String str = this.ticketId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33132g()) {
            n.append(", ");
            n.append("ticketStatus:");
            MVTicketStatus mVTicketStatus = this.ticketStatus;
            if (mVTicketStatus == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTicketStatus);
            }
        }
        n.append(")");
        return n.toString();
    }
}
