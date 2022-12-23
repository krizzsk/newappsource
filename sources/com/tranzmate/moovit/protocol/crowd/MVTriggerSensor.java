package com.tranzmate.moovit.protocol.crowd;

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

public class MVTriggerSensor implements TBase<MVTriggerSensor, _Fields>, Serializable, Cloneable, Comparable<MVTriggerSensor> {

    /* renamed from: b */
    public static final C25113c f25451b = new C25113c("triggerType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25452c = new C25113c("customData", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f25453d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25454e;
    public String customData;
    public MVTriggerType triggerType;

    public enum _Fields implements C25085c {
        TRIGGER_TYPE(1, "triggerType"),
        CUSTOM_DATA(2, "customData");
        
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
            if (i != 2) {
                return null;
            }
            return CUSTOM_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVTriggerSensor$a */
    public static class C8607a extends C25239c<MVTriggerSensor> {
        public C8607a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTriggerSensor mVTriggerSensor = (MVTriggerSensor) tBase;
            mVTriggerSensor.getClass();
            C25113c cVar = MVTriggerSensor.f25451b;
            gVar.mo61687K();
            if (mVTriggerSensor.triggerType != null) {
                gVar.mo61711x(MVTriggerSensor.f25451b);
                gVar.mo61678B(mVTriggerSensor.triggerType.getValue());
                gVar.mo61712y();
            }
            if (mVTriggerSensor.customData != null) {
                gVar.mo61711x(MVTriggerSensor.f25452c);
                gVar.mo61686J(mVTriggerSensor.customData);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTriggerSensor mVTriggerSensor = (MVTriggerSensor) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTriggerSensor.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTriggerSensor.customData = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTriggerSensor.triggerType = MVTriggerType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVTriggerSensor$b */
    public static class C8608b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8607a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVTriggerSensor$c */
    public static class C8609c extends C25240d<MVTriggerSensor> {
        public C8609c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTriggerSensor mVTriggerSensor = (MVTriggerSensor) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTriggerSensor.mo26913g()) {
                bitSet.set(0);
            }
            if (mVTriggerSensor.mo26912f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTriggerSensor.mo26913g()) {
                jVar.mo61678B(mVTriggerSensor.triggerType.getValue());
            }
            if (mVTriggerSensor.mo26912f()) {
                jVar.mo61686J(mVTriggerSensor.customData);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTriggerSensor mVTriggerSensor = (MVTriggerSensor) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTriggerSensor.triggerType = MVTriggerType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVTriggerSensor.customData = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVTriggerSensor$d */
    public static class C8610d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8609c(0);
        }
    }

    static {
        new C17394d0("MVTriggerSensor");
        HashMap hashMap = new HashMap();
        f25453d = hashMap;
        hashMap.put(C25239c.class, new C8608b());
        hashMap.put(C25240d.class, new C8610d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TRIGGER_TYPE, new FieldMetaData("triggerType", (byte) 3, new EnumMetaData(MVTriggerType.class)));
        enumMap.put(_Fields.CUSTOM_DATA, new FieldMetaData("customData", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25454e = unmodifiableMap;
        FieldMetaData.m61947a(MVTriggerSensor.class, unmodifiableMap);
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
        ((C25238b) f25453d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25453d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTriggerSensor mVTriggerSensor = (MVTriggerSensor) obj;
        if (!getClass().equals(mVTriggerSensor.getClass())) {
            return getClass().getName().compareTo(mVTriggerSensor.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26913g()).compareTo(Boolean.valueOf(mVTriggerSensor.mo26913g()));
        if (compareTo2 != 0 || ((mo26913g() && (compareTo2 = this.triggerType.compareTo(mVTriggerSensor.triggerType)) != 0) || (compareTo2 = Boolean.valueOf(mo26912f()).compareTo(Boolean.valueOf(mVTriggerSensor.mo26912f()))) != 0)) {
            return compareTo2;
        }
        if (!mo26912f() || (compareTo = this.customData.compareTo(mVTriggerSensor.customData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTriggerSensor)) {
            return false;
        }
        MVTriggerSensor mVTriggerSensor = (MVTriggerSensor) obj;
        boolean g = mo26913g();
        boolean g2 = mVTriggerSensor.mo26913g();
        if ((g || g2) && (!g || !g2 || !this.triggerType.equals(mVTriggerSensor.triggerType))) {
            return false;
        }
        boolean f = mo26912f();
        boolean f2 = mVTriggerSensor.mo26912f();
        if ((f || f2) && (!f || !f2 || !this.customData.equals(mVTriggerSensor.customData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26912f() {
        return this.customData != null;
    }

    /* renamed from: g */
    public final boolean mo26913g() {
        return this.triggerType != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTriggerSensor(", "triggerType:");
        MVTriggerType mVTriggerType = this.triggerType;
        if (mVTriggerType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTriggerType);
        }
        n.append(", ");
        n.append("customData:");
        String str = this.customData;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
