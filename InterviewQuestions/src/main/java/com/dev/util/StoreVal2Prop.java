package com.dev.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StoreVal2Prop {
public static void main(String[] args) {
	try {
	FileWriter fileWritter = new FileWriter("resources/crypto.properties", false);
	BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
	bufferWritter.append("\n");
	bufferWritter.append("##### Last Updated on...... " + getTodayDate()+"  #####");
	bufferWritter.append("\n");
	bufferWritter.append("PROPERTES_YOUR_KEY=PROPERTES_YOUR_VALUE2");
	bufferWritter.append("\n");
	bufferWritter.append("PROPERTES_YOUR_KEY1=PROPERTES_YOUR_VALUE3");
	bufferWritter.append("\n");
	bufferWritter.close();
	System.out.println("writing ....");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static String getTodayDate(){
	 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    return formatter.format(date);  
}

public static void jsonPrint()
{
	/* String jsonDataString = "{userInfo : [{username:abc123}, {username:xyz123},{username:pqr123},   {username:mno123},{username:jkl123}]}";
     JSONObject jsonObject = new JSONObject(jsonDataString);
     List<String> list = new ArrayList<String>();
     JSONArray jsonArray = jsonObject.getJSONArray("userInfo");
     for(int i = 0 ; i < jsonArray.length(); i++) {
        list.add(jsonArray.getJSONObject(i).getString("username"));
        System.out.println(jsonArray.getJSONObject(i).getString("username")); // display usernames
     }*/
}
}
