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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVPaymentAccountId implements TBase<MVPaymentAccountId, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountId> {

    /* renamed from: b */
    public static final C25113c f27417b = new C25113c("idType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27418c = new C25113c("id", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27419d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27420e;

    /* renamed from: id */
    public String f27421id;
    public MVIdentificationType idType;

    public enum _Fields implements C25085c {
        ID_TYPE(1, "idType"),
        ID(2, "id");
        
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
                return ID_TYPE;
            }
            if (i != 2) {
                return null;
            }
            return ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountId$a */
    public static class C9857a extends C25239c<MVPaymentAccountId> {
        public C9857a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountId mVPaymentAccountId = (MVPaymentAccountId) tBase;
            mVPaymentAccountId.getClass();
            C25113c cVar = MVPaymentAccountId.f27417b;
            gVar.mo61687K();
            if (mVPaymentAccountId.idType != null) {
                gVar.mo61711x(MVPaymentAccountId.f27417b);
                gVar.mo61678B(mVPaymentAccountId.idType.getValue());
                gVar.mo61712y();
            }
            if (mVPaymentAccountId.f27421id != null) {
                gVar.mo61711x(MVPaymentAccountId.f27418c);
                gVar.mo61686J(mVPaymentAccountId.f27421id);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountId mVPaymentAccountId = (MVPaymentAccountId) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentAccountId.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVPaymentAccountId.f27421id = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPaymentAccountId.idType = MVIdentificationType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountId$b */
    public static class C9858b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9857a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountId$c */
    public static class C9859c extends C25240d<MVPaymentAccountId> {
        public C9859c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountId mVPaymentAccountId = (MVPaymentAccountId) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountId.mo30124g()) {
                bitSet.set(0);
            }
            if (mVPaymentAccountId.mo30123f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPaymentAccountId.mo30124g()) {
                jVar.mo61678B(mVPaymentAccountId.idType.getValue());
            }
            if (mVPaymentAccountId.mo30123f()) {
                jVar.mo61686J(mVPaymentAccountId.f27421id);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountId mVPaymentAccountId = (MVPaymentAccountId) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPaymentAccountId.idType = MVIdentificationType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVPaymentAccountId.f27421id = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountId$d */
    public static class C9860d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9859c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountId");
        HashMap hashMap = new HashMap();
        f27419d = hashMap;
        hashMap.put(C25239c.class, new C9858b());
        hashMap.put(C25240d.class, new C9860d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID_TYPE, new FieldMetaData("idType", (byte) 3, new EnumMetaData(MVIdentificationType.class)));
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27420e = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountId.class, unmodifiableMap);
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
        ((C25238b) f27419d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27419d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentAccountId mVPaymentAccountId = (MVPaymentAccountId) obj;
        if (!getClass().equals(mVPaymentAccountId.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountId.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30124g()).compareTo(Boolean.valueOf(mVPaymentAccountId.mo30124g()));
        if (compareTo2 != 0 || ((mo30124g() && (compareTo2 = this.idType.compareTo(mVPaymentAccountId.idType)) != 0) || (compareTo2 = Boolean.valueOf(mo30123f()).compareTo(Boolean.valueOf(mVPaymentAccountId.mo30123f()))) != 0)) {
            return compareTo2;
        }
        if (!mo30123f() || (compareTo = this.f27421id.compareTo(mVPaymentAccountId.f27421id)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentAccountId)) {
            return false;
        }
        MVPaymentAccountId mVPaymentAccountId = (MVPaymentAccountId) obj;
        boolean g = mo30124g();
        boolean g2 = mVPaymentAccountId.mo30124g();
        if ((g || g2) && (!g || !g2 || !this.idType.equals(mVPaymentAccountId.idType))) {
            return false;
        }
        boolean f = mo30123f();
        boolean f2 = mVPaymentAccountId.mo30123f();
        if ((f || f2) && (!f || !f2 || !this.f27421id.equals(mVPaymentAccountId.f27421id))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30123f() {
        return this.f27421id != null;
    }

    /* renamed from: g */
    public final boolean mo30124g() {
        return this.idType != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAccountId(", "idType:");
        MVIdentificationType mVIdentificationType = this.idType;
        if (mVIdentificationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVIdentificationType);
        }
        n.append(", ");
        n.append("id:");
        String str = this.f27421id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
