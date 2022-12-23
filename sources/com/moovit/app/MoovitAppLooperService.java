package com.moovit.app;

import com.moovit.MoovitLooperService;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.accesstoken.AccessTokenManager;

public abstract class MoovitAppLooperService extends MoovitLooperService {
    public final Object getSystemService(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1765958018:
                if (str.equals("latest_itinerary_controller_service")) {
                    c = 0;
                    break;
                }
                break;
            case -1572266541:
                if (str.equals("user_campaigns_manager_service")) {
                    c = 1;
                    break;
                }
                break;
            case -1564410169:
                if (str.equals("user_favorites_manager_service")) {
                    c = 2;
                    break;
                }
                break;
            case -1532992099:
                if (str.equals("user_account_manager_service")) {
                    c = 3;
                    break;
                }
                break;
            case -461264955:
                if (str.equals("accessibility_configuration")) {
                    c = 4;
                    break;
                }
                break;
            case 540721455:
                if (str.equals("taxi_providers_manager")) {
                    c = 5;
                    break;
                }
                break;
            case 741994535:
                if (str.equals("history_controller")) {
                    c = 6;
                    break;
                }
                break;
            case 902938968:
                if (str.equals("user_notifications_manager_service")) {
                    c = 7;
                    break;
                }
                break;
            case 1392349506:
                if (str.equals("access_token_manager_service")) {
                    c = 8;
                    break;
                }
                break;
            case 1791290649:
                if (str.equals("user_profile_manager_service")) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return mo44584j("LATEST_ITINERARY_CONTROLLER");
            case 1:
                return ((UserAccountManager) mo44584j("USER_ACCOUNT")).mo46572c();
            case 2:
                return ((UserAccountManager) mo44584j("USER_ACCOUNT")).mo46573d();
            case 3:
                return mo44584j("USER_ACCOUNT");
            case 4:
                return mo44584j("ACCESSIBILITY_CONFIGURATION");
            case 5:
                return mo44584j("TAXI_PROVIDERS_MANAGER");
            case 6:
                return mo44584j("HISTORY");
            case 7:
                return ((UserAccountManager) mo44584j("USER_ACCOUNT")).mo46574e();
            case 8:
                return AccessTokenManager.m39875b(this);
            case 9:
                return ((UserAccountManager) mo44584j("USER_ACCOUNT")).mo46575f();
            default:
                return super.getSystemService(str);
        }
    }
}
