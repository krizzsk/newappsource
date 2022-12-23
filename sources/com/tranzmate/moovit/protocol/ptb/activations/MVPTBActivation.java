package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVPTBActivation implements TBase<MVPTBActivation, _Fields>, Serializable, Cloneable, Comparable<MVPTBActivation> {

    /* renamed from: b */
    public static final C25113c f27815b = new C25113c("activationId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27816c = new C25113c("activationTime", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f27817d = new C25113c("activationTitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27818e = new C25113c("activationPrice", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27819f = new C25113c("profileName", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f27820g = new C25113c("isAnonymous", (byte) 2, 6);

    /* renamed from: h */
    public static final C25113c f27821h = new C25113c("agencyName", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f27822i = new C25113c("agencyId", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f27823j = new C25113c("ticketStatus", (byte) 8, 10);

    /* renamed from: k */
    public static final C25113c f27824k = new C25113c("backgroundImage", (byte) 12, 11);

    /* renamed from: l */
    public static final C25113c f27825l = new C25113c("qrCode", (byte) 11, 12);

    /* renamed from: m */
    public static final C25113c f27826m = new C25113c("fromStopId", (byte) 8, 13);

    /* renamed from: n */
    public static final C25113c f27827n = new C25113c("toStopId", (byte) 8, 14);

    /* renamed from: o */
    public static final C25113c f27828o = new C25113c("activationCompletionTime", (byte) 10, 15);

    /* renamed from: p */
    public static final C25113c f27829p = new C25113c("transitType", (byte) 8, 16);

    /* renamed from: q */
    public static final C25113c f27830q = new C25113c("fareInfo", (byte) 12, 17);

    /* renamed from: r */
    public static final HashMap f27831r;

    /* renamed from: s */
    public static final Map<_Fields, FieldMetaData> f27832s;
    private byte __isset_bitfield = 0;
    public long activationCompletionTime;
    public int activationId;
    public MVPTBActivationPrice activationPrice;
    public long activationTime;
    public String activationTitle;
    public int agencyId;
    public String agencyName;
    public MVImageReferenceWithParams backgroundImage;
    public MVPTBFareInfo fareInfo;
    public int fromStopId;
    public boolean isAnonymous;
    private _Fields[] optionals = {_Fields.ACTIVATION_PRICE, _Fields.AGENCY_ID, _Fields.BACKGROUND_IMAGE, _Fields.QR_CODE, _Fields.FROM_STOP_ID, _Fields.TO_STOP_ID, _Fields.ACTIVATION_COMPLETION_TIME, _Fields.FARE_INFO};
    public String profileName;
    public String qrCode;
    public MVPTBActivationStatus ticketStatus;
    public int toStopId;
    public MVPTBTransitType transitType;

    public enum _Fields implements C25085c {
        ACTIVATION_ID(1, "activationId"),
        ACTIVATION_TIME(2, "activationTime"),
        ACTIVATION_TITLE(3, "activationTitle"),
        ACTIVATION_PRICE(4, "activationPrice"),
        PROFILE_NAME(5, "profileName"),
        IS_ANONYMOUS(6, "isAnonymous"),
        AGENCY_NAME(7, "agencyName"),
        AGENCY_ID(8, "agencyId"),
        TICKET_STATUS(10, "ticketStatus"),
        BACKGROUND_IMAGE(11, "backgroundImage"),
        QR_CODE(12, "qrCode"),
        FROM_STOP_ID(13, "fromStopId"),
        TO_STOP_ID(14, "toStopId"),
        ACTIVATION_COMPLETION_TIME(15, "activationCompletionTime"),
        TRANSIT_TYPE(16, "transitType"),
        FARE_INFO(17, "fareInfo");
        
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
                    return ACTIVATION_ID;
                case 2:
                    return ACTIVATION_TIME;
                case 3:
                    return ACTIVATION_TITLE;
                case 4:
                    return ACTIVATION_PRICE;
                case 5:
                    return PROFILE_NAME;
                case 6:
                    return IS_ANONYMOUS;
                case 7:
                    return AGENCY_NAME;
                case 8:
                    return AGENCY_ID;
                case 10:
                    return TICKET_STATUS;
                case 11:
                    return BACKGROUND_IMAGE;
                case 12:
                    return QR_CODE;
                case 13:
                    return FROM_STOP_ID;
                case 14:
                    return TO_STOP_ID;
                case 15:
                    return ACTIVATION_COMPLETION_TIME;
                case 16:
                    return TRANSIT_TYPE;
                case 17:
                    return FARE_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivation$a */
    public static class C10157a extends C25239c<MVPTBActivation> {
        public C10157a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivation mVPTBActivation = (MVPTBActivation) tBase;
            MVPTBActivationPrice mVPTBActivationPrice = mVPTBActivation.activationPrice;
            if (mVPTBActivationPrice != null) {
                mVPTBActivationPrice.mo30836i();
            }
            C25113c cVar = MVPTBActivation.f27815b;
            gVar.mo61687K();
            gVar.mo61711x(MVPTBActivation.f27815b);
            gVar.mo61678B(mVPTBActivation.activationId);
            gVar.mo61712y();
            gVar.mo61711x(MVPTBActivation.f27816c);
            gVar.mo61679C(mVPTBActivation.activationTime);
            gVar.mo61712y();
            if (mVPTBActivation.activationTitle != null) {
                gVar.mo61711x(MVPTBActivation.f27817d);
                gVar.mo61686J(mVPTBActivation.activationTitle);
                gVar.mo61712y();
            }
            if (mVPTBActivation.activationPrice != null && mVPTBActivation.mo30810h()) {
                gVar.mo61711x(MVPTBActivation.f27818e);
                mVPTBActivation.activationPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBActivation.profileName != null) {
                gVar.mo61711x(MVPTBActivation.f27819f);
                gVar.mo61686J(mVPTBActivation.profileName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPTBActivation.f27820g);
            gVar.mo61708u(mVPTBActivation.isAnonymous);
            gVar.mo61712y();
            if (mVPTBActivation.agencyName != null) {
                gVar.mo61711x(MVPTBActivation.f27821h);
                gVar.mo61686J(mVPTBActivation.agencyName);
                gVar.mo61712y();
            }
            if (mVPTBActivation.mo30814k()) {
                gVar.mo61711x(MVPTBActivation.f27822i);
                gVar.mo61678B(mVPTBActivation.agencyId);
                gVar.mo61712y();
            }
            if (mVPTBActivation.ticketStatus != null) {
                gVar.mo61711x(MVPTBActivation.f27823j);
                gVar.mo61678B(mVPTBActivation.ticketStatus.getValue());
                gVar.mo61712y();
            }
            if (mVPTBActivation.backgroundImage != null && mVPTBActivation.mo30816m()) {
                gVar.mo61711x(MVPTBActivation.f27824k);
                mVPTBActivation.backgroundImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBActivation.qrCode != null && mVPTBActivation.mo30821s()) {
                gVar.mo61711x(MVPTBActivation.f27825l);
                gVar.mo61686J(mVPTBActivation.qrCode);
                gVar.mo61712y();
            }
            if (mVPTBActivation.mo30818p()) {
                gVar.mo61711x(MVPTBActivation.f27826m);
                gVar.mo61678B(mVPTBActivation.fromStopId);
                gVar.mo61712y();
            }
            if (mVPTBActivation.mo30824u()) {
                gVar.mo61711x(MVPTBActivation.f27827n);
                gVar.mo61678B(mVPTBActivation.toStopId);
                gVar.mo61712y();
            }
            if (mVPTBActivation.mo30808f()) {
                gVar.mo61711x(MVPTBActivation.f27828o);
                gVar.mo61679C(mVPTBActivation.activationCompletionTime);
                gVar.mo61712y();
            }
            if (mVPTBActivation.transitType != null) {
                gVar.mo61711x(MVPTBActivation.f27829p);
                gVar.mo61678B(mVPTBActivation.transitType.getValue());
                gVar.mo61712y();
            }
            if (mVPTBActivation.fareInfo != null && mVPTBActivation.mo30817o()) {
                gVar.mo61711x(MVPTBActivation.f27830q);
                mVPTBActivation.fareInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivation mVPTBActivation = (MVPTBActivation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPTBActivationPrice mVPTBActivationPrice = mVPTBActivation.activationPrice;
                    if (mVPTBActivationPrice != null) {
                        mVPTBActivationPrice.mo30836i();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.activationId = gVar.mo61696i();
                            mVPTBActivation.mo30827y();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.activationTime = gVar.mo61697j();
                            mVPTBActivation.mo30801A();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.activationTitle = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPTBActivationPrice mVPTBActivationPrice2 = new MVPTBActivationPrice();
                            mVPTBActivation.activationPrice = mVPTBActivationPrice2;
                            mVPTBActivationPrice2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.profileName = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.isAnonymous = gVar.mo61690c();
                            mVPTBActivation.mo30804F();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.agencyName = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.agencyId = gVar.mo61696i();
                            mVPTBActivation.mo30802D();
                            break;
                        }
                    case 10:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.ticketStatus = MVPTBActivationStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 11:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVPTBActivation.backgroundImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.qrCode = gVar.mo61704q();
                            break;
                        }
                    case 13:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.fromStopId = gVar.mo61696i();
                            mVPTBActivation.mo30803E();
                            break;
                        }
                    case 14:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.toStopId = gVar.mo61696i();
                            mVPTBActivation.mo30805G();
                            break;
                        }
                    case 15:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.activationCompletionTime = gVar.mo61697j();
                            mVPTBActivation.mo30826w();
                            break;
                        }
                    case 16:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBActivation.transitType = MVPTBTransitType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 17:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPTBFareInfo mVPTBFareInfo = new MVPTBFareInfo();
                            mVPTBActivation.fareInfo = mVPTBFareInfo;
                            mVPTBFareInfo.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivation$b */
    public static class C10158b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10157a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivation$c */
    public static class C10159c extends C25240d<MVPTBActivation> {
        public C10159c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivation mVPTBActivation = (MVPTBActivation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBActivation.mo30809g()) {
                bitSet.set(0);
            }
            if (mVPTBActivation.mo30812i()) {
                bitSet.set(1);
            }
            if (mVPTBActivation.mo30813j()) {
                bitSet.set(2);
            }
            if (mVPTBActivation.mo30810h()) {
                bitSet.set(3);
            }
            if (mVPTBActivation.mo30820r()) {
                bitSet.set(4);
            }
            if (mVPTBActivation.mo30819q()) {
                bitSet.set(5);
            }
            if (mVPTBActivation.mo30815l()) {
                bitSet.set(6);
            }
            if (mVPTBActivation.mo30814k()) {
                bitSet.set(7);
            }
            if (mVPTBActivation.mo30822t()) {
                bitSet.set(8);
            }
            if (mVPTBActivation.mo30816m()) {
                bitSet.set(9);
            }
            if (mVPTBActivation.mo30821s()) {
                bitSet.set(10);
            }
            if (mVPTBActivation.mo30818p()) {
                bitSet.set(11);
            }
            if (mVPTBActivation.mo30824u()) {
                bitSet.set(12);
            }
            if (mVPTBActivation.mo30808f()) {
                bitSet.set(13);
            }
            if (mVPTBActivation.mo30825v()) {
                bitSet.set(14);
            }
            if (mVPTBActivation.mo30817o()) {
                bitSet.set(15);
            }
            jVar.mo61738U(bitSet, 16);
            if (mVPTBActivation.mo30809g()) {
                jVar.mo61678B(mVPTBActivation.activationId);
            }
            if (mVPTBActivation.mo30812i()) {
                jVar.mo61679C(mVPTBActivation.activationTime);
            }
            if (mVPTBActivation.mo30813j()) {
                jVar.mo61686J(mVPTBActivation.activationTitle);
            }
            if (mVPTBActivation.mo30810h()) {
                mVPTBActivation.activationPrice.mo25202X0(jVar);
            }
            if (mVPTBActivation.mo30820r()) {
                jVar.mo61686J(mVPTBActivation.profileName);
            }
            if (mVPTBActivation.mo30819q()) {
                jVar.mo61708u(mVPTBActivation.isAnonymous);
            }
            if (mVPTBActivation.mo30815l()) {
                jVar.mo61686J(mVPTBActivation.agencyName);
            }
            if (mVPTBActivation.mo30814k()) {
                jVar.mo61678B(mVPTBActivation.agencyId);
            }
            if (mVPTBActivation.mo30822t()) {
                jVar.mo61678B(mVPTBActivation.ticketStatus.getValue());
            }
            if (mVPTBActivation.mo30816m()) {
                mVPTBActivation.backgroundImage.mo25202X0(jVar);
            }
            if (mVPTBActivation.mo30821s()) {
                jVar.mo61686J(mVPTBActivation.qrCode);
            }
            if (mVPTBActivation.mo30818p()) {
                jVar.mo61678B(mVPTBActivation.fromStopId);
            }
            if (mVPTBActivation.mo30824u()) {
                jVar.mo61678B(mVPTBActivation.toStopId);
            }
            if (mVPTBActivation.mo30808f()) {
                jVar.mo61679C(mVPTBActivation.activationCompletionTime);
            }
            if (mVPTBActivation.mo30825v()) {
                jVar.mo61678B(mVPTBActivation.transitType.getValue());
            }
            if (mVPTBActivation.mo30817o()) {
                mVPTBActivation.fareInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivation mVPTBActivation = (MVPTBActivation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(16);
            if (T.get(0)) {
                mVPTBActivation.activationId = jVar.mo61696i();
                mVPTBActivation.mo30827y();
            }
            if (T.get(1)) {
                mVPTBActivation.activationTime = jVar.mo61697j();
                mVPTBActivation.mo30801A();
            }
            if (T.get(2)) {
                mVPTBActivation.activationTitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVPTBActivationPrice mVPTBActivationPrice = new MVPTBActivationPrice();
                mVPTBActivation.activationPrice = mVPTBActivationPrice;
                mVPTBActivationPrice.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVPTBActivation.profileName = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVPTBActivation.isAnonymous = jVar.mo61690c();
                mVPTBActivation.mo30804F();
            }
            if (T.get(6)) {
                mVPTBActivation.agencyName = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVPTBActivation.agencyId = jVar.mo61696i();
                mVPTBActivation.mo30802D();
            }
            if (T.get(8)) {
                mVPTBActivation.ticketStatus = MVPTBActivationStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(9)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVPTBActivation.backgroundImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(10)) {
                mVPTBActivation.qrCode = jVar.mo61704q();
            }
            if (T.get(11)) {
                mVPTBActivation.fromStopId = jVar.mo61696i();
                mVPTBActivation.mo30803E();
            }
            if (T.get(12)) {
                mVPTBActivation.toStopId = jVar.mo61696i();
                mVPTBActivation.mo30805G();
            }
            if (T.get(13)) {
                mVPTBActivation.activationCompletionTime = jVar.mo61697j();
                mVPTBActivation.mo30826w();
            }
            if (T.get(14)) {
                mVPTBActivation.transitType = MVPTBTransitType.findByValue(jVar.mo61696i());
            }
            if (T.get(15)) {
                MVPTBFareInfo mVPTBFareInfo = new MVPTBFareInfo();
                mVPTBActivation.fareInfo = mVPTBFareInfo;
                mVPTBFareInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivation$d */
    public static class C10160d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10159c(0);
        }
    }

    static {
        new C17394d0("MVPTBActivation");
        HashMap hashMap = new HashMap();
        f27831r = hashMap;
        hashMap.put(C25239c.class, new C10158b());
        hashMap.put(C25240d.class, new C10160d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACTIVATION_ID, new FieldMetaData("activationId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ACTIVATION_TIME, new FieldMetaData("activationTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ACTIVATION_TITLE, new FieldMetaData("activationTitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTIVATION_PRICE, new FieldMetaData("activationPrice", (byte) 2, new StructMetaData(MVPTBActivationPrice.class)));
        enumMap.put(_Fields.PROFILE_NAME, new FieldMetaData("profileName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_ANONYMOUS, new FieldMetaData("isAnonymous", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.AGENCY_NAME, new FieldMetaData("agencyName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TICKET_STATUS, new FieldMetaData("ticketStatus", (byte) 3, new EnumMetaData(MVPTBActivationStatus.class)));
        enumMap.put(_Fields.BACKGROUND_IMAGE, new FieldMetaData("backgroundImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.QR_CODE, new FieldMetaData("qrCode", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FROM_STOP_ID, new FieldMetaData("fromStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TO_STOP_ID, new FieldMetaData("toStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ACTIVATION_COMPLETION_TIME, new FieldMetaData("activationCompletionTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TRANSIT_TYPE, new FieldMetaData("transitType", (byte) 3, new EnumMetaData(MVPTBTransitType.class)));
        enumMap.put(_Fields.FARE_INFO, new FieldMetaData("fareInfo", (byte) 2, new StructMetaData(MVPTBFareInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27832s = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBActivation.class, unmodifiableMap);
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
    public final void mo30801A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f27831r.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo30802D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: E */
    public final void mo30803E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: F */
    public final void mo30804F() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: G */
    public final void mo30805G() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27831r.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBActivation mVPTBActivation = (MVPTBActivation) obj;
        if (!getClass().equals(mVPTBActivation.getClass())) {
            return getClass().getName().compareTo(mVPTBActivation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30809g()).compareTo(Boolean.valueOf(mVPTBActivation.mo30809g()));
        if (compareTo2 != 0 || ((mo30809g() && (compareTo2 = C25082a.m62839c(this.activationId, mVPTBActivation.activationId)) != 0) || (compareTo2 = Boolean.valueOf(mo30812i()).compareTo(Boolean.valueOf(mVPTBActivation.mo30812i()))) != 0 || ((mo30812i() && (compareTo2 = C25082a.m62840d(this.activationTime, mVPTBActivation.activationTime)) != 0) || (compareTo2 = Boolean.valueOf(mo30813j()).compareTo(Boolean.valueOf(mVPTBActivation.mo30813j()))) != 0 || ((mo30813j() && (compareTo2 = this.activationTitle.compareTo(mVPTBActivation.activationTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo30810h()).compareTo(Boolean.valueOf(mVPTBActivation.mo30810h()))) != 0 || ((mo30810h() && (compareTo2 = this.activationPrice.compareTo(mVPTBActivation.activationPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo30820r()).compareTo(Boolean.valueOf(mVPTBActivation.mo30820r()))) != 0 || ((mo30820r() && (compareTo2 = this.profileName.compareTo(mVPTBActivation.profileName)) != 0) || (compareTo2 = Boolean.valueOf(mo30819q()).compareTo(Boolean.valueOf(mVPTBActivation.mo30819q()))) != 0 || ((mo30819q() && (compareTo2 = C25082a.m62848l(this.isAnonymous, mVPTBActivation.isAnonymous)) != 0) || (compareTo2 = Boolean.valueOf(mo30815l()).compareTo(Boolean.valueOf(mVPTBActivation.mo30815l()))) != 0 || ((mo30815l() && (compareTo2 = this.agencyName.compareTo(mVPTBActivation.agencyName)) != 0) || (compareTo2 = Boolean.valueOf(mo30814k()).compareTo(Boolean.valueOf(mVPTBActivation.mo30814k()))) != 0 || ((mo30814k() && (compareTo2 = C25082a.m62839c(this.agencyId, mVPTBActivation.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo30822t()).compareTo(Boolean.valueOf(mVPTBActivation.mo30822t()))) != 0 || ((mo30822t() && (compareTo2 = this.ticketStatus.compareTo(mVPTBActivation.ticketStatus)) != 0) || (compareTo2 = Boolean.valueOf(mo30816m()).compareTo(Boolean.valueOf(mVPTBActivation.mo30816m()))) != 0 || ((mo30816m() && (compareTo2 = this.backgroundImage.compareTo(mVPTBActivation.backgroundImage)) != 0) || (compareTo2 = Boolean.valueOf(mo30821s()).compareTo(Boolean.valueOf(mVPTBActivation.mo30821s()))) != 0 || ((mo30821s() && (compareTo2 = this.qrCode.compareTo(mVPTBActivation.qrCode)) != 0) || (compareTo2 = Boolean.valueOf(mo30818p()).compareTo(Boolean.valueOf(mVPTBActivation.mo30818p()))) != 0 || ((mo30818p() && (compareTo2 = C25082a.m62839c(this.fromStopId, mVPTBActivation.fromStopId)) != 0) || (compareTo2 = Boolean.valueOf(mo30824u()).compareTo(Boolean.valueOf(mVPTBActivation.mo30824u()))) != 0 || ((mo30824u() && (compareTo2 = C25082a.m62839c(this.toStopId, mVPTBActivation.toStopId)) != 0) || (compareTo2 = Boolean.valueOf(mo30808f()).compareTo(Boolean.valueOf(mVPTBActivation.mo30808f()))) != 0 || ((mo30808f() && (compareTo2 = C25082a.m62840d(this.activationCompletionTime, mVPTBActivation.activationCompletionTime)) != 0) || (compareTo2 = Boolean.valueOf(mo30825v()).compareTo(Boolean.valueOf(mVPTBActivation.mo30825v()))) != 0 || ((mo30825v() && (compareTo2 = this.transitType.compareTo(mVPTBActivation.transitType)) != 0) || (compareTo2 = Boolean.valueOf(mo30817o()).compareTo(Boolean.valueOf(mVPTBActivation.mo30817o()))) != 0)))))))))))))))) {
            return compareTo2;
        }
        if (!mo30817o() || (compareTo = this.fareInfo.compareTo(mVPTBActivation.fareInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBActivation)) {
            return false;
        }
        MVPTBActivation mVPTBActivation = (MVPTBActivation) obj;
        if (this.activationId != mVPTBActivation.activationId || this.activationTime != mVPTBActivation.activationTime) {
            return false;
        }
        boolean j = mo30813j();
        boolean j2 = mVPTBActivation.mo30813j();
        if ((j || j2) && (!j || !j2 || !this.activationTitle.equals(mVPTBActivation.activationTitle))) {
            return false;
        }
        boolean h = mo30810h();
        boolean h2 = mVPTBActivation.mo30810h();
        if ((h || h2) && (!h || !h2 || !this.activationPrice.mo30829a(mVPTBActivation.activationPrice))) {
            return false;
        }
        boolean r = mo30820r();
        boolean r2 = mVPTBActivation.mo30820r();
        if (((r || r2) && (!r || !r2 || !this.profileName.equals(mVPTBActivation.profileName))) || this.isAnonymous != mVPTBActivation.isAnonymous) {
            return false;
        }
        boolean l = mo30815l();
        boolean l2 = mVPTBActivation.mo30815l();
        if ((l || l2) && (!l || !l2 || !this.agencyName.equals(mVPTBActivation.agencyName))) {
            return false;
        }
        boolean k = mo30814k();
        boolean k2 = mVPTBActivation.mo30814k();
        if ((k || k2) && (!k || !k2 || this.agencyId != mVPTBActivation.agencyId)) {
            return false;
        }
        boolean t = mo30822t();
        boolean t2 = mVPTBActivation.mo30822t();
        if ((t || t2) && (!t || !t2 || !this.ticketStatus.equals(mVPTBActivation.ticketStatus))) {
            return false;
        }
        boolean m = mo30816m();
        boolean m2 = mVPTBActivation.mo30816m();
        if ((m || m2) && (!m || !m2 || !this.backgroundImage.mo26245a(mVPTBActivation.backgroundImage))) {
            return false;
        }
        boolean s = mo30821s();
        boolean s2 = mVPTBActivation.mo30821s();
        if ((s || s2) && (!s || !s2 || !this.qrCode.equals(mVPTBActivation.qrCode))) {
            return false;
        }
        boolean p = mo30818p();
        boolean p2 = mVPTBActivation.mo30818p();
        if ((p || p2) && (!p || !p2 || this.fromStopId != mVPTBActivation.fromStopId)) {
            return false;
        }
        boolean u = mo30824u();
        boolean u2 = mVPTBActivation.mo30824u();
        if ((u || u2) && (!u || !u2 || this.toStopId != mVPTBActivation.toStopId)) {
            return false;
        }
        boolean f = mo30808f();
        boolean f2 = mVPTBActivation.mo30808f();
        if ((f || f2) && (!f || !f2 || this.activationCompletionTime != mVPTBActivation.activationCompletionTime)) {
            return false;
        }
        boolean v = mo30825v();
        boolean v2 = mVPTBActivation.mo30825v();
        if ((v || v2) && (!v || !v2 || !this.transitType.equals(mVPTBActivation.transitType))) {
            return false;
        }
        boolean o = mo30817o();
        boolean o2 = mVPTBActivation.mo30817o();
        if ((o || o2) && (!o || !o2 || !this.fareInfo.mo30924a(mVPTBActivation.fareInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30808f() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: g */
    public final boolean mo30809g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo30810h() {
        return this.activationPrice != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30812i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo30813j() {
        return this.activationTitle != null;
    }

    /* renamed from: k */
    public final boolean mo30814k() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: l */
    public final boolean mo30815l() {
        return this.agencyName != null;
    }

    /* renamed from: m */
    public final boolean mo30816m() {
        return this.backgroundImage != null;
    }

    /* renamed from: o */
    public final boolean mo30817o() {
        return this.fareInfo != null;
    }

    /* renamed from: p */
    public final boolean mo30818p() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: q */
    public final boolean mo30819q() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: r */
    public final boolean mo30820r() {
        return this.profileName != null;
    }

    /* renamed from: s */
    public final boolean mo30821s() {
        return this.qrCode != null;
    }

    /* renamed from: t */
    public final boolean mo30822t() {
        return this.ticketStatus != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBActivation(", "activationId:");
        C0016g.m42z(n, this.activationId, ", ", "activationTime:");
        C25541a.m63889t(n, this.activationTime, ", ", "activationTitle:");
        String str = this.activationTitle;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30810h()) {
            n.append(", ");
            n.append("activationPrice:");
            MVPTBActivationPrice mVPTBActivationPrice = this.activationPrice;
            if (mVPTBActivationPrice == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPTBActivationPrice);
            }
        }
        n.append(", ");
        n.append("profileName:");
        String str2 = this.profileName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("isAnonymous:");
        C13555b.m33977q(n, this.isAnonymous, ", ", "agencyName:");
        String str3 = this.agencyName;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo30814k()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        n.append(", ");
        n.append("ticketStatus:");
        MVPTBActivationStatus mVPTBActivationStatus = this.ticketStatus;
        if (mVPTBActivationStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBActivationStatus);
        }
        if (mo30816m()) {
            n.append(", ");
            n.append("backgroundImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.backgroundImage;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo30821s()) {
            n.append(", ");
            n.append("qrCode:");
            String str4 = this.qrCode;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo30818p()) {
            n.append(", ");
            n.append("fromStopId:");
            n.append(this.fromStopId);
        }
        if (mo30824u()) {
            n.append(", ");
            n.append("toStopId:");
            n.append(this.toStopId);
        }
        if (mo30808f()) {
            n.append(", ");
            n.append("activationCompletionTime:");
            n.append(this.activationCompletionTime);
        }
        n.append(", ");
        n.append("transitType:");
        MVPTBTransitType mVPTBTransitType = this.transitType;
        if (mVPTBTransitType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBTransitType);
        }
        if (mo30817o()) {
            n.append(", ");
            n.append("fareInfo:");
            MVPTBFareInfo mVPTBFareInfo = this.fareInfo;
            if (mVPTBFareInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPTBFareInfo);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo30824u() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: v */
    public final boolean mo30825v() {
        return this.transitType != null;
    }

    /* renamed from: w */
    public final void mo30826w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: y */
    public final void mo30827y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }
}
