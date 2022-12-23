package com.tranzmate.moovit.protocol.carpool;

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

public class MVCarPoolDidntBookAnswer implements TBase<MVCarPoolDidntBookAnswer, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolDidntBookAnswer> {

    /* renamed from: b */
    public static final C25113c f24634b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24635c = new C25113c("surveyText", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f24636d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24637e;
    private byte __isset_bitfield = 0;
    public int rideId;
    public String surveyText;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        SURVEY_TEXT(2, "surveyText");
        
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
                return RIDE_ID;
            }
            if (i != 2) {
                return null;
            }
            return SURVEY_TEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolDidntBookAnswer$a */
    public static class C8165a extends C25239c<MVCarPoolDidntBookAnswer> {
        public C8165a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDidntBookAnswer mVCarPoolDidntBookAnswer = (MVCarPoolDidntBookAnswer) tBase;
            mVCarPoolDidntBookAnswer.getClass();
            C25113c cVar = MVCarPoolDidntBookAnswer.f24634b;
            gVar.mo61687K();
            gVar.mo61711x(MVCarPoolDidntBookAnswer.f24634b);
            gVar.mo61678B(mVCarPoolDidntBookAnswer.rideId);
            gVar.mo61712y();
            if (mVCarPoolDidntBookAnswer.surveyText != null) {
                gVar.mo61711x(MVCarPoolDidntBookAnswer.f24635c);
                gVar.mo61686J(mVCarPoolDidntBookAnswer.surveyText);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDidntBookAnswer mVCarPoolDidntBookAnswer = (MVCarPoolDidntBookAnswer) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarPoolDidntBookAnswer.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVCarPoolDidntBookAnswer.surveyText = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVCarPoolDidntBookAnswer.rideId = gVar.mo61696i();
                    mVCarPoolDidntBookAnswer.mo25457h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolDidntBookAnswer$b */
    public static class C8166b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8165a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolDidntBookAnswer$c */
    public static class C8167c extends C25240d<MVCarPoolDidntBookAnswer> {
        public C8167c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDidntBookAnswer mVCarPoolDidntBookAnswer = (MVCarPoolDidntBookAnswer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolDidntBookAnswer.mo25455f()) {
                bitSet.set(0);
            }
            if (mVCarPoolDidntBookAnswer.mo25456g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCarPoolDidntBookAnswer.mo25455f()) {
                jVar.mo61678B(mVCarPoolDidntBookAnswer.rideId);
            }
            if (mVCarPoolDidntBookAnswer.mo25456g()) {
                jVar.mo61686J(mVCarPoolDidntBookAnswer.surveyText);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDidntBookAnswer mVCarPoolDidntBookAnswer = (MVCarPoolDidntBookAnswer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVCarPoolDidntBookAnswer.rideId = jVar.mo61696i();
                mVCarPoolDidntBookAnswer.mo25457h();
            }
            if (T.get(1)) {
                mVCarPoolDidntBookAnswer.surveyText = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCarPoolDidntBookAnswer$d */
    public static class C8168d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8167c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolDidntBookAnswer");
        HashMap hashMap = new HashMap();
        f24636d = hashMap;
        hashMap.put(C25239c.class, new C8166b());
        hashMap.put(C25240d.class, new C8168d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SURVEY_TEXT, new FieldMetaData("surveyText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24637e = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolDidntBookAnswer.class, unmodifiableMap);
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
        ((C25238b) f24636d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24636d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCarPoolDidntBookAnswer mVCarPoolDidntBookAnswer = (MVCarPoolDidntBookAnswer) obj;
        if (!getClass().equals(mVCarPoolDidntBookAnswer.getClass())) {
            return getClass().getName().compareTo(mVCarPoolDidntBookAnswer.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25455f()).compareTo(Boolean.valueOf(mVCarPoolDidntBookAnswer.mo25455f()));
        if (compareTo2 != 0 || ((mo25455f() && (compareTo2 = C25082a.m62839c(this.rideId, mVCarPoolDidntBookAnswer.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo25456g()).compareTo(Boolean.valueOf(mVCarPoolDidntBookAnswer.mo25456g()))) != 0)) {
            return compareTo2;
        }
        if (!mo25456g() || (compareTo = this.surveyText.compareTo(mVCarPoolDidntBookAnswer.surveyText)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCarPoolDidntBookAnswer)) {
            return false;
        }
        MVCarPoolDidntBookAnswer mVCarPoolDidntBookAnswer = (MVCarPoolDidntBookAnswer) obj;
        if (this.rideId != mVCarPoolDidntBookAnswer.rideId) {
            return false;
        }
        boolean g = mo25456g();
        boolean g2 = mVCarPoolDidntBookAnswer.mo25456g();
        if ((g || g2) && (!g || !g2 || !this.surveyText.equals(mVCarPoolDidntBookAnswer.surveyText))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25455f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25456g() {
        return this.surveyText != null;
    }

    /* renamed from: h */
    public final void mo25457h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarPoolDidntBookAnswer(", "rideId:");
        C0016g.m42z(n, this.rideId, ", ", "surveyText:");
        String str = this.surveyText;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
