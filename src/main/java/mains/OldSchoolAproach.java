package mains;

import java.time.Duration;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.thepracticaldeveloper.comparison.SingleThreadOpenSafeLock;
import com.thepracticaldeveloper.objects.Loot;
import com.thepracticaldeveloper.objects.Thief;

/**
 * Main application: runs both approaches in sequence
 */
public class OldSchoolAproach {

  private static final Logger log = LoggerFactory.getLogger(OldSchoolAproach.class);

  public static void main(String[] args) throws Exception {
    Instant start = Instant.now();
    log.info("\n\n SINGLE THREAD ====");
    final Loot singleThreadLoot = new SingleThreadOpenSafeLock().openSafeLock(Thief.LORA, "Mr. Toomuchmoney");
    log.info("App got the loot {}", singleThreadLoot);
    Instant end = Instant.now();
    Duration timeElapsed = Duration.between(start, end);
    System.out.println("Elapsed Time: "+ timeElapsed.getSeconds());

  }

}
