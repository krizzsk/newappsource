package com.tranzmate.moovit.protocol.paymentaccount;

import com.appboy.support.StringUtils;
import com.usebutton.sdk.internal.events.Events;
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

public class MVAccountFlowWizardCompleted implements TBase<MVAccountFlowWizardCompleted, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowWizardCompleted> {

    /* renamed from: b */
    public static final C25113c f27011b = new C25113c("toastMessage", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27012c = new C25113c(Events.PROPERTY_DEEPLINK, (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27013d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27014e;
    public String deeplink;
    private _Fields[] optionals = {_Fields.TOAST_MESSAGE, _Fields.DEEPLINK};
    public String toastMessage;

    public enum _Fields implements C25085c {
        TOAST_MESSAGE(1, "toastMessage"),
        DEEPLINK(2, Events.PROPERTY_DEEPLINK);
        
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
                return TOAST_MESSAGE;
            }
            if (i != 2) {
                return null;
            }
            return DEEPLINK;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowWizardCompleted$a */
    public static class C9537a extends C25239c<MVAccountFlowWizardCompleted> {
        public C9537a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowWizardCompleted mVAccountFlowWizardCompleted = (MVAccountFlowWizardCompleted) tBase;
            mVAccountFlowWizardCompleted.getClass();
            C25113c cVar = MVAccountFlowWizardCompleted.f27011b;
            gVar.mo61687K();
            if (mVAccountFlowWizardCompleted.toastMessage != null && mVAccountFlowWizardCompleted.mo29433g()) {
                gVar.mo61711x(MVAccountFlowWizardCompleted.f27011b);
                gVar.mo61686J(mVAccountFlowWizardCompleted.toastMessage);
                gVar.mo61712y();
            }
            if (mVAccountFlowWizardCompleted.deeplink != null && mVAccountFlowWizardCompleted.mo29432f()) {
                gVar.mo61711x(MVAccountFlowWizardCompleted.f27012c);
                gVar.mo61686J(mVAccountFlowWizardCompleted.deeplink);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowWizardCompleted mVAccountFlowWizardCompleted = (MVAccountFlowWizardCompleted) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAccountFlowWizardCompleted.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVAccountFlowWizardCompleted.deeplink = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAccountFlowWizardCompleted.toastMessage = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowWizardCompleted$b */
    public static class C9538b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9537a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowWizardCompleted$c */
    public static class C9539c extends C25240d<MVAccountFlowWizardCompleted> {
        public C9539c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowWizardCompleted mVAccountFlowWizardCompleted = (MVAccountFlowWizardCompleted) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowWizardCompleted.mo29433g()) {
                bitSet.set(0);
            }
            if (mVAccountFlowWizardCompleted.mo29432f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAccountFlowWizardCompleted.mo29433g()) {
                jVar.mo61686J(mVAccountFlowWizardCompleted.toastMessage);
            }
            if (mVAccountFlowWizardCompleted.mo29432f()) {
                jVar.mo61686J(mVAccountFlowWizardCompleted.deeplink);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowWizardCompleted mVAccountFlowWizardCompleted = (MVAccountFlowWizardCompleted) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVAccountFlowWizardCompleted.toastMessage = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVAccountFlowWizardCompleted.deeplink = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowWizardCompleted$d */
    public static class C9540d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9539c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowWizardCompleted");
        HashMap hashMap = new HashMap();
        f27013d = hashMap;
        hashMap.put(C25239c.class, new C9538b());
        hashMap.put(C25240d.class, new C9540d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TOAST_MESSAGE, new FieldMetaData("toastMessage", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DEEPLINK, new FieldMetaData(Events.PROPERTY_DEEPLINK, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27014e = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowWizardCompleted.class, unmodifiableMap);
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
        ((C25238b) f27013d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27013d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowWizardCompleted mVAccountFlowWizardCompleted = (MVAccountFlowWizardCompleted) obj;
        if (!getClass().equals(mVAccountFlowWizardCompleted.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowWizardCompleted.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29433g()).compareTo(Boolean.valueOf(mVAccountFlowWizardCompleted.mo29433g()));
        if (compareTo2 != 0 || ((mo29433g() && (compareTo2 = this.toastMessage.compareTo(mVAccountFlowWizardCompleted.toastMessage)) != 0) || (compareTo2 = Boolean.valueOf(mo29432f()).compareTo(Boolean.valueOf(mVAccountFlowWizardCompleted.mo29432f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29432f() || (compareTo = this.deeplink.compareTo(mVAccountFlowWizardCompleted.deeplink)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowWizardCompleted)) {
            return false;
        }
        MVAccountFlowWizardCompleted mVAccountFlowWizardCompleted = (MVAccountFlowWizardCompleted) obj;
        boolean g = mo29433g();
        boolean g2 = mVAccountFlowWizardCompleted.mo29433g();
        if ((g || g2) && (!g || !g2 || !this.toastMessage.equals(mVAccountFlowWizardCompleted.toastMessage))) {
            return false;
        }
        boolean f = mo29432f();
        boolean f2 = mVAccountFlowWizardCompleted.mo29432f();
        if ((f || f2) && (!f || !f2 || !this.deeplink.equals(mVAccountFlowWizardCompleted.deeplink))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29432f() {
        return this.deeplink != null;
    }

    /* renamed from: g */
    public final boolean mo29433g() {
        return this.toastMessage != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVAccountFlowWizardCompleted(");
        if (mo29433g()) {
            sb.append("toastMessage:");
            String str = this.toastMessage;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29432f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("deeplink:");
            String str2 = this.deeplink;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
