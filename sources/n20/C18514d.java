package n20;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import com.moovit.MoovitApplication;
import java.util.concurrent.TimeUnit;
import m20.C18322a;
import p081f3.C4648b;
import p081f3.C4665k;
import p646lz.C18299a;

/* renamed from: n20.d */
public final class C18514d implements C18322a {
    /* renamed from: d */
    public static synchronized boolean m45390d() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        synchronized (C18514d.class) {
            C18299a aVar = MoovitApplication.f37317k.f37321e;
            boolean z11 = false;
            if (aVar.mo50695h("GTFS_STATIC_DATA_DOWNLOADER", false) != null) {
                z = true;
            } else {
                z = false;
            }
            if (aVar.mo50695h("GTFS_REMOTE_IMAGES_PARSER_LOADER", false) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z12 = z & z2;
            if (aVar.mo50695h("GTFS_LINE_GROUPS_PARSER_LOADER", false) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z13 = z12 & z3;
            if (aVar.mo50695h("GTFS_STOPS_PARSER_LOADER", false) != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z14 = z13 & z4;
            if (aVar.mo50695h("GTFS_PATTERNS_PARSER_LOADER", false) != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z15 = z14 & z5;
            if (aVar.mo50695h("GTFS_BICYCLE_STOPS_PARSER_LOADER", false) != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z16 = z15 & z6;
            if (aVar.mo50695h("GTFS_SHAPES_PARSER_LOADER", false) != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z17 = z16 & z7;
            if (aVar.mo50695h("GTFS_SHAPE_SEGMENTS_PARSER_LOADER", false) != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z18 = z17 & z8;
            if (aVar.mo50695h("GTFS_FREQUENCIES_PARSER_LOADER", false) != null) {
                z11 = true;
            }
            z9 = z18 & z11;
        }
        return z9;
    }

    /* renamed from: a */
    public final String mo50104a() {
        return "gtfs_static_data_updater";
    }

    /* renamed from: b */
    public final C4665k mo50105b() {
        C4665k.C4666a b = C16530d.m42009b(this, 1, TimeUnit.DAYS, 12, TimeUnit.HOURS);
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.UNMETERED;
        return (C4665k) ((C4665k.C4666a) b.mo20192f(new C4648b(aVar))).mo20190b();
    }

    /* renamed from: c */
    public final ListenableWorker.C1379a mo50106c(Context context) {
        if (m45390d()) {
            return new ListenableWorker.C1379a.C1382c();
        }
        return new ListenableWorker.C1379a.C1380a();
    }
}
