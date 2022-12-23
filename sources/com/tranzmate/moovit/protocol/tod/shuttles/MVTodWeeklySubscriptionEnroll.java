package com.tranzmate.moovit.protocol.tod.shuttles;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodDaysOfWeek;
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

public class MVTodWeeklySubscriptionEnroll implements TBase<MVTodWeeklySubscriptionEnroll, _Fields>, Serializable, Cloneable, Comparable<MVTodWeeklySubscriptionEnroll> {

    /* renamed from: b */
    public static final C25113c f29775b = new C25113c("weeklySubscriptionId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29776c = new C25113c("selectedDays", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29777d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29778e;
    public MVTodDaysOfWeek selectedDays;
    public String weeklySubscriptionId;

    public enum _Fields implements C25085c {
        WEEKLY_SUBSCRIPTION_ID(1, "weeklySubscriptionId"),
        SELECTED_DAYS(2, "selectedDays");
        
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
                return WEEKLY_SUBSCRIPTION_ID;
            }
            if (i != 2) {
                return null;
            }
            return SELECTED_DAYS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodWeeklySubscriptionEnroll$a */
    public static class C11457a extends C25239c<MVTodWeeklySubscriptionEnroll> {
        public C11457a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodWeeklySubscriptionEnroll mVTodWeeklySubscriptionEnroll = (MVTodWeeklySubscriptionEnroll) tBase;
            MVTodDaysOfWeek mVTodDaysOfWeek = mVTodWeeklySubscriptionEnroll.selectedDays;
            C25113c cVar = MVTodWeeklySubscriptionEnroll.f29775b;
            gVar.mo61687K();
            if (mVTodWeeklySubscriptionEnroll.weeklySubscriptionId != null) {
                gVar.mo61711x(MVTodWeeklySubscriptionEnroll.f29775b);
                gVar.mo61686J(mVTodWeeklySubscriptionEnroll.weeklySubscriptionId);
                gVar.mo61712y();
            }
            if (mVTodWeeklySubscriptionEnroll.selectedDays != null) {
                gVar.mo61711x(MVTodWeeklySubscriptionEnroll.f29776c);
                mVTodWeeklySubscriptionEnroll.selectedDays.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodWeeklySubscriptionEnroll mVTodWeeklySubscriptionEnroll = (MVTodWeeklySubscriptionEnroll) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTodDaysOfWeek mVTodDaysOfWeek = mVTodWeeklySubscriptionEnroll.selectedDays;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTodDaysOfWeek mVTodDaysOfWeek2 = new MVTodDaysOfWeek();
                        mVTodWeeklySubscriptionEnroll.selectedDays = mVTodDaysOfWeek2;
                        mVTodDaysOfWeek2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodWeeklySubscriptionEnroll.weeklySubscriptionId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodWeeklySubscriptionEnroll$b */
    public static class C11458b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11457a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodWeeklySubscriptionEnroll$c */
    public static class C11459c extends C25240d<MVTodWeeklySubscriptionEnroll> {
        public C11459c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodWeeklySubscriptionEnroll mVTodWeeklySubscriptionEnroll = (MVTodWeeklySubscriptionEnroll) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodWeeklySubscriptionEnroll.mo34065g()) {
                bitSet.set(0);
            }
            if (mVTodWeeklySubscriptionEnroll.mo34064f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodWeeklySubscriptionEnroll.mo34065g()) {
                jVar.mo61686J(mVTodWeeklySubscriptionEnroll.weeklySubscriptionId);
            }
            if (mVTodWeeklySubscriptionEnroll.mo34064f()) {
                mVTodWeeklySubscriptionEnroll.selectedDays.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodWeeklySubscriptionEnroll mVTodWeeklySubscriptionEnroll = (MVTodWeeklySubscriptionEnroll) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodWeeklySubscriptionEnroll.weeklySubscriptionId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVTodDaysOfWeek mVTodDaysOfWeek = new MVTodDaysOfWeek();
                mVTodWeeklySubscriptionEnroll.selectedDays = mVTodDaysOfWeek;
                mVTodDaysOfWeek.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodWeeklySubscriptionEnroll$d */
    public static class C11460d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11459c(0);
        }
    }

    static {
        new C17394d0("MVTodWeeklySubscriptionEnroll");
        HashMap hashMap = new HashMap();
        f29777d = hashMap;
        hashMap.put(C25239c.class, new C11458b());
        hashMap.put(C25240d.class, new C11460d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.WEEKLY_SUBSCRIPTION_ID, new FieldMetaData("weeklySubscriptionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SELECTED_DAYS, new FieldMetaData("selectedDays", (byte) 3, new StructMetaData(MVTodDaysOfWeek.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29778e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodWeeklySubscriptionEnroll.class, unmodifiableMap);
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
        ((C25238b) f29777d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29777d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodWeeklySubscriptionEnroll mVTodWeeklySubscriptionEnroll = (MVTodWeeklySubscriptionEnroll) obj;
        if (!getClass().equals(mVTodWeeklySubscriptionEnroll.getClass())) {
            return getClass().getName().compareTo(mVTodWeeklySubscriptionEnroll.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34065g()).compareTo(Boolean.valueOf(mVTodWeeklySubscriptionEnroll.mo34065g()));
        if (compareTo2 != 0 || ((mo34065g() && (compareTo2 = this.weeklySubscriptionId.compareTo(mVTodWeeklySubscriptionEnroll.weeklySubscriptionId)) != 0) || (compareTo2 = Boolean.valueOf(mo34064f()).compareTo(Boolean.valueOf(mVTodWeeklySubscriptionEnroll.mo34064f()))) != 0)) {
            return compareTo2;
        }
        if (!mo34064f() || (compareTo = this.selectedDays.compareTo(mVTodWeeklySubscriptionEnroll.selectedDays)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodWeeklySubscriptionEnroll)) {
            return false;
        }
        MVTodWeeklySubscriptionEnroll mVTodWeeklySubscriptionEnroll = (MVTodWeeklySubscriptionEnroll) obj;
        boolean g = mo34065g();
        boolean g2 = mVTodWeeklySubscriptionEnroll.mo34065g();
        if ((g || g2) && (!g || !g2 || !this.weeklySubscriptionId.equals(mVTodWeeklySubscriptionEnroll.weeklySubscriptionId))) {
            return false;
        }
        boolean f = mo34064f();
        boolean f2 = mVTodWeeklySubscriptionEnroll.mo34064f();
        if ((f || f2) && (!f || !f2 || !this.selectedDays.mo33399a(mVTodWeeklySubscriptionEnroll.selectedDays))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34064f() {
        return this.selectedDays != null;
    }

    /* renamed from: g */
    public final boolean mo34065g() {
        return this.weeklySubscriptionId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodWeeklySubscriptionEnroll(", "weeklySubscriptionId:");
        String str = this.weeklySubscriptionId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("selectedDays:");
        MVTodDaysOfWeek mVTodDaysOfWeek = this.selectedDays;
        if (mVTodDaysOfWeek == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodDaysOfWeek);
        }
        n.append(")");
        return n.toString();
    }
}
