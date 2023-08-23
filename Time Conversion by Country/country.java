 import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    public class country
    {
        public static void main(String[] args)
        {
            // Current date and time using now()
            ZonedDateTime currentDateTime = ZonedDateTime.now();

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the country name : ");
            String countryName = sc.nextLine();

            // Create a timezone zoneid object using ZoneId.of() method
            ZoneId timeZone = ZoneId.of(getZoneIdFromCountryName(countryName));

            // Converting current timezone time to the specified time zone
            ZonedDateTime zonedDateTime = currentDateTime.withZoneSameInstant(timeZone);

            // Datetime formatting
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a");

            // Print the current time in the specified time zone
            System.out.println(countryName + " time now : " + formatter.format(zonedDateTime));

        }

        // This method returns the corresponding timezone id for a given country name
        private static String getZoneIdFromCountryName(String countryName)
        {
            switch(countryName)
            {
                case "India":
                    return "Asia/Kolkata";
                case "Germany":
                    return "Europe/Berlin";
                case "United States":
                    return "America/New_York";
                case "China":
                    return "Asia/Shanghai";
                case "Japan":
                    return "Asia/Tokyo";
                case "Russia":
                    return "Europe/Moscow";
                case "Australia":
                    return "Australia/Sydney";
                case "Canada":
                    return "America/Toronto";
                case "Brazil":
                    return "America/Sao_Paulo";
                case "Mexico":
                    return "America/Mexico_City";
                case "South Africa":
                    return "Africa/Johannesburg";
                case "Argentina":
                    return "America/Argentina/Buenos_Aires";
                case "France":
                    return "Europe/Paris";
                case "Italy":
                    return "Europe/Rome";
                case "Spain":
                    return "Europe/Madrid";
                case "United Kingdom":
                    return "Europe/London";
                case "Nigeria":
                    return "Africa/Lagos";
                case "Egypt":
                    return "Africa/Cairo";
                case "Saudi Arabia":
                    return "Asia/Riyadh";
                case "United Arab Emirates":
                    return "Asia/Dubai";

                default:
                    return "Country name not listed";
            }
        }


    }
