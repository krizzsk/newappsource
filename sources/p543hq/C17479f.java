package p543hq;

import aa0.C7541m;
import android.content.Context;
import android.location.Location;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.aws.kinesis.KinesisStream;
import com.moovit.location.C16202a;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
import com.tranzmate.moovit.protocol.kinesis.MVAnalyticsFlowKey;
import com.tranzmate.moovit.protocol.kinesis.MVAnalyticsRecord;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p401bz.C13709c;
import p401bz.C13714h;
import p583jk.C17884p;

/* renamed from: hq.f */
public final class C17479f extends C13714h<MVAnalyticsRecord> {

    /* renamed from: h */
    public static final C7541m f45005h = new C7541m("SequenceProvider");

    /* renamed from: c */
    public final AnalyticsFlowKey f45006c;

    /* renamed from: d */
    public final int f45007d = f45005h.mo23805a();

    /* renamed from: e */
    public final ArrayList f45008e = new ArrayList();

    /* renamed from: f */
    public final long f45009f;

    /* renamed from: g */
    public final Location f45010g;

    public C17479f(Context context, AnalyticsFlowKey analyticsFlowKey) {
        super(context);
        C21100e.m49373x(analyticsFlowKey, "flowKey");
        this.f45006c = analyticsFlowKey;
        this.f45009f = C13709c.f33785b.mo19759a(context.getSharedPreferences("kinesis_constants", 0)).longValue();
        this.f45010g = C16202a.get(context).getPermissionAwareLowAccuracyRareUpdates().mo50014i();
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        MVAnalyticsFlowKey a = C17477d.m43544a(this.f45006c);
        int i = this.f45007d;
        ArrayList c = C13720d.m34273c(this.f45008e, (C13722f) null, new C17478e(0));
        MVAnalyticsRecord mVAnalyticsRecord = new MVAnalyticsRecord();
        mVAnalyticsRecord.flowKey = a;
        mVAnalyticsRecord.flowSequenceId = i;
        mVAnalyticsRecord.mo27665p();
        mVAnalyticsRecord.events = c;
        long j = this.f45009f;
        if (j > 0) {
            mVAnalyticsRecord.configurationVersion = j;
            mVAnalyticsRecord.mo27664o();
        }
        MVGpsLocation t = C13749c.m34334t(this.f45010g);
        if (t != null) {
            mVAnalyticsRecord.userLocation = t;
        }
        return mVAnalyticsRecord;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo40581b(TBase tBase) {
        MVAnalyticsRecord mVAnalyticsRecord = (MVAnalyticsRecord) tBase;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17479f)) {
            return false;
        }
        C17479f fVar = (C17479f) obj;
        if (!this.f45006c.equals(fVar.f45006c) || this.f45007d != fVar.f45007d || !this.f45008e.equals(fVar.f45008e)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final KinesisStream mo40578g() {
        return KinesisStream.ANALYTICS;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f45006c), this.f45007d, C17884p.m44335F(this.f45008e));
    }

    /* renamed from: i */
    public final boolean mo40580i() {
        return true;
    }
}
