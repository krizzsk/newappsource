package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVAccessory;
import com.tranzmate.moovit.protocol.common.MVExternalAppData;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVMicroMobilityItemInfo implements TBase<MVMicroMobilityItemInfo, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityItemInfo> {

    /* renamed from: b */
    public static final C25113c f26540b = new C25113c("serviceId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26541c = new C25113c("itemId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26542d = new C25113c("typeId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26543e = new C25113c("typeName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26544f = new C25113c("itemImage", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f26545g = new C25113c("itemTitle", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f26546h = new C25113c("itemSubtitle", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f26547i = new C25113c("serviceName", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f26548j = new C25113c("primaryMetaData", (byte) 15, 9);

    /* renamed from: k */
    public static final C25113c f26549k = new C25113c("secondaryMetaData", (byte) 15, 10);

    /* renamed from: l */
    public static final C25113c f26550l = new C25113c("deepLinks", (byte) 12, 11);

    /* renamed from: m */
    public static final C25113c f26551m = new C25113c("flows", (byte) 15, 12);

    /* renamed from: n */
    public static final C25113c f26552n = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 13);

    /* renamed from: o */
    public static final C25113c f26553o = new C25113c("mapImage", (byte) 12, 14);

    /* renamed from: p */
    public static final HashMap f26554p;

    /* renamed from: q */
    public static final Map<_Fields, FieldMetaData> f26555q;
    private byte __isset_bitfield = 0;
    public MVExternalAppData deepLinks;
    public List<MVMicroMobilityIntegrationFlow> flows;
    public String itemId;
    public MVImageOption itemImage;
    public String itemSubtitle;
    public String itemTitle;
    public MVLatLon location;
    public MVImageReferenceWithParams mapImage;
    private _Fields[] optionals = {_Fields.ITEM_IMAGE, _Fields.ITEM_TITLE, _Fields.ITEM_SUBTITLE, _Fields.PRIMARY_META_DATA, _Fields.SECONDARY_META_DATA, _Fields.DEEP_LINKS, _Fields.FLOWS};
    public List<MVAccessory> primaryMetaData;
    public List<MVMicroMobilityProperty> secondaryMetaData;
    public String serviceId;
    public String serviceName;
    public int typeId;
    public String typeName;

    public enum _Fields implements C25085c {
        SERVICE_ID(1, "serviceId"),
        ITEM_ID(2, "itemId"),
        TYPE_ID(3, "typeId"),
        TYPE_NAME(4, "typeName"),
        ITEM_IMAGE(5, "itemImage"),
        ITEM_TITLE(6, "itemTitle"),
        ITEM_SUBTITLE(7, "itemSubtitle"),
        SERVICE_NAME(8, "serviceName"),
        PRIMARY_META_DATA(9, "primaryMetaData"),
        SECONDARY_META_DATA(10, "secondaryMetaData"),
        DEEP_LINKS(11, "deepLinks"),
        FLOWS(12, "flows"),
        LOCATION(13, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        MAP_IMAGE(14, "mapImage");
        
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
                    return SERVICE_ID;
                case 2:
                    return ITEM_ID;
                case 3:
                    return TYPE_ID;
                case 4:
                    return TYPE_NAME;
                case 5:
                    return ITEM_IMAGE;
                case 6:
                    return ITEM_TITLE;
                case 7:
                    return ITEM_SUBTITLE;
                case 8:
                    return SERVICE_NAME;
                case 9:
                    return PRIMARY_META_DATA;
                case 10:
                    return SECONDARY_META_DATA;
                case 11:
                    return DEEP_LINKS;
                case 12:
                    return FLOWS;
                case 13:
                    return LOCATION;
                case 14:
                    return MAP_IMAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfo$a */
    public static class C9227a extends C25239c<MVMicroMobilityItemInfo> {
        public C9227a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItemInfo mVMicroMobilityItemInfo = (MVMicroMobilityItemInfo) tBase;
            mVMicroMobilityItemInfo.mo28724v();
            C25113c cVar = MVMicroMobilityItemInfo.f26540b;
            gVar.mo61687K();
            if (mVMicroMobilityItemInfo.serviceId != null) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26540b);
                gVar.mo61686J(mVMicroMobilityItemInfo.serviceId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.itemId != null) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26541c);
                gVar.mo61686J(mVMicroMobilityItemInfo.itemId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMicroMobilityItemInfo.f26542d);
            gVar.mo61678B(mVMicroMobilityItemInfo.typeId);
            gVar.mo61712y();
            if (mVMicroMobilityItemInfo.typeName != null) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26543e);
                gVar.mo61686J(mVMicroMobilityItemInfo.typeName);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.itemImage != null && mVMicroMobilityItemInfo.mo28711i()) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26544f);
                mVMicroMobilityItemInfo.itemImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.itemTitle != null && mVMicroMobilityItemInfo.mo28713k()) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26545g);
                gVar.mo61686J(mVMicroMobilityItemInfo.itemTitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.itemSubtitle != null && mVMicroMobilityItemInfo.mo28712j()) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26546h);
                gVar.mo61686J(mVMicroMobilityItemInfo.itemSubtitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.serviceName != null) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26547i);
                gVar.mo61686J(mVMicroMobilityItemInfo.serviceName);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.primaryMetaData != null && mVMicroMobilityItemInfo.mo28716o()) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26548j);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityItemInfo.primaryMetaData.size()));
                for (MVAccessory X0 : mVMicroMobilityItemInfo.primaryMetaData) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.secondaryMetaData != null && mVMicroMobilityItemInfo.mo28717p()) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26549k);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityItemInfo.secondaryMetaData.size()));
                for (MVMicroMobilityProperty X02 : mVMicroMobilityItemInfo.secondaryMetaData) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.deepLinks != null && mVMicroMobilityItemInfo.mo28707f()) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26550l);
                mVMicroMobilityItemInfo.deepLinks.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.flows != null && mVMicroMobilityItemInfo.mo28708g()) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26551m);
                gVar.mo61680D(new C25119e((byte) 8, mVMicroMobilityItemInfo.flows.size()));
                for (MVMicroMobilityIntegrationFlow value : mVMicroMobilityItemInfo.flows) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.location != null) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26552n);
                mVMicroMobilityItemInfo.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItemInfo.mapImage != null) {
                gVar.mo61711x(MVMicroMobilityItemInfo.f26553o);
                mVMicroMobilityItemInfo.mapImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItemInfo mVMicroMobilityItemInfo = (MVMicroMobilityItemInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityItemInfo.mo28724v();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityItemInfo.serviceId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityItemInfo.itemId = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityItemInfo.typeId = gVar.mo61696i();
                            mVMicroMobilityItemInfo.mo28723u();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityItemInfo.typeName = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageOption mVImageOption = new MVImageOption();
                            mVMicroMobilityItemInfo.itemImage = mVImageOption;
                            mVImageOption.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityItemInfo.itemTitle = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityItemInfo.itemSubtitle = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityItemInfo.serviceName = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVMicroMobilityItemInfo.primaryMetaData = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVAccessory mVAccessory = new MVAccessory();
                                mVAccessory.mo25201C1(gVar);
                                mVMicroMobilityItemInfo.primaryMetaData.add(mVAccessory);
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
                            C25119e k2 = gVar.mo61698k();
                            mVMicroMobilityItemInfo.secondaryMetaData = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVMicroMobilityProperty mVMicroMobilityProperty = new MVMicroMobilityProperty();
                                mVMicroMobilityProperty.mo25201C1(gVar);
                                mVMicroMobilityItemInfo.secondaryMetaData.add(mVMicroMobilityProperty);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 11:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVExternalAppData mVExternalAppData = new MVExternalAppData();
                            mVMicroMobilityItemInfo.deepLinks = mVExternalAppData;
                            mVExternalAppData.mo25201C1(gVar);
                            break;
                        }
                    case 12:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVMicroMobilityItemInfo.flows = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                mVMicroMobilityItemInfo.flows.add(MVMicroMobilityIntegrationFlow.findByValue(gVar.mo61696i()));
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 13:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon = new MVLatLon();
                            mVMicroMobilityItemInfo.location = mVLatLon;
                            mVLatLon.mo25201C1(gVar);
                            break;
                        }
                    case 14:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVMicroMobilityItemInfo.mapImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfo$b */
    public static class C9228b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9227a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfo$c */
    public static class C9229c extends C25240d<MVMicroMobilityItemInfo> {
        public C9229c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItemInfo mVMicroMobilityItemInfo = (MVMicroMobilityItemInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityItemInfo.mo28718q()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityItemInfo.mo28709h()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityItemInfo.mo28720s()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityItemInfo.mo28721t()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityItemInfo.mo28711i()) {
                bitSet.set(4);
            }
            if (mVMicroMobilityItemInfo.mo28713k()) {
                bitSet.set(5);
            }
            if (mVMicroMobilityItemInfo.mo28712j()) {
                bitSet.set(6);
            }
            if (mVMicroMobilityItemInfo.mo28719r()) {
                bitSet.set(7);
            }
            if (mVMicroMobilityItemInfo.mo28716o()) {
                bitSet.set(8);
            }
            if (mVMicroMobilityItemInfo.mo28717p()) {
                bitSet.set(9);
            }
            if (mVMicroMobilityItemInfo.mo28707f()) {
                bitSet.set(10);
            }
            if (mVMicroMobilityItemInfo.mo28708g()) {
                bitSet.set(11);
            }
            if (mVMicroMobilityItemInfo.mo28714l()) {
                bitSet.set(12);
            }
            if (mVMicroMobilityItemInfo.mo28715m()) {
                bitSet.set(13);
            }
            jVar.mo61738U(bitSet, 14);
            if (mVMicroMobilityItemInfo.mo28718q()) {
                jVar.mo61686J(mVMicroMobilityItemInfo.serviceId);
            }
            if (mVMicroMobilityItemInfo.mo28709h()) {
                jVar.mo61686J(mVMicroMobilityItemInfo.itemId);
            }
            if (mVMicroMobilityItemInfo.mo28720s()) {
                jVar.mo61678B(mVMicroMobilityItemInfo.typeId);
            }
            if (mVMicroMobilityItemInfo.mo28721t()) {
                jVar.mo61686J(mVMicroMobilityItemInfo.typeName);
            }
            if (mVMicroMobilityItemInfo.mo28711i()) {
                mVMicroMobilityItemInfo.itemImage.mo25202X0(jVar);
            }
            if (mVMicroMobilityItemInfo.mo28713k()) {
                jVar.mo61686J(mVMicroMobilityItemInfo.itemTitle);
            }
            if (mVMicroMobilityItemInfo.mo28712j()) {
                jVar.mo61686J(mVMicroMobilityItemInfo.itemSubtitle);
            }
            if (mVMicroMobilityItemInfo.mo28719r()) {
                jVar.mo61686J(mVMicroMobilityItemInfo.serviceName);
            }
            if (mVMicroMobilityItemInfo.mo28716o()) {
                jVar.mo61678B(mVMicroMobilityItemInfo.primaryMetaData.size());
                for (MVAccessory X0 : mVMicroMobilityItemInfo.primaryMetaData) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVMicroMobilityItemInfo.mo28717p()) {
                jVar.mo61678B(mVMicroMobilityItemInfo.secondaryMetaData.size());
                for (MVMicroMobilityProperty X02 : mVMicroMobilityItemInfo.secondaryMetaData) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVMicroMobilityItemInfo.mo28707f()) {
                mVMicroMobilityItemInfo.deepLinks.mo25202X0(jVar);
            }
            if (mVMicroMobilityItemInfo.mo28708g()) {
                jVar.mo61678B(mVMicroMobilityItemInfo.flows.size());
                for (MVMicroMobilityIntegrationFlow value : mVMicroMobilityItemInfo.flows) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVMicroMobilityItemInfo.mo28714l()) {
                mVMicroMobilityItemInfo.location.mo25202X0(jVar);
            }
            if (mVMicroMobilityItemInfo.mo28715m()) {
                mVMicroMobilityItemInfo.mapImage.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItemInfo mVMicroMobilityItemInfo = (MVMicroMobilityItemInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(14);
            if (T.get(0)) {
                mVMicroMobilityItemInfo.serviceId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityItemInfo.itemId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityItemInfo.typeId = jVar.mo61696i();
                mVMicroMobilityItemInfo.mo28723u();
            }
            if (T.get(3)) {
                mVMicroMobilityItemInfo.typeName = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVImageOption mVImageOption = new MVImageOption();
                mVMicroMobilityItemInfo.itemImage = mVImageOption;
                mVImageOption.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVMicroMobilityItemInfo.itemTitle = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVMicroMobilityItemInfo.itemSubtitle = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVMicroMobilityItemInfo.serviceName = jVar.mo61704q();
            }
            if (T.get(8)) {
                int i = jVar.mo61696i();
                mVMicroMobilityItemInfo.primaryMetaData = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAccessory mVAccessory = new MVAccessory();
                    mVAccessory.mo25201C1(jVar);
                    mVMicroMobilityItemInfo.primaryMetaData.add(mVAccessory);
                }
            }
            if (T.get(9)) {
                int i3 = jVar.mo61696i();
                mVMicroMobilityItemInfo.secondaryMetaData = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVMicroMobilityProperty mVMicroMobilityProperty = new MVMicroMobilityProperty();
                    mVMicroMobilityProperty.mo25201C1(jVar);
                    mVMicroMobilityItemInfo.secondaryMetaData.add(mVMicroMobilityProperty);
                }
            }
            if (T.get(10)) {
                MVExternalAppData mVExternalAppData = new MVExternalAppData();
                mVMicroMobilityItemInfo.deepLinks = mVExternalAppData;
                mVExternalAppData.mo25201C1(jVar);
            }
            if (T.get(11)) {
                int i5 = jVar.mo61696i();
                mVMicroMobilityItemInfo.flows = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    mVMicroMobilityItemInfo.flows.add(MVMicroMobilityIntegrationFlow.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(12)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMicroMobilityItemInfo.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(13)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVMicroMobilityItemInfo.mapImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfo$d */
    public static class C9230d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9229c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityItemInfo");
        String str = FacebookUser.LOCATION_OUTER_OBJECT_KEY;
        HashMap hashMap = new HashMap();
        f26554p = hashMap;
        hashMap.put(C25239c.class, new C9228b());
        hashMap.put(C25240d.class, new C9230d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITEM_ID, new FieldMetaData("itemId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TYPE_ID, new FieldMetaData("typeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TYPE_NAME, new FieldMetaData("typeName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITEM_IMAGE, new FieldMetaData("itemImage", (byte) 2, new StructMetaData(MVImageOption.class)));
        enumMap.put(_Fields.ITEM_TITLE, new FieldMetaData("itemTitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITEM_SUBTITLE, new FieldMetaData("itemSubtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SERVICE_NAME, new FieldMetaData("serviceName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRIMARY_META_DATA, new FieldMetaData("primaryMetaData", (byte) 2, new ListMetaData(new StructMetaData(MVAccessory.class))));
        enumMap.put(_Fields.SECONDARY_META_DATA, new FieldMetaData("secondaryMetaData", (byte) 2, new ListMetaData(new StructMetaData(MVMicroMobilityProperty.class))));
        enumMap.put(_Fields.DEEP_LINKS, new FieldMetaData("deepLinks", (byte) 2, new StructMetaData(MVExternalAppData.class)));
        enumMap.put(_Fields.FLOWS, new FieldMetaData("flows", (byte) 2, new ListMetaData(new EnumMetaData(MVMicroMobilityIntegrationFlow.class))));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(str, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.MAP_IMAGE, new FieldMetaData("mapImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26555q = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityItemInfo.class, unmodifiableMap);
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
        ((C25238b) f26554p.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26554p.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo28704a(com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfo r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6.mo28718q()
            boolean r2 = r7.mo28718q()
            if (r1 != 0) goto L_0x0010
            if (r2 == 0) goto L_0x0021
        L_0x0010:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x0016
            goto L_0x0196
        L_0x0016:
            java.lang.String r1 = r6.serviceId
            java.lang.String r2 = r7.serviceId
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0021
            return r0
        L_0x0021:
            boolean r1 = r6.mo28709h()
            boolean r2 = r7.mo28709h()
            if (r1 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x003e
        L_0x002d:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x0033
            goto L_0x0196
        L_0x0033:
            java.lang.String r1 = r6.itemId
            java.lang.String r2 = r7.itemId
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003e
            return r0
        L_0x003e:
            int r1 = r6.typeId
            int r2 = r7.typeId
            if (r1 == r2) goto L_0x0045
            return r0
        L_0x0045:
            boolean r1 = r6.mo28721t()
            boolean r2 = r7.mo28721t()
            if (r1 != 0) goto L_0x0051
            if (r2 == 0) goto L_0x0062
        L_0x0051:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x0057
            goto L_0x0196
        L_0x0057:
            java.lang.String r1 = r6.typeName
            java.lang.String r2 = r7.typeName
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0062
            return r0
        L_0x0062:
            boolean r1 = r6.mo28711i()
            boolean r2 = r7.mo28711i()
            r3 = 1
            if (r1 != 0) goto L_0x006f
            if (r2 == 0) goto L_0x0094
        L_0x006f:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x0075
            goto L_0x0196
        L_0x0075:
            com.tranzmate.moovit.protocol.micromobility.MVImageOption r1 = r6.itemImage
            com.tranzmate.moovit.protocol.micromobility.MVImageOption r2 = r7.itemImage
            if (r2 == 0) goto L_0x008d
            F r4 = r1.setField_
            F r5 = r2.setField_
            if (r4 != r5) goto L_0x0090
            java.lang.Object r1 = r1.value_
            java.lang.Object r2 = r2.value_
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0090
            r1 = 1
            goto L_0x0091
        L_0x008d:
            r1.getClass()
        L_0x0090:
            r1 = 0
        L_0x0091:
            if (r1 != 0) goto L_0x0094
            return r0
        L_0x0094:
            boolean r1 = r6.mo28713k()
            boolean r2 = r7.mo28713k()
            if (r1 != 0) goto L_0x00a0
            if (r2 == 0) goto L_0x00b1
        L_0x00a0:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x00a6
            goto L_0x0196
        L_0x00a6:
            java.lang.String r1 = r6.itemTitle
            java.lang.String r2 = r7.itemTitle
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00b1
            return r0
        L_0x00b1:
            boolean r1 = r6.mo28712j()
            boolean r2 = r7.mo28712j()
            if (r1 != 0) goto L_0x00bd
            if (r2 == 0) goto L_0x00ce
        L_0x00bd:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x00c3
            goto L_0x0196
        L_0x00c3:
            java.lang.String r1 = r6.itemSubtitle
            java.lang.String r2 = r7.itemSubtitle
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ce
            return r0
        L_0x00ce:
            boolean r1 = r6.mo28719r()
            boolean r2 = r7.mo28719r()
            if (r1 != 0) goto L_0x00da
            if (r2 == 0) goto L_0x00eb
        L_0x00da:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x00e0
            goto L_0x0196
        L_0x00e0:
            java.lang.String r1 = r6.serviceName
            java.lang.String r2 = r7.serviceName
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00eb
            return r0
        L_0x00eb:
            boolean r1 = r6.mo28716o()
            boolean r2 = r7.mo28716o()
            if (r1 != 0) goto L_0x00f7
            if (r2 == 0) goto L_0x0108
        L_0x00f7:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x00fd
            goto L_0x0196
        L_0x00fd:
            java.util.List<com.tranzmate.moovit.protocol.common.MVAccessory> r1 = r6.primaryMetaData
            java.util.List<com.tranzmate.moovit.protocol.common.MVAccessory> r2 = r7.primaryMetaData
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0108
            return r0
        L_0x0108:
            boolean r1 = r6.mo28717p()
            boolean r2 = r7.mo28717p()
            if (r1 != 0) goto L_0x0114
            if (r2 == 0) goto L_0x0125
        L_0x0114:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x011a
            goto L_0x0196
        L_0x011a:
            java.util.List<com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityProperty> r1 = r6.secondaryMetaData
            java.util.List<com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityProperty> r2 = r7.secondaryMetaData
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0125
            return r0
        L_0x0125:
            boolean r1 = r6.mo28707f()
            boolean r2 = r7.mo28707f()
            if (r1 != 0) goto L_0x0131
            if (r2 == 0) goto L_0x0141
        L_0x0131:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x0136
            goto L_0x0196
        L_0x0136:
            com.tranzmate.moovit.protocol.common.MVExternalAppData r1 = r6.deepLinks
            com.tranzmate.moovit.protocol.common.MVExternalAppData r2 = r7.deepLinks
            boolean r1 = r1.mo26157a(r2)
            if (r1 != 0) goto L_0x0141
            return r0
        L_0x0141:
            boolean r1 = r6.mo28708g()
            boolean r2 = r7.mo28708g()
            if (r1 != 0) goto L_0x014d
            if (r2 == 0) goto L_0x015d
        L_0x014d:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x0152
            goto L_0x0196
        L_0x0152:
            java.util.List<com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow> r1 = r6.flows
            java.util.List<com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow> r2 = r7.flows
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x015d
            return r0
        L_0x015d:
            boolean r1 = r6.mo28714l()
            boolean r2 = r7.mo28714l()
            if (r1 != 0) goto L_0x0169
            if (r2 == 0) goto L_0x0179
        L_0x0169:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x016e
            goto L_0x0196
        L_0x016e:
            com.tranzmate.moovit.protocol.common.MVLatLon r1 = r6.location
            com.tranzmate.moovit.protocol.common.MVLatLon r2 = r7.location
            boolean r1 = r1.mo26290a(r2)
            if (r1 != 0) goto L_0x0179
            return r0
        L_0x0179:
            boolean r1 = r6.mo28715m()
            boolean r2 = r7.mo28715m()
            if (r1 != 0) goto L_0x0185
            if (r2 == 0) goto L_0x0195
        L_0x0185:
            if (r1 == 0) goto L_0x0196
            if (r2 != 0) goto L_0x018a
            goto L_0x0196
        L_0x018a:
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r1 = r6.mapImage
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r7 = r7.mapImage
            boolean r7 = r1.mo26245a(r7)
            if (r7 != 0) goto L_0x0195
            return r0
        L_0x0195:
            return r3
        L_0x0196:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfo.mo28704a(com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityItemInfo):boolean");
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityItemInfo mVMicroMobilityItemInfo = (MVMicroMobilityItemInfo) obj;
        if (!getClass().equals(mVMicroMobilityItemInfo.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityItemInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28718q()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28718q()));
        if (compareTo2 != 0 || ((mo28718q() && (compareTo2 = this.serviceId.compareTo(mVMicroMobilityItemInfo.serviceId)) != 0) || (compareTo2 = Boolean.valueOf(mo28709h()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28709h()))) != 0 || ((mo28709h() && (compareTo2 = this.itemId.compareTo(mVMicroMobilityItemInfo.itemId)) != 0) || (compareTo2 = Boolean.valueOf(mo28720s()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28720s()))) != 0 || ((mo28720s() && (compareTo2 = C25082a.m62839c(this.typeId, mVMicroMobilityItemInfo.typeId)) != 0) || (compareTo2 = Boolean.valueOf(mo28721t()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28721t()))) != 0 || ((mo28721t() && (compareTo2 = this.typeName.compareTo(mVMicroMobilityItemInfo.typeName)) != 0) || (compareTo2 = Boolean.valueOf(mo28711i()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28711i()))) != 0 || ((mo28711i() && (compareTo2 = this.itemImage.compareTo(mVMicroMobilityItemInfo.itemImage)) != 0) || (compareTo2 = Boolean.valueOf(mo28713k()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28713k()))) != 0 || ((mo28713k() && (compareTo2 = this.itemTitle.compareTo(mVMicroMobilityItemInfo.itemTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo28712j()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28712j()))) != 0 || ((mo28712j() && (compareTo2 = this.itemSubtitle.compareTo(mVMicroMobilityItemInfo.itemSubtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo28719r()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28719r()))) != 0 || ((mo28719r() && (compareTo2 = this.serviceName.compareTo(mVMicroMobilityItemInfo.serviceName)) != 0) || (compareTo2 = Boolean.valueOf(mo28716o()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28716o()))) != 0 || ((mo28716o() && (compareTo2 = C25082a.m62844h(this.primaryMetaData, mVMicroMobilityItemInfo.primaryMetaData)) != 0) || (compareTo2 = Boolean.valueOf(mo28717p()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28717p()))) != 0 || ((mo28717p() && (compareTo2 = C25082a.m62844h(this.secondaryMetaData, mVMicroMobilityItemInfo.secondaryMetaData)) != 0) || (compareTo2 = Boolean.valueOf(mo28707f()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28707f()))) != 0 || ((mo28707f() && (compareTo2 = this.deepLinks.compareTo(mVMicroMobilityItemInfo.deepLinks)) != 0) || (compareTo2 = Boolean.valueOf(mo28708g()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28708g()))) != 0 || ((mo28708g() && (compareTo2 = C25082a.m62844h(this.flows, mVMicroMobilityItemInfo.flows)) != 0) || (compareTo2 = Boolean.valueOf(mo28714l()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28714l()))) != 0 || ((mo28714l() && (compareTo2 = this.location.compareTo(mVMicroMobilityItemInfo.location)) != 0) || (compareTo2 = Boolean.valueOf(mo28715m()).compareTo(Boolean.valueOf(mVMicroMobilityItemInfo.mo28715m()))) != 0)))))))))))))) {
            return compareTo2;
        }
        if (!mo28715m() || (compareTo = this.mapImage.compareTo(mVMicroMobilityItemInfo.mapImage)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMicroMobilityItemInfo)) {
            return mo28704a((MVMicroMobilityItemInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28707f() {
        return this.deepLinks != null;
    }

    /* renamed from: g */
    public final boolean mo28708g() {
        return this.flows != null;
    }

    /* renamed from: h */
    public final boolean mo28709h() {
        return this.itemId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28711i() {
        return this.itemImage != null;
    }

    /* renamed from: j */
    public final boolean mo28712j() {
        return this.itemSubtitle != null;
    }

    /* renamed from: k */
    public final boolean mo28713k() {
        return this.itemTitle != null;
    }

    /* renamed from: l */
    public final boolean mo28714l() {
        return this.location != null;
    }

    /* renamed from: m */
    public final boolean mo28715m() {
        return this.mapImage != null;
    }

    /* renamed from: o */
    public final boolean mo28716o() {
        return this.primaryMetaData != null;
    }

    /* renamed from: p */
    public final boolean mo28717p() {
        return this.secondaryMetaData != null;
    }

    /* renamed from: q */
    public final boolean mo28718q() {
        return this.serviceId != null;
    }

    /* renamed from: r */
    public final boolean mo28719r() {
        return this.serviceName != null;
    }

    /* renamed from: s */
    public final boolean mo28720s() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: t */
    public final boolean mo28721t() {
        return this.typeName != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityItemInfo(", "serviceId:");
        String str = this.serviceId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("itemId:");
        String str2 = this.itemId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("typeId:");
        C0016g.m42z(n, this.typeId, ", ", "typeName:");
        String str3 = this.typeName;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo28711i()) {
            n.append(", ");
            n.append("itemImage:");
            MVImageOption mVImageOption = this.itemImage;
            if (mVImageOption == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageOption);
            }
        }
        if (mo28713k()) {
            n.append(", ");
            n.append("itemTitle:");
            String str4 = this.itemTitle;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo28712j()) {
            n.append(", ");
            n.append("itemSubtitle:");
            String str5 = this.itemSubtitle;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        n.append(", ");
        n.append("serviceName:");
        String str6 = this.serviceName;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        if (mo28716o()) {
            n.append(", ");
            n.append("primaryMetaData:");
            List<MVAccessory> list = this.primaryMetaData;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo28717p()) {
            n.append(", ");
            n.append("secondaryMetaData:");
            List<MVMicroMobilityProperty> list2 = this.secondaryMetaData;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        if (mo28707f()) {
            n.append(", ");
            n.append("deepLinks:");
            MVExternalAppData mVExternalAppData = this.deepLinks;
            if (mVExternalAppData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVExternalAppData);
            }
        }
        if (mo28708g()) {
            n.append(", ");
            n.append("flows:");
            List<MVMicroMobilityIntegrationFlow> list3 = this.flows;
            if (list3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list3);
            }
        }
        n.append(", ");
        n.append("location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("mapImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.mapImage;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo28723u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: v */
    public final void mo28724v() throws TException {
        MVExternalAppData mVExternalAppData = this.deepLinks;
        if (mVExternalAppData != null) {
            mVExternalAppData.getClass();
        }
        MVLatLon mVLatLon = this.location;
        if (mVLatLon != null) {
            mVLatLon.getClass();
        }
        MVImageReferenceWithParams mVImageReferenceWithParams = this.mapImage;
        if (mVImageReferenceWithParams != null) {
            mVImageReferenceWithParams.getClass();
        }
    }
}
