package com.tranzmate.moovit.protocol.kinesis;

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

public class MVOTPScoringData implements TBase<MVOTPScoringData, _Fields>, Serializable, Cloneable, Comparable<MVOTPScoringData> {

    /* renamed from: A */
    public static final C25113c f25944A = new C25113c("googleStartTime", (byte) 10, 26);

    /* renamed from: B */
    public static final C25113c f25945B = new C25113c("googleEndTime", (byte) 10, 27);

    /* renamed from: C */
    public static final C25113c f25946C = new C25113c("googleWaitAtTheBeginning", (byte) 10, 28);

    /* renamed from: D */
    public static final C25113c f25947D = new C25113c("googleWaitTime", (byte) 10, 29);

    /* renamed from: E */
    public static final C25113c f25948E = new C25113c("googleWalkDistance", (byte) 8, 30);

    /* renamed from: F */
    public static final C25113c f25949F = new C25113c("googleWalkTime", (byte) 10, 31);

    /* renamed from: G */
    public static final C25113c f25950G = new C25113c("googleTransitTime", (byte) 10, 32);

    /* renamed from: H */
    public static final C25113c f25951H = new C25113c("googleNumOfTransit", (byte) 8, 33);

    /* renamed from: I */
    public static final HashMap f25952I;

    /* renamed from: J */
    public static final Map<_Fields, FieldMetaData> f25953J;

