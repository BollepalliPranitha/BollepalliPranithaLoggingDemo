package com.epam.LoggingDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interest {
	 private static final Logger LOGGER=LogManager.getLogger(Constructioncost.class);
	 Interest(){
	  LOGGER.debug("DEBUG calculating the simple and coumpound ineterest");
   	  LOGGER.info("INFO calculating the simple and coumpound ineterest");
   	  LOGGER.warn("WARN calculating the simple and coumpound ineterest");
   	  LOGGER.error("ERROR calculating the simple and coumpound ineterest");
   	  LOGGER.fatal("FATAL calculating the simple and coumpound ineterest");
	 }
	double SimpleInterest(double Principle,double No_of_Years,double Rate)
    {
  	   return Principle*No_of_Years*Rate/100; 
    }
	double CompoundInterest(double Principle,double No_of_Years,double Rate,double No_of_times_Interest_applied){
 	   return Principle*Math.pow(1+Rate/(100*No_of_times_Interest_applied), No_of_times_Interest_applied*No_of_Years)-Principle;
 	  }
}
