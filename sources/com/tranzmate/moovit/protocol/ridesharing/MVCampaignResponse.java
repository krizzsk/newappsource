package com.tranzmate.moovit.protocol.ridesharing;

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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVCampaignResponse implements TBase<MVCampaignResponse, _Fields>, Serializable, Cloneable, Comparable<MVCampaignResponse> {

    /* renamed from: b */
    public static final C25113c f27981b = new C25113c(AttributionData.CAMPAIGN_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27982c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27983d;
    public MVCampaign campaign;
    private _Fields[] optionals = {_Fields.CAMPAIGN};

    public enum _Fields implements C25085c {
        CAMPAIGN(1, AttributionData.CAMPAIGN_KEY);
        
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVCampaignResponse$a */
    public static class C10278a extends C25239c<MVCampaignResponse> {
        public C10278a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCampaignResponse mVCampaignResponse = (MVCampaignResponse) tBase;
            MVCampaign mVCampaign = mVCampaignResponse.campaign;
            C25113c cVar = MVCampaignResponse.f27981b;
            gVar.mo61687K();
            if (mVCampaignResponse.campaign != null && mVCampaignResponse.mo31113f()) {
                gVar.mo61711x(MVCampaignResponse.f27981b);
                mVCampaignResponse.campaign.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCampaignResponse mVCampaignResponse = (MVCampaignResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCampaign mVCampaign = mVCampaignResponse.campaign;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVCampaign mVCampaign2 = new MVCampaign();
                    mVCampaignResponse.campaign = mVCampaign2;
                    mVCampaign2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVCampaignResponse$b */
    public static class C10279b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10278a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVCampaignResponse$c */
    public static class C10280c extends C25240d<MVCampaignResponse> {
        public C10280c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCampaignResponse mVCampaignResponse = (MVCampaignResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCampaignResponse.mo31113f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVCampaignResponse.mo31113f()) {
                mVCampaignResponse.campaign.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCampaignResponse mVCampaignResponse = (MVCampaignResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVCampaign mVCampaign = new MVCampaign();
                mVCampaignResponse.campaign = mVCampaign;
                mVCampaign.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVCampaignResponse$d */
    public static class C10281d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10280c(0);
        }
    }

    static {
        new C17394d0("MVCampaignResponse");
        HashMap hashMap = new HashMap();
        f27982c = hashMap;
        hashMap.put(C25239c.class, new C10279b());
        hashMap.put(C25240d.class, new C10281d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CAMPAIGN, new FieldMetaData(AttributionData.CAMPAIGN_KEY, (byte) 2, new StructMetaData(MVCampaign.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27983d = unmodifiableMap;
        FieldMetaData.m61947a(MVCampaignResponse.class, unmodifiableMap);
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
        ((C25238b) f27982c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27982c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCampaignResponse mVCampaignResponse = (MVCampaignResponse) obj;
        if (!getClass().equals(mVCampaignResponse.getClass())) {
            return getClass().getName().compareTo(mVCampaignResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31113f()).compareTo(Boolean.valueOf(mVCampaignResponse.mo31113f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo31113f() || (compareTo = this.campaign.compareTo(mVCampaignResponse.campaign)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCampaignResponse)) {
            return false;
        }
        MVCampaignResponse mVCampaignResponse = (MVCampaignResponse) obj;
        boolean f = mo31113f();
        boolean f2 = mVCampaignResponse.mo31113f();
        if ((f || f2) && (!f || !f2 || !this.campaign.mo31102a(mVCampaignResponse.campaign))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31113f() {
        return this.campaign != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVCampaignResponse(");
        if (mo31113f()) {
            sb.append("campaign:");
            MVCampaign mVCampaign = this.campaign;
            if (mVCampaign == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVCampaign);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
