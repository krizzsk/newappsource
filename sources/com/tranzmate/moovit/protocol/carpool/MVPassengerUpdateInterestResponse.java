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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVPassengerUpdateInterestResponse implements TBase<MVPassengerUpdateInterestResponse, _Fields>, Serializable, Cloneable, Comparable<MVPassengerUpdateInterestResponse> {

    /* renamed from: b */
    public static final C25113c f24835b = new C25113c("steps", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f24836c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f24837d;
    private _Fields[] optionals = {_Fields.STEPS};
    public MVCarpoolRegistrationSteps steps;

    public enum _Fields implements C25085c {
        STEPS(1, "steps");
        
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
            if (i != 1) {
                return null;
            }
            return STEPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestResponse$a */
    public static class C8287a extends C25239c<MVPassengerUpdateInterestResponse> {
        public C8287a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerUpdateInterestResponse mVPassengerUpdateInterestResponse = (MVPassengerUpdateInterestResponse) tBase;
            MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = mVPassengerUpdateInterestResponse.steps;
            C25113c cVar = MVPassengerUpdateInterestResponse.f24835b;
            gVar.mo61687K();
            if (mVPassengerUpdateInterestResponse.steps != null && mVPassengerUpdateInterestResponse.mo25826f()) {
                gVar.mo61711x(MVPassengerUpdateInterestResponse.f24835b);
                mVPassengerUpdateInterestResponse.steps.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerUpdateInterestResponse mVPassengerUpdateInterestResponse = (MVPassengerUpdateInterestResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = mVPassengerUpdateInterestResponse.steps;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps2 = new MVCarpoolRegistrationSteps();
                    mVPassengerUpdateInterestResponse.steps = mVCarpoolRegistrationSteps2;
                    mVCarpoolRegistrationSteps2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestResponse$b */
    public static class C8288b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8287a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestResponse$c */
    public static class C8289c extends C25240d<MVPassengerUpdateInterestResponse> {
        public C8289c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerUpdateInterestResponse mVPassengerUpdateInterestResponse = (MVPassengerUpdateInterestResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerUpdateInterestResponse.mo25826f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPassengerUpdateInterestResponse.mo25826f()) {
                mVPassengerUpdateInterestResponse.steps.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerUpdateInterestResponse mVPassengerUpdateInterestResponse = (MVPassengerUpdateInterestResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = new MVCarpoolRegistrationSteps();
                mVPassengerUpdateInterestResponse.steps = mVCarpoolRegistrationSteps;
                mVCarpoolRegistrationSteps.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerUpdateInterestResponse$d */
    public static class C8290d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8289c(0);
        }
    }

    static {
        new C17394d0("MVPassengerUpdateInterestResponse");
        HashMap hashMap = new HashMap();
        f24836c = hashMap;
        hashMap.put(C25239c.class, new C8288b());
        hashMap.put(C25240d.class, new C8290d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STEPS, new FieldMetaData("steps", (byte) 2, new StructMetaData(MVCarpoolRegistrationSteps.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24837d = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerUpdateInterestResponse.class, unmodifiableMap);
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
        ((C25238b) f24836c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24836c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerUpdateInterestResponse mVPassengerUpdateInterestResponse = (MVPassengerUpdateInterestResponse) obj;
        if (!getClass().equals(mVPassengerUpdateInterestResponse.getClass())) {
            return getClass().getName().compareTo(mVPassengerUpdateInterestResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25826f()).compareTo(Boolean.valueOf(mVPassengerUpdateInterestResponse.mo25826f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo25826f() || (compareTo = this.steps.compareTo(mVPassengerUpdateInterestResponse.steps)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerUpdateInterestResponse)) {
            return false;
        }
        MVPassengerUpdateInterestResponse mVPassengerUpdateInterestResponse = (MVPassengerUpdateInterestResponse) obj;
        boolean f = mo25826f();
        boolean f2 = mVPassengerUpdateInterestResponse.mo25826f();
        if ((f || f2) && (!f || !f2 || !this.steps.mo25547a(mVPassengerUpdateInterestResponse.steps))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25826f() {
        return this.steps != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVPassengerUpdateInterestResponse(");
        if (mo25826f()) {
            sb.append("steps:");
            MVCarpoolRegistrationSteps mVCarpoolRegistrationSteps = this.steps;
            if (mVCarpoolRegistrationSteps == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVCarpoolRegistrationSteps);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
