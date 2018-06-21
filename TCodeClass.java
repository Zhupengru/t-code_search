package codevalueclass;

public class TCodeClass {
	int TCodeNumber;
	String TCodeString;
	String SystemName;
	String FunctionDescription;
	
	//default constructor
	TCodeClass() {}
	
	//constructor
	TCodeClass(int Number, String TCode, String InputSystemName, String Description) {
		TCodeNumber = Number;
		TCodeString = TCode;
		SystemName = InputSystemName;
		FunctionDescription = Description;
	}
}
