package com.tranzmate.moovit.protocol.common;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVLocationDescriptor implements TBase<MVLocationDescriptor, _Fields>, Serializable, Cloneable, Comparable<MVLocationDescriptor> {

    /* renamed from: b */
    public static final C25113c f25089b = new C25113c("caption", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25090c = new C25113c("id", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25091d = new C25113c("latlon", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f25092e = new C25113c("type", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25093f = new C25113c(ServerParameters.AF_USER_ID, (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f25094g = new C25113c("inaccurateLatLon", (byte) 2, 6);

    /* renamed from: h */
    public static final C25113c f25095h = new C25113c("source", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f25096i = new C25113c("icon", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f25097j = new C25113c("mapIcon", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f25098k = new C25113c("types", (byte) 11, 10);

    /* renamed from: l */
    public static final HashMap f25099l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f25100m;
    private byte __isset_bitfield = 0;
    public String caption;
    public MVImageReferenceWithParams icon;

    /* renamed from: id */
    public int f25101id;
    public boolean inaccurateLatLon;
    public MVLatLon latlon;
    public MVImageReferenceWithParams mapIcon;
    private _Fields[] optionals = {_Fields.CAPTION, _Fields.ID, _Fields.UID, _Fields.INACCURATE_LAT_LON, _Fields.SOURCE, _Fields.ICON, _Fields.MAP_ICON, _Fields.TYPES};
    public MVSiteSource source;
    public MVLocationType type;
    public String types;
    public String uid;

    public enum _Fields implements C25085c {
        CAPTION(1, "caption"),
        ID(2, "id"),
        LATLON(3, "latlon"),
        TYPE(4, "type"),
        UID(5, ServerParameters.AF_USER_ID),
        INACCURATE_LAT_LON(6, "inaccurateLatLon"),
        SOURCE(7, "source"),
        ICON(8, "icon"),
        MAP_ICON(9, "mapIcon"),
        TYPES(10, "types");
        
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
                    return CAPTION;
                case 2:
                    return ID;
                case 3:
                    return LATLON;
                case 4:
                    return TYPE;
                case 5:
                    return UID;
                case 6:
                    return INACCURATE_LAT_LON;
                case 7:
                    return SOURCE;
                case 8:
                    return ICON;
                case 9:
                    return MAP_ICON;
                case 10:
                    return TYPES;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLocationDescriptor$a */
    public static class C8468a extends C25239c<MVLocationDescriptor> {
        public C8468a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocationDescriptor mVLocationDescriptor = (MVLocationDescriptor) tBase;
            mVLocationDescriptor.mo26333s();
            C25113c cVar = MVLocationDescriptor.f25089b;
            gVar.mo61687K();
            if (mVLocationDescriptor.caption != null && mVLocationDescriptor.mo26320f()) {
                gVar.mo61711x(MVLocationDescriptor.f25089b);
                gVar.mo61686J(mVLocationDescriptor.caption);
                gVar.mo61712y();
            }
            if (mVLocationDescriptor.mo26322h()) {
                gVar.mo61711x(MVLocationDescriptor.f25090c);
                gVar.mo61678B(mVLocationDescriptor.f25101id);
                gVar.mo61712y();
            }
            if (mVLocationDescriptor.latlon != null) {
                gVar.mo61711x(MVLocationDescriptor.f25091d);
                mVLocationDescriptor.latlon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLocationDescriptor.type != null) {
                gVar.mo61711x(MVLocationDescriptor.f25092e);
                gVar.mo61678B(mVLocationDescriptor.type.getValue());
                gVar.mo61712y();
            }
            if (mVLocationDescriptor.uid != null && mVLocationDescriptor.mo26330p()) {
                gVar.mo61711x(MVLocationDescriptor.f25093f);
                gVar.mo61686J(mVLocationDescriptor.uid);
                gVar.mo61712y();
            }
            if (mVLocationDescriptor.mo26324i()) {
                gVar.mo61711x(MVLocationDescriptor.f25094g);
                gVar.mo61708u(mVLocationDescriptor.inaccurateLatLon);
                gVar.mo61712y();
            }
            if (mVLocationDescriptor.source != null && mVLocationDescriptor.mo26327l()) {
                gVar.mo61711x(MVLocationDescriptor.f25095h);
                gVar.mo61678B(mVLocationDescriptor.source.getValue());
                gVar.mo61712y();
            }
            if (mVLocationDescriptor.icon != null && mVLocationDescriptor.mo26321g()) {
                gVar.mo61711x(MVLocationDescriptor.f25096i);
                mVLocationDescriptor.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLocationDescriptor.mapIcon != null && mVLocationDescriptor.mo26326k()) {
                gVar.mo61711x(MVLocationDescriptor.f25097j);
                mVLocationDescriptor.mapIcon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLocationDescriptor.types != null && mVLocationDescriptor.mo26329o()) {
                gVar.mo61711x(MVLocationDescriptor.f25098k);
                gVar.mo61686J(mVLocationDescriptor.types);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocationDescriptor mVLocationDescriptor = (MVLocationDescriptor) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLocationDescriptor.mo26333s();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLocationDescriptor.caption = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLocationDescriptor.f25101id = gVar.mo61696i();
                            mVLocationDescriptor.mo26331q(true);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon = new MVLatLon();
                            mVLocationDescriptor.latlon = mVLatLon;
                            mVLatLon.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLocationDescriptor.type = MVLocationType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLocationDescriptor.uid = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLocationDescriptor.inaccurateLatLon = gVar.mo61690c();
                            mVLocationDescriptor.mo26332r();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLocationDescriptor.source = MVSiteSource.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVLocationDescriptor.icon = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVLocationDescriptor.mapIcon = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLocationDescriptor.types = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLocationDescriptor$b */
    public static class C8469b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8468a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLocationDescriptor$c */
    public static class C8470c extends C25240d<MVLocationDescriptor> {
        public C8470c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLocationDescriptor mVLocationDescriptor = (MVLocationDescriptor) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLocationDescriptor.mo26320f()) {
                bitSet.set(0);
            }
            if (mVLocationDescriptor.mo26322h()) {
                bitSet.set(1);
            }
            if (mVLocationDescriptor.mo26325j()) {
                bitSet.set(2);
            }
            if (mVLocationDescriptor.mo26328m()) {
                bitSet.set(3);
            }
            if (mVLocationDescriptor.mo26330p()) {
                bitSet.set(4);
            }
            if (mVLocationDescriptor.mo26324i()) {
                bitSet.set(5);
            }
            if (mVLocationDescriptor.mo26327l()) {
                bitSet.set(6);
            }
            if (mVLocationDescriptor.mo26321g()) {
                bitSet.set(7);
            }
            if (mVLocationDescriptor.mo26326k()) {
                bitSet.set(8);
            }
            if (mVLocationDescriptor.mo26329o()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVLocationDescriptor.mo26320f()) {
                jVar.mo61686J(mVLocationDescriptor.caption);
            }
            if (mVLocationDescriptor.mo26322h()) {
                jVar.mo61678B(mVLocationDescriptor.f25101id);
            }
            if (mVLocationDescriptor.mo26325j()) {
                mVLocationDescriptor.latlon.mo25202X0(jVar);
            }
            if (mVLocationDescriptor.mo26328m()) {
                jVar.mo61678B(mVLocationDescriptor.type.getValue());
            }
            if (mVLocationDescriptor.mo26330p()) {
                jVar.mo61686J(mVLocationDescriptor.uid);
            }
            if (mVLocationDescriptor.mo26324i()) {
                jVar.mo61708u(mVLocationDescriptor.inaccurateLatLon);
            }
            if (mVLocationDescriptor.mo26327l()) {
                jVar.mo61678B(mVLocationDescriptor.source.getValue());
            }
            if (mVLocationDescriptor.mo26321g()) {
                mVLocationDescriptor.icon.mo25202X0(jVar);
            }
            if (mVLocationDescriptor.mo26326k()) {
                mVLocationDescriptor.mapIcon.mo25202X0(jVar);
            }
            if (mVLocationDescriptor.mo26329o()) {
                jVar.mo61686J(mVLocationDescriptor.types);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLocationDescriptor mVLocationDescriptor = (MVLocationDescriptor) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                mVLocationDescriptor.caption = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVLocationDescriptor.f25101id = jVar.mo61696i();
                mVLocationDescriptor.mo26331q(true);
            }
            if (T.get(2)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVLocationDescriptor.latlon = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVLocationDescriptor.type = MVLocationType.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVLocationDescriptor.uid = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVLocationDescriptor.inaccurateLatLon = jVar.mo61690c();
                mVLocationDescriptor.mo26332r();
            }
            if (T.get(6)) {
                mVLocationDescriptor.source = MVSiteSource.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVLocationDescriptor.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(8)) {
                MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                mVLocationDescriptor.mapIcon = mVImageReferenceWithParams2;
                mVImageReferenceWithParams2.mo25201C1(jVar);
            }
            if (T.get(9)) {
                mVLocationDescriptor.types = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLocationDescriptor$d */
    public static class C8471d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8470c(0);
        }
    }

    static {
        new C17394d0("MVLocationDescriptor");
        HashMap hashMap = new HashMap();
        f25099l = hashMap;
        hashMap.put(C25239c.class, new C8469b());
        hashMap.put(C25240d.class, new C8471d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CAPTION, new FieldMetaData("caption", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LATLON, new FieldMetaData("latlon", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVLocationType.class)));
        enumMap.put(_Fields.UID, new FieldMetaData(ServerParameters.AF_USER_ID, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INACCURATE_LAT_LON, new FieldMetaData("inaccurateLatLon", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SOURCE, new FieldMetaData("source", (byte) 2, new EnumMetaData(MVSiteSource.class)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.MAP_ICON, new FieldMetaData("mapIcon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TYPES, new FieldMetaData("types", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25100m = unmodifiableMap;
        FieldMetaData.m61947a(MVLocationDescriptor.class, unmodifiableMap);
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
        ((C25238b) f25099l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25099l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26317a(MVLocationDescriptor mVLocationDescriptor) {
        if (mVLocationDescriptor == null) {
            return false;
        }
        boolean f = mo26320f();
        boolean f2 = mVLocationDescriptor.mo26320f();
        if ((f || f2) && (!f || !f2 || !this.caption.equals(mVLocationDescriptor.caption))) {
            return false;
        }
        boolean h = mo26322h();
        boolean h2 = mVLocationDescriptor.mo26322h();
        if ((h || h2) && (!h || !h2 || this.f25101id != mVLocationDescriptor.f25101id)) {
            return false;
        }
        boolean j = mo26325j();
        boolean j2 = mVLocationDescriptor.mo26325j();
        if ((j || j2) && (!j || !j2 || !this.latlon.mo26290a(mVLocationDescriptor.latlon))) {
            return false;
        }
        boolean m = mo26328m();
        boolean m2 = mVLocationDescriptor.mo26328m();
        if ((m || m2) && (!m || !m2 || !this.type.equals(mVLocationDescriptor.type))) {
            return false;
        }
        boolean p = mo26330p();
        boolean p2 = mVLocationDescriptor.mo26330p();
        if ((p || p2) && (!p || !p2 || !this.uid.equals(mVLocationDescriptor.uid))) {
            return false;
        }
        boolean i = mo26324i();
        boolean i2 = mVLocationDescriptor.mo26324i();
        if ((i || i2) && (!i || !i2 || this.inaccurateLatLon != mVLocationDescriptor.inaccurateLatLon)) {
            return false;
        }
        boolean l = mo26327l();
        boolean l2 = mVLocationDescriptor.mo26327l();
        if ((l || l2) && (!l || !l2 || !this.source.equals(mVLocationDescriptor.source))) {
            return false;
        }
        boolean g = mo26321g();
        boolean g2 = mVLocationDescriptor.mo26321g();
        if ((g || g2) && (!g || !g2 || !this.icon.mo26245a(mVLocationDescriptor.icon))) {
            return false;
        }
        boolean k = mo26326k();
        boolean k2 = mVLocationDescriptor.mo26326k();
        if ((k || k2) && (!k || !k2 || !this.mapIcon.mo26245a(mVLocationDescriptor.mapIcon))) {
            return false;
        }
        boolean o = mo26329o();
        boolean o2 = mVLocationDescriptor.mo26329o();
        if (!o && !o2) {
            return true;
        }
        if (!o || !o2 || !this.types.equals(mVLocationDescriptor.types)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLocationDescriptor mVLocationDescriptor = (MVLocationDescriptor) obj;
        if (!getClass().equals(mVLocationDescriptor.getClass())) {
            return getClass().getName().compareTo(mVLocationDescriptor.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26320f()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26320f()));
        if (compareTo2 != 0 || ((mo26320f() && (compareTo2 = this.caption.compareTo(mVLocationDescriptor.caption)) != 0) || (compareTo2 = Boolean.valueOf(mo26322h()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26322h()))) != 0 || ((mo26322h() && (compareTo2 = C25082a.m62839c(this.f25101id, mVLocationDescriptor.f25101id)) != 0) || (compareTo2 = Boolean.valueOf(mo26325j()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26325j()))) != 0 || ((mo26325j() && (compareTo2 = this.latlon.compareTo(mVLocationDescriptor.latlon)) != 0) || (compareTo2 = Boolean.valueOf(mo26328m()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26328m()))) != 0 || ((mo26328m() && (compareTo2 = this.type.compareTo(mVLocationDescriptor.type)) != 0) || (compareTo2 = Boolean.valueOf(mo26330p()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26330p()))) != 0 || ((mo26330p() && (compareTo2 = this.uid.compareTo(mVLocationDescriptor.uid)) != 0) || (compareTo2 = Boolean.valueOf(mo26324i()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26324i()))) != 0 || ((mo26324i() && (compareTo2 = C25082a.m62848l(this.inaccurateLatLon, mVLocationDescriptor.inaccurateLatLon)) != 0) || (compareTo2 = Boolean.valueOf(mo26327l()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26327l()))) != 0 || ((mo26327l() && (compareTo2 = this.source.compareTo(mVLocationDescriptor.source)) != 0) || (compareTo2 = Boolean.valueOf(mo26321g()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26321g()))) != 0 || ((mo26321g() && (compareTo2 = this.icon.compareTo(mVLocationDescriptor.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo26326k()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26326k()))) != 0 || ((mo26326k() && (compareTo2 = this.mapIcon.compareTo(mVLocationDescriptor.mapIcon)) != 0) || (compareTo2 = Boolean.valueOf(mo26329o()).compareTo(Boolean.valueOf(mVLocationDescriptor.mo26329o()))) != 0)))))))))) {
            return compareTo2;
        }
        if (!mo26329o() || (compareTo = this.types.compareTo(mVLocationDescriptor.types)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLocationDescriptor)) {
            return mo26317a((MVLocationDescriptor) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26320f() {
        return this.caption != null;
    }

    /* renamed from: g */
    public final boolean mo26321g() {
        return this.icon != null;
    }

    /* renamed from: h */
    public final boolean mo26322h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26324i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo26325j() {
        return this.latlon != null;
    }

    /* renamed from: k */
    public final boolean mo26326k() {
        return this.mapIcon != null;
    }

    /* renamed from: l */
    public final boolean mo26327l() {
        return this.source != null;
    }

    /* renamed from: m */
    public final boolean mo26328m() {
        return this.type != null;
    }

    /* renamed from: o */
    public final boolean mo26329o() {
        return this.types != null;
    }

    /* renamed from: p */
    public final boolean mo26330p() {
        return this.uid != null;
    }

    /* renamed from: q */
    public final void mo26331q(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, z);
    }

    /* renamed from: r */
    public final void mo26332r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: s */
    public final void mo26333s() throws TException {
        MVLatLon mVLatLon = this.latlon;
        if (mVLatLon != null) {
            mVLatLon.getClass();
        }
        MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
        if (mVImageReferenceWithParams != null) {
            mVImageReferenceWithParams.getClass();
        }
        MVImageReferenceWithParams mVImageReferenceWithParams2 = this.mapIcon;
        if (mVImageReferenceWithParams2 != null) {
            mVImageReferenceWithParams2.getClass();
        }
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVLocationDescriptor(");
        boolean z2 = false;
        if (mo26320f()) {
            sb.append("caption:");
            String str = this.caption;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo26322h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            sb.append(this.f25101id);
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("latlon:");
        MVLatLon mVLatLon = this.latlon;
        if (mVLatLon == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVLatLon);
        }
        sb.append(", ");
        sb.append("type:");
        MVLocationType mVLocationType = this.type;
        if (mVLocationType == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVLocationType);
        }
        if (mo26330p()) {
            sb.append(", ");
            sb.append("uid:");
            String str2 = this.uid;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        if (mo26324i()) {
            sb.append(", ");
            sb.append("inaccurateLatLon:");
            sb.append(this.inaccurateLatLon);
        }
        if (mo26327l()) {
            sb.append(", ");
            sb.append("source:");
            MVSiteSource mVSiteSource = this.source;
            if (mVSiteSource == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVSiteSource);
            }
        }
        if (mo26321g()) {
            sb.append(", ");
            sb.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
        }
        if (mo26326k()) {
            sb.append(", ");
            sb.append("mapIcon:");
            MVImageReferenceWithParams mVImageReferenceWithParams2 = this.mapIcon;
            if (mVImageReferenceWithParams2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams2);
            }
        }
        if (mo26329o()) {
            sb.append(", ");
            sb.append("types:");
            String str3 = this.types;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
