import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws IOException {
        LocalDate date = LocalDate.now(ZoneId.of("Asia/Seoul"));
        System.out.println(date);
    }
}

