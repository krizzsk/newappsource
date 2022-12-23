package ia0;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import com.moovit.view.pickers.StringsPickerActivity;

/* renamed from: ia0.f */
public final class C12768f implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ StringsPickerActivity f31537b;

    public C12768f(StringsPickerActivity stringsPickerActivity) {
        this.f31537b = stringsPickerActivity;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        StringsPickerActivity stringsPickerActivity = this.f31537b;
        int i2 = StringsPickerActivity.f24119Z;
        stringsPickerActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra("itemPicked", (Parcelable) adapterView.getItemAtPosition(i));
        stringsPickerActivity.setResult(-1, intent);
        stringsPickerActivity.finish();
    }
}
