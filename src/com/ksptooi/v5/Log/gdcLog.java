package com.ksptooi.v5.Log;

import uk.iksp.v7.main.DataCore;

public class gdcLog extends LogManager{

	
	//����
	public gdcLog(){
		
		this.setPrefix("[GeneralDataCore"+DataCore.version+"]");
		
	}
	
	
	
	@Override
	public void logInfo(String Message) {	
		System.out.println(this.getPrefix()+Message);
	}

	
	@Override
	public void logWarning(String Message) {	
		System.out.println(this.getPrefix()+Message);
	}
	

	@Override
	public void logError(String Message) {	
		System.out.println(this.getPrefix()+Message);
	}

	
	
	
	
}
