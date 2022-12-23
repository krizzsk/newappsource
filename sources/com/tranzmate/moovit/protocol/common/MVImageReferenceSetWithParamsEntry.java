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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
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

public class MVImageReferenceSetWithParamsEntry implements TBase<MVImageReferenceSetWithParamsEntry, _Fields>, Serializable, Cloneable, Comparable<MVImageReferenceSetWithParamsEntry> {

    /* renamed from: b */
    public static final C25113c f25052b = new C25113c("index", (byte) 6, 1);

    /* renamed from: c */
    public static final C25113c f25053c = new C25113c("imageRef", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f25054d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25055e;
    private byte __isset_bitfield = 0;
    public MVImageReferenceWithParams imageRef;
    public short index;

    public enum _Fields implements C25085c {
        INDEX(1, "index"),
        IMAGE_REF(2, "imageRef");
        
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
                return INDEX;
            }
            if (i != 2) {
                return null;
            }
            return IMAGE_REF;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParamsEntry$a */
    public static class C8432a extends C25239c<MVImageReferenceSetWithParamsEntry> {
        public C8432a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceSetWithParamsEntry mVImageReferenceSetWithParamsEntry = (MVImageReferenceSetWithParamsEntry) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVImageReferenceSetWithParamsEntry.imageRef;
            C25113c cVar = MVImageReferenceSetWithParamsEntry.f25052b;
            gVar.mo61687K();
            gVar.mo61711x(MVImageReferenceSetWithParamsEntry.f25052b);
            gVar.mo61677A(mVImageReferenceSetWithParamsEntry.index);
            gVar.mo61712y();
            if (mVImageReferenceSetWithParamsEntry.imageRef != null) {
                gVar.mo61711x(MVImageReferenceSetWithParamsEntry.f25053c);
                mVImageReferenceSetWithParamsEntry.imageRef.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceSetWithParamsEntry mVImageReferenceSetWithParamsEntry = (MVImageReferenceSetWithParamsEntry) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVImageReferenceSetWithParamsEntry.imageRef;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVImageReferenceSetWithParamsEntry.imageRef = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 6) {
                    mVImageReferenceSetWithParamsEntry.index = gVar.mo61695h();
                    mVImageReferenceSetWithParamsEntry.mo26241h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParamsEntry$b */
    public static class C8433b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8432a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParamsEntry$c */
    public static class C8434c extends C25240d<MVImageReferenceSetWithParamsEntry> {
        public C8434c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceSetWithParamsEntry mVImageReferenceSetWithParamsEntry = (MVImageReferenceSetWithParamsEntry) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVImageReferenceSetWithParamsEntry.mo26240g()) {
                bitSet.set(0);
            }
            if (mVImageReferenceSetWithParamsEntry.mo26239f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVImageReferenceSetWithParamsEntry.mo26240g()) {
                jVar.mo61677A(mVImageReferenceSetWithParamsEntry.index);
            }
            if (mVImageReferenceSetWithParamsEntry.mo26239f()) {
                mVImageReferenceSetWithParamsEntry.imageRef.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceSetWithParamsEntry mVImageReferenceSetWithParamsEntry = (MVImageReferenceSetWithParamsEntry) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVImageReferenceSetWithParamsEntry.index = jVar.mo61695h();
                mVImageReferenceSetWithParamsEntry.mo26241h();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVImageReferenceSetWithParamsEntry.imageRef = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParamsEntry$d */
    public static class C8435d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8434c(0);
        }
    }

    static {
        new C17394d0("MVImageReferenceSetWithParamsEntry");
        HashMap hashMap = new HashMap();
        f25054d = hashMap;
        hashMap.put(C25239c.class, new C8433b());
        hashMap.put(C25240d.class, new C8435d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.INDEX, new FieldMetaData("index", (byte) 3, new FieldValueMetaData((byte) 6, false)));
        enumMap.put(_Fields.IMAGE_REF, new FieldMetaData("imageRef", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25055e = unmodifiableMap;
        FieldMetaData.m61947a(MVImageReferenceSetWithParamsEntry.class, unmodifiableMap);
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
        ((C25238b) f25054d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25054d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVImageReferenceSetWithParamsEntry mVImageReferenceSetWithParamsEntry = (MVImageReferenceSetWithParamsEntry) obj;
        if (!getClass().equals(mVImageReferenceSetWithParamsEntry.getClass())) {
            return getClass().getName().compareTo(mVImageReferenceSetWithParamsEntry.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26240g()).compareTo(Boolean.valueOf(mVImageReferenceSetWithParamsEntry.mo26240g()));
        if (compareTo2 != 0 || ((mo26240g() && (compareTo2 = C25082a.m62847k(this.index, mVImageReferenceSetWithParamsEntry.index)) != 0) || (compareTo2 = Boolean.valueOf(mo26239f()).compareTo(Boolean.valueOf(mVImageReferenceSetWithParamsEntry.mo26239f()))) != 0)) {
            return compareTo2;
        }
        if (!mo26239f() || (compareTo = this.imageRef.compareTo(mVImageReferenceSetWithParamsEntry.imageRef)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVImageReferenceSetWithParamsEntry)) {
            return false;
        }
        MVImageReferenceSetWithParamsEntry mVImageReferenceSetWithParamsEntry = (MVImageReferenceSetWithParamsEntry) obj;
        if (this.index != mVImageReferenceSetWithParamsEntry.index) {
            return false;
        }
        boolean f = mo26239f();
        boolean f2 = mVImageReferenceSetWithParamsEntry.mo26239f();
        if ((f || f2) && (!f || !f2 || !this.imageRef.mo26245a(mVImageReferenceSetWithParamsEntry.imageRef))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26239f() {
        return this.imageRef != null;
    }

    /* renamed from: g */
    public final boolean mo26240g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo26241h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVImageReferenceSetWithParamsEntry(", "index:");
        C0016g.m42z(n, this.index, ", ", "imageRef:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.imageRef;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(")");
        return n.toString();
    }
}
