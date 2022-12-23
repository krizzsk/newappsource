package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVCategoryItem implements TBase<MVCategoryItem, _Fields>, Serializable, Cloneable, Comparable<MVCategoryItem> {

    /* renamed from: b */
    public static final C25113c f26236b = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26237c = new C25113c("itemMetaData", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f26238d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26239e;
    public MVItemMetaData itemMetaData;
    public MVLatLon location;
    private _Fields[] optionals = {_Fields.ITEM_META_DATA};

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        ITEM_META_DATA(2, "itemMetaData");
        
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
                return LOCATION;
            }
            if (i != 2) {
                return null;
            }
            return ITEM_META_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCategoryItem$a */
    public static class C9048a extends C25239c<MVCategoryItem> {
        public C9048a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCategoryItem mVCategoryItem = (MVCategoryItem) tBase;
            MVLatLon mVLatLon = mVCategoryItem.location;
            C25113c cVar = MVCategoryItem.f26236b;
            gVar.mo61687K();
            if (mVCategoryItem.location != null) {
                gVar.mo61711x(MVCategoryItem.f26236b);
                mVCategoryItem.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCategoryItem.itemMetaData != null && mVCategoryItem.mo28202f()) {
                gVar.mo61711x(MVCategoryItem.f26237c);
                mVCategoryItem.itemMetaData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCategoryItem mVCategoryItem = (MVCategoryItem) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVCategoryItem.location;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVItemMetaData mVItemMetaData = new MVItemMetaData();
                        mVCategoryItem.itemMetaData = mVItemMetaData;
                        mVItemMetaData.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLatLon mVLatLon2 = new MVLatLon();
                    mVCategoryItem.location = mVLatLon2;
                    mVLatLon2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCategoryItem$b */
    public static class C9049b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9048a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCategoryItem$c */
    public static class C9050c extends C25240d<MVCategoryItem> {
        public C9050c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCategoryItem mVCategoryItem = (MVCategoryItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCategoryItem.mo28203g()) {
                bitSet.set(0);
            }
            if (mVCategoryItem.mo28202f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCategoryItem.mo28203g()) {
                mVCategoryItem.location.mo25202X0(jVar);
            }
            if (mVCategoryItem.mo28202f()) {
                mVCategoryItem.itemMetaData.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCategoryItem mVCategoryItem = (MVCategoryItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVCategoryItem.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVItemMetaData mVItemMetaData = new MVItemMetaData();
                mVCategoryItem.itemMetaData = mVItemMetaData;
                mVItemMetaData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCategoryItem$d */
    public static class C9051d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9050c(0);
        }
    }

    static {
        new C17394d0("MVCategoryItem");
        HashMap hashMap = new HashMap();
        f26238d = hashMap;
        hashMap.put(C25239c.class, new C9049b());
        hashMap.put(C25240d.class, new C9051d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.ITEM_META_DATA, new FieldMetaData("itemMetaData", (byte) 2, new StructMetaData(MVItemMetaData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26239e = unmodifiableMap;
        FieldMetaData.m61947a(MVCategoryItem.class, unmodifiableMap);
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
        ((C25238b) f26238d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26238d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCategoryItem mVCategoryItem = (MVCategoryItem) obj;
        if (!getClass().equals(mVCategoryItem.getClass())) {
            return getClass().getName().compareTo(mVCategoryItem.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28203g()).compareTo(Boolean.valueOf(mVCategoryItem.mo28203g()));
        if (compareTo2 != 0 || ((mo28203g() && (compareTo2 = this.location.compareTo(mVCategoryItem.location)) != 0) || (compareTo2 = Boolean.valueOf(mo28202f()).compareTo(Boolean.valueOf(mVCategoryItem.mo28202f()))) != 0)) {
            return compareTo2;
        }
        if (!mo28202f() || (compareTo = this.itemMetaData.compareTo(mVCategoryItem.itemMetaData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof com.tranzmate.moovit.protocol.mapitems.MVCategoryItem
            r2 = 1
            if (r1 == 0) goto L_0x0058
            com.tranzmate.moovit.protocol.mapitems.MVCategoryItem r6 = (com.tranzmate.moovit.protocol.mapitems.MVCategoryItem) r6
            boolean r1 = r5.mo28203g()
            boolean r3 = r6.mo28203g()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0027
        L_0x0017:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x001c
            goto L_0x0058
        L_0x001c:
            com.tranzmate.moovit.protocol.common.MVLatLon r1 = r5.location
            com.tranzmate.moovit.protocol.common.MVLatLon r3 = r6.location
            boolean r1 = r1.mo26290a(r3)
            if (r1 != 0) goto L_0x0027
            goto L_0x0058
        L_0x0027:
            boolean r1 = r5.mo28202f()
            boolean r3 = r6.mo28202f()
            if (r1 != 0) goto L_0x0033
            if (r3 == 0) goto L_0x0057
        L_0x0033:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x0038
            goto L_0x0058
        L_0x0038:
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData r1 = r5.itemMetaData
            com.tranzmate.moovit.protocol.mapitems.MVItemMetaData r6 = r6.itemMetaData
            if (r6 == 0) goto L_0x0050
            F r3 = r1.setField_
            F r4 = r6.setField_
            if (r3 != r4) goto L_0x0053
            java.lang.Object r1 = r1.value_
            java.lang.Object r6 = r6.value_
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0053
            r6 = 1
            goto L_0x0054
        L_0x0050:
            r1.getClass()
        L_0x0053:
            r6 = 0
        L_0x0054:
            if (r6 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.mapitems.MVCategoryItem.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo28202f() {
        return this.itemMetaData != null;
    }

    /* renamed from: g */
    public final boolean mo28203g() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCategoryItem(", "location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        if (mo28202f()) {
            n.append(", ");
            n.append("itemMetaData:");
            MVItemMetaData mVItemMetaData = this.itemMetaData;
            if (mVItemMetaData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVItemMetaData);
            }
        }
        n.append(")");
        return n.toString();
    }
}
