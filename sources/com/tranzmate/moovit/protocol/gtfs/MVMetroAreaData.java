package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.common.MVUserReportLineCategoryType;
import com.tranzmate.moovit.protocol.common.MVUserReportStopCategoryType;
import com.tranzmate.moovit.protocol.presentation.MVLineTemplate;
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

public class MVMetroAreaData implements TBase<MVMetroAreaData, _Fields>, Serializable, Cloneable, Comparable<MVMetroAreaData> {

    /* renamed from: b */
    public static final C25113c f25740b = new C25113c("metroAreaId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25741c = new C25113c("timeZone", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25742d = new C25113c("agencies", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f25743e = new C25113c("routeTypes", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f25744f = new C25113c("polygon", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f25745g = new C25113c("templates", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f25746h = new C25113c("metroAreaName", (byte) 11, 8);

    /* renamed from: i */
    public static final C25113c f25747i = new C25113c("linesUserReportCategoryIds", (byte) 15, 9);

    /* renamed from: j */
    public static final C25113c f25748j = new C25113c("stopsUserReportCategoryIds", (byte) 15, 10);

    /* renamed from: k */
    public static final C25113c f25749k = new C25113c("countryId", (byte) 8, 11);

    /* renamed from: l */
    public static final C25113c f25750l = new C25113c("countryName", (byte) 11, 12);

    /* renamed from: m */
    public static final C25113c f25751m = new C25113c("defaultLocation", (byte) 12, 13);

    /* renamed from: n */
    public static final C25113c f25752n = new C25113c("revisionNumber", (byte) 10, 14);

    /* renamed from: o */
    public static final C25113c f25753o = new C25113c("localDayChangeTime", (byte) 8, 15);

    /* renamed from: p */
    public static final C25113c f25754p = new C25113c("bicycleProviders", (byte) 15, 16);

    /* renamed from: q */
    public static final C25113c f25755q = new C25113c("metroLanguage", (byte) 12, 17);

    /* renamed from: r */
    public static final C25113c f25756r = new C25113c("countryCode", (byte) 11, 18);

    /* renamed from: s */
    public static final C25113c f25757s = new C25113c("metroClass", (byte) 11, 19);

    /* renamed from: t */
    public static final C25113c f25758t = new C25113c("locale", (byte) 11, 20);

    /* renamed from: u */
    public static final HashMap f25759u;

    /* renamed from: v */
    public static final Map<_Fields, FieldMetaData> f25760v;
    private byte __isset_bitfield = 0;
    public List<MVAgency> agencies;
    public List<MVBicycleProvider> bicycleProviders;
    public String countryCode;
    public int countryId;
    public String countryName;
    public MVLatLon defaultLocation;
    public List<MVUserReportLineCategoryType> linesUserReportCategoryIds;
    public int localDayChangeTime;
    public String locale;
    public int metroAreaId;
    public String metroAreaName;
    public String metroClass;
    public MVMetroLanguage metroLanguage;
    private _Fields[] optionals = {_Fields.METRO_LANGUAGE};
    public String polygon;
    public long revisionNumber;
    public List<MVMetroRouteType> routeTypes;
    public List<MVUserReportStopCategoryType> stopsUserReportCategoryIds;
    public List<MVLineTemplate> templates;
    public String timeZone;

    public enum _Fields implements C25085c {
        METRO_AREA_ID(1, "metroAreaId"),
        TIME_ZONE(2, "timeZone"),
        AGENCIES(3, "agencies"),
        ROUTE_TYPES(4, "routeTypes"),
        POLYGON(5, "polygon"),
        TEMPLATES(6, "templates"),
        METRO_AREA_NAME(8, "metroAreaName"),
        LINES_USER_REPORT_CATEGORY_IDS(9, "linesUserReportCategoryIds"),
        STOPS_USER_REPORT_CATEGORY_IDS(10, "stopsUserReportCategoryIds"),
        COUNTRY_ID(11, "countryId"),
        COUNTRY_NAME(12, "countryName"),
        DEFAULT_LOCATION(13, "defaultLocation"),
        REVISION_NUMBER(14, "revisionNumber"),
        LOCAL_DAY_CHANGE_TIME(15, "localDayChangeTime"),
        BICYCLE_PROVIDERS(16, "bicycleProviders"),
        METRO_LANGUAGE(17, "metroLanguage"),
        COUNTRY_CODE(18, "countryCode"),
        METRO_CLASS(19, "metroClass"),
        LOCALE(20, "locale");
        
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
                    return METRO_AREA_ID;
                case 2:
                    return TIME_ZONE;
                case 3:
                    return AGENCIES;
                case 4:
                    return ROUTE_TYPES;
                case 5:
                    return POLYGON;
                case 6:
                    return TEMPLATES;
                case 8:
                    return METRO_AREA_NAME;
                case 9:
                    return LINES_USER_REPORT_CATEGORY_IDS;
                case 10:
                    return STOPS_USER_REPORT_CATEGORY_IDS;
                case 11:
                    return COUNTRY_ID;
                case 12:
                    return COUNTRY_NAME;
                case 13:
                    return DEFAULT_LOCATION;
                case 14:
                    return REVISION_NUMBER;
                case 15:
                    return LOCAL_DAY_CHANGE_TIME;
                case 16:
                    return BICYCLE_PROVIDERS;
                case 17:
                    return METRO_LANGUAGE;
                case 18:
                    return COUNTRY_CODE;
                case 19:
                    return METRO_CLASS;
                case 20:
                    return LOCALE;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroAreaData$a */
    public static class C8799a extends C25239c<MVMetroAreaData> {
        public C8799a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroAreaData mVMetroAreaData = (MVMetroAreaData) tBase;
            MVLatLon mVLatLon = mVMetroAreaData.defaultLocation;
            C25113c cVar = MVMetroAreaData.f25740b;
            gVar.mo61687K();
            gVar.mo61711x(MVMetroAreaData.f25740b);
            gVar.mo61678B(mVMetroAreaData.metroAreaId);
            gVar.mo61712y();
            if (mVMetroAreaData.timeZone != null) {
                gVar.mo61711x(MVMetroAreaData.f25741c);
                gVar.mo61686J(mVMetroAreaData.timeZone);
                gVar.mo61712y();
            }
            if (mVMetroAreaData.agencies != null) {
                gVar.mo61711x(MVMetroAreaData.f25742d);
                gVar.mo61680D(new C25119e((byte) 12, mVMetroAreaData.agencies.size()));
                for (MVAgency X0 : mVMetroAreaData.agencies) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMetroAreaData.routeTypes != null) {
                gVar.mo61711x(MVMetroAreaData.f25743e);
                gVar.mo61680D(new C25119e((byte) 12, mVMetroAreaData.routeTypes.size()));
                for (MVMetroRouteType X02 : mVMetroAreaData.routeTypes) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMetroAreaData.polygon != null) {
                gVar.mo61711x(MVMetroAreaData.f25744f);
                gVar.mo61686J(mVMetroAreaData.polygon);
                gVar.mo61712y();
            }
            if (mVMetroAreaData.templates != null) {
                gVar.mo61711x(MVMetroAreaData.f25745g);
                gVar.mo61680D(new C25119e((byte) 12, mVMetroAreaData.templates.size()));
                for (MVLineTemplate X03 : mVMetroAreaData.templates) {
                    X03.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMetroAreaData.metroAreaName != null) {
                gVar.mo61711x(MVMetroAreaData.f25746h);
                gVar.mo61686J(mVMetroAreaData.metroAreaName);
                gVar.mo61712y();
            }
            if (mVMetroAreaData.linesUserReportCategoryIds != null) {
                gVar.mo61711x(MVMetroAreaData.f25747i);
                gVar.mo61680D(new C25119e((byte) 8, mVMetroAreaData.linesUserReportCategoryIds.size()));
                for (MVUserReportLineCategoryType value : mVMetroAreaData.linesUserReportCategoryIds) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMetroAreaData.stopsUserReportCategoryIds != null) {
                gVar.mo61711x(MVMetroAreaData.f25748j);
                gVar.mo61680D(new C25119e((byte) 8, mVMetroAreaData.stopsUserReportCategoryIds.size()));
                for (MVUserReportStopCategoryType value2 : mVMetroAreaData.stopsUserReportCategoryIds) {
                    gVar.mo61678B(value2.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMetroAreaData.f25749k);
            gVar.mo61678B(mVMetroAreaData.countryId);
            gVar.mo61712y();
            if (mVMetroAreaData.countryName != null) {
                gVar.mo61711x(MVMetroAreaData.f25750l);
                gVar.mo61686J(mVMetroAreaData.countryName);
                gVar.mo61712y();
            }
            if (mVMetroAreaData.defaultLocation != null) {
                gVar.mo61711x(MVMetroAreaData.f25751m);
                mVMetroAreaData.defaultLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMetroAreaData.f25752n);
            gVar.mo61679C(mVMetroAreaData.revisionNumber);
            gVar.mo61712y();
            gVar.mo61711x(MVMetroAreaData.f25753o);
            gVar.mo61678B(mVMetroAreaData.localDayChangeTime);
            gVar.mo61712y();
            if (mVMetroAreaData.bicycleProviders != null) {
                gVar.mo61711x(MVMetroAreaData.f25754p);
                gVar.mo61680D(new C25119e((byte) 12, mVMetroAreaData.bicycleProviders.size()));
                for (MVBicycleProvider X04 : mVMetroAreaData.bicycleProviders) {
                    X04.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMetroAreaData.metroLanguage != null && mVMetroAreaData.mo27433s()) {
                gVar.mo61711x(MVMetroAreaData.f25755q);
                mVMetroAreaData.metroLanguage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMetroAreaData.countryCode != null) {
                gVar.mo61711x(MVMetroAreaData.f25756r);
                gVar.mo61686J(mVMetroAreaData.countryCode);
                gVar.mo61712y();
            }
            if (mVMetroAreaData.metroClass != null) {
                gVar.mo61711x(MVMetroAreaData.f25757s);
                gVar.mo61686J(mVMetroAreaData.metroClass);
                gVar.mo61712y();
            }
            if (mVMetroAreaData.locale != null) {
                gVar.mo61711x(MVMetroAreaData.f25758t);
                gVar.mo61686J(mVMetroAreaData.locale);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroAreaData mVMetroAreaData = (MVMetroAreaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVMetroAreaData.defaultLocation;
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.metroAreaId = gVar.mo61696i();
                            mVMetroAreaData.mo27416F();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.timeZone = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVMetroAreaData.agencies = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVAgency mVAgency = new MVAgency();
                                mVAgency.mo25201C1(gVar);
                                mVMetroAreaData.agencies.add(mVAgency);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVMetroAreaData.routeTypes = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVMetroRouteType mVMetroRouteType = new MVMetroRouteType();
                                mVMetroRouteType.mo25201C1(gVar);
                                mVMetroAreaData.routeTypes.add(mVMetroRouteType);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.polygon = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVMetroAreaData.templates = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                MVLineTemplate mVLineTemplate = new MVLineTemplate();
                                mVLineTemplate.mo25201C1(gVar);
                                mVMetroAreaData.templates.add(mVLineTemplate);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.metroAreaName = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k4 = gVar.mo61698k();
                            mVMetroAreaData.linesUserReportCategoryIds = new ArrayList(k4.f63395b);
                            while (i < k4.f63395b) {
                                mVMetroAreaData.linesUserReportCategoryIds.add(MVUserReportLineCategoryType.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 10:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k5 = gVar.mo61698k();
                            mVMetroAreaData.stopsUserReportCategoryIds = new ArrayList(k5.f63395b);
                            while (i < k5.f63395b) {
                                mVMetroAreaData.stopsUserReportCategoryIds.add(MVUserReportStopCategoryType.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.countryId = gVar.mo61696i();
                            mVMetroAreaData.mo27414D();
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.countryName = gVar.mo61704q();
                            break;
                        }
                    case 13:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVMetroAreaData.defaultLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 14:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.revisionNumber = gVar.mo61697j();
                            mVMetroAreaData.mo27417G();
                            break;
                        }
                    case 15:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.localDayChangeTime = gVar.mo61696i();
                            mVMetroAreaData.mo27415E();
                            break;
                        }
                    case 16:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k6 = gVar.mo61698k();
                            mVMetroAreaData.bicycleProviders = new ArrayList(k6.f63395b);
                            while (i < k6.f63395b) {
                                MVBicycleProvider mVBicycleProvider = new MVBicycleProvider();
                                mVBicycleProvider.mo25201C1(gVar);
                                mVMetroAreaData.bicycleProviders.add(mVBicycleProvider);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 17:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMetroLanguage mVMetroLanguage = new MVMetroLanguage();
                            mVMetroAreaData.metroLanguage = mVMetroLanguage;
                            mVMetroLanguage.mo25201C1(gVar);
                            break;
                        }
                    case 18:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.countryCode = gVar.mo61704q();
                            break;
                        }
                    case 19:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.metroClass = gVar.mo61704q();
                            break;
                        }
                    case 20:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMetroAreaData.locale = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroAreaData$b */
    public static class C8800b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8799a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroAreaData$c */
    public static class C8801c extends C25240d<MVMetroAreaData> {
        public C8801c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroAreaData mVMetroAreaData = (MVMetroAreaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMetroAreaData.mo27430p()) {
                bitSet.set(0);
            }
            if (mVMetroAreaData.mo27413A()) {
                bitSet.set(1);
            }
            if (mVMetroAreaData.mo27420f()) {
                bitSet.set(2);
            }
            if (mVMetroAreaData.mo27437v()) {
                bitSet.set(3);
            }
            if (mVMetroAreaData.mo27434t()) {
                bitSet.set(4);
            }
            if (mVMetroAreaData.mo27439y()) {
                bitSet.set(5);
            }
            if (mVMetroAreaData.mo27431q()) {
                bitSet.set(6);
            }
            if (mVMetroAreaData.mo27427l()) {
                bitSet.set(7);
            }
            if (mVMetroAreaData.mo27438w()) {
                bitSet.set(8);
            }
            if (mVMetroAreaData.mo27424i()) {
                bitSet.set(9);
            }
            if (mVMetroAreaData.mo27425j()) {
                bitSet.set(10);
            }
            if (mVMetroAreaData.mo27426k()) {
                bitSet.set(11);
            }
            if (mVMetroAreaData.mo27436u()) {
                bitSet.set(12);
            }
            if (mVMetroAreaData.mo27428m()) {
                bitSet.set(13);
            }
            if (mVMetroAreaData.mo27421g()) {
                bitSet.set(14);
            }
            if (mVMetroAreaData.mo27433s()) {
                bitSet.set(15);
            }
            if (mVMetroAreaData.mo27422h()) {
                bitSet.set(16);
            }
            if (mVMetroAreaData.mo27432r()) {
                bitSet.set(17);
            }
            if (mVMetroAreaData.mo27429o()) {
                bitSet.set(18);
            }
            jVar.mo61738U(bitSet, 19);
            if (mVMetroAreaData.mo27430p()) {
                jVar.mo61678B(mVMetroAreaData.metroAreaId);
            }
            if (mVMetroAreaData.mo27413A()) {
                jVar.mo61686J(mVMetroAreaData.timeZone);
            }
            if (mVMetroAreaData.mo27420f()) {
                jVar.mo61678B(mVMetroAreaData.agencies.size());
                for (MVAgency X0 : mVMetroAreaData.agencies) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVMetroAreaData.mo27437v()) {
                jVar.mo61678B(mVMetroAreaData.routeTypes.size());
                for (MVMetroRouteType X02 : mVMetroAreaData.routeTypes) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVMetroAreaData.mo27434t()) {
                jVar.mo61686J(mVMetroAreaData.polygon);
            }
            if (mVMetroAreaData.mo27439y()) {
                jVar.mo61678B(mVMetroAreaData.templates.size());
                for (MVLineTemplate X03 : mVMetroAreaData.templates) {
                    X03.mo25202X0(jVar);
                }
            }
            if (mVMetroAreaData.mo27431q()) {
                jVar.mo61686J(mVMetroAreaData.metroAreaName);
            }
            if (mVMetroAreaData.mo27427l()) {
                jVar.mo61678B(mVMetroAreaData.linesUserReportCategoryIds.size());
                for (MVUserReportLineCategoryType value : mVMetroAreaData.linesUserReportCategoryIds) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVMetroAreaData.mo27438w()) {
                jVar.mo61678B(mVMetroAreaData.stopsUserReportCategoryIds.size());
                for (MVUserReportStopCategoryType value2 : mVMetroAreaData.stopsUserReportCategoryIds) {
                    jVar.mo61678B(value2.getValue());
                }
            }
            if (mVMetroAreaData.mo27424i()) {
                jVar.mo61678B(mVMetroAreaData.countryId);
            }
            if (mVMetroAreaData.mo27425j()) {
                jVar.mo61686J(mVMetroAreaData.countryName);
            }
            if (mVMetroAreaData.mo27426k()) {
                mVMetroAreaData.defaultLocation.mo25202X0(jVar);
            }
            if (mVMetroAreaData.mo27436u()) {
                jVar.mo61679C(mVMetroAreaData.revisionNumber);
            }
            if (mVMetroAreaData.mo27428m()) {
                jVar.mo61678B(mVMetroAreaData.localDayChangeTime);
            }
            if (mVMetroAreaData.mo27421g()) {
                jVar.mo61678B(mVMetroAreaData.bicycleProviders.size());
                for (MVBicycleProvider X04 : mVMetroAreaData.bicycleProviders) {
                    X04.mo25202X0(jVar);
                }
            }
            if (mVMetroAreaData.mo27433s()) {
                mVMetroAreaData.metroLanguage.mo25202X0(jVar);
            }
            if (mVMetroAreaData.mo27422h()) {
                jVar.mo61686J(mVMetroAreaData.countryCode);
            }
            if (mVMetroAreaData.mo27432r()) {
                jVar.mo61686J(mVMetroAreaData.metroClass);
            }
            if (mVMetroAreaData.mo27429o()) {
                jVar.mo61686J(mVMetroAreaData.locale);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroAreaData mVMetroAreaData = (MVMetroAreaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(19);
            if (T.get(0)) {
                mVMetroAreaData.metroAreaId = jVar.mo61696i();
                mVMetroAreaData.mo27416F();
            }
            if (T.get(1)) {
                mVMetroAreaData.timeZone = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVMetroAreaData.agencies = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAgency mVAgency = new MVAgency();
                    mVAgency.mo25201C1(jVar);
                    mVMetroAreaData.agencies.add(mVAgency);
                }
            }
            if (T.get(3)) {
                int i3 = jVar.mo61696i();
                mVMetroAreaData.routeTypes = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVMetroRouteType mVMetroRouteType = new MVMetroRouteType();
                    mVMetroRouteType.mo25201C1(jVar);
                    mVMetroAreaData.routeTypes.add(mVMetroRouteType);
                }
            }
            if (T.get(4)) {
                mVMetroAreaData.polygon = jVar.mo61704q();
            }
            if (T.get(5)) {
                int i5 = jVar.mo61696i();
                mVMetroAreaData.templates = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    MVLineTemplate mVLineTemplate = new MVLineTemplate();
                    mVLineTemplate.mo25201C1(jVar);
                    mVMetroAreaData.templates.add(mVLineTemplate);
                }
            }
            if (T.get(6)) {
                mVMetroAreaData.metroAreaName = jVar.mo61704q();
            }
            if (T.get(7)) {
                int i7 = jVar.mo61696i();
                mVMetroAreaData.linesUserReportCategoryIds = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    mVMetroAreaData.linesUserReportCategoryIds.add(MVUserReportLineCategoryType.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(8)) {
                int i9 = jVar.mo61696i();
                mVMetroAreaData.stopsUserReportCategoryIds = new ArrayList(i9);
                for (int i11 = 0; i11 < i9; i11++) {
                    mVMetroAreaData.stopsUserReportCategoryIds.add(MVUserReportStopCategoryType.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(9)) {
                mVMetroAreaData.countryId = jVar.mo61696i();
                mVMetroAreaData.mo27414D();
            }
            if (T.get(10)) {
                mVMetroAreaData.countryName = jVar.mo61704q();
            }
            if (T.get(11)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMetroAreaData.defaultLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(12)) {
                mVMetroAreaData.revisionNumber = jVar.mo61697j();
                mVMetroAreaData.mo27417G();
            }
            if (T.get(13)) {
                mVMetroAreaData.localDayChangeTime = jVar.mo61696i();
                mVMetroAreaData.mo27415E();
            }
            if (T.get(14)) {
                int i12 = jVar.mo61696i();
                mVMetroAreaData.bicycleProviders = new ArrayList(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    MVBicycleProvider mVBicycleProvider = new MVBicycleProvider();
                    mVBicycleProvider.mo25201C1(jVar);
                    mVMetroAreaData.bicycleProviders.add(mVBicycleProvider);
                }
            }
            if (T.get(15)) {
                MVMetroLanguage mVMetroLanguage = new MVMetroLanguage();
                mVMetroAreaData.metroLanguage = mVMetroLanguage;
                mVMetroLanguage.mo25201C1(jVar);
            }
            if (T.get(16)) {
                mVMetroAreaData.countryCode = jVar.mo61704q();
            }
            if (T.get(17)) {
                mVMetroAreaData.metroClass = jVar.mo61704q();
            }
            if (T.get(18)) {
                mVMetroAreaData.locale = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroAreaData$d */
    public static class C8802d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8801c(0);
        }
    }

    static {
        new C17394d0("MVMetroAreaData");
        HashMap hashMap = new HashMap();
        f25759u = hashMap;
        hashMap.put(C25239c.class, new C8800b());
        hashMap.put(C25240d.class, new C8802d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.METRO_AREA_ID, new FieldMetaData("metroAreaId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TIME_ZONE, new FieldMetaData("timeZone", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCIES, new FieldMetaData("agencies", (byte) 3, new ListMetaData(new StructMetaData(MVAgency.class))));
        enumMap.put(_Fields.ROUTE_TYPES, new FieldMetaData("routeTypes", (byte) 3, new ListMetaData(new StructMetaData(MVMetroRouteType.class))));
        enumMap.put(_Fields.POLYGON, new FieldMetaData("polygon", (byte) 3, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        enumMap.put(_Fields.TEMPLATES, new FieldMetaData("templates", (byte) 3, new ListMetaData(new StructMetaData(MVLineTemplate.class))));
        enumMap.put(_Fields.METRO_AREA_NAME, new FieldMetaData("metroAreaName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LINES_USER_REPORT_CATEGORY_IDS, new FieldMetaData("linesUserReportCategoryIds", (byte) 3, new ListMetaData(new EnumMetaData(MVUserReportLineCategoryType.class))));
        enumMap.put(_Fields.STOPS_USER_REPORT_CATEGORY_IDS, new FieldMetaData("stopsUserReportCategoryIds", (byte) 3, new ListMetaData(new EnumMetaData(MVUserReportStopCategoryType.class))));
        enumMap.put(_Fields.COUNTRY_ID, new FieldMetaData("countryId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.COUNTRY_NAME, new FieldMetaData("countryName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DEFAULT_LOCATION, new FieldMetaData("defaultLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.REVISION_NUMBER, new FieldMetaData("revisionNumber", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.LOCAL_DAY_CHANGE_TIME, new FieldMetaData("localDayChangeTime", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.BICYCLE_PROVIDERS, new FieldMetaData("bicycleProviders", (byte) 3, new ListMetaData(new StructMetaData(MVBicycleProvider.class))));
        enumMap.put(_Fields.METRO_LANGUAGE, new FieldMetaData("metroLanguage", (byte) 2, new StructMetaData(MVMetroLanguage.class)));
        enumMap.put(_Fields.COUNTRY_CODE, new FieldMetaData("countryCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.METRO_CLASS, new FieldMetaData("metroClass", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCALE, new FieldMetaData("locale", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25760v = unmodifiableMap;
        FieldMetaData.m61947a(MVMetroAreaData.class, unmodifiableMap);
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
    public final boolean mo27413A() {
        return this.timeZone != null;
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f25759u.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final void mo27414D() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: E */
    public final void mo27415E() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: F */
    public final void mo27416F() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: G */
    public final void mo27417G() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25759u.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMetroAreaData mVMetroAreaData = (MVMetroAreaData) obj;
        if (!getClass().equals(mVMetroAreaData.getClass())) {
            return getClass().getName().compareTo(mVMetroAreaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27430p()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27430p()));
        if (compareTo2 != 0 || ((mo27430p() && (compareTo2 = C25082a.m62839c(this.metroAreaId, mVMetroAreaData.metroAreaId)) != 0) || (compareTo2 = Boolean.valueOf(mo27413A()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27413A()))) != 0 || ((mo27413A() && (compareTo2 = this.timeZone.compareTo(mVMetroAreaData.timeZone)) != 0) || (compareTo2 = Boolean.valueOf(mo27420f()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27420f()))) != 0 || ((mo27420f() && (compareTo2 = C25082a.m62844h(this.agencies, mVMetroAreaData.agencies)) != 0) || (compareTo2 = Boolean.valueOf(mo27437v()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27437v()))) != 0 || ((mo27437v() && (compareTo2 = C25082a.m62844h(this.routeTypes, mVMetroAreaData.routeTypes)) != 0) || (compareTo2 = Boolean.valueOf(mo27434t()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27434t()))) != 0 || ((mo27434t() && (compareTo2 = this.polygon.compareTo(mVMetroAreaData.polygon)) != 0) || (compareTo2 = Boolean.valueOf(mo27439y()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27439y()))) != 0 || ((mo27439y() && (compareTo2 = C25082a.m62844h(this.templates, mVMetroAreaData.templates)) != 0) || (compareTo2 = Boolean.valueOf(mo27431q()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27431q()))) != 0 || ((mo27431q() && (compareTo2 = this.metroAreaName.compareTo(mVMetroAreaData.metroAreaName)) != 0) || (compareTo2 = Boolean.valueOf(mo27427l()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27427l()))) != 0 || ((mo27427l() && (compareTo2 = C25082a.m62844h(this.linesUserReportCategoryIds, mVMetroAreaData.linesUserReportCategoryIds)) != 0) || (compareTo2 = Boolean.valueOf(mo27438w()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27438w()))) != 0 || ((mo27438w() && (compareTo2 = C25082a.m62844h(this.stopsUserReportCategoryIds, mVMetroAreaData.stopsUserReportCategoryIds)) != 0) || (compareTo2 = Boolean.valueOf(mo27424i()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27424i()))) != 0 || ((mo27424i() && (compareTo2 = C25082a.m62839c(this.countryId, mVMetroAreaData.countryId)) != 0) || (compareTo2 = Boolean.valueOf(mo27425j()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27425j()))) != 0 || ((mo27425j() && (compareTo2 = this.countryName.compareTo(mVMetroAreaData.countryName)) != 0) || (compareTo2 = Boolean.valueOf(mo27426k()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27426k()))) != 0 || ((mo27426k() && (compareTo2 = this.defaultLocation.compareTo(mVMetroAreaData.defaultLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo27436u()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27436u()))) != 0 || ((mo27436u() && (compareTo2 = C25082a.m62840d(this.revisionNumber, mVMetroAreaData.revisionNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo27428m()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27428m()))) != 0 || ((mo27428m() && (compareTo2 = C25082a.m62839c(this.localDayChangeTime, mVMetroAreaData.localDayChangeTime)) != 0) || (compareTo2 = Boolean.valueOf(mo27421g()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27421g()))) != 0 || ((mo27421g() && (compareTo2 = C25082a.m62844h(this.bicycleProviders, mVMetroAreaData.bicycleProviders)) != 0) || (compareTo2 = Boolean.valueOf(mo27433s()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27433s()))) != 0 || ((mo27433s() && (compareTo2 = this.metroLanguage.compareTo(mVMetroAreaData.metroLanguage)) != 0) || (compareTo2 = Boolean.valueOf(mo27422h()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27422h()))) != 0 || ((mo27422h() && (compareTo2 = this.countryCode.compareTo(mVMetroAreaData.countryCode)) != 0) || (compareTo2 = Boolean.valueOf(mo27432r()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27432r()))) != 0 || ((mo27432r() && (compareTo2 = this.metroClass.compareTo(mVMetroAreaData.metroClass)) != 0) || (compareTo2 = Boolean.valueOf(mo27429o()).compareTo(Boolean.valueOf(mVMetroAreaData.mo27429o()))) != 0))))))))))))))))))) {
            return compareTo2;
        }
        if (!mo27429o() || (compareTo = this.locale.compareTo(mVMetroAreaData.locale)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMetroAreaData)) {
            return false;
        }
        MVMetroAreaData mVMetroAreaData = (MVMetroAreaData) obj;
        if (this.metroAreaId != mVMetroAreaData.metroAreaId) {
            return false;
        }
        boolean A = mo27413A();
        boolean A2 = mVMetroAreaData.mo27413A();
        if ((A || A2) && (!A || !A2 || !this.timeZone.equals(mVMetroAreaData.timeZone))) {
            return false;
        }
        boolean f = mo27420f();
        boolean f2 = mVMetroAreaData.mo27420f();
        if ((f || f2) && (!f || !f2 || !this.agencies.equals(mVMetroAreaData.agencies))) {
            return false;
        }
        boolean v = mo27437v();
        boolean v2 = mVMetroAreaData.mo27437v();
        if ((v || v2) && (!v || !v2 || !this.routeTypes.equals(mVMetroAreaData.routeTypes))) {
            return false;
        }
        boolean t = mo27434t();
        boolean t2 = mVMetroAreaData.mo27434t();
        if ((t || t2) && (!t || !t2 || !this.polygon.equals(mVMetroAreaData.polygon))) {
            return false;
        }
        boolean y = mo27439y();
        boolean y2 = mVMetroAreaData.mo27439y();
        if ((y || y2) && (!y || !y2 || !this.templates.equals(mVMetroAreaData.templates))) {
            return false;
        }
        boolean q = mo27431q();
        boolean q2 = mVMetroAreaData.mo27431q();
        if ((q || q2) && (!q || !q2 || !this.metroAreaName.equals(mVMetroAreaData.metroAreaName))) {
            return false;
        }
        boolean l = mo27427l();
        boolean l2 = mVMetroAreaData.mo27427l();
        if ((l || l2) && (!l || !l2 || !this.linesUserReportCategoryIds.equals(mVMetroAreaData.linesUserReportCategoryIds))) {
            return false;
        }
        boolean w = mo27438w();
        boolean w2 = mVMetroAreaData.mo27438w();
        if (((w || w2) && (!w || !w2 || !this.stopsUserReportCategoryIds.equals(mVMetroAreaData.stopsUserReportCategoryIds))) || this.countryId != mVMetroAreaData.countryId) {
            return false;
        }
        boolean j = mo27425j();
        boolean j2 = mVMetroAreaData.mo27425j();
        if ((j || j2) && (!j || !j2 || !this.countryName.equals(mVMetroAreaData.countryName))) {
            return false;
        }
        boolean k = mo27426k();
        boolean k2 = mVMetroAreaData.mo27426k();
        if (((k || k2) && (!k || !k2 || !this.defaultLocation.mo26290a(mVMetroAreaData.defaultLocation))) || this.revisionNumber != mVMetroAreaData.revisionNumber || this.localDayChangeTime != mVMetroAreaData.localDayChangeTime) {
            return false;
        }
        boolean g = mo27421g();
        boolean g2 = mVMetroAreaData.mo27421g();
        if ((g || g2) && (!g || !g2 || !this.bicycleProviders.equals(mVMetroAreaData.bicycleProviders))) {
            return false;
        }
        boolean s = mo27433s();
        boolean s2 = mVMetroAreaData.mo27433s();
        if ((s || s2) && (!s || !s2 || !this.metroLanguage.mo27441a(mVMetroAreaData.metroLanguage))) {
            return false;
        }
        boolean h = mo27422h();
        boolean h2 = mVMetroAreaData.mo27422h();
        if ((h || h2) && (!h || !h2 || !this.countryCode.equals(mVMetroAreaData.countryCode))) {
            return false;
        }
        boolean r = mo27432r();
        boolean r2 = mVMetroAreaData.mo27432r();
        if ((r || r2) && (!r || !r2 || !this.metroClass.equals(mVMetroAreaData.metroClass))) {
            return false;
        }
        boolean o = mo27429o();
        boolean o2 = mVMetroAreaData.mo27429o();
        if ((o || o2) && (!o || !o2 || !this.locale.equals(mVMetroAreaData.locale))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27420f() {
        return this.agencies != null;
    }

    /* renamed from: g */
    public final boolean mo27421g() {
        return this.bicycleProviders != null;
    }

    /* renamed from: h */
    public final boolean mo27422h() {
        return this.countryCode != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27424i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo27425j() {
        return this.countryName != null;
    }

    /* renamed from: k */
    public final boolean mo27426k() {
        return this.defaultLocation != null;
    }

    /* renamed from: l */
    public final boolean mo27427l() {
        return this.linesUserReportCategoryIds != null;
    }

    /* renamed from: m */
    public final boolean mo27428m() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: o */
    public final boolean mo27429o() {
        return this.locale != null;
    }

    /* renamed from: p */
    public final boolean mo27430p() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: q */
    public final boolean mo27431q() {
        return this.metroAreaName != null;
    }

    /* renamed from: r */
    public final boolean mo27432r() {
        return this.metroClass != null;
    }

    /* renamed from: s */
    public final boolean mo27433s() {
        return this.metroLanguage != null;
    }

    /* renamed from: t */
    public final boolean mo27434t() {
        return this.polygon != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMetroAreaData(", "metroAreaId:");
        C0016g.m42z(n, this.metroAreaId, ", ", "timeZone:");
        String str = this.timeZone;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("agencies:");
        List<MVAgency> list = this.agencies;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("routeTypes:");
        List<MVMetroRouteType> list2 = this.routeTypes;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("polygon:");
        String str2 = this.polygon;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("templates:");
        List<MVLineTemplate> list3 = this.templates;
        if (list3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list3);
        }
        n.append(", ");
        n.append("metroAreaName:");
        String str3 = this.metroAreaName;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("linesUserReportCategoryIds:");
        List<MVUserReportLineCategoryType> list4 = this.linesUserReportCategoryIds;
        if (list4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list4);
        }
        n.append(", ");
        n.append("stopsUserReportCategoryIds:");
        List<MVUserReportStopCategoryType> list5 = this.stopsUserReportCategoryIds;
        if (list5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list5);
        }
        n.append(", ");
        n.append("countryId:");
        C0016g.m42z(n, this.countryId, ", ", "countryName:");
        String str4 = this.countryName;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("defaultLocation:");
        MVLatLon mVLatLon = this.defaultLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("revisionNumber:");
        C25541a.m63889t(n, this.revisionNumber, ", ", "localDayChangeTime:");
        C0016g.m42z(n, this.localDayChangeTime, ", ", "bicycleProviders:");
        List<MVBicycleProvider> list6 = this.bicycleProviders;
        if (list6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list6);
        }
        if (mo27433s()) {
            n.append(", ");
            n.append("metroLanguage:");
            MVMetroLanguage mVMetroLanguage = this.metroLanguage;
            if (mVMetroLanguage == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMetroLanguage);
            }
        }
        n.append(", ");
        n.append("countryCode:");
        String str5 = this.countryCode;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("metroClass:");
        String str6 = this.metroClass;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        n.append(", ");
        n.append("locale:");
        String str7 = this.locale;
        if (str7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str7);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final boolean mo27436u() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: v */
    public final boolean mo27437v() {
        return this.routeTypes != null;
    }

    /* renamed from: w */
    public final boolean mo27438w() {
        return this.stopsUserReportCategoryIds != null;
    }

    /* renamed from: y */
    public final boolean mo27439y() {
        return this.templates != null;
    }
}
