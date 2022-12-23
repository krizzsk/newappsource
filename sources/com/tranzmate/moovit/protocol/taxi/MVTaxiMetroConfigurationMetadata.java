package com.tranzmate.moovit.protocol.taxi;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVTaxiMetroConfigurationMetadata implements TBase<MVTaxiMetroConfigurationMetadata, _Fields>, Serializable, Cloneable, Comparable<MVTaxiMetroConfigurationMetadata> {

    /* renamed from: A */
    public static final C25113c f28569A = new C25113c("polygonsVisibilityAffect", (byte) 8, 26);

    /* renamed from: B */
    public static final C25113c f28570B = new C25113c("tpSupported", (byte) 2, 27);

    /* renamed from: C */
    public static final C25113c f28571C = new C25113c("displayProfile", (byte) 2, 28);

    /* renamed from: D */
    public static final C25113c f28572D = new C25113c("maxNumberOfPassengers", (byte) 8, 29);

    /* renamed from: E */
    public static final HashMap f28573E;

    /* renamed from: F */
    public static final Map<_Fields, FieldMetaData> f28574F;

    /* renamed from: b */
    public static final C25113c f28575b = new C25113c("mainColor", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28576c = new C25113c("ctaTextColor", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28577d = new C25113c("ctaBackgroundColor", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f28578e = new C25113c("longImage", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28579f = new C25113c("shortImage", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f28580g = new C25113c("androidSchema", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f28581h = new C25113c("iosSchema", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f28582i = new C25113c("deepLinkUri", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f28583j = new C25113c("myLocationDeepLinkUri", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f28584k = new C25113c("downloadLink", (byte) 11, 10);

    /* renamed from: l */
    public static final C25113c f28585l = new C25113c("providerAnalyticName", (byte) 11, 11);

    /* renamed from: m */
    public static final C25113c f28586m = new C25113c("fab", (byte) 12, 12);

    /* renamed from: n */
    public static final C25113c f28587n = new C25113c("suggestRoutes", (byte) 12, 13);

    /* renamed from: o */
    public static final C25113c f28588o = new C25113c("popup", (byte) 12, 14);

    /* renamed from: p */
    public static final C25113c f28589p = new C25113c("dashboard", (byte) 12, 15);

    /* renamed from: q */
    public static final C25113c f28590q = new C25113c("name", (byte) 11, 16);

    /* renamed from: r */
    public static final C25113c f28591r = new C25113c("paymentContext", (byte) 11, 17);

    /* renamed from: s */
    public static final C25113c f28592s = new C25113c("polygons", (byte) 15, 18);

    /* renamed from: t */
    public static final C25113c f28593t = new C25113c("pressedColor", (byte) 8, 19);

    /* renamed from: u */
    public static final C25113c f28594u = new C25113c("backDropImage", (byte) 12, 20);

    /* renamed from: v */
    public static final C25113c f28595v = new C25113c("vehicleImage", (byte) 12, 21);

    /* renamed from: w */
    public static final C25113c f28596w = new C25113c("animations", (byte) 12, 22);

    /* renamed from: x */
    public static final C25113c f28597x = new C25113c("order", (byte) 12, 23);

    /* renamed from: y */
    public static final C25113c f28598y = new C25113c("iosDownloadLink", (byte) 11, 24);

    /* renamed from: z */
    public static final C25113c f28599z = new C25113c("androidDownloadLink", (byte) 11, 25);
    private byte __isset_bitfield = 0;
    public String androidDownloadLink;
    public String androidSchema;
    public MVTaxiAnimationsConfig animations;
    public MVImageReferenceWithParams backDropImage;
    public int ctaBackgroundColor;
    public int ctaTextColor;
    public MVTaxiDashboardConfig dashboard;
    public String deepLinkUri;
    public boolean displayProfile;
    public String downloadLink;
    public MVTaxiFabConfig fab;
    public String iosDownloadLink;
    public String iosSchema;
    public MVImageReferenceWithParams longImage;
    public int mainColor;
    public int maxNumberOfPassengers;
    public String myLocationDeepLinkUri;
    public String name;
    private _Fields[] optionals = {_Fields.FAB, _Fields.POPUP, _Fields.DASHBOARD, _Fields.PAYMENT_CONTEXT, _Fields.POLYGONS, _Fields.PRESSED_COLOR, _Fields.VEHICLE_IMAGE, _Fields.ANIMATIONS, _Fields.ORDER, _Fields.IOS_DOWNLOAD_LINK, _Fields.ANDROID_DOWNLOAD_LINK, _Fields.POLYGONS_VISIBILITY_AFFECT, _Fields.TP_SUPPORTED, _Fields.DISPLAY_PROFILE, _Fields.MAX_NUMBER_OF_PASSENGERS};
    public MVTaxiOrderConfig order;
    public String paymentContext;
    public List<MVTaxiPolygon> polygons;
    public MVTaxiPolygonsVisibiltyAffect polygonsVisibilityAffect;
    public MVTaxiPopupConfig popup;
    public int pressedColor;
    public String providerAnalyticName;
    public MVImageReferenceWithParams shortImage;
    public MVTaxiSuggestRoutes suggestRoutes;
    public boolean tpSupported;
    public MVImageReferenceWithParams vehicleImage;

    public enum _Fields implements C25085c {
        MAIN_COLOR(1, "mainColor"),
        CTA_TEXT_COLOR(2, "ctaTextColor"),
        CTA_BACKGROUND_COLOR(3, "ctaBackgroundColor"),
        LONG_IMAGE(4, "longImage"),
        SHORT_IMAGE(5, "shortImage"),
        ANDROID_SCHEMA(6, "androidSchema"),
        IOS_SCHEMA(7, "iosSchema"),
        DEEP_LINK_URI(8, "deepLinkUri"),
        MY_LOCATION_DEEP_LINK_URI(9, "myLocationDeepLinkUri"),
        DOWNLOAD_LINK(10, "downloadLink"),
        PROVIDER_ANALYTIC_NAME(11, "providerAnalyticName"),
        FAB(12, "fab"),
        SUGGEST_ROUTES(13, "suggestRoutes"),
        POPUP(14, "popup"),
        DASHBOARD(15, "dashboard"),
        NAME(16, "name"),
        PAYMENT_CONTEXT(17, "paymentContext"),
        POLYGONS(18, "polygons"),
        PRESSED_COLOR(19, "pressedColor"),
        BACK_DROP_IMAGE(20, "backDropImage"),
        VEHICLE_IMAGE(21, "vehicleImage"),
        ANIMATIONS(22, "animations"),
        ORDER(23, "order"),
        IOS_DOWNLOAD_LINK(24, "iosDownloadLink"),
        ANDROID_DOWNLOAD_LINK(25, "androidDownloadLink"),
        POLYGONS_VISIBILITY_AFFECT(26, "polygonsVisibilityAffect"),
        TP_SUPPORTED(27, "tpSupported"),
        DISPLAY_PROFILE(28, "displayProfile"),
        MAX_NUMBER_OF_PASSENGERS(29, "maxNumberOfPassengers");
        
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
                    return MAIN_COLOR;
                case 2:
                    return CTA_TEXT_COLOR;
                case 3:
                    return CTA_BACKGROUND_COLOR;
                case 4:
                    return LONG_IMAGE;
                case 5:
                    return SHORT_IMAGE;
                case 6:
                    return ANDROID_SCHEMA;
                case 7:
                    return IOS_SCHEMA;
                case 8:
                    return DEEP_LINK_URI;
                case 9:
                    return MY_LOCATION_DEEP_LINK_URI;
                case 10:
                    return DOWNLOAD_LINK;
                case 11:
                    return PROVIDER_ANALYTIC_NAME;
                case 12:
                    return FAB;
                case 13:
                    return SUGGEST_ROUTES;
                case 14:
                    return POPUP;
                case 15:
                    return DASHBOARD;
                case 16:
                    return NAME;
                case 17:
                    return PAYMENT_CONTEXT;
                case 18:
                    return POLYGONS;
                case 19:
                    return PRESSED_COLOR;
                case 20:
                    return BACK_DROP_IMAGE;
                case 21:
                    return VEHICLE_IMAGE;
                case 22:
                    return ANIMATIONS;
                case 23:
                    return ORDER;
                case 24:
                    return IOS_DOWNLOAD_LINK;
                case 25:
                    return ANDROID_DOWNLOAD_LINK;
                case 26:
                    return POLYGONS_VISIBILITY_AFFECT;
                case 27:
                    return TP_SUPPORTED;
                case 28:
                    return DISPLAY_PROFILE;
                case 29:
                    return MAX_NUMBER_OF_PASSENGERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfigurationMetadata$a */
    public static class C10716a extends C25239c<MVTaxiMetroConfigurationMetadata> {
        public C10716a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata = (MVTaxiMetroConfigurationMetadata) tBase;
            mVTaxiMetroConfigurationMetadata.getClass();
            C25113c cVar = MVTaxiMetroConfigurationMetadata.f28575b;
            gVar.mo61687K();
            gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28575b);
            gVar.mo61678B(mVTaxiMetroConfigurationMetadata.mainColor);
            gVar.mo61712y();
            gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28576c);
            gVar.mo61678B(mVTaxiMetroConfigurationMetadata.ctaTextColor);
            gVar.mo61712y();
            gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28577d);
            gVar.mo61678B(mVTaxiMetroConfigurationMetadata.ctaBackgroundColor);
            gVar.mo61712y();
            if (mVTaxiMetroConfigurationMetadata.longImage != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28578e);
                mVTaxiMetroConfigurationMetadata.longImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.shortImage != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28579f);
                mVTaxiMetroConfigurationMetadata.shortImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.androidSchema != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28580g);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.androidSchema);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.iosSchema != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28581h);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.iosSchema);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.deepLinkUri != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28582i);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.deepLinkUri);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.myLocationDeepLinkUri != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28583j);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.myLocationDeepLinkUri);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.downloadLink != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28584k);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.downloadLink);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.providerAnalyticName != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28585l);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.providerAnalyticName);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.fab != null && mVTaxiMetroConfigurationMetadata.mo32183q()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28586m);
                mVTaxiMetroConfigurationMetadata.fab.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.suggestRoutes != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28587n);
                mVTaxiMetroConfigurationMetadata.suggestRoutes.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.popup != null && mVTaxiMetroConfigurationMetadata.mo32155G()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28588o);
                mVTaxiMetroConfigurationMetadata.popup.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.dashboard != null && mVTaxiMetroConfigurationMetadata.mo32179l()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28589p);
                mVTaxiMetroConfigurationMetadata.dashboard.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.name != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28590q);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.name);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.paymentContext != null && mVTaxiMetroConfigurationMetadata.mo32152D()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28591r);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.paymentContext);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.polygons != null && mVTaxiMetroConfigurationMetadata.mo32153E()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28592s);
                gVar.mo61680D(new C25119e((byte) 12, mVTaxiMetroConfigurationMetadata.polygons.size()));
                for (MVTaxiPolygon X0 : mVTaxiMetroConfigurationMetadata.polygons) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.mo32156H()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28593t);
                gVar.mo61678B(mVTaxiMetroConfigurationMetadata.pressedColor);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.backDropImage != null) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28594u);
                mVTaxiMetroConfigurationMetadata.backDropImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.vehicleImage != null && mVTaxiMetroConfigurationMetadata.mo32161N()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28595v);
                mVTaxiMetroConfigurationMetadata.vehicleImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.animations != null && mVTaxiMetroConfigurationMetadata.mo32174h()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28596w);
                mVTaxiMetroConfigurationMetadata.animations.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.order != null && mVTaxiMetroConfigurationMetadata.mo32151A()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28597x);
                mVTaxiMetroConfigurationMetadata.order.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.iosDownloadLink != null && mVTaxiMetroConfigurationMetadata.mo32184r()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28598y);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.iosDownloadLink);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.androidDownloadLink != null && mVTaxiMetroConfigurationMetadata.mo32172f()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28599z);
                gVar.mo61686J(mVTaxiMetroConfigurationMetadata.androidDownloadLink);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.polygonsVisibilityAffect != null && mVTaxiMetroConfigurationMetadata.mo32154F()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28569A);
                gVar.mo61678B(mVTaxiMetroConfigurationMetadata.polygonsVisibilityAffect.getValue());
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.mo32160M()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28570B);
                gVar.mo61708u(mVTaxiMetroConfigurationMetadata.tpSupported);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.mo32181o()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28571C);
                gVar.mo61708u(mVTaxiMetroConfigurationMetadata.displayProfile);
                gVar.mo61712y();
            }
            if (mVTaxiMetroConfigurationMetadata.mo32189v()) {
                gVar.mo61711x(MVTaxiMetroConfigurationMetadata.f28572D);
                gVar.mo61678B(mVTaxiMetroConfigurationMetadata.maxNumberOfPassengers);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata = (MVTaxiMetroConfigurationMetadata) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTaxiMetroConfigurationMetadata.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.mainColor = gVar.mo61696i();
                            mVTaxiMetroConfigurationMetadata.mo32165R();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.ctaTextColor = gVar.mo61696i();
                            mVTaxiMetroConfigurationMetadata.mo32163P();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.ctaBackgroundColor = gVar.mo61696i();
                            mVTaxiMetroConfigurationMetadata.mo32162O();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVTaxiMetroConfigurationMetadata.longImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVTaxiMetroConfigurationMetadata.shortImage = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.androidSchema = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.iosSchema = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.deepLinkUri = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.myLocationDeepLinkUri = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.downloadLink = gVar.mo61704q();
                            break;
                        }
                    case 11:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.providerAnalyticName = gVar.mo61704q();
                            break;
                        }
                    case 12:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTaxiFabConfig mVTaxiFabConfig = new MVTaxiFabConfig();
                            mVTaxiMetroConfigurationMetadata.fab = mVTaxiFabConfig;
                            mVTaxiFabConfig.mo25201C1(gVar);
                            break;
                        }
                    case 13:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTaxiSuggestRoutes mVTaxiSuggestRoutes = new MVTaxiSuggestRoutes();
                            mVTaxiMetroConfigurationMetadata.suggestRoutes = mVTaxiSuggestRoutes;
                            mVTaxiSuggestRoutes.mo25201C1(gVar);
                            break;
                        }
                    case 14:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTaxiPopupConfig mVTaxiPopupConfig = new MVTaxiPopupConfig();
                            mVTaxiMetroConfigurationMetadata.popup = mVTaxiPopupConfig;
                            mVTaxiPopupConfig.mo25201C1(gVar);
                            break;
                        }
                    case 15:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTaxiDashboardConfig mVTaxiDashboardConfig = new MVTaxiDashboardConfig();
                            mVTaxiMetroConfigurationMetadata.dashboard = mVTaxiDashboardConfig;
                            mVTaxiDashboardConfig.mo25201C1(gVar);
                            break;
                        }
                    case 16:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.name = gVar.mo61704q();
                            break;
                        }
                    case 17:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.paymentContext = gVar.mo61704q();
                            break;
                        }
                    case 18:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTaxiMetroConfigurationMetadata.polygons = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVTaxiPolygon mVTaxiPolygon = new MVTaxiPolygon();
                                mVTaxiPolygon.mo25201C1(gVar);
                                mVTaxiMetroConfigurationMetadata.polygons.add(mVTaxiPolygon);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 19:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.pressedColor = gVar.mo61696i();
                            mVTaxiMetroConfigurationMetadata.mo32167U();
                            break;
                        }
                    case 20:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams3 = new MVImageReferenceWithParams();
                            mVTaxiMetroConfigurationMetadata.backDropImage = mVImageReferenceWithParams3;
                            mVImageReferenceWithParams3.mo25201C1(gVar);
                            break;
                        }
                    case 21:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams4 = new MVImageReferenceWithParams();
                            mVTaxiMetroConfigurationMetadata.vehicleImage = mVImageReferenceWithParams4;
                            mVImageReferenceWithParams4.mo25201C1(gVar);
                            break;
                        }
                    case 22:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTaxiAnimationsConfig mVTaxiAnimationsConfig = new MVTaxiAnimationsConfig();
                            mVTaxiMetroConfigurationMetadata.animations = mVTaxiAnimationsConfig;
                            mVTaxiAnimationsConfig.mo25201C1(gVar);
                            break;
                        }
                    case 23:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTaxiOrderConfig mVTaxiOrderConfig = new MVTaxiOrderConfig();
                            mVTaxiMetroConfigurationMetadata.order = mVTaxiOrderConfig;
                            mVTaxiOrderConfig.mo25201C1(gVar);
                            break;
                        }
                    case 24:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.iosDownloadLink = gVar.mo61704q();
                            break;
                        }
                    case 25:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.androidDownloadLink = gVar.mo61704q();
                            break;
                        }
                    case 26:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.polygonsVisibilityAffect = MVTaxiPolygonsVisibiltyAffect.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 27:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.tpSupported = gVar.mo61690c();
                            mVTaxiMetroConfigurationMetadata.mo32168V();
                            break;
                        }
                    case 28:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.displayProfile = gVar.mo61690c();
                            mVTaxiMetroConfigurationMetadata.mo32164Q();
                            break;
                        }
                    case 29:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiMetroConfigurationMetadata.maxNumberOfPassengers = gVar.mo61696i();
                            mVTaxiMetroConfigurationMetadata.mo32166S();
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfigurationMetadata$b */
    public static class C10717b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10716a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfigurationMetadata$c */
    public static class C10718c extends C25240d<MVTaxiMetroConfigurationMetadata> {
        public C10718c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata = (MVTaxiMetroConfigurationMetadata) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiMetroConfigurationMetadata.mo32188u()) {
                bitSet.set(0);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32178k()) {
                bitSet.set(1);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32177j()) {
                bitSet.set(2);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32186t()) {
                bitSet.set(3);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32158J()) {
                bitSet.set(4);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32173g()) {
                bitSet.set(5);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32185s()) {
                bitSet.set(6);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32180m()) {
                bitSet.set(7);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32190w()) {
                bitSet.set(8);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32182p()) {
                bitSet.set(9);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32157I()) {
                bitSet.set(10);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32183q()) {
                bitSet.set(11);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32159L()) {
                bitSet.set(12);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32155G()) {
                bitSet.set(13);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32179l()) {
                bitSet.set(14);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32191y()) {
                bitSet.set(15);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32152D()) {
                bitSet.set(16);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32153E()) {
                bitSet.set(17);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32156H()) {
                bitSet.set(18);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32176i()) {
                bitSet.set(19);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32161N()) {
                bitSet.set(20);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32174h()) {
                bitSet.set(21);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32151A()) {
                bitSet.set(22);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32184r()) {
                bitSet.set(23);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32172f()) {
                bitSet.set(24);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32154F()) {
                bitSet.set(25);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32160M()) {
                bitSet.set(26);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32181o()) {
                bitSet.set(27);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32189v()) {
                bitSet.set(28);
            }
            jVar.mo61738U(bitSet, 29);
            if (mVTaxiMetroConfigurationMetadata.mo32188u()) {
                jVar.mo61678B(mVTaxiMetroConfigurationMetadata.mainColor);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32178k()) {
                jVar.mo61678B(mVTaxiMetroConfigurationMetadata.ctaTextColor);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32177j()) {
                jVar.mo61678B(mVTaxiMetroConfigurationMetadata.ctaBackgroundColor);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32186t()) {
                mVTaxiMetroConfigurationMetadata.longImage.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32158J()) {
                mVTaxiMetroConfigurationMetadata.shortImage.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32173g()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.androidSchema);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32185s()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.iosSchema);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32180m()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.deepLinkUri);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32190w()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.myLocationDeepLinkUri);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32182p()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.downloadLink);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32157I()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.providerAnalyticName);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32183q()) {
                mVTaxiMetroConfigurationMetadata.fab.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32159L()) {
                mVTaxiMetroConfigurationMetadata.suggestRoutes.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32155G()) {
                mVTaxiMetroConfigurationMetadata.popup.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32179l()) {
                mVTaxiMetroConfigurationMetadata.dashboard.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32191y()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.name);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32152D()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.paymentContext);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32153E()) {
                jVar.mo61678B(mVTaxiMetroConfigurationMetadata.polygons.size());
                for (MVTaxiPolygon X0 : mVTaxiMetroConfigurationMetadata.polygons) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTaxiMetroConfigurationMetadata.mo32156H()) {
                jVar.mo61678B(mVTaxiMetroConfigurationMetadata.pressedColor);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32176i()) {
                mVTaxiMetroConfigurationMetadata.backDropImage.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32161N()) {
                mVTaxiMetroConfigurationMetadata.vehicleImage.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32174h()) {
                mVTaxiMetroConfigurationMetadata.animations.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32151A()) {
                mVTaxiMetroConfigurationMetadata.order.mo25202X0(jVar);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32184r()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.iosDownloadLink);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32172f()) {
                jVar.mo61686J(mVTaxiMetroConfigurationMetadata.androidDownloadLink);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32154F()) {
                jVar.mo61678B(mVTaxiMetroConfigurationMetadata.polygonsVisibilityAffect.getValue());
            }
            if (mVTaxiMetroConfigurationMetadata.mo32160M()) {
                jVar.mo61708u(mVTaxiMetroConfigurationMetadata.tpSupported);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32181o()) {
                jVar.mo61708u(mVTaxiMetroConfigurationMetadata.displayProfile);
            }
            if (mVTaxiMetroConfigurationMetadata.mo32189v()) {
                jVar.mo61678B(mVTaxiMetroConfigurationMetadata.maxNumberOfPassengers);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata = (MVTaxiMetroConfigurationMetadata) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(29);
            if (T.get(0)) {
                mVTaxiMetroConfigurationMetadata.mainColor = jVar.mo61696i();
                mVTaxiMetroConfigurationMetadata.mo32165R();
            }
            if (T.get(1)) {
                mVTaxiMetroConfigurationMetadata.ctaTextColor = jVar.mo61696i();
                mVTaxiMetroConfigurationMetadata.mo32163P();
            }
            if (T.get(2)) {
                mVTaxiMetroConfigurationMetadata.ctaBackgroundColor = jVar.mo61696i();
                mVTaxiMetroConfigurationMetadata.mo32162O();
            }
            if (T.get(3)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTaxiMetroConfigurationMetadata.longImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                mVTaxiMetroConfigurationMetadata.shortImage = mVImageReferenceWithParams2;
                mVImageReferenceWithParams2.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVTaxiMetroConfigurationMetadata.androidSchema = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVTaxiMetroConfigurationMetadata.iosSchema = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVTaxiMetroConfigurationMetadata.deepLinkUri = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVTaxiMetroConfigurationMetadata.myLocationDeepLinkUri = jVar.mo61704q();
            }
            if (T.get(9)) {
                mVTaxiMetroConfigurationMetadata.downloadLink = jVar.mo61704q();
            }
            if (T.get(10)) {
                mVTaxiMetroConfigurationMetadata.providerAnalyticName = jVar.mo61704q();
            }
            if (T.get(11)) {
                MVTaxiFabConfig mVTaxiFabConfig = new MVTaxiFabConfig();
                mVTaxiMetroConfigurationMetadata.fab = mVTaxiFabConfig;
                mVTaxiFabConfig.mo25201C1(jVar);
            }
            if (T.get(12)) {
                MVTaxiSuggestRoutes mVTaxiSuggestRoutes = new MVTaxiSuggestRoutes();
                mVTaxiMetroConfigurationMetadata.suggestRoutes = mVTaxiSuggestRoutes;
                mVTaxiSuggestRoutes.mo25201C1(jVar);
            }
            if (T.get(13)) {
                MVTaxiPopupConfig mVTaxiPopupConfig = new MVTaxiPopupConfig();
                mVTaxiMetroConfigurationMetadata.popup = mVTaxiPopupConfig;
                mVTaxiPopupConfig.mo25201C1(jVar);
            }
            if (T.get(14)) {
                MVTaxiDashboardConfig mVTaxiDashboardConfig = new MVTaxiDashboardConfig();
                mVTaxiMetroConfigurationMetadata.dashboard = mVTaxiDashboardConfig;
                mVTaxiDashboardConfig.mo25201C1(jVar);
            }
            if (T.get(15)) {
                mVTaxiMetroConfigurationMetadata.name = jVar.mo61704q();
            }
            if (T.get(16)) {
                mVTaxiMetroConfigurationMetadata.paymentContext = jVar.mo61704q();
            }
            if (T.get(17)) {
                int i = jVar.mo61696i();
                mVTaxiMetroConfigurationMetadata.polygons = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTaxiPolygon mVTaxiPolygon = new MVTaxiPolygon();
                    mVTaxiPolygon.mo25201C1(jVar);
                    mVTaxiMetroConfigurationMetadata.polygons.add(mVTaxiPolygon);
                }
            }
            if (T.get(18)) {
                mVTaxiMetroConfigurationMetadata.pressedColor = jVar.mo61696i();
                mVTaxiMetroConfigurationMetadata.mo32167U();
            }
            if (T.get(19)) {
                MVImageReferenceWithParams mVImageReferenceWithParams3 = new MVImageReferenceWithParams();
                mVTaxiMetroConfigurationMetadata.backDropImage = mVImageReferenceWithParams3;
                mVImageReferenceWithParams3.mo25201C1(jVar);
            }
            if (T.get(20)) {
                MVImageReferenceWithParams mVImageReferenceWithParams4 = new MVImageReferenceWithParams();
                mVTaxiMetroConfigurationMetadata.vehicleImage = mVImageReferenceWithParams4;
                mVImageReferenceWithParams4.mo25201C1(jVar);
            }
            if (T.get(21)) {
                MVTaxiAnimationsConfig mVTaxiAnimationsConfig = new MVTaxiAnimationsConfig();
                mVTaxiMetroConfigurationMetadata.animations = mVTaxiAnimationsConfig;
                mVTaxiAnimationsConfig.mo25201C1(jVar);
            }
            if (T.get(22)) {
                MVTaxiOrderConfig mVTaxiOrderConfig = new MVTaxiOrderConfig();
                mVTaxiMetroConfigurationMetadata.order = mVTaxiOrderConfig;
                mVTaxiOrderConfig.mo25201C1(jVar);
            }
            if (T.get(23)) {
                mVTaxiMetroConfigurationMetadata.iosDownloadLink = jVar.mo61704q();
            }
            if (T.get(24)) {
                mVTaxiMetroConfigurationMetadata.androidDownloadLink = jVar.mo61704q();
            }
            if (T.get(25)) {
                mVTaxiMetroConfigurationMetadata.polygonsVisibilityAffect = MVTaxiPolygonsVisibiltyAffect.findByValue(jVar.mo61696i());
            }
            if (T.get(26)) {
                mVTaxiMetroConfigurationMetadata.tpSupported = jVar.mo61690c();
                mVTaxiMetroConfigurationMetadata.mo32168V();
            }
            if (T.get(27)) {
                mVTaxiMetroConfigurationMetadata.displayProfile = jVar.mo61690c();
                mVTaxiMetroConfigurationMetadata.mo32164Q();
            }
            if (T.get(28)) {
                mVTaxiMetroConfigurationMetadata.maxNumberOfPassengers = jVar.mo61696i();
                mVTaxiMetroConfigurationMetadata.mo32166S();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfigurationMetadata$d */
    public static class C10719d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10718c(0);
        }
    }

    static {
        new C17394d0("MVTaxiMetroConfigurationMetadata");
        HashMap hashMap = new HashMap();
        f28573E = hashMap;
        hashMap.put(C25239c.class, new C10717b());
        hashMap.put(C25240d.class, new C10719d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MAIN_COLOR, new FieldMetaData("mainColor", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CTA_TEXT_COLOR, new FieldMetaData("ctaTextColor", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CTA_BACKGROUND_COLOR, new FieldMetaData("ctaBackgroundColor", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LONG_IMAGE, new FieldMetaData("longImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.SHORT_IMAGE, new FieldMetaData("shortImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.ANDROID_SCHEMA, new FieldMetaData("androidSchema", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IOS_SCHEMA, new FieldMetaData("iosSchema", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DEEP_LINK_URI, new FieldMetaData("deepLinkUri", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MY_LOCATION_DEEP_LINK_URI, new FieldMetaData("myLocationDeepLinkUri", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DOWNLOAD_LINK, new FieldMetaData("downloadLink", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROVIDER_ANALYTIC_NAME, new FieldMetaData("providerAnalyticName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FAB, new FieldMetaData("fab", (byte) 2, new StructMetaData(MVTaxiFabConfig.class)));
        enumMap.put(_Fields.SUGGEST_ROUTES, new FieldMetaData("suggestRoutes", (byte) 3, new StructMetaData(MVTaxiSuggestRoutes.class)));
        enumMap.put(_Fields.POPUP, new FieldMetaData("popup", (byte) 2, new StructMetaData(MVTaxiPopupConfig.class)));
        enumMap.put(_Fields.DASHBOARD, new FieldMetaData("dashboard", (byte) 2, new StructMetaData(MVTaxiDashboardConfig.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.POLYGONS, new FieldMetaData("polygons", (byte) 2, new ListMetaData(new StructMetaData(MVTaxiPolygon.class))));
        enumMap.put(_Fields.PRESSED_COLOR, new FieldMetaData("pressedColor", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.BACK_DROP_IMAGE, new FieldMetaData("backDropImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.VEHICLE_IMAGE, new FieldMetaData("vehicleImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.ANIMATIONS, new FieldMetaData("animations", (byte) 2, new StructMetaData(MVTaxiAnimationsConfig.class)));
        enumMap.put(_Fields.ORDER, new FieldMetaData("order", (byte) 2, new StructMetaData(MVTaxiOrderConfig.class)));
        enumMap.put(_Fields.IOS_DOWNLOAD_LINK, new FieldMetaData("iosDownloadLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANDROID_DOWNLOAD_LINK, new FieldMetaData("androidDownloadLink", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.POLYGONS_VISIBILITY_AFFECT, new FieldMetaData("polygonsVisibilityAffect", (byte) 2, new EnumMetaData(MVTaxiPolygonsVisibiltyAffect.class)));
        enumMap.put(_Fields.TP_SUPPORTED, new FieldMetaData("tpSupported", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DISPLAY_PROFILE, new FieldMetaData("displayProfile", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MAX_NUMBER_OF_PASSENGERS, new FieldMetaData("maxNumberOfPassengers", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28574F = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiMetroConfigurationMetadata.class, unmodifiableMap);
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
    public final boolean mo32151A() {
        return this.order != null;
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f28573E.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final boolean mo32152D() {
        return this.paymentContext != null;
    }

    /* renamed from: E */
    public final boolean mo32153E() {
        return this.polygons != null;
    }

    /* renamed from: F */
    public final boolean mo32154F() {
        return this.polygonsVisibilityAffect != null;
    }

    /* renamed from: G */
    public final boolean mo32155G() {
        return this.popup != null;
    }

    /* renamed from: H */
    public final boolean mo32156H() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: I */
    public final boolean mo32157I() {
        return this.providerAnalyticName != null;
    }

    /* renamed from: J */
    public final boolean mo32158J() {
        return this.shortImage != null;
    }

    /* renamed from: L */
    public final boolean mo32159L() {
        return this.suggestRoutes != null;
    }

    /* renamed from: M */
    public final boolean mo32160M() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: N */
    public final boolean mo32161N() {
        return this.vehicleImage != null;
    }

    /* renamed from: O */
    public final void mo32162O() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: P */
    public final void mo32163P() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: Q */
    public final void mo32164Q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: R */
    public final void mo32165R() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: S */
    public final void mo32166S() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: U */
    public final void mo32167U() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: V */
    public final void mo32168V() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28573E.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32169a(MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata) {
        if (mVTaxiMetroConfigurationMetadata == null || this.mainColor != mVTaxiMetroConfigurationMetadata.mainColor || this.ctaTextColor != mVTaxiMetroConfigurationMetadata.ctaTextColor || this.ctaBackgroundColor != mVTaxiMetroConfigurationMetadata.ctaBackgroundColor) {
            return false;
        }
        boolean t = mo32186t();
        boolean t2 = mVTaxiMetroConfigurationMetadata.mo32186t();
        if ((t || t2) && (!t || !t2 || !this.longImage.mo26245a(mVTaxiMetroConfigurationMetadata.longImage))) {
            return false;
        }
        boolean J = mo32158J();
        boolean J2 = mVTaxiMetroConfigurationMetadata.mo32158J();
        if ((J || J2) && (!J || !J2 || !this.shortImage.mo26245a(mVTaxiMetroConfigurationMetadata.shortImage))) {
            return false;
        }
        boolean g = mo32173g();
        boolean g2 = mVTaxiMetroConfigurationMetadata.mo32173g();
        if ((g || g2) && (!g || !g2 || !this.androidSchema.equals(mVTaxiMetroConfigurationMetadata.androidSchema))) {
            return false;
        }
        boolean s = mo32185s();
        boolean s2 = mVTaxiMetroConfigurationMetadata.mo32185s();
        if ((s || s2) && (!s || !s2 || !this.iosSchema.equals(mVTaxiMetroConfigurationMetadata.iosSchema))) {
            return false;
        }
        boolean m = mo32180m();
        boolean m2 = mVTaxiMetroConfigurationMetadata.mo32180m();
        if ((m || m2) && (!m || !m2 || !this.deepLinkUri.equals(mVTaxiMetroConfigurationMetadata.deepLinkUri))) {
            return false;
        }
        boolean w = mo32190w();
        boolean w2 = mVTaxiMetroConfigurationMetadata.mo32190w();
        if ((w || w2) && (!w || !w2 || !this.myLocationDeepLinkUri.equals(mVTaxiMetroConfigurationMetadata.myLocationDeepLinkUri))) {
            return false;
        }
        boolean p = mo32182p();
        boolean p2 = mVTaxiMetroConfigurationMetadata.mo32182p();
        if ((p || p2) && (!p || !p2 || !this.downloadLink.equals(mVTaxiMetroConfigurationMetadata.downloadLink))) {
            return false;
        }
        boolean I = mo32157I();
        boolean I2 = mVTaxiMetroConfigurationMetadata.mo32157I();
        if ((I || I2) && (!I || !I2 || !this.providerAnalyticName.equals(mVTaxiMetroConfigurationMetadata.providerAnalyticName))) {
            return false;
        }
        boolean q = mo32183q();
        boolean q2 = mVTaxiMetroConfigurationMetadata.mo32183q();
        if ((q || q2) && (!q || !q2 || !this.fab.mo32120a(mVTaxiMetroConfigurationMetadata.fab))) {
            return false;
        }
        boolean L = mo32159L();
        boolean L2 = mVTaxiMetroConfigurationMetadata.mo32159L();
        if ((L || L2) && (!L || !L2 || !this.suggestRoutes.mo32274a(mVTaxiMetroConfigurationMetadata.suggestRoutes))) {
            return false;
        }
        boolean G = mo32155G();
        boolean G2 = mVTaxiMetroConfigurationMetadata.mo32155G();
        if ((G || G2) && (!G || !G2 || !this.popup.mo32233a(mVTaxiMetroConfigurationMetadata.popup))) {
            return false;
        }
        boolean l = mo32179l();
        boolean l2 = mVTaxiMetroConfigurationMetadata.mo32179l();
        if ((l || l2) && (!l || !l2 || !this.dashboard.mo32088a(mVTaxiMetroConfigurationMetadata.dashboard))) {
            return false;
        }
        boolean y = mo32191y();
        boolean y2 = mVTaxiMetroConfigurationMetadata.mo32191y();
        if ((y || y2) && (!y || !y2 || !this.name.equals(mVTaxiMetroConfigurationMetadata.name))) {
            return false;
        }
        boolean D = mo32152D();
        boolean D2 = mVTaxiMetroConfigurationMetadata.mo32152D();
        if ((D || D2) && (!D || !D2 || !this.paymentContext.equals(mVTaxiMetroConfigurationMetadata.paymentContext))) {
            return false;
        }
        boolean E = mo32153E();
        boolean E2 = mVTaxiMetroConfigurationMetadata.mo32153E();
        if ((E || E2) && (!E || !E2 || !this.polygons.equals(mVTaxiMetroConfigurationMetadata.polygons))) {
            return false;
        }
        boolean H = mo32156H();
        boolean H2 = mVTaxiMetroConfigurationMetadata.mo32156H();
        if ((H || H2) && (!H || !H2 || this.pressedColor != mVTaxiMetroConfigurationMetadata.pressedColor)) {
            return false;
        }
        boolean i = mo32176i();
        boolean i2 = mVTaxiMetroConfigurationMetadata.mo32176i();
        if ((i || i2) && (!i || !i2 || !this.backDropImage.mo26245a(mVTaxiMetroConfigurationMetadata.backDropImage))) {
            return false;
        }
        boolean N = mo32161N();
        boolean N2 = mVTaxiMetroConfigurationMetadata.mo32161N();
        if ((N || N2) && (!N || !N2 || !this.vehicleImage.mo26245a(mVTaxiMetroConfigurationMetadata.vehicleImage))) {
            return false;
        }
        boolean h = mo32174h();
        boolean h2 = mVTaxiMetroConfigurationMetadata.mo32174h();
        if ((h || h2) && (!h || !h2 || !this.animations.mo32080a(mVTaxiMetroConfigurationMetadata.animations))) {
            return false;
        }
        boolean A = mo32151A();
        boolean A2 = mVTaxiMetroConfigurationMetadata.mo32151A();
        if ((A || A2) && (!A || !A2 || !this.order.mo32199a(mVTaxiMetroConfigurationMetadata.order))) {
            return false;
        }
        boolean r = mo32184r();
        boolean r2 = mVTaxiMetroConfigurationMetadata.mo32184r();
        if ((r || r2) && (!r || !r2 || !this.iosDownloadLink.equals(mVTaxiMetroConfigurationMetadata.iosDownloadLink))) {
            return false;
        }
        boolean f = mo32172f();
        boolean f2 = mVTaxiMetroConfigurationMetadata.mo32172f();
        if ((f || f2) && (!f || !f2 || !this.androidDownloadLink.equals(mVTaxiMetroConfigurationMetadata.androidDownloadLink))) {
            return false;
        }
        boolean F = mo32154F();
        boolean F2 = mVTaxiMetroConfigurationMetadata.mo32154F();
        if ((F || F2) && (!F || !F2 || !this.polygonsVisibilityAffect.equals(mVTaxiMetroConfigurationMetadata.polygonsVisibilityAffect))) {
            return false;
        }
        boolean M = mo32160M();
        boolean M2 = mVTaxiMetroConfigurationMetadata.mo32160M();
        if ((M || M2) && (!M || !M2 || this.tpSupported != mVTaxiMetroConfigurationMetadata.tpSupported)) {
            return false;
        }
        boolean o = mo32181o();
        boolean o2 = mVTaxiMetroConfigurationMetadata.mo32181o();
        if ((o || o2) && (!o || !o2 || this.displayProfile != mVTaxiMetroConfigurationMetadata.displayProfile)) {
            return false;
        }
        boolean v = mo32189v();
        boolean v2 = mVTaxiMetroConfigurationMetadata.mo32189v();
        if (!v && !v2) {
            return true;
        }
        if (!v || !v2 || this.maxNumberOfPassengers != mVTaxiMetroConfigurationMetadata.maxNumberOfPassengers) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata = (MVTaxiMetroConfigurationMetadata) obj;
        if (!getClass().equals(mVTaxiMetroConfigurationMetadata.getClass())) {
            return getClass().getName().compareTo(mVTaxiMetroConfigurationMetadata.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32188u()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32188u()));
        if (compareTo != 0 || ((mo32188u() && (compareTo = C25082a.m62839c(this.mainColor, mVTaxiMetroConfigurationMetadata.mainColor)) != 0) || (compareTo = Boolean.valueOf(mo32178k()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32178k()))) != 0 || ((mo32178k() && (compareTo = C25082a.m62839c(this.ctaTextColor, mVTaxiMetroConfigurationMetadata.ctaTextColor)) != 0) || (compareTo = Boolean.valueOf(mo32177j()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32177j()))) != 0 || ((mo32177j() && (compareTo = C25082a.m62839c(this.ctaBackgroundColor, mVTaxiMetroConfigurationMetadata.ctaBackgroundColor)) != 0) || (compareTo = Boolean.valueOf(mo32186t()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32186t()))) != 0 || ((mo32186t() && (compareTo = this.longImage.compareTo(mVTaxiMetroConfigurationMetadata.longImage)) != 0) || (compareTo = Boolean.valueOf(mo32158J()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32158J()))) != 0 || ((mo32158J() && (compareTo = this.shortImage.compareTo(mVTaxiMetroConfigurationMetadata.shortImage)) != 0) || (compareTo = Boolean.valueOf(mo32173g()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32173g()))) != 0 || ((mo32173g() && (compareTo = this.androidSchema.compareTo(mVTaxiMetroConfigurationMetadata.androidSchema)) != 0) || (compareTo = Boolean.valueOf(mo32185s()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32185s()))) != 0 || ((mo32185s() && (compareTo = this.iosSchema.compareTo(mVTaxiMetroConfigurationMetadata.iosSchema)) != 0) || (compareTo = Boolean.valueOf(mo32180m()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32180m()))) != 0 || ((mo32180m() && (compareTo = this.deepLinkUri.compareTo(mVTaxiMetroConfigurationMetadata.deepLinkUri)) != 0) || (compareTo = Boolean.valueOf(mo32190w()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32190w()))) != 0 || ((mo32190w() && (compareTo = this.myLocationDeepLinkUri.compareTo(mVTaxiMetroConfigurationMetadata.myLocationDeepLinkUri)) != 0) || (compareTo = Boolean.valueOf(mo32182p()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32182p()))) != 0 || ((mo32182p() && (compareTo = this.downloadLink.compareTo(mVTaxiMetroConfigurationMetadata.downloadLink)) != 0) || (compareTo = Boolean.valueOf(mo32157I()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32157I()))) != 0 || ((mo32157I() && (compareTo = this.providerAnalyticName.compareTo(mVTaxiMetroConfigurationMetadata.providerAnalyticName)) != 0) || (compareTo = Boolean.valueOf(mo32183q()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32183q()))) != 0 || ((mo32183q() && (compareTo = this.fab.compareTo(mVTaxiMetroConfigurationMetadata.fab)) != 0) || (compareTo = Boolean.valueOf(mo32159L()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32159L()))) != 0 || ((mo32159L() && (compareTo = this.suggestRoutes.compareTo(mVTaxiMetroConfigurationMetadata.suggestRoutes)) != 0) || (compareTo = Boolean.valueOf(mo32155G()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32155G()))) != 0 || ((mo32155G() && (compareTo = this.popup.compareTo(mVTaxiMetroConfigurationMetadata.popup)) != 0) || (compareTo = Boolean.valueOf(mo32179l()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32179l()))) != 0 || ((mo32179l() && (compareTo = this.dashboard.compareTo(mVTaxiMetroConfigurationMetadata.dashboard)) != 0) || (compareTo = Boolean.valueOf(mo32191y()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32191y()))) != 0 || ((mo32191y() && (compareTo = this.name.compareTo(mVTaxiMetroConfigurationMetadata.name)) != 0) || (compareTo = Boolean.valueOf(mo32152D()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32152D()))) != 0 || ((mo32152D() && (compareTo = this.paymentContext.compareTo(mVTaxiMetroConfigurationMetadata.paymentContext)) != 0) || (compareTo = Boolean.valueOf(mo32153E()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32153E()))) != 0 || ((mo32153E() && (compareTo = C25082a.m62844h(this.polygons, mVTaxiMetroConfigurationMetadata.polygons)) != 0) || (compareTo = Boolean.valueOf(mo32156H()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32156H()))) != 0 || ((mo32156H() && (compareTo = C25082a.m62839c(this.pressedColor, mVTaxiMetroConfigurationMetadata.pressedColor)) != 0) || (compareTo = Boolean.valueOf(mo32176i()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32176i()))) != 0 || ((mo32176i() && (compareTo = this.backDropImage.compareTo(mVTaxiMetroConfigurationMetadata.backDropImage)) != 0) || (compareTo = Boolean.valueOf(mo32161N()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32161N()))) != 0 || ((mo32161N() && (compareTo = this.vehicleImage.compareTo(mVTaxiMetroConfigurationMetadata.vehicleImage)) != 0) || (compareTo = Boolean.valueOf(mo32174h()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32174h()))) != 0 || ((mo32174h() && (compareTo = this.animations.compareTo(mVTaxiMetroConfigurationMetadata.animations)) != 0) || (compareTo = Boolean.valueOf(mo32151A()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32151A()))) != 0 || ((mo32151A() && (compareTo = this.order.compareTo(mVTaxiMetroConfigurationMetadata.order)) != 0) || (compareTo = Boolean.valueOf(mo32184r()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32184r()))) != 0 || ((mo32184r() && (compareTo = this.iosDownloadLink.compareTo(mVTaxiMetroConfigurationMetadata.iosDownloadLink)) != 0) || (compareTo = Boolean.valueOf(mo32172f()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32172f()))) != 0 || ((mo32172f() && (compareTo = this.androidDownloadLink.compareTo(mVTaxiMetroConfigurationMetadata.androidDownloadLink)) != 0) || (compareTo = Boolean.valueOf(mo32154F()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32154F()))) != 0 || ((mo32154F() && (compareTo = this.polygonsVisibilityAffect.compareTo(mVTaxiMetroConfigurationMetadata.polygonsVisibilityAffect)) != 0) || (compareTo = Boolean.valueOf(mo32160M()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32160M()))) != 0 || ((mo32160M() && (compareTo = C25082a.m62848l(this.tpSupported, mVTaxiMetroConfigurationMetadata.tpSupported)) != 0) || (compareTo = Boolean.valueOf(mo32181o()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32181o()))) != 0 || ((mo32181o() && (compareTo = C25082a.m62848l(this.displayProfile, mVTaxiMetroConfigurationMetadata.displayProfile)) != 0) || (compareTo = Boolean.valueOf(mo32189v()).compareTo(Boolean.valueOf(mVTaxiMetroConfigurationMetadata.mo32189v()))) != 0))))))))))))))))))))))))))))) {
            return compareTo;
        }
        if (!mo32189v() || (c = C25082a.m62839c(this.maxNumberOfPassengers, mVTaxiMetroConfigurationMetadata.maxNumberOfPassengers)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiMetroConfigurationMetadata)) {
            return mo32169a((MVTaxiMetroConfigurationMetadata) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32172f() {
        return this.androidDownloadLink != null;
    }

    /* renamed from: g */
    public final boolean mo32173g() {
        return this.androidSchema != null;
    }

    /* renamed from: h */
    public final boolean mo32174h() {
        return this.animations != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32176i() {
        return this.backDropImage != null;
    }

    /* renamed from: j */
    public final boolean mo32177j() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: k */
    public final boolean mo32178k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final boolean mo32179l() {
        return this.dashboard != null;
    }

    /* renamed from: m */
    public final boolean mo32180m() {
        return this.deepLinkUri != null;
    }

    /* renamed from: o */
    public final boolean mo32181o() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: p */
    public final boolean mo32182p() {
        return this.downloadLink != null;
    }

    /* renamed from: q */
    public final boolean mo32183q() {
        return this.fab != null;
    }

    /* renamed from: r */
    public final boolean mo32184r() {
        return this.iosDownloadLink != null;
    }

    /* renamed from: s */
    public final boolean mo32185s() {
        return this.iosSchema != null;
    }

    /* renamed from: t */
    public final boolean mo32186t() {
        return this.longImage != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiMetroConfigurationMetadata(", "mainColor:");
        C0016g.m42z(n, this.mainColor, ", ", "ctaTextColor:");
        C0016g.m42z(n, this.ctaTextColor, ", ", "ctaBackgroundColor:");
        C0016g.m42z(n, this.ctaBackgroundColor, ", ", "longImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.longImage;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("shortImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams2 = this.shortImage;
        if (mVImageReferenceWithParams2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams2);
        }
        n.append(", ");
        n.append("androidSchema:");
        String str = this.androidSchema;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("iosSchema:");
        String str2 = this.iosSchema;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("deepLinkUri:");
        String str3 = this.deepLinkUri;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("myLocationDeepLinkUri:");
        String str4 = this.myLocationDeepLinkUri;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("downloadLink:");
        String str5 = this.downloadLink;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("providerAnalyticName:");
        String str6 = this.providerAnalyticName;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        if (mo32183q()) {
            n.append(", ");
            n.append("fab:");
            MVTaxiFabConfig mVTaxiFabConfig = this.fab;
            if (mVTaxiFabConfig == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiFabConfig);
            }
        }
        n.append(", ");
        n.append("suggestRoutes:");
        MVTaxiSuggestRoutes mVTaxiSuggestRoutes = this.suggestRoutes;
        if (mVTaxiSuggestRoutes == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTaxiSuggestRoutes);
        }
        if (mo32155G()) {
            n.append(", ");
            n.append("popup:");
            MVTaxiPopupConfig mVTaxiPopupConfig = this.popup;
            if (mVTaxiPopupConfig == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiPopupConfig);
            }
        }
        if (mo32179l()) {
            n.append(", ");
            n.append("dashboard:");
            MVTaxiDashboardConfig mVTaxiDashboardConfig = this.dashboard;
            if (mVTaxiDashboardConfig == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiDashboardConfig);
            }
        }
        n.append(", ");
        n.append("name:");
        String str7 = this.name;
        if (str7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str7);
        }
        if (mo32152D()) {
            n.append(", ");
            n.append("paymentContext:");
            String str8 = this.paymentContext;
            if (str8 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str8);
            }
        }
        if (mo32153E()) {
            n.append(", ");
            n.append("polygons:");
            List<MVTaxiPolygon> list = this.polygons;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo32156H()) {
            n.append(", ");
            n.append("pressedColor:");
            n.append(this.pressedColor);
        }
        n.append(", ");
        n.append("backDropImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams3 = this.backDropImage;
        if (mVImageReferenceWithParams3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams3);
        }
        if (mo32161N()) {
            n.append(", ");
            n.append("vehicleImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams4 = this.vehicleImage;
            if (mVImageReferenceWithParams4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams4);
            }
        }
        if (mo32174h()) {
            n.append(", ");
            n.append("animations:");
            MVTaxiAnimationsConfig mVTaxiAnimationsConfig = this.animations;
            if (mVTaxiAnimationsConfig == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiAnimationsConfig);
            }
        }
        if (mo32151A()) {
            n.append(", ");
            n.append("order:");
            MVTaxiOrderConfig mVTaxiOrderConfig = this.order;
            if (mVTaxiOrderConfig == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiOrderConfig);
            }
        }
        if (mo32184r()) {
            n.append(", ");
            n.append("iosDownloadLink:");
            String str9 = this.iosDownloadLink;
            if (str9 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str9);
            }
        }
        if (mo32172f()) {
            n.append(", ");
            n.append("androidDownloadLink:");
            String str10 = this.androidDownloadLink;
            if (str10 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str10);
            }
        }
        if (mo32154F()) {
            n.append(", ");
            n.append("polygonsVisibilityAffect:");
            MVTaxiPolygonsVisibiltyAffect mVTaxiPolygonsVisibiltyAffect = this.polygonsVisibilityAffect;
            if (mVTaxiPolygonsVisibiltyAffect == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTaxiPolygonsVisibiltyAffect);
            }
        }
        if (mo32160M()) {
            n.append(", ");
            n.append("tpSupported:");
            n.append(this.tpSupported);
        }
        if (mo32181o()) {
            n.append(", ");
            n.append("displayProfile:");
            n.append(this.displayProfile);
        }
        if (mo32189v()) {
            n.append(", ");
            n.append("maxNumberOfPassengers:");
            n.append(this.maxNumberOfPassengers);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo32188u() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: v */
    public final boolean mo32189v() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: w */
    public final boolean mo32190w() {
        return this.myLocationDeepLinkUri != null;
    }

    /* renamed from: y */
    public final boolean mo32191y() {
        return this.name != null;
    }
}
