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

public class MVPurchaseStoredValueIntent implements TBase<MVPurchaseStoredValueIntent, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseStoredValueIntent> {

    /* renamed from: b */
    public static final C25113c f28976b = new C25113c("agencyKey", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f28977c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28978d;
    public String agencyKey;
    private _Fields[] optionals = {_Fields.AGENCY_KEY};

    public enum _Fields implements C25085c {
        AGENCY_KEY(1, "agencyKey");
        
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
            return AGENCY_KEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueIntent$a */
    public static class C10963a extends C25239c<MVPurchaseStoredValueIntent> {
        public C10963a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueIntent mVPurchaseStoredValueIntent = (MVPurchaseStoredValueIntent) tBase;
            mVPurchaseStoredValueIntent.getClass();
            C25113c cVar = MVPurchaseStoredValueIntent.f28976b;
            gVar.mo61687K();
            if (mVPurchaseStoredValueIntent.agencyKey != null && mVPurchaseStoredValueIntent.mo32778f()) {
                gVar.mo61711x(MVPurchaseStoredValueIntent.f28976b);
                gVar.mo61686J(mVPurchaseStoredValueIntent.agencyKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueIntent mVPurchaseStoredValueIntent = (MVPurchaseStoredValueIntent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseStoredValueIntent.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVPurchaseStoredValueIntent.agencyKey = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueIntent$b */
    public static class C10964b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10963a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueIntent$c */
    public static class C10965c extends C25240d<MVPurchaseStoredValueIntent> {
        public C10965c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueIntent mVPurchaseStoredValueIntent = (MVPurchaseStoredValueIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseStoredValueIntent.mo32778f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPurchaseStoredValueIntent.mo32778f()) {
                jVar.mo61686J(mVPurchaseStoredValueIntent.agencyKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseStoredValueIntent mVPurchaseStoredValueIntent = (MVPurchaseStoredValueIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVPurchaseStoredValueIntent.agencyKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueIntent$d */
    public static class C10966d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10965c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseStoredValueIntent");
        HashMap hashMap = new HashMap();
        f28977c = hashMap;
        hashMap.put(C25239c.class, new C10964b());
        hashMap.put(C25240d.class, new C10966d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28978d = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseStoredValueIntent.class, unmodifiableMap);
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
        ((C25238b) f28977c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28977c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseStoredValueIntent mVPurchaseStoredValueIntent = (MVPurchaseStoredValueIntent) obj;
        if (!getClass().equals(mVPurchaseStoredValueIntent.getClass())) {
            return getClass().getName().compareTo(mVPurchaseStoredValueIntent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32778f()).compareTo(Boolean.valueOf(mVPurchaseStoredValueIntent.mo32778f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo32778f() || (compareTo = this.agencyKey.compareTo(mVPurchaseStoredValueIntent.agencyKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseStoredValueIntent)) {
            return false;
        }
        MVPurchaseStoredValueIntent mVPurchaseStoredValueIntent = (MVPurchaseStoredValueIntent) obj;
        boolean f = mo32778f();
        boolean f2 = mVPurchaseStoredValueIntent.mo32778f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseStoredValueIntent.agencyKey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32778f() {
        return this.agencyKey != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVPurchaseStoredValueIntent(");
        if (mo32778f()) {
            sb.append("agencyKey:");
            String str = this.agencyKey;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
