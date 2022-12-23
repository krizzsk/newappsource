package com.tranzmate.moovit.protocol.mobileeditor;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.gtfs.MVPathway;
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

public class MVMobileEditorPathwayMetaData implements TBase<MVMobileEditorPathwayMetaData, _Fields>, Serializable, Cloneable, Comparable<MVMobileEditorPathwayMetaData> {

    /* renamed from: b */
    public static final C25113c f26815b = new C25113c("pathway", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26816c = new C25113c("deletePending", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f26817d = new C25113c("moreInfo", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f26818e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26819f;
    private byte __isset_bitfield = 0;
    public boolean deletePending;
    public String moreInfo;
    private _Fields[] optionals = {_Fields.MORE_INFO};
    public MVPathway pathway;

    public enum _Fields implements C25085c {
        PATHWAY(1, "pathway"),
        DELETE_PENDING(2, "deletePending"),
        MORE_INFO(3, "moreInfo");
        
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
                return PATHWAY;
            }
            if (i == 2) {
                return DELETE_PENDING;
            }
            if (i != 3) {
                return null;
            }
            return MORE_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorPathwayMetaData$a */
    public static class C9408a extends C25239c<MVMobileEditorPathwayMetaData> {
        public C9408a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorPathwayMetaData mVMobileEditorPathwayMetaData = (MVMobileEditorPathwayMetaData) tBase;
            mVMobileEditorPathwayMetaData.getClass();
            C25113c cVar = MVMobileEditorPathwayMetaData.f26815b;
            gVar.mo61687K();
            if (mVMobileEditorPathwayMetaData.pathway != null) {
                gVar.mo61711x(MVMobileEditorPathwayMetaData.f26815b);
                mVMobileEditorPathwayMetaData.pathway.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMobileEditorPathwayMetaData.f26816c);
            gVar.mo61708u(mVMobileEditorPathwayMetaData.deletePending);
            gVar.mo61712y();
            if (mVMobileEditorPathwayMetaData.moreInfo != null && mVMobileEditorPathwayMetaData.mo29133g()) {
                gVar.mo61711x(MVMobileEditorPathwayMetaData.f26817d);
                gVar.mo61686J(mVMobileEditorPathwayMetaData.moreInfo);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorPathwayMetaData mVMobileEditorPathwayMetaData = (MVMobileEditorPathwayMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMobileEditorPathwayMetaData.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVMobileEditorPathwayMetaData.moreInfo = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVMobileEditorPathwayMetaData.deletePending = gVar.mo61690c();
                        mVMobileEditorPathwayMetaData.mo29136i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVPathway mVPathway = new MVPathway();
                    mVMobileEditorPathwayMetaData.pathway = mVPathway;
                    mVPathway.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorPathwayMetaData$b */
    public static class C9409b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9408a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorPathwayMetaData$c */
    public static class C9410c extends C25240d<MVMobileEditorPathwayMetaData> {
        public C9410c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorPathwayMetaData mVMobileEditorPathwayMetaData = (MVMobileEditorPathwayMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMobileEditorPathwayMetaData.mo29134h()) {
                bitSet.set(0);
            }
            if (mVMobileEditorPathwayMetaData.mo29132f()) {
                bitSet.set(1);
            }
            if (mVMobileEditorPathwayMetaData.mo29133g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMobileEditorPathwayMetaData.mo29134h()) {
                mVMobileEditorPathwayMetaData.pathway.mo25202X0(jVar);
            }
            if (mVMobileEditorPathwayMetaData.mo29132f()) {
                jVar.mo61708u(mVMobileEditorPathwayMetaData.deletePending);
            }
            if (mVMobileEditorPathwayMetaData.mo29133g()) {
                jVar.mo61686J(mVMobileEditorPathwayMetaData.moreInfo);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorPathwayMetaData mVMobileEditorPathwayMetaData = (MVMobileEditorPathwayMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVPathway mVPathway = new MVPathway();
                mVMobileEditorPathwayMetaData.pathway = mVPathway;
                mVPathway.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVMobileEditorPathwayMetaData.deletePending = jVar.mo61690c();
                mVMobileEditorPathwayMetaData.mo29136i();
            }
            if (T.get(2)) {
                mVMobileEditorPathwayMetaData.moreInfo = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorPathwayMetaData$d */
    public static class C9411d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9410c(0);
        }
    }

    static {
        new C17394d0("MVMobileEditorPathwayMetaData");
        HashMap hashMap = new HashMap();
        f26818e = hashMap;
        hashMap.put(C25239c.class, new C9409b());
        hashMap.put(C25240d.class, new C9411d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PATHWAY, new FieldMetaData("pathway", (byte) 3, new StructMetaData(MVPathway.class)));
        enumMap.put(_Fields.DELETE_PENDING, new FieldMetaData("deletePending", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MORE_INFO, new FieldMetaData("moreInfo", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26819f = unmodifiableMap;
        FieldMetaData.m61947a(MVMobileEditorPathwayMetaData.class, unmodifiableMap);
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
        ((C25238b) f26818e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26818e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMobileEditorPathwayMetaData mVMobileEditorPathwayMetaData = (MVMobileEditorPathwayMetaData) obj;
        if (!getClass().equals(mVMobileEditorPathwayMetaData.getClass())) {
            return getClass().getName().compareTo(mVMobileEditorPathwayMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29134h()).compareTo(Boolean.valueOf(mVMobileEditorPathwayMetaData.mo29134h()));
        if (compareTo2 != 0 || ((mo29134h() && (compareTo2 = this.pathway.compareTo(mVMobileEditorPathwayMetaData.pathway)) != 0) || (compareTo2 = Boolean.valueOf(mo29132f()).compareTo(Boolean.valueOf(mVMobileEditorPathwayMetaData.mo29132f()))) != 0 || ((mo29132f() && (compareTo2 = C25082a.m62848l(this.deletePending, mVMobileEditorPathwayMetaData.deletePending)) != 0) || (compareTo2 = Boolean.valueOf(mo29133g()).compareTo(Boolean.valueOf(mVMobileEditorPathwayMetaData.mo29133g()))) != 0))) {
            return compareTo2;
        }
        if (!mo29133g() || (compareTo = this.moreInfo.compareTo(mVMobileEditorPathwayMetaData.moreInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMobileEditorPathwayMetaData)) {
            return false;
        }
        MVMobileEditorPathwayMetaData mVMobileEditorPathwayMetaData = (MVMobileEditorPathwayMetaData) obj;
        boolean h = mo29134h();
        boolean h2 = mVMobileEditorPathwayMetaData.mo29134h();
        if (((h || h2) && (!h || !h2 || !this.pathway.mo27468a(mVMobileEditorPathwayMetaData.pathway))) || this.deletePending != mVMobileEditorPathwayMetaData.deletePending) {
            return false;
        }
        boolean g = mo29133g();
        boolean g2 = mVMobileEditorPathwayMetaData.mo29133g();
        if ((g || g2) && (!g || !g2 || !this.moreInfo.equals(mVMobileEditorPathwayMetaData.moreInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29132f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29133g() {
        return this.moreInfo != null;
    }

    /* renamed from: h */
    public final boolean mo29134h() {
        return this.pathway != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo29136i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMobileEditorPathwayMetaData(", "pathway:");
        MVPathway mVPathway = this.pathway;
        if (mVPathway == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPathway);
        }
        n.append(", ");
        n.append("deletePending:");
        n.append(this.deletePending);
        if (mo29133g()) {
            n.append(", ");
            n.append("moreInfo:");
            String str = this.moreInfo;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(")");
        return n.toString();
    }
}
