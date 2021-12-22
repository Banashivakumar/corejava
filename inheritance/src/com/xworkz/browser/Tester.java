package com.xworkz.browser;

import com.xworkz.browser.dto.Browser;
import com.xworkz.browser.dto.Chrome;

public class Tester {
	
	public static void main(String[] args) {
		Browser browser=new Browser();
	
		browser.search("7zip");
		browser.download("7zip");
		
		Chrome chrome=new Chrome();
		 chrome.search("os");
		
	}

}
