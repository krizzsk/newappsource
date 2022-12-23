package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVPurchaseItineraryIntent implements TBase<MVPurchaseItineraryIntent, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseItineraryIntent> {

    /* renamed from: b */
    public static final C25113c f28870b = new C25113c("legs", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28871c = new C25113c("tripPlanItineraryGuid", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28872d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28873e;
    public List<MVPurchaseItineraryLeg> legs;
    public String tripPlanItineraryGuid;

    public enum _Fields implements C25085c {
        LEGS(1, "legs"),
        TRIP_PLAN_ITINERARY_GUID(2, "tripPlanItineraryGuid");
        
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
                return LEGS;
            }
            if (i != 2) {
                return null;
            }
            return TRIP_PLAN_ITINERARY_GUID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryIntent$a */
    public static class C10903a extends C25239c<MVPurchaseItineraryIntent> {
        public C10903a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryIntent mVPurchaseItineraryIntent = (MVPurchaseItineraryIntent) tBase;
            mVPurchaseItineraryIntent.getClass();
            C25113c cVar = MVPurchaseItineraryIntent.f28870b;
            gVar.mo61687K();
            if (mVPurchaseItineraryIntent.legs != null) {
                gVar.mo61711x(MVPurchaseItineraryIntent.f28870b);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseItineraryIntent.legs.size()));
                for (MVPurchaseItineraryLeg X0 : mVPurchaseItineraryIntent.legs) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryIntent.tripPlanItineraryGuid != null) {
                gVar.mo61711x(MVPurchaseItineraryIntent.f28871c);
                gVar.mo61686J(mVPurchaseItineraryIntent.tripPlanItineraryGuid);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryIntent mVPurchaseItineraryIntent = (MVPurchaseItineraryIntent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseItineraryIntent.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVPurchaseItineraryIntent.tripPlanItineraryGuid = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVPurchaseItineraryIntent.legs = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVPurchaseItineraryLeg mVPurchaseItineraryLeg = new MVPurchaseItineraryLeg();
                        mVPurchaseItineraryLeg.mo25201C1(gVar);
                        mVPurchaseItineraryIntent.legs.add(mVPurchaseItineraryLeg);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryIntent$b */
    public static class C10904b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10903a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryIntent$c */
    public static class C10905c extends C25240d<MVPurchaseItineraryIntent> {
        public C10905c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryIntent mVPurchaseItineraryIntent = (MVPurchaseItineraryIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseItineraryIntent.mo32622f()) {
                bitSet.set(0);
            }
            if (mVPurchaseItineraryIntent.mo32623g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPurchaseItineraryIntent.mo32622f()) {
                jVar.mo61678B(mVPurchaseItineraryIntent.legs.size());
                for (MVPurchaseItineraryLeg X0 : mVPurchaseItineraryIntent.legs) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseItineraryIntent.mo32623g()) {
                jVar.mo61686J(mVPurchaseItineraryIntent.tripPlanItineraryGuid);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryIntent mVPurchaseItineraryIntent = (MVPurchaseItineraryIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPurchaseItineraryIntent.legs = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPurchaseItineraryLeg mVPurchaseItineraryLeg = new MVPurchaseItineraryLeg();
                    mVPurchaseItineraryLeg.mo25201C1(jVar);
                    mVPurchaseItineraryIntent.legs.add(mVPurchaseItineraryLeg);
                }
            }
            if (T.get(1)) {
                mVPurchaseItineraryIntent.tripPlanItineraryGuid = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryIntent$d */
    public static class C10906d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10905c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseItineraryIntent");
        HashMap hashMap = new HashMap();
        f28872d = hashMap;
        hashMap.put(C25239c.class, new C10904b());
        hashMap.put(C25240d.class, new C10906d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LEGS, new FieldMetaData("legs", (byte) 3, new ListMetaData(new StructMetaData(MVPurchaseItineraryLeg.class))));
        enumMap.put(_Fields.TRIP_PLAN_ITINERARY_GUID, new FieldMetaData("tripPlanItineraryGuid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28873e = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseItineraryIntent.class, unmodifiableMap);
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
        ((C25238b) f28872d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28872d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseItineraryIntent mVPurchaseItineraryIntent = (MVPurchaseItineraryIntent) obj;
        if (!getClass().equals(mVPurchaseItineraryIntent.getClass())) {
            return getClass().getName().compareTo(mVPurchaseItineraryIntent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32622f()).compareTo(Boolean.valueOf(mVPurchaseItineraryIntent.mo32622f()));
        if (compareTo2 != 0 || ((mo32622f() && (compareTo2 = C25082a.m62844h(this.legs, mVPurchaseItineraryIntent.legs)) != 0) || (compareTo2 = Boolean.valueOf(mo32623g()).compareTo(Boolean.valueOf(mVPurchaseItineraryIntent.mo32623g()))) != 0)) {
            return compareTo2;
        }
        if (!mo32623g() || (compareTo = this.tripPlanItineraryGuid.compareTo(mVPurchaseItineraryIntent.tripPlanItineraryGuid)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseItineraryIntent)) {
            return false;
        }
        MVPurchaseItineraryIntent mVPurchaseItineraryIntent = (MVPurchaseItineraryIntent) obj;
        boolean f = mo32622f();
        boolean f2 = mVPurchaseItineraryIntent.mo32622f();
        if ((f || f2) && (!f || !f2 || !this.legs.equals(mVPurchaseItineraryIntent.legs))) {
            return false;
        }
        boolean g = mo32623g();
        boolean g2 = mVPurchaseItineraryIntent.mo32623g();
        if ((g || g2) && (!g || !g2 || !this.tripPlanItineraryGuid.equals(mVPurchaseItineraryIntent.tripPlanItineraryGuid))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32622f() {
        return this.legs != null;
    }

    /* renamed from: g */
    public final boolean mo32623g() {
        return this.tripPlanItineraryGuid != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseItineraryIntent(", "legs:");
        List<MVPurchaseItineraryLeg> list = this.legs;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("tripPlanItineraryGuid:");
        String str = this.tripPlanItineraryGuid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
