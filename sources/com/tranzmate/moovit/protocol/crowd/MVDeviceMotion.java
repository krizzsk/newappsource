package com.tranzmate.moovit.protocol.crowd;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVVector;
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

public class MVDeviceMotion implements TBase<MVDeviceMotion, _Fields>, Serializable, Cloneable, Comparable<MVDeviceMotion> {

    /* renamed from: b */
    public static final C25113c f25382b = new C25113c("timestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25383c = new C25113c("gravity", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f25384d = new C25113c("userAcceleration", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f25385e = new C25113c("attitude", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f25386f = new C25113c("rotationRate", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f25387g = new C25113c("magneticField", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f25388h = new C25113c("magneticFieldAccuracy", (byte) 8, 7);

    /* renamed from: i */
    public static final HashMap f25389i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f25390j;
    private byte __isset_bitfield = 0;
    public MVVector attitude;
    public MVVector gravity;
    public MVVector magneticField;
    public int magneticFieldAccuracy;
    public MVVector rotationRate;
    public long timestamp;
    public MVVector userAcceleration;

    public enum _Fields implements C25085c {
        TIMESTAMP(1, "timestamp"),
        GRAVITY(2, "gravity"),
        USER_ACCELERATION(3, "userAcceleration"),
        ATTITUDE(4, "attitude"),
        ROTATION_RATE(5, "rotationRate"),
        MAGNETIC_FIELD(6, "magneticField"),
        MAGNETIC_FIELD_ACCURACY(7, "magneticFieldAccuracy");
        
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
                    return TIMESTAMP;
                case 2:
                    return GRAVITY;
                case 3:
                    return USER_ACCELERATION;
                case 4:
                    return ATTITUDE;
                case 5:
                    return ROTATION_RATE;
                case 6:
                    return MAGNETIC_FIELD;
                case 7:
                    return MAGNETIC_FIELD_ACCURACY;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceMotion$a */
    public static class C8574a extends C25239c<MVDeviceMotion> {
        public C8574a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeviceMotion mVDeviceMotion = (MVDeviceMotion) tBase;
            mVDeviceMotion.mo26831p();
            C25113c cVar = MVDeviceMotion.f25382b;
            gVar.mo61687K();
            gVar.mo61711x(MVDeviceMotion.f25382b);
            gVar.mo61679C(mVDeviceMotion.timestamp);
            gVar.mo61712y();
            if (mVDeviceMotion.gravity != null) {
                gVar.mo61711x(MVDeviceMotion.f25383c);
                mVDeviceMotion.gravity.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDeviceMotion.userAcceleration != null) {
                gVar.mo61711x(MVDeviceMotion.f25384d);
                mVDeviceMotion.userAcceleration.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDeviceMotion.attitude != null) {
                gVar.mo61711x(MVDeviceMotion.f25385e);
                mVDeviceMotion.attitude.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDeviceMotion.rotationRate != null) {
                gVar.mo61711x(MVDeviceMotion.f25386f);
                mVDeviceMotion.rotationRate.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDeviceMotion.magneticField != null) {
                gVar.mo61711x(MVDeviceMotion.f25387g);
                mVDeviceMotion.magneticField.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDeviceMotion.f25388h);
            C16530d.m42020n(gVar, mVDeviceMotion.magneticFieldAccuracy);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeviceMotion mVDeviceMotion = (MVDeviceMotion) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDeviceMotion.mo26831p();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDeviceMotion.timestamp = gVar.mo61697j();
                            mVDeviceMotion.mo26830o();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVVector mVVector = new MVVector();
                            mVDeviceMotion.gravity = mVVector;
                            mVVector.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVVector mVVector2 = new MVVector();
                            mVDeviceMotion.userAcceleration = mVVector2;
                            mVVector2.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVVector mVVector3 = new MVVector();
                            mVDeviceMotion.attitude = mVVector3;
                            mVVector3.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVVector mVVector4 = new MVVector();
                            mVDeviceMotion.rotationRate = mVVector4;
                            mVVector4.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVVector mVVector5 = new MVVector();
                            mVDeviceMotion.magneticField = mVVector5;
                            mVVector5.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVDeviceMotion.magneticFieldAccuracy = gVar.mo61696i();
                            mVDeviceMotion.mo26829m();
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceMotion$b */
    public static class C8575b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8574a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceMotion$c */
    public static class C8576c extends C25240d<MVDeviceMotion> {
        public C8576c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDeviceMotion mVDeviceMotion = (MVDeviceMotion) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDeviceMotion.mo26827k()) {
                bitSet.set(0);
            }
            if (mVDeviceMotion.mo26822g()) {
                bitSet.set(1);
            }
            if (mVDeviceMotion.mo26828l()) {
                bitSet.set(2);
            }
            if (mVDeviceMotion.mo26821f()) {
                bitSet.set(3);
            }
            if (mVDeviceMotion.mo26826j()) {
                bitSet.set(4);
            }
            if (mVDeviceMotion.mo26823h()) {
                bitSet.set(5);
            }
            if (mVDeviceMotion.mo26825i()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVDeviceMotion.mo26827k()) {
                jVar.mo61679C(mVDeviceMotion.timestamp);
            }
            if (mVDeviceMotion.mo26822g()) {
                mVDeviceMotion.gravity.mo25202X0(jVar);
            }
            if (mVDeviceMotion.mo26828l()) {
                mVDeviceMotion.userAcceleration.mo25202X0(jVar);
            }
            if (mVDeviceMotion.mo26821f()) {
                mVDeviceMotion.attitude.mo25202X0(jVar);
            }
            if (mVDeviceMotion.mo26826j()) {
                mVDeviceMotion.rotationRate.mo25202X0(jVar);
            }
            if (mVDeviceMotion.mo26823h()) {
                mVDeviceMotion.magneticField.mo25202X0(jVar);
            }
            if (mVDeviceMotion.mo26825i()) {
                jVar.mo61678B(mVDeviceMotion.magneticFieldAccuracy);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDeviceMotion mVDeviceMotion = (MVDeviceMotion) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVDeviceMotion.timestamp = jVar.mo61697j();
                mVDeviceMotion.mo26830o();
            }
            if (T.get(1)) {
                MVVector mVVector = new MVVector();
                mVDeviceMotion.gravity = mVVector;
                mVVector.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVVector mVVector2 = new MVVector();
                mVDeviceMotion.userAcceleration = mVVector2;
                mVVector2.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVVector mVVector3 = new MVVector();
                mVDeviceMotion.attitude = mVVector3;
                mVVector3.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVVector mVVector4 = new MVVector();
                mVDeviceMotion.rotationRate = mVVector4;
                mVVector4.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVVector mVVector5 = new MVVector();
                mVDeviceMotion.magneticField = mVVector5;
                mVVector5.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVDeviceMotion.magneticFieldAccuracy = jVar.mo61696i();
                mVDeviceMotion.mo26829m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVDeviceMotion$d */
    public static class C8577d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8576c(0);
        }
    }

    static {
        new C17394d0("MVDeviceMotion");
        HashMap hashMap = new HashMap();
        f25389i = hashMap;
        hashMap.put(C25239c.class, new C8575b());
        hashMap.put(C25240d.class, new C8577d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.GRAVITY, new FieldMetaData("gravity", (byte) 3, new StructMetaData(MVVector.class)));
        enumMap.put(_Fields.USER_ACCELERATION, new FieldMetaData("userAcceleration", (byte) 3, new StructMetaData(MVVector.class)));
        enumMap.put(_Fields.ATTITUDE, new FieldMetaData("attitude", (byte) 3, new StructMetaData(MVVector.class)));
        enumMap.put(_Fields.ROTATION_RATE, new FieldMetaData("rotationRate", (byte) 3, new StructMetaData(MVVector.class)));
        enumMap.put(_Fields.MAGNETIC_FIELD, new FieldMetaData("magneticField", (byte) 3, new StructMetaData(MVVector.class)));
        enumMap.put(_Fields.MAGNETIC_FIELD_ACCURACY, new FieldMetaData("magneticFieldAccuracy", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25390j = unmodifiableMap;
        FieldMetaData.m61947a(MVDeviceMotion.class, unmodifiableMap);
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
        ((C25238b) f25389i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25389i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVDeviceMotion mVDeviceMotion = (MVDeviceMotion) obj;
        if (!getClass().equals(mVDeviceMotion.getClass())) {
            return getClass().getName().compareTo(mVDeviceMotion.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26827k()).compareTo(Boolean.valueOf(mVDeviceMotion.mo26827k()));
        if (compareTo != 0 || ((mo26827k() && (compareTo = C25082a.m62840d(this.timestamp, mVDeviceMotion.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo26822g()).compareTo(Boolean.valueOf(mVDeviceMotion.mo26822g()))) != 0 || ((mo26822g() && (compareTo = this.gravity.compareTo(mVDeviceMotion.gravity)) != 0) || (compareTo = Boolean.valueOf(mo26828l()).compareTo(Boolean.valueOf(mVDeviceMotion.mo26828l()))) != 0 || ((mo26828l() && (compareTo = this.userAcceleration.compareTo(mVDeviceMotion.userAcceleration)) != 0) || (compareTo = Boolean.valueOf(mo26821f()).compareTo(Boolean.valueOf(mVDeviceMotion.mo26821f()))) != 0 || ((mo26821f() && (compareTo = this.attitude.compareTo(mVDeviceMotion.attitude)) != 0) || (compareTo = Boolean.valueOf(mo26826j()).compareTo(Boolean.valueOf(mVDeviceMotion.mo26826j()))) != 0 || ((mo26826j() && (compareTo = this.rotationRate.compareTo(mVDeviceMotion.rotationRate)) != 0) || (compareTo = Boolean.valueOf(mo26823h()).compareTo(Boolean.valueOf(mVDeviceMotion.mo26823h()))) != 0 || ((mo26823h() && (compareTo = this.magneticField.compareTo(mVDeviceMotion.magneticField)) != 0) || (compareTo = Boolean.valueOf(mo26825i()).compareTo(Boolean.valueOf(mVDeviceMotion.mo26825i()))) != 0))))))) {
            return compareTo;
        }
        if (!mo26825i() || (c = C25082a.m62839c(this.magneticFieldAccuracy, mVDeviceMotion.magneticFieldAccuracy)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDeviceMotion)) {
            return false;
        }
        MVDeviceMotion mVDeviceMotion = (MVDeviceMotion) obj;
        if (this.timestamp != mVDeviceMotion.timestamp) {
            return false;
        }
        boolean g = mo26822g();
        boolean g2 = mVDeviceMotion.mo26822g();
        if ((g || g2) && (!g || !g2 || !this.gravity.mo26441a(mVDeviceMotion.gravity))) {
            return false;
        }
        boolean l = mo26828l();
        boolean l2 = mVDeviceMotion.mo26828l();
        if ((l || l2) && (!l || !l2 || !this.userAcceleration.mo26441a(mVDeviceMotion.userAcceleration))) {
            return false;
        }
        boolean f = mo26821f();
        boolean f2 = mVDeviceMotion.mo26821f();
        if ((f || f2) && (!f || !f2 || !this.attitude.mo26441a(mVDeviceMotion.attitude))) {
            return false;
        }
        boolean j = mo26826j();
        boolean j2 = mVDeviceMotion.mo26826j();
        if ((j || j2) && (!j || !j2 || !this.rotationRate.mo26441a(mVDeviceMotion.rotationRate))) {
            return false;
        }
        boolean h = mo26823h();
        boolean h2 = mVDeviceMotion.mo26823h();
        if (((h || h2) && (!h || !h2 || !this.magneticField.mo26441a(mVDeviceMotion.magneticField))) || this.magneticFieldAccuracy != mVDeviceMotion.magneticFieldAccuracy) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26821f() {
        return this.attitude != null;
    }

    /* renamed from: g */
    public final boolean mo26822g() {
        return this.gravity != null;
    }

    /* renamed from: h */
    public final boolean mo26823h() {
        return this.magneticField != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26825i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo26826j() {
        return this.rotationRate != null;
    }

    /* renamed from: k */
    public final boolean mo26827k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final boolean mo26828l() {
        return this.userAcceleration != null;
    }

    /* renamed from: m */
    public final void mo26829m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo26830o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo26831p() throws TException {
        MVVector mVVector = this.gravity;
        if (mVVector != null) {
            mVVector.getClass();
        }
        MVVector mVVector2 = this.userAcceleration;
        if (mVVector2 != null) {
            mVVector2.getClass();
        }
        MVVector mVVector3 = this.attitude;
        if (mVVector3 != null) {
            mVVector3.getClass();
        }
        MVVector mVVector4 = this.rotationRate;
        if (mVVector4 != null) {
            mVVector4.getClass();
        }
        MVVector mVVector5 = this.magneticField;
        if (mVVector5 != null) {
            mVVector5.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDeviceMotion(", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "gravity:");
        MVVector mVVector = this.gravity;
        if (mVVector == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVector);
        }
        n.append(", ");
        n.append("userAcceleration:");
        MVVector mVVector2 = this.userAcceleration;
        if (mVVector2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVector2);
        }
        n.append(", ");
        n.append("attitude:");
        MVVector mVVector3 = this.attitude;
        if (mVVector3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVector3);
        }
        n.append(", ");
        n.append("rotationRate:");
        MVVector mVVector4 = this.rotationRate;
        if (mVVector4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVector4);
        }
        n.append(", ");
        n.append("magneticField:");
        MVVector mVVector5 = this.magneticField;
        if (mVVector5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVector5);
        }
        n.append(", ");
        n.append("magneticFieldAccuracy:");
        return C13437d.m33707l(n, this.magneticFieldAccuracy, ")");
    }
}
