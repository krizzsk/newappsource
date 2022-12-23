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

public class MVMicroMobilityPurchaseQrCodeStepResult implements TBase<MVMicroMobilityPurchaseQrCodeStepResult, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseQrCodeStepResult> {

    /* renamed from: b */
    public static final C25113c f26685b = new C25113c("qrCode", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f26686c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26687d;
    private _Fields[] optionals = {_Fields.QR_CODE};
    public String qrCode;

    public enum _Fields implements C25085c {
        QR_CODE(1, "qrCode");
        
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
            return QR_CODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseQrCodeStepResult$a */
    public static class C9318a extends C25239c<MVMicroMobilityPurchaseQrCodeStepResult> {
        public C9318a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseQrCodeStepResult mVMicroMobilityPurchaseQrCodeStepResult = (MVMicroMobilityPurchaseQrCodeStepResult) tBase;
            mVMicroMobilityPurchaseQrCodeStepResult.getClass();
            C25113c cVar = MVMicroMobilityPurchaseQrCodeStepResult.f26685b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseQrCodeStepResult.qrCode != null && mVMicroMobilityPurchaseQrCodeStepResult.mo28921f()) {
                gVar.mo61711x(MVMicroMobilityPurchaseQrCodeStepResult.f26685b);
                gVar.mo61686J(mVMicroMobilityPurchaseQrCodeStepResult.qrCode);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseQrCodeStepResult mVMicroMobilityPurchaseQrCodeStepResult = (MVMicroMobilityPurchaseQrCodeStepResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchaseQrCodeStepResult.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVMicroMobilityPurchaseQrCodeStepResult.qrCode = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseQrCodeStepResult$b */
    public static class C9319b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9318a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseQrCodeStepResult$c */
    public static class C9320c extends C25240d<MVMicroMobilityPurchaseQrCodeStepResult> {
        public C9320c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseQrCodeStepResult mVMicroMobilityPurchaseQrCodeStepResult = (MVMicroMobilityPurchaseQrCodeStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseQrCodeStepResult.mo28921f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityPurchaseQrCodeStepResult.mo28921f()) {
                jVar.mo61686J(mVMicroMobilityPurchaseQrCodeStepResult.qrCode);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseQrCodeStepResult mVMicroMobilityPurchaseQrCodeStepResult = (MVMicroMobilityPurchaseQrCodeStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVMicroMobilityPurchaseQrCodeStepResult.qrCode = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseQrCodeStepResult$d */
    public static class C9321d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9320c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseQrCodeStepResult");
        HashMap hashMap = new HashMap();
        f26686c = hashMap;
        hashMap.put(C25239c.class, new C9319b());
        hashMap.put(C25240d.class, new C9321d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.QR_CODE, new FieldMetaData("qrCode", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26687d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseQrCodeStepResult.class, unmodifiableMap);
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
        ((C25238b) f26686c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26686c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchaseQrCodeStepResult mVMicroMobilityPurchaseQrCodeStepResult = (MVMicroMobilityPurchaseQrCodeStepResult) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseQrCodeStepResult.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseQrCodeStepResult.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28921f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseQrCodeStepResult.mo28921f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo28921f() || (compareTo = this.qrCode.compareTo(mVMicroMobilityPurchaseQrCodeStepResult.qrCode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchaseQrCodeStepResult)) {
            return false;
        }
        MVMicroMobilityPurchaseQrCodeStepResult mVMicroMobilityPurchaseQrCodeStepResult = (MVMicroMobilityPurchaseQrCodeStepResult) obj;
        boolean f = mo28921f();
        boolean f2 = mVMicroMobilityPurchaseQrCodeStepResult.mo28921f();
        if ((f || f2) && (!f || !f2 || !this.qrCode.equals(mVMicroMobilityPurchaseQrCodeStepResult.qrCode))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28921f() {
        return this.qrCode != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVMicroMobilityPurchaseQrCodeStepResult(");
        if (mo28921f()) {
            sb.append("qrCode:");
            String str = this.qrCode;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
