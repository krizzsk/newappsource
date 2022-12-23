package com.tranzmate.moovit.protocol.crowd;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.datacollection.MVSensorType;
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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVSensorData implements TBase<MVSensorData, _Fields>, Serializable, Cloneable, Comparable<MVSensorData> {

    /* renamed from: b */
    public static final C25113c f25410b = new C25113c("triggerType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25411c = new C25113c("startProcess", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25412d = new C25113c("sensorType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25413e = new C25113c("clientSampleTime", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f25414f = new C25113c(LinksConfiguration.KEY_VALUES, (byte) 15, 5);

    /* renamed from: g */
    public static final HashMap f25415g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25416h;
    private byte __isset_bitfield = 0;
    public long clientSampleTime;
    public MVSensorType sensorType;
    public long startProcess;
    public MVTriggerType triggerType;
    public List<MVSensorMetaData> values;

    public enum _Fields implements C25085c {
        TRIGGER_TYPE(1, "triggerType"),
        START_PROCESS(2, "startProcess"),
        SENSOR_TYPE(3, "sensorType"),
        CLIENT_SAMPLE_TIME(4, "clientSampleTime"),
        VALUES(5, LinksConfiguration.KEY_VALUES);
        
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
                return TRIGGER_TYPE;
            }
            if (i == 2) {
                return START_PROCESS;
            }
            if (i == 3) {
                return SENSOR_TYPE;
            }
            if (i == 4) {
                return CLIENT_SAMPLE_TIME;
            }
            if (i != 5) {
                return null;
            }
            return VALUES;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVSensorData$a */
    public static class C8594a extends C25239c<MVSensorData> {
        public C8594a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSensorData mVSensorData = (MVSensorData) tBase;
            mVSensorData.getClass();
            C25113c cVar = MVSensorData.f25410b;
            gVar.mo61687K();
            if (mVSensorData.triggerType != null) {
                gVar.mo61711x(MVSensorData.f25410b);
                gVar.mo61678B(mVSensorData.triggerType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSensorData.f25411c);
            gVar.mo61679C(mVSensorData.startProcess);
            gVar.mo61712y();
            if (mVSensorData.sensorType != null) {
                gVar.mo61711x(MVSensorData.f25412d);
                gVar.mo61678B(mVSensorData.sensorType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSensorData.f25413e);
            gVar.mo61679C(mVSensorData.clientSampleTime);
            gVar.mo61712y();
            if (mVSensorData.values != null) {
                gVar.mo61711x(MVSensorData.f25414f);
                gVar.mo61680D(new C25119e((byte) 12, mVSensorData.values.size()));
                for (MVSensorMetaData X0 : mVSensorData.values) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSensorData mVSensorData = (MVSensorData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSensorData.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 15) {
                                    C25119e k = gVar.mo61698k();
                                    mVSensorData.values = new ArrayList(k.f63395b);
                                    for (int i = 0; i < k.f63395b; i++) {
                                        MVSensorMetaData mVSensorMetaData = new MVSensorMetaData();
                                        mVSensorMetaData.mo25201C1(gVar);
                                        mVSensorData.values.add(mVSensorMetaData);
                                    }
                                    gVar.mo61699l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 10) {
                                mVSensorData.clientSampleTime = gVar.mo61697j();
                                mVSensorData.mo26879k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVSensorData.sensorType = MVSensorType.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVSensorData.startProcess = gVar.mo61697j();
                        mVSensorData.mo26880l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSensorData.triggerType = MVTriggerType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVSensorData$b */
    public static class C8595b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8594a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVSensorData$c */
    public static class C8596c extends C25240d<MVSensorData> {
        public C8596c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSensorData mVSensorData = (MVSensorData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSensorData.mo26877i()) {
                bitSet.set(0);
            }
            if (mVSensorData.mo26875h()) {
                bitSet.set(1);
            }
            if (mVSensorData.mo26874g()) {
                bitSet.set(2);
            }
            if (mVSensorData.mo26873f()) {
                bitSet.set(3);
            }
            if (mVSensorData.mo26878j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVSensorData.mo26877i()) {
                jVar.mo61678B(mVSensorData.triggerType.getValue());
            }
            if (mVSensorData.mo26875h()) {
                jVar.mo61679C(mVSensorData.startProcess);
            }
            if (mVSensorData.mo26874g()) {
                jVar.mo61678B(mVSensorData.sensorType.getValue());
            }
            if (mVSensorData.mo26873f()) {
                jVar.mo61679C(mVSensorData.clientSampleTime);
            }
            if (mVSensorData.mo26878j()) {
                jVar.mo61678B(mVSensorData.values.size());
                for (MVSensorMetaData X0 : mVSensorData.values) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSensorData mVSensorData = (MVSensorData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVSensorData.triggerType = MVTriggerType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVSensorData.startProcess = jVar.mo61697j();
                mVSensorData.mo26880l();
            }
            if (T.get(2)) {
                mVSensorData.sensorType = MVSensorType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVSensorData.clientSampleTime = jVar.mo61697j();
                mVSensorData.mo26879k();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVSensorData.values = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSensorMetaData mVSensorMetaData = new MVSensorMetaData();
                    mVSensorMetaData.mo25201C1(jVar);
                    mVSensorData.values.add(mVSensorMetaData);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVSensorData$d */
    public static class C8597d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8596c(0);
        }
    }

    static {
        new C17394d0("MVSensorData");
        HashMap hashMap = new HashMap();
        f25415g = hashMap;
        hashMap.put(C25239c.class, new C8595b());
        hashMap.put(C25240d.class, new C8597d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIGGER_TYPE, new FieldMetaData("triggerType", (byte) 3, new EnumMetaData(MVTriggerType.class)));
        enumMap.put(_Fields.START_PROCESS, new FieldMetaData("startProcess", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.SENSOR_TYPE, new FieldMetaData("sensorType", (byte) 3, new EnumMetaData(MVSensorType.class)));
        enumMap.put(_Fields.CLIENT_SAMPLE_TIME, new FieldMetaData("clientSampleTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.VALUES, new FieldMetaData(LinksConfiguration.KEY_VALUES, (byte) 3, new ListMetaData(new StructMetaData(MVSensorMetaData.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25416h = unmodifiableMap;
        FieldMetaData.m61947a(MVSensorData.class, unmodifiableMap);
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
        ((C25238b) f25415g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25415g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVSensorData mVSensorData = (MVSensorData) obj;
        if (!getClass().equals(mVSensorData.getClass())) {
            return getClass().getName().compareTo(mVSensorData.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26877i()).compareTo(Boolean.valueOf(mVSensorData.mo26877i()));
        if (compareTo != 0 || ((mo26877i() && (compareTo = this.triggerType.compareTo(mVSensorData.triggerType)) != 0) || (compareTo = Boolean.valueOf(mo26875h()).compareTo(Boolean.valueOf(mVSensorData.mo26875h()))) != 0 || ((mo26875h() && (compareTo = C25082a.m62840d(this.startProcess, mVSensorData.startProcess)) != 0) || (compareTo = Boolean.valueOf(mo26874g()).compareTo(Boolean.valueOf(mVSensorData.mo26874g()))) != 0 || ((mo26874g() && (compareTo = this.sensorType.compareTo(mVSensorData.sensorType)) != 0) || (compareTo = Boolean.valueOf(mo26873f()).compareTo(Boolean.valueOf(mVSensorData.mo26873f()))) != 0 || ((mo26873f() && (compareTo = C25082a.m62840d(this.clientSampleTime, mVSensorData.clientSampleTime)) != 0) || (compareTo = Boolean.valueOf(mo26878j()).compareTo(Boolean.valueOf(mVSensorData.mo26878j()))) != 0))))) {
            return compareTo;
        }
        if (!mo26878j() || (h = C25082a.m62844h(this.values, mVSensorData.values)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSensorData)) {
            return false;
        }
        MVSensorData mVSensorData = (MVSensorData) obj;
        boolean i = mo26877i();
        boolean i2 = mVSensorData.mo26877i();
        if (((i || i2) && (!i || !i2 || !this.triggerType.equals(mVSensorData.triggerType))) || this.startProcess != mVSensorData.startProcess) {
            return false;
        }
        boolean g = mo26874g();
        boolean g2 = mVSensorData.mo26874g();
        if (((g || g2) && (!g || !g2 || !this.sensorType.equals(mVSensorData.sensorType))) || this.clientSampleTime != mVSensorData.clientSampleTime) {
            return false;
        }
        boolean j = mo26878j();
        boolean j2 = mVSensorData.mo26878j();
        if ((j || j2) && (!j || !j2 || !this.values.equals(mVSensorData.values))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26873f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo26874g() {
        return this.sensorType != null;
    }

    /* renamed from: h */
    public final boolean mo26875h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26877i() {
        return this.triggerType != null;
    }

    /* renamed from: j */
    public final boolean mo26878j() {
        return this.values != null;
    }

    /* renamed from: k */
    public final void mo26879k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo26880l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSensorData(", "triggerType:");
        MVTriggerType mVTriggerType = this.triggerType;
        if (mVTriggerType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTriggerType);
        }
        n.append(", ");
        n.append("startProcess:");
        C25541a.m63889t(n, this.startProcess, ", ", "sensorType:");
        MVSensorType mVSensorType = this.sensorType;
        if (mVSensorType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSensorType);
        }
        n.append(", ");
        n.append("clientSampleTime:");
        C25541a.m63889t(n, this.clientSampleTime, ", ", "values:");
        List<MVSensorMetaData> list = this.values;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
