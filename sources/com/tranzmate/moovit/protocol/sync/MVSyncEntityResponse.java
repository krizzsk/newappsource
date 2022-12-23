package com.tranzmate.moovit.protocol.sync;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVSyncEntityResponse implements TBase<MVSyncEntityResponse, _Fields>, Serializable, Cloneable, Comparable<MVSyncEntityResponse> {

    /* renamed from: b */
    public static final C25113c f28505b = new C25113c("entity", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28506c = new C25113c("entityType", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f28507d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28508e;
    public MVSyncedEntity entity;
    public MVSyncEntityType entityType;

    public enum _Fields implements C25085c {
        ENTITY(1, "entity"),
        ENTITY_TYPE(2, "entityType");
        
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
                return ENTITY;
            }
            if (i != 2) {
                return null;
            }
            return ENTITY_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse$a */
    public static class C10675a extends C25239c<MVSyncEntityResponse> {
        public C10675a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntityResponse mVSyncEntityResponse = (MVSyncEntityResponse) tBase;
            mVSyncEntityResponse.getClass();
            C25113c cVar = MVSyncEntityResponse.f28505b;
            gVar.mo61687K();
            if (mVSyncEntityResponse.entity != null) {
                gVar.mo61711x(MVSyncEntityResponse.f28505b);
                mVSyncEntityResponse.entity.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSyncEntityResponse.entityType != null) {
                gVar.mo61711x(MVSyncEntityResponse.f28506c);
                gVar.mo61678B(mVSyncEntityResponse.entityType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntityResponse mVSyncEntityResponse = (MVSyncEntityResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSyncEntityResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVSyncEntityResponse.entityType = MVSyncEntityType.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVSyncedEntity mVSyncedEntity = new MVSyncedEntity();
                    mVSyncEntityResponse.entity = mVSyncedEntity;
                    mVSyncedEntity.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse$b */
    public static class C10676b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10675a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse$c */
    public static class C10677c extends C25240d<MVSyncEntityResponse> {
        public C10677c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntityResponse mVSyncEntityResponse = (MVSyncEntityResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSyncEntityResponse.mo32056f()) {
                bitSet.set(0);
            }
            if (mVSyncEntityResponse.mo32057g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSyncEntityResponse.mo32056f()) {
                mVSyncEntityResponse.entity.mo25202X0(jVar);
            }
            if (mVSyncEntityResponse.mo32057g()) {
                jVar.mo61678B(mVSyncEntityResponse.entityType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSyncEntityResponse mVSyncEntityResponse = (MVSyncEntityResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVSyncedEntity mVSyncedEntity = new MVSyncedEntity();
                mVSyncEntityResponse.entity = mVSyncedEntity;
                mVSyncedEntity.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVSyncEntityResponse.entityType = MVSyncEntityType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse$d */
    public static class C10678d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10677c(0);
        }
    }

    static {
        new C17394d0("MVSyncEntityResponse");
        HashMap hashMap = new HashMap();
        f28507d = hashMap;
        hashMap.put(C25239c.class, new C10676b());
        hashMap.put(C25240d.class, new C10678d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ENTITY, new FieldMetaData("entity", (byte) 3, new StructMetaData(MVSyncedEntity.class)));
        enumMap.put(_Fields.ENTITY_TYPE, new FieldMetaData("entityType", (byte) 3, new EnumMetaData(MVSyncEntityType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28508e = unmodifiableMap;
        FieldMetaData.m61947a(MVSyncEntityResponse.class, unmodifiableMap);
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
        ((C25238b) f28507d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28507d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSyncEntityResponse mVSyncEntityResponse = (MVSyncEntityResponse) obj;
        if (!getClass().equals(mVSyncEntityResponse.getClass())) {
            return getClass().getName().compareTo(mVSyncEntityResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32056f()).compareTo(Boolean.valueOf(mVSyncEntityResponse.mo32056f()));
        if (compareTo2 != 0 || ((mo32056f() && (compareTo2 = this.entity.compareTo(mVSyncEntityResponse.entity)) != 0) || (compareTo2 = Boolean.valueOf(mo32057g()).compareTo(Boolean.valueOf(mVSyncEntityResponse.mo32057g()))) != 0)) {
            return compareTo2;
        }
        if (!mo32057g() || (compareTo = this.entityType.compareTo(mVSyncEntityResponse.entityType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse
            r2 = 1
            if (r1 == 0) goto L_0x0058
            com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse r7 = (com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse) r7
            boolean r1 = r6.mo32056f()
            boolean r3 = r7.mo32056f()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x003b
        L_0x0017:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x001c
            goto L_0x0058
        L_0x001c:
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity r1 = r6.entity
            com.tranzmate.moovit.protocol.sync.MVSyncedEntity r3 = r7.entity
            if (r3 == 0) goto L_0x0034
            F r4 = r1.setField_
            F r5 = r3.setField_
            if (r4 != r5) goto L_0x0037
            java.lang.Object r1 = r1.value_
            java.lang.Object r3 = r3.value_
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0037
            r1 = 1
            goto L_0x0038
        L_0x0034:
            r1.getClass()
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r1 != 0) goto L_0x003b
            goto L_0x0058
        L_0x003b:
            boolean r1 = r6.mo32057g()
            boolean r3 = r7.mo32057g()
            if (r1 != 0) goto L_0x0047
            if (r3 == 0) goto L_0x0057
        L_0x0047:
            if (r1 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x004c
            goto L_0x0058
        L_0x004c:
            com.tranzmate.moovit.protocol.sync.MVSyncEntityType r1 = r6.entityType
            com.tranzmate.moovit.protocol.sync.MVSyncEntityType r7 = r7.entityType
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.sync.MVSyncEntityResponse.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo32056f() {
        return this.entity != null;
    }

    /* renamed from: g */
    public final boolean mo32057g() {
        return this.entityType != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSyncEntityResponse(", "entity:");
        MVSyncedEntity mVSyncedEntity = this.entity;
        if (mVSyncedEntity == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSyncedEntity);
        }
        n.append(", ");
        n.append("entityType:");
        MVSyncEntityType mVSyncEntityType = this.entityType;
        if (mVSyncEntityType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSyncEntityType);
        }
        n.append(")");
        return n.toString();
    }
}
