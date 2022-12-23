package com.tranzmate.moovit.protocol.ticketingV2;

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
import p001a0.C0017h;
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

public class MVTicketActivationConfirmationRequestInfo implements TBase<MVTicketActivationConfirmationRequestInfo, _Fields>, Serializable, Cloneable, Comparable<MVTicketActivationConfirmationRequestInfo> {

    /* renamed from: b */
    public static final C25113c f29167b = new C25113c("isAccepted", (byte) 2, 1);

    /* renamed from: c */
    public static final HashMap f29168c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29169d;
    private byte __isset_bitfield = 0;
    public boolean isAccepted;

    public enum _Fields implements C25085c {
        IS_ACCEPTED(1, "isAccepted");
        
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
            return IS_ACCEPTED;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationConfirmationRequestInfo$a */
    public static class C11062a extends C25239c<MVTicketActivationConfirmationRequestInfo> {
        public C11062a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketActivationConfirmationRequestInfo mVTicketActivationConfirmationRequestInfo = (MVTicketActivationConfirmationRequestInfo) tBase;
            mVTicketActivationConfirmationRequestInfo.getClass();
            C25113c cVar = MVTicketActivationConfirmationRequestInfo.f29167b;
            gVar.mo61687K();
            gVar.mo61711x(MVTicketActivationConfirmationRequestInfo.f29167b);
            C0017h.m62S(gVar, mVTicketActivationConfirmationRequestInfo.isAccepted);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketActivationConfirmationRequestInfo mVTicketActivationConfirmationRequestInfo = (MVTicketActivationConfirmationRequestInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTicketActivationConfirmationRequestInfo.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 2) {
                    mVTicketActivationConfirmationRequestInfo.isAccepted = gVar.mo61690c();
                    mVTicketActivationConfirmationRequestInfo.mo33054g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationConfirmationRequestInfo$b */
    public static class C11063b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11062a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationConfirmationRequestInfo$c */
    public static class C11064c extends C25240d<MVTicketActivationConfirmationRequestInfo> {
        public C11064c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketActivationConfirmationRequestInfo mVTicketActivationConfirmationRequestInfo = (MVTicketActivationConfirmationRequestInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketActivationConfirmationRequestInfo.mo33053f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVTicketActivationConfirmationRequestInfo.mo33053f()) {
                jVar.mo61708u(mVTicketActivationConfirmationRequestInfo.isAccepted);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketActivationConfirmationRequestInfo mVTicketActivationConfirmationRequestInfo = (MVTicketActivationConfirmationRequestInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVTicketActivationConfirmationRequestInfo.isAccepted = jVar.mo61690c();
                mVTicketActivationConfirmationRequestInfo.mo33054g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationConfirmationRequestInfo$d */
    public static class C11065d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11064c(0);
        }
    }

    static {
        new C17394d0("MVTicketActivationConfirmationRequestInfo");
        HashMap hashMap = new HashMap();
        f29168c = hashMap;
        hashMap.put(C25239c.class, new C11063b());
        hashMap.put(C25240d.class, new C11065d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_ACCEPTED, new FieldMetaData("isAccepted", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29169d = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketActivationConfirmationRequestInfo.class, unmodifiableMap);
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
        ((C25238b) f29168c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29168c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVTicketActivationConfirmationRequestInfo mVTicketActivationConfirmationRequestInfo = (MVTicketActivationConfirmationRequestInfo) obj;
        if (!getClass().equals(mVTicketActivationConfirmationRequestInfo.getClass())) {
            return getClass().getName().compareTo(mVTicketActivationConfirmationRequestInfo.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33053f()).compareTo(Boolean.valueOf(mVTicketActivationConfirmationRequestInfo.mo33053f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo33053f() || (l = C25082a.m62848l(this.isAccepted, mVTicketActivationConfirmationRequestInfo.isAccepted)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTicketActivationConfirmationRequestInfo) && this.isAccepted == ((MVTicketActivationConfirmationRequestInfo) obj).isAccepted) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33053f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo33054g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C25541a.m63885p(C13437d.m33708n("MVTicketActivationConfirmationRequestInfo(", "isAccepted:"), this.isAccepted, ")");
    }
}
