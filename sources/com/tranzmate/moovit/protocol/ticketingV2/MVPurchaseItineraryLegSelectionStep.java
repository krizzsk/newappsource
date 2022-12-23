package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.models.InAppMessageBase;
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

public class MVPurchaseItineraryLegSelectionStep implements TBase<MVPurchaseItineraryLegSelectionStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseItineraryLegSelectionStep> {

    /* renamed from: b */
    public static final C25113c f28887b = new C25113c("legs", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28888c = new C25113c(InAppMessageBase.MESSAGE, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28889d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f28890e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28891f;
    public List<MVPurchaseItineraryLegSelectionLegFare> legs;
    public String message;
    private _Fields[] optionals = {_Fields.MESSAGE};
    public String title;

    public enum _Fields implements C25085c {
        LEGS(1, "legs"),
        MESSAGE(2, InAppMessageBase.MESSAGE),
        TITLE(3, "title");
        
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
            if (i == 2) {
                return MESSAGE;
            }
            if (i != 3) {
                return null;
            }
            return TITLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionStep$a */
    public static class C10912a extends C25239c<MVPurchaseItineraryLegSelectionStep> {
        public C10912a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLegSelectionStep mVPurchaseItineraryLegSelectionStep = (MVPurchaseItineraryLegSelectionStep) tBase;
            mVPurchaseItineraryLegSelectionStep.getClass();
            C25113c cVar = MVPurchaseItineraryLegSelectionStep.f28887b;
            gVar.mo61687K();
            if (mVPurchaseItineraryLegSelectionStep.legs != null) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionStep.f28887b);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseItineraryLegSelectionStep.legs.size()));
                for (MVPurchaseItineraryLegSelectionLegFare X0 : mVPurchaseItineraryLegSelectionStep.legs) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryLegSelectionStep.message != null && mVPurchaseItineraryLegSelectionStep.mo32646g()) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionStep.f28888c);
                gVar.mo61686J(mVPurchaseItineraryLegSelectionStep.message);
                gVar.mo61712y();
            }
            if (mVPurchaseItineraryLegSelectionStep.title != null) {
                gVar.mo61711x(MVPurchaseItineraryLegSelectionStep.f28889d);
                gVar.mo61686J(mVPurchaseItineraryLegSelectionStep.title);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLegSelectionStep mVPurchaseItineraryLegSelectionStep = (MVPurchaseItineraryLegSelectionStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseItineraryLegSelectionStep.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPurchaseItineraryLegSelectionStep.title = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPurchaseItineraryLegSelectionStep.message = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVPurchaseItineraryLegSelectionStep.legs = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVPurchaseItineraryLegSelectionLegFare mVPurchaseItineraryLegSelectionLegFare = new MVPurchaseItineraryLegSelectionLegFare();
                        mVPurchaseItineraryLegSelectionLegFare.mo25201C1(gVar);
                        mVPurchaseItineraryLegSelectionStep.legs.add(mVPurchaseItineraryLegSelectionLegFare);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionStep$b */
    public static class C10913b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10912a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionStep$c */
    public static class C10914c extends C25240d<MVPurchaseItineraryLegSelectionStep> {
        public C10914c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLegSelectionStep mVPurchaseItineraryLegSelectionStep = (MVPurchaseItineraryLegSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseItineraryLegSelectionStep.mo32645f()) {
                bitSet.set(0);
            }
            if (mVPurchaseItineraryLegSelectionStep.mo32646g()) {
                bitSet.set(1);
            }
            if (mVPurchaseItineraryLegSelectionStep.mo32647h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPurchaseItineraryLegSelectionStep.mo32645f()) {
                jVar.mo61678B(mVPurchaseItineraryLegSelectionStep.legs.size());
                for (MVPurchaseItineraryLegSelectionLegFare X0 : mVPurchaseItineraryLegSelectionStep.legs) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseItineraryLegSelectionStep.mo32646g()) {
                jVar.mo61686J(mVPurchaseItineraryLegSelectionStep.message);
            }
            if (mVPurchaseItineraryLegSelectionStep.mo32647h()) {
                jVar.mo61686J(mVPurchaseItineraryLegSelectionStep.title);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLegSelectionStep mVPurchaseItineraryLegSelectionStep = (MVPurchaseItineraryLegSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPurchaseItineraryLegSelectionStep.legs = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPurchaseItineraryLegSelectionLegFare mVPurchaseItineraryLegSelectionLegFare = new MVPurchaseItineraryLegSelectionLegFare();
                    mVPurchaseItineraryLegSelectionLegFare.mo25201C1(jVar);
                    mVPurchaseItineraryLegSelectionStep.legs.add(mVPurchaseItineraryLegSelectionLegFare);
                }
            }
            if (T.get(1)) {
                mVPurchaseItineraryLegSelectionStep.message = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPurchaseItineraryLegSelectionStep.title = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionStep$d */
    public static class C10915d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10914c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseItineraryLegSelectionStep");
        HashMap hashMap = new HashMap();
        f28890e = hashMap;
        hashMap.put(C25239c.class, new C10913b());
        hashMap.put(C25240d.class, new C10915d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LEGS, new FieldMetaData("legs", (byte) 3, new ListMetaData(new StructMetaData(MVPurchaseItineraryLegSelectionLegFare.class))));
        enumMap.put(_Fields.MESSAGE, new FieldMetaData(InAppMessageBase.MESSAGE, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28891f = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseItineraryLegSelectionStep.class, unmodifiableMap);
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
        ((C25238b) f28890e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28890e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseItineraryLegSelectionStep mVPurchaseItineraryLegSelectionStep = (MVPurchaseItineraryLegSelectionStep) obj;
        if (!getClass().equals(mVPurchaseItineraryLegSelectionStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseItineraryLegSelectionStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32645f()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionStep.mo32645f()));
        if (compareTo2 != 0 || ((mo32645f() && (compareTo2 = C25082a.m62844h(this.legs, mVPurchaseItineraryLegSelectionStep.legs)) != 0) || (compareTo2 = Boolean.valueOf(mo32646g()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionStep.mo32646g()))) != 0 || ((mo32646g() && (compareTo2 = this.message.compareTo(mVPurchaseItineraryLegSelectionStep.message)) != 0) || (compareTo2 = Boolean.valueOf(mo32647h()).compareTo(Boolean.valueOf(mVPurchaseItineraryLegSelectionStep.mo32647h()))) != 0))) {
            return compareTo2;
        }
        if (!mo32647h() || (compareTo = this.title.compareTo(mVPurchaseItineraryLegSelectionStep.title)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseItineraryLegSelectionStep)) {
            return false;
        }
        MVPurchaseItineraryLegSelectionStep mVPurchaseItineraryLegSelectionStep = (MVPurchaseItineraryLegSelectionStep) obj;
        boolean f = mo32645f();
        boolean f2 = mVPurchaseItineraryLegSelectionStep.mo32645f();
        if ((f || f2) && (!f || !f2 || !this.legs.equals(mVPurchaseItineraryLegSelectionStep.legs))) {
            return false;
        }
        boolean g = mo32646g();
        boolean g2 = mVPurchaseItineraryLegSelectionStep.mo32646g();
        if ((g || g2) && (!g || !g2 || !this.message.equals(mVPurchaseItineraryLegSelectionStep.message))) {
            return false;
        }
        boolean h = mo32647h();
        boolean h2 = mVPurchaseItineraryLegSelectionStep.mo32647h();
        if ((h || h2) && (!h || !h2 || !this.title.equals(mVPurchaseItineraryLegSelectionStep.title))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32645f() {
        return this.legs != null;
    }

    /* renamed from: g */
    public final boolean mo32646g() {
        return this.message != null;
    }

    /* renamed from: h */
    public final boolean mo32647h() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseItineraryLegSelectionStep(", "legs:");
        List<MVPurchaseItineraryLegSelectionLegFare> list = this.legs;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo32646g()) {
            n.append(", ");
            n.append("message:");
            String str = this.message;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
