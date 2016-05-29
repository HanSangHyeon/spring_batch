package batch.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyJobSchedule {

	private static final Logger logger = LoggerFactory.getLogger(MyJobSchedule.class);

//	@Autowired
//	private SimpleJobLauncher jobLauncher;
//	
//	@Autowired
//	private Job job;
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void helloWorldTask() {
		logger.info("Fxied rate every 5 second " + dateFormat.format(new Date()));
	}

}
