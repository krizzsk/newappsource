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

public class MVDCRecordingEnd implements TBase<MVDCRecordingEnd, _Fields>, Serializable, Cloneable, Comparable<MVDCRecordingEnd> {

    /* renamed from: b */
    public static final C25113c f25897b = new C25113c("triggerType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25898c = new C25113c("triggerId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25899d = new C25113c("sequenceId", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f25900e = new C25113c("timestamp", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f25901f = new C25113c("endState", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f25902g = new C25113c("metroId", (byte) 8, 6);

    /* renamed from: h */
    public static final HashMap f25903h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25904i;
    private byte __isset_bitfield = 0;
    public MVStopState endState;
    public int metroId;
    public long sequenceId;
    public long timestamp;
    public int triggerId;
    public MVTriggerType triggerType;

    public enum _Fields implements C25085c {
        TRIGGER_TYPE(1, "triggerType"),
        TRIGGER_ID(2, "triggerId"),
        SEQUENCE_ID(3, "sequenceId"),
        TIMESTAMP(4, "timestamp"),
        END_STATE(5, "endState"),
        METRO_ID(6, "metroId");
        
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
                    return END_STATE;
                case 6:
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCRecordingEnd$a */
    public static class C8895a extends C25239c<MVDCRecordingEnd> {
        public C8895a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDCRecordingEnd mVDCRecordingEnd = (MVDCRecordingEnd) tBase;
            mVDCRecordingEnd.getClass();
            C25113c cVar = MVDCRecordingEnd.f25897b;
            gVar.mo61687K();
            if (mVDCRecordingEnd.triggerType != null) {
                gVar.mo61711x(MVDCRecordingEnd.f25897b);
                gVar.mo61678B(mVDCRecordingEnd.triggerType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDCRecordingEnd.f25898c);
            gVar.mo61678B(mVDCRecordingEnd.triggerId);
            gVar.mo61712y();
            gVar.mo61711x(MVDCRecordingEnd.f25899d);
            gVar.mo61679C(mVDCRecordingEnd.sequenceId);
            gVar.mo61712y();
            gVar.mo61711x(MVDCRecordingEnd.f25900e);
            gVar.mo61679C(mVDCRecordingEnd.timestamp);
            gVar.mo61712y();
            if (mVDCRecordingEnd.endState != null) {
                gVar.mo61711x(MVDCRecordingEnd.f25901f);
                gVar.mo61678B(mVDCRecordingEnd.endState.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDCRecordingEnd.f25902g);
            C16530d.m42020n(gVar, mVDCRecordingEnd.metroId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDCRecordingEnd mVDCRecordingEnd = (MVDCRecordingEnd) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDCRecordingEnd.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingEnd.triggerType = MVTriggerType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingEnd.triggerId = gVar.mo61696i();
                            mVDCRecordingEnd.mo27703p();
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingEnd.sequenceId = gVar.mo61697j();
                            mVDCRecordingEnd.mo27701m();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingEnd.timestamp = gVar.mo61697j();
                            mVDCRecordingEnd.mo27702o();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingEnd.endState = MVStopState.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDCRecordingEnd.metroId = gVar.mo61696i();
                            mVDCRecordingEnd.mo27700l();
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCRecordingEnd$b */
    public static class C8896b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8895a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCRecordingEnd$c */
    public static class C8897c extends C25240d<MVDCRecordingEnd> {
        public C8897c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDCRecordingEnd mVDCRecordingEnd = (MVDCRecordingEnd) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDCRecordingEnd.mo27699k()) {
                bitSet.set(0);
            }
            if (mVDCRecordingEnd.mo27698j()) {
                bitSet.set(1);
            }
            if (mVDCRecordingEnd.mo27695h()) {
                bitSet.set(2);
            }
            if (mVDCRecordingEnd.mo27697i()) {
                bitSet.set(3);
            }
            if (mVDCRecordingEnd.mo27693f()) {
                bitSet.set(4);
            }
            if (mVDCRecordingEnd.mo27694g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVDCRecordingEnd.mo27699k()) {
                jVar.mo61678B(mVDCRecordingEnd.triggerType.getValue());
            }
            if (mVDCRecordingEnd.mo27698j()) {
                jVar.mo61678B(mVDCRecordingEnd.triggerId);
            }
            if (mVDCRecordingEnd.mo27695h()) {
                jVar.mo61679C(mVDCRecordingEnd.sequenceId);
            }
            if (mVDCRecordingEnd.mo27697i()) {
                jVar.mo61679C(mVDCRecordingEnd.timestamp);
            }
            if (mVDCRecordingEnd.mo27693f()) {
                jVar.mo61678B(mVDCRecordingEnd.endState.getValue());
            }
            if (mVDCRecordingEnd.mo27694g()) {
                jVar.mo61678B(mVDCRecordingEnd.metroId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDCRecordingEnd mVDCRecordingEnd = (MVDCRecordingEnd) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVDCRecordingEnd.triggerType = MVTriggerType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVDCRecordingEnd.triggerId = jVar.mo61696i();
                mVDCRecordingEnd.mo27703p();
            }
            if (T.get(2)) {
                mVDCRecordingEnd.sequenceId = jVar.mo61697j();
                mVDCRecordingEnd.mo27701m();
            }
            if (T.get(3)) {
                mVDCRecordingEnd.timestamp = jVar.mo61697j();
                mVDCRecordingEnd.mo27702o();
            }
            if (T.get(4)) {
                mVDCRecordingEnd.endState = MVStopState.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                mVDCRecordingEnd.metroId = jVar.mo61696i();
                mVDCRecordingEnd.mo27700l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVDCRecordingEnd$d */
    public static class C8898d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8897c(0);
        }
    }

    static {
        new C17394d0("MVDCRecordingEnd");
        HashMap hashMap = new HashMap();
        f25903h = hashMap;
        hashMap.put(C25239c.class, new C8896b());
        hashMap.put(C25240d.class, new C8898d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIGGER_TYPE, new FieldMetaData("triggerType", (byte) 3, new EnumMetaData(MVTriggerType.class)));
        enumMap.put(_Fields.TRIGGER_ID, new FieldMetaData("triggerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SEQUENCE_ID, new FieldMetaData("sequenceId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.END_STATE, new FieldMetaData("endState", (byte) 3, new EnumMetaData(MVStopState.class)));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25904i = unmodifiableMap;
        FieldMetaData.m61947a(MVDCRecordingEnd.class, unmodifiableMap);
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
        ((C25238b) f25903h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25903h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVDCRecordingEnd mVDCRecordingEnd = (MVDCRecordingEnd) obj;
        if (!getClass().equals(mVDCRecordingEnd.getClass())) {
            return getClass().getName().compareTo(mVDCRecordingEnd.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27699k()).compareTo(Boolean.valueOf(mVDCRecordingEnd.mo27699k()));
        if (compareTo != 0 || ((mo27699k() && (compareTo = this.triggerType.compareTo(mVDCRecordingEnd.triggerType)) != 0) || (compareTo = Boolean.valueOf(mo27698j()).compareTo(Boolean.valueOf(mVDCRecordingEnd.mo27698j()))) != 0 || ((mo27698j() && (compareTo = C25082a.m62839c(this.triggerId, mVDCRecordingEnd.triggerId)) != 0) || (compareTo = Boolean.valueOf(mo27695h()).compareTo(Boolean.valueOf(mVDCRecordingEnd.mo27695h()))) != 0 || ((mo27695h() && (compareTo = C25082a.m62840d(this.sequenceId, mVDCRecordingEnd.sequenceId)) != 0) || (compareTo = Boolean.valueOf(mo27697i()).compareTo(Boolean.valueOf(mVDCRecordingEnd.mo27697i()))) != 0 || ((mo27697i() && (compareTo = C25082a.m62840d(this.timestamp, mVDCRecordingEnd.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27693f()).compareTo(Boolean.valueOf(mVDCRecordingEnd.mo27693f()))) != 0 || ((mo27693f() && (compareTo = this.endState.compareTo(mVDCRecordingEnd.endState)) != 0) || (compareTo = Boolean.valueOf(mo27694g()).compareTo(Boolean.valueOf(mVDCRecordingEnd.mo27694g()))) != 0)))))) {
            return compareTo;
        }
        if (!mo27694g() || (c = C25082a.m62839c(this.metroId, mVDCRecordingEnd.metroId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDCRecordingEnd)) {
            return false;
        }
        MVDCRecordingEnd mVDCRecordingEnd = (MVDCRecordingEnd) obj;
        boolean k = mo27699k();
        boolean k2 = mVDCRecordingEnd.mo27699k();
        if (((k || k2) && (!k || !k2 || !this.triggerType.equals(mVDCRecordingEnd.triggerType))) || this.triggerId != mVDCRecordingEnd.triggerId || this.sequenceId != mVDCRecordingEnd.sequenceId || this.timestamp != mVDCRecordingEnd.timestamp) {
            return false;
        }
        boolean f = mo27693f();
        boolean f2 = mVDCRecordingEnd.mo27693f();
        if (((f || f2) && (!f || !f2 || !this.endState.equals(mVDCRecordingEnd.endState))) || this.metroId != mVDCRecordingEnd.metroId) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27693f() {
        return this.endState != null;
    }

    /* renamed from: g */
    public final boolean mo27694g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo27695h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27697i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo27698j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo27699k() {
        return this.triggerType != null;
    }

    /* renamed from: l */
    public final void mo27700l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: m */
    public final void mo27701m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo27702o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: p */
    public final void mo27703p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDCRecordingEnd(", "triggerType:");
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
        C25541a.m63889t(n, this.timestamp, ", ", "endState:");
        MVStopState mVStopState = this.endState;
        if (mVStopState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVStopState);
        }
        n.append(", ");
        n.append("metroId:");
        return C13437d.m33707l(n, this.metroId, ")");
    }
}
