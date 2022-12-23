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

public class MVArrivalAttributes implements TBase<MVArrivalAttributes, _Fields>, Serializable, Cloneable, Comparable<MVArrivalAttributes> {

    /* renamed from: b */
    public static final C25113c f26124b = new C25113c("reportTimeUtc", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f26125c = new C25113c("level", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26126d = new C25113c("isAccessible", (byte) 2, 3);

    /* renamed from: e */
    public static final C25113c f26127e = new C25113c("source", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26128f = new C25113c("nfcPaymentSupport", (byte) 2, 5);

    /* renamed from: g */
    public static final HashMap f26129g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26130h;
    private byte __isset_bitfield = 0;
    public boolean isAccessible;
    public MVCongestionLevel level;
    public boolean nfcPaymentSupport;
    private _Fields[] optionals = {_Fields.LEVEL, _Fields.IS_ACCESSIBLE, _Fields.SOURCE, _Fields.NFC_PAYMENT_SUPPORT};
    public long reportTimeUtc;
    public MVCongestionStatusSource source;

    public enum _Fields implements C25085c {
        REPORT_TIME_UTC(1, "reportTimeUtc"),
        LEVEL(2, "level"),
        IS_ACCESSIBLE(3, "isAccessible"),
        SOURCE(4, "source"),
        NFC_PAYMENT_SUPPORT(5, "nfcPaymentSupport");
        
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
                return REPORT_TIME_UTC;
            }
            if (i == 2) {
                return LEVEL;
            }
            if (i == 3) {
                return IS_ACCESSIBLE;
            }
            if (i == 4) {
                return SOURCE;
            }
            if (i != 5) {
                return null;
            }
            return NFC_PAYMENT_SUPPORT;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrivalAttributes$a */
    public static class C8968a extends C25239c<MVArrivalAttributes> {
        public C8968a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVArrivalAttributes mVArrivalAttributes = (MVArrivalAttributes) tBase;
            mVArrivalAttributes.getClass();
            C25113c cVar = MVArrivalAttributes.f26124b;
            gVar.mo61687K();
            gVar.mo61711x(MVArrivalAttributes.f26124b);
            gVar.mo61679C(mVArrivalAttributes.reportTimeUtc);
            gVar.mo61712y();
            if (mVArrivalAttributes.level != null && mVArrivalAttributes.mo27997g()) {
                gVar.mo61711x(MVArrivalAttributes.f26125c);
                gVar.mo61678B(mVArrivalAttributes.level.getValue());
                gVar.mo61712y();
            }
            if (mVArrivalAttributes.mo27996f()) {
                gVar.mo61711x(MVArrivalAttributes.f26126d);
                gVar.mo61708u(mVArrivalAttributes.isAccessible);
                gVar.mo61712y();
            }
            if (mVArrivalAttributes.source != null && mVArrivalAttributes.mo28001j()) {
                gVar.mo61711x(MVArrivalAttributes.f26127e);
                gVar.mo61678B(mVArrivalAttributes.source.getValue());
                gVar.mo61712y();
            }
            if (mVArrivalAttributes.mo27998h()) {
                gVar.mo61711x(MVArrivalAttributes.f26128f);
                gVar.mo61708u(mVArrivalAttributes.nfcPaymentSupport);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVArrivalAttributes mVArrivalAttributes = (MVArrivalAttributes) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVArrivalAttributes.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 2) {
                                    mVArrivalAttributes.nfcPaymentSupport = gVar.mo61690c();
                                    mVArrivalAttributes.mo28003l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVArrivalAttributes.source = MVCongestionStatusSource.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 2) {
                            mVArrivalAttributes.isAccessible = gVar.mo61690c();
                            mVArrivalAttributes.mo28002k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVArrivalAttributes.level = MVCongestionLevel.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVArrivalAttributes.reportTimeUtc = gVar.mo61697j();
                    mVArrivalAttributes.mo28004m();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrivalAttributes$b */
    public static class C8969b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8968a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrivalAttributes$c */
    public static class C8970c extends C25240d<MVArrivalAttributes> {
        public C8970c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVArrivalAttributes mVArrivalAttributes = (MVArrivalAttributes) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVArrivalAttributes.mo28000i()) {
                bitSet.set(0);
            }
            if (mVArrivalAttributes.mo27997g()) {
                bitSet.set(1);
            }
            if (mVArrivalAttributes.mo27996f()) {
                bitSet.set(2);
            }
            if (mVArrivalAttributes.mo28001j()) {
                bitSet.set(3);
            }
            if (mVArrivalAttributes.mo27998h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVArrivalAttributes.mo28000i()) {
                jVar.mo61679C(mVArrivalAttributes.reportTimeUtc);
            }
            if (mVArrivalAttributes.mo27997g()) {
                jVar.mo61678B(mVArrivalAttributes.level.getValue());
            }
            if (mVArrivalAttributes.mo27996f()) {
                jVar.mo61708u(mVArrivalAttributes.isAccessible);
            }
            if (mVArrivalAttributes.mo28001j()) {
                jVar.mo61678B(mVArrivalAttributes.source.getValue());
            }
            if (mVArrivalAttributes.mo27998h()) {
                jVar.mo61708u(mVArrivalAttributes.nfcPaymentSupport);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVArrivalAttributes mVArrivalAttributes = (MVArrivalAttributes) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVArrivalAttributes.reportTimeUtc = jVar.mo61697j();
                mVArrivalAttributes.mo28004m();
            }
            if (T.get(1)) {
                mVArrivalAttributes.level = MVCongestionLevel.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVArrivalAttributes.isAccessible = jVar.mo61690c();
                mVArrivalAttributes.mo28002k();
            }
            if (T.get(3)) {
                mVArrivalAttributes.source = MVCongestionStatusSource.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVArrivalAttributes.nfcPaymentSupport = jVar.mo61690c();
                mVArrivalAttributes.mo28003l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVArrivalAttributes$d */
    public static class C8971d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8970c(0);
        }
    }

    static {
        new C17394d0("MVArrivalAttributes");
        HashMap hashMap = new HashMap();
        f26129g = hashMap;
        hashMap.put(C25239c.class, new C8969b());
        hashMap.put(C25240d.class, new C8971d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REPORT_TIME_UTC, new FieldMetaData("reportTimeUtc", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.LEVEL, new FieldMetaData("level", (byte) 2, new EnumMetaData(MVCongestionLevel.class)));
        enumMap.put(_Fields.IS_ACCESSIBLE, new FieldMetaData("isAccessible", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.SOURCE, new FieldMetaData("source", (byte) 2, new EnumMetaData(MVCongestionStatusSource.class)));
        enumMap.put(_Fields.NFC_PAYMENT_SUPPORT, new FieldMetaData("nfcPaymentSupport", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26130h = unmodifiableMap;
        FieldMetaData.m61947a(MVArrivalAttributes.class, unmodifiableMap);
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
        ((C25238b) f26129g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26129g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo27993a(MVArrivalAttributes mVArrivalAttributes) {
        if (mVArrivalAttributes == null || this.reportTimeUtc != mVArrivalAttributes.reportTimeUtc) {
            return false;
        }
        boolean g = mo27997g();
        boolean g2 = mVArrivalAttributes.mo27997g();
        if ((g || g2) && (!g || !g2 || !this.level.equals(mVArrivalAttributes.level))) {
            return false;
        }
        boolean f = mo27996f();
        boolean f2 = mVArrivalAttributes.mo27996f();
        if ((f || f2) && (!f || !f2 || this.isAccessible != mVArrivalAttributes.isAccessible)) {
            return false;
        }
        boolean j = mo28001j();
        boolean j2 = mVArrivalAttributes.mo28001j();
        if ((j || j2) && (!j || !j2 || !this.source.equals(mVArrivalAttributes.source))) {
            return false;
        }
        boolean h = mo27998h();
        boolean h2 = mVArrivalAttributes.mo27998h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || this.nfcPaymentSupport != mVArrivalAttributes.nfcPaymentSupport) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVArrivalAttributes mVArrivalAttributes = (MVArrivalAttributes) obj;
        if (!getClass().equals(mVArrivalAttributes.getClass())) {
            return getClass().getName().compareTo(mVArrivalAttributes.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28000i()).compareTo(Boolean.valueOf(mVArrivalAttributes.mo28000i()));
        if (compareTo != 0 || ((mo28000i() && (compareTo = C25082a.m62840d(this.reportTimeUtc, mVArrivalAttributes.reportTimeUtc)) != 0) || (compareTo = Boolean.valueOf(mo27997g()).compareTo(Boolean.valueOf(mVArrivalAttributes.mo27997g()))) != 0 || ((mo27997g() && (compareTo = this.level.compareTo(mVArrivalAttributes.level)) != 0) || (compareTo = Boolean.valueOf(mo27996f()).compareTo(Boolean.valueOf(mVArrivalAttributes.mo27996f()))) != 0 || ((mo27996f() && (compareTo = C25082a.m62848l(this.isAccessible, mVArrivalAttributes.isAccessible)) != 0) || (compareTo = Boolean.valueOf(mo28001j()).compareTo(Boolean.valueOf(mVArrivalAttributes.mo28001j()))) != 0 || ((mo28001j() && (compareTo = this.source.compareTo(mVArrivalAttributes.source)) != 0) || (compareTo = Boolean.valueOf(mo27998h()).compareTo(Boolean.valueOf(mVArrivalAttributes.mo27998h()))) != 0))))) {
            return compareTo;
        }
        if (!mo27998h() || (l = C25082a.m62848l(this.nfcPaymentSupport, mVArrivalAttributes.nfcPaymentSupport)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVArrivalAttributes)) {
            return mo27993a((MVArrivalAttributes) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27996f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27997g() {
        return this.level != null;
    }

    /* renamed from: h */
    public final boolean mo27998h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28000i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo28001j() {
        return this.source != null;
    }

    /* renamed from: k */
    public final void mo28002k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo28003l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: m */
    public final void mo28004m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVArrivalAttributes(", "reportTimeUtc:");
        n.append(this.reportTimeUtc);
        if (mo27997g()) {
            n.append(", ");
            n.append("level:");
            MVCongestionLevel mVCongestionLevel = this.level;
            if (mVCongestionLevel == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCongestionLevel);
            }
        }
        if (mo27996f()) {
            n.append(", ");
            n.append("isAccessible:");
            n.append(this.isAccessible);
        }
        if (mo28001j()) {
            n.append(", ");
            n.append("source:");
            MVCongestionStatusSource mVCongestionStatusSource = this.source;
            if (mVCongestionStatusSource == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCongestionStatusSource);
            }
        }
        if (mo27998h()) {
            n.append(", ");
            n.append("nfcPaymentSupport:");
            n.append(this.nfcPaymentSupport);
        }
        n.append(")");
        return n.toString();
    }
}
