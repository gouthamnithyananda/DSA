package io.goutham.strings;

import java.util.ArrayList;
import java.util.List;

public class TargettedPrice {

	public static void main(String[] args) {
		// car target price
		
		System.out.println(calculateHrs(100,50,4,20,10,75000));

	}
	
	static public List<Integer> calculateHrs(int peakHrsRate,int offHrsRate, int peakhrs,int Offhrs, int noOfCars,int targetPrice){
		List<Integer> totalNoHrs = new ArrayList<Integer>();
		
		int tmpPrice = 0;
		int totalPeakHrsPrice=0,totalOffHrsPrice=0;
		int totalPrakHrs=0,totalOffHrs=0;
		
		if((peakHrsRate*peakhrs+offHrsRate*Offhrs)<targetPrice) return null;
		
		for(int i=1;i<=peakhrs;i++) {
			tmpPrice += noOfCars*peakHrsRate;
			if(tmpPrice<=targetPrice) {
				totalPeakHrsPrice=tmpPrice;
				++totalPrakHrs;
			}
			
		}
		tmpPrice = 0;
		int remainingPrice = targetPrice-totalPeakHrsPrice;
		for(int k=1;k<=Offhrs;k++) {
			tmpPrice += noOfCars*offHrsRate;
			if(tmpPrice<=remainingPrice) {
				totalOffHrsPrice=tmpPrice;
				++totalOffHrs;
			}
			
		}
		
		totalNoHrs.add(totalPrakHrs);
		totalNoHrs.add(totalOffHrs);
		
		
		
		return totalNoHrs;
	}

}
