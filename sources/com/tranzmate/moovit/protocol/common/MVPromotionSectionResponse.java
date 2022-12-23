package com.tranzmate.moovit.protocol.common;

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

public class MVPromotionSectionResponse implements TBase<MVPromotionSectionResponse, _Fields>, Serializable, Cloneable, Comparable<MVPromotionSectionResponse> {

    /* renamed from: b */
    public static final C25113c f25123b = new C25113c("sectionTitle", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25124c = new C25113c("promotions", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f25125d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25126e;
    public List<MVPromotion> promotions;
    public String sectionTitle;

    public enum _Fields implements C25085c {
        SECTION_TITLE(1, "sectionTitle"),
        PROMOTIONS(2, "promotions");
        
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
                return SECTION_TITLE;
            }
            if (i != 2) {
                return null;
            }
            return PROMOTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPromotionSectionResponse$a */
    public static class C8484a extends C25239c<MVPromotionSectionResponse> {
        public C8484a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPromotionSectionResponse mVPromotionSectionResponse = (MVPromotionSectionResponse) tBase;
            mVPromotionSectionResponse.getClass();
            C25113c cVar = MVPromotionSectionResponse.f25123b;
            gVar.mo61687K();
            if (mVPromotionSectionResponse.sectionTitle != null) {
                gVar.mo61711x(MVPromotionSectionResponse.f25123b);
                gVar.mo61686J(mVPromotionSectionResponse.sectionTitle);
                gVar.mo61712y();
            }
            if (mVPromotionSectionResponse.promotions != null) {
                gVar.mo61711x(MVPromotionSectionResponse.f25124c);
                gVar.mo61680D(new C25119e((byte) 12, mVPromotionSectionResponse.promotions.size()));
                for (MVPromotion X0 : mVPromotionSectionResponse.promotions) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPromotionSectionResponse mVPromotionSectionResponse = (MVPromotionSectionResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPromotionSectionResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVPromotionSectionResponse.promotions = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVPromotion mVPromotion = new MVPromotion();
                            mVPromotion.mo25201C1(gVar);
                            mVPromotionSectionResponse.promotions.add(mVPromotion);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPromotionSectionResponse.sectionTitle = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPromotionSectionResponse$b */
    public static class C8485b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8484a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPromotionSectionResponse$c */
    public static class C8486c extends C25240d<MVPromotionSectionResponse> {
        public C8486c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPromotionSectionResponse mVPromotionSectionResponse = (MVPromotionSectionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPromotionSectionResponse.mo26370g()) {
                bitSet.set(0);
            }
            if (mVPromotionSectionResponse.mo26369f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPromotionSectionResponse.mo26370g()) {
                jVar.mo61686J(mVPromotionSectionResponse.sectionTitle);
            }
            if (mVPromotionSectionResponse.mo26369f()) {
                jVar.mo61678B(mVPromotionSectionResponse.promotions.size());
                for (MVPromotion X0 : mVPromotionSectionResponse.promotions) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPromotionSectionResponse mVPromotionSectionResponse = (MVPromotionSectionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPromotionSectionResponse.sectionTitle = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPromotionSectionResponse.promotions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPromotion mVPromotion = new MVPromotion();
                    mVPromotion.mo25201C1(jVar);
                    mVPromotionSectionResponse.promotions.add(mVPromotion);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVPromotionSectionResponse$d */
    public static class C8487d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8486c(0);
        }
    }

    static {
        new C17394d0("MVPromotionSectionResponse");
        HashMap hashMap = new HashMap();
        f25125d = hashMap;
        hashMap.put(C25239c.class, new C8485b());
        hashMap.put(C25240d.class, new C8487d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SECTION_TITLE, new FieldMetaData("sectionTitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROMOTIONS, new FieldMetaData("promotions", (byte) 3, new ListMetaData(new StructMetaData(MVPromotion.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25126e = unmodifiableMap;
        FieldMetaData.m61947a(MVPromotionSectionResponse.class, unmodifiableMap);
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
        ((C25238b) f25125d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25125d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPromotionSectionResponse mVPromotionSectionResponse = (MVPromotionSectionResponse) obj;
        if (!getClass().equals(mVPromotionSectionResponse.getClass())) {
            return getClass().getName().compareTo(mVPromotionSectionResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26370g()).compareTo(Boolean.valueOf(mVPromotionSectionResponse.mo26370g()));
        if (compareTo != 0 || ((mo26370g() && (compareTo = this.sectionTitle.compareTo(mVPromotionSectionResponse.sectionTitle)) != 0) || (compareTo = Boolean.valueOf(mo26369f()).compareTo(Boolean.valueOf(mVPromotionSectionResponse.mo26369f()))) != 0)) {
            return compareTo;
        }
        if (!mo26369f() || (h = C25082a.m62844h(this.promotions, mVPromotionSectionResponse.promotions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPromotionSectionResponse)) {
            return false;
        }
        MVPromotionSectionResponse mVPromotionSectionResponse = (MVPromotionSectionResponse) obj;
        boolean g = mo26370g();
        boolean g2 = mVPromotionSectionResponse.mo26370g();
        if ((g || g2) && (!g || !g2 || !this.sectionTitle.equals(mVPromotionSectionResponse.sectionTitle))) {
            return false;
        }
        boolean f = mo26369f();
        boolean f2 = mVPromotionSectionResponse.mo26369f();
        if ((f || f2) && (!f || !f2 || !this.promotions.equals(mVPromotionSectionResponse.promotions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26369f() {
        return this.promotions != null;
    }

    /* renamed from: g */
    public final boolean mo26370g() {
        return this.sectionTitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPromotionSectionResponse(", "sectionTitle:");
        String str = this.sectionTitle;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("promotions:");
        List<MVPromotion> list = this.promotions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
