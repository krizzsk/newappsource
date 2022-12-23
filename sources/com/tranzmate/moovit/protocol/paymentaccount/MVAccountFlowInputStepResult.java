package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowInputStepResult implements TBase<MVAccountFlowInputStepResult, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowInputStepResult> {

    /* renamed from: b */
    public static final C25113c f26920b = new C25113c("handlerIdentifier", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26921c = new C25113c("inputFieldsValues", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f26922d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26923e;
    public String handlerIdentifier;
    public List<MVInputFieldValue> inputFieldsValues;

    public enum _Fields implements C25085c {
        HANDLER_IDENTIFIER(1, "handlerIdentifier"),
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
                return HANDLER_IDENTIFIER;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStepResult$a */
    public static class C9481a extends C25239c<MVAccountFlowInputStepResult> {
        public C9481a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowInputStepResult mVAccountFlowInputStepResult = (MVAccountFlowInputStepResult) tBase;
            mVAccountFlowInputStepResult.getClass();
            C25113c cVar = MVAccountFlowInputStepResult.f26920b;
            gVar.mo61687K();
            if (mVAccountFlowInputStepResult.handlerIdentifier != null) {
                gVar.mo61711x(MVAccountFlowInputStepResult.f26920b);
                gVar.mo61686J(mVAccountFlowInputStepResult.handlerIdentifier);
                gVar.mo61712y();
            }
            if (mVAccountFlowInputStepResult.inputFieldsValues != null) {
                gVar.mo61711x(MVAccountFlowInputStepResult.f26921c);
                gVar.mo61680D(new C25119e((byte) 12, mVAccountFlowInputStepResult.inputFieldsValues.size()));
                for (MVInputFieldValue X0 : mVAccountFlowInputStepResult.inputFieldsValues) {
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
            MVAccountFlowInputStepResult mVAccountFlowInputStepResult = (MVAccountFlowInputStepResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAccountFlowInputStepResult.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVAccountFlowInputStepResult.inputFieldsValues = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVInputFieldValue mVInputFieldValue = new MVInputFieldValue();
                            mVInputFieldValue.mo25201C1(gVar);
                            mVAccountFlowInputStepResult.inputFieldsValues.add(mVInputFieldValue);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAccountFlowInputStepResult.handlerIdentifier = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStepResult$b */
    public static class C9482b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9481a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStepResult$c */
    public static class C9483c extends C25240d<MVAccountFlowInputStepResult> {
        public C9483c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowInputStepResult mVAccountFlowInputStepResult = (MVAccountFlowInputStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowInputStepResult.mo29309f()) {
                bitSet.set(0);
            }
            if (mVAccountFlowInputStepResult.mo29310g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAccountFlowInputStepResult.mo29309f()) {
                jVar.mo61686J(mVAccountFlowInputStepResult.handlerIdentifier);
            }
            if (mVAccountFlowInputStepResult.mo29310g()) {
                jVar.mo61678B(mVAccountFlowInputStepResult.inputFieldsValues.size());
                for (MVInputFieldValue X0 : mVAccountFlowInputStepResult.inputFieldsValues) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowInputStepResult mVAccountFlowInputStepResult = (MVAccountFlowInputStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVAccountFlowInputStepResult.handlerIdentifier = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVAccountFlowInputStepResult.inputFieldsValues = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVInputFieldValue mVInputFieldValue = new MVInputFieldValue();
                    mVInputFieldValue.mo25201C1(jVar);
                    mVAccountFlowInputStepResult.inputFieldsValues.add(mVInputFieldValue);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStepResult$d */
    public static class C9484d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9483c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowInputStepResult");
        HashMap hashMap = new HashMap();
        f26922d = hashMap;
        hashMap.put(C25239c.class, new C9482b());
        hashMap.put(C25240d.class, new C9484d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.HANDLER_IDENTIFIER, new FieldMetaData("handlerIdentifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INPUT_FIELDS_VALUES, new FieldMetaData("inputFieldsValues", (byte) 3, new ListMetaData(new StructMetaData(MVInputFieldValue.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26923e = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowInputStepResult.class, unmodifiableMap);
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
        ((C25238b) f26922d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26922d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVAccountFlowInputStepResult mVAccountFlowInputStepResult = (MVAccountFlowInputStepResult) obj;
        if (!getClass().equals(mVAccountFlowInputStepResult.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowInputStepResult.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29309f()).compareTo(Boolean.valueOf(mVAccountFlowInputStepResult.mo29309f()));
        if (compareTo != 0 || ((mo29309f() && (compareTo = this.handlerIdentifier.compareTo(mVAccountFlowInputStepResult.handlerIdentifier)) != 0) || (compareTo = Boolean.valueOf(mo29310g()).compareTo(Boolean.valueOf(mVAccountFlowInputStepResult.mo29310g()))) != 0)) {
            return compareTo;
        }
        if (!mo29310g() || (h = C25082a.m62844h(this.inputFieldsValues, mVAccountFlowInputStepResult.inputFieldsValues)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowInputStepResult)) {
            return false;
        }
        MVAccountFlowInputStepResult mVAccountFlowInputStepResult = (MVAccountFlowInputStepResult) obj;
        boolean f = mo29309f();
        boolean f2 = mVAccountFlowInputStepResult.mo29309f();
        if ((f || f2) && (!f || !f2 || !this.handlerIdentifier.equals(mVAccountFlowInputStepResult.handlerIdentifier))) {
            return false;
        }
        boolean g = mo29310g();
        boolean g2 = mVAccountFlowInputStepResult.mo29310g();
        if ((g || g2) && (!g || !g2 || !this.inputFieldsValues.equals(mVAccountFlowInputStepResult.inputFieldsValues))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29309f() {
        return this.handlerIdentifier != null;
    }

    /* renamed from: g */
    public final boolean mo29310g() {
        return this.inputFieldsValues != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowInputStepResult(", "handlerIdentifier:");
        String str = this.handlerIdentifier;
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
