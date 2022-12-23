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

public class MVSuggestedTicketFareSelectionStepResult implements TBase<MVSuggestedTicketFareSelectionStepResult, _Fields>, Serializable, Cloneable, Comparable<MVSuggestedTicketFareSelectionStepResult> {

    /* renamed from: b */
    public static final C25113c f29128b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29129c = new C25113c("fareId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29130d = new C25113c("agencyKey", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f29131e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29132f;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public String fareId;
    private _Fields[] optionals = {_Fields.PROVIDER_ID, _Fields.FARE_ID, _Fields.AGENCY_KEY};
    public int providerId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        FARE_ID(2, "fareId"),
        AGENCY_KEY(3, "agencyKey");
        
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
            if (i != 3) {
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStepResult$a */
    public static class C11050a extends C25239c<MVSuggestedTicketFareSelectionStepResult> {
        public C11050a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareSelectionStepResult mVSuggestedTicketFareSelectionStepResult = (MVSuggestedTicketFareSelectionStepResult) tBase;
            mVSuggestedTicketFareSelectionStepResult.getClass();
            C25113c cVar = MVSuggestedTicketFareSelectionStepResult.f29128b;
            gVar.mo61687K();
            if (mVSuggestedTicketFareSelectionStepResult.mo32999h()) {
                gVar.mo61711x(MVSuggestedTicketFareSelectionStepResult.f29128b);
                gVar.mo61678B(mVSuggestedTicketFareSelectionStepResult.providerId);
                gVar.mo61712y();
            }
            if (mVSuggestedTicketFareSelectionStepResult.fareId != null && mVSuggestedTicketFareSelectionStepResult.mo32998g()) {
                gVar.mo61711x(MVSuggestedTicketFareSelectionStepResult.f29129c);
                gVar.mo61686J(mVSuggestedTicketFareSelectionStepResult.fareId);
                gVar.mo61712y();
            }
            if (mVSuggestedTicketFareSelectionStepResult.agencyKey != null && mVSuggestedTicketFareSelectionStepResult.mo32997f()) {
                gVar.mo61711x(MVSuggestedTicketFareSelectionStepResult.f29130d);
                gVar.mo61686J(mVSuggestedTicketFareSelectionStepResult.agencyKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareSelectionStepResult mVSuggestedTicketFareSelectionStepResult = (MVSuggestedTicketFareSelectionStepResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSuggestedTicketFareSelectionStepResult.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVSuggestedTicketFareSelectionStepResult.agencyKey = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVSuggestedTicketFareSelectionStepResult.fareId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSuggestedTicketFareSelectionStepResult.providerId = gVar.mo61696i();
                    mVSuggestedTicketFareSelectionStepResult.mo33001i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStepResult$b */
    public static class C11051b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11050a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStepResult$c */
    public static class C11052c extends C25240d<MVSuggestedTicketFareSelectionStepResult> {
        public C11052c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareSelectionStepResult mVSuggestedTicketFareSelectionStepResult = (MVSuggestedTicketFareSelectionStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSuggestedTicketFareSelectionStepResult.mo32999h()) {
                bitSet.set(0);
            }
            if (mVSuggestedTicketFareSelectionStepResult.mo32998g()) {
                bitSet.set(1);
            }
            if (mVSuggestedTicketFareSelectionStepResult.mo32997f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVSuggestedTicketFareSelectionStepResult.mo32999h()) {
                jVar.mo61678B(mVSuggestedTicketFareSelectionStepResult.providerId);
            }
            if (mVSuggestedTicketFareSelectionStepResult.mo32998g()) {
                jVar.mo61686J(mVSuggestedTicketFareSelectionStepResult.fareId);
            }
            if (mVSuggestedTicketFareSelectionStepResult.mo32997f()) {
                jVar.mo61686J(mVSuggestedTicketFareSelectionStepResult.agencyKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareSelectionStepResult mVSuggestedTicketFareSelectionStepResult = (MVSuggestedTicketFareSelectionStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVSuggestedTicketFareSelectionStepResult.providerId = jVar.mo61696i();
                mVSuggestedTicketFareSelectionStepResult.mo33001i();
            }
            if (T.get(1)) {
                mVSuggestedTicketFareSelectionStepResult.fareId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVSuggestedTicketFareSelectionStepResult.agencyKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStepResult$d */
    public static class C11053d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11052c(0);
        }
    }

    static {
        new C17394d0("MVSuggestedTicketFareSelectionStepResult");
        HashMap hashMap = new HashMap();
        f29131e = hashMap;
        hashMap.put(C25239c.class, new C11051b());
        hashMap.put(C25240d.class, new C11053d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FARE_ID, new FieldMetaData("fareId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29132f = unmodifiableMap;
        FieldMetaData.m61947a(MVSuggestedTicketFareSelectionStepResult.class, unmodifiableMap);
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
        ((C25238b) f29131e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29131e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSuggestedTicketFareSelectionStepResult mVSuggestedTicketFareSelectionStepResult = (MVSuggestedTicketFareSelectionStepResult) obj;
        if (!getClass().equals(mVSuggestedTicketFareSelectionStepResult.getClass())) {
            return getClass().getName().compareTo(mVSuggestedTicketFareSelectionStepResult.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32999h()).compareTo(Boolean.valueOf(mVSuggestedTicketFareSelectionStepResult.mo32999h()));
        if (compareTo2 != 0 || ((mo32999h() && (compareTo2 = C25082a.m62839c(this.providerId, mVSuggestedTicketFareSelectionStepResult.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32998g()).compareTo(Boolean.valueOf(mVSuggestedTicketFareSelectionStepResult.mo32998g()))) != 0 || ((mo32998g() && (compareTo2 = this.fareId.compareTo(mVSuggestedTicketFareSelectionStepResult.fareId)) != 0) || (compareTo2 = Boolean.valueOf(mo32997f()).compareTo(Boolean.valueOf(mVSuggestedTicketFareSelectionStepResult.mo32997f()))) != 0))) {
            return compareTo2;
        }
        if (!mo32997f() || (compareTo = this.agencyKey.compareTo(mVSuggestedTicketFareSelectionStepResult.agencyKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSuggestedTicketFareSelectionStepResult)) {
            return false;
        }
        MVSuggestedTicketFareSelectionStepResult mVSuggestedTicketFareSelectionStepResult = (MVSuggestedTicketFareSelectionStepResult) obj;
        boolean h = mo32999h();
        boolean h2 = mVSuggestedTicketFareSelectionStepResult.mo32999h();
        if ((h || h2) && (!h || !h2 || this.providerId != mVSuggestedTicketFareSelectionStepResult.providerId)) {
            return false;
        }
        boolean g = mo32998g();
        boolean g2 = mVSuggestedTicketFareSelectionStepResult.mo32998g();
        if ((g || g2) && (!g || !g2 || !this.fareId.equals(mVSuggestedTicketFareSelectionStepResult.fareId))) {
            return false;
        }
        boolean f = mo32997f();
        boolean f2 = mVSuggestedTicketFareSelectionStepResult.mo32997f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVSuggestedTicketFareSelectionStepResult.agencyKey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32997f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32998g() {
        return this.fareId != null;
    }

    /* renamed from: h */
    public final boolean mo32999h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33001i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVSuggestedTicketFareSelectionStepResult(");
        boolean z2 = false;
        if (mo32999h()) {
            sb.append("providerId:");
            sb.append(this.providerId);
            z = false;
        } else {
            z = true;
        }
        if (mo32998g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fareId:");
            String str = this.fareId;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
        } else {
            z2 = z;
        }
        if (mo32997f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("agencyKey:");
            String str2 = this.agencyKey;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
