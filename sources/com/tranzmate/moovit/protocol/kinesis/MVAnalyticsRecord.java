package com.tranzmate.moovit.protocol.kinesis;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVAnalyticsRecord implements TBase<MVAnalyticsRecord, _Fields>, Serializable, Cloneable, Comparable<MVAnalyticsRecord> {

    /* renamed from: b */
    public static final C25113c f25877b = new C25113c("flowKey", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25878c = new C25113c("flowSequenceId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25879d = new C25113c("events", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f25880e = new C25113c("producer", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25881f = new C25113c("serviceType", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f25882g = new C25113c("userLocation", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f25883h = new C25113c("connectionQuality", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f25884i = new C25113c("configurationVersion", (byte) 10, 8);

    /* renamed from: j */
    public static final HashMap f25885j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f25886k;
    private byte __isset_bitfield = 0;
    public long configurationVersion;
    public MVConnecionQuality connectionQuality;
    public List<MVAnalyticsEvent> events;
    public MVAnalyticsFlowKey flowKey;
    public int flowSequenceId;
    private _Fields[] optionals = {_Fields.PRODUCER, _Fields.SERVICE_TYPE, _Fields.USER_LOCATION, _Fields.CONNECTION_QUALITY, _Fields.CONFIGURATION_VERSION};
    public MVAnalyticsProducer producer;
    public MVServerServiceType serviceType;
    public MVGpsLocation userLocation;

    public enum _Fields implements C25085c {
        FLOW_KEY(1, "flowKey"),
        FLOW_SEQUENCE_ID(2, "flowSequenceId"),
        EVENTS(3, "events"),
        PRODUCER(4, "producer"),
        SERVICE_TYPE(5, "serviceType"),
        USER_LOCATION(6, "userLocation"),
        CONNECTION_QUALITY(7, "connectionQuality"),
        CONFIGURATION_VERSION(8, "configurationVersion");
        
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
            switch (i) {
                case 1:
                    return FLOW_KEY;
                case 2:
                    return FLOW_SEQUENCE_ID;
                case 3:
                    return EVENTS;
                case 4:
                    return PRODUCER;
                case 5:
                    return SERVICE_TYPE;
                case 6:
                    return USER_LOCATION;
                case 7:
                    return CONNECTION_QUALITY;
                case 8:
                    return CONFIGURATION_VERSION;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVAnalyticsRecord$a */
    public static class C8883a extends C25239c<MVAnalyticsRecord> {
        public C8883a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAnalyticsRecord mVAnalyticsRecord = (MVAnalyticsRecord) tBase;
            MVGpsLocation mVGpsLocation = mVAnalyticsRecord.userLocation;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVAnalyticsRecord.f25877b;
            gVar.mo61687K();
            if (mVAnalyticsRecord.flowKey != null) {
                gVar.mo61711x(MVAnalyticsRecord.f25877b);
                gVar.mo61678B(mVAnalyticsRecord.flowKey.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAnalyticsRecord.f25878c);
            gVar.mo61678B(mVAnalyticsRecord.flowSequenceId);
            gVar.mo61712y();
            if (mVAnalyticsRecord.events != null) {
                gVar.mo61711x(MVAnalyticsRecord.f25879d);
                gVar.mo61680D(new C25119e((byte) 12, mVAnalyticsRecord.events.size()));
                for (MVAnalyticsEvent X0 : mVAnalyticsRecord.events) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVAnalyticsRecord.producer != null && mVAnalyticsRecord.mo27661k()) {
                gVar.mo61711x(MVAnalyticsRecord.f25880e);
                gVar.mo61678B(mVAnalyticsRecord.producer.getValue());
                gVar.mo61712y();
            }
            if (mVAnalyticsRecord.serviceType != null && mVAnalyticsRecord.mo27662l()) {
                gVar.mo61711x(MVAnalyticsRecord.f25881f);
                gVar.mo61678B(mVAnalyticsRecord.serviceType.getValue());
                gVar.mo61712y();
            }
            if (mVAnalyticsRecord.userLocation != null && mVAnalyticsRecord.mo27663m()) {
                gVar.mo61711x(MVAnalyticsRecord.f25882g);
                mVAnalyticsRecord.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAnalyticsRecord.connectionQuality != null && mVAnalyticsRecord.mo27656g()) {
                gVar.mo61711x(MVAnalyticsRecord.f25883h);
                gVar.mo61678B(mVAnalyticsRecord.connectionQuality.getValue());
                gVar.mo61712y();
            }
            if (mVAnalyticsRecord.mo27655f()) {
                gVar.mo61711x(MVAnalyticsRecord.f25884i);
                gVar.mo61679C(mVAnalyticsRecord.configurationVersion);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAnalyticsRecord mVAnalyticsRecord = (MVAnalyticsRecord) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVGpsLocation mVGpsLocation = mVAnalyticsRecord.userLocation;
                    if (mVGpsLocation != null) {
                        mVGpsLocation.mo26193r();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAnalyticsRecord.flowKey = MVAnalyticsFlowKey.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAnalyticsRecord.flowSequenceId = gVar.mo61696i();
                            mVAnalyticsRecord.mo27665p();
                            break;
                        }
                    case 3:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVAnalyticsRecord.events = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVAnalyticsEvent mVAnalyticsEvent = new MVAnalyticsEvent();
                                mVAnalyticsEvent.mo25201C1(gVar);
                                mVAnalyticsRecord.events.add(mVAnalyticsEvent);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAnalyticsRecord.producer = MVAnalyticsProducer.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAnalyticsRecord.serviceType = MVServerServiceType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVGpsLocation mVGpsLocation2 = new MVGpsLocation();
                            mVAnalyticsRecord.userLocation = mVGpsLocation2;
                            mVGpsLocation2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAnalyticsRecord.connectionQuality = MVConnecionQuality.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAnalyticsRecord.configurationVersion = gVar.mo61697j();
                            mVAnalyticsRecord.mo27664o();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVAnalyticsRecord$b */
    public static class C8884b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8883a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVAnalyticsRecord$c */
    public static class C8885c extends C25240d<MVAnalyticsRecord> {
        public C8885c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAnalyticsRecord mVAnalyticsRecord = (MVAnalyticsRecord) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAnalyticsRecord.mo27659i()) {
                bitSet.set(0);
            }
            if (mVAnalyticsRecord.mo27660j()) {
                bitSet.set(1);
            }
            if (mVAnalyticsRecord.mo27657h()) {
                bitSet.set(2);
            }
            if (mVAnalyticsRecord.mo27661k()) {
                bitSet.set(3);
            }
            if (mVAnalyticsRecord.mo27662l()) {
                bitSet.set(4);
            }
            if (mVAnalyticsRecord.mo27663m()) {
                bitSet.set(5);
            }
            if (mVAnalyticsRecord.mo27656g()) {
                bitSet.set(6);
            }
            if (mVAnalyticsRecord.mo27655f()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVAnalyticsRecord.mo27659i()) {
                jVar.mo61678B(mVAnalyticsRecord.flowKey.getValue());
            }
            if (mVAnalyticsRecord.mo27660j()) {
                jVar.mo61678B(mVAnalyticsRecord.flowSequenceId);
            }
            if (mVAnalyticsRecord.mo27657h()) {
                jVar.mo61678B(mVAnalyticsRecord.events.size());
                for (MVAnalyticsEvent X0 : mVAnalyticsRecord.events) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVAnalyticsRecord.mo27661k()) {
                jVar.mo61678B(mVAnalyticsRecord.producer.getValue());
            }
            if (mVAnalyticsRecord.mo27662l()) {
                jVar.mo61678B(mVAnalyticsRecord.serviceType.getValue());
            }
            if (mVAnalyticsRecord.mo27663m()) {
                mVAnalyticsRecord.userLocation.mo25202X0(jVar);
            }
            if (mVAnalyticsRecord.mo27656g()) {
                jVar.mo61678B(mVAnalyticsRecord.connectionQuality.getValue());
            }
            if (mVAnalyticsRecord.mo27655f()) {
                jVar.mo61679C(mVAnalyticsRecord.configurationVersion);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAnalyticsRecord mVAnalyticsRecord = (MVAnalyticsRecord) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVAnalyticsRecord.flowKey = MVAnalyticsFlowKey.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVAnalyticsRecord.flowSequenceId = jVar.mo61696i();
                mVAnalyticsRecord.mo27665p();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVAnalyticsRecord.events = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAnalyticsEvent mVAnalyticsEvent = new MVAnalyticsEvent();
                    mVAnalyticsEvent.mo25201C1(jVar);
                    mVAnalyticsRecord.events.add(mVAnalyticsEvent);
                }
            }
            if (T.get(3)) {
                mVAnalyticsRecord.producer = MVAnalyticsProducer.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVAnalyticsRecord.serviceType = MVServerServiceType.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVAnalyticsRecord.userLocation = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVAnalyticsRecord.connectionQuality = MVConnecionQuality.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                mVAnalyticsRecord.configurationVersion = jVar.mo61697j();
                mVAnalyticsRecord.mo27664o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVAnalyticsRecord$d */
    public static class C8886d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8885c(0);
        }
    }

    static {
        new C17394d0("MVAnalyticsRecord");
        HashMap hashMap = new HashMap();
        f25885j = hashMap;
        hashMap.put(C25239c.class, new C8884b());
        hashMap.put(C25240d.class, new C8886d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FLOW_KEY, new FieldMetaData("flowKey", (byte) 3, new EnumMetaData(MVAnalyticsFlowKey.class)));
        enumMap.put(_Fields.FLOW_SEQUENCE_ID, new FieldMetaData("flowSequenceId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EVENTS, new FieldMetaData("events", (byte) 3, new ListMetaData(new StructMetaData(MVAnalyticsEvent.class))));
        enumMap.put(_Fields.PRODUCER, new FieldMetaData("producer", (byte) 2, new EnumMetaData(MVAnalyticsProducer.class)));
        enumMap.put(_Fields.SERVICE_TYPE, new FieldMetaData("serviceType", (byte) 2, new EnumMetaData(MVServerServiceType.class)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.CONNECTION_QUALITY, new FieldMetaData("connectionQuality", (byte) 2, new EnumMetaData(MVConnecionQuality.class)));
        enumMap.put(_Fields.CONFIGURATION_VERSION, new FieldMetaData("configurationVersion", (byte) 2, new FieldValueMetaData((byte) 10, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25886k = unmodifiableMap;
        FieldMetaData.m61947a(MVAnalyticsRecord.class, unmodifiableMap);
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
        ((C25238b) f25885j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25885j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVAnalyticsRecord mVAnalyticsRecord = (MVAnalyticsRecord) obj;
        if (!getClass().equals(mVAnalyticsRecord.getClass())) {
            return getClass().getName().compareTo(mVAnalyticsRecord.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27659i()).compareTo(Boolean.valueOf(mVAnalyticsRecord.mo27659i()));
        if (compareTo != 0 || ((mo27659i() && (compareTo = this.flowKey.compareTo(mVAnalyticsRecord.flowKey)) != 0) || (compareTo = Boolean.valueOf(mo27660j()).compareTo(Boolean.valueOf(mVAnalyticsRecord.mo27660j()))) != 0 || ((mo27660j() && (compareTo = C25082a.m62839c(this.flowSequenceId, mVAnalyticsRecord.flowSequenceId)) != 0) || (compareTo = Boolean.valueOf(mo27657h()).compareTo(Boolean.valueOf(mVAnalyticsRecord.mo27657h()))) != 0 || ((mo27657h() && (compareTo = C25082a.m62844h(this.events, mVAnalyticsRecord.events)) != 0) || (compareTo = Boolean.valueOf(mo27661k()).compareTo(Boolean.valueOf(mVAnalyticsRecord.mo27661k()))) != 0 || ((mo27661k() && (compareTo = this.producer.compareTo(mVAnalyticsRecord.producer)) != 0) || (compareTo = Boolean.valueOf(mo27662l()).compareTo(Boolean.valueOf(mVAnalyticsRecord.mo27662l()))) != 0 || ((mo27662l() && (compareTo = this.serviceType.compareTo(mVAnalyticsRecord.serviceType)) != 0) || (compareTo = Boolean.valueOf(mo27663m()).compareTo(Boolean.valueOf(mVAnalyticsRecord.mo27663m()))) != 0 || ((mo27663m() && (compareTo = this.userLocation.compareTo(mVAnalyticsRecord.userLocation)) != 0) || (compareTo = Boolean.valueOf(mo27656g()).compareTo(Boolean.valueOf(mVAnalyticsRecord.mo27656g()))) != 0 || ((mo27656g() && (compareTo = this.connectionQuality.compareTo(mVAnalyticsRecord.connectionQuality)) != 0) || (compareTo = Boolean.valueOf(mo27655f()).compareTo(Boolean.valueOf(mVAnalyticsRecord.mo27655f()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo27655f() || (d = C25082a.m62840d(this.configurationVersion, mVAnalyticsRecord.configurationVersion)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAnalyticsRecord)) {
            return false;
        }
        MVAnalyticsRecord mVAnalyticsRecord = (MVAnalyticsRecord) obj;
        boolean i = mo27659i();
        boolean i2 = mVAnalyticsRecord.mo27659i();
        if (((i || i2) && (!i || !i2 || !this.flowKey.equals(mVAnalyticsRecord.flowKey))) || this.flowSequenceId != mVAnalyticsRecord.flowSequenceId) {
            return false;
        }
        boolean h = mo27657h();
        boolean h2 = mVAnalyticsRecord.mo27657h();
        if ((h || h2) && (!h || !h2 || !this.events.equals(mVAnalyticsRecord.events))) {
            return false;
        }
        boolean k = mo27661k();
        boolean k2 = mVAnalyticsRecord.mo27661k();
        if ((k || k2) && (!k || !k2 || !this.producer.equals(mVAnalyticsRecord.producer))) {
            return false;
        }
        boolean l = mo27662l();
        boolean l2 = mVAnalyticsRecord.mo27662l();
        if ((l || l2) && (!l || !l2 || !this.serviceType.equals(mVAnalyticsRecord.serviceType))) {
            return false;
        }
        boolean m = mo27663m();
        boolean m2 = mVAnalyticsRecord.mo27663m();
        if ((m || m2) && (!m || !m2 || !this.userLocation.mo26178a(mVAnalyticsRecord.userLocation))) {
            return false;
        }
        boolean g = mo27656g();
        boolean g2 = mVAnalyticsRecord.mo27656g();
        if ((g || g2) && (!g || !g2 || !this.connectionQuality.equals(mVAnalyticsRecord.connectionQuality))) {
            return false;
        }
        boolean f = mo27655f();
        boolean f2 = mVAnalyticsRecord.mo27655f();
        if ((f || f2) && (!f || !f2 || this.configurationVersion != mVAnalyticsRecord.configurationVersion)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27655f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27656g() {
        return this.connectionQuality != null;
    }

    /* renamed from: h */
    public final boolean mo27657h() {
        return this.events != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27659i() {
        return this.flowKey != null;
    }

    /* renamed from: j */
    public final boolean mo27660j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo27661k() {
        return this.producer != null;
    }

    /* renamed from: l */
    public final boolean mo27662l() {
        return this.serviceType != null;
    }

    /* renamed from: m */
    public final boolean mo27663m() {
        return this.userLocation != null;
    }

    /* renamed from: o */
    public final void mo27664o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo27665p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAnalyticsRecord(", "flowKey:");
        MVAnalyticsFlowKey mVAnalyticsFlowKey = this.flowKey;
        if (mVAnalyticsFlowKey == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAnalyticsFlowKey);
        }
        n.append(", ");
        n.append("flowSequenceId:");
        C0016g.m42z(n, this.flowSequenceId, ", ", "events:");
        List<MVAnalyticsEvent> list = this.events;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo27661k()) {
            n.append(", ");
            n.append("producer:");
            MVAnalyticsProducer mVAnalyticsProducer = this.producer;
            if (mVAnalyticsProducer == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVAnalyticsProducer);
            }
        }
        if (mo27662l()) {
            n.append(", ");
            n.append("serviceType:");
            MVServerServiceType mVServerServiceType = this.serviceType;
            if (mVServerServiceType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVServerServiceType);
            }
        }
        if (mo27663m()) {
            n.append(", ");
            n.append("userLocation:");
            MVGpsLocation mVGpsLocation = this.userLocation;
            if (mVGpsLocation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVGpsLocation);
            }
        }
        if (mo27656g()) {
            n.append(", ");
            n.append("connectionQuality:");
            MVConnecionQuality mVConnecionQuality = this.connectionQuality;
            if (mVConnecionQuality == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVConnecionQuality);
            }
        }
        if (mo27655f()) {
            n.append(", ");
            n.append("configurationVersion:");
            n.append(this.configurationVersion);
        }
        n.append(")");
        return n.toString();
    }
}
