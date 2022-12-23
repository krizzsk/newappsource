package com.tranzmate.moovit.protocol.crowd;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.datacollection.MVTriggerType;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
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

public class MVStartDataCollectionNotification implements TBase<MVStartDataCollectionNotification, _Fields>, Serializable, Cloneable, Comparable<MVStartDataCollectionNotification> {

    /* renamed from: b */
    public static final C25113c f25439b = new C25113c("trigger", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25440c = new C25113c("hintStopId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25441d = new C25113c("hintLineIds", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f25442e = new C25113c("customData", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f25443f = new C25113c("startProcess", (byte) 10, 5);

    /* renamed from: g */
    public static final HashMap f25444g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25445h;
    private byte __isset_bitfield = 0;
    public String customData;
    public List<Integer> hintLineIds;
    public int hintStopId;
    private _Fields[] optionals = {_Fields.HINT_STOP_ID, _Fields.HINT_LINE_IDS, _Fields.CUSTOM_DATA};
    public long startProcess;
    public MVTriggerType trigger;

    public enum _Fields implements C25085c {
        TRIGGER(1, "trigger"),
        HINT_STOP_ID(2, "hintStopId"),
        HINT_LINE_IDS(3, "hintLineIds"),
        CUSTOM_DATA(4, "customData"),
        START_PROCESS(5, "startProcess");
        
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
                return TRIGGER;
            }
            if (i == 2) {
                return HINT_STOP_ID;
            }
            if (i == 3) {
                return HINT_LINE_IDS;
            }
            if (i == 4) {
                return CUSTOM_DATA;
            }
            if (i != 5) {
                return null;
            }
            return START_PROCESS;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVStartDataCollectionNotification$a */
    public static class C8599a extends C25239c<MVStartDataCollectionNotification> {
        public C8599a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStartDataCollectionNotification mVStartDataCollectionNotification = (MVStartDataCollectionNotification) tBase;
            mVStartDataCollectionNotification.getClass();
            C25113c cVar = MVStartDataCollectionNotification.f25439b;
            gVar.mo61687K();
            if (mVStartDataCollectionNotification.trigger != null) {
                gVar.mo61711x(MVStartDataCollectionNotification.f25439b);
                gVar.mo61678B(mVStartDataCollectionNotification.trigger.getValue());
                gVar.mo61712y();
            }
            if (mVStartDataCollectionNotification.mo26891h()) {
                gVar.mo61711x(MVStartDataCollectionNotification.f25440c);
                gVar.mo61678B(mVStartDataCollectionNotification.hintStopId);
                gVar.mo61712y();
            }
            if (mVStartDataCollectionNotification.hintLineIds != null && mVStartDataCollectionNotification.mo26890g()) {
                gVar.mo61711x(MVStartDataCollectionNotification.f25441d);
                gVar.mo61680D(new C25119e((byte) 8, mVStartDataCollectionNotification.hintLineIds.size()));
                for (Integer intValue : mVStartDataCollectionNotification.hintLineIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVStartDataCollectionNotification.customData != null && mVStartDataCollectionNotification.mo26889f()) {
                gVar.mo61711x(MVStartDataCollectionNotification.f25442e);
                gVar.mo61686J(mVStartDataCollectionNotification.customData);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStartDataCollectionNotification.f25443f);
            C25541a.m63891v(gVar, mVStartDataCollectionNotification.startProcess);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStartDataCollectionNotification mVStartDataCollectionNotification = (MVStartDataCollectionNotification) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStartDataCollectionNotification.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 10) {
                                    mVStartDataCollectionNotification.startProcess = gVar.mo61697j();
                                    mVStartDataCollectionNotification.mo26896l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVStartDataCollectionNotification.customData = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVStartDataCollectionNotification.hintLineIds = new ArrayList(k.f63395b);
                            int i = 0;
                            while (i < k.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVStartDataCollectionNotification.hintLineIds, i, 1);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVStartDataCollectionNotification.hintStopId = gVar.mo61696i();
                        mVStartDataCollectionNotification.mo26895k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVStartDataCollectionNotification.trigger = MVTriggerType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVStartDataCollectionNotification$b */
    public static class C8600b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8599a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVStartDataCollectionNotification$c */
    public static class C8601c extends C25240d<MVStartDataCollectionNotification> {
        public C8601c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStartDataCollectionNotification mVStartDataCollectionNotification = (MVStartDataCollectionNotification) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStartDataCollectionNotification.mo26894j()) {
                bitSet.set(0);
            }
            if (mVStartDataCollectionNotification.mo26891h()) {
                bitSet.set(1);
            }
            if (mVStartDataCollectionNotification.mo26890g()) {
                bitSet.set(2);
            }
            if (mVStartDataCollectionNotification.mo26889f()) {
                bitSet.set(3);
            }
            if (mVStartDataCollectionNotification.mo26893i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVStartDataCollectionNotification.mo26894j()) {
                jVar.mo61678B(mVStartDataCollectionNotification.trigger.getValue());
            }
            if (mVStartDataCollectionNotification.mo26891h()) {
                jVar.mo61678B(mVStartDataCollectionNotification.hintStopId);
            }
            if (mVStartDataCollectionNotification.mo26890g()) {
                jVar.mo61678B(mVStartDataCollectionNotification.hintLineIds.size());
                for (Integer intValue : mVStartDataCollectionNotification.hintLineIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVStartDataCollectionNotification.mo26889f()) {
                jVar.mo61686J(mVStartDataCollectionNotification.customData);
            }
            if (mVStartDataCollectionNotification.mo26893i()) {
                jVar.mo61679C(mVStartDataCollectionNotification.startProcess);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStartDataCollectionNotification mVStartDataCollectionNotification = (MVStartDataCollectionNotification) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVStartDataCollectionNotification.trigger = MVTriggerType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVStartDataCollectionNotification.hintStopId = jVar.mo61696i();
                mVStartDataCollectionNotification.mo26895k();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVStartDataCollectionNotification.hintLineIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVStartDataCollectionNotification.hintLineIds, i2, 1)) {
                }
            }
            if (T.get(3)) {
                mVStartDataCollectionNotification.customData = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVStartDataCollectionNotification.startProcess = jVar.mo61697j();
                mVStartDataCollectionNotification.mo26896l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVStartDataCollectionNotification$d */
    public static class C8602d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8601c(0);
        }
    }

    static {
        new C17394d0("MVStartDataCollectionNotification");
        HashMap hashMap = new HashMap();
        f25444g = hashMap;
        hashMap.put(C25239c.class, new C8600b());
        hashMap.put(C25240d.class, new C8602d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIGGER, new FieldMetaData("trigger", (byte) 3, new EnumMetaData(MVTriggerType.class)));
        enumMap.put(_Fields.HINT_STOP_ID, new FieldMetaData("hintStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.HINT_LINE_IDS, new FieldMetaData("hintLineIds", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.CUSTOM_DATA, new FieldMetaData("customData", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.START_PROCESS, new FieldMetaData("startProcess", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25445h = unmodifiableMap;
        FieldMetaData.m61947a(MVStartDataCollectionNotification.class, unmodifiableMap);
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
        ((C25238b) f25444g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25444g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVStartDataCollectionNotification mVStartDataCollectionNotification = (MVStartDataCollectionNotification) obj;
        if (!getClass().equals(mVStartDataCollectionNotification.getClass())) {
            return getClass().getName().compareTo(mVStartDataCollectionNotification.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26894j()).compareTo(Boolean.valueOf(mVStartDataCollectionNotification.mo26894j()));
        if (compareTo != 0 || ((mo26894j() && (compareTo = this.trigger.compareTo(mVStartDataCollectionNotification.trigger)) != 0) || (compareTo = Boolean.valueOf(mo26891h()).compareTo(Boolean.valueOf(mVStartDataCollectionNotification.mo26891h()))) != 0 || ((mo26891h() && (compareTo = C25082a.m62839c(this.hintStopId, mVStartDataCollectionNotification.hintStopId)) != 0) || (compareTo = Boolean.valueOf(mo26890g()).compareTo(Boolean.valueOf(mVStartDataCollectionNotification.mo26890g()))) != 0 || ((mo26890g() && (compareTo = C25082a.m62844h(this.hintLineIds, mVStartDataCollectionNotification.hintLineIds)) != 0) || (compareTo = Boolean.valueOf(mo26889f()).compareTo(Boolean.valueOf(mVStartDataCollectionNotification.mo26889f()))) != 0 || ((mo26889f() && (compareTo = this.customData.compareTo(mVStartDataCollectionNotification.customData)) != 0) || (compareTo = Boolean.valueOf(mo26893i()).compareTo(Boolean.valueOf(mVStartDataCollectionNotification.mo26893i()))) != 0))))) {
            return compareTo;
        }
        if (!mo26893i() || (d = C25082a.m62840d(this.startProcess, mVStartDataCollectionNotification.startProcess)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStartDataCollectionNotification)) {
            return false;
        }
        MVStartDataCollectionNotification mVStartDataCollectionNotification = (MVStartDataCollectionNotification) obj;
        boolean j = mo26894j();
        boolean j2 = mVStartDataCollectionNotification.mo26894j();
        if ((j || j2) && (!j || !j2 || !this.trigger.equals(mVStartDataCollectionNotification.trigger))) {
            return false;
        }
        boolean h = mo26891h();
        boolean h2 = mVStartDataCollectionNotification.mo26891h();
        if ((h || h2) && (!h || !h2 || this.hintStopId != mVStartDataCollectionNotification.hintStopId)) {
            return false;
        }
        boolean g = mo26890g();
        boolean g2 = mVStartDataCollectionNotification.mo26890g();
        if ((g || g2) && (!g || !g2 || !this.hintLineIds.equals(mVStartDataCollectionNotification.hintLineIds))) {
            return false;
        }
        boolean f = mo26889f();
        boolean f2 = mVStartDataCollectionNotification.mo26889f();
        if (((f || f2) && (!f || !f2 || !this.customData.equals(mVStartDataCollectionNotification.customData))) || this.startProcess != mVStartDataCollectionNotification.startProcess) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26889f() {
        return this.customData != null;
    }

    /* renamed from: g */
    public final boolean mo26890g() {
        return this.hintLineIds != null;
    }

    /* renamed from: h */
    public final boolean mo26891h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26893i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo26894j() {
        return this.trigger != null;
    }

    /* renamed from: k */
    public final void mo26895k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo26896l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStartDataCollectionNotification(", "trigger:");
        MVTriggerType mVTriggerType = this.trigger;
        if (mVTriggerType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTriggerType);
        }
        if (mo26891h()) {
            n.append(", ");
            n.append("hintStopId:");
            n.append(this.hintStopId);
        }
        if (mo26890g()) {
            n.append(", ");
            n.append("hintLineIds:");
            List<Integer> list = this.hintLineIds;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo26889f()) {
            n.append(", ");
            n.append("customData:");
            String str = this.customData;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("startProcess:");
        return C25541a.m63884o(n, this.startProcess, ")");
    }
}
