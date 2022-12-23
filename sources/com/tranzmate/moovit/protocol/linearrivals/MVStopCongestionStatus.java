package com.tranzmate.moovit.protocol.linearrivals;

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

public class MVStopCongestionStatus implements TBase<MVStopCongestionStatus, _Fields>, Serializable, Cloneable, Comparable<MVStopCongestionStatus> {

    /* renamed from: b */
    public static final C25113c f26168b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26169c = new C25113c("reportTimeUtc", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f26170d = new C25113c("platformName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26171e = new C25113c("source", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f26172f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26173g;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.PLATFORM_NAME};
    public String platformName;
    public long reportTimeUtc;
    public MVCongestionStatusSource source;
    public MVCongestionLevel type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        REPORT_TIME_UTC(2, "reportTimeUtc"),
        PLATFORM_NAME(3, "platformName"),
        SOURCE(4, "source");
        
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
            if (i == 2) {
                return REPORT_TIME_UTC;
            }
            if (i == 3) {
                return PLATFORM_NAME;
            }
            if (i != 4) {
                return null;
            }
            return SOURCE;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopCongestionStatus$a */
    public static class C9000a extends C25239c<MVStopCongestionStatus> {
        public C9000a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopCongestionStatus mVStopCongestionStatus = (MVStopCongestionStatus) tBase;
            mVStopCongestionStatus.getClass();
            C25113c cVar = MVStopCongestionStatus.f26168b;
            gVar.mo61687K();
            if (mVStopCongestionStatus.type != null) {
                gVar.mo61711x(MVStopCongestionStatus.f26168b);
                gVar.mo61678B(mVStopCongestionStatus.type.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStopCongestionStatus.f26169c);
            gVar.mo61679C(mVStopCongestionStatus.reportTimeUtc);
            gVar.mo61712y();
            if (mVStopCongestionStatus.platformName != null && mVStopCongestionStatus.mo28084f()) {
                gVar.mo61711x(MVStopCongestionStatus.f26170d);
                gVar.mo61686J(mVStopCongestionStatus.platformName);
                gVar.mo61712y();
            }
            if (mVStopCongestionStatus.source != null) {
                gVar.mo61711x(MVStopCongestionStatus.f26171e);
                gVar.mo61678B(mVStopCongestionStatus.source.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopCongestionStatus mVStopCongestionStatus = (MVStopCongestionStatus) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStopCongestionStatus.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVStopCongestionStatus.source = MVCongestionStatusSource.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVStopCongestionStatus.platformName = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVStopCongestionStatus.reportTimeUtc = gVar.mo61697j();
                        mVStopCongestionStatus.mo28089j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVStopCongestionStatus.type = MVCongestionLevel.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopCongestionStatus$b */
    public static class C9001b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9000a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopCongestionStatus$c */
    public static class C9002c extends C25240d<MVStopCongestionStatus> {
        public C9002c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopCongestionStatus mVStopCongestionStatus = (MVStopCongestionStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStopCongestionStatus.mo28088i()) {
                bitSet.set(0);
            }
            if (mVStopCongestionStatus.mo28085g()) {
                bitSet.set(1);
            }
            if (mVStopCongestionStatus.mo28084f()) {
                bitSet.set(2);
            }
            if (mVStopCongestionStatus.mo28086h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVStopCongestionStatus.mo28088i()) {
                jVar.mo61678B(mVStopCongestionStatus.type.getValue());
            }
            if (mVStopCongestionStatus.mo28085g()) {
                jVar.mo61679C(mVStopCongestionStatus.reportTimeUtc);
            }
            if (mVStopCongestionStatus.mo28084f()) {
                jVar.mo61686J(mVStopCongestionStatus.platformName);
            }
            if (mVStopCongestionStatus.mo28086h()) {
                jVar.mo61678B(mVStopCongestionStatus.source.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopCongestionStatus mVStopCongestionStatus = (MVStopCongestionStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVStopCongestionStatus.type = MVCongestionLevel.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVStopCongestionStatus.reportTimeUtc = jVar.mo61697j();
                mVStopCongestionStatus.mo28089j();
            }
            if (T.get(2)) {
                mVStopCongestionStatus.platformName = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVStopCongestionStatus.source = MVCongestionStatusSource.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopCongestionStatus$d */
    public static class C9003d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9002c(0);
        }
    }

    static {
        new C17394d0("MVStopCongestionStatus");
        HashMap hashMap = new HashMap();
        f26172f = hashMap;
        hashMap.put(C25239c.class, new C9001b());
        hashMap.put(C25240d.class, new C9003d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVCongestionLevel.class)));
        enumMap.put(_Fields.REPORT_TIME_UTC, new FieldMetaData("reportTimeUtc", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.PLATFORM_NAME, new FieldMetaData("platformName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SOURCE, new FieldMetaData("source", (byte) 3, new EnumMetaData(MVCongestionStatusSource.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26173g = unmodifiableMap;
        FieldMetaData.m61947a(MVStopCongestionStatus.class, unmodifiableMap);
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
        ((C25238b) f26172f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26172f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVStopCongestionStatus mVStopCongestionStatus = (MVStopCongestionStatus) obj;
        if (!getClass().equals(mVStopCongestionStatus.getClass())) {
            return getClass().getName().compareTo(mVStopCongestionStatus.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28088i()).compareTo(Boolean.valueOf(mVStopCongestionStatus.mo28088i()));
        if (compareTo2 != 0 || ((mo28088i() && (compareTo2 = this.type.compareTo(mVStopCongestionStatus.type)) != 0) || (compareTo2 = Boolean.valueOf(mo28085g()).compareTo(Boolean.valueOf(mVStopCongestionStatus.mo28085g()))) != 0 || ((mo28085g() && (compareTo2 = C25082a.m62840d(this.reportTimeUtc, mVStopCongestionStatus.reportTimeUtc)) != 0) || (compareTo2 = Boolean.valueOf(mo28084f()).compareTo(Boolean.valueOf(mVStopCongestionStatus.mo28084f()))) != 0 || ((mo28084f() && (compareTo2 = this.platformName.compareTo(mVStopCongestionStatus.platformName)) != 0) || (compareTo2 = Boolean.valueOf(mo28086h()).compareTo(Boolean.valueOf(mVStopCongestionStatus.mo28086h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo28086h() || (compareTo = this.source.compareTo(mVStopCongestionStatus.source)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStopCongestionStatus)) {
            return false;
        }
        MVStopCongestionStatus mVStopCongestionStatus = (MVStopCongestionStatus) obj;
        boolean i = mo28088i();
        boolean i2 = mVStopCongestionStatus.mo28088i();
        if (((i || i2) && (!i || !i2 || !this.type.equals(mVStopCongestionStatus.type))) || this.reportTimeUtc != mVStopCongestionStatus.reportTimeUtc) {
            return false;
        }
        boolean f = mo28084f();
        boolean f2 = mVStopCongestionStatus.mo28084f();
        if ((f || f2) && (!f || !f2 || !this.platformName.equals(mVStopCongestionStatus.platformName))) {
            return false;
        }
        boolean h = mo28086h();
        boolean h2 = mVStopCongestionStatus.mo28086h();
        if ((h || h2) && (!h || !h2 || !this.source.equals(mVStopCongestionStatus.source))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28084f() {
        return this.platformName != null;
    }

    /* renamed from: g */
    public final boolean mo28085g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo28086h() {
        return this.source != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28088i() {
        return this.type != null;
    }

    /* renamed from: j */
    public final void mo28089j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStopCongestionStatus(", "type:");
        MVCongestionLevel mVCongestionLevel = this.type;
        if (mVCongestionLevel == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCongestionLevel);
        }
        n.append(", ");
        n.append("reportTimeUtc:");
        n.append(this.reportTimeUtc);
        if (mo28084f()) {
            n.append(", ");
            n.append("platformName:");
            String str = this.platformName;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("source:");
        MVCongestionStatusSource mVCongestionStatusSource = this.source;
        if (mVCongestionStatusSource == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCongestionStatusSource);
        }
        n.append(")");
        return n.toString();
    }
}
