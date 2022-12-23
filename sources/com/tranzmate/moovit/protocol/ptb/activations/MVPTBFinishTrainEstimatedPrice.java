package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVPTBFinishTrainEstimatedPrice implements TBase<MVPTBFinishTrainEstimatedPrice, _Fields>, Serializable, Cloneable, Comparable<MVPTBFinishTrainEstimatedPrice> {

    /* renamed from: b */
    public static final C25113c f27895b = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27896c = new C25113c("fullPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27897d = new C25113c("stopId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f27898e = new C25113c("trainStationName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27899f = new C25113c("agencyImage", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f27900g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27901h;
    private byte __isset_bitfield = 0;
    public MVImageReferenceWithParams agencyImage;
    public MVCurrencyAmount fullPrice;
    private _Fields[] optionals = {_Fields.FULL_PRICE};
    public MVCurrencyAmount price;
    public int stopId;
    public String trainStationName;

    public enum _Fields implements C25085c {
        PRICE(1, InAppPurchaseMetaData.KEY_PRICE),
        FULL_PRICE(2, "fullPrice"),
        STOP_ID(3, "stopId"),
        TRAIN_STATION_NAME(4, "trainStationName"),
        AGENCY_IMAGE(5, "agencyImage");
        
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
                return PRICE;
            }
            if (i == 2) {
                return FULL_PRICE;
            }
            if (i == 3) {
                return STOP_ID;
            }
            if (i == 4) {
                return TRAIN_STATION_NAME;
            }
            if (i != 5) {
                return null;
            }
            return AGENCY_IMAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPrice$a */
    public static class C10209a extends C25239c<MVPTBFinishTrainEstimatedPrice> {
        public C10209a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainEstimatedPrice mVPTBFinishTrainEstimatedPrice = (MVPTBFinishTrainEstimatedPrice) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPTBFinishTrainEstimatedPrice.price;
            C25113c cVar = MVPTBFinishTrainEstimatedPrice.f27895b;
            gVar.mo61687K();
            if (mVPTBFinishTrainEstimatedPrice.price != null) {
                gVar.mo61711x(MVPTBFinishTrainEstimatedPrice.f27895b);
                mVPTBFinishTrainEstimatedPrice.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBFinishTrainEstimatedPrice.fullPrice != null && mVPTBFinishTrainEstimatedPrice.mo30955g()) {
                gVar.mo61711x(MVPTBFinishTrainEstimatedPrice.f27896c);
                mVPTBFinishTrainEstimatedPrice.fullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPTBFinishTrainEstimatedPrice.f27897d);
            gVar.mo61678B(mVPTBFinishTrainEstimatedPrice.stopId);
            gVar.mo61712y();
            if (mVPTBFinishTrainEstimatedPrice.trainStationName != null) {
                gVar.mo61711x(MVPTBFinishTrainEstimatedPrice.f27898e);
                gVar.mo61686J(mVPTBFinishTrainEstimatedPrice.trainStationName);
                gVar.mo61712y();
            }
            if (mVPTBFinishTrainEstimatedPrice.agencyImage != null) {
                gVar.mo61711x(MVPTBFinishTrainEstimatedPrice.f27899f);
                mVPTBFinishTrainEstimatedPrice.agencyImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainEstimatedPrice mVPTBFinishTrainEstimatedPrice = (MVPTBFinishTrainEstimatedPrice) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPTBFinishTrainEstimatedPrice.price;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                                    mVPTBFinishTrainEstimatedPrice.agencyImage = mVImageReferenceWithParams;
                                    mVImageReferenceWithParams.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVPTBFinishTrainEstimatedPrice.trainStationName = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVPTBFinishTrainEstimatedPrice.stopId = gVar.mo61696i();
                            mVPTBFinishTrainEstimatedPrice.mo30960k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVPTBFinishTrainEstimatedPrice.fullPrice = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount3 = new MVCurrencyAmount();
                    mVPTBFinishTrainEstimatedPrice.price = mVCurrencyAmount3;
                    mVCurrencyAmount3.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPrice$b */
    public static class C10210b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10209a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPrice$c */
    public static class C10211c extends C25240d<MVPTBFinishTrainEstimatedPrice> {
        public C10211c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainEstimatedPrice mVPTBFinishTrainEstimatedPrice = (MVPTBFinishTrainEstimatedPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBFinishTrainEstimatedPrice.mo30956h()) {
                bitSet.set(0);
            }
            if (mVPTBFinishTrainEstimatedPrice.mo30955g()) {
                bitSet.set(1);
            }
            if (mVPTBFinishTrainEstimatedPrice.mo30958i()) {
                bitSet.set(2);
            }
            if (mVPTBFinishTrainEstimatedPrice.mo30959j()) {
                bitSet.set(3);
            }
            if (mVPTBFinishTrainEstimatedPrice.mo30954f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPTBFinishTrainEstimatedPrice.mo30956h()) {
                mVPTBFinishTrainEstimatedPrice.price.mo25202X0(jVar);
            }
            if (mVPTBFinishTrainEstimatedPrice.mo30955g()) {
                mVPTBFinishTrainEstimatedPrice.fullPrice.mo25202X0(jVar);
            }
            if (mVPTBFinishTrainEstimatedPrice.mo30958i()) {
                jVar.mo61678B(mVPTBFinishTrainEstimatedPrice.stopId);
            }
            if (mVPTBFinishTrainEstimatedPrice.mo30959j()) {
                jVar.mo61686J(mVPTBFinishTrainEstimatedPrice.trainStationName);
            }
            if (mVPTBFinishTrainEstimatedPrice.mo30954f()) {
                mVPTBFinishTrainEstimatedPrice.agencyImage.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFinishTrainEstimatedPrice mVPTBFinishTrainEstimatedPrice = (MVPTBFinishTrainEstimatedPrice) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPTBFinishTrainEstimatedPrice.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVPTBFinishTrainEstimatedPrice.fullPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPTBFinishTrainEstimatedPrice.stopId = jVar.mo61696i();
                mVPTBFinishTrainEstimatedPrice.mo30960k();
            }
            if (T.get(3)) {
                mVPTBFinishTrainEstimatedPrice.trainStationName = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVPTBFinishTrainEstimatedPrice.agencyImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainEstimatedPrice$d */
    public static class C10212d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10211c(0);
        }
    }

    static {
        new C17394d0("MVPTBFinishTrainEstimatedPrice");
        HashMap hashMap = new HashMap();
        f27900g = hashMap;
        hashMap.put(C25239c.class, new C10210b());
        hashMap.put(C25240d.class, new C10212d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.FULL_PRICE, new FieldMetaData("fullPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRAIN_STATION_NAME, new FieldMetaData("trainStationName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_IMAGE, new FieldMetaData("agencyImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27901h = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBFinishTrainEstimatedPrice.class, unmodifiableMap);
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
        ((C25238b) f27900g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27900g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBFinishTrainEstimatedPrice mVPTBFinishTrainEstimatedPrice = (MVPTBFinishTrainEstimatedPrice) obj;
        if (!getClass().equals(mVPTBFinishTrainEstimatedPrice.getClass())) {
            return getClass().getName().compareTo(mVPTBFinishTrainEstimatedPrice.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30956h()).compareTo(Boolean.valueOf(mVPTBFinishTrainEstimatedPrice.mo30956h()));
        if (compareTo2 != 0 || ((mo30956h() && (compareTo2 = this.price.compareTo(mVPTBFinishTrainEstimatedPrice.price)) != 0) || (compareTo2 = Boolean.valueOf(mo30955g()).compareTo(Boolean.valueOf(mVPTBFinishTrainEstimatedPrice.mo30955g()))) != 0 || ((mo30955g() && (compareTo2 = this.fullPrice.compareTo(mVPTBFinishTrainEstimatedPrice.fullPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo30958i()).compareTo(Boolean.valueOf(mVPTBFinishTrainEstimatedPrice.mo30958i()))) != 0 || ((mo30958i() && (compareTo2 = C25082a.m62839c(this.stopId, mVPTBFinishTrainEstimatedPrice.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo30959j()).compareTo(Boolean.valueOf(mVPTBFinishTrainEstimatedPrice.mo30959j()))) != 0 || ((mo30959j() && (compareTo2 = this.trainStationName.compareTo(mVPTBFinishTrainEstimatedPrice.trainStationName)) != 0) || (compareTo2 = Boolean.valueOf(mo30954f()).compareTo(Boolean.valueOf(mVPTBFinishTrainEstimatedPrice.mo30954f()))) != 0))))) {
            return compareTo2;
        }
        if (!mo30954f() || (compareTo = this.agencyImage.compareTo(mVPTBFinishTrainEstimatedPrice.agencyImage)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBFinishTrainEstimatedPrice)) {
            return false;
        }
        MVPTBFinishTrainEstimatedPrice mVPTBFinishTrainEstimatedPrice = (MVPTBFinishTrainEstimatedPrice) obj;
        boolean h = mo30956h();
        boolean h2 = mVPTBFinishTrainEstimatedPrice.mo30956h();
        if ((h || h2) && (!h || !h2 || !this.price.mo26102a(mVPTBFinishTrainEstimatedPrice.price))) {
            return false;
        }
        boolean g = mo30955g();
        boolean g2 = mVPTBFinishTrainEstimatedPrice.mo30955g();
        if (((g || g2) && (!g || !g2 || !this.fullPrice.mo26102a(mVPTBFinishTrainEstimatedPrice.fullPrice))) || this.stopId != mVPTBFinishTrainEstimatedPrice.stopId) {
            return false;
        }
        boolean j = mo30959j();
        boolean j2 = mVPTBFinishTrainEstimatedPrice.mo30959j();
        if ((j || j2) && (!j || !j2 || !this.trainStationName.equals(mVPTBFinishTrainEstimatedPrice.trainStationName))) {
            return false;
        }
        boolean f = mo30954f();
        boolean f2 = mVPTBFinishTrainEstimatedPrice.mo30954f();
        if ((f || f2) && (!f || !f2 || !this.agencyImage.mo26245a(mVPTBFinishTrainEstimatedPrice.agencyImage))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30954f() {
        return this.agencyImage != null;
    }

    /* renamed from: g */
    public final boolean mo30955g() {
        return this.fullPrice != null;
    }

    /* renamed from: h */
    public final boolean mo30956h() {
        return this.price != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30958i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo30959j() {
        return this.trainStationName != null;
    }

    /* renamed from: k */
    public final void mo30960k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBFinishTrainEstimatedPrice(", "price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo30955g()) {
            n.append(", ");
            n.append("fullPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.fullPrice;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        n.append(", ");
        n.append("stopId:");
        C0016g.m42z(n, this.stopId, ", ", "trainStationName:");
        String str = this.trainStationName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("agencyImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.agencyImage;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(")");
        return n.toString();
    }
}
