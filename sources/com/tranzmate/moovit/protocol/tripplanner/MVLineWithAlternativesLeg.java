package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVLineWithAlternativesLeg implements TBase<MVLineWithAlternativesLeg, _Fields>, Serializable, Cloneable, Comparable<MVLineWithAlternativesLeg> {

    /* renamed from: b */
    public static final C25113c f29966b = new C25113c("alternativeLines", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29967c = new C25113c("primaryAlternativeIndex", (byte) 3, 2);

    /* renamed from: d */
    public static final HashMap f29968d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29969e;
    private byte __isset_bitfield = 0;
    public List<MVLineLeg> alternativeLines;
    public byte primaryAlternativeIndex;

    public enum _Fields implements C25085c {
        ALTERNATIVE_LINES(1, "alternativeLines"),
        PRIMARY_ALTERNATIVE_INDEX(2, "primaryAlternativeIndex");
        
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
                return ALTERNATIVE_LINES;
            }
            if (i != 2) {
                return null;
            }
            return PRIMARY_ALTERNATIVE_INDEX;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLineWithAlternativesLeg$a */
    public static class C11566a extends C25239c<MVLineWithAlternativesLeg> {
        public C11566a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineWithAlternativesLeg mVLineWithAlternativesLeg = (MVLineWithAlternativesLeg) tBase;
            mVLineWithAlternativesLeg.getClass();
            C25113c cVar = MVLineWithAlternativesLeg.f29966b;
            gVar.mo61687K();
            if (mVLineWithAlternativesLeg.alternativeLines != null) {
                gVar.mo61711x(MVLineWithAlternativesLeg.f29966b);
                gVar.mo61680D(new C25119e((byte) 12, mVLineWithAlternativesLeg.alternativeLines.size()));
                for (MVLineLeg X0 : mVLineWithAlternativesLeg.alternativeLines) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVLineWithAlternativesLeg.f29967c);
            gVar.mo61709v(mVLineWithAlternativesLeg.primaryAlternativeIndex);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineWithAlternativesLeg mVLineWithAlternativesLeg = (MVLineWithAlternativesLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineWithAlternativesLeg.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 3) {
                        mVLineWithAlternativesLeg.primaryAlternativeIndex = gVar.mo61691d();
                        mVLineWithAlternativesLeg.mo34381h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVLineWithAlternativesLeg.alternativeLines = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVLineLeg mVLineLeg = new MVLineLeg();
                        mVLineLeg.mo25201C1(gVar);
                        mVLineWithAlternativesLeg.alternativeLines.add(mVLineLeg);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLineWithAlternativesLeg$b */
    public static class C11567b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11566a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLineWithAlternativesLeg$c */
    public static class C11568c extends C25240d<MVLineWithAlternativesLeg> {
        public C11568c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineWithAlternativesLeg mVLineWithAlternativesLeg = (MVLineWithAlternativesLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineWithAlternativesLeg.mo34379f()) {
                bitSet.set(0);
            }
            if (mVLineWithAlternativesLeg.mo34380g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVLineWithAlternativesLeg.mo34379f()) {
                jVar.mo61678B(mVLineWithAlternativesLeg.alternativeLines.size());
                for (MVLineLeg X0 : mVLineWithAlternativesLeg.alternativeLines) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVLineWithAlternativesLeg.mo34380g()) {
                jVar.mo61716P(mVLineWithAlternativesLeg.primaryAlternativeIndex);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineWithAlternativesLeg mVLineWithAlternativesLeg = (MVLineWithAlternativesLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVLineWithAlternativesLeg.alternativeLines = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLineLeg mVLineLeg = new MVLineLeg();
                    mVLineLeg.mo25201C1(jVar);
                    mVLineWithAlternativesLeg.alternativeLines.add(mVLineLeg);
                }
            }
            if (T.get(1)) {
                mVLineWithAlternativesLeg.primaryAlternativeIndex = jVar.mo61691d();
                mVLineWithAlternativesLeg.mo34381h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVLineWithAlternativesLeg$d */
    public static class C11569d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11568c(0);
        }
    }

    static {
        new C17394d0("MVLineWithAlternativesLeg");
        HashMap hashMap = new HashMap();
        f29968d = hashMap;
        hashMap.put(C25239c.class, new C11567b());
        hashMap.put(C25240d.class, new C11569d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ALTERNATIVE_LINES, new FieldMetaData("alternativeLines", (byte) 3, new ListMetaData(new StructMetaData(MVLineLeg.class))));
        enumMap.put(_Fields.PRIMARY_ALTERNATIVE_INDEX, new FieldMetaData("primaryAlternativeIndex", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29969e = unmodifiableMap;
        FieldMetaData.m61947a(MVLineWithAlternativesLeg.class, unmodifiableMap);
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
        ((C25238b) f29968d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29968d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int a;
        MVLineWithAlternativesLeg mVLineWithAlternativesLeg = (MVLineWithAlternativesLeg) obj;
        if (!getClass().equals(mVLineWithAlternativesLeg.getClass())) {
            return getClass().getName().compareTo(mVLineWithAlternativesLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34379f()).compareTo(Boolean.valueOf(mVLineWithAlternativesLeg.mo34379f()));
        if (compareTo != 0 || ((mo34379f() && (compareTo = C25082a.m62844h(this.alternativeLines, mVLineWithAlternativesLeg.alternativeLines)) != 0) || (compareTo = Boolean.valueOf(mo34380g()).compareTo(Boolean.valueOf(mVLineWithAlternativesLeg.mo34380g()))) != 0)) {
            return compareTo;
        }
        if (!mo34380g() || (a = C25082a.m62837a(this.primaryAlternativeIndex, mVLineWithAlternativesLeg.primaryAlternativeIndex)) == 0) {
            return 0;
        }
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineWithAlternativesLeg)) {
            return false;
        }
        MVLineWithAlternativesLeg mVLineWithAlternativesLeg = (MVLineWithAlternativesLeg) obj;
        boolean f = mo34379f();
        boolean f2 = mVLineWithAlternativesLeg.mo34379f();
        if (((f || f2) && (!f || !f2 || !this.alternativeLines.equals(mVLineWithAlternativesLeg.alternativeLines))) || this.primaryAlternativeIndex != mVLineWithAlternativesLeg.primaryAlternativeIndex) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34379f() {
        return this.alternativeLines != null;
    }

    /* renamed from: g */
    public final boolean mo34380g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo34381h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineWithAlternativesLeg(", "alternativeLines:");
        List<MVLineLeg> list = this.alternativeLines;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("primaryAlternativeIndex:");
        return C13437d.m33707l(n, this.primaryAlternativeIndex, ")");
    }
}
