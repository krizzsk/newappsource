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

public class MVCreditCardInstructions implements TBase<MVCreditCardInstructions, _Fields>, Serializable, Cloneable, Comparable<MVCreditCardInstructions> {

    /* renamed from: b */
    public static final C25113c f27213b = new C25113c("clearanceProvider", (byte) 12, 2);

    /* renamed from: c */
    public static final C25113c f27214c = new C25113c("extraRequiredFields", (byte) 12, 3);

    /* renamed from: d */
    public static final HashMap f27215d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27216e;
    public MVClearanceProvider clearanceProvider;
    public MVSpecialCreditCardFields extraRequiredFields;
    private _Fields[] optionals = {_Fields.EXTRA_REQUIRED_FIELDS};

    public enum _Fields implements C25085c {
        CLEARANCE_PROVIDER(2, "clearanceProvider"),
        EXTRA_REQUIRED_FIELDS(3, "extraRequiredFields");
        
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
            if (i == 2) {
                return CLEARANCE_PROVIDER;
            }
            if (i != 3) {
                return null;
            }
            return EXTRA_REQUIRED_FIELDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreditCardInstructions$a */
    public static class C9692a extends C25239c<MVCreditCardInstructions> {
        public C9692a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreditCardInstructions mVCreditCardInstructions = (MVCreditCardInstructions) tBase;
            mVCreditCardInstructions.mo29771h();
            C25113c cVar = MVCreditCardInstructions.f27213b;
            gVar.mo61687K();
            if (mVCreditCardInstructions.clearanceProvider != null) {
                gVar.mo61711x(MVCreditCardInstructions.f27213b);
                mVCreditCardInstructions.clearanceProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCreditCardInstructions.extraRequiredFields != null && mVCreditCardInstructions.mo29770g()) {
                gVar.mo61711x(MVCreditCardInstructions.f27214c);
                mVCreditCardInstructions.extraRequiredFields.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreditCardInstructions mVCreditCardInstructions = (MVCreditCardInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCreditCardInstructions.mo29771h();
                    return;
                }
                short s = f.f63357c;
                if (s != 2) {
                    if (s != 3) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVSpecialCreditCardFields mVSpecialCreditCardFields = new MVSpecialCreditCardFields();
                        mVCreditCardInstructions.extraRequiredFields = mVSpecialCreditCardFields;
                        mVSpecialCreditCardFields.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVClearanceProvider mVClearanceProvider = new MVClearanceProvider();
                    mVCreditCardInstructions.clearanceProvider = mVClearanceProvider;
                    mVClearanceProvider.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreditCardInstructions$b */
    public static class C9693b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9692a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreditCardInstructions$c */
    public static class C9694c extends C25240d<MVCreditCardInstructions> {
        public C9694c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreditCardInstructions mVCreditCardInstructions = (MVCreditCardInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCreditCardInstructions.mo29769f()) {
                bitSet.set(0);
            }
            if (mVCreditCardInstructions.mo29770g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCreditCardInstructions.mo29769f()) {
                mVCreditCardInstructions.clearanceProvider.mo25202X0(jVar);
            }
            if (mVCreditCardInstructions.mo29770g()) {
                mVCreditCardInstructions.extraRequiredFields.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreditCardInstructions mVCreditCardInstructions = (MVCreditCardInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVClearanceProvider mVClearanceProvider = new MVClearanceProvider();
                mVCreditCardInstructions.clearanceProvider = mVClearanceProvider;
                mVClearanceProvider.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVSpecialCreditCardFields mVSpecialCreditCardFields = new MVSpecialCreditCardFields();
                mVCreditCardInstructions.extraRequiredFields = mVSpecialCreditCardFields;
                mVSpecialCreditCardFields.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreditCardInstructions$d */
    public static class C9695d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9694c(0);
        }
    }

    static {
        new C17394d0("MVCreditCardInstructions");
        HashMap hashMap = new HashMap();
        f27215d = hashMap;
        hashMap.put(C25239c.class, new C9693b());
        hashMap.put(C25240d.class, new C9695d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CLEARANCE_PROVIDER, new FieldMetaData("clearanceProvider", (byte) 3, new StructMetaData(MVClearanceProvider.class)));
        enumMap.put(_Fields.EXTRA_REQUIRED_FIELDS, new FieldMetaData("extraRequiredFields", (byte) 2, new StructMetaData(MVSpecialCreditCardFields.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27216e = unmodifiableMap;
        FieldMetaData.m61947a(MVCreditCardInstructions.class, unmodifiableMap);
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
        ((C25238b) f27215d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27215d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29766a(MVCreditCardInstructions mVCreditCardInstructions) {
        if (mVCreditCardInstructions == null) {
            return false;
        }
        boolean f = mo29769f();
        boolean f2 = mVCreditCardInstructions.mo29769f();
        if ((f || f2) && (!f || !f2 || !this.clearanceProvider.mo29695a(mVCreditCardInstructions.clearanceProvider))) {
            return false;
        }
        boolean g = mo29770g();
        boolean g2 = mVCreditCardInstructions.mo29770g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.extraRequiredFields.mo30588a(mVCreditCardInstructions.extraRequiredFields)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCreditCardInstructions mVCreditCardInstructions = (MVCreditCardInstructions) obj;
        if (!getClass().equals(mVCreditCardInstructions.getClass())) {
            return getClass().getName().compareTo(mVCreditCardInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29769f()).compareTo(Boolean.valueOf(mVCreditCardInstructions.mo29769f()));
        if (compareTo2 != 0 || ((mo29769f() && (compareTo2 = this.clearanceProvider.compareTo(mVCreditCardInstructions.clearanceProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo29770g()).compareTo(Boolean.valueOf(mVCreditCardInstructions.mo29770g()))) != 0)) {
            return compareTo2;
        }
        if (!mo29770g() || (compareTo = this.extraRequiredFields.compareTo(mVCreditCardInstructions.extraRequiredFields)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCreditCardInstructions)) {
            return mo29766a((MVCreditCardInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29769f() {
        return this.clearanceProvider != null;
    }

    /* renamed from: g */
    public final boolean mo29770g() {
        return this.extraRequiredFields != null;
    }

    /* renamed from: h */
    public final void mo29771h() throws TException {
        MVClearanceProvider mVClearanceProvider = this.clearanceProvider;
        if (mVClearanceProvider != null) {
            mVClearanceProvider.getClass();
        }
        MVSpecialCreditCardFields mVSpecialCreditCardFields = this.extraRequiredFields;
        if (mVSpecialCreditCardFields != null) {
            mVSpecialCreditCardFields.getClass();
        }
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCreditCardInstructions(", "clearanceProvider:");
        MVClearanceProvider mVClearanceProvider = this.clearanceProvider;
        if (mVClearanceProvider == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClearanceProvider);
        }
        if (mo29770g()) {
            n.append(", ");
            n.append("extraRequiredFields:");
            MVSpecialCreditCardFields mVSpecialCreditCardFields = this.extraRequiredFields;
            if (mVSpecialCreditCardFields == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSpecialCreditCardFields);
            }
        }
        n.append(")");
        return n.toString();
    }
}
