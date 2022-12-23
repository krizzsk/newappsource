package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
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

public class MVTripPlanTodBanner implements TBase<MVTripPlanTodBanner, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanTodBanner> {

    /* renamed from: b */
    public static final C25113c f30195b = new C25113c("sectionId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30196c = new C25113c("isRegistered", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f30197d = new C25113c("pickupDuration", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30198e = new C25113c("rideDuration", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30199f = new C25113c("providerCustomerId", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f30200g = new C25113c("taxiId", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f30201h = new C25113c("approxPickupTime", (byte) 10, 7);

    /* renamed from: i */
    public static final C25113c f30202i = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f30203j = new C25113c("messageTitle", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f30204k = new C25113c("messageSubtitle", (byte) 11, 10);

    /* renamed from: l */
    public static final C25113c f30205l = new C25113c("messageActionUrl", (byte) 11, 11);

    /* renamed from: m */
    public static final C25113c f30206m = new C25113c("messageActionText", (byte) 11, 12);

    /* renamed from: n */
    public static final C25113c f30207n = new C25113c("approxArrivalTime", (byte) 10, 13);

    /* renamed from: o */
    public static final C25113c f30208o = new C25113c("bannerId", (byte) 11, 14);

    /* renamed from: p */
    public static final HashMap f30209p;

    /* renamed from: q */
    public static final Map<_Fields, FieldMetaData> f30210q;
    private byte __isset_bitfield = 0;
    public long approxArrivalTime;
    public long approxPickupTime;
    public String bannerId;
    public boolean isRegistered;
    public String messageActionText;
    public String messageActionUrl;
    public String messageSubtitle;
    public String messageTitle;
    private _Fields[] optionals = {_Fields.IS_REGISTERED, _Fields.PICKUP_DURATION, _Fields.RIDE_DURATION, _Fields.PROVIDER_CUSTOMER_ID, _Fields.TAXI_ID, _Fields.APPROX_PICKUP_TIME, _Fields.PRICE, _Fields.MESSAGE_TITLE, _Fields.MESSAGE_SUBTITLE, _Fields.MESSAGE_ACTION_URL, _Fields.MESSAGE_ACTION_TEXT, _Fields.APPROX_ARRIVAL_TIME, _Fields.BANNER_ID};
    public int pickupDuration;
    public MVCurrencyAmount price;
    public String providerCustomerId;
    public int rideDuration;
    public int sectionId;
    public int taxiId;

    public enum _Fields implements C25085c {
        SECTION_ID(1, "sectionId"),
        IS_REGISTERED(2, "isRegistered"),
        PICKUP_DURATION(3, "pickupDuration"),
        RIDE_DURATION(4, "rideDuration"),
        PROVIDER_CUSTOMER_ID(5, "providerCustomerId"),
        TAXI_ID(6, "taxiId"),
        APPROX_PICKUP_TIME(7, "approxPickupTime"),
        PRICE(8, InAppPurchaseMetaData.KEY_PRICE),
        MESSAGE_TITLE(9, "messageTitle"),
        MESSAGE_SUBTITLE(10, "messageSubtitle"),
        MESSAGE_ACTION_URL(11, "messageActionUrl"),
        MESSAGE_ACTION_TEXT(12, "messageActionText"),
        APPROX_ARRIVAL_TIME(13, "approxArrivalTime"),
        BANNER_ID(14, "bannerId");
        
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
                    return SECTION_ID;
                case 2:
                    return IS_REGISTERED;
                case 3:
                    return PICKUP_DURATION;
                case 4:
                    return RIDE_DURATION;
                case 5:
                    return PROVIDER_CUSTOMER_ID;
                case 6:
                    return TAXI_ID;
                case 7:
                    return APPROX_PICKUP_TIME;
                case 8:
                    return PRICE;
                case 9:
                    return MESSAGE_TITLE;
                case 10:
                    return MESSAGE_SUBTITLE;
                case 11:
                    return MESSAGE_ACTION_URL;
                case 12:
                    return MESSAGE_ACTION_TEXT;
                case 13:
                    return APPROX_ARRIVAL_TIME;
                case 14:
                    return BANNER_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTodBanner$a */
    public static class C11693a extends C25239c<MVTripPlanTodBanner> {
        public C11693a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanTodBanner mVTripPlanTodBanner = (MVTripPlanTodBanner) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTripPlanTodBanner.price;
            C25113c cVar = MVTripPlanTodBanner.f30195b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripPlanTodBanner.f30195b);
            gVar.mo61678B(mVTripPlanTodBanner.sectionId);
            gVar.mo61712y();
            if (mVTripPlanTodBanner.mo34778i()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30196c);
                gVar.mo61708u(mVTripPlanTodBanner.isRegistered);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.mo34783o()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30197d);
                gVar.mo61678B(mVTripPlanTodBanner.pickupDuration);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.mo34786r()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30198e);
                gVar.mo61678B(mVTripPlanTodBanner.rideDuration);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.providerCustomerId != null && mVTripPlanTodBanner.mo34785q()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30199f);
                gVar.mo61686J(mVTripPlanTodBanner.providerCustomerId);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.mo34788t()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30200g);
                gVar.mo61678B(mVTripPlanTodBanner.taxiId);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.mo34775g()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30201h);
                gVar.mo61679C(mVTripPlanTodBanner.approxPickupTime);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.price != null && mVTripPlanTodBanner.mo34784p()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30202i);
                mVTripPlanTodBanner.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.messageTitle != null && mVTripPlanTodBanner.mo34782m()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30203j);
                gVar.mo61686J(mVTripPlanTodBanner.messageTitle);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.messageSubtitle != null && mVTripPlanTodBanner.mo34781l()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30204k);
                gVar.mo61686J(mVTripPlanTodBanner.messageSubtitle);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.messageActionUrl != null && mVTripPlanTodBanner.mo34780k()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30205l);
                gVar.mo61686J(mVTripPlanTodBanner.messageActionUrl);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.messageActionText != null && mVTripPlanTodBanner.mo34779j()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30206m);
                gVar.mo61686J(mVTripPlanTodBanner.messageActionText);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.mo34774f()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30207n);
                gVar.mo61679C(mVTripPlanTodBanner.approxArrivalTime);
                gVar.mo61712y();
            }
            if (mVTripPlanTodBanner.bannerId != null && mVTripPlanTodBanner.mo34776h()) {
                gVar.mo61711x(MVTripPlanTodBanner.f30208o);
                gVar.mo61686J(mVTripPlanTodBanner.bannerId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanTodBanner mVTripPlanTodBanner = (MVTripPlanTodBanner) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTripPlanTodBanner.price;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.sectionId = gVar.mo61696i();
                            mVTripPlanTodBanner.mo34770D();
                            break;
                        }
                    case 2:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.isRegistered = gVar.mo61690c();
                            mVTripPlanTodBanner.mo34792w();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.pickupDuration = gVar.mo61696i();
                            mVTripPlanTodBanner.mo34793y();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.rideDuration = gVar.mo61696i();
                            mVTripPlanTodBanner.mo34769A();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.providerCustomerId = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.taxiId = gVar.mo61696i();
                            mVTripPlanTodBanner.mo34771E();
                            break;
                        }
                    case 7:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.approxPickupTime = gVar.mo61697j();
                            mVTripPlanTodBanner.mo34791v();
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVTripPlanTodBanner.price = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.messageTitle = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.messageSubtitle = gVar.mo61704q();
                            break;
                        }
                    case 11:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.messageActionUrl = gVar.mo61704q();
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.messageActionText = gVar.mo61704q();
                            break;
                        }
                    case 13:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.approxArrivalTime = gVar.mo61697j();
                            mVTripPlanTodBanner.mo34790u();
                            break;
                        }
                    case 14:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanTodBanner.bannerId = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTodBanner$b */
    public static class C11694b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11693a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTodBanner$c */
    public static class C11695c extends C25240d<MVTripPlanTodBanner> {
        public C11695c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanTodBanner mVTripPlanTodBanner = (MVTripPlanTodBanner) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanTodBanner.mo34787s()) {
                bitSet.set(0);
            }
            if (mVTripPlanTodBanner.mo34778i()) {
                bitSet.set(1);
            }
            if (mVTripPlanTodBanner.mo34783o()) {
                bitSet.set(2);
            }
            if (mVTripPlanTodBanner.mo34786r()) {
                bitSet.set(3);
            }
            if (mVTripPlanTodBanner.mo34785q()) {
                bitSet.set(4);
            }
            if (mVTripPlanTodBanner.mo34788t()) {
                bitSet.set(5);
            }
            if (mVTripPlanTodBanner.mo34775g()) {
                bitSet.set(6);
            }
            if (mVTripPlanTodBanner.mo34784p()) {
                bitSet.set(7);
            }
            if (mVTripPlanTodBanner.mo34782m()) {
                bitSet.set(8);
            }
            if (mVTripPlanTodBanner.mo34781l()) {
                bitSet.set(9);
            }
            if (mVTripPlanTodBanner.mo34780k()) {
                bitSet.set(10);
            }
            if (mVTripPlanTodBanner.mo34779j()) {
                bitSet.set(11);
            }
            if (mVTripPlanTodBanner.mo34774f()) {
                bitSet.set(12);
            }
            if (mVTripPlanTodBanner.mo34776h()) {
                bitSet.set(13);
            }
            jVar.mo61738U(bitSet, 14);
            if (mVTripPlanTodBanner.mo34787s()) {
                jVar.mo61678B(mVTripPlanTodBanner.sectionId);
            }
            if (mVTripPlanTodBanner.mo34778i()) {
                jVar.mo61708u(mVTripPlanTodBanner.isRegistered);
            }
            if (mVTripPlanTodBanner.mo34783o()) {
                jVar.mo61678B(mVTripPlanTodBanner.pickupDuration);
            }
            if (mVTripPlanTodBanner.mo34786r()) {
                jVar.mo61678B(mVTripPlanTodBanner.rideDuration);
            }
            if (mVTripPlanTodBanner.mo34785q()) {
                jVar.mo61686J(mVTripPlanTodBanner.providerCustomerId);
            }
            if (mVTripPlanTodBanner.mo34788t()) {
                jVar.mo61678B(mVTripPlanTodBanner.taxiId);
            }
            if (mVTripPlanTodBanner.mo34775g()) {
                jVar.mo61679C(mVTripPlanTodBanner.approxPickupTime);
            }
            if (mVTripPlanTodBanner.mo34784p()) {
                mVTripPlanTodBanner.price.mo25202X0(jVar);
            }
            if (mVTripPlanTodBanner.mo34782m()) {
                jVar.mo61686J(mVTripPlanTodBanner.messageTitle);
            }
            if (mVTripPlanTodBanner.mo34781l()) {
                jVar.mo61686J(mVTripPlanTodBanner.messageSubtitle);
            }
            if (mVTripPlanTodBanner.mo34780k()) {
                jVar.mo61686J(mVTripPlanTodBanner.messageActionUrl);
            }
            if (mVTripPlanTodBanner.mo34779j()) {
                jVar.mo61686J(mVTripPlanTodBanner.messageActionText);
            }
            if (mVTripPlanTodBanner.mo34774f()) {
                jVar.mo61679C(mVTripPlanTodBanner.approxArrivalTime);
            }
            if (mVTripPlanTodBanner.mo34776h()) {
                jVar.mo61686J(mVTripPlanTodBanner.bannerId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanTodBanner mVTripPlanTodBanner = (MVTripPlanTodBanner) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(14);
            if (T.get(0)) {
                mVTripPlanTodBanner.sectionId = jVar.mo61696i();
                mVTripPlanTodBanner.mo34770D();
            }
            if (T.get(1)) {
                mVTripPlanTodBanner.isRegistered = jVar.mo61690c();
                mVTripPlanTodBanner.mo34792w();
            }
            if (T.get(2)) {
                mVTripPlanTodBanner.pickupDuration = jVar.mo61696i();
                mVTripPlanTodBanner.mo34793y();
            }
            if (T.get(3)) {
                mVTripPlanTodBanner.rideDuration = jVar.mo61696i();
                mVTripPlanTodBanner.mo34769A();
            }
            if (T.get(4)) {
                mVTripPlanTodBanner.providerCustomerId = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVTripPlanTodBanner.taxiId = jVar.mo61696i();
                mVTripPlanTodBanner.mo34771E();
            }
            if (T.get(6)) {
                mVTripPlanTodBanner.approxPickupTime = jVar.mo61697j();
                mVTripPlanTodBanner.mo34791v();
            }
            if (T.get(7)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTripPlanTodBanner.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(8)) {
                mVTripPlanTodBanner.messageTitle = jVar.mo61704q();
            }
            if (T.get(9)) {
                mVTripPlanTodBanner.messageSubtitle = jVar.mo61704q();
            }
            if (T.get(10)) {
                mVTripPlanTodBanner.messageActionUrl = jVar.mo61704q();
            }
            if (T.get(11)) {
                mVTripPlanTodBanner.messageActionText = jVar.mo61704q();
            }
            if (T.get(12)) {
                mVTripPlanTodBanner.approxArrivalTime = jVar.mo61697j();
                mVTripPlanTodBanner.mo34790u();
            }
            if (T.get(13)) {
                mVTripPlanTodBanner.bannerId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTodBanner$d */
    public static class C11696d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11695c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanTodBanner");
        HashMap hashMap = new HashMap();
        f30209p = hashMap;
        hashMap.put(C25239c.class, new C11694b());
        hashMap.put(C25240d.class, new C11696d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SECTION_ID, new FieldMetaData("sectionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS_REGISTERED, new FieldMetaData("isRegistered", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PICKUP_DURATION, new FieldMetaData("pickupDuration", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RIDE_DURATION, new FieldMetaData("rideDuration", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PROVIDER_CUSTOMER_ID, new FieldMetaData("providerCustomerId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TAXI_ID, new FieldMetaData("taxiId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.APPROX_PICKUP_TIME, new FieldMetaData("approxPickupTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.MESSAGE_TITLE, new FieldMetaData("messageTitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MESSAGE_SUBTITLE, new FieldMetaData("messageSubtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MESSAGE_ACTION_URL, new FieldMetaData("messageActionUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MESSAGE_ACTION_TEXT, new FieldMetaData("messageActionText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.APPROX_ARRIVAL_TIME, new FieldMetaData("approxArrivalTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.BANNER_ID, new FieldMetaData("bannerId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30210q = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanTodBanner.class, unmodifiableMap);
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
    public final void mo34769A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f30209p.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo34770D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: E */
    public final void mo34771E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30209p.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanTodBanner mVTripPlanTodBanner = (MVTripPlanTodBanner) obj;
        if (!getClass().equals(mVTripPlanTodBanner.getClass())) {
            return getClass().getName().compareTo(mVTripPlanTodBanner.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34787s()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34787s()));
        if (compareTo2 != 0 || ((mo34787s() && (compareTo2 = C25082a.m62839c(this.sectionId, mVTripPlanTodBanner.sectionId)) != 0) || (compareTo2 = Boolean.valueOf(mo34778i()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34778i()))) != 0 || ((mo34778i() && (compareTo2 = C25082a.m62848l(this.isRegistered, mVTripPlanTodBanner.isRegistered)) != 0) || (compareTo2 = Boolean.valueOf(mo34783o()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34783o()))) != 0 || ((mo34783o() && (compareTo2 = C25082a.m62839c(this.pickupDuration, mVTripPlanTodBanner.pickupDuration)) != 0) || (compareTo2 = Boolean.valueOf(mo34786r()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34786r()))) != 0 || ((mo34786r() && (compareTo2 = C25082a.m62839c(this.rideDuration, mVTripPlanTodBanner.rideDuration)) != 0) || (compareTo2 = Boolean.valueOf(mo34785q()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34785q()))) != 0 || ((mo34785q() && (compareTo2 = this.providerCustomerId.compareTo(mVTripPlanTodBanner.providerCustomerId)) != 0) || (compareTo2 = Boolean.valueOf(mo34788t()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34788t()))) != 0 || ((mo34788t() && (compareTo2 = C25082a.m62839c(this.taxiId, mVTripPlanTodBanner.taxiId)) != 0) || (compareTo2 = Boolean.valueOf(mo34775g()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34775g()))) != 0 || ((mo34775g() && (compareTo2 = C25082a.m62840d(this.approxPickupTime, mVTripPlanTodBanner.approxPickupTime)) != 0) || (compareTo2 = Boolean.valueOf(mo34784p()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34784p()))) != 0 || ((mo34784p() && (compareTo2 = this.price.compareTo(mVTripPlanTodBanner.price)) != 0) || (compareTo2 = Boolean.valueOf(mo34782m()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34782m()))) != 0 || ((mo34782m() && (compareTo2 = this.messageTitle.compareTo(mVTripPlanTodBanner.messageTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo34781l()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34781l()))) != 0 || ((mo34781l() && (compareTo2 = this.messageSubtitle.compareTo(mVTripPlanTodBanner.messageSubtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo34780k()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34780k()))) != 0 || ((mo34780k() && (compareTo2 = this.messageActionUrl.compareTo(mVTripPlanTodBanner.messageActionUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo34779j()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34779j()))) != 0 || ((mo34779j() && (compareTo2 = this.messageActionText.compareTo(mVTripPlanTodBanner.messageActionText)) != 0) || (compareTo2 = Boolean.valueOf(mo34774f()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34774f()))) != 0 || ((mo34774f() && (compareTo2 = C25082a.m62840d(this.approxArrivalTime, mVTripPlanTodBanner.approxArrivalTime)) != 0) || (compareTo2 = Boolean.valueOf(mo34776h()).compareTo(Boolean.valueOf(mVTripPlanTodBanner.mo34776h()))) != 0)))))))))))))) {
            return compareTo2;
        }
        if (!mo34776h() || (compareTo = this.bannerId.compareTo(mVTripPlanTodBanner.bannerId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripPlanTodBanner)) {
            return false;
        }
        MVTripPlanTodBanner mVTripPlanTodBanner = (MVTripPlanTodBanner) obj;
        if (this.sectionId != mVTripPlanTodBanner.sectionId) {
            return false;
        }
        boolean i = mo34778i();
        boolean i2 = mVTripPlanTodBanner.mo34778i();
        if ((i || i2) && (!i || !i2 || this.isRegistered != mVTripPlanTodBanner.isRegistered)) {
            return false;
        }
        boolean o = mo34783o();
        boolean o2 = mVTripPlanTodBanner.mo34783o();
        if ((o || o2) && (!o || !o2 || this.pickupDuration != mVTripPlanTodBanner.pickupDuration)) {
            return false;
        }
        boolean r = mo34786r();
        boolean r2 = mVTripPlanTodBanner.mo34786r();
        if ((r || r2) && (!r || !r2 || this.rideDuration != mVTripPlanTodBanner.rideDuration)) {
            return false;
        }
        boolean q = mo34785q();
        boolean q2 = mVTripPlanTodBanner.mo34785q();
        if ((q || q2) && (!q || !q2 || !this.providerCustomerId.equals(mVTripPlanTodBanner.providerCustomerId))) {
            return false;
        }
        boolean t = mo34788t();
        boolean t2 = mVTripPlanTodBanner.mo34788t();
        if ((t || t2) && (!t || !t2 || this.taxiId != mVTripPlanTodBanner.taxiId)) {
            return false;
        }
        boolean g = mo34775g();
        boolean g2 = mVTripPlanTodBanner.mo34775g();
        if ((g || g2) && (!g || !g2 || this.approxPickupTime != mVTripPlanTodBanner.approxPickupTime)) {
            return false;
        }
        boolean p = mo34784p();
        boolean p2 = mVTripPlanTodBanner.mo34784p();
        if ((p || p2) && (!p || !p2 || !this.price.mo26102a(mVTripPlanTodBanner.price))) {
            return false;
        }
        boolean m = mo34782m();
        boolean m2 = mVTripPlanTodBanner.mo34782m();
        if ((m || m2) && (!m || !m2 || !this.messageTitle.equals(mVTripPlanTodBanner.messageTitle))) {
            return false;
        }
        boolean l = mo34781l();
        boolean l2 = mVTripPlanTodBanner.mo34781l();
        if ((l || l2) && (!l || !l2 || !this.messageSubtitle.equals(mVTripPlanTodBanner.messageSubtitle))) {
            return false;
        }
        boolean k = mo34780k();
        boolean k2 = mVTripPlanTodBanner.mo34780k();
        if ((k || k2) && (!k || !k2 || !this.messageActionUrl.equals(mVTripPlanTodBanner.messageActionUrl))) {
            return false;
        }
        boolean j = mo34779j();
        boolean j2 = mVTripPlanTodBanner.mo34779j();
        if ((j || j2) && (!j || !j2 || !this.messageActionText.equals(mVTripPlanTodBanner.messageActionText))) {
            return false;
        }
        boolean f = mo34774f();
        boolean f2 = mVTripPlanTodBanner.mo34774f();
        if ((f || f2) && (!f || !f2 || this.approxArrivalTime != mVTripPlanTodBanner.approxArrivalTime)) {
            return false;
        }
        boolean h = mo34776h();
        boolean h2 = mVTripPlanTodBanner.mo34776h();
        if ((h || h2) && (!h || !h2 || !this.bannerId.equals(mVTripPlanTodBanner.bannerId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34774f() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: g */
    public final boolean mo34775g() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: h */
    public final boolean mo34776h() {
        return this.bannerId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34778i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo34779j() {
        return this.messageActionText != null;
    }

    /* renamed from: k */
    public final boolean mo34780k() {
        return this.messageActionUrl != null;
    }

    /* renamed from: l */
    public final boolean mo34781l() {
        return this.messageSubtitle != null;
    }

    /* renamed from: m */
    public final boolean mo34782m() {
        return this.messageTitle != null;
    }

    /* renamed from: o */
    public final boolean mo34783o() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: p */
    public final boolean mo34784p() {
        return this.price != null;
    }

    /* renamed from: q */
    public final boolean mo34785q() {
        return this.providerCustomerId != null;
    }

    /* renamed from: r */
    public final boolean mo34786r() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: s */
    public final boolean mo34787s() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: t */
    public final boolean mo34788t() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanTodBanner(", "sectionId:");
        n.append(this.sectionId);
        if (mo34778i()) {
            n.append(", ");
            n.append("isRegistered:");
            n.append(this.isRegistered);
        }
        if (mo34783o()) {
            n.append(", ");
            n.append("pickupDuration:");
            n.append(this.pickupDuration);
        }
        if (mo34786r()) {
            n.append(", ");
            n.append("rideDuration:");
            n.append(this.rideDuration);
        }
        if (mo34785q()) {
            n.append(", ");
            n.append("providerCustomerId:");
            String str = this.providerCustomerId;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo34788t()) {
            n.append(", ");
            n.append("taxiId:");
            n.append(this.taxiId);
        }
        if (mo34775g()) {
            n.append(", ");
            n.append("approxPickupTime:");
            n.append(this.approxPickupTime);
        }
        if (mo34784p()) {
            n.append(", ");
            n.append("price:");
            MVCurrencyAmount mVCurrencyAmount = this.price;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo34782m()) {
            n.append(", ");
            n.append("messageTitle:");
            String str2 = this.messageTitle;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo34781l()) {
            n.append(", ");
            n.append("messageSubtitle:");
            String str3 = this.messageSubtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo34780k()) {
            n.append(", ");
            n.append("messageActionUrl:");
            String str4 = this.messageActionUrl;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo34779j()) {
            n.append(", ");
            n.append("messageActionText:");
            String str5 = this.messageActionText;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        if (mo34774f()) {
            n.append(", ");
            n.append("approxArrivalTime:");
            n.append(this.approxArrivalTime);
        }
        if (mo34776h()) {
            n.append(", ");
            n.append("bannerId:");
            String str6 = this.bannerId;
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
    public final void mo34790u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: v */
    public final void mo34791v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: w */
    public final void mo34792w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: y */
    public final void mo34793y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }
}
