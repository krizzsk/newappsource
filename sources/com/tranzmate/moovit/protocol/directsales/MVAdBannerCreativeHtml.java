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

public class MVAdBannerCreativeHtml implements TBase<MVAdBannerCreativeHtml, _Fields>, Serializable, Cloneable, Comparable<MVAdBannerCreativeHtml> {

    /* renamed from: b */
    public static final C25113c f25503b = new C25113c("html", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25504c = new C25113c("size", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f25505d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25506e;
    public String html;
    public MVAdSize size;

    public enum _Fields implements C25085c {
        HTML(1, "html"),
        SIZE(2, "size");
        
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
            if (i != 2) {
                return null;
            }
            return SIZE;
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdBannerCreativeHtml$a */
    public static class C8636a extends C25239c<MVAdBannerCreativeHtml> {
        public C8636a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAdBannerCreativeHtml mVAdBannerCreativeHtml = (MVAdBannerCreativeHtml) tBase;
            MVAdSize mVAdSize = mVAdBannerCreativeHtml.size;
            C25113c cVar = MVAdBannerCreativeHtml.f25503b;
            gVar.mo61687K();
            if (mVAdBannerCreativeHtml.html != null) {
                gVar.mo61711x(MVAdBannerCreativeHtml.f25503b);
                gVar.mo61686J(mVAdBannerCreativeHtml.html);
                gVar.mo61712y();
            }
            if (mVAdBannerCreativeHtml.size != null) {
                gVar.mo61711x(MVAdBannerCreativeHtml.f25504c);
                mVAdBannerCreativeHtml.size.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAdBannerCreativeHtml mVAdBannerCreativeHtml = (MVAdBannerCreativeHtml) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVAdSize mVAdSize = mVAdBannerCreativeHtml.size;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVAdSize mVAdSize2 = new MVAdSize();
                        mVAdBannerCreativeHtml.size = mVAdSize2;
                        mVAdSize2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAdBannerCreativeHtml.html = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdBannerCreativeHtml$b */
    public static class C8637b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8636a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdBannerCreativeHtml$c */
    public static class C8638c extends C25240d<MVAdBannerCreativeHtml> {
        public C8638c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAdBannerCreativeHtml mVAdBannerCreativeHtml = (MVAdBannerCreativeHtml) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAdBannerCreativeHtml.mo27004f()) {
                bitSet.set(0);
            }
            if (mVAdBannerCreativeHtml.mo27005g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAdBannerCreativeHtml.mo27004f()) {
                jVar.mo61686J(mVAdBannerCreativeHtml.html);
            }
            if (mVAdBannerCreativeHtml.mo27005g()) {
                mVAdBannerCreativeHtml.size.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAdBannerCreativeHtml mVAdBannerCreativeHtml = (MVAdBannerCreativeHtml) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVAdBannerCreativeHtml.html = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVAdSize mVAdSize = new MVAdSize();
                mVAdBannerCreativeHtml.size = mVAdSize;
                mVAdSize.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdBannerCreativeHtml$d */
    public static class C8639d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8638c(0);
        }
    }

    static {
        new C17394d0("MVAdBannerCreativeHtml");
        HashMap hashMap = new HashMap();
        f25505d = hashMap;
        hashMap.put(C25239c.class, new C8637b());
        hashMap.put(C25240d.class, new C8639d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.HTML, new FieldMetaData("html", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SIZE, new FieldMetaData("size", (byte) 3, new StructMetaData(MVAdSize.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25506e = unmodifiableMap;
        FieldMetaData.m61947a(MVAdBannerCreativeHtml.class, unmodifiableMap);
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
        ((C25238b) f25505d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25505d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAdBannerCreativeHtml mVAdBannerCreativeHtml = (MVAdBannerCreativeHtml) obj;
        if (!getClass().equals(mVAdBannerCreativeHtml.getClass())) {
            return getClass().getName().compareTo(mVAdBannerCreativeHtml.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27004f()).compareTo(Boolean.valueOf(mVAdBannerCreativeHtml.mo27004f()));
        if (compareTo2 != 0 || ((mo27004f() && (compareTo2 = this.html.compareTo(mVAdBannerCreativeHtml.html)) != 0) || (compareTo2 = Boolean.valueOf(mo27005g()).compareTo(Boolean.valueOf(mVAdBannerCreativeHtml.mo27005g()))) != 0)) {
            return compareTo2;
        }
        if (!mo27005g() || (compareTo = this.size.compareTo(mVAdBannerCreativeHtml.size)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAdBannerCreativeHtml)) {
            return false;
        }
        MVAdBannerCreativeHtml mVAdBannerCreativeHtml = (MVAdBannerCreativeHtml) obj;
        boolean f = mo27004f();
        boolean f2 = mVAdBannerCreativeHtml.mo27004f();
        if ((f || f2) && (!f || !f2 || !this.html.equals(mVAdBannerCreativeHtml.html))) {
            return false;
        }
        boolean g = mo27005g();
        boolean g2 = mVAdBannerCreativeHtml.mo27005g();
        if ((g || g2) && (!g || !g2 || !this.size.mo27020a(mVAdBannerCreativeHtml.size))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27004f() {
        return this.html != null;
    }

    /* renamed from: g */
    public final boolean mo27005g() {
        return this.size != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAdBannerCreativeHtml(", "html:");
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
        n.append(")");
        return n.toString();
    }
}
