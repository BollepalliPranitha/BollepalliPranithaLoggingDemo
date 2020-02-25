package com.epam.LoggingDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Constructioncost {
	 private static final Logger LOGGER=LogManager.getLogger(Constructioncost.class);
	 Constructioncost(){
	  LOGGER.debug("DEBUG calculating the construction cost required to build the house");
   	  LOGGER.info("INFO calculating the construction cost required to build the house");
   	  LOGGER.warn("WARN calculating the construction cost required to build the house");
   	  LOGGER.error("ERROR calculating the construction cost required to build the house");
   	  LOGGER.fatal("FATAL calculating the construction cost required to build the house");
	 }
        double Cost(String Material_Standard ,double Total_area_of_house ,boolean Fully_automated_home ){
        	
       	 //Total area in square feet
       	 if(Material_Standard=="Standard" && !Fully_automated_home)
       		 return 1200*Total_area_of_house;
       	 if(Material_Standard=="above Standard" && !Fully_automated_home)
       	     return 1500*Total_area_of_house;
       	 if(Material_Standard=="high Standard"){
       		 if(Fully_automated_home){
       			 return 2500*Total_area_of_house;
       		 }
       		 else
       		 return 1800*Total_area_of_house;}
       	 
       	 return 0;
        }
}
