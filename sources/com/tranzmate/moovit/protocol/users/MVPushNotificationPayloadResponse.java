package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails;
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

public class MVPushNotificationPayloadResponse implements TBase<MVPushNotificationPayloadResponse, _Fields>, Serializable, Cloneable, Comparable<MVPushNotificationPayloadResponse> {

    /* renamed from: b */
    public static final C25113c f30503b = new C25113c("notificationPayload", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30504c = new C25113c("serviceAlert", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f30505d = new C25113c("presentationType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30506e = new C25113c("buttonText", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30507f = new C25113c("isPushPopup", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f30508g = new C25113c("popupNotificationText", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f30509h = new C25113c("messageBarScreen", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f30510i = new C25113c("messageBarColor", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f30511j = new C25113c("messageBarImageId", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f30512k = new C25113c("notificationChannel", (byte) 11, 10);

    /* renamed from: l */
    public static final HashMap f30513l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f30514m;
    private byte __isset_bitfield = 0;
    public String buttonText;
    public boolean isPushPopup;
    public int messageBarColor;
    public int messageBarImageId;
    public String messageBarScreen;
    public String notificationChannel;
    public MVNotificationPayload notificationPayload;
    private _Fields[] optionals = {_Fields.SERVICE_ALERT, _Fields.PRESENTATION_TYPE, _Fields.BUTTON_TEXT, _Fields.IS_PUSH_POPUP, _Fields.POPUP_NOTIFICATION_TEXT, _Fields.MESSAGE_BAR_SCREEN, _Fields.MESSAGE_BAR_COLOR, _Fields.MESSAGE_BAR_IMAGE_ID};
    public String popupNotificationText;
    public MVPushPresentationType presentationType;
    public MVServiceAlertDetails serviceAlert;

    public enum _Fields implements C25085c {
        NOTIFICATION_PAYLOAD(1, "notificationPayload"),
        SERVICE_ALERT(2, "serviceAlert"),
        PRESENTATION_TYPE(3, "presentationType"),
        BUTTON_TEXT(4, "buttonText"),
        IS_PUSH_POPUP(5, "isPushPopup"),
        POPUP_NOTIFICATION_TEXT(6, "popupNotificationText"),
        MESSAGE_BAR_SCREEN(7, "messageBarScreen"),
        MESSAGE_BAR_COLOR(8, "messageBarColor"),
        MESSAGE_BAR_IMAGE_ID(9, "messageBarImageId"),
        NOTIFICATION_CHANNEL(10, "notificationChannel");
        
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
                    return NOTIFICATION_PAYLOAD;
                case 2:
                    return SERVICE_ALERT;
                case 3:
                    return PRESENTATION_TYPE;
                case 4:
                    return BUTTON_TEXT;
                case 5:
                    return IS_PUSH_POPUP;
                case 6:
                    return POPUP_NOTIFICATION_TEXT;
                case 7:
                    return MESSAGE_BAR_SCREEN;
                case 8:
                    return MESSAGE_BAR_COLOR;
                case 9:
                    return MESSAGE_BAR_IMAGE_ID;
                case 10:
                    return NOTIFICATION_CHANNEL;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadResponse$a */
    public static class C11877a extends C25239c<MVPushNotificationPayloadResponse> {
        public C11877a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationPayloadResponse mVPushNotificationPayloadResponse = (MVPushNotificationPayloadResponse) tBase;
            MVNotificationPayload mVNotificationPayload = mVPushNotificationPayloadResponse.notificationPayload;
            MVServiceAlertDetails mVServiceAlertDetails = mVPushNotificationPayloadResponse.serviceAlert;
            if (mVServiceAlertDetails != null) {
                mVServiceAlertDetails.mo31644w();
            }
            C25113c cVar = MVPushNotificationPayloadResponse.f30503b;
            gVar.mo61687K();
            if (mVPushNotificationPayloadResponse.notificationPayload != null) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30503b);
                mVPushNotificationPayloadResponse.notificationPayload.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPushNotificationPayloadResponse.serviceAlert != null && mVPushNotificationPayloadResponse.mo35293p()) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30504c);
                mVPushNotificationPayloadResponse.serviceAlert.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPushNotificationPayloadResponse.presentationType != null && mVPushNotificationPayloadResponse.mo35292o()) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30505d);
                gVar.mo61678B(mVPushNotificationPayloadResponse.presentationType.getValue());
                gVar.mo61712y();
            }
            if (mVPushNotificationPayloadResponse.buttonText != null && mVPushNotificationPayloadResponse.mo35283f()) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30506e);
                gVar.mo61686J(mVPushNotificationPayloadResponse.buttonText);
                gVar.mo61712y();
            }
            if (mVPushNotificationPayloadResponse.mo35284g()) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30507f);
                gVar.mo61708u(mVPushNotificationPayloadResponse.isPushPopup);
                gVar.mo61712y();
            }
            if (mVPushNotificationPayloadResponse.popupNotificationText != null && mVPushNotificationPayloadResponse.mo35291m()) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30508g);
                gVar.mo61686J(mVPushNotificationPayloadResponse.popupNotificationText);
                gVar.mo61712y();
            }
            if (mVPushNotificationPayloadResponse.messageBarScreen != null && mVPushNotificationPayloadResponse.mo35288j()) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30509h);
                gVar.mo61686J(mVPushNotificationPayloadResponse.messageBarScreen);
                gVar.mo61712y();
            }
            if (mVPushNotificationPayloadResponse.mo35285h()) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30510i);
                gVar.mo61678B(mVPushNotificationPayloadResponse.messageBarColor);
                gVar.mo61712y();
            }
            if (mVPushNotificationPayloadResponse.mo35287i()) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30511j);
                gVar.mo61678B(mVPushNotificationPayloadResponse.messageBarImageId);
                gVar.mo61712y();
            }
            if (mVPushNotificationPayloadResponse.notificationChannel != null) {
                gVar.mo61711x(MVPushNotificationPayloadResponse.f30512k);
                gVar.mo61686J(mVPushNotificationPayloadResponse.notificationChannel);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationPayloadResponse mVPushNotificationPayloadResponse = (MVPushNotificationPayloadResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVNotificationPayload mVNotificationPayload = mVPushNotificationPayloadResponse.notificationPayload;
                    MVServiceAlertDetails mVServiceAlertDetails = mVPushNotificationPayloadResponse.serviceAlert;
                    if (mVServiceAlertDetails != null) {
                        mVServiceAlertDetails.mo31644w();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVNotificationPayload mVNotificationPayload2 = new MVNotificationPayload();
                            mVPushNotificationPayloadResponse.notificationPayload = mVNotificationPayload2;
                            mVNotificationPayload2.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVServiceAlertDetails mVServiceAlertDetails2 = new MVServiceAlertDetails();
                            mVPushNotificationPayloadResponse.serviceAlert = mVServiceAlertDetails2;
                            mVServiceAlertDetails2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPushNotificationPayloadResponse.presentationType = MVPushPresentationType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPushNotificationPayloadResponse.buttonText = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPushNotificationPayloadResponse.isPushPopup = gVar.mo61690c();
                            mVPushNotificationPayloadResponse.mo35294q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPushNotificationPayloadResponse.popupNotificationText = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPushNotificationPayloadResponse.messageBarScreen = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPushNotificationPayloadResponse.messageBarColor = gVar.mo61696i();
                            mVPushNotificationPayloadResponse.mo35295r();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPushNotificationPayloadResponse.messageBarImageId = gVar.mo61696i();
                            mVPushNotificationPayloadResponse.mo35296s();
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPushNotificationPayloadResponse.notificationChannel = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadResponse$b */
    public static class C11878b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11877a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadResponse$c */
    public static class C11879c extends C25240d<MVPushNotificationPayloadResponse> {
        public C11879c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationPayloadResponse mVPushNotificationPayloadResponse = (MVPushNotificationPayloadResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPushNotificationPayloadResponse.mo35290l()) {
                bitSet.set(0);
            }
            if (mVPushNotificationPayloadResponse.mo35293p()) {
                bitSet.set(1);
            }
            if (mVPushNotificationPayloadResponse.mo35292o()) {
                bitSet.set(2);
            }
            if (mVPushNotificationPayloadResponse.mo35283f()) {
                bitSet.set(3);
            }
            if (mVPushNotificationPayloadResponse.mo35284g()) {
                bitSet.set(4);
            }
            if (mVPushNotificationPayloadResponse.mo35291m()) {
                bitSet.set(5);
            }
            if (mVPushNotificationPayloadResponse.mo35288j()) {
                bitSet.set(6);
            }
            if (mVPushNotificationPayloadResponse.mo35285h()) {
                bitSet.set(7);
            }
            if (mVPushNotificationPayloadResponse.mo35287i()) {
                bitSet.set(8);
            }
            if (mVPushNotificationPayloadResponse.mo35289k()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVPushNotificationPayloadResponse.mo35290l()) {
                mVPushNotificationPayloadResponse.notificationPayload.mo25202X0(jVar);
            }
            if (mVPushNotificationPayloadResponse.mo35293p()) {
                mVPushNotificationPayloadResponse.serviceAlert.mo25202X0(jVar);
            }
            if (mVPushNotificationPayloadResponse.mo35292o()) {
                jVar.mo61678B(mVPushNotificationPayloadResponse.presentationType.getValue());
            }
            if (mVPushNotificationPayloadResponse.mo35283f()) {
                jVar.mo61686J(mVPushNotificationPayloadResponse.buttonText);
            }
            if (mVPushNotificationPayloadResponse.mo35284g()) {
                jVar.mo61708u(mVPushNotificationPayloadResponse.isPushPopup);
            }
            if (mVPushNotificationPayloadResponse.mo35291m()) {
                jVar.mo61686J(mVPushNotificationPayloadResponse.popupNotificationText);
            }
            if (mVPushNotificationPayloadResponse.mo35288j()) {
                jVar.mo61686J(mVPushNotificationPayloadResponse.messageBarScreen);
            }
            if (mVPushNotificationPayloadResponse.mo35285h()) {
                jVar.mo61678B(mVPushNotificationPayloadResponse.messageBarColor);
            }
            if (mVPushNotificationPayloadResponse.mo35287i()) {
                jVar.mo61678B(mVPushNotificationPayloadResponse.messageBarImageId);
            }
            if (mVPushNotificationPayloadResponse.mo35289k()) {
                jVar.mo61686J(mVPushNotificationPayloadResponse.notificationChannel);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationPayloadResponse mVPushNotificationPayloadResponse = (MVPushNotificationPayloadResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                MVNotificationPayload mVNotificationPayload = new MVNotificationPayload();
                mVPushNotificationPayloadResponse.notificationPayload = mVNotificationPayload;
                mVNotificationPayload.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVServiceAlertDetails mVServiceAlertDetails = new MVServiceAlertDetails();
                mVPushNotificationPayloadResponse.serviceAlert = mVServiceAlertDetails;
                mVServiceAlertDetails.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPushNotificationPayloadResponse.presentationType = MVPushPresentationType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVPushNotificationPayloadResponse.buttonText = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVPushNotificationPayloadResponse.isPushPopup = jVar.mo61690c();
                mVPushNotificationPayloadResponse.mo35294q();
            }
            if (T.get(5)) {
                mVPushNotificationPayloadResponse.popupNotificationText = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVPushNotificationPayloadResponse.messageBarScreen = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVPushNotificationPayloadResponse.messageBarColor = jVar.mo61696i();
                mVPushNotificationPayloadResponse.mo35295r();
            }
            if (T.get(8)) {
                mVPushNotificationPayloadResponse.messageBarImageId = jVar.mo61696i();
                mVPushNotificationPayloadResponse.mo35296s();
            }
            if (T.get(9)) {
                mVPushNotificationPayloadResponse.notificationChannel = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPushNotificationPayloadResponse$d */
    public static class C11880d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11879c(0);
        }
    }

    static {
        new C17394d0("MVPushNotificationPayloadResponse");
        HashMap hashMap = new HashMap();
        f30513l = hashMap;
        hashMap.put(C25239c.class, new C11878b());
        hashMap.put(C25240d.class, new C11880d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NOTIFICATION_PAYLOAD, new FieldMetaData("notificationPayload", (byte) 3, new StructMetaData(MVNotificationPayload.class)));
        enumMap.put(_Fields.SERVICE_ALERT, new FieldMetaData("serviceAlert", (byte) 2, new StructMetaData(MVServiceAlertDetails.class)));
        enumMap.put(_Fields.PRESENTATION_TYPE, new FieldMetaData("presentationType", (byte) 2, new EnumMetaData(MVPushPresentationType.class)));
        enumMap.put(_Fields.BUTTON_TEXT, new FieldMetaData("buttonText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_PUSH_POPUP, new FieldMetaData("isPushPopup", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.POPUP_NOTIFICATION_TEXT, new FieldMetaData("popupNotificationText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MESSAGE_BAR_SCREEN, new FieldMetaData("messageBarScreen", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MESSAGE_BAR_COLOR, new FieldMetaData("messageBarColor", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MESSAGE_BAR_IMAGE_ID, new FieldMetaData("messageBarImageId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NOTIFICATION_CHANNEL, new FieldMetaData("notificationChannel", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30514m = unmodifiableMap;
        FieldMetaData.m61947a(MVPushNotificationPayloadResponse.class, unmodifiableMap);
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
        ((C25238b) f30513l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30513l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPushNotificationPayloadResponse mVPushNotificationPayloadResponse = (MVPushNotificationPayloadResponse) obj;
        if (!getClass().equals(mVPushNotificationPayloadResponse.getClass())) {
            return getClass().getName().compareTo(mVPushNotificationPayloadResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35290l()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35290l()));
        if (compareTo2 != 0 || ((mo35290l() && (compareTo2 = this.notificationPayload.compareTo(mVPushNotificationPayloadResponse.notificationPayload)) != 0) || (compareTo2 = Boolean.valueOf(mo35293p()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35293p()))) != 0 || ((mo35293p() && (compareTo2 = this.serviceAlert.compareTo(mVPushNotificationPayloadResponse.serviceAlert)) != 0) || (compareTo2 = Boolean.valueOf(mo35292o()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35292o()))) != 0 || ((mo35292o() && (compareTo2 = this.presentationType.compareTo(mVPushNotificationPayloadResponse.presentationType)) != 0) || (compareTo2 = Boolean.valueOf(mo35283f()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35283f()))) != 0 || ((mo35283f() && (compareTo2 = this.buttonText.compareTo(mVPushNotificationPayloadResponse.buttonText)) != 0) || (compareTo2 = Boolean.valueOf(mo35284g()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35284g()))) != 0 || ((mo35284g() && (compareTo2 = C25082a.m62848l(this.isPushPopup, mVPushNotificationPayloadResponse.isPushPopup)) != 0) || (compareTo2 = Boolean.valueOf(mo35291m()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35291m()))) != 0 || ((mo35291m() && (compareTo2 = this.popupNotificationText.compareTo(mVPushNotificationPayloadResponse.popupNotificationText)) != 0) || (compareTo2 = Boolean.valueOf(mo35288j()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35288j()))) != 0 || ((mo35288j() && (compareTo2 = this.messageBarScreen.compareTo(mVPushNotificationPayloadResponse.messageBarScreen)) != 0) || (compareTo2 = Boolean.valueOf(mo35285h()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35285h()))) != 0 || ((mo35285h() && (compareTo2 = C25082a.m62839c(this.messageBarColor, mVPushNotificationPayloadResponse.messageBarColor)) != 0) || (compareTo2 = Boolean.valueOf(mo35287i()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35287i()))) != 0 || ((mo35287i() && (compareTo2 = C25082a.m62839c(this.messageBarImageId, mVPushNotificationPayloadResponse.messageBarImageId)) != 0) || (compareTo2 = Boolean.valueOf(mo35289k()).compareTo(Boolean.valueOf(mVPushNotificationPayloadResponse.mo35289k()))) != 0)))))))))) {
            return compareTo2;
        }
        if (!mo35289k() || (compareTo = this.notificationChannel.compareTo(mVPushNotificationPayloadResponse.notificationChannel)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPushNotificationPayloadResponse)) {
            return false;
        }
        MVPushNotificationPayloadResponse mVPushNotificationPayloadResponse = (MVPushNotificationPayloadResponse) obj;
        boolean l = mo35290l();
        boolean l2 = mVPushNotificationPayloadResponse.mo35290l();
        if ((l || l2) && (!l || !l2 || !this.notificationPayload.mo35241a(mVPushNotificationPayloadResponse.notificationPayload))) {
            return false;
        }
        boolean p = mo35293p();
        boolean p2 = mVPushNotificationPayloadResponse.mo35293p();
        if ((p || p2) && (!p || !p2 || !this.serviceAlert.mo31623a(mVPushNotificationPayloadResponse.serviceAlert))) {
            return false;
        }
        boolean o = mo35292o();
        boolean o2 = mVPushNotificationPayloadResponse.mo35292o();
        if ((o || o2) && (!o || !o2 || !this.presentationType.equals(mVPushNotificationPayloadResponse.presentationType))) {
            return false;
        }
        boolean f = mo35283f();
        boolean f2 = mVPushNotificationPayloadResponse.mo35283f();
        if ((f || f2) && (!f || !f2 || !this.buttonText.equals(mVPushNotificationPayloadResponse.buttonText))) {
            return false;
        }
        boolean g = mo35284g();
        boolean g2 = mVPushNotificationPayloadResponse.mo35284g();
        if ((g || g2) && (!g || !g2 || this.isPushPopup != mVPushNotificationPayloadResponse.isPushPopup)) {
            return false;
        }
        boolean m = mo35291m();
        boolean m2 = mVPushNotificationPayloadResponse.mo35291m();
        if ((m || m2) && (!m || !m2 || !this.popupNotificationText.equals(mVPushNotificationPayloadResponse.popupNotificationText))) {
            return false;
        }
        boolean j = mo35288j();
        boolean j2 = mVPushNotificationPayloadResponse.mo35288j();
        if ((j || j2) && (!j || !j2 || !this.messageBarScreen.equals(mVPushNotificationPayloadResponse.messageBarScreen))) {
            return false;
        }
        boolean h = mo35285h();
        boolean h2 = mVPushNotificationPayloadResponse.mo35285h();
        if ((h || h2) && (!h || !h2 || this.messageBarColor != mVPushNotificationPayloadResponse.messageBarColor)) {
            return false;
        }
        boolean i = mo35287i();
        boolean i2 = mVPushNotificationPayloadResponse.mo35287i();
        if ((i || i2) && (!i || !i2 || this.messageBarImageId != mVPushNotificationPayloadResponse.messageBarImageId)) {
            return false;
        }
        boolean k = mo35289k();
        boolean k2 = mVPushNotificationPayloadResponse.mo35289k();
        if ((k || k2) && (!k || !k2 || !this.notificationChannel.equals(mVPushNotificationPayloadResponse.notificationChannel))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35283f() {
        return this.buttonText != null;
    }

    /* renamed from: g */
    public final boolean mo35284g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo35285h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35287i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo35288j() {
        return this.messageBarScreen != null;
    }

    /* renamed from: k */
    public final boolean mo35289k() {
        return this.notificationChannel != null;
    }

    /* renamed from: l */
    public final boolean mo35290l() {
        return this.notificationPayload != null;
    }

    /* renamed from: m */
    public final boolean mo35291m() {
        return this.popupNotificationText != null;
    }

    /* renamed from: o */
    public final boolean mo35292o() {
        return this.presentationType != null;
    }

    /* renamed from: p */
    public final boolean mo35293p() {
        return this.serviceAlert != null;
    }

    /* renamed from: q */
    public final void mo35294q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: r */
    public final void mo35295r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: s */
    public final void mo35296s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPushNotificationPayloadResponse(", "notificationPayload:");
        MVNotificationPayload mVNotificationPayload = this.notificationPayload;
        if (mVNotificationPayload == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVNotificationPayload);
        }
        if (mo35293p()) {
            n.append(", ");
            n.append("serviceAlert:");
            MVServiceAlertDetails mVServiceAlertDetails = this.serviceAlert;
            if (mVServiceAlertDetails == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVServiceAlertDetails);
            }
        }
        if (mo35292o()) {
            n.append(", ");
            n.append("presentationType:");
            MVPushPresentationType mVPushPresentationType = this.presentationType;
            if (mVPushPresentationType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPushPresentationType);
            }
        }
        if (mo35283f()) {
            n.append(", ");
            n.append("buttonText:");
            String str = this.buttonText;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo35284g()) {
            n.append(", ");
            n.append("isPushPopup:");
            n.append(this.isPushPopup);
        }
        if (mo35291m()) {
            n.append(", ");
            n.append("popupNotificationText:");
            String str2 = this.popupNotificationText;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo35288j()) {
            n.append(", ");
            n.append("messageBarScreen:");
            String str3 = this.messageBarScreen;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo35285h()) {
            n.append(", ");
            n.append("messageBarColor:");
            n.append(this.messageBarColor);
        }
        if (mo35287i()) {
            n.append(", ");
            n.append("messageBarImageId:");
            n.append(this.messageBarImageId);
        }
        n.append(", ");
        n.append("notificationChannel:");
        String str4 = this.notificationChannel;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }
}
