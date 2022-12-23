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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVRSGetEventByIdResponse implements TBase<MVRSGetEventByIdResponse, _Fields>, Serializable, Cloneable, Comparable<MVRSGetEventByIdResponse> {

    /* renamed from: b */
    public static final C25113c f28101b = new C25113c("event", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f28102c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28103d;
    public MVRSSuperEvent event;

    public enum _Fields implements C25085c {
        EVENT(1, "event");
        
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
            return EVENT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdResponse$a */
    public static class C10378a extends C25239c<MVRSGetEventByIdResponse> {
        public C10378a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSGetEventByIdResponse mVRSGetEventByIdResponse = (MVRSGetEventByIdResponse) tBase;
            MVRSSuperEvent mVRSSuperEvent = mVRSGetEventByIdResponse.event;
            if (mVRSSuperEvent != null) {
                mVRSSuperEvent.mo31384r();
            }
            C25113c cVar = MVRSGetEventByIdResponse.f28101b;
            gVar.mo61687K();
            if (mVRSGetEventByIdResponse.event != null) {
                gVar.mo61711x(MVRSGetEventByIdResponse.f28101b);
                mVRSGetEventByIdResponse.event.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSGetEventByIdResponse mVRSGetEventByIdResponse = (MVRSGetEventByIdResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                    mVRSGetEventByIdResponse.event = mVRSSuperEvent;
                    mVRSSuperEvent.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVRSSuperEvent mVRSSuperEvent2 = mVRSGetEventByIdResponse.event;
            if (mVRSSuperEvent2 != null) {
                mVRSSuperEvent2.mo31384r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdResponse$b */
    public static class C10379b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10378a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdResponse$c */
    public static class C10380c extends C25240d<MVRSGetEventByIdResponse> {
        public C10380c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSGetEventByIdResponse mVRSGetEventByIdResponse = (MVRSGetEventByIdResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSGetEventByIdResponse.mo31347f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVRSGetEventByIdResponse.mo31347f()) {
                mVRSGetEventByIdResponse.event.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSGetEventByIdResponse mVRSGetEventByIdResponse = (MVRSGetEventByIdResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                mVRSGetEventByIdResponse.event = mVRSSuperEvent;
                mVRSSuperEvent.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdResponse$d */
    public static class C10381d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10380c(0);
        }
    }

    static {
        new C17394d0("MVRSGetEventByIdResponse");
        HashMap hashMap = new HashMap();
        f28102c = hashMap;
        hashMap.put(C25239c.class, new C10379b());
        hashMap.put(C25240d.class, new C10381d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EVENT, new FieldMetaData("event", (byte) 3, new StructMetaData(MVRSSuperEvent.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28103d = unmodifiableMap;
        FieldMetaData.m61947a(MVRSGetEventByIdResponse.class, unmodifiableMap);
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
        ((C25238b) f28102c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28102c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRSGetEventByIdResponse mVRSGetEventByIdResponse = (MVRSGetEventByIdResponse) obj;
        if (!getClass().equals(mVRSGetEventByIdResponse.getClass())) {
            return getClass().getName().compareTo(mVRSGetEventByIdResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31347f()).compareTo(Boolean.valueOf(mVRSGetEventByIdResponse.mo31347f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo31347f() || (compareTo = this.event.compareTo(mVRSGetEventByIdResponse.event)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSGetEventByIdResponse)) {
            return false;
        }
        MVRSGetEventByIdResponse mVRSGetEventByIdResponse = (MVRSGetEventByIdResponse) obj;
        boolean f = mo31347f();
        boolean f2 = mVRSGetEventByIdResponse.mo31347f();
        if ((f || f2) && (!f || !f2 || !this.event.mo31369a(mVRSGetEventByIdResponse.event))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31347f() {
        return this.event != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSGetEventByIdResponse(", "event:");
        MVRSSuperEvent mVRSSuperEvent = this.event;
        if (mVRSSuperEvent == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRSSuperEvent);
        }
        n.append(")");
        return n.toString();
    }
}
