package com.odiousapps.weewxweather;

import androidx.annotation.NonNull;

class Day
{
	String icon = "";
	String text = "";
	String periodName = "";
	String max = "";
	String min = "";
	String maxRain = "";
	String minRain = "";
	long timestamp = 0;
	boolean isSummary = false;

	@NonNull
	public String toString()
	{
		return "[timestamp: " + timestamp + ", icon: " + icon + ", max: " + max + ", min: " + min +
			", maxRain: " + maxRain + ", minRain: " + minRain + ", text: " + text + "]";
	}
}