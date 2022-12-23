package com.tranzmate.moovit.protocol.mobileeditor;

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

public class MVMobileEditorGetStopRequest implements TBase<MVMobileEditorGetStopRequest, _Fields>, Serializable, Cloneable, Comparable<MVMobileEditorGetStopRequest> {

    /* renamed from: b */
    public static final C25113c f26808b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final HashMap f26809c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26810d;
    private byte __isset_bitfield = 0;
    public int stopId;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId");
        
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
            return STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopRequest$a */
    public static class C9400a extends C25239c<MVMobileEditorGetStopRequest> {
        public C9400a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorGetStopRequest mVMobileEditorGetStopRequest = (MVMobileEditorGetStopRequest) tBase;
            mVMobileEditorGetStopRequest.getClass();
            C25113c cVar = MVMobileEditorGetStopRequest.f26808b;
            gVar.mo61687K();
            gVar.mo61711x(MVMobileEditorGetStopRequest.f26808b);
            C16530d.m42020n(gVar, mVMobileEditorGetStopRequest.stopId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorGetStopRequest mVMobileEditorGetStopRequest = (MVMobileEditorGetStopRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMobileEditorGetStopRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 8) {
                    mVMobileEditorGetStopRequest.stopId = gVar.mo61696i();
                    mVMobileEditorGetStopRequest.mo29119g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopRequest$b */
    public static class C9401b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9400a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopRequest$c */
    public static class C9402c extends C25240d<MVMobileEditorGetStopRequest> {
        public C9402c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorGetStopRequest mVMobileEditorGetStopRequest = (MVMobileEditorGetStopRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMobileEditorGetStopRequest.mo29118f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMobileEditorGetStopRequest.mo29118f()) {
                jVar.mo61678B(mVMobileEditorGetStopRequest.stopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorGetStopRequest mVMobileEditorGetStopRequest = (MVMobileEditorGetStopRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVMobileEditorGetStopRequest.stopId = jVar.mo61696i();
                mVMobileEditorGetStopRequest.mo29119g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopRequest$d */
    public static class C9403d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9402c(0);
        }
    }

    static {
        new C17394d0("MVMobileEditorGetStopRequest");
        HashMap hashMap = new HashMap();
        f26809c = hashMap;
        hashMap.put(C25239c.class, new C9401b());
        hashMap.put(C25240d.class, new C9403d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26810d = unmodifiableMap;
        FieldMetaData.m61947a(MVMobileEditorGetStopRequest.class, unmodifiableMap);
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
        ((C25238b) f26809c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26809c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVMobileEditorGetStopRequest mVMobileEditorGetStopRequest = (MVMobileEditorGetStopRequest) obj;
        if (!getClass().equals(mVMobileEditorGetStopRequest.getClass())) {
            return getClass().getName().compareTo(mVMobileEditorGetStopRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29118f()).compareTo(Boolean.valueOf(mVMobileEditorGetStopRequest.mo29118f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo29118f() || (c = C25082a.m62839c(this.stopId, mVMobileEditorGetStopRequest.stopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMobileEditorGetStopRequest) && this.stopId == ((MVMobileEditorGetStopRequest) obj).stopId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29118f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo29119g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C13437d.m33707l(C13437d.m33708n("MVMobileEditorGetStopRequest(", "stopId:"), this.stopId, ")");
    }
}
