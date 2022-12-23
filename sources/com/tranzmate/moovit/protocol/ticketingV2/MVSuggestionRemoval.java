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

public class MVSuggestionRemoval implements TBase<MVSuggestionRemoval, _Fields>, Serializable, Cloneable, Comparable<MVSuggestionRemoval> {

    /* renamed from: b */
    public static final C25113c f29133b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29134c = new C25113c("fareId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29135d = new C25113c("agencyKey", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29136e = new C25113c("metroId", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f29137f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29138g;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public String fareId;
    public int metroId;
    public int providerId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        FARE_ID(2, "fareId"),
        AGENCY_KEY(3, "agencyKey"),
        METRO_ID(4, "metroId");
        
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
                return FARE_ID;
            }
            if (i == 3) {
                return AGENCY_KEY;
            }
            if (i != 4) {
                return null;
            }
            return METRO_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestionRemoval$a */
    public static class C11054a extends C25239c<MVSuggestionRemoval> {
        public C11054a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestionRemoval mVSuggestionRemoval = (MVSuggestionRemoval) tBase;
            mVSuggestionRemoval.getClass();
            C25113c cVar = MVSuggestionRemoval.f29133b;
            gVar.mo61687K();
            gVar.mo61711x(MVSuggestionRemoval.f29133b);
            gVar.mo61678B(mVSuggestionRemoval.providerId);
            gVar.mo61712y();
            if (mVSuggestionRemoval.fareId != null) {
                gVar.mo61711x(MVSuggestionRemoval.f29134c);
                gVar.mo61686J(mVSuggestionRemoval.fareId);
                gVar.mo61712y();
            }
            if (mVSuggestionRemoval.agencyKey != null) {
                gVar.mo61711x(MVSuggestionRemoval.f29135d);
                gVar.mo61686J(mVSuggestionRemoval.agencyKey);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSuggestionRemoval.f29136e);
            C16530d.m42020n(gVar, mVSuggestionRemoval.metroId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestionRemoval mVSuggestionRemoval = (MVSuggestionRemoval) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSuggestionRemoval.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVSuggestionRemoval.metroId = gVar.mo61696i();
                                mVSuggestionRemoval.mo33011j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVSuggestionRemoval.agencyKey = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVSuggestionRemoval.fareId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSuggestionRemoval.providerId = gVar.mo61696i();
                    mVSuggestionRemoval.mo33012k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestionRemoval$b */
    public static class C11055b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11054a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestionRemoval$c */
    public static class C11056c extends C25240d<MVSuggestionRemoval> {
        public C11056c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestionRemoval mVSuggestionRemoval = (MVSuggestionRemoval) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSuggestionRemoval.mo33010i()) {
                bitSet.set(0);
            }
            if (mVSuggestionRemoval.mo33007g()) {
                bitSet.set(1);
            }
            if (mVSuggestionRemoval.mo33006f()) {
                bitSet.set(2);
            }
            if (mVSuggestionRemoval.mo33008h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVSuggestionRemoval.mo33010i()) {
                jVar.mo61678B(mVSuggestionRemoval.providerId);
            }
            if (mVSuggestionRemoval.mo33007g()) {
                jVar.mo61686J(mVSuggestionRemoval.fareId);
            }
            if (mVSuggestionRemoval.mo33006f()) {
                jVar.mo61686J(mVSuggestionRemoval.agencyKey);
            }
            if (mVSuggestionRemoval.mo33008h()) {
                jVar.mo61678B(mVSuggestionRemoval.metroId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestionRemoval mVSuggestionRemoval = (MVSuggestionRemoval) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVSuggestionRemoval.providerId = jVar.mo61696i();
                mVSuggestionRemoval.mo33012k();
            }
            if (T.get(1)) {
                mVSuggestionRemoval.fareId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVSuggestionRemoval.agencyKey = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVSuggestionRemoval.metroId = jVar.mo61696i();
                mVSuggestionRemoval.mo33011j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestionRemoval$d */
    public static class C11057d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11056c(0);
        }
    }

    static {
        new C17394d0("MVSuggestionRemoval");
        HashMap hashMap = new HashMap();
        f29137f = hashMap;
        hashMap.put(C25239c.class, new C11055b());
        hashMap.put(C25240d.class, new C11057d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FARE_ID, new FieldMetaData("fareId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29138g = unmodifiableMap;
        FieldMetaData.m61947a(MVSuggestionRemoval.class, unmodifiableMap);
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
        ((C25238b) f29137f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29137f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVSuggestionRemoval mVSuggestionRemoval = (MVSuggestionRemoval) obj;
        if (!getClass().equals(mVSuggestionRemoval.getClass())) {
            return getClass().getName().compareTo(mVSuggestionRemoval.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33010i()).compareTo(Boolean.valueOf(mVSuggestionRemoval.mo33010i()));
        if (compareTo != 0 || ((mo33010i() && (compareTo = C25082a.m62839c(this.providerId, mVSuggestionRemoval.providerId)) != 0) || (compareTo = Boolean.valueOf(mo33007g()).compareTo(Boolean.valueOf(mVSuggestionRemoval.mo33007g()))) != 0 || ((mo33007g() && (compareTo = this.fareId.compareTo(mVSuggestionRemoval.fareId)) != 0) || (compareTo = Boolean.valueOf(mo33006f()).compareTo(Boolean.valueOf(mVSuggestionRemoval.mo33006f()))) != 0 || ((mo33006f() && (compareTo = this.agencyKey.compareTo(mVSuggestionRemoval.agencyKey)) != 0) || (compareTo = Boolean.valueOf(mo33008h()).compareTo(Boolean.valueOf(mVSuggestionRemoval.mo33008h()))) != 0)))) {
            return compareTo;
        }
        if (!mo33008h() || (c = C25082a.m62839c(this.metroId, mVSuggestionRemoval.metroId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSuggestionRemoval)) {
            return false;
        }
        MVSuggestionRemoval mVSuggestionRemoval = (MVSuggestionRemoval) obj;
        if (this.providerId != mVSuggestionRemoval.providerId) {
            return false;
        }
        boolean g = mo33007g();
        boolean g2 = mVSuggestionRemoval.mo33007g();
        if ((g || g2) && (!g || !g2 || !this.fareId.equals(mVSuggestionRemoval.fareId))) {
            return false;
        }
        boolean f = mo33006f();
        boolean f2 = mVSuggestionRemoval.mo33006f();
        if (((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVSuggestionRemoval.agencyKey))) || this.metroId != mVSuggestionRemoval.metroId) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33006f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo33007g() {
        return this.fareId != null;
    }

    /* renamed from: h */
    public final boolean mo33008h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33010i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo33011j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo33012k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSuggestionRemoval(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "fareId:");
        String str = this.fareId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("agencyKey:");
        String str2 = this.agencyKey;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("metroId:");
        return C13437d.m33707l(n, this.metroId, ")");
    }
}
