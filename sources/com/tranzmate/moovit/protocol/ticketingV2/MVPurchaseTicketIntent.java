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

public class MVPurchaseTicketIntent implements TBase<MVPurchaseTicketIntent, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseTicketIntent> {

    /* renamed from: b */
    public static final C25113c f29063b = new C25113c("agencyKey", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f29064c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29065d;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketIntent$a */
    public static class C11005a extends C25239c<MVPurchaseTicketIntent> {
        public C11005a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketIntent mVPurchaseTicketIntent = (MVPurchaseTicketIntent) tBase;
            mVPurchaseTicketIntent.getClass();
            C25113c cVar = MVPurchaseTicketIntent.f29063b;
            gVar.mo61687K();
            if (mVPurchaseTicketIntent.agencyKey != null && mVPurchaseTicketIntent.mo32888f()) {
                gVar.mo61711x(MVPurchaseTicketIntent.f29063b);
                gVar.mo61686J(mVPurchaseTicketIntent.agencyKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketIntent mVPurchaseTicketIntent = (MVPurchaseTicketIntent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseTicketIntent.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVPurchaseTicketIntent.agencyKey = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketIntent$b */
    public static class C11006b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11005a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketIntent$c */
    public static class C11007c extends C25240d<MVPurchaseTicketIntent> {
        public C11007c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketIntent mVPurchaseTicketIntent = (MVPurchaseTicketIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseTicketIntent.mo32888f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPurchaseTicketIntent.mo32888f()) {
                jVar.mo61686J(mVPurchaseTicketIntent.agencyKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTicketIntent mVPurchaseTicketIntent = (MVPurchaseTicketIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVPurchaseTicketIntent.agencyKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketIntent$d */
    public static class C11008d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11007c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseTicketIntent");
        HashMap hashMap = new HashMap();
        f29064c = hashMap;
        hashMap.put(C25239c.class, new C11006b());
        hashMap.put(C25240d.class, new C11008d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29065d = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseTicketIntent.class, unmodifiableMap);
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
        ((C25238b) f29064c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29064c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseTicketIntent mVPurchaseTicketIntent = (MVPurchaseTicketIntent) obj;
        if (!getClass().equals(mVPurchaseTicketIntent.getClass())) {
            return getClass().getName().compareTo(mVPurchaseTicketIntent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32888f()).compareTo(Boolean.valueOf(mVPurchaseTicketIntent.mo32888f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo32888f() || (compareTo = this.agencyKey.compareTo(mVPurchaseTicketIntent.agencyKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseTicketIntent)) {
            return false;
        }
        MVPurchaseTicketIntent mVPurchaseTicketIntent = (MVPurchaseTicketIntent) obj;
        boolean f = mo32888f();
        boolean f2 = mVPurchaseTicketIntent.mo32888f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseTicketIntent.agencyKey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32888f() {
        return this.agencyKey != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVPurchaseTicketIntent(");
        if (mo32888f()) {
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
