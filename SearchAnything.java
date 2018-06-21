package codevalueclass;

import java.util.List;

public class SearchAnything {
	public static void SearchPartialTCode(String partialTCode, List<TCodeClass> TCodeList) {
		System.out.println("Search " + "\"" + partialTCode + "\" " + "in TCode\n");
		for (TCodeClass i : TCodeList) {
			if (i.TCodeString.toLowerCase().matches(".*" + partialTCode.toLowerCase() + ".*")) {
				DisplayInfo(i);
			}
		}
		
	}
	
	public static void SearchPartialSystemName(String partialSystemName, List<TCodeClass> TCodeList) {
		System.out.println("Search " + "\"" + partialSystemName + "\" " + "in System Name\n");
		for (TCodeClass i : TCodeList) {
			if (i.SystemName.toLowerCase().matches(".*" + partialSystemName.toLowerCase() + ".*") || i.SystemName.equals("Any")) {
				DisplayInfo(i);
			}
		}
		
	}
	
	public static void SearchPartialDescription(String partialDescription, List<TCodeClass> TCodeList) {
		System.out.println("Search " + "\"" + partialDescription + "\" " + "in Description\n");
		for (TCodeClass i : TCodeList) {
			if (i.FunctionDescription.toLowerCase().matches(".*" + partialDescription.toLowerCase() + ".*")) {
				DisplayInfo(i);
			}
		}
		
	}
	
	public static void DisplayInfo(TCodeClass i) {
		//format output
		System.out.print("#: " + i.TCodeNumber);
		for(int j = 0; j < 5 - String.valueOf(i.TCodeNumber).length(); j++)
			System.out.print(" ");
		
		System.out.print("TCode: " + i.TCodeString);
		for (int j = 0; j < 15 - i.TCodeString.length(); j++)
			System.out.print(" ");
		
		System.out.print("  System: " + i.SystemName);
		for (int j = 0; j < 8 - i.SystemName.length(); j++)
			System.out.print(" ");
		
		System.out.println("  Description: " + i.FunctionDescription + "\n");
	} 
}
