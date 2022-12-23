package com.tranzmate.moovit.protocol.taxi;

import com.appboy.support.StringUtils;
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

public class MVTaxiFabPresentation implements TBase<MVTaxiFabPresentation, _Fields>, Serializable, Cloneable, Comparable<MVTaxiFabPresentation> {

    /* renamed from: b */
    public static final C25113c f28560b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28561c = new C25113c("titleColor", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28562d = new C25113c("icon", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28563e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28564f;
    private byte __isset_bitfield = 0;
    public MVImageReferenceWithParams icon;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.TITLE_COLOR};
    public String title;
    public int titleColor;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        TITLE_COLOR(2, "titleColor"),
        ICON(3, "icon");
        
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
                return TITLE;
            }
            if (i == 2) {
                return TITLE_COLOR;
            }
            if (i != 3) {
                return null;
            }
            return ICON;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation$a */
    public static class C10708a extends C25239c<MVTaxiFabPresentation> {
        public C10708a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiFabPresentation mVTaxiFabPresentation = (MVTaxiFabPresentation) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTaxiFabPresentation.icon;
            C25113c cVar = MVTaxiFabPresentation.f28560b;
            gVar.mo61687K();
            if (mVTaxiFabPresentation.title != null && mVTaxiFabPresentation.mo32137g()) {
                gVar.mo61711x(MVTaxiFabPresentation.f28560b);
                gVar.mo61686J(mVTaxiFabPresentation.title);
                gVar.mo61712y();
            }
            if (mVTaxiFabPresentation.mo32138h()) {
                gVar.mo61711x(MVTaxiFabPresentation.f28561c);
                gVar.mo61678B(mVTaxiFabPresentation.titleColor);
                gVar.mo61712y();
            }
            if (mVTaxiFabPresentation.icon != null) {
                gVar.mo61711x(MVTaxiFabPresentation.f28562d);
                mVTaxiFabPresentation.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiFabPresentation mVTaxiFabPresentation = (MVTaxiFabPresentation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTaxiFabPresentation.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVTaxiFabPresentation.icon = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVTaxiFabPresentation.titleColor = gVar.mo61696i();
                        mVTaxiFabPresentation.mo32140i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTaxiFabPresentation.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation$b */
    public static class C10709b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10708a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation$c */
    public static class C10710c extends C25240d<MVTaxiFabPresentation> {
        public C10710c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiFabPresentation mVTaxiFabPresentation = (MVTaxiFabPresentation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiFabPresentation.mo32137g()) {
                bitSet.set(0);
            }
            if (mVTaxiFabPresentation.mo32138h()) {
                bitSet.set(1);
            }
            if (mVTaxiFabPresentation.mo32136f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTaxiFabPresentation.mo32137g()) {
                jVar.mo61686J(mVTaxiFabPresentation.title);
            }
            if (mVTaxiFabPresentation.mo32138h()) {
                jVar.mo61678B(mVTaxiFabPresentation.titleColor);
            }
            if (mVTaxiFabPresentation.mo32136f()) {
                mVTaxiFabPresentation.icon.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiFabPresentation mVTaxiFabPresentation = (MVTaxiFabPresentation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTaxiFabPresentation.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTaxiFabPresentation.titleColor = jVar.mo61696i();
                mVTaxiFabPresentation.mo32140i();
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTaxiFabPresentation.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiFabPresentation$d */
    public static class C10711d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10710c(0);
        }
    }

    static {
        new C17394d0("MVTaxiFabPresentation");
        HashMap hashMap = new HashMap();
        f28563e = hashMap;
        hashMap.put(C25239c.class, new C10709b());
        hashMap.put(C25240d.class, new C10711d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE_COLOR, new FieldMetaData("titleColor", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28564f = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiFabPresentation.class, unmodifiableMap);
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
        ((C25238b) f28563e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28563e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32133a(MVTaxiFabPresentation mVTaxiFabPresentation) {
        if (mVTaxiFabPresentation == null) {
            return false;
        }
        boolean g = mo32137g();
        boolean g2 = mVTaxiFabPresentation.mo32137g();
        if ((g || g2) && (!g || !g2 || !this.title.equals(mVTaxiFabPresentation.title))) {
            return false;
        }
        boolean h = mo32138h();
        boolean h2 = mVTaxiFabPresentation.mo32138h();
        if ((h || h2) && (!h || !h2 || this.titleColor != mVTaxiFabPresentation.titleColor)) {
            return false;
        }
        boolean f = mo32136f();
        boolean f2 = mVTaxiFabPresentation.mo32136f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.icon.mo26245a(mVTaxiFabPresentation.icon)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiFabPresentation mVTaxiFabPresentation = (MVTaxiFabPresentation) obj;
        if (!getClass().equals(mVTaxiFabPresentation.getClass())) {
            return getClass().getName().compareTo(mVTaxiFabPresentation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32137g()).compareTo(Boolean.valueOf(mVTaxiFabPresentation.mo32137g()));
        if (compareTo2 != 0 || ((mo32137g() && (compareTo2 = this.title.compareTo(mVTaxiFabPresentation.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32138h()).compareTo(Boolean.valueOf(mVTaxiFabPresentation.mo32138h()))) != 0 || ((mo32138h() && (compareTo2 = C25082a.m62839c(this.titleColor, mVTaxiFabPresentation.titleColor)) != 0) || (compareTo2 = Boolean.valueOf(mo32136f()).compareTo(Boolean.valueOf(mVTaxiFabPresentation.mo32136f()))) != 0))) {
            return compareTo2;
        }
        if (!mo32136f() || (compareTo = this.icon.compareTo(mVTaxiFabPresentation.icon)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiFabPresentation)) {
            return mo32133a((MVTaxiFabPresentation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32136f() {
        return this.icon != null;
    }

    /* renamed from: g */
    public final boolean mo32137g() {
        return this.title != null;
    }

    /* renamed from: h */
    public final boolean mo32138h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo32140i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVTaxiFabPresentation(");
        boolean z2 = false;
        if (mo32137g()) {
            sb.append("title:");
            String str = this.title;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo32138h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("titleColor:");
            sb.append(this.titleColor);
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("icon:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
        if (mVImageReferenceWithParams == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVImageReferenceWithParams);
        }
        sb.append(")");
        return sb.toString();
    }
}
