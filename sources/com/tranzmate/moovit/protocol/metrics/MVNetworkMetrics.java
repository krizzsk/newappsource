package com.tranzmate.moovit.protocol.metrics;

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

public class MVNetworkMetrics implements TBase<MVNetworkMetrics, _Fields>, Serializable, Cloneable, Comparable<MVNetworkMetrics> {

    /* renamed from: b */
    public static final C25113c f26416b = new C25113c("typeId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26417c = new C25113c("typeName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26418d = new C25113c("subtypeId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26419e = new C25113c("subtypeName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26420f = new C25113c("isAvailable", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f26421g = new C25113c("isConnected", (byte) 2, 6);

    /* renamed from: h */
    public static final C25113c f26422h = new C25113c("isFailover", (byte) 2, 7);

    /* renamed from: i */
    public static final C25113c f26423i = new C25113c("isRoaming", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f26424j = new C25113c("downstreamBandwidth", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f26425k = new C25113c("upstreamBandwidth", (byte) 8, 10);

    /* renamed from: l */
    public static final HashMap f26426l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f26427m;
    private byte __isset_bitfield = 0;
    public int downstreamBandwidth;
    public boolean isAvailable;
    public boolean isConnected;
    public boolean isFailover;
    public boolean isRoaming;
    private _Fields[] optionals = {_Fields.DOWNSTREAM_BANDWIDTH, _Fields.UPSTREAM_BANDWIDTH};
    public int subtypeId;
    public String subtypeName;
    public int typeId;
    public String typeName;
    public int upstreamBandwidth;

    public enum _Fields implements C25085c {
        TYPE_ID(1, "typeId"),
        TYPE_NAME(2, "typeName"),
        SUBTYPE_ID(3, "subtypeId"),
        SUBTYPE_NAME(4, "subtypeName"),
        IS_AVAILABLE(5, "isAvailable"),
        IS_CONNECTED(6, "isConnected"),
        IS_FAILOVER(7, "isFailover"),
        IS_ROAMING(8, "isRoaming"),
        DOWNSTREAM_BANDWIDTH(9, "downstreamBandwidth"),
        UPSTREAM_BANDWIDTH(10, "upstreamBandwidth");
        
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
                    return TYPE_ID;
                case 2:
                    return TYPE_NAME;
                case 3:
                    return SUBTYPE_ID;
                case 4:
                    return SUBTYPE_NAME;
                case 5:
                    return IS_AVAILABLE;
                case 6:
                    return IS_CONNECTED;
                case 7:
                    return IS_FAILOVER;
                case 8:
                    return IS_ROAMING;
                case 9:
                    return DOWNSTREAM_BANDWIDTH;
                case 10:
                    return UPSTREAM_BANDWIDTH;
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVNetworkMetrics$a */
    public static class C9146a extends C25239c<MVNetworkMetrics> {
        public C9146a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNetworkMetrics mVNetworkMetrics = (MVNetworkMetrics) tBase;
            mVNetworkMetrics.getClass();
            C25113c cVar = MVNetworkMetrics.f26416b;
            gVar.mo61687K();
            gVar.mo61711x(MVNetworkMetrics.f26416b);
            gVar.mo61678B(mVNetworkMetrics.typeId);
            gVar.mo61712y();
            if (mVNetworkMetrics.typeName != null) {
                gVar.mo61711x(MVNetworkMetrics.f26417c);
                gVar.mo61686J(mVNetworkMetrics.typeName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVNetworkMetrics.f26418d);
            gVar.mo61678B(mVNetworkMetrics.subtypeId);
            gVar.mo61712y();
            if (mVNetworkMetrics.subtypeName != null) {
                gVar.mo61711x(MVNetworkMetrics.f26419e);
                gVar.mo61686J(mVNetworkMetrics.subtypeName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVNetworkMetrics.f26420f);
            gVar.mo61708u(mVNetworkMetrics.isAvailable);
            gVar.mo61712y();
            gVar.mo61711x(MVNetworkMetrics.f26421g);
            gVar.mo61708u(mVNetworkMetrics.isConnected);
            gVar.mo61712y();
            gVar.mo61711x(MVNetworkMetrics.f26422h);
            gVar.mo61708u(mVNetworkMetrics.isFailover);
            gVar.mo61712y();
            gVar.mo61711x(MVNetworkMetrics.f26423i);
            gVar.mo61708u(mVNetworkMetrics.isRoaming);
            gVar.mo61712y();
            if (mVNetworkMetrics.mo28506f()) {
                gVar.mo61711x(MVNetworkMetrics.f26424j);
                gVar.mo61678B(mVNetworkMetrics.downstreamBandwidth);
                gVar.mo61712y();
            }
            if (mVNetworkMetrics.mo28516p()) {
                gVar.mo61711x(MVNetworkMetrics.f26425k);
                gVar.mo61678B(mVNetworkMetrics.upstreamBandwidth);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNetworkMetrics mVNetworkMetrics = (MVNetworkMetrics) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVNetworkMetrics.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.typeId = gVar.mo61696i();
                            mVNetworkMetrics.mo28524w();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.typeName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.subtypeId = gVar.mo61696i();
                            mVNetworkMetrics.mo28523v();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.subtypeName = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.isAvailable = gVar.mo61690c();
                            mVNetworkMetrics.mo28518r();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.isConnected = gVar.mo61690c();
                            mVNetworkMetrics.mo28519s();
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.isFailover = gVar.mo61690c();
                            mVNetworkMetrics.mo28520t();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.isRoaming = gVar.mo61690c();
                            mVNetworkMetrics.mo28522u();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.downstreamBandwidth = gVar.mo61696i();
                            mVNetworkMetrics.mo28517q();
                            break;
                        }
                    case 10:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVNetworkMetrics.upstreamBandwidth = gVar.mo61696i();
                            mVNetworkMetrics.mo28525y();
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVNetworkMetrics$b */
    public static class C9147b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9146a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVNetworkMetrics$c */
    public static class C9148c extends C25240d<MVNetworkMetrics> {
        public C9148c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNetworkMetrics mVNetworkMetrics = (MVNetworkMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVNetworkMetrics.mo28514m()) {
                bitSet.set(0);
            }
            if (mVNetworkMetrics.mo28515o()) {
                bitSet.set(1);
            }
            if (mVNetworkMetrics.mo28512k()) {
                bitSet.set(2);
            }
            if (mVNetworkMetrics.mo28513l()) {
                bitSet.set(3);
            }
            if (mVNetworkMetrics.mo28507g()) {
                bitSet.set(4);
            }
            if (mVNetworkMetrics.mo28508h()) {
                bitSet.set(5);
            }
            if (mVNetworkMetrics.mo28510i()) {
                bitSet.set(6);
            }
            if (mVNetworkMetrics.mo28511j()) {
                bitSet.set(7);
            }
            if (mVNetworkMetrics.mo28506f()) {
                bitSet.set(8);
            }
            if (mVNetworkMetrics.mo28516p()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVNetworkMetrics.mo28514m()) {
                jVar.mo61678B(mVNetworkMetrics.typeId);
            }
            if (mVNetworkMetrics.mo28515o()) {
                jVar.mo61686J(mVNetworkMetrics.typeName);
            }
            if (mVNetworkMetrics.mo28512k()) {
                jVar.mo61678B(mVNetworkMetrics.subtypeId);
            }
            if (mVNetworkMetrics.mo28513l()) {
                jVar.mo61686J(mVNetworkMetrics.subtypeName);
            }
            if (mVNetworkMetrics.mo28507g()) {
                jVar.mo61708u(mVNetworkMetrics.isAvailable);
            }
            if (mVNetworkMetrics.mo28508h()) {
                jVar.mo61708u(mVNetworkMetrics.isConnected);
            }
            if (mVNetworkMetrics.mo28510i()) {
                jVar.mo61708u(mVNetworkMetrics.isFailover);
            }
            if (mVNetworkMetrics.mo28511j()) {
                jVar.mo61708u(mVNetworkMetrics.isRoaming);
            }
            if (mVNetworkMetrics.mo28506f()) {
                jVar.mo61678B(mVNetworkMetrics.downstreamBandwidth);
            }
            if (mVNetworkMetrics.mo28516p()) {
                jVar.mo61678B(mVNetworkMetrics.upstreamBandwidth);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNetworkMetrics mVNetworkMetrics = (MVNetworkMetrics) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                mVNetworkMetrics.typeId = jVar.mo61696i();
                mVNetworkMetrics.mo28524w();
            }
            if (T.get(1)) {
                mVNetworkMetrics.typeName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVNetworkMetrics.subtypeId = jVar.mo61696i();
                mVNetworkMetrics.mo28523v();
            }
            if (T.get(3)) {
                mVNetworkMetrics.subtypeName = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVNetworkMetrics.isAvailable = jVar.mo61690c();
                mVNetworkMetrics.mo28518r();
            }
            if (T.get(5)) {
                mVNetworkMetrics.isConnected = jVar.mo61690c();
                mVNetworkMetrics.mo28519s();
            }
            if (T.get(6)) {
                mVNetworkMetrics.isFailover = jVar.mo61690c();
                mVNetworkMetrics.mo28520t();
            }
            if (T.get(7)) {
                mVNetworkMetrics.isRoaming = jVar.mo61690c();
                mVNetworkMetrics.mo28522u();
            }
            if (T.get(8)) {
                mVNetworkMetrics.downstreamBandwidth = jVar.mo61696i();
                mVNetworkMetrics.mo28517q();
            }
            if (T.get(9)) {
                mVNetworkMetrics.upstreamBandwidth = jVar.mo61696i();
                mVNetworkMetrics.mo28525y();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVNetworkMetrics$d */
    public static class C9149d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9148c(0);
        }
    }

    static {
        new C17394d0("MVNetworkMetrics");
        HashMap hashMap = new HashMap();
        f26426l = hashMap;
        hashMap.put(C25239c.class, new C9147b());
        hashMap.put(C25240d.class, new C9149d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE_ID, new FieldMetaData("typeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TYPE_NAME, new FieldMetaData("typeName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTYPE_ID, new FieldMetaData("subtypeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SUBTYPE_NAME, new FieldMetaData("subtypeName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_AVAILABLE, new FieldMetaData("isAvailable", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_CONNECTED, new FieldMetaData("isConnected", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_FAILOVER, new FieldMetaData("isFailover", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.IS_ROAMING, new FieldMetaData("isRoaming", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DOWNSTREAM_BANDWIDTH, new FieldMetaData("downstreamBandwidth", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.UPSTREAM_BANDWIDTH, new FieldMetaData("upstreamBandwidth", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26427m = unmodifiableMap;
        FieldMetaData.m61947a(MVNetworkMetrics.class, unmodifiableMap);
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
        ((C25238b) f26426l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26426l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVNetworkMetrics mVNetworkMetrics = (MVNetworkMetrics) obj;
        if (!getClass().equals(mVNetworkMetrics.getClass())) {
            return getClass().getName().compareTo(mVNetworkMetrics.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28514m()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28514m()));
        if (compareTo != 0 || ((mo28514m() && (compareTo = C25082a.m62839c(this.typeId, mVNetworkMetrics.typeId)) != 0) || (compareTo = Boolean.valueOf(mo28515o()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28515o()))) != 0 || ((mo28515o() && (compareTo = this.typeName.compareTo(mVNetworkMetrics.typeName)) != 0) || (compareTo = Boolean.valueOf(mo28512k()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28512k()))) != 0 || ((mo28512k() && (compareTo = C25082a.m62839c(this.subtypeId, mVNetworkMetrics.subtypeId)) != 0) || (compareTo = Boolean.valueOf(mo28513l()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28513l()))) != 0 || ((mo28513l() && (compareTo = this.subtypeName.compareTo(mVNetworkMetrics.subtypeName)) != 0) || (compareTo = Boolean.valueOf(mo28507g()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28507g()))) != 0 || ((mo28507g() && (compareTo = C25082a.m62848l(this.isAvailable, mVNetworkMetrics.isAvailable)) != 0) || (compareTo = Boolean.valueOf(mo28508h()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28508h()))) != 0 || ((mo28508h() && (compareTo = C25082a.m62848l(this.isConnected, mVNetworkMetrics.isConnected)) != 0) || (compareTo = Boolean.valueOf(mo28510i()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28510i()))) != 0 || ((mo28510i() && (compareTo = C25082a.m62848l(this.isFailover, mVNetworkMetrics.isFailover)) != 0) || (compareTo = Boolean.valueOf(mo28511j()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28511j()))) != 0 || ((mo28511j() && (compareTo = C25082a.m62848l(this.isRoaming, mVNetworkMetrics.isRoaming)) != 0) || (compareTo = Boolean.valueOf(mo28506f()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28506f()))) != 0 || ((mo28506f() && (compareTo = C25082a.m62839c(this.downstreamBandwidth, mVNetworkMetrics.downstreamBandwidth)) != 0) || (compareTo = Boolean.valueOf(mo28516p()).compareTo(Boolean.valueOf(mVNetworkMetrics.mo28516p()))) != 0)))))))))) {
            return compareTo;
        }
        if (!mo28516p() || (c = C25082a.m62839c(this.upstreamBandwidth, mVNetworkMetrics.upstreamBandwidth)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVNetworkMetrics)) {
            return false;
        }
        MVNetworkMetrics mVNetworkMetrics = (MVNetworkMetrics) obj;
        if (this.typeId != mVNetworkMetrics.typeId) {
            return false;
        }
        boolean o = mo28515o();
        boolean o2 = mVNetworkMetrics.mo28515o();
        if (((o || o2) && (!o || !o2 || !this.typeName.equals(mVNetworkMetrics.typeName))) || this.subtypeId != mVNetworkMetrics.subtypeId) {
            return false;
        }
        boolean l = mo28513l();
        boolean l2 = mVNetworkMetrics.mo28513l();
        if (((l || l2) && (!l || !l2 || !this.subtypeName.equals(mVNetworkMetrics.subtypeName))) || this.isAvailable != mVNetworkMetrics.isAvailable || this.isConnected != mVNetworkMetrics.isConnected || this.isFailover != mVNetworkMetrics.isFailover || this.isRoaming != mVNetworkMetrics.isRoaming) {
            return false;
        }
        boolean f = mo28506f();
        boolean f2 = mVNetworkMetrics.mo28506f();
        if ((f || f2) && (!f || !f2 || this.downstreamBandwidth != mVNetworkMetrics.downstreamBandwidth)) {
            return false;
        }
        boolean p = mo28516p();
        boolean p2 = mVNetworkMetrics.mo28516p();
        if ((p || p2) && (!p || !p2 || this.upstreamBandwidth != mVNetworkMetrics.upstreamBandwidth)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28506f() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: g */
    public final boolean mo28507g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo28508h() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28510i() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: j */
    public final boolean mo28511j() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: k */
    public final boolean mo28512k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final boolean mo28513l() {
        return this.subtypeName != null;
    }

    /* renamed from: m */
    public final boolean mo28514m() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: o */
    public final boolean mo28515o() {
        return this.typeName != null;
    }

    /* renamed from: p */
    public final boolean mo28516p() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: q */
    public final void mo28517q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: r */
    public final void mo28518r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: s */
    public final void mo28519s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: t */
    public final void mo28520t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVNetworkMetrics(", "typeId:");
        C0016g.m42z(n, this.typeId, ", ", "typeName:");
        String str = this.typeName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("subtypeId:");
        C0016g.m42z(n, this.subtypeId, ", ", "subtypeName:");
        String str2 = this.subtypeName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("isAvailable:");
        C13555b.m33977q(n, this.isAvailable, ", ", "isConnected:");
        C13555b.m33977q(n, this.isConnected, ", ", "isFailover:");
        C13555b.m33977q(n, this.isFailover, ", ", "isRoaming:");
        n.append(this.isRoaming);
        if (mo28506f()) {
            n.append(", ");
            n.append("downstreamBandwidth:");
            n.append(this.downstreamBandwidth);
        }
        if (mo28516p()) {
            n.append(", ");
            n.append("upstreamBandwidth:");
            n.append(this.upstreamBandwidth);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo28522u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: v */
    public final void mo28523v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: w */
    public final void mo28524w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: y */
    public final void mo28525y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 7, true);
    }
}
