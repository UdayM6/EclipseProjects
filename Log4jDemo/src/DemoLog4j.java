import org.apache.logging.log4j.*;

public class DemoLog4j {

	private static Logger log = LogManager.getLogger(DemoLog4j.class.getName());
	//DemoLog4j.class.getName() gets the path of the class which will be passed in logger
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am debugging");
		if(5>4) {
			log.info("test ok");
		}
			log.error("error log");
			log.fatal("fatal error log");
	}

}
