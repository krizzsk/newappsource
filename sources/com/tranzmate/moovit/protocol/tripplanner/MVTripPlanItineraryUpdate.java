package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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

public class MVTripPlanItineraryUpdate implements TBase<MVTripPlanItineraryUpdate, _Fields>, Serializable, Cloneable, Comparable<MVTripPlanItineraryUpdate> {

    /* renamed from: b */
    public static final C25113c f30111b = new C25113c("guid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30112c = new C25113c("totalTicketPrice", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f30113d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30114e;
    public String guid;
    private _Fields[] optionals = {_Fields.TOTAL_TICKET_PRICE};
    public MVCurrencyAmount totalTicketPrice;

    public enum _Fields implements C25085c {
        GUID(1, "guid"),
        TOTAL_TICKET_PRICE(2, "totalTicketPrice");
        
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
                return GUID;
            }
            if (i != 2) {
                return null;
            }
            return TOTAL_TICKET_PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItineraryUpdate$a */
    public static class C11655a extends C25239c<MVTripPlanItineraryUpdate> {
        public C11655a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanItineraryUpdate mVTripPlanItineraryUpdate = (MVTripPlanItineraryUpdate) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTripPlanItineraryUpdate.totalTicketPrice;
            C25113c cVar = MVTripPlanItineraryUpdate.f30111b;
            gVar.mo61687K();
            if (mVTripPlanItineraryUpdate.guid != null) {
                gVar.mo61711x(MVTripPlanItineraryUpdate.f30111b);
                gVar.mo61686J(mVTripPlanItineraryUpdate.guid);
                gVar.mo61712y();
            }
            if (mVTripPlanItineraryUpdate.totalTicketPrice != null && mVTripPlanItineraryUpdate.mo34650g()) {
                gVar.mo61711x(MVTripPlanItineraryUpdate.f30112c);
                mVTripPlanItineraryUpdate.totalTicketPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanItineraryUpdate mVTripPlanItineraryUpdate = (MVTripPlanItineraryUpdate) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTripPlanItineraryUpdate.totalTicketPrice;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVTripPlanItineraryUpdate.totalTicketPrice = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTripPlanItineraryUpdate.guid = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItineraryUpdate$b */
    public static class C11656b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11655a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItineraryUpdate$c */
    public static class C11657c extends C25240d<MVTripPlanItineraryUpdate> {
        public C11657c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanItineraryUpdate mVTripPlanItineraryUpdate = (MVTripPlanItineraryUpdate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripPlanItineraryUpdate.mo34649f()) {
                bitSet.set(0);
            }
            if (mVTripPlanItineraryUpdate.mo34650g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTripPlanItineraryUpdate.mo34649f()) {
                jVar.mo61686J(mVTripPlanItineraryUpdate.guid);
            }
            if (mVTripPlanItineraryUpdate.mo34650g()) {
                mVTripPlanItineraryUpdate.totalTicketPrice.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripPlanItineraryUpdate mVTripPlanItineraryUpdate = (MVTripPlanItineraryUpdate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTripPlanItineraryUpdate.guid = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTripPlanItineraryUpdate.totalTicketPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItineraryUpdate$d */
    public static class C11658d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11657c(0);
        }
    }

    static {
        new C17394d0("MVTripPlanItineraryUpdate");
        HashMap hashMap = new HashMap();
        f30113d = hashMap;
        hashMap.put(C25239c.class, new C11656b());
        hashMap.put(C25240d.class, new C11658d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GUID, new FieldMetaData("guid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TOTAL_TICKET_PRICE, new FieldMetaData("totalTicketPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30114e = unmodifiableMap;
        FieldMetaData.m61947a(MVTripPlanItineraryUpdate.class, unmodifiableMap);
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
        ((C25238b) f30113d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30113d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripPlanItineraryUpdate mVTripPlanItineraryUpdate = (MVTripPlanItineraryUpdate) obj;
        if (!getClass().equals(mVTripPlanItineraryUpdate.getClass())) {
            return getClass().getName().compareTo(mVTripPlanItineraryUpdate.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34649f()).compareTo(Boolean.valueOf(mVTripPlanItineraryUpdate.mo34649f()));
        if (compareTo2 != 0 || ((mo34649f() && (compareTo2 = this.guid.compareTo(mVTripPlanItineraryUpdate.guid)) != 0) || (compareTo2 = Boolean.valueOf(mo34650g()).compareTo(Boolean.valueOf(mVTripPlanItineraryUpdate.mo34650g()))) != 0)) {
            return compareTo2;
        }
        if (!mo34650g() || (compareTo = this.totalTicketPrice.compareTo(mVTripPlanItineraryUpdate.totalTicketPrice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripPlanItineraryUpdate)) {
            return false;
        }
        MVTripPlanItineraryUpdate mVTripPlanItineraryUpdate = (MVTripPlanItineraryUpdate) obj;
        boolean f = mo34649f();
        boolean f2 = mVTripPlanItineraryUpdate.mo34649f();
        if ((f || f2) && (!f || !f2 || !this.guid.equals(mVTripPlanItineraryUpdate.guid))) {
            return false;
        }
        boolean g = mo34650g();
        boolean g2 = mVTripPlanItineraryUpdate.mo34650g();
        if ((g || g2) && (!g || !g2 || !this.totalTicketPrice.mo26102a(mVTripPlanItineraryUpdate.totalTicketPrice))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34649f() {
        return this.guid != null;
    }

    /* renamed from: g */
    public final boolean mo34650g() {
        return this.totalTicketPrice != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripPlanItineraryUpdate(", "guid:");
        String str = this.guid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo34650g()) {
            n.append(", ");
            n.append("totalTicketPrice:");
            MVCurrencyAmount mVCurrencyAmount = this.totalTicketPrice;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        n.append(")");
        return n.toString();
    }
}
