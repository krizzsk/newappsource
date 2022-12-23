package i00;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: i00.i */
public final class C17533i extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b */
    public final /* synthetic */ boolean f45124b = false;

    /* renamed from: c */
    public final /* synthetic */ C17529h f45125c;

    public C17533i(C17529h hVar) {
        this.f45125c = hVar;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        C17529h hVar = this.f45125c;
        hVar.f45120g.onRelease();
        hVar.f45121h.onRelease();
        this.f45125c.f45118e.forceFinished(true);
        C17529h hVar2 = this.f45125c;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15051k(hVar2);
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        if (this.f45124b) {
            f3 = -f;
        } else {
            f3 = -f2;
        }
        boolean a = this.f45125c.mo49981a(f3);
        this.f45125c.f45117d.getClass();
        if (!a) {
            return false;
        }
        C17529h hVar = this.f45125c;
        hVar.f45120g.onRelease();
        hVar.f45121h.onRelease();
        this.f45125c.mo49982b(Math.round(f3));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScroll(android.view.MotionEvent r8, android.view.MotionEvent r9, float r10, float r11) {
        /*
            r7 = this;
            i00.h r8 = r7.f45125c
            boolean r0 = r8.f45115b
            if (r0 == 0) goto L_0x0008
            r0 = r10
            goto L_0x0009
        L_0x0008:
            r0 = r11
        L_0x0009:
            int r8 = r8.getScroll()
            float r8 = (float) r8
            float r8 = r8 + r0
            int r8 = (int) r8
            float r11 = java.lang.Math.abs(r11)
            float r10 = java.lang.Math.abs(r10)
            float r11 = r11 - r10
            boolean r10 = r7.f45124b
            r1 = 0
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L_0x0025
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x002b
            goto L_0x0029
        L_0x0025:
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 <= 0) goto L_0x002b
        L_0x0029:
            r10 = 1
            goto L_0x002c
        L_0x002b:
            r10 = 0
        L_0x002c:
            if (r10 == 0) goto L_0x0041
            i00.h r10 = r7.f45125c
            int r11 = r10.getSize()
            int r10 = r10.getContentSize()
            if (r11 >= r10) goto L_0x003c
            r10 = 1
            goto L_0x003d
        L_0x003c:
            r10 = 0
        L_0x003d:
            if (r10 == 0) goto L_0x0041
            r10 = 1
            goto L_0x0042
        L_0x0041:
            r10 = 0
        L_0x0042:
            i00.h r11 = r7.f45125c
            i00.h$c r11 = r11.f45117d
            r11.getClass()
            if (r10 != 0) goto L_0x004c
            return r3
        L_0x004c:
            i00.h r10 = r7.f45125c
            int r10 = r10.getSize()
            i00.h r11 = r7.f45125c
            int r11 = r11.getContentSize()
            r1 = 21
            if (r8 >= 0) goto L_0x0093
            boolean r3 = r7.f45124b
            if (r3 == 0) goto L_0x006b
            float r3 = r9.getY()
            i00.h r4 = r7.f45125c
            int r4 = r4.getHeight()
            goto L_0x0075
        L_0x006b:
            float r3 = r9.getX()
            i00.h r4 = r7.f45125c
            int r4 = r4.getWidth()
        L_0x0075:
            float r4 = (float) r4
            float r3 = r3 / r4
            i00.h r4 = r7.f45125c
            android.widget.EdgeEffect r4 = r4.f45120g
            float r5 = (float) r10
            float r5 = r0 / r5
            float r5 = -r5
            boolean r6 = p977zz.C20943i.m49051d(r1)
            if (r6 == 0) goto L_0x0089
            r4.onPull(r5, r3)
            goto L_0x008c
        L_0x0089:
            r4.onPull(r5)
        L_0x008c:
            i00.h r3 = r7.f45125c
            r3.f45122i = r2
            r3.invalidate()
        L_0x0093:
            int r11 = r11 - r10
            if (r8 <= r11) goto L_0x00cb
            boolean r11 = r7.f45124b
            if (r11 == 0) goto L_0x00a5
            float r9 = r9.getY()
            i00.h r11 = r7.f45125c
            int r11 = r11.getHeight()
            goto L_0x00af
        L_0x00a5:
            float r9 = r9.getX()
            i00.h r11 = r7.f45125c
            int r11 = r11.getWidth()
        L_0x00af:
            float r11 = (float) r11
            float r9 = r9 / r11
            i00.h r11 = r7.f45125c
            android.widget.EdgeEffect r11 = r11.f45121h
            float r10 = (float) r10
            float r0 = r0 / r10
            boolean r10 = p977zz.C20943i.m49051d(r1)
            if (r10 == 0) goto L_0x00c1
            r11.onPull(r0, r9)
            goto L_0x00c4
        L_0x00c1:
            r11.onPull(r0)
        L_0x00c4:
            i00.h r9 = r7.f45125c
            r9.f45123j = r2
            r9.invalidate()
        L_0x00cb:
            i00.h r9 = r7.f45125c
            r9.setScroll(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i00.C17533i.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
