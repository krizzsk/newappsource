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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVActivateTicketRequest implements TBase<MVActivateTicketRequest, _Fields>, Serializable, Cloneable, Comparable<MVActivateTicketRequest> {

    /* renamed from: b */
    public static final C25113c f28659b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28660c = new C25113c("ticketId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28661d = new C25113c("requestInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28662e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28663f;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.REQUEST_INFO};
    public int providerId;
    public MVTicketActivationRequestInfo requestInfo;
    public String ticketId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        TICKET_ID(2, "ticketId"),
        REQUEST_INFO(3, "requestInfo");
        
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
            if (i == 2) {
                return TICKET_ID;
            }
            if (i != 3) {
                return null;
            }
            return REQUEST_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketRequest$a */
    public static class C10764a extends C25239c<MVActivateTicketRequest> {
        public C10764a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVActivateTicketRequest mVActivateTicketRequest = (MVActivateTicketRequest) tBase;
            mVActivateTicketRequest.getClass();
            C25113c cVar = MVActivateTicketRequest.f28659b;
            gVar.mo61687K();
            gVar.mo61711x(MVActivateTicketRequest.f28659b);
            gVar.mo61678B(mVActivateTicketRequest.providerId);
            gVar.mo61712y();
            if (mVActivateTicketRequest.ticketId != null) {
                gVar.mo61711x(MVActivateTicketRequest.f28660c);
                gVar.mo61686J(mVActivateTicketRequest.ticketId);
                gVar.mo61712y();
            }
            if (mVActivateTicketRequest.requestInfo != null && mVActivateTicketRequest.mo32304g()) {
                gVar.mo61711x(MVActivateTicketRequest.f28661d);
                mVActivateTicketRequest.requestInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVActivateTicketRequest mVActivateTicketRequest = (MVActivateTicketRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVActivateTicketRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVTicketActivationRequestInfo mVTicketActivationRequestInfo = new MVTicketActivationRequestInfo();
                            mVActivateTicketRequest.requestInfo = mVTicketActivationRequestInfo;
                            mVTicketActivationRequestInfo.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVActivateTicketRequest.ticketId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVActivateTicketRequest.providerId = gVar.mo61696i();
                    mVActivateTicketRequest.mo32307i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketRequest$b */
    public static class C10765b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10764a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketRequest$c */
    public static class C10766c extends C25240d<MVActivateTicketRequest> {
        public C10766c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVActivateTicketRequest mVActivateTicketRequest = (MVActivateTicketRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVActivateTicketRequest.mo32303f()) {
                bitSet.set(0);
            }
            if (mVActivateTicketRequest.mo32305h()) {
                bitSet.set(1);
            }
            if (mVActivateTicketRequest.mo32304g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVActivateTicketRequest.mo32303f()) {
                jVar.mo61678B(mVActivateTicketRequest.providerId);
            }
            if (mVActivateTicketRequest.mo32305h()) {
                jVar.mo61686J(mVActivateTicketRequest.ticketId);
            }
            if (mVActivateTicketRequest.mo32304g()) {
                mVActivateTicketRequest.requestInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVActivateTicketRequest mVActivateTicketRequest = (MVActivateTicketRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVActivateTicketRequest.providerId = jVar.mo61696i();
                mVActivateTicketRequest.mo32307i();
            }
            if (T.get(1)) {
                mVActivateTicketRequest.ticketId = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTicketActivationRequestInfo mVTicketActivationRequestInfo = new MVTicketActivationRequestInfo();
                mVActivateTicketRequest.requestInfo = mVTicketActivationRequestInfo;
                mVTicketActivationRequestInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketRequest$d */
    public static class C10767d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10766c(0);
        }
    }

    static {
        new C17394d0("MVActivateTicketRequest");
        HashMap hashMap = new HashMap();
        f28662e = hashMap;
        hashMap.put(C25239c.class, new C10765b());
        hashMap.put(C25240d.class, new C10767d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TICKET_ID, new FieldMetaData("ticketId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REQUEST_INFO, new FieldMetaData("requestInfo", (byte) 2, new StructMetaData(MVTicketActivationRequestInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28663f = unmodifiableMap;
        FieldMetaData.m61947a(MVActivateTicketRequest.class, unmodifiableMap);
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
        ((C25238b) f28662e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28662e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVActivateTicketRequest mVActivateTicketRequest = (MVActivateTicketRequest) obj;
        if (!getClass().equals(mVActivateTicketRequest.getClass())) {
            return getClass().getName().compareTo(mVActivateTicketRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32303f()).compareTo(Boolean.valueOf(mVActivateTicketRequest.mo32303f()));
        if (compareTo2 != 0 || ((mo32303f() && (compareTo2 = C25082a.m62839c(this.providerId, mVActivateTicketRequest.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32305h()).compareTo(Boolean.valueOf(mVActivateTicketRequest.mo32305h()))) != 0 || ((mo32305h() && (compareTo2 = this.ticketId.compareTo(mVActivateTicketRequest.ticketId)) != 0) || (compareTo2 = Boolean.valueOf(mo32304g()).compareTo(Boolean.valueOf(mVActivateTicketRequest.mo32304g()))) != 0))) {
            return compareTo2;
        }
        if (!mo32304g() || (compareTo = this.requestInfo.compareTo(mVActivateTicketRequest.requestInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketRequest
            r2 = 1
            if (r1 == 0) goto L_0x005f
            com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketRequest r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketRequest) r6
            int r1 = r5.providerId
            int r3 = r6.providerId
            if (r1 == r3) goto L_0x0012
            goto L_0x005f
        L_0x0012:
            boolean r1 = r5.mo32305h()
            boolean r3 = r6.mo32305h()
            if (r1 != 0) goto L_0x001e
            if (r3 == 0) goto L_0x002e
        L_0x001e:
            if (r1 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0023
            goto L_0x005f
        L_0x0023:
            java.lang.String r1 = r5.ticketId
            java.lang.String r3 = r6.ticketId
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x002e
            goto L_0x005f
        L_0x002e:
            boolean r1 = r5.mo32304g()
            boolean r3 = r6.mo32304g()
            if (r1 != 0) goto L_0x003a
            if (r3 == 0) goto L_0x005e
        L_0x003a:
            if (r1 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x003f
            goto L_0x005f
        L_0x003f:
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationRequestInfo r1 = r5.requestInfo
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationRequestInfo r6 = r6.requestInfo
            if (r6 == 0) goto L_0x0057
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x005a
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x005a
            r6 = 1
            goto L_0x005b
        L_0x0057:
            r1.getClass()
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 != 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketRequest.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo32303f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo32304g() {
        return this.requestInfo != null;
    }

    /* renamed from: h */
    public final boolean mo32305h() {
        return this.ticketId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo32307i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVActivateTicketRequest(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "ticketId:");
        String str = this.ticketId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo32304g()) {
            n.append(", ");
            n.append("requestInfo:");
            MVTicketActivationRequestInfo mVTicketActivationRequestInfo = this.requestInfo;
            if (mVTicketActivationRequestInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTicketActivationRequestInfo);
            }
        }
        n.append(")");
        return n.toString();
    }
}
