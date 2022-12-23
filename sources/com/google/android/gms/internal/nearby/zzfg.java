package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p241s0.C6302b;
import p241s0.C6304d;

public final class zzfg {
    private static final Map zza = new C6302b();
    private final Map zzb = new C6302b();
    /* access modifiers changed from: private */
    public final Set zzc = new C6304d();
    private final Map zzd = new C6302b();

    private zzfg() {
    }

    public static synchronized zzfg zzd(GoogleApi googleApi, Api.ApiOptions apiOptions) {
        zzfg zzfg;
        synchronized (zzfg.class) {
            zzff zzff = new zzff(googleApi, (Api.ApiOptions) null);
            Map map = zza;
            if (!map.containsKey(zzff)) {
                map.put(zzff, new zzfg());
            }
            zzfg = (zzfg) map.get(zzff);
        }
        return zzfg;
    }

    private final Object zzi(String str) {
        if (!this.zzd.containsKey(str)) {
            this.zzd.put(str, new Object());
        }
        return this.zzd.get(str);
    }

    public final synchronized ListenerHolder.ListenerKey zza(String str, String str2) {
        return ListenerHolders.createListenerKey(zzi(str), "connection");
    }

    public final synchronized ListenerHolder zzb(GoogleApi googleApi, Object obj, String str) {
        ListenerHolder registerListener;
        registerListener = googleApi.registerListener(obj, str);
        ListenerHolder.ListenerKey listenerKey = (ListenerHolder.ListenerKey) Preconditions.checkNotNull(registerListener.getListenerKey(), "Key must not be null");
        Set set = (Set) this.zzb.get(str);
        if (set == null) {
            set = new C6304d();
            this.zzb.put(str, set);
        }
        set.add(listenerKey);
        return registerListener;
    }

    public final synchronized ListenerHolder zzc(GoogleApi googleApi, String str, String str2) {
        return zzb(googleApi, zzi(str), "connection");
    }

    public final synchronized Task zze(GoogleApi googleApi, RegistrationMethods registrationMethods) {
        ListenerHolder.ListenerKey listenerKey;
        listenerKey = (ListenerHolder.ListenerKey) Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Key must not be null");
        return googleApi.doRegisterEventListener(registrationMethods).addOnFailureListener(new zzfe(this, googleApi, listenerKey, this.zzc.add(listenerKey)));
    }

    public final synchronized Task zzf(GoogleApi googleApi, String str) {
        C6304d dVar = new C6304d();
        Set set = (Set) this.zzb.get(str);
        if (set == null) {
            return Tasks.whenAll((Collection<? extends Task<?>>) dVar);
        }
        C6304d dVar2 = new C6304d();
        dVar2.addAll(set);
        Iterator it = dVar2.iterator();
        while (it.hasNext()) {
            ListenerHolder.ListenerKey listenerKey = (ListenerHolder.ListenerKey) it.next();
            if (this.zzc.contains(listenerKey)) {
                dVar.add(zzg(googleApi, listenerKey));
            }
        }
        this.zzb.remove(str);
        return Tasks.whenAll((Collection<? extends Task<?>>) dVar);
    }

    public final synchronized Task zzg(GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey) {
        String str;
        this.zzc.remove(listenerKey);
        Iterator it = this.zzb.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            Set set = (Set) this.zzb.get(str);
            if (set.contains(listenerKey)) {
                set.remove(listenerKey);
                break;
            }
        }
        if (str != null) {
            Iterator it2 = this.zzd.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (ListenerHolders.createListenerKey(entry.getValue(), str).equals(listenerKey)) {
                    this.zzd.remove(entry.getKey());
                    break;
                }
            }
        }
        return googleApi.doUnregisterEventListener(listenerKey);
    }
}
