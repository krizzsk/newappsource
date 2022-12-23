package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityDamageReport implements TBase<MVMicroMobilityDamageReport, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityDamageReport> {

    /* renamed from: b */
    public static final C25113c f26522b = new C25113c("damageDescription", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26523c = new C25113c("reportDate", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f26524d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26525e;
    private byte __isset_bitfield = 0;
    public String damageDescription;
    private _Fields[] optionals = {_Fields.REPORT_DATE};
    public long reportDate;

    public enum _Fields implements C25085c {
        DAMAGE_DESCRIPTION(1, "damageDescription"),
        REPORT_DATE(2, "reportDate");
        
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
                return DAMAGE_DESCRIPTION;
            }
            if (i != 2) {
                return null;
            }
            return REPORT_DATE;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityDamageReport$a */
    public static class C9211a extends C25239c<MVMicroMobilityDamageReport> {
        public C9211a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityDamageReport mVMicroMobilityDamageReport = (MVMicroMobilityDamageReport) tBase;
            mVMicroMobilityDamageReport.getClass();
            C25113c cVar = MVMicroMobilityDamageReport.f26522b;
            gVar.mo61687K();
            if (mVMicroMobilityDamageReport.damageDescription != null) {
                gVar.mo61711x(MVMicroMobilityDamageReport.f26522b);
                gVar.mo61686J(mVMicroMobilityDamageReport.damageDescription);
                gVar.mo61712y();
            }
            if (mVMicroMobilityDamageReport.mo28675g()) {
                gVar.mo61711x(MVMicroMobilityDamageReport.f26523c);
                gVar.mo61679C(mVMicroMobilityDamageReport.reportDate);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityDamageReport mVMicroMobilityDamageReport = (MVMicroMobilityDamageReport) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityDamageReport.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVMicroMobilityDamageReport.reportDate = gVar.mo61697j();
                        mVMicroMobilityDamageReport.mo28676h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityDamageReport.damageDescription = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityDamageReport$b */
    public static class C9212b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9211a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityDamageReport$c */
    public static class C9213c extends C25240d<MVMicroMobilityDamageReport> {
        public C9213c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityDamageReport mVMicroMobilityDamageReport = (MVMicroMobilityDamageReport) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityDamageReport.mo28674f()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityDamageReport.mo28675g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMicroMobilityDamageReport.mo28674f()) {
                jVar.mo61686J(mVMicroMobilityDamageReport.damageDescription);
            }
            if (mVMicroMobilityDamageReport.mo28675g()) {
                jVar.mo61679C(mVMicroMobilityDamageReport.reportDate);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityDamageReport mVMicroMobilityDamageReport = (MVMicroMobilityDamageReport) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVMicroMobilityDamageReport.damageDescription = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityDamageReport.reportDate = jVar.mo61697j();
                mVMicroMobilityDamageReport.mo28676h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityDamageReport$d */
    public static class C9214d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9213c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityDamageReport");
        HashMap hashMap = new HashMap();
        f26524d = hashMap;
        hashMap.put(C25239c.class, new C9212b());
        hashMap.put(C25240d.class, new C9214d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DAMAGE_DESCRIPTION, new FieldMetaData("damageDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REPORT_DATE, new FieldMetaData("reportDate", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26525e = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityDamageReport.class, unmodifiableMap);
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
        ((C25238b) f26524d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26524d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVMicroMobilityDamageReport mVMicroMobilityDamageReport = (MVMicroMobilityDamageReport) obj;
        if (!getClass().equals(mVMicroMobilityDamageReport.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityDamageReport.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28674f()).compareTo(Boolean.valueOf(mVMicroMobilityDamageReport.mo28674f()));
        if (compareTo != 0 || ((mo28674f() && (compareTo = this.damageDescription.compareTo(mVMicroMobilityDamageReport.damageDescription)) != 0) || (compareTo = Boolean.valueOf(mo28675g()).compareTo(Boolean.valueOf(mVMicroMobilityDamageReport.mo28675g()))) != 0)) {
            return compareTo;
        }
        if (!mo28675g() || (d = C25082a.m62840d(this.reportDate, mVMicroMobilityDamageReport.reportDate)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityDamageReport)) {
            return false;
        }
        MVMicroMobilityDamageReport mVMicroMobilityDamageReport = (MVMicroMobilityDamageReport) obj;
        boolean f = mo28674f();
        boolean f2 = mVMicroMobilityDamageReport.mo28674f();
        if ((f || f2) && (!f || !f2 || !this.damageDescription.equals(mVMicroMobilityDamageReport.damageDescription))) {
            return false;
        }
        boolean g = mo28675g();
        boolean g2 = mVMicroMobilityDamageReport.mo28675g();
        if ((g || g2) && (!g || !g2 || this.reportDate != mVMicroMobilityDamageReport.reportDate)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28674f() {
        return this.damageDescription != null;
    }

    /* renamed from: g */
    public final boolean mo28675g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo28676h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityDamageReport(", "damageDescription:");
        String str = this.damageDescription;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo28675g()) {
            n.append(", ");
            n.append("reportDate:");
            n.append(this.reportDate);
        }
        n.append(")");
        return n.toString();
    }
}
