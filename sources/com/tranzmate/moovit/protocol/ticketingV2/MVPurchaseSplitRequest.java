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

public class MVPurchaseSplitRequest implements TBase<MVPurchaseSplitRequest, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseSplitRequest> {

    /* renamed from: b */
    public static final C25113c f28941b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28942c = new C25113c("agencyKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28943d = new C25113c("fareId", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f28944e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28945f;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public String fareId;
    public int providerId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        AGENCY_KEY(2, "agencyKey"),
        FARE_ID(3, "fareId");
        
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
                return AGENCY_KEY;
            }
            if (i != 3) {
                return null;
            }
            return FARE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitRequest$a */
    public static class C10945a extends C25239c<MVPurchaseSplitRequest> {
        public C10945a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitRequest mVPurchaseSplitRequest = (MVPurchaseSplitRequest) tBase;
            mVPurchaseSplitRequest.getClass();
            C25113c cVar = MVPurchaseSplitRequest.f28941b;
            gVar.mo61687K();
            gVar.mo61711x(MVPurchaseSplitRequest.f28941b);
            gVar.mo61678B(mVPurchaseSplitRequest.providerId);
            gVar.mo61712y();
            if (mVPurchaseSplitRequest.agencyKey != null) {
                gVar.mo61711x(MVPurchaseSplitRequest.f28942c);
                gVar.mo61686J(mVPurchaseSplitRequest.agencyKey);
                gVar.mo61712y();
            }
            if (mVPurchaseSplitRequest.fareId != null) {
                gVar.mo61711x(MVPurchaseSplitRequest.f28943d);
                gVar.mo61686J(mVPurchaseSplitRequest.fareId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitRequest mVPurchaseSplitRequest = (MVPurchaseSplitRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseSplitRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPurchaseSplitRequest.fareId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPurchaseSplitRequest.agencyKey = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPurchaseSplitRequest.providerId = gVar.mo61696i();
                    mVPurchaseSplitRequest.mo32733i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitRequest$b */
    public static class C10946b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10945a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitRequest$c */
    public static class C10947c extends C25240d<MVPurchaseSplitRequest> {
        public C10947c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitRequest mVPurchaseSplitRequest = (MVPurchaseSplitRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseSplitRequest.mo32731h()) {
                bitSet.set(0);
            }
            if (mVPurchaseSplitRequest.mo32729f()) {
                bitSet.set(1);
            }
            if (mVPurchaseSplitRequest.mo32730g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPurchaseSplitRequest.mo32731h()) {
                jVar.mo61678B(mVPurchaseSplitRequest.providerId);
            }
            if (mVPurchaseSplitRequest.mo32729f()) {
                jVar.mo61686J(mVPurchaseSplitRequest.agencyKey);
            }
            if (mVPurchaseSplitRequest.mo32730g()) {
                jVar.mo61686J(mVPurchaseSplitRequest.fareId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseSplitRequest mVPurchaseSplitRequest = (MVPurchaseSplitRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPurchaseSplitRequest.providerId = jVar.mo61696i();
                mVPurchaseSplitRequest.mo32733i();
            }
            if (T.get(1)) {
                mVPurchaseSplitRequest.agencyKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPurchaseSplitRequest.fareId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitRequest$d */
    public static class C10948d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10947c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseSplitRequest");
        HashMap hashMap = new HashMap();
        f28944e = hashMap;
        hashMap.put(C25239c.class, new C10946b());
        hashMap.put(C25240d.class, new C10948d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FARE_ID, new FieldMetaData("fareId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28945f = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseSplitRequest.class, unmodifiableMap);
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
        ((C25238b) f28944e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28944e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseSplitRequest mVPurchaseSplitRequest = (MVPurchaseSplitRequest) obj;
        if (!getClass().equals(mVPurchaseSplitRequest.getClass())) {
            return getClass().getName().compareTo(mVPurchaseSplitRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32731h()).compareTo(Boolean.valueOf(mVPurchaseSplitRequest.mo32731h()));
        if (compareTo2 != 0 || ((mo32731h() && (compareTo2 = C25082a.m62839c(this.providerId, mVPurchaseSplitRequest.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32729f()).compareTo(Boolean.valueOf(mVPurchaseSplitRequest.mo32729f()))) != 0 || ((mo32729f() && (compareTo2 = this.agencyKey.compareTo(mVPurchaseSplitRequest.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32730g()).compareTo(Boolean.valueOf(mVPurchaseSplitRequest.mo32730g()))) != 0))) {
            return compareTo2;
        }
        if (!mo32730g() || (compareTo = this.fareId.compareTo(mVPurchaseSplitRequest.fareId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseSplitRequest)) {
            return false;
        }
        MVPurchaseSplitRequest mVPurchaseSplitRequest = (MVPurchaseSplitRequest) obj;
        if (this.providerId != mVPurchaseSplitRequest.providerId) {
            return false;
        }
        boolean f = mo32729f();
        boolean f2 = mVPurchaseSplitRequest.mo32729f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseSplitRequest.agencyKey))) {
            return false;
        }
        boolean g = mo32730g();
        boolean g2 = mVPurchaseSplitRequest.mo32730g();
        if ((g || g2) && (!g || !g2 || !this.fareId.equals(mVPurchaseSplitRequest.fareId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32729f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32730g() {
        return this.fareId != null;
    }

    /* renamed from: h */
    public final boolean mo32731h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo32733i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseSplitRequest(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "agencyKey:");
        String str = this.agencyKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("fareId:");
        String str2 = this.fareId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
