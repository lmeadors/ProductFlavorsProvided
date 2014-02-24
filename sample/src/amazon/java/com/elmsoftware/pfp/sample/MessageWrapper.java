package com.elmsoftware.pfp.sample;

import android.content.Context;
import android.util.Log;

import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.ADMConstants;

public class MessageWrapper {

	private static final String TAG = MessageWrapper.class.getName();

	public void doSomething(final Context context) {
		final ADM adm = new ADM(context);
		if (adm.getRegistrationId() == null) {
			// startRegister() is asynchronous; your app is notified via the
			// onRegistered() callback when the registration ID is available.
			adm.startRegister();
		}
		Log.d(TAG, ADMConstants.class.getName());
	}

}
