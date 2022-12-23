package com.tranzmate.moovit.protocol.directsales;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVMapItemAdCreativeHtml implements TBase<MVMapItemAdCreativeHtml, _Fields>, Serializable, Cloneable, Comparable<MVMapItemAdCreativeHtml> {

    /* renamed from: b */
    public static final C25113c f25572b = new C25113c("html", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25573c = new C25113c("size", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25574d = new C25113c("redirectCloseUrl", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25575e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25576f;
    public String html;
    private _Fields[] optionals = {_Fields.REDIRECT_CLOSE_URL};
    public String redirectCloseUrl;
    public MVAdSize size;

    public enum _Fields implements C25085c {
        HTML(1, "html"),
        SIZE(2, "size"),
        REDIRECT_CLOSE_URL(3, "redirectCloseUrl");
        
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
                return HTML;
            }
            if (i == 2) {
                return SIZE;
            }
            if (i != 3) {
                return null;
            }
            return REDIRECT_CLOSE_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVMapItemAdCreativeHtml$a */
    public static class C8690a extends C25239c<MVMapItemAdCreativeHtml> {
        public C8690a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMapItemAdCreativeHtml mVMapItemAdCreativeHtml = (MVMapItemAdCreativeHtml) tBase;
            MVAdSize mVAdSize = mVMapItemAdCreativeHtml.size;
            C25113c cVar = MVMapItemAdCreativeHtml.f25572b;
            gVar.mo61687K();
            if (mVMapItemAdCreativeHtml.html != null) {
                gVar.mo61711x(MVMapItemAdCreativeHtml.f25572b);
                gVar.mo61686J(mVMapItemAdCreativeHtml.html);
                gVar.mo61712y();
            }
            if (mVMapItemAdCreativeHtml.size != null) {
                gVar.mo61711x(MVMapItemAdCreativeHtml.f25573c);
                mVMapItemAdCreativeHtml.size.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMapItemAdCreativeHtml.redirectCloseUrl != null && mVMapItemAdCreativeHtml.mo27115g()) {
                gVar.mo61711x(MVMapItemAdCreativeHtml.f25574d);
                gVar.mo61686J(mVMapItemAdCreativeHtml.redirectCloseUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMapItemAdCreativeHtml mVMapItemAdCreativeHtml = (MVMapItemAdCreativeHtml) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVAdSize mVAdSize = mVMapItemAdCreativeHtml.size;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVMapItemAdCreativeHtml.redirectCloseUrl = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVAdSize mVAdSize2 = new MVAdSize();
                        mVMapItemAdCreativeHtml.size = mVAdSize2;
                        mVAdSize2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMapItemAdCreativeHtml.html = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVMapItemAdCreativeHtml$b */
    public static class C8691b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8690a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVMapItemAdCreativeHtml$c */
    public static class C8692c extends C25240d<MVMapItemAdCreativeHtml> {
        public C8692c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMapItemAdCreativeHtml mVMapItemAdCreativeHtml = (MVMapItemAdCreativeHtml) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMapItemAdCreativeHtml.mo27114f()) {
                bitSet.set(0);
            }
            if (mVMapItemAdCreativeHtml.mo27116h()) {
                bitSet.set(1);
            }
            if (mVMapItemAdCreativeHtml.mo27115g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMapItemAdCreativeHtml.mo27114f()) {
                jVar.mo61686J(mVMapItemAdCreativeHtml.html);
            }
            if (mVMapItemAdCreativeHtml.mo27116h()) {
                mVMapItemAdCreativeHtml.size.mo25202X0(jVar);
            }
            if (mVMapItemAdCreativeHtml.mo27115g()) {
                jVar.mo61686J(mVMapItemAdCreativeHtml.redirectCloseUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMapItemAdCreativeHtml mVMapItemAdCreativeHtml = (MVMapItemAdCreativeHtml) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVMapItemAdCreativeHtml.html = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVAdSize mVAdSize = new MVAdSize();
                mVMapItemAdCreativeHtml.size = mVAdSize;
                mVAdSize.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVMapItemAdCreativeHtml.redirectCloseUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVMapItemAdCreativeHtml$d */
    public static class C8693d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8692c(0);
        }
    }

    static {
        new C17394d0("MVMapItemAdCreativeHtml");
        HashMap hashMap = new HashMap();
        f25575e = hashMap;
        hashMap.put(C25239c.class, new C8691b());
        hashMap.put(C25240d.class, new C8693d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.HTML, new FieldMetaData("html", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SIZE, new FieldMetaData("size", (byte) 3, new StructMetaData(MVAdSize.class)));
        enumMap.put(_Fields.REDIRECT_CLOSE_URL, new FieldMetaData("redirectCloseUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25576f = unmodifiableMap;
        FieldMetaData.m61947a(MVMapItemAdCreativeHtml.class, unmodifiableMap);
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
        ((C25238b) f25575e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25575e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMapItemAdCreativeHtml mVMapItemAdCreativeHtml = (MVMapItemAdCreativeHtml) obj;
        if (!getClass().equals(mVMapItemAdCreativeHtml.getClass())) {
            return getClass().getName().compareTo(mVMapItemAdCreativeHtml.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27114f()).compareTo(Boolean.valueOf(mVMapItemAdCreativeHtml.mo27114f()));
        if (compareTo2 != 0 || ((mo27114f() && (compareTo2 = this.html.compareTo(mVMapItemAdCreativeHtml.html)) != 0) || (compareTo2 = Boolean.valueOf(mo27116h()).compareTo(Boolean.valueOf(mVMapItemAdCreativeHtml.mo27116h()))) != 0 || ((mo27116h() && (compareTo2 = this.size.compareTo(mVMapItemAdCreativeHtml.size)) != 0) || (compareTo2 = Boolean.valueOf(mo27115g()).compareTo(Boolean.valueOf(mVMapItemAdCreativeHtml.mo27115g()))) != 0))) {
            return compareTo2;
        }
        if (!mo27115g() || (compareTo = this.redirectCloseUrl.compareTo(mVMapItemAdCreativeHtml.redirectCloseUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMapItemAdCreativeHtml)) {
            return false;
        }
        MVMapItemAdCreativeHtml mVMapItemAdCreativeHtml = (MVMapItemAdCreativeHtml) obj;
        boolean f = mo27114f();
        boolean f2 = mVMapItemAdCreativeHtml.mo27114f();
        if ((f || f2) && (!f || !f2 || !this.html.equals(mVMapItemAdCreativeHtml.html))) {
            return false;
        }
        boolean h = mo27116h();
        boolean h2 = mVMapItemAdCreativeHtml.mo27116h();
        if ((h || h2) && (!h || !h2 || !this.size.mo27020a(mVMapItemAdCreativeHtml.size))) {
            return false;
        }
        boolean g = mo27115g();
        boolean g2 = mVMapItemAdCreativeHtml.mo27115g();
        if ((g || g2) && (!g || !g2 || !this.redirectCloseUrl.equals(mVMapItemAdCreativeHtml.redirectCloseUrl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27114f() {
        return this.html != null;
    }

    /* renamed from: g */
    public final boolean mo27115g() {
        return this.redirectCloseUrl != null;
    }

    /* renamed from: h */
    public final boolean mo27116h() {
        return this.size != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMapItemAdCreativeHtml(", "html:");
        String str = this.html;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("size:");
        MVAdSize mVAdSize = this.size;
        if (mVAdSize == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAdSize);
        }
        if (mo27115g()) {
            n.append(", ");
            n.append("redirectCloseUrl:");
            String str2 = this.redirectCloseUrl;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
