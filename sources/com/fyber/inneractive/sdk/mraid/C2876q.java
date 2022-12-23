package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3764d;
import com.fyber.inneractive.sdk.web.C3780i;
import com.fyber.inneractive.sdk.web.C3782k;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.q */
public class C2876q extends C2858a {
    public C2876q(Map<String, String> map, C3764d dVar, C3721p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo13659a() {
        String str = this.f9840b.get("uri");
        if (str == null || "".equals(str)) {
            this.f9841c.mo15451a(C2865f.STORE_PICTURE, "Image can't be stored with null or empty URL");
            IAlog.m9902a("Mraid Store Picture -Invalid URI ", new Object[0]);
            return;
        }
        C3764d dVar = this.f9841c;
        Context g = dVar.mo15460g();
        if (!C3705k.m9952n()) {
            dVar.mo15451a(C2865f.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
            IAlog.m9902a("Error downloading file. Please check if the Android permission is not granted, or maybe the device does not have an SD card mounted? ", new Object[0]);
        } else if (g instanceof Activity) {
            new AlertDialog.Builder(dVar.mo15460g()).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new C3782k(dVar, str)).setCancelable(true).show();
        } else {
            C3714n.f12902b.post(new C3780i(dVar, "Downloading image to Picture gallery..."));
            dVar.mo15453a(str);
        }
    }

    /* renamed from: c */
    public String mo13656c() {
        return this.f9840b.get("uri");
    }
}
