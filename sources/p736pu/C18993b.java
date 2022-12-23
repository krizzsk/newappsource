package p736pu;

import c00.C13719c;
import c00.C13720d;
import c00.C13721e;
import c00.C13722f;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.moovit.transit.TransitPatternShape;
import com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalShapeSegment;
import h60.C17327j1;
import i30.C5268d;
import java.util.List;

/* renamed from: pu.b */
public final /* synthetic */ class C18993b implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f48338b;

    /* renamed from: c */
    public final /* synthetic */ C5268d f48339c;

    public /* synthetic */ C18993b(C5268d dVar, int i) {
        this.f48338b = i;
        this.f48339c = dVar;
    }

    public final Object convert(Object obj) {
        switch (this.f48338b) {
            case 0:
                return this.f48339c.mo21064c((ServerId) obj);
            default:
                C5268d dVar = this.f48339c;
                List<Integer> list = ((MVLineArrivalShapeSegment) obj).shapeSegmentIds;
                C13719c cVar = C7841a.f23766a;
                return new TransitPatternShape(C13720d.m34273c(list, (C13722f) null, new C17327j1(dVar, 1)));
        }
    }
}
