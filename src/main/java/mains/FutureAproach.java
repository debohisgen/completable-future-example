package mains;

import java.time.Duration;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.thepracticaldeveloper.comparison.FutureOpenSafeLock;
import com.thepracticaldeveloper.objects.Loot;
import com.thepracticaldeveloper.objects.Thief;

/**
 * Main application: runs both approaches in sequence
 */
public class FutureAproach {

  private static final Logger log = LoggerFactory.getLogger(FutureAproach.class);

  public static void main(String[] args) throws Exception {
    Instant start = Instant.now();

    log.info("\n\n PLAIN FUTURES ====");
    final Loot plainFutureLoot = new FutureOpenSafeLock().openSafeLock(Thief.WILL, "Ms. Greedy");
    log.info("App got the loot {}", plainFutureLoot);

    Instant end = Instant.now();
    Duration timeElapsed = Duration.between(start, end);
    System.out.println("Elapsed Time: "+ timeElapsed.getSeconds());
  }

}
