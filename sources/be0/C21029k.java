package be0;

/* renamed from: be0.k */
public final class C21029k implements Runnable {

    /* renamed from: b */
    public float f52811b = -2.0f;

    /* renamed from: c */
    public final /* synthetic */ C21026j f52812c;

    public C21029k(C21026j jVar) {
        this.f52812c = jVar;
    }

    public final void run() {
        try {
            if (this.f52812c.f52763e.f52774d.isPlaying()) {
                int currentVideoPosition = this.f52812c.f52763e.getCurrentVideoPosition();
                int videoDuration = this.f52812c.f52763e.getVideoDuration();
                if (videoDuration > 0) {
                    if (this.f52811b == -2.0f) {
                        this.f52811b = (float) videoDuration;
                    }
                    this.f52812c.f52803h.mo61917r(this.f52811b, currentVideoPosition);
                    C21012c cVar = this.f52812c.f52763e;
                    cVar.f52777g.setMax((int) this.f52811b);
                    cVar.f52777g.setProgress(currentVideoPosition);
                }
            }
            this.f52812c.f52808m.postDelayed(this, 1000);
        } catch (IllegalStateException unused) {
            String str = this.f52812c.f52762d;
        }
    }
}
