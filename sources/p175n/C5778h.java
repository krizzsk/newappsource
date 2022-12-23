package p175n;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: n.h */
public class C5778h implements Window.Callback {

    /* renamed from: b */
    public final Window.Callback f18723b;

    /* renamed from: n.h$a */
    public static class C5779a {
        /* renamed from: a */
        public static boolean m14219a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        /* renamed from: b */
        public static ActionMode m14220b(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    /* renamed from: n.h$b */
    public static class C5780b {
        /* renamed from: a */
        public static void m14221a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* renamed from: n.h$c */
    public static class C5781c {
        /* renamed from: a */
        public static void m14222a(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public C5778h(Window.Callback callback) {
        if (callback != null) {
            this.f18723b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f18723b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f18723b.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f18723b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f18723b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f18723b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f18723b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f18723b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f18723b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f18723b.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f18723b.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f18723b.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.f18723b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f18723b.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f18723b.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f18723b.onPanelClosed(i, menu);
    }

    public final void onPointerCaptureChanged(boolean z) {
        C5781c.m14222a(this.f18723b, z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f18723b.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C5780b.m14221a(this.f18723b, list, menu, i);
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return C5779a.m14219a(this.f18723b, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f18723b.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f18723b.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f18723b.onWindowStartingActionMode(callback);
    }

    public final boolean onSearchRequested() {
        return this.f18723b.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C5779a.m14220b(this.f18723b, callback, i);
    }
}
