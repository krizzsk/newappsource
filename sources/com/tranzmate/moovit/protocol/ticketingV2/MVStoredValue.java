package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVStoredValue implements TBase<MVStoredValue, _Fields>, Serializable, Cloneable, Comparable<MVStoredValue> {

    /* renamed from: b */
    public static final C25113c f29087b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29088c = new C25113c("agencyKey", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29089d = new C25113c("balance", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29090e = new C25113c(ServerParameters.STATUS, (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f29091f = new C25113c("isAutoloadEnabled", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f29092g = new C25113c("autoloadAmount", (byte) 12, 6);

    /* renamed from: h */
    public static final HashMap f29093h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f29094i;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public MVCurrencyAmount autoloadAmount;
    public MVCurrencyAmount balance;
    public boolean isAutoloadEnabled;
    private _Fields[] optionals = {_Fields.AUTOLOAD_AMOUNT};
    public int providerId;
    public MVStoredValueStatus status;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        AGENCY_KEY(2, "agencyKey"),
        BALANCE(3, "balance"),
        STATUS(4, ServerParameters.STATUS),
        IS_AUTOLOAD_ENABLED(5, "isAutoloadEnabled"),
        AUTOLOAD_AMOUNT(6, "autoloadAmount");
        
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
            switch (i) {
                case 1:
                    return PROVIDER_ID;
                case 2:
                    return AGENCY_KEY;
                case 3:
                    return BALANCE;
                case 4:
                    return STATUS;
                case 5:
                    return IS_AUTOLOAD_ENABLED;
                case 6:
                    return AUTOLOAD_AMOUNT;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValue$a */
    public static class C11026a extends C25239c<MVStoredValue> {
        public C11026a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStoredValue mVStoredValue = (MVStoredValue) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVStoredValue.balance;
            C25113c cVar = MVStoredValue.f29087b;
            gVar.mo61687K();
            gVar.mo61711x(MVStoredValue.f29087b);
            gVar.mo61678B(mVStoredValue.providerId);
            gVar.mo61712y();
            if (mVStoredValue.agencyKey != null) {
                gVar.mo61711x(MVStoredValue.f29088c);
                gVar.mo61686J(mVStoredValue.agencyKey);
                gVar.mo61712y();
            }
            if (mVStoredValue.balance != null) {
                gVar.mo61711x(MVStoredValue.f29089d);
                mVStoredValue.balance.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVStoredValue.status != null) {
                gVar.mo61711x(MVStoredValue.f29090e);
                gVar.mo61678B(mVStoredValue.status.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStoredValue.f29091f);
            gVar.mo61708u(mVStoredValue.isAutoloadEnabled);
            gVar.mo61712y();
            if (mVStoredValue.autoloadAmount != null && mVStoredValue.mo32930g()) {
                gVar.mo61711x(MVStoredValue.f29092g);
                mVStoredValue.autoloadAmount.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStoredValue mVStoredValue = (MVStoredValue) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVStoredValue.balance;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStoredValue.providerId = gVar.mo61696i();
                            mVStoredValue.mo32937m();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStoredValue.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVStoredValue.balance = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStoredValue.status = MVStoredValueStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStoredValue.isAutoloadEnabled = gVar.mo61690c();
                            mVStoredValue.mo32936l();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount3 = new MVCurrencyAmount();
                            mVStoredValue.autoloadAmount = mVCurrencyAmount3;
                            mVCurrencyAmount3.mo25201C1(gVar);
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValue$b */
    public static class C11027b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11026a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValue$c */
    public static class C11028c extends C25240d<MVStoredValue> {
        public C11028c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStoredValue mVStoredValue = (MVStoredValue) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStoredValue.mo32934j()) {
                bitSet.set(0);
            }
            if (mVStoredValue.mo32929f()) {
                bitSet.set(1);
            }
            if (mVStoredValue.mo32931h()) {
                bitSet.set(2);
            }
            if (mVStoredValue.mo32935k()) {
                bitSet.set(3);
            }
            if (mVStoredValue.mo32933i()) {
                bitSet.set(4);
            }
            if (mVStoredValue.mo32930g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVStoredValue.mo32934j()) {
                jVar.mo61678B(mVStoredValue.providerId);
            }
            if (mVStoredValue.mo32929f()) {
                jVar.mo61686J(mVStoredValue.agencyKey);
            }
            if (mVStoredValue.mo32931h()) {
                mVStoredValue.balance.mo25202X0(jVar);
            }
            if (mVStoredValue.mo32935k()) {
                jVar.mo61678B(mVStoredValue.status.getValue());
            }
            if (mVStoredValue.mo32933i()) {
                jVar.mo61708u(mVStoredValue.isAutoloadEnabled);
            }
            if (mVStoredValue.mo32930g()) {
                mVStoredValue.autoloadAmount.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStoredValue mVStoredValue = (MVStoredValue) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVStoredValue.providerId = jVar.mo61696i();
                mVStoredValue.mo32937m();
            }
            if (T.get(1)) {
                mVStoredValue.agencyKey = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVStoredValue.balance = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVStoredValue.status = MVStoredValueStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVStoredValue.isAutoloadEnabled = jVar.mo61690c();
                mVStoredValue.mo32936l();
            }
            if (T.get(5)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVStoredValue.autoloadAmount = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVStoredValue$d */
    public static class C11029d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11028c(0);
        }
    }

    static {
        new C17394d0("MVStoredValue");
        HashMap hashMap = new HashMap();
        f29093h = hashMap;
        hashMap.put(C25239c.class, new C11027b());
        hashMap.put(C25240d.class, new C11029d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BALANCE, new FieldMetaData("balance", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVStoredValueStatus.class)));
        enumMap.put(_Fields.IS_AUTOLOAD_ENABLED, new FieldMetaData("isAutoloadEnabled", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.AUTOLOAD_AMOUNT, new FieldMetaData("autoloadAmount", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29094i = unmodifiableMap;
        FieldMetaData.m61947a(MVStoredValue.class, unmodifiableMap);
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
        ((C25238b) f29093h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29093h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVStoredValue mVStoredValue = (MVStoredValue) obj;
        if (!getClass().equals(mVStoredValue.getClass())) {
            return getClass().getName().compareTo(mVStoredValue.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32934j()).compareTo(Boolean.valueOf(mVStoredValue.mo32934j()));
        if (compareTo2 != 0 || ((mo32934j() && (compareTo2 = C25082a.m62839c(this.providerId, mVStoredValue.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32929f()).compareTo(Boolean.valueOf(mVStoredValue.mo32929f()))) != 0 || ((mo32929f() && (compareTo2 = this.agencyKey.compareTo(mVStoredValue.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32931h()).compareTo(Boolean.valueOf(mVStoredValue.mo32931h()))) != 0 || ((mo32931h() && (compareTo2 = this.balance.compareTo(mVStoredValue.balance)) != 0) || (compareTo2 = Boolean.valueOf(mo32935k()).compareTo(Boolean.valueOf(mVStoredValue.mo32935k()))) != 0 || ((mo32935k() && (compareTo2 = this.status.compareTo(mVStoredValue.status)) != 0) || (compareTo2 = Boolean.valueOf(mo32933i()).compareTo(Boolean.valueOf(mVStoredValue.mo32933i()))) != 0 || ((mo32933i() && (compareTo2 = C25082a.m62848l(this.isAutoloadEnabled, mVStoredValue.isAutoloadEnabled)) != 0) || (compareTo2 = Boolean.valueOf(mo32930g()).compareTo(Boolean.valueOf(mVStoredValue.mo32930g()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo32930g() || (compareTo = this.autoloadAmount.compareTo(mVStoredValue.autoloadAmount)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStoredValue)) {
            return false;
        }
        MVStoredValue mVStoredValue = (MVStoredValue) obj;
        if (this.providerId != mVStoredValue.providerId) {
            return false;
        }
        boolean f = mo32929f();
        boolean f2 = mVStoredValue.mo32929f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVStoredValue.agencyKey))) {
            return false;
        }
        boolean h = mo32931h();
        boolean h2 = mVStoredValue.mo32931h();
        if ((h || h2) && (!h || !h2 || !this.balance.mo26102a(mVStoredValue.balance))) {
            return false;
        }
        boolean k = mo32935k();
        boolean k2 = mVStoredValue.mo32935k();
        if (((k || k2) && (!k || !k2 || !this.status.equals(mVStoredValue.status))) || this.isAutoloadEnabled != mVStoredValue.isAutoloadEnabled) {
            return false;
        }
        boolean g = mo32930g();
        boolean g2 = mVStoredValue.mo32930g();
        if ((g || g2) && (!g || !g2 || !this.autoloadAmount.mo26102a(mVStoredValue.autoloadAmount))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32929f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32930g() {
        return this.autoloadAmount != null;
    }

    /* renamed from: h */
    public final boolean mo32931h() {
        return this.balance != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32933i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo32934j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo32935k() {
        return this.status != null;
    }

    /* renamed from: l */
    public final void mo32936l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo32937m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStoredValue(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "agencyKey:");
        String str = this.agencyKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("balance:");
        MVCurrencyAmount mVCurrencyAmount = this.balance;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("status:");
        MVStoredValueStatus mVStoredValueStatus = this.status;
        if (mVStoredValueStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVStoredValueStatus);
        }
        n.append(", ");
        n.append("isAutoloadEnabled:");
        n.append(this.isAutoloadEnabled);
        if (mo32930g()) {
            n.append(", ");
            n.append("autoloadAmount:");
            MVCurrencyAmount mVCurrencyAmount2 = this.autoloadAmount;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
