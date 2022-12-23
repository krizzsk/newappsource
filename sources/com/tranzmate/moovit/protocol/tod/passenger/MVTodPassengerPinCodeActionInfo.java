package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodPassengerPinCodeActionInfo implements TBase<MVTodPassengerPinCodeActionInfo, _Fields>, Serializable, Cloneable, Comparable<MVTodPassengerPinCodeActionInfo> {

    /* renamed from: b */
    public static final C25113c f29498b = new C25113c("numberOfDigits", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29499c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29500d = new C25113c("cta", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29501e = new C25113c("instructions", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f29502f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29503g;
    private byte __isset_bitfield = 0;
    public String cta;
    public String instructions;
    public int numberOfDigits;
    private _Fields[] optionals = {_Fields.INSTRUCTIONS};
    public String title;

    public enum _Fields implements C25085c {
        NUMBER_OF_DIGITS(1, "numberOfDigits"),
        TITLE(2, "title"),
        CTA(3, "cta"),
        INSTRUCTIONS(4, "instructions");
        
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
                return NUMBER_OF_DIGITS;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i == 3) {
                return CTA;
            }
            if (i != 4) {
                return null;
            }
            return INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerPinCodeActionInfo$a */
    public static class C11283a extends C25239c<MVTodPassengerPinCodeActionInfo> {
        public C11283a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerPinCodeActionInfo mVTodPassengerPinCodeActionInfo = (MVTodPassengerPinCodeActionInfo) tBase;
            mVTodPassengerPinCodeActionInfo.getClass();
            C25113c cVar = MVTodPassengerPinCodeActionInfo.f29498b;
            gVar.mo61687K();
            gVar.mo61711x(MVTodPassengerPinCodeActionInfo.f29498b);
            gVar.mo61678B(mVTodPassengerPinCodeActionInfo.numberOfDigits);
            gVar.mo61712y();
            if (mVTodPassengerPinCodeActionInfo.title != null) {
                gVar.mo61711x(MVTodPassengerPinCodeActionInfo.f29499c);
                gVar.mo61686J(mVTodPassengerPinCodeActionInfo.title);
                gVar.mo61712y();
            }
            if (mVTodPassengerPinCodeActionInfo.cta != null) {
                gVar.mo61711x(MVTodPassengerPinCodeActionInfo.f29500d);
                gVar.mo61686J(mVTodPassengerPinCodeActionInfo.cta);
                gVar.mo61712y();
            }
            if (mVTodPassengerPinCodeActionInfo.instructions != null && mVTodPassengerPinCodeActionInfo.mo33597g()) {
                gVar.mo61711x(MVTodPassengerPinCodeActionInfo.f29501e);
                gVar.mo61686J(mVTodPassengerPinCodeActionInfo.instructions);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerPinCodeActionInfo mVTodPassengerPinCodeActionInfo = (MVTodPassengerPinCodeActionInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodPassengerPinCodeActionInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVTodPassengerPinCodeActionInfo.instructions = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVTodPassengerPinCodeActionInfo.cta = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTodPassengerPinCodeActionInfo.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTodPassengerPinCodeActionInfo.numberOfDigits = gVar.mo61696i();
                    mVTodPassengerPinCodeActionInfo.mo33601j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerPinCodeActionInfo$b */
    public static class C11284b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11283a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerPinCodeActionInfo$c */
    public static class C11285c extends C25240d<MVTodPassengerPinCodeActionInfo> {
        public C11285c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerPinCodeActionInfo mVTodPassengerPinCodeActionInfo = (MVTodPassengerPinCodeActionInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodPassengerPinCodeActionInfo.mo33598h()) {
                bitSet.set(0);
            }
            if (mVTodPassengerPinCodeActionInfo.mo33600i()) {
                bitSet.set(1);
            }
            if (mVTodPassengerPinCodeActionInfo.mo33596f()) {
                bitSet.set(2);
            }
            if (mVTodPassengerPinCodeActionInfo.mo33597g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodPassengerPinCodeActionInfo.mo33598h()) {
                jVar.mo61678B(mVTodPassengerPinCodeActionInfo.numberOfDigits);
            }
            if (mVTodPassengerPinCodeActionInfo.mo33600i()) {
                jVar.mo61686J(mVTodPassengerPinCodeActionInfo.title);
            }
            if (mVTodPassengerPinCodeActionInfo.mo33596f()) {
                jVar.mo61686J(mVTodPassengerPinCodeActionInfo.cta);
            }
            if (mVTodPassengerPinCodeActionInfo.mo33597g()) {
                jVar.mo61686J(mVTodPassengerPinCodeActionInfo.instructions);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodPassengerPinCodeActionInfo mVTodPassengerPinCodeActionInfo = (MVTodPassengerPinCodeActionInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTodPassengerPinCodeActionInfo.numberOfDigits = jVar.mo61696i();
                mVTodPassengerPinCodeActionInfo.mo33601j();
            }
            if (T.get(1)) {
                mVTodPassengerPinCodeActionInfo.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTodPassengerPinCodeActionInfo.cta = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTodPassengerPinCodeActionInfo.instructions = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerPinCodeActionInfo$d */
    public static class C11286d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11285c(0);
        }
    }

    static {
        new C17394d0("MVTodPassengerPinCodeActionInfo");
        HashMap hashMap = new HashMap();
        f29502f = hashMap;
        hashMap.put(C25239c.class, new C11284b());
        hashMap.put(C25240d.class, new C11286d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NUMBER_OF_DIGITS, new FieldMetaData("numberOfDigits", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CTA, new FieldMetaData("cta", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29503g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodPassengerPinCodeActionInfo.class, unmodifiableMap);
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
        ((C25238b) f29502f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29502f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodPassengerPinCodeActionInfo mVTodPassengerPinCodeActionInfo = (MVTodPassengerPinCodeActionInfo) obj;
        if (!getClass().equals(mVTodPassengerPinCodeActionInfo.getClass())) {
            return getClass().getName().compareTo(mVTodPassengerPinCodeActionInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33598h()).compareTo(Boolean.valueOf(mVTodPassengerPinCodeActionInfo.mo33598h()));
        if (compareTo2 != 0 || ((mo33598h() && (compareTo2 = C25082a.m62839c(this.numberOfDigits, mVTodPassengerPinCodeActionInfo.numberOfDigits)) != 0) || (compareTo2 = Boolean.valueOf(mo33600i()).compareTo(Boolean.valueOf(mVTodPassengerPinCodeActionInfo.mo33600i()))) != 0 || ((mo33600i() && (compareTo2 = this.title.compareTo(mVTodPassengerPinCodeActionInfo.title)) != 0) || (compareTo2 = Boolean.valueOf(mo33596f()).compareTo(Boolean.valueOf(mVTodPassengerPinCodeActionInfo.mo33596f()))) != 0 || ((mo33596f() && (compareTo2 = this.cta.compareTo(mVTodPassengerPinCodeActionInfo.cta)) != 0) || (compareTo2 = Boolean.valueOf(mo33597g()).compareTo(Boolean.valueOf(mVTodPassengerPinCodeActionInfo.mo33597g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo33597g() || (compareTo = this.instructions.compareTo(mVTodPassengerPinCodeActionInfo.instructions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodPassengerPinCodeActionInfo)) {
            return false;
        }
        MVTodPassengerPinCodeActionInfo mVTodPassengerPinCodeActionInfo = (MVTodPassengerPinCodeActionInfo) obj;
        if (this.numberOfDigits != mVTodPassengerPinCodeActionInfo.numberOfDigits) {
            return false;
        }
        boolean i = mo33600i();
        boolean i2 = mVTodPassengerPinCodeActionInfo.mo33600i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVTodPassengerPinCodeActionInfo.title))) {
            return false;
        }
        boolean f = mo33596f();
        boolean f2 = mVTodPassengerPinCodeActionInfo.mo33596f();
        if ((f || f2) && (!f || !f2 || !this.cta.equals(mVTodPassengerPinCodeActionInfo.cta))) {
            return false;
        }
        boolean g = mo33597g();
        boolean g2 = mVTodPassengerPinCodeActionInfo.mo33597g();
        if ((g || g2) && (!g || !g2 || !this.instructions.equals(mVTodPassengerPinCodeActionInfo.instructions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33596f() {
        return this.cta != null;
    }

    /* renamed from: g */
    public final boolean mo33597g() {
        return this.instructions != null;
    }

    /* renamed from: h */
    public final boolean mo33598h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33600i() {
        return this.title != null;
    }

    /* renamed from: j */
    public final void mo33601j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodPassengerPinCodeActionInfo(", "numberOfDigits:");
        C0016g.m42z(n, this.numberOfDigits, ", ", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("cta:");
        String str2 = this.cta;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo33597g()) {
            n.append(", ");
            n.append("instructions:");
            String str3 = this.instructions;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
