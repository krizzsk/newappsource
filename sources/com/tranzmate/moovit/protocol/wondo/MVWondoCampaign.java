package com.tranzmate.moovit.protocol.wondo;

import com.appboy.models.outgoing.AttributionData;
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

public class MVWondoCampaign implements TBase<MVWondoCampaign, _Fields>, Serializable, Cloneable, Comparable<MVWondoCampaign> {

    /* renamed from: b */
    public static final C25113c f30674b = new C25113c("label", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30675c = new C25113c(AttributionData.CAMPAIGN_KEY, (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f30676d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30677e;
    public MVWondoConfirmation campaign;
    public String label;

    public enum _Fields implements C25085c {
        LABEL(1, "label"),
        CAMPAIGN(2, AttributionData.CAMPAIGN_KEY);
        
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
                return LABEL;
            }
            if (i != 2) {
                return null;
            }
            return CAMPAIGN;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCampaign$a */
    public static class C12013a extends C25239c<MVWondoCampaign> {
        public C12013a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoCampaign mVWondoCampaign = (MVWondoCampaign) tBase;
            MVWondoConfirmation mVWondoConfirmation = mVWondoCampaign.campaign;
            if (mVWondoConfirmation != null) {
                mVWondoConfirmation.mo35648k();
            }
            C25113c cVar = MVWondoCampaign.f30674b;
            gVar.mo61687K();
            if (mVWondoCampaign.label != null) {
                gVar.mo61711x(MVWondoCampaign.f30674b);
                gVar.mo61686J(mVWondoCampaign.label);
                gVar.mo61712y();
            }
            if (mVWondoCampaign.campaign != null) {
                gVar.mo61711x(MVWondoCampaign.f30675c);
                mVWondoCampaign.campaign.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoCampaign mVWondoCampaign = (MVWondoCampaign) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVWondoConfirmation mVWondoConfirmation = new MVWondoConfirmation();
                        mVWondoCampaign.campaign = mVWondoConfirmation;
                        mVWondoConfirmation.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVWondoCampaign.label = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVWondoConfirmation mVWondoConfirmation2 = mVWondoCampaign.campaign;
            if (mVWondoConfirmation2 != null) {
                mVWondoConfirmation2.mo35648k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCampaign$b */
    public static class C12014b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12013a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCampaign$c */
    public static class C12015c extends C25240d<MVWondoCampaign> {
        public C12015c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoCampaign mVWondoCampaign = (MVWondoCampaign) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoCampaign.mo35604g()) {
                bitSet.set(0);
            }
            if (mVWondoCampaign.mo35603f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVWondoCampaign.mo35604g()) {
                jVar.mo61686J(mVWondoCampaign.label);
            }
            if (mVWondoCampaign.mo35603f()) {
                mVWondoCampaign.campaign.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoCampaign mVWondoCampaign = (MVWondoCampaign) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVWondoCampaign.label = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVWondoConfirmation mVWondoConfirmation = new MVWondoConfirmation();
                mVWondoCampaign.campaign = mVWondoConfirmation;
                mVWondoConfirmation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCampaign$d */
    public static class C12016d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12015c(0);
        }
    }

    static {
        new C17394d0("MVWondoCampaign");
        HashMap hashMap = new HashMap();
        f30676d = hashMap;
        hashMap.put(C25239c.class, new C12014b());
        hashMap.put(C25240d.class, new C12016d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LABEL, new FieldMetaData("label", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CAMPAIGN, new FieldMetaData(AttributionData.CAMPAIGN_KEY, (byte) 3, new StructMetaData(MVWondoConfirmation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30677e = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoCampaign.class, unmodifiableMap);
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
        ((C25238b) f30676d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30676d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoCampaign mVWondoCampaign = (MVWondoCampaign) obj;
        if (!getClass().equals(mVWondoCampaign.getClass())) {
            return getClass().getName().compareTo(mVWondoCampaign.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35604g()).compareTo(Boolean.valueOf(mVWondoCampaign.mo35604g()));
        if (compareTo2 != 0 || ((mo35604g() && (compareTo2 = this.label.compareTo(mVWondoCampaign.label)) != 0) || (compareTo2 = Boolean.valueOf(mo35603f()).compareTo(Boolean.valueOf(mVWondoCampaign.mo35603f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35603f() || (compareTo = this.campaign.compareTo(mVWondoCampaign.campaign)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWondoCampaign)) {
            return false;
        }
        MVWondoCampaign mVWondoCampaign = (MVWondoCampaign) obj;
        boolean g = mo35604g();
        boolean g2 = mVWondoCampaign.mo35604g();
        if ((g || g2) && (!g || !g2 || !this.label.equals(mVWondoCampaign.label))) {
            return false;
        }
        boolean f = mo35603f();
        boolean f2 = mVWondoCampaign.mo35603f();
        if ((f || f2) && (!f || !f2 || !this.campaign.mo35639a(mVWondoCampaign.campaign))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35603f() {
        return this.campaign != null;
    }

    /* renamed from: g */
    public final boolean mo35604g() {
        return this.label != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoCampaign(", "label:");
        String str = this.label;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("campaign:");
        MVWondoConfirmation mVWondoConfirmation = this.campaign;
        if (mVWondoConfirmation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWondoConfirmation);
        }
        n.append(")");
        return n.toString();
    }
}
