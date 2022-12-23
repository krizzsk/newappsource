package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVTicketingFare implements TBase<MVTicketingFare, _Fields>, Serializable, Cloneable, Comparable<MVTicketingFare> {

    /* renamed from: b */
    public static final C25113c f29238b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29239c = new C25113c("id", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29240d = new C25113c("name", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29241e = new C25113c("fareDescription", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f29242f = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f29243g = new C25113c("quantityLimit", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f29244h = new C25113c("agencyName", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f29245i = new C25113c("agencyId", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f29246j = new C25113c("attributionImage", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f29247k = new C25113c("warningMessage", (byte) 11, 10);

    /* renamed from: l */
    public static final C25113c f29248l = new C25113c("verifacationType", (byte) 8, 11);

    /* renamed from: m */
    public static final C25113c f29249m = new C25113c("agencyKey", (byte) 11, 12);

    /* renamed from: n */
    public static final C25113c f29250n = new C25113c("fullPrice", (byte) 12, 13);

    /* renamed from: o */
    public static final HashMap f29251o;

    /* renamed from: p */
    public static final Map<_Fields, FieldMetaData> f29252p;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public String agencyKey;
    public String agencyName;
    public MVImageReferenceWithParams attributionImage;
    public String fareDescription;
    public MVCurrencyAmount fullPrice;

    /* renamed from: id */
    public String f29253id;
    public String name;
    private _Fields[] optionals = {_Fields.FARE_DESCRIPTION, _Fields.AGENCY_ID, _Fields.ATTRIBUTION_IMAGE, _Fields.WARNING_MESSAGE, _Fields.FULL_PRICE};
    public MVCurrencyAmount price;
    public int providerId;
    public int quantityLimit;
    public MVPurchaseVerifacationType verifacationType;
    public String warningMessage;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        ID(2, "id"),
        NAME(3, "name"),
        FARE_DESCRIPTION(4, "fareDescription"),
        PRICE(5, InAppPurchaseMetaData.KEY_PRICE),
        QUANTITY_LIMIT(6, "quantityLimit"),
        AGENCY_NAME(7, "agencyName"),
        AGENCY_ID(8, "agencyId"),
        ATTRIBUTION_IMAGE(9, "attributionImage"),
        WARNING_MESSAGE(10, "warningMessage"),
        VERIFACATION_TYPE(11, "verifacationType"),
        AGENCY_KEY(12, "agencyKey"),
        FULL_PRICE(13, "fullPrice");
        
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
                    return ID;
                case 3:
                    return NAME;
                case 4:
                    return FARE_DESCRIPTION;
                case 5:
                    return PRICE;
                case 6:
                    return QUANTITY_LIMIT;
                case 7:
                    return AGENCY_NAME;
                case 8:
                    return AGENCY_ID;
                case 9:
                    return ATTRIBUTION_IMAGE;
                case 10:
                    return WARNING_MESSAGE;
                case 11:
                    return VERIFACATION_TYPE;
                case 12:
                    return AGENCY_KEY;
                case 13:
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketingFare$a */
    public static class C11106a extends C25239c<MVTicketingFare> {
        public C11106a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketingFare mVTicketingFare = (MVTicketingFare) tBase;
            mVTicketingFare.mo33182w();
            C25113c cVar = MVTicketingFare.f29238b;
            gVar.mo61687K();
            gVar.mo61711x(MVTicketingFare.f29238b);
            gVar.mo61678B(mVTicketingFare.providerId);
            gVar.mo61712y();
            if (mVTicketingFare.f29253id != null) {
                gVar.mo61711x(MVTicketingFare.f29239c);
                gVar.mo61686J(mVTicketingFare.f29253id);
                gVar.mo61712y();
            }
            if (mVTicketingFare.name != null) {
                gVar.mo61711x(MVTicketingFare.f29240d);
                gVar.mo61686J(mVTicketingFare.name);
                gVar.mo61712y();
            }
            if (mVTicketingFare.fareDescription != null && mVTicketingFare.mo33169j()) {
                gVar.mo61711x(MVTicketingFare.f29241e);
                gVar.mo61686J(mVTicketingFare.fareDescription);
                gVar.mo61712y();
            }
            if (mVTicketingFare.price != null) {
                gVar.mo61711x(MVTicketingFare.f29242f);
                mVTicketingFare.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTicketingFare.f29243g);
            gVar.mo61678B(mVTicketingFare.quantityLimit);
            gVar.mo61712y();
            if (mVTicketingFare.agencyName != null) {
                gVar.mo61711x(MVTicketingFare.f29244h);
                gVar.mo61686J(mVTicketingFare.agencyName);
                gVar.mo61712y();
            }
            if (mVTicketingFare.mo33164f()) {
                gVar.mo61711x(MVTicketingFare.f29245i);
                gVar.mo61678B(mVTicketingFare.agencyId);
                gVar.mo61712y();
            }
            if (mVTicketingFare.attributionImage != null && mVTicketingFare.mo33168i()) {
                gVar.mo61711x(MVTicketingFare.f29246j);
                mVTicketingFare.attributionImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTicketingFare.warningMessage != null && mVTicketingFare.mo33177s()) {
                gVar.mo61711x(MVTicketingFare.f29247k);
                gVar.mo61686J(mVTicketingFare.warningMessage);
                gVar.mo61712y();
            }
            if (mVTicketingFare.verifacationType != null) {
                gVar.mo61711x(MVTicketingFare.f29248l);
                gVar.mo61678B(mVTicketingFare.verifacationType.getValue());
                gVar.mo61712y();
            }
            if (mVTicketingFare.agencyKey != null) {
                gVar.mo61711x(MVTicketingFare.f29249m);
                gVar.mo61686J(mVTicketingFare.agencyKey);
                gVar.mo61712y();
            }
            if (mVTicketingFare.fullPrice != null && mVTicketingFare.mo33170k()) {
                gVar.mo61711x(MVTicketingFare.f29250n);
                mVTicketingFare.fullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketingFare mVTicketingFare = (MVTicketingFare) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTicketingFare.mo33182w();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.providerId = gVar.mo61696i();
                            mVTicketingFare.mo33180u();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.f29253id = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.name = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.fareDescription = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVTicketingFare.price = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.quantityLimit = gVar.mo61696i();
                            mVTicketingFare.mo33181v();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.agencyName = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.agencyId = gVar.mo61696i();
                            mVTicketingFare.mo33178t();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVTicketingFare.attributionImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.warningMessage = gVar.mo61704q();
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.verifacationType = MVPurchaseVerifacationType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicketingFare.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 13:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVTicketingFare.fullPrice = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketingFare$b */
    public static class C11107b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11106a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketingFare$c */
    public static class C11108c extends C25240d<MVTicketingFare> {
        public C11108c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicketingFare mVTicketingFare = (MVTicketingFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicketingFare.mo33174p()) {
                bitSet.set(0);
            }
            if (mVTicketingFare.mo33171l()) {
                bitSet.set(1);
            }
            if (mVTicketingFare.mo33172m()) {
                bitSet.set(2);
            }
            if (mVTicketingFare.mo33169j()) {
                bitSet.set(3);
            }
            if (mVTicketingFare.mo33173o()) {
                bitSet.set(4);
            }
            if (mVTicketingFare.mo33175q()) {
                bitSet.set(5);
            }
            if (mVTicketingFare.mo33166h()) {
                bitSet.set(6);
            }
            if (mVTicketingFare.mo33164f()) {
                bitSet.set(7);
            }
            if (mVTicketingFare.mo33168i()) {
                bitSet.set(8);
            }
            if (mVTicketingFare.mo33177s()) {
                bitSet.set(9);
            }
            if (mVTicketingFare.mo33176r()) {
                bitSet.set(10);
            }
            if (mVTicketingFare.mo33165g()) {
                bitSet.set(11);
            }
            if (mVTicketingFare.mo33170k()) {
                bitSet.set(12);
            }
            jVar.mo61738U(bitSet, 13);
            if (mVTicketingFare.mo33174p()) {
                jVar.mo61678B(mVTicketingFare.providerId);
            }
            if (mVTicketingFare.mo33171l()) {
                jVar.mo61686J(mVTicketingFare.f29253id);
            }
            if (mVTicketingFare.mo33172m()) {
                jVar.mo61686J(mVTicketingFare.name);
            }
            if (mVTicketingFare.mo33169j()) {
                jVar.mo61686J(mVTicketingFare.fareDescription);
            }
            if (mVTicketingFare.mo33173o()) {
                mVTicketingFare.price.mo25202X0(jVar);
            }
            if (mVTicketingFare.mo33175q()) {
                jVar.mo61678B(mVTicketingFare.quantityLimit);
            }
            if (mVTicketingFare.mo33166h()) {
                jVar.mo61686J(mVTicketingFare.agencyName);
            }
            if (mVTicketingFare.mo33164f()) {
                jVar.mo61678B(mVTicketingFare.agencyId);
            }
            if (mVTicketingFare.mo33168i()) {
                mVTicketingFare.attributionImage.mo25202X0(jVar);
            }
            if (mVTicketingFare.mo33177s()) {
                jVar.mo61686J(mVTicketingFare.warningMessage);
            }
            if (mVTicketingFare.mo33176r()) {
                jVar.mo61678B(mVTicketingFare.verifacationType.getValue());
            }
            if (mVTicketingFare.mo33165g()) {
                jVar.mo61686J(mVTicketingFare.agencyKey);
            }
            if (mVTicketingFare.mo33170k()) {
                mVTicketingFare.fullPrice.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicketingFare mVTicketingFare = (MVTicketingFare) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(13);
            if (T.get(0)) {
                mVTicketingFare.providerId = jVar.mo61696i();
                mVTicketingFare.mo33180u();
            }
            if (T.get(1)) {
                mVTicketingFare.f29253id = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTicketingFare.name = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTicketingFare.fareDescription = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTicketingFare.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVTicketingFare.quantityLimit = jVar.mo61696i();
                mVTicketingFare.mo33181v();
            }
            if (T.get(6)) {
                mVTicketingFare.agencyName = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVTicketingFare.agencyId = jVar.mo61696i();
                mVTicketingFare.mo33178t();
            }
            if (T.get(8)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTicketingFare.attributionImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(9)) {
                mVTicketingFare.warningMessage = jVar.mo61704q();
            }
            if (T.get(10)) {
                mVTicketingFare.verifacationType = MVPurchaseVerifacationType.findByValue(jVar.mo61696i());
            }
            if (T.get(11)) {
                mVTicketingFare.agencyKey = jVar.mo61704q();
            }
            if (T.get(12)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVTicketingFare.fullPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicketingFare$d */
    public static class C11109d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11108c(0);
        }
    }

    static {
        new C17394d0("MVTicketingFare");
        HashMap hashMap = new HashMap();
        f29251o = hashMap;
        hashMap.put(C25239c.class, new C11107b());
        hashMap.put(C25240d.class, new C11109d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FARE_DESCRIPTION, new FieldMetaData("fareDescription", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.QUANTITY_LIMIT, new FieldMetaData("quantityLimit", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_NAME, new FieldMetaData("agencyName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ATTRIBUTION_IMAGE, new FieldMetaData("attributionImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.WARNING_MESSAGE, new FieldMetaData("warningMessage", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VERIFACATION_TYPE, new FieldMetaData("verifacationType", (byte) 3, new EnumMetaData(MVPurchaseVerifacationType.class)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FULL_PRICE, new FieldMetaData("fullPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29252p = unmodifiableMap;
        FieldMetaData.m61947a(MVTicketingFare.class, unmodifiableMap);
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
        ((C25238b) f29251o.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29251o.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33161a(MVTicketingFare mVTicketingFare) {
        if (mVTicketingFare == null || this.providerId != mVTicketingFare.providerId) {
            return false;
        }
        boolean l = mo33171l();
        boolean l2 = mVTicketingFare.mo33171l();
        if ((l || l2) && (!l || !l2 || !this.f29253id.equals(mVTicketingFare.f29253id))) {
            return false;
        }
        boolean m = mo33172m();
        boolean m2 = mVTicketingFare.mo33172m();
        if ((m || m2) && (!m || !m2 || !this.name.equals(mVTicketingFare.name))) {
            return false;
        }
        boolean j = mo33169j();
        boolean j2 = mVTicketingFare.mo33169j();
        if ((j || j2) && (!j || !j2 || !this.fareDescription.equals(mVTicketingFare.fareDescription))) {
            return false;
        }
        boolean o = mo33173o();
        boolean o2 = mVTicketingFare.mo33173o();
        if (((o || o2) && (!o || !o2 || !this.price.mo26102a(mVTicketingFare.price))) || this.quantityLimit != mVTicketingFare.quantityLimit) {
            return false;
        }
        boolean h = mo33166h();
        boolean h2 = mVTicketingFare.mo33166h();
        if ((h || h2) && (!h || !h2 || !this.agencyName.equals(mVTicketingFare.agencyName))) {
            return false;
        }
        boolean f = mo33164f();
        boolean f2 = mVTicketingFare.mo33164f();
        if ((f || f2) && (!f || !f2 || this.agencyId != mVTicketingFare.agencyId)) {
            return false;
        }
        boolean i = mo33168i();
        boolean i2 = mVTicketingFare.mo33168i();
        if ((i || i2) && (!i || !i2 || !this.attributionImage.mo26245a(mVTicketingFare.attributionImage))) {
            return false;
        }
        boolean s = mo33177s();
        boolean s2 = mVTicketingFare.mo33177s();
        if ((s || s2) && (!s || !s2 || !this.warningMessage.equals(mVTicketingFare.warningMessage))) {
            return false;
        }
        boolean r = mo33176r();
        boolean r2 = mVTicketingFare.mo33176r();
        if ((r || r2) && (!r || !r2 || !this.verifacationType.equals(mVTicketingFare.verifacationType))) {
            return false;
        }
        boolean g = mo33165g();
        boolean g2 = mVTicketingFare.mo33165g();
        if ((g || g2) && (!g || !g2 || !this.agencyKey.equals(mVTicketingFare.agencyKey))) {
            return false;
        }
        boolean k = mo33170k();
        boolean k2 = mVTicketingFare.mo33170k();
        if (!k && !k2) {
            return true;
        }
        if (!k || !k2 || !this.fullPrice.mo26102a(mVTicketingFare.fullPrice)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTicketingFare mVTicketingFare = (MVTicketingFare) obj;
        if (!getClass().equals(mVTicketingFare.getClass())) {
            return getClass().getName().compareTo(mVTicketingFare.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33174p()).compareTo(Boolean.valueOf(mVTicketingFare.mo33174p()));
        if (compareTo2 != 0 || ((mo33174p() && (compareTo2 = C25082a.m62839c(this.providerId, mVTicketingFare.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo33171l()).compareTo(Boolean.valueOf(mVTicketingFare.mo33171l()))) != 0 || ((mo33171l() && (compareTo2 = this.f29253id.compareTo(mVTicketingFare.f29253id)) != 0) || (compareTo2 = Boolean.valueOf(mo33172m()).compareTo(Boolean.valueOf(mVTicketingFare.mo33172m()))) != 0 || ((mo33172m() && (compareTo2 = this.name.compareTo(mVTicketingFare.name)) != 0) || (compareTo2 = Boolean.valueOf(mo33169j()).compareTo(Boolean.valueOf(mVTicketingFare.mo33169j()))) != 0 || ((mo33169j() && (compareTo2 = this.fareDescription.compareTo(mVTicketingFare.fareDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo33173o()).compareTo(Boolean.valueOf(mVTicketingFare.mo33173o()))) != 0 || ((mo33173o() && (compareTo2 = this.price.compareTo(mVTicketingFare.price)) != 0) || (compareTo2 = Boolean.valueOf(mo33175q()).compareTo(Boolean.valueOf(mVTicketingFare.mo33175q()))) != 0 || ((mo33175q() && (compareTo2 = C25082a.m62839c(this.quantityLimit, mVTicketingFare.quantityLimit)) != 0) || (compareTo2 = Boolean.valueOf(mo33166h()).compareTo(Boolean.valueOf(mVTicketingFare.mo33166h()))) != 0 || ((mo33166h() && (compareTo2 = this.agencyName.compareTo(mVTicketingFare.agencyName)) != 0) || (compareTo2 = Boolean.valueOf(mo33164f()).compareTo(Boolean.valueOf(mVTicketingFare.mo33164f()))) != 0 || ((mo33164f() && (compareTo2 = C25082a.m62839c(this.agencyId, mVTicketingFare.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo33168i()).compareTo(Boolean.valueOf(mVTicketingFare.mo33168i()))) != 0 || ((mo33168i() && (compareTo2 = this.attributionImage.compareTo(mVTicketingFare.attributionImage)) != 0) || (compareTo2 = Boolean.valueOf(mo33177s()).compareTo(Boolean.valueOf(mVTicketingFare.mo33177s()))) != 0 || ((mo33177s() && (compareTo2 = this.warningMessage.compareTo(mVTicketingFare.warningMessage)) != 0) || (compareTo2 = Boolean.valueOf(mo33176r()).compareTo(Boolean.valueOf(mVTicketingFare.mo33176r()))) != 0 || ((mo33176r() && (compareTo2 = this.verifacationType.compareTo(mVTicketingFare.verifacationType)) != 0) || (compareTo2 = Boolean.valueOf(mo33165g()).compareTo(Boolean.valueOf(mVTicketingFare.mo33165g()))) != 0 || ((mo33165g() && (compareTo2 = this.agencyKey.compareTo(mVTicketingFare.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo33170k()).compareTo(Boolean.valueOf(mVTicketingFare.mo33170k()))) != 0))))))))))))) {
            return compareTo2;
        }
        if (!mo33170k() || (compareTo = this.fullPrice.compareTo(mVTicketingFare.fullPrice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTicketingFare)) {
            return mo33161a((MVTicketingFare) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33164f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo33165g() {
        return this.agencyKey != null;
    }

    /* renamed from: h */
    public final boolean mo33166h() {
        return this.agencyName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33168i() {
        return this.attributionImage != null;
    }

    /* renamed from: j */
    public final boolean mo33169j() {
        return this.fareDescription != null;
    }

    /* renamed from: k */
    public final boolean mo33170k() {
        return this.fullPrice != null;
    }

    /* renamed from: l */
    public final boolean mo33171l() {
        return this.f29253id != null;
    }

    /* renamed from: m */
    public final boolean mo33172m() {
        return this.name != null;
    }

    /* renamed from: o */
    public final boolean mo33173o() {
        return this.price != null;
    }

    /* renamed from: p */
    public final boolean mo33174p() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: q */
    public final boolean mo33175q() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: r */
    public final boolean mo33176r() {
        return this.verifacationType != null;
    }

    /* renamed from: s */
    public final boolean mo33177s() {
        return this.warningMessage != null;
    }

    /* renamed from: t */
    public final void mo33178t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicketingFare(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "id:");
        String str = this.f29253id;
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
        if (mo33169j()) {
            n.append(", ");
            n.append("fareDescription:");
            String str3 = this.fareDescription;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("quantityLimit:");
        C0016g.m42z(n, this.quantityLimit, ", ", "agencyName:");
        String str4 = this.agencyName;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        if (mo33164f()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        if (mo33168i()) {
            n.append(", ");
            n.append("attributionImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.attributionImage;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo33177s()) {
            n.append(", ");
            n.append("warningMessage:");
            String str5 = this.warningMessage;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        n.append(", ");
        n.append("verifacationType:");
        MVPurchaseVerifacationType mVPurchaseVerifacationType = this.verifacationType;
        if (mVPurchaseVerifacationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPurchaseVerifacationType);
        }
        n.append(", ");
        n.append("agencyKey:");
        String str6 = this.agencyKey;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        if (mo33170k()) {
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

    /* renamed from: u */
    public final void mo33180u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: v */
    public final void mo33181v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: w */
    public final void mo33182w() throws TException {
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount != null) {
            mVCurrencyAmount.getClass();
        }
        MVImageReferenceWithParams mVImageReferenceWithParams = this.attributionImage;
        if (mVImageReferenceWithParams != null) {
            mVImageReferenceWithParams.getClass();
        }
        MVCurrencyAmount mVCurrencyAmount2 = this.fullPrice;
        if (mVCurrencyAmount2 != null) {
            mVCurrencyAmount2.getClass();
        }
    }
}
