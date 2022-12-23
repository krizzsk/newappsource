package p067e1;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;

/* renamed from: e1.j0 */
public final class C4495j0 {

    /* renamed from: e1.j0$a */
    public static class C4496a {
        /* renamed from: a */
        public static int m11722a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        /* renamed from: b */
        public static RemoteInput.Builder m11723b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* renamed from: a */
    public static RemoteInput m11721a(C4495j0 j0Var) {
        j0Var.getClass();
        RemoteInput.Builder addExtras = new RemoteInput.Builder((String) null).setLabel((CharSequence) null).setChoices((CharSequence[]) null).setAllowFreeFormInput(false).addExtras((Bundle) null);
        if (Build.VERSION.SDK_INT >= 29) {
            C4496a.m11723b(addExtras, 0);
        }
        return addExtras.build();
    }
}
