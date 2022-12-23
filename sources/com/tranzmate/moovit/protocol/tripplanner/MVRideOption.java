package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.taxi.MVTaxiPrice;
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

public class MVRideOption implements TBase<MVRideOption, _Fields>, Serializable, Cloneable, Comparable<MVRideOption> {

    /* renamed from: b */
    public static final C25113c f30035b = new C25113c("productName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30036c = new C25113c("taxiPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30037d = new C25113c(InAppPurchaseMetaData.KEY_PRODUCT_ID, (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30038e = new C25113c("etaInSeconds", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30039f = new C25113c("etaInSecondsMax", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f30040g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30041h;
    private byte __isset_bitfield = 0;
    public int etaInSeconds;
    public int etaInSecondsMax;
    private _Fields[] optionals = {_Fields.TAXI_PRICE, _Fields.PRODUCT_ID, _Fields.ETA_IN_SECONDS, _Fields.ETA_IN_SECONDS_MAX};
    public String productId;
    public String productName;
    public MVTaxiPrice taxiPrice;

    public enum _Fields implements C25085c {
        PRODUCT_NAME(1, "productName"),
        TAXI_PRICE(2, "taxiPrice"),
        PRODUCT_ID(3, InAppPurchaseMetaData.KEY_PRODUCT_ID),
        ETA_IN_SECONDS(4, "etaInSeconds"),
        ETA_IN_SECONDS_MAX(5, "etaInSecondsMax");
        
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
                return PRODUCT_NAME;
            }
            if (i == 2) {
                return TAXI_PRICE;
            }
            if (i == 3) {
                return PRODUCT_ID;
            }
            if (i == 4) {
                return ETA_IN_SECONDS;
            }
            if (i != 5) {
                return null;
            }
            return ETA_IN_SECONDS_MAX;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVRideOption$a */
    public static class C11614a extends C25239c<MVRideOption> {
        public C11614a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideOption mVRideOption = (MVRideOption) tBase;
            mVRideOption.getClass();
            C25113c cVar = MVRideOption.f30035b;
            gVar.mo61687K();
            if (mVRideOption.productName != null) {
                gVar.mo61711x(MVRideOption.f30035b);
                gVar.mo61686J(mVRideOption.productName);
                gVar.mo61712y();
            }
            if (mVRideOption.taxiPrice != null && mVRideOption.mo34518j()) {
                gVar.mo61711x(MVRideOption.f30036c);
                mVRideOption.taxiPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRideOption.productId != null && mVRideOption.mo34515h()) {
                gVar.mo61711x(MVRideOption.f30037d);
                gVar.mo61686J(mVRideOption.productId);
                gVar.mo61712y();
            }
            if (mVRideOption.mo34513f()) {
                gVar.mo61711x(MVRideOption.f30038e);
                gVar.mo61678B(mVRideOption.etaInSeconds);
                gVar.mo61712y();
            }
            if (mVRideOption.mo34514g()) {
                gVar.mo61711x(MVRideOption.f30039f);
                gVar.mo61678B(mVRideOption.etaInSecondsMax);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideOption mVRideOption = (MVRideOption) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRideOption.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVRideOption.etaInSecondsMax = gVar.mo61696i();
                                    mVRideOption.mo34520l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVRideOption.etaInSeconds = gVar.mo61696i();
                                mVRideOption.mo34519k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVRideOption.productId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTaxiPrice mVTaxiPrice = new MVTaxiPrice();
                        mVRideOption.taxiPrice = mVTaxiPrice;
                        mVTaxiPrice.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVRideOption.productName = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVRideOption$b */
    public static class C11615b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11614a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVRideOption$c */
    public static class C11616c extends C25240d<MVRideOption> {
        public C11616c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideOption mVRideOption = (MVRideOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRideOption.mo34517i()) {
                bitSet.set(0);
            }
            if (mVRideOption.mo34518j()) {
                bitSet.set(1);
            }
            if (mVRideOption.mo34515h()) {
                bitSet.set(2);
            }
            if (mVRideOption.mo34513f()) {
                bitSet.set(3);
            }
            if (mVRideOption.mo34514g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVRideOption.mo34517i()) {
                jVar.mo61686J(mVRideOption.productName);
            }
            if (mVRideOption.mo34518j()) {
                mVRideOption.taxiPrice.mo25202X0(jVar);
            }
            if (mVRideOption.mo34515h()) {
                jVar.mo61686J(mVRideOption.productId);
            }
            if (mVRideOption.mo34513f()) {
                jVar.mo61678B(mVRideOption.etaInSeconds);
            }
            if (mVRideOption.mo34514g()) {
                jVar.mo61678B(mVRideOption.etaInSecondsMax);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideOption mVRideOption = (MVRideOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVRideOption.productName = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVTaxiPrice mVTaxiPrice = new MVTaxiPrice();
                mVRideOption.taxiPrice = mVTaxiPrice;
                mVTaxiPrice.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVRideOption.productId = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVRideOption.etaInSeconds = jVar.mo61696i();
                mVRideOption.mo34519k();
            }
            if (T.get(4)) {
                mVRideOption.etaInSecondsMax = jVar.mo61696i();
                mVRideOption.mo34520l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVRideOption$d */
    public static class C11617d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11616c(0);
        }
    }

    static {
        new C17394d0("MVRideOption");
        HashMap hashMap = new HashMap();
        f30040g = hashMap;
        hashMap.put(C25239c.class, new C11615b());
        hashMap.put(C25240d.class, new C11617d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRODUCT_NAME, new FieldMetaData("productName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TAXI_PRICE, new FieldMetaData("taxiPrice", (byte) 2, new StructMetaData(MVTaxiPrice.class)));
        enumMap.put(_Fields.PRODUCT_ID, new FieldMetaData(InAppPurchaseMetaData.KEY_PRODUCT_ID, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ETA_IN_SECONDS, new FieldMetaData("etaInSeconds", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ETA_IN_SECONDS_MAX, new FieldMetaData("etaInSecondsMax", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30041h = unmodifiableMap;
        FieldMetaData.m61947a(MVRideOption.class, unmodifiableMap);
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
        ((C25238b) f30040g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30040g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVRideOption mVRideOption = (MVRideOption) obj;
        if (!getClass().equals(mVRideOption.getClass())) {
            return getClass().getName().compareTo(mVRideOption.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34517i()).compareTo(Boolean.valueOf(mVRideOption.mo34517i()));
        if (compareTo != 0 || ((mo34517i() && (compareTo = this.productName.compareTo(mVRideOption.productName)) != 0) || (compareTo = Boolean.valueOf(mo34518j()).compareTo(Boolean.valueOf(mVRideOption.mo34518j()))) != 0 || ((mo34518j() && (compareTo = this.taxiPrice.compareTo(mVRideOption.taxiPrice)) != 0) || (compareTo = Boolean.valueOf(mo34515h()).compareTo(Boolean.valueOf(mVRideOption.mo34515h()))) != 0 || ((mo34515h() && (compareTo = this.productId.compareTo(mVRideOption.productId)) != 0) || (compareTo = Boolean.valueOf(mo34513f()).compareTo(Boolean.valueOf(mVRideOption.mo34513f()))) != 0 || ((mo34513f() && (compareTo = C25082a.m62839c(this.etaInSeconds, mVRideOption.etaInSeconds)) != 0) || (compareTo = Boolean.valueOf(mo34514g()).compareTo(Boolean.valueOf(mVRideOption.mo34514g()))) != 0))))) {
            return compareTo;
        }
        if (!mo34514g() || (c = C25082a.m62839c(this.etaInSecondsMax, mVRideOption.etaInSecondsMax)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRideOption)) {
            return false;
        }
        MVRideOption mVRideOption = (MVRideOption) obj;
        boolean i = mo34517i();
        boolean i2 = mVRideOption.mo34517i();
        if ((i || i2) && (!i || !i2 || !this.productName.equals(mVRideOption.productName))) {
            return false;
        }
        boolean j = mo34518j();
        boolean j2 = mVRideOption.mo34518j();
        if ((j || j2) && (!j || !j2 || !this.taxiPrice.mo32244a(mVRideOption.taxiPrice))) {
            return false;
        }
        boolean h = mo34515h();
        boolean h2 = mVRideOption.mo34515h();
        if ((h || h2) && (!h || !h2 || !this.productId.equals(mVRideOption.productId))) {
            return false;
        }
        boolean f = mo34513f();
        boolean f2 = mVRideOption.mo34513f();
        if ((f || f2) && (!f || !f2 || this.etaInSeconds != mVRideOption.etaInSeconds)) {
            return false;
        }
        boolean g = mo34514g();
        boolean g2 = mVRideOption.mo34514g();
        if ((g || g2) && (!g || !g2 || this.etaInSecondsMax != mVRideOption.etaInSecondsMax)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34513f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34514g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo34515h() {
        return this.productId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34517i() {
        return this.productName != null;
    }

    /* renamed from: j */
    public final boolean mo34518j() {
        return this.taxiPrice != null;
    }

    /* renamed from: k */
    public final void mo34519k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo34520l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRideOption(", "productName:");
        String str = this.productName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo34518j()) {
            n.append(", ");
            n.append("taxiPrice:");
            MVTaxiPrice mVTaxiPrice = this.taxiPrice;
            if (mVTaxiPrice == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiPrice);
            }
        }
        if (mo34515h()) {
            n.append(", ");
            n.append("productId:");
            String str2 = this.productId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo34513f()) {
            n.append(", ");
            n.append("etaInSeconds:");
            n.append(this.etaInSeconds);
        }
        if (mo34514g()) {
            n.append(", ");
            n.append("etaInSecondsMax:");
            n.append(this.etaInSecondsMax);
        }
        n.append(")");
        return n.toString();
    }
}
