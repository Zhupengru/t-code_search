package codevalueclass;

//import java.util.ArrayList;
import java.util.List;

public class DoWhatYouWant {
	public static void main(String args[]) {
		List<TCodeClass> TCodeList = AddTCode.addTCode();
		//search whatever you want
		String content = "gr";
		SearchAnything.SearchPartialTCode(content, TCodeList);
		SearchAnything.SearchPartialSystemName(content, TCodeList);
		SearchAnything.SearchPartialDescription(content, TCodeList);
	}
	
}
