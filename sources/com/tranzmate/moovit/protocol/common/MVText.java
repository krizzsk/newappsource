package com.tranzmate.moovit.protocol.common;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVText implements TBase<MVText, _Fields>, Serializable, Cloneable, Comparable<MVText> {

    /* renamed from: b */
    public static final C25113c f25146b = new C25113c("data", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25147c = new C25113c("format", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25148d = new C25113c("baseUrl", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25149e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25150f;
    public String baseUrl;
    public String data;
    public MVTextFormat format;
    private _Fields[] optionals = {_Fields.BASE_URL};

    public enum _Fields implements C25085c {
        DATA(1, "data"),
        FORMAT(2, "format"),
        BASE_URL(3, "baseUrl");
        
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
                return DATA;
            }
            if (i == 2) {
                return FORMAT;
            }
            if (i != 3) {
                return null;
            }
            return BASE_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVText$a */
    public static class C8496a extends C25239c<MVText> {
        public C8496a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVText mVText = (MVText) tBase;
            mVText.getClass();
            C25113c cVar = MVText.f25146b;
            gVar.mo61687K();
            if (mVText.data != null) {
                gVar.mo61711x(MVText.f25146b);
                gVar.mo61686J(mVText.data);
                gVar.mo61712y();
            }
            if (mVText.format != null) {
                gVar.mo61711x(MVText.f25147c);
                gVar.mo61678B(mVText.format.getValue());
                gVar.mo61712y();
            }
            if (mVText.baseUrl != null && mVText.mo26405f()) {
                gVar.mo61711x(MVText.f25148d);
                gVar.mo61686J(mVText.baseUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVText mVText = (MVText) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVText.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVText.baseUrl = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVText.format = MVTextFormat.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVText.data = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVText$b */
    public static class C8497b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8496a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVText$c */
    public static class C8498c extends C25240d<MVText> {
        public C8498c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVText mVText = (MVText) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVText.mo26406g()) {
                bitSet.set(0);
            }
            if (mVText.mo26407h()) {
                bitSet.set(1);
            }
            if (mVText.mo26405f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVText.mo26406g()) {
                jVar.mo61686J(mVText.data);
            }
            if (mVText.mo26407h()) {
                jVar.mo61678B(mVText.format.getValue());
            }
            if (mVText.mo26405f()) {
                jVar.mo61686J(mVText.baseUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVText mVText = (MVText) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVText.data = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVText.format = MVTextFormat.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVText.baseUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVText$d */
    public static class C8499d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8498c(0);
        }
    }

    static {
        new C17394d0("MVText");
        HashMap hashMap = new HashMap();
        f25149e = hashMap;
        hashMap.put(C25239c.class, new C8497b());
        hashMap.put(C25240d.class, new C8499d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FORMAT, new FieldMetaData("format", (byte) 3, new EnumMetaData(MVTextFormat.class)));
        enumMap.put(_Fields.BASE_URL, new FieldMetaData("baseUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25150f = unmodifiableMap;
        FieldMetaData.m61947a(MVText.class, unmodifiableMap);
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
        ((C25238b) f25149e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25149e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26402a(MVText mVText) {
        if (mVText == null) {
            return false;
        }
        boolean g = mo26406g();
        boolean g2 = mVText.mo26406g();
        if ((g || g2) && (!g || !g2 || !this.data.equals(mVText.data))) {
            return false;
        }
        boolean h = mo26407h();
        boolean h2 = mVText.mo26407h();
        if ((h || h2) && (!h || !h2 || !this.format.equals(mVText.format))) {
            return false;
        }
        boolean f = mo26405f();
        boolean f2 = mVText.mo26405f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.baseUrl.equals(mVText.baseUrl)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVText mVText = (MVText) obj;
        if (!getClass().equals(mVText.getClass())) {
            return getClass().getName().compareTo(mVText.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26406g()).compareTo(Boolean.valueOf(mVText.mo26406g()));
        if (compareTo2 != 0 || ((mo26406g() && (compareTo2 = this.data.compareTo(mVText.data)) != 0) || (compareTo2 = Boolean.valueOf(mo26407h()).compareTo(Boolean.valueOf(mVText.mo26407h()))) != 0 || ((mo26407h() && (compareTo2 = this.format.compareTo(mVText.format)) != 0) || (compareTo2 = Boolean.valueOf(mo26405f()).compareTo(Boolean.valueOf(mVText.mo26405f()))) != 0))) {
            return compareTo2;
        }
        if (!mo26405f() || (compareTo = this.baseUrl.compareTo(mVText.baseUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVText)) {
            return mo26402a((MVText) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26405f() {
        return this.baseUrl != null;
    }

    /* renamed from: g */
    public final boolean mo26406g() {
        return this.data != null;
    }

    /* renamed from: h */
    public final boolean mo26407h() {
        return this.format != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVText(", "data:");
        String str = this.data;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("format:");
        MVTextFormat mVTextFormat = this.format;
        if (mVTextFormat == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTextFormat);
        }
        if (mo26405f()) {
            n.append(", ");
            n.append("baseUrl:");
            String str2 = this.baseUrl;
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
