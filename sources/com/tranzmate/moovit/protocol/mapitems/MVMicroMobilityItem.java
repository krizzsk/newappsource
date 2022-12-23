package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVAccessory;
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

public class MVMicroMobilityItem implements TBase<MVMicroMobilityItem, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityItem> {

    /* renamed from: b */
    public static final C25113c f26334b = new C25113c("itemId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26335c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26336d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26337e = new C25113c("accessoryInfo", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f26338f = new C25113c("imageAdditonalParam", (byte) 15, 5);

    /* renamed from: g */
    public static final HashMap f26339g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26340h;
    public List<MVAccessory> accessoryInfo;
    public List<String> imageAdditonalParam;
    public String itemId;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.SUBTITLE, _Fields.ACCESSORY_INFO, _Fields.IMAGE_ADDITONAL_PARAM};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        ITEM_ID(1, "itemId"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        ACCESSORY_INFO(4, "accessoryInfo"),
        IMAGE_ADDITONAL_PARAM(5, "imageAdditonalParam");
        
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
                return ITEM_ID;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i == 3) {
                return SUBTITLE;
            }
            if (i == 4) {
                return ACCESSORY_INFO;
            }
            if (i != 5) {
                return null;
            }
            return IMAGE_ADDITONAL_PARAM;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVMicroMobilityItem$a */
    public static class C9114a extends C25239c<MVMicroMobilityItem> {
        public C9114a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItem mVMicroMobilityItem = (MVMicroMobilityItem) tBase;
            mVMicroMobilityItem.getClass();
            C25113c cVar = MVMicroMobilityItem.f26334b;
            gVar.mo61687K();
            if (mVMicroMobilityItem.itemId != null) {
                gVar.mo61711x(MVMicroMobilityItem.f26334b);
                gVar.mo61686J(mVMicroMobilityItem.itemId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItem.title != null && mVMicroMobilityItem.mo28357j()) {
                gVar.mo61711x(MVMicroMobilityItem.f26335c);
                gVar.mo61686J(mVMicroMobilityItem.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItem.subtitle != null && mVMicroMobilityItem.mo28356i()) {
                gVar.mo61711x(MVMicroMobilityItem.f26336d);
                gVar.mo61686J(mVMicroMobilityItem.subtitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityItem.accessoryInfo != null && mVMicroMobilityItem.mo28352f()) {
                gVar.mo61711x(MVMicroMobilityItem.f26337e);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityItem.accessoryInfo.size()));
                for (MVAccessory X0 : mVMicroMobilityItem.accessoryInfo) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMicroMobilityItem.imageAdditonalParam != null && mVMicroMobilityItem.mo28353g()) {
                gVar.mo61711x(MVMicroMobilityItem.f26338f);
                gVar.mo61680D(new C25119e((byte) 11, mVMicroMobilityItem.imageAdditonalParam.size()));
                for (String J : mVMicroMobilityItem.imageAdditonalParam) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItem mVMicroMobilityItem = (MVMicroMobilityItem) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityItem.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            int i = 0;
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 15) {
                                    C25119e k = gVar.mo61698k();
                                    mVMicroMobilityItem.imageAdditonalParam = new ArrayList(k.f63395b);
                                    while (i < k.f63395b) {
                                        mVMicroMobilityItem.imageAdditonalParam.add(gVar.mo61704q());
                                        i++;
                                    }
                                    gVar.mo61699l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 15) {
                                C25119e k2 = gVar.mo61698k();
                                mVMicroMobilityItem.accessoryInfo = new ArrayList(k2.f63395b);
                                while (i < k2.f63395b) {
                                    MVAccessory mVAccessory = new MVAccessory();
                                    mVAccessory.mo25201C1(gVar);
                                    mVMicroMobilityItem.accessoryInfo.add(mVAccessory);
                                    i++;
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVMicroMobilityItem.subtitle = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityItem.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityItem.itemId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVMicroMobilityItem$b */
    public static class C9115b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9114a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVMicroMobilityItem$c */
    public static class C9116c extends C25240d<MVMicroMobilityItem> {
        public C9116c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItem mVMicroMobilityItem = (MVMicroMobilityItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityItem.mo28354h()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityItem.mo28357j()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityItem.mo28356i()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityItem.mo28352f()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityItem.mo28353g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMicroMobilityItem.mo28354h()) {
                jVar.mo61686J(mVMicroMobilityItem.itemId);
            }
            if (mVMicroMobilityItem.mo28357j()) {
                jVar.mo61686J(mVMicroMobilityItem.title);
            }
            if (mVMicroMobilityItem.mo28356i()) {
                jVar.mo61686J(mVMicroMobilityItem.subtitle);
            }
            if (mVMicroMobilityItem.mo28352f()) {
                jVar.mo61678B(mVMicroMobilityItem.accessoryInfo.size());
                for (MVAccessory X0 : mVMicroMobilityItem.accessoryInfo) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVMicroMobilityItem.mo28353g()) {
                jVar.mo61678B(mVMicroMobilityItem.imageAdditonalParam.size());
                for (String J : mVMicroMobilityItem.imageAdditonalParam) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityItem mVMicroMobilityItem = (MVMicroMobilityItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVMicroMobilityItem.itemId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityItem.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityItem.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVMicroMobilityItem.accessoryInfo = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAccessory mVAccessory = new MVAccessory();
                    mVAccessory.mo25201C1(jVar);
                    mVMicroMobilityItem.accessoryInfo.add(mVAccessory);
                }
            }
            if (T.get(4)) {
                int i3 = jVar.mo61696i();
                mVMicroMobilityItem.imageAdditonalParam = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVMicroMobilityItem.imageAdditonalParam.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVMicroMobilityItem$d */
    public static class C9117d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9116c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityItem");
        HashMap hashMap = new HashMap();
        f26339g = hashMap;
        hashMap.put(C25239c.class, new C9115b());
        hashMap.put(C25240d.class, new C9117d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ITEM_ID, new FieldMetaData("itemId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACCESSORY_INFO, new FieldMetaData("accessoryInfo", (byte) 2, new ListMetaData(new StructMetaData(MVAccessory.class))));
        enumMap.put(_Fields.IMAGE_ADDITONAL_PARAM, new FieldMetaData("imageAdditonalParam", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26340h = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityItem.class, unmodifiableMap);
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
        ((C25238b) f26339g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26339g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVMicroMobilityItem mVMicroMobilityItem = (MVMicroMobilityItem) obj;
        if (!getClass().equals(mVMicroMobilityItem.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityItem.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28354h()).compareTo(Boolean.valueOf(mVMicroMobilityItem.mo28354h()));
        if (compareTo != 0 || ((mo28354h() && (compareTo = this.itemId.compareTo(mVMicroMobilityItem.itemId)) != 0) || (compareTo = Boolean.valueOf(mo28357j()).compareTo(Boolean.valueOf(mVMicroMobilityItem.mo28357j()))) != 0 || ((mo28357j() && (compareTo = this.title.compareTo(mVMicroMobilityItem.title)) != 0) || (compareTo = Boolean.valueOf(mo28356i()).compareTo(Boolean.valueOf(mVMicroMobilityItem.mo28356i()))) != 0 || ((mo28356i() && (compareTo = this.subtitle.compareTo(mVMicroMobilityItem.subtitle)) != 0) || (compareTo = Boolean.valueOf(mo28352f()).compareTo(Boolean.valueOf(mVMicroMobilityItem.mo28352f()))) != 0 || ((mo28352f() && (compareTo = C25082a.m62844h(this.accessoryInfo, mVMicroMobilityItem.accessoryInfo)) != 0) || (compareTo = Boolean.valueOf(mo28353g()).compareTo(Boolean.valueOf(mVMicroMobilityItem.mo28353g()))) != 0))))) {
            return compareTo;
        }
        if (!mo28353g() || (h = C25082a.m62844h(this.imageAdditonalParam, mVMicroMobilityItem.imageAdditonalParam)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityItem)) {
            return false;
        }
        MVMicroMobilityItem mVMicroMobilityItem = (MVMicroMobilityItem) obj;
        boolean h = mo28354h();
        boolean h2 = mVMicroMobilityItem.mo28354h();
        if ((h || h2) && (!h || !h2 || !this.itemId.equals(mVMicroMobilityItem.itemId))) {
            return false;
        }
        boolean j = mo28357j();
        boolean j2 = mVMicroMobilityItem.mo28357j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVMicroMobilityItem.title))) {
            return false;
        }
        boolean i = mo28356i();
        boolean i2 = mVMicroMobilityItem.mo28356i();
        if ((i || i2) && (!i || !i2 || !this.subtitle.equals(mVMicroMobilityItem.subtitle))) {
            return false;
        }
        boolean f = mo28352f();
        boolean f2 = mVMicroMobilityItem.mo28352f();
        if ((f || f2) && (!f || !f2 || !this.accessoryInfo.equals(mVMicroMobilityItem.accessoryInfo))) {
            return false;
        }
        boolean g = mo28353g();
        boolean g2 = mVMicroMobilityItem.mo28353g();
        if ((g || g2) && (!g || !g2 || !this.imageAdditonalParam.equals(mVMicroMobilityItem.imageAdditonalParam))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28352f() {
        return this.accessoryInfo != null;
    }

    /* renamed from: g */
    public final boolean mo28353g() {
        return this.imageAdditonalParam != null;
    }

    /* renamed from: h */
    public final boolean mo28354h() {
        return this.itemId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28356i() {
        return this.subtitle != null;
    }

    /* renamed from: j */
    public final boolean mo28357j() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityItem(", "itemId:");
        String str = this.itemId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo28357j()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo28356i()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo28352f()) {
            n.append(", ");
            n.append("accessoryInfo:");
            List<MVAccessory> list = this.accessoryInfo;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo28353g()) {
            n.append(", ");
            n.append("imageAdditonalParam:");
            List<String> list2 = this.imageAdditonalParam;
            if (list2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
