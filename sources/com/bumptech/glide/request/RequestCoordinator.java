package com.bumptech.glide.request;

import p260t6.C6598d;

public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        private RequestState(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    /* renamed from: a */
    boolean mo11016a();

    /* renamed from: b */
    boolean mo11017b(C6598d dVar);

    /* renamed from: f */
    void mo11018f(C6598d dVar);

    /* renamed from: g */
    void mo11019g(C6598d dVar);

    RequestCoordinator getRoot();

    /* renamed from: h */
    boolean mo11021h(C6598d dVar);

    /* renamed from: i */
    boolean mo11022i(C6598d dVar);
}
