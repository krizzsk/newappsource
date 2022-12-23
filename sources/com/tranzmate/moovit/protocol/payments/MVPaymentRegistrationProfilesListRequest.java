package com.tranzmate.moovit.protocol.payments;

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

public class MVPaymentRegistrationProfilesListRequest implements TBase<MVPaymentRegistrationProfilesListRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentRegistrationProfilesListRequest> {

    /* renamed from: b */
    public static final C25113c f27552b = new C25113c("filterDefaultProfiles", (byte) 2, 1);

    /* renamed from: c */
    public static final HashMap f27553c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27554d;
    private byte __isset_bitfield = 0;
    public boolean filterDefaultProfiles;

    public enum _Fields implements C25085c {
        FILTER_DEFAULT_PROFILES(1, "filterDefaultProfiles");
        
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
            return FILTER_DEFAULT_PROFILES;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationProfilesListRequest$a */
    public static class C9951a extends C25239c<MVPaymentRegistrationProfilesListRequest> {
        public C9951a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationProfilesListRequest mVPaymentRegistrationProfilesListRequest = (MVPaymentRegistrationProfilesListRequest) tBase;
            mVPaymentRegistrationProfilesListRequest.getClass();
            C25113c cVar = MVPaymentRegistrationProfilesListRequest.f27552b;
            gVar.mo61687K();
            gVar.mo61711x(MVPaymentRegistrationProfilesListRequest.f27552b);
            C0017h.m62S(gVar, mVPaymentRegistrationProfilesListRequest.filterDefaultProfiles);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationProfilesListRequest mVPaymentRegistrationProfilesListRequest = (MVPaymentRegistrationProfilesListRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentRegistrationProfilesListRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 2) {
                    mVPaymentRegistrationProfilesListRequest.filterDefaultProfiles = gVar.mo61690c();
                    mVPaymentRegistrationProfilesListRequest.mo30334g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationProfilesListRequest$b */
    public static class C9952b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9951a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationProfilesListRequest$c */
    public static class C9953c extends C25240d<MVPaymentRegistrationProfilesListRequest> {
        public C9953c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationProfilesListRequest mVPaymentRegistrationProfilesListRequest = (MVPaymentRegistrationProfilesListRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentRegistrationProfilesListRequest.mo30333f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPaymentRegistrationProfilesListRequest.mo30333f()) {
                jVar.mo61708u(mVPaymentRegistrationProfilesListRequest.filterDefaultProfiles);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentRegistrationProfilesListRequest mVPaymentRegistrationProfilesListRequest = (MVPaymentRegistrationProfilesListRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVPaymentRegistrationProfilesListRequest.filterDefaultProfiles = jVar.mo61690c();
                mVPaymentRegistrationProfilesListRequest.mo30334g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationProfilesListRequest$d */
    public static class C9954d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9953c(0);
        }
    }

    static {
        new C17394d0("MVPaymentRegistrationProfilesListRequest");
        HashMap hashMap = new HashMap();
        f27553c = hashMap;
        hashMap.put(C25239c.class, new C9952b());
        hashMap.put(C25240d.class, new C9954d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FILTER_DEFAULT_PROFILES, new FieldMetaData("filterDefaultProfiles", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27554d = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentRegistrationProfilesListRequest.class, unmodifiableMap);
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
        ((C25238b) f27553c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27553c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVPaymentRegistrationProfilesListRequest mVPaymentRegistrationProfilesListRequest = (MVPaymentRegistrationProfilesListRequest) obj;
        if (!getClass().equals(mVPaymentRegistrationProfilesListRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentRegistrationProfilesListRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30333f()).compareTo(Boolean.valueOf(mVPaymentRegistrationProfilesListRequest.mo30333f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo30333f() || (l = C25082a.m62848l(this.filterDefaultProfiles, mVPaymentRegistrationProfilesListRequest.filterDefaultProfiles)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentRegistrationProfilesListRequest) && this.filterDefaultProfiles == ((MVPaymentRegistrationProfilesListRequest) obj).filterDefaultProfiles) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30333f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo30334g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C25541a.m63885p(C13437d.m33708n("MVPaymentRegistrationProfilesListRequest(", "filterDefaultProfiles:"), this.filterDefaultProfiles, ")");
    }
}
