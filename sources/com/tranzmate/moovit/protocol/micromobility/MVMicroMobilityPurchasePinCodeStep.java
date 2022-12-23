package com.tranzmate.moovit.protocol.micromobility;

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
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVMicroMobilityPurchasePinCodeStep implements TBase<MVMicroMobilityPurchasePinCodeStep, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchasePinCodeStep> {

    /* renamed from: b */
    public static final C25113c f26671b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26672c = new C25113c("instructions", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26673d = new C25113c("numberOfDigits", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26674e = new C25113c("actionText", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f26675f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26676g;
    private byte __isset_bitfield = 0;
    public String actionText;
    public String instructions;
    public int numberOfDigits;
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        INSTRUCTIONS(2, "instructions"),
        NUMBER_OF_DIGITS(3, "numberOfDigits"),
        ACTION_TEXT(4, "actionText");
        
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
                return TITLE;
            }
            if (i == 2) {
                return INSTRUCTIONS;
            }
            if (i == 3) {
                return NUMBER_OF_DIGITS;
            }
            if (i != 4) {
                return null;
            }
            return ACTION_TEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStep$a */
    public static class C9306a extends C25239c<MVMicroMobilityPurchasePinCodeStep> {
        public C9306a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchasePinCodeStep mVMicroMobilityPurchasePinCodeStep = (MVMicroMobilityPurchasePinCodeStep) tBase;
            mVMicroMobilityPurchasePinCodeStep.getClass();
            C25113c cVar = MVMicroMobilityPurchasePinCodeStep.f26671b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchasePinCodeStep.title != null) {
                gVar.mo61711x(MVMicroMobilityPurchasePinCodeStep.f26671b);
                gVar.mo61686J(mVMicroMobilityPurchasePinCodeStep.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchasePinCodeStep.instructions != null) {
                gVar.mo61711x(MVMicroMobilityPurchasePinCodeStep.f26672c);
                gVar.mo61686J(mVMicroMobilityPurchasePinCodeStep.instructions);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMicroMobilityPurchasePinCodeStep.f26673d);
            gVar.mo61678B(mVMicroMobilityPurchasePinCodeStep.numberOfDigits);
            gVar.mo61712y();
            if (mVMicroMobilityPurchasePinCodeStep.actionText != null) {
                gVar.mo61711x(MVMicroMobilityPurchasePinCodeStep.f26674e);
                gVar.mo61686J(mVMicroMobilityPurchasePinCodeStep.actionText);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchasePinCodeStep mVMicroMobilityPurchasePinCodeStep = (MVMicroMobilityPurchasePinCodeStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchasePinCodeStep.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVMicroMobilityPurchasePinCodeStep.actionText = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVMicroMobilityPurchasePinCodeStep.numberOfDigits = gVar.mo61696i();
                            mVMicroMobilityPurchasePinCodeStep.mo28902j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityPurchasePinCodeStep.instructions = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityPurchasePinCodeStep.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStep$b */
    public static class C9307b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9306a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStep$c */
    public static class C9308c extends C25240d<MVMicroMobilityPurchasePinCodeStep> {
        public C9308c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchasePinCodeStep mVMicroMobilityPurchasePinCodeStep = (MVMicroMobilityPurchasePinCodeStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchasePinCodeStep.mo28901i()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPurchasePinCodeStep.mo28898g()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityPurchasePinCodeStep.mo28899h()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityPurchasePinCodeStep.mo28897f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVMicroMobilityPurchasePinCodeStep.mo28901i()) {
                jVar.mo61686J(mVMicroMobilityPurchasePinCodeStep.title);
            }
            if (mVMicroMobilityPurchasePinCodeStep.mo28898g()) {
                jVar.mo61686J(mVMicroMobilityPurchasePinCodeStep.instructions);
            }
            if (mVMicroMobilityPurchasePinCodeStep.mo28899h()) {
                jVar.mo61678B(mVMicroMobilityPurchasePinCodeStep.numberOfDigits);
            }
            if (mVMicroMobilityPurchasePinCodeStep.mo28897f()) {
                jVar.mo61686J(mVMicroMobilityPurchasePinCodeStep.actionText);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchasePinCodeStep mVMicroMobilityPurchasePinCodeStep = (MVMicroMobilityPurchasePinCodeStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVMicroMobilityPurchasePinCodeStep.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityPurchasePinCodeStep.instructions = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityPurchasePinCodeStep.numberOfDigits = jVar.mo61696i();
                mVMicroMobilityPurchasePinCodeStep.mo28902j();
            }
            if (T.get(3)) {
                mVMicroMobilityPurchasePinCodeStep.actionText = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStep$d */
    public static class C9309d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9308c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchasePinCodeStep");
        HashMap hashMap = new HashMap();
        f26675f = hashMap;
        hashMap.put(C25239c.class, new C9307b());
        hashMap.put(C25240d.class, new C9309d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NUMBER_OF_DIGITS, new FieldMetaData("numberOfDigits", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ACTION_TEXT, new FieldMetaData("actionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26676g = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchasePinCodeStep.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f26675f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26675f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchasePinCodeStep mVMicroMobilityPurchasePinCodeStep = (MVMicroMobilityPurchasePinCodeStep) obj;
        if (!getClass().equals(mVMicroMobilityPurchasePinCodeStep.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchasePinCodeStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28901i()).compareTo(Boolean.valueOf(mVMicroMobilityPurchasePinCodeStep.mo28901i()));
        if (compareTo2 != 0 || ((mo28901i() && (compareTo2 = this.title.compareTo(mVMicroMobilityPurchasePinCodeStep.title)) != 0) || (compareTo2 = Boolean.valueOf(mo28898g()).compareTo(Boolean.valueOf(mVMicroMobilityPurchasePinCodeStep.mo28898g()))) != 0 || ((mo28898g() && (compareTo2 = this.instructions.compareTo(mVMicroMobilityPurchasePinCodeStep.instructions)) != 0) || (compareTo2 = Boolean.valueOf(mo28899h()).compareTo(Boolean.valueOf(mVMicroMobilityPurchasePinCodeStep.mo28899h()))) != 0 || ((mo28899h() && (compareTo2 = C25082a.m62839c(this.numberOfDigits, mVMicroMobilityPurchasePinCodeStep.numberOfDigits)) != 0) || (compareTo2 = Boolean.valueOf(mo28897f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchasePinCodeStep.mo28897f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo28897f() || (compareTo = this.actionText.compareTo(mVMicroMobilityPurchasePinCodeStep.actionText)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchasePinCodeStep)) {
            return false;
        }
        MVMicroMobilityPurchasePinCodeStep mVMicroMobilityPurchasePinCodeStep = (MVMicroMobilityPurchasePinCodeStep) obj;
        boolean i = mo28901i();
        boolean i2 = mVMicroMobilityPurchasePinCodeStep.mo28901i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVMicroMobilityPurchasePinCodeStep.title))) {
            return false;
        }
        boolean g = mo28898g();
        boolean g2 = mVMicroMobilityPurchasePinCodeStep.mo28898g();
        if (((g || g2) && (!g || !g2 || !this.instructions.equals(mVMicroMobilityPurchasePinCodeStep.instructions))) || this.numberOfDigits != mVMicroMobilityPurchasePinCodeStep.numberOfDigits) {
            return false;
        }
        boolean f = mo28897f();
        boolean f2 = mVMicroMobilityPurchasePinCodeStep.mo28897f();
        if ((f || f2) && (!f || !f2 || !this.actionText.equals(mVMicroMobilityPurchasePinCodeStep.actionText))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28897f() {
        return this.actionText != null;
    }

    /* renamed from: g */
    public final boolean mo28898g() {
        return this.instructions != null;
    }

    /* renamed from: h */
    public final boolean mo28899h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28901i() {
        return this.title != null;
    }

    /* renamed from: j */
    public final void mo28902j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchasePinCodeStep(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("instructions:");
        String str2 = this.instructions;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("numberOfDigits:");
        C0016g.m42z(n, this.numberOfDigits, ", ", "actionText:");
        String str3 = this.actionText;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(")");
        return n.toString();
    }
}
