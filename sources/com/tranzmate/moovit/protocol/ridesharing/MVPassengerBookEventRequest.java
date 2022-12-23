package com.tranzmate.moovit.protocol.ridesharing;

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

public class MVPassengerBookEventRequest implements TBase<MVPassengerBookEventRequest, _Fields>, Serializable, Cloneable, Comparable<MVPassengerBookEventRequest> {

    /* renamed from: b */
    public static final C25113c f28010b = new C25113c("toEvent", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28011c = new C25113c("fromEvent", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28012d = new C25113c("referredByUser", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f28013e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28014f;
    public MVPassengerBookEvent fromEvent;
    private _Fields[] optionals = {_Fields.TO_EVENT, _Fields.FROM_EVENT, _Fields.REFERRED_BY_USER};
    public String referredByUser;
    public MVPassengerBookEvent toEvent;

    public enum _Fields implements C25085c {
        TO_EVENT(1, "toEvent"),
        FROM_EVENT(2, "fromEvent"),
        REFERRED_BY_USER(3, "referredByUser");
        
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
                return TO_EVENT;
            }
            if (i == 2) {
                return FROM_EVENT;
            }
            if (i != 3) {
                return null;
            }
            return REFERRED_BY_USER;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEventRequest$a */
    public static class C10306a extends C25239c<MVPassengerBookEventRequest> {
        public C10306a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerBookEventRequest mVPassengerBookEventRequest = (MVPassengerBookEventRequest) tBase;
            MVPassengerBookEvent mVPassengerBookEvent = mVPassengerBookEventRequest.toEvent;
            if (mVPassengerBookEvent != null) {
                mVPassengerBookEvent.mo31169j();
            }
            MVPassengerBookEvent mVPassengerBookEvent2 = mVPassengerBookEventRequest.fromEvent;
            if (mVPassengerBookEvent2 != null) {
                mVPassengerBookEvent2.mo31169j();
            }
            C25113c cVar = MVPassengerBookEventRequest.f28010b;
            gVar.mo61687K();
            if (mVPassengerBookEventRequest.toEvent != null && mVPassengerBookEventRequest.mo31176h()) {
                gVar.mo61711x(MVPassengerBookEventRequest.f28010b);
                mVPassengerBookEventRequest.toEvent.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerBookEventRequest.fromEvent != null && mVPassengerBookEventRequest.mo31174f()) {
                gVar.mo61711x(MVPassengerBookEventRequest.f28011c);
                mVPassengerBookEventRequest.fromEvent.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerBookEventRequest.referredByUser != null && mVPassengerBookEventRequest.mo31175g()) {
                gVar.mo61711x(MVPassengerBookEventRequest.f28012d);
                gVar.mo61686J(mVPassengerBookEventRequest.referredByUser);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerBookEventRequest mVPassengerBookEventRequest = (MVPassengerBookEventRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPassengerBookEventRequest.referredByUser = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVPassengerBookEvent mVPassengerBookEvent = new MVPassengerBookEvent();
                        mVPassengerBookEventRequest.fromEvent = mVPassengerBookEvent;
                        mVPassengerBookEvent.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPassengerBookEvent mVPassengerBookEvent2 = new MVPassengerBookEvent();
                    mVPassengerBookEventRequest.toEvent = mVPassengerBookEvent2;
                    mVPassengerBookEvent2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVPassengerBookEvent mVPassengerBookEvent3 = mVPassengerBookEventRequest.toEvent;
            if (mVPassengerBookEvent3 != null) {
                mVPassengerBookEvent3.mo31169j();
            }
            MVPassengerBookEvent mVPassengerBookEvent4 = mVPassengerBookEventRequest.fromEvent;
            if (mVPassengerBookEvent4 != null) {
                mVPassengerBookEvent4.mo31169j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEventRequest$b */
    public static class C10307b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10306a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEventRequest$c */
    public static class C10308c extends C25240d<MVPassengerBookEventRequest> {
        public C10308c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerBookEventRequest mVPassengerBookEventRequest = (MVPassengerBookEventRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerBookEventRequest.mo31176h()) {
                bitSet.set(0);
            }
            if (mVPassengerBookEventRequest.mo31174f()) {
                bitSet.set(1);
            }
            if (mVPassengerBookEventRequest.mo31175g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPassengerBookEventRequest.mo31176h()) {
                mVPassengerBookEventRequest.toEvent.mo25202X0(jVar);
            }
            if (mVPassengerBookEventRequest.mo31174f()) {
                mVPassengerBookEventRequest.fromEvent.mo25202X0(jVar);
            }
            if (mVPassengerBookEventRequest.mo31175g()) {
                jVar.mo61686J(mVPassengerBookEventRequest.referredByUser);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerBookEventRequest mVPassengerBookEventRequest = (MVPassengerBookEventRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVPassengerBookEvent mVPassengerBookEvent = new MVPassengerBookEvent();
                mVPassengerBookEventRequest.toEvent = mVPassengerBookEvent;
                mVPassengerBookEvent.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVPassengerBookEvent mVPassengerBookEvent2 = new MVPassengerBookEvent();
                mVPassengerBookEventRequest.fromEvent = mVPassengerBookEvent2;
                mVPassengerBookEvent2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPassengerBookEventRequest.referredByUser = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerBookEventRequest$d */
    public static class C10309d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10308c(0);
        }
    }

    static {
        new C17394d0("MVPassengerBookEventRequest");
        HashMap hashMap = new HashMap();
        f28013e = hashMap;
        hashMap.put(C25239c.class, new C10307b());
        hashMap.put(C25240d.class, new C10309d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TO_EVENT, new FieldMetaData("toEvent", (byte) 2, new StructMetaData(MVPassengerBookEvent.class)));
        enumMap.put(_Fields.FROM_EVENT, new FieldMetaData("fromEvent", (byte) 2, new StructMetaData(MVPassengerBookEvent.class)));
        enumMap.put(_Fields.REFERRED_BY_USER, new FieldMetaData("referredByUser", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28014f = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerBookEventRequest.class, unmodifiableMap);
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
        ((C25238b) f28013e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28013e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerBookEventRequest mVPassengerBookEventRequest = (MVPassengerBookEventRequest) obj;
        if (!getClass().equals(mVPassengerBookEventRequest.getClass())) {
            return getClass().getName().compareTo(mVPassengerBookEventRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31176h()).compareTo(Boolean.valueOf(mVPassengerBookEventRequest.mo31176h()));
        if (compareTo2 != 0 || ((mo31176h() && (compareTo2 = this.toEvent.compareTo(mVPassengerBookEventRequest.toEvent)) != 0) || (compareTo2 = Boolean.valueOf(mo31174f()).compareTo(Boolean.valueOf(mVPassengerBookEventRequest.mo31174f()))) != 0 || ((mo31174f() && (compareTo2 = this.fromEvent.compareTo(mVPassengerBookEventRequest.fromEvent)) != 0) || (compareTo2 = Boolean.valueOf(mo31175g()).compareTo(Boolean.valueOf(mVPassengerBookEventRequest.mo31175g()))) != 0))) {
            return compareTo2;
        }
        if (!mo31175g() || (compareTo = this.referredByUser.compareTo(mVPassengerBookEventRequest.referredByUser)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerBookEventRequest)) {
            return false;
        }
        MVPassengerBookEventRequest mVPassengerBookEventRequest = (MVPassengerBookEventRequest) obj;
        boolean h = mo31176h();
        boolean h2 = mVPassengerBookEventRequest.mo31176h();
        if ((h || h2) && (!h || !h2 || !this.toEvent.mo31161a(mVPassengerBookEventRequest.toEvent))) {
            return false;
        }
        boolean f = mo31174f();
        boolean f2 = mVPassengerBookEventRequest.mo31174f();
        if ((f || f2) && (!f || !f2 || !this.fromEvent.mo31161a(mVPassengerBookEventRequest.fromEvent))) {
            return false;
        }
        boolean g = mo31175g();
        boolean g2 = mVPassengerBookEventRequest.mo31175g();
        if ((g || g2) && (!g || !g2 || !this.referredByUser.equals(mVPassengerBookEventRequest.referredByUser))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31174f() {
        return this.fromEvent != null;
    }

    /* renamed from: g */
    public final boolean mo31175g() {
        return this.referredByUser != null;
    }

    /* renamed from: h */
    public final boolean mo31176h() {
        return this.toEvent != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPassengerBookEventRequest(");
        boolean z2 = false;
        if (mo31176h()) {
            sb.append("toEvent:");
            MVPassengerBookEvent mVPassengerBookEvent = this.toEvent;
            if (mVPassengerBookEvent == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVPassengerBookEvent);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo31174f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromEvent:");
            MVPassengerBookEvent mVPassengerBookEvent2 = this.fromEvent;
            if (mVPassengerBookEvent2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVPassengerBookEvent2);
            }
        } else {
            z2 = z;
        }
        if (mo31175g()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("referredByUser:");
            String str = this.referredByUser;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
