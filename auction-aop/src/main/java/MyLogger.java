/**
 * Created by swanta on 21.09.16.
 */

@Aspect
public class MyLogger {
    private Logger log = Logger.getLogger(getClass());

    @Pointcut("execution(* com.example.web.HomeController.*(..))")
    public void log (JoinPoint point) {
        log.info(point.getSignature().getName() + " called...");
    }
}
