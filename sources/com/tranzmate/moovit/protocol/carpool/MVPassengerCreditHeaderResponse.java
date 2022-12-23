package com.tranzmate.moovit.protocol.carpool;

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

public class MVPassengerCreditHeaderResponse implements TBase<MVPassengerCreditHeaderResponse, _Fields>, Serializable, Cloneable, Comparable<MVPassengerCreditHeaderResponse> {

    /* renamed from: b */
    public static final C25113c f24764b = new C25113c("nextRideCredit", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24765c = new C25113c("totalCredit", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24766d = new C25113c("nextRideCreditExpiration", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f24767e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24768f;
    private byte __isset_bitfield = 0;
    public MVCarPoolPrice nextRideCredit;
    public long nextRideCreditExpiration;
    private _Fields[] optionals = {_Fields.NEXT_RIDE_CREDIT, _Fields.TOTAL_CREDIT, _Fields.NEXT_RIDE_CREDIT_EXPIRATION};
    public MVCarPoolPrice totalCredit;

    public enum _Fields implements C25085c {
        NEXT_RIDE_CREDIT(1, "nextRideCredit"),
        TOTAL_CREDIT(2, "totalCredit"),
        NEXT_RIDE_CREDIT_EXPIRATION(3, "nextRideCreditExpiration");
        
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
                return NEXT_RIDE_CREDIT;
            }
            if (i == 2) {
                return TOTAL_CREDIT;
            }
            if (i != 3) {
                return null;
            }
            return NEXT_RIDE_CREDIT_EXPIRATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerCreditHeaderResponse$a */
    public static class C8246a extends C25239c<MVPassengerCreditHeaderResponse> {
        public C8246a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCreditHeaderResponse mVPassengerCreditHeaderResponse = (MVPassengerCreditHeaderResponse) tBase;
            MVCarPoolPrice mVCarPoolPrice = mVPassengerCreditHeaderResponse.nextRideCredit;
            C25113c cVar = MVPassengerCreditHeaderResponse.f24764b;
            gVar.mo61687K();
            if (mVPassengerCreditHeaderResponse.nextRideCredit != null && mVPassengerCreditHeaderResponse.mo25706f()) {
                gVar.mo61711x(MVPassengerCreditHeaderResponse.f24764b);
                mVPassengerCreditHeaderResponse.nextRideCredit.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerCreditHeaderResponse.totalCredit != null && mVPassengerCreditHeaderResponse.mo25708h()) {
                gVar.mo61711x(MVPassengerCreditHeaderResponse.f24765c);
                mVPassengerCreditHeaderResponse.totalCredit.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerCreditHeaderResponse.mo25707g()) {
                gVar.mo61711x(MVPassengerCreditHeaderResponse.f24766d);
                gVar.mo61679C(mVPassengerCreditHeaderResponse.nextRideCreditExpiration);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCreditHeaderResponse mVPassengerCreditHeaderResponse = (MVPassengerCreditHeaderResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCarPoolPrice mVCarPoolPrice = mVPassengerCreditHeaderResponse.nextRideCredit;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVPassengerCreditHeaderResponse.nextRideCreditExpiration = gVar.mo61697j();
                            mVPassengerCreditHeaderResponse.mo25710i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                        mVPassengerCreditHeaderResponse.totalCredit = mVCarPoolPrice2;
                        mVCarPoolPrice2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCarPoolPrice mVCarPoolPrice3 = new MVCarPoolPrice();
                    mVPassengerCreditHeaderResponse.nextRideCredit = mVCarPoolPrice3;
                    mVCarPoolPrice3.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerCreditHeaderResponse$b */
    public static class C8247b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8246a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerCreditHeaderResponse$c */
    public static class C8248c extends C25240d<MVPassengerCreditHeaderResponse> {
        public C8248c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCreditHeaderResponse mVPassengerCreditHeaderResponse = (MVPassengerCreditHeaderResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerCreditHeaderResponse.mo25706f()) {
                bitSet.set(0);
            }
            if (mVPassengerCreditHeaderResponse.mo25708h()) {
                bitSet.set(1);
            }
            if (mVPassengerCreditHeaderResponse.mo25707g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPassengerCreditHeaderResponse.mo25706f()) {
                mVPassengerCreditHeaderResponse.nextRideCredit.mo25202X0(jVar);
            }
            if (mVPassengerCreditHeaderResponse.mo25708h()) {
                mVPassengerCreditHeaderResponse.totalCredit.mo25202X0(jVar);
            }
            if (mVPassengerCreditHeaderResponse.mo25707g()) {
                jVar.mo61679C(mVPassengerCreditHeaderResponse.nextRideCreditExpiration);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCreditHeaderResponse mVPassengerCreditHeaderResponse = (MVPassengerCreditHeaderResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                mVPassengerCreditHeaderResponse.nextRideCredit = mVCarPoolPrice;
                mVCarPoolPrice.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCarPoolPrice mVCarPoolPrice2 = new MVCarPoolPrice();
                mVPassengerCreditHeaderResponse.totalCredit = mVCarPoolPrice2;
                mVCarPoolPrice2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPassengerCreditHeaderResponse.nextRideCreditExpiration = jVar.mo61697j();
                mVPassengerCreditHeaderResponse.mo25710i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerCreditHeaderResponse$d */
    public static class C8249d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8248c(0);
        }
    }

    static {
        new C17394d0("MVPassengerCreditHeaderResponse");
        HashMap hashMap = new HashMap();
        f24767e = hashMap;
        hashMap.put(C25239c.class, new C8247b());
        hashMap.put(C25240d.class, new C8249d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NEXT_RIDE_CREDIT, new FieldMetaData("nextRideCredit", (byte) 2, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.TOTAL_CREDIT, new FieldMetaData("totalCredit", (byte) 2, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.NEXT_RIDE_CREDIT_EXPIRATION, new FieldMetaData("nextRideCreditExpiration", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24768f = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerCreditHeaderResponse.class, unmodifiableMap);
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
        ((C25238b) f24767e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24767e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVPassengerCreditHeaderResponse mVPassengerCreditHeaderResponse = (MVPassengerCreditHeaderResponse) obj;
        if (!getClass().equals(mVPassengerCreditHeaderResponse.getClass())) {
            return getClass().getName().compareTo(mVPassengerCreditHeaderResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25706f()).compareTo(Boolean.valueOf(mVPassengerCreditHeaderResponse.mo25706f()));
        if (compareTo != 0 || ((mo25706f() && (compareTo = this.nextRideCredit.compareTo(mVPassengerCreditHeaderResponse.nextRideCredit)) != 0) || (compareTo = Boolean.valueOf(mo25708h()).compareTo(Boolean.valueOf(mVPassengerCreditHeaderResponse.mo25708h()))) != 0 || ((mo25708h() && (compareTo = this.totalCredit.compareTo(mVPassengerCreditHeaderResponse.totalCredit)) != 0) || (compareTo = Boolean.valueOf(mo25707g()).compareTo(Boolean.valueOf(mVPassengerCreditHeaderResponse.mo25707g()))) != 0))) {
            return compareTo;
        }
        if (!mo25707g() || (d = C25082a.m62840d(this.nextRideCreditExpiration, mVPassengerCreditHeaderResponse.nextRideCreditExpiration)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerCreditHeaderResponse)) {
            return false;
        }
        MVPassengerCreditHeaderResponse mVPassengerCreditHeaderResponse = (MVPassengerCreditHeaderResponse) obj;
        boolean f = mo25706f();
        boolean f2 = mVPassengerCreditHeaderResponse.mo25706f();
        if ((f || f2) && (!f || !f2 || !this.nextRideCredit.mo25461a(mVPassengerCreditHeaderResponse.nextRideCredit))) {
            return false;
        }
        boolean h = mo25708h();
        boolean h2 = mVPassengerCreditHeaderResponse.mo25708h();
        if ((h || h2) && (!h || !h2 || !this.totalCredit.mo25461a(mVPassengerCreditHeaderResponse.totalCredit))) {
            return false;
        }
        boolean g = mo25707g();
        boolean g2 = mVPassengerCreditHeaderResponse.mo25707g();
        if ((g || g2) && (!g || !g2 || this.nextRideCreditExpiration != mVPassengerCreditHeaderResponse.nextRideCreditExpiration)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25706f() {
        return this.nextRideCredit != null;
    }

    /* renamed from: g */
    public final boolean mo25707g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo25708h() {
        return this.totalCredit != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25710i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPassengerCreditHeaderResponse(");
        boolean z2 = false;
        if (mo25706f()) {
            sb.append("nextRideCredit:");
            MVCarPoolPrice mVCarPoolPrice = this.nextRideCredit;
            if (mVCarPoolPrice == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVCarPoolPrice);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo25708h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("totalCredit:");
            MVCarPoolPrice mVCarPoolPrice2 = this.totalCredit;
            if (mVCarPoolPrice2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVCarPoolPrice2);
            }
        } else {
            z2 = z;
        }
        if (mo25707g()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("nextRideCreditExpiration:");
            sb.append(this.nextRideCreditExpiration);
        }
        sb.append(")");
        return sb.toString();
    }
}
