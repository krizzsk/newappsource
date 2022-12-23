package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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
import p001a0.C0017h;
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

public class MVPTBBillingFinalizedStatement implements TBase<MVPTBBillingFinalizedStatement, _Fields>, Serializable, Cloneable, Comparable<MVPTBBillingFinalizedStatement> {

    /* renamed from: b */
    public static final C25113c f27842b = new C25113c("transactionId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27843c = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27844d = new C25113c("documentUrl", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27845e = new C25113c("documentType", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27846f = new C25113c("calculationTime", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f27847g = new C25113c("period", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f27848h = new C25113c(ServerParameters.STATUS, (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f27849i = new C25113c("isFinal", (byte) 2, 8);

    /* renamed from: j */
    public static final HashMap f27850j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f27851k;
    private byte __isset_bitfield = 0;
    public long calculationTime;
    public String documentType;
    public String documentUrl;
    public boolean isFinal;
    private _Fields[] optionals = {_Fields.TRANSACTION_ID, _Fields.CALCULATION_TIME};
    public MVPTBBillingStatementPeriod period;
    public MVCurrencyAmount price;
    public MVPTBBillingPaymentStatus status;
    public int transactionId;

    public enum _Fields implements C25085c {
        TRANSACTION_ID(1, "transactionId"),
        PRICE(2, InAppPurchaseMetaData.KEY_PRICE),
        DOCUMENT_URL(3, "documentUrl"),
        DOCUMENT_TYPE(4, "documentType"),
        CALCULATION_TIME(5, "calculationTime"),
        PERIOD(6, "period"),
        STATUS(7, ServerParameters.STATUS),
        IS_FINAL(8, "isFinal");
        
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
                    return TRANSACTION_ID;
                case 2:
                    return PRICE;
                case 3:
                    return DOCUMENT_URL;
                case 4:
                    return DOCUMENT_TYPE;
                case 5:
                    return CALCULATION_TIME;
                case 6:
                    return PERIOD;
                case 7:
                    return STATUS;
                case 8:
                    return IS_FINAL;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingFinalizedStatement$a */
    public static class C10169a extends C25239c<MVPTBBillingFinalizedStatement> {
        public C10169a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingFinalizedStatement mVPTBBillingFinalizedStatement = (MVPTBBillingFinalizedStatement) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPTBBillingFinalizedStatement.price;
            C25113c cVar = MVPTBBillingFinalizedStatement.f27842b;
            gVar.mo61687K();
            if (mVPTBBillingFinalizedStatement.mo30859m()) {
                gVar.mo61711x(MVPTBBillingFinalizedStatement.f27842b);
                gVar.mo61678B(mVPTBBillingFinalizedStatement.transactionId);
                gVar.mo61712y();
            }
            if (mVPTBBillingFinalizedStatement.price != null) {
                gVar.mo61711x(MVPTBBillingFinalizedStatement.f27843c);
                mVPTBBillingFinalizedStatement.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBBillingFinalizedStatement.documentUrl != null) {
                gVar.mo61711x(MVPTBBillingFinalizedStatement.f27844d);
                gVar.mo61686J(mVPTBBillingFinalizedStatement.documentUrl);
                gVar.mo61712y();
            }
            if (mVPTBBillingFinalizedStatement.documentType != null) {
                gVar.mo61711x(MVPTBBillingFinalizedStatement.f27845e);
                gVar.mo61686J(mVPTBBillingFinalizedStatement.documentType);
                gVar.mo61712y();
            }
            if (mVPTBBillingFinalizedStatement.mo30851f()) {
                gVar.mo61711x(MVPTBBillingFinalizedStatement.f27846f);
                gVar.mo61679C(mVPTBBillingFinalizedStatement.calculationTime);
                gVar.mo61712y();
            }
            if (mVPTBBillingFinalizedStatement.period != null) {
                gVar.mo61711x(MVPTBBillingFinalizedStatement.f27847g);
                gVar.mo61678B(mVPTBBillingFinalizedStatement.period.getValue());
                gVar.mo61712y();
            }
            if (mVPTBBillingFinalizedStatement.status != null) {
                gVar.mo61711x(MVPTBBillingFinalizedStatement.f27848h);
                gVar.mo61678B(mVPTBBillingFinalizedStatement.status.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPTBBillingFinalizedStatement.f27849i);
            C0017h.m62S(gVar, mVPTBBillingFinalizedStatement.isFinal);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingFinalizedStatement mVPTBBillingFinalizedStatement = (MVPTBBillingFinalizedStatement) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPTBBillingFinalizedStatement.price;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBBillingFinalizedStatement.transactionId = gVar.mo61696i();
                            mVPTBBillingFinalizedStatement.mo30862q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVPTBBillingFinalizedStatement.price = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBBillingFinalizedStatement.documentUrl = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBBillingFinalizedStatement.documentType = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBBillingFinalizedStatement.calculationTime = gVar.mo61697j();
                            mVPTBBillingFinalizedStatement.mo30860o();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBBillingFinalizedStatement.period = MVPTBBillingStatementPeriod.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBBillingFinalizedStatement.status = MVPTBBillingPaymentStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBBillingFinalizedStatement.isFinal = gVar.mo61690c();
                            mVPTBBillingFinalizedStatement.mo30861p();
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingFinalizedStatement$b */
    public static class C10170b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10169a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingFinalizedStatement$c */
    public static class C10171c extends C25240d<MVPTBBillingFinalizedStatement> {
        public C10171c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingFinalizedStatement mVPTBBillingFinalizedStatement = (MVPTBBillingFinalizedStatement) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBBillingFinalizedStatement.mo30859m()) {
                bitSet.set(0);
            }
            if (mVPTBBillingFinalizedStatement.mo30857k()) {
                bitSet.set(1);
            }
            if (mVPTBBillingFinalizedStatement.mo30853h()) {
                bitSet.set(2);
            }
            if (mVPTBBillingFinalizedStatement.mo30852g()) {
                bitSet.set(3);
            }
            if (mVPTBBillingFinalizedStatement.mo30851f()) {
                bitSet.set(4);
            }
            if (mVPTBBillingFinalizedStatement.mo30856j()) {
                bitSet.set(5);
            }
            if (mVPTBBillingFinalizedStatement.mo30858l()) {
                bitSet.set(6);
            }
            if (mVPTBBillingFinalizedStatement.mo30855i()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVPTBBillingFinalizedStatement.mo30859m()) {
                jVar.mo61678B(mVPTBBillingFinalizedStatement.transactionId);
            }
            if (mVPTBBillingFinalizedStatement.mo30857k()) {
                mVPTBBillingFinalizedStatement.price.mo25202X0(jVar);
            }
            if (mVPTBBillingFinalizedStatement.mo30853h()) {
                jVar.mo61686J(mVPTBBillingFinalizedStatement.documentUrl);
            }
            if (mVPTBBillingFinalizedStatement.mo30852g()) {
                jVar.mo61686J(mVPTBBillingFinalizedStatement.documentType);
            }
            if (mVPTBBillingFinalizedStatement.mo30851f()) {
                jVar.mo61679C(mVPTBBillingFinalizedStatement.calculationTime);
            }
            if (mVPTBBillingFinalizedStatement.mo30856j()) {
                jVar.mo61678B(mVPTBBillingFinalizedStatement.period.getValue());
            }
            if (mVPTBBillingFinalizedStatement.mo30858l()) {
                jVar.mo61678B(mVPTBBillingFinalizedStatement.status.getValue());
            }
            if (mVPTBBillingFinalizedStatement.mo30855i()) {
                jVar.mo61708u(mVPTBBillingFinalizedStatement.isFinal);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBBillingFinalizedStatement mVPTBBillingFinalizedStatement = (MVPTBBillingFinalizedStatement) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVPTBBillingFinalizedStatement.transactionId = jVar.mo61696i();
                mVPTBBillingFinalizedStatement.mo30862q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPTBBillingFinalizedStatement.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPTBBillingFinalizedStatement.documentUrl = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPTBBillingFinalizedStatement.documentType = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVPTBBillingFinalizedStatement.calculationTime = jVar.mo61697j();
                mVPTBBillingFinalizedStatement.mo30860o();
            }
            if (T.get(5)) {
                mVPTBBillingFinalizedStatement.period = MVPTBBillingStatementPeriod.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                mVPTBBillingFinalizedStatement.status = MVPTBBillingPaymentStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                mVPTBBillingFinalizedStatement.isFinal = jVar.mo61690c();
                mVPTBBillingFinalizedStatement.mo30861p();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingFinalizedStatement$d */
    public static class C10172d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10171c(0);
        }
    }

    static {
        new C17394d0("MVPTBBillingFinalizedStatement");
        HashMap hashMap = new HashMap();
        f27850j = hashMap;
        hashMap.put(C25239c.class, new C10170b());
        hashMap.put(C25240d.class, new C10172d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRANSACTION_ID, new FieldMetaData("transactionId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.DOCUMENT_URL, new FieldMetaData("documentUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DOCUMENT_TYPE, new FieldMetaData("documentType", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CALCULATION_TIME, new FieldMetaData("calculationTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.PERIOD, new FieldMetaData("period", (byte) 3, new EnumMetaData(MVPTBBillingStatementPeriod.class)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVPTBBillingPaymentStatus.class)));
        enumMap.put(_Fields.IS_FINAL, new FieldMetaData("isFinal", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27851k = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBBillingFinalizedStatement.class, unmodifiableMap);
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
        ((C25238b) f27850j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27850j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVPTBBillingFinalizedStatement mVPTBBillingFinalizedStatement = (MVPTBBillingFinalizedStatement) obj;
        if (!getClass().equals(mVPTBBillingFinalizedStatement.getClass())) {
            return getClass().getName().compareTo(mVPTBBillingFinalizedStatement.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30859m()).compareTo(Boolean.valueOf(mVPTBBillingFinalizedStatement.mo30859m()));
        if (compareTo != 0 || ((mo30859m() && (compareTo = C25082a.m62839c(this.transactionId, mVPTBBillingFinalizedStatement.transactionId)) != 0) || (compareTo = Boolean.valueOf(mo30857k()).compareTo(Boolean.valueOf(mVPTBBillingFinalizedStatement.mo30857k()))) != 0 || ((mo30857k() && (compareTo = this.price.compareTo(mVPTBBillingFinalizedStatement.price)) != 0) || (compareTo = Boolean.valueOf(mo30853h()).compareTo(Boolean.valueOf(mVPTBBillingFinalizedStatement.mo30853h()))) != 0 || ((mo30853h() && (compareTo = this.documentUrl.compareTo(mVPTBBillingFinalizedStatement.documentUrl)) != 0) || (compareTo = Boolean.valueOf(mo30852g()).compareTo(Boolean.valueOf(mVPTBBillingFinalizedStatement.mo30852g()))) != 0 || ((mo30852g() && (compareTo = this.documentType.compareTo(mVPTBBillingFinalizedStatement.documentType)) != 0) || (compareTo = Boolean.valueOf(mo30851f()).compareTo(Boolean.valueOf(mVPTBBillingFinalizedStatement.mo30851f()))) != 0 || ((mo30851f() && (compareTo = C25082a.m62840d(this.calculationTime, mVPTBBillingFinalizedStatement.calculationTime)) != 0) || (compareTo = Boolean.valueOf(mo30856j()).compareTo(Boolean.valueOf(mVPTBBillingFinalizedStatement.mo30856j()))) != 0 || ((mo30856j() && (compareTo = this.period.compareTo(mVPTBBillingFinalizedStatement.period)) != 0) || (compareTo = Boolean.valueOf(mo30858l()).compareTo(Boolean.valueOf(mVPTBBillingFinalizedStatement.mo30858l()))) != 0 || ((mo30858l() && (compareTo = this.status.compareTo(mVPTBBillingFinalizedStatement.status)) != 0) || (compareTo = Boolean.valueOf(mo30855i()).compareTo(Boolean.valueOf(mVPTBBillingFinalizedStatement.mo30855i()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo30855i() || (l = C25082a.m62848l(this.isFinal, mVPTBBillingFinalizedStatement.isFinal)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBBillingFinalizedStatement)) {
            return false;
        }
        MVPTBBillingFinalizedStatement mVPTBBillingFinalizedStatement = (MVPTBBillingFinalizedStatement) obj;
        boolean m = mo30859m();
        boolean m2 = mVPTBBillingFinalizedStatement.mo30859m();
        if ((m || m2) && (!m || !m2 || this.transactionId != mVPTBBillingFinalizedStatement.transactionId)) {
            return false;
        }
        boolean k = mo30857k();
        boolean k2 = mVPTBBillingFinalizedStatement.mo30857k();
        if ((k || k2) && (!k || !k2 || !this.price.mo26102a(mVPTBBillingFinalizedStatement.price))) {
            return false;
        }
        boolean h = mo30853h();
        boolean h2 = mVPTBBillingFinalizedStatement.mo30853h();
        if ((h || h2) && (!h || !h2 || !this.documentUrl.equals(mVPTBBillingFinalizedStatement.documentUrl))) {
            return false;
        }
        boolean g = mo30852g();
        boolean g2 = mVPTBBillingFinalizedStatement.mo30852g();
        if ((g || g2) && (!g || !g2 || !this.documentType.equals(mVPTBBillingFinalizedStatement.documentType))) {
            return false;
        }
        boolean f = mo30851f();
        boolean f2 = mVPTBBillingFinalizedStatement.mo30851f();
        if ((f || f2) && (!f || !f2 || this.calculationTime != mVPTBBillingFinalizedStatement.calculationTime)) {
            return false;
        }
        boolean j = mo30856j();
        boolean j2 = mVPTBBillingFinalizedStatement.mo30856j();
        if ((j || j2) && (!j || !j2 || !this.period.equals(mVPTBBillingFinalizedStatement.period))) {
            return false;
        }
        boolean l = mo30858l();
        boolean l2 = mVPTBBillingFinalizedStatement.mo30858l();
        if (((l || l2) && (!l || !l2 || !this.status.equals(mVPTBBillingFinalizedStatement.status))) || this.isFinal != mVPTBBillingFinalizedStatement.isFinal) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30851f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo30852g() {
        return this.documentType != null;
    }

    /* renamed from: h */
    public final boolean mo30853h() {
        return this.documentUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30855i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo30856j() {
        return this.period != null;
    }

    /* renamed from: k */
    public final boolean mo30857k() {
        return this.price != null;
    }

    /* renamed from: l */
    public final boolean mo30858l() {
        return this.status != null;
    }

    /* renamed from: m */
    public final boolean mo30859m() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: o */
    public final void mo30860o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo30861p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: q */
    public final void mo30862q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPTBBillingFinalizedStatement(");
        if (mo30859m()) {
            sb.append("transactionId:");
            sb.append(this.transactionId);
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVCurrencyAmount);
        }
        sb.append(", ");
        sb.append("documentUrl:");
        String str = this.documentUrl;
        if (str == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("documentType:");
        String str2 = this.documentType;
        if (str2 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str2);
        }
        if (mo30851f()) {
            sb.append(", ");
            sb.append("calculationTime:");
            sb.append(this.calculationTime);
        }
        sb.append(", ");
        sb.append("period:");
        MVPTBBillingStatementPeriod mVPTBBillingStatementPeriod = this.period;
        if (mVPTBBillingStatementPeriod == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVPTBBillingStatementPeriod);
        }
        sb.append(", ");
        sb.append("status:");
        MVPTBBillingPaymentStatus mVPTBBillingPaymentStatus = this.status;
        if (mVPTBBillingPaymentStatus == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVPTBBillingPaymentStatus);
        }
        sb.append(", ");
        sb.append("isFinal:");
        return C25541a.m63885p(sb, this.isFinal, ")");
    }
}
