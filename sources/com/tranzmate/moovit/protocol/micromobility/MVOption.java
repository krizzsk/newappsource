package com.tranzmate.moovit.protocol.micromobility;

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

public class MVOption implements TBase<MVOption, _Fields>, Serializable, Cloneable, Comparable<MVOption> {

    /* renamed from: b */
    public static final C25113c f26774b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26775c = new C25113c("value", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f26776d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26777e;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVOption$a */
    public static class C9372a extends C25239c<MVOption> {
        public C9372a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVOption mVOption = (MVOption) tBase;
            mVOption.getClass();
            C25113c cVar = MVOption.f26774b;
            gVar.mo61687K();
            if (mVOption.title != null) {
                gVar.mo61711x(MVOption.f26774b);
                gVar.mo61686J(mVOption.title);
                gVar.mo61712y();
            }
            if (mVOption.value != null) {
                gVar.mo61711x(MVOption.f26775c);
                gVar.mo61686J(mVOption.value);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVOption mVOption = (MVOption) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVOption.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVOption.value = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVOption.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVOption$b */
    public static class C9373b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9372a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVOption$c */
    public static class C9374c extends C25240d<MVOption> {
        public C9374c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVOption mVOption = (MVOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVOption.mo29058f()) {
                bitSet.set(0);
            }
            if (mVOption.mo29059g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVOption.mo29058f()) {
                jVar.mo61686J(mVOption.title);
            }
            if (mVOption.mo29059g()) {
                jVar.mo61686J(mVOption.value);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVOption mVOption = (MVOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVOption.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVOption.value = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVOption$d */
    public static class C9375d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9374c(0);
        }
    }

    static {
        new C17394d0("MVOption");
        HashMap hashMap = new HashMap();
        f26776d = hashMap;
        hashMap.put(C25239c.class, new C9373b());
        hashMap.put(C25240d.class, new C9375d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VALUE, new FieldMetaData("value", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26777e = unmodifiableMap;
        FieldMetaData.m61947a(MVOption.class, unmodifiableMap);
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
        ((C25238b) f26776d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26776d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVOption mVOption = (MVOption) obj;
        if (!getClass().equals(mVOption.getClass())) {
            return getClass().getName().compareTo(mVOption.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29058f()).compareTo(Boolean.valueOf(mVOption.mo29058f()));
        if (compareTo2 != 0 || ((mo29058f() && (compareTo2 = this.title.compareTo(mVOption.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29059g()).compareTo(Boolean.valueOf(mVOption.mo29059g()))) != 0)) {
            return compareTo2;
        }
        if (!mo29059g() || (compareTo = this.value.compareTo(mVOption.value)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVOption)) {
            return false;
        }
        MVOption mVOption = (MVOption) obj;
        boolean f = mo29058f();
        boolean f2 = mVOption.mo29058f();
        if ((f || f2) && (!f || !f2 || !this.title.equals(mVOption.title))) {
            return false;
        }
        boolean g = mo29059g();
        boolean g2 = mVOption.mo29059g();
        if ((g || g2) && (!g || !g2 || !this.value.equals(mVOption.value))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29058f() {
        return this.title != null;
    }

    /* renamed from: g */
    public final boolean mo29059g() {
        return this.value != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVOption(", "title:");
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
