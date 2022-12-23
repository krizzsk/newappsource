package com.tranzmate.moovit.protocol.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import p531he.C17394d0;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVEmptyResponse implements TBase<MVEmptyResponse, _Fields>, Serializable, Cloneable, Comparable<MVEmptyResponse> {

    /* renamed from: b */
    public static final HashMap f24997b;

    /* renamed from: c */
    public static final Map<_Fields, FieldMetaData> f24998c;

    public enum _Fields implements C25085c {
        ;
        
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
            return null;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVEmptyResponse$a */
    public static class C8388a extends C25239c<MVEmptyResponse> {
        public C8388a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            ((MVEmptyResponse) tBase).getClass();
            HashMap hashMap = MVEmptyResponse.f24997b;
            gVar.mo61687K();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmptyResponse mVEmptyResponse = (MVEmptyResponse) tBase;
            gVar.mo61705r();
            while (true) {
                byte b = gVar.mo61693f().f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVEmptyResponse.getClass();
                    return;
                }
                C25122h.m63098a(gVar, b);
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVEmptyResponse$b */
    public static class C8389b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8388a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVEmptyResponse$c */
    public static class C8390c extends C25240d<MVEmptyResponse> {
        public C8390c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmptyResponse mVEmptyResponse = (MVEmptyResponse) tBase;
            C25124j jVar = (C25124j) gVar;
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmptyResponse mVEmptyResponse = (MVEmptyResponse) tBase;
            C25124j jVar = (C25124j) gVar;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVEmptyResponse$d */
    public static class C8391d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8390c(0);
        }
    }

    static {
        new C17394d0("MVEmptyResponse");
        HashMap hashMap = new HashMap();
        f24997b = hashMap;
        hashMap.put(C25239c.class, new C8389b());
        hashMap.put(C25240d.class, new C8391d());
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(new EnumMap(_Fields.class));
        f24998c = unmodifiableMap;
        FieldMetaData.m61947a(MVEmptyResponse.class, unmodifiableMap);
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
        ((C25238b) f24997b.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24997b.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        MVEmptyResponse mVEmptyResponse = (MVEmptyResponse) obj;
        if (!getClass().equals(mVEmptyResponse.getClass())) {
            return getClass().getName().compareTo(mVEmptyResponse.getClass().getName());
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVEmptyResponse)) {
            return false;
        }
        MVEmptyResponse mVEmptyResponse = (MVEmptyResponse) obj;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MVEmptyResponse()";
    }
}
