package com.tranzmate.moovit.protocol.users;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVUpdatePushToken implements TBase<MVUpdatePushToken, _Fields>, Serializable, Cloneable, Comparable<MVUpdatePushToken> {

    /* renamed from: b */
    public static final C25113c f30570b = new C25113c("pushNotificationToken", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30571c = new C25113c("pushEnv", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f30572d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30573e;
    public MVAppId pushEnv;
    public String pushNotificationToken;

    public enum _Fields implements C25085c {
        PUSH_NOTIFICATION_TOKEN(1, "pushNotificationToken"),
        PUSH_ENV(2, "pushEnv");
        
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
                return PUSH_NOTIFICATION_TOKEN;
            }
            if (i != 2) {
                return null;
            }
            return PUSH_ENV;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdatePushToken$a */
    public static class C11925a extends C25239c<MVUpdatePushToken> {
        public C11925a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdatePushToken mVUpdatePushToken = (MVUpdatePushToken) tBase;
            mVUpdatePushToken.getClass();
            C25113c cVar = MVUpdatePushToken.f30570b;
            gVar.mo61687K();
            if (mVUpdatePushToken.pushNotificationToken != null) {
                gVar.mo61711x(MVUpdatePushToken.f30570b);
                gVar.mo61686J(mVUpdatePushToken.pushNotificationToken);
                gVar.mo61712y();
            }
            if (mVUpdatePushToken.pushEnv != null) {
                gVar.mo61711x(MVUpdatePushToken.f30571c);
                gVar.mo61678B(mVUpdatePushToken.pushEnv.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdatePushToken mVUpdatePushToken = (MVUpdatePushToken) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUpdatePushToken.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVUpdatePushToken.pushEnv = MVAppId.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVUpdatePushToken.pushNotificationToken = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdatePushToken$b */
    public static class C11926b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11925a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdatePushToken$c */
    public static class C11927c extends C25240d<MVUpdatePushToken> {
        public C11927c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdatePushToken mVUpdatePushToken = (MVUpdatePushToken) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUpdatePushToken.mo35408g()) {
                bitSet.set(0);
            }
            if (mVUpdatePushToken.mo35407f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVUpdatePushToken.mo35408g()) {
                jVar.mo61686J(mVUpdatePushToken.pushNotificationToken);
            }
            if (mVUpdatePushToken.mo35407f()) {
                jVar.mo61678B(mVUpdatePushToken.pushEnv.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdatePushToken mVUpdatePushToken = (MVUpdatePushToken) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVUpdatePushToken.pushNotificationToken = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVUpdatePushToken.pushEnv = MVAppId.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdatePushToken$d */
    public static class C11928d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11927c(0);
        }
    }

    static {
        new C17394d0("MVUpdatePushToken");
        HashMap hashMap = new HashMap();
        f30572d = hashMap;
        hashMap.put(C25239c.class, new C11926b());
        hashMap.put(C25240d.class, new C11928d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PUSH_NOTIFICATION_TOKEN, new FieldMetaData("pushNotificationToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PUSH_ENV, new FieldMetaData("pushEnv", (byte) 3, new EnumMetaData(MVAppId.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30573e = unmodifiableMap;
        FieldMetaData.m61947a(MVUpdatePushToken.class, unmodifiableMap);
    }

    public MVUpdatePushToken() {
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
        ((C25238b) f30572d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30572d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35404a(MVUpdatePushToken mVUpdatePushToken) {
        if (mVUpdatePushToken == null) {
            return false;
        }
        boolean g = mo35408g();
        boolean g2 = mVUpdatePushToken.mo35408g();
        if ((g || g2) && (!g || !g2 || !this.pushNotificationToken.equals(mVUpdatePushToken.pushNotificationToken))) {
            return false;
        }
        boolean f = mo35407f();
        boolean f2 = mVUpdatePushToken.mo35407f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.pushEnv.equals(mVUpdatePushToken.pushEnv)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUpdatePushToken mVUpdatePushToken = (MVUpdatePushToken) obj;
        if (!getClass().equals(mVUpdatePushToken.getClass())) {
            return getClass().getName().compareTo(mVUpdatePushToken.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35408g()).compareTo(Boolean.valueOf(mVUpdatePushToken.mo35408g()));
        if (compareTo2 != 0 || ((mo35408g() && (compareTo2 = this.pushNotificationToken.compareTo(mVUpdatePushToken.pushNotificationToken)) != 0) || (compareTo2 = Boolean.valueOf(mo35407f()).compareTo(Boolean.valueOf(mVUpdatePushToken.mo35407f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35407f() || (compareTo = this.pushEnv.compareTo(mVUpdatePushToken.pushEnv)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVUpdatePushToken)) {
            return mo35404a((MVUpdatePushToken) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35407f() {
        return this.pushEnv != null;
    }

    /* renamed from: g */
    public final boolean mo35408g() {
        return this.pushNotificationToken != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUpdatePushToken(", "pushNotificationToken:");
        String str = this.pushNotificationToken;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("pushEnv:");
        MVAppId mVAppId = this.pushEnv;
        if (mVAppId == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAppId);
        }
        n.append(")");
        return n.toString();
    }

    public MVUpdatePushToken(String str, MVAppId mVAppId) {
        this();
        this.pushNotificationToken = str;
        this.pushEnv = mVAppId;
    }
}
