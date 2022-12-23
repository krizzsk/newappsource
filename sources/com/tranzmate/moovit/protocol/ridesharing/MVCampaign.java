package com.tranzmate.moovit.protocol.ridesharing;

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
import p001a0.C0016g;
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

public class MVCampaign implements TBase<MVCampaign, _Fields>, Serializable, Cloneable, Comparable<MVCampaign> {

    /* renamed from: b */
    public static final C25113c f27977b = new C25113c("campaignId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27978c = new C25113c("campaignHtml", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27979d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27980e;
    private byte __isset_bitfield = 0;
    public String campaignHtml;
    public int campaignId;

    public enum _Fields implements C25085c {
        CAMPAIGN_ID(1, "campaignId"),
        CAMPAIGN_HTML(2, "campaignHtml");
        
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
                return CAMPAIGN_ID;
            }
            if (i != 2) {
                return null;
            }
            return CAMPAIGN_HTML;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVCampaign$a */
    public static class C10274a extends C25239c<MVCampaign> {
        public C10274a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCampaign mVCampaign = (MVCampaign) tBase;
            mVCampaign.getClass();
            C25113c cVar = MVCampaign.f27977b;
            gVar.mo61687K();
            gVar.mo61711x(MVCampaign.f27977b);
            gVar.mo61678B(mVCampaign.campaignId);
            gVar.mo61712y();
            if (mVCampaign.campaignHtml != null) {
                gVar.mo61711x(MVCampaign.f27978c);
                gVar.mo61686J(mVCampaign.campaignHtml);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCampaign mVCampaign = (MVCampaign) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCampaign.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVCampaign.campaignHtml = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVCampaign.campaignId = gVar.mo61696i();
                    mVCampaign.mo31107h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVCampaign$b */
    public static class C10275b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10274a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVCampaign$c */
    public static class C10276c extends C25240d<MVCampaign> {
        public C10276c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCampaign mVCampaign = (MVCampaign) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCampaign.mo31106g()) {
                bitSet.set(0);
            }
            if (mVCampaign.mo31105f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCampaign.mo31106g()) {
                jVar.mo61678B(mVCampaign.campaignId);
            }
            if (mVCampaign.mo31105f()) {
                jVar.mo61686J(mVCampaign.campaignHtml);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCampaign mVCampaign = (MVCampaign) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVCampaign.campaignId = jVar.mo61696i();
                mVCampaign.mo31107h();
            }
            if (T.get(1)) {
                mVCampaign.campaignHtml = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVCampaign$d */
    public static class C10277d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10276c(0);
        }
    }

    static {
        new C17394d0("MVCampaign");
        HashMap hashMap = new HashMap();
        f27979d = hashMap;
        hashMap.put(C25239c.class, new C10275b());
        hashMap.put(C25240d.class, new C10277d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CAMPAIGN_ID, new FieldMetaData("campaignId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.CAMPAIGN_HTML, new FieldMetaData("campaignHtml", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27980e = unmodifiableMap;
        FieldMetaData.m61947a(MVCampaign.class, unmodifiableMap);
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
        ((C25238b) f27979d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27979d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31102a(MVCampaign mVCampaign) {
        if (mVCampaign == null || this.campaignId != mVCampaign.campaignId) {
            return false;
        }
        boolean f = mo31105f();
        boolean f2 = mVCampaign.mo31105f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.campaignHtml.equals(mVCampaign.campaignHtml)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCampaign mVCampaign = (MVCampaign) obj;
        if (!getClass().equals(mVCampaign.getClass())) {
            return getClass().getName().compareTo(mVCampaign.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31106g()).compareTo(Boolean.valueOf(mVCampaign.mo31106g()));
        if (compareTo2 != 0 || ((mo31106g() && (compareTo2 = C25082a.m62839c(this.campaignId, mVCampaign.campaignId)) != 0) || (compareTo2 = Boolean.valueOf(mo31105f()).compareTo(Boolean.valueOf(mVCampaign.mo31105f()))) != 0)) {
            return compareTo2;
        }
        if (!mo31105f() || (compareTo = this.campaignHtml.compareTo(mVCampaign.campaignHtml)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCampaign)) {
            return mo31102a((MVCampaign) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31105f() {
        return this.campaignHtml != null;
    }

    /* renamed from: g */
    public final boolean mo31106g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo31107h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCampaign(", "campaignId:");
        C0016g.m42z(n, this.campaignId, ", ", "campaignHtml:");
        String str = this.campaignHtml;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
