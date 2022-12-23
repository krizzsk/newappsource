package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImagePackReferenceWithParams;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVTripPlanSectionBranding implements TBase<MVTripPlanSectionBranding, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanSectionBranding> {

    /* renamed from: b */
    public static final C25113c f30161b = new C25113c("bgColor", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30162c = new C25113c("nameColor", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30163d = new C25113c("backdropImage", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30164e = new C25113c("logo", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f30165f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f30166g;
    private byte __isset_bitfield = 0;
    public MVImagePackReferenceWithParams backdropImage;
    public int bgColor;
    public MVImageReferenceWithParams logo;
    public int nameColor;
    private _Fields[] optionals = {_Fields.BACKDROP_IMAGE, _Fields.LOGO};

    public enum _Fields implements C25085c {
        BG_COLOR(1, "bgColor"),
        NAME_COLOR(2, "nameColor"),
        BACKDROP_IMAGE(3, "backdropImage"),
        LOGO(4, "logo");
        
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
                return BG_COLOR;
            }
            if (i == 2) {
                return NAME_COLOR;
            }
            if (i == 3) {
                return BACKDROP_IMAGE;
            }
            if (i != 4) {
                return null;
            }
            return LOGO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionBranding$a */
    public static class C11668a extends C25239c<MVTripPlanSectionBranding> {
        public C11668a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSectionBranding mVTripPlanSectionBranding = (MVTripPlanSectionBranding) tBase;
            mVTripPlanSectionBranding.getClass();
            C25113c cVar = MVTripPlanSectionBranding.f30161b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripPlanSectionBranding.f30161b);
            gVar.mo61678B(mVTripPlanSectionBranding.bgColor);
            gVar.mo61712y();
            gVar.mo61711x(MVTripPlanSectionBranding.f30162c);
            gVar.mo61678B(mVTripPlanSectionBranding.nameColor);
            gVar.mo61712y();
            if (mVTripPlanSectionBranding.backdropImage != null && mVTripPlanSectionBranding.mo34716f()) {
                gVar.mo61711x(MVTripPlanSectionBranding.f30163d);
                mVTripPlanSectionBranding.backdropImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTripPlanSectionBranding.logo != null && mVTripPlanSectionBranding.mo34718h()) {
                gVar.mo61711x(MVTripPlanSectionBranding.f30164e);
                mVTripPlanSectionBranding.logo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSectionBranding mVTripPlanSectionBranding = (MVTripPlanSectionBranding) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripPlanSectionBranding.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                                mVTripPlanSectionBranding.logo = mVImageReferenceWithParams;
                                mVImageReferenceWithParams.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVImagePackReferenceWithParams mVImagePackReferenceWithParams = new MVImagePackReferenceWithParams();
                            mVTripPlanSectionBranding.backdropImage = mVImagePackReferenceWithParams;
                            mVImagePackReferenceWithParams.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVTripPlanSectionBranding.nameColor = gVar.mo61696i();
                        mVTripPlanSectionBranding.mo34722k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripPlanSectionBranding.bgColor = gVar.mo61696i();
                    mVTripPlanSectionBranding.mo34721j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionBranding$b */
    public static class C11669b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11668a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionBranding$c */
    public static class C11670c extends C25240d<MVTripPlanSectionBranding> {
        public C11670c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSectionBranding mVTripPlanSectionBranding = (MVTripPlanSectionBranding) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanSectionBranding.mo34717g()) {
                bitSet.set(0);
            }
            if (mVTripPlanSectionBranding.mo34720i()) {
                bitSet.set(1);
            }
            if (mVTripPlanSectionBranding.mo34716f()) {
                bitSet.set(2);
            }
            if (mVTripPlanSectionBranding.mo34718h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTripPlanSectionBranding.mo34717g()) {
                jVar.mo61678B(mVTripPlanSectionBranding.bgColor);
            }
            if (mVTripPlanSectionBranding.mo34720i()) {
                jVar.mo61678B(mVTripPlanSectionBranding.nameColor);
            }
            if (mVTripPlanSectionBranding.mo34716f()) {
                mVTripPlanSectionBranding.backdropImage.mo25202X0(jVar);
            }
            if (mVTripPlanSectionBranding.mo34718h()) {
                mVTripPlanSectionBranding.logo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanSectionBranding mVTripPlanSectionBranding = (MVTripPlanSectionBranding) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTripPlanSectionBranding.bgColor = jVar.mo61696i();
                mVTripPlanSectionBranding.mo34721j();
            }
            if (T.get(1)) {
                mVTripPlanSectionBranding.nameColor = jVar.mo61696i();
                mVTripPlanSectionBranding.mo34722k();
            }
            if (T.get(2)) {
                MVImagePackReferenceWithParams mVImagePackReferenceWithParams = new MVImagePackReferenceWithParams();
                mVTripPlanSectionBranding.backdropImage = mVImagePackReferenceWithParams;
                mVImagePackReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTripPlanSectionBranding.logo = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSectionBranding$d */
    public static class C11671d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11670c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanSectionBranding");
        HashMap hashMap = new HashMap();
        f30165f = hashMap;
        hashMap.put(C25239c.class, new C11669b());
        hashMap.put(C25240d.class, new C11671d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BG_COLOR, new FieldMetaData("bgColor", (byte) 3, new FieldValueMetaData((byte) 8, "Color")));
        enumMap.put(_Fields.NAME_COLOR, new FieldMetaData("nameColor", (byte) 3, new FieldValueMetaData((byte) 8, "Color")));
        enumMap.put(_Fields.BACKDROP_IMAGE, new FieldMetaData("backdropImage", (byte) 2, new StructMetaData(MVImagePackReferenceWithParams.class)));
        enumMap.put(_Fields.LOGO, new FieldMetaData("logo", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30166g = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanSectionBranding.class, unmodifiableMap);
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
        ((C25238b) f30165f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30165f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34713a(MVTripPlanSectionBranding mVTripPlanSectionBranding) {
        if (mVTripPlanSectionBranding == null || this.bgColor != mVTripPlanSectionBranding.bgColor || this.nameColor != mVTripPlanSectionBranding.nameColor) {
            return false;
        }
        boolean f = mo34716f();
        boolean f2 = mVTripPlanSectionBranding.mo34716f();
        if ((f || f2) && (!f || !f2 || !this.backdropImage.mo26206a(mVTripPlanSectionBranding.backdropImage))) {
            return false;
        }
        boolean h = mo34718h();
        boolean h2 = mVTripPlanSectionBranding.mo34718h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.logo.mo26245a(mVTripPlanSectionBranding.logo)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanSectionBranding mVTripPlanSectionBranding = (MVTripPlanSectionBranding) obj;
        if (!getClass().equals(mVTripPlanSectionBranding.getClass())) {
            return getClass().getName().compareTo(mVTripPlanSectionBranding.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34717g()).compareTo(Boolean.valueOf(mVTripPlanSectionBranding.mo34717g()));
        if (compareTo2 != 0 || ((mo34717g() && (compareTo2 = C25082a.m62839c(this.bgColor, mVTripPlanSectionBranding.bgColor)) != 0) || (compareTo2 = Boolean.valueOf(mo34720i()).compareTo(Boolean.valueOf(mVTripPlanSectionBranding.mo34720i()))) != 0 || ((mo34720i() && (compareTo2 = C25082a.m62839c(this.nameColor, mVTripPlanSectionBranding.nameColor)) != 0) || (compareTo2 = Boolean.valueOf(mo34716f()).compareTo(Boolean.valueOf(mVTripPlanSectionBranding.mo34716f()))) != 0 || ((mo34716f() && (compareTo2 = this.backdropImage.compareTo(mVTripPlanSectionBranding.backdropImage)) != 0) || (compareTo2 = Boolean.valueOf(mo34718h()).compareTo(Boolean.valueOf(mVTripPlanSectionBranding.mo34718h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo34718h() || (compareTo = this.logo.compareTo(mVTripPlanSectionBranding.logo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTripPlanSectionBranding)) {
            return mo34713a((MVTripPlanSectionBranding) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34716f() {
        return this.backdropImage != null;
    }

    /* renamed from: g */
    public final boolean mo34717g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo34718h() {
        return this.logo != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34720i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final void mo34721j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo34722k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanSectionBranding(", "bgColor:");
        C0016g.m42z(n, this.bgColor, ", ", "nameColor:");
        n.append(this.nameColor);
        if (mo34716f()) {
            n.append(", ");
            n.append("backdropImage:");
            MVImagePackReferenceWithParams mVImagePackReferenceWithParams = this.backdropImage;
            if (mVImagePackReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImagePackReferenceWithParams);
            }
        }
        if (mo34718h()) {
            n.append(", ");
            n.append("logo:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.logo;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        n.append(")");
        return n.toString();
    }
}
