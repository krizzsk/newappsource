package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVPurchaseTypeSelectionStep implements TBase<MVPurchaseTypeSelectionStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseTypeSelectionStep> {

    /* renamed from: b */
    public static final C25113c f29072b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29073c = new C25113c("types", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f29074d = new C25113c("agencyKey", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f29075e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29076f;
    public String agencyKey;
    private _Fields[] optionals = {_Fields.TITLE};
    public String title;
    public List<MVPurchaseType> types;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        TYPES(2, "types"),
        AGENCY_KEY(3, "agencyKey");
        
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
                return TITLE;
            }
            if (i == 2) {
                return TYPES;
            }
            if (i != 3) {
                return null;
            }
            return AGENCY_KEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTypeSelectionStep$a */
    public static class C11013a extends C25239c<MVPurchaseTypeSelectionStep> {
        public C11013a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTypeSelectionStep mVPurchaseTypeSelectionStep = (MVPurchaseTypeSelectionStep) tBase;
            mVPurchaseTypeSelectionStep.getClass();
            C25113c cVar = MVPurchaseTypeSelectionStep.f29072b;
            gVar.mo61687K();
            if (mVPurchaseTypeSelectionStep.title != null && mVPurchaseTypeSelectionStep.mo32904g()) {
                gVar.mo61711x(MVPurchaseTypeSelectionStep.f29072b);
                gVar.mo61686J(mVPurchaseTypeSelectionStep.title);
                gVar.mo61712y();
            }
            if (mVPurchaseTypeSelectionStep.types != null) {
                gVar.mo61711x(MVPurchaseTypeSelectionStep.f29073c);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseTypeSelectionStep.types.size()));
                for (MVPurchaseType X0 : mVPurchaseTypeSelectionStep.types) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseTypeSelectionStep.agencyKey != null) {
                gVar.mo61711x(MVPurchaseTypeSelectionStep.f29074d);
                gVar.mo61686J(mVPurchaseTypeSelectionStep.agencyKey);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTypeSelectionStep mVPurchaseTypeSelectionStep = (MVPurchaseTypeSelectionStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseTypeSelectionStep.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVPurchaseTypeSelectionStep.agencyKey = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVPurchaseTypeSelectionStep.types = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVPurchaseType mVPurchaseType = new MVPurchaseType();
                            mVPurchaseType.mo25201C1(gVar);
                            mVPurchaseTypeSelectionStep.types.add(mVPurchaseType);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPurchaseTypeSelectionStep.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTypeSelectionStep$b */
    public static class C11014b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11013a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTypeSelectionStep$c */
    public static class C11015c extends C25240d<MVPurchaseTypeSelectionStep> {
        public C11015c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTypeSelectionStep mVPurchaseTypeSelectionStep = (MVPurchaseTypeSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseTypeSelectionStep.mo32904g()) {
                bitSet.set(0);
            }
            if (mVPurchaseTypeSelectionStep.mo32905h()) {
                bitSet.set(1);
            }
            if (mVPurchaseTypeSelectionStep.mo32903f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPurchaseTypeSelectionStep.mo32904g()) {
                jVar.mo61686J(mVPurchaseTypeSelectionStep.title);
            }
            if (mVPurchaseTypeSelectionStep.mo32905h()) {
                jVar.mo61678B(mVPurchaseTypeSelectionStep.types.size());
                for (MVPurchaseType X0 : mVPurchaseTypeSelectionStep.types) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseTypeSelectionStep.mo32903f()) {
                jVar.mo61686J(mVPurchaseTypeSelectionStep.agencyKey);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseTypeSelectionStep mVPurchaseTypeSelectionStep = (MVPurchaseTypeSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPurchaseTypeSelectionStep.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPurchaseTypeSelectionStep.types = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPurchaseType mVPurchaseType = new MVPurchaseType();
                    mVPurchaseType.mo25201C1(jVar);
                    mVPurchaseTypeSelectionStep.types.add(mVPurchaseType);
                }
            }
            if (T.get(2)) {
                mVPurchaseTypeSelectionStep.agencyKey = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTypeSelectionStep$d */
    public static class C11016d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11015c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseTypeSelectionStep");
        HashMap hashMap = new HashMap();
        f29075e = hashMap;
        hashMap.put(C25239c.class, new C11014b());
        hashMap.put(C25240d.class, new C11016d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TYPES, new FieldMetaData("types", (byte) 3, new ListMetaData(new StructMetaData(MVPurchaseType.class))));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29076f = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseTypeSelectionStep.class, unmodifiableMap);
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
        ((C25238b) f29075e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29075e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseTypeSelectionStep mVPurchaseTypeSelectionStep = (MVPurchaseTypeSelectionStep) obj;
        if (!getClass().equals(mVPurchaseTypeSelectionStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseTypeSelectionStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32904g()).compareTo(Boolean.valueOf(mVPurchaseTypeSelectionStep.mo32904g()));
        if (compareTo2 != 0 || ((mo32904g() && (compareTo2 = this.title.compareTo(mVPurchaseTypeSelectionStep.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32905h()).compareTo(Boolean.valueOf(mVPurchaseTypeSelectionStep.mo32905h()))) != 0 || ((mo32905h() && (compareTo2 = C25082a.m62844h(this.types, mVPurchaseTypeSelectionStep.types)) != 0) || (compareTo2 = Boolean.valueOf(mo32903f()).compareTo(Boolean.valueOf(mVPurchaseTypeSelectionStep.mo32903f()))) != 0))) {
            return compareTo2;
        }
        if (!mo32903f() || (compareTo = this.agencyKey.compareTo(mVPurchaseTypeSelectionStep.agencyKey)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseTypeSelectionStep)) {
            return false;
        }
        MVPurchaseTypeSelectionStep mVPurchaseTypeSelectionStep = (MVPurchaseTypeSelectionStep) obj;
        boolean g = mo32904g();
        boolean g2 = mVPurchaseTypeSelectionStep.mo32904g();
        if ((g || g2) && (!g || !g2 || !this.title.equals(mVPurchaseTypeSelectionStep.title))) {
            return false;
        }
        boolean h = mo32905h();
        boolean h2 = mVPurchaseTypeSelectionStep.mo32905h();
        if ((h || h2) && (!h || !h2 || !this.types.equals(mVPurchaseTypeSelectionStep.types))) {
            return false;
        }
        boolean f = mo32903f();
        boolean f2 = mVPurchaseTypeSelectionStep.mo32903f();
        if ((f || f2) && (!f || !f2 || !this.agencyKey.equals(mVPurchaseTypeSelectionStep.agencyKey))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32903f() {
        return this.agencyKey != null;
    }

    /* renamed from: g */
    public final boolean mo32904g() {
        return this.title != null;
    }

    /* renamed from: h */
    public final boolean mo32905h() {
        return this.types != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPurchaseTypeSelectionStep(");
        if (mo32904g()) {
            sb.append("title:");
            String str = this.title;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("types:");
        List<MVPurchaseType> list = this.types;
        if (list == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(list);
        }
        sb.append(", ");
        sb.append("agencyKey:");
        String str2 = this.agencyKey;
        if (str2 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }
}
