package com.elmsoftware.pfp.sample;

import android.content.Intent;

import com.amazon.device.messaging.ADMMessageHandlerBase;

public class MessageHandler extends ADMMessageHandlerBase {

	private static final String TAG = MessageHandler.class.getName();

	public MessageHandler() {
		super(MessageHandler.class.getName());
	}

	@Override
	protected void onMessage(Intent intent) {

	}

	@Override
	protected void onRegistrationError(String s) {

	}

	@Override
	protected void onRegistered(String s) {

	}

	@Override
	protected void onUnregistered(String s) {

	}

}
