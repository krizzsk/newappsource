package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVPurchaseFilter implements TBase<MVPurchaseFilter, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseFilter> {

    /* renamed from: b */
    public static final C25113c f28831b = new C25113c("filterId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28832c = new C25113c("icon", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28833d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28834e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28835f = new C25113c("confirmation", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f28836g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28837h;
    public MVConfirmation confirmation;
    public String filterId;
    public MVImageReferenceWithParams icon;
    private _Fields[] optionals = {_Fields.ICON, _Fields.TITLE, _Fields.SUBTITLE, _Fields.CONFIRMATION};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        FILTER_ID(1, "filterId"),
        ICON(2, "icon"),
        TITLE(3, "title"),
        SUBTITLE(4, "subtitle"),
        CONFIRMATION(5, "confirmation");
        
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
                return FILTER_ID;
            }
            if (i == 2) {
                return ICON;
            }
            if (i == 3) {
                return TITLE;
            }
            if (i == 4) {
                return SUBTITLE;
            }
            if (i != 5) {
                return null;
            }
            return CONFIRMATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilter$a */
    public static class C10882a extends C25239c<MVPurchaseFilter> {
        public C10882a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFilter mVPurchaseFilter = (MVPurchaseFilter) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVPurchaseFilter.icon;
            C25113c cVar = MVPurchaseFilter.f28831b;
            gVar.mo61687K();
            if (mVPurchaseFilter.filterId != null) {
                gVar.mo61711x(MVPurchaseFilter.f28831b);
                gVar.mo61686J(mVPurchaseFilter.filterId);
                gVar.mo61712y();
            }
            if (mVPurchaseFilter.icon != null && mVPurchaseFilter.mo32573h()) {
                gVar.mo61711x(MVPurchaseFilter.f28832c);
                mVPurchaseFilter.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseFilter.title != null && mVPurchaseFilter.mo32576j()) {
                gVar.mo61711x(MVPurchaseFilter.f28833d);
                gVar.mo61686J(mVPurchaseFilter.title);
                gVar.mo61712y();
            }
            if (mVPurchaseFilter.subtitle != null && mVPurchaseFilter.mo32575i()) {
                gVar.mo61711x(MVPurchaseFilter.f28834e);
                gVar.mo61686J(mVPurchaseFilter.subtitle);
                gVar.mo61712y();
            }
            if (mVPurchaseFilter.confirmation != null && mVPurchaseFilter.mo32571f()) {
                gVar.mo61711x(MVPurchaseFilter.f28835f);
                mVPurchaseFilter.confirmation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFilter mVPurchaseFilter = (MVPurchaseFilter) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVPurchaseFilter.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVConfirmation mVConfirmation = new MVConfirmation();
                                    mVPurchaseFilter.confirmation = mVConfirmation;
                                    mVConfirmation.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVPurchaseFilter.subtitle = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVPurchaseFilter.title = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVPurchaseFilter.icon = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPurchaseFilter.filterId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilter$b */
    public static class C10883b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10882a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilter$c */
    public static class C10884c extends C25240d<MVPurchaseFilter> {
        public C10884c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFilter mVPurchaseFilter = (MVPurchaseFilter) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseFilter.mo32572g()) {
                bitSet.set(0);
            }
            if (mVPurchaseFilter.mo32573h()) {
                bitSet.set(1);
            }
            if (mVPurchaseFilter.mo32576j()) {
                bitSet.set(2);
            }
            if (mVPurchaseFilter.mo32575i()) {
                bitSet.set(3);
            }
            if (mVPurchaseFilter.mo32571f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPurchaseFilter.mo32572g()) {
                jVar.mo61686J(mVPurchaseFilter.filterId);
            }
            if (mVPurchaseFilter.mo32573h()) {
                mVPurchaseFilter.icon.mo25202X0(jVar);
            }
            if (mVPurchaseFilter.mo32576j()) {
                jVar.mo61686J(mVPurchaseFilter.title);
            }
            if (mVPurchaseFilter.mo32575i()) {
                jVar.mo61686J(mVPurchaseFilter.subtitle);
            }
            if (mVPurchaseFilter.mo32571f()) {
                mVPurchaseFilter.confirmation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFilter mVPurchaseFilter = (MVPurchaseFilter) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPurchaseFilter.filterId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVPurchaseFilter.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPurchaseFilter.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPurchaseFilter.subtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVConfirmation mVConfirmation = new MVConfirmation();
                mVPurchaseFilter.confirmation = mVConfirmation;
                mVConfirmation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilter$d */
    public static class C10885d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10884c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseFilter");
        HashMap hashMap = new HashMap();
        f28836g = hashMap;
        hashMap.put(C25239c.class, new C10883b());
        hashMap.put(C25240d.class, new C10885d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FILTER_ID, new FieldMetaData("filterId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CONFIRMATION, new FieldMetaData("confirmation", (byte) 2, new StructMetaData(MVConfirmation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28837h = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseFilter.class, unmodifiableMap);
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
        ((C25238b) f28836g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28836g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseFilter mVPurchaseFilter = (MVPurchaseFilter) obj;
        if (!getClass().equals(mVPurchaseFilter.getClass())) {
            return getClass().getName().compareTo(mVPurchaseFilter.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32572g()).compareTo(Boolean.valueOf(mVPurchaseFilter.mo32572g()));
        if (compareTo2 != 0 || ((mo32572g() && (compareTo2 = this.filterId.compareTo(mVPurchaseFilter.filterId)) != 0) || (compareTo2 = Boolean.valueOf(mo32573h()).compareTo(Boolean.valueOf(mVPurchaseFilter.mo32573h()))) != 0 || ((mo32573h() && (compareTo2 = this.icon.compareTo(mVPurchaseFilter.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo32576j()).compareTo(Boolean.valueOf(mVPurchaseFilter.mo32576j()))) != 0 || ((mo32576j() && (compareTo2 = this.title.compareTo(mVPurchaseFilter.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32575i()).compareTo(Boolean.valueOf(mVPurchaseFilter.mo32575i()))) != 0 || ((mo32575i() && (compareTo2 = this.subtitle.compareTo(mVPurchaseFilter.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo32571f()).compareTo(Boolean.valueOf(mVPurchaseFilter.mo32571f()))) != 0))))) {
            return compareTo2;
        }
        if (!mo32571f() || (compareTo = this.confirmation.compareTo(mVPurchaseFilter.confirmation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseFilter)) {
            return false;
        }
        MVPurchaseFilter mVPurchaseFilter = (MVPurchaseFilter) obj;
        boolean g = mo32572g();
        boolean g2 = mVPurchaseFilter.mo32572g();
        if ((g || g2) && (!g || !g2 || !this.filterId.equals(mVPurchaseFilter.filterId))) {
            return false;
        }
        boolean h = mo32573h();
        boolean h2 = mVPurchaseFilter.mo32573h();
        if ((h || h2) && (!h || !h2 || !this.icon.mo26245a(mVPurchaseFilter.icon))) {
            return false;
        }
        boolean j = mo32576j();
        boolean j2 = mVPurchaseFilter.mo32576j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVPurchaseFilter.title))) {
            return false;
        }
        boolean i = mo32575i();
        boolean i2 = mVPurchaseFilter.mo32575i();
        if ((i || i2) && (!i || !i2 || !this.subtitle.equals(mVPurchaseFilter.subtitle))) {
            return false;
        }
        boolean f = mo32571f();
        boolean f2 = mVPurchaseFilter.mo32571f();
        if ((f || f2) && (!f || !f2 || !this.confirmation.mo32366a(mVPurchaseFilter.confirmation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32571f() {
        return this.confirmation != null;
    }

    /* renamed from: g */
    public final boolean mo32572g() {
        return this.filterId != null;
    }

    /* renamed from: h */
    public final boolean mo32573h() {
        return this.icon != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32575i() {
        return this.subtitle != null;
    }

    /* renamed from: j */
    public final boolean mo32576j() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseFilter(", "filterId:");
        String str = this.filterId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo32573h()) {
            n.append(", ");
            n.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo32576j()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo32575i()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo32571f()) {
            n.append(", ");
            n.append("confirmation:");
            MVConfirmation mVConfirmation = this.confirmation;
            if (mVConfirmation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVConfirmation);
            }
        }
        n.append(")");
        return n.toString();
    }
}
