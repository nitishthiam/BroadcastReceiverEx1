package com.nitish.broadcastreceiverex1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        //when user remove the charger os comes here start password activity
        Intent intent1 = new Intent(context,MainActivity.class);
        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  //avoid crash
        context.startActivity(intent1);

      //  throw new UnsupportedOperationException("Not yet implemented");
    }
}
