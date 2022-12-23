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

public class MVAdInterstitialCreativeHtml implements TBase<MVAdInterstitialCreativeHtml, _Fields>, Serializable, Cloneable, Comparable<MVAdInterstitialCreativeHtml> {

    /* renamed from: b */
    public static final C25113c f25511b = new C25113c("html", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25512c = new C25113c("redirectCloseUrl", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f25513d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25514e;
    public String html;
    public String redirectCloseUrl;

    public enum _Fields implements C25085c {
        HTML(1, "html"),
        REDIRECT_CLOSE_URL(2, "redirectCloseUrl");
        
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdInterstitialCreativeHtml$a */
    public static class C8641a extends C25239c<MVAdInterstitialCreativeHtml> {
        public C8641a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAdInterstitialCreativeHtml mVAdInterstitialCreativeHtml = (MVAdInterstitialCreativeHtml) tBase;
            mVAdInterstitialCreativeHtml.getClass();
            C25113c cVar = MVAdInterstitialCreativeHtml.f25511b;
            gVar.mo61687K();
            if (mVAdInterstitialCreativeHtml.html != null) {
                gVar.mo61711x(MVAdInterstitialCreativeHtml.f25511b);
                gVar.mo61686J(mVAdInterstitialCreativeHtml.html);
                gVar.mo61712y();
            }
            if (mVAdInterstitialCreativeHtml.redirectCloseUrl != null) {
                gVar.mo61711x(MVAdInterstitialCreativeHtml.f25512c);
                gVar.mo61686J(mVAdInterstitialCreativeHtml.redirectCloseUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAdInterstitialCreativeHtml mVAdInterstitialCreativeHtml = (MVAdInterstitialCreativeHtml) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAdInterstitialCreativeHtml.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVAdInterstitialCreativeHtml.redirectCloseUrl = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAdInterstitialCreativeHtml.html = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdInterstitialCreativeHtml$b */
    public static class C8642b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8641a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdInterstitialCreativeHtml$c */
    public static class C8643c extends C25240d<MVAdInterstitialCreativeHtml> {
        public C8643c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAdInterstitialCreativeHtml mVAdInterstitialCreativeHtml = (MVAdInterstitialCreativeHtml) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAdInterstitialCreativeHtml.mo27015f()) {
                bitSet.set(0);
            }
            if (mVAdInterstitialCreativeHtml.mo27016g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAdInterstitialCreativeHtml.mo27015f()) {
                jVar.mo61686J(mVAdInterstitialCreativeHtml.html);
            }
            if (mVAdInterstitialCreativeHtml.mo27016g()) {
                jVar.mo61686J(mVAdInterstitialCreativeHtml.redirectCloseUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAdInterstitialCreativeHtml mVAdInterstitialCreativeHtml = (MVAdInterstitialCreativeHtml) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVAdInterstitialCreativeHtml.html = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVAdInterstitialCreativeHtml.redirectCloseUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdInterstitialCreativeHtml$d */
    public static class C8644d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8643c(0);
        }
    }

    static {
        new C17394d0("MVAdInterstitialCreativeHtml");
        HashMap hashMap = new HashMap();
        f25513d = hashMap;
        hashMap.put(C25239c.class, new C8642b());
        hashMap.put(C25240d.class, new C8644d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.HTML, new FieldMetaData("html", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REDIRECT_CLOSE_URL, new FieldMetaData("redirectCloseUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25514e = unmodifiableMap;
        FieldMetaData.m61947a(MVAdInterstitialCreativeHtml.class, unmodifiableMap);
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
        ((C25238b) f25513d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25513d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAdInterstitialCreativeHtml mVAdInterstitialCreativeHtml = (MVAdInterstitialCreativeHtml) obj;
        if (!getClass().equals(mVAdInterstitialCreativeHtml.getClass())) {
            return getClass().getName().compareTo(mVAdInterstitialCreativeHtml.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27015f()).compareTo(Boolean.valueOf(mVAdInterstitialCreativeHtml.mo27015f()));
        if (compareTo2 != 0 || ((mo27015f() && (compareTo2 = this.html.compareTo(mVAdInterstitialCreativeHtml.html)) != 0) || (compareTo2 = Boolean.valueOf(mo27016g()).compareTo(Boolean.valueOf(mVAdInterstitialCreativeHtml.mo27016g()))) != 0)) {
            return compareTo2;
        }
        if (!mo27016g() || (compareTo = this.redirectCloseUrl.compareTo(mVAdInterstitialCreativeHtml.redirectCloseUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAdInterstitialCreativeHtml)) {
            return false;
        }
        MVAdInterstitialCreativeHtml mVAdInterstitialCreativeHtml = (MVAdInterstitialCreativeHtml) obj;
        boolean f = mo27015f();
        boolean f2 = mVAdInterstitialCreativeHtml.mo27015f();
        if ((f || f2) && (!f || !f2 || !this.html.equals(mVAdInterstitialCreativeHtml.html))) {
            return false;
        }
        boolean g = mo27016g();
        boolean g2 = mVAdInterstitialCreativeHtml.mo27016g();
        if ((g || g2) && (!g || !g2 || !this.redirectCloseUrl.equals(mVAdInterstitialCreativeHtml.redirectCloseUrl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27015f() {
        return this.html != null;
    }

    /* renamed from: g */
    public final boolean mo27016g() {
        return this.redirectCloseUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAdInterstitialCreativeHtml(", "html:");
        String str = this.html;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("redirectCloseUrl:");
        String str2 = this.redirectCloseUrl;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
