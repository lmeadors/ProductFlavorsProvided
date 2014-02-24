package com.elmsoftware.pfp.sample;

import android.util.Log;

import com.amazon.device.messaging.ADMConstants;

public class MessageWrapper {

	private static final String TAG = MessageWrapper.class.getName();

	public void doSomething(){
		Log.d(TAG, ADMConstants.class.getName());
	}

}
