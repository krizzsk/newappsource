package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.google.android.gms.common.Scopes;
import com.usebutton.sdk.internal.api.AppActionRequest;
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
import p389bl.C13637c;
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

public class MVPTBGetActivationPriceResponseV2 implements TBase<MVPTBGetActivationPriceResponseV2, _Fields>, Serializable, Cloneable, Comparable<MVPTBGetActivationPriceResponseV2> {

    /* renamed from: b */
    public static final C25113c f27918b = new C25113c(AppActionRequest.KEY_CONTEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27919c = new C25113c("fares", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f27920d = new C25113c(Scopes.PROFILE, (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27921e = new C25113c("agencyId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f27922f = new C25113c("regions", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f27923g = new C25113c("estimatedLine", (byte) 12, 6);

    /* renamed from: h */
    public static final HashMap f27924h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f27925i;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public String context;
    public MVPTBEstimatedLine estimatedLine;
    public List<MVPTBFare> fares;
    private _Fields[] optionals = {_Fields.AGENCY_ID, _Fields.ESTIMATED_LINE};
    public String profile;
    public List<MVPTBRegion> regions;

    public enum _Fields implements C25085c {
        CONTEXT(1, AppActionRequest.KEY_CONTEXT),
        FARES(2, "fares"),
        PROFILE(3, Scopes.PROFILE),
        AGENCY_ID(4, "agencyId"),
        REGIONS(5, "regions"),
        ESTIMATED_LINE(6, "estimatedLine");
        
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
            switch (i) {
                case 1:
                    return CONTEXT;
                case 2:
                    return FARES;
                case 3:
                    return PROFILE;
                case 4:
                    return AGENCY_ID;
                case 5:
                    return REGIONS;
                case 6:
                    return ESTIMATED_LINE;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceResponseV2$a */
    public static class C10226a extends C25239c<MVPTBGetActivationPriceResponseV2> {
        public C10226a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetActivationPriceResponseV2 mVPTBGetActivationPriceResponseV2 = (MVPTBGetActivationPriceResponseV2) tBase;
            MVPTBEstimatedLine mVPTBEstimatedLine = mVPTBGetActivationPriceResponseV2.estimatedLine;
            C25113c cVar = MVPTBGetActivationPriceResponseV2.f27918b;
            gVar.mo61687K();
            if (mVPTBGetActivationPriceResponseV2.context != null) {
                gVar.mo61711x(MVPTBGetActivationPriceResponseV2.f27918b);
                gVar.mo61686J(mVPTBGetActivationPriceResponseV2.context);
                gVar.mo61712y();
            }
            if (mVPTBGetActivationPriceResponseV2.fares != null) {
                gVar.mo61711x(MVPTBGetActivationPriceResponseV2.f27919c);
                gVar.mo61680D(new C25119e((byte) 12, mVPTBGetActivationPriceResponseV2.fares.size()));
                for (MVPTBFare X0 : mVPTBGetActivationPriceResponseV2.fares) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPTBGetActivationPriceResponseV2.profile != null) {
                gVar.mo61711x(MVPTBGetActivationPriceResponseV2.f27920d);
                gVar.mo61686J(mVPTBGetActivationPriceResponseV2.profile);
                gVar.mo61712y();
            }
            if (mVPTBGetActivationPriceResponseV2.mo30995f()) {
                gVar.mo61711x(MVPTBGetActivationPriceResponseV2.f27921e);
                gVar.mo61678B(mVPTBGetActivationPriceResponseV2.agencyId);
                gVar.mo61712y();
            }
            if (mVPTBGetActivationPriceResponseV2.regions != null) {
                gVar.mo61711x(MVPTBGetActivationPriceResponseV2.f27922f);
                gVar.mo61680D(new C25119e((byte) 12, mVPTBGetActivationPriceResponseV2.regions.size()));
                for (MVPTBRegion X02 : mVPTBGetActivationPriceResponseV2.regions) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPTBGetActivationPriceResponseV2.estimatedLine != null && mVPTBGetActivationPriceResponseV2.mo30997h()) {
                gVar.mo61711x(MVPTBGetActivationPriceResponseV2.f27923g);
                mVPTBGetActivationPriceResponseV2.estimatedLine.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetActivationPriceResponseV2 mVPTBGetActivationPriceResponseV2 = (MVPTBGetActivationPriceResponseV2) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPTBEstimatedLine mVPTBEstimatedLine = mVPTBGetActivationPriceResponseV2.estimatedLine;
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBGetActivationPriceResponseV2.context = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPTBGetActivationPriceResponseV2.fares = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVPTBFare mVPTBFare = new MVPTBFare();
                                mVPTBFare.mo25201C1(gVar);
                                mVPTBGetActivationPriceResponseV2.fares.add(mVPTBFare);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBGetActivationPriceResponseV2.profile = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBGetActivationPriceResponseV2.agencyId = gVar.mo61696i();
                            mVPTBGetActivationPriceResponseV2.mo31002l();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVPTBGetActivationPriceResponseV2.regions = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVPTBRegion mVPTBRegion = new MVPTBRegion();
                                mVPTBRegion.mo25201C1(gVar);
                                mVPTBGetActivationPriceResponseV2.regions.add(mVPTBRegion);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPTBEstimatedLine mVPTBEstimatedLine2 = new MVPTBEstimatedLine();
                            mVPTBGetActivationPriceResponseV2.estimatedLine = mVPTBEstimatedLine2;
                            mVPTBEstimatedLine2.mo25201C1(gVar);
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceResponseV2$b */
    public static class C10227b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10226a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceResponseV2$c */
    public static class C10228c extends C25240d<MVPTBGetActivationPriceResponseV2> {
        public C10228c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetActivationPriceResponseV2 mVPTBGetActivationPriceResponseV2 = (MVPTBGetActivationPriceResponseV2) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBGetActivationPriceResponseV2.mo30996g()) {
                bitSet.set(0);
            }
            if (mVPTBGetActivationPriceResponseV2.mo30999i()) {
                bitSet.set(1);
            }
            if (mVPTBGetActivationPriceResponseV2.mo31000j()) {
                bitSet.set(2);
            }
            if (mVPTBGetActivationPriceResponseV2.mo30995f()) {
                bitSet.set(3);
            }
            if (mVPTBGetActivationPriceResponseV2.mo31001k()) {
                bitSet.set(4);
            }
            if (mVPTBGetActivationPriceResponseV2.mo30997h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVPTBGetActivationPriceResponseV2.mo30996g()) {
                jVar.mo61686J(mVPTBGetActivationPriceResponseV2.context);
            }
            if (mVPTBGetActivationPriceResponseV2.mo30999i()) {
                jVar.mo61678B(mVPTBGetActivationPriceResponseV2.fares.size());
                for (MVPTBFare X0 : mVPTBGetActivationPriceResponseV2.fares) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPTBGetActivationPriceResponseV2.mo31000j()) {
                jVar.mo61686J(mVPTBGetActivationPriceResponseV2.profile);
            }
            if (mVPTBGetActivationPriceResponseV2.mo30995f()) {
                jVar.mo61678B(mVPTBGetActivationPriceResponseV2.agencyId);
            }
            if (mVPTBGetActivationPriceResponseV2.mo31001k()) {
                jVar.mo61678B(mVPTBGetActivationPriceResponseV2.regions.size());
                for (MVPTBRegion X02 : mVPTBGetActivationPriceResponseV2.regions) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVPTBGetActivationPriceResponseV2.mo30997h()) {
                mVPTBGetActivationPriceResponseV2.estimatedLine.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetActivationPriceResponseV2 mVPTBGetActivationPriceResponseV2 = (MVPTBGetActivationPriceResponseV2) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVPTBGetActivationPriceResponseV2.context = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPTBGetActivationPriceResponseV2.fares = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPTBFare mVPTBFare = new MVPTBFare();
                    mVPTBFare.mo25201C1(jVar);
                    mVPTBGetActivationPriceResponseV2.fares.add(mVPTBFare);
                }
            }
            if (T.get(2)) {
                mVPTBGetActivationPriceResponseV2.profile = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPTBGetActivationPriceResponseV2.agencyId = jVar.mo61696i();
                mVPTBGetActivationPriceResponseV2.mo31002l();
            }
            if (T.get(4)) {
                int i3 = jVar.mo61696i();
                mVPTBGetActivationPriceResponseV2.regions = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVPTBRegion mVPTBRegion = new MVPTBRegion();
                    mVPTBRegion.mo25201C1(jVar);
                    mVPTBGetActivationPriceResponseV2.regions.add(mVPTBRegion);
                }
            }
            if (T.get(5)) {
                MVPTBEstimatedLine mVPTBEstimatedLine = new MVPTBEstimatedLine();
                mVPTBGetActivationPriceResponseV2.estimatedLine = mVPTBEstimatedLine;
                mVPTBEstimatedLine.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetActivationPriceResponseV2$d */
    public static class C10229d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10228c(0);
        }
    }

    static {
        new C17394d0("MVPTBGetActivationPriceResponseV2");
        HashMap hashMap = new HashMap();
        f27924h = hashMap;
        hashMap.put(C25239c.class, new C10227b());
        hashMap.put(C25240d.class, new C10229d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT, new FieldMetaData(AppActionRequest.KEY_CONTEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FARES, new FieldMetaData("fares", (byte) 3, new ListMetaData(new StructMetaData(MVPTBFare.class))));
        enumMap.put(_Fields.PROFILE, new FieldMetaData(Scopes.PROFILE, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.REGIONS, new FieldMetaData("regions", (byte) 3, new ListMetaData(new StructMetaData(MVPTBRegion.class))));
        enumMap.put(_Fields.ESTIMATED_LINE, new FieldMetaData("estimatedLine", (byte) 2, new StructMetaData(MVPTBEstimatedLine.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27925i = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBGetActivationPriceResponseV2.class, unmodifiableMap);
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
        ((C25238b) f27924h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27924h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBGetActivationPriceResponseV2 mVPTBGetActivationPriceResponseV2 = (MVPTBGetActivationPriceResponseV2) obj;
        if (!getClass().equals(mVPTBGetActivationPriceResponseV2.getClass())) {
            return getClass().getName().compareTo(mVPTBGetActivationPriceResponseV2.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30996g()).compareTo(Boolean.valueOf(mVPTBGetActivationPriceResponseV2.mo30996g()));
        if (compareTo2 != 0 || ((mo30996g() && (compareTo2 = this.context.compareTo(mVPTBGetActivationPriceResponseV2.context)) != 0) || (compareTo2 = Boolean.valueOf(mo30999i()).compareTo(Boolean.valueOf(mVPTBGetActivationPriceResponseV2.mo30999i()))) != 0 || ((mo30999i() && (compareTo2 = C25082a.m62844h(this.fares, mVPTBGetActivationPriceResponseV2.fares)) != 0) || (compareTo2 = Boolean.valueOf(mo31000j()).compareTo(Boolean.valueOf(mVPTBGetActivationPriceResponseV2.mo31000j()))) != 0 || ((mo31000j() && (compareTo2 = this.profile.compareTo(mVPTBGetActivationPriceResponseV2.profile)) != 0) || (compareTo2 = Boolean.valueOf(mo30995f()).compareTo(Boolean.valueOf(mVPTBGetActivationPriceResponseV2.mo30995f()))) != 0 || ((mo30995f() && (compareTo2 = C25082a.m62839c(this.agencyId, mVPTBGetActivationPriceResponseV2.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo31001k()).compareTo(Boolean.valueOf(mVPTBGetActivationPriceResponseV2.mo31001k()))) != 0 || ((mo31001k() && (compareTo2 = C25082a.m62844h(this.regions, mVPTBGetActivationPriceResponseV2.regions)) != 0) || (compareTo2 = Boolean.valueOf(mo30997h()).compareTo(Boolean.valueOf(mVPTBGetActivationPriceResponseV2.mo30997h()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo30997h() || (compareTo = this.estimatedLine.compareTo(mVPTBGetActivationPriceResponseV2.estimatedLine)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBGetActivationPriceResponseV2)) {
            return false;
        }
        MVPTBGetActivationPriceResponseV2 mVPTBGetActivationPriceResponseV2 = (MVPTBGetActivationPriceResponseV2) obj;
        boolean g = mo30996g();
        boolean g2 = mVPTBGetActivationPriceResponseV2.mo30996g();
        if ((g || g2) && (!g || !g2 || !this.context.equals(mVPTBGetActivationPriceResponseV2.context))) {
            return false;
        }
        boolean i = mo30999i();
        boolean i2 = mVPTBGetActivationPriceResponseV2.mo30999i();
        if ((i || i2) && (!i || !i2 || !this.fares.equals(mVPTBGetActivationPriceResponseV2.fares))) {
            return false;
        }
        boolean j = mo31000j();
        boolean j2 = mVPTBGetActivationPriceResponseV2.mo31000j();
        if ((j || j2) && (!j || !j2 || !this.profile.equals(mVPTBGetActivationPriceResponseV2.profile))) {
            return false;
        }
        boolean f = mo30995f();
        boolean f2 = mVPTBGetActivationPriceResponseV2.mo30995f();
        if ((f || f2) && (!f || !f2 || this.agencyId != mVPTBGetActivationPriceResponseV2.agencyId)) {
            return false;
        }
        boolean k = mo31001k();
        boolean k2 = mVPTBGetActivationPriceResponseV2.mo31001k();
        if ((k || k2) && (!k || !k2 || !this.regions.equals(mVPTBGetActivationPriceResponseV2.regions))) {
            return false;
        }
        boolean h = mo30997h();
        boolean h2 = mVPTBGetActivationPriceResponseV2.mo30997h();
        if ((h || h2) && (!h || !h2 || !this.estimatedLine.mo30886a(mVPTBGetActivationPriceResponseV2.estimatedLine))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30995f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30996g() {
        return this.context != null;
    }

    /* renamed from: h */
    public final boolean mo30997h() {
        return this.estimatedLine != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30999i() {
        return this.fares != null;
    }

    /* renamed from: j */
    public final boolean mo31000j() {
        return this.profile != null;
    }

    /* renamed from: k */
    public final boolean mo31001k() {
        return this.regions != null;
    }

    /* renamed from: l */
    public final void mo31002l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBGetActivationPriceResponseV2(", "context:");
        String str = this.context;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("fares:");
        List<MVPTBFare> list = this.fares;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("profile:");
        String str2 = this.profile;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo30995f()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        n.append(", ");
        n.append("regions:");
        List<MVPTBRegion> list2 = this.regions;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        if (mo30997h()) {
            n.append(", ");
            n.append("estimatedLine:");
            MVPTBEstimatedLine mVPTBEstimatedLine = this.estimatedLine;
            if (mVPTBEstimatedLine == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPTBEstimatedLine);
            }
        }
        n.append(")");
        return n.toString();
    }
}
