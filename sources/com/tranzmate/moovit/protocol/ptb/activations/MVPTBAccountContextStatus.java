package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.models.InAppMessageBase;
import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.tranzmate.moovit.protocol.common.MVLinkedText;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus;
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

public class MVPTBAccountContextStatus implements TBase<MVPTBAccountContextStatus, _Fields>, Serializable, Cloneable, Comparable<MVPTBAccountContextStatus> {

    /* renamed from: b */
    public static final C25113c f27806b = new C25113c(ServerParameters.STATUS, (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27807c = new C25113c(InAppMessageBase.MESSAGE, (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27808d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27809e;
    public MVLinkedText message;
    private _Fields[] optionals = {_Fields.MESSAGE};
    public MVPaymentAccountContextStatus status;

    public enum _Fields implements C25085c {
        STATUS(1, ServerParameters.STATUS),
        MESSAGE(2, InAppMessageBase.MESSAGE);
        
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
                return STATUS;
            }
            if (i != 2) {
                return null;
            }
            return MESSAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountContextStatus$a */
    public static class C10149a extends C25239c<MVPTBAccountContextStatus> {
        public C10149a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBAccountContextStatus mVPTBAccountContextStatus = (MVPTBAccountContextStatus) tBase;
            MVLinkedText mVLinkedText = mVPTBAccountContextStatus.message;
            C25113c cVar = MVPTBAccountContextStatus.f27806b;
            gVar.mo61687K();
            if (mVPTBAccountContextStatus.status != null) {
                gVar.mo61711x(MVPTBAccountContextStatus.f27806b);
                gVar.mo61678B(mVPTBAccountContextStatus.status.getValue());
                gVar.mo61712y();
            }
            if (mVPTBAccountContextStatus.message != null && mVPTBAccountContextStatus.mo30787f()) {
                gVar.mo61711x(MVPTBAccountContextStatus.f27807c);
                mVPTBAccountContextStatus.message.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBAccountContextStatus mVPTBAccountContextStatus = (MVPTBAccountContextStatus) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLinkedText mVLinkedText = mVPTBAccountContextStatus.message;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVLinkedText mVLinkedText2 = new MVLinkedText();
                        mVPTBAccountContextStatus.message = mVLinkedText2;
                        mVLinkedText2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPTBAccountContextStatus.status = MVPaymentAccountContextStatus.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountContextStatus$b */
    public static class C10150b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10149a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountContextStatus$c */
    public static class C10151c extends C25240d<MVPTBAccountContextStatus> {
        public C10151c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBAccountContextStatus mVPTBAccountContextStatus = (MVPTBAccountContextStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBAccountContextStatus.mo30788g()) {
                bitSet.set(0);
            }
            if (mVPTBAccountContextStatus.mo30787f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPTBAccountContextStatus.mo30788g()) {
                jVar.mo61678B(mVPTBAccountContextStatus.status.getValue());
            }
            if (mVPTBAccountContextStatus.mo30787f()) {
                mVPTBAccountContextStatus.message.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBAccountContextStatus mVPTBAccountContextStatus = (MVPTBAccountContextStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPTBAccountContextStatus.status = MVPaymentAccountContextStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVLinkedText mVLinkedText = new MVLinkedText();
                mVPTBAccountContextStatus.message = mVLinkedText;
                mVLinkedText.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBAccountContextStatus$d */
    public static class C10152d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10151c(0);
        }
    }

    static {
        new C17394d0("MVPTBAccountContextStatus");
        HashMap hashMap = new HashMap();
        f27808d = hashMap;
        hashMap.put(C25239c.class, new C10150b());
        hashMap.put(C25240d.class, new C10152d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVPaymentAccountContextStatus.class)));
        enumMap.put(_Fields.MESSAGE, new FieldMetaData(InAppMessageBase.MESSAGE, (byte) 2, new StructMetaData(MVLinkedText.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27809e = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBAccountContextStatus.class, unmodifiableMap);
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
        ((C25238b) f27808d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27808d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30784a(MVPTBAccountContextStatus mVPTBAccountContextStatus) {
        if (mVPTBAccountContextStatus == null) {
            return false;
        }
        boolean g = mo30788g();
        boolean g2 = mVPTBAccountContextStatus.mo30788g();
        if ((g || g2) && (!g || !g2 || !this.status.equals(mVPTBAccountContextStatus.status))) {
            return false;
        }
        boolean f = mo30787f();
        boolean f2 = mVPTBAccountContextStatus.mo30787f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.message.mo26301a(mVPTBAccountContextStatus.message)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBAccountContextStatus mVPTBAccountContextStatus = (MVPTBAccountContextStatus) obj;
        if (!getClass().equals(mVPTBAccountContextStatus.getClass())) {
            return getClass().getName().compareTo(mVPTBAccountContextStatus.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30788g()).compareTo(Boolean.valueOf(mVPTBAccountContextStatus.mo30788g()));
        if (compareTo2 != 0 || ((mo30788g() && (compareTo2 = this.status.compareTo(mVPTBAccountContextStatus.status)) != 0) || (compareTo2 = Boolean.valueOf(mo30787f()).compareTo(Boolean.valueOf(mVPTBAccountContextStatus.mo30787f()))) != 0)) {
            return compareTo2;
        }
        if (!mo30787f() || (compareTo = this.message.compareTo(mVPTBAccountContextStatus.message)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPTBAccountContextStatus)) {
            return mo30784a((MVPTBAccountContextStatus) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30787f() {
        return this.message != null;
    }

    /* renamed from: g */
    public final boolean mo30788g() {
        return this.status != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBAccountContextStatus(", "status:");
        MVPaymentAccountContextStatus mVPaymentAccountContextStatus = this.status;
        if (mVPaymentAccountContextStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentAccountContextStatus);
        }
        if (mo30787f()) {
            n.append(", ");
            n.append("message:");
            MVLinkedText mVLinkedText = this.message;
            if (mVLinkedText == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLinkedText);
            }
        }
        n.append(")");
        return n.toString();
    }
}
