package com.tranzmate.moovit.protocol.tod;

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

public class MVDriverReportServerMessage implements TBase<MVDriverReportServerMessage, _Fields>, Serializable, Cloneable, Comparable<MVDriverReportServerMessage> {

    /* renamed from: b */
    public static final C25113c f29338b = new C25113c("reportType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29339c = new C25113c("reportTimestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f29340d = new C25113c("sessionToken", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f29341e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29342f;
    private byte __isset_bitfield = 0;
    public long reportTimestamp;
    public MVDriverReportType reportType;
    public String sessionToken;

    public enum _Fields implements C25085c {
        REPORT_TYPE(1, "reportType"),
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
                return REPORT_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage$a */
    public static class C11176a extends C25239c<MVDriverReportServerMessage> {
        public C11176a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) tBase;
            mVDriverReportServerMessage.getClass();
            C25113c cVar = MVDriverReportServerMessage.f29338b;
            gVar.mo61687K();
            if (mVDriverReportServerMessage.reportType != null) {
                gVar.mo61711x(MVDriverReportServerMessage.f29338b);
                gVar.mo61678B(mVDriverReportServerMessage.reportType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDriverReportServerMessage.f29339c);
            gVar.mo61679C(mVDriverReportServerMessage.reportTimestamp);
            gVar.mo61712y();
            if (mVDriverReportServerMessage.sessionToken != null) {
                gVar.mo61711x(MVDriverReportServerMessage.f29340d);
                gVar.mo61686J(mVDriverReportServerMessage.sessionToken);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDriverReportServerMessage.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVDriverReportServerMessage.sessionToken = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVDriverReportServerMessage.reportTimestamp = gVar.mo61697j();
                        mVDriverReportServerMessage.mo33331i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVDriverReportServerMessage.reportType = MVDriverReportType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage$b */
    public static class C11177b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11176a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage$c */
    public static class C11178c extends C25240d<MVDriverReportServerMessage> {
        public C11178c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDriverReportServerMessage.mo33328g()) {
                bitSet.set(0);
            }
            if (mVDriverReportServerMessage.mo33327f()) {
                bitSet.set(1);
            }
            if (mVDriverReportServerMessage.mo33329h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVDriverReportServerMessage.mo33328g()) {
                jVar.mo61678B(mVDriverReportServerMessage.reportType.getValue());
            }
            if (mVDriverReportServerMessage.mo33327f()) {
                jVar.mo61679C(mVDriverReportServerMessage.reportTimestamp);
            }
            if (mVDriverReportServerMessage.mo33329h()) {
                jVar.mo61686J(mVDriverReportServerMessage.sessionToken);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVDriverReportServerMessage.reportType = MVDriverReportType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVDriverReportServerMessage.reportTimestamp = jVar.mo61697j();
                mVDriverReportServerMessage.mo33331i();
            }
            if (T.get(2)) {
                mVDriverReportServerMessage.sessionToken = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.MVDriverReportServerMessage$d */
    public static class C11179d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11178c(0);
        }
    }

    static {
        new C17394d0("MVDriverReportServerMessage");
        HashMap hashMap = new HashMap();
        f29341e = hashMap;
        hashMap.put(C25239c.class, new C11177b());
        hashMap.put(C25240d.class, new C11179d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REPORT_TYPE, new FieldMetaData("reportType", (byte) 3, new EnumMetaData(MVDriverReportType.class)));
        enumMap.put(_Fields.REPORT_TIMESTAMP, new FieldMetaData("reportTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.SESSION_TOKEN, new FieldMetaData("sessionToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29342f = unmodifiableMap;
        FieldMetaData.m61947a(MVDriverReportServerMessage.class, unmodifiableMap);
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
        ((C25238b) f29341e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29341e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) obj;
        if (!getClass().equals(mVDriverReportServerMessage.getClass())) {
            return getClass().getName().compareTo(mVDriverReportServerMessage.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33328g()).compareTo(Boolean.valueOf(mVDriverReportServerMessage.mo33328g()));
        if (compareTo2 != 0 || ((mo33328g() && (compareTo2 = this.reportType.compareTo(mVDriverReportServerMessage.reportType)) != 0) || (compareTo2 = Boolean.valueOf(mo33327f()).compareTo(Boolean.valueOf(mVDriverReportServerMessage.mo33327f()))) != 0 || ((mo33327f() && (compareTo2 = C25082a.m62840d(this.reportTimestamp, mVDriverReportServerMessage.reportTimestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo33329h()).compareTo(Boolean.valueOf(mVDriverReportServerMessage.mo33329h()))) != 0))) {
            return compareTo2;
        }
        if (!mo33329h() || (compareTo = this.sessionToken.compareTo(mVDriverReportServerMessage.sessionToken)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDriverReportServerMessage)) {
            return false;
        }
        MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) obj;
        boolean g = mo33328g();
        boolean g2 = mVDriverReportServerMessage.mo33328g();
        if (((g || g2) && (!g || !g2 || !this.reportType.equals(mVDriverReportServerMessage.reportType))) || this.reportTimestamp != mVDriverReportServerMessage.reportTimestamp) {
            return false;
        }
        boolean h = mo33329h();
        boolean h2 = mVDriverReportServerMessage.mo33329h();
        if ((h || h2) && (!h || !h2 || !this.sessionToken.equals(mVDriverReportServerMessage.sessionToken))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33327f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo33328g() {
        return this.reportType != null;
    }

    /* renamed from: h */
    public final boolean mo33329h() {
        return this.sessionToken != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo33331i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDriverReportServerMessage(", "reportType:");
        MVDriverReportType mVDriverReportType = this.reportType;
        if (mVDriverReportType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDriverReportType);
        }
        n.append(", ");
        n.append("reportTimestamp:");
        C25541a.m63889t(n, this.reportTimestamp, ", ", "sessionToken:");
        String str = this.sessionToken;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
