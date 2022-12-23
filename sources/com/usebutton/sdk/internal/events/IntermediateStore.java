package com.usebutton.sdk.internal.events;

import com.usebutton.sdk.internal.api.models.ClientEventDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class IntermediateStore implements EventsStore {
    private final List<ClientEventDTO> mQueue = new ArrayList();
    private AtomicInteger mSequenceGenerator = new AtomicInteger(0);
    private final EventsStore mTarget;

    public IntermediateStore(EventsStore eventsStore) {
        this.mTarget = eventsStore;
    }

    private boolean addToMemoryQueue(ClientEventDTO clientEventDTO) {
        clientEventDTO.setSequenceNumber(this.mSequenceGenerator.incrementAndGet());
        return this.mQueue.add(clientEventDTO);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0040 A[EDGE_INSN: B:27:0x0040->B:19:0x0040 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean add(com.usebutton.sdk.internal.api.models.ClientEventDTO r7) {
        /*
            r6 = this;
            java.util.List<com.usebutton.sdk.internal.api.models.ClientEventDTO> r0 = r6.mQueue
            monitor-enter(r0)
            java.util.List<com.usebutton.sdk.internal.api.models.ClientEventDTO> r1 = r6.mQueue     // Catch:{ all -> 0x0049 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0049 }
            r2 = 1
            if (r1 == 0) goto L_0x0019
            com.usebutton.sdk.internal.events.EventsStore r1 = r6.mTarget     // Catch:{ all -> 0x0049 }
            boolean r1 = r1.add(r7)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0015
            goto L_0x0047
        L_0x0015:
            r6.addToMemoryQueue(r7)     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x0019:
            r6.addToMemoryQueue(r7)     // Catch:{ all -> 0x0049 }
            java.util.List<com.usebutton.sdk.internal.api.models.ClientEventDTO> r7 = r6.mQueue     // Catch:{ all -> 0x0049 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0049 }
            r1 = 0
            r3 = 0
        L_0x0024:
            boolean r4 = r7.hasNext()     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0040
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x0049 }
            com.usebutton.sdk.internal.api.models.ClientEventDTO r4 = (com.usebutton.sdk.internal.api.models.ClientEventDTO) r4     // Catch:{ all -> 0x0049 }
            com.usebutton.sdk.internal.events.EventsStore r5 = r6.mTarget     // Catch:{ all -> 0x0049 }
            boolean r4 = r5.add(r4)     // Catch:{ all -> 0x0049 }
            if (r4 != 0) goto L_0x003d
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            goto L_0x003e
        L_0x003d:
            r3 = 1
        L_0x003e:
            if (r3 != 0) goto L_0x0024
        L_0x0040:
            if (r3 == 0) goto L_0x0047
            java.util.List<com.usebutton.sdk.internal.api.models.ClientEventDTO> r7 = r6.mQueue     // Catch:{ all -> 0x0049 }
            r7.clear()     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return r2
        L_0x0049:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.events.IntermediateStore.add(com.usebutton.sdk.internal.api.models.ClientEventDTO):boolean");
    }

    public List<ClientEventDTO> peek(int i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mQueue) {
            if (this.mQueue.isEmpty()) {
                arrayList.addAll(this.mTarget.peek(i));
            } else {
                arrayList.addAll(this.mQueue);
            }
        }
        return arrayList.subList(0, Math.min(i, arrayList.size()));
    }

    public void remove(int i) {
        synchronized (this.mQueue) {
            if (this.mQueue.isEmpty()) {
                this.mTarget.remove(i);
            } else {
                for (int i2 = 0; i2 < Math.min(i, this.mQueue.size()); i2++) {
                    this.mQueue.remove(0);
                }
            }
        }
    }

    public int size() {
        int i;
        synchronized (this.mQueue) {
            if (this.mQueue.isEmpty()) {
                i = this.mTarget.size();
            } else {
                i = this.mQueue.size();
            }
        }
        return i;
    }

    public void trimToSize(int i) {
        synchronized (this.mQueue) {
            if (this.mQueue.isEmpty()) {
                this.mTarget.trimToSize(i);
            } else {
                while (this.mQueue.size() > i) {
                    this.mQueue.remove(0);
                }
            }
        }
    }
}
