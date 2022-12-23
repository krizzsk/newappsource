package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.v */
public final class C0465v {

    /* renamed from: a */
    public TextView f1629a;

    /* renamed from: b */
    public TextClassifier f1630b;

    /* renamed from: androidx.appcompat.widget.v$a */
    public static final class C0466a {
        /* renamed from: a */
        public static TextClassifier m1285a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    public C0465v(TextView textView) {
        textView.getClass();
        this.f1629a = textView;
    }
}
