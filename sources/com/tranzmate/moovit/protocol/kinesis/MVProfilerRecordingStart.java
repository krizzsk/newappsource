package com.tranzmate.moovit.protocol.kinesis;

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

public class MVProfilerRecordingStart implements TBase<MVProfilerRecordingStart, _Fields>, Serializable, Cloneable, Comparable<MVProfilerRecordingStart> {

    /* renamed from: b */
    public static final C25113c f25984b = new C25113c("profilerType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25985c = new C25113c("sequenceId", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25986d = new C25113c("timestamp", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f25987e = new C25113c("startStateId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25988f = new C25113c("stateDescription", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f25989g = new C25113c("locationStateId", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f25990h = new C25113c("metroId", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f25991i = new C25113c("expectedProfilerTimeInMinutes", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f25992j = new C25113c("profilerConfigurationTimestamp", (byte) 10, 9);

    /* renamed from: k */
    public static final HashMap f25993k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f25994l;
    private byte __isset_bitfield = 0;
    public int expectedProfilerTimeInMinutes;
    public MVLocationState locationStateId;
    public int metroId;
    public long profilerConfigurationTimestamp;
    public MVProfilerType profilerType;
    public long sequenceId;
    public MVStartState startStateId;
    public String stateDescription;
    public long timestamp;

    public enum _Fields implements C25085c {
        PROFILER_TYPE(1, "profilerType"),
        SEQUENCE_ID(2, "sequenceId"),
        TIMESTAMP(3, "timestamp"),
        START_STATE_ID(4, "startStateId"),
        STATE_DESCRIPTION(5, "stateDescription"),
        LOCATION_STATE_ID(6, "locationStateId"),
        METRO_ID(7, "metroId"),
        EXPECTED_PROFILER_TIME_IN_MINUTES(8, "expectedProfilerTimeInMinutes"),
        PROFILER_CONFIGURATION_TIMESTAMP(9, "profilerConfigurationTimestamp");
        
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
                    return PROFILER_TYPE;
                case 2:
                    return SEQUENCE_ID;
                case 3:
                    return TIMESTAMP;
                case 4:
                    return START_STATE_ID;
                case 5:
                    return STATE_DESCRIPTION;
                case 6:
                    return LOCATION_STATE_ID;
                case 7:
                    return METRO_ID;
                case 8:
                    return EXPECTED_PROFILER_TIME_IN_MINUTES;
                case 9:
                    return PROFILER_CONFIGURATION_TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerRecordingStart$a */
    public static class C8931a extends C25239c<MVProfilerRecordingStart> {
        public C8931a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfilerRecordingStart mVProfilerRecordingStart = (MVProfilerRecordingStart) tBase;
            mVProfilerRecordingStart.getClass();
            C25113c cVar = MVProfilerRecordingStart.f25984b;
            gVar.mo61687K();
            if (mVProfilerRecordingStart.profilerType != null) {
                gVar.mo61711x(MVProfilerRecordingStart.f25984b);
                gVar.mo61678B(mVProfilerRecordingStart.profilerType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVProfilerRecordingStart.f25985c);
            gVar.mo61679C(mVProfilerRecordingStart.sequenceId);
            gVar.mo61712y();
            gVar.mo61711x(MVProfilerRecordingStart.f25986d);
            gVar.mo61679C(mVProfilerRecordingStart.timestamp);
            gVar.mo61712y();
            if (mVProfilerRecordingStart.startStateId != null) {
                gVar.mo61711x(MVProfilerRecordingStart.f25987e);
                gVar.mo61678B(mVProfilerRecordingStart.startStateId.getValue());
                gVar.mo61712y();
            }
            if (mVProfilerRecordingStart.stateDescription != null) {
                gVar.mo61711x(MVProfilerRecordingStart.f25988f);
                gVar.mo61686J(mVProfilerRecordingStart.stateDescription);
                gVar.mo61712y();
            }
            if (mVProfilerRecordingStart.locationStateId != null) {
                gVar.mo61711x(MVProfilerRecordingStart.f25989g);
                gVar.mo61678B(mVProfilerRecordingStart.locationStateId.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVProfilerRecordingStart.f25990h);
            gVar.mo61678B(mVProfilerRecordingStart.metroId);
            gVar.mo61712y();
            gVar.mo61711x(MVProfilerRecordingStart.f25991i);
            gVar.mo61678B(mVProfilerRecordingStart.expectedProfilerTimeInMinutes);
            gVar.mo61712y();
            gVar.mo61711x(MVProfilerRecordingStart.f25992j);
            C25541a.m63891v(gVar, mVProfilerRecordingStart.profilerConfigurationTimestamp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfilerRecordingStart mVProfilerRecordingStart = (MVProfilerRecordingStart) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVProfilerRecordingStart.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfilerRecordingStart.profilerType = MVProfilerType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfilerRecordingStart.sequenceId = gVar.mo61697j();
                            mVProfilerRecordingStart.mo27874s();
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfilerRecordingStart.timestamp = gVar.mo61697j();
                            mVProfilerRecordingStart.mo27875t();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfilerRecordingStart.startStateId = MVStartState.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfilerRecordingStart.stateDescription = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfilerRecordingStart.locationStateId = MVLocationState.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfilerRecordingStart.metroId = gVar.mo61696i();
                            mVProfilerRecordingStart.mo27872q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfilerRecordingStart.expectedProfilerTimeInMinutes = gVar.mo61696i();
                            mVProfilerRecordingStart.mo27871p();
                            break;
                        }
                    case 9:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfilerRecordingStart.profilerConfigurationTimestamp = gVar.mo61697j();
                            mVProfilerRecordingStart.mo27873r();
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerRecordingStart$b */
    public static class C8932b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8931a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerRecordingStart$c */
    public static class C8933c extends C25240d<MVProfilerRecordingStart> {
        public C8933c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfilerRecordingStart mVProfilerRecordingStart = (MVProfilerRecordingStart) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVProfilerRecordingStart.mo27866j()) {
                bitSet.set(0);
            }
            if (mVProfilerRecordingStart.mo27867k()) {
                bitSet.set(1);
            }
            if (mVProfilerRecordingStart.mo27870o()) {
                bitSet.set(2);
            }
            if (mVProfilerRecordingStart.mo27868l()) {
                bitSet.set(3);
            }
            if (mVProfilerRecordingStart.mo27869m()) {
                bitSet.set(4);
            }
            if (mVProfilerRecordingStart.mo27862g()) {
                bitSet.set(5);
            }
            if (mVProfilerRecordingStart.mo27863h()) {
                bitSet.set(6);
            }
            if (mVProfilerRecordingStart.mo27861f()) {
                bitSet.set(7);
            }
            if (mVProfilerRecordingStart.mo27865i()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVProfilerRecordingStart.mo27866j()) {
                jVar.mo61678B(mVProfilerRecordingStart.profilerType.getValue());
            }
            if (mVProfilerRecordingStart.mo27867k()) {
                jVar.mo61679C(mVProfilerRecordingStart.sequenceId);
            }
            if (mVProfilerRecordingStart.mo27870o()) {
                jVar.mo61679C(mVProfilerRecordingStart.timestamp);
            }
            if (mVProfilerRecordingStart.mo27868l()) {
                jVar.mo61678B(mVProfilerRecordingStart.startStateId.getValue());
            }
            if (mVProfilerRecordingStart.mo27869m()) {
                jVar.mo61686J(mVProfilerRecordingStart.stateDescription);
            }
            if (mVProfilerRecordingStart.mo27862g()) {
                jVar.mo61678B(mVProfilerRecordingStart.locationStateId.getValue());
            }
            if (mVProfilerRecordingStart.mo27863h()) {
                jVar.mo61678B(mVProfilerRecordingStart.metroId);
            }
            if (mVProfilerRecordingStart.mo27861f()) {
                jVar.mo61678B(mVProfilerRecordingStart.expectedProfilerTimeInMinutes);
            }
            if (mVProfilerRecordingStart.mo27865i()) {
                jVar.mo61679C(mVProfilerRecordingStart.profilerConfigurationTimestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfilerRecordingStart mVProfilerRecordingStart = (MVProfilerRecordingStart) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                mVProfilerRecordingStart.profilerType = MVProfilerType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVProfilerRecordingStart.sequenceId = jVar.mo61697j();
                mVProfilerRecordingStart.mo27874s();
            }
            if (T.get(2)) {
                mVProfilerRecordingStart.timestamp = jVar.mo61697j();
                mVProfilerRecordingStart.mo27875t();
            }
            if (T.get(3)) {
                mVProfilerRecordingStart.startStateId = MVStartState.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVProfilerRecordingStart.stateDescription = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVProfilerRecordingStart.locationStateId = MVLocationState.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                mVProfilerRecordingStart.metroId = jVar.mo61696i();
                mVProfilerRecordingStart.mo27872q();
            }
            if (T.get(7)) {
                mVProfilerRecordingStart.expectedProfilerTimeInMinutes = jVar.mo61696i();
                mVProfilerRecordingStart.mo27871p();
            }
            if (T.get(8)) {
                mVProfilerRecordingStart.profilerConfigurationTimestamp = jVar.mo61697j();
                mVProfilerRecordingStart.mo27873r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerRecordingStart$d */
    public static class C8934d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8933c(0);
        }
    }

    static {
        new C17394d0("MVProfilerRecordingStart");
        HashMap hashMap = new HashMap();
        f25993k = hashMap;
        hashMap.put(C25239c.class, new C8932b());
        hashMap.put(C25240d.class, new C8934d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROFILER_TYPE, new FieldMetaData("profilerType", (byte) 3, new EnumMetaData(MVProfilerType.class)));
        enumMap.put(_Fields.SEQUENCE_ID, new FieldMetaData("sequenceId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.START_STATE_ID, new FieldMetaData("startStateId", (byte) 3, new EnumMetaData(MVStartState.class)));
        enumMap.put(_Fields.STATE_DESCRIPTION, new FieldMetaData("stateDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOCATION_STATE_ID, new FieldMetaData("locationStateId", (byte) 3, new EnumMetaData(MVLocationState.class)));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EXPECTED_PROFILER_TIME_IN_MINUTES, new FieldMetaData("expectedProfilerTimeInMinutes", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PROFILER_CONFIGURATION_TIMESTAMP, new FieldMetaData("profilerConfigurationTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25994l = unmodifiableMap;
        FieldMetaData.m61947a(MVProfilerRecordingStart.class, unmodifiableMap);
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
        ((C25238b) f25993k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25993k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVProfilerRecordingStart mVProfilerRecordingStart = (MVProfilerRecordingStart) obj;
        if (!getClass().equals(mVProfilerRecordingStart.getClass())) {
            return getClass().getName().compareTo(mVProfilerRecordingStart.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27866j()).compareTo(Boolean.valueOf(mVProfilerRecordingStart.mo27866j()));
        if (compareTo != 0 || ((mo27866j() && (compareTo = this.profilerType.compareTo(mVProfilerRecordingStart.profilerType)) != 0) || (compareTo = Boolean.valueOf(mo27867k()).compareTo(Boolean.valueOf(mVProfilerRecordingStart.mo27867k()))) != 0 || ((mo27867k() && (compareTo = C25082a.m62840d(this.sequenceId, mVProfilerRecordingStart.sequenceId)) != 0) || (compareTo = Boolean.valueOf(mo27870o()).compareTo(Boolean.valueOf(mVProfilerRecordingStart.mo27870o()))) != 0 || ((mo27870o() && (compareTo = C25082a.m62840d(this.timestamp, mVProfilerRecordingStart.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27868l()).compareTo(Boolean.valueOf(mVProfilerRecordingStart.mo27868l()))) != 0 || ((mo27868l() && (compareTo = this.startStateId.compareTo(mVProfilerRecordingStart.startStateId)) != 0) || (compareTo = Boolean.valueOf(mo27869m()).compareTo(Boolean.valueOf(mVProfilerRecordingStart.mo27869m()))) != 0 || ((mo27869m() && (compareTo = this.stateDescription.compareTo(mVProfilerRecordingStart.stateDescription)) != 0) || (compareTo = Boolean.valueOf(mo27862g()).compareTo(Boolean.valueOf(mVProfilerRecordingStart.mo27862g()))) != 0 || ((mo27862g() && (compareTo = this.locationStateId.compareTo(mVProfilerRecordingStart.locationStateId)) != 0) || (compareTo = Boolean.valueOf(mo27863h()).compareTo(Boolean.valueOf(mVProfilerRecordingStart.mo27863h()))) != 0 || ((mo27863h() && (compareTo = C25082a.m62839c(this.metroId, mVProfilerRecordingStart.metroId)) != 0) || (compareTo = Boolean.valueOf(mo27861f()).compareTo(Boolean.valueOf(mVProfilerRecordingStart.mo27861f()))) != 0 || ((mo27861f() && (compareTo = C25082a.m62839c(this.expectedProfilerTimeInMinutes, mVProfilerRecordingStart.expectedProfilerTimeInMinutes)) != 0) || (compareTo = Boolean.valueOf(mo27865i()).compareTo(Boolean.valueOf(mVProfilerRecordingStart.mo27865i()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo27865i() || (d = C25082a.m62840d(this.profilerConfigurationTimestamp, mVProfilerRecordingStart.profilerConfigurationTimestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVProfilerRecordingStart)) {
            return false;
        }
        MVProfilerRecordingStart mVProfilerRecordingStart = (MVProfilerRecordingStart) obj;
        boolean j = mo27866j();
        boolean j2 = mVProfilerRecordingStart.mo27866j();
        if (((j || j2) && (!j || !j2 || !this.profilerType.equals(mVProfilerRecordingStart.profilerType))) || this.sequenceId != mVProfilerRecordingStart.sequenceId || this.timestamp != mVProfilerRecordingStart.timestamp) {
            return false;
        }
        boolean l = mo27868l();
        boolean l2 = mVProfilerRecordingStart.mo27868l();
        if ((l || l2) && (!l || !l2 || !this.startStateId.equals(mVProfilerRecordingStart.startStateId))) {
            return false;
        }
        boolean m = mo27869m();
        boolean m2 = mVProfilerRecordingStart.mo27869m();
        if ((m || m2) && (!m || !m2 || !this.stateDescription.equals(mVProfilerRecordingStart.stateDescription))) {
            return false;
        }
        boolean g = mo27862g();
        boolean g2 = mVProfilerRecordingStart.mo27862g();
        if (((!g && !g2) || (g && g2 && this.locationStateId.equals(mVProfilerRecordingStart.locationStateId))) && this.metroId == mVProfilerRecordingStart.metroId && this.expectedProfilerTimeInMinutes == mVProfilerRecordingStart.expectedProfilerTimeInMinutes && this.profilerConfigurationTimestamp == mVProfilerRecordingStart.profilerConfigurationTimestamp) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27861f() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: g */
    public final boolean mo27862g() {
        return this.locationStateId != null;
    }

    /* renamed from: h */
    public final boolean mo27863h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27865i() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: j */
    public final boolean mo27866j() {
        return this.profilerType != null;
    }

    /* renamed from: k */
    public final boolean mo27867k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final boolean mo27868l() {
        return this.startStateId != null;
    }

    /* renamed from: m */
    public final boolean mo27869m() {
        return this.stateDescription != null;
    }

    /* renamed from: o */
    public final boolean mo27870o() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: p */
    public final void mo27871p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: q */
    public final void mo27872q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: r */
    public final void mo27873r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: s */
    public final void mo27874s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: t */
    public final void mo27875t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVProfilerRecordingStart(", "profilerType:");
        MVProfilerType mVProfilerType = this.profilerType;
        if (mVProfilerType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVProfilerType);
        }
        n.append(", ");
        n.append("sequenceId:");
        C25541a.m63889t(n, this.sequenceId, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "startStateId:");
        MVStartState mVStartState = this.startStateId;
        if (mVStartState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVStartState);
        }
        n.append(", ");
        n.append("stateDescription:");
        String str = this.stateDescription;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("locationStateId:");
        MVLocationState mVLocationState = this.locationStateId;
        if (mVLocationState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationState);
        }
        n.append(", ");
        n.append("metroId:");
        C0016g.m42z(n, this.metroId, ", ", "expectedProfilerTimeInMinutes:");
        C0016g.m42z(n, this.expectedProfilerTimeInMinutes, ", ", "profilerConfigurationTimestamp:");
        return C25541a.m63884o(n, this.profilerConfigurationTimestamp, ")");
    }
}
