package p779rs;

import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.general.transportationmaps.TransportationMapLoadingStatus;
import com.moovit.app.general.transportationmaps.TransportationMapsActivity;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.design.view.list.ListItemView;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import p172m9.C5720b;
import p543hq.C17474b;
import p567iq.C17635b;
import p824tp.C19728f;
import p898wr.C20400b;
import p945yr.C20756b;
import p977zz.C20964s0;

/* renamed from: rs.b */
public final /* synthetic */ class C19325b implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ TransportationMapsActivity f49179b;

    public /* synthetic */ C19325b(TransportationMapsActivity transportationMapsActivity) {
        this.f49179b = transportationMapsActivity;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str;
        int lastIndexOf;
        int i2;
        Uri z2;
        List<ResolveInfo> queryIntentActivities;
        TransportationMapsActivity transportationMapsActivity = this.f49179b;
        int i3 = TransportationMapsActivity.f38085Y;
        transportationMapsActivity.getClass();
        C19324a aVar = (C19324a) adapterView.getItemAtPosition(i);
        ListItemView listItemView = (ListItemView) view;
        int i4 = TransportationMapsActivity.C14897b.f38089a[transportationMapsActivity.mo45023A2(aVar.f49177e).ordinal()];
        if (i4 == 1) {
            String str2 = aVar.f49175c;
            if (!C20964s0.m49090h(str2) && (lastIndexOf = str2.lastIndexOf(47)) != -1 && (i2 = lastIndexOf + 1) < str2.length()) {
                str = str2.substring(i2);
            } else {
                str = "";
            }
            try {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                request.setDescription(transportationMapsActivity.getString(R.string.downloading) + str);
                request.setTitle(str);
                request.setDestinationInExternalFilesDir(transportationMapsActivity, Environment.DIRECTORY_DOWNLOADS, str);
                request.setNotificationVisibility(1);
                aVar.f49177e = ((DownloadManager) transportationMapsActivity.getSystemService("download")).enqueue(request);
                aVar.f49178f = aVar.f49176d;
                HashSet hashSet = C19728f.f50164e;
                ((C20756b) ((C20400b) C17635b.m43779f(transportationMapsActivity).mo52086d((C19728f) transportationMapsActivity.getSystemService("metro_context"))).mo51794a(C20756b.class)).mo52893j(transportationMapsActivity, aVar);
                TransportationMapsActivity.m37572B2(listItemView, TransportationMapLoadingStatus.LOADING);
            } catch (IllegalArgumentException unused) {
            }
            ServerId serverId = aVar.f49173a;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.TRANSPORTATION_MAP_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.STATE, "download_map");
            aVar2.mo49935c(AnalyticsAttributeKey.MAP_ID, serverId.f15142b);
            transportationMapsActivity.mo44545v2(aVar2.mo49933a());
        } else if (i4 == 3 && (z2 = transportationMapsActivity.mo45025z2(aVar.f49177e)) != null) {
            ServerId serverId2 = aVar.f49173a;
            C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.TRANSPORTATION_MAP_CLICK);
            aVar3.mo49939g(AnalyticsAttributeKey.STATE, "open_map");
            aVar3.mo49935c(AnalyticsAttributeKey.MAP_ID, serverId2.f15142b);
            transportationMapsActivity.mo44545v2(aVar3.mo49933a());
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(z2, C5720b.m14063n(z2.getPath()));
            Uri data = intent.getData();
            if (!(data == null || (queryIntentActivities = transportationMapsActivity.getPackageManager().queryIntentActivities(intent, SQLiteDatabase.OPEN_FULLMUTEX)) == null)) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    transportationMapsActivity.grantUriPermission(resolveInfo.activityInfo.packageName, data, 1);
                }
            }
            transportationMapsActivity.startActivity(Intent.createChooser(intent, transportationMapsActivity.getText(R.string.open_file_chooser)));
        }
    }
}
