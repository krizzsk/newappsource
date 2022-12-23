package p715ox;

import android.util.SparseArray;
import c00.C13721e;
import com.moovit.app.tod.shuttle.model.TodShuttleStop;
import com.moovit.commons.request.BadResponseException;
import com.tranzmate.moovit.protocol.tod.shuttles.MVTodShuttlePattern;

/* renamed from: ox.g */
public final /* synthetic */ class C18857g implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ SparseArray f48008b;

    /* renamed from: c */
    public final /* synthetic */ MVTodShuttlePattern f48009c;

    public /* synthetic */ C18857g(SparseArray sparseArray, MVTodShuttlePattern mVTodShuttlePattern) {
        this.f48008b = sparseArray;
        this.f48009c = mVTodShuttlePattern;
    }

    public final Object convert(Object obj) {
        SparseArray sparseArray = this.f48008b;
        MVTodShuttlePattern mVTodShuttlePattern = this.f48009c;
        Integer num = (Integer) obj;
        TodShuttleStop todShuttleStop = (TodShuttleStop) sparseArray.get(num.intValue());
        if (todShuttleStop != null) {
            return todShuttleStop;
        }
        throw new BadResponseException(String.format("Shuttle stop(%1$s) not found in meta data while decoding pattern(%2$s)", new Object[]{num, mVTodShuttlePattern.patternId}));
    }
}
