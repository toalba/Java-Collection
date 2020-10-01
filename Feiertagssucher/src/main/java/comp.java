public class comp{

    public static void main(String[] args) {
        Menu menu = new Menu();
        Feiertagssucher feiertagssucher = new Feiertagssucher();
        Sucher sucher = new Sucher();

        try
        {
            sucher.sucher(feiertagssucher.getfeiertage(menu.maxdate(), menu.Landoptions()));
        } catch (Exception e) {
            //TODO: handle exception
        }
        




    }
}