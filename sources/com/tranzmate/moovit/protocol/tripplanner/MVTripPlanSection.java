package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVTripPlanSection implements TBase<MVTripPlanSection, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanSection> {

    /* renamed from: b */
    public static final C25113c f30153b = new C25113c("name", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30154c = new C25113c("sectionId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30155d = new C25113c("maxItemsToDisplay", (byte) 3, 3);

    /* renamed from: e */
    public static final C25113c f30156e = new C25113c("sectionType", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30157f = new C25113c("sortType", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f30158g = new C25113c("branding", (byte) 12, 6);

    /* renamed from: h */
    public static final HashMap f30159h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f30160i;
    private byte __isset_bitfield = 0;
    public MVTripPlanSectionBranding branding;
    public byte maxItemsToDisplay;
    public String name;
    private _Fields[] optionals = {_Fields.MAX_ITEMS_TO_DISPLAY, _Fields.SORT_TYPE, _Fields.BRANDING};
    public int sectionId;
    public MVSectionType sectionType;
    public MVSectionSortType sortType;

    public enum _Fields implements C25085c {
        NAME(1, "name"),
        SECTION_ID(2, "sectionId"),
        MAX_ITEMS_TO_DISPLAY(3, "maxItemsToDisplay"),
        SECTION_TYPE(4, "sectionType"),
        SORT_TYPE(5, "sortType"),
        BRANDING(6, "branding");
        
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
                    return NAME;
                case 2:
                    return SECTION_ID;
                case 3:
                    return MAX_ITEMS_TO_DISPLAY;
                case 4:
                    return SECTION_TYPE;
                case 5:
                    return SORT_TYPE;
                case 6:
                    return BRANDING;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSection$a */
    public static class C11664a extends C25239c<MVTripPlanSection> {
        public C11664a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSection mVTripPlanSection = (MVTripPlanSection) tBase;
            mVTripPlanSection.getClass();
            C25113c cVar = MVTripPlanSection.f30153b;
            gVar.mo61687K();
            if (mVTripPlanSection.name != null) {
                gVar.mo61711x(MVTripPlanSection.f30153b);
                gVar.mo61686J(mVTripPlanSection.name);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTripPlanSection.f30154c);
            gVar.mo61678B(mVTripPlanSection.sectionId);
            gVar.mo61712y();
            if (mVTripPlanSection.mo34703g()) {
                gVar.mo61711x(MVTripPlanSection.f30155d);
                gVar.mo61709v(mVTripPlanSection.maxItemsToDisplay);
                gVar.mo61712y();
            }
            if (mVTripPlanSection.sectionType != null) {
                gVar.mo61711x(MVTripPlanSection.f30156e);
                gVar.mo61678B(mVTripPlanSection.sectionType.getValue());
                gVar.mo61712y();
            }
            if (mVTripPlanSection.sortType != null && mVTripPlanSection.mo34708k()) {
                gVar.mo61711x(MVTripPlanSection.f30157f);
                gVar.mo61678B(mVTripPlanSection.sortType.getValue());
                gVar.mo61712y();
            }
            if (mVTripPlanSection.branding != null && mVTripPlanSection.mo34702f()) {
                gVar.mo61711x(MVTripPlanSection.f30158g);
                mVTripPlanSection.branding.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSection mVTripPlanSection = (MVTripPlanSection) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPlanSection.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanSection.name = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanSection.sectionId = gVar.mo61696i();
                            mVTripPlanSection.mo34710m();
                            break;
                        }
                    case 3:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanSection.maxItemsToDisplay = gVar.mo61691d();
                            mVTripPlanSection.mo34709l();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanSection.sectionType = MVSectionType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTripPlanSection.sortType = MVSectionSortType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTripPlanSectionBranding mVTripPlanSectionBranding = new MVTripPlanSectionBranding();
                            mVTripPlanSection.branding = mVTripPlanSectionBranding;
                            mVTripPlanSectionBranding.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSection$b */
    public static class C11665b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11664a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSection$c */
    public static class C11666c extends C25240d<MVTripPlanSection> {
        public C11666c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSection mVTripPlanSection = (MVTripPlanSection) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanSection.mo34704h()) {
                bitSet.set(0);
            }
            if (mVTripPlanSection.mo34706i()) {
                bitSet.set(1);
            }
            if (mVTripPlanSection.mo34703g()) {
                bitSet.set(2);
            }
            if (mVTripPlanSection.mo34707j()) {
                bitSet.set(3);
            }
            if (mVTripPlanSection.mo34708k()) {
                bitSet.set(4);
            }
            if (mVTripPlanSection.mo34702f()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVTripPlanSection.mo34704h()) {
                jVar.mo61686J(mVTripPlanSection.name);
            }
            if (mVTripPlanSection.mo34706i()) {
                jVar.mo61678B(mVTripPlanSection.sectionId);
            }
            if (mVTripPlanSection.mo34703g()) {
                jVar.mo61716P(mVTripPlanSection.maxItemsToDisplay);
            }
            if (mVTripPlanSection.mo34707j()) {
                jVar.mo61678B(mVTripPlanSection.sectionType.getValue());
            }
            if (mVTripPlanSection.mo34708k()) {
                jVar.mo61678B(mVTripPlanSection.sortType.getValue());
            }
            if (mVTripPlanSection.mo34702f()) {
                mVTripPlanSection.branding.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSection mVTripPlanSection = (MVTripPlanSection) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVTripPlanSection.name = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTripPlanSection.sectionId = jVar.mo61696i();
                mVTripPlanSection.mo34710m();
            }
            if (T.get(2)) {
                mVTripPlanSection.maxItemsToDisplay = jVar.mo61691d();
                mVTripPlanSection.mo34709l();
            }
            if (T.get(3)) {
                mVTripPlanSection.sectionType = MVSectionType.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVTripPlanSection.sortType = MVSectionSortType.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                MVTripPlanSectionBranding mVTripPlanSectionBranding = new MVTripPlanSectionBranding();
                mVTripPlanSection.branding = mVTripPlanSectionBranding;
                mVTripPlanSectionBranding.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSection$d */
    public static class C11667d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11666c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanSection");
        HashMap hashMap = new HashMap();
        f30159h = hashMap;
        hashMap.put(C25239c.class, new C11665b());
        hashMap.put(C25240d.class, new C11667d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SECTION_ID, new FieldMetaData("sectionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MAX_ITEMS_TO_DISPLAY, new FieldMetaData("maxItemsToDisplay", (byte) 2, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.SECTION_TYPE, new FieldMetaData("sectionType", (byte) 3, new EnumMetaData(MVSectionType.class)));
        enumMap.put(_Fields.SORT_TYPE, new FieldMetaData("sortType", (byte) 2, new EnumMetaData(MVSectionSortType.class)));
        enumMap.put(_Fields.BRANDING, new FieldMetaData("branding", (byte) 2, new StructMetaData(MVTripPlanSectionBranding.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30160i = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanSection.class, unmodifiableMap);
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
        ((C25238b) f30159h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30159h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanSection mVTripPlanSection = (MVTripPlanSection) obj;
        if (!getClass().equals(mVTripPlanSection.getClass())) {
            return getClass().getName().compareTo(mVTripPlanSection.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34704h()).compareTo(Boolean.valueOf(mVTripPlanSection.mo34704h()));
        if (compareTo2 != 0 || ((mo34704h() && (compareTo2 = this.name.compareTo(mVTripPlanSection.name)) != 0) || (compareTo2 = Boolean.valueOf(mo34706i()).compareTo(Boolean.valueOf(mVTripPlanSection.mo34706i()))) != 0 || ((mo34706i() && (compareTo2 = C25082a.m62839c(this.sectionId, mVTripPlanSection.sectionId)) != 0) || (compareTo2 = Boolean.valueOf(mo34703g()).compareTo(Boolean.valueOf(mVTripPlanSection.mo34703g()))) != 0 || ((mo34703g() && (compareTo2 = C25082a.m62837a(this.maxItemsToDisplay, mVTripPlanSection.maxItemsToDisplay)) != 0) || (compareTo2 = Boolean.valueOf(mo34707j()).compareTo(Boolean.valueOf(mVTripPlanSection.mo34707j()))) != 0 || ((mo34707j() && (compareTo2 = this.sectionType.compareTo(mVTripPlanSection.sectionType)) != 0) || (compareTo2 = Boolean.valueOf(mo34708k()).compareTo(Boolean.valueOf(mVTripPlanSection.mo34708k()))) != 0 || ((mo34708k() && (compareTo2 = this.sortType.compareTo(mVTripPlanSection.sortType)) != 0) || (compareTo2 = Boolean.valueOf(mo34702f()).compareTo(Boolean.valueOf(mVTripPlanSection.mo34702f()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo34702f() || (compareTo = this.branding.compareTo(mVTripPlanSection.branding)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripPlanSection)) {
            return false;
        }
        MVTripPlanSection mVTripPlanSection = (MVTripPlanSection) obj;
        boolean h = mo34704h();
        boolean h2 = mVTripPlanSection.mo34704h();
        if (((h || h2) && (!h || !h2 || !this.name.equals(mVTripPlanSection.name))) || this.sectionId != mVTripPlanSection.sectionId) {
            return false;
        }
        boolean g = mo34703g();
        boolean g2 = mVTripPlanSection.mo34703g();
        if ((g || g2) && (!g || !g2 || this.maxItemsToDisplay != mVTripPlanSection.maxItemsToDisplay)) {
            return false;
        }
        boolean j = mo34707j();
        boolean j2 = mVTripPlanSection.mo34707j();
        if ((j || j2) && (!j || !j2 || !this.sectionType.equals(mVTripPlanSection.sectionType))) {
            return false;
        }
        boolean k = mo34708k();
        boolean k2 = mVTripPlanSection.mo34708k();
        if ((k || k2) && (!k || !k2 || !this.sortType.equals(mVTripPlanSection.sortType))) {
            return false;
        }
        boolean f = mo34702f();
        boolean f2 = mVTripPlanSection.mo34702f();
        if ((f || f2) && (!f || !f2 || !this.branding.mo34713a(mVTripPlanSection.branding))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34702f() {
        return this.branding != null;
    }

    /* renamed from: g */
    public final boolean mo34703g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo34704h() {
        return this.name != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34706i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo34707j() {
        return this.sectionType != null;
    }

    /* renamed from: k */
    public final boolean mo34708k() {
        return this.sortType != null;
    }

    /* renamed from: l */
    public final void mo34709l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo34710m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanSection(", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("sectionId:");
        n.append(this.sectionId);
        if (mo34703g()) {
            n.append(", ");
            n.append("maxItemsToDisplay:");
            n.append(this.maxItemsToDisplay);
        }
        n.append(", ");
        n.append("sectionType:");
        MVSectionType mVSectionType = this.sectionType;
        if (mVSectionType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSectionType);
        }
        if (mo34708k()) {
            n.append(", ");
            n.append("sortType:");
            MVSectionSortType mVSectionSortType = this.sortType;
            if (mVSectionSortType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSectionSortType);
            }
        }
        if (mo34702f()) {
            n.append(", ");
            n.append("branding:");
            MVTripPlanSectionBranding mVTripPlanSectionBranding = this.branding;
            if (mVTripPlanSectionBranding == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTripPlanSectionBranding);
            }
        }
        n.append(")");
        return n.toString();
    }
}
