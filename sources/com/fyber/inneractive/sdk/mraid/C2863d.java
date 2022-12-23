package com.fyber.inneractive.sdk.mraid;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3764d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.d */
public class C2863d extends C2858a {
    public C2863d(Map<String, String> map, C3764d dVar, C3721p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo13659a() {
        L l;
        C3764d dVar = this.f9841c;
        Map<String, String> map = this.f9840b;
        Context g = dVar.mo15460g();
        boolean z = true;
        if (C3705k.m9944a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"))) {
            try {
                Map<String, Object> a = dVar.mo15449a(map);
                Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
                HashMap hashMap = (HashMap) a;
                for (String str : hashMap.keySet()) {
                    Object obj = hashMap.get(str);
                    if (obj instanceof Long) {
                        type.putExtra(str, ((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        type.putExtra(str, ((Integer) obj).intValue());
                    } else {
                        type.putExtra(str, (String) obj);
                    }
                }
                type.setFlags(268435456);
                g.startActivity(type);
            } catch (ActivityNotFoundException unused) {
                IAlog.m9902a("There is no calendar app installed!", new Object[0]);
                dVar.mo15451a(C2865f.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
            } catch (IllegalArgumentException e) {
                IAlog.m9902a("invalid parameters for create calendar ", e.getMessage());
                dVar.mo15451a(C2865f.CREATE_CALENDAR_EVENT, e.getMessage());
            } catch (Exception unused2) {
                IAlog.m9902a("Failed to create calendar event.", new Object[0]);
                dVar.mo15451a(C2865f.CREATE_CALENDAR_EVENT, "could not create calendar event");
            }
        } else {
            IAlog.m9902a("createCalendarEvent supported for devices post-ICS", new Object[0]);
            dVar.mo15451a(C2865f.CREATE_CALENDAR_EVENT, "Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
            z = false;
        }
        if (z && (l = dVar.f12962g) != null) {
            ((C3764d.C3770f) l).mo13919b();
        }
    }

    /* renamed from: c */
    public String mo13656c() {
        return null;
    }
}
