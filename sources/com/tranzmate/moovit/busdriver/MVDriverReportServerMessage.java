package com.tranzmate.moovit.busdriver;

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
    public static final C25113c f24514b = new C25113c("reportType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24515c = new C25113c("reportTimestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f24516d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24517e;
    private byte __isset_bitfield = 0;
    public long reportTimestamp;
    public MVDriverReportType reportType;

    public enum _Fields implements C25085c {
        REPORT_TYPE(1, "reportType"),
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
                return REPORT_TYPE;
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

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverReportServerMessage$a */
    public static class C8065a extends C25239c<MVDriverReportServerMessage> {
        public C8065a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) tBase;
            mVDriverReportServerMessage.getClass();
            C25113c cVar = MVDriverReportServerMessage.f24514b;
            gVar.mo61687K();
            if (mVDriverReportServerMessage.reportType != null) {
                gVar.mo61711x(MVDriverReportServerMessage.f24514b);
                gVar.mo61678B(mVDriverReportServerMessage.reportType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDriverReportServerMessage.f24515c);
            C25541a.m63891v(gVar, mVDriverReportServerMessage.reportTimestamp);
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVDriverReportServerMessage.reportTimestamp = gVar.mo61697j();
                        mVDriverReportServerMessage.mo25232h();
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

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverReportServerMessage$b */
    public static class C8066b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8065a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverReportServerMessage$c */
    public static class C8067c extends C25240d<MVDriverReportServerMessage> {
        public C8067c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDriverReportServerMessage.mo25231g()) {
                bitSet.set(0);
            }
            if (mVDriverReportServerMessage.mo25230f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVDriverReportServerMessage.mo25231g()) {
                jVar.mo61678B(mVDriverReportServerMessage.reportType.getValue());
            }
            if (mVDriverReportServerMessage.mo25230f()) {
                jVar.mo61679C(mVDriverReportServerMessage.reportTimestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVDriverReportServerMessage.reportType = MVDriverReportType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVDriverReportServerMessage.reportTimestamp = jVar.mo61697j();
                mVDriverReportServerMessage.mo25232h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.busdriver.MVDriverReportServerMessage$d */
    public static class C8068d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8067c(0);
        }
    }

    static {
        new C17394d0("MVDriverReportServerMessage");
        HashMap hashMap = new HashMap();
        f24516d = hashMap;
        hashMap.put(C25239c.class, new C8066b());
        hashMap.put(C25240d.class, new C8068d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REPORT_TYPE, new FieldMetaData("reportType", (byte) 3, new EnumMetaData(MVDriverReportType.class)));
        enumMap.put(_Fields.REPORT_TIMESTAMP, new FieldMetaData("reportTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24517e = unmodifiableMap;
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
        ((C25238b) f24516d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24516d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) obj;
        if (!getClass().equals(mVDriverReportServerMessage.getClass())) {
            return getClass().getName().compareTo(mVDriverReportServerMessage.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25231g()).compareTo(Boolean.valueOf(mVDriverReportServerMessage.mo25231g()));
        if (compareTo != 0 || ((mo25231g() && (compareTo = this.reportType.compareTo(mVDriverReportServerMessage.reportType)) != 0) || (compareTo = Boolean.valueOf(mo25230f()).compareTo(Boolean.valueOf(mVDriverReportServerMessage.mo25230f()))) != 0)) {
            return compareTo;
        }
        if (!mo25230f() || (d = C25082a.m62840d(this.reportTimestamp, mVDriverReportServerMessage.reportTimestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDriverReportServerMessage)) {
            return false;
        }
        MVDriverReportServerMessage mVDriverReportServerMessage = (MVDriverReportServerMessage) obj;
        boolean g = mo25231g();
        boolean g2 = mVDriverReportServerMessage.mo25231g();
        if (((g || g2) && (!g || !g2 || !this.reportType.equals(mVDriverReportServerMessage.reportType))) || this.reportTimestamp != mVDriverReportServerMessage.reportTimestamp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25230f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25231g() {
        return this.reportType != null;
    }

    /* renamed from: h */
    public final void mo25232h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
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
        return C25541a.m63884o(n, this.reportTimestamp, ")");
    }
}
