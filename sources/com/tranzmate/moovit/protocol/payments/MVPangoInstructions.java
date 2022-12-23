package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.payment.MVCardDetails;
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

public class MVPangoInstructions implements TBase<MVPangoInstructions, _Fields>, Serializable, Cloneable, Comparable<MVPangoInstructions> {

    /* renamed from: b */
    public static final C25113c f27390b = new C25113c("creditCard", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27391c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27392d;
    public MVCardDetails creditCard;

    public enum _Fields implements C25085c {
        CREDIT_CARD(1, "creditCard");
        
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
            return CREDIT_CARD;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPangoInstructions$a */
    public static class C9841a extends C25239c<MVPangoInstructions> {
        public C9841a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPangoInstructions mVPangoInstructions = (MVPangoInstructions) tBase;
            MVCardDetails mVCardDetails = mVPangoInstructions.creditCard;
            C25113c cVar = MVPangoInstructions.f27390b;
            gVar.mo61687K();
            if (mVPangoInstructions.creditCard != null) {
                gVar.mo61711x(MVPangoInstructions.f27390b);
                mVPangoInstructions.creditCard.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPangoInstructions mVPangoInstructions = (MVPangoInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCardDetails mVCardDetails = mVPangoInstructions.creditCard;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVCardDetails mVCardDetails2 = new MVCardDetails();
                    mVPangoInstructions.creditCard = mVCardDetails2;
                    mVCardDetails2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPangoInstructions$b */
    public static class C9842b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9841a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPangoInstructions$c */
    public static class C9843c extends C25240d<MVPangoInstructions> {
        public C9843c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPangoInstructions mVPangoInstructions = (MVPangoInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPangoInstructions.mo30081f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPangoInstructions.mo30081f()) {
                mVPangoInstructions.creditCard.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPangoInstructions mVPangoInstructions = (MVPangoInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVCardDetails mVCardDetails = new MVCardDetails();
                mVPangoInstructions.creditCard = mVCardDetails;
                mVCardDetails.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPangoInstructions$d */
    public static class C9844d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9843c(0);
        }
    }

    static {
        new C17394d0("MVPangoInstructions");
        HashMap hashMap = new HashMap();
        f27391c = hashMap;
        hashMap.put(C25239c.class, new C9842b());
        hashMap.put(C25240d.class, new C9844d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CREDIT_CARD, new FieldMetaData("creditCard", (byte) 3, new StructMetaData(MVCardDetails.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27392d = unmodifiableMap;
        FieldMetaData.m61947a(MVPangoInstructions.class, unmodifiableMap);
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
        ((C25238b) f27391c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27391c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30078a(MVPangoInstructions mVPangoInstructions) {
        if (mVPangoInstructions == null) {
            return false;
        }
        boolean f = mo30081f();
        boolean f2 = mVPangoInstructions.mo30081f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.creditCard.mo29227a(mVPangoInstructions.creditCard)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPangoInstructions mVPangoInstructions = (MVPangoInstructions) obj;
        if (!getClass().equals(mVPangoInstructions.getClass())) {
            return getClass().getName().compareTo(mVPangoInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30081f()).compareTo(Boolean.valueOf(mVPangoInstructions.mo30081f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo30081f() || (compareTo = this.creditCard.compareTo(mVPangoInstructions.creditCard)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPangoInstructions)) {
            return mo30078a((MVPangoInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30081f() {
        return this.creditCard != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPangoInstructions(", "creditCard:");
        MVCardDetails mVCardDetails = this.creditCard;
        if (mVCardDetails == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCardDetails);
        }
        n.append(")");
        return n.toString();
    }
}
