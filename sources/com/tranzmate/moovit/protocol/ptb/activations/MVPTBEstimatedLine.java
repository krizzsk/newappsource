package com.tranzmate.moovit.protocol.ptb.activations;

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
import p001a0.C0016g;
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

public class MVPTBEstimatedLine implements TBase<MVPTBEstimatedLine, _Fields>, Serializable, Cloneable, Comparable<MVPTBEstimatedLine> {

    /* renamed from: b */
    public static final C25113c f27862b = new C25113c("lineId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27863c = new C25113c("lineGroupId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f27864d = new C25113c("confidenceLevel", (byte) 4, 3);

    /* renamed from: e */
    public static final HashMap f27865e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27866f;
    private byte __isset_bitfield = 0;
    public double confidenceLevel;
    public int lineGroupId;
    public int lineId;

    public enum _Fields implements C25085c {
        LINE_ID(1, "lineId"),
        LINE_GROUP_ID(2, "lineGroupId"),
        CONFIDENCE_LEVEL(3, "confidenceLevel");
        
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
                return LINE_ID;
            }
            if (i == 2) {
                return LINE_GROUP_ID;
            }
            if (i != 3) {
                return null;
            }
            return CONFIDENCE_LEVEL;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBEstimatedLine$a */
    public static class C10181a extends C25239c<MVPTBEstimatedLine> {
        public C10181a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBEstimatedLine mVPTBEstimatedLine = (MVPTBEstimatedLine) tBase;
            mVPTBEstimatedLine.getClass();
            C25113c cVar = MVPTBEstimatedLine.f27862b;
            gVar.mo61687K();
            gVar.mo61711x(MVPTBEstimatedLine.f27862b);
            gVar.mo61678B(mVPTBEstimatedLine.lineId);
            gVar.mo61712y();
            gVar.mo61711x(MVPTBEstimatedLine.f27863c);
            gVar.mo61678B(mVPTBEstimatedLine.lineGroupId);
            gVar.mo61712y();
            gVar.mo61711x(MVPTBEstimatedLine.f27864d);
            gVar.mo61710w(mVPTBEstimatedLine.confidenceLevel);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBEstimatedLine mVPTBEstimatedLine = (MVPTBEstimatedLine) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPTBEstimatedLine.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 4) {
                            mVPTBEstimatedLine.confidenceLevel = gVar.mo61692e();
                            mVPTBEstimatedLine.mo30893i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVPTBEstimatedLine.lineGroupId = gVar.mo61696i();
                        mVPTBEstimatedLine.mo30894j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPTBEstimatedLine.lineId = gVar.mo61696i();
                    mVPTBEstimatedLine.mo30895k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBEstimatedLine$b */
    public static class C10182b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10181a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBEstimatedLine$c */
    public static class C10183c extends C25240d<MVPTBEstimatedLine> {
        public C10183c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBEstimatedLine mVPTBEstimatedLine = (MVPTBEstimatedLine) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBEstimatedLine.mo30891h()) {
                bitSet.set(0);
            }
            if (mVPTBEstimatedLine.mo30890g()) {
                bitSet.set(1);
            }
            if (mVPTBEstimatedLine.mo30889f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPTBEstimatedLine.mo30891h()) {
                jVar.mo61678B(mVPTBEstimatedLine.lineId);
            }
            if (mVPTBEstimatedLine.mo30890g()) {
                jVar.mo61678B(mVPTBEstimatedLine.lineGroupId);
            }
            if (mVPTBEstimatedLine.mo30889f()) {
                jVar.mo61710w(mVPTBEstimatedLine.confidenceLevel);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBEstimatedLine mVPTBEstimatedLine = (MVPTBEstimatedLine) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPTBEstimatedLine.lineId = jVar.mo61696i();
                mVPTBEstimatedLine.mo30895k();
            }
            if (T.get(1)) {
                mVPTBEstimatedLine.lineGroupId = jVar.mo61696i();
                mVPTBEstimatedLine.mo30894j();
            }
            if (T.get(2)) {
                mVPTBEstimatedLine.confidenceLevel = jVar.mo61692e();
                mVPTBEstimatedLine.mo30893i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBEstimatedLine$d */
    public static class C10184d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10183c(0);
        }
    }

    static {
        new C17394d0("MVPTBEstimatedLine");
        HashMap hashMap = new HashMap();
        f27865e = hashMap;
        hashMap.put(C25239c.class, new C10182b());
        hashMap.put(C25240d.class, new C10184d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_GROUP_ID, new FieldMetaData("lineGroupId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CONFIDENCE_LEVEL, new FieldMetaData("confidenceLevel", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27866f = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBEstimatedLine.class, unmodifiableMap);
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
        ((C25238b) f27865e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27865e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30886a(MVPTBEstimatedLine mVPTBEstimatedLine) {
        if (mVPTBEstimatedLine != null && this.lineId == mVPTBEstimatedLine.lineId && this.lineGroupId == mVPTBEstimatedLine.lineGroupId && this.confidenceLevel == mVPTBEstimatedLine.confidenceLevel) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int b;
        MVPTBEstimatedLine mVPTBEstimatedLine = (MVPTBEstimatedLine) obj;
        if (!getClass().equals(mVPTBEstimatedLine.getClass())) {
            return getClass().getName().compareTo(mVPTBEstimatedLine.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30891h()).compareTo(Boolean.valueOf(mVPTBEstimatedLine.mo30891h()));
        if (compareTo != 0 || ((mo30891h() && (compareTo = C25082a.m62839c(this.lineId, mVPTBEstimatedLine.lineId)) != 0) || (compareTo = Boolean.valueOf(mo30890g()).compareTo(Boolean.valueOf(mVPTBEstimatedLine.mo30890g()))) != 0 || ((mo30890g() && (compareTo = C25082a.m62839c(this.lineGroupId, mVPTBEstimatedLine.lineGroupId)) != 0) || (compareTo = Boolean.valueOf(mo30889f()).compareTo(Boolean.valueOf(mVPTBEstimatedLine.mo30889f()))) != 0))) {
            return compareTo;
        }
        if (!mo30889f() || (b = C25082a.m62838b(this.confidenceLevel, mVPTBEstimatedLine.confidenceLevel)) == 0) {
            return 0;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPTBEstimatedLine)) {
            return mo30886a((MVPTBEstimatedLine) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30889f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo30890g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo30891h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo30893i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: j */
    public final void mo30894j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo30895k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBEstimatedLine(", "lineId:");
        C0016g.m42z(n, this.lineId, ", ", "lineGroupId:");
        C0016g.m42z(n, this.lineGroupId, ", ", "confidenceLevel:");
        n.append(this.confidenceLevel);
        n.append(")");
        return n.toString();
    }
}
