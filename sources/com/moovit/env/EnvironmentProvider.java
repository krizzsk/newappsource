package com.moovit.env;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.appsflyer.ServerParameters;
import com.moovit.MoovitApplication;
import com.moovit.aws.kinesis.KinesisStream;
import com.moovit.commons.utils.contentprovider.AbstractContentProvider;
import p824tp.C19746x;
import p906wz.C20431c;

@SuppressLint({"LogNotTimber"})
public final class EnvironmentProvider extends AbstractContentProvider {

    /* renamed from: b */
    public static final SparseArray<String> f41473b;

    static {
        SparseArray<String> sparseArray = new SparseArray<>(7);
        f41473b = sparseArray;
        sparseArray.put(C19746x.server_path_app_server_url, "app");
        sparseArray.put(C19746x.server_path_app_server_secured_url, "secureApp");
        sparseArray.put(C19746x.server_path_cdn_server_url, "cdn");
        sparseArray.put(C19746x.server_path_search_server_url, "search");
        sparseArray.put(C19746x.server_path_cdn_resources_base_path, "resources");
        sparseArray.put(C19746x.server_path_cdn_offline_base_path, "offlineResources");
        sparseArray.put(C19746x.server_path_sdk_server_url, ServerParameters.ANDROID_SDK_INT);
    }

    /* renamed from: a */
    public static ServerEnvironment m40486a(Context context) {
        int i = context.getSharedPreferences("environment_provider", 0).getInt("serverEnvironment", -1);
        if (i != -1) {
            return ServerEnvironment.CODER.mo51916a((short) i);
        }
        return ServerEnvironment.DEV;
    }

    public final boolean onCreate() {
        Context context = getContext();
        int i = 0;
        if (context == null) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("environment_provider", 0);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof MoovitApplication) {
            MoovitApplication moovitApplication = (MoovitApplication) applicationContext;
            synchronized (moovitApplication) {
                if (moovitApplication.f37326j != null) {
                    moovitApplication.f37326j = moovitApplication.mo44556h();
                }
            }
        }
        KinesisStream.setKinesisEnvironment(m40486a(context));
        SparseArray<String> sparseArray = new SparseArray<>(f41473b.size());
        while (true) {
            SparseArray<String> sparseArray2 = f41473b;
            if (i >= sparseArray2.size()) {
                break;
            }
            int keyAt = sparseArray2.keyAt(i);
            String string = sharedPreferences.getString(sparseArray2.valueAt(i), (String) null);
            if (string != null) {
                sparseArray.put(keyAt, string);
            }
            i++;
        }
        if (sparseArray.size() <= 0) {
            sparseArray = null;
        }
        C20431c.f51758p = sparseArray;
        return true;
    }
}
