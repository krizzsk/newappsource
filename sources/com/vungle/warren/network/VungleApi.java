package com.vungle.warren.network;

import androidx.annotation.Keep;
import java.util.Map;
import p359ag.C13452i;
import qd0.C24725a;

@Keep
public interface VungleApi {
    C24725a<C13452i> ads(String str, String str2, C13452i iVar);

    C24725a<C13452i> cacheBust(String str, String str2, C13452i iVar);

    C24725a<C13452i> config(String str, C13452i iVar);

    C24725a<Void> pingTPAT(String str, String str2);

    C24725a<C13452i> reportAd(String str, String str2, C13452i iVar);

    C24725a<C13452i> reportNew(String str, String str2, Map<String, String> map);

    /* renamed from: ri */
    C24725a<C13452i> mo58257ri(String str, String str2, C13452i iVar);

    C24725a<C13452i> sendBiAnalytics(String str, String str2, C13452i iVar);

    C24725a<C13452i> sendLog(String str, String str2, C13452i iVar);

    C24725a<C13452i> willPlayAd(String str, String str2, C13452i iVar);
}
