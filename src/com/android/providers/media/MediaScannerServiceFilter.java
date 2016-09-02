package com.android.providers.media;

import com.android.providers.media.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class MediaScannerServiceFilter extends PreferenceActivity
{
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stusb
		super.onCreate(savedInstanceState);

		PreferenceManager prefMgr = getPreferenceManager();
		prefMgr.setSharedPreferencesName("filters");
		prefMgr.setSharedPreferencesMode(MODE_PRIVATE);

		addPreferencesFromResource(R.xml.filter);
	}    

}
