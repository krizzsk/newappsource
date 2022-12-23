package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodId;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVPurchaseTicket implements TBase<MVPurchaseTicket, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseTicket> {

    /* renamed from: b */
    public static final C25113c f28999b = new C25113c("metroId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29000c = new C25113c("time", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f29001d = new C25113c("providerId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29002e = new C25113c("fareId", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f29003f = new C25113c("fareName", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f29004g = new C25113c("fareDescription", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f29005h = new C25113c("farePrice", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f29006i = new C25113c("quantity", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f29007j = new C25113c("agencyKey", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f29008k = new C25113c("ticketIds", (byte) 15, 10);

    /* renamed from: l */
    public static final C25113c f29009l = new C25113c("appliedFilters", (byte) 15, 11);

    /* renamed from: m */
    public static final C25113c f29010m = new C25113c("data", (byte) 12, 12);

    /* renamed from: n */
    public static final C25113c f29011n = new C25113c("passbookId", (byte) 11, 13);

    /* renamed from: o */
    public static final C25113c f29012o = new C25113c("isSplitPayment", (byte) 2, 14);

    /* renamed from: p */
    public static final C25113c f29013p = new C25113c("paymentMethodId", (byte) 12, 15);

    /* renamed from: q */
    public static final C25113c f29014q = new C25113c("paymentData", (byte) 11, 16);

    /* renamed from: r */
    public static final HashMap f29015r;

    /* renamed from: s */
    public static final Map<_Fields, FieldMetaData> f29016s;
    private byte __isset_bitfield = 0;
    public String agencyKey;
    public List<MVFilter> appliedFilters;
    public MVProviderSpecificData data;
    public String fareDescription;
    public String fareId;
    public String fareName;
    public MVCurrencyAmount farePrice;
    public boolean isSplitPayment;
    public int metroId;
    private _Fields[] optionals = {_Fields.FARE_DESCRIPTION, _Fields.TICKET_IDS, _Fields.APPLIED_FILTERS, _Fields.DATA, _Fields.PASSBOOK_ID, _Fields.PAYMENT_METHOD_ID, _Fields.PAYMENT_DATA};
    public String passbookId;
    public String paymentData;
    public MVPaymentMethodId paymentMethodId;
    public int providerId;
    public int quantity;
    public List<String> ticketIds;
    public long time;

    public enum _Fields implements C25085c {
        METRO_ID(1, "metroId"),
        TIME(2, "time"),
        PROVIDER_ID(3, "providerId"),
        FARE_ID(4, "fareId"),
        FARE_NAME(5, "fareName"),
        FARE_DESCRIPTION(6, "fareDescription"),
        FARE_PRICE(7, "farePrice"),
        QUANTITY(8, "quantity"),
        AGENCY_KEY(9, "agencyKey"),
        TICKET_IDS(10, "ticketIds"),
        APPLIED_FILTERS(11, "appliedFilters"),
        DATA(12, "data"),
        PASSBOOK_ID(13, "passbookId"),
        IS_SPLIT_PAYMENT(14, "isSplitPayment"),
        PAYMENT_METHOD_ID(15, "paymentMethodId"),
        PAYMENT_DATA(16, "paymentData");
        
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
                    return METRO_ID;
                case 2:
                    return TIME;
                case 3:
                    return PROVIDER_ID;
                case 4:
                    return FARE_ID;
                case 5:
                    return FARE_NAME;
                case 6:
                    return FARE_DESCRIPTION;
                case 7:
                    return FARE_PRICE;
                case 8:
                    return QUANTITY;
                case 9:
                    return AGENCY_KEY;
                case 10:
                    return TICKET_IDS;
                case 11:
                    return APPLIED_FILTERS;
                case 12:
                    return DATA;
                case 13:
                    return PASSBOOK_ID;
                case 14:
                    return IS_SPLIT_PAYMENT;
                case 15:
                    return PAYMENT_METHOD_ID;
                case 16:
                    return PAYMENT_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicket$a */
    public static class C10979a extends C25239c<MVPurchaseTicket> {
        public C10979a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicket mVPurchaseTicket = (MVPurchaseTicket) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPurchaseTicket.farePrice;
            C25113c cVar = MVPurchaseTicket.f28999b;
            gVar.mo61687K();
            gVar.mo61711x(MVPurchaseTicket.f28999b);
            gVar.mo61678B(mVPurchaseTicket.metroId);
            gVar.mo61712y();
            gVar.mo61711x(MVPurchaseTicket.f29000c);
            gVar.mo61679C(mVPurchaseTicket.time);
            gVar.mo61712y();
            gVar.mo61711x(MVPurchaseTicket.f29001d);
            gVar.mo61678B(mVPurchaseTicket.providerId);
            gVar.mo61712y();
            if (mVPurchaseTicket.fareId != null) {
                gVar.mo61711x(MVPurchaseTicket.f29002e);
                gVar.mo61686J(mVPurchaseTicket.fareId);
                gVar.mo61712y();
            }
            if (mVPurchaseTicket.fareName != null) {
                gVar.mo61711x(MVPurchaseTicket.f29003f);
                gVar.mo61686J(mVPurchaseTicket.fareName);
                gVar.mo61712y();
            }
            if (mVPurchaseTicket.fareDescription != null && mVPurchaseTicket.mo32822i()) {
                gVar.mo61711x(MVPurchaseTicket.f29004g);
                gVar.mo61686J(mVPurchaseTicket.fareDescription);
                gVar.mo61712y();
            }
            if (mVPurchaseTicket.farePrice != null) {
                gVar.mo61711x(MVPurchaseTicket.f29005h);
                mVPurchaseTicket.farePrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPurchaseTicket.f29006i);
            gVar.mo61678B(mVPurchaseTicket.quantity);
            gVar.mo61712y();
            if (mVPurchaseTicket.agencyKey != null) {
                gVar.mo61711x(MVPurchaseTicket.f29007j);
                gVar.mo61686J(mVPurchaseTicket.agencyKey);
                gVar.mo61712y();
            }
            if (mVPurchaseTicket.ticketIds != null && mVPurchaseTicket.mo32834u()) {
                gVar.mo61711x(MVPurchaseTicket.f29008k);
                gVar.mo61680D(new C25119e((byte) 11, mVPurchaseTicket.ticketIds.size()));
                for (String J : mVPurchaseTicket.ticketIds) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseTicket.appliedFilters != null && mVPurchaseTicket.mo32819g()) {
                gVar.mo61711x(MVPurchaseTicket.f29009l);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseTicket.appliedFilters.size()));
                for (MVFilter X0 : mVPurchaseTicket.appliedFilters) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseTicket.data != null && mVPurchaseTicket.mo32820h()) {
                gVar.mo61711x(MVPurchaseTicket.f29010m);
                mVPurchaseTicket.data.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseTicket.passbookId != null && mVPurchaseTicket.mo32828p()) {
                gVar.mo61711x(MVPurchaseTicket.f29011n);
                gVar.mo61686J(mVPurchaseTicket.passbookId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPurchaseTicket.f29012o);
            gVar.mo61708u(mVPurchaseTicket.isSplitPayment);
            gVar.mo61712y();
            if (mVPurchaseTicket.paymentMethodId != null && mVPurchaseTicket.mo32830r()) {
                gVar.mo61711x(MVPurchaseTicket.f29013p);
                mVPurchaseTicket.paymentMethodId.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseTicket.paymentData != null && mVPurchaseTicket.mo32829q()) {
                gVar.mo61711x(MVPurchaseTicket.f29014q);
                gVar.mo61686J(mVPurchaseTicket.paymentData);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicket mVPurchaseTicket = (MVPurchaseTicket) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPurchaseTicket.farePrice;
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.metroId = gVar.mo61696i();
                            mVPurchaseTicket.mo32837y();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.time = gVar.mo61697j();
                            mVPurchaseTicket.mo32815E();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.providerId = gVar.mo61696i();
                            mVPurchaseTicket.mo32813A();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.fareId = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.fareName = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.fareDescription = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVPurchaseTicket.farePrice = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.quantity = gVar.mo61696i();
                            mVPurchaseTicket.mo32814D();
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPurchaseTicket.ticketIds = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                mVPurchaseTicket.ticketIds.add(gVar.mo61704q());
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 11:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVPurchaseTicket.appliedFilters = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVFilter mVFilter = new MVFilter();
                                mVFilter.mo25201C1(gVar);
                                mVPurchaseTicket.appliedFilters.add(mVFilter);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 12:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVProviderSpecificData mVProviderSpecificData = new MVProviderSpecificData();
                            mVPurchaseTicket.data = mVProviderSpecificData;
                            mVProviderSpecificData.mo25201C1(gVar);
                            break;
                        }
                    case 13:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.passbookId = gVar.mo61704q();
                            break;
                        }
                    case 14:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.isSplitPayment = gVar.mo61690c();
                            mVPurchaseTicket.mo32836w();
                            break;
                        }
                    case 15:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                            mVPurchaseTicket.paymentMethodId = mVPaymentMethodId;
                            mVPaymentMethodId.mo25201C1(gVar);
                            break;
                        }
                    case 16:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseTicket.paymentData = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicket$b */
    public static class C10980b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10979a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicket$c */
    public static class C10981c extends C25240d<MVPurchaseTicket> {
        public C10981c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicket mVPurchaseTicket = (MVPurchaseTicket) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseTicket.mo32827o()) {
                bitSet.set(0);
            }
            if (mVPurchaseTicket.mo32835v()) {
                bitSet.set(1);
            }
            if (mVPurchaseTicket.mo32831s()) {
                bitSet.set(2);
            }
            if (mVPurchaseTicket.mo32823j()) {
                bitSet.set(3);
            }
            if (mVPurchaseTicket.mo32824k()) {
                bitSet.set(4);
            }
            if (mVPurchaseTicket.mo32822i()) {
                bitSet.set(5);
            }
            if (mVPurchaseTicket.mo32825l()) {
                bitSet.set(6);
            }
            if (mVPurchaseTicket.mo32832t()) {
                bitSet.set(7);
            }
            if (mVPurchaseTicket.mo32818f()) {
                bitSet.set(8);
            }
            if (mVPurchaseTicket.mo32834u()) {
                bitSet.set(9);
            }
            if (mVPurchaseTicket.mo32819g()) {
                bitSet.set(10);
            }
            if (mVPurchaseTicket.mo32820h()) {
                bitSet.set(11);
            }
            if (mVPurchaseTicket.mo32828p()) {
                bitSet.set(12);
            }
            if (mVPurchaseTicket.mo32826m()) {
                bitSet.set(13);
            }
            if (mVPurchaseTicket.mo32830r()) {
                bitSet.set(14);
            }
            if (mVPurchaseTicket.mo32829q()) {
                bitSet.set(15);
            }
            jVar.mo61738U(bitSet, 16);
            if (mVPurchaseTicket.mo32827o()) {
                jVar.mo61678B(mVPurchaseTicket.metroId);
            }
            if (mVPurchaseTicket.mo32835v()) {
                jVar.mo61679C(mVPurchaseTicket.time);
            }
            if (mVPurchaseTicket.mo32831s()) {
                jVar.mo61678B(mVPurchaseTicket.providerId);
            }
            if (mVPurchaseTicket.mo32823j()) {
                jVar.mo61686J(mVPurchaseTicket.fareId);
            }
            if (mVPurchaseTicket.mo32824k()) {
                jVar.mo61686J(mVPurchaseTicket.fareName);
            }
            if (mVPurchaseTicket.mo32822i()) {
                jVar.mo61686J(mVPurchaseTicket.fareDescription);
            }
            if (mVPurchaseTicket.mo32825l()) {
                mVPurchaseTicket.farePrice.mo25202X0(jVar);
            }
            if (mVPurchaseTicket.mo32832t()) {
                jVar.mo61678B(mVPurchaseTicket.quantity);
            }
            if (mVPurchaseTicket.mo32818f()) {
                jVar.mo61686J(mVPurchaseTicket.agencyKey);
            }
            if (mVPurchaseTicket.mo32834u()) {
                jVar.mo61678B(mVPurchaseTicket.ticketIds.size());
                for (String J : mVPurchaseTicket.ticketIds) {
                    jVar.mo61686J(J);
                }
            }
            if (mVPurchaseTicket.mo32819g()) {
                jVar.mo61678B(mVPurchaseTicket.appliedFilters.size());
                for (MVFilter X0 : mVPurchaseTicket.appliedFilters) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseTicket.mo32820h()) {
                mVPurchaseTicket.data.mo25202X0(jVar);
            }
            if (mVPurchaseTicket.mo32828p()) {
                jVar.mo61686J(mVPurchaseTicket.passbookId);
            }
            if (mVPurchaseTicket.mo32826m()) {
                jVar.mo61708u(mVPurchaseTicket.isSplitPayment);
            }
            if (mVPurchaseTicket.mo32830r()) {
                mVPurchaseTicket.paymentMethodId.mo25202X0(jVar);
            }
            if (mVPurchaseTicket.mo32829q()) {
                jVar.mo61686J(mVPurchaseTicket.paymentData);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicket mVPurchaseTicket = (MVPurchaseTicket) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(16);
            if (T.get(0)) {
                mVPurchaseTicket.metroId = jVar.mo61696i();
                mVPurchaseTicket.mo32837y();
            }
            if (T.get(1)) {
                mVPurchaseTicket.time = jVar.mo61697j();
                mVPurchaseTicket.mo32815E();
            }
            if (T.get(2)) {
                mVPurchaseTicket.providerId = jVar.mo61696i();
                mVPurchaseTicket.mo32813A();
            }
            if (T.get(3)) {
                mVPurchaseTicket.fareId = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVPurchaseTicket.fareName = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVPurchaseTicket.fareDescription = jVar.mo61704q();
            }
            if (T.get(6)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseTicket.farePrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVPurchaseTicket.quantity = jVar.mo61696i();
                mVPurchaseTicket.mo32814D();
            }
            if (T.get(8)) {
                mVPurchaseTicket.agencyKey = jVar.mo61704q();
            }
            if (T.get(9)) {
                int i = jVar.mo61696i();
                mVPurchaseTicket.ticketIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPurchaseTicket.ticketIds.add(jVar.mo61704q());
                }
            }
            if (T.get(10)) {
                int i3 = jVar.mo61696i();
                mVPurchaseTicket.appliedFilters = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVFilter mVFilter = new MVFilter();
                    mVFilter.mo25201C1(jVar);
                    mVPurchaseTicket.appliedFilters.add(mVFilter);
                }
            }
            if (T.get(11)) {
                MVProviderSpecificData mVProviderSpecificData = new MVProviderSpecificData();
                mVPurchaseTicket.data = mVProviderSpecificData;
                mVProviderSpecificData.mo25201C1(jVar);
            }
            if (T.get(12)) {
                mVPurchaseTicket.passbookId = jVar.mo61704q();
            }
            if (T.get(13)) {
                mVPurchaseTicket.isSplitPayment = jVar.mo61690c();
                mVPurchaseTicket.mo32836w();
            }
            if (T.get(14)) {
                MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                mVPurchaseTicket.paymentMethodId = mVPaymentMethodId;
                mVPaymentMethodId.mo25201C1(jVar);
            }
            if (T.get(15)) {
                mVPurchaseTicket.paymentData = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicket$d */
    public static class C10982d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10981c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseTicket");
        HashMap hashMap = new HashMap();
        f29015r = hashMap;
        hashMap.put(C25239c.class, new C10980b());
        hashMap.put(C25240d.class, new C10982d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FARE_ID, new FieldMetaData("fareId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FARE_NAME, new FieldMetaData("fareName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FARE_DESCRIPTION, new FieldMetaData("fareDescription", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FARE_PRICE, new FieldMetaData("farePrice", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.QUANTITY, new FieldMetaData("quantity", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TICKET_IDS, new FieldMetaData("ticketIds", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.APPLIED_FILTERS, new FieldMetaData("appliedFilters", (byte) 2, new ListMetaData(new StructMetaData(MVFilter.class))));
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 2, new StructMetaData(MVProviderSpecificData.class)));
        enumMap.put(_Fields.PASSBOOK_ID, new FieldMetaData("passbookId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_SPLIT_PAYMENT, new FieldMetaData("isSplitPayment", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PAYMENT_METHOD_ID, new FieldMetaData("paymentMethodId", (byte) 2, new StructMetaData(MVPaymentMethodId.class)));
        enumMap.put(_Fields.PAYMENT_DATA, new FieldMetaData("paymentData", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29016s = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseTicket.class, unmodifiableMap);
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

    /* renamed from: A */
    public final void mo32813A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f29015r.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo32814D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: E */
    public final void mo32815E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29015r.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseTicket mVPurchaseTicket = (MVPurchaseTicket) obj;
        if (!getClass().equals(mVPurchaseTicket.getClass())) {
            return getClass().getName().compareTo(mVPurchaseTicket.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32827o()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32827o()));
        if (compareTo2 != 0 || ((mo32827o() && (compareTo2 = C25082a.m62839c(this.metroId, mVPurchaseTicket.metroId)) != 0) || (compareTo2 = Boolean.valueOf(mo32835v()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32835v()))) != 0 || ((mo32835v() && (compareTo2 = C25082a.m62840d(this.time, mVPurchaseTicket.time)) != 0) || (compareTo2 = Boolean.valueOf(mo32831s()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32831s()))) != 0 || ((mo32831s() && (compareTo2 = C25082a.m62839c(this.providerId, mVPurchaseTicket.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32823j()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32823j()))) != 0 || ((mo32823j() && (compareTo2 = this.fareId.compareTo(mVPurchaseTicket.fareId)) != 0) || (compareTo2 = Boolean.valueOf(mo32824k()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32824k()))) != 0 || ((mo32824k() && (compareTo2 = this.fareName.compareTo(mVPurchaseTicket.fareName)) != 0) || (compareTo2 = Boolean.valueOf(mo32822i()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32822i()))) != 0 || ((mo32822i() && (compareTo2 = this.fareDescription.compareTo(mVPurchaseTicket.fareDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo32825l()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32825l()))) != 0 || ((mo32825l() && (compareTo2 = this.farePrice.compareTo(mVPurchaseTicket.farePrice)) != 0) || (compareTo2 = Boolean.valueOf(mo32832t()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32832t()))) != 0 || ((mo32832t() && (compareTo2 = C25082a.m62839c(this.quantity, mVPurchaseTicket.quantity)) != 0) || (compareTo2 = Boolean.valueOf(mo32818f()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32818f()))) != 0 || ((mo32818f() && (compareTo2 = this.agencyKey.compareTo(mVPurchaseTicket.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32834u()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32834u()))) != 0 || ((mo32834u() && (compareTo2 = C25082a.m62844h(this.ticketIds, mVPurchaseTicket.ticketIds)) != 0) || (compareTo2 = Boolean.valueOf(mo32819g()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32819g()))) != 0 || ((mo32819g() && (compareTo2 = C25082a.m62844h(this.appliedFilters, mVPurchaseTicket.appliedFilters)) != 0) || (compareTo2 = Boolean.valueOf(mo32820h()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32820h()))) != 0 || ((mo32820h() && (compareTo2 = this.data.compareTo(mVPurchaseTicket.data)) != 0) || (compareTo2 = Boolean.valueOf(mo32828p()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32828p()))) != 0 || ((mo32828p() && (compareTo2 = this.passbookId.compareTo(mVPurchaseTicket.passbookId)) != 0) || (compareTo2 = Boolean.valueOf(mo32826m()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32826m()))) != 0 || ((mo32826m() && (compareTo2 = C25082a.m62848l(this.isSplitPayment, mVPurchaseTicket.isSplitPayment)) != 0) || (compareTo2 = Boolean.valueOf(mo32830r()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32830r()))) != 0 || ((mo32830r() && (compareTo2 = this.paymentMethodId.compareTo(mVPurchaseTicket.paymentMethodId)) != 0) || (compareTo2 = Boolean.valueOf(mo32829q()).compareTo(Boolean.valueOf(mVPurchaseTicket.mo32829q()))) != 0)))))))))))))))) {
            return compareTo2;
        }
        if (!mo32829q() || (compareTo = this.paymentData.compareTo(mVPurchaseTicket.paymentData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseTicket)) {
            return false;
        }
        MVPurchaseTicket mVPurchaseTicket = (MVPurchaseTicket) obj;
        if (this.metroId != mVPurchaseTicket.metroId || this.time != mVPurchaseTicket.time || this.providerId != mVPurchaseTicket.providerId) {
            return false;
        }
        boolean j = mo32823j();
        boolean j2 = mVPurchaseTicket.mo32823j();
        if ((j || j2) && (!j || !j2 || !this.fareId.equals(mVPurchaseTicket.fareId))) {
            return false;
        }
        boolean k = mo32824k();
        boolean k2 = mVPurchaseTicket.mo32824k();
        if ((k || k2) && (!k || !k2 || !this.fareName.equals(mVPurchaseTicket.fareName))) {
            return false;
        }
        boolean i = mo32822i();
        boolean i2 = mVPurchaseTicket.mo32822i();
        if ((i || i2) && (!i || !i2 || !this.fareDescription.equals(mVPurchaseTicket.fareDescription))) {
            return false;
        }
        boolean l = mo32825l();
        boolean l2 = mVPurchaseTicket.mo32825l();
        if (((l || l2) && (!l || !l2 || !this.farePrice.mo26102a(mVPurchaseTicket.farePrice))) || this.quantity != mVPurchaseTicket.quantity) {
            return false;
        }
        boolean f = mo32818f();
        boolean f2 = mVPurchaseTicket.mo32818f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseTicket.agencyKey))) {
            return false;
        }
        boolean u = mo32834u();
        boolean u2 = mVPurchaseTicket.mo32834u();
        if ((u || u2) && (!u || !u2 || !this.ticketIds.equals(mVPurchaseTicket.ticketIds))) {
            return false;
        }
        boolean g = mo32819g();
        boolean g2 = mVPurchaseTicket.mo32819g();
        if ((g || g2) && (!g || !g2 || !this.appliedFilters.equals(mVPurchaseTicket.appliedFilters))) {
            return false;
        }
        boolean h = mo32820h();
        boolean h2 = mVPurchaseTicket.mo32820h();
        if ((h || h2) && (!h || !h2 || !this.data.mo32463a(mVPurchaseTicket.data))) {
            return false;
        }
        boolean p = mo32828p();
        boolean p2 = mVPurchaseTicket.mo32828p();
        if (((p || p2) && (!p || !p2 || !this.passbookId.equals(mVPurchaseTicket.passbookId))) || this.isSplitPayment != mVPurchaseTicket.isSplitPayment) {
            return false;
        }
        boolean r = mo32830r();
        boolean r2 = mVPurchaseTicket.mo32830r();
        if ((r || r2) && (!r || !r2 || !this.paymentMethodId.mo30243a(mVPurchaseTicket.paymentMethodId))) {
            return false;
        }
        boolean q = mo32829q();
        boolean q2 = mVPurchaseTicket.mo32829q();
        if ((q || q2) && (!q || !q2 || !this.paymentData.equals(mVPurchaseTicket.paymentData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32818f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32819g() {
        return this.appliedFilters != null;
    }

    /* renamed from: h */
    public final boolean mo32820h() {
        return this.data != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32822i() {
        return this.fareDescription != null;
    }

    /* renamed from: j */
    public final boolean mo32823j() {
        return this.fareId != null;
    }

    /* renamed from: k */
    public final boolean mo32824k() {
        return this.fareName != null;
    }

    /* renamed from: l */
    public final boolean mo32825l() {
        return this.farePrice != null;
    }

    /* renamed from: m */
    public final boolean mo32826m() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: o */
    public final boolean mo32827o() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: p */
    public final boolean mo32828p() {
        return this.passbookId != null;
    }

    /* renamed from: q */
    public final boolean mo32829q() {
        return this.paymentData != null;
    }

    /* renamed from: r */
    public final boolean mo32830r() {
        return this.paymentMethodId != null;
    }

    /* renamed from: s */
    public final boolean mo32831s() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: t */
    public final boolean mo32832t() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseTicket(", "metroId:");
        C0016g.m42z(n, this.metroId, ", ", "time:");
        C25541a.m63889t(n, this.time, ", ", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "fareId:");
        String str = this.fareId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("fareName:");
        String str2 = this.fareName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo32822i()) {
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
        n.append("farePrice:");
        MVCurrencyAmount mVCurrencyAmount = this.farePrice;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        n.append(", ");
        n.append("quantity:");
        C0016g.m42z(n, this.quantity, ", ", "agencyKey:");
        String str4 = this.agencyKey;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        if (mo32834u()) {
            n.append(", ");
            n.append("ticketIds:");
            List<String> list = this.ticketIds;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo32819g()) {
            n.append(", ");
            n.append("appliedFilters:");
            List<MVFilter> list2 = this.appliedFilters;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo32820h()) {
            n.append(", ");
            n.append("data:");
            MVProviderSpecificData mVProviderSpecificData = this.data;
            if (mVProviderSpecificData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVProviderSpecificData);
            }
        }
        if (mo32828p()) {
            n.append(", ");
            n.append("passbookId:");
            String str5 = this.passbookId;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        n.append(", ");
        n.append("isSplitPayment:");
        n.append(this.isSplitPayment);
        if (mo32830r()) {
            n.append(", ");
            n.append("paymentMethodId:");
            MVPaymentMethodId mVPaymentMethodId = this.paymentMethodId;
            if (mVPaymentMethodId == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentMethodId);
            }
        }
        if (mo32829q()) {
            n.append(", ");
            n.append("paymentData:");
            String str6 = this.paymentData;
            if (str6 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str6);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo32834u() {
        return this.ticketIds != null;
    }

    /* renamed from: v */
    public final boolean mo32835v() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: w */
    public final void mo32836w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: y */
    public final void mo32837y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }
}
