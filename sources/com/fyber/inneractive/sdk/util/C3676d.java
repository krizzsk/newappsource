package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import p988j$.util.Spliterator;

/* renamed from: com.fyber.inneractive.sdk.util.d */
public class C3676d {

    /* renamed from: b */
    public static C3676d f12833b = new C3676d();

    /* renamed from: a */
    public Queue<ByteBuffer> f12834a = new ConcurrentLinkedQueue();

    public C3676d() {
        for (int i = 0; i < 2; i++) {
            this.f12834a.offer(mo15346a());
        }
    }

    /* renamed from: a */
    public final ByteBuffer mo15346a() {
        return ByteBuffer.allocateDirect(Spliterator.SUBSIZED);
    }

    /* renamed from: b */
    public ByteBuffer mo15347b() {
        ByteBuffer poll = this.f12834a.poll();
        if (poll == null) {
            return ByteBuffer.allocateDirect(Spliterator.SUBSIZED);
        }
        return poll;
    }
}
