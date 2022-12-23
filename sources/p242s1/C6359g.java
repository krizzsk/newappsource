package p242s1;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p055d1.C4329e;
import p242s1.C6333d0;

/* renamed from: s1.g */
public final class C6359g {

    /* renamed from: a */
    public static boolean f20013a = false;

    /* renamed from: b */
    public static Method f20014b = null;

    /* renamed from: c */
    public static boolean f20015c = false;

    /* renamed from: d */
    public static Field f20016d;

    /* renamed from: s1.g$a */
    public interface C6360a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m15162a(View view, KeyEvent keyEvent) {
        int indexOfKey;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = C6333d0.C6353s.f20006d;
            int i = C4329e.tag_unhandled_key_event_manager;
            C6333d0.C6353s sVar = (C6333d0.C6353s) view.getTag(i);
            if (sVar == null) {
                sVar = new C6333d0.C6353s();
                view.setTag(i, sVar);
            }
            WeakReference<KeyEvent> weakReference = sVar.f20009c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                sVar.f20009c = new WeakReference<>(keyEvent);
                WeakReference weakReference2 = null;
                if (sVar.f20008b == null) {
                    sVar.f20008b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = sVar.f20008b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = (View) weakReference2.get();
                    if (view2 == null || !C6333d0.C6340g.m15075b(view2)) {
                        return true;
                    }
                    C6333d0.C6353s.m15154b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"LambdaLast"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m15163b(p242s1.C6359g.C6360a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000f
            boolean r7 = r7.superDispatchKeyEvent(r10)
            return r7
        L_0x000f:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0083
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L_0x0066
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            boolean r1 = f20013a
            if (r1 != 0) goto L_0x004c
            java.lang.Class r1 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            f20014b = r1     // Catch:{ NoSuchMethodException -> 0x004a }
        L_0x004a:
            f20013a = r3
        L_0x004c:
            java.lang.reflect.Method r1 = f20014b
            if (r1 == 0) goto L_0x0063
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            r4[r0] = r10     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            if (r8 != 0) goto L_0x005b
            goto L_0x0063
        L_0x005b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            boolean r0 = r8.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            if (r0 == 0) goto L_0x0066
            goto L_0x0082
        L_0x0066:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x006d
            goto L_0x0082
        L_0x006d:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = p242s1.C6333d0.m15015c(r7, r10)
            if (r8 == 0) goto L_0x0078
            goto L_0x0082
        L_0x0078:
            if (r7 == 0) goto L_0x007e
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x007e:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x0082:
            return r3
        L_0x0083:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x00d7
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = f20015c
            if (r7 != 0) goto L_0x009c
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x009a }
            f20016d = r7     // Catch:{ NoSuchFieldException -> 0x009a }
            r7.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x009a }
        L_0x009a:
            f20015c = r3
        L_0x009c:
            java.lang.reflect.Field r7 = f20016d
            if (r7 == 0) goto L_0x00a8
            java.lang.Object r7 = r7.get(r9)     // Catch:{ IllegalAccessException -> 0x00a7 }
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch:{ IllegalAccessException -> 0x00a7 }
            goto L_0x00a9
        L_0x00a7:
        L_0x00a8:
            r7 = r2
        L_0x00a9:
            if (r7 == 0) goto L_0x00b6
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto L_0x00b6
            goto L_0x00d6
        L_0x00b6:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = p242s1.C6333d0.m15015c(r7, r10)
            if (r8 == 0) goto L_0x00cc
            goto L_0x00d6
        L_0x00cc:
            if (r7 == 0) goto L_0x00d2
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L_0x00d2:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L_0x00d6:
            return r3
        L_0x00d7:
            if (r8 == 0) goto L_0x00df
            boolean r8 = p242s1.C6333d0.m15015c(r8, r10)
            if (r8 != 0) goto L_0x00e5
        L_0x00df:
            boolean r7 = r7.superDispatchKeyEvent(r10)
            if (r7 == 0) goto L_0x00e6
        L_0x00e5:
            r0 = 1
        L_0x00e6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p242s1.C6359g.m15163b(s1.g$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
