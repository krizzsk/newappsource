package com.tranzmate.moovit.busdriver;

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
    public static final C25113c f24510b = new C25113c(InAppMessageBase.MESSAGE, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24511c = new C25113c("reportTimestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f24512d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24513e;
    private byte __isset_bitfield = 0;
    public String message;
    public long reportTimestamp;

    public enum _Fields implements C25085c {
        MESSAGE(1, InAppMessageBase.MESSAGE),
        REPORT_TIMESTAMP(2, "reportTimestamp");
        
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
            if (i != 2) {
                return null;
            }
            return REPORT_TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverMessageServerMessage$a */
    public static class C8061a extends C25239c<MVDriverMessageServerMessage> {
        public C8061a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) tBase;
            mVDriverMessageServerMessage.getClass();
            C25113c cVar = MVDriverMessageServerMessage.f24510b;
            gVar.mo61687K();
            if (mVDriverMessageServerMessage.message != null) {
                gVar.mo61711x(MVDriverMessageServerMessage.f24510b);
                gVar.mo61686J(mVDriverMessageServerMessage.message);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDriverMessageServerMessage.f24511c);
            C25541a.m63891v(gVar, mVDriverMessageServerMessage.reportTimestamp);
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVDriverMessageServerMessage.reportTimestamp = gVar.mo61697j();
                        mVDriverMessageServerMessage.mo25224h();
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

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverMessageServerMessage$b */
    public static class C8062b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8061a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverMessageServerMessage$c */
    public static class C8063c extends C25240d<MVDriverMessageServerMessage> {
        public C8063c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDriverMessageServerMessage.mo25222f()) {
                bitSet.set(0);
            }
            if (mVDriverMessageServerMessage.mo25223g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVDriverMessageServerMessage.mo25222f()) {
                jVar.mo61686J(mVDriverMessageServerMessage.message);
            }
            if (mVDriverMessageServerMessage.mo25223g()) {
                jVar.mo61679C(mVDriverMessageServerMessage.reportTimestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVDriverMessageServerMessage.message = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVDriverMessageServerMessage.reportTimestamp = jVar.mo61697j();
                mVDriverMessageServerMessage.mo25224h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverMessageServerMessage$d */
    public static class C8064d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8063c(0);
        }
    }

    static {
        new C17394d0("MVDriverMessageServerMessage");
        HashMap hashMap = new HashMap();
        f24512d = hashMap;
        hashMap.put(C25239c.class, new C8062b());
        hashMap.put(C25240d.class, new C8064d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MESSAGE, new FieldMetaData(InAppMessageBase.MESSAGE, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REPORT_TIMESTAMP, new FieldMetaData("reportTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24513e = unmodifiableMap;
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
        ((C25238b) f24512d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24512d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) obj;
        if (!getClass().equals(mVDriverMessageServerMessage.getClass())) {
            return getClass().getName().compareTo(mVDriverMessageServerMessage.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25222f()).compareTo(Boolean.valueOf(mVDriverMessageServerMessage.mo25222f()));
        if (compareTo != 0 || ((mo25222f() && (compareTo = this.message.compareTo(mVDriverMessageServerMessage.message)) != 0) || (compareTo = Boolean.valueOf(mo25223g()).compareTo(Boolean.valueOf(mVDriverMessageServerMessage.mo25223g()))) != 0)) {
            return compareTo;
        }
        if (!mo25223g() || (d = C25082a.m62840d(this.reportTimestamp, mVDriverMessageServerMessage.reportTimestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDriverMessageServerMessage)) {
            return false;
        }
        MVDriverMessageServerMessage mVDriverMessageServerMessage = (MVDriverMessageServerMessage) obj;
        boolean f = mo25222f();
        boolean f2 = mVDriverMessageServerMessage.mo25222f();
        if (((f || f2) && (!f || !f2 || !this.message.equals(mVDriverMessageServerMessage.message))) || this.reportTimestamp != mVDriverMessageServerMessage.reportTimestamp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25222f() {
        return this.message != null;
    }

    /* renamed from: g */
    public final boolean mo25223g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo25224h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
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
        return C25541a.m63884o(n, this.reportTimestamp, ")");
    }
}
