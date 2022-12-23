package p011aa;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3868a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3869b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p075ea.C4614a;
import p075ea.C4615b;
import p313x9.C7180b;
import ye0.C25292a;

/* renamed from: aa.f */
public final class C0142f implements C7180b<SchedulerConfig> {

    /* renamed from: a */
    public final C25292a<C4614a> f408a = C4615b.C4616a.f15836a;

    public final Object get() {
        C4614a aVar = this.f408a.get();
        HashMap hashMap = new HashMap();
        Priority priority = Priority.DEFAULT;
        C3869b.C3870a aVar2 = new C3869b.C3870a();
        Set<SchedulerConfig.Flag> emptySet = Collections.emptySet();
        if (emptySet != null) {
            aVar2.f13399c = emptySet;
            aVar2.f13397a = 30000L;
            aVar2.f13398b = 86400000L;
            hashMap.put(priority, aVar2.mo15792a());
            Priority priority2 = Priority.HIGHEST;
            C3869b.C3870a aVar3 = new C3869b.C3870a();
            Set<SchedulerConfig.Flag> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                aVar3.f13399c = emptySet2;
                aVar3.f13397a = 1000L;
                aVar3.f13398b = 86400000L;
                hashMap.put(priority2, aVar3.mo15792a());
                Priority priority3 = Priority.VERY_LOW;
                C3869b.C3870a aVar4 = new C3869b.C3870a();
                Set<SchedulerConfig.Flag> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    aVar4.f13399c = emptySet3;
                    aVar4.f13397a = 86400000L;
                    aVar4.f13398b = 86400000L;
                    Set<SchedulerConfig.Flag> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new SchedulerConfig.Flag[]{SchedulerConfig.Flag.NETWORK_UNMETERED, SchedulerConfig.Flag.DEVICE_IDLE})));
                    if (unmodifiableSet != null) {
                        aVar4.f13399c = unmodifiableSet;
                        hashMap.put(priority3, aVar4.mo15792a());
                        if (aVar == null) {
                            throw new NullPointerException("missing required property: clock");
                        } else if (hashMap.keySet().size() >= Priority.values().length) {
                            new HashMap();
                            return new C3868a(aVar, hashMap);
                        } else {
                            throw new IllegalStateException("Not all priorities have been configured");
                        }
                    } else {
                        throw new NullPointerException("Null flags");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }
}
