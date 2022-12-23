package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams;
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

public class MVCategory implements TBase<MVCategory, _Fields>, Serializable, Cloneable, Comparable<MVCategory> {

    /* renamed from: b */
    public static final C25113c f26223b = new C25113c("mapImage", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26224c = new C25113c("categoryMetaData", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26225d = new C25113c("items", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f26226e = new C25113c("id", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26227f = new C25113c("name", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f26228g = new C25113c("clusteringImage", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f26229h = new C25113c("minZoom", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f26230i = new C25113c("maxZoom", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f26231j = new C25113c("selectedMapImage", (byte) 12, 9);

    /* renamed from: k */
    public static final HashMap f26232k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f26233l;
    private byte __isset_bitfield = 0;
    public MVCategoryMetaData categoryMetaData;
    public MVImageReferenceWithPartialParams clusteringImage;

    /* renamed from: id */
    public String f26234id;
    public List<MVCategoryItem> items;
    public MVImageReferenceWithPartialParams mapImage;
    public int maxZoom;
    public int minZoom;
    public String name;
    private _Fields[] optionals = {_Fields.CATEGORY_META_DATA, _Fields.CLUSTERING_IMAGE, _Fields.MIN_ZOOM, _Fields.MAX_ZOOM, _Fields.SELECTED_MAP_IMAGE};
    public MVImageReferenceWithPartialParams selectedMapImage;

    public enum _Fields implements C25085c {
        MAP_IMAGE(1, "mapImage"),
        CATEGORY_META_DATA(2, "categoryMetaData"),
        ITEMS(3, "items"),
        ID(4, "id"),
        NAME(5, "name"),
        CLUSTERING_IMAGE(6, "clusteringImage"),
        MIN_ZOOM(7, "minZoom"),
        MAX_ZOOM(8, "maxZoom"),
        SELECTED_MAP_IMAGE(9, "selectedMapImage");
        
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
                    return MAP_IMAGE;
                case 2:
                    return CATEGORY_META_DATA;
                case 3:
                    return ITEMS;
                case 4:
                    return ID;
                case 5:
                    return NAME;
                case 6:
                    return CLUSTERING_IMAGE;
                case 7:
                    return MIN_ZOOM;
                case 8:
                    return MAX_ZOOM;
                case 9:
                    return SELECTED_MAP_IMAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCategory$a */
    public static class C9044a extends C25239c<MVCategory> {
        public C9044a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCategory mVCategory = (MVCategory) tBase;
            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams = mVCategory.mapImage;
            C25113c cVar = MVCategory.f26223b;
            gVar.mo61687K();
            if (mVCategory.mapImage != null) {
                gVar.mo61711x(MVCategory.f26223b);
                mVCategory.mapImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCategory.categoryMetaData != null && mVCategory.mo28186f()) {
                gVar.mo61711x(MVCategory.f26224c);
                mVCategory.categoryMetaData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCategory.items != null) {
                gVar.mo61711x(MVCategory.f26225d);
                gVar.mo61680D(new C25119e((byte) 12, mVCategory.items.size()));
                for (MVCategoryItem X0 : mVCategory.items) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVCategory.f26234id != null) {
                gVar.mo61711x(MVCategory.f26226e);
                gVar.mo61686J(mVCategory.f26234id);
                gVar.mo61712y();
            }
            if (mVCategory.name != null) {
                gVar.mo61711x(MVCategory.f26227f);
                gVar.mo61686J(mVCategory.name);
                gVar.mo61712y();
            }
            if (mVCategory.clusteringImage != null && mVCategory.mo28187g()) {
                gVar.mo61711x(MVCategory.f26228g);
                mVCategory.clusteringImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCategory.mo28193l()) {
                gVar.mo61711x(MVCategory.f26229h);
                gVar.mo61678B(mVCategory.minZoom);
                gVar.mo61712y();
            }
            if (mVCategory.mo28192k()) {
                gVar.mo61711x(MVCategory.f26230i);
                gVar.mo61678B(mVCategory.maxZoom);
                gVar.mo61712y();
            }
            if (mVCategory.selectedMapImage != null && mVCategory.mo28195o()) {
                gVar.mo61711x(MVCategory.f26231j);
                mVCategory.selectedMapImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCategory mVCategory = (MVCategory) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams = mVCategory.mapImage;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams2 = new MVImageReferenceWithPartialParams();
                            mVCategory.mapImage = mVImageReferenceWithPartialParams2;
                            mVImageReferenceWithPartialParams2.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCategoryMetaData mVCategoryMetaData = new MVCategoryMetaData();
                            mVCategory.categoryMetaData = mVCategoryMetaData;
                            mVCategoryMetaData.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVCategory.items = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVCategoryItem mVCategoryItem = new MVCategoryItem();
                                mVCategoryItem.mo25201C1(gVar);
                                mVCategory.items.add(mVCategoryItem);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCategory.f26234id = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCategory.name = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams3 = new MVImageReferenceWithPartialParams();
                            mVCategory.clusteringImage = mVImageReferenceWithPartialParams3;
                            mVImageReferenceWithPartialParams3.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCategory.minZoom = gVar.mo61696i();
                            mVCategory.mo28197q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCategory.maxZoom = gVar.mo61696i();
                            mVCategory.mo28196p();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams4 = new MVImageReferenceWithPartialParams();
                            mVCategory.selectedMapImage = mVImageReferenceWithPartialParams4;
                            mVImageReferenceWithPartialParams4.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCategory$b */
    public static class C9045b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9044a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCategory$c */
    public static class C9046c extends C25240d<MVCategory> {
        public C9046c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCategory mVCategory = (MVCategory) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCategory.mo28191j()) {
                bitSet.set(0);
            }
            if (mVCategory.mo28186f()) {
                bitSet.set(1);
            }
            if (mVCategory.mo28190i()) {
                bitSet.set(2);
            }
            if (mVCategory.mo28188h()) {
                bitSet.set(3);
            }
            if (mVCategory.mo28194m()) {
                bitSet.set(4);
            }
            if (mVCategory.mo28187g()) {
                bitSet.set(5);
            }
            if (mVCategory.mo28193l()) {
                bitSet.set(6);
            }
            if (mVCategory.mo28192k()) {
                bitSet.set(7);
            }
            if (mVCategory.mo28195o()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVCategory.mo28191j()) {
                mVCategory.mapImage.mo25202X0(jVar);
            }
            if (mVCategory.mo28186f()) {
                mVCategory.categoryMetaData.mo25202X0(jVar);
            }
            if (mVCategory.mo28190i()) {
                jVar.mo61678B(mVCategory.items.size());
                for (MVCategoryItem X0 : mVCategory.items) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVCategory.mo28188h()) {
                jVar.mo61686J(mVCategory.f26234id);
            }
            if (mVCategory.mo28194m()) {
                jVar.mo61686J(mVCategory.name);
            }
            if (mVCategory.mo28187g()) {
                mVCategory.clusteringImage.mo25202X0(jVar);
            }
            if (mVCategory.mo28193l()) {
                jVar.mo61678B(mVCategory.minZoom);
            }
            if (mVCategory.mo28192k()) {
                jVar.mo61678B(mVCategory.maxZoom);
            }
            if (mVCategory.mo28195o()) {
                mVCategory.selectedMapImage.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCategory mVCategory = (MVCategory) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams = new MVImageReferenceWithPartialParams();
                mVCategory.mapImage = mVImageReferenceWithPartialParams;
                mVImageReferenceWithPartialParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVCategoryMetaData mVCategoryMetaData = new MVCategoryMetaData();
                mVCategory.categoryMetaData = mVCategoryMetaData;
                mVCategoryMetaData.mo25201C1(jVar);
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVCategory.items = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVCategoryItem mVCategoryItem = new MVCategoryItem();
                    mVCategoryItem.mo25201C1(jVar);
                    mVCategory.items.add(mVCategoryItem);
                }
            }
            if (T.get(3)) {
                mVCategory.f26234id = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVCategory.name = jVar.mo61704q();
            }
            if (T.get(5)) {
                MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams2 = new MVImageReferenceWithPartialParams();
                mVCategory.clusteringImage = mVImageReferenceWithPartialParams2;
                mVImageReferenceWithPartialParams2.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVCategory.minZoom = jVar.mo61696i();
                mVCategory.mo28197q();
            }
            if (T.get(7)) {
                mVCategory.maxZoom = jVar.mo61696i();
                mVCategory.mo28196p();
            }
            if (T.get(8)) {
                MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams3 = new MVImageReferenceWithPartialParams();
                mVCategory.selectedMapImage = mVImageReferenceWithPartialParams3;
                mVImageReferenceWithPartialParams3.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCategory$d */
    public static class C9047d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9046c(0);
        }
    }

    static {
        new C17394d0("MVCategory");
        HashMap hashMap = new HashMap();
        f26232k = hashMap;
        hashMap.put(C25239c.class, new C9045b());
        hashMap.put(C25240d.class, new C9047d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MAP_IMAGE, new FieldMetaData("mapImage", (byte) 3, new StructMetaData(MVImageReferenceWithPartialParams.class)));
        enumMap.put(_Fields.CATEGORY_META_DATA, new FieldMetaData("categoryMetaData", (byte) 2, new StructMetaData(MVCategoryMetaData.class)));
        enumMap.put(_Fields.ITEMS, new FieldMetaData("items", (byte) 3, new ListMetaData(new StructMetaData(MVCategoryItem.class))));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CLUSTERING_IMAGE, new FieldMetaData("clusteringImage", (byte) 2, new StructMetaData(MVImageReferenceWithPartialParams.class)));
        enumMap.put(_Fields.MIN_ZOOM, new FieldMetaData("minZoom", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MAX_ZOOM, new FieldMetaData("maxZoom", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SELECTED_MAP_IMAGE, new FieldMetaData("selectedMapImage", (byte) 2, new StructMetaData(MVImageReferenceWithPartialParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26233l = unmodifiableMap;
        FieldMetaData.m61947a(MVCategory.class, unmodifiableMap);
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
        ((C25238b) f26232k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26232k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCategory mVCategory = (MVCategory) obj;
        if (!getClass().equals(mVCategory.getClass())) {
            return getClass().getName().compareTo(mVCategory.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28191j()).compareTo(Boolean.valueOf(mVCategory.mo28191j()));
        if (compareTo2 != 0 || ((mo28191j() && (compareTo2 = this.mapImage.compareTo(mVCategory.mapImage)) != 0) || (compareTo2 = Boolean.valueOf(mo28186f()).compareTo(Boolean.valueOf(mVCategory.mo28186f()))) != 0 || ((mo28186f() && (compareTo2 = this.categoryMetaData.compareTo(mVCategory.categoryMetaData)) != 0) || (compareTo2 = Boolean.valueOf(mo28190i()).compareTo(Boolean.valueOf(mVCategory.mo28190i()))) != 0 || ((mo28190i() && (compareTo2 = C25082a.m62844h(this.items, mVCategory.items)) != 0) || (compareTo2 = Boolean.valueOf(mo28188h()).compareTo(Boolean.valueOf(mVCategory.mo28188h()))) != 0 || ((mo28188h() && (compareTo2 = this.f26234id.compareTo(mVCategory.f26234id)) != 0) || (compareTo2 = Boolean.valueOf(mo28194m()).compareTo(Boolean.valueOf(mVCategory.mo28194m()))) != 0 || ((mo28194m() && (compareTo2 = this.name.compareTo(mVCategory.name)) != 0) || (compareTo2 = Boolean.valueOf(mo28187g()).compareTo(Boolean.valueOf(mVCategory.mo28187g()))) != 0 || ((mo28187g() && (compareTo2 = this.clusteringImage.compareTo(mVCategory.clusteringImage)) != 0) || (compareTo2 = Boolean.valueOf(mo28193l()).compareTo(Boolean.valueOf(mVCategory.mo28193l()))) != 0 || ((mo28193l() && (compareTo2 = C25082a.m62839c(this.minZoom, mVCategory.minZoom)) != 0) || (compareTo2 = Boolean.valueOf(mo28192k()).compareTo(Boolean.valueOf(mVCategory.mo28192k()))) != 0 || ((mo28192k() && (compareTo2 = C25082a.m62839c(this.maxZoom, mVCategory.maxZoom)) != 0) || (compareTo2 = Boolean.valueOf(mo28195o()).compareTo(Boolean.valueOf(mVCategory.mo28195o()))) != 0))))))))) {
            return compareTo2;
        }
        if (!mo28195o() || (compareTo = this.selectedMapImage.compareTo(mVCategory.selectedMapImage)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.tranzmate.moovit.protocol.mapitems.MVCategory
            r2 = 1
            if (r1 == 0) goto L_0x011e
            com.tranzmate.moovit.protocol.mapitems.MVCategory r7 = (com.tranzmate.moovit.protocol.mapitems.MVCategory) r7
            boolean r1 = r6.mo28191j()
            boolean r3 = r7.mo28191j()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0029
        L_0x0017:
            if (r1 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x001d
            goto L_0x011e
        L_0x001d:
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams r1 = r6.mapImage
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams r3 = r7.mapImage
            boolean r1 = r1.mo26254a(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x011e
        L_0x0029:
            boolean r1 = r6.mo28186f()
            boolean r3 = r7.mo28186f()
            if (r1 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x005b
        L_0x0035:
            if (r1 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x003b
            goto L_0x011e
        L_0x003b:
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r1 = r6.categoryMetaData
            com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData r3 = r7.categoryMetaData
            if (r3 == 0) goto L_0x0053
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x0056
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            r1 = 1
            goto L_0x0057
        L_0x0053:
            r1.getClass()
        L_0x0056:
            r1 = 0
        L_0x0057:
            if (r1 != 0) goto L_0x005b
            goto L_0x011e
        L_0x005b:
            boolean r1 = r6.mo28190i()
            boolean r3 = r7.mo28190i()
            if (r1 != 0) goto L_0x0067
            if (r3 == 0) goto L_0x0079
        L_0x0067:
            if (r1 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x006d
            goto L_0x011e
        L_0x006d:
            java.util.List<com.tranzmate.moovit.protocol.mapitems.MVCategoryItem> r1 = r6.items
            java.util.List<com.tranzmate.moovit.protocol.mapitems.MVCategoryItem> r3 = r7.items
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0079
            goto L_0x011e
        L_0x0079:
            boolean r1 = r6.mo28188h()
            boolean r3 = r7.mo28188h()
            if (r1 != 0) goto L_0x0085
            if (r3 == 0) goto L_0x0097
        L_0x0085:
            if (r1 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x008b
            goto L_0x011e
        L_0x008b:
            java.lang.String r1 = r6.f26234id
            java.lang.String r3 = r7.f26234id
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0097
            goto L_0x011e
        L_0x0097:
            boolean r1 = r6.mo28194m()
            boolean r3 = r7.mo28194m()
            if (r1 != 0) goto L_0x00a3
            if (r3 == 0) goto L_0x00b5
        L_0x00a3:
            if (r1 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x00a9
            goto L_0x011e
        L_0x00a9:
            java.lang.String r1 = r6.name
            java.lang.String r3 = r7.name
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00b5
            goto L_0x011e
        L_0x00b5:
            boolean r1 = r6.mo28187g()
            boolean r3 = r7.mo28187g()
            if (r1 != 0) goto L_0x00c1
            if (r3 == 0) goto L_0x00d1
        L_0x00c1:
            if (r1 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x00c6
            goto L_0x011e
        L_0x00c6:
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams r1 = r6.clusteringImage
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams r3 = r7.clusteringImage
            boolean r1 = r1.mo26254a(r3)
            if (r1 != 0) goto L_0x00d1
            goto L_0x011e
        L_0x00d1:
            boolean r1 = r6.mo28193l()
            boolean r3 = r7.mo28193l()
            if (r1 != 0) goto L_0x00dd
            if (r3 == 0) goto L_0x00e9
        L_0x00dd:
            if (r1 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x00e2
            goto L_0x011e
        L_0x00e2:
            int r1 = r6.minZoom
            int r3 = r7.minZoom
            if (r1 == r3) goto L_0x00e9
            goto L_0x011e
        L_0x00e9:
            boolean r1 = r6.mo28192k()
            boolean r3 = r7.mo28192k()
            if (r1 != 0) goto L_0x00f5
            if (r3 == 0) goto L_0x0101
        L_0x00f5:
            if (r1 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x00fa
            goto L_0x011e
        L_0x00fa:
            int r1 = r6.maxZoom
            int r3 = r7.maxZoom
            if (r1 == r3) goto L_0x0101
            goto L_0x011e
        L_0x0101:
            boolean r1 = r6.mo28195o()
            boolean r3 = r7.mo28195o()
            if (r1 != 0) goto L_0x010d
            if (r3 == 0) goto L_0x011d
        L_0x010d:
            if (r1 == 0) goto L_0x011e
            if (r3 != 0) goto L_0x0112
            goto L_0x011e
        L_0x0112:
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams r1 = r6.selectedMapImage
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams r7 = r7.selectedMapImage
            boolean r7 = r1.mo26254a(r7)
            if (r7 != 0) goto L_0x011d
            goto L_0x011e
        L_0x011d:
            r0 = 1
        L_0x011e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.mapitems.MVCategory.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo28186f() {
        return this.categoryMetaData != null;
    }

    /* renamed from: g */
    public final boolean mo28187g() {
        return this.clusteringImage != null;
    }

    /* renamed from: h */
    public final boolean mo28188h() {
        return this.f26234id != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28190i() {
        return this.items != null;
    }

    /* renamed from: j */
    public final boolean mo28191j() {
        return this.mapImage != null;
    }

    /* renamed from: k */
    public final boolean mo28192k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final boolean mo28193l() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: m */
    public final boolean mo28194m() {
        return this.name != null;
    }

    /* renamed from: o */
    public final boolean mo28195o() {
        return this.selectedMapImage != null;
    }

    /* renamed from: p */
    public final void mo28196p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: q */
    public final void mo28197q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCategory(", "mapImage:");
        MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams = this.mapImage;
        if (mVImageReferenceWithPartialParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithPartialParams);
        }
        if (mo28186f()) {
            n.append(", ");
            n.append("categoryMetaData:");
            MVCategoryMetaData mVCategoryMetaData = this.categoryMetaData;
            if (mVCategoryMetaData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCategoryMetaData);
            }
        }
        n.append(", ");
        n.append("items:");
        List<MVCategoryItem> list = this.items;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("id:");
        String str = this.f26234id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("name:");
        String str2 = this.name;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo28187g()) {
            n.append(", ");
            n.append("clusteringImage:");
            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams2 = this.clusteringImage;
            if (mVImageReferenceWithPartialParams2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithPartialParams2);
            }
        }
        if (mo28193l()) {
            n.append(", ");
            n.append("minZoom:");
            n.append(this.minZoom);
        }
        if (mo28192k()) {
            n.append(", ");
            n.append("maxZoom:");
            n.append(this.maxZoom);
        }
        if (mo28195o()) {
            n.append(", ");
            n.append("selectedMapImage:");
            MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams3 = this.selectedMapImage;
            if (mVImageReferenceWithPartialParams3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithPartialParams3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
