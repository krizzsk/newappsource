package com.tranzmate.moovit.protocol.fare;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVFareData implements TBase<MVFareData, _Fields>, Serializable, Cloneable, Comparable<MVFareData> {

    /* renamed from: b */
    public static final C25113c f25630b = new C25113c("fareId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25631c = new C25113c("balance", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25632d = new C25113c("payForThisLeg", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f25633e = new C25113c("relatedLegIndex", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25634f = new C25113c("paymentMethod", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f25635g = new C25113c("usage", (byte) 8, 6);

    /* renamed from: h */
    public static final HashMap f25636h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25637i;
    private byte __isset_bitfield = 0;
    public long balance;
    public int fareId;
    private _Fields[] optionals = {_Fields.RELATED_LEG_INDEX, _Fields.PAYMENT_METHOD};
    public boolean payForThisLeg;
    public MVFarePaymentMethod paymentMethod;
    public int relatedLegIndex;
    public MVFareUsage usage;

    public enum _Fields implements C25085c {
        FARE_ID(1, "fareId"),
        BALANCE(2, "balance"),
        PAY_FOR_THIS_LEG(3, "payForThisLeg"),
        RELATED_LEG_INDEX(4, "relatedLegIndex"),
        PAYMENT_METHOD(5, "paymentMethod"),
        USAGE(6, "usage");
        
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
                    return FARE_ID;
                case 2:
                    return BALANCE;
                case 3:
                    return PAY_FOR_THIS_LEG;
                case 4:
                    return RELATED_LEG_INDEX;
                case 5:
                    return PAYMENT_METHOD;
                case 6:
                    return USAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVFareData$a */
    public static class C8735a extends C25239c<MVFareData> {
        public C8735a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFareData mVFareData = (MVFareData) tBase;
            mVFareData.getClass();
            C25113c cVar = MVFareData.f25630b;
            gVar.mo61687K();
            gVar.mo61711x(MVFareData.f25630b);
            gVar.mo61678B(mVFareData.fareId);
            gVar.mo61712y();
            gVar.mo61711x(MVFareData.f25631c);
            gVar.mo61679C(mVFareData.balance);
            gVar.mo61712y();
            gVar.mo61711x(MVFareData.f25632d);
            gVar.mo61708u(mVFareData.payForThisLeg);
            gVar.mo61712y();
            if (mVFareData.mo27223j()) {
                gVar.mo61711x(MVFareData.f25633e);
                gVar.mo61678B(mVFareData.relatedLegIndex);
                gVar.mo61712y();
            }
            if (mVFareData.paymentMethod != null && mVFareData.mo27222i()) {
                gVar.mo61711x(MVFareData.f25634f);
                gVar.mo61678B(mVFareData.paymentMethod.getValue());
                gVar.mo61712y();
            }
            if (mVFareData.usage != null) {
                gVar.mo61711x(MVFareData.f25635g);
                gVar.mo61678B(mVFareData.usage.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFareData mVFareData = (MVFareData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVFareData.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVFareData.fareId = gVar.mo61696i();
                            mVFareData.mo27226m();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVFareData.balance = gVar.mo61697j();
                            mVFareData.mo27225l();
                            break;
                        }
                    case 3:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVFareData.payForThisLeg = gVar.mo61690c();
                            mVFareData.mo27227o();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVFareData.relatedLegIndex = gVar.mo61696i();
                            mVFareData.mo27228p();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVFareData.paymentMethod = MVFarePaymentMethod.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVFareData.usage = MVFareUsage.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVFareData$b */
    public static class C8736b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8735a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVFareData$c */
    public static class C8737c extends C25240d<MVFareData> {
        public C8737c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFareData mVFareData = (MVFareData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVFareData.mo27219g()) {
                bitSet.set(0);
            }
            if (mVFareData.mo27218f()) {
                bitSet.set(1);
            }
            if (mVFareData.mo27220h()) {
                bitSet.set(2);
            }
            if (mVFareData.mo27223j()) {
                bitSet.set(3);
            }
            if (mVFareData.mo27222i()) {
                bitSet.set(4);
            }
            if (mVFareData.mo27224k()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVFareData.mo27219g()) {
                jVar.mo61678B(mVFareData.fareId);
            }
            if (mVFareData.mo27218f()) {
                jVar.mo61679C(mVFareData.balance);
            }
            if (mVFareData.mo27220h()) {
                jVar.mo61708u(mVFareData.payForThisLeg);
            }
            if (mVFareData.mo27223j()) {
                jVar.mo61678B(mVFareData.relatedLegIndex);
            }
            if (mVFareData.mo27222i()) {
                jVar.mo61678B(mVFareData.paymentMethod.getValue());
            }
            if (mVFareData.mo27224k()) {
                jVar.mo61678B(mVFareData.usage.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFareData mVFareData = (MVFareData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVFareData.fareId = jVar.mo61696i();
                mVFareData.mo27226m();
            }
            if (T.get(1)) {
                mVFareData.balance = jVar.mo61697j();
                mVFareData.mo27225l();
            }
            if (T.get(2)) {
                mVFareData.payForThisLeg = jVar.mo61690c();
                mVFareData.mo27227o();
            }
            if (T.get(3)) {
                mVFareData.relatedLegIndex = jVar.mo61696i();
                mVFareData.mo27228p();
            }
            if (T.get(4)) {
                mVFareData.paymentMethod = MVFarePaymentMethod.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                mVFareData.usage = MVFareUsage.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.fare.MVFareData$d */
    public static class C8738d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8737c(0);
        }
    }

    static {
        new C17394d0("MVFareData");
        HashMap hashMap = new HashMap();
        f25636h = hashMap;
        hashMap.put(C25239c.class, new C8736b());
        hashMap.put(C25240d.class, new C8738d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FARE_ID, new FieldMetaData("fareId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.BALANCE, new FieldMetaData("balance", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.PAY_FOR_THIS_LEG, new FieldMetaData("payForThisLeg", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.RELATED_LEG_INDEX, new FieldMetaData("relatedLegIndex", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PAYMENT_METHOD, new FieldMetaData("paymentMethod", (byte) 2, new EnumMetaData(MVFarePaymentMethod.class)));
        enumMap.put(_Fields.USAGE, new FieldMetaData("usage", (byte) 3, new EnumMetaData(MVFareUsage.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25637i = unmodifiableMap;
        FieldMetaData.m61947a(MVFareData.class, unmodifiableMap);
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
        ((C25238b) f25636h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25636h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVFareData mVFareData = (MVFareData) obj;
        if (!getClass().equals(mVFareData.getClass())) {
            return getClass().getName().compareTo(mVFareData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27219g()).compareTo(Boolean.valueOf(mVFareData.mo27219g()));
        if (compareTo2 != 0 || ((mo27219g() && (compareTo2 = C25082a.m62839c(this.fareId, mVFareData.fareId)) != 0) || (compareTo2 = Boolean.valueOf(mo27218f()).compareTo(Boolean.valueOf(mVFareData.mo27218f()))) != 0 || ((mo27218f() && (compareTo2 = C25082a.m62840d(this.balance, mVFareData.balance)) != 0) || (compareTo2 = Boolean.valueOf(mo27220h()).compareTo(Boolean.valueOf(mVFareData.mo27220h()))) != 0 || ((mo27220h() && (compareTo2 = C25082a.m62848l(this.payForThisLeg, mVFareData.payForThisLeg)) != 0) || (compareTo2 = Boolean.valueOf(mo27223j()).compareTo(Boolean.valueOf(mVFareData.mo27223j()))) != 0 || ((mo27223j() && (compareTo2 = C25082a.m62839c(this.relatedLegIndex, mVFareData.relatedLegIndex)) != 0) || (compareTo2 = Boolean.valueOf(mo27222i()).compareTo(Boolean.valueOf(mVFareData.mo27222i()))) != 0 || ((mo27222i() && (compareTo2 = this.paymentMethod.compareTo(mVFareData.paymentMethod)) != 0) || (compareTo2 = Boolean.valueOf(mo27224k()).compareTo(Boolean.valueOf(mVFareData.mo27224k()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo27224k() || (compareTo = this.usage.compareTo(mVFareData.usage)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVFareData)) {
            return false;
        }
        MVFareData mVFareData = (MVFareData) obj;
        if (this.fareId != mVFareData.fareId || this.balance != mVFareData.balance || this.payForThisLeg != mVFareData.payForThisLeg) {
            return false;
        }
        boolean j = mo27223j();
        boolean j2 = mVFareData.mo27223j();
        if ((j || j2) && (!j || !j2 || this.relatedLegIndex != mVFareData.relatedLegIndex)) {
            return false;
        }
        boolean i = mo27222i();
        boolean i2 = mVFareData.mo27222i();
        if ((i || i2) && (!i || !i2 || !this.paymentMethod.equals(mVFareData.paymentMethod))) {
            return false;
        }
        boolean k = mo27224k();
        boolean k2 = mVFareData.mo27224k();
        if ((k || k2) && (!k || !k2 || !this.usage.equals(mVFareData.usage))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27218f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27219g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27220h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27222i() {
        return this.paymentMethod != null;
    }

    /* renamed from: j */
    public final boolean mo27223j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo27224k() {
        return this.usage != null;
    }

    /* renamed from: l */
    public final void mo27225l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo27226m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo27227o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: p */
    public final void mo27228p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVFareData(", "fareId:");
        C0016g.m42z(n, this.fareId, ", ", "balance:");
        C25541a.m63889t(n, this.balance, ", ", "payForThisLeg:");
        n.append(this.payForThisLeg);
        if (mo27223j()) {
            n.append(", ");
            n.append("relatedLegIndex:");
            n.append(this.relatedLegIndex);
        }
        if (mo27222i()) {
            n.append(", ");
            n.append("paymentMethod:");
            MVFarePaymentMethod mVFarePaymentMethod = this.paymentMethod;
            if (mVFarePaymentMethod == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVFarePaymentMethod);
            }
        }
        n.append(", ");
        n.append("usage:");
        MVFareUsage mVFareUsage = this.usage;
        if (mVFareUsage == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVFareUsage);
        }
        n.append(")");
        return n.toString();
    }
}
