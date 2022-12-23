package p40;

import android.content.Context;
import c70.C13752e;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.offline.GtfsConfiguration;
import java.io.IOException;
import p646lz.C18299a;

/* renamed from: p40.f */
public final class C6072f extends C6066a<Boolean> {
    /* renamed from: n */
    public final Object mo6592n(Context context, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        if (((GtfsConfiguration) aVar.mo50690c("GTFS_CONFIGURATION")).mo19763c()) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if (aVar.mo50695h("GTFS_LINE_GROUPS_PARSER_LOADER", false) != null) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.mo50695h("GTFS_STOPS_PARSER_LOADER", false) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z8 = z & z2;
        if (aVar.mo50695h("GTFS_PATTERNS_PARSER_LOADER", false) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z9 = z8 & z3;
        if (aVar.mo50695h("GTFS_BICYCLE_STOPS_PARSER_LOADER", false) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z11 = z9 & z4;
        if (aVar.mo50695h("GTFS_SHAPES_PARSER_LOADER", false) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z12 = z11 & z5;
        if (aVar.mo50695h("GTFS_SHAPE_SEGMENTS_PARSER_LOADER", false) != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z13 = z12 & z6;
        if (aVar.mo50695h("GTFS_FREQUENCIES_PARSER_LOADER", false) != null) {
            z7 = true;
        }
        return Boolean.valueOf(z13 & z7);
    }
}
