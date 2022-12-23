package com.tranzmate.moovit.protocol.search;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVPOISearchItem implements TBase<MVPOISearchItem, _Fields>, Serializable, Cloneable, Comparable<MVPOISearchItem> {

    /* renamed from: b */
    public static final C25113c f28168b = new C25113c("siteId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28169c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28170d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28171e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28172f = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f28173g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28174h;
    private byte __isset_bitfield = 0;
    public MVImageReferenceWithParams image;
    public MVLatLon location;
    private _Fields[] optionals = {_Fields.IMAGE, _Fields.TITLE, _Fields.SUBTITLE};
    public int siteId;
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        SITE_ID(1, "siteId"),
        IMAGE(2, "image"),
        TITLE(3, "title"),
        SUBTITLE(4, "subtitle"),
        LOCATION(5, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        
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
                return SITE_ID;
            }
            if (i == 2) {
                return IMAGE;
            }
            if (i == 3) {
                return TITLE;
            }
            if (i == 4) {
                return SUBTITLE;
            }
            if (i != 5) {
                return null;
            }
            return LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.search.MVPOISearchItem$a */
    public static class C10423a extends C25239c<MVPOISearchItem> {
        public C10423a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPOISearchItem mVPOISearchItem = (MVPOISearchItem) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVPOISearchItem.image;
            C25113c cVar = MVPOISearchItem.f28168b;
            gVar.mo61687K();
            gVar.mo61711x(MVPOISearchItem.f28168b);
            gVar.mo61678B(mVPOISearchItem.siteId);
            gVar.mo61712y();
            if (mVPOISearchItem.image != null && mVPOISearchItem.mo31458f()) {
                gVar.mo61711x(MVPOISearchItem.f28169c);
                mVPOISearchItem.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPOISearchItem.title != null && mVPOISearchItem.mo31463j()) {
                gVar.mo61711x(MVPOISearchItem.f28170d);
                gVar.mo61686J(mVPOISearchItem.title);
                gVar.mo61712y();
            }
            if (mVPOISearchItem.subtitle != null && mVPOISearchItem.mo31462i()) {
                gVar.mo61711x(MVPOISearchItem.f28171e);
                gVar.mo61686J(mVPOISearchItem.subtitle);
                gVar.mo61712y();
            }
            if (mVPOISearchItem.location != null) {
                gVar.mo61711x(MVPOISearchItem.f28172f);
                mVPOISearchItem.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPOISearchItem mVPOISearchItem = (MVPOISearchItem) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVPOISearchItem.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVLatLon mVLatLon = new MVLatLon();
                                    mVPOISearchItem.location = mVLatLon;
                                    mVLatLon.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVPOISearchItem.subtitle = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVPOISearchItem.title = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVPOISearchItem.image = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPOISearchItem.siteId = gVar.mo61696i();
                    mVPOISearchItem.mo31464k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVPOISearchItem$b */
    public static class C10424b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10423a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVPOISearchItem$c */
    public static class C10425c extends C25240d<MVPOISearchItem> {
        public C10425c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPOISearchItem mVPOISearchItem = (MVPOISearchItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPOISearchItem.mo31460h()) {
                bitSet.set(0);
            }
            if (mVPOISearchItem.mo31458f()) {
                bitSet.set(1);
            }
            if (mVPOISearchItem.mo31463j()) {
                bitSet.set(2);
            }
            if (mVPOISearchItem.mo31462i()) {
                bitSet.set(3);
            }
            if (mVPOISearchItem.mo31459g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPOISearchItem.mo31460h()) {
                jVar.mo61678B(mVPOISearchItem.siteId);
            }
            if (mVPOISearchItem.mo31458f()) {
                mVPOISearchItem.image.mo25202X0(jVar);
            }
            if (mVPOISearchItem.mo31463j()) {
                jVar.mo61686J(mVPOISearchItem.title);
            }
            if (mVPOISearchItem.mo31462i()) {
                jVar.mo61686J(mVPOISearchItem.subtitle);
            }
            if (mVPOISearchItem.mo31459g()) {
                mVPOISearchItem.location.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPOISearchItem mVPOISearchItem = (MVPOISearchItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPOISearchItem.siteId = jVar.mo61696i();
                mVPOISearchItem.mo31464k();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVPOISearchItem.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPOISearchItem.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPOISearchItem.subtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPOISearchItem.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.search.MVPOISearchItem$d */
    public static class C10426d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10425c(0);
        }
    }

    static {
        new C17394d0("MVPOISearchItem");
        HashMap hashMap = new HashMap();
        f28173g = hashMap;
        hashMap.put(C25239c.class, new C10424b());
        hashMap.put(C25240d.class, new C10426d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SITE_ID, new FieldMetaData("siteId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28174h = unmodifiableMap;
        FieldMetaData.m61947a(MVPOISearchItem.class, unmodifiableMap);
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
        ((C25238b) f28173g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28173g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPOISearchItem mVPOISearchItem = (MVPOISearchItem) obj;
        if (!getClass().equals(mVPOISearchItem.getClass())) {
            return getClass().getName().compareTo(mVPOISearchItem.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31460h()).compareTo(Boolean.valueOf(mVPOISearchItem.mo31460h()));
        if (compareTo2 != 0 || ((mo31460h() && (compareTo2 = C25082a.m62839c(this.siteId, mVPOISearchItem.siteId)) != 0) || (compareTo2 = Boolean.valueOf(mo31458f()).compareTo(Boolean.valueOf(mVPOISearchItem.mo31458f()))) != 0 || ((mo31458f() && (compareTo2 = this.image.compareTo(mVPOISearchItem.image)) != 0) || (compareTo2 = Boolean.valueOf(mo31463j()).compareTo(Boolean.valueOf(mVPOISearchItem.mo31463j()))) != 0 || ((mo31463j() && (compareTo2 = this.title.compareTo(mVPOISearchItem.title)) != 0) || (compareTo2 = Boolean.valueOf(mo31462i()).compareTo(Boolean.valueOf(mVPOISearchItem.mo31462i()))) != 0 || ((mo31462i() && (compareTo2 = this.subtitle.compareTo(mVPOISearchItem.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo31459g()).compareTo(Boolean.valueOf(mVPOISearchItem.mo31459g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo31459g() || (compareTo = this.location.compareTo(mVPOISearchItem.location)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPOISearchItem)) {
            return false;
        }
        MVPOISearchItem mVPOISearchItem = (MVPOISearchItem) obj;
        if (this.siteId != mVPOISearchItem.siteId) {
            return false;
        }
        boolean f = mo31458f();
        boolean f2 = mVPOISearchItem.mo31458f();
        if ((f || f2) && (!f || !f2 || !this.image.mo26245a(mVPOISearchItem.image))) {
            return false;
        }
        boolean j = mo31463j();
        boolean j2 = mVPOISearchItem.mo31463j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVPOISearchItem.title))) {
            return false;
        }
        boolean i = mo31462i();
        boolean i2 = mVPOISearchItem.mo31462i();
        if ((i || i2) && (!i || !i2 || !this.subtitle.equals(mVPOISearchItem.subtitle))) {
            return false;
        }
        boolean g = mo31459g();
        boolean g2 = mVPOISearchItem.mo31459g();
        if ((g || g2) && (!g || !g2 || !this.location.mo26290a(mVPOISearchItem.location))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31458f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo31459g() {
        return this.location != null;
    }

    /* renamed from: h */
    public final boolean mo31460h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31462i() {
        return this.subtitle != null;
    }

    /* renamed from: j */
    public final boolean mo31463j() {
        return this.title != null;
    }

    /* renamed from: k */
    public final void mo31464k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPOISearchItem(", "siteId:");
        n.append(this.siteId);
        if (mo31458f()) {
            n.append(", ");
            n.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo31463j()) {
            n.append(", ");
            n.append("title:");
            String str = this.title;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo31462i()) {
            n.append(", ");
            n.append("subtitle:");
            String str2 = this.subtitle;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(")");
        return n.toString();
    }
}
