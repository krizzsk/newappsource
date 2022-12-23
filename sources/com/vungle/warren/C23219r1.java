package com.vungle.warren;

import p229r1.C6231a;

/* renamed from: com.vungle.warren.r1 */
public final class C23219r1 implements C6231a<String> {

    /* renamed from: a */
    public final /* synthetic */ VungleApiClient f58927a;

    public C23219r1(VungleApiClient vungleApiClient) {
        this.f58927a = vungleApiClient;
    }

    public final void accept(Object obj) {
        String str = (String) obj;
        if (str == null) {
            String str2 = VungleApiClient.f58560C;
        } else {
            this.f58927a.f58589z = str;
        }
    }
}
