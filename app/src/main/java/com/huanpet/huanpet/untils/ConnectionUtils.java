/**
 * @描述		:	
 * @作�??	    :Android - csx
 * @创建日期  :2016�?3�?14�? 下午3:01:54  
 *
 */
package com.huanpet.huanpet.untils;



import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

/**
 * @描述 :网络判断工具
 * @作�?? :Android - csx
 * @创建日期 :2016�?3�?14�? 下午3:01:54
 * 
 */
public class ConnectionUtils {

	// 获取网络管理信息
	private static ConnectivityManager manager = null;

	// 获取网络信息
	private static NetworkInfo network = null;

	public static final String IP = "ip";

	/**
	 * 
	 * @描述 :是否连接网络
	 * @方法名称 :isConnNetWork----&gt;ConnectionUtils.java
	 * @作�?? :Android - csx
	 * @创建日期 :2016�?3�?14�? 下午3:03:02
	 * @return
	 * 
	 */
	@SuppressWarnings("static-access")
	public static boolean isConnNetWork(Context context) {
		manager = (ConnectivityManager) context
				.getSystemService(context.CONNECTIVITY_SERVICE);
		network = manager.getActiveNetworkInfo();
		if (network != null && network.isAvailable()
				&& network.isConnectedOrConnecting()) {
			// 有网
			return true;
		} else {
			// 没网
			return false;
		}
	}

	@SuppressWarnings("static-access")
	public static boolean isWiFi(Context context) {
		manager = (ConnectivityManager) context
				.getSystemService(context.CONNECTIVITY_SERVICE);
		network = manager.getActiveNetworkInfo();
		if (network != null && network.isAvailable()) {
			// 是网
			if (network.getType() == ConnectivityManager.TYPE_WIFI) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	public static String getIp(Context context) {
		// 获取WiFi管理�?
		WifiManager wifiManager = (WifiManager) context
				.getSystemService(context.WIFI_SERVICE);
		// 判断wifi是否�?�?
		if (!wifiManager.isWifiEnabled()) {
			return "127.0.0.3";
		}
		WifiInfo wifiInfo = wifiManager.getConnectionInfo();

		int ipAddress = wifiInfo.getIpAddress();
		String ip = intToIp(ipAddress);

		return ip;

	}
	private static String intToIp(int i) {

		return (i & 0xFF) + "." + ((i >> 8) & 0xFF) + "." + ((i >> 16) & 0xFF)
				+ "." + (i >> 24 & 0xFF);
	}


}
