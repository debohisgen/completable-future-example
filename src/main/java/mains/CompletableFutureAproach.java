package mains;

import java.time.Duration;
import java.time.Instant;

import org.apache.log4j.net.SyslogAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.thepracticaldeveloper.comparison.CompletableFutureOpenSafeLock;
import com.thepracticaldeveloper.comparison.FutureOpenSafeLock;
import com.thepracticaldeveloper.comparison.SingleThreadOpenSafeLock;
import com.thepracticaldeveloper.objects.Loot;
import com.thepracticaldeveloper.objects.Thief;

/**
 * Main application: runs both approaches in sequence
 */
public class CompletableFutureAproach {

  private static final Logger log = LoggerFactory.getLogger(CompletableFutureAproach.class);

  public static void main(String[] args) throws Exception {

    Instant start = Instant.now();

    log.info("\n\n COMPLETABLE FUTURE ====");
    final Loot completableFutureLoot = new CompletableFutureOpenSafeLock().openSafeLock(Thief.PETE, "Sr. Carapapas");
    log.info("App got the loot {}", completableFutureLoot);

    Instant end = Instant.now();
    Duration timeElapsed = Duration.between(start, end);
    System.out.println("Elapsed Time: "+ timeElapsed.getSeconds());

  }

}
