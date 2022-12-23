package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodPassengerScreen implements TBase<MVTodPassengerScreen, _Fields>, Serializable, Cloneable, Comparable<MVTodPassengerScreen> {

    /* renamed from: b */
    public static final C25113c f29513b = new C25113c("screenId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29514c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29515d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29516e = new C25113c("lottieImageUrl", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f29517f = new C25113c("imageSubtitle", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f29518g = new C25113c("listItemsTitle", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f29519h = new C25113c("listItems", (byte) 15, 7);

    /* renamed from: i */
    public static final C25113c f29520i = new C25113c("actionId", (byte) 11, 8);

    /* renamed from: j */
    public static final HashMap f29521j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f29522k;
    public String actionId;
    public String imageSubtitle;
    public List<MVTodPassengerListItemSpec> listItems;
    public String listItemsTitle;
    public String lottieImageUrl;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.SUBTITLE, _Fields.LOTTIE_IMAGE_URL, _Fields.IMAGE_SUBTITLE, _Fields.LIST_ITEMS_TITLE, _Fields.LIST_ITEMS, _Fields.ACTION_ID};
    public String screenId;
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        SCREEN_ID(1, "screenId"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        LOTTIE_IMAGE_URL(4, "lottieImageUrl"),
        IMAGE_SUBTITLE(5, "imageSubtitle"),
        LIST_ITEMS_TITLE(6, "listItemsTitle"),
        LIST_ITEMS(7, "listItems"),
        ACTION_ID(8, "actionId");
        
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
                    return SCREEN_ID;
                case 2:
                    return TITLE;
                case 3:
                    return SUBTITLE;
                case 4:
                    return LOTTIE_IMAGE_URL;
                case 5:
                    return IMAGE_SUBTITLE;
                case 6:
                    return LIST_ITEMS_TITLE;
                case 7:
                    return LIST_ITEMS;
                case 8:
                    return ACTION_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerScreen$a */
    public static class C11295a extends C25239c<MVTodPassengerScreen> {
        public C11295a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerScreen mVTodPassengerScreen = (MVTodPassengerScreen) tBase;
            mVTodPassengerScreen.getClass();
            C25113c cVar = MVTodPassengerScreen.f29513b;
            gVar.mo61687K();
            if (mVTodPassengerScreen.screenId != null) {
                gVar.mo61711x(MVTodPassengerScreen.f29513b);
                gVar.mo61686J(mVTodPassengerScreen.screenId);
                gVar.mo61712y();
            }
            if (mVTodPassengerScreen.title != null && mVTodPassengerScreen.mo33630m()) {
                gVar.mo61711x(MVTodPassengerScreen.f29514c);
                gVar.mo61686J(mVTodPassengerScreen.title);
                gVar.mo61712y();
            }
            if (mVTodPassengerScreen.subtitle != null && mVTodPassengerScreen.mo33629l()) {
                gVar.mo61711x(MVTodPassengerScreen.f29515d);
                gVar.mo61686J(mVTodPassengerScreen.subtitle);
                gVar.mo61712y();
            }
            if (mVTodPassengerScreen.lottieImageUrl != null && mVTodPassengerScreen.mo33627j()) {
                gVar.mo61711x(MVTodPassengerScreen.f29516e);
                gVar.mo61686J(mVTodPassengerScreen.lottieImageUrl);
                gVar.mo61712y();
            }
            if (mVTodPassengerScreen.imageSubtitle != null && mVTodPassengerScreen.mo33623g()) {
                gVar.mo61711x(MVTodPassengerScreen.f29517f);
                gVar.mo61686J(mVTodPassengerScreen.imageSubtitle);
                gVar.mo61712y();
            }
            if (mVTodPassengerScreen.listItemsTitle != null && mVTodPassengerScreen.mo33626i()) {
                gVar.mo61711x(MVTodPassengerScreen.f29518g);
                gVar.mo61686J(mVTodPassengerScreen.listItemsTitle);
                gVar.mo61712y();
            }
            if (mVTodPassengerScreen.listItems != null && mVTodPassengerScreen.mo33624h()) {
                gVar.mo61711x(MVTodPassengerScreen.f29519h);
                gVar.mo61680D(new C25119e((byte) 12, mVTodPassengerScreen.listItems.size()));
                for (MVTodPassengerListItemSpec X0 : mVTodPassengerScreen.listItems) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodPassengerScreen.actionId != null && mVTodPassengerScreen.mo33622f()) {
                gVar.mo61711x(MVTodPassengerScreen.f29520i);
                gVar.mo61686J(mVTodPassengerScreen.actionId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerScreen mVTodPassengerScreen = (MVTodPassengerScreen) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodPassengerScreen.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodPassengerScreen.screenId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodPassengerScreen.title = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodPassengerScreen.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodPassengerScreen.lottieImageUrl = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodPassengerScreen.imageSubtitle = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodPassengerScreen.listItemsTitle = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVTodPassengerScreen.listItems = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVTodPassengerListItemSpec mVTodPassengerListItemSpec = new MVTodPassengerListItemSpec();
                                mVTodPassengerListItemSpec.mo25201C1(gVar);
                                mVTodPassengerScreen.listItems.add(mVTodPassengerListItemSpec);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodPassengerScreen.actionId = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerScreen$b */
    public static class C11296b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11295a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerScreen$c */
    public static class C11297c extends C25240d<MVTodPassengerScreen> {
        public C11297c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerScreen mVTodPassengerScreen = (MVTodPassengerScreen) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodPassengerScreen.mo33628k()) {
                bitSet.set(0);
            }
            if (mVTodPassengerScreen.mo33630m()) {
                bitSet.set(1);
            }
            if (mVTodPassengerScreen.mo33629l()) {
                bitSet.set(2);
            }
            if (mVTodPassengerScreen.mo33627j()) {
                bitSet.set(3);
            }
            if (mVTodPassengerScreen.mo33623g()) {
                bitSet.set(4);
            }
            if (mVTodPassengerScreen.mo33626i()) {
                bitSet.set(5);
            }
            if (mVTodPassengerScreen.mo33624h()) {
                bitSet.set(6);
            }
            if (mVTodPassengerScreen.mo33622f()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVTodPassengerScreen.mo33628k()) {
                jVar.mo61686J(mVTodPassengerScreen.screenId);
            }
            if (mVTodPassengerScreen.mo33630m()) {
                jVar.mo61686J(mVTodPassengerScreen.title);
            }
            if (mVTodPassengerScreen.mo33629l()) {
                jVar.mo61686J(mVTodPassengerScreen.subtitle);
            }
            if (mVTodPassengerScreen.mo33627j()) {
                jVar.mo61686J(mVTodPassengerScreen.lottieImageUrl);
            }
            if (mVTodPassengerScreen.mo33623g()) {
                jVar.mo61686J(mVTodPassengerScreen.imageSubtitle);
            }
            if (mVTodPassengerScreen.mo33626i()) {
                jVar.mo61686J(mVTodPassengerScreen.listItemsTitle);
            }
            if (mVTodPassengerScreen.mo33624h()) {
                jVar.mo61678B(mVTodPassengerScreen.listItems.size());
                for (MVTodPassengerListItemSpec X0 : mVTodPassengerScreen.listItems) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTodPassengerScreen.mo33622f()) {
                jVar.mo61686J(mVTodPassengerScreen.actionId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerScreen mVTodPassengerScreen = (MVTodPassengerScreen) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVTodPassengerScreen.screenId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTodPassengerScreen.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTodPassengerScreen.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTodPassengerScreen.lottieImageUrl = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVTodPassengerScreen.imageSubtitle = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVTodPassengerScreen.listItemsTitle = jVar.mo61704q();
            }
            if (T.get(6)) {
                int i = jVar.mo61696i();
                mVTodPassengerScreen.listItems = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodPassengerListItemSpec mVTodPassengerListItemSpec = new MVTodPassengerListItemSpec();
                    mVTodPassengerListItemSpec.mo25201C1(jVar);
                    mVTodPassengerScreen.listItems.add(mVTodPassengerListItemSpec);
                }
            }
            if (T.get(7)) {
                mVTodPassengerScreen.actionId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerScreen$d */
    public static class C11298d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11297c(0);
        }
    }

    static {
        new C17394d0("MVTodPassengerScreen");
        HashMap hashMap = new HashMap();
        f29521j = hashMap;
        hashMap.put(C25239c.class, new C11296b());
        hashMap.put(C25240d.class, new C11298d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SCREEN_ID, new FieldMetaData("screenId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOTTIE_IMAGE_URL, new FieldMetaData("lottieImageUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE_SUBTITLE, new FieldMetaData("imageSubtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LIST_ITEMS_TITLE, new FieldMetaData("listItemsTitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LIST_ITEMS, new FieldMetaData("listItems", (byte) 2, new ListMetaData(new StructMetaData(MVTodPassengerListItemSpec.class))));
        enumMap.put(_Fields.ACTION_ID, new FieldMetaData("actionId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29522k = unmodifiableMap;
        FieldMetaData.m61947a(MVTodPassengerScreen.class, unmodifiableMap);
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
        ((C25238b) f29521j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29521j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33619a(MVTodPassengerScreen mVTodPassengerScreen) {
        if (mVTodPassengerScreen == null) {
            return false;
        }
        boolean k = mo33628k();
        boolean k2 = mVTodPassengerScreen.mo33628k();
        if ((k || k2) && (!k || !k2 || !this.screenId.equals(mVTodPassengerScreen.screenId))) {
            return false;
        }
        boolean m = mo33630m();
        boolean m2 = mVTodPassengerScreen.mo33630m();
        if ((m || m2) && (!m || !m2 || !this.title.equals(mVTodPassengerScreen.title))) {
            return false;
        }
        boolean l = mo33629l();
        boolean l2 = mVTodPassengerScreen.mo33629l();
        if ((l || l2) && (!l || !l2 || !this.subtitle.equals(mVTodPassengerScreen.subtitle))) {
            return false;
        }
        boolean j = mo33627j();
        boolean j2 = mVTodPassengerScreen.mo33627j();
        if ((j || j2) && (!j || !j2 || !this.lottieImageUrl.equals(mVTodPassengerScreen.lottieImageUrl))) {
            return false;
        }
        boolean g = mo33623g();
        boolean g2 = mVTodPassengerScreen.mo33623g();
        if ((g || g2) && (!g || !g2 || !this.imageSubtitle.equals(mVTodPassengerScreen.imageSubtitle))) {
            return false;
        }
        boolean i = mo33626i();
        boolean i2 = mVTodPassengerScreen.mo33626i();
        if ((i || i2) && (!i || !i2 || !this.listItemsTitle.equals(mVTodPassengerScreen.listItemsTitle))) {
            return false;
        }
        boolean h = mo33624h();
        boolean h2 = mVTodPassengerScreen.mo33624h();
        if ((h || h2) && (!h || !h2 || !this.listItems.equals(mVTodPassengerScreen.listItems))) {
            return false;
        }
        boolean f = mo33622f();
        boolean f2 = mVTodPassengerScreen.mo33622f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.actionId.equals(mVTodPassengerScreen.actionId)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodPassengerScreen mVTodPassengerScreen = (MVTodPassengerScreen) obj;
        if (!getClass().equals(mVTodPassengerScreen.getClass())) {
            return getClass().getName().compareTo(mVTodPassengerScreen.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33628k()).compareTo(Boolean.valueOf(mVTodPassengerScreen.mo33628k()));
        if (compareTo2 != 0 || ((mo33628k() && (compareTo2 = this.screenId.compareTo(mVTodPassengerScreen.screenId)) != 0) || (compareTo2 = Boolean.valueOf(mo33630m()).compareTo(Boolean.valueOf(mVTodPassengerScreen.mo33630m()))) != 0 || ((mo33630m() && (compareTo2 = this.title.compareTo(mVTodPassengerScreen.title)) != 0) || (compareTo2 = Boolean.valueOf(mo33629l()).compareTo(Boolean.valueOf(mVTodPassengerScreen.mo33629l()))) != 0 || ((mo33629l() && (compareTo2 = this.subtitle.compareTo(mVTodPassengerScreen.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo33627j()).compareTo(Boolean.valueOf(mVTodPassengerScreen.mo33627j()))) != 0 || ((mo33627j() && (compareTo2 = this.lottieImageUrl.compareTo(mVTodPassengerScreen.lottieImageUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo33623g()).compareTo(Boolean.valueOf(mVTodPassengerScreen.mo33623g()))) != 0 || ((mo33623g() && (compareTo2 = this.imageSubtitle.compareTo(mVTodPassengerScreen.imageSubtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo33626i()).compareTo(Boolean.valueOf(mVTodPassengerScreen.mo33626i()))) != 0 || ((mo33626i() && (compareTo2 = this.listItemsTitle.compareTo(mVTodPassengerScreen.listItemsTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo33624h()).compareTo(Boolean.valueOf(mVTodPassengerScreen.mo33624h()))) != 0 || ((mo33624h() && (compareTo2 = C25082a.m62844h(this.listItems, mVTodPassengerScreen.listItems)) != 0) || (compareTo2 = Boolean.valueOf(mo33622f()).compareTo(Boolean.valueOf(mVTodPassengerScreen.mo33622f()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo33622f() || (compareTo = this.actionId.compareTo(mVTodPassengerScreen.actionId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodPassengerScreen)) {
            return mo33619a((MVTodPassengerScreen) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33622f() {
        return this.actionId != null;
    }

    /* renamed from: g */
    public final boolean mo33623g() {
        return this.imageSubtitle != null;
    }

    /* renamed from: h */
    public final boolean mo33624h() {
        return this.listItems != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33626i() {
        return this.listItemsTitle != null;
    }

    /* renamed from: j */
    public final boolean mo33627j() {
        return this.lottieImageUrl != null;
    }

    /* renamed from: k */
    public final boolean mo33628k() {
        return this.screenId != null;
    }

    /* renamed from: l */
    public final boolean mo33629l() {
        return this.subtitle != null;
    }

    /* renamed from: m */
    public final boolean mo33630m() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodPassengerScreen(", "screenId:");
        String str = this.screenId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33630m()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo33629l()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo33627j()) {
            n.append(", ");
            n.append("lottieImageUrl:");
            String str4 = this.lottieImageUrl;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo33623g()) {
            n.append(", ");
            n.append("imageSubtitle:");
            String str5 = this.imageSubtitle;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        if (mo33626i()) {
            n.append(", ");
            n.append("listItemsTitle:");
            String str6 = this.listItemsTitle;
            if (str6 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str6);
            }
        }
        if (mo33624h()) {
            n.append(", ");
            n.append("listItems:");
            List<MVTodPassengerListItemSpec> list = this.listItems;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo33622f()) {
            n.append(", ");
            n.append("actionId:");
            String str7 = this.actionId;
            if (str7 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str7);
            }
        }
        n.append(")");
        return n.toString();
    }
}
