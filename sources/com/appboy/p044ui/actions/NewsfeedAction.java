package com.appboy.p044ui.actions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.enums.Channel;
import com.appboy.p044ui.activities.AppboyFeedActivity;
import com.appboy.support.AppboyLogger;

/* renamed from: com.appboy.ui.actions.NewsfeedAction */
public class NewsfeedAction implements IAction {
    private final Bundle mExtras;

    public NewsfeedAction(Bundle bundle, Channel channel) {
        this.mExtras = bundle;
    }

    public void execute(Context context) {
        try {
            Intent intent = new Intent(context, AppboyFeedActivity.class);
            Bundle bundle = this.mExtras;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            AppboyLogger.m5452e("ContentValues", "AppboyFeedActivity was not opened successfully.", e);
        }
    }
}
