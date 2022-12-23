package com.tranzmate.moovit.protocol.users;

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
import p001a0.C0016g;
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

public class MVAvatar implements TBase<MVAvatar, _Fields>, Serializable, Cloneable, Comparable<MVAvatar> {

    /* renamed from: b */
    public static final C25113c f30316b = new C25113c("avatarId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30317c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30318d = new C25113c("image", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30319e = new C25113c("mapImage", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f30320f = new C25113c("shareImage", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f30321g = new C25113c("sharePreviewImage", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f30322h = new C25113c("shareSupported", (byte) 2, 7);

    /* renamed from: i */
    public static final C25113c f30323i = new C25113c("gender", (byte) 8, 8);

    /* renamed from: j */
    public static final HashMap f30324j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f30325k;
    private byte __isset_bitfield = 0;
    public int avatarId;
    public MVGender gender;
    public int image;
    public int mapImage;
    public String name;
    private _Fields[] optionals = {_Fields.IMAGE, _Fields.MAP_IMAGE, _Fields.SHARE_IMAGE, _Fields.SHARE_PREVIEW_IMAGE};
    public int shareImage;
    public int sharePreviewImage;
    public boolean shareSupported;

    public enum _Fields implements C25085c {
        AVATAR_ID(1, "avatarId"),
        NAME(2, "name"),
        IMAGE(3, "image"),
        MAP_IMAGE(4, "mapImage"),
        SHARE_IMAGE(5, "shareImage"),
        SHARE_PREVIEW_IMAGE(6, "sharePreviewImage"),
        SHARE_SUPPORTED(7, "shareSupported"),
        GENDER(8, "gender");
        
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
                    return AVATAR_ID;
                case 2:
                    return NAME;
                case 3:
                    return IMAGE;
                case 4:
                    return MAP_IMAGE;
                case 5:
                    return SHARE_IMAGE;
                case 6:
                    return SHARE_PREVIEW_IMAGE;
                case 7:
                    return SHARE_SUPPORTED;
                case 8:
                    return GENDER;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAvatar$a */
    public static class C11755a extends C25239c<MVAvatar> {
        public C11755a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAvatar mVAvatar = (MVAvatar) tBase;
            mVAvatar.getClass();
            C25113c cVar = MVAvatar.f30316b;
            gVar.mo61687K();
            gVar.mo61711x(MVAvatar.f30316b);
            gVar.mo61678B(mVAvatar.avatarId);
            gVar.mo61712y();
            if (mVAvatar.name != null) {
                gVar.mo61711x(MVAvatar.f30317c);
                gVar.mo61686J(mVAvatar.name);
                gVar.mo61712y();
            }
            if (mVAvatar.mo34980h()) {
                gVar.mo61711x(MVAvatar.f30318d);
                gVar.mo61678B(mVAvatar.image);
                gVar.mo61712y();
            }
            if (mVAvatar.mo34982i()) {
                gVar.mo61711x(MVAvatar.f30319e);
                gVar.mo61678B(mVAvatar.mapImage);
                gVar.mo61712y();
            }
            if (mVAvatar.mo34984k()) {
                gVar.mo61711x(MVAvatar.f30320f);
                gVar.mo61678B(mVAvatar.shareImage);
                gVar.mo61712y();
            }
            if (mVAvatar.mo34985l()) {
                gVar.mo61711x(MVAvatar.f30321g);
                gVar.mo61678B(mVAvatar.sharePreviewImage);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAvatar.f30322h);
            gVar.mo61708u(mVAvatar.shareSupported);
            gVar.mo61712y();
            if (mVAvatar.gender != null) {
                gVar.mo61711x(MVAvatar.f30323i);
                gVar.mo61678B(mVAvatar.gender.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAvatar mVAvatar = (MVAvatar) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAvatar.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAvatar.avatarId = gVar.mo61696i();
                            mVAvatar.mo34987o();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAvatar.name = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAvatar.image = gVar.mo61696i();
                            mVAvatar.mo34988p();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAvatar.mapImage = gVar.mo61696i();
                            mVAvatar.mo34989q();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAvatar.shareImage = gVar.mo61696i();
                            mVAvatar.mo34990r();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAvatar.sharePreviewImage = gVar.mo61696i();
                            mVAvatar.mo34991s();
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAvatar.shareSupported = gVar.mo61690c();
                            mVAvatar.mo34992t();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAvatar.gender = MVGender.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAvatar$b */
    public static class C11756b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11755a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAvatar$c */
    public static class C11757c extends C25240d<MVAvatar> {
        public C11757c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAvatar mVAvatar = (MVAvatar) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAvatar.mo34978f()) {
                bitSet.set(0);
            }
            if (mVAvatar.mo34983j()) {
                bitSet.set(1);
            }
            if (mVAvatar.mo34980h()) {
                bitSet.set(2);
            }
            if (mVAvatar.mo34982i()) {
                bitSet.set(3);
            }
            if (mVAvatar.mo34984k()) {
                bitSet.set(4);
            }
            if (mVAvatar.mo34985l()) {
                bitSet.set(5);
            }
            if (mVAvatar.mo34986m()) {
                bitSet.set(6);
            }
            if (mVAvatar.mo34979g()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVAvatar.mo34978f()) {
                jVar.mo61678B(mVAvatar.avatarId);
            }
            if (mVAvatar.mo34983j()) {
                jVar.mo61686J(mVAvatar.name);
            }
            if (mVAvatar.mo34980h()) {
                jVar.mo61678B(mVAvatar.image);
            }
            if (mVAvatar.mo34982i()) {
                jVar.mo61678B(mVAvatar.mapImage);
            }
            if (mVAvatar.mo34984k()) {
                jVar.mo61678B(mVAvatar.shareImage);
            }
            if (mVAvatar.mo34985l()) {
                jVar.mo61678B(mVAvatar.sharePreviewImage);
            }
            if (mVAvatar.mo34986m()) {
                jVar.mo61708u(mVAvatar.shareSupported);
            }
            if (mVAvatar.mo34979g()) {
                jVar.mo61678B(mVAvatar.gender.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAvatar mVAvatar = (MVAvatar) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVAvatar.avatarId = jVar.mo61696i();
                mVAvatar.mo34987o();
            }
            if (T.get(1)) {
                mVAvatar.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVAvatar.image = jVar.mo61696i();
                mVAvatar.mo34988p();
            }
            if (T.get(3)) {
                mVAvatar.mapImage = jVar.mo61696i();
                mVAvatar.mo34989q();
            }
            if (T.get(4)) {
                mVAvatar.shareImage = jVar.mo61696i();
                mVAvatar.mo34990r();
            }
            if (T.get(5)) {
                mVAvatar.sharePreviewImage = jVar.mo61696i();
                mVAvatar.mo34991s();
            }
            if (T.get(6)) {
                mVAvatar.shareSupported = jVar.mo61690c();
                mVAvatar.mo34992t();
            }
            if (T.get(7)) {
                mVAvatar.gender = MVGender.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVAvatar$d */
    public static class C11758d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11757c(0);
        }
    }

    static {
        new C17394d0("MVAvatar");
        HashMap hashMap = new HashMap();
        f30324j = hashMap;
        hashMap.put(C25239c.class, new C11756b());
        hashMap.put(C25240d.class, new C11758d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AVATAR_ID, new FieldMetaData("avatarId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.MAP_IMAGE, new FieldMetaData("mapImage", (byte) 2, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.SHARE_IMAGE, new FieldMetaData("shareImage", (byte) 2, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.SHARE_PREVIEW_IMAGE, new FieldMetaData("sharePreviewImage", (byte) 2, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.SHARE_SUPPORTED, new FieldMetaData("shareSupported", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.GENDER, new FieldMetaData("gender", (byte) 3, new EnumMetaData(MVGender.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30325k = unmodifiableMap;
        FieldMetaData.m61947a(MVAvatar.class, unmodifiableMap);
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
        ((C25238b) f30324j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30324j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAvatar mVAvatar = (MVAvatar) obj;
        if (!getClass().equals(mVAvatar.getClass())) {
            return getClass().getName().compareTo(mVAvatar.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34978f()).compareTo(Boolean.valueOf(mVAvatar.mo34978f()));
        if (compareTo2 != 0 || ((mo34978f() && (compareTo2 = C25082a.m62839c(this.avatarId, mVAvatar.avatarId)) != 0) || (compareTo2 = Boolean.valueOf(mo34983j()).compareTo(Boolean.valueOf(mVAvatar.mo34983j()))) != 0 || ((mo34983j() && (compareTo2 = this.name.compareTo(mVAvatar.name)) != 0) || (compareTo2 = Boolean.valueOf(mo34980h()).compareTo(Boolean.valueOf(mVAvatar.mo34980h()))) != 0 || ((mo34980h() && (compareTo2 = C25082a.m62839c(this.image, mVAvatar.image)) != 0) || (compareTo2 = Boolean.valueOf(mo34982i()).compareTo(Boolean.valueOf(mVAvatar.mo34982i()))) != 0 || ((mo34982i() && (compareTo2 = C25082a.m62839c(this.mapImage, mVAvatar.mapImage)) != 0) || (compareTo2 = Boolean.valueOf(mo34984k()).compareTo(Boolean.valueOf(mVAvatar.mo34984k()))) != 0 || ((mo34984k() && (compareTo2 = C25082a.m62839c(this.shareImage, mVAvatar.shareImage)) != 0) || (compareTo2 = Boolean.valueOf(mo34985l()).compareTo(Boolean.valueOf(mVAvatar.mo34985l()))) != 0 || ((mo34985l() && (compareTo2 = C25082a.m62839c(this.sharePreviewImage, mVAvatar.sharePreviewImage)) != 0) || (compareTo2 = Boolean.valueOf(mo34986m()).compareTo(Boolean.valueOf(mVAvatar.mo34986m()))) != 0 || ((mo34986m() && (compareTo2 = C25082a.m62848l(this.shareSupported, mVAvatar.shareSupported)) != 0) || (compareTo2 = Boolean.valueOf(mo34979g()).compareTo(Boolean.valueOf(mVAvatar.mo34979g()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo34979g() || (compareTo = this.gender.compareTo(mVAvatar.gender)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAvatar)) {
            return false;
        }
        MVAvatar mVAvatar = (MVAvatar) obj;
        if (this.avatarId != mVAvatar.avatarId) {
            return false;
        }
        boolean j = mo34983j();
        boolean j2 = mVAvatar.mo34983j();
        if ((j || j2) && (!j || !j2 || !this.name.equals(mVAvatar.name))) {
            return false;
        }
        boolean h = mo34980h();
        boolean h2 = mVAvatar.mo34980h();
        if ((h || h2) && (!h || !h2 || this.image != mVAvatar.image)) {
            return false;
        }
        boolean i = mo34982i();
        boolean i2 = mVAvatar.mo34982i();
        if ((i || i2) && (!i || !i2 || this.mapImage != mVAvatar.mapImage)) {
            return false;
        }
        boolean k = mo34984k();
        boolean k2 = mVAvatar.mo34984k();
        if ((k || k2) && (!k || !k2 || this.shareImage != mVAvatar.shareImage)) {
            return false;
        }
        boolean l = mo34985l();
        boolean l2 = mVAvatar.mo34985l();
        if (((l || l2) && (!l || !l2 || this.sharePreviewImage != mVAvatar.sharePreviewImage)) || this.shareSupported != mVAvatar.shareSupported) {
            return false;
        }
        boolean g = mo34979g();
        boolean g2 = mVAvatar.mo34979g();
        if ((g || g2) && (!g || !g2 || !this.gender.equals(mVAvatar.gender))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34978f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34979g() {
        return this.gender != null;
    }

    /* renamed from: h */
    public final boolean mo34980h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34982i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo34983j() {
        return this.name != null;
    }

    /* renamed from: k */
    public final boolean mo34984k() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: l */
    public final boolean mo34985l() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: m */
    public final boolean mo34986m() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: o */
    public final void mo34987o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo34988p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: q */
    public final void mo34989q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: r */
    public final void mo34990r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: s */
    public final void mo34991s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: t */
    public final void mo34992t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAvatar(", "avatarId:");
        C0016g.m42z(n, this.avatarId, ", ", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo34980h()) {
            n.append(", ");
            n.append("image:");
            n.append(this.image);
        }
        if (mo34982i()) {
            n.append(", ");
            n.append("mapImage:");
            n.append(this.mapImage);
        }
        if (mo34984k()) {
            n.append(", ");
            n.append("shareImage:");
            n.append(this.shareImage);
        }
        if (mo34985l()) {
            n.append(", ");
            n.append("sharePreviewImage:");
            n.append(this.sharePreviewImage);
        }
        n.append(", ");
        n.append("shareSupported:");
        C13555b.m33977q(n, this.shareSupported, ", ", "gender:");
        MVGender mVGender = this.gender;
        if (mVGender == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGender);
        }
        n.append(")");
        return n.toString();
    }
}
