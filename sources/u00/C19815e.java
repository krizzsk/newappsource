package u00;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.offline.GraphBuildException;
import com.moovit.offline.GtfsConfiguration;
import com.moovit.util.time.C7925b;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import l40.C5601b;
import l40.C5605d;
import m40.C5701a;
import m40.C5702b;
import p786rz.C19387a;
import p898wr.C20400b;
import q40.C6177b;
import q40.C6178c;

/* renamed from: u00.e */
public final class C19815e extends C19806a {

    /* renamed from: e */
    public static final long f50354e = TimeUnit.DAYS.toMillis(3);

    /* renamed from: b */
    public final Object f50355b = new Object();

    /* renamed from: c */
    public C5702b f50356c = null;

    /* renamed from: d */
    public C6178c f50357d = null;

    /* renamed from: u00.e$a */
    public static class C19816a implements FilenameFilter {

        /* renamed from: a */
        public final Collection<String> f50358a;

        public C19816a(ArrayList arrayList) {
            this.f50358a = arrayList;
        }

        public final boolean accept(File file, String str) {
            return this.f50358a.contains(str);
        }
    }

    /* renamed from: u00.e$b */
    public static class C19817b implements FileFilter {

        /* renamed from: a */
        public final int f50359a;

        public C19817b(int i) {
            this.f50359a = i;
        }

        public final boolean accept(File file) {
            int i;
            if (!file.isDirectory()) {
                return false;
            }
            String name = file.getName();
            if (TextUtils.isDigitsOnly(name)) {
                i = Integer.parseInt(name);
            } else {
                i = -1;
            }
            if (i < this.f50359a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: u00.e$c */
    public static class C19818c implements FileFilter {

        /* renamed from: a */
        public final String f50360a;

        public C19818c(GtfsConfiguration gtfsConfiguration) {
            this.f50360a = String.valueOf(gtfsConfiguration.f15149d);
        }

        public final boolean accept(File file) {
            if (!file.isDirectory()) {
                return false;
            }
            return !this.f50360a.equals(file.getName());
        }
    }

    public C19815e(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        File i = mo52117i(context);
        if (i.isDirectory()) {
            C19387a.m46676h(i);
        }
    }

    /* renamed from: c */
    public final void mo51799c() {
        if (this.f50356c != null) {
            synchronized (this) {
                C5702b bVar = this.f50356c;
                if (bVar != null) {
                    C5701a aVar = bVar.f18496a;
                    aVar.f18493b.onLowMemory();
                    aVar.f18495d.onLowMemory();
                }
            }
        }
        if (this.f50357d != null) {
            synchronized (this) {
                C6178c cVar = this.f50357d;
                if (cVar != null) {
                    C6177b bVar2 = cVar.f19569b;
                    bVar2.f19558a.set((Object) null);
                    bVar2.f19560c.onLowMemory();
                    bVar2.f19564g.onLowMemory();
                    bVar2.f19566i.onLowMemory();
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo52116h(Context context, GtfsConfiguration gtfsConfiguration, int i, int i2) throws GraphBuildException, IOException {
        C21100e.m49355o();
        synchronized (this.f50355b) {
            if (!mo52119k(context, gtfsConfiguration, i, i2).isDirectory()) {
                if (mo52120l(239, context)) {
                    int i3 = (gtfsConfiguration.f15149d + i2) % 24;
                    mo52118j(context, false);
                    mo52119k(context, gtfsConfiguration, i, i2);
                    mo52107d();
                    mo52109f();
                    File file = new File(new File(new File(new File(mo52117i(context), "graph"), String.valueOf(gtfsConfiguration.f15149d)), String.valueOf(i)), BillingClientBuilderBridgeCommon.buildMethodName);
                    mo52121m(file);
                    if (file.isDirectory()) {
                        C19387a.m46674f(file);
                    }
                    new C5601b(context).mo21425a();
                    TimeUnit timeUnit = TimeUnit.HOURS;
                    timeUnit.toSeconds((long) i2);
                    timeUnit.toSeconds((long) i3);
                    throw new UnsupportedOperationException("Unsupported operation, did you compile 'tripplanner' flavor?");
                }
                throw new ApplicationBugException("Trying to build graph while offline data files missing.");
            }
        }
    }

    /* renamed from: i */
    public final File mo52117i(Context context) {
        return new File(new File(context.getDir("gtfs", 0), mo52108e()), mo52110g());
    }

    /* renamed from: j */
    public final File mo52118j(Context context, boolean z) {
        File file = new File(mo52117i(context), "files");
        if (z) {
            mo52121m(file);
        }
        return file;
    }

    /* renamed from: k */
    public final File mo52119k(Context context, GtfsConfiguration gtfsConfiguration, int i, int i2) {
        return new File(new File(new File(new File(mo52117i(context), "graph"), String.valueOf(gtfsConfiguration.f15149d)), String.valueOf(i)), String.valueOf(i2));
    }

    /* renamed from: l */
    public final boolean mo52120l(int i, Context context) {
        String[] list;
        ArrayList b = GtfsConfiguration.m11401b(i);
        if (C13717b.m34258e(b)) {
            return true;
        }
        File j = mo52118j(context, false);
        if (j.isDirectory() && (list = j.list(new C19816a(b))) != null && b.size() == list.length) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo52121m(File file) {
        synchronized (this) {
            if (!file.isDirectory()) {
                if (!file.mkdirs()) {
                    throw new IllegalStateException("Unable to create directory: " + file);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo52122n(int i, Context context) {
        C21100e.m49355o();
        File j = mo52118j(context, false);
        if (j.exists() && j.isDirectory()) {
            ArrayList b = GtfsConfiguration.m11401b(i);
            if (!b.isEmpty()) {
                SharedPreferences.Editor edit = context.getSharedPreferences("gtfs_dal", 0).edit();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    File file = new File(j, str);
                    if (file.exists() && file.isFile()) {
                        String str2 = "last_modified_" + str;
                        C21100e.m49373x(str2, "name");
                        edit.putLong(str2, Long.valueOf(currentTimeMillis).longValue());
                    }
                }
                edit.apply();
                C7925b.m18016d(context, currentTimeMillis);
                C13717b.m34269p(b);
            }
        }
    }

    /* renamed from: o */
    public final C6178c mo52123o(Context context) throws IOException {
        C21100e.m49355o();
        if (this.f50357d == null) {
            synchronized (this) {
                if (this.f50357d == null) {
                    this.f50357d = new C6178c(new C5605d(mo52118j(context, false)));
                }
            }
        }
        return this.f50357d;
    }
}
