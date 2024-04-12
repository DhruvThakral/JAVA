import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.ZoneId;


class LPU{
    public static void main(String args[]){

        // LOCAL DATE

        // LocalDate ld = LocalDate.now();
        //LocalDate newDate = ld.plusDays(0);
        // LocalDate newDate = ld.minusDats();
        
        // System.out.println(newDate);

        // System.out.println(LocalDate.of(2011,04,02));
    
        // LocalDate ld = LocalDate.of(2012,04,02);
        // System.out.println(ld.isLeapYear());
    
        // LOCAL TIME
        // System.out.println(LocalTime.now());

        // DATE TIME
        // System.out.println(LocalDateTime.now());
    
        // FORMATTING
        // LocalDateTime defaultDateTime = LocalDateTime.now();

        // System.out.println("Before Formatting : " + defaultDateTime);
        // DateTimeFormatter customFormatDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // String formattedDate = defaultDateTime.format(customFormatDateTime);
        // System.out.println("After Formatting : " + formattedDate);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("First time");
        // String st1 = scanner.nextLine();

        // System.out.println("Second Time");
        // String st2 = scanner.nextLine();

        // LocalTime lt1 = LocalTime.parse(st1);
        // LocalTime lt2 = LocalTime.parse(st2);

        // QUESTION: 
        // Print the current time of New York
        

        // Set the time zone to New York
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        
        // Get the current time in New York
        LocalDateTime currentTime = LocalDateTime.now(newYorkZone);
        
        // Format the time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        
        // Print the current time in New York
        System.out.println("Current time in New York: " + formattedTime);
    }
}
