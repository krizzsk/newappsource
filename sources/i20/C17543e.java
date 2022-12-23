package i20;

import android.content.Intent;
import android.view.View;
import com.moovit.location.ChooseLocationActivity;

/* renamed from: i20.e */
public final class C17543e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ChooseLocationActivity f45134b;

    public C17543e(ChooseLocationActivity chooseLocationActivity) {
        this.f45134b = chooseLocationActivity;
    }

    public final void onClick(View view) {
        ChooseLocationActivity chooseLocationActivity = this.f45134b;
        int i = ChooseLocationActivity.f42216r0;
        chooseLocationActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra("extra_entity_location_on_map", chooseLocationActivity.f42222m0.f42188q);
        chooseLocationActivity.setResult(-1, intent);
        chooseLocationActivity.finish();
    }
}
