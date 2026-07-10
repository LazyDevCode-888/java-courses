import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataAndTime {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        // กำหนดรูปแบบวันที่และเวลา
        String pattern = "dd/MM/yyyy HH:mm:ss";

        // กำหนด object เพื่อเอารูปแยยไปใช้
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        // นำรูปแบบไปใช้และเก็บลงตัวแปรไปใช้ formattedDateTime
        String formattedDateTime = dateTime.format(formatter);

        // เอาตัวแปร formatedDateTime ไปแสดงผลหน้าจอ console
        System.out.println(formattedDateTime);
    }
}