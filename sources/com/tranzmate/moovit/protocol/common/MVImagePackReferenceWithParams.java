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
import org.apache.thrift.meta_data.FieldMetaData;
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

public class MVImagePackReferenceWithParams implements TBase<MVImagePackReferenceWithParams, _Fields>, Serializable, Cloneable, Comparable<MVImagePackReferenceWithParams> {

    /* renamed from: b */
    public static final C25113c f25038b = new C25113c("ltr", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f25039c = new C25113c("rtl", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f25040d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25041e;
    public MVImageReferenceWithParams ltr;
    public MVImageReferenceWithParams rtl;

    public enum _Fields implements C25085c {
        LTR(1, "ltr"),
        RTL(2, "rtl");
        
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
                return LTR;
            }
            if (i != 2) {
                return null;
            }
            return RTL;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImagePackReferenceWithParams$a */
    public static class C8416a extends C25239c<MVImagePackReferenceWithParams> {
        public C8416a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImagePackReferenceWithParams mVImagePackReferenceWithParams = (MVImagePackReferenceWithParams) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVImagePackReferenceWithParams.ltr;
            C25113c cVar = MVImagePackReferenceWithParams.f25038b;
            gVar.mo61687K();
            if (mVImagePackReferenceWithParams.ltr != null) {
                gVar.mo61711x(MVImagePackReferenceWithParams.f25038b);
                mVImagePackReferenceWithParams.ltr.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVImagePackReferenceWithParams.rtl != null) {
                gVar.mo61711x(MVImagePackReferenceWithParams.f25039c);
                mVImagePackReferenceWithParams.rtl.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImagePackReferenceWithParams mVImagePackReferenceWithParams = (MVImagePackReferenceWithParams) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVImagePackReferenceWithParams.ltr;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVImagePackReferenceWithParams.rtl = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams3 = new MVImageReferenceWithParams();
                    mVImagePackReferenceWithParams.ltr = mVImageReferenceWithParams3;
                    mVImageReferenceWithParams3.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImagePackReferenceWithParams$b */
    public static class C8417b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8416a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImagePackReferenceWithParams$c */
    public static class C8418c extends C25240d<MVImagePackReferenceWithParams> {
        public C8418c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImagePackReferenceWithParams mVImagePackReferenceWithParams = (MVImagePackReferenceWithParams) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVImagePackReferenceWithParams.mo26209f()) {
                bitSet.set(0);
            }
            if (mVImagePackReferenceWithParams.mo26210g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVImagePackReferenceWithParams.mo26209f()) {
                mVImagePackReferenceWithParams.ltr.mo25202X0(jVar);
            }
            if (mVImagePackReferenceWithParams.mo26210g()) {
                mVImagePackReferenceWithParams.rtl.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImagePackReferenceWithParams mVImagePackReferenceWithParams = (MVImagePackReferenceWithParams) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVImagePackReferenceWithParams.ltr = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                mVImagePackReferenceWithParams.rtl = mVImageReferenceWithParams2;
                mVImageReferenceWithParams2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImagePackReferenceWithParams$d */
    public static class C8419d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8418c(0);
        }
    }

    static {
        new C17394d0("MVImagePackReferenceWithParams");
        HashMap hashMap = new HashMap();
        f25040d = hashMap;
        hashMap.put(C25239c.class, new C8417b());
        hashMap.put(C25240d.class, new C8419d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LTR, new FieldMetaData("ltr", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.RTL, new FieldMetaData("rtl", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25041e = unmodifiableMap;
        FieldMetaData.m61947a(MVImagePackReferenceWithParams.class, unmodifiableMap);
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
        ((C25238b) f25040d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25040d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26206a(MVImagePackReferenceWithParams mVImagePackReferenceWithParams) {
        if (mVImagePackReferenceWithParams == null) {
            return false;
        }
        boolean f = mo26209f();
        boolean f2 = mVImagePackReferenceWithParams.mo26209f();
        if ((f || f2) && (!f || !f2 || !this.ltr.mo26245a(mVImagePackReferenceWithParams.ltr))) {
            return false;
        }
        boolean g = mo26210g();
        boolean g2 = mVImagePackReferenceWithParams.mo26210g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.rtl.mo26245a(mVImagePackReferenceWithParams.rtl)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVImagePackReferenceWithParams mVImagePackReferenceWithParams = (MVImagePackReferenceWithParams) obj;
        if (!getClass().equals(mVImagePackReferenceWithParams.getClass())) {
            return getClass().getName().compareTo(mVImagePackReferenceWithParams.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26209f()).compareTo(Boolean.valueOf(mVImagePackReferenceWithParams.mo26209f()));
        if (compareTo2 != 0 || ((mo26209f() && (compareTo2 = this.ltr.compareTo(mVImagePackReferenceWithParams.ltr)) != 0) || (compareTo2 = Boolean.valueOf(mo26210g()).compareTo(Boolean.valueOf(mVImagePackReferenceWithParams.mo26210g()))) != 0)) {
            return compareTo2;
        }
        if (!mo26210g() || (compareTo = this.rtl.compareTo(mVImagePackReferenceWithParams.rtl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVImagePackReferenceWithParams)) {
            return mo26206a((MVImagePackReferenceWithParams) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26209f() {
        return this.ltr != null;
    }

    /* renamed from: g */
    public final boolean mo26210g() {
        return this.rtl != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVImagePackReferenceWithParams(", "ltr:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.ltr;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("rtl:");
        MVImageReferenceWithParams mVImageReferenceWithParams2 = this.rtl;
        if (mVImageReferenceWithParams2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams2);
        }
        n.append(")");
        return n.toString();
    }
}
