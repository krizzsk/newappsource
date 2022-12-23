package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVDayOfWeek;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.SetMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25123i;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTodDaysOfWeek implements TBase<MVTodDaysOfWeek, _Fields>, Serializable, Cloneable, Comparable<MVTodDaysOfWeek> {

    /* renamed from: b */
    public static final C25113c f29381b = new C25113c("includedDays", (byte) 14, 1);

    /* renamed from: c */
    public static final HashMap f29382c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f29383d;
    public Set<MVDayOfWeek> includedDays;

    public enum _Fields implements C25085c {
        INCLUDED_DAYS(1, "includedDays");
        
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
            if (i != 1) {
                return null;
            }
            return INCLUDED_DAYS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodDaysOfWeek$a */
    public static class C11213a extends C25239c<MVTodDaysOfWeek> {
        public C11213a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodDaysOfWeek mVTodDaysOfWeek = (MVTodDaysOfWeek) tBase;
            mVTodDaysOfWeek.getClass();
            C25113c cVar = MVTodDaysOfWeek.f29381b;
            gVar.mo61687K();
            if (mVTodDaysOfWeek.includedDays != null) {
                gVar.mo61711x(MVTodDaysOfWeek.f29381b);
                gVar.mo61684H(new C25123i((byte) 8, mVTodDaysOfWeek.includedDays.size()));
                for (MVDayOfWeek value : mVTodDaysOfWeek.includedDays) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61685I();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodDaysOfWeek mVTodDaysOfWeek = (MVTodDaysOfWeek) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodDaysOfWeek.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 14) {
                    C25123i o = gVar.mo61702o();
                    mVTodDaysOfWeek.includedDays = new HashSet(o.f63401b * 2);
                    for (int i = 0; i < o.f63401b; i++) {
                        mVTodDaysOfWeek.includedDays.add(MVDayOfWeek.findByValue(gVar.mo61696i()));
                    }
                    gVar.mo61703p();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodDaysOfWeek$b */
    public static class C11214b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11213a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodDaysOfWeek$c */
    public static class C11215c extends C25240d<MVTodDaysOfWeek> {
        public C11215c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodDaysOfWeek mVTodDaysOfWeek = (MVTodDaysOfWeek) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodDaysOfWeek.mo33402f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVTodDaysOfWeek.mo33402f()) {
                jVar.mo61678B(mVTodDaysOfWeek.includedDays.size());
                for (MVDayOfWeek value : mVTodDaysOfWeek.includedDays) {
                    jVar.mo61678B(value.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodDaysOfWeek mVTodDaysOfWeek = (MVTodDaysOfWeek) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVTodDaysOfWeek.includedDays = new HashSet(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVTodDaysOfWeek.includedDays.add(MVDayOfWeek.findByValue(jVar.mo61696i()));
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodDaysOfWeek$d */
    public static class C11216d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11215c(0);
        }
    }

    static {
        new C17394d0("MVTodDaysOfWeek");
        HashMap hashMap = new HashMap();
        f29382c = hashMap;
        hashMap.put(C25239c.class, new C11214b());
        hashMap.put(C25240d.class, new C11216d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.INCLUDED_DAYS, new FieldMetaData("includedDays", (byte) 3, new SetMetaData(new EnumMetaData(MVDayOfWeek.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29383d = unmodifiableMap;
        FieldMetaData.m61947a(MVTodDaysOfWeek.class, unmodifiableMap);
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
        ((C25238b) f29382c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29382c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33399a(MVTodDaysOfWeek mVTodDaysOfWeek) {
        if (mVTodDaysOfWeek == null) {
            return false;
        }
        boolean f = mo33402f();
        boolean f2 = mVTodDaysOfWeek.mo33402f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.includedDays.equals(mVTodDaysOfWeek.includedDays)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int j;
        MVTodDaysOfWeek mVTodDaysOfWeek = (MVTodDaysOfWeek) obj;
        if (!getClass().equals(mVTodDaysOfWeek.getClass())) {
            return getClass().getName().compareTo(mVTodDaysOfWeek.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33402f()).compareTo(Boolean.valueOf(mVTodDaysOfWeek.mo33402f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo33402f() || (j = C25082a.m62846j(this.includedDays, mVTodDaysOfWeek.includedDays)) == 0) {
            return 0;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodDaysOfWeek)) {
            return mo33399a((MVTodDaysOfWeek) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33402f() {
        return this.includedDays != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodDaysOfWeek(", "includedDays:");
        Set<MVDayOfWeek> set = this.includedDays;
        if (set == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(set);
        }
        n.append(")");
        return n.toString();
    }
}
