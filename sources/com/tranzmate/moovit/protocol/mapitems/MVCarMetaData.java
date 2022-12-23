package com.tranzmate.moovit.protocol.mapitems;

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

public class MVCarMetaData implements TBase<MVCarMetaData, _Fields>, Serializable, Cloneable, Comparable<MVCarMetaData> {

    /* renamed from: b */
    public static final C25113c f26210b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f26211c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26212d;

    /* renamed from: id */
    public String f26213id;

    public enum _Fields implements C25085c {
        ID(1, "id");
        
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
            if (i != 1) {
                return null;
            }
            return ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCarMetaData$a */
    public static class C9036a extends C25239c<MVCarMetaData> {
        public C9036a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarMetaData mVCarMetaData = (MVCarMetaData) tBase;
            mVCarMetaData.getClass();
            C25113c cVar = MVCarMetaData.f26210b;
            gVar.mo61687K();
            if (mVCarMetaData.f26213id != null) {
                gVar.mo61711x(MVCarMetaData.f26210b);
                gVar.mo61686J(mVCarMetaData.f26213id);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarMetaData mVCarMetaData = (MVCarMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarMetaData.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVCarMetaData.f26213id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCarMetaData$b */
    public static class C9037b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9036a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCarMetaData$c */
    public static class C9038c extends C25240d<MVCarMetaData> {
        public C9038c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarMetaData mVCarMetaData = (MVCarMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarMetaData.mo28167f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVCarMetaData.mo28167f()) {
                jVar.mo61686J(mVCarMetaData.f26213id);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarMetaData mVCarMetaData = (MVCarMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVCarMetaData.f26213id = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCarMetaData$d */
    public static class C9039d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9038c(0);
        }
    }

    static {
        new C17394d0("MVCarMetaData");
        HashMap hashMap = new HashMap();
        f26211c = hashMap;
        hashMap.put(C25239c.class, new C9037b());
        hashMap.put(C25240d.class, new C9039d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26212d = unmodifiableMap;
        FieldMetaData.m61947a(MVCarMetaData.class, unmodifiableMap);
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
        ((C25238b) f26211c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26211c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCarMetaData mVCarMetaData = (MVCarMetaData) obj;
        if (!getClass().equals(mVCarMetaData.getClass())) {
            return getClass().getName().compareTo(mVCarMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28167f()).compareTo(Boolean.valueOf(mVCarMetaData.mo28167f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo28167f() || (compareTo = this.f26213id.compareTo(mVCarMetaData.f26213id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCarMetaData)) {
            return false;
        }
        MVCarMetaData mVCarMetaData = (MVCarMetaData) obj;
        boolean f = mo28167f();
        boolean f2 = mVCarMetaData.mo28167f();
        if ((f || f2) && (!f || !f2 || !this.f26213id.equals(mVCarMetaData.f26213id))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28167f() {
        return this.f26213id != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarMetaData(", "id:");
        String str = this.f26213id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
