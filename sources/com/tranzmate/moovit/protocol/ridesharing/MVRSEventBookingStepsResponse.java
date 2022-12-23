package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVRSEventBookingStepsResponse implements TBase<MVRSEventBookingStepsResponse, _Fields>, Serializable, Cloneable, Comparable<MVRSEventBookingStepsResponse> {

    /* renamed from: b */
    public static final C25113c f28059b = new C25113c("superEventId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28060c = new C25113c("transitions", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f28061d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28062e;
    private byte __isset_bitfield = 0;
    public int superEventId;
    public List<MVRSEventTransitOption> transitions;

    public enum _Fields implements C25085c {
        SUPER_EVENT_ID(1, "superEventId"),
        TRANSITIONS(2, "transitions");
        
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
                return SUPER_EVENT_ID;
            }
            if (i != 2) {
                return null;
            }
            return TRANSITIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsResponse$a */
    public static class C10346a extends C25239c<MVRSEventBookingStepsResponse> {
        public C10346a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingStepsResponse mVRSEventBookingStepsResponse = (MVRSEventBookingStepsResponse) tBase;
            mVRSEventBookingStepsResponse.getClass();
            C25113c cVar = MVRSEventBookingStepsResponse.f28059b;
            gVar.mo61687K();
            gVar.mo61711x(MVRSEventBookingStepsResponse.f28059b);
            gVar.mo61678B(mVRSEventBookingStepsResponse.superEventId);
            gVar.mo61712y();
            if (mVRSEventBookingStepsResponse.transitions != null) {
                gVar.mo61711x(MVRSEventBookingStepsResponse.f28060c);
                gVar.mo61680D(new C25119e((byte) 12, mVRSEventBookingStepsResponse.transitions.size()));
                for (MVRSEventTransitOption X0 : mVRSEventBookingStepsResponse.transitions) {
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
            MVRSEventBookingStepsResponse mVRSEventBookingStepsResponse = (MVRSEventBookingStepsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRSEventBookingStepsResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVRSEventBookingStepsResponse.transitions = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVRSEventTransitOption mVRSEventTransitOption = new MVRSEventTransitOption();
                            mVRSEventTransitOption.mo25201C1(gVar);
                            mVRSEventBookingStepsResponse.transitions.add(mVRSEventTransitOption);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVRSEventBookingStepsResponse.superEventId = gVar.mo61696i();
                    mVRSEventBookingStepsResponse.mo31267h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsResponse$b */
    public static class C10347b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10346a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsResponse$c */
    public static class C10348c extends C25240d<MVRSEventBookingStepsResponse> {
        public C10348c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingStepsResponse mVRSEventBookingStepsResponse = (MVRSEventBookingStepsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEventBookingStepsResponse.mo31265f()) {
                bitSet.set(0);
            }
            if (mVRSEventBookingStepsResponse.mo31266g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVRSEventBookingStepsResponse.mo31265f()) {
                jVar.mo61678B(mVRSEventBookingStepsResponse.superEventId);
            }
            if (mVRSEventBookingStepsResponse.mo31266g()) {
                jVar.mo61678B(mVRSEventBookingStepsResponse.transitions.size());
                for (MVRSEventTransitOption X0 : mVRSEventBookingStepsResponse.transitions) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingStepsResponse mVRSEventBookingStepsResponse = (MVRSEventBookingStepsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVRSEventBookingStepsResponse.superEventId = jVar.mo61696i();
                mVRSEventBookingStepsResponse.mo31267h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVRSEventBookingStepsResponse.transitions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVRSEventTransitOption mVRSEventTransitOption = new MVRSEventTransitOption();
                    mVRSEventTransitOption.mo25201C1(jVar);
                    mVRSEventBookingStepsResponse.transitions.add(mVRSEventTransitOption);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsResponse$d */
    public static class C10349d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10348c(0);
        }
    }

    static {
        new C17394d0("MVRSEventBookingStepsResponse");
        HashMap hashMap = new HashMap();
        f28061d = hashMap;
        hashMap.put(C25239c.class, new C10347b());
        hashMap.put(C25240d.class, new C10349d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPER_EVENT_ID, new FieldMetaData("superEventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TRANSITIONS, new FieldMetaData("transitions", (byte) 3, new ListMetaData(new StructMetaData(MVRSEventTransitOption.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28062e = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEventBookingStepsResponse.class, unmodifiableMap);
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
        ((C25238b) f28061d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28061d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVRSEventBookingStepsResponse mVRSEventBookingStepsResponse = (MVRSEventBookingStepsResponse) obj;
        if (!getClass().equals(mVRSEventBookingStepsResponse.getClass())) {
            return getClass().getName().compareTo(mVRSEventBookingStepsResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31265f()).compareTo(Boolean.valueOf(mVRSEventBookingStepsResponse.mo31265f()));
        if (compareTo != 0 || ((mo31265f() && (compareTo = C25082a.m62839c(this.superEventId, mVRSEventBookingStepsResponse.superEventId)) != 0) || (compareTo = Boolean.valueOf(mo31266g()).compareTo(Boolean.valueOf(mVRSEventBookingStepsResponse.mo31266g()))) != 0)) {
            return compareTo;
        }
        if (!mo31266g() || (h = C25082a.m62844h(this.transitions, mVRSEventBookingStepsResponse.transitions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSEventBookingStepsResponse)) {
            return false;
        }
        MVRSEventBookingStepsResponse mVRSEventBookingStepsResponse = (MVRSEventBookingStepsResponse) obj;
        if (this.superEventId != mVRSEventBookingStepsResponse.superEventId) {
            return false;
        }
        boolean g = mo31266g();
        boolean g2 = mVRSEventBookingStepsResponse.mo31266g();
        if ((g || g2) && (!g || !g2 || !this.transitions.equals(mVRSEventBookingStepsResponse.transitions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31265f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31266g() {
        return this.transitions != null;
    }

    /* renamed from: h */
    public final void mo31267h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEventBookingStepsResponse(", "superEventId:");
        C0016g.m42z(n, this.superEventId, ", ", "transitions:");
        List<MVRSEventTransitOption> list = this.transitions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
