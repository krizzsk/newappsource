package com.tranzmate.moovit.protocol.tod;

import com.appboy.models.InAppMessageBase;
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
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVDriverMessageServerMessage implements TBase<MVDriverMessageServerMessage, _Fields>, Serializable, Cloneable, Comparable<MVDriverMessageServerMessage> {

    /* renamed from: b */
    public static final C25113c f29333b = new C25113c(InAppMessageBase.MESSAGE, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29334c = new C25113c("reportTimestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f29335d = new C25113c("sessionToken", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f29336e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29337f;
    private byte __isset_bitfield = 0;
    public String message;
    public long reportTimestamp;
    public String sessionToken;

    public enum _Fields implements C25085c {
        MESSAGE(1, InAppMessageBase.MESSAGE),
        REPORT_TIMESTAMP(2, "reportTimestamp"),
        SESSION_TOKEN(3, "sessionToken");
        
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
                return MESSAGE;
            }
            if (i == 2) {
                return REPORT_TIMESTAMP;
            }
            if (i != 3) {
                return null;
            }
            return SESSION_TOKEN;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage$a */
    public static class C11172a extends C25239c<MVDriverMessageServerMessage> {
        public C11172a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) tBase;
            mVDriverMessageServerMessage.getClass();
            C25113c cVar = MVDriverMessageServerMessage.f29333b;
            gVar.mo61687K();
            if (mVDriverMessageServerMessage.message != null) {
                gVar.mo61711x(MVDriverMessageServerMessage.f29333b);
                gVar.mo61686J(mVDriverMessageServerMessage.message);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDriverMessageServerMessage.f29334c);
            gVar.mo61679C(mVDriverMessageServerMessage.reportTimestamp);
            gVar.mo61712y();
            if (mVDriverMessageServerMessage.sessionToken != null) {
                gVar.mo61711x(MVDriverMessageServerMessage.f29335d);
                gVar.mo61686J(mVDriverMessageServerMessage.sessionToken);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDriverMessageServerMessage.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVDriverMessageServerMessage.sessionToken = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVDriverMessageServerMessage.reportTimestamp = gVar.mo61697j();
                        mVDriverMessageServerMessage.mo33322i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVDriverMessageServerMessage.message = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage$b */
    public static class C11173b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11172a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage$c */
    public static class C11174c extends C25240d<MVDriverMessageServerMessage> {
        public C11174c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDriverMessageServerMessage.mo33318f()) {
                bitSet.set(0);
            }
            if (mVDriverMessageServerMessage.mo33319g()) {
                bitSet.set(1);
            }
            if (mVDriverMessageServerMessage.mo33320h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVDriverMessageServerMessage.mo33318f()) {
                jVar.mo61686J(mVDriverMessageServerMessage.message);
            }
            if (mVDriverMessageServerMessage.mo33319g()) {
                jVar.mo61679C(mVDriverMessageServerMessage.reportTimestamp);
            }
            if (mVDriverMessageServerMessage.mo33320h()) {
                jVar.mo61686J(mVDriverMessageServerMessage.sessionToken);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVDriverMessageServerMessage.message = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDriverMessageServerMessage.reportTimestamp = jVar.mo61697j();
                mVDriverMessageServerMessage.mo33322i();
            }
            if (T.get(2)) {
                mVDriverMessageServerMessage.sessionToken = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverMessageServerMessage$d */
    public static class C11175d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11174c(0);
        }
    }

    static {
        new C17394d0("MVDriverMessageServerMessage");
        HashMap hashMap = new HashMap();
        f29336e = hashMap;
        hashMap.put(C25239c.class, new C11173b());
        hashMap.put(C25240d.class, new C11175d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MESSAGE, new FieldMetaData(InAppMessageBase.MESSAGE, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REPORT_TIMESTAMP, new FieldMetaData("reportTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.SESSION_TOKEN, new FieldMetaData("sessionToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29337f = unmodifiableMap;
        FieldMetaData.m61947a(MVDriverMessageServerMessage.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f29336e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29336e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) obj;
        if (!getClass().equals(mVDriverMessageServerMessage.getClass())) {
            return getClass().getName().compareTo(mVDriverMessageServerMessage.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33318f()).compareTo(Boolean.valueOf(mVDriverMessageServerMessage.mo33318f()));
        if (compareTo2 != 0 || ((mo33318f() && (compareTo2 = this.message.compareTo(mVDriverMessageServerMessage.message)) != 0) || (compareTo2 = Boolean.valueOf(mo33319g()).compareTo(Boolean.valueOf(mVDriverMessageServerMessage.mo33319g()))) != 0 || ((mo33319g() && (compareTo2 = C25082a.m62840d(this.reportTimestamp, mVDriverMessageServerMessage.reportTimestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo33320h()).compareTo(Boolean.valueOf(mVDriverMessageServerMessage.mo33320h()))) != 0))) {
            return compareTo2;
        }
        if (!mo33320h() || (compareTo = this.sessionToken.compareTo(mVDriverMessageServerMessage.sessionToken)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDriverMessageServerMessage)) {
            return false;
        }
        MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) obj;
        boolean f = mo33318f();
        boolean f2 = mVDriverMessageServerMessage.mo33318f();
        if (((f || f2) && (!f || !f2 || !this.message.equals(mVDriverMessageServerMessage.message))) || this.reportTimestamp != mVDriverMessageServerMessage.reportTimestamp) {
            return false;
        }
        boolean h = mo33320h();
        boolean h2 = mVDriverMessageServerMessage.mo33320h();
        if ((h || h2) && (!h || !h2 || !this.sessionToken.equals(mVDriverMessageServerMessage.sessionToken))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33318f() {
        return this.message != null;
    }

    /* renamed from: g */
    public final boolean mo33319g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo33320h() {
        return this.sessionToken != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33322i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDriverMessageServerMessage(", "message:");
        String str = this.message;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("reportTimestamp:");
        C25541a.m63889t(n, this.reportTimestamp, ", ", "sessionToken:");
        String str2 = this.sessionToken;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
