package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVExternalAppData;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityIntegrationFlow;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
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

public class MVMicroMobilityIntegrationItem implements TBase<MVMicroMobilityIntegrationItem, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityIntegrationItem> {

    /* renamed from: b */
    public static final C25113c f29974b = new C25113c("serviceId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29975c = new C25113c("itemId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29976d = new C25113c("flows", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f29977e = new C25113c("deepLink", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f29978f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29979g;
    public MVExternalAppData deepLink;
    public List<MVMicroMobilityIntegrationFlow> flows;
    public String itemId;
    private _Fields[] optionals = {_Fields.DEEP_LINK};
    public String serviceId;

    public enum _Fields implements C25085c {
        SERVICE_ID(1, "serviceId"),
        ITEM_ID(2, "itemId"),
        FLOWS(3, "flows"),
        DEEP_LINK(4, "deepLink");
        
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
                return SERVICE_ID;
            }
            if (i == 2) {
                return ITEM_ID;
            }
            if (i == 3) {
                return FLOWS;
            }
            if (i != 4) {
                return null;
            }
            return DEEP_LINK;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem$a */
    public static class C11574a extends C25239c<MVMicroMobilityIntegrationItem> {
        public C11574a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = (MVMicroMobilityIntegrationItem) tBase;
            MVExternalAppData mVExternalAppData = mVMicroMobilityIntegrationItem.deepLink;
            C25113c cVar = MVMicroMobilityIntegrationItem.f29974b;
            gVar.mo61687K();
            if (mVMicroMobilityIntegrationItem.serviceId != null) {
                gVar.mo61711x(MVMicroMobilityIntegrationItem.f29974b);
                gVar.mo61686J(mVMicroMobilityIntegrationItem.serviceId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityIntegrationItem.itemId != null) {
                gVar.mo61711x(MVMicroMobilityIntegrationItem.f29975c);
                gVar.mo61686J(mVMicroMobilityIntegrationItem.itemId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityIntegrationItem.flows != null) {
                gVar.mo61711x(MVMicroMobilityIntegrationItem.f29976d);
                gVar.mo61680D(new C25119e((byte) 8, mVMicroMobilityIntegrationItem.flows.size()));
                for (MVMicroMobilityIntegrationFlow value : mVMicroMobilityIntegrationItem.flows) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMicroMobilityIntegrationItem.deepLink != null && mVMicroMobilityIntegrationItem.mo34398f()) {
                gVar.mo61711x(MVMicroMobilityIntegrationItem.f29977e);
                mVMicroMobilityIntegrationItem.deepLink.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = (MVMicroMobilityIntegrationItem) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVExternalAppData mVExternalAppData = mVMicroMobilityIntegrationItem.deepLink;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVExternalAppData mVExternalAppData2 = new MVExternalAppData();
                                mVMicroMobilityIntegrationItem.deepLink = mVExternalAppData2;
                                mVExternalAppData2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVMicroMobilityIntegrationItem.flows = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVMicroMobilityIntegrationItem.flows.add(MVMicroMobilityIntegrationFlow.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityIntegrationItem.itemId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityIntegrationItem.serviceId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem$b */
    public static class C11575b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11574a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem$c */
    public static class C11576c extends C25240d<MVMicroMobilityIntegrationItem> {
        public C11576c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = (MVMicroMobilityIntegrationItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityIntegrationItem.mo34402i()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityIntegrationItem.mo34400h()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityIntegrationItem.mo34399g()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityIntegrationItem.mo34398f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVMicroMobilityIntegrationItem.mo34402i()) {
                jVar.mo61686J(mVMicroMobilityIntegrationItem.serviceId);
            }
            if (mVMicroMobilityIntegrationItem.mo34400h()) {
                jVar.mo61686J(mVMicroMobilityIntegrationItem.itemId);
            }
            if (mVMicroMobilityIntegrationItem.mo34399g()) {
                jVar.mo61678B(mVMicroMobilityIntegrationItem.flows.size());
                for (MVMicroMobilityIntegrationFlow value : mVMicroMobilityIntegrationItem.flows) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVMicroMobilityIntegrationItem.mo34398f()) {
                mVMicroMobilityIntegrationItem.deepLink.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = (MVMicroMobilityIntegrationItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVMicroMobilityIntegrationItem.serviceId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityIntegrationItem.itemId = jVar.mo61704q();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVMicroMobilityIntegrationItem.flows = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVMicroMobilityIntegrationItem.flows.add(MVMicroMobilityIntegrationFlow.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(3)) {
                MVExternalAppData mVExternalAppData = new MVExternalAppData();
                mVMicroMobilityIntegrationItem.deepLink = mVExternalAppData;
                mVExternalAppData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVMicroMobilityIntegrationItem$d */
    public static class C11577d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11576c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityIntegrationItem");
        HashMap hashMap = new HashMap();
        f29978f = hashMap;
        hashMap.put(C25239c.class, new C11575b());
        hashMap.put(C25240d.class, new C11577d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITEM_ID, new FieldMetaData("itemId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FLOWS, new FieldMetaData("flows", (byte) 3, new ListMetaData(new EnumMetaData(MVMicroMobilityIntegrationFlow.class))));
        enumMap.put(_Fields.DEEP_LINK, new FieldMetaData("deepLink", (byte) 2, new StructMetaData(MVExternalAppData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29979g = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityIntegrationItem.class, unmodifiableMap);
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
        ((C25238b) f29978f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29978f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34395a(MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem) {
        if (mVMicroMobilityIntegrationItem == null) {
            return false;
        }
        boolean i = mo34402i();
        boolean i2 = mVMicroMobilityIntegrationItem.mo34402i();
        if ((i || i2) && (!i || !i2 || !this.serviceId.equals(mVMicroMobilityIntegrationItem.serviceId))) {
            return false;
        }
        boolean h = mo34400h();
        boolean h2 = mVMicroMobilityIntegrationItem.mo34400h();
        if ((h || h2) && (!h || !h2 || !this.itemId.equals(mVMicroMobilityIntegrationItem.itemId))) {
            return false;
        }
        boolean g = mo34399g();
        boolean g2 = mVMicroMobilityIntegrationItem.mo34399g();
        if ((g || g2) && (!g || !g2 || !this.flows.equals(mVMicroMobilityIntegrationItem.flows))) {
            return false;
        }
        boolean f = mo34398f();
        boolean f2 = mVMicroMobilityIntegrationItem.mo34398f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.deepLink.mo26157a(mVMicroMobilityIntegrationItem.deepLink)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityIntegrationItem mVMicroMobilityIntegrationItem = (MVMicroMobilityIntegrationItem) obj;
        if (!getClass().equals(mVMicroMobilityIntegrationItem.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityIntegrationItem.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34402i()).compareTo(Boolean.valueOf(mVMicroMobilityIntegrationItem.mo34402i()));
        if (compareTo2 != 0 || ((mo34402i() && (compareTo2 = this.serviceId.compareTo(mVMicroMobilityIntegrationItem.serviceId)) != 0) || (compareTo2 = Boolean.valueOf(mo34400h()).compareTo(Boolean.valueOf(mVMicroMobilityIntegrationItem.mo34400h()))) != 0 || ((mo34400h() && (compareTo2 = this.itemId.compareTo(mVMicroMobilityIntegrationItem.itemId)) != 0) || (compareTo2 = Boolean.valueOf(mo34399g()).compareTo(Boolean.valueOf(mVMicroMobilityIntegrationItem.mo34399g()))) != 0 || ((mo34399g() && (compareTo2 = C25082a.m62844h(this.flows, mVMicroMobilityIntegrationItem.flows)) != 0) || (compareTo2 = Boolean.valueOf(mo34398f()).compareTo(Boolean.valueOf(mVMicroMobilityIntegrationItem.mo34398f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo34398f() || (compareTo = this.deepLink.compareTo(mVMicroMobilityIntegrationItem.deepLink)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMicroMobilityIntegrationItem)) {
            return mo34395a((MVMicroMobilityIntegrationItem) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34398f() {
        return this.deepLink != null;
    }

    /* renamed from: g */
    public final boolean mo34399g() {
        return this.flows != null;
    }

    /* renamed from: h */
    public final boolean mo34400h() {
        return this.itemId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34402i() {
        return this.serviceId != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityIntegrationItem(", "serviceId:");
        String str = this.serviceId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("itemId:");
        String str2 = this.itemId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("flows:");
        List<MVMicroMobilityIntegrationFlow> list = this.flows;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo34398f()) {
            n.append(", ");
            n.append("deepLink:");
            MVExternalAppData mVExternalAppData = this.deepLink;
            if (mVExternalAppData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVExternalAppData);
            }
        }
        n.append(")");
        return n.toString();
    }
}
