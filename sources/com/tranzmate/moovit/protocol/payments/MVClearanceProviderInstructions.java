package com.tranzmate.moovit.protocol.payments;

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

public class MVClearanceProviderInstructions implements TBase<MVClearanceProviderInstructions, _Fields>, Serializable, Cloneable, Comparable<MVClearanceProviderInstructions> {

    /* renamed from: b */
    public static final C25113c f27177b = new C25113c("creditCardInstructions", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27178c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27179d;
    public MVCreditCardInstructions creditCardInstructions;

    public enum _Fields implements C25085c {
        CREDIT_CARD_INSTRUCTIONS(1, "creditCardInstructions");
        
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
            return CREDIT_CARD_INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProviderInstructions$a */
    public static class C9660a extends C25239c<MVClearanceProviderInstructions> {
        public C9660a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProviderInstructions mVClearanceProviderInstructions = (MVClearanceProviderInstructions) tBase;
            MVCreditCardInstructions mVCreditCardInstructions = mVClearanceProviderInstructions.creditCardInstructions;
            if (mVCreditCardInstructions != null) {
                mVCreditCardInstructions.mo29771h();
            }
            C25113c cVar = MVClearanceProviderInstructions.f27177b;
            gVar.mo61687K();
            if (mVClearanceProviderInstructions.creditCardInstructions != null) {
                gVar.mo61711x(MVClearanceProviderInstructions.f27177b);
                mVClearanceProviderInstructions.creditCardInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProviderInstructions mVClearanceProviderInstructions = (MVClearanceProviderInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                    mVClearanceProviderInstructions.creditCardInstructions = mVCreditCardInstructions;
                    mVCreditCardInstructions.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVCreditCardInstructions mVCreditCardInstructions2 = mVClearanceProviderInstructions.creditCardInstructions;
            if (mVCreditCardInstructions2 != null) {
                mVCreditCardInstructions2.mo29771h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProviderInstructions$b */
    public static class C9661b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9660a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProviderInstructions$c */
    public static class C9662c extends C25240d<MVClearanceProviderInstructions> {
        public C9662c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProviderInstructions mVClearanceProviderInstructions = (MVClearanceProviderInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVClearanceProviderInstructions.mo29707f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVClearanceProviderInstructions.mo29707f()) {
                mVClearanceProviderInstructions.creditCardInstructions.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVClearanceProviderInstructions mVClearanceProviderInstructions = (MVClearanceProviderInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                mVClearanceProviderInstructions.creditCardInstructions = mVCreditCardInstructions;
                mVCreditCardInstructions.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVClearanceProviderInstructions$d */
    public static class C9663d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9662c(0);
        }
    }

    static {
        new C17394d0("MVClearanceProviderInstructions");
        HashMap hashMap = new HashMap();
        f27178c = hashMap;
        hashMap.put(C25239c.class, new C9661b());
        hashMap.put(C25240d.class, new C9663d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CREDIT_CARD_INSTRUCTIONS, new FieldMetaData("creditCardInstructions", (byte) 3, new StructMetaData(MVCreditCardInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27179d = unmodifiableMap;
        FieldMetaData.m61947a(MVClearanceProviderInstructions.class, unmodifiableMap);
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
        ((C25238b) f27178c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27178c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29704a(MVClearanceProviderInstructions mVClearanceProviderInstructions) {
        if (mVClearanceProviderInstructions == null) {
            return false;
        }
        boolean f = mo29707f();
        boolean f2 = mVClearanceProviderInstructions.mo29707f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.creditCardInstructions.mo29766a(mVClearanceProviderInstructions.creditCardInstructions)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVClearanceProviderInstructions mVClearanceProviderInstructions = (MVClearanceProviderInstructions) obj;
        if (!getClass().equals(mVClearanceProviderInstructions.getClass())) {
            return getClass().getName().compareTo(mVClearanceProviderInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29707f()).compareTo(Boolean.valueOf(mVClearanceProviderInstructions.mo29707f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo29707f() || (compareTo = this.creditCardInstructions.compareTo(mVClearanceProviderInstructions.creditCardInstructions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVClearanceProviderInstructions)) {
            return mo29704a((MVClearanceProviderInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29707f() {
        return this.creditCardInstructions != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVClearanceProviderInstructions(", "creditCardInstructions:");
        MVCreditCardInstructions mVCreditCardInstructions = this.creditCardInstructions;
        if (mVCreditCardInstructions == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCreditCardInstructions);
        }
        n.append(")");
        return n.toString();
    }
}
