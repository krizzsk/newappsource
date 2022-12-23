package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodWeeklyShuttleSubscription implements TBase<MVTodWeeklyShuttleSubscription, _Fields>, Serializable, Cloneable, Comparable<MVTodWeeklyShuttleSubscription> {

    /* renamed from: b */
    public static final C25113c f29688b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29689c = new C25113c("enrolledDays", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29690d = new C25113c("shuttleInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f29691e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29692f;
    public MVTodDaysOfWeek enrolledDays;

    /* renamed from: id */
    public String f29693id;
    public MVTodSubscriptionShuttleInfo shuttleInfo;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        ENROLLED_DAYS(2, "enrolledDays"),
        SHUTTLE_INFO(3, "shuttleInfo");
        
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
                return ID;
            }
            if (i == 2) {
                return ENROLLED_DAYS;
            }
            if (i != 3) {
                return null;
            }
            return SHUTTLE_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodWeeklyShuttleSubscription$a */
    public static class C11390a extends C25239c<MVTodWeeklyShuttleSubscription> {
        public C11390a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo;
            MVTodWeeklyShuttleSubscription mVTodWeeklyShuttleSubscription = (MVTodWeeklyShuttleSubscription) tBase;
            MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = mVTodWeeklyShuttleSubscription.shuttleInfo;
            if (!(mVTodSubscriptionShuttleInfo == null || (mVTodSubscriptionJourneyInfo = mVTodSubscriptionShuttleInfo.journeyInfo) == null)) {
                mVTodSubscriptionJourneyInfo.mo33819j();
            }
            C25113c cVar = MVTodWeeklyShuttleSubscription.f29688b;
            gVar.mo61687K();
            if (mVTodWeeklyShuttleSubscription.f29693id != null) {
                gVar.mo61711x(MVTodWeeklyShuttleSubscription.f29688b);
                gVar.mo61686J(mVTodWeeklyShuttleSubscription.f29693id);
                gVar.mo61712y();
            }
            if (mVTodWeeklyShuttleSubscription.enrolledDays != null) {
                gVar.mo61711x(MVTodWeeklyShuttleSubscription.f29689c);
                mVTodWeeklyShuttleSubscription.enrolledDays.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodWeeklyShuttleSubscription.shuttleInfo != null) {
                gVar.mo61711x(MVTodWeeklyShuttleSubscription.f29690d);
                mVTodWeeklyShuttleSubscription.shuttleInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodSubscriptionJourneyInfo mVTodSubscriptionJourneyInfo;
            MVTodWeeklyShuttleSubscription mVTodWeeklyShuttleSubscription = (MVTodWeeklyShuttleSubscription) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = new MVTodSubscriptionShuttleInfo();
                            mVTodWeeklyShuttleSubscription.shuttleInfo = mVTodSubscriptionShuttleInfo;
                            mVTodSubscriptionShuttleInfo.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTodDaysOfWeek mVTodDaysOfWeek = new MVTodDaysOfWeek();
                        mVTodWeeklyShuttleSubscription.enrolledDays = mVTodDaysOfWeek;
                        mVTodDaysOfWeek.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodWeeklyShuttleSubscription.f29693id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo2 = mVTodWeeklyShuttleSubscription.shuttleInfo;
            if (mVTodSubscriptionShuttleInfo2 != null && (mVTodSubscriptionJourneyInfo = mVTodSubscriptionShuttleInfo2.journeyInfo) != null) {
                mVTodSubscriptionJourneyInfo.mo33819j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodWeeklyShuttleSubscription$b */
    public static class C11391b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11390a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodWeeklyShuttleSubscription$c */
    public static class C11392c extends C25240d<MVTodWeeklyShuttleSubscription> {
        public C11392c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodWeeklyShuttleSubscription mVTodWeeklyShuttleSubscription = (MVTodWeeklyShuttleSubscription) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodWeeklyShuttleSubscription.mo33919g()) {
                bitSet.set(0);
            }
            if (mVTodWeeklyShuttleSubscription.mo33918f()) {
                bitSet.set(1);
            }
            if (mVTodWeeklyShuttleSubscription.mo33920h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTodWeeklyShuttleSubscription.mo33919g()) {
                jVar.mo61686J(mVTodWeeklyShuttleSubscription.f29693id);
            }
            if (mVTodWeeklyShuttleSubscription.mo33918f()) {
                mVTodWeeklyShuttleSubscription.enrolledDays.mo25202X0(jVar);
            }
            if (mVTodWeeklyShuttleSubscription.mo33920h()) {
                mVTodWeeklyShuttleSubscription.shuttleInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodWeeklyShuttleSubscription mVTodWeeklyShuttleSubscription = (MVTodWeeklyShuttleSubscription) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVTodWeeklyShuttleSubscription.f29693id = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVTodDaysOfWeek mVTodDaysOfWeek = new MVTodDaysOfWeek();
                mVTodWeeklyShuttleSubscription.enrolledDays = mVTodDaysOfWeek;
                mVTodDaysOfWeek.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = new MVTodSubscriptionShuttleInfo();
                mVTodWeeklyShuttleSubscription.shuttleInfo = mVTodSubscriptionShuttleInfo;
                mVTodSubscriptionShuttleInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodWeeklyShuttleSubscription$d */
    public static class C11393d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11392c(0);
        }
    }

    static {
        new C17394d0("MVTodWeeklyShuttleSubscription");
        HashMap hashMap = new HashMap();
        f29691e = hashMap;
        hashMap.put(C25239c.class, new C11391b());
        hashMap.put(C25240d.class, new C11393d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ENROLLED_DAYS, new FieldMetaData("enrolledDays", (byte) 3, new StructMetaData(MVTodDaysOfWeek.class)));
        enumMap.put(_Fields.SHUTTLE_INFO, new FieldMetaData("shuttleInfo", (byte) 3, new StructMetaData(MVTodSubscriptionShuttleInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29692f = unmodifiableMap;
        FieldMetaData.m61947a(MVTodWeeklyShuttleSubscription.class, unmodifiableMap);
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
        ((C25238b) f29691e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29691e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodWeeklyShuttleSubscription mVTodWeeklyShuttleSubscription = (MVTodWeeklyShuttleSubscription) obj;
        if (!getClass().equals(mVTodWeeklyShuttleSubscription.getClass())) {
            return getClass().getName().compareTo(mVTodWeeklyShuttleSubscription.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33919g()).compareTo(Boolean.valueOf(mVTodWeeklyShuttleSubscription.mo33919g()));
        if (compareTo2 != 0 || ((mo33919g() && (compareTo2 = this.f29693id.compareTo(mVTodWeeklyShuttleSubscription.f29693id)) != 0) || (compareTo2 = Boolean.valueOf(mo33918f()).compareTo(Boolean.valueOf(mVTodWeeklyShuttleSubscription.mo33918f()))) != 0 || ((mo33918f() && (compareTo2 = this.enrolledDays.compareTo(mVTodWeeklyShuttleSubscription.enrolledDays)) != 0) || (compareTo2 = Boolean.valueOf(mo33920h()).compareTo(Boolean.valueOf(mVTodWeeklyShuttleSubscription.mo33920h()))) != 0))) {
            return compareTo2;
        }
        if (!mo33920h() || (compareTo = this.shuttleInfo.compareTo(mVTodWeeklyShuttleSubscription.shuttleInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodWeeklyShuttleSubscription)) {
            return false;
        }
        MVTodWeeklyShuttleSubscription mVTodWeeklyShuttleSubscription = (MVTodWeeklyShuttleSubscription) obj;
        boolean g = mo33919g();
        boolean g2 = mVTodWeeklyShuttleSubscription.mo33919g();
        if ((g || g2) && (!g || !g2 || !this.f29693id.equals(mVTodWeeklyShuttleSubscription.f29693id))) {
            return false;
        }
        boolean f = mo33918f();
        boolean f2 = mVTodWeeklyShuttleSubscription.mo33918f();
        if ((f || f2) && (!f || !f2 || !this.enrolledDays.mo33399a(mVTodWeeklyShuttleSubscription.enrolledDays))) {
            return false;
        }
        boolean h = mo33920h();
        boolean h2 = mVTodWeeklyShuttleSubscription.mo33920h();
        if ((h || h2) && (!h || !h2 || !this.shuttleInfo.mo33831a(mVTodWeeklyShuttleSubscription.shuttleInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33918f() {
        return this.enrolledDays != null;
    }

    /* renamed from: g */
    public final boolean mo33919g() {
        return this.f29693id != null;
    }

    /* renamed from: h */
    public final boolean mo33920h() {
        return this.shuttleInfo != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodWeeklyShuttleSubscription(", "id:");
        String str = this.f29693id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("enrolledDays:");
        MVTodDaysOfWeek mVTodDaysOfWeek = this.enrolledDays;
        if (mVTodDaysOfWeek == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodDaysOfWeek);
        }
        n.append(", ");
        n.append("shuttleInfo:");
        MVTodSubscriptionShuttleInfo mVTodSubscriptionShuttleInfo = this.shuttleInfo;
        if (mVTodSubscriptionShuttleInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodSubscriptionShuttleInfo);
        }
        n.append(")");
        return n.toString();
    }
}
