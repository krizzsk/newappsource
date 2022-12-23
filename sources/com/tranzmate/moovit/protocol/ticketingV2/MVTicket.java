package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVTicket implements TBase<MVTicket, _Fields>, Serializable, Cloneable, Comparable<MVTicket> {

    /* renamed from: A */
    public static final Map<_Fields, FieldMetaData> f29139A;

    /* renamed from: b */
    public static final C25113c f29140b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29141c = new C25113c("id", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29142d = new C25113c(ServerParameters.STATUS, (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f29143e = new C25113c("name", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f29144f = new C25113c("ticketDescription", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f29145g = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f29146h = new C25113c("purchaseDate", (byte) 10, 7);

    /* renamed from: i */
    public static final C25113c f29147i = new C25113c("expirationDate", (byte) 10, 8);

    /* renamed from: j */
    public static final C25113c f29148j = new C25113c("activationDate", (byte) 10, 10);

    /* renamed from: k */
    public static final C25113c f29149k = new C25113c("activeUntil", (byte) 10, 11);

    /* renamed from: l */
    public static final C25113c f29150l = new C25113c("receipt", (byte) 12, 12);

    /* renamed from: m */
    public static final C25113c f29151m = new C25113c("agencyName", (byte) 11, 13);

    /* renamed from: n */
    public static final C25113c f29152n = new C25113c("agencyId", (byte) 8, 14);

    /* renamed from: o */
    public static final C25113c f29153o = new C25113c("email", (byte) 11, 15);

    /* renamed from: p */
    public static final C25113c f29154p = new C25113c("phone", (byte) 11, 16);

    /* renamed from: q */
    public static final C25113c f29155q = new C25113c("backgroundImage", (byte) 12, 17);

    /* renamed from: r */
    public static final C25113c f29156r = new C25113c("validFromDate", (byte) 10, 18);

    /* renamed from: s */
    public static final C25113c f29157s = new C25113c("agencyKey", (byte) 11, 19);

    /* renamed from: t */
    public static final C25113c f29158t = new C25113c("passBookId", (byte) 11, 20);

    /* renamed from: u */
    public static final C25113c f29159u = new C25113c("alert", (byte) 8, 21);

    /* renamed from: v */
    public static final C25113c f29160v = new C25113c("originName", (byte) 11, 22);

    /* renamed from: w */
    public static final C25113c f29161w = new C25113c("destinationName", (byte) 11, 23);

    /* renamed from: x */
    public static final C25113c f29162x = new C25113c("productType", (byte) 11, 24);

    /* renamed from: y */
    public static final C25113c f29163y = new C25113c("productSubTitle", (byte) 11, 25);

    /* renamed from: z */
    public static final HashMap f29164z;
    private byte __isset_bitfield = 0;
    public long activationDate;
    public long activeUntil;
    public int agencyId;
    public String agencyKey;
    public String agencyName;
    public MVTicketAlert alert;
    public MVImageReferenceWithParams backgroundImage;
    public String destinationName;
    public String email;
    public long expirationDate;

    /* renamed from: id */
    public String f29165id;
    public String name;
    private _Fields[] optionals = {_Fields.TICKET_DESCRIPTION, _Fields.EXPIRATION_DATE, _Fields.ACTIVATION_DATE, _Fields.ACTIVE_UNTIL, _Fields.RECEIPT, _Fields.AGENCY_ID, _Fields.EMAIL, _Fields.PHONE, _Fields.BACKGROUND_IMAGE, _Fields.VALID_FROM_DATE, _Fields.PASS_BOOK_ID, _Fields.ALERT, _Fields.ORIGIN_NAME, _Fields.DESTINATION_NAME, _Fields.PRODUCT_TYPE, _Fields.PRODUCT_SUB_TITLE};
    public String originName;
    public String passBookId;
    public String phone;
    public MVCurrencyAmount price;
    public String productSubTitle;
    public String productType;
    public int providerId;
    public long purchaseDate;
    public MVTicketReceipt receipt;
    public MVTicketStatus status;
    public String ticketDescription;
    public long validFromDate;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        ID(2, "id"),
        STATUS(3, ServerParameters.STATUS),
        NAME(4, "name"),
        TICKET_DESCRIPTION(5, "ticketDescription"),
        PRICE(6, InAppPurchaseMetaData.KEY_PRICE),
        PURCHASE_DATE(7, "purchaseDate"),
        EXPIRATION_DATE(8, "expirationDate"),
        ACTIVATION_DATE(10, "activationDate"),
        ACTIVE_UNTIL(11, "activeUntil"),
        RECEIPT(12, "receipt"),
        AGENCY_NAME(13, "agencyName"),
        AGENCY_ID(14, "agencyId"),
        EMAIL(15, "email"),
        PHONE(16, "phone"),
        BACKGROUND_IMAGE(17, "backgroundImage"),
        VALID_FROM_DATE(18, "validFromDate"),
        AGENCY_KEY(19, "agencyKey"),
        PASS_BOOK_ID(20, "passBookId"),
        ALERT(21, "alert"),
        ORIGIN_NAME(22, "originName"),
        DESTINATION_NAME(23, "destinationName"),
        PRODUCT_TYPE(24, "productType"),
        PRODUCT_SUB_TITLE(25, "productSubTitle");
        
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
                    return STATUS;
                case 4:
                    return NAME;
                case 5:
                    return TICKET_DESCRIPTION;
                case 6:
                    return PRICE;
                case 7:
                    return PURCHASE_DATE;
                case 8:
                    return EXPIRATION_DATE;
                case 10:
                    return ACTIVATION_DATE;
                case 11:
                    return ACTIVE_UNTIL;
                case 12:
                    return RECEIPT;
                case 13:
                    return AGENCY_NAME;
                case 14:
                    return AGENCY_ID;
                case 15:
                    return EMAIL;
                case 16:
                    return PHONE;
                case 17:
                    return BACKGROUND_IMAGE;
                case 18:
                    return VALID_FROM_DATE;
                case 19:
                    return AGENCY_KEY;
                case 20:
                    return PASS_BOOK_ID;
                case 21:
                    return ALERT;
                case 22:
                    return ORIGIN_NAME;
                case 23:
                    return DESTINATION_NAME;
                case 24:
                    return PRODUCT_TYPE;
                case 25:
                    return PRODUCT_SUB_TITLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicket$a */
    public static class C11058a extends C25239c<MVTicket> {
        public C11058a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicket mVTicket = (MVTicket) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTicket.price;
            C25113c cVar = MVTicket.f29140b;
            gVar.mo61687K();
            gVar.mo61711x(MVTicket.f29140b);
            gVar.mo61678B(mVTicket.providerId);
            gVar.mo61712y();
            if (mVTicket.f29165id != null) {
                gVar.mo61711x(MVTicket.f29141c);
                gVar.mo61686J(mVTicket.f29165id);
                gVar.mo61712y();
            }
            if (mVTicket.status != null) {
                gVar.mo61711x(MVTicket.f29142d);
                gVar.mo61678B(mVTicket.status.getValue());
                gVar.mo61712y();
            }
            if (mVTicket.name != null) {
                gVar.mo61711x(MVTicket.f29143e);
                gVar.mo61686J(mVTicket.name);
                gVar.mo61712y();
            }
            if (mVTicket.ticketDescription != null && mVTicket.mo33019G()) {
                gVar.mo61711x(MVTicket.f29144f);
                gVar.mo61686J(mVTicket.ticketDescription);
                gVar.mo61712y();
            }
            if (mVTicket.price != null) {
                gVar.mo61711x(MVTicket.f29145g);
                mVTicket.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTicket.f29146h);
            gVar.mo61679C(mVTicket.purchaseDate);
            gVar.mo61712y();
            if (mVTicket.mo33040p()) {
                gVar.mo61711x(MVTicket.f29147i);
                gVar.mo61679C(mVTicket.expirationDate);
                gVar.mo61712y();
            }
            if (mVTicket.mo33030f()) {
                gVar.mo61711x(MVTicket.f29148j);
                gVar.mo61679C(mVTicket.activationDate);
                gVar.mo61712y();
            }
            if (mVTicket.mo33031g()) {
                gVar.mo61711x(MVTicket.f29149k);
                gVar.mo61679C(mVTicket.activeUntil);
                gVar.mo61712y();
            }
            if (mVTicket.receipt != null && mVTicket.mo33017E()) {
                gVar.mo61711x(MVTicket.f29150l);
                mVTicket.receipt.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTicket.agencyName != null) {
                gVar.mo61711x(MVTicket.f29151m);
                gVar.mo61686J(mVTicket.agencyName);
                gVar.mo61712y();
            }
            if (mVTicket.mo33032h()) {
                gVar.mo61711x(MVTicket.f29152n);
                gVar.mo61678B(mVTicket.agencyId);
                gVar.mo61712y();
            }
            if (mVTicket.email != null && mVTicket.mo33039o()) {
                gVar.mo61711x(MVTicket.f29153o);
                gVar.mo61686J(mVTicket.email);
                gVar.mo61712y();
            }
            if (mVTicket.phone != null && mVTicket.mo33046u()) {
                gVar.mo61711x(MVTicket.f29154p);
                gVar.mo61686J(mVTicket.phone);
                gVar.mo61712y();
            }
            if (mVTicket.backgroundImage != null && mVTicket.mo33037l()) {
                gVar.mo61711x(MVTicket.f29155q);
                mVTicket.backgroundImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTicket.mo33020H()) {
                gVar.mo61711x(MVTicket.f29156r);
                gVar.mo61679C(mVTicket.validFromDate);
                gVar.mo61712y();
            }
            if (mVTicket.agencyKey != null) {
                gVar.mo61711x(MVTicket.f29157s);
                gVar.mo61686J(mVTicket.agencyKey);
                gVar.mo61712y();
            }
            if (mVTicket.passBookId != null && mVTicket.mo33044t()) {
                gVar.mo61711x(MVTicket.f29158t);
                gVar.mo61686J(mVTicket.passBookId);
                gVar.mo61712y();
            }
            if (mVTicket.alert != null && mVTicket.mo33036k()) {
                gVar.mo61711x(MVTicket.f29159u);
                gVar.mo61678B(mVTicket.alert.getValue());
                gVar.mo61712y();
            }
            if (mVTicket.originName != null && mVTicket.mo33043s()) {
                gVar.mo61711x(MVTicket.f29160v);
                gVar.mo61686J(mVTicket.originName);
                gVar.mo61712y();
            }
            if (mVTicket.destinationName != null && mVTicket.mo33038m()) {
                gVar.mo61711x(MVTicket.f29161w);
                gVar.mo61686J(mVTicket.destinationName);
                gVar.mo61712y();
            }
            if (mVTicket.productType != null && mVTicket.mo33049y()) {
                gVar.mo61711x(MVTicket.f29162x);
                gVar.mo61686J(mVTicket.productType);
                gVar.mo61712y();
            }
            if (mVTicket.productSubTitle != null && mVTicket.mo33048w()) {
                gVar.mo61711x(MVTicket.f29163y);
                gVar.mo61686J(mVTicket.productSubTitle);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicket mVTicket = (MVTicket) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTicket.price;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.providerId = gVar.mo61696i();
                            mVTicket.mo33025N();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.f29165id = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.status = MVTicketStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.name = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.ticketDescription = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVTicket.price = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.purchaseDate = gVar.mo61697j();
                            mVTicket.mo33026O();
                            break;
                        }
                    case 8:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.expirationDate = gVar.mo61697j();
                            mVTicket.mo33024M();
                            break;
                        }
                    case 10:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.activationDate = gVar.mo61697j();
                            mVTicket.mo33021I();
                            break;
                        }
                    case 11:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.activeUntil = gVar.mo61697j();
                            mVTicket.mo33022J();
                            break;
                        }
                    case 12:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTicketReceipt mVTicketReceipt = new MVTicketReceipt();
                            mVTicket.receipt = mVTicketReceipt;
                            mVTicketReceipt.mo25201C1(gVar);
                            break;
                        }
                    case 13:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.agencyName = gVar.mo61704q();
                            break;
                        }
                    case 14:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.agencyId = gVar.mo61696i();
                            mVTicket.mo33023L();
                            break;
                        }
                    case 15:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.email = gVar.mo61704q();
                            break;
                        }
                    case 16:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.phone = gVar.mo61704q();
                            break;
                        }
                    case 17:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVTicket.backgroundImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 18:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.validFromDate = gVar.mo61697j();
                            mVTicket.mo33027P();
                            break;
                        }
                    case 19:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 20:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.passBookId = gVar.mo61704q();
                            break;
                        }
                    case 21:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.alert = MVTicketAlert.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 22:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.originName = gVar.mo61704q();
                            break;
                        }
                    case 23:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.destinationName = gVar.mo61704q();
                            break;
                        }
                    case 24:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.productType = gVar.mo61704q();
                            break;
                        }
                    case 25:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTicket.productSubTitle = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicket$b */
    public static class C11059b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11058a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicket$c */
    public static class C11060c extends C25240d<MVTicket> {
        public C11060c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTicket mVTicket = (MVTicket) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTicket.mo33015A()) {
                bitSet.set(0);
            }
            if (mVTicket.mo33041q()) {
                bitSet.set(1);
            }
            if (mVTicket.mo33018F()) {
                bitSet.set(2);
            }
            if (mVTicket.mo33042r()) {
                bitSet.set(3);
            }
            if (mVTicket.mo33019G()) {
                bitSet.set(4);
            }
            if (mVTicket.mo33047v()) {
                bitSet.set(5);
            }
            if (mVTicket.mo33016D()) {
                bitSet.set(6);
            }
            if (mVTicket.mo33040p()) {
                bitSet.set(7);
            }
            if (mVTicket.mo33030f()) {
                bitSet.set(8);
            }
            if (mVTicket.mo33031g()) {
                bitSet.set(9);
            }
            if (mVTicket.mo33017E()) {
                bitSet.set(10);
            }
            if (mVTicket.mo33035j()) {
                bitSet.set(11);
            }
            if (mVTicket.mo33032h()) {
                bitSet.set(12);
            }
            if (mVTicket.mo33039o()) {
                bitSet.set(13);
            }
            if (mVTicket.mo33046u()) {
                bitSet.set(14);
            }
            if (mVTicket.mo33037l()) {
                bitSet.set(15);
            }
            if (mVTicket.mo33020H()) {
                bitSet.set(16);
            }
            if (mVTicket.mo33034i()) {
                bitSet.set(17);
            }
            if (mVTicket.mo33044t()) {
                bitSet.set(18);
            }
            if (mVTicket.mo33036k()) {
                bitSet.set(19);
            }
            if (mVTicket.mo33043s()) {
                bitSet.set(20);
            }
            if (mVTicket.mo33038m()) {
                bitSet.set(21);
            }
            if (mVTicket.mo33049y()) {
                bitSet.set(22);
            }
            if (mVTicket.mo33048w()) {
                bitSet.set(23);
            }
            jVar.mo61738U(bitSet, 24);
            if (mVTicket.mo33015A()) {
                jVar.mo61678B(mVTicket.providerId);
            }
            if (mVTicket.mo33041q()) {
                jVar.mo61686J(mVTicket.f29165id);
            }
            if (mVTicket.mo33018F()) {
                jVar.mo61678B(mVTicket.status.getValue());
            }
            if (mVTicket.mo33042r()) {
                jVar.mo61686J(mVTicket.name);
            }
            if (mVTicket.mo33019G()) {
                jVar.mo61686J(mVTicket.ticketDescription);
            }
            if (mVTicket.mo33047v()) {
                mVTicket.price.mo25202X0(jVar);
            }
            if (mVTicket.mo33016D()) {
                jVar.mo61679C(mVTicket.purchaseDate);
            }
            if (mVTicket.mo33040p()) {
                jVar.mo61679C(mVTicket.expirationDate);
            }
            if (mVTicket.mo33030f()) {
                jVar.mo61679C(mVTicket.activationDate);
            }
            if (mVTicket.mo33031g()) {
                jVar.mo61679C(mVTicket.activeUntil);
            }
            if (mVTicket.mo33017E()) {
                mVTicket.receipt.mo25202X0(jVar);
            }
            if (mVTicket.mo33035j()) {
                jVar.mo61686J(mVTicket.agencyName);
            }
            if (mVTicket.mo33032h()) {
                jVar.mo61678B(mVTicket.agencyId);
            }
            if (mVTicket.mo33039o()) {
                jVar.mo61686J(mVTicket.email);
            }
            if (mVTicket.mo33046u()) {
                jVar.mo61686J(mVTicket.phone);
            }
            if (mVTicket.mo33037l()) {
                mVTicket.backgroundImage.mo25202X0(jVar);
            }
            if (mVTicket.mo33020H()) {
                jVar.mo61679C(mVTicket.validFromDate);
            }
            if (mVTicket.mo33034i()) {
                jVar.mo61686J(mVTicket.agencyKey);
            }
            if (mVTicket.mo33044t()) {
                jVar.mo61686J(mVTicket.passBookId);
            }
            if (mVTicket.mo33036k()) {
                jVar.mo61678B(mVTicket.alert.getValue());
            }
            if (mVTicket.mo33043s()) {
                jVar.mo61686J(mVTicket.originName);
            }
            if (mVTicket.mo33038m()) {
                jVar.mo61686J(mVTicket.destinationName);
            }
            if (mVTicket.mo33049y()) {
                jVar.mo61686J(mVTicket.productType);
            }
            if (mVTicket.mo33048w()) {
                jVar.mo61686J(mVTicket.productSubTitle);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTicket mVTicket = (MVTicket) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(24);
            if (T.get(0)) {
                mVTicket.providerId = jVar.mo61696i();
                mVTicket.mo33025N();
            }
            if (T.get(1)) {
                mVTicket.f29165id = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTicket.status = MVTicketStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVTicket.name = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVTicket.ticketDescription = jVar.mo61704q();
            }
            if (T.get(5)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTicket.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVTicket.purchaseDate = jVar.mo61697j();
                mVTicket.mo33026O();
            }
            if (T.get(7)) {
                mVTicket.expirationDate = jVar.mo61697j();
                mVTicket.mo33024M();
            }
            if (T.get(8)) {
                mVTicket.activationDate = jVar.mo61697j();
                mVTicket.mo33021I();
            }
            if (T.get(9)) {
                mVTicket.activeUntil = jVar.mo61697j();
                mVTicket.mo33022J();
            }
            if (T.get(10)) {
                MVTicketReceipt mVTicketReceipt = new MVTicketReceipt();
                mVTicket.receipt = mVTicketReceipt;
                mVTicketReceipt.mo25201C1(jVar);
            }
            if (T.get(11)) {
                mVTicket.agencyName = jVar.mo61704q();
            }
            if (T.get(12)) {
                mVTicket.agencyId = jVar.mo61696i();
                mVTicket.mo33023L();
            }
            if (T.get(13)) {
                mVTicket.email = jVar.mo61704q();
            }
            if (T.get(14)) {
                mVTicket.phone = jVar.mo61704q();
            }
            if (T.get(15)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTicket.backgroundImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(16)) {
                mVTicket.validFromDate = jVar.mo61697j();
                mVTicket.mo33027P();
            }
            if (T.get(17)) {
                mVTicket.agencyKey = jVar.mo61704q();
            }
            if (T.get(18)) {
                mVTicket.passBookId = jVar.mo61704q();
            }
            if (T.get(19)) {
                mVTicket.alert = MVTicketAlert.findByValue(jVar.mo61696i());
            }
            if (T.get(20)) {
                mVTicket.originName = jVar.mo61704q();
            }
            if (T.get(21)) {
                mVTicket.destinationName = jVar.mo61704q();
            }
            if (T.get(22)) {
                mVTicket.productType = jVar.mo61704q();
            }
            if (T.get(23)) {
                mVTicket.productSubTitle = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVTicket$d */
    public static class C11061d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11060c(0);
        }
    }

    static {
        new C17394d0("MVTicket");
        HashMap hashMap = new HashMap();
        f29164z = hashMap;
        hashMap.put(C25239c.class, new C11059b());
        hashMap.put(C25240d.class, new C11061d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVTicketStatus.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TICKET_DESCRIPTION, new FieldMetaData("ticketDescription", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PURCHASE_DATE, new FieldMetaData("purchaseDate", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.EXPIRATION_DATE, new FieldMetaData("expirationDate", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ACTIVATION_DATE, new FieldMetaData("activationDate", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ACTIVE_UNTIL, new FieldMetaData("activeUntil", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.RECEIPT, new FieldMetaData("receipt", (byte) 2, new StructMetaData(MVTicketReceipt.class)));
        enumMap.put(_Fields.AGENCY_NAME, new FieldMetaData("agencyName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EMAIL, new FieldMetaData("email", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PHONE, new FieldMetaData("phone", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BACKGROUND_IMAGE, new FieldMetaData("backgroundImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.VALID_FROM_DATE, new FieldMetaData("validFromDate", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PASS_BOOK_ID, new FieldMetaData("passBookId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ALERT, new FieldMetaData("alert", (byte) 2, new EnumMetaData(MVTicketAlert.class)));
        enumMap.put(_Fields.ORIGIN_NAME, new FieldMetaData("originName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DESTINATION_NAME, new FieldMetaData("destinationName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRODUCT_TYPE, new FieldMetaData("productType", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRODUCT_SUB_TITLE, new FieldMetaData("productSubTitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29139A = unmodifiableMap;
        FieldMetaData.m61947a(MVTicket.class, unmodifiableMap);
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
    public final boolean mo33015A() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f29164z.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final boolean mo33016D() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: E */
    public final boolean mo33017E() {
        return this.receipt != null;
    }

    /* renamed from: F */
    public final boolean mo33018F() {
        return this.status != null;
    }

    /* renamed from: G */
    public final boolean mo33019G() {
        return this.ticketDescription != null;
    }

    /* renamed from: H */
    public final boolean mo33020H() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: I */
    public final void mo33021I() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: J */
    public final void mo33022J() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: L */
    public final void mo33023L() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: M */
    public final void mo33024M() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: N */
    public final void mo33025N() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: O */
    public final void mo33026O() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: P */
    public final void mo33027P() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29164z.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTicket mVTicket = (MVTicket) obj;
        if (!getClass().equals(mVTicket.getClass())) {
            return getClass().getName().compareTo(mVTicket.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33015A()).compareTo(Boolean.valueOf(mVTicket.mo33015A()));
        if (compareTo2 != 0 || ((mo33015A() && (compareTo2 = C25082a.m62839c(this.providerId, mVTicket.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo33041q()).compareTo(Boolean.valueOf(mVTicket.mo33041q()))) != 0 || ((mo33041q() && (compareTo2 = this.f29165id.compareTo(mVTicket.f29165id)) != 0) || (compareTo2 = Boolean.valueOf(mo33018F()).compareTo(Boolean.valueOf(mVTicket.mo33018F()))) != 0 || ((mo33018F() && (compareTo2 = this.status.compareTo(mVTicket.status)) != 0) || (compareTo2 = Boolean.valueOf(mo33042r()).compareTo(Boolean.valueOf(mVTicket.mo33042r()))) != 0 || ((mo33042r() && (compareTo2 = this.name.compareTo(mVTicket.name)) != 0) || (compareTo2 = Boolean.valueOf(mo33019G()).compareTo(Boolean.valueOf(mVTicket.mo33019G()))) != 0 || ((mo33019G() && (compareTo2 = this.ticketDescription.compareTo(mVTicket.ticketDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo33047v()).compareTo(Boolean.valueOf(mVTicket.mo33047v()))) != 0 || ((mo33047v() && (compareTo2 = this.price.compareTo(mVTicket.price)) != 0) || (compareTo2 = Boolean.valueOf(mo33016D()).compareTo(Boolean.valueOf(mVTicket.mo33016D()))) != 0 || ((mo33016D() && (compareTo2 = C25082a.m62840d(this.purchaseDate, mVTicket.purchaseDate)) != 0) || (compareTo2 = Boolean.valueOf(mo33040p()).compareTo(Boolean.valueOf(mVTicket.mo33040p()))) != 0 || ((mo33040p() && (compareTo2 = C25082a.m62840d(this.expirationDate, mVTicket.expirationDate)) != 0) || (compareTo2 = Boolean.valueOf(mo33030f()).compareTo(Boolean.valueOf(mVTicket.mo33030f()))) != 0 || ((mo33030f() && (compareTo2 = C25082a.m62840d(this.activationDate, mVTicket.activationDate)) != 0) || (compareTo2 = Boolean.valueOf(mo33031g()).compareTo(Boolean.valueOf(mVTicket.mo33031g()))) != 0 || ((mo33031g() && (compareTo2 = C25082a.m62840d(this.activeUntil, mVTicket.activeUntil)) != 0) || (compareTo2 = Boolean.valueOf(mo33017E()).compareTo(Boolean.valueOf(mVTicket.mo33017E()))) != 0 || ((mo33017E() && (compareTo2 = this.receipt.compareTo(mVTicket.receipt)) != 0) || (compareTo2 = Boolean.valueOf(mo33035j()).compareTo(Boolean.valueOf(mVTicket.mo33035j()))) != 0 || ((mo33035j() && (compareTo2 = this.agencyName.compareTo(mVTicket.agencyName)) != 0) || (compareTo2 = Boolean.valueOf(mo33032h()).compareTo(Boolean.valueOf(mVTicket.mo33032h()))) != 0 || ((mo33032h() && (compareTo2 = C25082a.m62839c(this.agencyId, mVTicket.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo33039o()).compareTo(Boolean.valueOf(mVTicket.mo33039o()))) != 0 || ((mo33039o() && (compareTo2 = this.email.compareTo(mVTicket.email)) != 0) || (compareTo2 = Boolean.valueOf(mo33046u()).compareTo(Boolean.valueOf(mVTicket.mo33046u()))) != 0 || ((mo33046u() && (compareTo2 = this.phone.compareTo(mVTicket.phone)) != 0) || (compareTo2 = Boolean.valueOf(mo33037l()).compareTo(Boolean.valueOf(mVTicket.mo33037l()))) != 0 || ((mo33037l() && (compareTo2 = this.backgroundImage.compareTo(mVTicket.backgroundImage)) != 0) || (compareTo2 = Boolean.valueOf(mo33020H()).compareTo(Boolean.valueOf(mVTicket.mo33020H()))) != 0 || ((mo33020H() && (compareTo2 = C25082a.m62840d(this.validFromDate, mVTicket.validFromDate)) != 0) || (compareTo2 = Boolean.valueOf(mo33034i()).compareTo(Boolean.valueOf(mVTicket.mo33034i()))) != 0 || ((mo33034i() && (compareTo2 = this.agencyKey.compareTo(mVTicket.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo33044t()).compareTo(Boolean.valueOf(mVTicket.mo33044t()))) != 0 || ((mo33044t() && (compareTo2 = this.passBookId.compareTo(mVTicket.passBookId)) != 0) || (compareTo2 = Boolean.valueOf(mo33036k()).compareTo(Boolean.valueOf(mVTicket.mo33036k()))) != 0 || ((mo33036k() && (compareTo2 = this.alert.compareTo(mVTicket.alert)) != 0) || (compareTo2 = Boolean.valueOf(mo33043s()).compareTo(Boolean.valueOf(mVTicket.mo33043s()))) != 0 || ((mo33043s() && (compareTo2 = this.originName.compareTo(mVTicket.originName)) != 0) || (compareTo2 = Boolean.valueOf(mo33038m()).compareTo(Boolean.valueOf(mVTicket.mo33038m()))) != 0 || ((mo33038m() && (compareTo2 = this.destinationName.compareTo(mVTicket.destinationName)) != 0) || (compareTo2 = Boolean.valueOf(mo33049y()).compareTo(Boolean.valueOf(mVTicket.mo33049y()))) != 0 || ((mo33049y() && (compareTo2 = this.productType.compareTo(mVTicket.productType)) != 0) || (compareTo2 = Boolean.valueOf(mo33048w()).compareTo(Boolean.valueOf(mVTicket.mo33048w()))) != 0)))))))))))))))))))))))) {
            return compareTo2;
        }
        if (!mo33048w() || (compareTo = this.productSubTitle.compareTo(mVTicket.productSubTitle)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTicket)) {
            return false;
        }
        MVTicket mVTicket = (MVTicket) obj;
        if (this.providerId != mVTicket.providerId) {
            return false;
        }
        boolean q = mo33041q();
        boolean q2 = mVTicket.mo33041q();
        if ((q || q2) && (!q || !q2 || !this.f29165id.equals(mVTicket.f29165id))) {
            return false;
        }
        boolean F = mo33018F();
        boolean F2 = mVTicket.mo33018F();
        if ((F || F2) && (!F || !F2 || !this.status.equals(mVTicket.status))) {
            return false;
        }
        boolean r = mo33042r();
        boolean r2 = mVTicket.mo33042r();
        if ((r || r2) && (!r || !r2 || !this.name.equals(mVTicket.name))) {
            return false;
        }
        boolean G = mo33019G();
        boolean G2 = mVTicket.mo33019G();
        if ((G || G2) && (!G || !G2 || !this.ticketDescription.equals(mVTicket.ticketDescription))) {
            return false;
        }
        boolean v = mo33047v();
        boolean v2 = mVTicket.mo33047v();
        if (((v || v2) && (!v || !v2 || !this.price.mo26102a(mVTicket.price))) || this.purchaseDate != mVTicket.purchaseDate) {
            return false;
        }
        boolean p = mo33040p();
        boolean p2 = mVTicket.mo33040p();
        if ((p || p2) && (!p || !p2 || this.expirationDate != mVTicket.expirationDate)) {
            return false;
        }
        boolean f = mo33030f();
        boolean f2 = mVTicket.mo33030f();
        if ((f || f2) && (!f || !f2 || this.activationDate != mVTicket.activationDate)) {
            return false;
        }
        boolean g = mo33031g();
        boolean g2 = mVTicket.mo33031g();
        if ((g || g2) && (!g || !g2 || this.activeUntil != mVTicket.activeUntil)) {
            return false;
        }
        boolean E = mo33017E();
        boolean E2 = mVTicket.mo33017E();
        if ((E || E2) && (!E || !E2 || !this.receipt.mo33110k(mVTicket.receipt))) {
            return false;
        }
        boolean j = mo33035j();
        boolean j2 = mVTicket.mo33035j();
        if ((j || j2) && (!j || !j2 || !this.agencyName.equals(mVTicket.agencyName))) {
            return false;
        }
        boolean h = mo33032h();
        boolean h2 = mVTicket.mo33032h();
        if ((h || h2) && (!h || !h2 || this.agencyId != mVTicket.agencyId)) {
            return false;
        }
        boolean o = mo33039o();
        boolean o2 = mVTicket.mo33039o();
        if ((o || o2) && (!o || !o2 || !this.email.equals(mVTicket.email))) {
            return false;
        }
        boolean u = mo33046u();
        boolean u2 = mVTicket.mo33046u();
        if ((u || u2) && (!u || !u2 || !this.phone.equals(mVTicket.phone))) {
            return false;
        }
        boolean l = mo33037l();
        boolean l2 = mVTicket.mo33037l();
        if ((l || l2) && (!l || !l2 || !this.backgroundImage.mo26245a(mVTicket.backgroundImage))) {
            return false;
        }
        boolean H = mo33020H();
        boolean H2 = mVTicket.mo33020H();
        if ((H || H2) && (!H || !H2 || this.validFromDate != mVTicket.validFromDate)) {
            return false;
        }
        boolean i = mo33034i();
        boolean i2 = mVTicket.mo33034i();
        if ((i || i2) && (!i || !i2 || !this.agencyKey.equals(mVTicket.agencyKey))) {
            return false;
        }
        boolean t = mo33044t();
        boolean t2 = mVTicket.mo33044t();
        if ((t || t2) && (!t || !t2 || !this.passBookId.equals(mVTicket.passBookId))) {
            return false;
        }
        boolean k = mo33036k();
        boolean k2 = mVTicket.mo33036k();
        if ((k || k2) && (!k || !k2 || !this.alert.equals(mVTicket.alert))) {
            return false;
        }
        boolean s = mo33043s();
        boolean s2 = mVTicket.mo33043s();
        if ((s || s2) && (!s || !s2 || !this.originName.equals(mVTicket.originName))) {
            return false;
        }
        boolean m = mo33038m();
        boolean m2 = mVTicket.mo33038m();
        if ((m || m2) && (!m || !m2 || !this.destinationName.equals(mVTicket.destinationName))) {
            return false;
        }
        boolean y = mo33049y();
        boolean y2 = mVTicket.mo33049y();
        if ((y || y2) && (!y || !y2 || !this.productType.equals(mVTicket.productType))) {
            return false;
        }
        boolean w = mo33048w();
        boolean w2 = mVTicket.mo33048w();
        if ((w || w2) && (!w || !w2 || !this.productSubTitle.equals(mVTicket.productSubTitle))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33030f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo33031g() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: h */
    public final boolean mo33032h() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33034i() {
        return this.agencyKey != null;
    }

    /* renamed from: j */
    public final boolean mo33035j() {
        return this.agencyName != null;
    }

    /* renamed from: k */
    public final boolean mo33036k() {
        return this.alert != null;
    }

    /* renamed from: l */
    public final boolean mo33037l() {
        return this.backgroundImage != null;
    }

    /* renamed from: m */
    public final boolean mo33038m() {
        return this.destinationName != null;
    }

    /* renamed from: o */
    public final boolean mo33039o() {
        return this.email != null;
    }

    /* renamed from: p */
    public final boolean mo33040p() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: q */
    public final boolean mo33041q() {
        return this.f29165id != null;
    }

    /* renamed from: r */
    public final boolean mo33042r() {
        return this.name != null;
    }

    /* renamed from: s */
    public final boolean mo33043s() {
        return this.originName != null;
    }

    /* renamed from: t */
    public final boolean mo33044t() {
        return this.passBookId != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTicket(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "id:");
        String str = this.f29165id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("status:");
        MVTicketStatus mVTicketStatus = this.status;
        if (mVTicketStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTicketStatus);
        }
        n.append(", ");
        n.append("name:");
        String str2 = this.name;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo33019G()) {
            n.append(", ");
            n.append("ticketDescription:");
            String str3 = this.ticketDescription;
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
        n.append("purchaseDate:");
        n.append(this.purchaseDate);
        if (mo33040p()) {
            n.append(", ");
            n.append("expirationDate:");
            n.append(this.expirationDate);
        }
        if (mo33030f()) {
            n.append(", ");
            n.append("activationDate:");
            n.append(this.activationDate);
        }
        if (mo33031g()) {
            n.append(", ");
            n.append("activeUntil:");
            n.append(this.activeUntil);
        }
        if (mo33017E()) {
            n.append(", ");
            n.append("receipt:");
            MVTicketReceipt mVTicketReceipt = this.receipt;
            if (mVTicketReceipt == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTicketReceipt);
            }
        }
        n.append(", ");
        n.append("agencyName:");
        String str4 = this.agencyName;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        if (mo33032h()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        if (mo33039o()) {
            n.append(", ");
            n.append("email:");
            String str5 = this.email;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        if (mo33046u()) {
            n.append(", ");
            n.append("phone:");
            String str6 = this.phone;
            if (str6 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str6);
            }
        }
        if (mo33037l()) {
            n.append(", ");
            n.append("backgroundImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.backgroundImage;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo33020H()) {
            n.append(", ");
            n.append("validFromDate:");
            n.append(this.validFromDate);
        }
        n.append(", ");
        n.append("agencyKey:");
        String str7 = this.agencyKey;
        if (str7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str7);
        }
        if (mo33044t()) {
            n.append(", ");
            n.append("passBookId:");
            String str8 = this.passBookId;
            if (str8 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str8);
            }
        }
        if (mo33036k()) {
            n.append(", ");
            n.append("alert:");
            MVTicketAlert mVTicketAlert = this.alert;
            if (mVTicketAlert == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTicketAlert);
            }
        }
        if (mo33043s()) {
            n.append(", ");
            n.append("originName:");
            String str9 = this.originName;
            if (str9 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str9);
            }
        }
        if (mo33038m()) {
            n.append(", ");
            n.append("destinationName:");
            String str10 = this.destinationName;
            if (str10 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str10);
            }
        }
        if (mo33049y()) {
            n.append(", ");
            n.append("productType:");
            String str11 = this.productType;
            if (str11 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str11);
            }
        }
        if (mo33048w()) {
            n.append(", ");
            n.append("productSubTitle:");
            String str12 = this.productSubTitle;
            if (str12 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str12);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo33046u() {
        return this.phone != null;
    }

    /* renamed from: v */
    public final boolean mo33047v() {
        return this.price != null;
    }

    /* renamed from: w */
    public final boolean mo33048w() {
        return this.productSubTitle != null;
    }

    /* renamed from: y */
    public final boolean mo33049y() {
        return this.productType != null;
    }
}
