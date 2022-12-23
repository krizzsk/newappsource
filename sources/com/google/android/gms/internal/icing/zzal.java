package com.google.android.gms.internal.icing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.List;
import p001a0.C0016g;

public final class zzal implements AppIndexApi, zzz {
    private static final String zza = "zzal";

    public static Intent zzb(String str, Uri uri) {
        zzc(str, uri);
        if (uri != null && zzd(uri)) {
            return new Intent("android.intent.action.VIEW", uri);
        }
        if (uri == null || !zze(uri)) {
            String valueOf = String.valueOf(uri);
            throw new RuntimeException(C0016g.m31o(new StringBuilder(valueOf.length() + 70), "appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: ", valueOf));
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(pathSegments.get(0));
        if (pathSegments.size() > 1) {
            builder.authority(pathSegments.get(1));
            for (int i = 2; i < pathSegments.size(); i++) {
                builder.appendPath(pathSegments.get(i));
            }
        } else {
            new StringBuilder(String.valueOf(uri).length() + 88);
        }
        builder.encodedQuery(uri.getEncodedQuery());
        builder.encodedFragment(uri.getEncodedFragment());
        return new Intent("android.intent.action.VIEW", builder.build());
    }

    private static void zzc(String str, Uri uri) {
        if (uri != null && zzd(uri)) {
            String host = uri.getHost();
            if (host != null && host.isEmpty()) {
                String valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(C0016g.m31o(new StringBuilder(valueOf.length() + 98), "AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ", valueOf));
            }
        } else if (uri == null || !zze(uri)) {
            String valueOf2 = String.valueOf(uri);
            throw new IllegalArgumentException(C0016g.m31o(new StringBuilder(valueOf2.length() + 176), "AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/<host_path>'. Provided URI: ", valueOf2));
        } else if (str == null || str.equals(uri.getHost())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.isEmpty() || pathSegments.get(0).isEmpty()) {
                String valueOf3 = String.valueOf(uri);
                throw new IllegalArgumentException(C0016g.m31o(new StringBuilder(valueOf3.length() + RecyclerView.C1119a0.FLAG_IGNORE), "AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/<host_path>). Provided URI: ", valueOf3));
            }
        } else {
            String valueOf4 = String.valueOf(uri);
            throw new IllegalArgumentException(C0016g.m31o(new StringBuilder(valueOf4.length() + 150), "AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/<host_path>. Provided URI: ", valueOf4));
        }
    }

    private static boolean zzd(Uri uri) {
        String scheme = uri.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    private static boolean zze(Uri uri) {
        return "android-app".equals(uri.getScheme());
    }

    private final PendingResult<Status> zzf(GoogleApiClient googleApiClient, Action action, int i) {
        return zza(googleApiClient, zzaf.zza(action, System.currentTimeMillis(), googleApiClient.getContext().getPackageName(), i));
    }

    public final AppIndexApi.ActionResult action(GoogleApiClient googleApiClient, Action action) {
        return new zzah(this, zzf(googleApiClient, action, 1), action);
    }

    public final PendingResult<Status> end(GoogleApiClient googleApiClient, Action action) {
        return zzf(googleApiClient, action, 2);
    }

    public final PendingResult<Status> start(GoogleApiClient googleApiClient, Action action) {
        return zzf(googleApiClient, action, 1);
    }

    public final PendingResult<Status> view(GoogleApiClient googleApiClient, Activity activity, Intent intent, String str, Uri uri, List<AppIndexApi.AppIndexingLink> list) {
        String packageName = googleApiClient.getContext().getPackageName();
        if (list != null) {
            for (AppIndexApi.AppIndexingLink appIndexingLink : list) {
                zzc((String) null, appIndexingLink.appIndexingUrl);
            }
        }
        return zza(googleApiClient, new zzx(packageName, intent, str, uri, (String) null, list, 1));
    }

    public final PendingResult<Status> viewEnd(GoogleApiClient googleApiClient, Activity activity, Intent intent) {
        String packageName = googleApiClient.getContext().getPackageName();
        zzw zzw = new zzw();
        zzw.zza(zzx.zza(packageName, intent));
        zzw.zzb(System.currentTimeMillis());
        zzw.zzc(0);
        zzw.zzf(2);
        return zza(googleApiClient, zzw.zzg());
    }

    public final PendingResult<Status> zza(GoogleApiClient googleApiClient, zzx... zzxArr) {
        return googleApiClient.enqueue(new zzag(this, googleApiClient, zzxArr));
    }

    public final PendingResult<Status> view(GoogleApiClient googleApiClient, Activity activity, Uri uri, String str, Uri uri2, List<AppIndexApi.AppIndexingLink> list) {
        String packageName = googleApiClient.getContext().getPackageName();
        zzc(packageName, uri);
        Intent zzb = zzb(packageName, uri);
        String packageName2 = googleApiClient.getContext().getPackageName();
        if (list != null) {
            for (AppIndexApi.AppIndexingLink appIndexingLink : list) {
                zzc((String) null, appIndexingLink.appIndexingUrl);
            }
        }
        return zza(googleApiClient, new zzx(packageName2, zzb, str, uri2, (String) null, list, 1));
    }

    public final PendingResult<Status> viewEnd(GoogleApiClient googleApiClient, Activity activity, Uri uri) {
        Intent zzb = zzb(googleApiClient.getContext().getPackageName(), uri);
        String packageName = googleApiClient.getContext().getPackageName();
        zzw zzw = new zzw();
        zzw.zza(zzx.zza(packageName, zzb));
        zzw.zzb(System.currentTimeMillis());
        zzw.zzc(0);
        zzw.zzf(2);
        return zza(googleApiClient, zzw.zzg());
    }
}
