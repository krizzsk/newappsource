package com.tranzmate.moovit.protocol.crowd;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.datacollection.MVDCActivityRecognitionType;
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

public class MVActivityTransitionRecognition implements TBase<MVActivityTransitionRecognition, _Fields>, Serializable, Cloneable, Comparable<MVActivityTransitionRecognition> {

    /* renamed from: b */
    public static final C25113c f25312b = new C25113c("startTime", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25313c = new C25113c("type", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25314d = new C25113c("transitionType", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f25315e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25316f;
    private byte __isset_bitfield = 0;
    public long startTime;
    public int transitionType;
    public MVDCActivityRecognitionType type;

    public enum _Fields implements C25085c {
        START_TIME(1, "startTime"),
        TYPE(2, "type"),
        TRANSITION_TYPE(3, "transitionType");
        
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
                return START_TIME;
            }
            if (i == 2) {
                return TYPE;
            }
            if (i != 3) {
                return null;
            }
            return TRANSITION_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVActivityTransitionRecognition$a */
    public static class C8529a extends C25239c<MVActivityTransitionRecognition> {
        public C8529a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVActivityTransitionRecognition mVActivityTransitionRecognition = (MVActivityTransitionRecognition) tBase;
            mVActivityTransitionRecognition.getClass();
            C25113c cVar = MVActivityTransitionRecognition.f25312b;
            gVar.mo61687K();
            gVar.mo61711x(MVActivityTransitionRecognition.f25312b);
            gVar.mo61679C(mVActivityTransitionRecognition.startTime);
            gVar.mo61712y();
            if (mVActivityTransitionRecognition.type != null) {
                gVar.mo61711x(MVActivityTransitionRecognition.f25313c);
                gVar.mo61678B(mVActivityTransitionRecognition.type.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVActivityTransitionRecognition.f25314d);
            C16530d.m42020n(gVar, mVActivityTransitionRecognition.transitionType);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVActivityTransitionRecognition mVActivityTransitionRecognition = (MVActivityTransitionRecognition) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVActivityTransitionRecognition.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVActivityTransitionRecognition.transitionType = gVar.mo61696i();
                            mVActivityTransitionRecognition.mo26701j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVActivityTransitionRecognition.type = MVDCActivityRecognitionType.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVActivityTransitionRecognition.startTime = gVar.mo61697j();
                    mVActivityTransitionRecognition.mo26700i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVActivityTransitionRecognition$b */
    public static class C8530b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8529a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVActivityTransitionRecognition$c */
    public static class C8531c extends C25240d<MVActivityTransitionRecognition> {
        public C8531c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVActivityTransitionRecognition mVActivityTransitionRecognition = (MVActivityTransitionRecognition) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVActivityTransitionRecognition.mo26696f()) {
                bitSet.set(0);
            }
            if (mVActivityTransitionRecognition.mo26698h()) {
                bitSet.set(1);
            }
            if (mVActivityTransitionRecognition.mo26697g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVActivityTransitionRecognition.mo26696f()) {
                jVar.mo61679C(mVActivityTransitionRecognition.startTime);
            }
            if (mVActivityTransitionRecognition.mo26698h()) {
                jVar.mo61678B(mVActivityTransitionRecognition.type.getValue());
            }
            if (mVActivityTransitionRecognition.mo26697g()) {
                jVar.mo61678B(mVActivityTransitionRecognition.transitionType);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVActivityTransitionRecognition mVActivityTransitionRecognition = (MVActivityTransitionRecognition) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVActivityTransitionRecognition.startTime = jVar.mo61697j();
                mVActivityTransitionRecognition.mo26700i();
            }
            if (T.get(1)) {
                mVActivityTransitionRecognition.type = MVDCActivityRecognitionType.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVActivityTransitionRecognition.transitionType = jVar.mo61696i();
                mVActivityTransitionRecognition.mo26701j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVActivityTransitionRecognition$d */
    public static class C8532d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8531c(0);
        }
    }

    static {
        new C17394d0("MVActivityTransitionRecognition");
        HashMap hashMap = new HashMap();
        f25315e = hashMap;
        hashMap.put(C25239c.class, new C8530b());
        hashMap.put(C25240d.class, new C8532d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.START_TIME, new FieldMetaData("startTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVDCActivityRecognitionType.class)));
        enumMap.put(_Fields.TRANSITION_TYPE, new FieldMetaData("transitionType", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25316f = unmodifiableMap;
        FieldMetaData.m61947a(MVActivityTransitionRecognition.class, unmodifiableMap);
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
        ((C25238b) f25315e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25315e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVActivityTransitionRecognition mVActivityTransitionRecognition = (MVActivityTransitionRecognition) obj;
        if (!getClass().equals(mVActivityTransitionRecognition.getClass())) {
            return getClass().getName().compareTo(mVActivityTransitionRecognition.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26696f()).compareTo(Boolean.valueOf(mVActivityTransitionRecognition.mo26696f()));
        if (compareTo != 0 || ((mo26696f() && (compareTo = C25082a.m62840d(this.startTime, mVActivityTransitionRecognition.startTime)) != 0) || (compareTo = Boolean.valueOf(mo26698h()).compareTo(Boolean.valueOf(mVActivityTransitionRecognition.mo26698h()))) != 0 || ((mo26698h() && (compareTo = this.type.compareTo(mVActivityTransitionRecognition.type)) != 0) || (compareTo = Boolean.valueOf(mo26697g()).compareTo(Boolean.valueOf(mVActivityTransitionRecognition.mo26697g()))) != 0))) {
            return compareTo;
        }
        if (!mo26697g() || (c = C25082a.m62839c(this.transitionType, mVActivityTransitionRecognition.transitionType)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVActivityTransitionRecognition)) {
            return false;
        }
        MVActivityTransitionRecognition mVActivityTransitionRecognition = (MVActivityTransitionRecognition) obj;
        if (this.startTime != mVActivityTransitionRecognition.startTime) {
            return false;
        }
        boolean h = mo26698h();
        boolean h2 = mVActivityTransitionRecognition.mo26698h();
        if (((h || h2) && (!h || !h2 || !this.type.equals(mVActivityTransitionRecognition.type))) || this.transitionType != mVActivityTransitionRecognition.transitionType) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26696f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26697g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo26698h() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26700i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo26701j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVActivityTransitionRecognition(", "startTime:");
        C25541a.m63889t(n, this.startTime, ", ", "type:");
        MVDCActivityRecognitionType mVDCActivityRecognitionType = this.type;
        if (mVDCActivityRecognitionType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDCActivityRecognitionType);
        }
        n.append(", ");
        n.append("transitionType:");
        return C13437d.m33707l(n, this.transitionType, ")");
    }
}
