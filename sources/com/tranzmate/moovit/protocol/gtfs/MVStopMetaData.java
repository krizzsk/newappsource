package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParams;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.common.MVSite;
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
import p001a0.C0017h;
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

public class MVStopMetaData implements TBase<MVStopMetaData, _Fields>, Serializable, Cloneable, Comparable<MVStopMetaData> {

    /* renamed from: b */
    public static final C25113c f25791b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25792c = new C25113c("stopName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25793d = new C25113c("stopLocation", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f25794e = new C25113c("stopCode", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f25795f = new C25113c("image", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f25796g = new C25113c("platformLines", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f25797h = new C25113c("keyLineIds", (byte) 15, 7);

    /* renamed from: i */
    public static final C25113c f25798i = new C25113c("sitesList", (byte) 15, 8);

    /* renamed from: j */
    public static final C25113c f25799j = new C25113c("imageRefSet", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f25800k = new C25113c("mvPathways", (byte) 15, 10);

    /* renamed from: l */
    public static final C25113c f25801l = new C25113c("routeType", (byte) 8, 11);

    /* renamed from: m */
    public static final C25113c f25802m = new C25113c("wheelchairAccessible", (byte) 2, 12);

    /* renamed from: n */
    public static final HashMap f25803n;

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f25804o;
    private byte __isset_bitfield = 0;
    public MVImageReferenceWithParams image;
    public MVImageReferenceSetWithParams imageRefSet;
    public List<Integer> keyLineIds;
    public List<MVPathway> mvPathways;
    private _Fields[] optionals = {_Fields.STOP_CODE, _Fields.IMAGE, _Fields.MV_PATHWAYS, _Fields.ROUTE_TYPE};
    public List<MVPlatformLines> platformLines;
    public MVRouteType routeType;
    public List<MVSite> sitesList;
    public String stopCode;
    public int stopId;
    public MVLatLon stopLocation;
    public String stopName;
    public boolean wheelchairAccessible;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        STOP_NAME(2, "stopName"),
        STOP_LOCATION(3, "stopLocation"),
        STOP_CODE(4, "stopCode"),
        IMAGE(5, "image"),
        PLATFORM_LINES(6, "platformLines"),
        KEY_LINE_IDS(7, "keyLineIds"),
        SITES_LIST(8, "sitesList"),
        IMAGE_REF_SET(9, "imageRefSet"),
        MV_PATHWAYS(10, "mvPathways"),
        ROUTE_TYPE(11, "routeType"),
        WHEELCHAIR_ACCESSIBLE(12, "wheelchairAccessible");
        
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
                    return STOP_ID;
                case 2:
                    return STOP_NAME;
                case 3:
                    return STOP_LOCATION;
                case 4:
                    return STOP_CODE;
                case 5:
                    return IMAGE;
                case 6:
                    return PLATFORM_LINES;
                case 7:
                    return KEY_LINE_IDS;
                case 8:
                    return SITES_LIST;
                case 9:
                    return IMAGE_REF_SET;
                case 10:
                    return MV_PATHWAYS;
                case 11:
                    return ROUTE_TYPE;
                case 12:
                    return WHEELCHAIR_ACCESSIBLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopMetaData$a */
    public static class C8827a extends C25239c<MVStopMetaData> {
        public C8827a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopMetaData mVStopMetaData = (MVStopMetaData) tBase;
            MVLatLon mVLatLon = mVStopMetaData.stopLocation;
            C25113c cVar = MVStopMetaData.f25791b;
            gVar.mo61687K();
            gVar.mo61711x(MVStopMetaData.f25791b);
            gVar.mo61678B(mVStopMetaData.stopId);
            gVar.mo61712y();
            if (mVStopMetaData.stopName != null) {
                gVar.mo61711x(MVStopMetaData.f25792c);
                gVar.mo61686J(mVStopMetaData.stopName);
                gVar.mo61712y();
            }
            if (mVStopMetaData.stopLocation != null) {
                gVar.mo61711x(MVStopMetaData.f25793d);
                mVStopMetaData.stopLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVStopMetaData.stopCode != null && mVStopMetaData.mo27508m()) {
                gVar.mo61711x(MVStopMetaData.f25794e);
                gVar.mo61686J(mVStopMetaData.stopCode);
                gVar.mo61712y();
            }
            if (mVStopMetaData.image != null && mVStopMetaData.mo27500f()) {
                gVar.mo61711x(MVStopMetaData.f25795f);
                mVStopMetaData.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVStopMetaData.platformLines != null) {
                gVar.mo61711x(MVStopMetaData.f25796g);
                gVar.mo61680D(new C25119e((byte) 12, mVStopMetaData.platformLines.size()));
                for (MVPlatformLines X0 : mVStopMetaData.platformLines) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVStopMetaData.keyLineIds != null) {
                gVar.mo61711x(MVStopMetaData.f25797h);
                gVar.mo61680D(new C25119e((byte) 8, mVStopMetaData.keyLineIds.size()));
                for (Integer intValue : mVStopMetaData.keyLineIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVStopMetaData.sitesList != null) {
                gVar.mo61711x(MVStopMetaData.f25798i);
                gVar.mo61680D(new C25119e((byte) 12, mVStopMetaData.sitesList.size()));
                for (MVSite X02 : mVStopMetaData.sitesList) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVStopMetaData.imageRefSet != null) {
                gVar.mo61711x(MVStopMetaData.f25799j);
                mVStopMetaData.imageRefSet.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVStopMetaData.mvPathways != null && mVStopMetaData.mo27504i()) {
                gVar.mo61711x(MVStopMetaData.f25800k);
                gVar.mo61680D(new C25119e((byte) 12, mVStopMetaData.mvPathways.size()));
                for (MVPathway X03 : mVStopMetaData.mvPathways) {
                    X03.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVStopMetaData.routeType != null && mVStopMetaData.mo27506k()) {
                gVar.mo61711x(MVStopMetaData.f25801l);
                gVar.mo61678B(mVStopMetaData.routeType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStopMetaData.f25802m);
            C0017h.m62S(gVar, mVStopMetaData.wheelchairAccessible);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopMetaData mVStopMetaData = (MVStopMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVStopMetaData.stopLocation;
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopMetaData.stopId = gVar.mo61696i();
                            mVStopMetaData.mo27513s();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopMetaData.stopName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVStopMetaData.stopLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopMetaData.stopCode = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVStopMetaData.image = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVStopMetaData.platformLines = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVPlatformLines mVPlatformLines = new MVPlatformLines();
                                mVPlatformLines.mo25201C1(gVar);
                                mVStopMetaData.platformLines.add(mVPlatformLines);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVStopMetaData.keyLineIds = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVStopMetaData.keyLineIds, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 8:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVStopMetaData.sitesList = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                MVSite mVSite = new MVSite();
                                mVSite.mo25201C1(gVar);
                                mVStopMetaData.sitesList.add(mVSite);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceSetWithParams mVImageReferenceSetWithParams = new MVImageReferenceSetWithParams();
                            mVStopMetaData.imageRefSet = mVImageReferenceSetWithParams;
                            mVImageReferenceSetWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k4 = gVar.mo61698k();
                            mVStopMetaData.mvPathways = new ArrayList(k4.f63395b);
                            while (i < k4.f63395b) {
                                MVPathway mVPathway = new MVPathway();
                                mVPathway.mo25201C1(gVar);
                                mVStopMetaData.mvPathways.add(mVPathway);
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
                            mVStopMetaData.routeType = MVRouteType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 12:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVStopMetaData.wheelchairAccessible = gVar.mo61690c();
                            mVStopMetaData.mo27514t();
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopMetaData$b */
    public static class C8828b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8827a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopMetaData$c */
    public static class C8829c extends C25240d<MVStopMetaData> {
        public C8829c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopMetaData mVStopMetaData = (MVStopMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStopMetaData.mo27509o()) {
                bitSet.set(0);
            }
            if (mVStopMetaData.mo27511q()) {
                bitSet.set(1);
            }
            if (mVStopMetaData.mo27510p()) {
                bitSet.set(2);
            }
            if (mVStopMetaData.mo27508m()) {
                bitSet.set(3);
            }
            if (mVStopMetaData.mo27500f()) {
                bitSet.set(4);
            }
            if (mVStopMetaData.mo27505j()) {
                bitSet.set(5);
            }
            if (mVStopMetaData.mo27502h()) {
                bitSet.set(6);
            }
            if (mVStopMetaData.mo27507l()) {
                bitSet.set(7);
            }
            if (mVStopMetaData.mo27501g()) {
                bitSet.set(8);
            }
            if (mVStopMetaData.mo27504i()) {
                bitSet.set(9);
            }
            if (mVStopMetaData.mo27506k()) {
                bitSet.set(10);
            }
            if (mVStopMetaData.mo27512r()) {
                bitSet.set(11);
            }
            jVar.mo61738U(bitSet, 12);
            if (mVStopMetaData.mo27509o()) {
                jVar.mo61678B(mVStopMetaData.stopId);
            }
            if (mVStopMetaData.mo27511q()) {
                jVar.mo61686J(mVStopMetaData.stopName);
            }
            if (mVStopMetaData.mo27510p()) {
                mVStopMetaData.stopLocation.mo25202X0(jVar);
            }
            if (mVStopMetaData.mo27508m()) {
                jVar.mo61686J(mVStopMetaData.stopCode);
            }
            if (mVStopMetaData.mo27500f()) {
                mVStopMetaData.image.mo25202X0(jVar);
            }
            if (mVStopMetaData.mo27505j()) {
                jVar.mo61678B(mVStopMetaData.platformLines.size());
                for (MVPlatformLines X0 : mVStopMetaData.platformLines) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVStopMetaData.mo27502h()) {
                jVar.mo61678B(mVStopMetaData.keyLineIds.size());
                for (Integer intValue : mVStopMetaData.keyLineIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVStopMetaData.mo27507l()) {
                jVar.mo61678B(mVStopMetaData.sitesList.size());
                for (MVSite X02 : mVStopMetaData.sitesList) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVStopMetaData.mo27501g()) {
                mVStopMetaData.imageRefSet.mo25202X0(jVar);
            }
            if (mVStopMetaData.mo27504i()) {
                jVar.mo61678B(mVStopMetaData.mvPathways.size());
                for (MVPathway X03 : mVStopMetaData.mvPathways) {
                    X03.mo25202X0(jVar);
                }
            }
            if (mVStopMetaData.mo27506k()) {
                jVar.mo61678B(mVStopMetaData.routeType.getValue());
            }
            if (mVStopMetaData.mo27512r()) {
                jVar.mo61708u(mVStopMetaData.wheelchairAccessible);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopMetaData mVStopMetaData = (MVStopMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(12);
            if (T.get(0)) {
                mVStopMetaData.stopId = jVar.mo61696i();
                mVStopMetaData.mo27513s();
            }
            if (T.get(1)) {
                mVStopMetaData.stopName = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVStopMetaData.stopLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVStopMetaData.stopCode = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVStopMetaData.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVStopMetaData.platformLines = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPlatformLines mVPlatformLines = new MVPlatformLines();
                    mVPlatformLines.mo25201C1(jVar);
                    mVStopMetaData.platformLines.add(mVPlatformLines);
                }
            }
            if (T.get(6)) {
                int i3 = jVar.mo61696i();
                mVStopMetaData.keyLineIds = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4 = C13437d.m33701f(jVar.mo61696i(), mVStopMetaData.keyLineIds, i4, 1)) {
                }
            }
            if (T.get(7)) {
                int i5 = jVar.mo61696i();
                mVStopMetaData.sitesList = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    MVSite mVSite = new MVSite();
                    mVSite.mo25201C1(jVar);
                    mVStopMetaData.sitesList.add(mVSite);
                }
            }
            if (T.get(8)) {
                MVImageReferenceSetWithParams mVImageReferenceSetWithParams = new MVImageReferenceSetWithParams();
                mVStopMetaData.imageRefSet = mVImageReferenceSetWithParams;
                mVImageReferenceSetWithParams.mo25201C1(jVar);
            }
            if (T.get(9)) {
                int i7 = jVar.mo61696i();
                mVStopMetaData.mvPathways = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    MVPathway mVPathway = new MVPathway();
                    mVPathway.mo25201C1(jVar);
                    mVStopMetaData.mvPathways.add(mVPathway);
                }
            }
            if (T.get(10)) {
                mVStopMetaData.routeType = MVRouteType.findByValue(jVar.mo61696i());
            }
            if (T.get(11)) {
                mVStopMetaData.wheelchairAccessible = jVar.mo61690c();
                mVStopMetaData.mo27514t();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVStopMetaData$d */
    public static class C8830d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8829c(0);
        }
    }

    static {
        new C17394d0("MVStopMetaData");
        HashMap hashMap = new HashMap();
        f25803n = hashMap;
        hashMap.put(C25239c.class, new C8828b());
        hashMap.put(C25240d.class, new C8830d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_NAME, new FieldMetaData("stopName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STOP_LOCATION, new FieldMetaData("stopLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.STOP_CODE, new FieldMetaData("stopCode", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.PLATFORM_LINES, new FieldMetaData("platformLines", (byte) 3, new ListMetaData(new StructMetaData(MVPlatformLines.class))));
        enumMap.put(_Fields.KEY_LINE_IDS, new FieldMetaData("keyLineIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.SITES_LIST, new FieldMetaData("sitesList", (byte) 3, new ListMetaData(new StructMetaData(MVSite.class))));
        enumMap.put(_Fields.IMAGE_REF_SET, new FieldMetaData("imageRefSet", (byte) 3, new StructMetaData(MVImageReferenceSetWithParams.class)));
        enumMap.put(_Fields.MV_PATHWAYS, new FieldMetaData("mvPathways", (byte) 2, new ListMetaData(new StructMetaData(MVPathway.class))));
        enumMap.put(_Fields.ROUTE_TYPE, new FieldMetaData("routeType", (byte) 2, new EnumMetaData(MVRouteType.class)));
        enumMap.put(_Fields.WHEELCHAIR_ACCESSIBLE, new FieldMetaData("wheelchairAccessible", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25804o = unmodifiableMap;
        FieldMetaData.m61947a(MVStopMetaData.class, unmodifiableMap);
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
        ((C25238b) f25803n.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25803n.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVStopMetaData mVStopMetaData = (MVStopMetaData) obj;
        if (!getClass().equals(mVStopMetaData.getClass())) {
            return getClass().getName().compareTo(mVStopMetaData.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27509o()).compareTo(Boolean.valueOf(mVStopMetaData.mo27509o()));
        if (compareTo != 0 || ((mo27509o() && (compareTo = C25082a.m62839c(this.stopId, mVStopMetaData.stopId)) != 0) || (compareTo = Boolean.valueOf(mo27511q()).compareTo(Boolean.valueOf(mVStopMetaData.mo27511q()))) != 0 || ((mo27511q() && (compareTo = this.stopName.compareTo(mVStopMetaData.stopName)) != 0) || (compareTo = Boolean.valueOf(mo27510p()).compareTo(Boolean.valueOf(mVStopMetaData.mo27510p()))) != 0 || ((mo27510p() && (compareTo = this.stopLocation.compareTo(mVStopMetaData.stopLocation)) != 0) || (compareTo = Boolean.valueOf(mo27508m()).compareTo(Boolean.valueOf(mVStopMetaData.mo27508m()))) != 0 || ((mo27508m() && (compareTo = this.stopCode.compareTo(mVStopMetaData.stopCode)) != 0) || (compareTo = Boolean.valueOf(mo27500f()).compareTo(Boolean.valueOf(mVStopMetaData.mo27500f()))) != 0 || ((mo27500f() && (compareTo = this.image.compareTo(mVStopMetaData.image)) != 0) || (compareTo = Boolean.valueOf(mo27505j()).compareTo(Boolean.valueOf(mVStopMetaData.mo27505j()))) != 0 || ((mo27505j() && (compareTo = C25082a.m62844h(this.platformLines, mVStopMetaData.platformLines)) != 0) || (compareTo = Boolean.valueOf(mo27502h()).compareTo(Boolean.valueOf(mVStopMetaData.mo27502h()))) != 0 || ((mo27502h() && (compareTo = C25082a.m62844h(this.keyLineIds, mVStopMetaData.keyLineIds)) != 0) || (compareTo = Boolean.valueOf(mo27507l()).compareTo(Boolean.valueOf(mVStopMetaData.mo27507l()))) != 0 || ((mo27507l() && (compareTo = C25082a.m62844h(this.sitesList, mVStopMetaData.sitesList)) != 0) || (compareTo = Boolean.valueOf(mo27501g()).compareTo(Boolean.valueOf(mVStopMetaData.mo27501g()))) != 0 || ((mo27501g() && (compareTo = this.imageRefSet.compareTo(mVStopMetaData.imageRefSet)) != 0) || (compareTo = Boolean.valueOf(mo27504i()).compareTo(Boolean.valueOf(mVStopMetaData.mo27504i()))) != 0 || ((mo27504i() && (compareTo = C25082a.m62844h(this.mvPathways, mVStopMetaData.mvPathways)) != 0) || (compareTo = Boolean.valueOf(mo27506k()).compareTo(Boolean.valueOf(mVStopMetaData.mo27506k()))) != 0 || ((mo27506k() && (compareTo = this.routeType.compareTo(mVStopMetaData.routeType)) != 0) || (compareTo = Boolean.valueOf(mo27512r()).compareTo(Boolean.valueOf(mVStopMetaData.mo27512r()))) != 0)))))))))))) {
            return compareTo;
        }
        if (!mo27512r() || (l = C25082a.m62848l(this.wheelchairAccessible, mVStopMetaData.wheelchairAccessible)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStopMetaData)) {
            return false;
        }
        MVStopMetaData mVStopMetaData = (MVStopMetaData) obj;
        if (this.stopId != mVStopMetaData.stopId) {
            return false;
        }
        boolean q = mo27511q();
        boolean q2 = mVStopMetaData.mo27511q();
        if ((q || q2) && (!q || !q2 || !this.stopName.equals(mVStopMetaData.stopName))) {
            return false;
        }
        boolean p = mo27510p();
        boolean p2 = mVStopMetaData.mo27510p();
        if ((p || p2) && (!p || !p2 || !this.stopLocation.mo26290a(mVStopMetaData.stopLocation))) {
            return false;
        }
        boolean m = mo27508m();
        boolean m2 = mVStopMetaData.mo27508m();
        if ((m || m2) && (!m || !m2 || !this.stopCode.equals(mVStopMetaData.stopCode))) {
            return false;
        }
        boolean f = mo27500f();
        boolean f2 = mVStopMetaData.mo27500f();
        if ((f || f2) && (!f || !f2 || !this.image.mo26245a(mVStopMetaData.image))) {
            return false;
        }
        boolean j = mo27505j();
        boolean j2 = mVStopMetaData.mo27505j();
        if ((j || j2) && (!j || !j2 || !this.platformLines.equals(mVStopMetaData.platformLines))) {
            return false;
        }
        boolean h = mo27502h();
        boolean h2 = mVStopMetaData.mo27502h();
        if ((h || h2) && (!h || !h2 || !this.keyLineIds.equals(mVStopMetaData.keyLineIds))) {
            return false;
        }
        boolean l = mo27507l();
        boolean l2 = mVStopMetaData.mo27507l();
        if ((l || l2) && (!l || !l2 || !this.sitesList.equals(mVStopMetaData.sitesList))) {
            return false;
        }
        boolean g = mo27501g();
        boolean g2 = mVStopMetaData.mo27501g();
        if ((g || g2) && (!g || !g2 || !this.imageRefSet.mo26230a(mVStopMetaData.imageRefSet))) {
            return false;
        }
        boolean i = mo27504i();
        boolean i2 = mVStopMetaData.mo27504i();
        if ((i || i2) && (!i || !i2 || !this.mvPathways.equals(mVStopMetaData.mvPathways))) {
            return false;
        }
        boolean k = mo27506k();
        boolean k2 = mVStopMetaData.mo27506k();
        if (((k || k2) && (!k || !k2 || !this.routeType.equals(mVStopMetaData.routeType))) || this.wheelchairAccessible != mVStopMetaData.wheelchairAccessible) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27500f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo27501g() {
        return this.imageRefSet != null;
    }

    /* renamed from: h */
    public final boolean mo27502h() {
        return this.keyLineIds != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27504i() {
        return this.mvPathways != null;
    }

    /* renamed from: j */
    public final boolean mo27505j() {
        return this.platformLines != null;
    }

    /* renamed from: k */
    public final boolean mo27506k() {
        return this.routeType != null;
    }

    /* renamed from: l */
    public final boolean mo27507l() {
        return this.sitesList != null;
    }

    /* renamed from: m */
    public final boolean mo27508m() {
        return this.stopCode != null;
    }

    /* renamed from: o */
    public final boolean mo27509o() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: p */
    public final boolean mo27510p() {
        return this.stopLocation != null;
    }

    /* renamed from: q */
    public final boolean mo27511q() {
        return this.stopName != null;
    }

    /* renamed from: r */
    public final boolean mo27512r() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: s */
    public final void mo27513s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: t */
    public final void mo27514t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStopMetaData(", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "stopName:");
        String str = this.stopName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("stopLocation:");
        MVLatLon mVLatLon = this.stopLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        if (mo27508m()) {
            n.append(", ");
            n.append("stopCode:");
            String str2 = this.stopCode;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo27500f()) {
            n.append(", ");
            n.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        n.append(", ");
        n.append("platformLines:");
        List<MVPlatformLines> list = this.platformLines;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("keyLineIds:");
        List<Integer> list2 = this.keyLineIds;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("sitesList:");
        List<MVSite> list3 = this.sitesList;
        if (list3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list3);
        }
        n.append(", ");
        n.append("imageRefSet:");
        MVImageReferenceSetWithParams mVImageReferenceSetWithParams = this.imageRefSet;
        if (mVImageReferenceSetWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceSetWithParams);
        }
        if (mo27504i()) {
            n.append(", ");
            n.append("mvPathways:");
            List<MVPathway> list4 = this.mvPathways;
            if (list4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list4);
            }
        }
        if (mo27506k()) {
            n.append(", ");
            n.append("routeType:");
            MVRouteType mVRouteType = this.routeType;
            if (mVRouteType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVRouteType);
            }
        }
        n.append(", ");
        n.append("wheelchairAccessible:");
        return C25541a.m63885p(n, this.wheelchairAccessible, ")");
    }
}
