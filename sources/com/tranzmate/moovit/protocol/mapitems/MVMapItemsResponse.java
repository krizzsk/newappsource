package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.support.StringUtils;
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

public class MVMapItemsResponse implements TBase<MVMapItemsResponse, _Fields>, Serializable, Cloneable, Comparable<MVMapItemsResponse> {

    /* renamed from: b */
    public static final C25113c f26329b = new C25113c("mapItems", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f26330c = new C25113c("tileX", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26331d = new C25113c("tileY", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f26332e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26333f;
    private byte __isset_bitfield = 0;
    public List<MVImageSetMapItems> mapItems;
    public int tileX;
    public int tileY;

    public enum _Fields implements C25085c {
        MAP_ITEMS(1, "mapItems"),
        TILE_X(2, "tileX"),
        TILE_Y(3, "tileY");
        
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
                return MAP_ITEMS;
            }
            if (i == 2) {
                return TILE_X;
            }
            if (i != 3) {
                return null;
            }
            return TILE_Y;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVMapItemsResponse$a */
    public static class C9110a extends C25239c<MVMapItemsResponse> {
        public C9110a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMapItemsResponse mVMapItemsResponse = (MVMapItemsResponse) tBase;
            mVMapItemsResponse.getClass();
            C25113c cVar = MVMapItemsResponse.f26329b;
            gVar.mo61687K();
            if (mVMapItemsResponse.mapItems != null) {
                gVar.mo61711x(MVMapItemsResponse.f26329b);
                gVar.mo61680D(new C25119e((byte) 12, mVMapItemsResponse.mapItems.size()));
                for (MVImageSetMapItems X0 : mVMapItemsResponse.mapItems) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMapItemsResponse.f26330c);
            gVar.mo61678B(mVMapItemsResponse.tileX);
            gVar.mo61712y();
            gVar.mo61711x(MVMapItemsResponse.f26331d);
            C16530d.m42020n(gVar, mVMapItemsResponse.tileY);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMapItemsResponse mVMapItemsResponse = (MVMapItemsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMapItemsResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVMapItemsResponse.tileY = gVar.mo61696i();
                            mVMapItemsResponse.mo28347j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVMapItemsResponse.tileX = gVar.mo61696i();
                        mVMapItemsResponse.mo28346i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVMapItemsResponse.mapItems = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVImageSetMapItems mVImageSetMapItems = new MVImageSetMapItems();
                        mVImageSetMapItems.mo25201C1(gVar);
                        mVMapItemsResponse.mapItems.add(mVImageSetMapItems);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVMapItemsResponse$b */
    public static class C9111b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9110a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVMapItemsResponse$c */
    public static class C9112c extends C25240d<MVMapItemsResponse> {
        public C9112c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMapItemsResponse mVMapItemsResponse = (MVMapItemsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMapItemsResponse.mo28342f()) {
                bitSet.set(0);
            }
            if (mVMapItemsResponse.mo28343g()) {
                bitSet.set(1);
            }
            if (mVMapItemsResponse.mo28344h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMapItemsResponse.mo28342f()) {
                jVar.mo61678B(mVMapItemsResponse.mapItems.size());
                for (MVImageSetMapItems X0 : mVMapItemsResponse.mapItems) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVMapItemsResponse.mo28343g()) {
                jVar.mo61678B(mVMapItemsResponse.tileX);
            }
            if (mVMapItemsResponse.mo28344h()) {
                jVar.mo61678B(mVMapItemsResponse.tileY);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMapItemsResponse mVMapItemsResponse = (MVMapItemsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVMapItemsResponse.mapItems = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVImageSetMapItems mVImageSetMapItems = new MVImageSetMapItems();
                    mVImageSetMapItems.mo25201C1(jVar);
                    mVMapItemsResponse.mapItems.add(mVImageSetMapItems);
                }
            }
            if (T.get(1)) {
                mVMapItemsResponse.tileX = jVar.mo61696i();
                mVMapItemsResponse.mo28346i();
            }
            if (T.get(2)) {
                mVMapItemsResponse.tileY = jVar.mo61696i();
                mVMapItemsResponse.mo28347j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVMapItemsResponse$d */
    public static class C9113d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9112c(0);
        }
    }

    static {
        new C17394d0("MVMapItemsResponse");
        HashMap hashMap = new HashMap();
        f26332e = hashMap;
        hashMap.put(C25239c.class, new C9111b());
        hashMap.put(C25240d.class, new C9113d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MAP_ITEMS, new FieldMetaData("mapItems", (byte) 3, new ListMetaData(new StructMetaData(MVImageSetMapItems.class))));
        enumMap.put(_Fields.TILE_X, new FieldMetaData("tileX", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TILE_Y, new FieldMetaData("tileY", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26333f = unmodifiableMap;
        FieldMetaData.m61947a(MVMapItemsResponse.class, unmodifiableMap);
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
        ((C25238b) f26332e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26332e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVMapItemsResponse mVMapItemsResponse = (MVMapItemsResponse) obj;
        if (!getClass().equals(mVMapItemsResponse.getClass())) {
            return getClass().getName().compareTo(mVMapItemsResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28342f()).compareTo(Boolean.valueOf(mVMapItemsResponse.mo28342f()));
        if (compareTo != 0 || ((mo28342f() && (compareTo = C25082a.m62844h(this.mapItems, mVMapItemsResponse.mapItems)) != 0) || (compareTo = Boolean.valueOf(mo28343g()).compareTo(Boolean.valueOf(mVMapItemsResponse.mo28343g()))) != 0 || ((mo28343g() && (compareTo = C25082a.m62839c(this.tileX, mVMapItemsResponse.tileX)) != 0) || (compareTo = Boolean.valueOf(mo28344h()).compareTo(Boolean.valueOf(mVMapItemsResponse.mo28344h()))) != 0))) {
            return compareTo;
        }
        if (!mo28344h() || (c = C25082a.m62839c(this.tileY, mVMapItemsResponse.tileY)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMapItemsResponse)) {
            return false;
        }
        MVMapItemsResponse mVMapItemsResponse = (MVMapItemsResponse) obj;
        boolean f = mo28342f();
        boolean f2 = mVMapItemsResponse.mo28342f();
        if (((!f && !f2) || (f && f2 && this.mapItems.equals(mVMapItemsResponse.mapItems))) && this.tileX == mVMapItemsResponse.tileX && this.tileY == mVMapItemsResponse.tileY) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28342f() {
        return this.mapItems != null;
    }

    /* renamed from: g */
    public final boolean mo28343g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo28344h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo28346i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo28347j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMapItemsResponse(", "mapItems:");
        List<MVImageSetMapItems> list = this.mapItems;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("tileX:");
        C0016g.m42z(n, this.tileX, ", ", "tileY:");
        return C13437d.m33707l(n, this.tileY, ")");
    }
}
