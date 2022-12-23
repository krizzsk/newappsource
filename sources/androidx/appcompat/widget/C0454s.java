package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p242s1.C6323c;
import p242s1.C6333d0;

/* renamed from: androidx.appcompat.widget.s */
public final class C0454s {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m1266a(DragEvent dragEvent, TextView textView, Activity activity) {
        C6323c.C6325b bVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                bVar = new C6323c.C6324a(clipData, 3);
            } else {
                bVar = new C6323c.C6326c(clipData, 3);
            }
            C6333d0.m15025m(textView, bVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m1267b(DragEvent dragEvent, View view, Activity activity) {
        C6323c.C6325b bVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new C6323c.C6324a(clipData, 3);
        } else {
            bVar = new C6323c.C6326c(clipData, 3);
        }
        C6333d0.m15025m(view, bVar.build());
        return true;
    }
}
