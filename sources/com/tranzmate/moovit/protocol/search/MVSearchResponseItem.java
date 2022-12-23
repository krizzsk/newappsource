package com.tranzmate.moovit.protocol.search;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.common.MVSiteSource;
import com.tranzmate.moovit.protocol.common.MVTextOrImage;
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

public class MVSearchResponseItem implements TBase<MVSearchResponseItem, _Fields>, Serializable, Cloneable, Comparable<MVSearchResponseItem> {

    /* renamed from: b */
    public static final C25113c f28202b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28203c = new C25113c("id", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28204d = new C25113c("image", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28205e = new C25113c("title", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28206f = new C25113c("subTitle", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f28207g = new C25113c("latLon", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f28208h = new C25113c("sortingInfo", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f28209i = new C25113c(ServerParameters.AF_USER_ID, (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f28210j = new C25113c("inaccurateLatLon", (byte) 2, 9);

    /* renamed from: k */
    public static final C25113c f28211k = new C25113c("geocoderId", (byte) 8, 10);

    /* renamed from: l */
    public static final C25113c f28212l = new C25113c("airDistance", (byte) 8, 11);

    /* renamed from: m */
    public static final C25113c f28213m = new C25113c("source", (byte) 8, 12);

    /* renamed from: n */
    public static final C25113c f28214n = new C25113c("sourceId", (byte) 8, 13);

    /* renamed from: o */
    public static final C25113c f28215o = new C25113c("sourceDesc", (byte) 11, 14);

    /* renamed from: p */
    public static final HashMap f28216p;

    /* renamed from: q */
    public static final Map<_Fields, FieldMetaData> f28217q;
    private byte __isset_bitfield = 0;
    public int airDistance;
    public int geocoderId;

    /* renamed from: id */
    public int f28218id;
    public MVImageReferenceWithParams image;
    public boolean inaccurateLatLon;
    public MVLatLon latLon;
    private _Fields[] optionals = {_Fields.SORTING_INFO, _Fields.UID, _Fields.INACCURATE_LAT_LON, _Fields.GEOCODER_ID, _Fields.AIR_DISTANCE, _Fields.SOURCE, _Fields.SOURCE_ID, _Fields.SOURCE_DESC};
    public MVSearchResponseItemSortingInfo sortingInfo;
    public MVSiteSource source;
    public String sourceDesc;
    public int sourceId;
    public List<MVTextOrImage> subTitle;
    public String title;
    public MVSearchResultType type;
    public String uid;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        ID(2, "id"),
        IMAGE(3, "image"),
        TITLE(4, "title"),
        SUB_TITLE(5, "subTitle"),
        LAT_LON(6, "latLon"),
        SORTING_INFO(7, "sortingInfo"),
        UID(8, ServerParameters.AF_USER_ID),
        INACCURATE_LAT_LON(9, "inaccurateLatLon"),
        GEOCODER_ID(10, "geocoderId"),
        AIR_DISTANCE(11, "airDistance"),
        SOURCE(12, "source"),
        SOURCE_ID(13, "sourceId"),
        SOURCE_DESC(14, "sourceDesc");
        
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
                    return TYPE;
                case 2:
                    return ID;
                case 3:
                    return IMAGE;
                case 4:
                    return TITLE;
                case 5:
                    return SUB_TITLE;
                case 6:
                    return LAT_LON;
                case 7:
                    return SORTING_INFO;
                case 8:
                    return UID;
                case 9:
                    return INACCURATE_LAT_LON;
                case 10:
                    return GEOCODER_ID;
                case 11:
                    return AIR_DISTANCE;
                case 12:
                    return SOURCE;
                case 13:
                    return SOURCE_ID;
                case 14:
                    return SOURCE_DESC;
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponseItem$a */
    public static class C10443a extends C25239c<MVSearchResponseItem> {
        public C10443a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponseItem mVSearchResponseItem = (MVSearchResponseItem) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVSearchResponseItem.image;
            C25113c cVar = MVSearchResponseItem.f28202b;
            gVar.mo61687K();
            if (mVSearchResponseItem.type != null) {
                gVar.mo61711x(MVSearchResponseItem.f28202b);
                gVar.mo61678B(mVSearchResponseItem.type.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSearchResponseItem.f28203c);
            gVar.mo61678B(mVSearchResponseItem.f28218id);
            gVar.mo61712y();
            if (mVSearchResponseItem.image != null) {
                gVar.mo61711x(MVSearchResponseItem.f28204d);
                mVSearchResponseItem.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.title != null) {
                gVar.mo61711x(MVSearchResponseItem.f28205e);
                gVar.mo61686J(mVSearchResponseItem.title);
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.subTitle != null) {
                gVar.mo61711x(MVSearchResponseItem.f28206f);
                gVar.mo61680D(new C25119e((byte) 12, mVSearchResponseItem.subTitle.size()));
                for (MVTextOrImage X0 : mVSearchResponseItem.subTitle) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.latLon != null) {
                gVar.mo61711x(MVSearchResponseItem.f28207g);
                mVSearchResponseItem.latLon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.sortingInfo != null && mVSearchResponseItem.mo31528l()) {
                gVar.mo61711x(MVSearchResponseItem.f28208h);
                mVSearchResponseItem.sortingInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.uid != null && mVSearchResponseItem.mo31535t()) {
                gVar.mo61711x(MVSearchResponseItem.f28209i);
                gVar.mo61686J(mVSearchResponseItem.uid);
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.mo31526j()) {
                gVar.mo61711x(MVSearchResponseItem.f28210j);
                gVar.mo61708u(mVSearchResponseItem.inaccurateLatLon);
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.mo31522g()) {
                gVar.mo61711x(MVSearchResponseItem.f28211k);
                gVar.mo61678B(mVSearchResponseItem.geocoderId);
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.mo31521f()) {
                gVar.mo61711x(MVSearchResponseItem.f28212l);
                gVar.mo61678B(mVSearchResponseItem.airDistance);
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.source != null && mVSearchResponseItem.mo31529m()) {
                gVar.mo61711x(MVSearchResponseItem.f28213m);
                gVar.mo61678B(mVSearchResponseItem.source.getValue());
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.mo31531p()) {
                gVar.mo61711x(MVSearchResponseItem.f28214n);
                gVar.mo61678B(mVSearchResponseItem.sourceId);
                gVar.mo61712y();
            }
            if (mVSearchResponseItem.sourceDesc != null && mVSearchResponseItem.mo31530o()) {
                gVar.mo61711x(MVSearchResponseItem.f28215o);
                gVar.mo61686J(mVSearchResponseItem.sourceDesc);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponseItem mVSearchResponseItem = (MVSearchResponseItem) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVSearchResponseItem.image;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.type = MVSearchResultType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.f28218id = gVar.mo61696i();
                            mVSearchResponseItem.mo31539w(true);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVSearchResponseItem.image = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.title = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVSearchResponseItem.subTitle = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVTextOrImage mVTextOrImage = new MVTextOrImage();
                                mVTextOrImage.mo25201C1(gVar);
                                mVSearchResponseItem.subTitle.add(mVTextOrImage);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon = new MVLatLon();
                            mVSearchResponseItem.latLon = mVLatLon;
                            mVLatLon.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVSearchResponseItemSortingInfo mVSearchResponseItemSortingInfo = new MVSearchResponseItemSortingInfo();
                            mVSearchResponseItem.sortingInfo = mVSearchResponseItemSortingInfo;
                            mVSearchResponseItemSortingInfo.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.uid = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.inaccurateLatLon = gVar.mo61690c();
                            mVSearchResponseItem.mo31540y();
                            break;
                        }
                    case 10:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.geocoderId = gVar.mo61696i();
                            mVSearchResponseItem.mo31538v();
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.airDistance = gVar.mo61696i();
                            mVSearchResponseItem.mo31537u();
                            break;
                        }
                    case 12:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.source = MVSiteSource.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 13:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.sourceId = gVar.mo61696i();
                            mVSearchResponseItem.mo31518A();
                            break;
                        }
                    case 14:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSearchResponseItem.sourceDesc = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponseItem$b */
    public static class C10444b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10443a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponseItem$c */
    public static class C10445c extends C25240d<MVSearchResponseItem> {
        public C10445c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponseItem mVSearchResponseItem = (MVSearchResponseItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSearchResponseItem.mo31534s()) {
                bitSet.set(0);
            }
            if (mVSearchResponseItem.mo31523h()) {
                bitSet.set(1);
            }
            if (mVSearchResponseItem.mo31525i()) {
                bitSet.set(2);
            }
            if (mVSearchResponseItem.mo31533r()) {
                bitSet.set(3);
            }
            if (mVSearchResponseItem.mo31532q()) {
                bitSet.set(4);
            }
            if (mVSearchResponseItem.mo31527k()) {
                bitSet.set(5);
            }
            if (mVSearchResponseItem.mo31528l()) {
                bitSet.set(6);
            }
            if (mVSearchResponseItem.mo31535t()) {
                bitSet.set(7);
            }
            if (mVSearchResponseItem.mo31526j()) {
                bitSet.set(8);
            }
            if (mVSearchResponseItem.mo31522g()) {
                bitSet.set(9);
            }
            if (mVSearchResponseItem.mo31521f()) {
                bitSet.set(10);
            }
            if (mVSearchResponseItem.mo31529m()) {
                bitSet.set(11);
            }
            if (mVSearchResponseItem.mo31531p()) {
                bitSet.set(12);
            }
            if (mVSearchResponseItem.mo31530o()) {
                bitSet.set(13);
            }
            jVar.mo61738U(bitSet, 14);
            if (mVSearchResponseItem.mo31534s()) {
                jVar.mo61678B(mVSearchResponseItem.type.getValue());
            }
            if (mVSearchResponseItem.mo31523h()) {
                jVar.mo61678B(mVSearchResponseItem.f28218id);
            }
            if (mVSearchResponseItem.mo31525i()) {
                mVSearchResponseItem.image.mo25202X0(jVar);
            }
            if (mVSearchResponseItem.mo31533r()) {
                jVar.mo61686J(mVSearchResponseItem.title);
            }
            if (mVSearchResponseItem.mo31532q()) {
                jVar.mo61678B(mVSearchResponseItem.subTitle.size());
                for (MVTextOrImage X0 : mVSearchResponseItem.subTitle) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSearchResponseItem.mo31527k()) {
                mVSearchResponseItem.latLon.mo25202X0(jVar);
            }
            if (mVSearchResponseItem.mo31528l()) {
                mVSearchResponseItem.sortingInfo.mo25202X0(jVar);
            }
            if (mVSearchResponseItem.mo31535t()) {
                jVar.mo61686J(mVSearchResponseItem.uid);
            }
            if (mVSearchResponseItem.mo31526j()) {
                jVar.mo61708u(mVSearchResponseItem.inaccurateLatLon);
            }
            if (mVSearchResponseItem.mo31522g()) {
                jVar.mo61678B(mVSearchResponseItem.geocoderId);
            }
            if (mVSearchResponseItem.mo31521f()) {
                jVar.mo61678B(mVSearchResponseItem.airDistance);
            }
            if (mVSearchResponseItem.mo31529m()) {
                jVar.mo61678B(mVSearchResponseItem.source.getValue());
            }
            if (mVSearchResponseItem.mo31531p()) {
                jVar.mo61678B(mVSearchResponseItem.sourceId);
            }
            if (mVSearchResponseItem.mo31530o()) {
                jVar.mo61686J(mVSearchResponseItem.sourceDesc);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSearchResponseItem mVSearchResponseItem = (MVSearchResponseItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(14);
            if (T.get(0)) {
                mVSearchResponseItem.type = MVSearchResultType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVSearchResponseItem.f28218id = jVar.mo61696i();
                mVSearchResponseItem.mo31539w(true);
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVSearchResponseItem.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVSearchResponseItem.title = jVar.mo61704q();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVSearchResponseItem.subTitle = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTextOrImage mVTextOrImage = new MVTextOrImage();
                    mVTextOrImage.mo25201C1(jVar);
                    mVSearchResponseItem.subTitle.add(mVTextOrImage);
                }
            }
            if (T.get(5)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVSearchResponseItem.latLon = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVSearchResponseItemSortingInfo mVSearchResponseItemSortingInfo = new MVSearchResponseItemSortingInfo();
                mVSearchResponseItem.sortingInfo = mVSearchResponseItemSortingInfo;
                mVSearchResponseItemSortingInfo.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVSearchResponseItem.uid = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVSearchResponseItem.inaccurateLatLon = jVar.mo61690c();
                mVSearchResponseItem.mo31540y();
            }
            if (T.get(9)) {
                mVSearchResponseItem.geocoderId = jVar.mo61696i();
                mVSearchResponseItem.mo31538v();
            }
            if (T.get(10)) {
                mVSearchResponseItem.airDistance = jVar.mo61696i();
                mVSearchResponseItem.mo31537u();
            }
            if (T.get(11)) {
                mVSearchResponseItem.source = MVSiteSource.findByValue(jVar.mo61696i());
            }
            if (T.get(12)) {
                mVSearchResponseItem.sourceId = jVar.mo61696i();
                mVSearchResponseItem.mo31518A();
            }
            if (T.get(13)) {
                mVSearchResponseItem.sourceDesc = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVSearchResponseItem$d */
    public static class C10446d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10445c(0);
        }
    }

    static {
        new C17394d0("MVSearchResponseItem");
        HashMap hashMap = new HashMap();
        f28216p = hashMap;
        hashMap.put(C25239c.class, new C10444b());
        hashMap.put(C25240d.class, new C10446d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVSearchResultType.class)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUB_TITLE, new FieldMetaData("subTitle", (byte) 3, new ListMetaData(new StructMetaData(MVTextOrImage.class))));
        enumMap.put(_Fields.LAT_LON, new FieldMetaData("latLon", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.SORTING_INFO, new FieldMetaData("sortingInfo", (byte) 2, new StructMetaData(MVSearchResponseItemSortingInfo.class)));
        enumMap.put(_Fields.UID, new FieldMetaData(ServerParameters.AF_USER_ID, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INACCURATE_LAT_LON, new FieldMetaData("inaccurateLatLon", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.GEOCODER_ID, new FieldMetaData("geocoderId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AIR_DISTANCE, new FieldMetaData("airDistance", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SOURCE, new FieldMetaData("source", (byte) 2, new EnumMetaData(MVSiteSource.class)));
        enumMap.put(_Fields.SOURCE_ID, new FieldMetaData("sourceId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SOURCE_DESC, new FieldMetaData("sourceDesc", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28217q = unmodifiableMap;
        FieldMetaData.m61947a(MVSearchResponseItem.class, unmodifiableMap);
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
    public final void mo31518A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f28216p.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28216p.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSearchResponseItem mVSearchResponseItem = (MVSearchResponseItem) obj;
        if (!getClass().equals(mVSearchResponseItem.getClass())) {
            return getClass().getName().compareTo(mVSearchResponseItem.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31534s()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31534s()));
        if (compareTo2 != 0 || ((mo31534s() && (compareTo2 = this.type.compareTo(mVSearchResponseItem.type)) != 0) || (compareTo2 = Boolean.valueOf(mo31523h()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31523h()))) != 0 || ((mo31523h() && (compareTo2 = C25082a.m62839c(this.f28218id, mVSearchResponseItem.f28218id)) != 0) || (compareTo2 = Boolean.valueOf(mo31525i()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31525i()))) != 0 || ((mo31525i() && (compareTo2 = this.image.compareTo(mVSearchResponseItem.image)) != 0) || (compareTo2 = Boolean.valueOf(mo31533r()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31533r()))) != 0 || ((mo31533r() && (compareTo2 = this.title.compareTo(mVSearchResponseItem.title)) != 0) || (compareTo2 = Boolean.valueOf(mo31532q()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31532q()))) != 0 || ((mo31532q() && (compareTo2 = C25082a.m62844h(this.subTitle, mVSearchResponseItem.subTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo31527k()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31527k()))) != 0 || ((mo31527k() && (compareTo2 = this.latLon.compareTo(mVSearchResponseItem.latLon)) != 0) || (compareTo2 = Boolean.valueOf(mo31528l()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31528l()))) != 0 || ((mo31528l() && (compareTo2 = this.sortingInfo.compareTo(mVSearchResponseItem.sortingInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo31535t()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31535t()))) != 0 || ((mo31535t() && (compareTo2 = this.uid.compareTo(mVSearchResponseItem.uid)) != 0) || (compareTo2 = Boolean.valueOf(mo31526j()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31526j()))) != 0 || ((mo31526j() && (compareTo2 = C25082a.m62848l(this.inaccurateLatLon, mVSearchResponseItem.inaccurateLatLon)) != 0) || (compareTo2 = Boolean.valueOf(mo31522g()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31522g()))) != 0 || ((mo31522g() && (compareTo2 = C25082a.m62839c(this.geocoderId, mVSearchResponseItem.geocoderId)) != 0) || (compareTo2 = Boolean.valueOf(mo31521f()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31521f()))) != 0 || ((mo31521f() && (compareTo2 = C25082a.m62839c(this.airDistance, mVSearchResponseItem.airDistance)) != 0) || (compareTo2 = Boolean.valueOf(mo31529m()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31529m()))) != 0 || ((mo31529m() && (compareTo2 = this.source.compareTo(mVSearchResponseItem.source)) != 0) || (compareTo2 = Boolean.valueOf(mo31531p()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31531p()))) != 0 || ((mo31531p() && (compareTo2 = C25082a.m62839c(this.sourceId, mVSearchResponseItem.sourceId)) != 0) || (compareTo2 = Boolean.valueOf(mo31530o()).compareTo(Boolean.valueOf(mVSearchResponseItem.mo31530o()))) != 0)))))))))))))) {
            return compareTo2;
        }
        if (!mo31530o() || (compareTo = this.sourceDesc.compareTo(mVSearchResponseItem.sourceDesc)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSearchResponseItem)) {
            return false;
        }
        MVSearchResponseItem mVSearchResponseItem = (MVSearchResponseItem) obj;
        boolean s = mo31534s();
        boolean s2 = mVSearchResponseItem.mo31534s();
        if (((s || s2) && (!s || !s2 || !this.type.equals(mVSearchResponseItem.type))) || this.f28218id != mVSearchResponseItem.f28218id) {
            return false;
        }
        boolean i = mo31525i();
        boolean i2 = mVSearchResponseItem.mo31525i();
        if ((i || i2) && (!i || !i2 || !this.image.mo26245a(mVSearchResponseItem.image))) {
            return false;
        }
        boolean r = mo31533r();
        boolean r2 = mVSearchResponseItem.mo31533r();
        if ((r || r2) && (!r || !r2 || !this.title.equals(mVSearchResponseItem.title))) {
            return false;
        }
        boolean q = mo31532q();
        boolean q2 = mVSearchResponseItem.mo31532q();
        if ((q || q2) && (!q || !q2 || !this.subTitle.equals(mVSearchResponseItem.subTitle))) {
            return false;
        }
        boolean k = mo31527k();
        boolean k2 = mVSearchResponseItem.mo31527k();
        if ((k || k2) && (!k || !k2 || !this.latLon.mo26290a(mVSearchResponseItem.latLon))) {
            return false;
        }
        boolean l = mo31528l();
        boolean l2 = mVSearchResponseItem.mo31528l();
        if ((l || l2) && (!l || !l2 || !this.sortingInfo.mo31542a(mVSearchResponseItem.sortingInfo))) {
            return false;
        }
        boolean t = mo31535t();
        boolean t2 = mVSearchResponseItem.mo31535t();
        if ((t || t2) && (!t || !t2 || !this.uid.equals(mVSearchResponseItem.uid))) {
            return false;
        }
        boolean j = mo31526j();
        boolean j2 = mVSearchResponseItem.mo31526j();
        if ((j || j2) && (!j || !j2 || this.inaccurateLatLon != mVSearchResponseItem.inaccurateLatLon)) {
            return false;
        }
        boolean g = mo31522g();
        boolean g2 = mVSearchResponseItem.mo31522g();
        if ((g || g2) && (!g || !g2 || this.geocoderId != mVSearchResponseItem.geocoderId)) {
            return false;
        }
        boolean f = mo31521f();
        boolean f2 = mVSearchResponseItem.mo31521f();
        if ((f || f2) && (!f || !f2 || this.airDistance != mVSearchResponseItem.airDistance)) {
            return false;
        }
        boolean m = mo31529m();
        boolean m2 = mVSearchResponseItem.mo31529m();
        if ((m || m2) && (!m || !m2 || !this.source.equals(mVSearchResponseItem.source))) {
            return false;
        }
        boolean p = mo31531p();
        boolean p2 = mVSearchResponseItem.mo31531p();
        if ((p || p2) && (!p || !p2 || this.sourceId != mVSearchResponseItem.sourceId)) {
            return false;
        }
        boolean o = mo31530o();
        boolean o2 = mVSearchResponseItem.mo31530o();
        if ((o || o2) && (!o || !o2 || !this.sourceDesc.equals(mVSearchResponseItem.sourceDesc))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31521f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo31522g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo31523h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31525i() {
        return this.image != null;
    }

    /* renamed from: j */
    public final boolean mo31526j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo31527k() {
        return this.latLon != null;
    }

    /* renamed from: l */
    public final boolean mo31528l() {
        return this.sortingInfo != null;
    }

    /* renamed from: m */
    public final boolean mo31529m() {
        return this.source != null;
    }

    /* renamed from: o */
    public final boolean mo31530o() {
        return this.sourceDesc != null;
    }

    /* renamed from: p */
    public final boolean mo31531p() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: q */
    public final boolean mo31532q() {
        return this.subTitle != null;
    }

    /* renamed from: r */
    public final boolean mo31533r() {
        return this.title != null;
    }

    /* renamed from: s */
    public final boolean mo31534s() {
        return this.type != null;
    }

    /* renamed from: t */
    public final boolean mo31535t() {
        return this.uid != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSearchResponseItem(", "type:");
        MVSearchResultType mVSearchResultType = this.type;
        if (mVSearchResultType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSearchResultType);
        }
        n.append(", ");
        n.append("id:");
        C0016g.m42z(n, this.f28218id, ", ", "image:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("subTitle:");
        List<MVTextOrImage> list = this.subTitle;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("latLon:");
        MVLatLon mVLatLon = this.latLon;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        if (mo31528l()) {
            n.append(", ");
            n.append("sortingInfo:");
            MVSearchResponseItemSortingInfo mVSearchResponseItemSortingInfo = this.sortingInfo;
            if (mVSearchResponseItemSortingInfo == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSearchResponseItemSortingInfo);
            }
        }
        if (mo31535t()) {
            n.append(", ");
            n.append("uid:");
            String str2 = this.uid;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo31526j()) {
            n.append(", ");
            n.append("inaccurateLatLon:");
            n.append(this.inaccurateLatLon);
        }
        if (mo31522g()) {
            n.append(", ");
            n.append("geocoderId:");
            n.append(this.geocoderId);
        }
        if (mo31521f()) {
            n.append(", ");
            n.append("airDistance:");
            n.append(this.airDistance);
        }
        if (mo31529m()) {
            n.append(", ");
            n.append("source:");
            MVSiteSource mVSiteSource = this.source;
            if (mVSiteSource == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSiteSource);
            }
        }
        if (mo31531p()) {
            n.append(", ");
            n.append("sourceId:");
            n.append(this.sourceId);
        }
        if (mo31530o()) {
            n.append(", ");
            n.append("sourceDesc:");
            String str3 = this.sourceDesc;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo31537u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: v */
    public final void mo31538v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: w */
    public final void mo31539w(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: y */
    public final void mo31540y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }
}
