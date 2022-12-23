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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVDirectAdCategoryMetaData implements TBase<MVDirectAdCategoryMetaData, _Fields>, Serializable, Cloneable, Comparable<MVDirectAdCategoryMetaData> {

    /* renamed from: b */
    public static final C25113c f26259b = new C25113c("targeting", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f26260c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26261d;
    private _Fields[] optionals = {_Fields.TARGETING};
    public MVDirectAdTargeting targeting;

    public enum _Fields implements C25085c {
        TARGETING(1, "targeting");
        
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
            return TARGETING;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdCategoryMetaData$a */
    public static class C9065a extends C25239c<MVDirectAdCategoryMetaData> {
        public C9065a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdCategoryMetaData mVDirectAdCategoryMetaData = (MVDirectAdCategoryMetaData) tBase;
            MVDirectAdTargeting mVDirectAdTargeting = mVDirectAdCategoryMetaData.targeting;
            C25113c cVar = MVDirectAdCategoryMetaData.f26259b;
            gVar.mo61687K();
            if (mVDirectAdCategoryMetaData.targeting != null && mVDirectAdCategoryMetaData.mo28237f()) {
                gVar.mo61711x(MVDirectAdCategoryMetaData.f26259b);
                mVDirectAdCategoryMetaData.targeting.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdCategoryMetaData mVDirectAdCategoryMetaData = (MVDirectAdCategoryMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVDirectAdTargeting mVDirectAdTargeting = mVDirectAdCategoryMetaData.targeting;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVDirectAdTargeting mVDirectAdTargeting2 = new MVDirectAdTargeting();
                    mVDirectAdCategoryMetaData.targeting = mVDirectAdTargeting2;
                    mVDirectAdTargeting2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdCategoryMetaData$b */
    public static class C9066b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9065a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdCategoryMetaData$c */
    public static class C9067c extends C25240d<MVDirectAdCategoryMetaData> {
        public C9067c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdCategoryMetaData mVDirectAdCategoryMetaData = (MVDirectAdCategoryMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDirectAdCategoryMetaData.mo28237f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVDirectAdCategoryMetaData.mo28237f()) {
                mVDirectAdCategoryMetaData.targeting.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdCategoryMetaData mVDirectAdCategoryMetaData = (MVDirectAdCategoryMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVDirectAdTargeting mVDirectAdTargeting = new MVDirectAdTargeting();
                mVDirectAdCategoryMetaData.targeting = mVDirectAdTargeting;
                mVDirectAdTargeting.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdCategoryMetaData$d */
    public static class C9068d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9067c(0);
        }
    }

    static {
        new C17394d0("MVDirectAdCategoryMetaData");
        HashMap hashMap = new HashMap();
        f26260c = hashMap;
        hashMap.put(C25239c.class, new C9066b());
        hashMap.put(C25240d.class, new C9068d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TARGETING, new FieldMetaData("targeting", (byte) 2, new StructMetaData(MVDirectAdTargeting.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26261d = unmodifiableMap;
        FieldMetaData.m61947a(MVDirectAdCategoryMetaData.class, unmodifiableMap);
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
        ((C25238b) f26260c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26260c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDirectAdCategoryMetaData mVDirectAdCategoryMetaData = (MVDirectAdCategoryMetaData) obj;
        if (!getClass().equals(mVDirectAdCategoryMetaData.getClass())) {
            return getClass().getName().compareTo(mVDirectAdCategoryMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28237f()).compareTo(Boolean.valueOf(mVDirectAdCategoryMetaData.mo28237f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo28237f() || (compareTo = this.targeting.compareTo(mVDirectAdCategoryMetaData.targeting)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDirectAdCategoryMetaData)) {
            return false;
        }
        MVDirectAdCategoryMetaData mVDirectAdCategoryMetaData = (MVDirectAdCategoryMetaData) obj;
        boolean f = mo28237f();
        boolean f2 = mVDirectAdCategoryMetaData.mo28237f();
        if ((f || f2) && (!f || !f2 || !this.targeting.mo28249a(mVDirectAdCategoryMetaData.targeting))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28237f() {
        return this.targeting != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVDirectAdCategoryMetaData(");
        if (mo28237f()) {
            sb.append("targeting:");
            MVDirectAdTargeting mVDirectAdTargeting = this.targeting;
            if (mVDirectAdTargeting == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVDirectAdTargeting);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
