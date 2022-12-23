package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVPurchaseItineraryLegSelectionLegFare implements TBase<MVPurchaseItineraryLegSelectionLegFare, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseItineraryLegSelectionLegFare> {

    /* renamed from: b */
    public static final C25113c f28878b = new C25113c("legId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28879c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28880d = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28881e = new C25113c(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28882f = new C25113c("destination", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f28883g = new C25113c("fareId", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f28884h = new C25113c("fullPrice", (byte) 12, 7);

    /* renamed from: i */
    public static final HashMap f28885i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f28886j;
    public String destination;
    public String fareId;
    public MVCurrencyAmount fullPrice;
    public String legId;
    public String name;
    private _Fields[] optionals = {_Fields.PRICE, _Fields.ORIGIN, _Fields.DESTINATION, _Fields.FARE_ID, _Fields.FULL_PRICE};
    public String origin;
    public MVCurrencyAmount price;

    public enum _Fields implements C25085c {
        LEG_ID(1, "legId"),
        NAME(2, "name"),
        PRICE(3, InAppPurchaseMetaData.KEY_PRICE),
        ORIGIN(4, AppMeasurementSdk.ConditionalUserProperty.ORIGIN),
        DESTINATION(5, "destination"),
        FARE_ID(6, "fareId"),
        FULL_PRICE(7, "fullPrice");
        
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
                    return LEG_ID;
                case 2:
                    return NAME;
                case 3:
                    return PRICE;
                case 4:
                    return ORIGIN;
                case 5:
                    return DESTINATION;
                case 6:
                    return FARE_ID;
                case 7:
                    return FULL_PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionLegFare$a */
    public static class C10908a extends C25239c<MVPurchaseItineraryLegSelectionLegFare> {
        public C10908a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLegSelectionLegFare mVPurchaseItineraryLegSelectionLegFare = (MVPurchaseItineraryLegSelectionLegFare) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPurchaseItineraryLegSelectionLegFare.price;
            C25113c cVar = MVPurchaseItineraryLegSelectionLegFare.f28878b;
            gVar.mo61687K();
            if (mVPurchaseItineraryLegSelectionLegFare.legId != null) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionLegFare.f28878b);
                gVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.legId);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryLegSelectionLegFare.name != null) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionLegFare.f28879c);
                gVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.name);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryLegSelectionLegFare.price != null && mVPurchaseItineraryLegSelectionLegFare.mo32640l()) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionLegFare.f28880d);
                mVPurchaseItineraryLegSelectionLegFare.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryLegSelectionLegFare.origin != null && mVPurchaseItineraryLegSelectionLegFare.mo32639k()) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionLegFare.f28881e);
                gVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.origin);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryLegSelectionLegFare.destination != null && mVPurchaseItineraryLegSelectionLegFare.mo32633f()) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionLegFare.f28882f);
                gVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.destination);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryLegSelectionLegFare.fareId != null && mVPurchaseItineraryLegSelectionLegFare.mo32634g()) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionLegFare.f28883g);
                gVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.fareId);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryLegSelectionLegFare.fullPrice != null && mVPurchaseItineraryLegSelectionLegFare.mo32635h()) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionLegFare.f28884h);
                mVPurchaseItineraryLegSelectionLegFare.fullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLegSelectionLegFare mVPurchaseItineraryLegSelectionLegFare = (MVPurchaseItineraryLegSelectionLegFare) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPurchaseItineraryLegSelectionLegFare.price;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseItineraryLegSelectionLegFare.legId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseItineraryLegSelectionLegFare.name = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVPurchaseItineraryLegSelectionLegFare.price = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseItineraryLegSelectionLegFare.origin = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseItineraryLegSelectionLegFare.destination = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseItineraryLegSelectionLegFare.fareId = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount3 = new MVCurrencyAmount();
                            mVPurchaseItineraryLegSelectionLegFare.fullPrice = mVCurrencyAmount3;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionLegFare$b */
    public static class C10909b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10908a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionLegFare$c */
    public static class C10910c extends C25240d<MVPurchaseItineraryLegSelectionLegFare> {
        public C10910c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLegSelectionLegFare mVPurchaseItineraryLegSelectionLegFare = (MVPurchaseItineraryLegSelectionLegFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseItineraryLegSelectionLegFare.mo32637i()) {
                bitSet.set(0);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32638j()) {
                bitSet.set(1);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32640l()) {
                bitSet.set(2);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32639k()) {
                bitSet.set(3);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32633f()) {
                bitSet.set(4);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32634g()) {
                bitSet.set(5);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32635h()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVPurchaseItineraryLegSelectionLegFare.mo32637i()) {
                jVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.legId);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32638j()) {
                jVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.name);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32640l()) {
                mVPurchaseItineraryLegSelectionLegFare.price.mo25202X0(jVar);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32639k()) {
                jVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.origin);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32633f()) {
                jVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.destination);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32634g()) {
                jVar.mo61686J(mVPurchaseItineraryLegSelectionLegFare.fareId);
            }
            if (mVPurchaseItineraryLegSelectionLegFare.mo32635h()) {
                mVPurchaseItineraryLegSelectionLegFare.fullPrice.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLegSelectionLegFare mVPurchaseItineraryLegSelectionLegFare = (MVPurchaseItineraryLegSelectionLegFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVPurchaseItineraryLegSelectionLegFare.legId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPurchaseItineraryLegSelectionLegFare.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseItineraryLegSelectionLegFare.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVPurchaseItineraryLegSelectionLegFare.origin = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVPurchaseItineraryLegSelectionLegFare.destination = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVPurchaseItineraryLegSelectionLegFare.fareId = jVar.mo61704q();
            }
            if (T.get(6)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVPurchaseItineraryLegSelectionLegFare.fullPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionLegFare$d */
    public static class C10911d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10910c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseItineraryLegSelectionLegFare");
        HashMap hashMap = new HashMap();
        f28885i = hashMap;
        hashMap.put(C25239c.class, new C10909b());
        hashMap.put(C25240d.class, new C10911d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LEG_ID, new FieldMetaData("legId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.ORIGIN, new FieldMetaData(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DESTINATION, new FieldMetaData("destination", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FARE_ID, new FieldMetaData("fareId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FULL_PRICE, new FieldMetaData("fullPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28886j = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseItineraryLegSelectionLegFare.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f28885i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28885i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseItineraryLegSelectionLegFare mVPurchaseItineraryLegSelectionLegFare = (MVPurchaseItineraryLegSelectionLegFare) obj;
        if (!getClass().equals(mVPurchaseItineraryLegSelectionLegFare.getClass())) {
            return getClass().getName().compareTo(mVPurchaseItineraryLegSelectionLegFare.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32637i()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionLegFare.mo32637i()));
        if (compareTo2 != 0 || ((mo32637i() && (compareTo2 = this.legId.compareTo(mVPurchaseItineraryLegSelectionLegFare.legId)) != 0) || (compareTo2 = Boolean.valueOf(mo32638j()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionLegFare.mo32638j()))) != 0 || ((mo32638j() && (compareTo2 = this.name.compareTo(mVPurchaseItineraryLegSelectionLegFare.name)) != 0) || (compareTo2 = Boolean.valueOf(mo32640l()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionLegFare.mo32640l()))) != 0 || ((mo32640l() && (compareTo2 = this.price.compareTo(mVPurchaseItineraryLegSelectionLegFare.price)) != 0) || (compareTo2 = Boolean.valueOf(mo32639k()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionLegFare.mo32639k()))) != 0 || ((mo32639k() && (compareTo2 = this.origin.compareTo(mVPurchaseItineraryLegSelectionLegFare.origin)) != 0) || (compareTo2 = Boolean.valueOf(mo32633f()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionLegFare.mo32633f()))) != 0 || ((mo32633f() && (compareTo2 = this.destination.compareTo(mVPurchaseItineraryLegSelectionLegFare.destination)) != 0) || (compareTo2 = Boolean.valueOf(mo32634g()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionLegFare.mo32634g()))) != 0 || ((mo32634g() && (compareTo2 = this.fareId.compareTo(mVPurchaseItineraryLegSelectionLegFare.fareId)) != 0) || (compareTo2 = Boolean.valueOf(mo32635h()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionLegFare.mo32635h()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo32635h() || (compareTo = this.fullPrice.compareTo(mVPurchaseItineraryLegSelectionLegFare.fullPrice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseItineraryLegSelectionLegFare)) {
            return false;
        }
        MVPurchaseItineraryLegSelectionLegFare mVPurchaseItineraryLegSelectionLegFare = (MVPurchaseItineraryLegSelectionLegFare) obj;
        boolean i = mo32637i();
        boolean i2 = mVPurchaseItineraryLegSelectionLegFare.mo32637i();
        if ((i || i2) && (!i || !i2 || !this.legId.equals(mVPurchaseItineraryLegSelectionLegFare.legId))) {
            return false;
        }
        boolean j = mo32638j();
        boolean j2 = mVPurchaseItineraryLegSelectionLegFare.mo32638j();
        if ((j || j2) && (!j || !j2 || !this.name.equals(mVPurchaseItineraryLegSelectionLegFare.name))) {
            return false;
        }
        boolean l = mo32640l();
        boolean l2 = mVPurchaseItineraryLegSelectionLegFare.mo32640l();
        if ((l || l2) && (!l || !l2 || !this.price.mo26102a(mVPurchaseItineraryLegSelectionLegFare.price))) {
            return false;
        }
        boolean k = mo32639k();
        boolean k2 = mVPurchaseItineraryLegSelectionLegFare.mo32639k();
        if ((k || k2) && (!k || !k2 || !this.origin.equals(mVPurchaseItineraryLegSelectionLegFare.origin))) {
            return false;
        }
        boolean f = mo32633f();
        boolean f2 = mVPurchaseItineraryLegSelectionLegFare.mo32633f();
        if ((f || f2) && (!f || !f2 || !this.destination.equals(mVPurchaseItineraryLegSelectionLegFare.destination))) {
            return false;
        }
        boolean g = mo32634g();
        boolean g2 = mVPurchaseItineraryLegSelectionLegFare.mo32634g();
        if ((g || g2) && (!g || !g2 || !this.fareId.equals(mVPurchaseItineraryLegSelectionLegFare.fareId))) {
            return false;
        }
        boolean h = mo32635h();
        boolean h2 = mVPurchaseItineraryLegSelectionLegFare.mo32635h();
        if ((h || h2) && (!h || !h2 || !this.fullPrice.mo26102a(mVPurchaseItineraryLegSelectionLegFare.fullPrice))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32633f() {
        return this.destination != null;
    }

    /* renamed from: g */
    public final boolean mo32634g() {
        return this.fareId != null;
    }

    /* renamed from: h */
    public final boolean mo32635h() {
        return this.fullPrice != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32637i() {
        return this.legId != null;
    }

    /* renamed from: j */
    public final boolean mo32638j() {
        return this.name != null;
    }

    /* renamed from: k */
    public final boolean mo32639k() {
        return this.origin != null;
    }

    /* renamed from: l */
    public final boolean mo32640l() {
        return this.price != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseItineraryLegSelectionLegFare(", "legId:");
        String str = this.legId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("name:");
        String str2 = this.name;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo32640l()) {
            n.append(", ");
            n.append("price:");
            MVCurrencyAmount mVCurrencyAmount = this.price;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo32639k()) {
            n.append(", ");
            n.append("origin:");
            String str3 = this.origin;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo32633f()) {
            n.append(", ");
            n.append("destination:");
            String str4 = this.destination;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo32634g()) {
            n.append(", ");
            n.append("fareId:");
            String str5 = this.fareId;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        if (mo32635h()) {
            n.append(", ");
            n.append("fullPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.fullPrice;
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
