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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVSuggestionResponse implements TBase<MVSuggestionResponse, _Fields>, Serializable, Cloneable, Comparable<MVSuggestionResponse> {

    /* renamed from: b */
    public static final C25113c f28142b = new C25113c("superEvents", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f28143c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28144d;
    private _Fields[] optionals = {_Fields.SUPER_EVENTS};
    public List<MVRSSuperEvent> superEvents;

    public enum _Fields implements C25085c {
        SUPER_EVENTS(1, "superEvents");
        
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
            return SUPER_EVENTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVSuggestionResponse$a */
    public static class C10399a extends C25239c<MVSuggestionResponse> {
        public C10399a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestionResponse mVSuggestionResponse = (MVSuggestionResponse) tBase;
            mVSuggestionResponse.getClass();
            C25113c cVar = MVSuggestionResponse.f28142b;
            gVar.mo61687K();
            if (mVSuggestionResponse.superEvents != null && mVSuggestionResponse.mo31412f()) {
                gVar.mo61711x(MVSuggestionResponse.f28142b);
                gVar.mo61680D(new C25119e((byte) 12, mVSuggestionResponse.superEvents.size()));
                for (MVRSSuperEvent X0 : mVSuggestionResponse.superEvents) {
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
            MVSuggestionResponse mVSuggestionResponse = (MVSuggestionResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSuggestionResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVSuggestionResponse.superEvents = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                        mVRSSuperEvent.mo25201C1(gVar);
                        mVSuggestionResponse.superEvents.add(mVRSSuperEvent);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVSuggestionResponse$b */
    public static class C10400b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10399a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVSuggestionResponse$c */
    public static class C10401c extends C25240d<MVSuggestionResponse> {
        public C10401c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestionResponse mVSuggestionResponse = (MVSuggestionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSuggestionResponse.mo31412f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVSuggestionResponse.mo31412f()) {
                jVar.mo61678B(mVSuggestionResponse.superEvents.size());
                for (MVRSSuperEvent X0 : mVSuggestionResponse.superEvents) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestionResponse mVSuggestionResponse = (MVSuggestionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVSuggestionResponse.superEvents = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                    mVRSSuperEvent.mo25201C1(jVar);
                    mVSuggestionResponse.superEvents.add(mVRSSuperEvent);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVSuggestionResponse$d */
    public static class C10402d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10401c(0);
        }
    }

    static {
        new C17394d0("MVSuggestionResponse");
        HashMap hashMap = new HashMap();
        f28143c = hashMap;
        hashMap.put(C25239c.class, new C10400b());
        hashMap.put(C25240d.class, new C10402d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPER_EVENTS, new FieldMetaData("superEvents", (byte) 2, new ListMetaData(new StructMetaData(MVRSSuperEvent.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28144d = unmodifiableMap;
        FieldMetaData.m61947a(MVSuggestionResponse.class, unmodifiableMap);
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
        ((C25238b) f28143c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28143c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVSuggestionResponse mVSuggestionResponse = (MVSuggestionResponse) obj;
        if (!getClass().equals(mVSuggestionResponse.getClass())) {
            return getClass().getName().compareTo(mVSuggestionResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31412f()).compareTo(Boolean.valueOf(mVSuggestionResponse.mo31412f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo31412f() || (h = C25082a.m62844h(this.superEvents, mVSuggestionResponse.superEvents)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSuggestionResponse)) {
            return false;
        }
        MVSuggestionResponse mVSuggestionResponse = (MVSuggestionResponse) obj;
        boolean f = mo31412f();
        boolean f2 = mVSuggestionResponse.mo31412f();
        if ((f || f2) && (!f || !f2 || !this.superEvents.equals(mVSuggestionResponse.superEvents))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31412f() {
        return this.superEvents != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVSuggestionResponse(");
        if (mo31412f()) {
            sb.append("superEvents:");
            List<MVRSSuperEvent> list = this.superEvents;
            if (list == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
