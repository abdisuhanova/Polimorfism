public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Anna Pavlova", 23);
        TiktonikDancer tdancer = new TiktonikDancer("Ranz Kule", 25);
        BreakDancer bdancer1 = new BreakDancer("Tyrone Smith", 30);
        BreakDancer bdancer2 = new BreakDancer("Douglas Colon", 29);
        Dancer[] dancers = {dancer, (Dancer) tdancer, (Dancer) bdancer1, (Dancer) bdancer2};
        for (Dancer d: dancers){d.dance();}
    }
}