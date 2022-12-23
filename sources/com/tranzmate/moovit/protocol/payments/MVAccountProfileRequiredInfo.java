package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVAccountProfileRequiredInfo implements TBase<MVAccountProfileRequiredInfo, _Fields>, Serializable, Cloneable, Comparable<MVAccountProfileRequiredInfo> {

    /* renamed from: b */
    public static final C25113c f27020b = new C25113c(ServerParameters.STATUS, (byte) 8, 2);

    /* renamed from: c */
    public static final C25113c f27021c = new C25113c("value", (byte) 12, 4);

    /* renamed from: d */
    public static final HashMap f27022d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27023e;
    public MVVerificationStatus status;
    public MVProfileRequiredInfoValue value;

    public enum _Fields implements C25085c {
        STATUS(2, ServerParameters.STATUS),
        VALUE(4, "value");
        
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
                return STATUS;
            }
            if (i != 4) {
                return null;
            }
            return VALUE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAccountProfileRequiredInfo$a */
    public static class C9545a extends C25239c<MVAccountProfileRequiredInfo> {
        public C9545a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountProfileRequiredInfo mVAccountProfileRequiredInfo = (MVAccountProfileRequiredInfo) tBase;
            mVAccountProfileRequiredInfo.getClass();
            C25113c cVar = MVAccountProfileRequiredInfo.f27020b;
            gVar.mo61687K();
            if (mVAccountProfileRequiredInfo.status != null) {
                gVar.mo61711x(MVAccountProfileRequiredInfo.f27020b);
                gVar.mo61678B(mVAccountProfileRequiredInfo.status.getValue());
                gVar.mo61712y();
            }
            if (mVAccountProfileRequiredInfo.value != null) {
                gVar.mo61711x(MVAccountProfileRequiredInfo.f27021c);
                mVAccountProfileRequiredInfo.value.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountProfileRequiredInfo mVAccountProfileRequiredInfo = (MVAccountProfileRequiredInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAccountProfileRequiredInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 2) {
                    if (s != 4) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVProfileRequiredInfoValue mVProfileRequiredInfoValue = new MVProfileRequiredInfoValue();
                        mVAccountProfileRequiredInfo.value = mVProfileRequiredInfoValue;
                        mVProfileRequiredInfoValue.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAccountProfileRequiredInfo.status = MVVerificationStatus.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAccountProfileRequiredInfo$b */
    public static class C9546b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9545a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAccountProfileRequiredInfo$c */
    public static class C9547c extends C25240d<MVAccountProfileRequiredInfo> {
        public C9547c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountProfileRequiredInfo mVAccountProfileRequiredInfo = (MVAccountProfileRequiredInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountProfileRequiredInfo.mo29447f()) {
                bitSet.set(0);
            }
            if (mVAccountProfileRequiredInfo.mo29448g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAccountProfileRequiredInfo.mo29447f()) {
                jVar.mo61678B(mVAccountProfileRequiredInfo.status.getValue());
            }
            if (mVAccountProfileRequiredInfo.mo29448g()) {
                mVAccountProfileRequiredInfo.value.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountProfileRequiredInfo mVAccountProfileRequiredInfo = (MVAccountProfileRequiredInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVAccountProfileRequiredInfo.status = MVVerificationStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVProfileRequiredInfoValue mVProfileRequiredInfoValue = new MVProfileRequiredInfoValue();
                mVAccountProfileRequiredInfo.value = mVProfileRequiredInfoValue;
                mVProfileRequiredInfoValue.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAccountProfileRequiredInfo$d */
    public static class C9548d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9547c(0);
        }
    }

    static {
        new C17394d0("MVAccountProfileRequiredInfo");
        HashMap hashMap = new HashMap();
        f27022d = hashMap;
        hashMap.put(C25239c.class, new C9546b());
        hashMap.put(C25240d.class, new C9548d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVVerificationStatus.class)));
        enumMap.put(_Fields.VALUE, new FieldMetaData("value", (byte) 3, new StructMetaData(MVProfileRequiredInfoValue.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27023e = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountProfileRequiredInfo.class, unmodifiableMap);
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
        ((C25238b) f27022d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27022d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountProfileRequiredInfo mVAccountProfileRequiredInfo = (MVAccountProfileRequiredInfo) obj;
        if (!getClass().equals(mVAccountProfileRequiredInfo.getClass())) {
            return getClass().getName().compareTo(mVAccountProfileRequiredInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29447f()).compareTo(Boolean.valueOf(mVAccountProfileRequiredInfo.mo29447f()));
        if (compareTo2 != 0 || ((mo29447f() && (compareTo2 = this.status.compareTo(mVAccountProfileRequiredInfo.status)) != 0) || (compareTo2 = Boolean.valueOf(mo29448g()).compareTo(Boolean.valueOf(mVAccountProfileRequiredInfo.mo29448g()))) != 0)) {
            return compareTo2;
        }
        if (!mo29448g() || (compareTo = this.value.compareTo(mVAccountProfileRequiredInfo.value)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountProfileRequiredInfo)) {
            return false;
        }
        MVAccountProfileRequiredInfo mVAccountProfileRequiredInfo = (MVAccountProfileRequiredInfo) obj;
        boolean f = mo29447f();
        boolean f2 = mVAccountProfileRequiredInfo.mo29447f();
        if ((f || f2) && (!f || !f2 || !this.status.equals(mVAccountProfileRequiredInfo.status))) {
            return false;
        }
        boolean g = mo29448g();
        boolean g2 = mVAccountProfileRequiredInfo.mo29448g();
        if ((g || g2) && (!g || !g2 || !this.value.mo30492k(mVAccountProfileRequiredInfo.value))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29447f() {
        return this.status != null;
    }

    /* renamed from: g */
    public final boolean mo29448g() {
        return this.value != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountProfileRequiredInfo(", "status:");
        MVVerificationStatus mVVerificationStatus = this.status;
        if (mVVerificationStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVerificationStatus);
        }
        n.append(", ");
        n.append("value:");
        MVProfileRequiredInfoValue mVProfileRequiredInfoValue = this.value;
        if (mVProfileRequiredInfoValue == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVProfileRequiredInfoValue);
        }
        n.append(")");
        return n.toString();
    }
}
