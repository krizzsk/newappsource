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

public class MVPurchaseStoredValueAutoLoadIntent implements TBase<MVPurchaseStoredValueAutoLoadIntent, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseStoredValueAutoLoadIntent> {

    /* renamed from: b */
    public static final C25113c f28972b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28973c = new C25113c("agencyKey", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28974d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28975e;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public int providerId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        AGENCY_KEY(2, "agencyKey");
        
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
            return AGENCY_KEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueAutoLoadIntent$a */
    public static class C10959a extends C25239c<MVPurchaseStoredValueAutoLoadIntent> {
        public C10959a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueAutoLoadIntent mVPurchaseStoredValueAutoLoadIntent = (MVPurchaseStoredValueAutoLoadIntent) tBase;
            mVPurchaseStoredValueAutoLoadIntent.getClass();
            C25113c cVar = MVPurchaseStoredValueAutoLoadIntent.f28972b;
            gVar.mo61687K();
            gVar.mo61711x(MVPurchaseStoredValueAutoLoadIntent.f28972b);
            gVar.mo61678B(mVPurchaseStoredValueAutoLoadIntent.providerId);
            gVar.mo61712y();
            if (mVPurchaseStoredValueAutoLoadIntent.agencyKey != null) {
                gVar.mo61711x(MVPurchaseStoredValueAutoLoadIntent.f28973c);
                gVar.mo61686J(mVPurchaseStoredValueAutoLoadIntent.agencyKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueAutoLoadIntent mVPurchaseStoredValueAutoLoadIntent = (MVPurchaseStoredValueAutoLoadIntent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseStoredValueAutoLoadIntent.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVPurchaseStoredValueAutoLoadIntent.agencyKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPurchaseStoredValueAutoLoadIntent.providerId = gVar.mo61696i();
                    mVPurchaseStoredValueAutoLoadIntent.mo32772h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueAutoLoadIntent$b */
    public static class C10960b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10959a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueAutoLoadIntent$c */
    public static class C10961c extends C25240d<MVPurchaseStoredValueAutoLoadIntent> {
        public C10961c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueAutoLoadIntent mVPurchaseStoredValueAutoLoadIntent = (MVPurchaseStoredValueAutoLoadIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseStoredValueAutoLoadIntent.mo32771g()) {
                bitSet.set(0);
            }
            if (mVPurchaseStoredValueAutoLoadIntent.mo32770f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPurchaseStoredValueAutoLoadIntent.mo32771g()) {
                jVar.mo61678B(mVPurchaseStoredValueAutoLoadIntent.providerId);
            }
            if (mVPurchaseStoredValueAutoLoadIntent.mo32770f()) {
                jVar.mo61686J(mVPurchaseStoredValueAutoLoadIntent.agencyKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueAutoLoadIntent mVPurchaseStoredValueAutoLoadIntent = (MVPurchaseStoredValueAutoLoadIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPurchaseStoredValueAutoLoadIntent.providerId = jVar.mo61696i();
                mVPurchaseStoredValueAutoLoadIntent.mo32772h();
            }
            if (T.get(1)) {
                mVPurchaseStoredValueAutoLoadIntent.agencyKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueAutoLoadIntent$d */
    public static class C10962d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10961c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseStoredValueAutoLoadIntent");
        HashMap hashMap = new HashMap();
        f28974d = hashMap;
        hashMap.put(C25239c.class, new C10960b());
        hashMap.put(C25240d.class, new C10962d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28975e = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseStoredValueAutoLoadIntent.class, unmodifiableMap);
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
        ((C25238b) f28974d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28974d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseStoredValueAutoLoadIntent mVPurchaseStoredValueAutoLoadIntent = (MVPurchaseStoredValueAutoLoadIntent) obj;
        if (!getClass().equals(mVPurchaseStoredValueAutoLoadIntent.getClass())) {
            return getClass().getName().compareTo(mVPurchaseStoredValueAutoLoadIntent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32771g()).compareTo(Boolean.valueOf(mVPurchaseStoredValueAutoLoadIntent.mo32771g()));
        if (compareTo2 != 0 || ((mo32771g() && (compareTo2 = C25082a.m62839c(this.providerId, mVPurchaseStoredValueAutoLoadIntent.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32770f()).compareTo(Boolean.valueOf(mVPurchaseStoredValueAutoLoadIntent.mo32770f()))) != 0)) {
            return compareTo2;
        }
        if (!mo32770f() || (compareTo = this.agencyKey.compareTo(mVPurchaseStoredValueAutoLoadIntent.agencyKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseStoredValueAutoLoadIntent)) {
            return false;
        }
        MVPurchaseStoredValueAutoLoadIntent mVPurchaseStoredValueAutoLoadIntent = (MVPurchaseStoredValueAutoLoadIntent) obj;
        if (this.providerId != mVPurchaseStoredValueAutoLoadIntent.providerId) {
            return false;
        }
        boolean f = mo32770f();
        boolean f2 = mVPurchaseStoredValueAutoLoadIntent.mo32770f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseStoredValueAutoLoadIntent.agencyKey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32770f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32771g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo32772h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseStoredValueAutoLoadIntent(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "agencyKey:");
        String str = this.agencyKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
