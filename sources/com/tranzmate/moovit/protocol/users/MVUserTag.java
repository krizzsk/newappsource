package com.tranzmate.moovit.protocol.users;

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

public class MVUserTag implements TBase<MVUserTag, _Fields>, Serializable, Cloneable, Comparable<MVUserTag> {

    /* renamed from: b */
    public static final C25113c f30659b = new C25113c(LinksConfiguration.KEY_KEY, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30660c = new C25113c(LinksConfiguration.KEY_VALUES, (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f30661d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30662e;
    public String key;
    public List<String> values;

    public enum _Fields implements C25085c {
        KEY(1, LinksConfiguration.KEY_KEY),
        VALUES(2, LinksConfiguration.KEY_VALUES);
        
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
                return KEY;
            }
            if (i != 2) {
                return null;
            }
            return VALUES;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserTag$a */
    public static class C11997a extends C25239c<MVUserTag> {
        public C11997a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserTag mVUserTag = (MVUserTag) tBase;
            mVUserTag.getClass();
            C25113c cVar = MVUserTag.f30659b;
            gVar.mo61687K();
            if (mVUserTag.key != null) {
                gVar.mo61711x(MVUserTag.f30659b);
                gVar.mo61686J(mVUserTag.key);
                gVar.mo61712y();
            }
            if (mVUserTag.values != null) {
                gVar.mo61711x(MVUserTag.f30660c);
                gVar.mo61680D(new C25119e((byte) 11, mVUserTag.values.size()));
                for (String J : mVUserTag.values) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserTag mVUserTag = (MVUserTag) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserTag.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVUserTag.values = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVUserTag.values.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVUserTag.key = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserTag$b */
    public static class C11998b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11997a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserTag$c */
    public static class C11999c extends C25240d<MVUserTag> {
        public C11999c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserTag mVUserTag = (MVUserTag) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserTag.mo35576f()) {
                bitSet.set(0);
            }
            if (mVUserTag.mo35577g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVUserTag.mo35576f()) {
                jVar.mo61686J(mVUserTag.key);
            }
            if (mVUserTag.mo35577g()) {
                jVar.mo61678B(mVUserTag.values.size());
                for (String J : mVUserTag.values) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserTag mVUserTag = (MVUserTag) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVUserTag.key = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVUserTag.values = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVUserTag.values.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserTag$d */
    public static class C12000d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11999c(0);
        }
    }

    static {
        new C17394d0("MVUserTag");
        HashMap hashMap = new HashMap();
        f30661d = hashMap;
        hashMap.put(C25239c.class, new C11998b());
        hashMap.put(C25240d.class, new C12000d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.KEY, new FieldMetaData(LinksConfiguration.KEY_KEY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VALUES, new FieldMetaData(LinksConfiguration.KEY_VALUES, (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30662e = unmodifiableMap;
        FieldMetaData.m61947a(MVUserTag.class, unmodifiableMap);
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
        ((C25238b) f30661d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30661d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVUserTag mVUserTag = (MVUserTag) obj;
        if (!getClass().equals(mVUserTag.getClass())) {
            return getClass().getName().compareTo(mVUserTag.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35576f()).compareTo(Boolean.valueOf(mVUserTag.mo35576f()));
        if (compareTo != 0 || ((mo35576f() && (compareTo = this.key.compareTo(mVUserTag.key)) != 0) || (compareTo = Boolean.valueOf(mo35577g()).compareTo(Boolean.valueOf(mVUserTag.mo35577g()))) != 0)) {
            return compareTo;
        }
        if (!mo35577g() || (h = C25082a.m62844h(this.values, mVUserTag.values)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUserTag)) {
            return false;
        }
        MVUserTag mVUserTag = (MVUserTag) obj;
        boolean f = mo35576f();
        boolean f2 = mVUserTag.mo35576f();
        if ((f || f2) && (!f || !f2 || !this.key.equals(mVUserTag.key))) {
            return false;
        }
        boolean g = mo35577g();
        boolean g2 = mVUserTag.mo35577g();
        if ((g || g2) && (!g || !g2 || !this.values.equals(mVUserTag.values))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35576f() {
        return this.key != null;
    }

    /* renamed from: g */
    public final boolean mo35577g() {
        return this.values != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserTag(", "key:");
        String str = this.key;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("values:");
        List<String> list = this.values;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
