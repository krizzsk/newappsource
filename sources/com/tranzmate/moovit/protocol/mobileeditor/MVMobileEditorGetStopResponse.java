package com.tranzmate.moovit.protocol.mobileeditor;

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

public class MVMobileEditorGetStopResponse implements TBase<MVMobileEditorGetStopResponse, _Fields>, Serializable, Cloneable, Comparable<MVMobileEditorGetStopResponse> {

    /* renamed from: b */
    public static final C25113c f26811b = new C25113c("stopMetaData", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26812c = new C25113c("changesState", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f26813d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26814e;
    public MVMobileEditorChangesState changesState;
    public MVMobileEditorStopMetaData stopMetaData;

    public enum _Fields implements C25085c {
        STOP_META_DATA(1, "stopMetaData"),
        CHANGES_STATE(2, "changesState");
        
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
                return STOP_META_DATA;
            }
            if (i != 2) {
                return null;
            }
            return CHANGES_STATE;
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopResponse$a */
    public static class C9404a extends C25239c<MVMobileEditorGetStopResponse> {
        public C9404a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorGetStopResponse mVMobileEditorGetStopResponse = (MVMobileEditorGetStopResponse) tBase;
            mVMobileEditorGetStopResponse.getClass();
            C25113c cVar = MVMobileEditorGetStopResponse.f26811b;
            gVar.mo61687K();
            if (mVMobileEditorGetStopResponse.stopMetaData != null) {
                gVar.mo61711x(MVMobileEditorGetStopResponse.f26811b);
                mVMobileEditorGetStopResponse.stopMetaData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMobileEditorGetStopResponse.changesState != null) {
                gVar.mo61711x(MVMobileEditorGetStopResponse.f26812c);
                gVar.mo61678B(mVMobileEditorGetStopResponse.changesState.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorGetStopResponse mVMobileEditorGetStopResponse = (MVMobileEditorGetStopResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMobileEditorGetStopResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVMobileEditorGetStopResponse.changesState = MVMobileEditorChangesState.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVMobileEditorStopMetaData mVMobileEditorStopMetaData = new MVMobileEditorStopMetaData();
                    mVMobileEditorGetStopResponse.stopMetaData = mVMobileEditorStopMetaData;
                    mVMobileEditorStopMetaData.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopResponse$b */
    public static class C9405b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9404a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopResponse$c */
    public static class C9406c extends C25240d<MVMobileEditorGetStopResponse> {
        public C9406c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorGetStopResponse mVMobileEditorGetStopResponse = (MVMobileEditorGetStopResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMobileEditorGetStopResponse.mo29126g()) {
                bitSet.set(0);
            }
            if (mVMobileEditorGetStopResponse.mo29125f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMobileEditorGetStopResponse.mo29126g()) {
                mVMobileEditorGetStopResponse.stopMetaData.mo25202X0(jVar);
            }
            if (mVMobileEditorGetStopResponse.mo29125f()) {
                jVar.mo61678B(mVMobileEditorGetStopResponse.changesState.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorGetStopResponse mVMobileEditorGetStopResponse = (MVMobileEditorGetStopResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVMobileEditorStopMetaData mVMobileEditorStopMetaData = new MVMobileEditorStopMetaData();
                mVMobileEditorGetStopResponse.stopMetaData = mVMobileEditorStopMetaData;
                mVMobileEditorStopMetaData.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVMobileEditorGetStopResponse.changesState = MVMobileEditorChangesState.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorGetStopResponse$d */
    public static class C9407d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9406c(0);
        }
    }

    static {
        new C17394d0("MVMobileEditorGetStopResponse");
        HashMap hashMap = new HashMap();
        f26813d = hashMap;
        hashMap.put(C25239c.class, new C9405b());
        hashMap.put(C25240d.class, new C9407d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_META_DATA, new FieldMetaData("stopMetaData", (byte) 3, new StructMetaData(MVMobileEditorStopMetaData.class)));
        enumMap.put(_Fields.CHANGES_STATE, new FieldMetaData("changesState", (byte) 3, new EnumMetaData(MVMobileEditorChangesState.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26814e = unmodifiableMap;
        FieldMetaData.m61947a(MVMobileEditorGetStopResponse.class, unmodifiableMap);
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
        ((C25238b) f26813d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26813d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMobileEditorGetStopResponse mVMobileEditorGetStopResponse = (MVMobileEditorGetStopResponse) obj;
        if (!getClass().equals(mVMobileEditorGetStopResponse.getClass())) {
            return getClass().getName().compareTo(mVMobileEditorGetStopResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29126g()).compareTo(Boolean.valueOf(mVMobileEditorGetStopResponse.mo29126g()));
        if (compareTo2 != 0 || ((mo29126g() && (compareTo2 = this.stopMetaData.compareTo(mVMobileEditorGetStopResponse.stopMetaData)) != 0) || (compareTo2 = Boolean.valueOf(mo29125f()).compareTo(Boolean.valueOf(mVMobileEditorGetStopResponse.mo29125f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29125f() || (compareTo = this.changesState.compareTo(mVMobileEditorGetStopResponse.changesState)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMobileEditorGetStopResponse)) {
            return false;
        }
        MVMobileEditorGetStopResponse mVMobileEditorGetStopResponse = (MVMobileEditorGetStopResponse) obj;
        boolean g = mo29126g();
        boolean g2 = mVMobileEditorGetStopResponse.mo29126g();
        if ((g || g2) && (!g || !g2 || !this.stopMetaData.mo29139a(mVMobileEditorGetStopResponse.stopMetaData))) {
            return false;
        }
        boolean f = mo29125f();
        boolean f2 = mVMobileEditorGetStopResponse.mo29125f();
        if ((f || f2) && (!f || !f2 || !this.changesState.equals(mVMobileEditorGetStopResponse.changesState))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29125f() {
        return this.changesState != null;
    }

    /* renamed from: g */
    public final boolean mo29126g() {
        return this.stopMetaData != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMobileEditorGetStopResponse(", "stopMetaData:");
        MVMobileEditorStopMetaData mVMobileEditorStopMetaData = this.stopMetaData;
        if (mVMobileEditorStopMetaData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMobileEditorStopMetaData);
        }
        n.append(", ");
        n.append("changesState:");
        MVMobileEditorChangesState mVMobileEditorChangesState = this.changesState;
        if (mVMobileEditorChangesState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMobileEditorChangesState);
        }
        n.append(")");
        return n.toString();
    }
}
