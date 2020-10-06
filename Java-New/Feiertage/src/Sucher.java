import java.time.LocalDate;
import java.util.List;
public class Sucher{
    public int montag;
    public int dienstag;
    public int mittwoch;
    public int donerstag;
    public int freitag;

    public String sucher(List<LocalDate> list)
    {
        for (int i = 0; i < list.size(); i++) 
        {
            LocalDate tag = list.get(i);
            switch (tag.getDayOfWeek()) {
                case MONDAY: montag++; break;
                case TUESDAY: dienstag++; break;
                case WEDNESDAY: mittwoch++; break;
                case THURSDAY:donerstag++; break;
                case FRIDAY: freitag++; break;
                case SATURDAY: break;
                case SUNDAY: break;
            }
        }
        System.out.println("Montag: "+montag);
        System.out.println("Dienstag: "+dienstag);
        System.out.println("Mittwoch: "+mittwoch);
        System.out.println("Donnerstag: "+donerstag);
        System.out.println("Freitag: "+freitag);
        return "";
    }


}