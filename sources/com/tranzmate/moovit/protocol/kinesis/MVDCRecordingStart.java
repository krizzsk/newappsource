package com.tranzmate.moovit.protocol.kinesis;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.datacollection.MVTriggerType;
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

public class MVDCRecordingStart implements TBase<MVDCRecordingStart, _Fields>, Serializable, Cloneable, Comparable<MVDCRecordingStart> {

    /* renamed from: b */
    public static final C25113c f25905b = new C25113c("triggerType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25906c = new C25113c("triggerId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25907d = new C25113c("sequenceId", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f25908e = new C25113c("timestamp", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f25909f = new C25113c("customData", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f25910g = new C25113c("startState", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f25911h = new C25113c("stateDescription", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f25912i = new C25113c("dcConfigurationTimestamp", (byte) 10, 8);

    /* renamed from: j */
    public static final C25113c f25913j = new C25113c("metroId", (byte) 8, 9);

    /* renamed from: k */
    public static final HashMap f25914k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f25915l;
    private byte __isset_bitfield = 0;
    public String customData;
    public long dcConfigurationTimestamp;
    public int metroId;
    public long sequenceId;
    public MVStartState startState;
    public String stateDescription;
    public long timestamp;
    public int triggerId;
    public MVTriggerType triggerType;

    public enum _Fields implements C25085c {
        TRIGGER_TYPE(1, "triggerType"),
        TRIGGER_ID(2, "triggerId"),
        SEQUENCE_ID(3, "sequenceId"),
        TIMESTAMP(4, "timestamp"),
        CUSTOM_DATA(5, "customData"),
        START_STATE(6, "startState"),
        STATE_DESCRIPTION(7, "stateDescription"),
        DC_CONFIGURATION_TIMESTAMP(8, "dcConfigurationTimestamp"),
        METRO_ID(9, "metroId");
        
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
                    return TRIGGER_TYPE;
                case 2:
                    return TRIGGER_ID;
                case 3:
                    return SEQUENCE_ID;
                case 4:
                    return TIMESTAMP;
                case 5:
                    return CUSTOM_DATA;
                case 6:
                    return START_STATE;
                case 7:
                    return STATE_DESCRIPTION;
                case 8:
                    return DC_CONFIGURATION_TIMESTAMP;
                case 9:
                    return METRO_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCRecordingStart$a */
    public static class C8899a extends C25239c<MVDCRecordingStart> {
        public C8899a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDCRecordingStart mVDCRecordingStart = (MVDCRecordingStart) tBase;
            mVDCRecordingStart.getClass();
            C25113c cVar = MVDCRecordingStart.f25905b;
            gVar.mo61687K();
            if (mVDCRecordingStart.triggerType != null) {
                gVar.mo61711x(MVDCRecordingStart.f25905b);
                gVar.mo61678B(mVDCRecordingStart.triggerType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDCRecordingStart.f25906c);
            gVar.mo61678B(mVDCRecordingStart.triggerId);
            gVar.mo61712y();
            gVar.mo61711x(MVDCRecordingStart.f25907d);
            gVar.mo61679C(mVDCRecordingStart.sequenceId);
            gVar.mo61712y();
            gVar.mo61711x(MVDCRecordingStart.f25908e);
            gVar.mo61679C(mVDCRecordingStart.timestamp);
            gVar.mo61712y();
            if (mVDCRecordingStart.customData != null) {
                gVar.mo61711x(MVDCRecordingStart.f25909f);
                gVar.mo61686J(mVDCRecordingStart.customData);
                gVar.mo61712y();
            }
            if (mVDCRecordingStart.startState != null) {
                gVar.mo61711x(MVDCRecordingStart.f25910g);
                gVar.mo61678B(mVDCRecordingStart.startState.getValue());
                gVar.mo61712y();
            }
            if (mVDCRecordingStart.stateDescription != null) {
                gVar.mo61711x(MVDCRecordingStart.f25911h);
                gVar.mo61686J(mVDCRecordingStart.stateDescription);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDCRecordingStart.f25912i);
            gVar.mo61679C(mVDCRecordingStart.dcConfigurationTimestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVDCRecordingStart.f25913j);
            C16530d.m42020n(gVar, mVDCRecordingStart.metroId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDCRecordingStart mVDCRecordingStart = (MVDCRecordingStart) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDCRecordingStart.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingStart.triggerType = MVTriggerType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingStart.triggerId = gVar.mo61696i();
                            mVDCRecordingStart.mo27722t();
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingStart.sequenceId = gVar.mo61697j();
                            mVDCRecordingStart.mo27720r();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingStart.timestamp = gVar.mo61697j();
                            mVDCRecordingStart.mo27721s();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingStart.customData = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingStart.startState = MVStartState.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingStart.stateDescription = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingStart.dcConfigurationTimestamp = gVar.mo61697j();
                            mVDCRecordingStart.mo27718p();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingStart.metroId = gVar.mo61696i();
                            mVDCRecordingStart.mo27719q();
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCRecordingStart$b */
    public static class C8900b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8899a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCRecordingStart$c */
    public static class C8901c extends C25240d<MVDCRecordingStart> {
        public C8901c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDCRecordingStart mVDCRecordingStart = (MVDCRecordingStart) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDCRecordingStart.mo27717o()) {
                bitSet.set(0);
            }
            if (mVDCRecordingStart.mo27716m()) {
                bitSet.set(1);
            }
            if (mVDCRecordingStart.mo27712i()) {
                bitSet.set(2);
            }
            if (mVDCRecordingStart.mo27715l()) {
                bitSet.set(3);
            }
            if (mVDCRecordingStart.mo27708f()) {
                bitSet.set(4);
            }
            if (mVDCRecordingStart.mo27713j()) {
                bitSet.set(5);
            }
            if (mVDCRecordingStart.mo27714k()) {
                bitSet.set(6);
            }
            if (mVDCRecordingStart.mo27709g()) {
                bitSet.set(7);
            }
            if (mVDCRecordingStart.mo27710h()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVDCRecordingStart.mo27717o()) {
                jVar.mo61678B(mVDCRecordingStart.triggerType.getValue());
            }
            if (mVDCRecordingStart.mo27716m()) {
                jVar.mo61678B(mVDCRecordingStart.triggerId);
            }
            if (mVDCRecordingStart.mo27712i()) {
                jVar.mo61679C(mVDCRecordingStart.sequenceId);
            }
            if (mVDCRecordingStart.mo27715l()) {
                jVar.mo61679C(mVDCRecordingStart.timestamp);
            }
            if (mVDCRecordingStart.mo27708f()) {
                jVar.mo61686J(mVDCRecordingStart.customData);
            }
            if (mVDCRecordingStart.mo27713j()) {
                jVar.mo61678B(mVDCRecordingStart.startState.getValue());
            }
            if (mVDCRecordingStart.mo27714k()) {
                jVar.mo61686J(mVDCRecordingStart.stateDescription);
            }
            if (mVDCRecordingStart.mo27709g()) {
                jVar.mo61679C(mVDCRecordingStart.dcConfigurationTimestamp);
            }
            if (mVDCRecordingStart.mo27710h()) {
                jVar.mo61678B(mVDCRecordingStart.metroId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDCRecordingStart mVDCRecordingStart = (MVDCRecordingStart) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                mVDCRecordingStart.triggerType = MVTriggerType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVDCRecordingStart.triggerId = jVar.mo61696i();
                mVDCRecordingStart.mo27722t();
            }
            if (T.get(2)) {
                mVDCRecordingStart.sequenceId = jVar.mo61697j();
                mVDCRecordingStart.mo27720r();
            }
            if (T.get(3)) {
                mVDCRecordingStart.timestamp = jVar.mo61697j();
                mVDCRecordingStart.mo27721s();
            }
            if (T.get(4)) {
                mVDCRecordingStart.customData = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVDCRecordingStart.startState = MVStartState.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                mVDCRecordingStart.stateDescription = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVDCRecordingStart.dcConfigurationTimestamp = jVar.mo61697j();
                mVDCRecordingStart.mo27718p();
            }
            if (T.get(8)) {
                mVDCRecordingStart.metroId = jVar.mo61696i();
                mVDCRecordingStart.mo27719q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCRecordingStart$d */
    public static class C8902d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8901c(0);
        }
    }

    static {
        new C17394d0("MVDCRecordingStart");
        HashMap hashMap = new HashMap();
        f25914k = hashMap;
        hashMap.put(C25239c.class, new C8900b());
        hashMap.put(C25240d.class, new C8902d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIGGER_TYPE, new FieldMetaData("triggerType", (byte) 3, new EnumMetaData(MVTriggerType.class)));
        enumMap.put(_Fields.TRIGGER_ID, new FieldMetaData("triggerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SEQUENCE_ID, new FieldMetaData("sequenceId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.CUSTOM_DATA, new FieldMetaData("customData", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.START_STATE, new FieldMetaData("startState", (byte) 3, new EnumMetaData(MVStartState.class)));
        enumMap.put(_Fields.STATE_DESCRIPTION, new FieldMetaData("stateDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DC_CONFIGURATION_TIMESTAMP, new FieldMetaData("dcConfigurationTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25915l = unmodifiableMap;
        FieldMetaData.m61947a(MVDCRecordingStart.class, unmodifiableMap);
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
        ((C25238b) f25914k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25914k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVDCRecordingStart mVDCRecordingStart = (MVDCRecordingStart) obj;
        if (!getClass().equals(mVDCRecordingStart.getClass())) {
            return getClass().getName().compareTo(mVDCRecordingStart.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27717o()).compareTo(Boolean.valueOf(mVDCRecordingStart.mo27717o()));
        if (compareTo != 0 || ((mo27717o() && (compareTo = this.triggerType.compareTo(mVDCRecordingStart.triggerType)) != 0) || (compareTo = Boolean.valueOf(mo27716m()).compareTo(Boolean.valueOf(mVDCRecordingStart.mo27716m()))) != 0 || ((mo27716m() && (compareTo = C25082a.m62839c(this.triggerId, mVDCRecordingStart.triggerId)) != 0) || (compareTo = Boolean.valueOf(mo27712i()).compareTo(Boolean.valueOf(mVDCRecordingStart.mo27712i()))) != 0 || ((mo27712i() && (compareTo = C25082a.m62840d(this.sequenceId, mVDCRecordingStart.sequenceId)) != 0) || (compareTo = Boolean.valueOf(mo27715l()).compareTo(Boolean.valueOf(mVDCRecordingStart.mo27715l()))) != 0 || ((mo27715l() && (compareTo = C25082a.m62840d(this.timestamp, mVDCRecordingStart.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27708f()).compareTo(Boolean.valueOf(mVDCRecordingStart.mo27708f()))) != 0 || ((mo27708f() && (compareTo = this.customData.compareTo(mVDCRecordingStart.customData)) != 0) || (compareTo = Boolean.valueOf(mo27713j()).compareTo(Boolean.valueOf(mVDCRecordingStart.mo27713j()))) != 0 || ((mo27713j() && (compareTo = this.startState.compareTo(mVDCRecordingStart.startState)) != 0) || (compareTo = Boolean.valueOf(mo27714k()).compareTo(Boolean.valueOf(mVDCRecordingStart.mo27714k()))) != 0 || ((mo27714k() && (compareTo = this.stateDescription.compareTo(mVDCRecordingStart.stateDescription)) != 0) || (compareTo = Boolean.valueOf(mo27709g()).compareTo(Boolean.valueOf(mVDCRecordingStart.mo27709g()))) != 0 || ((mo27709g() && (compareTo = C25082a.m62840d(this.dcConfigurationTimestamp, mVDCRecordingStart.dcConfigurationTimestamp)) != 0) || (compareTo = Boolean.valueOf(mo27710h()).compareTo(Boolean.valueOf(mVDCRecordingStart.mo27710h()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo27710h() || (c = C25082a.m62839c(this.metroId, mVDCRecordingStart.metroId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDCRecordingStart)) {
            return false;
        }
        MVDCRecordingStart mVDCRecordingStart = (MVDCRecordingStart) obj;
        boolean o = mo27717o();
        boolean o2 = mVDCRecordingStart.mo27717o();
        if (((o || o2) && (!o || !o2 || !this.triggerType.equals(mVDCRecordingStart.triggerType))) || this.triggerId != mVDCRecordingStart.triggerId || this.sequenceId != mVDCRecordingStart.sequenceId || this.timestamp != mVDCRecordingStart.timestamp) {
            return false;
        }
        boolean f = mo27708f();
        boolean f2 = mVDCRecordingStart.mo27708f();
        if ((f || f2) && (!f || !f2 || !this.customData.equals(mVDCRecordingStart.customData))) {
            return false;
        }
        boolean j = mo27713j();
        boolean j2 = mVDCRecordingStart.mo27713j();
        if ((j || j2) && (!j || !j2 || !this.startState.equals(mVDCRecordingStart.startState))) {
            return false;
        }
        boolean k = mo27714k();
        boolean k2 = mVDCRecordingStart.mo27714k();
        if (((!k && !k2) || (k && k2 && this.stateDescription.equals(mVDCRecordingStart.stateDescription))) && this.dcConfigurationTimestamp == mVDCRecordingStart.dcConfigurationTimestamp && this.metroId == mVDCRecordingStart.metroId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27708f() {
        return this.customData != null;
    }

    /* renamed from: g */
    public final boolean mo27709g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo27710h() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27712i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo27713j() {
        return this.startState != null;
    }

    /* renamed from: k */
    public final boolean mo27714k() {
        return this.stateDescription != null;
    }

    /* renamed from: l */
    public final boolean mo27715l() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: m */
    public final boolean mo27716m() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: o */
    public final boolean mo27717o() {
        return this.triggerType != null;
    }

    /* renamed from: p */
    public final void mo27718p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: q */
    public final void mo27719q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: r */
    public final void mo27720r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: s */
    public final void mo27721s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: t */
    public final void mo27722t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDCRecordingStart(", "triggerType:");
        MVTriggerType mVTriggerType = this.triggerType;
        if (mVTriggerType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTriggerType);
        }
        n.append(", ");
        n.append("triggerId:");
        C0016g.m42z(n, this.triggerId, ", ", "sequenceId:");
        C25541a.m63889t(n, this.sequenceId, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "customData:");
        String str = this.customData;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("startState:");
        MVStartState mVStartState = this.startState;
        if (mVStartState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVStartState);
        }
        n.append(", ");
        n.append("stateDescription:");
        String str2 = this.stateDescription;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("dcConfigurationTimestamp:");
        C25541a.m63889t(n, this.dcConfigurationTimestamp, ", ", "metroId:");
        return C13437d.m33707l(n, this.metroId, ")");
    }
}
