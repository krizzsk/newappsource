package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowOptionSelectionStepResult implements TBase<MVAccountFlowOptionSelectionStepResult, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowOptionSelectionStepResult> {

    /* renamed from: b */
    public static final C25113c f26954b = new C25113c("type", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26955c = new C25113c("selectedOptionId", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f26956d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26957e;
    public String selectedOptionId;
    public String type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        SELECTED_OPTION_ID(2, "selectedOptionId");
        
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
                return TYPE;
            }
            if (i != 2) {
                return null;
            }
            return SELECTED_OPTION_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStepResult$a */
    public static class C9502a extends C25239c<MVAccountFlowOptionSelectionStepResult> {
        public C9502a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOptionSelectionStepResult mVAccountFlowOptionSelectionStepResult = (MVAccountFlowOptionSelectionStepResult) tBase;
            mVAccountFlowOptionSelectionStepResult.getClass();
            C25113c cVar = MVAccountFlowOptionSelectionStepResult.f26954b;
            gVar.mo61687K();
            if (mVAccountFlowOptionSelectionStepResult.type != null) {
                gVar.mo61711x(MVAccountFlowOptionSelectionStepResult.f26954b);
                gVar.mo61686J(mVAccountFlowOptionSelectionStepResult.type);
                gVar.mo61712y();
            }
            if (mVAccountFlowOptionSelectionStepResult.selectedOptionId != null) {
                gVar.mo61711x(MVAccountFlowOptionSelectionStepResult.f26955c);
                gVar.mo61686J(mVAccountFlowOptionSelectionStepResult.selectedOptionId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOptionSelectionStepResult mVAccountFlowOptionSelectionStepResult = (MVAccountFlowOptionSelectionStepResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAccountFlowOptionSelectionStepResult.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVAccountFlowOptionSelectionStepResult.selectedOptionId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAccountFlowOptionSelectionStepResult.type = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStepResult$b */
    public static class C9503b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9502a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStepResult$c */
    public static class C9504c extends C25240d<MVAccountFlowOptionSelectionStepResult> {
        public C9504c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOptionSelectionStepResult mVAccountFlowOptionSelectionStepResult = (MVAccountFlowOptionSelectionStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowOptionSelectionStepResult.mo29358g()) {
                bitSet.set(0);
            }
            if (mVAccountFlowOptionSelectionStepResult.mo29357f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAccountFlowOptionSelectionStepResult.mo29358g()) {
                jVar.mo61686J(mVAccountFlowOptionSelectionStepResult.type);
            }
            if (mVAccountFlowOptionSelectionStepResult.mo29357f()) {
                jVar.mo61686J(mVAccountFlowOptionSelectionStepResult.selectedOptionId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOptionSelectionStepResult mVAccountFlowOptionSelectionStepResult = (MVAccountFlowOptionSelectionStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVAccountFlowOptionSelectionStepResult.type = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVAccountFlowOptionSelectionStepResult.selectedOptionId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStepResult$d */
    public static class C9505d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9504c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowOptionSelectionStepResult");
        HashMap hashMap = new HashMap();
        f26956d = hashMap;
        hashMap.put(C25239c.class, new C9503b());
        hashMap.put(C25240d.class, new C9505d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SELECTED_OPTION_ID, new FieldMetaData("selectedOptionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26957e = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowOptionSelectionStepResult.class, unmodifiableMap);
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
        ((C25238b) f26956d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26956d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowOptionSelectionStepResult mVAccountFlowOptionSelectionStepResult = (MVAccountFlowOptionSelectionStepResult) obj;
        if (!getClass().equals(mVAccountFlowOptionSelectionStepResult.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowOptionSelectionStepResult.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29358g()).compareTo(Boolean.valueOf(mVAccountFlowOptionSelectionStepResult.mo29358g()));
        if (compareTo2 != 0 || ((mo29358g() && (compareTo2 = this.type.compareTo(mVAccountFlowOptionSelectionStepResult.type)) != 0) || (compareTo2 = Boolean.valueOf(mo29357f()).compareTo(Boolean.valueOf(mVAccountFlowOptionSelectionStepResult.mo29357f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29357f() || (compareTo = this.selectedOptionId.compareTo(mVAccountFlowOptionSelectionStepResult.selectedOptionId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowOptionSelectionStepResult)) {
            return false;
        }
        MVAccountFlowOptionSelectionStepResult mVAccountFlowOptionSelectionStepResult = (MVAccountFlowOptionSelectionStepResult) obj;
        boolean g = mo29358g();
        boolean g2 = mVAccountFlowOptionSelectionStepResult.mo29358g();
        if ((g || g2) && (!g || !g2 || !this.type.equals(mVAccountFlowOptionSelectionStepResult.type))) {
            return false;
        }
        boolean f = mo29357f();
        boolean f2 = mVAccountFlowOptionSelectionStepResult.mo29357f();
        if ((f || f2) && (!f || !f2 || !this.selectedOptionId.equals(mVAccountFlowOptionSelectionStepResult.selectedOptionId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29357f() {
        return this.selectedOptionId != null;
    }

    /* renamed from: g */
    public final boolean mo29358g() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowOptionSelectionStepResult(", "type:");
        String str = this.type;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("selectedOptionId:");
        String str2 = this.selectedOptionId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
