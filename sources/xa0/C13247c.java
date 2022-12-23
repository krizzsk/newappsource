package xa0;

import com.moovit.commons.view.GLTextureView;

/* renamed from: xa0.c */
public final class C13247c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ GLTextureView f32872b;

    /* renamed from: c */
    public final /* synthetic */ C13250f f32873c;

    public C13247c(C13250f fVar, GLTextureView gLTextureView) {
        this.f32873c = fVar;
        this.f32872b = gLTextureView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007d, code lost:
        if (r1.f32886j != r1.f32878b.getScrollY()) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            xa0.f r0 = r6.f32873c
            android.view.View r0 = r0.f32878b
            boolean r0 = r0.isDirty()
            xa0.f r1 = r6.f32873c
            android.graphics.Bitmap r1 = r1.f32888l
            monitor-enter(r1)
            xa0.f r2 = r6.f32873c     // Catch:{ all -> 0x00ec }
            android.graphics.Bitmap r2 = r2.f32888l     // Catch:{ all -> 0x00ec }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x00ec }
            xa0.f r3 = r6.f32873c     // Catch:{ all -> 0x00ec }
            android.view.View r3 = r3.f32878b     // Catch:{ all -> 0x00ec }
            int r3 = r3.getWidth()     // Catch:{ all -> 0x00ec }
            r4 = 1
            if (r2 != r3) goto L_0x0032
            xa0.f r2 = r6.f32873c     // Catch:{ all -> 0x00ec }
            android.graphics.Bitmap r2 = r2.f32888l     // Catch:{ all -> 0x00ec }
            int r2 = r2.getHeight()     // Catch:{ all -> 0x00ec }
            xa0.f r3 = r6.f32873c     // Catch:{ all -> 0x00ec }
            android.view.View r3 = r3.f32878b     // Catch:{ all -> 0x00ec }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x00ec }
            if (r2 == r3) goto L_0x0066
        L_0x0032:
            xa0.f r0 = r6.f32873c     // Catch:{ all -> 0x00ec }
            android.graphics.Bitmap r0 = r0.f32888l     // Catch:{ all -> 0x00ec }
            r0.recycle()     // Catch:{ all -> 0x00ec }
            xa0.f r0 = r6.f32873c     // Catch:{ all -> 0x00ec }
            android.view.View r2 = r0.f32878b     // Catch:{ all -> 0x00ec }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x00ec }
            xa0.f r3 = r6.f32873c     // Catch:{ all -> 0x00ec }
            android.view.View r3 = r3.f32878b     // Catch:{ all -> 0x00ec }
            int r3 = r3.getHeight()     // Catch:{ all -> 0x00ec }
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00ec }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r5)     // Catch:{ all -> 0x00ec }
            r0.f32888l = r2     // Catch:{ all -> 0x00ec }
            xa0.f r0 = r6.f32873c     // Catch:{ all -> 0x00ec }
            android.view.View r2 = r0.f32878b     // Catch:{ all -> 0x00ec }
            int r2 = r2.getWidth()     // Catch:{ all -> 0x00ec }
            r0.f32883g = r2     // Catch:{ all -> 0x00ec }
            xa0.f r0 = r6.f32873c     // Catch:{ all -> 0x00ec }
            android.view.View r2 = r0.f32878b     // Catch:{ all -> 0x00ec }
            int r2 = r2.getHeight()     // Catch:{ all -> 0x00ec }
            r0.f32884h = r2     // Catch:{ all -> 0x00ec }
            r0 = 1
        L_0x0066:
            monitor-exit(r1)     // Catch:{ all -> 0x00ec }
            xa0.f r1 = r6.f32873c
            int r2 = r1.f32885i
            android.view.View r1 = r1.f32878b
            int r1 = r1.getScrollX()
            if (r2 != r1) goto L_0x007f
            xa0.f r1 = r6.f32873c
            int r2 = r1.f32886j
            android.view.View r1 = r1.f32878b
            int r1 = r1.getScrollY()
            if (r2 == r1) goto L_0x0094
        L_0x007f:
            xa0.f r0 = r6.f32873c
            android.view.View r1 = r0.f32878b
            int r1 = r1.getScrollX()
            r0.f32885i = r1
            xa0.f r0 = r6.f32873c
            android.view.View r1 = r0.f32878b
            int r1 = r1.getScrollY()
            r0.f32886j = r1
            r0 = 1
        L_0x0094:
            if (r0 == 0) goto L_0x00e2
            xa0.f r0 = r6.f32873c
            android.graphics.Bitmap r0 = r0.f32888l
            monitor-enter(r0)
            xa0.f r1 = r6.f32873c     // Catch:{ all -> 0x00df }
            android.view.View r1 = r1.f32878b     // Catch:{ all -> 0x00df }
            boolean r1 = r1.isOpaque()     // Catch:{ all -> 0x00df }
            if (r1 != 0) goto L_0x00ad
            xa0.f r1 = r6.f32873c     // Catch:{ all -> 0x00df }
            android.graphics.Bitmap r1 = r1.f32888l     // Catch:{ all -> 0x00df }
            r2 = 0
            r1.eraseColor(r2)     // Catch:{ all -> 0x00df }
        L_0x00ad:
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch:{ all -> 0x00df }
            xa0.f r2 = r6.f32873c     // Catch:{ all -> 0x00df }
            android.graphics.Bitmap r2 = r2.f32888l     // Catch:{ all -> 0x00df }
            r1.<init>(r2)     // Catch:{ all -> 0x00df }
            xa0.f r2 = r6.f32873c     // Catch:{ all -> 0x00df }
            android.view.View r2 = r2.f32878b     // Catch:{ all -> 0x00df }
            int r2 = r2.getScrollX()     // Catch:{ all -> 0x00df }
            int r2 = -r2
            float r2 = (float) r2     // Catch:{ all -> 0x00df }
            xa0.f r3 = r6.f32873c     // Catch:{ all -> 0x00df }
            android.view.View r3 = r3.f32878b     // Catch:{ all -> 0x00df }
            int r3 = r3.getScrollY()     // Catch:{ all -> 0x00df }
            int r3 = -r3
            float r3 = (float) r3     // Catch:{ all -> 0x00df }
            r1.translate(r2, r3)     // Catch:{ all -> 0x00df }
            xa0.f r2 = r6.f32873c     // Catch:{ all -> 0x00df }
            android.view.View r2 = r2.f32878b     // Catch:{ all -> 0x00df }
            r2.draw(r1)     // Catch:{ all -> 0x00df }
            xa0.f r1 = r6.f32873c     // Catch:{ all -> 0x00df }
            r1.f32890n = r4     // Catch:{ all -> 0x00df }
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            com.moovit.commons.view.GLTextureView r0 = r6.f32872b
            r0.mo47071b()
            goto L_0x00e2
        L_0x00df:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00df }
            throw r1
        L_0x00e2:
            xa0.f r0 = r6.f32873c
            android.os.Handler r1 = r0.f32879c
            xa0.c r0 = r0.f32887k
            r1.post(r0)
            return
        L_0x00ec:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ec }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xa0.C13247c.run():void");
    }
}
