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

public class MVPhoneInstructions implements TBase<MVPhoneInstructions, _Fields>, Serializable, Cloneable, Comparable<MVPhoneInstructions> {

    /* renamed from: b */
    public static final C25113c f27627b = new C25113c("alternateAuthInstructions", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27628c = new C25113c("secondaryAuthInstructions", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27629d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27630e;
    public MVPhoneAlternateAuthInstructions alternateAuthInstructions;
    private _Fields[] optionals = {_Fields.ALTERNATE_AUTH_INSTRUCTIONS, _Fields.SECONDARY_AUTH_INSTRUCTIONS};
    public MVPhoneAlternateAuthInstructions secondaryAuthInstructions;

    public enum _Fields implements C25085c {
        ALTERNATE_AUTH_INSTRUCTIONS(1, "alternateAuthInstructions"),
        SECONDARY_AUTH_INSTRUCTIONS(2, "secondaryAuthInstructions");
        
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
                return ALTERNATE_AUTH_INSTRUCTIONS;
            }
            if (i != 2) {
                return null;
            }
            return SECONDARY_AUTH_INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPhoneInstructions$a */
    public static class C10019a extends C25239c<MVPhoneInstructions> {
        public C10019a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPhoneInstructions mVPhoneInstructions = (MVPhoneInstructions) tBase;
            MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions = mVPhoneInstructions.alternateAuthInstructions;
            C25113c cVar = MVPhoneInstructions.f27627b;
            gVar.mo61687K();
            if (mVPhoneInstructions.alternateAuthInstructions != null && mVPhoneInstructions.mo30474f()) {
                gVar.mo61711x(MVPhoneInstructions.f27627b);
                mVPhoneInstructions.alternateAuthInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPhoneInstructions.secondaryAuthInstructions != null && mVPhoneInstructions.mo30475g()) {
                gVar.mo61711x(MVPhoneInstructions.f27628c);
                mVPhoneInstructions.secondaryAuthInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPhoneInstructions mVPhoneInstructions = (MVPhoneInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions = mVPhoneInstructions.alternateAuthInstructions;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions2 = new MVPhoneAlternateAuthInstructions();
                        mVPhoneInstructions.secondaryAuthInstructions = mVPhoneAlternateAuthInstructions2;
                        mVPhoneAlternateAuthInstructions2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions3 = new MVPhoneAlternateAuthInstructions();
                    mVPhoneInstructions.alternateAuthInstructions = mVPhoneAlternateAuthInstructions3;
                    mVPhoneAlternateAuthInstructions3.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPhoneInstructions$b */
    public static class C10020b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10019a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPhoneInstructions$c */
    public static class C10021c extends C25240d<MVPhoneInstructions> {
        public C10021c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPhoneInstructions mVPhoneInstructions = (MVPhoneInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPhoneInstructions.mo30474f()) {
                bitSet.set(0);
            }
            if (mVPhoneInstructions.mo30475g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPhoneInstructions.mo30474f()) {
                mVPhoneInstructions.alternateAuthInstructions.mo25202X0(jVar);
            }
            if (mVPhoneInstructions.mo30475g()) {
                mVPhoneInstructions.secondaryAuthInstructions.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPhoneInstructions mVPhoneInstructions = (MVPhoneInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions = new MVPhoneAlternateAuthInstructions();
                mVPhoneInstructions.alternateAuthInstructions = mVPhoneAlternateAuthInstructions;
                mVPhoneAlternateAuthInstructions.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions2 = new MVPhoneAlternateAuthInstructions();
                mVPhoneInstructions.secondaryAuthInstructions = mVPhoneAlternateAuthInstructions2;
                mVPhoneAlternateAuthInstructions2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPhoneInstructions$d */
    public static class C10022d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10021c(0);
        }
    }

    static {
        new C17394d0("MVPhoneInstructions");
        HashMap hashMap = new HashMap();
        f27629d = hashMap;
        hashMap.put(C25239c.class, new C10020b());
        hashMap.put(C25240d.class, new C10022d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ALTERNATE_AUTH_INSTRUCTIONS, new FieldMetaData("alternateAuthInstructions", (byte) 2, new StructMetaData(MVPhoneAlternateAuthInstructions.class)));
        enumMap.put(_Fields.SECONDARY_AUTH_INSTRUCTIONS, new FieldMetaData("secondaryAuthInstructions", (byte) 2, new StructMetaData(MVPhoneAlternateAuthInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27630e = unmodifiableMap;
        FieldMetaData.m61947a(MVPhoneInstructions.class, unmodifiableMap);
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
        ((C25238b) f27629d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27629d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30471a(MVPhoneInstructions mVPhoneInstructions) {
        if (mVPhoneInstructions == null) {
            return false;
        }
        boolean f = mo30474f();
        boolean f2 = mVPhoneInstructions.mo30474f();
        if ((f || f2) && (!f || !f2 || !this.alternateAuthInstructions.mo30463a(mVPhoneInstructions.alternateAuthInstructions))) {
            return false;
        }
        boolean g = mo30475g();
        boolean g2 = mVPhoneInstructions.mo30475g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.secondaryAuthInstructions.mo30463a(mVPhoneInstructions.secondaryAuthInstructions)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPhoneInstructions mVPhoneInstructions = (MVPhoneInstructions) obj;
        if (!getClass().equals(mVPhoneInstructions.getClass())) {
            return getClass().getName().compareTo(mVPhoneInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30474f()).compareTo(Boolean.valueOf(mVPhoneInstructions.mo30474f()));
        if (compareTo2 != 0 || ((mo30474f() && (compareTo2 = this.alternateAuthInstructions.compareTo(mVPhoneInstructions.alternateAuthInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30475g()).compareTo(Boolean.valueOf(mVPhoneInstructions.mo30475g()))) != 0)) {
            return compareTo2;
        }
        if (!mo30475g() || (compareTo = this.secondaryAuthInstructions.compareTo(mVPhoneInstructions.secondaryAuthInstructions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPhoneInstructions)) {
            return mo30471a((MVPhoneInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30474f() {
        return this.alternateAuthInstructions != null;
    }

    /* renamed from: g */
    public final boolean mo30475g() {
        return this.secondaryAuthInstructions != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPhoneInstructions(");
        if (mo30474f()) {
            sb.append("alternateAuthInstructions:");
            MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions = this.alternateAuthInstructions;
            if (mVPhoneAlternateAuthInstructions == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVPhoneAlternateAuthInstructions);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo30475g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("secondaryAuthInstructions:");
            MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions2 = this.secondaryAuthInstructions;
            if (mVPhoneAlternateAuthInstructions2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVPhoneAlternateAuthInstructions2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