    /* renamed from: b */
    public static final C25113c f25954b = new C25113c("requestId", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25955c = new C25113c("metroAreaId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25956d = new C25113c("metroAreaName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25957e = new C25113c("fromLat", (byte) 4, 4);

    /* renamed from: f */
    public static final C25113c f25958f = new C25113c("fromLon", (byte) 4, 5);

    /* renamed from: g */
    public static final C25113c f25959g = new C25113c("toLat", (byte) 4, 6);

    /* renamed from: h */
    public static final C25113c f25960h = new C25113c("toLon", (byte) 4, 7);

    /* renamed from: i */
    public static final C25113c f25961i = new C25113c("date", (byte) 10, 8);

    /* renamed from: j */
    public static final C25113c f25962j = new C25113c("carDuration", (byte) 10, 9);

    /* renamed from: k */
    public static final C25113c f25963k = new C25113c("oTPItinerarySeq", (byte) 8, 10);

    /* renamed from: l */
    public static final C25113c f25964l = new C25113c("oTPLegSummary", (byte) 11, 11);

    /* renamed from: m */
    public static final C25113c f25965m = new C25113c("oTPRequestUrl", (byte) 11, 12);

    /* renamed from: n */
    public static final C25113c f25966n = new C25113c("oTPTotalTime", (byte) 10, 13);

    /* renamed from: o */
    public static final C25113c f25967o = new C25113c("oTPStartTime", (byte) 10, 14);

    /* renamed from: p */
    public static final C25113c f25968p = new C25113c("oTPEndTime", (byte) 10, 15);

    /* renamed from: q */
    public static final C25113c f25969q = new C25113c("oTPWaitAtTheBeginning", (byte) 10, 16);

    /* renamed from: r */
    public static final C25113c f25970r = new C25113c("oTPWaitTime", (byte) 10, 17);

    /* renamed from: s */
    public static final C25113c f25971s = new C25113c("oTPWalkDistance", (byte) 8, 18);

    /* renamed from: t */
    public static final C25113c f25972t = new C25113c("oTPWalkTime", (byte) 10, 19);

    /* renamed from: u */
    public static final C25113c f25973u = new C25113c("oTPTransitTime", (byte) 10, 20);

    /* renamed from: v */
    public static final C25113c f25974v = new C25113c("oTPNumOfTransit", (byte) 8, 21);

    /* renamed from: w */
    public static final C25113c f25975w = new C25113c("googleItinerarySeq", (byte) 8, 22);

    /* renamed from: x */
    public static final C25113c f25976x = new C25113c("googleLegSummary", (byte) 11, 23);

    /* renamed from: y */
    public static final C25113c f25977y = new C25113c("googleRequestUrl", (byte) 11, 24);

    /* renamed from: z */
    public static final C25113c f25978z = new C25113c("googleTotalTime", (byte) 10, 25);
    private int __isset_bitfield = 0;
    public long carDuration;
    public long date;
    public double fromLat;
    public double fromLon;
    public long googleEndTime;
    public int googleItinerarySeq;
    public String googleLegSummary;
    public int googleNumOfTransit;
    public String googleRequestUrl;
    public long googleStartTime;
    public long googleTotalTime;
    public long googleTransitTime;
    public long googleWaitAtTheBeginning;
    public long googleWaitTime;
    public int googleWalkDistance;
    public long googleWalkTime;
    public int metroAreaId;
    public String metroAreaName;
    public long oTPEndTime;
    public int oTPItinerarySeq;
    public String oTPLegSummary;
    public int oTPNumOfTransit;
    public String oTPRequestUrl;
    public long oTPStartTime;
    public long oTPTotalTime;
    public long oTPTransitTime;
    public long oTPWaitAtTheBeginning;
    public long oTPWaitTime;
    public int oTPWalkDistance;
    public long oTPWalkTime;
    public long requestId;
    public double toLat;
    public double toLon;

    public enum _Fields implements C25085c {
        REQUEST_ID(1, "requestId"),
        METRO_AREA_ID(2, "metroAreaId"),
        METRO_AREA_NAME(3, "metroAreaName"),
        FROM_LAT(4, "fromLat"),
        FROM_LON(5, "fromLon"),
        TO_LAT(6, "toLat"),
        TO_LON(7, "toLon"),
        DATE(8, "date"),
        CAR_DURATION(9, "carDuration"),
        O_TPITINERARY_SEQ(10, "oTPItinerarySeq"),
        O_TPLEG_SUMMARY(11, "oTPLegSummary"),
        O_TPREQUEST_URL(12, "oTPRequestUrl"),
        O_TPTOTAL_TIME(13, "oTPTotalTime"),
        O_TPSTART_TIME(14, "oTPStartTime"),
        O_TPEND_TIME(15, "oTPEndTime"),
        O_TPWAIT_AT_THE_BEGINNING(16, "oTPWaitAtTheBeginning"),
        O_TPWAIT_TIME(17, "oTPWaitTime"),
        O_TPWALK_DISTANCE(18, "oTPWalkDistance"),
        O_TPWALK_TIME(19, "oTPWalkTime"),
        O_TPTRANSIT_TIME(20, "oTPTransitTime"),
        O_TPNUM_OF_TRANSIT(21, "oTPNumOfTransit"),
        GOOGLE_ITINERARY_SEQ(22, "googleItinerarySeq"),
        GOOGLE_LEG_SUMMARY(23, "googleLegSummary"),
        GOOGLE_REQUEST_URL(24, "googleRequestUrl"),
        GOOGLE_TOTAL_TIME(25, "googleTotalTime"),
        GOOGLE_START_TIME(26, "googleStartTime"),
        GOOGLE_END_TIME(27, "googleEndTime"),
        GOOGLE_WAIT_AT_THE_BEGINNING(28, "googleWaitAtTheBeginning"),
        GOOGLE_WAIT_TIME(29, "googleWaitTime"),
        GOOGLE_WALK_DISTANCE(30, "googleWalkDistance"),
        GOOGLE_WALK_TIME(31, "googleWalkTime"),
        GOOGLE_TRANSIT_TIME(32, "googleTransitTime"),
        GOOGLE_NUM_OF_TRANSIT(33, "googleNumOfTransit");
        
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
                    return REQUEST_ID;
                case 2:
                    return METRO_AREA_ID;
                case 3:
                    return METRO_AREA_NAME;
                case 4:
                    return FROM_LAT;
                case 5:
                    return FROM_LON;
                case 6:
                    return TO_LAT;
                case 7:
                    return TO_LON;
                case 8:
                    return DATE;
                case 9:
                    return CAR_DURATION;
                case 10:
                    return O_TPITINERARY_SEQ;
                case 11:
                    return O_TPLEG_SUMMARY;
                case 12:
                    return O_TPREQUEST_URL;
                case 13:
                    return O_TPTOTAL_TIME;
                case 14:
                    return O_TPSTART_TIME;
                case 15:
                    return O_TPEND_TIME;
                case 16:
                    return O_TPWAIT_AT_THE_BEGINNING;
                case 17:
                    return O_TPWAIT_TIME;
                case 18:
                    return O_TPWALK_DISTANCE;
                case 19:
                    return O_TPWALK_TIME;
                case 20:
                    return O_TPTRANSIT_TIME;
                case 21:
                    return O_TPNUM_OF_TRANSIT;
                case 22:
                    return GOOGLE_ITINERARY_SEQ;
                case 23:
                    return GOOGLE_LEG_SUMMARY;
                case 24:
                    return GOOGLE_REQUEST_URL;
                case 25:
                    return GOOGLE_TOTAL_TIME;
                case 26:
                    return GOOGLE_START_TIME;
                case 27:
                    return GOOGLE_END_TIME;
                case 28:
                    return GOOGLE_WAIT_AT_THE_BEGINNING;
                case 29:
                    return GOOGLE_WAIT_TIME;
                case 30:
                    return GOOGLE_WALK_DISTANCE;
                case 31:
                    return GOOGLE_WALK_TIME;
                case 32:
                    return GOOGLE_TRANSIT_TIME;
                case 33:
                    return GOOGLE_NUM_OF_TRANSIT;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVOTPScoringData$a */
    public static class C8923a extends C25239c<MVOTPScoringData> {
        public C8923a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVOTPScoringData mVOTPScoringData = (MVOTPScoringData) tBase;
            mVOTPScoringData.getClass();
            C25113c cVar = MVOTPScoringData.f25954b;
            gVar.mo61687K();
            gVar.mo61711x(MVOTPScoringData.f25954b);
            gVar.mo61679C(mVOTPScoringData.requestId);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25955c);
            gVar.mo61678B(mVOTPScoringData.metroAreaId);
            gVar.mo61712y();
            if (mVOTPScoringData.metroAreaName != null) {
                gVar.mo61711x(MVOTPScoringData.f25956d);
                gVar.mo61686J(mVOTPScoringData.metroAreaName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVOTPScoringData.f25957e);
            gVar.mo61710w(mVOTPScoringData.fromLat);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25958f);
            gVar.mo61710w(mVOTPScoringData.fromLon);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25959g);
            gVar.mo61710w(mVOTPScoringData.toLat);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25960h);
            gVar.mo61710w(mVOTPScoringData.toLon);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25961i);
            gVar.mo61679C(mVOTPScoringData.date);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25962j);
            gVar.mo61679C(mVOTPScoringData.carDuration);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25963k);
            gVar.mo61678B(mVOTPScoringData.oTPItinerarySeq);
            gVar.mo61712y();
            if (mVOTPScoringData.oTPLegSummary != null) {
                gVar.mo61711x(MVOTPScoringData.f25964l);
                gVar.mo61686J(mVOTPScoringData.oTPLegSummary);
                gVar.mo61712y();
            }
            if (mVOTPScoringData.oTPRequestUrl != null) {
                gVar.mo61711x(MVOTPScoringData.f25965m);
                gVar.mo61686J(mVOTPScoringData.oTPRequestUrl);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVOTPScoringData.f25966n);
            gVar.mo61679C(mVOTPScoringData.oTPTotalTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25967o);
            gVar.mo61679C(mVOTPScoringData.oTPStartTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25968p);
            gVar.mo61679C(mVOTPScoringData.oTPEndTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25969q);
            gVar.mo61679C(mVOTPScoringData.oTPWaitAtTheBeginning);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25970r);
            gVar.mo61679C(mVOTPScoringData.oTPWaitTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25971s);
            gVar.mo61678B(mVOTPScoringData.oTPWalkDistance);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25972t);
            gVar.mo61679C(mVOTPScoringData.oTPWalkTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25973u);
            gVar.mo61679C(mVOTPScoringData.oTPTransitTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25974v);
            gVar.mo61678B(mVOTPScoringData.oTPNumOfTransit);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25975w);
            gVar.mo61678B(mVOTPScoringData.googleItinerarySeq);
            gVar.mo61712y();
            if (mVOTPScoringData.googleLegSummary != null) {
                gVar.mo61711x(MVOTPScoringData.f25976x);
                gVar.mo61686J(mVOTPScoringData.googleLegSummary);
                gVar.mo61712y();
            }
            if (mVOTPScoringData.googleRequestUrl != null) {
                gVar.mo61711x(MVOTPScoringData.f25977y);
                gVar.mo61686J(mVOTPScoringData.googleRequestUrl);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVOTPScoringData.f25978z);
            gVar.mo61679C(mVOTPScoringData.googleTotalTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25944A);
            gVar.mo61679C(mVOTPScoringData.googleStartTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25945B);
            gVar.mo61679C(mVOTPScoringData.googleEndTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25946C);
            gVar.mo61679C(mVOTPScoringData.googleWaitAtTheBeginning);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25947D);
            gVar.mo61679C(mVOTPScoringData.googleWaitTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25948E);
            gVar.mo61678B(mVOTPScoringData.googleWalkDistance);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25949F);
            gVar.mo61679C(mVOTPScoringData.googleWalkTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25950G);
            gVar.mo61679C(mVOTPScoringData.googleTransitTime);
            gVar.mo61712y();
            gVar.mo61711x(MVOTPScoringData.f25951H);
            C16530d.m42020n(gVar, mVOTPScoringData.googleNumOfTransit);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVOTPScoringData mVOTPScoringData = (MVOTPScoringData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVOTPScoringData.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.requestId = gVar.mo61697j();
                            mVOTPScoringData.mo27838s0();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.metroAreaId = gVar.mo61696i();
                            mVOTPScoringData.mo27816h0();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.metroAreaName = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.fromLat = gVar.mo61692e();
                            mVOTPScoringData.mo27799V();
                            break;
                        }
                    case 5:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.fromLon = gVar.mo61692e();
                            mVOTPScoringData.mo27800W();
                            break;
                        }
                    case 6:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.toLat = gVar.mo61692e();
                            mVOTPScoringData.mo27840t0();
                            break;
                        }
                    case 7:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.toLon = gVar.mo61692e();
                            mVOTPScoringData.mo27843u0();
                            break;
                        }
                    case 8:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.date = gVar.mo61697j();
                            mVOTPScoringData.mo27798U();
                            break;
                        }
                    case 9:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.carDuration = gVar.mo61697j();
                            mVOTPScoringData.mo27797S();
                            break;
                        }
                    case 10:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPItinerarySeq = gVar.mo61696i();
                            mVOTPScoringData.mo27821j0();
                            break;
                        }
                    case 11:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPLegSummary = gVar.mo61704q();
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPRequestUrl = gVar.mo61704q();
                            break;
                        }
                    case 13:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPTotalTime = gVar.mo61697j();
                            mVOTPScoringData.mo27827m0();
                            break;
                        }
                    case 14:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPStartTime = gVar.mo61697j();
                            mVOTPScoringData.mo27825l0();
                            break;
                        }
                    case 15:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPEndTime = gVar.mo61697j();
                            mVOTPScoringData.mo27819i0();
                            break;
                        }
                    case 16:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPWaitAtTheBeginning = gVar.mo61697j();
                            mVOTPScoringData.mo27830o0();
                            break;
                        }
                    case 17:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPWaitTime = gVar.mo61697j();
                            mVOTPScoringData.mo27832p0();
                            break;
                        }
                    case 18:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPWalkDistance = gVar.mo61696i();
                            mVOTPScoringData.mo27834q0();
                            break;
                        }
                    case 19:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPWalkTime = gVar.mo61697j();
                            mVOTPScoringData.mo27836r0();
                            break;
                        }
                    case 20:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPTransitTime = gVar.mo61697j();
                            mVOTPScoringData.mo27828n0();
                            break;
                        }
                    case 21:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.oTPNumOfTransit = gVar.mo61696i();
                            mVOTPScoringData.mo27823k0();
                            break;
                        }
                    case 22:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleItinerarySeq = gVar.mo61696i();
                            mVOTPScoringData.mo27802Y();
                            break;
                        }
                    case 23:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleLegSummary = gVar.mo61704q();
                            break;
                        }
                    case 24:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleRequestUrl = gVar.mo61704q();
                            break;
                        }
                    case 25:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleTotalTime = gVar.mo61697j();
                            mVOTPScoringData.mo27805b0();
                            break;
                        }
                    case 26:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleStartTime = gVar.mo61697j();
                            mVOTPScoringData.mo27804a0();
                            break;
                        }
                    case 27:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleEndTime = gVar.mo61697j();
                            mVOTPScoringData.mo27801X();
                            break;
                        }
                    case 28:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleWaitAtTheBeginning = gVar.mo61697j();
                            mVOTPScoringData.mo27808d0();
                            break;
                        }
                    case 29:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleWaitTime = gVar.mo61697j();
                            mVOTPScoringData.mo27809e0();
                            break;
                        }
                    case 30:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleWalkDistance = gVar.mo61696i();
                            mVOTPScoringData.mo27812f0();
                            break;
                        }
                    case 31:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleWalkTime = gVar.mo61697j();
                            mVOTPScoringData.mo27814g0();
                            break;
                        }
                    case 32:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleTransitTime = gVar.mo61697j();
                            mVOTPScoringData.mo27806c0();
                            break;
                        }
                    case 33:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVOTPScoringData.googleNumOfTransit = gVar.mo61696i();
                            mVOTPScoringData.mo27803Z();
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVOTPScoringData$b */
    public static class C8924b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8923a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVOTPScoringData$c */
    public static class C8925c extends C25240d<MVOTPScoringData> {
        public C8925c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVOTPScoringData mVOTPScoringData = (MVOTPScoringData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVOTPScoringData.mo27794P()) {
                bitSet.set(0);
            }
            if (mVOTPScoringData.mo27845w()) {
                bitSet.set(1);
            }
            if (mVOTPScoringData.mo27846y()) {
                bitSet.set(2);
            }
            if (mVOTPScoringData.mo27815h()) {
                bitSet.set(3);
            }
            if (mVOTPScoringData.mo27818i()) {
                bitSet.set(4);
            }
            if (mVOTPScoringData.mo27795Q()) {
                bitSet.set(5);
            }
            if (mVOTPScoringData.mo27796R()) {
                bitSet.set(6);
            }
            if (mVOTPScoringData.mo27813g()) {
                bitSet.set(7);
            }
            if (mVOTPScoringData.mo27811f()) {
                bitSet.set(8);
            }
            if (mVOTPScoringData.mo27783D()) {
                bitSet.set(9);
            }
            if (mVOTPScoringData.mo27784E()) {
                bitSet.set(10);
            }
            if (mVOTPScoringData.mo27786G()) {
                bitSet.set(11);
            }
            if (mVOTPScoringData.mo27788I()) {
                bitSet.set(12);
            }
            if (mVOTPScoringData.mo27787H()) {
                bitSet.set(13);
            }
            if (mVOTPScoringData.mo27782A()) {
                bitSet.set(14);
            }
            if (mVOTPScoringData.mo27790L()) {
                bitSet.set(15);
            }
            if (mVOTPScoringData.mo27791M()) {
                bitSet.set(16);
            }
            if (mVOTPScoringData.mo27792N()) {
                bitSet.set(17);
            }
            if (mVOTPScoringData.mo27793O()) {
                bitSet.set(18);
            }
            if (mVOTPScoringData.mo27789J()) {
                bitSet.set(19);
            }
            if (mVOTPScoringData.mo27785F()) {
                bitSet.set(20);
            }
            if (mVOTPScoringData.mo27822k()) {
                bitSet.set(21);
            }
            if (mVOTPScoringData.mo27824l()) {
                bitSet.set(22);
            }
            if (mVOTPScoringData.mo27829o()) {
                bitSet.set(23);
            }
            if (mVOTPScoringData.mo27833q()) {
                bitSet.set(24);
            }
            if (mVOTPScoringData.mo27831p()) {
                bitSet.set(25);
            }
            if (mVOTPScoringData.mo27820j()) {
                bitSet.set(26);
            }
            if (mVOTPScoringData.mo27837s()) {
                bitSet.set(27);
            }
            if (mVOTPScoringData.mo27839t()) {
                bitSet.set(28);
            }
            if (mVOTPScoringData.mo27842u()) {
                bitSet.set(29);
            }
            if (mVOTPScoringData.mo27844v()) {
                bitSet.set(30);
            }
            if (mVOTPScoringData.mo27835r()) {
                bitSet.set(31);
            }
            if (mVOTPScoringData.mo27826m()) {
                bitSet.set(32);
            }
            jVar.mo61738U(bitSet, 33);
            if (mVOTPScoringData.mo27794P()) {
                jVar.mo61679C(mVOTPScoringData.requestId);
            }
            if (mVOTPScoringData.mo27845w()) {
                jVar.mo61678B(mVOTPScoringData.metroAreaId);
            }
            if (mVOTPScoringData.mo27846y()) {
                jVar.mo61686J(mVOTPScoringData.metroAreaName);
            }
            if (mVOTPScoringData.mo27815h()) {
                jVar.mo61710w(mVOTPScoringData.fromLat);
            }
            if (mVOTPScoringData.mo27818i()) {
                jVar.mo61710w(mVOTPScoringData.fromLon);
            }
            if (mVOTPScoringData.mo27795Q()) {
                jVar.mo61710w(mVOTPScoringData.toLat);
            }
            if (mVOTPScoringData.mo27796R()) {
                jVar.mo61710w(mVOTPScoringData.toLon);
            }
            if (mVOTPScoringData.mo27813g()) {
                jVar.mo61679C(mVOTPScoringData.date);
            }
            if (mVOTPScoringData.mo27811f()) {
                jVar.mo61679C(mVOTPScoringData.carDuration);
            }
            if (mVOTPScoringData.mo27783D()) {
                jVar.mo61678B(mVOTPScoringData.oTPItinerarySeq);
            }
            if (mVOTPScoringData.mo27784E()) {
                jVar.mo61686J(mVOTPScoringData.oTPLegSummary);
            }
            if (mVOTPScoringData.mo27786G()) {
                jVar.mo61686J(mVOTPScoringData.oTPRequestUrl);
            }
            if (mVOTPScoringData.mo27788I()) {
                jVar.mo61679C(mVOTPScoringData.oTPTotalTime);
            }
            if (mVOTPScoringData.mo27787H()) {
                jVar.mo61679C(mVOTPScoringData.oTPStartTime);
            }
            if (mVOTPScoringData.mo27782A()) {
                jVar.mo61679C(mVOTPScoringData.oTPEndTime);
            }
            if (mVOTPScoringData.mo27790L()) {
                jVar.mo61679C(mVOTPScoringData.oTPWaitAtTheBeginning);
            }
            if (mVOTPScoringData.mo27791M()) {
                jVar.mo61679C(mVOTPScoringData.oTPWaitTime);
            }
            if (mVOTPScoringData.mo27792N()) {
                jVar.mo61678B(mVOTPScoringData.oTPWalkDistance);
            }
            if (mVOTPScoringData.mo27793O()) {
                jVar.mo61679C(mVOTPScoringData.oTPWalkTime);
            }
            if (mVOTPScoringData.mo27789J()) {
                jVar.mo61679C(mVOTPScoringData.oTPTransitTime);
            }
            if (mVOTPScoringData.mo27785F()) {
                jVar.mo61678B(mVOTPScoringData.oTPNumOfTransit);
            }
            if (mVOTPScoringData.mo27822k()) {
                jVar.mo61678B(mVOTPScoringData.googleItinerarySeq);
            }
            if (mVOTPScoringData.mo27824l()) {
                jVar.mo61686J(mVOTPScoringData.googleLegSummary);
            }
            if (mVOTPScoringData.mo27829o()) {
                jVar.mo61686J(mVOTPScoringData.googleRequestUrl);
            }
            if (mVOTPScoringData.mo27833q()) {
                jVar.mo61679C(mVOTPScoringData.googleTotalTime);
            }
            if (mVOTPScoringData.mo27831p()) {
                jVar.mo61679C(mVOTPScoringData.googleStartTime);
            }
            if (mVOTPScoringData.mo27820j()) {
                jVar.mo61679C(mVOTPScoringData.googleEndTime);
            }
            if (mVOTPScoringData.mo27837s()) {
                jVar.mo61679C(mVOTPScoringData.googleWaitAtTheBeginning);
            }
            if (mVOTPScoringData.mo27839t()) {
                jVar.mo61679C(mVOTPScoringData.googleWaitTime);
            }
            if (mVOTPScoringData.mo27842u()) {
                jVar.mo61678B(mVOTPScoringData.googleWalkDistance);
            }
            if (mVOTPScoringData.mo27844v()) {
                jVar.mo61679C(mVOTPScoringData.googleWalkTime);
            }
            if (mVOTPScoringData.mo27835r()) {
                jVar.mo61679C(mVOTPScoringData.googleTransitTime);
            }
            if (mVOTPScoringData.mo27826m()) {
                jVar.mo61678B(mVOTPScoringData.googleNumOfTransit);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVOTPScoringData mVOTPScoringData = (MVOTPScoringData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(33);
            if (T.get(0)) {
                mVOTPScoringData.requestId = jVar.mo61697j();
                mVOTPScoringData.mo27838s0();
            }
            if (T.get(1)) {
                mVOTPScoringData.metroAreaId = jVar.mo61696i();
                mVOTPScoringData.mo27816h0();
            }
            if (T.get(2)) {
                mVOTPScoringData.metroAreaName = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVOTPScoringData.fromLat = jVar.mo61692e();
                mVOTPScoringData.mo27799V();
            }
            if (T.get(4)) {
                mVOTPScoringData.fromLon = jVar.mo61692e();
                mVOTPScoringData.mo27800W();
            }
            if (T.get(5)) {
                mVOTPScoringData.toLat = jVar.mo61692e();
                mVOTPScoringData.mo27840t0();
            }
            if (T.get(6)) {
                mVOTPScoringData.toLon = jVar.mo61692e();
                mVOTPScoringData.mo27843u0();
            }
            if (T.get(7)) {
                mVOTPScoringData.date = jVar.mo61697j();
                mVOTPScoringData.mo27798U();
            }
            if (T.get(8)) {
                mVOTPScoringData.carDuration = jVar.mo61697j();
                mVOTPScoringData.mo27797S();
            }
            if (T.get(9)) {
                mVOTPScoringData.oTPItinerarySeq = jVar.mo61696i();
                mVOTPScoringData.mo27821j0();
            }
            if (T.get(10)) {
                mVOTPScoringData.oTPLegSummary = jVar.mo61704q();
            }
            if (T.get(11)) {
                mVOTPScoringData.oTPRequestUrl = jVar.mo61704q();
            }
            if (T.get(12)) {
                mVOTPScoringData.oTPTotalTime = jVar.mo61697j();
                mVOTPScoringData.mo27827m0();
            }
            if (T.get(13)) {
                mVOTPScoringData.oTPStartTime = jVar.mo61697j();
                mVOTPScoringData.mo27825l0();
            }
            if (T.get(14)) {
                mVOTPScoringData.oTPEndTime = jVar.mo61697j();
                mVOTPScoringData.mo27819i0();
            }
            if (T.get(15)) {
                mVOTPScoringData.oTPWaitAtTheBeginning = jVar.mo61697j();
                mVOTPScoringData.mo27830o0();
            }
            if (T.get(16)) {
                mVOTPScoringData.oTPWaitTime = jVar.mo61697j();
                mVOTPScoringData.mo27832p0();
            }
            if (T.get(17)) {
                mVOTPScoringData.oTPWalkDistance = jVar.mo61696i();
                mVOTPScoringData.mo27834q0();
            }
            if (T.get(18)) {
                mVOTPScoringData.oTPWalkTime = jVar.mo61697j();
                mVOTPScoringData.mo27836r0();
            }
            if (T.get(19)) {
                mVOTPScoringData.oTPTransitTime = jVar.mo61697j();
                mVOTPScoringData.mo27828n0();
            }
            if (T.get(20)) {
                mVOTPScoringData.oTPNumOfTransit = jVar.mo61696i();
                mVOTPScoringData.mo27823k0();
            }
            if (T.get(21)) {
                mVOTPScoringData.googleItinerarySeq = jVar.mo61696i();
                mVOTPScoringData.mo27802Y();
            }
            if (T.get(22)) {
                mVOTPScoringData.googleLegSummary = jVar.mo61704q();
            }
            if (T.get(23)) {
                mVOTPScoringData.googleRequestUrl = jVar.mo61704q();
            }
            if (T.get(24)) {
                mVOTPScoringData.googleTotalTime = jVar.mo61697j();
                mVOTPScoringData.mo27805b0();
            }
            if (T.get(25)) {
                mVOTPScoringData.googleStartTime = jVar.mo61697j();
                mVOTPScoringData.mo27804a0();
            }
            if (T.get(26)) {
                mVOTPScoringData.googleEndTime = jVar.mo61697j();
                mVOTPScoringData.mo27801X();
            }
            if (T.get(27)) {
                mVOTPScoringData.googleWaitAtTheBeginning = jVar.mo61697j();
                mVOTPScoringData.mo27808d0();
            }
            if (T.get(28)) {
                mVOTPScoringData.googleWaitTime = jVar.mo61697j();
                mVOTPScoringData.mo27809e0();
            }
            if (T.get(29)) {
                mVOTPScoringData.googleWalkDistance = jVar.mo61696i();
                mVOTPScoringData.mo27812f0();
            }
            if (T.get(30)) {
                mVOTPScoringData.googleWalkTime = jVar.mo61697j();
                mVOTPScoringData.mo27814g0();
            }
            if (T.get(31)) {
                mVOTPScoringData.googleTransitTime = jVar.mo61697j();
                mVOTPScoringData.mo27806c0();
            }
            if (T.get(32)) {
                mVOTPScoringData.googleNumOfTransit = jVar.mo61696i();
                mVOTPScoringData.mo27803Z();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVOTPScoringData$d */
    public static class C8926d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8925c(0);
        }
    }

    static {
        new C17394d0("MVOTPScoringData");
        HashMap hashMap = new HashMap();
        f25952I = hashMap;
        hashMap.put(C25239c.class, new C8924b());
        hashMap.put(C25240d.class, new C8926d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REQUEST_ID, new FieldMetaData("requestId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.METRO_AREA_ID, new FieldMetaData("metroAreaId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.METRO_AREA_NAME, new FieldMetaData("metroAreaName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FROM_LAT, new FieldMetaData("fromLat", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.FROM_LON, new FieldMetaData("fromLon", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.TO_LAT, new FieldMetaData("toLat", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.TO_LON, new FieldMetaData("toLon", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.DATE, new FieldMetaData("date", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.CAR_DURATION, new FieldMetaData("carDuration", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.O_TPITINERARY_SEQ, new FieldMetaData("oTPItinerarySeq", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.O_TPLEG_SUMMARY, new FieldMetaData("oTPLegSummary", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.O_TPREQUEST_URL, new FieldMetaData("oTPRequestUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.O_TPTOTAL_TIME, new FieldMetaData("oTPTotalTime", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.O_TPSTART_TIME, new FieldMetaData("oTPStartTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.O_TPEND_TIME, new FieldMetaData("oTPEndTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.O_TPWAIT_AT_THE_BEGINNING, new FieldMetaData("oTPWaitAtTheBeginning", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.O_TPWAIT_TIME, new FieldMetaData("oTPWaitTime", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.O_TPWALK_DISTANCE, new FieldMetaData("oTPWalkDistance", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.O_TPWALK_TIME, new FieldMetaData("oTPWalkTime", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.O_TPTRANSIT_TIME, new FieldMetaData("oTPTransitTime", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.O_TPNUM_OF_TRANSIT, new FieldMetaData("oTPNumOfTransit", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.GOOGLE_ITINERARY_SEQ, new FieldMetaData("googleItinerarySeq", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.GOOGLE_LEG_SUMMARY, new FieldMetaData("googleLegSummary", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.GOOGLE_REQUEST_URL, new FieldMetaData("googleRequestUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.GOOGLE_TOTAL_TIME, new FieldMetaData("googleTotalTime", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.GOOGLE_START_TIME, new FieldMetaData("googleStartTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.GOOGLE_END_TIME, new FieldMetaData("googleEndTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.GOOGLE_WAIT_AT_THE_BEGINNING, new FieldMetaData("googleWaitAtTheBeginning", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.GOOGLE_WAIT_TIME, new FieldMetaData("googleWaitTime", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.GOOGLE_WALK_DISTANCE, new FieldMetaData("googleWalkDistance", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.GOOGLE_WALK_TIME, new FieldMetaData("googleWalkTime", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.GOOGLE_TRANSIT_TIME, new FieldMetaData("googleTransitTime", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.GOOGLE_NUM_OF_TRANSIT, new FieldMetaData("googleNumOfTransit", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25953J = unmodifiableMap;
        FieldMetaData.m61947a(MVOTPScoringData.class, unmodifiableMap);
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

    /* renamed from: A */
    public final boolean mo27782A() {
        return C13637c.m34053H(this.__isset_bitfield, 11);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f25952I.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: D */
    public final boolean mo27783D() {
        return C13637c.m34053H(this.__isset_bitfield, 8);
    }

    /* renamed from: E */
    public final boolean mo27784E() {
        return this.oTPLegSummary != null;
    }

    /* renamed from: F */
    public final boolean mo27785F() {
        return C13637c.m34053H(this.__isset_bitfield, 17);
    }

    /* renamed from: G */
    public final boolean mo27786G() {
        return this.oTPRequestUrl != null;
    }

    /* renamed from: H */
    public final boolean mo27787H() {
        return C13637c.m34053H(this.__isset_bitfield, 10);
    }

    /* renamed from: I */
    public final boolean mo27788I() {
        return C13637c.m34053H(this.__isset_bitfield, 9);
    }

    /* renamed from: J */
    public final boolean mo27789J() {
        return C13637c.m34053H(this.__isset_bitfield, 16);
    }

    /* renamed from: L */
    public final boolean mo27790L() {
        return C13637c.m34053H(this.__isset_bitfield, 12);
    }

    /* renamed from: M */
    public final boolean mo27791M() {
        return C13637c.m34053H(this.__isset_bitfield, 13);
    }

    /* renamed from: N */
    public final boolean mo27792N() {
        return C13637c.m34053H(this.__isset_bitfield, 14);
    }

    /* renamed from: O */
    public final boolean mo27793O() {
        return C13637c.m34053H(this.__isset_bitfield, 15);
    }

    /* renamed from: P */
    public final boolean mo27794P() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: Q */
    public final boolean mo27795Q() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: R */
    public final boolean mo27796R() {
        return C13637c.m34053H(this.__isset_bitfield, 5);
    }

    /* renamed from: S */
    public final void mo27797S() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 7, true);
    }

    /* renamed from: U */
    public final void mo27798U() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 6, true);
    }

    /* renamed from: V */
    public final void mo27799V() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: W */
    public final void mo27800W() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: X */
    public final void mo27801X() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 21, true);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25952I.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: Y */
    public final void mo27802Y() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 18, true);
    }

    /* renamed from: Z */
    public final void mo27803Z() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 27, true);
    }

    /* renamed from: a0 */
    public final void mo27804a0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 20, true);
    }

    /* renamed from: b0 */
    public final void mo27805b0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 19, true);
    }

    /* renamed from: c0 */
    public final void mo27806c0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 26, true);
    }

    public final int compareTo(Object obj) {
        int c;
        MVOTPScoringData mVOTPScoringData = (MVOTPScoringData) obj;
        if (!getClass().equals(mVOTPScoringData.getClass())) {
            return getClass().getName().compareTo(mVOTPScoringData.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27794P()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27794P()));
        if (compareTo != 0 || ((mo27794P() && (compareTo = C25082a.m62840d(this.requestId, mVOTPScoringData.requestId)) != 0) || (compareTo = Boolean.valueOf(mo27845w()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27845w()))) != 0 || ((mo27845w() && (compareTo = C25082a.m62839c(this.metroAreaId, mVOTPScoringData.metroAreaId)) != 0) || (compareTo = Boolean.valueOf(mo27846y()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27846y()))) != 0 || ((mo27846y() && (compareTo = this.metroAreaName.compareTo(mVOTPScoringData.metroAreaName)) != 0) || (compareTo = Boolean.valueOf(mo27815h()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27815h()))) != 0 || ((mo27815h() && (compareTo = C25082a.m62838b(this.fromLat, mVOTPScoringData.fromLat)) != 0) || (compareTo = Boolean.valueOf(mo27818i()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27818i()))) != 0 || ((mo27818i() && (compareTo = C25082a.m62838b(this.fromLon, mVOTPScoringData.fromLon)) != 0) || (compareTo = Boolean.valueOf(mo27795Q()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27795Q()))) != 0 || ((mo27795Q() && (compareTo = C25082a.m62838b(this.toLat, mVOTPScoringData.toLat)) != 0) || (compareTo = Boolean.valueOf(mo27796R()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27796R()))) != 0 || ((mo27796R() && (compareTo = C25082a.m62838b(this.toLon, mVOTPScoringData.toLon)) != 0) || (compareTo = Boolean.valueOf(mo27813g()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27813g()))) != 0 || ((mo27813g() && (compareTo = C25082a.m62840d(this.date, mVOTPScoringData.date)) != 0) || (compareTo = Boolean.valueOf(mo27811f()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27811f()))) != 0 || ((mo27811f() && (compareTo = C25082a.m62840d(this.carDuration, mVOTPScoringData.carDuration)) != 0) || (compareTo = Boolean.valueOf(mo27783D()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27783D()))) != 0 || ((mo27783D() && (compareTo = C25082a.m62839c(this.oTPItinerarySeq, mVOTPScoringData.oTPItinerarySeq)) != 0) || (compareTo = Boolean.valueOf(mo27784E()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27784E()))) != 0 || ((mo27784E() && (compareTo = this.oTPLegSummary.compareTo(mVOTPScoringData.oTPLegSummary)) != 0) || (compareTo = Boolean.valueOf(mo27786G()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27786G()))) != 0 || ((mo27786G() && (compareTo = this.oTPRequestUrl.compareTo(mVOTPScoringData.oTPRequestUrl)) != 0) || (compareTo = Boolean.valueOf(mo27788I()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27788I()))) != 0 || ((mo27788I() && (compareTo = C25082a.m62840d(this.oTPTotalTime, mVOTPScoringData.oTPTotalTime)) != 0) || (compareTo = Boolean.valueOf(mo27787H()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27787H()))) != 0 || ((mo27787H() && (compareTo = C25082a.m62840d(this.oTPStartTime, mVOTPScoringData.oTPStartTime)) != 0) || (compareTo = Boolean.valueOf(mo27782A()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27782A()))) != 0 || ((mo27782A() && (compareTo = C25082a.m62840d(this.oTPEndTime, mVOTPScoringData.oTPEndTime)) != 0) || (compareTo = Boolean.valueOf(mo27790L()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27790L()))) != 0 || ((mo27790L() && (compareTo = C25082a.m62840d(this.oTPWaitAtTheBeginning, mVOTPScoringData.oTPWaitAtTheBeginning)) != 0) || (compareTo = Boolean.valueOf(mo27791M()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27791M()))) != 0 || ((mo27791M() && (compareTo = C25082a.m62840d(this.oTPWaitTime, mVOTPScoringData.oTPWaitTime)) != 0) || (compareTo = Boolean.valueOf(mo27792N()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27792N()))) != 0 || ((mo27792N() && (compareTo = C25082a.m62839c(this.oTPWalkDistance, mVOTPScoringData.oTPWalkDistance)) != 0) || (compareTo = Boolean.valueOf(mo27793O()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27793O()))) != 0 || ((mo27793O() && (compareTo = C25082a.m62840d(this.oTPWalkTime, mVOTPScoringData.oTPWalkTime)) != 0) || (compareTo = Boolean.valueOf(mo27789J()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27789J()))) != 0 || ((mo27789J() && (compareTo = C25082a.m62840d(this.oTPTransitTime, mVOTPScoringData.oTPTransitTime)) != 0) || (compareTo = Boolean.valueOf(mo27785F()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27785F()))) != 0 || ((mo27785F() && (compareTo = C25082a.m62839c(this.oTPNumOfTransit, mVOTPScoringData.oTPNumOfTransit)) != 0) || (compareTo = Boolean.valueOf(mo27822k()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27822k()))) != 0 || ((mo27822k() && (compareTo = C25082a.m62839c(this.googleItinerarySeq, mVOTPScoringData.googleItinerarySeq)) != 0) || (compareTo = Boolean.valueOf(mo27824l()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27824l()))) != 0 || ((mo27824l() && (compareTo = this.googleLegSummary.compareTo(mVOTPScoringData.googleLegSummary)) != 0) || (compareTo = Boolean.valueOf(mo27829o()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27829o()))) != 0 || ((mo27829o() && (compareTo = this.googleRequestUrl.compareTo(mVOTPScoringData.googleRequestUrl)) != 0) || (compareTo = Boolean.valueOf(mo27833q()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27833q()))) != 0 || ((mo27833q() && (compareTo = C25082a.m62840d(this.googleTotalTime, mVOTPScoringData.googleTotalTime)) != 0) || (compareTo = Boolean.valueOf(mo27831p()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27831p()))) != 0 || ((mo27831p() && (compareTo = C25082a.m62840d(this.googleStartTime, mVOTPScoringData.googleStartTime)) != 0) || (compareTo = Boolean.valueOf(mo27820j()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27820j()))) != 0 || ((mo27820j() && (compareTo = C25082a.m62840d(this.googleEndTime, mVOTPScoringData.googleEndTime)) != 0) || (compareTo = Boolean.valueOf(mo27837s()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27837s()))) != 0 || ((mo27837s() && (compareTo = C25082a.m62840d(this.googleWaitAtTheBeginning, mVOTPScoringData.googleWaitAtTheBeginning)) != 0) || (compareTo = Boolean.valueOf(mo27839t()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27839t()))) != 0 || ((mo27839t() && (compareTo = C25082a.m62840d(this.googleWaitTime, mVOTPScoringData.googleWaitTime)) != 0) || (compareTo = Boolean.valueOf(mo27842u()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27842u()))) != 0 || ((mo27842u() && (compareTo = C25082a.m62839c(this.googleWalkDistance, mVOTPScoringData.googleWalkDistance)) != 0) || (compareTo = Boolean.valueOf(mo27844v()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27844v()))) != 0 || ((mo27844v() && (compareTo = C25082a.m62840d(this.googleWalkTime, mVOTPScoringData.googleWalkTime)) != 0) || (compareTo = Boolean.valueOf(mo27835r()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27835r()))) != 0 || ((mo27835r() && (compareTo = C25082a.m62840d(this.googleTransitTime, mVOTPScoringData.googleTransitTime)) != 0) || (compareTo = Boolean.valueOf(mo27826m()).compareTo(Boolean.valueOf(mVOTPScoringData.mo27826m()))) != 0))))))))))))))))))))))))))))))))) {
            return compareTo;
        }
        if (!mo27826m() || (c = C25082a.m62839c(this.googleNumOfTransit, mVOTPScoringData.googleNumOfTransit)) == 0) {
            return 0;
        }
        return c;
    }

    /* renamed from: d0 */
    public final void mo27808d0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 22, true);
    }

    /* renamed from: e0 */
    public final void mo27809e0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 23, true);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVOTPScoringData)) {
            return false;
        }
        MVOTPScoringData mVOTPScoringData = (MVOTPScoringData) obj;
        if (this.requestId != mVOTPScoringData.requestId || this.metroAreaId != mVOTPScoringData.metroAreaId) {
            return false;
        }
        boolean y = mo27846y();
        boolean y2 = mVOTPScoringData.mo27846y();
        if (((y || y2) && (!y || !y2 || !this.metroAreaName.equals(mVOTPScoringData.metroAreaName))) || this.fromLat != mVOTPScoringData.fromLat || this.fromLon != mVOTPScoringData.fromLon || this.toLat != mVOTPScoringData.toLat || this.toLon != mVOTPScoringData.toLon || this.date != mVOTPScoringData.date || this.carDuration != mVOTPScoringData.carDuration || this.oTPItinerarySeq != mVOTPScoringData.oTPItinerarySeq) {
            return false;
        }
        boolean E = mo27784E();
        boolean E2 = mVOTPScoringData.mo27784E();
        if ((E || E2) && (!E || !E2 || !this.oTPLegSummary.equals(mVOTPScoringData.oTPLegSummary))) {
            return false;
        }
        boolean G = mo27786G();
        boolean G2 = mVOTPScoringData.mo27786G();
        if (((G || G2) && (!G || !G2 || !this.oTPRequestUrl.equals(mVOTPScoringData.oTPRequestUrl))) || this.oTPTotalTime != mVOTPScoringData.oTPTotalTime || this.oTPStartTime != mVOTPScoringData.oTPStartTime || this.oTPEndTime != mVOTPScoringData.oTPEndTime || this.oTPWaitAtTheBeginning != mVOTPScoringData.oTPWaitAtTheBeginning || this.oTPWaitTime != mVOTPScoringData.oTPWaitTime || this.oTPWalkDistance != mVOTPScoringData.oTPWalkDistance || this.oTPWalkTime != mVOTPScoringData.oTPWalkTime || this.oTPTransitTime != mVOTPScoringData.oTPTransitTime || this.oTPNumOfTransit != mVOTPScoringData.oTPNumOfTransit || this.googleItinerarySeq != mVOTPScoringData.googleItinerarySeq) {
            return false;
        }
        boolean l = mo27824l();
        boolean l2 = mVOTPScoringData.mo27824l();
        if ((l || l2) && (!l || !l2 || !this.googleLegSummary.equals(mVOTPScoringData.googleLegSummary))) {
            return false;
        }
        boolean o = mo27829o();
        boolean o2 = mVOTPScoringData.mo27829o();
        if (((!o && !o2) || (o && o2 && this.googleRequestUrl.equals(mVOTPScoringData.googleRequestUrl))) && this.googleTotalTime == mVOTPScoringData.googleTotalTime && this.googleStartTime == mVOTPScoringData.googleStartTime && this.googleEndTime == mVOTPScoringData.googleEndTime && this.googleWaitAtTheBeginning == mVOTPScoringData.googleWaitAtTheBeginning && this.googleWaitTime == mVOTPScoringData.googleWaitTime && this.googleWalkDistance == mVOTPScoringData.googleWalkDistance && this.googleWalkTime == mVOTPScoringData.googleWalkTime && this.googleTransitTime == mVOTPScoringData.googleTransitTime && this.googleNumOfTransit == mVOTPScoringData.googleNumOfTransit) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27811f() {
        return C13637c.m34053H(this.__isset_bitfield, 7);
    }

    /* renamed from: f0 */
    public final void mo27812f0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 24, true);
    }

    /* renamed from: g */
    public final boolean mo27813g() {
        return C13637c.m34053H(this.__isset_bitfield, 6);
    }

    /* renamed from: g0 */
    public final void mo27814g0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 25, true);
    }

    /* renamed from: h */
    public final boolean mo27815h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h0 */
    public final void mo27816h0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27818i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: i0 */
    public final void mo27819i0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 11, true);
    }

    /* renamed from: j */
    public final boolean mo27820j() {
        return C13637c.m34053H(this.__isset_bitfield, 21);
    }

    /* renamed from: j0 */
    public final void mo27821j0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 8, true);
    }

    /* renamed from: k */
    public final boolean mo27822k() {
        return C13637c.m34053H(this.__isset_bitfield, 18);
    }

    /* renamed from: k0 */
    public final void mo27823k0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 17, true);
    }

    /* renamed from: l */
    public final boolean mo27824l() {
        return this.googleLegSummary != null;
    }

    /* renamed from: l0 */
    public final void mo27825l0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 10, true);
    }

    /* renamed from: m */
    public final boolean mo27826m() {
        return C13637c.m34053H(this.__isset_bitfield, 27);
    }

    /* renamed from: m0 */
    public final void mo27827m0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 9, true);
    }

    /* renamed from: n0 */
    public final void mo27828n0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 16, true);
    }

    /* renamed from: o */
    public final boolean mo27829o() {
        return this.googleRequestUrl != null;
    }

    /* renamed from: o0 */
    public final void mo27830o0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 12, true);
    }

    /* renamed from: p */
    public final boolean mo27831p() {
        return C13637c.m34053H(this.__isset_bitfield, 20);
    }

    /* renamed from: p0 */
    public final void mo27832p0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 13, true);
    }

    /* renamed from: q */
    public final boolean mo27833q() {
        return C13637c.m34053H(this.__isset_bitfield, 19);
    }

    /* renamed from: q0 */
    public final void mo27834q0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 14, true);
    }

    /* renamed from: r */
    public final boolean mo27835r() {
        return C13637c.m34053H(this.__isset_bitfield, 26);
    }

    /* renamed from: r0 */
    public final void mo27836r0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 15, true);
    }

    /* renamed from: s */
    public final boolean mo27837s() {
        return C13637c.m34053H(this.__isset_bitfield, 22);
    }

    /* renamed from: s0 */
    public final void mo27838s0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: t */
    public final boolean mo27839t() {
        return C13637c.m34053H(this.__isset_bitfield, 23);
    }

    /* renamed from: t0 */
    public final void mo27840t0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVOTPScoringData(", "requestId:");
        C25541a.m63889t(n, this.requestId, ", ", "metroAreaId:");
        C0016g.m42z(n, this.metroAreaId, ", ", "metroAreaName:");
        String str = this.metroAreaName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("fromLat:");
        C16759e.m42355k(n, this.fromLat, ", ", "fromLon:");
        C16759e.m42355k(n, this.fromLon, ", ", "toLat:");
        C16759e.m42355k(n, this.toLat, ", ", "toLon:");
        C16759e.m42355k(n, this.toLon, ", ", "date:");
        C25541a.m63889t(n, this.date, ", ", "carDuration:");
        C25541a.m63889t(n, this.carDuration, ", ", "oTPItinerarySeq:");
        C0016g.m42z(n, this.oTPItinerarySeq, ", ", "oTPLegSummary:");
        String str2 = this.oTPLegSummary;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("oTPRequestUrl:");
        String str3 = this.oTPRequestUrl;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("oTPTotalTime:");
        C25541a.m63889t(n, this.oTPTotalTime, ", ", "oTPStartTime:");
        C25541a.m63889t(n, this.oTPStartTime, ", ", "oTPEndTime:");
        C25541a.m63889t(n, this.oTPEndTime, ", ", "oTPWaitAtTheBeginning:");
        C25541a.m63889t(n, this.oTPWaitAtTheBeginning, ", ", "oTPWaitTime:");
        C25541a.m63889t(n, this.oTPWaitTime, ", ", "oTPWalkDistance:");
        C0016g.m42z(n, this.oTPWalkDistance, ", ", "oTPWalkTime:");
        C25541a.m63889t(n, this.oTPWalkTime, ", ", "oTPTransitTime:");
        C25541a.m63889t(n, this.oTPTransitTime, ", ", "oTPNumOfTransit:");
        C0016g.m42z(n, this.oTPNumOfTransit, ", ", "googleItinerarySeq:");
        C0016g.m42z(n, this.googleItinerarySeq, ", ", "googleLegSummary:");
        String str4 = this.googleLegSummary;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("googleRequestUrl:");
        String str5 = this.googleRequestUrl;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("googleTotalTime:");
        C25541a.m63889t(n, this.googleTotalTime, ", ", "googleStartTime:");
        C25541a.m63889t(n, this.googleStartTime, ", ", "googleEndTime:");
        C25541a.m63889t(n, this.googleEndTime, ", ", "googleWaitAtTheBeginning:");
        C25541a.m63889t(n, this.googleWaitAtTheBeginning, ", ", "googleWaitTime:");
        C25541a.m63889t(n, this.googleWaitTime, ", ", "googleWalkDistance:");
        C0016g.m42z(n, this.googleWalkDistance, ", ", "googleWalkTime:");
        C25541a.m63889t(n, this.googleWalkTime, ", ", "googleTransitTime:");
        C25541a.m63889t(n, this.googleTransitTime, ", ", "googleNumOfTransit:");
        return C13437d.m33707l(n, this.googleNumOfTransit, ")");
    }

    /* renamed from: u */
    public final boolean mo27842u() {
        return C13637c.m34053H(this.__isset_bitfield, 24);
    }

    /* renamed from: u0 */
    public final void mo27843u0() {
        this.__isset_bitfield = C13637c.m34050E(this.__isset_bitfield, 5, true);
    }

    /* renamed from: v */
    public final boolean mo27844v() {
        return C13637c.m34053H(this.__isset_bitfield, 25);
    }

    /* renamed from: w */
    public final boolean mo27845w() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: y */
    public final boolean mo27846y() {
        return this.metroAreaName != null;
    }
}
