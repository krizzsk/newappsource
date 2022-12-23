package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVFilter implements TBase<MVFilter, _Fields>, Serializable, Cloneable, Comparable<MVFilter> {

    /* renamed from: b */
    public static final C25113c f28721b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28722c = new C25113c("value", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28723d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28724e;
    public String title;
    public String value;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        VALUE(2, "value");
        
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
            if (i != 2) {
                return null;
            }
            return VALUE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVFilter$a */
    public static class C10807a extends C25239c<MVFilter> {
        public C10807a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFilter mVFilter = (MVFilter) tBase;
            mVFilter.getClass();
            C25113c cVar = MVFilter.f28721b;
            gVar.mo61687K();
            if (mVFilter.title != null) {
                gVar.mo61711x(MVFilter.f28721b);
                gVar.mo61686J(mVFilter.title);
                gVar.mo61712y();
            }
            if (mVFilter.value != null) {
                gVar.mo61711x(MVFilter.f28722c);
                gVar.mo61686J(mVFilter.value);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFilter mVFilter = (MVFilter) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVFilter.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVFilter.value = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVFilter.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVFilter$b */
    public static class C10808b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10807a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVFilter$c */
    public static class C10809c extends C25240d<MVFilter> {
        public C10809c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFilter mVFilter = (MVFilter) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVFilter.mo32402f()) {
                bitSet.set(0);
            }
            if (mVFilter.mo32403g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVFilter.mo32402f()) {
                jVar.mo61686J(mVFilter.title);
            }
            if (mVFilter.mo32403g()) {
                jVar.mo61686J(mVFilter.value);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFilter mVFilter = (MVFilter) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVFilter.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVFilter.value = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVFilter$d */
    public static class C10810d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10809c(0);
        }
    }

    static {
        new C17394d0("MVFilter");
        HashMap hashMap = new HashMap();
        f28723d = hashMap;
        hashMap.put(C25239c.class, new C10808b());
        hashMap.put(C25240d.class, new C10810d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VALUE, new FieldMetaData("value", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28724e = unmodifiableMap;
        FieldMetaData.m61947a(MVFilter.class, unmodifiableMap);
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
        ((C25238b) f28723d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28723d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVFilter mVFilter = (MVFilter) obj;
        if (!getClass().equals(mVFilter.getClass())) {
            return getClass().getName().compareTo(mVFilter.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32402f()).compareTo(Boolean.valueOf(mVFilter.mo32402f()));
        if (compareTo2 != 0 || ((mo32402f() && (compareTo2 = this.title.compareTo(mVFilter.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32403g()).compareTo(Boolean.valueOf(mVFilter.mo32403g()))) != 0)) {
            return compareTo2;
        }
        if (!mo32403g() || (compareTo = this.value.compareTo(mVFilter.value)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVFilter)) {
            return false;
        }
        MVFilter mVFilter = (MVFilter) obj;
        boolean f = mo32402f();
        boolean f2 = mVFilter.mo32402f();
        if ((f || f2) && (!f || !f2 || !this.title.equals(mVFilter.title))) {
            return false;
        }
        boolean g = mo32403g();
        boolean g2 = mVFilter.mo32403g();
        if ((g || g2) && (!g || !g2 || !this.value.equals(mVFilter.value))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32402f() {
        return this.title != null;
    }

    /* renamed from: g */
    public final boolean mo32403g() {
        return this.value != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVFilter(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("value:");
        String str2 = this.value;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
