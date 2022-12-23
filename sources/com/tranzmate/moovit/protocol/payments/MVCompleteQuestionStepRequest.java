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

public class MVCompleteQuestionStepRequest implements TBase<MVCompleteQuestionStepRequest, _Fields>, Serializable, Cloneable, Comparable<MVCompleteQuestionStepRequest> {

    /* renamed from: b */
    public static final C25113c f27189b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27190c = new C25113c("questionId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27191d = new C25113c("selectedButtonId", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f27192e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27193f;
    public String paymentContext;
    public String questionId;
    public String selectedButtonId;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        QUESTION_ID(2, "questionId"),
        SELECTED_BUTTON_ID(3, "selectedButtonId");
        
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
                return PAYMENT_CONTEXT;
            }
            if (i == 2) {
                return QUESTION_ID;
            }
            if (i != 3) {
                return null;
            }
            return SELECTED_BUTTON_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCompleteQuestionStepRequest$a */
    public static class C9672a extends C25239c<MVCompleteQuestionStepRequest> {
        public C9672a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCompleteQuestionStepRequest mVCompleteQuestionStepRequest = (MVCompleteQuestionStepRequest) tBase;
            mVCompleteQuestionStepRequest.getClass();
            C25113c cVar = MVCompleteQuestionStepRequest.f27189b;
            gVar.mo61687K();
            if (mVCompleteQuestionStepRequest.paymentContext != null) {
                gVar.mo61711x(MVCompleteQuestionStepRequest.f27189b);
                gVar.mo61686J(mVCompleteQuestionStepRequest.paymentContext);
                gVar.mo61712y();
            }
            if (mVCompleteQuestionStepRequest.questionId != null) {
                gVar.mo61711x(MVCompleteQuestionStepRequest.f27190c);
                gVar.mo61686J(mVCompleteQuestionStepRequest.questionId);
                gVar.mo61712y();
            }
            if (mVCompleteQuestionStepRequest.selectedButtonId != null) {
                gVar.mo61711x(MVCompleteQuestionStepRequest.f27191d);
                gVar.mo61686J(mVCompleteQuestionStepRequest.selectedButtonId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCompleteQuestionStepRequest mVCompleteQuestionStepRequest = (MVCompleteQuestionStepRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCompleteQuestionStepRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVCompleteQuestionStepRequest.selectedButtonId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCompleteQuestionStepRequest.questionId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCompleteQuestionStepRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCompleteQuestionStepRequest$b */
    public static class C9673b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9672a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCompleteQuestionStepRequest$c */
    public static class C9674c extends C25240d<MVCompleteQuestionStepRequest> {
        public C9674c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCompleteQuestionStepRequest mVCompleteQuestionStepRequest = (MVCompleteQuestionStepRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCompleteQuestionStepRequest.mo29729f()) {
                bitSet.set(0);
            }
            if (mVCompleteQuestionStepRequest.mo29730g()) {
                bitSet.set(1);
            }
            if (mVCompleteQuestionStepRequest.mo29731h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCompleteQuestionStepRequest.mo29729f()) {
                jVar.mo61686J(mVCompleteQuestionStepRequest.paymentContext);
            }
            if (mVCompleteQuestionStepRequest.mo29730g()) {
                jVar.mo61686J(mVCompleteQuestionStepRequest.questionId);
            }
            if (mVCompleteQuestionStepRequest.mo29731h()) {
                jVar.mo61686J(mVCompleteQuestionStepRequest.selectedButtonId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCompleteQuestionStepRequest mVCompleteQuestionStepRequest = (MVCompleteQuestionStepRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVCompleteQuestionStepRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCompleteQuestionStepRequest.questionId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCompleteQuestionStepRequest.selectedButtonId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCompleteQuestionStepRequest$d */
    public static class C9675d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9674c(0);
        }
    }

    static {
        new C17394d0("MVCompleteQuestionStepRequest");
        HashMap hashMap = new HashMap();
        f27192e = hashMap;
        hashMap.put(C25239c.class, new C9673b());
        hashMap.put(C25240d.class, new C9675d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.QUESTION_ID, new FieldMetaData("questionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SELECTED_BUTTON_ID, new FieldMetaData("selectedButtonId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27193f = unmodifiableMap;
        FieldMetaData.m61947a(MVCompleteQuestionStepRequest.class, unmodifiableMap);
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
        ((C25238b) f27192e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27192e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCompleteQuestionStepRequest mVCompleteQuestionStepRequest = (MVCompleteQuestionStepRequest) obj;
        if (!getClass().equals(mVCompleteQuestionStepRequest.getClass())) {
            return getClass().getName().compareTo(mVCompleteQuestionStepRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29729f()).compareTo(Boolean.valueOf(mVCompleteQuestionStepRequest.mo29729f()));
        if (compareTo2 != 0 || ((mo29729f() && (compareTo2 = this.paymentContext.compareTo(mVCompleteQuestionStepRequest.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo29730g()).compareTo(Boolean.valueOf(mVCompleteQuestionStepRequest.mo29730g()))) != 0 || ((mo29730g() && (compareTo2 = this.questionId.compareTo(mVCompleteQuestionStepRequest.questionId)) != 0) || (compareTo2 = Boolean.valueOf(mo29731h()).compareTo(Boolean.valueOf(mVCompleteQuestionStepRequest.mo29731h()))) != 0))) {
            return compareTo2;
        }
        if (!mo29731h() || (compareTo = this.selectedButtonId.compareTo(mVCompleteQuestionStepRequest.selectedButtonId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCompleteQuestionStepRequest)) {
            return false;
        }
        MVCompleteQuestionStepRequest mVCompleteQuestionStepRequest = (MVCompleteQuestionStepRequest) obj;
        boolean f = mo29729f();
        boolean f2 = mVCompleteQuestionStepRequest.mo29729f();
        if ((f || f2) && (!f || !f2 || !this.paymentContext.equals(mVCompleteQuestionStepRequest.paymentContext))) {
            return false;
        }
        boolean g = mo29730g();
        boolean g2 = mVCompleteQuestionStepRequest.mo29730g();
        if ((g || g2) && (!g || !g2 || !this.questionId.equals(mVCompleteQuestionStepRequest.questionId))) {
            return false;
        }
        boolean h = mo29731h();
        boolean h2 = mVCompleteQuestionStepRequest.mo29731h();
        if ((h || h2) && (!h || !h2 || !this.selectedButtonId.equals(mVCompleteQuestionStepRequest.selectedButtonId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29729f() {
        return this.paymentContext != null;
    }

    /* renamed from: g */
    public final boolean mo29730g() {
        return this.questionId != null;
    }

    /* renamed from: h */
    public final boolean mo29731h() {
        return this.selectedButtonId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCompleteQuestionStepRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("questionId:");
        String str2 = this.questionId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("selectedButtonId:");
        String str3 = this.selectedButtonId;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(")");
        return n.toString();
    }
}
