package com.tranzmate.moovit.protocol.serviceAlerts;

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

public class MVLineAlertSubscriptionUpdate implements TBase<MVLineAlertSubscriptionUpdate, _Fields>, Serializable, Cloneable, Comparable<MVLineAlertSubscriptionUpdate> {

    /* renamed from: b */
    public static final C25113c f28258b = new C25113c("subscribe", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28259c = new C25113c("unSubscribe", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f28260d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28261e;
    public MVServiceAlertSubscriptionLine subscribe;
    public MVServiceAlertSubscriptionLine unSubscribe;

    public enum _Fields implements C25085c {
        SUBSCRIBE(1, "subscribe"),
        UN_SUBSCRIBE(2, "unSubscribe");
        
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
                return SUBSCRIBE;
            }
            if (i != 2) {
                return null;
            }
            return UN_SUBSCRIBE;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertSubscriptionUpdate$a */
    public static class C10487a extends C25239c<MVLineAlertSubscriptionUpdate> {
        public C10487a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineAlertSubscriptionUpdate mVLineAlertSubscriptionUpdate = (MVLineAlertSubscriptionUpdate) tBase;
            MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine = mVLineAlertSubscriptionUpdate.subscribe;
            C25113c cVar = MVLineAlertSubscriptionUpdate.f28258b;
            gVar.mo61687K();
            if (mVLineAlertSubscriptionUpdate.subscribe != null) {
                gVar.mo61711x(MVLineAlertSubscriptionUpdate.f28258b);
                mVLineAlertSubscriptionUpdate.subscribe.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLineAlertSubscriptionUpdate.unSubscribe != null) {
                gVar.mo61711x(MVLineAlertSubscriptionUpdate.f28259c);
                mVLineAlertSubscriptionUpdate.unSubscribe.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineAlertSubscriptionUpdate mVLineAlertSubscriptionUpdate = (MVLineAlertSubscriptionUpdate) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine = mVLineAlertSubscriptionUpdate.subscribe;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine2 = new MVServiceAlertSubscriptionLine();
                        mVLineAlertSubscriptionUpdate.unSubscribe = mVServiceAlertSubscriptionLine2;
                        mVServiceAlertSubscriptionLine2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine3 = new MVServiceAlertSubscriptionLine();
                    mVLineAlertSubscriptionUpdate.subscribe = mVServiceAlertSubscriptionLine3;
                    mVServiceAlertSubscriptionLine3.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertSubscriptionUpdate$b */
    public static class C10488b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10487a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertSubscriptionUpdate$c */
    public static class C10489c extends C25240d<MVLineAlertSubscriptionUpdate> {
        public C10489c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineAlertSubscriptionUpdate mVLineAlertSubscriptionUpdate = (MVLineAlertSubscriptionUpdate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineAlertSubscriptionUpdate.mo31618f()) {
                bitSet.set(0);
            }
            if (mVLineAlertSubscriptionUpdate.mo31619g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVLineAlertSubscriptionUpdate.mo31618f()) {
                mVLineAlertSubscriptionUpdate.subscribe.mo25202X0(jVar);
            }
            if (mVLineAlertSubscriptionUpdate.mo31619g()) {
                mVLineAlertSubscriptionUpdate.unSubscribe.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineAlertSubscriptionUpdate mVLineAlertSubscriptionUpdate = (MVLineAlertSubscriptionUpdate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine = new MVServiceAlertSubscriptionLine();
                mVLineAlertSubscriptionUpdate.subscribe = mVServiceAlertSubscriptionLine;
                mVServiceAlertSubscriptionLine.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine2 = new MVServiceAlertSubscriptionLine();
                mVLineAlertSubscriptionUpdate.unSubscribe = mVServiceAlertSubscriptionLine2;
                mVServiceAlertSubscriptionLine2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertSubscriptionUpdate$d */
    public static class C10490d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10489c(0);
        }
    }

    static {
        new C17394d0("MVLineAlertSubscriptionUpdate");
        HashMap hashMap = new HashMap();
        f28260d = hashMap;
        hashMap.put(C25239c.class, new C10488b());
        hashMap.put(C25240d.class, new C10490d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUBSCRIBE, new FieldMetaData("subscribe", (byte) 3, new StructMetaData(MVServiceAlertSubscriptionLine.class)));
        enumMap.put(_Fields.UN_SUBSCRIBE, new FieldMetaData("unSubscribe", (byte) 3, new StructMetaData(MVServiceAlertSubscriptionLine.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28261e = unmodifiableMap;
        FieldMetaData.m61947a(MVLineAlertSubscriptionUpdate.class, unmodifiableMap);
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
        ((C25238b) f28260d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28260d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLineAlertSubscriptionUpdate mVLineAlertSubscriptionUpdate = (MVLineAlertSubscriptionUpdate) obj;
        if (!getClass().equals(mVLineAlertSubscriptionUpdate.getClass())) {
            return getClass().getName().compareTo(mVLineAlertSubscriptionUpdate.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31618f()).compareTo(Boolean.valueOf(mVLineAlertSubscriptionUpdate.mo31618f()));
        if (compareTo2 != 0 || ((mo31618f() && (compareTo2 = this.subscribe.compareTo(mVLineAlertSubscriptionUpdate.subscribe)) != 0) || (compareTo2 = Boolean.valueOf(mo31619g()).compareTo(Boolean.valueOf(mVLineAlertSubscriptionUpdate.mo31619g()))) != 0)) {
            return compareTo2;
        }
        if (!mo31619g() || (compareTo = this.unSubscribe.compareTo(mVLineAlertSubscriptionUpdate.unSubscribe)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineAlertSubscriptionUpdate)) {
            return false;
        }
        MVLineAlertSubscriptionUpdate mVLineAlertSubscriptionUpdate = (MVLineAlertSubscriptionUpdate) obj;
        boolean f = mo31618f();
        boolean f2 = mVLineAlertSubscriptionUpdate.mo31618f();
        if ((f || f2) && (!f || !f2 || !this.subscribe.mo31660a(mVLineAlertSubscriptionUpdate.subscribe))) {
            return false;
        }
        boolean g = mo31619g();
        boolean g2 = mVLineAlertSubscriptionUpdate.mo31619g();
        if ((g || g2) && (!g || !g2 || !this.unSubscribe.mo31660a(mVLineAlertSubscriptionUpdate.unSubscribe))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31618f() {
        return this.subscribe != null;
    }

    /* renamed from: g */
    public final boolean mo31619g() {
        return this.unSubscribe != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineAlertSubscriptionUpdate(", "subscribe:");
        MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine = this.subscribe;
        if (mVServiceAlertSubscriptionLine == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVServiceAlertSubscriptionLine);
        }
        n.append(", ");
        n.append("unSubscribe:");
        MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine2 = this.unSubscribe;
        if (mVServiceAlertSubscriptionLine2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVServiceAlertSubscriptionLine2);
        }
        n.append(")");
        return n.toString();
    }
}
