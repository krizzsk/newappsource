package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
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

public class MVImageSetMapItems implements TBase<MVImageSetMapItems, _Fields>, Serializable, Cloneable, Comparable<MVImageSetMapItems> {

    /* renamed from: b */
    public static final C25113c f26306b = new C25113c("imageRefSet", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26307c = new C25113c("mapItems", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f26308d = new C25113c("itemLocations", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f26309e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26310f;
    public MVImageReferenceSet imageRefSet;
    public ByteBuffer itemLocations;
    public List<MVMapItem> mapItems;

    public enum _Fields implements C25085c {
        IMAGE_REF_SET(1, "imageRefSet"),
        MAP_ITEMS(2, "mapItems"),
        ITEM_LOCATIONS(3, "itemLocations");
        
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
            if (i == 1) {
                return IMAGE_REF_SET;
            }
            if (i == 2) {
                return MAP_ITEMS;
            }
            if (i != 3) {
                return null;
            }
            return ITEM_LOCATIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems$a */
    public static class C9097a extends C25239c<MVImageSetMapItems> {
        public C9097a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageSetMapItems mVImageSetMapItems = (MVImageSetMapItems) tBase;
            MVImageReferenceSet mVImageReferenceSet = mVImageSetMapItems.imageRefSet;
            C25113c cVar = MVImageSetMapItems.f26306b;
            gVar.mo61687K();
            if (mVImageSetMapItems.imageRefSet != null) {
                gVar.mo61711x(MVImageSetMapItems.f26306b);
                mVImageSetMapItems.imageRefSet.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVImageSetMapItems.mapItems != null) {
                gVar.mo61711x(MVImageSetMapItems.f26307c);
                gVar.mo61680D(new C25119e((byte) 12, mVImageSetMapItems.mapItems.size()));
                for (MVMapItem X0 : mVImageSetMapItems.mapItems) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVImageSetMapItems.itemLocations != null) {
                gVar.mo61711x(MVImageSetMapItems.f26308d);
                gVar.mo61707t(mVImageSetMapItems.itemLocations);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageSetMapItems mVImageSetMapItems = (MVImageSetMapItems) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceSet mVImageReferenceSet = mVImageSetMapItems.imageRefSet;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVImageSetMapItems.itemLocations = gVar.mo61689b();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVImageSetMapItems.mapItems = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVMapItem mVMapItem = new MVMapItem();
                            mVMapItem.mo25201C1(gVar);
                            mVImageSetMapItems.mapItems.add(mVMapItem);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceSet mVImageReferenceSet2 = new MVImageReferenceSet();
                    mVImageSetMapItems.imageRefSet = mVImageReferenceSet2;
                    mVImageReferenceSet2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems$b */
    public static class C9098b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9097a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems$c */
    public static class C9099c extends C25240d<MVImageSetMapItems> {
        public C9099c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageSetMapItems mVImageSetMapItems = (MVImageSetMapItems) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVImageSetMapItems.mo28314f()) {
                bitSet.set(0);
            }
            if (mVImageSetMapItems.mo28316h()) {
                bitSet.set(1);
            }
            if (mVImageSetMapItems.mo28315g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVImageSetMapItems.mo28314f()) {
                mVImageSetMapItems.imageRefSet.mo25202X0(jVar);
            }
            if (mVImageSetMapItems.mo28316h()) {
                jVar.mo61678B(mVImageSetMapItems.mapItems.size());
                for (MVMapItem X0 : mVImageSetMapItems.mapItems) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVImageSetMapItems.mo28315g()) {
                jVar.mo61707t(mVImageSetMapItems.itemLocations);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageSetMapItems mVImageSetMapItems = (MVImageSetMapItems) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVImageReferenceSet mVImageReferenceSet = new MVImageReferenceSet();
                mVImageSetMapItems.imageRefSet = mVImageReferenceSet;
                mVImageReferenceSet.mo25201C1(jVar);
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVImageSetMapItems.mapItems = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVMapItem mVMapItem = new MVMapItem();
                    mVMapItem.mo25201C1(jVar);
                    mVImageSetMapItems.mapItems.add(mVMapItem);
                }
            }
            if (T.get(2)) {
                mVImageSetMapItems.itemLocations = jVar.mo61689b();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems$d */
    public static class C9100d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9099c(0);
        }
    }

    static {
        new C17394d0("MVImageSetMapItems");
        HashMap hashMap = new HashMap();
        f26309e = hashMap;
        hashMap.put(C25239c.class, new C9098b());
        hashMap.put(C25240d.class, new C9100d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE_REF_SET, new FieldMetaData("imageRefSet", (byte) 3, new StructMetaData(MVImageReferenceSet.class)));
        enumMap.put(_Fields.MAP_ITEMS, new FieldMetaData("mapItems", (byte) 3, new ListMetaData(new StructMetaData(MVMapItem.class))));
        enumMap.put(_Fields.ITEM_LOCATIONS, new FieldMetaData("itemLocations", (byte) 3, new FieldValueMetaData((byte) 11, true)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26310f = unmodifiableMap;
        FieldMetaData.m61947a(MVImageSetMapItems.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f26309e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26309e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVImageSetMapItems mVImageSetMapItems = (MVImageSetMapItems) obj;
        if (!getClass().equals(mVImageSetMapItems.getClass())) {
            return getClass().getName().compareTo(mVImageSetMapItems.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28314f()).compareTo(Boolean.valueOf(mVImageSetMapItems.mo28314f()));
        if (compareTo2 != 0 || ((mo28314f() && (compareTo2 = this.imageRefSet.compareTo(mVImageSetMapItems.imageRefSet)) != 0) || (compareTo2 = Boolean.valueOf(mo28316h()).compareTo(Boolean.valueOf(mVImageSetMapItems.mo28316h()))) != 0 || ((mo28316h() && (compareTo2 = C25082a.m62844h(this.mapItems, mVImageSetMapItems.mapItems)) != 0) || (compareTo2 = Boolean.valueOf(mo28315g()).compareTo(Boolean.valueOf(mVImageSetMapItems.mo28315g()))) != 0))) {
            return compareTo2;
        }
        if (!mo28315g() || (compareTo = this.itemLocations.compareTo(mVImageSetMapItems.itemLocations)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVImageSetMapItems)) {
            return false;
        }
        MVImageSetMapItems mVImageSetMapItems = (MVImageSetMapItems) obj;
        boolean f = mo28314f();
        boolean f2 = mVImageSetMapItems.mo28314f();
        if ((f || f2) && (!f || !f2 || !this.imageRefSet.mo26214a(mVImageSetMapItems.imageRefSet))) {
            return false;
        }
        boolean h = mo28316h();
        boolean h2 = mVImageSetMapItems.mo28316h();
        if ((h || h2) && (!h || !h2 || !this.mapItems.equals(mVImageSetMapItems.mapItems))) {
            return false;
        }
        boolean g = mo28315g();
        boolean g2 = mVImageSetMapItems.mo28315g();
        if ((g || g2) && (!g || !g2 || !this.itemLocations.equals(mVImageSetMapItems.itemLocations))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28314f() {
        return this.imageRefSet != null;
    }

    /* renamed from: g */
    public final boolean mo28315g() {
        return this.itemLocations != null;
    }

    /* renamed from: h */
    public final boolean mo28316h() {
        return this.mapItems != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVImageSetMapItems(", "imageRefSet:");
        MVImageReferenceSet mVImageReferenceSet = this.imageRefSet;
        if (mVImageReferenceSet == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceSet);
        }
        n.append(", ");
        n.append("mapItems:");
        List<MVMapItem> list = this.mapItems;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("itemLocations:");
        ByteBuffer byteBuffer = this.itemLocations;
        if (byteBuffer == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            C25082a.m62851o(byteBuffer, n);
        }
        n.append(")");
        return n.toString();
    }
}
