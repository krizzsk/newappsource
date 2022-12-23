package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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
import p001a0.C0016g;
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

public class MVWaitToMultiLineLeg implements TBase<MVWaitToMultiLineLeg, _Fields>, Serializable, Cloneable, Comparable<MVWaitToMultiLineLeg> {

    /* renamed from: b */
    public static final C25113c f30250b = new C25113c("time", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30251c = new C25113c("waitAtStopId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f30252d = new C25113c("departOnStopId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f30253e = new C25113c("multiLinesImage", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f30254f = new C25113c("alternatives", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f30255g = new C25113c("primaryAlternativeIndex", (byte) 3, 6);

    /* renamed from: h */
    public static final C25113c f30256h = new C25113c("metroId", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f30257i = new C25113c("waitAtChildStopId", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f30258j = new C25113c("departOnChildStopId", (byte) 8, 9);

    /* renamed from: k */
    public static final HashMap f30259k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f30260l;
    private byte __isset_bitfield = 0;
    public List<MVWaitToLineAlternative> alternatives;
    public int departOnChildStopId;
    public int departOnStopId;
    public int metroId;
    public MVImageReferenceWithParams multiLinesImage;
    private _Fields[] optionals = {_Fields.MULTI_LINES_IMAGE, _Fields.WAIT_AT_CHILD_STOP_ID, _Fields.DEPART_ON_CHILD_STOP_ID};
    public byte primaryAlternativeIndex;
    public MVTime time;
    public int waitAtChildStopId;
    public int waitAtStopId;

    public enum _Fields implements C25085c {
        TIME(1, "time"),
        WAIT_AT_STOP_ID(2, "waitAtStopId"),
        DEPART_ON_STOP_ID(3, "departOnStopId"),
        MULTI_LINES_IMAGE(4, "multiLinesImage"),
        ALTERNATIVES(5, "alternatives"),
        PRIMARY_ALTERNATIVE_INDEX(6, "primaryAlternativeIndex"),
        METRO_ID(7, "metroId"),
        WAIT_AT_CHILD_STOP_ID(8, "waitAtChildStopId"),
        DEPART_ON_CHILD_STOP_ID(9, "departOnChildStopId");
        
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
                    return TIME;
                case 2:
                    return WAIT_AT_STOP_ID;
                case 3:
                    return DEPART_ON_STOP_ID;
                case 4:
                    return MULTI_LINES_IMAGE;
                case 5:
                    return ALTERNATIVES;
                case 6:
                    return PRIMARY_ALTERNATIVE_INDEX;
                case 7:
                    return METRO_ID;
                case 8:
                    return WAIT_AT_CHILD_STOP_ID;
                case 9:
                    return DEPART_ON_CHILD_STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToMultiLineLeg$a */
    public static class C11714a extends C25239c<MVWaitToMultiLineLeg> {
        public C11714a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToMultiLineLeg mVWaitToMultiLineLeg = (MVWaitToMultiLineLeg) tBase;
            MVTime mVTime = mVWaitToMultiLineLeg.time;
            C25113c cVar = MVWaitToMultiLineLeg.f30250b;
            gVar.mo61687K();
            if (mVWaitToMultiLineLeg.time != null) {
                gVar.mo61711x(MVWaitToMultiLineLeg.f30250b);
                mVWaitToMultiLineLeg.time.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWaitToMultiLineLeg.f30251c);
            gVar.mo61678B(mVWaitToMultiLineLeg.waitAtStopId);
            gVar.mo61712y();
            gVar.mo61711x(MVWaitToMultiLineLeg.f30252d);
            gVar.mo61678B(mVWaitToMultiLineLeg.departOnStopId);
            gVar.mo61712y();
            if (mVWaitToMultiLineLeg.multiLinesImage != null && mVWaitToMultiLineLeg.mo34871j()) {
                gVar.mo61711x(MVWaitToMultiLineLeg.f30253e);
                mVWaitToMultiLineLeg.multiLinesImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWaitToMultiLineLeg.alternatives != null) {
                gVar.mo61711x(MVWaitToMultiLineLeg.f30254f);
                gVar.mo61680D(new C25119e((byte) 12, mVWaitToMultiLineLeg.alternatives.size()));
                for (MVWaitToLineAlternative X0 : mVWaitToMultiLineLeg.alternatives) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWaitToMultiLineLeg.f30255g);
            gVar.mo61709v(mVWaitToMultiLineLeg.primaryAlternativeIndex);
            gVar.mo61712y();
            gVar.mo61711x(MVWaitToMultiLineLeg.f30256h);
            gVar.mo61678B(mVWaitToMultiLineLeg.metroId);
            gVar.mo61712y();
            if (mVWaitToMultiLineLeg.mo34874m()) {
                gVar.mo61711x(MVWaitToMultiLineLeg.f30257i);
                gVar.mo61678B(mVWaitToMultiLineLeg.waitAtChildStopId);
                gVar.mo61712y();
            }
            if (mVWaitToMultiLineLeg.mo34867g()) {
                gVar.mo61711x(MVWaitToMultiLineLeg.f30258j);
                gVar.mo61678B(mVWaitToMultiLineLeg.departOnChildStopId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToMultiLineLeg mVWaitToMultiLineLeg = (MVWaitToMultiLineLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTime mVTime = mVWaitToMultiLineLeg.time;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTime mVTime2 = new MVTime();
                            mVWaitToMultiLineLeg.time = mVTime2;
                            mVTime2.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToMultiLineLeg.waitAtStopId = gVar.mo61696i();
                            mVWaitToMultiLineLeg.mo34882u();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToMultiLineLeg.departOnStopId = gVar.mo61696i();
                            mVWaitToMultiLineLeg.mo34877q();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVWaitToMultiLineLeg.multiLinesImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVWaitToMultiLineLeg.alternatives = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVWaitToLineAlternative mVWaitToLineAlternative = new MVWaitToLineAlternative();
                                mVWaitToLineAlternative.mo25201C1(gVar);
                                mVWaitToMultiLineLeg.alternatives.add(mVWaitToLineAlternative);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToMultiLineLeg.primaryAlternativeIndex = gVar.mo61691d();
                            mVWaitToMultiLineLeg.mo34879s();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToMultiLineLeg.metroId = gVar.mo61696i();
                            mVWaitToMultiLineLeg.mo34878r();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToMultiLineLeg.waitAtChildStopId = gVar.mo61696i();
                            mVWaitToMultiLineLeg.mo34880t();
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWaitToMultiLineLeg.departOnChildStopId = gVar.mo61696i();
                            mVWaitToMultiLineLeg.mo34876p();
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToMultiLineLeg$b */
    public static class C11715b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11714a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToMultiLineLeg$c */
    public static class C11716c extends C25240d<MVWaitToMultiLineLeg> {
        public C11716c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWaitToMultiLineLeg mVWaitToMultiLineLeg = (MVWaitToMultiLineLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWaitToMultiLineLeg.mo34873l()) {
                bitSet.set(0);
            }
            if (mVWaitToMultiLineLeg.mo34875o()) {
                bitSet.set(1);
            }
            if (mVWaitToMultiLineLeg.mo34868h()) {
                bitSet.set(2);
            }
            if (mVWaitToMultiLineLeg.mo34871j()) {
                bitSet.set(3);
            }
            if (mVWaitToMultiLineLeg.mo34866f()) {
                bitSet.set(4);
            }
            if (mVWaitToMultiLineLeg.mo34872k()) {
                bitSet.set(5);
            }
            if (mVWaitToMultiLineLeg.mo34870i()) {
                bitSet.set(6);
            }
            if (mVWaitToMultiLineLeg.mo34874m()) {
                bitSet.set(7);
            }
            if (mVWaitToMultiLineLeg.mo34867g()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVWaitToMultiLineLeg.mo34873l()) {
                mVWaitToMultiLineLeg.time.mo25202X0(jVar);
            }
            if (mVWaitToMultiLineLeg.mo34875o()) {
                jVar.mo61678B(mVWaitToMultiLineLeg.waitAtStopId);
            }
            if (mVWaitToMultiLineLeg.mo34868h()) {
                jVar.mo61678B(mVWaitToMultiLineLeg.departOnStopId);
            }
            if (mVWaitToMultiLineLeg.mo34871j()) {
                mVWaitToMultiLineLeg.multiLinesImage.mo25202X0(jVar);
            }
            if (mVWaitToMultiLineLeg.mo34866f()) {
                jVar.mo61678B(mVWaitToMultiLineLeg.alternatives.size());
                for (MVWaitToLineAlternative X0 : mVWaitToMultiLineLeg.alternatives) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVWaitToMultiLineLeg.mo34872k()) {
                jVar.mo61716P(mVWaitToMultiLineLeg.primaryAlternativeIndex);
            }
            if (mVWaitToMultiLineLeg.mo34870i()) {
                jVar.mo61678B(mVWaitToMultiLineLeg.metroId);
            }
            if (mVWaitToMultiLineLeg.mo34874m()) {
                jVar.mo61678B(mVWaitToMultiLineLeg.waitAtChildStopId);
            }
            if (mVWaitToMultiLineLeg.mo34867g()) {
                jVar.mo61678B(mVWaitToMultiLineLeg.departOnChildStopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWaitToMultiLineLeg mVWaitToMultiLineLeg = (MVWaitToMultiLineLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                MVTime mVTime = new MVTime();
                mVWaitToMultiLineLeg.time = mVTime;
                mVTime.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVWaitToMultiLineLeg.waitAtStopId = jVar.mo61696i();
                mVWaitToMultiLineLeg.mo34882u();
            }
            if (T.get(2)) {
                mVWaitToMultiLineLeg.departOnStopId = jVar.mo61696i();
                mVWaitToMultiLineLeg.mo34877q();
            }
            if (T.get(3)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVWaitToMultiLineLeg.multiLinesImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVWaitToMultiLineLeg.alternatives = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWaitToLineAlternative mVWaitToLineAlternative = new MVWaitToLineAlternative();
                    mVWaitToLineAlternative.mo25201C1(jVar);
                    mVWaitToMultiLineLeg.alternatives.add(mVWaitToLineAlternative);
                }
            }
            if (T.get(5)) {
                mVWaitToMultiLineLeg.primaryAlternativeIndex = jVar.mo61691d();
                mVWaitToMultiLineLeg.mo34879s();
            }
            if (T.get(6)) {
                mVWaitToMultiLineLeg.metroId = jVar.mo61696i();
                mVWaitToMultiLineLeg.mo34878r();
            }
            if (T.get(7)) {
                mVWaitToMultiLineLeg.waitAtChildStopId = jVar.mo61696i();
                mVWaitToMultiLineLeg.mo34880t();
            }
            if (T.get(8)) {
                mVWaitToMultiLineLeg.departOnChildStopId = jVar.mo61696i();
                mVWaitToMultiLineLeg.mo34876p();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWaitToMultiLineLeg$d */
    public static class C11717d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11716c(0);
        }
    }

    static {
        new C17394d0("MVWaitToMultiLineLeg");
        HashMap hashMap = new HashMap();
        f30259k = hashMap;
        hashMap.put(C25239c.class, new C11715b());
        hashMap.put(C25240d.class, new C11717d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIME, new FieldMetaData("time", (byte) 3, new StructMetaData(MVTime.class)));
        enumMap.put(_Fields.WAIT_AT_STOP_ID, new FieldMetaData("waitAtStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEPART_ON_STOP_ID, new FieldMetaData("departOnStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MULTI_LINES_IMAGE, new FieldMetaData("multiLinesImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.ALTERNATIVES, new FieldMetaData("alternatives", (byte) 3, new ListMetaData(new StructMetaData(MVWaitToLineAlternative.class))));
        enumMap.put(_Fields.PRIMARY_ALTERNATIVE_INDEX, new FieldMetaData("primaryAlternativeIndex", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WAIT_AT_CHILD_STOP_ID, new FieldMetaData("waitAtChildStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DEPART_ON_CHILD_STOP_ID, new FieldMetaData("departOnChildStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30260l = unmodifiableMap;
        FieldMetaData.m61947a(MVWaitToMultiLineLeg.class, unmodifiableMap);
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
        ((C25238b) f30259k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30259k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVWaitToMultiLineLeg mVWaitToMultiLineLeg = (MVWaitToMultiLineLeg) obj;
        if (!getClass().equals(mVWaitToMultiLineLeg.getClass())) {
            return getClass().getName().compareTo(mVWaitToMultiLineLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34873l()).compareTo(Boolean.valueOf(mVWaitToMultiLineLeg.mo34873l()));
        if (compareTo != 0 || ((mo34873l() && (compareTo = this.time.compareTo(mVWaitToMultiLineLeg.time)) != 0) || (compareTo = Boolean.valueOf(mo34875o()).compareTo(Boolean.valueOf(mVWaitToMultiLineLeg.mo34875o()))) != 0 || ((mo34875o() && (compareTo = C25082a.m62839c(this.waitAtStopId, mVWaitToMultiLineLeg.waitAtStopId)) != 0) || (compareTo = Boolean.valueOf(mo34868h()).compareTo(Boolean.valueOf(mVWaitToMultiLineLeg.mo34868h()))) != 0 || ((mo34868h() && (compareTo = C25082a.m62839c(this.departOnStopId, mVWaitToMultiLineLeg.departOnStopId)) != 0) || (compareTo = Boolean.valueOf(mo34871j()).compareTo(Boolean.valueOf(mVWaitToMultiLineLeg.mo34871j()))) != 0 || ((mo34871j() && (compareTo = this.multiLinesImage.compareTo(mVWaitToMultiLineLeg.multiLinesImage)) != 0) || (compareTo = Boolean.valueOf(mo34866f()).compareTo(Boolean.valueOf(mVWaitToMultiLineLeg.mo34866f()))) != 0 || ((mo34866f() && (compareTo = C25082a.m62844h(this.alternatives, mVWaitToMultiLineLeg.alternatives)) != 0) || (compareTo = Boolean.valueOf(mo34872k()).compareTo(Boolean.valueOf(mVWaitToMultiLineLeg.mo34872k()))) != 0 || ((mo34872k() && (compareTo = C25082a.m62837a(this.primaryAlternativeIndex, mVWaitToMultiLineLeg.primaryAlternativeIndex)) != 0) || (compareTo = Boolean.valueOf(mo34870i()).compareTo(Boolean.valueOf(mVWaitToMultiLineLeg.mo34870i()))) != 0 || ((mo34870i() && (compareTo = C25082a.m62839c(this.metroId, mVWaitToMultiLineLeg.metroId)) != 0) || (compareTo = Boolean.valueOf(mo34874m()).compareTo(Boolean.valueOf(mVWaitToMultiLineLeg.mo34874m()))) != 0 || ((mo34874m() && (compareTo = C25082a.m62839c(this.waitAtChildStopId, mVWaitToMultiLineLeg.waitAtChildStopId)) != 0) || (compareTo = Boolean.valueOf(mo34867g()).compareTo(Boolean.valueOf(mVWaitToMultiLineLeg.mo34867g()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo34867g() || (c = C25082a.m62839c(this.departOnChildStopId, mVWaitToMultiLineLeg.departOnChildStopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWaitToMultiLineLeg)) {
            return false;
        }
        MVWaitToMultiLineLeg mVWaitToMultiLineLeg = (MVWaitToMultiLineLeg) obj;
        boolean l = mo34873l();
        boolean l2 = mVWaitToMultiLineLeg.mo34873l();
        if (((l || l2) && (!l || !l2 || !this.time.mo34573a(mVWaitToMultiLineLeg.time))) || this.waitAtStopId != mVWaitToMultiLineLeg.waitAtStopId || this.departOnStopId != mVWaitToMultiLineLeg.departOnStopId) {
            return false;
        }
        boolean j = mo34871j();
        boolean j2 = mVWaitToMultiLineLeg.mo34871j();
        if ((j || j2) && (!j || !j2 || !this.multiLinesImage.mo26245a(mVWaitToMultiLineLeg.multiLinesImage))) {
            return false;
        }
        boolean f = mo34866f();
        boolean f2 = mVWaitToMultiLineLeg.mo34866f();
        if (((f || f2) && (!f || !f2 || !this.alternatives.equals(mVWaitToMultiLineLeg.alternatives))) || this.primaryAlternativeIndex != mVWaitToMultiLineLeg.primaryAlternativeIndex || this.metroId != mVWaitToMultiLineLeg.metroId) {
            return false;
        }
        boolean m = mo34874m();
        boolean m2 = mVWaitToMultiLineLeg.mo34874m();
        if ((m || m2) && (!m || !m2 || this.waitAtChildStopId != mVWaitToMultiLineLeg.waitAtChildStopId)) {
            return false;
        }
        boolean g = mo34867g();
        boolean g2 = mVWaitToMultiLineLeg.mo34867g();
        if ((g || g2) && (!g || !g2 || this.departOnChildStopId != mVWaitToMultiLineLeg.departOnChildStopId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34866f() {
        return this.alternatives != null;
    }

    /* renamed from: g */
    public final boolean mo34867g() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: h */
    public final boolean mo34868h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34870i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo34871j() {
        return this.multiLinesImage != null;
    }

    /* renamed from: k */
    public final boolean mo34872k() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: l */
    public final boolean mo34873l() {
        return this.time != null;
    }

    /* renamed from: m */
    public final boolean mo34874m() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: o */
    public final boolean mo34875o() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: p */
    public final void mo34876p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: q */
    public final void mo34877q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: r */
    public final void mo34878r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: s */
    public final void mo34879s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: t */
    public final void mo34880t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWaitToMultiLineLeg(", "time:");
        MVTime mVTime = this.time;
        if (mVTime == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTime);
        }
        n.append(", ");
        n.append("waitAtStopId:");
        C0016g.m42z(n, this.waitAtStopId, ", ", "departOnStopId:");
        n.append(this.departOnStopId);
        if (mo34871j()) {
            n.append(", ");
            n.append("multiLinesImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.multiLinesImage;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        n.append(", ");
        n.append("alternatives:");
        List<MVWaitToLineAlternative> list = this.alternatives;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("primaryAlternativeIndex:");
        C0016g.m42z(n, this.primaryAlternativeIndex, ", ", "metroId:");
        n.append(this.metroId);
        if (mo34874m()) {
            n.append(", ");
            n.append("waitAtChildStopId:");
            n.append(this.waitAtChildStopId);
        }
        if (mo34867g()) {
            n.append(", ");
            n.append("departOnChildStopId:");
            n.append(this.departOnChildStopId);
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo34882u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }
}
