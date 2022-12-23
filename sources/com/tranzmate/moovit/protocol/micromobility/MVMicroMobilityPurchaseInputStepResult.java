package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.payments.MVInputFieldValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVMicroMobilityPurchaseInputStepResult implements TBase<MVMicroMobilityPurchaseInputStepResult, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseInputStepResult> {

    /* renamed from: b */
    public static final C25113c f26627b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26628c = new C25113c("inputFieldsValues", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f26629d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26630e;

    /* renamed from: id */
    public String f26631id;
    public List<MVInputFieldValue> inputFieldsValues;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        INPUT_FIELDS_VALUES(2, "inputFieldsValues");
        
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
                return ID;
            }
            if (i != 2) {
                return null;
            }
            return INPUT_FIELDS_VALUES;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStepResult$a */
    public static class C9277a extends C25239c<MVMicroMobilityPurchaseInputStepResult> {
        public C9277a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseInputStepResult mVMicroMobilityPurchaseInputStepResult = (MVMicroMobilityPurchaseInputStepResult) tBase;
            mVMicroMobilityPurchaseInputStepResult.getClass();
            C25113c cVar = MVMicroMobilityPurchaseInputStepResult.f26627b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseInputStepResult.f26631id != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseInputStepResult.f26627b);
                gVar.mo61686J(mVMicroMobilityPurchaseInputStepResult.f26631id);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseInputStepResult.inputFieldsValues != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseInputStepResult.f26628c);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityPurchaseInputStepResult.inputFieldsValues.size()));
                for (MVInputFieldValue X0 : mVMicroMobilityPurchaseInputStepResult.inputFieldsValues) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseInputStepResult mVMicroMobilityPurchaseInputStepResult = (MVMicroMobilityPurchaseInputStepResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchaseInputStepResult.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVMicroMobilityPurchaseInputStepResult.inputFieldsValues = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVInputFieldValue mVInputFieldValue = new MVInputFieldValue();
                            mVInputFieldValue.mo25201C1(gVar);
                            mVMicroMobilityPurchaseInputStepResult.inputFieldsValues.add(mVInputFieldValue);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityPurchaseInputStepResult.f26631id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStepResult$b */
    public static class C9278b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9277a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStepResult$c */
    public static class C9279c extends C25240d<MVMicroMobilityPurchaseInputStepResult> {
        public C9279c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseInputStepResult mVMicroMobilityPurchaseInputStepResult = (MVMicroMobilityPurchaseInputStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseInputStepResult.mo28834f()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPurchaseInputStepResult.mo28835g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMicroMobilityPurchaseInputStepResult.mo28834f()) {
                jVar.mo61686J(mVMicroMobilityPurchaseInputStepResult.f26631id);
            }
            if (mVMicroMobilityPurchaseInputStepResult.mo28835g()) {
                jVar.mo61678B(mVMicroMobilityPurchaseInputStepResult.inputFieldsValues.size());
                for (MVInputFieldValue X0 : mVMicroMobilityPurchaseInputStepResult.inputFieldsValues) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseInputStepResult mVMicroMobilityPurchaseInputStepResult = (MVMicroMobilityPurchaseInputStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVMicroMobilityPurchaseInputStepResult.f26631id = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVMicroMobilityPurchaseInputStepResult.inputFieldsValues = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVInputFieldValue mVInputFieldValue = new MVInputFieldValue();
                    mVInputFieldValue.mo25201C1(jVar);
                    mVMicroMobilityPurchaseInputStepResult.inputFieldsValues.add(mVInputFieldValue);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStepResult$d */
    public static class C9280d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9279c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseInputStepResult");
        HashMap hashMap = new HashMap();
        f26629d = hashMap;
        hashMap.put(C25239c.class, new C9278b());
        hashMap.put(C25240d.class, new C9280d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INPUT_FIELDS_VALUES, new FieldMetaData("inputFieldsValues", (byte) 3, new ListMetaData(new StructMetaData(MVInputFieldValue.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26630e = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseInputStepResult.class, unmodifiableMap);
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
        ((C25238b) f26629d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26629d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVMicroMobilityPurchaseInputStepResult mVMicroMobilityPurchaseInputStepResult = (MVMicroMobilityPurchaseInputStepResult) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseInputStepResult.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseInputStepResult.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28834f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseInputStepResult.mo28834f()));
        if (compareTo != 0 || ((mo28834f() && (compareTo = this.f26631id.compareTo(mVMicroMobilityPurchaseInputStepResult.f26631id)) != 0) || (compareTo = Boolean.valueOf(mo28835g()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseInputStepResult.mo28835g()))) != 0)) {
            return compareTo;
        }
        if (!mo28835g() || (h = C25082a.m62844h(this.inputFieldsValues, mVMicroMobilityPurchaseInputStepResult.inputFieldsValues)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchaseInputStepResult)) {
            return false;
        }
        MVMicroMobilityPurchaseInputStepResult mVMicroMobilityPurchaseInputStepResult = (MVMicroMobilityPurchaseInputStepResult) obj;
        boolean f = mo28834f();
        boolean f2 = mVMicroMobilityPurchaseInputStepResult.mo28834f();
        if ((f || f2) && (!f || !f2 || !this.f26631id.equals(mVMicroMobilityPurchaseInputStepResult.f26631id))) {
            return false;
        }
        boolean g = mo28835g();
        boolean g2 = mVMicroMobilityPurchaseInputStepResult.mo28835g();
        if ((g || g2) && (!g || !g2 || !this.inputFieldsValues.equals(mVMicroMobilityPurchaseInputStepResult.inputFieldsValues))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28834f() {
        return this.f26631id != null;
    }

    /* renamed from: g */
    public final boolean mo28835g() {
        return this.inputFieldsValues != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchaseInputStepResult(", "id:");
        String str = this.f26631id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("inputFieldsValues:");
        List<MVInputFieldValue> list = this.inputFieldsValues;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
