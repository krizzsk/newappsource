package p40;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.DataUnit;
import com.moovit.offline.GtfsConfiguration;
import java.io.IOException;
import java.util.HashSet;
import p646lz.C18299a;
import p929xy.C20664g;
import q00.C19047a;
import q00.C19053d;

/* renamed from: p40.c */
public final class C6069c extends C20664g<GtfsConfiguration> {
    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        return b;
    }

    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        int[] iArr = (int[]) ((C19047a) aVar.mo50690c("CONFIGURATION")).mo51505b(C19053d.f48458J);
        boolean z = false;
        GtfsConfiguration gtfsConfiguration = new GtfsConfiguration(iArr[0], iArr[1], iArr[2]);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        statFs.getTotalBytes();
        statFs.getFreeBytes();
        if (DataUnit.B.toGibibytes((double) statFs.getAvailableBytes()) < 2.0d) {
            z = true;
        }
        if (!z || gtfsConfiguration.mo19763c()) {
            return gtfsConfiguration;
        }
        return GtfsConfiguration.f15144e;
    }
}
