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

public class MVTicketProviderValidation implements TBase<MVTicketProviderValidation, _Fields>, Serializable, Cloneable, Comparable<MVTicketProviderValidation> {

    /* renamed from: b */
    public static final C25113c f29190b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29191c = new C25113c("validationInfo", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29192d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29193e;
    private byte __isset_bitfield = 0;
    public int providerId;
    public MVTicketProviderValidationInfo validationInfo;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        VALIDATION_INFO(2, "validationInfo");
        
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
            return VALIDATION_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidation$a */
    public static class C11083a extends C25239c<MVTicketProviderValidation> {
        public C11083a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketProviderValidation mVTicketProviderValidation = (MVTicketProviderValidation) tBase;
            mVTicketProviderValidation.getClass();
            C25113c cVar = MVTicketProviderValidation.f29190b;
            gVar.mo61687K();
            gVar.mo61711x(MVTicketProviderValidation.f29190b);
            gVar.mo61678B(mVTicketProviderValidation.providerId);
            gVar.mo61712y();
            if (mVTicketProviderValidation.validationInfo != null) {
                gVar.mo61711x(MVTicketProviderValidation.f29191c);
                mVTicketProviderValidation.validationInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketProviderValidation mVTicketProviderValidation = (MVTicketProviderValidation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTicketProviderValidation.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTicketProviderValidationInfo mVTicketProviderValidationInfo = new MVTicketProviderValidationInfo();
                        mVTicketProviderValidation.validationInfo = mVTicketProviderValidationInfo;
                        mVTicketProviderValidationInfo.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTicketProviderValidation.providerId = gVar.mo61696i();
                    mVTicketProviderValidation.mo33099h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidation$b */
    public static class C11084b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11083a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidation$c */
    public static class C11085c extends C25240d<MVTicketProviderValidation> {
        public C11085c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketProviderValidation mVTicketProviderValidation = (MVTicketProviderValidation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketProviderValidation.mo33097f()) {
                bitSet.set(0);
            }
            if (mVTicketProviderValidation.mo33098g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTicketProviderValidation.mo33097f()) {
                jVar.mo61678B(mVTicketProviderValidation.providerId);
            }
            if (mVTicketProviderValidation.mo33098g()) {
                mVTicketProviderValidation.validationInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketProviderValidation mVTicketProviderValidation = (MVTicketProviderValidation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTicketProviderValidation.providerId = jVar.mo61696i();
                mVTicketProviderValidation.mo33099h();
            }
            if (T.get(1)) {
                MVTicketProviderValidationInfo mVTicketProviderValidationInfo = new MVTicketProviderValidationInfo();
                mVTicketProviderValidation.validationInfo = mVTicketProviderValidationInfo;
                mVTicketProviderValidationInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidation$d */
    public static class C11086d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11085c(0);
        }
    }

    static {
        new C17394d0("MVTicketProviderValidation");
        HashMap hashMap = new HashMap();
        f29192d = hashMap;
        hashMap.put(C25239c.class, new C11084b());
        hashMap.put(C25240d.class, new C11086d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.VALIDATION_INFO, new FieldMetaData("validationInfo", (byte) 3, new StructMetaData(MVTicketProviderValidationInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29193e = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketProviderValidation.class, unmodifiableMap);
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
        ((C25238b) f29192d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29192d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTicketProviderValidation mVTicketProviderValidation = (MVTicketProviderValidation) obj;
        if (!getClass().equals(mVTicketProviderValidation.getClass())) {
            return getClass().getName().compareTo(mVTicketProviderValidation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33097f()).compareTo(Boolean.valueOf(mVTicketProviderValidation.mo33097f()));
        if (compareTo2 != 0 || ((mo33097f() && (compareTo2 = C25082a.m62839c(this.providerId, mVTicketProviderValidation.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo33098g()).compareTo(Boolean.valueOf(mVTicketProviderValidation.mo33098g()))) != 0)) {
            return compareTo2;
        }
        if (!mo33098g() || (compareTo = this.validationInfo.compareTo(mVTicketProviderValidation.validationInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidation
            r2 = 1
            if (r1 == 0) goto L_0x0043
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidation r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidation) r6
            int r1 = r5.providerId
            int r3 = r6.providerId
            if (r1 == r3) goto L_0x0012
            goto L_0x0043
        L_0x0012:
            boolean r1 = r5.mo33098g()
            boolean r3 = r6.mo33098g()
            if (r1 != 0) goto L_0x001e
            if (r3 == 0) goto L_0x0042
        L_0x001e:
            if (r1 == 0) goto L_0x0043
            if (r3 != 0) goto L_0x0023
            goto L_0x0043
        L_0x0023:
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidationInfo r1 = r5.validationInfo
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidationInfo r6 = r6.validationInfo
            if (r6 == 0) goto L_0x003b
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x003e
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x003e
            r6 = 1
            goto L_0x003f
        L_0x003b:
            r1.getClass()
        L_0x003e:
            r6 = 0
        L_0x003f:
            if (r6 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidation.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo33097f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33098g() {
        return this.validationInfo != null;
    }

    /* renamed from: h */
    public final void mo33099h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicketProviderValidation(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "validationInfo:");
        MVTicketProviderValidationInfo mVTicketProviderValidationInfo = this.validationInfo;
        if (mVTicketProviderValidationInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTicketProviderValidationInfo);
        }
        n.append(")");
        return n.toString();
    }
}
