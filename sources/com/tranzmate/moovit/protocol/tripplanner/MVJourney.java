package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVJourney implements TBase<MVJourney, _Fields>, Serializable, Cloneable, Comparable<MVJourney> {

    /* renamed from: b */
    public static final C25113c f29948b = new C25113c(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29949c = new C25113c("dest", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29950d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29951e;
    public MVLocationDescriptor dest;
    public MVLocationDescriptor origin;

    public enum _Fields implements C25085c {
        ORIGIN(1, AppMeasurementSdk.ConditionalUserProperty.ORIGIN),
        DEST(2, "dest");
        
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
                return ORIGIN;
            }
            if (i != 2) {
                return null;
            }
            return DEST;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVJourney$a */
    public static class C11558a extends C25239c<MVJourney> {
        public C11558a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVJourney mVJourney = (MVJourney) tBase;
            mVJourney.mo34352h();
            C25113c cVar = MVJourney.f29948b;
            gVar.mo61687K();
            if (mVJourney.origin != null) {
                gVar.mo61711x(MVJourney.f29948b);
                mVJourney.origin.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVJourney.dest != null) {
                gVar.mo61711x(MVJourney.f29949c);
                mVJourney.dest.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVJourney mVJourney = (MVJourney) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVJourney.mo34352h();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                        mVJourney.dest = mVLocationDescriptor;
                        mVLocationDescriptor.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                    mVJourney.origin = mVLocationDescriptor2;
                    mVLocationDescriptor2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVJourney$b */
    public static class C11559b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11558a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVJourney$c */
    public static class C11560c extends C25240d<MVJourney> {
        public C11560c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVJourney mVJourney = (MVJourney) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVJourney.mo34351g()) {
                bitSet.set(0);
            }
            if (mVJourney.mo34350f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVJourney.mo34351g()) {
                mVJourney.origin.mo25202X0(jVar);
            }
            if (mVJourney.mo34350f()) {
                mVJourney.dest.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVJourney mVJourney = (MVJourney) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVJourney.origin = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                mVJourney.dest = mVLocationDescriptor2;
                mVLocationDescriptor2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVJourney$d */
    public static class C11561d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11560c(0);
        }
    }

    static {
        new C17394d0("MVJourney");
        HashMap hashMap = new HashMap();
        f29950d = hashMap;
        hashMap.put(C25239c.class, new C11559b());
        hashMap.put(C25240d.class, new C11561d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ORIGIN, new FieldMetaData(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.DEST, new FieldMetaData("dest", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29951e = unmodifiableMap;
        FieldMetaData.m61947a(MVJourney.class, unmodifiableMap);
    }

    public MVJourney() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f29950d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29950d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34347a(MVJourney mVJourney) {
        if (mVJourney == null) {
            return false;
        }
        boolean g = mo34351g();
        boolean g2 = mVJourney.mo34351g();
        if ((g || g2) && (!g || !g2 || !this.origin.mo26317a(mVJourney.origin))) {
            return false;
        }
        boolean f = mo34350f();
        boolean f2 = mVJourney.mo34350f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.dest.mo26317a(mVJourney.dest)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVJourney mVJourney = (MVJourney) obj;
        if (!getClass().equals(mVJourney.getClass())) {
            return getClass().getName().compareTo(mVJourney.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34351g()).compareTo(Boolean.valueOf(mVJourney.mo34351g()));
        if (compareTo2 != 0 || ((mo34351g() && (compareTo2 = this.origin.compareTo(mVJourney.origin)) != 0) || (compareTo2 = Boolean.valueOf(mo34350f()).compareTo(Boolean.valueOf(mVJourney.mo34350f()))) != 0)) {
            return compareTo2;
        }
        if (!mo34350f() || (compareTo = this.dest.compareTo(mVJourney.dest)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVJourney)) {
            return mo34347a((MVJourney) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34350f() {
        return this.dest != null;
    }

    /* renamed from: g */
    public final boolean mo34351g() {
        return this.origin != null;
    }

    /* renamed from: h */
    public final void mo34352h() throws TException {
        MVLocationDescriptor mVLocationDescriptor = this.origin;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor2 = this.dest;
        if (mVLocationDescriptor2 != null) {
            mVLocationDescriptor2.mo26333s();
        }
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVJourney(", "origin:");
        MVLocationDescriptor mVLocationDescriptor = this.origin;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        n.append(", ");
        n.append("dest:");
        MVLocationDescriptor mVLocationDescriptor2 = this.dest;
        if (mVLocationDescriptor2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor2);
        }
        n.append(")");
        return n.toString();
    }

    public MVJourney(MVLocationDescriptor mVLocationDescriptor, MVLocationDescriptor mVLocationDescriptor2) {
        this();
        this.origin = mVLocationDescriptor;
        this.dest = mVLocationDescriptor2;
    }
}
