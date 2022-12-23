package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVPurchaseGenericIntent implements TBase<MVPurchaseGenericIntent, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseGenericIntent> {

    /* renamed from: b */
    public static final C25113c f28854b = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f28855c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28856d;
    public MVLatLon location;
    private _Fields[] optionals = {_Fields.LOCATION};

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        
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
            return LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseGenericIntent$a */
    public static class C10894a extends C25239c<MVPurchaseGenericIntent> {
        public C10894a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseGenericIntent mVPurchaseGenericIntent = (MVPurchaseGenericIntent) tBase;
            MVLatLon mVLatLon = mVPurchaseGenericIntent.location;
            C25113c cVar = MVPurchaseGenericIntent.f28854b;
            gVar.mo61687K();
            if (mVPurchaseGenericIntent.location != null && mVPurchaseGenericIntent.mo32605f()) {
                gVar.mo61711x(MVPurchaseGenericIntent.f28854b);
                mVPurchaseGenericIntent.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseGenericIntent mVPurchaseGenericIntent = (MVPurchaseGenericIntent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVPurchaseGenericIntent.location;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVLatLon mVLatLon2 = new MVLatLon();
                    mVPurchaseGenericIntent.location = mVLatLon2;
                    mVLatLon2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseGenericIntent$b */
    public static class C10895b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10894a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseGenericIntent$c */
    public static class C10896c extends C25240d<MVPurchaseGenericIntent> {
        public C10896c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseGenericIntent mVPurchaseGenericIntent = (MVPurchaseGenericIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseGenericIntent.mo32605f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPurchaseGenericIntent.mo32605f()) {
                mVPurchaseGenericIntent.location.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseGenericIntent mVPurchaseGenericIntent = (MVPurchaseGenericIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPurchaseGenericIntent.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseGenericIntent$d */
    public static class C10897d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10896c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseGenericIntent");
        HashMap hashMap = new HashMap();
        f28855c = hashMap;
        hashMap.put(C25239c.class, new C10895b());
        hashMap.put(C25240d.class, new C10897d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28856d = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseGenericIntent.class, unmodifiableMap);
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
        ((C25238b) f28855c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28855c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseGenericIntent mVPurchaseGenericIntent = (MVPurchaseGenericIntent) obj;
        if (!getClass().equals(mVPurchaseGenericIntent.getClass())) {
            return getClass().getName().compareTo(mVPurchaseGenericIntent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32605f()).compareTo(Boolean.valueOf(mVPurchaseGenericIntent.mo32605f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo32605f() || (compareTo = this.location.compareTo(mVPurchaseGenericIntent.location)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseGenericIntent)) {
            return false;
        }
        MVPurchaseGenericIntent mVPurchaseGenericIntent = (MVPurchaseGenericIntent) obj;
        boolean f = mo32605f();
        boolean f2 = mVPurchaseGenericIntent.mo32605f();
        if ((f || f2) && (!f || !f2 || !this.location.mo26290a(mVPurchaseGenericIntent.location))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32605f() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVPurchaseGenericIntent(");
        if (mo32605f()) {
            sb.append("location:");
            MVLatLon mVLatLon = this.location;
            if (mVLatLon == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVLatLon);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
