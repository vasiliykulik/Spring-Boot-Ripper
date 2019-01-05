package lviv.lvivboot;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Vasiliy Kylik (Lightning) on 05.01.2019.
 */
@Service
@Profile("DEV")
public class DeveloperService {
    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork() {
        System.out.println("Developers.......");
    }

}
