package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVExternalAppData;
import com.usebutton.sdk.internal.WebViewActivity;
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

public class MVMicroMobilityActionResultDeepLink implements TBase<MVMicroMobilityActionResultDeepLink, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityActionResultDeepLink> {

    /* renamed from: b */
    public static final C25113c f26507b = new C25113c(WebViewActivity.EXTRA_LINK, (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f26508c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26509d;
    public MVExternalAppData link;

    public enum _Fields implements C25085c {
        LINK(1, WebViewActivity.EXTRA_LINK);
        
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
            return LINK;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResultDeepLink$a */
    public static class C9199a extends C25239c<MVMicroMobilityActionResultDeepLink> {
        public C9199a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionResultDeepLink mVMicroMobilityActionResultDeepLink = (MVMicroMobilityActionResultDeepLink) tBase;
            MVExternalAppData mVExternalAppData = mVMicroMobilityActionResultDeepLink.link;
            C25113c cVar = MVMicroMobilityActionResultDeepLink.f26507b;
            gVar.mo61687K();
            if (mVMicroMobilityActionResultDeepLink.link != null) {
                gVar.mo61711x(MVMicroMobilityActionResultDeepLink.f26507b);
                mVMicroMobilityActionResultDeepLink.link.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionResultDeepLink mVMicroMobilityActionResultDeepLink = (MVMicroMobilityActionResultDeepLink) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVExternalAppData mVExternalAppData = mVMicroMobilityActionResultDeepLink.link;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVExternalAppData mVExternalAppData2 = new MVExternalAppData();
                    mVMicroMobilityActionResultDeepLink.link = mVExternalAppData2;
                    mVExternalAppData2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResultDeepLink$b */
    public static class C9200b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9199a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResultDeepLink$c */
    public static class C9201c extends C25240d<MVMicroMobilityActionResultDeepLink> {
        public C9201c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionResultDeepLink mVMicroMobilityActionResultDeepLink = (MVMicroMobilityActionResultDeepLink) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityActionResultDeepLink.mo28648f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityActionResultDeepLink.mo28648f()) {
                mVMicroMobilityActionResultDeepLink.link.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionResultDeepLink mVMicroMobilityActionResultDeepLink = (MVMicroMobilityActionResultDeepLink) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVExternalAppData mVExternalAppData = new MVExternalAppData();
                mVMicroMobilityActionResultDeepLink.link = mVExternalAppData;
                mVExternalAppData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionResultDeepLink$d */
    public static class C9202d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9201c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityActionResultDeepLink");
        HashMap hashMap = new HashMap();
        f26508c = hashMap;
        hashMap.put(C25239c.class, new C9200b());
        hashMap.put(C25240d.class, new C9202d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINK, new FieldMetaData(WebViewActivity.EXTRA_LINK, (byte) 3, new StructMetaData(MVExternalAppData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26509d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityActionResultDeepLink.class, unmodifiableMap);
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
        ((C25238b) f26508c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26508c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityActionResultDeepLink mVMicroMobilityActionResultDeepLink = (MVMicroMobilityActionResultDeepLink) obj;
        if (!getClass().equals(mVMicroMobilityActionResultDeepLink.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityActionResultDeepLink.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28648f()).compareTo(Boolean.valueOf(mVMicroMobilityActionResultDeepLink.mo28648f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo28648f() || (compareTo = this.link.compareTo(mVMicroMobilityActionResultDeepLink.link)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityActionResultDeepLink)) {
            return false;
        }
        MVMicroMobilityActionResultDeepLink mVMicroMobilityActionResultDeepLink = (MVMicroMobilityActionResultDeepLink) obj;
        boolean f = mo28648f();
        boolean f2 = mVMicroMobilityActionResultDeepLink.mo28648f();
        if ((f || f2) && (!f || !f2 || !this.link.mo26157a(mVMicroMobilityActionResultDeepLink.link))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28648f() {
        return this.link != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityActionResultDeepLink(", "link:");
        MVExternalAppData mVExternalAppData = this.link;
        if (mVExternalAppData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVExternalAppData);
        }
        n.append(")");
        return n.toString();
    }
}
