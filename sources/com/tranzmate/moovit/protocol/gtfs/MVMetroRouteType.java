package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.clienttexts.MVClientText;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.common.MVViewType;
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

public class MVMetroRouteType implements TBase<MVMetroRouteType, _Fields>, Serializable, Cloneable, Comparable<MVMetroRouteType> {

    /* renamed from: b */
    public static final C25113c f25769b = new C25113c("routeType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25770c = new C25113c("image", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25771d = new C25113c("clientOverrideTextResourceId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25772e = new C25113c("sortingMethod", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25773f = new C25113c("viewType", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f25774g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25775h;
    private byte __isset_bitfield = 0;
    public MVClientText clientOverrideTextResourceId;
    public int image;
    private _Fields[] optionals = {_Fields.CLIENT_OVERRIDE_TEXT_RESOURCE_ID};
    public MVRouteType routeType;
    public MVRouteSortingMethods sortingMethod;
    public MVViewType viewType;

    public enum _Fields implements C25085c {
        ROUTE_TYPE(1, "routeType"),
        IMAGE(2, "image"),
        CLIENT_OVERRIDE_TEXT_RESOURCE_ID(3, "clientOverrideTextResourceId"),
        SORTING_METHOD(4, "sortingMethod"),
        VIEW_TYPE(5, "viewType");
        
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
                return ROUTE_TYPE;
            }
            if (i == 2) {
                return IMAGE;
            }
            if (i == 3) {
                return CLIENT_OVERRIDE_TEXT_RESOURCE_ID;
            }
            if (i == 4) {
                return SORTING_METHOD;
            }
            if (i != 5) {
                return null;
            }
            return VIEW_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroRouteType$a */
    public static class C8811a extends C25239c<MVMetroRouteType> {
        public C8811a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroRouteType mVMetroRouteType = (MVMetroRouteType) tBase;
            mVMetroRouteType.getClass();
            C25113c cVar = MVMetroRouteType.f25769b;
            gVar.mo61687K();
            if (mVMetroRouteType.routeType != null) {
                gVar.mo61711x(MVMetroRouteType.f25769b);
                gVar.mo61678B(mVMetroRouteType.routeType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMetroRouteType.f25770c);
            gVar.mo61678B(mVMetroRouteType.image);
            gVar.mo61712y();
            if (mVMetroRouteType.clientOverrideTextResourceId != null && mVMetroRouteType.mo27459f()) {
                gVar.mo61711x(MVMetroRouteType.f25771d);
                gVar.mo61678B(mVMetroRouteType.clientOverrideTextResourceId.getValue());
                gVar.mo61712y();
            }
            if (mVMetroRouteType.sortingMethod != null) {
                gVar.mo61711x(MVMetroRouteType.f25772e);
                gVar.mo61678B(mVMetroRouteType.sortingMethod.getValue());
                gVar.mo61712y();
            }
            if (mVMetroRouteType.viewType != null) {
                gVar.mo61711x(MVMetroRouteType.f25773f);
                gVar.mo61678B(mVMetroRouteType.viewType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroRouteType mVMetroRouteType = (MVMetroRouteType) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMetroRouteType.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVMetroRouteType.viewType = MVViewType.findByValue(gVar.mo61696i());
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVMetroRouteType.sortingMethod = MVRouteSortingMethods.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVMetroRouteType.clientOverrideTextResourceId = MVClientText.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVMetroRouteType.image = gVar.mo61696i();
                        mVMetroRouteType.mo27465k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVMetroRouteType.routeType = MVRouteType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroRouteType$b */
    public static class C8812b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8811a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroRouteType$c */
    public static class C8813c extends C25240d<MVMetroRouteType> {
        public C8813c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroRouteType mVMetroRouteType = (MVMetroRouteType) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMetroRouteType.mo27461h()) {
                bitSet.set(0);
            }
            if (mVMetroRouteType.mo27460g()) {
                bitSet.set(1);
            }
            if (mVMetroRouteType.mo27459f()) {
                bitSet.set(2);
            }
            if (mVMetroRouteType.mo27463i()) {
                bitSet.set(3);
            }
            if (mVMetroRouteType.mo27464j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMetroRouteType.mo27461h()) {
                jVar.mo61678B(mVMetroRouteType.routeType.getValue());
            }
            if (mVMetroRouteType.mo27460g()) {
                jVar.mo61678B(mVMetroRouteType.image);
            }
            if (mVMetroRouteType.mo27459f()) {
                jVar.mo61678B(mVMetroRouteType.clientOverrideTextResourceId.getValue());
            }
            if (mVMetroRouteType.mo27463i()) {
                jVar.mo61678B(mVMetroRouteType.sortingMethod.getValue());
            }
            if (mVMetroRouteType.mo27464j()) {
                jVar.mo61678B(mVMetroRouteType.viewType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroRouteType mVMetroRouteType = (MVMetroRouteType) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVMetroRouteType.routeType = MVRouteType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVMetroRouteType.image = jVar.mo61696i();
                mVMetroRouteType.mo27465k();
            }
            if (T.get(2)) {
                mVMetroRouteType.clientOverrideTextResourceId = MVClientText.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVMetroRouteType.sortingMethod = MVRouteSortingMethods.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVMetroRouteType.viewType = MVViewType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroRouteType$d */
    public static class C8814d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8813c(0);
        }
    }

    static {
        new C17394d0("MVMetroRouteType");
        HashMap hashMap = new HashMap();
        f25774g = hashMap;
        hashMap.put(C25239c.class, new C8812b());
        hashMap.put(C25240d.class, new C8814d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ROUTE_TYPE, new FieldMetaData("routeType", (byte) 3, new EnumMetaData(MVRouteType.class)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new FieldValueMetaData((byte) 8, "MVImageReferenceWithoutParams")));
        enumMap.put(_Fields.CLIENT_OVERRIDE_TEXT_RESOURCE_ID, new FieldMetaData("clientOverrideTextResourceId", (byte) 2, new EnumMetaData(MVClientText.class)));
        enumMap.put(_Fields.SORTING_METHOD, new FieldMetaData("sortingMethod", (byte) 3, new EnumMetaData(MVRouteSortingMethods.class)));
        enumMap.put(_Fields.VIEW_TYPE, new FieldMetaData("viewType", (byte) 3, new EnumMetaData(MVViewType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25775h = unmodifiableMap;
        FieldMetaData.m61947a(MVMetroRouteType.class, unmodifiableMap);
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
        ((C25238b) f25774g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25774g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMetroRouteType mVMetroRouteType = (MVMetroRouteType) obj;
        if (!getClass().equals(mVMetroRouteType.getClass())) {
            return getClass().getName().compareTo(mVMetroRouteType.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27461h()).compareTo(Boolean.valueOf(mVMetroRouteType.mo27461h()));
        if (compareTo2 != 0 || ((mo27461h() && (compareTo2 = this.routeType.compareTo(mVMetroRouteType.routeType)) != 0) || (compareTo2 = Boolean.valueOf(mo27460g()).compareTo(Boolean.valueOf(mVMetroRouteType.mo27460g()))) != 0 || ((mo27460g() && (compareTo2 = C25082a.m62839c(this.image, mVMetroRouteType.image)) != 0) || (compareTo2 = Boolean.valueOf(mo27459f()).compareTo(Boolean.valueOf(mVMetroRouteType.mo27459f()))) != 0 || ((mo27459f() && (compareTo2 = this.clientOverrideTextResourceId.compareTo(mVMetroRouteType.clientOverrideTextResourceId)) != 0) || (compareTo2 = Boolean.valueOf(mo27463i()).compareTo(Boolean.valueOf(mVMetroRouteType.mo27463i()))) != 0 || ((mo27463i() && (compareTo2 = this.sortingMethod.compareTo(mVMetroRouteType.sortingMethod)) != 0) || (compareTo2 = Boolean.valueOf(mo27464j()).compareTo(Boolean.valueOf(mVMetroRouteType.mo27464j()))) != 0))))) {
            return compareTo2;
        }
        if (!mo27464j() || (compareTo = this.viewType.compareTo(mVMetroRouteType.viewType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMetroRouteType)) {
            return false;
        }
        MVMetroRouteType mVMetroRouteType = (MVMetroRouteType) obj;
        boolean h = mo27461h();
        boolean h2 = mVMetroRouteType.mo27461h();
        if (((h || h2) && (!h || !h2 || !this.routeType.equals(mVMetroRouteType.routeType))) || this.image != mVMetroRouteType.image) {
            return false;
        }
        boolean f = mo27459f();
        boolean f2 = mVMetroRouteType.mo27459f();
        if ((f || f2) && (!f || !f2 || !this.clientOverrideTextResourceId.equals(mVMetroRouteType.clientOverrideTextResourceId))) {
            return false;
        }
        boolean i = mo27463i();
        boolean i2 = mVMetroRouteType.mo27463i();
        if ((i || i2) && (!i || !i2 || !this.sortingMethod.equals(mVMetroRouteType.sortingMethod))) {
            return false;
        }
        boolean j = mo27464j();
        boolean j2 = mVMetroRouteType.mo27464j();
        if ((j || j2) && (!j || !j2 || !this.viewType.equals(mVMetroRouteType.viewType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27459f() {
        return this.clientOverrideTextResourceId != null;
    }

    /* renamed from: g */
    public final boolean mo27460g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo27461h() {
        return this.routeType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27463i() {
        return this.sortingMethod != null;
    }

    /* renamed from: j */
    public final boolean mo27464j() {
        return this.viewType != null;
    }

    /* renamed from: k */
    public final void mo27465k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMetroRouteType(", "routeType:");
        MVRouteType mVRouteType = this.routeType;
        if (mVRouteType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRouteType);
        }
        n.append(", ");
        n.append("image:");
        n.append(this.image);
        if (mo27459f()) {
            n.append(", ");
            n.append("clientOverrideTextResourceId:");
            MVClientText mVClientText = this.clientOverrideTextResourceId;
            if (mVClientText == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVClientText);
            }
        }
        n.append(", ");
        n.append("sortingMethod:");
        MVRouteSortingMethods mVRouteSortingMethods = this.sortingMethod;
        if (mVRouteSortingMethods == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRouteSortingMethods);
        }
        n.append(", ");
        n.append("viewType:");
        MVViewType mVViewType = this.viewType;
        if (mVViewType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVViewType);
        }
        n.append(")");
        return n.toString();
    }
}
