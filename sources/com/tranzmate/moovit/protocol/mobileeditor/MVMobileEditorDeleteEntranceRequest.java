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

public class MVMobileEditorDeleteEntranceRequest implements TBase<MVMobileEditorDeleteEntranceRequest, _Fields>, Serializable, Cloneable, Comparable<MVMobileEditorDeleteEntranceRequest> {

    /* renamed from: b */
    public static final C25113c f26794b = new C25113c("entranceId", (byte) 8, 1);

    /* renamed from: c */
    public static final HashMap f26795c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26796d;
    private byte __isset_bitfield = 0;
    public int entranceId;

    public enum _Fields implements C25085c {
        ENTRANCE_ID(1, "entranceId");
        
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
            return ENTRANCE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteEntranceRequest$a */
    public static class C9388a extends C25239c<MVMobileEditorDeleteEntranceRequest> {
        public C9388a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorDeleteEntranceRequest mVMobileEditorDeleteEntranceRequest = (MVMobileEditorDeleteEntranceRequest) tBase;
            mVMobileEditorDeleteEntranceRequest.getClass();
            C25113c cVar = MVMobileEditorDeleteEntranceRequest.f26794b;
            gVar.mo61687K();
            gVar.mo61711x(MVMobileEditorDeleteEntranceRequest.f26794b);
            C16530d.m42020n(gVar, mVMobileEditorDeleteEntranceRequest.entranceId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorDeleteEntranceRequest mVMobileEditorDeleteEntranceRequest = (MVMobileEditorDeleteEntranceRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMobileEditorDeleteEntranceRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 8) {
                    mVMobileEditorDeleteEntranceRequest.entranceId = gVar.mo61696i();
                    mVMobileEditorDeleteEntranceRequest.mo29093g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteEntranceRequest$b */
    public static class C9389b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9388a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteEntranceRequest$c */
    public static class C9390c extends C25240d<MVMobileEditorDeleteEntranceRequest> {
        public C9390c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorDeleteEntranceRequest mVMobileEditorDeleteEntranceRequest = (MVMobileEditorDeleteEntranceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMobileEditorDeleteEntranceRequest.mo29092f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMobileEditorDeleteEntranceRequest.mo29092f()) {
                jVar.mo61678B(mVMobileEditorDeleteEntranceRequest.entranceId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorDeleteEntranceRequest mVMobileEditorDeleteEntranceRequest = (MVMobileEditorDeleteEntranceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVMobileEditorDeleteEntranceRequest.entranceId = jVar.mo61696i();
                mVMobileEditorDeleteEntranceRequest.mo29093g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteEntranceRequest$d */
    public static class C9391d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9390c(0);
        }
    }

    static {
        new C17394d0("MVMobileEditorDeleteEntranceRequest");
        HashMap hashMap = new HashMap();
        f26795c = hashMap;
        hashMap.put(C25239c.class, new C9389b());
        hashMap.put(C25240d.class, new C9391d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENTRANCE_ID, new FieldMetaData("entranceId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26796d = unmodifiableMap;
        FieldMetaData.m61947a(MVMobileEditorDeleteEntranceRequest.class, unmodifiableMap);
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
        ((C25238b) f26795c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26795c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVMobileEditorDeleteEntranceRequest mVMobileEditorDeleteEntranceRequest = (MVMobileEditorDeleteEntranceRequest) obj;
        if (!getClass().equals(mVMobileEditorDeleteEntranceRequest.getClass())) {
            return getClass().getName().compareTo(mVMobileEditorDeleteEntranceRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29092f()).compareTo(Boolean.valueOf(mVMobileEditorDeleteEntranceRequest.mo29092f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo29092f() || (c = C25082a.m62839c(this.entranceId, mVMobileEditorDeleteEntranceRequest.entranceId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMobileEditorDeleteEntranceRequest) && this.entranceId == ((MVMobileEditorDeleteEntranceRequest) obj).entranceId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29092f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo29093g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C13437d.m33707l(C13437d.m33708n("MVMobileEditorDeleteEntranceRequest(", "entranceId:"), this.entranceId, ")");
    }
}
