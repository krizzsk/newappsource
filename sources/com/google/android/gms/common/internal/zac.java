package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.base.C25573R;
import com.google.android.gms.common.C25578R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import p177n1.C5804e;
import p241s0.C6313h;

public final class zac {
    private static final C6313h zaa = new C6313h();
    private static Locale zab;

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String zab(Context context) {
        return context.getResources().getString(C25573R.string.common_google_play_services_notification_channel_name);
    }

    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C25573R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C25573R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C25573R.string.common_google_play_services_enable_button);
    }

    public static String zad(Context context, int i) {
        Resources resources = context.getResources();
        String zaa2 = zaa(context);
        if (i == 1) {
            return resources.getString(C25573R.string.common_google_play_services_install_text, new Object[]{zaa2});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C25573R.string.common_google_play_services_enable_text, new Object[]{zaa2});
            } else if (i == 5) {
                return zah(context, "common_google_play_services_invalid_account_text", zaa2);
            } else {
                if (i == 7) {
                    return zah(context, "common_google_play_services_network_error_text", zaa2);
                }
                if (i == 9) {
                    return resources.getString(C25573R.string.common_google_play_services_unsupported_text, new Object[]{zaa2});
                } else if (i == 20) {
                    return zah(context, "common_google_play_services_restricted_profile_text", zaa2);
                } else {
                    switch (i) {
                        case 16:
                            return zah(context, "common_google_play_services_api_unavailable_text", zaa2);
                        case 17:
                            return zah(context, "common_google_play_services_sign_in_failed_text", zaa2);
                        case 18:
                            return resources.getString(C25573R.string.common_google_play_services_updating_text, new Object[]{zaa2});
                        default:
                            return resources.getString(C25578R.string.common_google_play_services_unknown_issue, new Object[]{zaa2});
                    }
                }
            }
        } else if (DeviceProperties.isWearableWithoutPlayStore(context)) {
            return resources.getString(C25573R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C25573R.string.common_google_play_services_update_text, new Object[]{zaa2});
        }
    }

    public static String zae(Context context, int i) {
        if (i == 6 || i == 19) {
            return zah(context, "common_google_play_services_resolution_required_text", zaa(context));
        }
        return zad(context, i);
    }

    public static String zaf(Context context, int i) {
        String str;
        if (i == 6) {
            str = zai(context, "common_google_play_services_resolution_required_title");
        } else {
            str = zag(context, i);
        }
        if (str == null) {
            return context.getResources().getString(C25573R.string.common_google_play_services_notification_ticker);
        }
        return str;
    }

    public static String zag(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C25573R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C25573R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C25573R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return zai(context, "common_google_play_services_invalid_account_title");
            case 7:
                return zai(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 17:
                return zai(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return zai(context, "common_google_play_services_restricted_profile_title");
            default:
                return null;
        }
    }

    private static String zah(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zai = zai(context, str);
        if (zai == null) {
            zai = resources.getString(C25578R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, zai, new Object[]{str2});
    }

    private static String zai(Context context, String str) {
        C6313h hVar = zaa;
        synchronized (hVar) {
            Locale a = C5804e.m14236a(context.getResources().getConfiguration()).mo21675a(0);
            if (!a.equals(zab)) {
                hVar.clear();
                zab = a;
            }
            String str2 = (String) hVar.getOrDefault(str, null);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            hVar.put(str, string);
            return string;
        }
    }
}
