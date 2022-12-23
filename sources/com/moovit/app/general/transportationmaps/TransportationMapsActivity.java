package com.moovit.app.general.transportationmaps;

import a00.C13382a;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import com.appsflyer.ServerParameters;
import com.moovit.app.MoovitAppActivity;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m00.C18310d;
import p567iq.C17635b;
import p779rs.C19324a;
import p779rs.C19325b;
import p824tp.C19728f;
import p898wr.C20400b;
import p945yr.C20756b;
import p977zz.C20978z;

public class TransportationMapsActivity extends MoovitAppActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f38085Y = 0;

    /* renamed from: U */
    public final C14896a f38086U = new C14896a();

    /* renamed from: X */
    public C14898c f38087X;

    /* renamed from: com.moovit.app.general.transportationmaps.TransportationMapsActivity$a */
    public class C14896a extends BroadcastReceiver {
        public C14896a() {
        }

        public final void onReceive(Context context, Intent intent) {
            TransportationMapsActivity transportationMapsActivity = TransportationMapsActivity.this;
            int i = TransportationMapsActivity.f38085Y;
            transportationMapsActivity.getClass();
            long longExtra = intent.getLongExtra("extra_download_id", 0);
            TransportationMapLoadingStatus A2 = transportationMapsActivity.mo45023A2(longExtra);
            if (A2 == TransportationMapLoadingStatus.DOWNLOAD_FINISHED) {
                if (transportationMapsActivity.mo45025z2(longExtra) != null) {
                    transportationMapsActivity.mo45024C2(longExtra);
                }
            } else if (A2 == TransportationMapLoadingStatus.DOWNLOAD_FAILED) {
                transportationMapsActivity.mo45024C2(longExtra);
                Toast.makeText(transportationMapsActivity, R.string.failed_download_map, 0).show();
            }
        }
    }

    /* renamed from: com.moovit.app.general.transportationmaps.TransportationMapsActivity$b */
    public static /* synthetic */ class C14897b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38089a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus[] r0 = com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38089a = r0
                com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus r1 = com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus.NOT_STARTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38089a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus r1 = com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus.LOADING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38089a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus r1 = com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus.DOWNLOAD_FINISHED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38089a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus r1 = com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus.DOWNLOAD_FAILED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.general.transportationmaps.TransportationMapsActivity.C14897b.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.general.transportationmaps.TransportationMapsActivity$c */
    public class C14898c extends C18310d<C19324a, ListItemView, Void> {
        public C14898c(Context context, List<C19324a> list) {
            super(context, R.layout.transportation_map_list_item, R.layout.transportation_map_list_item, list);
        }

        /* renamed from: d */
        public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
            boolean z;
            TransportationMapLoadingStatus transportationMapLoadingStatus;
            ListItemView listItemView = (ListItemView) view;
            C19324a aVar = (C19324a) obj;
            listItemView.setTitle((CharSequence) aVar.f49174b);
            if (aVar.f49178f >= aVar.f49176d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                TransportationMapsActivity transportationMapsActivity = TransportationMapsActivity.this;
                long j = aVar.f49177e;
                int i2 = TransportationMapsActivity.f38085Y;
                transportationMapLoadingStatus = transportationMapsActivity.mo45023A2(j);
                if (TransportationMapLoadingStatus.DOWNLOAD_FAILED.equals(transportationMapLoadingStatus)) {
                    TransportationMapsActivity.m37573y2(TransportationMapsActivity.this, aVar);
                }
            } else {
                transportationMapLoadingStatus = TransportationMapLoadingStatus.NOT_STARTED;
                TransportationMapsActivity.m37573y2(TransportationMapsActivity.this, aVar);
            }
            TransportationMapsActivity.m37572B2(listItemView, transportationMapLoadingStatus);
        }
    }

    /* renamed from: B2 */
    public static void m37572B2(ListItemView listItemView, TransportationMapLoadingStatus transportationMapLoadingStatus) {
        int i = C14897b.f38089a[transportationMapLoadingStatus.ordinal()];
        if (i != 1) {
            if (i == 2) {
                listItemView.setAccessoryView((int) R.layout.progress_bar_small);
                return;
            } else if (i == 3) {
                listItemView.setAccessoryDrawable((Drawable) null);
                C13382a.m33674j(listItemView, listItemView.getText(), listItemView.getContext().getString(R.string.voice_over_offline_maps_offline_view));
                return;
            } else if (i != 4) {
                return;
            }
        }
        ImageView imageView = new ImageView(listItemView.getContext());
        imageView.setImageResource(R.drawable.ic_download_16_primary);
        listItemView.setAccessoryView((View) imageView);
        C13382a.m33674j(listItemView, listItemView.getText(), listItemView.getContext().getString(R.string.voice_over_offline_maps_offline_download));
    }

    /* renamed from: y2 */
    public static void m37573y2(TransportationMapsActivity transportationMapsActivity, C19324a aVar) {
        transportationMapsActivity.getClass();
        if (aVar.f49177e != -1) {
            ((DownloadManager) transportationMapsActivity.getSystemService("download")).remove(new long[]{aVar.f49177e});
            aVar.f49177e = -1;
            aVar.f49178f = aVar.f49176d;
            HashSet hashSet = C19728f.f50164e;
            ((C20756b) ((C20400b) C17635b.m43779f(transportationMapsActivity).mo52086d((C19728f) transportationMapsActivity.getSystemService("metro_context"))).mo51794a(C20756b.class)).mo52893j(transportationMapsActivity, aVar);
        }
    }

    /* renamed from: A2 */
    public final TransportationMapLoadingStatus mo45023A2(long j) {
        if (j == -1) {
            return TransportationMapLoadingStatus.NOT_STARTED;
        }
        TransportationMapLoadingStatus transportationMapLoadingStatus = TransportationMapLoadingStatus.NOT_STARTED;
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(new long[]{j});
        Cursor query2 = ((DownloadManager) getSystemService("download")).query(query);
        if (query2.moveToFirst()) {
            int i = query2.getInt(query2.getColumnIndex(ServerParameters.STATUS));
            if (i == 1) {
                transportationMapLoadingStatus = TransportationMapLoadingStatus.LOADING;
            } else if (i == 2) {
                transportationMapLoadingStatus = TransportationMapLoadingStatus.LOADING;
            } else if (i == 4) {
                transportationMapLoadingStatus = TransportationMapLoadingStatus.LOADING;
            } else if (i == 8) {
                transportationMapLoadingStatus = TransportationMapLoadingStatus.DOWNLOAD_FINISHED;
            } else if (i == 16) {
                transportationMapLoadingStatus = TransportationMapLoadingStatus.DOWNLOAD_FAILED;
            }
        }
        query2.close();
        return transportationMapLoadingStatus;
    }

    /* renamed from: C2 */
    public final void mo45024C2(long j) {
        for (T t : Collections.unmodifiableList(this.f38087X.f46697g)) {
            if (t.f49177e == j) {
                this.f38087X.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        unregisterReceiver(this.f38086U);
        super.mo24880c2();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.transportation_maps_activity);
        this.f38087X = new C14898c(this, (List) mo44537r1("TRANSPORTATION_MAPS"));
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(this.f38087X);
        listView.setOnItemClickListener(new C19325b(this));
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        registerReceiver(this.f38086U, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("TRANSPORTATION_MAPS");
        return s1;
    }

    /* renamed from: z2 */
    public final Uri mo45025z2(long j) {
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(new long[]{j});
        Cursor query2 = ((DownloadManager) getSystemService("download")).query(query);
        try {
            if (!query2.moveToFirst()) {
                return null;
            }
            if (query2.getInt(query2.getColumnIndex(ServerParameters.STATUS)) != 8) {
                query2.close();
                return null;
            }
            int columnIndex = query2.getColumnIndex("local_uri");
            if (query2.isNull(columnIndex)) {
                query2.close();
                return null;
            }
            Uri c = C20978z.m49127c(this, new File(Uri.parse(query2.getString(columnIndex)).getPath()));
            query2.close();
            return c;
        } catch (Exception unused) {
            return null;
        } finally {
            query2.close();
        }
    }
}
