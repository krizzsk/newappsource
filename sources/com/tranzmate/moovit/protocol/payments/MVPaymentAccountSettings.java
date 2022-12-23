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

public class MVPaymentAccountSettings implements TBase<MVPaymentAccountSettings, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountSettings> {

    /* renamed from: b */
    public static final C25113c f27450b = new C25113c("marketingConsent", (byte) 2, 1);

    /* renamed from: c */
    public static final HashMap f27451c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27452d;
    private byte __isset_bitfield = 0;
    public boolean marketingConsent;
    private _Fields[] optionals = {_Fields.MARKETING_CONSENT};

    public enum _Fields implements C25085c {
        MARKETING_CONSENT(1, "marketingConsent");
        
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
            return MARKETING_CONSENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSettings$a */
    public static class C9877a extends C25239c<MVPaymentAccountSettings> {
        public C9877a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSettings mVPaymentAccountSettings = (MVPaymentAccountSettings) tBase;
            mVPaymentAccountSettings.getClass();
            C25113c cVar = MVPaymentAccountSettings.f27450b;
            gVar.mo61687K();
            if (mVPaymentAccountSettings.mo30174f()) {
                gVar.mo61711x(MVPaymentAccountSettings.f27450b);
                gVar.mo61708u(mVPaymentAccountSettings.marketingConsent);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSettings mVPaymentAccountSettings = (MVPaymentAccountSettings) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentAccountSettings.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 2) {
                    mVPaymentAccountSettings.marketingConsent = gVar.mo61690c();
                    mVPaymentAccountSettings.mo30175g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSettings$b */
    public static class C9878b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9877a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSettings$c */
    public static class C9879c extends C25240d<MVPaymentAccountSettings> {
        public C9879c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSettings mVPaymentAccountSettings = (MVPaymentAccountSettings) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountSettings.mo30174f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPaymentAccountSettings.mo30174f()) {
                jVar.mo61708u(mVPaymentAccountSettings.marketingConsent);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSettings mVPaymentAccountSettings = (MVPaymentAccountSettings) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVPaymentAccountSettings.marketingConsent = jVar.mo61690c();
                mVPaymentAccountSettings.mo30175g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSettings$d */
    public static class C9880d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9879c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountSettings");
        HashMap hashMap = new HashMap();
        f27451c = hashMap;
        hashMap.put(C25239c.class, new C9878b());
        hashMap.put(C25240d.class, new C9880d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MARKETING_CONSENT, new FieldMetaData("marketingConsent", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27452d = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountSettings.class, unmodifiableMap);
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
        ((C25238b) f27451c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27451c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30171a(MVPaymentAccountSettings mVPaymentAccountSettings) {
        if (mVPaymentAccountSettings == null) {
            return false;
        }
        boolean f = mo30174f();
        boolean f2 = mVPaymentAccountSettings.mo30174f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || this.marketingConsent != mVPaymentAccountSettings.marketingConsent) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVPaymentAccountSettings mVPaymentAccountSettings = (MVPaymentAccountSettings) obj;
        if (!getClass().equals(mVPaymentAccountSettings.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountSettings.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30174f()).compareTo(Boolean.valueOf(mVPaymentAccountSettings.mo30174f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo30174f() || (l = C25082a.m62848l(this.marketingConsent, mVPaymentAccountSettings.marketingConsent)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentAccountSettings)) {
            return mo30171a((MVPaymentAccountSettings) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30174f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo30175g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVPaymentAccountSettings(");
        if (mo30174f()) {
            sb.append("marketingConsent:");
            sb.append(this.marketingConsent);
        }
        sb.append(")");
        return sb.toString();
    }
}
