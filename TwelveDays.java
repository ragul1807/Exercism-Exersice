import java.util.Arrays;
class TwelveDays {
    public static final String[] day={
            "first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    public static final String[] verse={
            "a Partridge in a Pear Tree","two Turtle Doves","three French Hens","four Calling Birds","five Gold Rings","six Geese-a-Laying","seven Swans-a-Swimming","eight Maids-a-Milking",
            "nine Ladies Dancing","ten Lords-a-Leaping","eleven Pipers Piping","twelve Drummers Drumming"
    };
 String verse(int verseNumber)
    {
        if(verseNumber==1)
            return "On the "+day[verseNumber-1]+" day of Christmas my true love gave to me: "+verse[0]+".\n";
        else{
        StringBuilder verseBuilder=new StringBuilder();
        for(int i=0;i<verseNumber-1;i++)
        {
            verseBuilder.append(verse[verseNumber-i-1]+", ");
        }
        verseBuilder.append("and "+verse[0]);
        return "On the "+day[verseNumber-1]+" day of Christmas my true love gave to me: "+verseBuilder+".\n";
    }}
    String verses(int startVerse, int endVerse) {
   
        StringBuilder verseBuilder=new StringBuilder();
        for(int i=startVerse;i<endVerse;i++)
        {
            verseBuilder.append(verse(i)+"\n");
        }
        verseBuilder.append(verse(endVerse));
        return String.valueOf(verseBuilder);
    
        }
    
    String sing(){
        StringBuilder verseBuilder=new StringBuilder();
        for(int i=1;i<12;i++)
        {
            verseBuilder.append(verse(i)+"\n");
        }
        verseBuilder.append(verse(12));
        return String.valueOf(verseBuilder);
    }
}
