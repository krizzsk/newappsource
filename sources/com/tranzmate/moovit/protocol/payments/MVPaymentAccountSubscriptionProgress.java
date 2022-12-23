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
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVPaymentAccountSubscriptionProgress implements TBase<MVPaymentAccountSubscriptionProgress, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountSubscriptionProgress> {

    /* renamed from: b */
    public static final C25113c f27463b = new C25113c("label", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27464c = new C25113c("accessiblityLabel", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27465d = new C25113c("percentValue", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f27466e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27467f;
    private byte __isset_bitfield = 0;
    public String accessiblityLabel;
    public String label;
    private _Fields[] optionals = {_Fields.ACCESSIBLITY_LABEL};
    public int percentValue;

    public enum _Fields implements C25085c {
        LABEL(1, "label"),
        ACCESSIBLITY_LABEL(2, "accessiblityLabel"),
        PERCENT_VALUE(3, "percentValue");
        
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
                return LABEL;
            }
            if (i == 2) {
                return ACCESSIBLITY_LABEL;
            }
            if (i != 3) {
                return null;
            }
            return PERCENT_VALUE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionProgress$a */
    public static class C9885a extends C25239c<MVPaymentAccountSubscriptionProgress> {
        public C9885a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscriptionProgress mVPaymentAccountSubscriptionProgress = (MVPaymentAccountSubscriptionProgress) tBase;
            mVPaymentAccountSubscriptionProgress.getClass();
            C25113c cVar = MVPaymentAccountSubscriptionProgress.f27463b;
            gVar.mo61687K();
            if (mVPaymentAccountSubscriptionProgress.label != null) {
                gVar.mo61711x(MVPaymentAccountSubscriptionProgress.f27463b);
                gVar.mo61686J(mVPaymentAccountSubscriptionProgress.label);
                gVar.mo61712y();
            }
            if (mVPaymentAccountSubscriptionProgress.accessiblityLabel != null && mVPaymentAccountSubscriptionProgress.mo30196f()) {
                gVar.mo61711x(MVPaymentAccountSubscriptionProgress.f27464c);
                gVar.mo61686J(mVPaymentAccountSubscriptionProgress.accessiblityLabel);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPaymentAccountSubscriptionProgress.f27465d);
            C16530d.m42020n(gVar, mVPaymentAccountSubscriptionProgress.percentValue);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscriptionProgress mVPaymentAccountSubscriptionProgress = (MVPaymentAccountSubscriptionProgress) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentAccountSubscriptionProgress.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVPaymentAccountSubscriptionProgress.percentValue = gVar.mo61696i();
                            mVPaymentAccountSubscriptionProgress.mo30200i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPaymentAccountSubscriptionProgress.accessiblityLabel = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentAccountSubscriptionProgress.label = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionProgress$b */
    public static class C9886b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9885a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionProgress$c */
    public static class C9887c extends C25240d<MVPaymentAccountSubscriptionProgress> {
        public C9887c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscriptionProgress mVPaymentAccountSubscriptionProgress = (MVPaymentAccountSubscriptionProgress) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountSubscriptionProgress.mo30197g()) {
                bitSet.set(0);
            }
            if (mVPaymentAccountSubscriptionProgress.mo30196f()) {
                bitSet.set(1);
            }
            if (mVPaymentAccountSubscriptionProgress.mo30198h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPaymentAccountSubscriptionProgress.mo30197g()) {
                jVar.mo61686J(mVPaymentAccountSubscriptionProgress.label);
            }
            if (mVPaymentAccountSubscriptionProgress.mo30196f()) {
                jVar.mo61686J(mVPaymentAccountSubscriptionProgress.accessiblityLabel);
            }
            if (mVPaymentAccountSubscriptionProgress.mo30198h()) {
                jVar.mo61678B(mVPaymentAccountSubscriptionProgress.percentValue);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountSubscriptionProgress mVPaymentAccountSubscriptionProgress = (MVPaymentAccountSubscriptionProgress) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPaymentAccountSubscriptionProgress.label = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentAccountSubscriptionProgress.accessiblityLabel = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPaymentAccountSubscriptionProgress.percentValue = jVar.mo61696i();
                mVPaymentAccountSubscriptionProgress.mo30200i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountSubscriptionProgress$d */
    public static class C9888d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9887c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountSubscriptionProgress");
        HashMap hashMap = new HashMap();
        f27466e = hashMap;
        hashMap.put(C25239c.class, new C9886b());
        hashMap.put(C25240d.class, new C9888d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LABEL, new FieldMetaData("label", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACCESSIBLITY_LABEL, new FieldMetaData("accessiblityLabel", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PERCENT_VALUE, new FieldMetaData("percentValue", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27467f = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountSubscriptionProgress.class, unmodifiableMap);
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
        ((C25238b) f27466e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27466e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30193a(MVPaymentAccountSubscriptionProgress mVPaymentAccountSubscriptionProgress) {
        if (mVPaymentAccountSubscriptionProgress == null) {
            return false;
        }
        boolean g = mo30197g();
        boolean g2 = mVPaymentAccountSubscriptionProgress.mo30197g();
        if ((g || g2) && (!g || !g2 || !this.label.equals(mVPaymentAccountSubscriptionProgress.label))) {
            return false;
        }
        boolean f = mo30196f();
        boolean f2 = mVPaymentAccountSubscriptionProgress.mo30196f();
        if (((f || f2) && (!f || !f2 || !this.accessiblityLabel.equals(mVPaymentAccountSubscriptionProgress.accessiblityLabel))) || this.percentValue != mVPaymentAccountSubscriptionProgress.percentValue) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVPaymentAccountSubscriptionProgress mVPaymentAccountSubscriptionProgress = (MVPaymentAccountSubscriptionProgress) obj;
        if (!getClass().equals(mVPaymentAccountSubscriptionProgress.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountSubscriptionProgress.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30197g()).compareTo(Boolean.valueOf(mVPaymentAccountSubscriptionProgress.mo30197g()));
        if (compareTo != 0 || ((mo30197g() && (compareTo = this.label.compareTo(mVPaymentAccountSubscriptionProgress.label)) != 0) || (compareTo = Boolean.valueOf(mo30196f()).compareTo(Boolean.valueOf(mVPaymentAccountSubscriptionProgress.mo30196f()))) != 0 || ((mo30196f() && (compareTo = this.accessiblityLabel.compareTo(mVPaymentAccountSubscriptionProgress.accessiblityLabel)) != 0) || (compareTo = Boolean.valueOf(mo30198h()).compareTo(Boolean.valueOf(mVPaymentAccountSubscriptionProgress.mo30198h()))) != 0))) {
            return compareTo;
        }
        if (!mo30198h() || (c = C25082a.m62839c(this.percentValue, mVPaymentAccountSubscriptionProgress.percentValue)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentAccountSubscriptionProgress)) {
            return mo30193a((MVPaymentAccountSubscriptionProgress) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30196f() {
        return this.accessiblityLabel != null;
    }

    /* renamed from: g */
    public final boolean mo30197g() {
        return this.label != null;
    }

    /* renamed from: h */
    public final boolean mo30198h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo30200i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAccountSubscriptionProgress(", "label:");
        String str = this.label;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30196f()) {
            n.append(", ");
            n.append("accessiblityLabel:");
            String str2 = this.accessiblityLabel;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("percentValue:");
        return C13437d.m33707l(n, this.percentValue, ")");
    }
}
