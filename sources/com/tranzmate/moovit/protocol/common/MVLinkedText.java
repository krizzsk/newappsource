package com.tranzmate.moovit.protocol.common;

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

public class MVLinkedText implements TBase<MVLinkedText, _Fields>, Serializable, Cloneable, Comparable<MVLinkedText> {

    /* renamed from: b */
    public static final C25113c f25081b = new C25113c("format", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25082c = new C25113c("links", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f25083d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25084e;
    public String format;
    public List<MVLinkedTextLink> links;

    public enum _Fields implements C25085c {
        FORMAT(1, "format"),
        LINKS(2, "links");
        
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
                return FORMAT;
            }
            if (i != 2) {
                return null;
            }
            return LINKS;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLinkedText$a */
    public static class C8460a extends C25239c<MVLinkedText> {
        public C8460a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLinkedText mVLinkedText = (MVLinkedText) tBase;
            mVLinkedText.getClass();
            C25113c cVar = MVLinkedText.f25081b;
            gVar.mo61687K();
            if (mVLinkedText.format != null) {
                gVar.mo61711x(MVLinkedText.f25081b);
                gVar.mo61686J(mVLinkedText.format);
                gVar.mo61712y();
            }
            if (mVLinkedText.links != null) {
                gVar.mo61711x(MVLinkedText.f25082c);
                gVar.mo61680D(new C25119e((byte) 12, mVLinkedText.links.size()));
                for (MVLinkedTextLink X0 : mVLinkedText.links) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLinkedText mVLinkedText = (MVLinkedText) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLinkedText.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVLinkedText.links = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVLinkedTextLink mVLinkedTextLink = new MVLinkedTextLink();
                            mVLinkedTextLink.mo25201C1(gVar);
                            mVLinkedText.links.add(mVLinkedTextLink);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVLinkedText.format = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLinkedText$b */
    public static class C8461b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8460a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLinkedText$c */
    public static class C8462c extends C25240d<MVLinkedText> {
        public C8462c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLinkedText mVLinkedText = (MVLinkedText) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLinkedText.mo26304f()) {
                bitSet.set(0);
            }
            if (mVLinkedText.mo26305g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVLinkedText.mo26304f()) {
                jVar.mo61686J(mVLinkedText.format);
            }
            if (mVLinkedText.mo26305g()) {
                jVar.mo61678B(mVLinkedText.links.size());
                for (MVLinkedTextLink X0 : mVLinkedText.links) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLinkedText mVLinkedText = (MVLinkedText) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVLinkedText.format = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVLinkedText.links = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLinkedTextLink mVLinkedTextLink = new MVLinkedTextLink();
                    mVLinkedTextLink.mo25201C1(jVar);
                    mVLinkedText.links.add(mVLinkedTextLink);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVLinkedText$d */
    public static class C8463d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8462c(0);
        }
    }

    static {
        new C17394d0("MVLinkedText");
        HashMap hashMap = new HashMap();
        f25083d = hashMap;
        hashMap.put(C25239c.class, new C8461b());
        hashMap.put(C25240d.class, new C8463d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FORMAT, new FieldMetaData("format", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LINKS, new FieldMetaData("links", (byte) 3, new ListMetaData(new StructMetaData(MVLinkedTextLink.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25084e = unmodifiableMap;
        FieldMetaData.m61947a(MVLinkedText.class, unmodifiableMap);
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
        ((C25238b) f25083d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25083d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26301a(MVLinkedText mVLinkedText) {
        if (mVLinkedText == null) {
            return false;
        }
        boolean f = mo26304f();
        boolean f2 = mVLinkedText.mo26304f();
        if ((f || f2) && (!f || !f2 || !this.format.equals(mVLinkedText.format))) {
            return false;
        }
        boolean g = mo26305g();
        boolean g2 = mVLinkedText.mo26305g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.links.equals(mVLinkedText.links)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVLinkedText mVLinkedText = (MVLinkedText) obj;
        if (!getClass().equals(mVLinkedText.getClass())) {
            return getClass().getName().compareTo(mVLinkedText.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26304f()).compareTo(Boolean.valueOf(mVLinkedText.mo26304f()));
        if (compareTo != 0 || ((mo26304f() && (compareTo = this.format.compareTo(mVLinkedText.format)) != 0) || (compareTo = Boolean.valueOf(mo26305g()).compareTo(Boolean.valueOf(mVLinkedText.mo26305g()))) != 0)) {
            return compareTo;
        }
        if (!mo26305g() || (h = C25082a.m62844h(this.links, mVLinkedText.links)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLinkedText)) {
            return mo26301a((MVLinkedText) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26304f() {
        return this.format != null;
    }

    /* renamed from: g */
    public final boolean mo26305g() {
        return this.links != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLinkedText(", "format:");
        String str = this.format;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("links:");
        List<MVLinkedTextLink> list = this.links;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
