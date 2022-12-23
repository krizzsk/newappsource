package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVClientColorScheme;
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

public class MVEmissionLevel implements TBase<MVEmissionLevel, _Fields>, Serializable, Cloneable, Comparable<MVEmissionLevel> {

    /* renamed from: b */
    public static final C25113c f29924b = new C25113c("co2", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29925c = new C25113c("color", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f29926d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29927e;
    private byte __isset_bitfield = 0;
    public int co2;
    public MVClientColorScheme color;

    public enum _Fields implements C25085c {
        CO2(1, "co2"),
        COLOR(2, "color");
        
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
                return CO2;
            }
            if (i != 2) {
                return null;
            }
            return COLOR;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVEmissionLevel$a */
    public static class C11534a extends C25239c<MVEmissionLevel> {
        public C11534a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmissionLevel mVEmissionLevel = (MVEmissionLevel) tBase;
            mVEmissionLevel.getClass();
            C25113c cVar = MVEmissionLevel.f29924b;
            gVar.mo61687K();
            gVar.mo61711x(MVEmissionLevel.f29924b);
            gVar.mo61678B(mVEmissionLevel.co2);
            gVar.mo61712y();
            if (mVEmissionLevel.color != null) {
                gVar.mo61711x(MVEmissionLevel.f29925c);
                gVar.mo61678B(mVEmissionLevel.color.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmissionLevel mVEmissionLevel = (MVEmissionLevel) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVEmissionLevel.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVEmissionLevel.color = MVClientColorScheme.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVEmissionLevel.co2 = gVar.mo61696i();
                    mVEmissionLevel.mo34305h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVEmissionLevel$b */
    public static class C11535b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11534a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVEmissionLevel$c */
    public static class C11536c extends C25240d<MVEmissionLevel> {
        public C11536c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmissionLevel mVEmissionLevel = (MVEmissionLevel) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEmissionLevel.mo34303f()) {
                bitSet.set(0);
            }
            if (mVEmissionLevel.mo34304g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVEmissionLevel.mo34303f()) {
                jVar.mo61678B(mVEmissionLevel.co2);
            }
            if (mVEmissionLevel.mo34304g()) {
                jVar.mo61678B(mVEmissionLevel.color.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmissionLevel mVEmissionLevel = (MVEmissionLevel) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVEmissionLevel.co2 = jVar.mo61696i();
                mVEmissionLevel.mo34305h();
            }
            if (T.get(1)) {
                mVEmissionLevel.color = MVClientColorScheme.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVEmissionLevel$d */
    public static class C11537d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11536c(0);
        }
    }

    static {
        new C17394d0("MVEmissionLevel");
        HashMap hashMap = new HashMap();
        f29926d = hashMap;
        hashMap.put(C25239c.class, new C11535b());
        hashMap.put(C25240d.class, new C11537d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CO2, new FieldMetaData("co2", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.COLOR, new FieldMetaData("color", (byte) 3, new EnumMetaData(MVClientColorScheme.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29927e = unmodifiableMap;
        FieldMetaData.m61947a(MVEmissionLevel.class, unmodifiableMap);
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
        ((C25238b) f29926d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29926d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34300a(MVEmissionLevel mVEmissionLevel) {
        if (mVEmissionLevel == null || this.co2 != mVEmissionLevel.co2) {
            return false;
        }
        boolean g = mo34304g();
        boolean g2 = mVEmissionLevel.mo34304g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.color.equals(mVEmissionLevel.color)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVEmissionLevel mVEmissionLevel = (MVEmissionLevel) obj;
        if (!getClass().equals(mVEmissionLevel.getClass())) {
            return getClass().getName().compareTo(mVEmissionLevel.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34303f()).compareTo(Boolean.valueOf(mVEmissionLevel.mo34303f()));
        if (compareTo2 != 0 || ((mo34303f() && (compareTo2 = C25082a.m62839c(this.co2, mVEmissionLevel.co2)) != 0) || (compareTo2 = Boolean.valueOf(mo34304g()).compareTo(Boolean.valueOf(mVEmissionLevel.mo34304g()))) != 0)) {
            return compareTo2;
        }
        if (!mo34304g() || (compareTo = this.color.compareTo(mVEmissionLevel.color)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVEmissionLevel)) {
            return mo34300a((MVEmissionLevel) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34303f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34304g() {
        return this.color != null;
    }

    /* renamed from: h */
    public final void mo34305h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVEmissionLevel(", "co2:");
        C0016g.m42z(n, this.co2, ", ", "color:");
        MVClientColorScheme mVClientColorScheme = this.color;
        if (mVClientColorScheme == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClientColorScheme);
        }
        n.append(")");
        return n.toString();
    }
}
