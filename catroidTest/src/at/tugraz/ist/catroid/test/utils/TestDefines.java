package at.tugraz.ist.catroid.test.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import at.tugraz.ist.catroid.constructionSite.content.BrickDefine;

public class TestDefines {

	private String mVersionCode;
	private String mVersionName;
	
	public String getTestXml(Context context) {
		String testXml = null;
		try {
			PackageInfo packageInfo = context.getPackageManager().getPackageInfo("at.tugraz.ist.catroid", 0);
			mVersionCode = String.valueOf(packageInfo.versionCode);
			mVersionName = packageInfo.versionName;
		
			testXml = "<?xml version='1.0' encoding='UTF-8' standalone='yes' ?>"
				+ "<project versionCode=\""+mVersionCode+"\" versionName=\""+mVersionName+"\">" + "<stage>" + "<brick id=\"0\" type=\""
				+ BrickDefine.SET_BACKGROUND
				+ "\">"
				+ "<image path=\"bla.jpg\" path_thumb=\"bla.jpg\" />"
				+ "</brick>"
				+ "<brick id=\"1\" type=\""
				+ BrickDefine.WAIT
				+ "\">"
				+ "5"
				+ "</brick>"
				+ "<brick id=\"2\" type=\""
				+ BrickDefine.PLAY_SOUND
				+ "\">"
				+ "<sound path=\"bla.mp3\" name=\"bla\" />"
				+ "</brick>"
				+ "</stage>"
				+ "<sprite name=\"sprite\">"
				+ "<brick id=\"3\" type=\""
				+ BrickDefine.SET_COSTUME
				+ "\">"
				+ "<image path=\"bla.jpg\" path_thumb=\"bla.jpg\" />"
				+ "</brick>"
				+ "<brick id=\"4\" type=\""
				+ BrickDefine.GO_TO
				+ "\">"
				+ "<x>5</x>"
				+ "<y>7</y>"
				+ "</brick>"
				+ "<brick id=\"5\" type=\""
				+ BrickDefine.HIDE
				+ "\" />"
				+ "<brick id=\"6\" type=\""
				+ BrickDefine.SHOW
				+ "\" />"
				+ "<brick id=\"7\" type=\""
				+ BrickDefine.SET_COSTUME
				+ "\">"
				+ "<image path=\"bla.jpg\" path_thumb=\"bla.jpg\" />"
				+ "</brick>"
				+ "<brick id=\"8\" type=\""
				+ BrickDefine.SCALE_COSTUME
				+ "\">50"
				+ "</brick>"
				+ "<brick id=\"9\" type=\""
				+ BrickDefine.COME_TO_FRONT
				+ "\" />"
				+ "<brick id=\"10\" type=\"" 
				+ BrickDefine.GO_BACK
				+ "\">3</brick>" 
				+ "<brick id=\"11\" type=\""
				+ BrickDefine.TOUCHED
				+ "\" />"
				+ "</sprite>" + "</project>";
		
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return testXml;
	}
}